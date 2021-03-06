package io.scalechain.blockchain.storage

import org.scalatest._

/**
  * Created by kangmo on 11/2/15.
  */
class StorageSpec extends FlatSpec with BeforeAndAfterEach with Matchers {
  this: Suite =>


  override def beforeEach() {
    super.beforeEach()
  }

  override def afterEach() {
    super.afterEach()

  }

  "initialized" should "return true after initialize is invoked" in {
    Storage.initialize()
    Storage.initialized() shouldBe true
  }
}
