# LAB 5 AREP DOCKER + SPARK + AWS + LOAD BALANCING :rocket:

In this repository you will find a solution to LAB 5 Workshop. we learned about virtualization with docker and deploy to AWS, Availability with Load Balancer client and Rest Server. The virtualization is the future, you know :laughing:

You will find 4 principal packages in this repository.

- Client source: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/Client
- Server source: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/SparkWebLive
- Local compose source: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/DockerCompose
- AWS compose source:https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/DockerCompose-AWS


This project has continuous integration, both for the client and for the server with Circle ci.
### Cliente
[![CircleCI](https://circleci.com/gh/AlejandroBohal/LoadBalancerClient.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/LoadBalancerClient)
### Servidor
[![CircleCI](https://circleci.com/gh/AlejandroBohal/ServerRestSpark.svg?style=svg)](https://circleci.com/gh/AlejandroBohal/ServerRestSpark)


## Architecture 

This project is composed of several components located in different layers, the main components are 

  - Web client with load balancer that divides the requests made to the server.
  - Web server that handles the requests received from the client, 3 replicas of this component are created to maintain redundancy and increase both availability and system performance.
  - MongoDB persistence image that provides information to the respective
 
These components were contained in the docker-composite which is responsible for creating an image for each of them. We have the docker-layer which is composed of the components described above, the AWS-EC2 layer which is in charge of keeping these containers in the cloud and the security layer which is managed for now with the AWS security groups.

![](https://media.discordapp.net/attachments/352624122301513730/757797953024032918/descargar.png?width=989&height=475)

## Live Demo

![](img/gif.gif)

In the following gif we can appreciate a small demo of the web client that is in charge of balancing the load in the different server nodes, this client is deployed in aws in the docker containers.

You can see the complete demonstration of the operation in the following link

https://youtu.be/iAMj8_ZNwjg


## Author 

- Sergio Alejandro Bohorquez Alzate.
