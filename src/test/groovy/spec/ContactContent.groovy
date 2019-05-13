package spec

import pages.AccesysMainPage

class ContactContent extends Base {

    def "Search on Google"(){

        when: "Access Accesys main page"
        to AccesysMainPage

        then: true

    }

}