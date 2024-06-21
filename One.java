package Project1;

	interface Nose{ //인터페이스 추상 매서드 보유
		public int iMethod(); //추상 매서드?? 생긴건 인스턴스 변수 int x; 와 같은;;
	}

	abstract class Picasso implements Nose{ // 임플리먼트 해서 추상 클래스 피카소는 노즈 자식 클래스
		public int iMethod(){// 매서드를 받아서 피카소도 사용가능
			return 7;//7값이 나옴
		}
	}

	class Clowns extends Picasso{}//클라운은 피카소 자식클래스

	class Acts extends Picasso{//엑트로 피카소 자식클래스
		public int iMethod(){//Acts<Picasso<Nose 이기 때문에 액트로 노즈 매서드 사용가능
			return 5;//5값 반환 // 리턴값이 다른걸로 봐서 오버라이드 함. 그냥 물려받는것이 아닌 기존 매서드에 변화를 줘서 바꾸는것
		}//오버라이드 시 !메서드 시그니처(이름, 매개변수, 반환 타입)는 동일해야 하며, 재정의된 메서드는 상위 클래스나 인터페이스의 메서드를 대체합니다.
	}

	public class of76 extends Clowns{ //of76은 클라운 자식클래스 당연히 nose 매서드 사용가능
		public static void main(String[] args){//이거 실행문
		Nose[] i = new Nose[3];//노즈 배열 생성 3개
		i[0] = new Acts();//0은 액트
		i[1] = new Clowns();// 1은 클라운
		i[2] = new of76();// 2는 of76
			for(int x= 0; x<3; x++){//for 배열 반복문 정수값 x =0 3보다 작고 1씩 상승
			System.out.println(i[x].iMethod()+" "+i[x].getClass());// 추출 값 i배열에 nose 매서드 불러옴 0이면 ACt인데 매서드 실행 5, 클라운은 7, of76은 클라운의 자식클래스라 오버라이드 7임.
			}
		}
	}
//	interface Nose: 인터페이스는 추상 메서드만을 선언할 수 있으며, 이를 구현하는 클래스들은 이 메서드를 반드시 구현해야 합니다.
//	abstract class Picasso implements Nose: 추상 클래스는 일부 메서드를 구현할 수 있으며, 나머지는 이를 상속하는 구체 클래스에서 구현합니다.
//	class Clowns extends Picasso: Clowns는 Picasso의 iMethod 구현을 그대로 사용합니다.
//	class Acts extends Picasso: Acts는 iMethod를 오버라이드하여 다른 값을 반환합니다.
//	public class of76 extends Clowns: of76는 Clowns를 상속하므로 Picasso의 iMethod 구현을 사용합니다.
//	main 메서드: 프로그램 실행 시 Nose 타입의 배열을 생성하고, 다양한 Nose 구현 객체들을 할당하여 다형성을 보여줍니다. 각 객체의 iMethod 결과와 클래스 타입을 출력합니다.
//중요한건 왜 이 코드가 실행이 되지 않는지 ..
