package same;
import other.Other;

class SameClassChecker {
	public SameClassChecker(){
		this._public();
		this._protected();
		this._default();
		this._private();
	}
	
	public void _public(){
		System.out.println("public");
	}
	
	public void _protected(){
		System.out.println("protected");
	}
	
	public void _default(){
		System.out.println("default");
	}
	
	public void _private(){
		System.out.println("private");
	}

}

class SamePackageChecker extends Same {
	public SamePackageChecker() {
		Same same = new Same();
		same._public();
		same._protected();
		same._default();
		//same._private();
		
		this._public();
		this._protected();
		this._default();
		//same._private();
	}
}


class OtherPackageChecker extends Other {
	public OtherPackageChecker() {
		Other other = new Other();
		other._public();
		//other._protected();
		//other._default();
		//same._private();
		
		this._public();
		this._protected();		//다른 패키지에서 상속 받은 것은 접근가능
		//this._default();
		//same._private();
		
	}
}


