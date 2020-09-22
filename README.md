
# LAB 5 AREP DOCKER + SPARK + AWS + LOAD BALANCING

In this repository you will find 4 packages with specific documentation (Readme) about the use of these, in this root package you will find a general specification to the architecture and a demo of the prototype running on AWS Cloud. The virtualization is the future, you know :laughing:

- Client information: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/Client
- Server information: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/SparkWebLive
- Local compose information: https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/DockerCompose
- AWS compose information:https://github.com/AlejandroBohal/LAB5-AREP-DOCKER/tree/master/DockerCompose-AWS

## Architecture 

This project is composed of several components located in different layers, the main components are 

  - Web client with load balancer that divides the requests made to the server.
  - Web server that handles the requests received from the client, 3 replicas of this component are created to maintain redundancy and increase both availability and system performance.
  - MongoDB persistence image that provides information to the respective
 
These components were contained in the docker-composite which is responsible for creating an image for each of them. We have the docker-layer which is composed of the components described above, the AWS-EC2 layer which is in charge of keeping these containers in the cloud and the security layer which is managed for now with the AWS security groups.

![](https://media.discordapp.net/attachments/352624122301513730/757797953024032918/descargar.png?width=989&height=475)

## Live Demo

In the following gif we can appreciate a small demo of the web client that is in charge of balancing the load in the different server nodes, this client is deployed in aws in the docker containers.

![](https://media.discordapp.net/attachments/352624122301513730/758034879853232229/ezgif.com-video-to-gif.gif)

You can see the complete demonstration of the operation in the following link

https://youtu.be/iAMj8_ZNwjg


## Author 

- Sergio Alejandro Bohorquez Alzate.
