package com.jglover

class Doctor {
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

    static constraints = {
	fullName nullable: false, blank: false
	qualification nullable: false, blank: false
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false, email:true
	password nullable: false, blank: false, password: true
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false
	bio nullable: false, blank: false, maxLength:5000, widget:'textarea'
    }
}
