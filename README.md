# Social-media-aggregator
This project simulates a social media post aggregator. It allows users to create, retrieve, and manage social media posts.
The simple aggregator was created in a brainstorming session for microservices. 

Project additions discussed while brainstorming
* Data visualization
  - we could later add a front end (like React) to visualize this data, like creating charts showing post engagement (likes over time, comparrison to previous posts).
* API Integration
  - we could integrate with a real social media API (like Twitters API) to fetch real data.
* User Authentication
  - User Authentication by implementing the respective social media platforms own sign in methods.
* Analytics Dashboard
  - Build an analytics dashboard that tracks metrics like most liked posts, most active users and more. 

# Social Media Aggregator

## Overview
This project simulates a social media post aggregator. It allows users to create, retrieve, and manage social media posts.

## Running the Application
1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using your IDE or the command line:
    ```sh
    mvn spring-boot:run
    ```
4. The application will start on `http://localhost:8080`.

## Testing
### Postman Endpoints
- **Create a Post**
    - **Method**: POST
    - **URL**: `http://localhost:8080/posts`
    - **Params**:
        - `username`: `testuser`
        - `content`: `This is a test post!`

- **Get All Posts**
    - **Method**: GET
    - **URL**: `http://localhost:8080/posts`

### Example Data
- **Create Post Example**:
    - `username`: `testuser`
    - `content`: `This is a test post!`
