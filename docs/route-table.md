# Create Route Table

* Open the [Amazon VPC console](https://console.aws.amazon.com/vpc/)
* In the navigation pane, choose Route Tables, and then choose Create route table.
* In the Create route table dialog box, optionally name your route table, then select your VPC, and then choose Create route table.
* Select the custom route table that you just created. The details pane displays tabs for working with its routes, associations, and route propagation.
* On the Routes tab, choose Edit routes, Add route, and add the following routes as necessary. Choose Save changes when you're done.
  * For IPv4 traffic, specify 0.0.0.0/0 in the Destination box, and select the internet gateway ID in the Target list.
  * For IPv6 traffic, specify ::/0 in the Destination box, and select the internet gateway ID in the Target list.
* On the Subnet associations tab, choose Edit subnet associations, select the check box for the subnet, and then choose Save associations.


[More Details](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Route_Tables.html)