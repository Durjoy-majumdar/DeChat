package p1218v4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p1014o4.C117693m;
import p1169a5.C112757a;

/* renamed from: v4.f */
public class C118660f extends C118653c<Boolean> {

    /* renamed from: i */
    public static final String f355060i = C117693m.m165967e("StorageNotLowTracker");

    public C118660f(Context context, C112757a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public Object mo183374a() {
        Intent registerReceiver = this.f355048b.registerReceiver((BroadcastReceiver) null, mo183375e());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return null;
        }
        return Boolean.TRUE;
    }

    /* renamed from: e */
    public IntentFilter mo183375e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public void mo183376f(Context context, Intent intent) {
        if (intent.getAction() != null) {
            C117693m.m165966c().mo182389a(f355060i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                mo183380b(Boolean.FALSE);
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                mo183380b(Boolean.TRUE);
            }
        }
    }
}
