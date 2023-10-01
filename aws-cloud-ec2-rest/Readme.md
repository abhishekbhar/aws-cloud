# AWS ec2 REST application

This is a sample application for with rest api endpoint's using spring boot which will be deployed as jar to an ec2 instance running on aws.

### Dependencies:
* [AWS account](../docs/account.md)

### Steps for deployment
1. [Create a VPC](../docs/vpc.md)
2. [Create a subnet](../docs/subnet.md)
3. [Create an internet gateway](../docs/internet-gateway.md) and Attach internet gateway to VPC
4. [Create a route table](../docs/route-table.md) and Configure route table
5. [Create a security group](../docs/security-group.md) and Configure security group to accept inbound traffic on application port
6. [Create an ec2 instance](../docs/ec2.md) and attach ec2 instance to created subnet
7. [Connect to the ec2 instance](../docs/ec2.md)
8. Install java on ec2 instance
9. Install maven on ec2 instance 
10. Clone GitHub repository to directory 
11. Compile the application to create a jar 
12. Run the created jar
13. Connect to rest endpoint using the ec2 public url and port number

