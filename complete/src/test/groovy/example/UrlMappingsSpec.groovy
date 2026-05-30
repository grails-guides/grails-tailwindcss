package example

import grails.testing.web.UrlMappingsUnitTest
import spock.lang.Specification

class UrlMappingsSpec extends Specification implements UrlMappingsUnitTest<UrlMappings> {

    void 'root forwards to index view'() {
        expect:
        assertForwardUrlMapping('/', view: '/index')
    }
}
