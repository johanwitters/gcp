# GCP
<!-- If you'd like to use a logo instead uncomment this code and remove the text above this line

  ![Logo](URL to logo img file goes here)

-->

By johan@witters.be


## Usage

### 1. GitHub desktop
Open /users/johanwitters/Desktop/

### 2. Terminal
cd /users/johanwitters/Desktop/

#### Git commands...
git add .
git commit 
git push
git pull
git clone https://github.com/johanwitters/gcp.git
...
e.g.
git add .
git commit "command line tool"
git push

### 3. Browse to
https://github.com/johanwitters/gcp/tree/master

### 4. Browse to
https://console.cloud.google.com/home/dashboard?project=johan-w-test1
Open terminal
cd /home/johan/github
see git commands
e.g. 
git pull

### 5. Set project
gcloud config set project johan-w-test1
mvn appengine:deploy
gcloud app browse

### 6. Etc
Create bucket:
  gsutil mb gs://[YOUR-BUCKET-NAME]
  gsutil defacl set public-read gs://[YOUR-BUCKET-NAME]

e.g.
  gsutil mb gs://johan-w-test1
  gsutil defacl set public-read gs://johan-w-test1 

Set JDK8
  update-alternatives --set java /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
  
  (before it was pointing to /etc/alternatives/java)

### Usefull links

https://cloud.google.com/java/tutorials/bookshelf-on-compute-engine