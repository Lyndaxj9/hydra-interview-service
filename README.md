# hydra-interview-service
Fields in the Interview & InterviewType beans are as follows:
* Interview
	* Integer interviewId
	* Integer associateId
	* Integer interviewTypeId
	* Integer clientId
	* Integer endClientId
	* Timestamp interviewDate
	* String interviewFeedback
* InterviewType
	* Integer interviewTypeId
	* String interviewTypeName

The controller can perform the following functions:
* InterviewController
	* findAllInterview(), via a GET to /all/interview
	* retrieveAllInterviewByAssociate(@PathVariable Integer id), via a GET to /all/interview/associate/{id}
	* addInterviewByAssociate(@PathVariable Integer id, @RequestBody Interview interview), via a POST to /add/interview/associate/{id}
	* updateInterview(@PathVariable Integer id, @RequestBody Interview interview), via a POST to /update/interview/{id}
	* deleteInterviewById(@PathVariable Integer id), via a POST to /delete/interview/{id}
