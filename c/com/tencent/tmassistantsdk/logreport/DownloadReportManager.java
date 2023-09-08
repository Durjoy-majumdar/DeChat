package com.tencent.tmassistantsdk.logreport;

import android.net.Proxy;
import android.text.TextUtils;
import com.tencent.tmassistantsdk.protocol.jce.DownloadChunkLogInfo;
import com.tencent.tmassistantsdk.storage.table.BaseLogTable;
import com.tencent.tmassistantsdk.storage.table.DownloadLogTable;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;

public class DownloadReportManager extends BaseReportManager {
    public static final String TAG = "DownloadReportManager";
    public static DownloadReportManager mInstance;

    public static synchronized DownloadReportManager getInstance() {
        DownloadReportManager downloadReportManager;
        synchronized (DownloadReportManager.class) {
            if (mInstance == null) {
                mInstance = new DownloadReportManager();
            }
            downloadReportManager = mInstance;
        }
        return downloadReportManager;
    }

    public DownloadChunkLogInfo createNewChunkLogInfo(byte b) {
        TMLog.m164114i(TAG, "createNewChunkLogInfo");
        DownloadChunkLogInfo downloadChunkLogInfo = new DownloadChunkLogInfo();
        downloadChunkLogInfo.type = b;
        downloadChunkLogInfo.networkOperator = GlobalUtil.getInstance().getNetworkOperator();
        downloadChunkLogInfo.networkType = GlobalUtil.getInstance().getNetworkType();
        downloadChunkLogInfo.isWap = TextUtils.isEmpty(Proxy.getDefaultHost()) ^ true ? (byte) 1 : 0;
        downloadChunkLogInfo.startTime = System.currentTimeMillis();
        return downloadChunkLogInfo;
    }

    public BaseLogTable getLogTable() {
        return DownloadLogTable.getInstance();
    }

    public byte getReportType() {
        return 0;
    }
}
