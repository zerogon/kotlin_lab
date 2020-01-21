open class Parent(a: Int) {
	fun funB() {
		println("ParentA funB()")
	}

	open fun funA() {
		println("Parent funA()")
	}
}

interface IParent {
	fun funA() {
		print("IParent funIA()")
	}
}

class Example(age: Int) : Parent(age), IParent {
	constructor(name: String, age: Int) : this(age) {
		println("$name $age")
	}

	override fun funA() {
		println("Child FunA()")
		super<IParent>.funA()
		super<Parent>.funA()

	}


}

