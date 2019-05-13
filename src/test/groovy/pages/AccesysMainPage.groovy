package pages

import geb.Page

class AccesysMainPage extends Page{

    static url = "http://www.accesys.com.br"

    static at = {
        $("header", id: "ABdev_main_header")
    }

    static content = {

    }
}
