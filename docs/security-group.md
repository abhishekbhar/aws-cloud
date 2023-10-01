# Create Security group

* Open the [Amazon EC2 console](https://console.aws.amazon.com/ec2/)
* From the top navigation bar, select an AWS Region for the security group. Security groups are specific to a Region, so you should select the same Region in which you created your key pair.
* In the left navigation pane, choose Security Groups.
* Choose Create security group.
* For Basic details, do the following:
  * Enter a name for the new security group and a description. Use a name that is easy for you to remember, such as your user name, followed by _SG_, plus the Region name. For example, me_SG_uswest2.
  * In the VPC list, select your default VPC for the Region.
* For Inbound rules, create rules that allow specific traffic to reach your instance. For example, use the following rules for a web server that accepts HTTP and HTTPS traffic. For more examples, see Security group rules for different use cases.
  * Choose Add rule. For Type, choose HTTP. For Source, choose Anywhere.
  * Choose Add rule. For Type, choose HTTPS. For Source, choose Anywhere.
  * Choose Add rule. For Type, choose SSH. For Source, do one of the following:
    * Choose My IP to automatically add the public IPv4 address of your local computer.
    * Choose Custom and specify the public IPv4 address of your computer or network in CIDR notation. To specify an individual IP address in CIDR notation, add the routing suffix /32, for example, 203.0.113.25/32. If your company or your router allocates addresses from a range, specify the entire range, such as 203.0.113.0/24.
  * Warning: For security reasons, do not choose Anywhere for Source with a rule for SSH. This would allow access to your instance from all IP addresses on the internet. This is acceptable for a short time in a test environment, but it is unsafe for production environments.
* For Outbound rules, keep the default rule, which allows all outbound traffic.
* Choose Create security group.


[MoreDetails](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/get-set-up-for-amazon-ec2.html)
