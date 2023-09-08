package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask */
public class JsApiClearStorageTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiClearStorageTask> CREATOR = new C82997a();

    /* renamed from: f */
    public String f242659f;

    /* renamed from: g */
    public int f242660g;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask$a */
    public class C82997a implements Parcelable.Creator<JsApiClearStorageTask> {
        public Object createFromParcel(Parcel parcel) {
            return new JsApiClearStorageTask(parcel);
        }

        public Object[] newArray(int i) {
            return new JsApiClearStorageTask[i];
        }
    }

    public JsApiClearStorageTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242659f = parcel.readString();
        this.f242660g = parcel.readInt();
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C90388a.class;
        C29328h Np0 = C89909e.m112436a(cls) == null ? null : ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 != null) {
            Np0.mo56590S(this.f242660g, this.f242659f);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242659f);
        parcel.writeInt(this.f242660g);
    }

    public JsApiClearStorageTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
