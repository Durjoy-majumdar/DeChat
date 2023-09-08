package dev.fluttercommunity.plus.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import p172io.flutter.plugin.common.EventChannel;

public class ConnectivityBroadcastReceiver extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* renamed from: f */
    public static final /* synthetic */ int f349682f = 0;

    /* renamed from: d */
    public EventChannel.EventSink f349683d;

    /* renamed from: e */
    public ConnectivityManager.NetworkCallback f349684e;

    /* renamed from: dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver$a */
    public class C116614a extends ConnectivityManager.NetworkCallback {
        public C116614a() {
        }

        public void onAvailable(Network network) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            int i = ConnectivityBroadcastReceiver.f349682f;
            connectivityBroadcastReceiver.getClass();
            throw null;
        }

        public void onLost(Network network) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            int i = ConnectivityBroadcastReceiver.f349682f;
            connectivityBroadcastReceiver.getClass();
            throw null;
        }
    }

    public void onCancel(Object obj) {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                throw null;
            } catch (Exception unused) {
            }
        } else if (this.f349684e != null) {
            throw null;
        }
    }

    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f349683d = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f349684e = new C116614a();
            throw null;
        } else {
            new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            throw null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f349683d != null) {
            throw null;
        }
    }
}
