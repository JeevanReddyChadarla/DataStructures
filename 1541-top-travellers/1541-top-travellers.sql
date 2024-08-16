SELECT name, COALESCE(SUM(distance),0) AS travelled_distance 
FROM Users LEFT OUTER JOIN Rides
ON Users.id = Rides.user_id
GROUP BY Users.id 
ORDER BY SUM(distance) DESC, name ASC
