package com.tencent.xweb.updater;

import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.internal.IXWebUpdateListener;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import nu3.C117640b;

public class XWalkRuntimeUpdateListenerImpl implements XWalkRuntimeUpdateListener {
    public static final String TAG = "XWalkRuntimeUpdateListenerImpl";

    public void onXWalkUpdateCancelled() {
        XWebLog.m21911i(TAG, "onXWalkUpdateCancelled");
        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, -2);
        XWalkUpdateLocker.finishUpdatingProcess();
        C117640b.f351893a.mo11331a(new Runnable() {
            public void run() {
                IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
                if (xWebUpdateListener != null) {
                    xWebUpdateListener.onUpdateFailed(1);
                }
            }
        });
    }

    public void onXWalkUpdateCompleted(Scheduler scheduler) {
        XWebLog.m21911i(TAG, "onXWalkUpdateCompleted");
        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, 0);
        XWalkUpdateLocker.finishUpdatingProcess();
        if (scheduler != null) {
            scheduler.saveSchedulerConfig((SchedulerConfig) null);
        }
        C117640b.f351893a.mo11331a(new Runnable() {
            public void run() {
                IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
                if (xWebUpdateListener != null) {
                    xWebUpdateListener.onUpdateCompleted();
                }
            }
        });
        if (!XWebGrayValueUtil.hasUin()) {
            WXWebReporter.idkeyReport(1749, 21, 1);
        }
    }

    public void onXWalkUpdateFailed(int i, Scheduler scheduler) {
        XWebLog.m21911i(TAG, "onXWalkUpdateFailed, errorCode:" + i);
        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_FINISHED, -1);
        XWalkUpdateLocker.finishUpdatingProcess();
        if (scheduler != null) {
            scheduler.onUpdateFailed(i);
        }
        C117640b.f351893a.mo11331a(new Runnable() {
            public void run() {
                IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
                if (xWebUpdateListener != null) {
                    xWebUpdateListener.onUpdateFailed(3);
                }
            }
        });
    }

    public void onXWalkUpdateProgress(final int i) {
        XWebLog.m21908d(TAG, "onXWalkUpdateProgress, progress:" + i);
        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_PROGRESSED, i);
        C117640b.f351893a.mo11331a(new Runnable() {
            public void run() {
                IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
                if (xWebUpdateListener != null) {
                    xWebUpdateListener.onUpdateProgress(i);
                }
            }
        });
    }

    public void onXWalkUpdateStarted(Scheduler scheduler) {
        XWebLog.m21911i(TAG, "onXWalkUpdateStarted");
        XWalkRuntimeUpdater.sendBroadcast(IXWebBroadcastListener.STAGE_START, XWebCoreScheduler.getXWebCoreScheduler().getScheduleType().equalsIgnoreCase(scheduler.getScheduleType()) ^ true ? 1 : 0);
        XWalkUpdateLocker.startUpdatingProgress();
        C117640b.f351893a.mo11331a(new Runnable() {
            public void run() {
                IXWebUpdateListener xWebUpdateListener = XWebSdk.getXWebUpdateListener();
                if (xWebUpdateListener != null) {
                    xWebUpdateListener.onUpdateStart();
                }
            }
        });
        if (!XWebGrayValueUtil.hasUin()) {
            WXWebReporter.idkeyReport(1749, 20, 1);
        }
    }
}
