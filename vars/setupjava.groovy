def call(cmd) {
echo " installing dependancy "
  sh "sudo apt update"
//  sh "sudo apt install -y openjdk-17-jdk"
  echo " ${cmd} "
  sh "sudo apt install -y ${cmd}"
}
