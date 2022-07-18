# grpc

- ### 인턴십에서 진행했던 '고객사에게 제공될 라이브러리(프로토타입)를 만드는 과정'을 소규모 프로젝트로 재현했습니다.

- ### 기존에 rest로 제공되던 API를 grpc를 이용하여 제공합니다.

- ### ip주소나 port를 몰라도 rest로 받던 데이터와 같은 데이터를 얻도록 하였습니다.

&nbsp;
&nbsp;


# 라이브러리 목적

- ### 속도
- ### 고객사의 편의
- ### 함수 호출의 제어권을 얻기 위함
  - ex) 제공하는 jar 파일에 캐시를 적용. 고객사에서 짧은 시간내에 동일한 요청을 여러 번 하는 경우 캐싱된 데이터를 반환하도록 하여 서버에 들어오는 Request를 줄임

&nbsp;
&nbsp;


## 기존에 제공되던 Public API

- ### 클라우드 서비스를 이용하여 서버를 배포한 상태입니다.
- ### Http 헤더에 고객사 별로 제공된 key 값을 넣으면 각 고객사의 정보를 반환해주는 API입니다.

![스크린샷 2022-07-15 오전 12 17 07](https://user-images.githubusercontent.com/71378447/179021173-573fe8b5-eadb-4f86-8f41-193d363ef825.png)

![스크린샷 2022-07-15 오전 12 30 00](https://user-images.githubusercontent.com/71378447/179021762-a4ac39c1-37d0-4d82-9406-dfc83c048634.png)


&nbsp;
&nbsp;


## 라이브러리 코드

- ### 스프링에 의존적이지 않은 라이브러리를 만들기 위해 @GrpcService 어노테이션을 사용하는 대신, ip주소와 port를 하드코딩 하였습니다.  ~~그럼에도 불구하고 사실 스프링 의존적...~~
- ### Channel을 직접 생성한 후 stub을 연결합니다. stub을 통해 메서드를 호출한 후 결과를 반환합니다.
- ### gRPC 포트는 9090으로 했습니다.

<img width="982" alt="스크린샷 2022-07-18 오후 6 14 52" src="https://user-images.githubusercontent.com/71378447/179481279-a2629b24-3a2c-491c-b82d-bdbcf5070a4f.png">


&nbsp;
&nbsp;


## 의존성 추가 후 메서드를 호출하는 과정
- ### 순서

#### 1) 고객사에서 라이브러리 추가

<img width="289" alt="스크린샷 2022-07-17 오후 8 38 46" src="https://user-images.githubusercontent.com/71378447/179396370-48304f7f-85b0-43ac-b080-f6c7a5b8d4a6.png">



#### 2) 라이브러리 안에 있는 메서드 호출
 
<img width="426" alt="스크린샷 2022-07-18 오후 6 21 54" src="https://user-images.githubusercontent.com/71378447/179482136-6e72decf-d139-4eaf-b9d1-9b6e0c385696.png">


#### 3) postman으로 테스트

<img width="473" alt="image" src="https://user-images.githubusercontent.com/71378447/174060423-43664aad-b941-4d67-90a0-770aff7ceb93.png">

#### 4) 성공!

<img width="320" alt="스크린샷 2022-07-17 오후 8 42 26" src="https://user-images.githubusercontent.com/71378447/179396561-e1e5d21f-2e8c-46a3-88b6-1e56c1347981.png">

&nbsp;
&nbsp;


## 서버 API 호출 횟수 제어(cache 이용)

### <캐시 적용 전>

- #### 고객사의 코드 변경(한 번에 10번의 호출)

![스크린샷 2022-07-17 오후 10 06 15](https://user-images.githubusercontent.com/71378447/179399789-02a8dacf-bb9e-42c9-b10b-6fee7c72649c.png)

- #### API 호출 횟수를 체크하기 위해 서버 코드 변경

![스크린샷 2022-07-17 오후 10 15 04](https://user-images.githubusercontent.com/71378447/179400169-4b7c7135-fbb5-40ae-97ea-6bcd4976b9b5.png)

- #### 서버 재배포 후 Test 결과 로그 확인

<img width="503" alt="스크린샷 2022-07-17 오후 10 18 30" src="https://user-images.githubusercontent.com/71378447/179400284-409ce4b7-9f44-43bc-9c1d-7ce6666cdeb0.png">

- #### 수행 시간

![스크린샷 2022-07-17 오후 10 08 19](https://user-images.githubusercontent.com/71378447/179400755-6b3e9a91-649a-41a9-9857-4142703776db.png)


### <캐시 적용>

- #### 라이브러리에 캐시 적용
  - 다른 라이브러리 사용을 줄이기 위해 캐시를 직접 구현했습니다

- #### 코드 설명
  - 캐싱이 되어있다면 캐싱된 데이터 반환
  - 캐싱이 되어있지 않다면 캐싱 후 데이터 반환
  
<img width="838" alt="스크린샷 2022-07-18 오후 6 55 43" src="https://user-images.githubusercontent.com/71378447/179488426-e9d54475-e5ff-4185-b5d0-9987c2de166e.png">

- #### setCache 메서드
  - 자바가 제공하는 Timer Util클래스를 이용해서 캐시 구현
  - 캐시 유효 시간 10초.
  
<img width="442" alt="스크린샷 2022-07-18 오후 7 00 36" src="https://user-images.githubusercontent.com/71378447/179488862-3065a594-2747-4558-97da-272a4a164ad5.png">

&nbsp;
&nbsp;

### <캐시 적용 후 테스트>

- #### 고객사 코드 실행

<img width="423" alt="스크린샷 2022-07-18 오후 7 16 16" src="https://user-images.githubusercontent.com/71378447/179491308-c85535f3-4705-416a-af7e-b3f2ccbf664a.png">


- #### 서버 재배포 후 Test 결과 로그 확인
  - 10번의 요청 중 1번의 request만 서버로 들어온 것을 알 수 있음
  
![스크린샷 2022-07-18 오후 7 07 15](https://user-images.githubusercontent.com/71378447/179489897-c06dd5b8-6745-44a8-8dc7-01b26656534a.png)

- #### 수행 시간
  - 캐시 적용 후 수행 시간 단축 확인

<img width="462" alt="스크린샷 2022-07-18 오후 7 11 36" src="https://user-images.githubusercontent.com/71378447/179490576-d4a5fcec-7d8f-4c73-80fe-d189c14c9ebb.png">


