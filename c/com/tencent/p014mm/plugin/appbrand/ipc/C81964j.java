package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.j */
public class C81964j {

    /* renamed from: a */
    public static final HashMap<String, MMToClientEvent> f240365a = new HashMap<>();

    /* renamed from: a */
    public static void m100678a(String str, int i) {
        MMToClientEvent mMToClientEvent;
        Log.m105925i("MicroMsg.MMToClientEventCenter", "notify unread:%d", Integer.valueOf(i));
        HashMap<String, MMToClientEvent> hashMap = f240365a;
        synchronized (hashMap) {
            mMToClientEvent = hashMap.get(str);
        }
        if (mMToClientEvent != null) {
            synchronized (mMToClientEvent) {
                mMToClientEvent.f240341f = 4;
                mMToClientEvent.f240346n = i;
                mMToClientEvent.mo114394b();
            }
            return;
        }
        Log.m105920e("MicroMsg.MMToClientEventCenter", "notify fail!!! The MMToClientEvent isn't exist!!!");
    }

    /* renamed from: b */
    public static <T extends Parcelable> void m100679b(String str, T t) {
        MMToClientEvent mMToClientEvent;
        HashMap<String, MMToClientEvent> hashMap = f240365a;
        synchronized (hashMap) {
            mMToClientEvent = hashMap.get(str);
        }
        if (mMToClientEvent == null) {
            Log.m105921e("MicroMsg.MMToClientEventCenter", "notify failed, appId[%s] data[%s]", str, t);
        } else if (mMToClientEvent != null && t != null) {
            if (t == null) {
                mMToClientEvent.getClass();
                return;
            }
            synchronized (mMToClientEvent) {
                mMToClientEvent.f240341f = 5;
                mMToClientEvent.f240347o = t.getClass().getName();
                mMToClientEvent.f240348p = t;
                mMToClientEvent.mo114394b();
            }
        }
    }
}
