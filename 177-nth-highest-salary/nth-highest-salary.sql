CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE M INT;
SET M = N - 1;
  RETURN (
      # Write your MySQL query statement below.
      Select (Select DISTINCT Salary from Employee order by salary desc Limit 1 offset M)

  );
END