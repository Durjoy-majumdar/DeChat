package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82926s;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.HashMap;
import js0.C88021l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent */
public class MMToClientEvent extends MainProcessTask {
    public static final Parcelable.Creator<MMToClientEvent> CREATOR = new C81944a();

    /* renamed from: q */
    public static final HashMap<String, MMToClientEvent> f240339q = new HashMap<>();

    /* renamed from: r */
    public static final C88021l<String, C81947d> f240340r = new C88021l<>();

    /* renamed from: f */
    public int f240341f;

    /* renamed from: g */
    public String f240342g;

    /* renamed from: h */
    public int f240343h;

    /* renamed from: i */
    public String f240344i;

    /* renamed from: j */
    public C82381f f240345j;

    /* renamed from: n */
    public int f240346n;

    /* renamed from: o */
    public String f240347o;

    /* renamed from: p */
    public Object f240348p;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent$a */
    public class C81944a implements Parcelable.Creator<MMToClientEvent> {
        public Object createFromParcel(Parcel parcel) {
            return new MMToClientEvent(parcel, (C81962i) null);
        }

        public Object[] newArray(int i) {
            return new MMToClientEvent[i];
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent$b */
    public static class C81945b extends C82926s {
        private static final int CTRL_INDEX = 109;
        private static final String NAME = "onAppConfig";
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent$c */
    public static class C81946c extends C82926s {
        private static final int CTRL_INDEX = 152;
        private static final String NAME = "onContactMessageCountChange";
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent$d */
    public interface C81947d {
        /* renamed from: a */
        void mo22085a(Object obj);
    }

    public MMToClientEvent() {
    }

    /* renamed from: q */
    public static void m100655q(String str, C81947d dVar) {
        if (dVar != null) {
            f240340r.mo122464e(str, dVar);
        }
    }

    /* renamed from: t */
    public static void m100656t(C82381f fVar) {
        if (fVar != null) {
            MMToClientEvent mMToClientEvent = new MMToClientEvent();
            f240339q.put(fVar.getAppId(), mMToClientEvent);
            mMToClientEvent.f240341f = 1;
            mMToClientEvent.f240342g = fVar.getAppId();
            mMToClientEvent.f240345j = fVar;
            mMToClientEvent.mo114395c();
        }
    }

    /* renamed from: u */
    public static void m100657u(String str, C81947d dVar) {
        if (dVar != null) {
            f240340r.mo122465f(str, dVar);
        }
    }

    /* renamed from: v */
    public static void m100658v(String str) {
        MMToClientEvent remove;
        if (!TextUtils.isEmpty(str) && (remove = f240339q.remove(str)) != null) {
            f240340r.mo122466g(str);
            remove.f240341f = 2;
            remove.f240342g = str;
            remove.f240345j = null;
            if (MMApplicationContext.isMMProcessExist()) {
                try {
                    remove.mo114396f();
                } catch (SecurityException e) {
                    Log.m105921e("MicroMsg.MMToClientEvent", "unregisterToMM(%s) get exception:%s", str, e);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1551g(android.os.Parcel r5) {
        /*
            r4 = this;
            int r0 = r5.readInt()
            r4.f240341f = r0
            java.lang.String r0 = r5.readString()
            r4.f240342g = r0
            int r0 = r5.readInt()
            r4.f240343h = r0
            java.lang.String r0 = r5.readString()
            r4.f240344i = r0
            int r0 = r5.readInt()
            r4.f240346n = r0
            r0 = 0
            java.lang.String r1 = r5.readString()     // Catch:{ ClassNotFoundException -> 0x0032 }
            r4.f240347o = r1     // Catch:{ ClassNotFoundException -> 0x0032 }
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)     // Catch:{ ClassNotFoundException -> 0x0032 }
            if (r1 != 0) goto L_0x0041
            java.lang.String r1 = r4.f240347o     // Catch:{ ClassNotFoundException -> 0x0032 }
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0032 }
            goto L_0x0042
        L_0x0032:
            r1 = move-exception
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            java.lang.String r1 = "MicroMsg.MMToClientEvent"
            java.lang.String r3 = "unparcel custom data e %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r3, r2)
        L_0x0041:
            r1 = r0
        L_0x0042:
            if (r1 != 0) goto L_0x0048
            r5.readParcelable(r0)
            goto L_0x0052
        L_0x0048:
            java.lang.ClassLoader r0 = r1.getClassLoader()
            android.os.Parcelable r5 = r5.readParcelable(r0)
            r4.f240348p = r5
        L_0x0052:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.ipc.MMToClientEvent.mo1551g(android.os.Parcel):void");
    }

    /* renamed from: i */
    public void mo1552i() {
        String str;
        Object obj;
        int i = this.f240341f;
        if (i != 3) {
            if (i == 4) {
                C81946c cVar = new C81946c();
                HashMap hashMap = new HashMap();
                hashMap.put("count", Integer.valueOf(this.f240346n));
                hashMap.put("data", this.f240344i);
                cVar.mo115194p(this.f240345j);
                cVar.mo115165o(hashMap);
                cVar.mo115158h();
            } else if (i == 5 && (str = this.f240342g) != null && (obj = this.f240348p) != null) {
                ((C119157j) C119157j.f356862d).mo183876g(new C81962i(this, str, obj), "MicroMsg.MMToClientEvent");
            }
        } else if (this.f240345j != null) {
            C81945b bVar = new C81945b();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("type", Integer.valueOf(this.f240343h));
            hashMap2.put("data", this.f240344i);
            bVar.mo115194p(this.f240345j);
            bVar.mo115165o(hashMap2);
            bVar.mo115158h();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        int i = this.f240341f;
        if (i == 1) {
            HashMap<String, MMToClientEvent> hashMap = C81964j.f240365a;
            Log.m105925i("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId:%s, MMToClientEvent.hash:%d", this.f240342g, Integer.valueOf(hashCode()));
            if (this.f240342g == null) {
                Log.m105920e("MicroMsg.MMToClientEventCenter", "register MMToClientEvent.appId is null!!!");
                return;
            }
            HashMap<String, MMToClientEvent> hashMap2 = C81964j.f240365a;
            synchronized (hashMap2) {
                if (hashMap2.get(this.f240342g) == null) {
                    hashMap2.put(this.f240342g, this);
                } else {
                    Log.m105918d("MicroMsg.MMToClientEventCenter", "The CommonConfig is already exist!~ so replace it");
                    hashMap2.remove(this.f240342g);
                    hashMap2.put(this.f240342g, this);
                }
            }
        } else if (i == 2) {
            HashMap<String, MMToClientEvent> hashMap3 = C81964j.f240365a;
            Log.m105925i("MicroMsg.MMToClientEventCenter", "unregister MMToClientEvent.appId:%s", this.f240342g);
            HashMap<String, MMToClientEvent> hashMap4 = C81964j.f240365a;
            synchronized (hashMap4) {
                hashMap4.remove(this.f240342g);
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f240341f);
        parcel.writeString(this.f240342g);
        parcel.writeInt(this.f240343h);
        parcel.writeString(this.f240344i);
        parcel.writeInt(this.f240346n);
        parcel.writeString(this.f240347o);
        parcel.writeParcelable((Parcelable) this.f240348p, i);
    }

    public MMToClientEvent(Parcel parcel, C81962i iVar) {
        mo1551g(parcel);
    }
}
