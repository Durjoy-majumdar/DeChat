package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask */
public class JsApiRemoveStorageTask extends MainProcessTask {
    public static final Parcelable.Creator<JsApiRemoveStorageTask> CREATOR = new C83000a();

    /* renamed from: f */
    public String f242678f;

    /* renamed from: g */
    public int f242679g;

    /* renamed from: h */
    public String f242680h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask$a */
    public class C83000a implements Parcelable.Creator<JsApiRemoveStorageTask> {
        public Object createFromParcel(Parcel parcel) {
            JsApiRemoveStorageTask jsApiRemoveStorageTask = new JsApiRemoveStorageTask();
            jsApiRemoveStorageTask.mo1551g(parcel);
            return jsApiRemoveStorageTask;
        }

        public Object[] newArray(int i) {
            return new JsApiRemoveStorageTask[i];
        }
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242678f = parcel.readString();
        this.f242679g = parcel.readInt();
        this.f242680h = parcel.readString();
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C90388a.class;
        C29328h Np0 = C89909e.m112436a(cls) == null ? null : ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 != null) {
            Np0.mo56593cg(this.f242679g, this.f242678f, this.f242680h);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242678f);
        parcel.writeInt(this.f242679g);
        parcel.writeString(this.f242680h);
    }
}
