package com.tencent.tmassistantsdk.logreport;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.TMOpenSDKAuthorizedInfo;
import com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.storage.table.TipsInfoLogTable;
import com.tencent.tmassistantsdk.util.TMLog;

public class TipsInfoReportManager extends BaseReportManager {
    public static final String TAG = "TipsInfoReportManager";
    public static TipsInfoReportManager mInstance;

    private TipsInfoReportManager() {
    }

    public static synchronized TipsInfoReportManager getInstance() {
        TipsInfoReportManager tipsInfoReportManager;
        synchronized (TipsInfoReportManager.class) {
            if (mInstance == null) {
                mInstance = new TipsInfoReportManager();
            }
            tipsInfoReportManager = mInstance;
        }
        return tipsInfoReportManager;
    }

    public TipsInfoLog createTipsInfoLog(TMOpenSDKAuthorizedInfo tMOpenSDKAuthorizedInfo) {
        TMLog.m164114i(TAG, "createTipsInfoLog");
        if (tMOpenSDKAuthorizedInfo == null) {
            return null;
        }
        TipsInfoLog tipsInfoLog = new TipsInfoLog();
        tipsInfoLog.userId = tMOpenSDKAuthorizedInfo.userId;
        tipsInfoLog.userIdType = tMOpenSDKAuthorizedInfo.userIdType;
        tipsInfoLog.gamePackageName = tMOpenSDKAuthorizedInfo.gamePackageName;
        tipsInfoLog.gameVersionCode = Util.getInt(tMOpenSDKAuthorizedInfo.gameVersionCode, 0);
        tipsInfoLog.gameChannelId = tMOpenSDKAuthorizedInfo.gameChannelId;
        return tipsInfoLog;
    }

    public BaseLogTable getLogTable() {
        return TipsInfoLogTable.getInstance();
    }

    public byte getReportType() {
        return 1;
    }
}
