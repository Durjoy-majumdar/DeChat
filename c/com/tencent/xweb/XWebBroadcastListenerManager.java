package com.tencent.xweb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.xweb.util.LocalBroadcastManager;
import com.tencent.xweb.util.XWebLog;
import java.util.ArrayList;
import java.util.List;

public class XWebBroadcastListenerManager {
    private static final String TAG = "XWebBroadcastListenerManager";
    private static boolean sInited;
    private static final List<IXWebBroadcastListener> sListeners = new ArrayList();

    public static class UpdateReceiver extends BroadcastReceiver {
        private static final String TAG_RECEIVER = "UpdateReceiver";

        private UpdateReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (IXWebBroadcastListener.UPDATE_ACTION.equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(IXWebBroadcastListener.STAGE_TAG);
                if (IXWebBroadcastListener.STAGE_START.equals(stringExtra)) {
                    int intExtra = intent.getIntExtra(IXWebBroadcastListener.DATA_TAG, 0);
                    XWebLog.m21911i(TAG_RECEIVER, "update start, schedulerType:" + intExtra);
                    XWebBroadcastListenerManager.notifyStart(intExtra);
                } else if (IXWebBroadcastListener.STAGE_PROGRESSED.equals(stringExtra)) {
                    XWebBroadcastListenerManager.notifyProgressed(intent.getIntExtra(IXWebBroadcastListener.DATA_TAG, 0));
                } else if (IXWebBroadcastListener.STAGE_FINISHED.equals(stringExtra)) {
                    int intExtra2 = intent.getIntExtra(IXWebBroadcastListener.DATA_TAG, 0);
                    XWebLog.m21911i(TAG_RECEIVER, "update finish, code:" + intExtra2);
                    XWebBroadcastListenerManager.notifyFinished(intExtra2);
                } else if (IXWebBroadcastListener.STAGE_MAINCFG_UPDATE.equals(stringExtra)) {
                    XWebLog.m21911i(TAG_RECEIVER, "update main config");
                    XWebBroadcastListenerManager.notifyMainCfgUpdated();
                } else if (IXWebBroadcastListener.STAGE_PLUGINCFG_UPDATE.equals(stringExtra)) {
                    XWebLog.m21911i(TAG_RECEIVER, "update plugin config");
                    XWebBroadcastListenerManager.notifyPluginCfgUpdated();
                }
            }
        }
    }

    public static synchronized void init(Context context) {
        synchronized (XWebBroadcastListenerManager.class) {
            if (!sInited) {
                try {
                    LocalBroadcastManager.getInstance(context).registerReceiver(new UpdateReceiver(), new IntentFilter(IXWebBroadcastListener.UPDATE_ACTION));
                    sInited = true;
                } catch (Throwable th) {
                    XWebLog.m21910e(TAG, "init, registerReceiver error", th);
                }
            } else {
                return;
            }
        }
        return;
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyFinished(int i) {
        synchronized (XWebBroadcastListenerManager.class) {
            for (IXWebBroadcastListener onUpdateFinished : sListeners) {
                onUpdateFinished.onUpdateFinished(i);
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyMainCfgUpdated() {
        synchronized (XWebBroadcastListenerManager.class) {
            for (IXWebBroadcastListener onMainCfgUpdated : sListeners) {
                onMainCfgUpdated.onMainCfgUpdated();
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyPluginCfgUpdated() {
        synchronized (XWebBroadcastListenerManager.class) {
            for (IXWebBroadcastListener onPluginCfgUpdated : sListeners) {
                onPluginCfgUpdated.onPluginCfgUpdated();
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyProgressed(int i) {
        synchronized (XWebBroadcastListenerManager.class) {
            for (IXWebBroadcastListener onUpdateProgressed : sListeners) {
                onUpdateProgressed.onUpdateProgressed(i);
            }
        }
    }

    /* access modifiers changed from: private */
    public static synchronized void notifyStart(int i) {
        synchronized (XWebBroadcastListenerManager.class) {
            for (IXWebBroadcastListener onUpdateStart : sListeners) {
                onUpdateStart.onUpdateStart(i);
            }
        }
    }

    public static synchronized void registerListener(Context context, IXWebBroadcastListener iXWebBroadcastListener) {
        synchronized (XWebBroadcastListenerManager.class) {
            init(context);
            if (iXWebBroadcastListener != null) {
                List<IXWebBroadcastListener> list = sListeners;
                if (!list.contains(iXWebBroadcastListener)) {
                    list.add(iXWebBroadcastListener);
                }
            }
        }
    }

    public static synchronized void unregisterListener(IXWebBroadcastListener iXWebBroadcastListener) {
        synchronized (XWebBroadcastListenerManager.class) {
            if (iXWebBroadcastListener != null) {
                List<IXWebBroadcastListener> list = sListeners;
                if (list.contains(iXWebBroadcastListener)) {
                    list.remove(iXWebBroadcastListener);
                }
            }
        }
    }
}
