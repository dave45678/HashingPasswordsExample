#Hashed Password Example
This example illustrates how to hash a password and generate a random
salt for each user. You would store each value in the database. Do not store
the clear text password anywhere. Each user has their own random salt which is 
stored in the database. When the user logs in then retrieve the hash and the 
salt from the database and compare the hash of the salt plus the just entered 
password. You will get the matching hash if they entered the same password.
Note that the password is appended to the end of the password as indicated
by the name of the method HashPasswordPlusSalt.
