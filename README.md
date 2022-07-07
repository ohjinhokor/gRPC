# grpc

- ### 인턴십에서 진행했던 '고객사에게 제공될 라이브러리(grpc 이용)를 만드는 과정'을 소규모 프로젝트로 재현했습니다.

- ###  기존에 rest로 제공되던 API를 grpc를 이용하여 제공합니다.

- ###  jar파일을 다운로드 후 의존성을 추가하면 ip주소나 port를 몰라도 메서드를 호출하여 rest로 받던 데이터와 같은 데이터를 얻도록 하였습니다.


#### - 기존에 제공되던 Public API 예시 (Http 헤더에 고객사 별로 제공된 key 값을 넣으면 각 고객사의 정보를 반환해주는 API)
<img src="https://user-images.githubusercontent.com/71378447/174058894-995c8b76-b283-4108-9bbe-6dd665f01ec7.png" width = "400" height = "400" />
<img src="https://user-images.githubusercontent.com/71378447/174061362-c0c2c7e6-d231-4998-b229-5cff7264ce6d.png" width = "400" height = "400" />

----------------------------------------------------
### jar 파일을 다운 받은 후 메서드를 호출하는 과정

- **고객사에서는 요청을 보낼 ip와 port번호를 알 필요가 없습니다.**

&nbsp;

**순서**

1) 고객사에서 jar파일 의존성 추가

![스크린샷 2022-06-16 오후 8 22 20](https://user-images.githubusercontent.com/71378447/174062185-83fd3564-b97d-424d-9dd3-286ef4293996.png)


2) 라이브러리 안에 있는 메서드 호출
 
![스크린샷 2022-06-16 오후 8 37 00](https://user-images.githubusercontent.com/71378447/174062745-ffdc511d-7b92-477b-83c6-9aa5a1c9bbf7.png)


GrpcClientService는 jar파일 안의 클래스입니다.

<img src="https://user-images.githubusercontent.com/71378447/174062841-df22cf26-a1c9-434c-a7d2-596cba468e27.png" width = "600" height = "400" />


3) postman으로 테스트

<img width="473" alt="image" src="https://user-images.githubusercontent.com/71378447/174060423-43664aad-b941-4d67-90a0-770aff7ceb93.png">

4) 성공!

<img src="https://user-images.githubusercontent.com/71378447/174063495-ee9d8a2b-d8b2-4964-b220-f5f7aa0fc136.png" width = "400" height = "400" />

