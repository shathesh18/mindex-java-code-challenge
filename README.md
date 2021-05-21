## Implementation Details

### Task 1
A new type ReportingStructure is created with two properties: employee and numberOfReports. A ReportingStructure is unique to an Employee and hence I exposed the api endpoint localhost:port/{employeeId}/reportingStructure for this type. Below is the given test case

For the field "numberOfReports", this should equal the total number of reports under a given employee. The number of 
reports is determined to be the number of directReports for an employee and all of their distinct reports. For example, 
given the following employee structure:
```
                    John Lennon
                /               \
         Paul McCartney         Ringo Starr
                               /        \
                          Pete Best     George Harrison
```
The numberOfReports for employee John Lennon (employeeId: 16a596ae-edd3-4847-99fe-c4518e82c86f) would be equal to 4. 

My implementation is based on the following two assumptions
1. No employee directly reports to 2 or more employees
2. No employee reports to one of his/hers direct or indirect reports
The assumptions are reasonable, as this represents most real world organizational structure

#### Implementation 
I used a Depth First Search to iterate through all the reports until an employee has no reports. 
I add the sum of all reports at each level to eventually give the total reports for an employee

### Task 2
A new type ReportingStructure is created with three properties: employee, salary, and effectiveDate. As in case of ReportingStructure, a compensation is unique to an Employee and hence I exposed two localhost:port/{employeeId}/compensation api endpoints for this type, a post endpoint to create and a get endpoint to read by employeeId. As per requirement I am persist these details in the MongoDB and for get I query using persistence layer.

#### CompensationDTO
I used this data transfer object as a helper for the post method, as the post endpoint does not have enough information in itself to fill the Compensation Type and it does not make sense to transfer an entire employee object over the http request as well.

