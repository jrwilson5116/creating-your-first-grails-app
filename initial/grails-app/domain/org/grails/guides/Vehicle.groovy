package org.grails.guides



@SuppressWarnings('GrailsDomainReservedSqlKeywordName')
class Vehicle {
    String name
    Integer year
    Make make
    Model model


    static constraints = {
        name maxSize: 255
        year min: 1900
    }
}
