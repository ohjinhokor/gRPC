# grpc

### 인턴십에서 진행했던 **grpc를 이용하여 고객사에게 제공될 라이브러리를 만드는 과정**을 소규모 프로젝트로 재현했습니다.

### 기존에 public으로 제공되던 API를 grpc를 이용하여 제공합니다. 이 때 고객사에게 client 부분의 grpc 모듈을 구현하도록 하지 않고, 제공되는 jar파일을 다운로드 후 의존성을 추가하면 ip주소나 port를 몰라도 메서드 호출만으로 기존에 제공되던 것과 같은 API를 사용할 수 있도록 하였습니다.


#### 1. 기존에 제공되던 Public API 예시 (Http 헤더에 고객사 별로 제공된 key 값을 넣으면 각 고객사의 정보를 반환해주는 API)
<img src="https://user-images.githubusercontent.com/71378447/174058894-995c8b76-b283-4108-9bbe-6dd665f01ec7.png" width = "400" height = "400" />
<img src="https://user-images.githubusercontent.com/71378447/174061362-c0c2c7e6-d231-4998-b229-5cff7264ce6d.png" width = "400" height = "400" />


#### 2. Rest로 제공하던 API와 같은 데이터를 제공하는 library를 jar파일로 제공. jar 파일을 다운 받은 후 메서드를 호출하면 grpc stub을 통해 데이터를 주고 받음.

&nbsp
1) 고객사에서 jar파일 의존성 추가
<img src = "https://user-images.githubusercontent.com/71378447/174059609-6e96d780-3aad-4a88-b4c5-a0c7e00ec86d.png" width "200" height = "500" />

2) 라이브러리 안에 있는 메서드 호출
<img src = "https://user-images.githubusercontent.com/71378447/174061737-f8992774-6ebc-421e-aa12-b150a233dd96.png" width "400" height = "400" />


GrpcClientService는 jar파일 안의 클래스입니다.
<img src = "https://user-images.githubusercontent.com/71378447/174060248-41ad73ed-7dfd-41b8-996d-b4df253b50e8.png" width "400" height = "400" />

3) postman으로 테스트

<img width="473" alt="image" src="https://user-images.githubusercontent.com/71378447/174060423-43664aad-b941-4d67-90a0-770aff7ceb93.png">

4) 성공!
<img src="https://user-images.githubusercontent.com/71378447/174061049-1519d33f-a0da-4be2-a21c-5c420b204c65.png"
     width = "400", height = "400">
