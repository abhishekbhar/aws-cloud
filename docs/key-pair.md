# Create a key pair

* Open the [Amazon EC2 console](https://console.aws.amazon.com/ec2/)
* In the navigation pane, choose Key Pairs.
* Choose Create key pair.
* For Name, enter a descriptive name for the key pair. Amazon EC2 associates the public key with the name that you specify as the key name. A key name can include up to 255 ASCII characters. It can’t include leading or trailing spaces.
* For Key pair type, choose either RSA or ED25519. Note that ED25519 keys are not supported for Windows instances.
* For Private key file format, choose the format in which to save the private key. To save the private key in a format that can be used with OpenSSH, choose pem. To save the private key in a format that can be used with PuTTY, choose ppk.
* Choose Create key pair.
* The private key file is automatically downloaded by your browser. The base file name is the name you specified as the name of your key pair, and the file name extension is determined by the file format you chose. Save the private key file in a safe place.
  * Important: This is the only chance for you to save the private key file.
* If you plan to use an SSH client on a macOS or Linux computer to connect to your Linux instance, use the following command to set the permissions of your private key file so that only you can read it.
  * chmod 400 key-pair-name.pem
  * If you do not set these permissions, then you cannot connect to your instance using this key pair.


[More Details](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/get-set-up-for-amazon-ec2.html)