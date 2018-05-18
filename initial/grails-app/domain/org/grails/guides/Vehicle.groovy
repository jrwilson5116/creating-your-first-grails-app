package org.grails.guides

class Vehicle {
    String name

    String make
    String model


    static constraints = {
        name maxSize: 255
        make inList: ['Ford','Chevy','Nissan']
        model nullable: true
    }
}
