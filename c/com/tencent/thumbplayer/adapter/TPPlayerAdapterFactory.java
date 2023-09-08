package com.tencent.thumbplayer.adapter;

import com.tencent.thumbplayer.config.TPPlayerConfig;
import com.tencent.thumbplayer.log.TPLoggerContext;
import com.tencent.thumbplayer.tplayer.TPContext;

public class TPPlayerAdapterFactory {
    public static ITPPlayerAdapter createTPPlayerAdapter(TPLoggerContext tPLoggerContext, TPContext tPContext) {
        return TPPlayerConfig.getNewReportEnable() ? (ITPPlayerAdapter) new TPPlayerAdapterProxy(new TPPlayerAdapter(tPContext.getAppContext(), tPLoggerContext), tPContext).getProxyInstance() : new TPPlayerAdapter(tPContext.getAppContext(), tPLoggerContext);
    }
}
