package jbr.vegetables

import org.scalatest.FunSuite

class BroccoliTest extends FunSuite{

	test("broccoli is not a peach") {
	  val broccoli = new Broccoli()
	  assert("peach" != broccoli.vegetableType)
	}
  
	test("create a broccoli") {
	  val broccoli = new Broccoli()
	  assert(false === broccoli.isFruit)
	}
  
}