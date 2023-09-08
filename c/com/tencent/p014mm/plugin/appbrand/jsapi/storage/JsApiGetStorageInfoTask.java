package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import java.util.ArrayList;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask */
public class JsApiGetStorageInfoTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiGetStorageInfoTask> CREATOR = new C82998a();

    /* renamed from: f */
    public String f242661f;

    /* renamed from: g */
    public int f242662g;

    /* renamed from: h */
    public ArrayList<String> f242663h;

    /* renamed from: i */
    public int f242664i;

    /* renamed from: j */
    public int f242665j;

    /* renamed from: n */
    public Runnable f242666n;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask$a */
    public class C82998a implements Parcelable.Creator<JsApiGetStorageInfoTask> {
        public Object createFromParcel(Parcel parcel) {
            JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new JsApiGetStorageInfoTask();
            jsApiGetStorageInfoTask.mo1551g(parcel);
            return jsApiGetStorageInfoTask;
        }

        public Object[] newArray(int i) {
            return new JsApiGetStorageInfoTask[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242661f = parcel.readString();
        this.f242662g = parcel.readInt();
        this.f242663h = parcel.createStringArrayList();
        this.f242664i = parcel.readInt();
        this.f242665j = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f242666n;
        if (runnable != null) {
            ((C83023p) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Object[] Bh;
        Class cls = C90388a.class;
        C29328h Np0 = C89909e.m112436a(cls) == null ? null : ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 == null) {
            mo114394b();
            return;
        }
        synchronized (C29328h.class) {
            Bh = Np0.mo56588Bh(this.f242662g, this.f242661f);
        }
        this.f242663h = (ArrayList) Bh[0];
        this.f242664i = (int) Math.ceil(((Integer) Bh[1]).doubleValue() / 1000.0d);
        this.f242665j = (int) Math.ceil(((Integer) Bh[2]).doubleValue() / 1000.0d);
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242661f);
        parcel.writeInt(this.f242662g);
        parcel.writeStringList(this.f242663h);
        parcel.writeInt(this.f242664i);
        parcel.writeInt(this.f242665j);
    }
}
