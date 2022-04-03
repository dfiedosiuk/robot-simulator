# Robot Simulator

### Program verifys robot movements.
The robots have three possible movements:
* turn right
* turn left
* advance

The robot when receives a number of instructions, at which point the testing facility verifies the robot's new position, and in which direction it is pointing.

The letter-string instruction "RAALAL" means:
* Turn right
* Advance twice
* Turn left
* Advance once
* Turn left yet again

Say a robot starts at {7, 3} facing north. Then running this stream of instructions should leave it at {9, 4} facing west.
