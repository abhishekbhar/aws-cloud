# Create Subnet

* Open the [Amazon VPC console](https://console.aws.amazon.com/vpc/)
* In the navigation pane, choose Subnets.
* Choose Create subnet.
* For VPC ID: Choose the VPC for the subnet.
* (Optional) For Subnet name, enter a name for your subnet. Doing so creates a tag with a key of Name and the value that you specify.
* For Availability Zone, you can choose a Zone for your subnet, or leave the default No Preference to let AWS choose one for you.
* If the subnet should be an IPv6-only subnet, choose IPv6-only. This option is only available if the VPC has an associated IPv6 CIDR block. If you choose this option, you can't associate an IPv4 CIDR block with the subnet.
* For IPv4 CIDR block, enter an IPv4 CIDR block for your subnet. For example, 10.0.1.0/24. If you chose IPv6-only, this option is unavailable.
* For IPv6 CIDR block, choose Custom IPv6 CIDR and specify the hexadecimal pair value (for example, 00). This option is available only if the VPC has an associated IPv6 CIDR block.
* Choose Create subnet.

[More Details](https://docs.aws.amazon.com/vpc/latest/userguide/create-subnets.html)

