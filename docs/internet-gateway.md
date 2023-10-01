# Create Internet Gateway

* Open the [Amazon VPC console](https://console.aws.amazon.com/vpc/)
* In the navigation pane, choose Internet gateways, and then choose Create internet gateway.
* Optionally name your internet gateway.
* Optionally add or remove a tag.
  * [Add a tag] Choose Add tag and do the following:
    * For Key, enter the key name.
    * For Value, enter the key value.
  * [Remove a tag] Choose Remove to the right of the tag’s Key and Value.
* Choose Create internet gateway.
* Select the internet gateway that you just created, and then choose Actions, Attach to VPC.
* Select your VPC from the list, and then choose Attach internet gateway.

[More Details](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Internet_Gateway.html)