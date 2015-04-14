package org.decaf.specs2
import org.specs2.mutable.Specification

object NestedExamplesBugSpec extends Specification {

  "A" >> {
    "B" >> {
      "C" >> {
        1 must be_==(2)
      }
      1 must be_==(3)
    }
    1 must be_==(1)
  }

  "AA" >> {
    "BB" >> {
      "CC" >> {
        1 must be_==(2)
      }
      1 must be_==(3)
    }
    1 must be_==(4)
  }

  "AAA" >> {
    "BBB" >> {
      "CCC" >> {
        1 must be_==(2)
      }
      1 must be_==(3)
    }
  }

  "AAAA" >> {
    "BBBB" >> {
      "CCCC" >> {
        1 must be_==(2)
      }
    }
  }

}
