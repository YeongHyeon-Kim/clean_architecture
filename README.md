# clean_architecture
클린 아키텍쳐 공부

***
0608 피드백
***
- DTO 미사용
  - result를 String으로 하드코딩 해서 보내는게 의존성을 제거하는 것이 아니라 DTO를 이용하여 계층간 데이터를 보호하며 옮기자
- @RequiredArgsConstructor
  - Entitiy에 들어갈 Annotation이 아니다. 좀더 생각하고 넣자
- Builder 사용 
  - attribute가 2개 이상이면 builder 사용을 고민해보자
- interface로 의존성 역전
  - 현재 구조를 보면 interface와 구현체가 1대1이기 때문에 필요가 없다.
  - 또한 기능을 세세하게 쪼개서 만들다 보니 더이상 확장할 내용이 없고 결국 interface를 수정하면 구현체를 수정해야하기 때문에 2번 일하는 것.
- password, nickname 체크
  - 현재 하드코딩 되어있는 부분을 인혁이 validation을 보고 공부해서 바꿔보자
  - 또한 domain(service)에서 회원가입을 책임지는 것이지 패스워드 체크, 닉네임 체크 등은 부가적인 것이기 때문에 따로 class를 빼서 저수준으로 만드는게 좋을 것 같다.
- session은 domain인가 web인가
  - 일단 결론은 domain이 맞는 듯 하다. web은 요청을 받아들이고 응답을 보내는 것에 책임이 있기 때문에 seesion을 통한 검증이나 확인은 domain에서 처리하는게 맞는 것으로 결론 내림
# test
