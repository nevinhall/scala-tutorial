import logic.logic
import org.scalatest.wordspec.AnyWordSpec

class logicTest extends AnyWordSpec {
  "A Boolean" when{
    "receiving two of the same boolean types" should{
      "return true" in {
        assertResult(true)(logic.and(true,true))
      }
    }
    "receiving two of different boolean types" should{
      "return false" in {
        assertResult(false)(logic.and(false,true))
      }
    }
  }

}
