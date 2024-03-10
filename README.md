# Job Post API

## Description
The Job Post API is a streamlined solution for managing job postings through RESTful web services. It offers essential functionalities such as creating, retrieving, and searching job posts based on keywords. Developed using Spring Boot and MongoDB, this API simplifies the process of job management while providing efficient search capabilities to enhance user experience.

## Key Features
- **Create Job Postings:** Easily create new job postings using intuitive RESTful endpoints.
- **Retrieve Job Postings:** Retrieve existing job postings to view details and status.
- **Search by Keywords:** Search for relevant job postings based on keywords, optimizing the job search process.
- **Efficient and User-friendly:** Built for simplicity and ease of use, ensuring a smooth user experience.

## Technologies
- **Spring Boot:** Provides a powerful and flexible framework for building Java-based applications.
- **MongoDB:** A scalable NoSQL database used for storing and retrieving job postings efficiently.

## Usage
1. Clone the repository to your local machine.
2. Configure the application.properties file with your MongoDB connection details.
3. Build and run the application using Maven or your preferred IDE.
4. Access the API endpoints to manage and search job postings.

## Endpoints
- `POST /post`: Create a new job posting.
- `GET /allposts`: Retrieve all job postings.
- `GET /posts/{text}`: Search for job postings based on keywords.

## Future Enhancements
The following features are planned to be added soon:
- **Update Functionality:** Enable updating existing job postings.
- **Delete Functionality:** Implement the ability to delete job postings.
