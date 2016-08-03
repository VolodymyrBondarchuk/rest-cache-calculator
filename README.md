# Rest based calculator (with cache)
Simple calculator web service that caches the results of its computations, with endpoints are following:

####%hostname%:%port%/calculator/add/{a}/{b}/{c}
####%hostname%:%port%/calculator/substract/{a}/{b}/{c}
####%hostname%:%port%/calculator/multiply/{a}/{b}/{c}
####%hostname%:%port%/calculator/divide/{a}/{b}/{c}
####<hostname>:<port>/calculator/divide/{a}/{b}/{c}


Project uses Jersey / JAX-RS to avoid parsing JSON manually. 
Each endpoint supports the GET method, and it returns the result in JSON format. I
If there is more than one call for the same operation on the same numbers, then the result will be returned from the cache rather than being recomputed.
The calculator calls support the addition, subtraction, multiplication and division of up to three numbers in the same call.
Project uses 'ehcache' implementation in Spring framework.

#Technologies used:
- Spring 3.2.3.RELEASE (core, web, context, aop)
- Jersey 1.7.11
- Ehcache 2.8.1
- logback 1.0.13
- Maven

To do:
- find out and fix writing cache data into disk space