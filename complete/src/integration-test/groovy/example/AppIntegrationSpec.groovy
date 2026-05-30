package example

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification

@Integration
@Rollback
class AppIntegrationSpec extends Specification {

    def grailsApplication

    void 'application context loads in integration test'() {
        expect:
        grailsApplication != null
        grailsApplication.config != null
    }

    void 'tailwind stylesheet is present in assets'() {
        expect:
        getClass().getResource('/assets/stylesheets/app.css') != null ||
                new File('grails-app/assets/stylesheets/app.css').exists()
    }
}
