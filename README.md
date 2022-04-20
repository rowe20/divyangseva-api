# API Endpoint Documentation

## Project: Divyangseva(Services for Differently-abled)


##### Developers: Sudheesh Surendran and Roshan David


## User Service

1. #### Url - http://localhost:8080/api/user 
* #### Method - GET
* #### protected - 

*Description - Fetching of all user*  


**Sample:**  
__Url - http://localhost:8080/api/user__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    {
        "id": 2,
        "uname": "testuser",
        "email": "test@gmail.com",
        "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
        "phone_no": "987654322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    {
        "id": 3,
        "uname": "testdoc",
        "email": "test@gmail.com",
        "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
        "phone_no": "987654322",
        "organization_name": "Ankleshwar Civil Hospital",
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 1,
            "user_type": "Doctor"
        }
    },
    {
        "id": 4,
        "uname": "testrailwayofficer",
        "email": "testrailofficer1@gmail.com",
        "password": "testrailwayofficerpw",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 3,
            "user_type": "Railway Officer"
        }
    },
    {
        "id": 5,
        "uname": "testperson1",
        "email": "test@gmail.com",
        "password": "$2a$10$YAWMuqChBZ/JQJ9BTvJsdOJ.JaUj/1zCqufU.WUR04ssovYKGvfuS",
        "phone_no": "987558322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-02-27",
        "city": {
            "id": 2,
            "city_name": "ahemdabad",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    {
        "id": 6,
        "uname": "testperson2",
        "email": "test@gmail.com",
        "password": "$2a$10$VrC7b1F2DTmZtZI8PCTNGO.5ia4r3tHHybns.J6uJlXLlu4J/2Wcy",
        "phone_no": "987558322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1992-02-27",
        "city": {
            "id": 2,
            "city_name": "ahemdabad",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    {
        "id": 7,
        "uname": "testperson3",
        "email": "test@gmail.com",
        "password": "$2a$10$TE617BPdY1efyVy4LTvUx.r.Y2V0JGXRo4TsUXdfeXIBT9jFjAPma",
        "phone_no": "987558322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1992-02-27",
        "city": {
            "id": 2,
            "city_name": "ahemdabad",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    }
]
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/user/ 
* #### Method - POST
* #### protected - 

*Description - Inserting a new User*  
_This will also be italic_

**Sample:**  
__Url - http://localhost:8080/api/user/__

__Params - none__  

__Body:__

```
 {
    "uname": "SUDHEESHKUMAR",
    "email": "sk2@gmail.com",
    "password": "sk2",
    "phone_no": "987658921",
    "organization_name": "Ankleshwar Police Station.",
    "image": "/someting/somewhere",
    "signature": "/someting/somewhere",
    "aadhar": "/someting/somewhere",
    "dob": "1995-06-17",
    "city": {
        "id": 1},
    "usertype": {
        "id": 2}
}
```
__Response:__

```
 User Inserted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/user/8
* #### Method - PUT
* #### protected - 

*Description - Updating a User*  


**Sample:**  
__Url - http://localhost:8080/api/user/8__

__Params - none__  

__Body:__

```
 {
    "uname": "SUDHEESH",
    "email": "sk3@gmail.com",
    "password": "sk3",
    "phone_no": "999658921",
    "organization_name": "Ankleshwar Police Station.",
    "image": "/someting/somewhere",
    "signature": "/someting/somewhere",
    "aadhar": "/someting/somewhere",
    "dob": "1995-06-17",
    "city": {
        "id": 1},
    "usertype": {
        "id": 2}
}
```
__Response:__

```
 {
    "id": 8,
    "uname": "SUDHEESH",
    "email": "sk3@gmail.com",
    "password": "sk3",
    "phone_no": "999658921",
    "organization_name": "Ankleshwar Police Station.",
    "image": "/someting/somewhere",
    "signature": "/someting/somewhere",
    "aadhar": "/someting/somewhere",
    "dob": "1995-06-17",
    "city": {
        "id": 1,
        "city_name": "Ankleshwar",
        "state": {
            "id": 2,
            "state_name": "Gujarat"
        }
    },
    "usertype": {
        "id": 2,
        "user_type": "Police"
    }
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/user/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a User*  


**Sample:**  
__Url - http://localhost:8080/api/user/8__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 User Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/user/{id}
* #### Method - GET
* #### protected - 

*Description -Fetching All Users*  


**Sample:**  
__Url - http://localhost:8080/api/user/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 1,
    "uname": "SUDHEESHKUMAR",
    "email": "sk@gmail.com",
    "password": "sk",
    "phone_no": "987654321",
    "organization_name": "Ankleshwar Police Station.",
    "image": "/someting/somewhere",
    "signature": "/someting/somewhere",
    "aadhar": "/someting/somewhere",
    "dob": "1995-06-17",
    "city": {
        "id": 1,
        "city_name": "Ankleshwar",
        "state": {
            "id": 2,
            "state_name": "Gujarat"
        }
    },
    "usertype": {
        "id": 2,
        "user_type": "Police"
    }
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
6. #### Url - http://localhost:8080/api/user/login
* #### Method - POST
* #### protected - 

*Description - Login*  


**Sample:**  
__Url - http://localhost:8080/api/user/login__

__Params - none__  

__Body:__

```
 {
    
        "email":"sk@gmail.com",
        "password":"sk"
    
}
```
__Response:__

```
 {
    "name": "SUDHEESHKUMAR",
    "user_type": "Police"
}
```

## User-Type Service

1. #### Url - http://localhost:8080/api/usertype/
* #### Method - POST
* #### protected - 

*Description -Inserting a User Type-: Doctor/Railway-officer/Police-officer*  

**Sample:**  
__Url - http://localhost:8080/api/usertype/__

__Params - none__  

__Body:__

```
 {
    "user_type": "Sample User Type"
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/usertype/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating a User Type-: Doctor/Railway-officer/Police-officer*  


**Sample:**  
__Url - http://localhost:8080/api/usertype/5__

__Params - none__  

__Body:__

```
 {
    "user_type": "Sample User Type Updated"
}
```
__Response:__

```
 {
    "id": 5,
    "user_type": "Sample User Type Updated"
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/usertype/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a User Type-: Doctor/Railway-officer/Police-officer*  

**Sample:**  
__Url -http://localhost:8080/api/usertype/5__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/usertype/
* #### Method - GET
* #### protected - 

*Description - Fetching all User Type-: Doctor/Railway-officer/Police-officer*  


**Sample:**  
__Url - http://localhost:8080/api/usertype/__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "id": 1,
        "user_type": "Doctor"
    },
    {
        "id": 2,
        "user_type": "Police"
    },
    {
        "id": 3,
        "user_type": "Railway Officer"
    },
    {
        "id": 4,
        "user_type": "enduser"
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/usertype/{id}
* #### Method - GET
* #### protected - 

*Description -Fetch one User Type-: Doctor/Railway-officer/Police-officer*  


**Sample:**  
__Url - http://localhost:8080/api/usertype/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 1,
    "user_type": "Doctor"
}
```

## Disable-Cerificate Service

1. #### Url - http://localhost:8080/api/certificate/
* #### Method - POST
* #### protected - 

*Description - Inserting a new record*  


**Sample:**  
__Url - http://localhost:8080/api/certificate/__

__Params - none__  

__Body:__

```
 {
    "user": {
        "id": 5
    },
    "docuser": {
        "id": 3
    },
    "policeuser": {
        "id": 1
    },
    "railwayuser": {
        "id": 4
    },
    "disabilitytypes": {
        "id": 2
    },
    "dpercentage": 40,
    "dproof": "something/somewhere",
    "is_active": 0,
    "rail_concession_status": 1,
    "needs_escort": 0
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/certificate/{id}
* #### Method - GET
* #### protected - 

*Description - Fetching disability of particular person*  

**Sample:**  
__Url - http://localhost:8080/api/certificate/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 2,
    "user": {
        "id": 5,
        "uname": "testperson1",
        "email": "test@gmail.com",
        "password": "$2a$10$YAWMuqChBZ/JQJ9BTvJsdOJ.JaUj/1zCqufU.WUR04ssovYKGvfuS",
        "phone_no": "987558322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-02-27",
        "city": {
            "id": 2,
            "city_name": "ahemdabad",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    "docuser": {
        "id": 3,
        "uname": "testdoc",
        "email": "test@gmail.com",
        "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
        "phone_no": "987654322",
        "organization_name": "Ankleshwar Civil Hospital",
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 1,
            "user_type": "Doctor"
        }
    },
    "policeuser": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "railwayuser": {
        "id": 4,
        "uname": "testrailwayofficer",
        "email": "testrailofficer1@gmail.com",
        "password": "testrailwayofficerpw",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 3,
            "user_type": "Railway Officer"
        }
    },
    "disabilitytypes": {
        "id": 2,
        "disability_type": "Locomoter Left Hand"
    },
    "dpercentage": 40,
    "dproof": "something/somewhere",
    "is_active": 0,
    "rail_concession_status": 1,
    "needs_escort": 0
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/certificate/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating disability of particular person*  


**Sample:**  
__Url - http://localhost:8080/api/certificate/2__

__Params - none__  

__Body:__

```
 {
    "user": {
        "id": 5
    },
    "docuser": {
        "id": 3
    },
    "policeuser": {
        "id": 1
    },
    "railwayuser": {
        "id": 4
    },
    "disabilitytypes": {
        "id": 2
    },
    "dpercentage": 50,
    "dproof": "something/somewhere",
    "is_active": 0,
    "rail_concession_status": 1,
    "needs_escort": 1
}
```
__Response:__

```
 {
    "id": 2,
    "user": {
        "id": 5,
        "uname": "testperson1",
        "email": "test@gmail.com",
        "password": "$2a$10$YAWMuqChBZ/JQJ9BTvJsdOJ.JaUj/1zCqufU.WUR04ssovYKGvfuS",
        "phone_no": "987558322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-02-27",
        "city": {
            "id": 2,
            "city_name": "ahemdabad",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    "docuser": {
        "id": 3,
        "uname": "testdoc",
        "email": "test@gmail.com",
        "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
        "phone_no": "987654322",
        "organization_name": "Ankleshwar Civil Hospital",
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 1,
            "user_type": "Doctor"
        }
    },
    "policeuser": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "railwayuser": {
        "id": 4,
        "uname": "testrailwayofficer",
        "email": "testrailofficer1@gmail.com",
        "password": "testrailwayofficerpw",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 3,
            "user_type": "Railway Officer"
        }
    },
    "disabilitytypes": {
        "id": 2,
        "disability_type": "Locomoter Left Hand"
    },
    "dpercentage": 50,
    "dproof": "something/somewhere",
    "is_active": 0,
    "rail_concession_status": 1,
    "needs_escort": 1
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/certificate
* #### Method - GET
* #### protected - 

*Description -  Fetch disability of particular person*  

**Sample:**  
__Url - http://localhost:8080/api/certificate__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "id": 1,
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docuser": {
            "id": 3,
            "uname": "testdoc",
            "email": "test@gmail.com",
            "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
            "phone_no": "987654322",
            "organization_name": "Ankleshwar Civil Hospital",
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 1,
                "user_type": "Doctor"
            }
        },
        "policeuser": {
            "id": 1,
            "uname": "SUDHEESHKUMAR",
            "email": "sk@gmail.com",
            "password": "sk",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Police Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 2,
                "user_type": "Police"
            }
        },
        "railwayuser": {
            "id": 4,
            "uname": "testrailwayofficer",
            "email": "testrailofficer1@gmail.com",
            "password": "testrailwayofficerpw",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 3,
                "user_type": "Railway Officer"
            }
        },
        "disabilitytypes": {
            "id": 1,
            "disability_type": "Locomoter Right Hand"
        },
        "dpercentage": 40,
        "dproof": "something/somewhere",
        "is_active": 0,
        "rail_concession_status": 1,
        "needs_escort": 0
    },
    {
        "id": 2,
        "user": {
            "id": 5,
            "uname": "testperson1",
            "email": "test@gmail.com",
            "password": "$2a$10$YAWMuqChBZ/JQJ9BTvJsdOJ.JaUj/1zCqufU.WUR04ssovYKGvfuS",
            "phone_no": "987558322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-02-27",
            "city": {
                "id": 2,
                "city_name": "ahemdabad",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docuser": {
            "id": 3,
            "uname": "testdoc",
            "email": "test@gmail.com",
            "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
            "phone_no": "987654322",
            "organization_name": "Ankleshwar Civil Hospital",
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 1,
                "user_type": "Doctor"
            }
        },
        "policeuser": {
            "id": 1,
            "uname": "SUDHEESHKUMAR",
            "email": "sk@gmail.com",
            "password": "sk",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Police Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 2,
                "user_type": "Police"
            }
        },
        "railwayuser": {
            "id": 4,
            "uname": "testrailwayofficer",
            "email": "testrailofficer1@gmail.com",
            "password": "testrailwayofficerpw",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 3,
                "user_type": "Railway Officer"
            }
        },
        "disabilitytypes": {
            "id": 2,
            "disability_type": "Locomoter Left Hand"
        },
        "dpercentage": 40,
        "dproof": "something/somewhere",
        "is_active": 0,
        "rail_concession_status": 1,
        "needs_escort": 0
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/certificate/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting record of User("can only be done by Admin")*  


**Sample:**  
__Url - http://localhost:8080/api/certificate/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

## Disability-Type Service

1. #### Url - http://localhost:8080/api/disabilitytype/
* #### Method - POST
* #### protected - 

*Description -Inserting a disability type*  


**Sample:**  
__Url - http://localhost:8080/api/disabilitytype/__

__Params - none__  

__Body:__

```
 {
    "disability_type": "Sample disability type"
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/disabilitytype/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a disability type*  


**Sample:**  
__Url - http://localhost:8080/api/disabilitytype/3__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/disabilitytype/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating Inserting a disability type*  

**Sample:**  
__Url - http://localhost:8080/api/disabilitytype/3__

__Params - none__  

__Body:__

```
 {
    "disability_type": "Sample disability type Updated"
}
```
__Response:__

```
 {
    "id": 3,
    "disability_type": "Sample disability type Updated"
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/disabilitytype/
* #### Method - GET
* #### protected - 

*Description -Fetching all disability type*  


**Sample:**  
__Url -http://localhost:8080/api/disabilitytype/__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "id": 1,
        "disability_type": "Locomoter Right Hand"
    },
    {
        "id": 2,
        "disability_type": "Locomoter Left Hand"
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/disabilitytype/{id}
* #### Method - GET
* #### protected - 

*Description - Fetching One DisabilityType*  


**Sample:**  
__Url - http://localhost:8080/api/disabilitytype/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 1,
    "disability_type": "Locomoter Right Hand"
}
```

## Doctor's Job Service

1. #### Url - http://localhost:8080/api/job/doc/
* #### Method - POST
* #### protected - 

*Description - Inserting new Job for a particular doctor*  


**Sample:**  
__Url - http://localhost:8080/api/job/doc/__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 3
    },
    "status": {
        "id": 2
    }
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/job/doc/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating a Job for a particular doctor*  


**Sample:**  
__Url - http://localhost:8080/api/job/doc/2__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 3
    },
    "status": {
        "id": 1
    }
}
```
__Response:__

```
 {
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 3,
        "uname": "testdoc",
        "email": "test@gmail.com",
        "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
        "phone_no": "987654322",
        "organization_name": "Ankleshwar Civil Hospital",
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 1,
            "user_type": "Doctor"
        }
    },
    "status": {
        "status": "Approved",
        "id": 1
    },
    "id": 2
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/job/doc/{id}
* #### Method - GET
* #### protected - 

*Description - Fetch Job for a particular doctor*  
_This will also be italic_

**Sample:**  
__Url - http://localhost:8080/api/job/doc/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/job/doc/{id}
* #### Method - GET
* #### protected - 

*Description - Fetch new Job for a particular doctor*  


**Sample:**  
__Url - http://localhost:8080/api/job/doc/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 3,
        "uname": "testdoc",
        "email": "test@gmail.com",
        "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
        "phone_no": "987654322",
        "organization_name": "Ankleshwar Civil Hospital",
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 1,
            "user_type": "Doctor"
        }
    },
    "status": {
        "status": "Rejected",
        "id": 2
    },
    "id": 1
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/job/doc
* #### Method - GET
* #### protected - 

*Description - Fetch all Jobs*  

**Sample:**  
__Url - http://localhost:8080/api/job/doc__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "request": {
            "user": {
                "id": 2,
                "uname": "testuser",
                "email": "test@gmail.com",
                "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
                "phone_no": "987654322",
                "organization_name": null,
                "image": "/something/somewhere",
                "signature": "/something/somewhere",
                "aadhar": "/something/somewhere",
                "dob": "1995-06-17",
                "city": {
                    "id": 1,
                    "city_name": "Ankleshwar",
                    "state": {
                        "id": 2,
                        "state_name": "Gujarat"
                    }
                },
                "usertype": {
                    "id": 4,
                    "user_type": "enduser"
                }
            },
            "docstatus": {
                "status": "Pending",
                "id": 3
            },
            "policestatus": {
                "status": "Pending",
                "id": 3
            },
            "railwayofficerstatus": {
                "status": "Pending",
                "id": 3
            },
            "id": 1
        },
        "user": {
            "id": 3,
            "uname": "testdoc",
            "email": "test@gmail.com",
            "password": "$2a$10$grywTAtTWOsX9EuId2KnC..fFWYi3ydw8baTEpGxEgj.oDZpaNmWe",
            "phone_no": "987654322",
            "organization_name": "Ankleshwar Civil Hospital",
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 1,
                "user_type": "Doctor"
            }
        },
        "status": {
            "status": "Rejected",
            "id": 2
        },
        "id": 1
    }
]
```


## Police's Job Service

1. #### Url - http://localhost:8080/api/job/police
* #### Method - POST
* #### protected - 

*Description - Inserting new Job for a particular police*  


**Sample:**  
__Url - http://localhost:8080/api/job/police__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "status": {
        "id": 3
    }
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/job/police/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating new Job for a particular Police*  


**Sample:**  
__Url -  http://localhost:8080/api/job/police/2__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "status": {
        "id": 1
    }
}
```
__Response:__

```
 {
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "status": {
        "status": "Approved",
        "id": 1
    },
    "id": 2
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/job/police/{id}
* #### Method - GET
* #### protected - 

*Description - Fetching one Job for a particular Police*  


**Sample:**  
__Url - http://localhost:8080/api/job/police/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "status": {
        "status": "Pending",
        "id": 3
    },
    "id": 1
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/job/police
* #### Method - GET
* #### protected - 

*Description - Fetching Job for a particular Police*  


**Sample:**  
__Url - http://localhost:8080/api/job/police__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "request": {
            "user": {
                "id": 2,
                "uname": "testuser",
                "email": "test@gmail.com",
                "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
                "phone_no": "987654322",
                "organization_name": null,
                "image": "/something/somewhere",
                "signature": "/something/somewhere",
                "aadhar": "/something/somewhere",
                "dob": "1995-06-17",
                "city": {
                    "id": 1,
                    "city_name": "Ankleshwar",
                    "state": {
                        "id": 2,
                        "state_name": "Gujarat"
                    }
                },
                "usertype": {
                    "id": 4,
                    "user_type": "enduser"
                }
            },
            "docstatus": {
                "status": "Pending",
                "id": 3
            },
            "policestatus": {
                "status": "Pending",
                "id": 3
            },
            "railwayofficerstatus": {
                "status": "Pending",
                "id": 3
            },
            "id": 1
        },
        "user": {
            "id": 1,
            "uname": "SUDHEESHKUMAR",
            "email": "sk@gmail.com",
            "password": "sk",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Police Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 2,
                "user_type": "Police"
            }
        },
        "status": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/job/police/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting Job for a particular Police*  


**Sample:**  
__Url - http://localhost:8080/api/job/police/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

## Railway-Officer's Job Service

1. #### Url - http://localhost:8080/api/job/rail/
* #### Method - POST
* #### protected - 

*Description - Inserting new Job for a particular Rail-Officer*  


**Sample:**  
__Url - http://localhost:8080/api/job/rail/__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "status": {
        "id": 2
    }
}
```
__Response:__

```
Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/job/rail/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating Job for a particular Rail-Officer*  


**Sample:**  
__Url - http://localhost:8080/api/job/rail/2__

__Params - none__  

__Body:__

```
 {
    "request": {
        "id": 1
    },
    "user": {
        "id": 1
    },
    "status": {
        "id": 3
    }
}
```
__Response:__

```
{
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "status": {
        "status": "Pending",
        "id": 3
    },
    "id": 2
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/job/rail/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting Job for a particular Rail-Officer*  


**Sample:**  
__Url - http://localhost:8080/api/job/rail/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/job/rail
* #### Method - GET
* #### protected - 

*Description - Fetching all Job for a particular Rail-Officer*  


**Sample:**  
__Url - http://localhost:8080/api/job/rail__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "request": {
            "user": {
                "id": 2,
                "uname": "testuser",
                "email": "test@gmail.com",
                "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
                "phone_no": "987654322",
                "organization_name": null,
                "image": "/something/somewhere",
                "signature": "/something/somewhere",
                "aadhar": "/something/somewhere",
                "dob": "1995-06-17",
                "city": {
                    "id": 1,
                    "city_name": "Ankleshwar",
                    "state": {
                        "id": 2,
                        "state_name": "Gujarat"
                    }
                },
                "usertype": {
                    "id": 4,
                    "user_type": "enduser"
                }
            },
            "docstatus": {
                "status": "Pending",
                "id": 3
            },
            "policestatus": {
                "status": "Pending",
                "id": 3
            },
            "railwayofficerstatus": {
                "status": "Pending",
                "id": 3
            },
            "id": 1
        },
        "user": {
            "id": 4,
            "uname": "testrailwayofficer",
            "email": "testrailofficer1@gmail.com",
            "password": "testrailwayofficerpw",
            "phone_no": "987654321",
            "organization_name": "Ankleshwar Station.",
            "image": "/someting/somewhere",
            "signature": "/someting/somewhere",
            "aadhar": "/someting/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 3,
                "user_type": "Railway Officer"
            }
        },
        "status": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/job/rail/{id}
* #### Method - GET
* #### protected - 

*Description - Fetch Job for a particular Rail-Officer*  


**Sample:**  
__Url - http://localhost:8080/api/job/rail/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "request": {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    },
    "user": {
        "id": 4,
        "uname": "testrailwayofficer",
        "email": "testrailofficer1@gmail.com",
        "password": "testrailwayofficerpw",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 3,
            "user_type": "Railway Officer"
        }
    },
    "status": {
        "status": "Pending",
        "id": 3
    },
    "id": 1
}
```

## RailwayZone Service

1. #### Url - http://localhost:8080/api/zone/
* #### Method - POST
* #### protected - 

*Description - Inserting new RailwayZone*  


**Sample:**  
__Url - http://localhost:8080/api/zone/__

__Params - none__  

__Body:__

```
 
    {
        "city": {
            "id": 1,
            "city_name": "Surat",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "zone_name": "Western Zone"
    }

```
__Response:__

```
Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/zone/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating RailwayZone*  


**Sample:**  
__Url - http://localhost:8080/api/zone/2__

__Params - none__  

__Body:__

```
 
    {
        "city": {
            "id": 2
        },
        "zone_name": "Western Zone"
    }

```
__Response:__

```
 {
    "id": 2,
    "city": {
        "id": 2,
        "city_name": "ahemdabad",
        "state": {
            "id": 2,
            "state_name": "Gujarat"
        }
    },
    "zone_name": "Western Zone"
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/zone/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a RailwayZone*  


**Sample:**  
__Url - http://localhost:8080/api/zone/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/zone
* #### Method - GET
* #### protected - 

*Description - Fetch all RailwayZone*  


**Sample:**  
__Url - http://localhost:8080/api/zone__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "id": 1,
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "zone_name": "Western Zone"
    }
]
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/zone/{id}
* #### Method - GET
* #### protected - 

*Description - Fetching one RailwayZone*  


**Sample:**  
__Url - http://localhost:8080/api/zone/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 1,
    "city": {
        "id": 1,
        "city_name": "Ankleshwar",
        "state": {
            "id": 2,
            "state_name": "Gujarat"
        }
    },
    "zone_name": "Western Zone"
}
```

## Request Service

1. #### Url - http://localhost:8080/api/request/
* #### Method - POST
* #### protected - 

*Description - Inserting a new Request*  


**Sample:**  
__Url - http://localhost:8080/api/request/__

__Params - none__  

__Body:__

```
{
    "user": {
        "id": 2
    },
    "docstatus": {
        "id": 3
    },
    "policestatus": {
        "id": 3
    },
    "railwayofficerstatus": {
        "id": 3
    }
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/request/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a Request*  


**Sample:**  
__Url - http://localhost:8080/api/request/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/request/{id}
* #### Method - PUT
* #### protected - 

*Description - Updating a Request*  

**Sample:**  
__Url - http://localhost:8080/api/request/2__

__Params - none__  

__Body:__

```
 {
    "user": {
        "id": 1
    },
    "docstatus": {
        "id": 3
    },
    "policestatus": {
        "id": 3
    },
    "railwayofficerstatus": {
        "id": 3
    }
}
```
__Response:__

```
{
    "user": {
        "id": 1,
        "uname": "SUDHEESHKUMAR",
        "email": "sk@gmail.com",
        "password": "sk",
        "phone_no": "987654321",
        "organization_name": "Ankleshwar Police Station.",
        "image": "/someting/somewhere",
        "signature": "/someting/somewhere",
        "aadhar": "/someting/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 2,
            "user_type": "Police"
        }
    },
    "docstatus": {
        "status": "Pending",
        "id": 3
    },
    "policestatus": {
        "status": "Pending",
        "id": 3
    },
    "railwayofficerstatus": {
        "status": "Pending",
        "id": 3
    },
    "id": 2
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/request/{id}
* #### Method - GET
* #### protected - 

*Description - Fetching a Request*  


**Sample:**  
__Url - http://localhost:8080/api/request/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "user": {
        "id": 2,
        "uname": "testuser",
        "email": "test@gmail.com",
        "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
        "phone_no": "987654322",
        "organization_name": null,
        "image": "/something/somewhere",
        "signature": "/something/somewhere",
        "aadhar": "/something/somewhere",
        "dob": "1995-06-17",
        "city": {
            "id": 1,
            "city_name": "Ankleshwar",
            "state": {
                "id": 2,
                "state_name": "Gujarat"
            }
        },
        "usertype": {
            "id": 4,
            "user_type": "enduser"
        }
    },
    "docstatus": {
        "status": "Pending",
        "id": 3
    },
    "policestatus": {
        "status": "Pending",
        "id": 3
    },
    "railwayofficerstatus": {
        "status": "Pending",
        "id": 3
    },
    "id": 1
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/request
* #### Method - GET
* #### protected - 

*Description - Fetch all Request*  


**Sample:**  
__Url - http://localhost:8080/api/request__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "user": {
            "id": 2,
            "uname": "testuser",
            "email": "test@gmail.com",
            "password": "$2a$10$bSwwdK49pjGIMI3cX2SUt.zLhK6VfIhpPfFS8SsD8z1Dyqei6nTMi",
            "phone_no": "987654322",
            "organization_name": null,
            "image": "/something/somewhere",
            "signature": "/something/somewhere",
            "aadhar": "/something/somewhere",
            "dob": "1995-06-17",
            "city": {
                "id": 1,
                "city_name": "Ankleshwar",
                "state": {
                    "id": 2,
                    "state_name": "Gujarat"
                }
            },
            "usertype": {
                "id": 4,
                "user_type": "enduser"
            }
        },
        "docstatus": {
            "status": "Pending",
            "id": 3
        },
        "policestatus": {
            "status": "Pending",
            "id": 3
        },
        "railwayofficerstatus": {
            "status": "Pending",
            "id": 3
        },
        "id": 1
    }
]
```

## State Service

1. #### Url - http://localhost:8080/api/state/
* #### Method - POST
* #### protected - 

*Description - Insert a new State*  


**Sample:**  
__Url - http://localhost:8080/api/state/__

__Params - none__  

__Body:__

```
 {
    
    "state_name": "Kerala"
}
```
__Response:__

```
 Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/state/{id}
* #### Method - PUT
* #### protected - 

*Description - Update current State*  


**Sample:**  
__Url - http://localhost:8080/api/state/3__

__Params - none__  

__Body:__

```
 {
    "state_name": "Delhi"
 }
```
__Response:__

```
 {
    "id": 3,
    "state_name": "Delhi"
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/state/{id}
* #### Method - GET
* #### protected - 

*Description - Fetch a State*  


**Sample:**  
__Url - http://localhost:8080/api/state/2__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "id": 2,
    "state_name": "Gujarat"
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/state/{id}
* #### Method - DELETE
* #### protected - 

*Description - Deleting a State*  


**Sample:**  
__Url - http://localhost:8080/api/state/3__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/state
* #### Method - GET
* #### protected - 

*Description - Fetch all State*  


**Sample:**  
__Url - http://localhost:8080/api/state__

__Params - none__  

__Body:__

```
 
```
__Response:__

```
 [
    {
        "id": 2,
        "state_name": "Gujarat"
    },
    {
        "id": 3,
        "state_name": "Arunachal Pradesh"
    },
    {
        "id": 4,
        "state_name": "Maharashtra"
    },
    {
        "id": 5,
        "state_name": "Delhi"
    }
]
```

## Status Service

1. #### Url - http://localhost:8080/api/status
* #### Method - POST
* #### protected - 

*Description - Insert new Status*  


**Sample:**  
__Url - http://localhost:8080/api/status__

__Params - none__  

__Body:__

```
 {
    "status": "Rejected"
 }
```
__Response:__

```
Record Inserted Successfully.
```
##### -----------------------------------------------------------------------------------------------------------------------------------
2. #### Url - http://localhost:8080/api/status/{id}
* #### Method - PUT
* #### protected - 

*Description - Update a Status*  


**Sample:**  
__Url -http://localhost:8080/api/status/5__

__Params - none__  

__Body:__

```
 {
    "status": "Request"
 }
```
__Response:__

```
 {
    "status": "Request",
    "id": 5
 }
```

##### -----------------------------------------------------------------------------------------------------------------------------------
3. #### Url - http://localhost:8080/api/status/{id}
* #### Method - GET
* #### protected - 

*Description - Fetch one Status*  


**Sample:**  
__Url -http://localhost:8080/api/status/1__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 {
    "status": "Approved",
    "id": 1
}
```

##### -----------------------------------------------------------------------------------------------------------------------------------
4. #### Url - http://localhost:8080/api/status/{id}
* #### Method - DELETE
* #### protected - 

*Description - Delete a Status*  


**Sample:**  
__Url -http://localhost:8080/api/status/5__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 Record Deleted Successfully.
```

##### -----------------------------------------------------------------------------------------------------------------------------------
5. #### Url - http://localhost:8080/api/status
* #### Method - GET
* #### protected - 

*Description - Fetch all Status*  


**Sample:**  
__Url - http://localhost:8080/api/status__

__Params - none__  

__Body:__

```
 {
 "example":"example"
 }
```
__Response:__

```
 [
    {
        "status": "Approved",
        "id": 1
    },
    {
        "status": "Rejected",
        "id": 2
    },
    {
        "status": "Pending",
        "id": 3
    },
    {
        "status": "Finished",
        "id": 4
    }
]
```
_End **of** API list_

