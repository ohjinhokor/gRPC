# grpc

- ### 인턴십에서 진행했던 '고객사에게 제공될 라이브러리(프로토타입)를 만드는 과정'을 소규모 프로젝트로 재현했습니다.

- ### 기존에 rest로 제공되던 API를 grpc를 이용하여 제공합니다.

- ### ip주소나 port를 몰라도 rest로 받던 데이터와 같은 데이터를 얻도록 하였습니다.

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

<img width="984" alt="스크린샷 2022-07-17 오후 9 19 35" src="https://user-images.githubusercontent.com/71378447/179398073-a669abd6-9684-42d4-9222-52cfc7fd20f2.png">


&nbsp;
&nbsp;


## 의존성 추가 후 메서드를 호출하는 과정
- ### 순서

#### 1) 고객사에서 라이브러리 추가

<img width="289" alt="스크린샷 2022-07-17 오후 8 38 46" src="https://user-images.githubusercontent.com/71378447/179396370-48304f7f-85b0-43ac-b080-f6c7a5b8d4a6.png">



#### 2) 라이브러리 안에 있는 메서드 호출
 
<img width="389" alt="스크린샷 2022-07-17 오후 9 23 31" src="https://user-images.githubusercontent.com/71378447/179398131-e62b66f6-12d9-4ffd-982a-03b181f168df.png">


#### 3) postman으로 테스트

<img width="473" alt="image" src="https://user-images.githubusercontent.com/71378447/174060423-43664aad-b941-4d67-90a0-770aff7ceb93.png">

#### 4) 성공!

<img width="320" alt="스크린샷 2022-07-17 오후 8 42 26" src="https://user-images.githubusercontent.com/71378447/179396561-e1e5d21f-2e8c-46a3-88b6-1e56c1347981.png">


