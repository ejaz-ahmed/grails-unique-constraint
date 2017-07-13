package demo

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class GroupSpec extends Specification implements DomainUnitTest<Group> {

    def setup() {
    }

    def cleanup() {
    }


    void "test constrain"() {
        given:
        User user = new User(username: 'abc').save()
        new Group(name: 'group1', user: user).save()
        Group group2 = new Group(name: 'group1', user: user)

        expect:
        !group2.validate(['name'])
    }
}
