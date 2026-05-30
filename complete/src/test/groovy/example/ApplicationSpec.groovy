package example

import spock.lang.Specification

class ApplicationSpec extends Specification {

    void 'Application class loads without error'() {
        expect:
        Application.class.simpleName == 'Application'
    }
}
