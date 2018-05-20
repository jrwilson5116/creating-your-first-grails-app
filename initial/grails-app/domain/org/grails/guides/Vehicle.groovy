package org.grails.guides

//import javax.management.modelmbean.ModelMBean


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
