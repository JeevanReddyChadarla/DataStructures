select Max(salary) as SecondHighestSalary  from Employee
Where Salary < (Select Max(salary) from Employee);