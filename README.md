
#  Hospital Management System (Database Project)

A comprehensive **Hospital Management System Database Project** designed to efficiently manage hospital operations including employees, patients, doctors, receptionists, staff, rooms, medical records, and billing systems.

This system models real-world hospital workflows and relationships between different entities to ensure smooth healthcare management.

---

#  Project Overview

The system manages a hospital with **four types of employees**:

* CEO (Chief Executive Officer)
* Doctors
* Receptionists
* Staff

It also handles patient registration, treatment, room allocation, billing, and medical record management.

The database is designed to support **multiple relationships between entities**, ensuring scalability and real-world applicability.

---

#  Users & Roles

##  CEO

* Oversees hospital operations
* Enquires about receptionists and staff performance
* Attributes:

  * CEO ID
  * Name
  * Email Address
  * Phone Number

---

##  Doctors

Doctors provide medical consultation to patients.

* Types of Doctors:

  * General Surgeon
  * Pediatrician

## Attributes:

* Doctor ID
* Name
* Phone Number
* Email Address
* License Number
* Address

## Relationships:

* Many doctors can treat many patients (Many-to-Many)

---

##  Receptionists

Receptionists manage patient records and administrative tasks.

## Attributes:

* Receptionist ID
* Name
* Phone Number
* Email Address
* Shift Time

## Responsibilities:

* Maintain patient medical records
* Manage multiple patients

---

## Staff

Hospital staff assist in patient care and operations.

## Attributes:

* Staff ID
* Name
* Phone Number
* Department
* Address
* Shift

## Relationships:

* One staff member can serve multiple patients

---

##  Patients

Patients are the central entity of the system.

## Attributes:

* Patient ID
* Name
* Age
* Blood Group
* Gender
* Date (Registration Date)
* Address
* Phone Number
* Email Address

## Relationships:

* Consult doctors
* Assigned rooms
* Receive medical records
* Pay bills

---

#  Room Management

Patients are assigned rooms based on condition:

## Room Types:

* Single Room
* Double Room
* ICU

## Attributes:

* Room No
* Status (Occupied / Available)
* Patient ID
* Floor
* Rate Per Day

---

#  Medical Records

Managed by receptionists after patient consultation.

## Attributes:

* Record No
* Patient ID
* Treatment Details
* Record Date
* Prescription Details

---

#  Billing System

Patients pay for medical services through bills.

## Attributes:

* Bill ID
* Patient ID
* Amount Due
* Due Date
* Payment Status
* Payment Method

## Relationship:

* One patient can have multiple bills

---

#  Database Relationships

* CEO → Manages Staff & Receptionists
* Doctors ↔ Patients → Many-to-Many
* Receptionists → Manage Patients & Records
* Staff → Serve Multiple Patients
* Patients → Assigned Rooms, Bills, and Records
* Patients → Central entity connected to all operations

---

#  Key Features

* Multi-role hospital management system
* Real-world relational database structure
* Patient-centric design
* Support for multiple doctors per patient
* Room allocation system (Single, Double, ICU)
* Medical record tracking system
* Billing and payment tracking
* Staff and receptionist management

---

#  Technology Used

* MySQL  
* ER Modeling
* Relational Schema Design
* Database Normalization

---

#  System Modules

* Employee Management (CEO, Doctors, Staff, Receptionists)
* Patient Management
* Appointment & Consultation System
* Room Allocation System
* Medical Records System
* Billing System

 

 
 

Just tell me 👍
