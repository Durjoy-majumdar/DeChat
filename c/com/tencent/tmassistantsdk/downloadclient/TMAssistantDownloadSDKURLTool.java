package com.tencent.tmassistantsdk.downloadclient;

import com.tencent.tmassistantsdk.network.GetAppSimpleDetailEngine;
import com.tencent.tmassistantsdk.protocol.jce.AppDetailParam;
import com.tencent.tmassistantsdk.protocol.jce.AppSimpleDetail;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class TMAssistantDownloadSDKURLTool implements ITMAssistantExchangeURLListenner {
    public static final String TAG = "TMAssistantDownloadSDKExchangeURL";
    public static TMAssistantDownloadSDKURLTool mInstance;
    public GetAppSimpleDetailEngine engine = null;
    public ITMAssistantExchangeURLListenner mListener = null;

    private TMAssistantDownloadSDKURLTool(ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        if (iTMAssistantExchangeURLListenner != null) {
            this.mListener = iTMAssistantExchangeURLListenner;
            this.engine = new GetAppSimpleDetailEngine(this.mListener);
            return;
        }
        TMLog.m164113e(TAG, "ITMAssistantExchangeURLListenner listener shouldn't be null!");
    }

    public static synchronized TMAssistantDownloadSDKURLTool getInstance(ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner) {
        TMAssistantDownloadSDKURLTool tMAssistantDownloadSDKURLTool;
        synchronized (TMAssistantDownloadSDKURLTool.class) {
            if (mInstance == null) {
                mInstance = new TMAssistantDownloadSDKURLTool(iTMAssistantExchangeURLListenner);
            }
            tMAssistantDownloadSDKURLTool = mInstance;
        }
        return tMAssistantDownloadSDKURLTool;
    }

    public void exchangeUrlsFromPackageNames(ArrayList<String> arrayList) {
        GetAppSimpleDetailEngine getAppSimpleDetailEngine;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String[] split = it.next().split(";");
                if (split != null && split.length > 0) {
                    AppDetailParam appDetailParam = new AppDetailParam();
                    appDetailParam.packageName = split[0];
                    if (split.length > 1) {
                        appDetailParam.channelId = split[1];
                    }
                    arrayList2.add(appDetailParam);
                }
            }
            if (arrayList2.size() > 0 && (getAppSimpleDetailEngine = this.engine) != null) {
                getAppSimpleDetailEngine.sendReuqest(arrayList2);
                return;
            }
            return;
        }
        TMLog.m164116w(TAG, "packageNames is null!");
    }

    public void onExchangedURLSucceed(ArrayList<AppSimpleDetail> arrayList, boolean z) {
        ITMAssistantExchangeURLListenner iTMAssistantExchangeURLListenner = this.mListener;
        if (iTMAssistantExchangeURLListenner != null) {
            iTMAssistantExchangeURLListenner.onExchangedURLSucceed(arrayList, z);
        }
    }
}
