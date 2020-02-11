package logic {

  object logic {
    def and(inputBoolean1 : Boolean, inputBoolean2 : Boolean) : Boolean = {
      inputBoolean1.equals(inputBoolean2)
    }

    def or(inputBoolean1 : Boolean, inputBoolean2 : Boolean) : Boolean = inputBoolean1 match {
      case inputBoolean1 if inputBoolean1.isInstanceOf && !inputBoolean2.isInstanceOf => false
      case _ => true
    }

    def add(x: Int)(y: Int): Int = {
      x + y
    }


    val plus5 = add(5)
    plus5(7)

    val fivePlusThree = plus5(3)
    fivePlusThree

    trait M[A] {
      def flatMap[B](f: A => M[B]): M[B]
    }

    def unit[A](x: A): M[A] = ???



  }
}

