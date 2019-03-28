package com.jglover

class BootStrap {

    def init = { servletContext ->
	/* def doctorJones=new Doctor(
	fullName: 'Jonny Jones',
	qualification: 'BTEC',
	position: 'Dr',
	doctorEmail: 'doctorjones@doctor.com',
	password: '69',
	doctorOffice: '505',
	doctorPhone: '07777000000',
	bio: 'Got his BTEC in how to doctor from Ed Bees school of medicine.').save()

	def doctorBee=new Doctor(
	fullName: 'Edward Louis Bee VI',
	qualification: 'Eton',
	position: 'Dr',
	doctorEmail: 'doctorb33@doctor.com',
	password: 'Head Doctor',
	doctorOffice: '506',
	doctorPhone: '07771000000',
	bio: 'Got his degree in how to doctor from his own school of medicine.').save()

	def diazepam=new Prescription(
	pharmacyName: 'Cantor Cafe Pharmacy',
	prescripNumber: 1,
	medicine: 'Diazepam 20mg',
	totalCost: 8.50,
	dateIssued: new Date('15/03/2019'),
	patientPaying: true).save()

	def ibuprofen=new Prescription(
	pharmacyName: 'Sharrow Pharmacy',
	prescripNumber: 2,
	medicine: 'Ibuprofen 200mg',
	totalCost: 1.50,
	dateIssued: new Date('12/03/2019'),
	patientPaying: true).save()

	def joeglover=new Patient(
	patientName: 'Joe Glover',
	patientAddress: '89 South View Road',
	patientResidence: 'Sheffield',
	patientDob: new Date('04/01/1999'),
	patientID: 'JG99',
	dateRegistered: new Date('04/10/2017'),
	patientPhone: '00000000000').save()

	def brynbowler=new Patient(
	patientName: 'Bryn Bowler',
	patientAddress: '31 Fentonville Road',
	patientResidence: 'Sheffield',
	patientDob: new Date('08/01/1999'),
	patientID: 'BB99',
	dateRegistered: new Date('02/10/2017'),
	patientPhone: '00000000001').save()

	def nurseJoy=new Nurse(
	nurseName: 'Lucinda Joy',
	qualification: 'A-Level',
	nurseEmail: 'nursejoyissick@medicine.com',
	nurseOffice: 'everywhere',
	nursePhone: '01010101010').save()

	def nurseDave=new Nurse(
	nurseName: 'Dave White',
	qualification: 'A-Level',
	nurseEmail: 'daveyyissick@medicine.com',
	nurseOffice: 'everywhere also',
	nursePhone: '01010101000').save()

	def cantorSurgery=new Surgery(
	name: 'Cantor Surgery',
	address: 'Cantor Building',
	postcode: 'S2 SUV',
	telephone: '01142250000',
	numberOfPatients: 30,
	description: 'Cantors Finest Gaff of Healing',
	openingTime: 08.00,
	closingTime: 17.30,
	registeringNewPatients: true).save()

	def sharrowSurgery=new Surgery(
	name: 'Sharrow Surgery',
	address: 'Cool Building',
	postcode: 'S7 SUV',
	telephone: '01242250000',
	numberOfPatients: 50,
	description: 'Sharrows Finest Gaff of Healing',
	openingTime: 09.00,
	closingTime: 18.00,
	registeringNewPatients: false).save()

	def mike=new Receptionist(
	recepName: 'Michael Rigby',
	recepEmail: 'coolio@coolio.com',
	recepUsername: 'MikeRig98',
	recepPassword: 'derek',
	recepPhone: '00011100010').save()

	def jennifer=new Receptionist(
	recepName: 'Jennifer Smith',
	recepEmail: 'coolio@notcoolio.com',
	recepUsername: 'JS2000@emailsandtha.com',
	recepPassword: 'gold',
	recepPhone: '00011190010').save()

	def brokenarm=new Appointment(
	appDate: new Date('12/03/2019'),
	appTime: 15.00,
	appDuration: 20,
	roomNumber: 'A21',
	patientName: joeglover).save()

	def brokenleg=new Appointment(
	appDate: new Date('10/03/2019'),
	appTime: 12.00,
	appDuration: 30,
	roomNumber: 'B51',
	patientName: brynbowler).save()

patientName:joeglover
patientName:brynbowler
brokenleg.addToSurgeries(sharrowSurgery)
brokenarm.addToSurgeries(cantorSurgery) */


    }
    def destroy = {
    }
}
