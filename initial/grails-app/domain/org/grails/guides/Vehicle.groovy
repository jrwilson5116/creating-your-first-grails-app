package org.grails.guides

import javax.management.modelmbean.ModelMBean

class Vehicle {
    String name
    Integer year
    Model make
    Model model


    static constraints = {
        name maxSize: 255
        year min: 1900
    }
}
