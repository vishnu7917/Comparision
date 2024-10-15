This player comparision application is developed using Java and Spring Boot [Backend].
It uses MySql server to store the player data fields.
As of now only just two players data is available in local.

The routes of this project are:
For Batting :  /bat/{match_type}/{player_name}
For Bowling :  /bowl/{match_type}/{player_name}
For All players details: /All
For individual player profile detials: /Player/{player_name}

------Here replace {match_type} with the fields in {test,odi,ipl,t20} and try.------------
These routes are only for getting individual stats of the players.
