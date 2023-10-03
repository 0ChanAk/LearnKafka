# Learn Kafka in Java Spring by creating project

This guide will help you get started with Apache Kafka in a Java Spring application on macOS. Apache Kafka is a distributed streaming platform that can be seamlessly integrated with Java Spring to build real-time data processing applications.

## Prerequisites

Before you begin, ensure you have the following prerequisites installed on your macOS:

1. **Java Development Kit (JDK)**: Make sure you have Java 8 or higher installed(I have used Java 17). You can check your Java version by running:

    ```shell
    java -version
    ```

2. **Apache Kafka**: Install Apache Kafka by following the official [Kafka Quickstart Guide](https://kafka.apache.org/quickstart).

3. **Apache ZooKeeper**: Kafka uses ZooKeeper for distributed coordination. You can use the ZooKeeper bundled with Kafka for development purposes.

4. **Apache Maven**: Install Maven for managing Java project dependencies. You can install it using [Homebrew](https://brew.sh/) by running:

    ```shell
    brew install maven
    ```

5. **Spring Boot**: Ensure you have Spring Boot installed. You can use [Spring Initializr](https://start.spring.io/) to create a new Spring Boot project with the necessary dependencies.

## Setting Up Kafka

1. Start ZooKeeper and Kafka servers in separate terminal tabs:

   ```shell
   # Start ZooKeeper (from the Kafka directory)
   bin/zookeeper-server-start.sh config/zookeeper.properties

   # Start Kafka (from the Kafka directory)
   bin/kafka-server-start.sh config/server.properties

