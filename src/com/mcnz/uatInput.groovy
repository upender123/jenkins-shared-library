package com.mcnz

public class uatInput {

  def buildIsUatApproved() {
    def file = new File("E:/Aws-Devops/linux_aws_related_commands.txt")
    
    if (file.exists()){
      return true;
    }
    else {
      println "Approval file does not exist."
    }
    
    return false;
  }

}
