def call() {
  echo "This stage will generate the artifact "
  sh "mvn clean package"
}
