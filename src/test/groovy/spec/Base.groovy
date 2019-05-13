package spec

import geb.spock.GebReportingSpec
import org.openqa.selenium.Dimension


class Base extends GebReportingSpec {


    def setup() {
        cleanReportGroupDir()
    }

    def setupSpec() {
        browser.config.cacheDriver = false
        browser.driver = browser.config.driver
//        browser.driver.manage().window().setSize(new Dimension(1920, 1080))
    }

    def cleanup() {
        clearCookies()
        browser.close()
    }

    def cleanupSpec() {
        print("TESTE####################")
        browser.quit()
    }
}
