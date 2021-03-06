#!/usr/bin/env bash
kubectl delete -f deployment-with-configmaps.yml
mvn clean package -DskipTests
docker rmi anoophallimala/configmaps:v1
docker build -t anoophallimala/configmaps:v1 .
kubectl delete -f kube-configmap.yml
kubectl create -f create-some-ns.json
kubectl create -f kube-configmap.yml
kubectl create -f deployment-with-configmaps.yml
kubectl get pods
