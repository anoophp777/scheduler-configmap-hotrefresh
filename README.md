# scheduler-configmap-hotrefresh

Example to demonstrate hotrefresh of beans fails with "mode: event" but passes with "mode: polling"

# Pre-requisite
Docker with Kubernetes installed

# How to run?

cd configmap
./build-deploy-to-kubernetes.sh 

The above script will create namespace, deployment, configmap etc.

# How to replace/modify the configmap on k8?
Go to kube-configmap.yml and modify one of the properties and run

kubectl replace -f kube-configmap.yml 

# How to fix the configmap hotrefresh?

Go to bootstrap.yml and modify 

mode: event 

to 

mode: polling
 