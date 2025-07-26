def call(String url, String branch){
   echo "This is Cloning the CODE "
   git url: "${url}, branch: "${branch}"
   echo "Code Clone Successful"
}
