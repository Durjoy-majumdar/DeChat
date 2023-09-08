package com.tencent.thumbplayer.datatransport;

import android.os.Looper;
import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.tplayer.TPContext;

public class TPDataTransportManagerFactory {
    public static ITPPlayManager createDataTransportManager(Looper looper, TPContext tPContext) {
        return TPPlayerConfig.getNewReportEnable() ? (ITPPlayManager) new TPDataTransportManagerProxy(new TPPlayManagerImpl(tPContext.getAppContext(), looper), tPContext).getProxyInstance() : new TPPlayManagerImpl(tPContext.getAppContext(), looper);
    }
}
