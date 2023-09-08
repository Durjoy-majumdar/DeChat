package com.tencent.midas.data;

import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasGameRequest;
import com.tencent.midas.api.request.APMidasGoodsRequest;
import com.tencent.midas.api.request.APMidasMonthRequest;
import com.tencent.midas.api.request.APMidasSubscribeRequest;
import com.tencent.midas.comm.APLog;
import com.tencent.xweb.FileReaderHelper;

public class APMidasAnalyzeParams {

    public static class SingletonHolder {
        /* access modifiers changed from: private */
        public static APMidasAnalyzeParams instance = new APMidasAnalyzeParams();

        private SingletonHolder() {
        }
    }

    private void AnalyzeCommParams(APMidasBaseRequest aPMidasBaseRequest) {
        try {
            APPluginDataInterface singleton = APPluginDataInterface.singleton();
            singleton.setOfferId(aPMidasBaseRequest.offerId);
            singleton.setOpenId(aPMidasBaseRequest.openId);
            singleton.setOpenKey(aPMidasBaseRequest.openKey);
            singleton.setSessionId(aPMidasBaseRequest.sessionId);
            singleton.setSessionType(aPMidasBaseRequest.sessionType);
            singleton.setPf(aPMidasBaseRequest.f343435pf);
            singleton.setPfKey(aPMidasBaseRequest.pfKey);
            singleton.setZoneId(aPMidasBaseRequest.zoneId);
            singleton.setDiscountUrl(aPMidasBaseRequest.mpInfo.discountUrl);
            singleton.setReserv(aPMidasBaseRequest.reserv);
        } catch (Exception e) {
            APLog.m161214i("AnalyzeCommParams", e.toString());
        }
    }

    public static APMidasAnalyzeParams getInstance() {
        return SingletonHolder.instance;
    }

    public void AnalyzeParams(APMidasBaseRequest aPMidasBaseRequest) {
        if (aPMidasBaseRequest != null) {
            AnalyzeCommParams(aPMidasBaseRequest);
            setSaveType(aPMidasBaseRequest);
        }
    }

    public void setSaveType(APMidasBaseRequest aPMidasBaseRequest) {
        APPluginDataInterface singleton = APPluginDataInterface.singleton();
        try {
            if (aPMidasBaseRequest instanceof APMidasGameRequest) {
                if (aPMidasBaseRequest.acctType.equals(FileReaderHelper.READER_TYPE_QB)) {
                    singleton.setSaveType(3);
                } else {
                    singleton.setSaveType(0);
                }
            } else if (aPMidasBaseRequest instanceof APMidasGoodsRequest) {
                singleton.setSaveType(1);
            } else if (aPMidasBaseRequest instanceof APMidasMonthRequest) {
                singleton.setSaveType(4);
            } else if (aPMidasBaseRequest instanceof APMidasSubscribeRequest) {
                singleton.setSaveType(5);
            }
        } catch (Exception e) {
            APLog.m161214i("setSaveType", e.toString());
        }
    }
}
