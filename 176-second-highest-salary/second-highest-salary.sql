# Write your MySQL query statement below
Select (SELECT DISTINCT Salary from Employee Order By Salary desc Limit 1 offset 1) as SecondHighestSalary;