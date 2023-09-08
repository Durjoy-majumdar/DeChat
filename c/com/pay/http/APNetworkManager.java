package com.pay.http;

import android.text.TextUtils;
import com.pay.network.model.APDataReportAns;
import com.pay.network.model.APDataReportReq;
import com.tencent.midas.data.APPluginDataInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class APNetworkManager {
    public static final String HTTP_KEY_DATAREPORT = "datareport";
    public static final String HTTP_KEY_INITREPORT = "initreport";
    private static APNetworkManager gInstance;
    private HashMap<String, APBaseHttpReq> httpReqMap = new HashMap<>();

    public static class APNetworkManagerHolder {
        /* access modifiers changed from: private */
        public static final APNetworkManager INSTANCE = new APNetworkManager();

        private APNetworkManagerHolder() {
        }
    }

    public static void cancelRequest(String str) {
        APBaseHttpReq aPBaseHttpReq = gInstance.httpReqMap.get(str);
        if (aPBaseHttpReq != null) {
            aPBaseHttpReq.stopRequest();
            gInstance.httpReqMap.remove(str);
        }
    }

    public static APNetworkManager getInstance() {
        if (gInstance == null) {
            gInstance = APNetworkManagerHolder.INSTANCE;
        }
        return gInstance;
    }

    public static void release() {
        gInstance = null;
    }

    public void cancelPreRequest() {
        if (gInstance.httpReqMap != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : gInstance.httpReqMap.entrySet()) {
                if (next != null) {
                    arrayList.add((APBaseHttpReq) next.getValue());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                APBaseHttpReq aPBaseHttpReq = (APBaseHttpReq) arrayList.get(i);
                if (aPBaseHttpReq != null) {
                    aPBaseHttpReq.stopRequest();
                }
            }
            gInstance.httpReqMap.clear();
        }
    }

    public void dataReport(String str, IAPHttpAnsObserver iAPHttpAnsObserver) {
        if (!TextUtils.isEmpty(APPluginDataInterface.singleton().getOfferId())) {
            APDataReportReq aPDataReportReq = new APDataReportReq();
            aPDataReportReq.setHttpAns(new APDataReportAns(APHttpHandle.getIntanceHandel(), iAPHttpAnsObserver, this.httpReqMap, HTTP_KEY_DATAREPORT));
            aPDataReportReq.startService(str);
        }
    }
}
