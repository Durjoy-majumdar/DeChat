package com.tencent.tmassistantsdk.logreport;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tmassistantsdk.downloadservice.DownloadHelper;
import com.tencent.tmassistantsdk.downloadservice.NetworkMonitorReceiver;
import com.tencent.tmassistantsdk.util.TMLog;

public class LogReportManager {
    /* access modifiers changed from: private */
    public static final Class<?>[] REPORT_MANAGERS = {DownloadReportManager.class, TipsInfoReportManager.class, UpdateInfoReportManager.class};
    private static final String TAG = "LogReportManager";
    private static LogReportManager mInstance;
    private final NetworkMonitorReceiver.INetworkChangedObserver mNetworkChangedObserver;

    private LogReportManager() {
        C1164251 r0 = new NetworkMonitorReceiver.INetworkChangedObserver() {
            public void onNetworkChanged() {
                TMLog.m164114i(LogReportManager.TAG, "onNetworkChanged,netState:" + DownloadHelper.getNetStatus());
                for (Class cls : LogReportManager.REPORT_MANAGERS) {
                    try {
                        if (cls.equals(DownloadReportManager.class)) {
                            DownloadReportManager.getInstance().resetMaxReportCount();
                        } else if (cls.equals(TipsInfoReportManager.class)) {
                            TipsInfoReportManager.getInstance().resetMaxReportCount();
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace(LogReportManager.TAG, e, "", new Object[0]);
                    }
                }
                if (DownloadHelper.isNetworkConncted()) {
                    DownloadHelper.getNetStatus().equalsIgnoreCase("wifi");
                }
            }
        };
        this.mNetworkChangedObserver = r0;
        NetworkMonitorReceiver.getInstance().addNetworkChangedObserver(r0);
    }

    public static synchronized LogReportManager getInstance() {
        LogReportManager logReportManager;
        synchronized (LogReportManager.class) {
            if (mInstance == null) {
                mInstance = new LogReportManager();
            }
            logReportManager = mInstance;
        }
        return logReportManager;
    }

    public void cancleReport() {
        for (Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(DownloadReportManager.class)) {
                    DownloadReportManager.getInstance().cancleRequest();
                } else if (cls.equals(TipsInfoReportManager.class)) {
                    TipsInfoReportManager.getInstance().cancleRequest();
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }

    public void destory() {
        for (Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(DownloadReportManager.class)) {
                    DownloadReportManager.getInstance().destroy();
                } else if (cls.equals(TipsInfoReportManager.class)) {
                    TipsInfoReportManager.getInstance().destroy();
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        NetworkMonitorReceiver.getInstance().removeNetworkChangedObserver(this.mNetworkChangedObserver);
    }

    public void reportLog() {
        for (Class<?> cls : REPORT_MANAGERS) {
            try {
                if (cls.equals(DownloadReportManager.class)) {
                    DownloadReportManager.getInstance().reportLogData();
                } else if (cls.equals(TipsInfoReportManager.class)) {
                    TipsInfoReportManager.getInstance().reportLogData();
                } else if (cls.equals(UpdateInfoReportManager.class)) {
                    UpdateInfoReportManager.getInstance().reportLogData();
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
    }
}
