def call(String gitUrl, String branch) {

  checkout([
    $class: 'GitSCM',
    branches: [[name: branch]],
    userRemoteConfigs: [[url: gitUrl]]
  ])
  sh 'mkdir reports'
}
