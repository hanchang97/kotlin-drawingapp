# kotlin-drawingapp
객체지향 프로그래밍 방식으로 사각형 뷰를 표현하는 모델 클래스(class)를 설계한다.
- [x] (자기만의 기준으로) 클래스 이름을 정한다.
- [x] 필수 속성 : 고유아이디(String), 크기(Width, Height), 위치(X, Y), 배경색(R, G, B), 투명도(Alpha)
- [x] 고유아이디는 랜덤값으로 3자리-3자리-3자리 형태
- [x] 크기는 Size를 표현하는 타입을 선언한다
- [x] 위치는 Point를 표현하는 타입을 선언한다
- [x] 배경색도 RGB 각각 0부터 255 사이 값으로 처리하는 타입을 선언한다
- [x] 투명도는 1-10사이값으로 10단계로 표현한다.
- [x] 안드로이드 View를 import하지 않는 독립적인 타입으로 선언한다.
- [x] 모델 클래스 출력을 위해서 toString()을 구현한다.
- [x] 모델 클래스의 생성자에서 랜덤값을 처리하는 게 아니라, 랜덤값을 생성해서 모델 생성하는 초기값을 넘겨주는 팩토리를 구현한다.
<br>

![image](https://user-images.githubusercontent.com/69443895/156002010-f05b48a9-f2a9-4f8f-99d5-68d4accf7c5d.png)


***

## 사각형 랜덤 위치 생성
![image](https://user-images.githubusercontent.com/69443895/156312309-a484c70d-1858-4ad9-b5c0-302bae4c59fc.png)
