# Write your MySQL query statement below
SELECT * from Cinema WHERE description != 'boring' and mod(id,2)=1 ORDER BY rating DESC