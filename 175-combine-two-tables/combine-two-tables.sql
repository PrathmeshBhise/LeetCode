# Write your MySQL query statement below
SELECT firstName,lastName,city,state from Person p  Left Join address a on p.personId=a.personId;