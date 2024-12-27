# Write your MySQL query statement below
Select COALESCE(
    (
        select distinct(Employee.salary) 
        From Employee 
        order by salary desc 
        Limit 1 offset 1
        ), null
    ) as SecondHighestSalary
