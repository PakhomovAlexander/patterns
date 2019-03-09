import spock.lang.Specification

class SingletonSpec extends Specification {
    def 'one instance created in single thread'() {
        given: 'two pointers to Earth object'
        Earth earth1, earth2

        when: 'invoke #getInstance method twice'
        earth1 = Earth.instance
        earth2 = Earth.instance

        then: 'the same objects returned'
        earth1 == earth2

        and: 'pointers have one instance'
        earth1.is(earth2)
    }
}
