# Create ec2 instance

* Open the [Amazon EC2 console](https://console.aws.amazon.com/ec2/)
* From the EC2 console dashboard, in the Launch instance box, choose Launch instance, and then choose Launch instance from the options that appear.
* Under Name and tags, for Name, enter a descriptive name for your instance.
* Under Application and OS Images (Amazon Machine Image), do the following:
  * Choose Quick Start, and then choose Amazon Linux. This is the operating system (OS) for your instance.
  * From Amazon Machine Image (AMI), select an HVM version of Amazon Linux 2. Notice that these AMIs are marked Free tier eligible. An Amazon Machine Image (AMI) is a basic configuration that serves as a template for your instance.
* Under Instance type, from the Instance type list, you can select the hardware configuration for your instance. Choose the t2.micro instance type, which is selected by default. The t2.micro instance type is eligible for the free tier. In Regions where t2.micro is unavailable, you can use a t3.micro instance under the [free tier](https://aws.amazon.com/free/) 
* Under Key pair (login), for Key pair name, choose the key pair that you created when getting set up.
  * Warning: Do not choose Proceed without a key pair (Not recommended). If you launch your instance without a key pair, then you can't connect to it.
* Next to Network settings, choose Edit. For Security group name, you'll see that the wizard created and selected a security group for you. You can use this security group, or alternatively you can select the security group that you created when getting set up using the following steps:
  * Choose Select existing security group.
  * From Common security groups, choose your security group from the list of existing security groups.
* Keep the default selections for the other configuration settings for your instance.
* Review a summary of your instance configuration in the Summary panel, and when you're ready, choose Launch instance.
* A confirmation page lets you know that your instance is launching. Choose View all instances to close the confirmation page and return to the console.
* On the Instances screen, you can view the status of the launch. It takes a short time for an instance to launch. When you launch an instance, its initial state is pending. After the instance starts, its state changes to running and it receives a public DNS name. If the Public IPv4 DNS column is hidden, choose the settings icon ( Settings icon. ) in the top-right corner, toggle on Public IPv4 DNS, and choose Confirm.
* It can take a few minutes for the instance to be ready for you to connect to it. Check that your instance has passed its status checks; you can view this information in the Status check column.

[More Details](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/EC2_GetStarted.html)


## Connect to ec2 instance
### Requirements
* Requirements for key pairs
* Supported types: RSA (OpenSSH and SSH2) and ED25519
* Supported lengths: 2048 and 4096
 
### Steps
* [Create Key-pair](./key-pair.md)
* When connecting to an instance that only has private IP addresses, the local computer from which you are initiating the SSH session must have connectivity to the EC2 Instance 
Connect service endpoint (to push your SSH public key to the instance) as well as network connectivity to the instance's private IP address to establish the SSH session. 
The EC2 Instance Connect service endpoint is reachable over the internet or over an AWS Direct Connect public virtual interface. To connect to the instance's private IP address, 
you can leverage services such as AWS Direct Connect, AWS Site-to-Site VPN, or VPC peering.
* To connect to your instance using your own key and any SSH client
  * (Optional) Generate new SSH private and public keys 
  
  You can generate new SSH private and public keys, my_key and my_key.pub, using the following command:   ``$ ssh-keygen -t rsa -f my_key``

  * Push your SSH public key to the instance
    Use the send-ssh-public-key command to push your SSH public key to the instance. If you launched your instance using Amazon Linux 2023 or Amazon Linux 2, the default user name for the AMI is ec2-user. If you launched your instance using Ubuntu, the default user name for the AMI is ubuntu. 
    
    The following example pushes the public key to the specified instance in the specified Availability Zone, to authenticate ec2-user.
  

    $ aws ec2-instance-connect send-ssh-public-key \
    --region us-west-2 \
    --availability-zone us-west-2b \
    --instance-id i-001234a4bf70dec41EXAMPLE \
    --instance-os-user ec2-user \
    --ssh-public-key file://my_key.pub

* Connect to the instance using your private key 

  Use the ssh command to connect to the instance using the private key before the
  public key is removed from the instance metadata (you have 60 seconds before it is removed). 
  Specify the private key that corresponds to the public key, the default user name for the AMI 
  that you used to launch your instance, and the instance's public DNS name (if connecting over a private network, 
  specify the private DNS name or IP address). Add the IdentitiesOnly=yes option to ensure that only the files in
  the ssh config and the specified key are used for the connection.
  
  
    $ ssh -o "IdentitiesOnly=yes" -i my_key ec2-user@ec2-198-51-100-1.compute-1.amazonaws.com



[More Details](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-connect-methods.html)