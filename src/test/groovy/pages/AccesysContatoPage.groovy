package pages

import geb.Page

class AccesysContatoPage extends Page {

    static url = "http://www.google.com.br"

    static at = {
        $("input", name: "q")
    }

    static content = {

    }

}