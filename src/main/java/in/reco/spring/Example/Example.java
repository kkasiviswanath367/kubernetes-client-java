package in.reco.spring.Example;

import io.kubernetes.client.ApiClient;
import io.kubernetes.client.ApiException;
import io.kubernetes.client.Configuration;
import io.kubernetes.client.apis.CoreV1Api;
import io.kubernetes.client.models.V1Pod;
import io.kubernetes.client.models.V1PodList;
import io.kubernetes.client.util.Config;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException, ApiException{
        ApiClient client = Config.fromConfig("D:\\kkasiviswa\\kubernetes-client\\json-log-master\\src\\main\\java\\in\\reco\\spring\\Example\\config");
        client.setVerifyingSsl(false);
        Configuration.setDefaultApiClient(client);

        CoreV1Api api = new CoreV1Api();
        V1PodList list = api.listPodForAllNamespaces(null, null, null, null, null, null, null, null, null);
        for (V1Pod item : list.getItems()) {
            System.out.println(item.getMetadata().getName());
        }
    }
}


/*

<version>5.0.0</version>

output

coredns-66bff467f8-pmtvc
coredns-66bff467f8-slb92
etcd-minikube
kube-apiserver-minikube
kube-controller-manager-minikube
kube-proxy-m4wp5
kube-scheduler-minikube
storage-provisioner

*/