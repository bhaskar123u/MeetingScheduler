## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

Problem Statement :

DESIGN A CONFERENCE ROOM MANAGEMENT SYSTEM

One of the core problems which people face at every company is the unavailability of conference rooms. So we thought of building one conference room management system. The system should have the following features.
Assumptions:
1. Conference rooms are scattered across multiple buildings and multiple floors and each floor can have multiple conference rooms, but each conference room should be uniquely identifiable.
2. Booking will be done for slots in hours. Hours will be taken in 24 hours format eg. Book from 1am to 3am {1:3}, from 12pm to 1pm {12:13}
3. Each conference room can be booked given that no one has already booked for that slot.
4. User id should be mandatory for all operations.
5. Booking can be done for a maximum of 12 hours.


Features:

1. Should be able to register new user.
2. Users should be able to list down all the conference rooms available in any building. Eg:Alpha building has conference rooms with names: a1, a2, a3, a4 etc.
3. Users should be able to find suitable rooms to book for a given slot.
4. Users should be able to cancel existing booking and rooms should be free to be booked again for that slot.
5. List down all the bookings by the given user.
6. Users should be able to list all the rooms or filter down only the available rooms. Also each room has a capacity of persons, so users should be able to filter down based on the capacity. 
7. Users should be able to see the maximum number of people which can be accommodated in a room.


Commands:
 NOTE: User ID is mandatory for the inputs.

ADD BUILDING <building> //Adds building in the system
Eg: ADD BUILDING b1
Output: Added building b1 into the system.

ADD FLOOR <building> <floor>
Eg. ADD FLOOR b1 2

ADD CONFROOM <building> <floor> <conferenceRoomID>
Eg: ADD CONFROOM c1 1 cb1
The above commands adds c1 conference room in firstfloor of building b1
Output: Added conference room c1 on firstfloor in b1

BOOK <USER-ID> <SLOT> <BUILDING> <FLOOR> <ROOM ID>
Books the given Conference room for a given slot, on the given floor of the building.
Eg: BOOK user-id 1:5 b1 7 C1

CANCEL <USER-ID> <SLOT> <BUILDING> <FLOOR> <ROOM ID>
Cancels the slot booked for the floor in a given building.

LIST BOOKING <BUILDING> <FLOOR> 
Should list down all the bookings by user
Output format: <SLOT> <FLOOR> <BUILDING> <roomName>
2:6 3 b1 c1
6:10 3 b1 c2

SEARCH <SLOT> <BUILDING> <FLOOR> 
Search should return possible available rooms for given parameters.
SEARCH 2:3 b3 7 -> Search conf rooms available for booking from 2->3 in b3 building and seventhFloor floor
If no room is available for booking for given slot, search will return “No Rooms available”


SEARCH <SLOT> <BUILDING> <FLOOR> <CAPACITY>
Search should return possible available rooms for given parameters.
SEARCH 2:3 b3 7 3 

NOTE: Slot, Building, Floor, Capacity are not mandatory.

Bonus Questions/Features:
1. Existing search will return empty results if no rooms are available for a given slot. Users want a suggestion functionality using which users can get a list of possible future slots [Size limit to 3] which can be booked.

Eg. Assume no room is available for a slot then the search will return an empty result while SUGGEST command will return the next 3 suggestions.
Command: SUGGEST 3:10

2.Unit tests and Logging.


Expectation
Code should be Demo able and functionally complete.
Code should fail gracefully with a proper error message for corner/invalid cases, use exceptions for handling these cases.
Code should be modular, try thinking in terms of Object-Oriented Design.
Input can be taken from the command line or in the main function.
Do not use any database or NoSQL store, use in-memory data structure.
Do not create any UI for the application
Driver class can be designed as per your choice, but it should cover all the scenarios.
Please prioritize code compilation, execution, and completion.
Work on the expected output first and then only work on bonus features.
