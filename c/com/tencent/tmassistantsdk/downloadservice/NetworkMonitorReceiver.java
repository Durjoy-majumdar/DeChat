package com.tencent.tmassistantsdk.downloadservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tmassistantsdk.util.GlobalUtil;
import com.tencent.tmassistantsdk.util.TMLog;
import java.util.ArrayList;
import java.util.Iterator;

public class NetworkMonitorReceiver extends BroadcastReceiver {
    public static final int MSG_DELAY_TIME = 3500;
    public static final int MSG_resumeDownloadTime = 67;
    public static final String TAG = "NetworkMonitorReceiver";
    public static NetworkMonitorReceiver mInstance;
    public boolean isRegisterReceiver = false;
    public final MMHandler mNetworkChangedHandler = new MMHandler() {
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 67) {
                NetworkMonitorReceiver.this.notifyNetworkChanged();
            }
        }
    };
    public ArrayList<INetworkChangedObserver> mObs = new ArrayList<>();

    public interface INetworkChangedObserver {
        void onNetworkChanged();
    }

    public static synchronized NetworkMonitorReceiver getInstance() {
        NetworkMonitorReceiver networkMonitorReceiver;
        synchronized (NetworkMonitorReceiver.class) {
            if (mInstance == null) {
                mInstance = new NetworkMonitorReceiver();
            }
            networkMonitorReceiver = mInstance;
        }
        return networkMonitorReceiver;
    }

    public void addNetworkChangedObserver(INetworkChangedObserver iNetworkChangedObserver) {
        if (!this.mObs.contains(iNetworkChangedObserver) && iNetworkChangedObserver != null) {
            this.mObs.add(iNetworkChangedObserver);
        }
    }

    public void notifyNetworkChanged() {
        Iterator<INetworkChangedObserver> it = this.mObs.iterator();
        while (it.hasNext()) {
            it.next().onNetworkChanged();
        }
    }

    public void onReceive(Context context, Intent intent) {
        TMLog.m164114i(TAG, "network changed!");
        this.mNetworkChangedHandler.removeMessages(67);
        Message obtain = Message.obtain();
        obtain.what = 67;
        this.mNetworkChangedHandler.sendMessageDelayed(obtain, 3500);
    }

    public void registerReceiver() {
        Context context = GlobalUtil.getInstance().getContext();
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            try {
                context.registerReceiver(this, intentFilter);
                this.isRegisterReceiver = true;
            } catch (Throwable th) {
                this.isRegisterReceiver = false;
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }

    public void removeNetworkChangedObserver(INetworkChangedObserver iNetworkChangedObserver) {
        if (iNetworkChangedObserver != null) {
            this.mObs.remove(iNetworkChangedObserver);
        }
    }

    public void unregisterReceiver() {
        Context context;
        if (mInstance != null && (context = GlobalUtil.getInstance().getContext()) != null) {
            try {
                if (this.isRegisterReceiver) {
                    context.unregisterReceiver(this);
                    this.isRegisterReceiver = false;
                }
            } catch (Throwable th) {
                Log.printErrStackTrace(TAG, th, "", new Object[0]);
            }
        }
    }
}
