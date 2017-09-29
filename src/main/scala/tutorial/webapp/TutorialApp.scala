package tutorial.webapp

import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery

object TutorialApp {
	def main(args: Array[String]): Unit = {
    jQuery(() => setupUI())
	}

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(() => addClickedMessage())
    jQuery("body").append("<p>Hello World</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>has been clicked</p>")
  }
}
