create database springjdbc;

use springjdbc;

select * from customer;
commit;

DELIMITER &&  
CREATE PROCEDURE RETRIEVE_CUSTOMER( IN limit_val int , IN offset_val int)
BEGIN
 DECLARE valFrom INT;
DECLARE valTo   INT;
SET valFrom = limit_val;
SET valTo = offset_val;
 select * from customer  order by id LIMIT valFrom OFFSET valTo;
 END;
 &&  
DELIMITER ;

## drop procedure
DROP procedure RETRIEVE_CUSTOMER;