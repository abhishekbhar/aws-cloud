# Create VPC

* Open the [Amazon VPC console](https://console.aws.amazon.com/vpc/).
* In the VPC Dashboard, choose Create VPC.
* Under VPC settings, choose VPC and more.
* Complete these fields as follows:
* Keep Auto-generated selected under Name tag auto-generation. Change project to ADS VPC.
  * The IPv4 CIDR block should be 10.0.0.0/16.
* Keep No IPv6 CIDR block option selected.
* The Tenancy should remain Default.
* Select 2 for the Number of Availability Zones (AZs).
* Select 2 for the Number of public subnets. The number of private subnets can be changed to 0.
* Choose Customize subnet CIDR blocks to configure the public subnet IP address range. The public subnet CIDR blocks should be 10.0.0.0/20 and 10.0.16.0/20.
* Choose Create VPC. It takes several minutes for the VPC to be created.


[More Detatils](https://docs.aws.amazon.com/directoryservice/latest/admin-guide/gsg_create_vpc.html)


