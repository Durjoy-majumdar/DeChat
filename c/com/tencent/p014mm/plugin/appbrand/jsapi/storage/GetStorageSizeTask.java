package com.tencent.p014mm.plugin.appbrand.jsapi.storage;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.appstorage.C29328h;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;
import com.tencent.p014mm.plugin.appbrand.performance.C83993b;
import p1039tb.C90388a;
import p224ra.C89909e;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask */
public class GetStorageSizeTask extends MainProcessTask {
    public static final Parcelable.Creator<GetStorageSizeTask> CREATOR = new C82996a();

    /* renamed from: f */
    public String f242656f;

    /* renamed from: g */
    public int f242657g;

    /* renamed from: h */
    public Runnable f242658h;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.storage.GetStorageSizeTask$a */
    public class C82996a implements Parcelable.Creator<GetStorageSizeTask> {
        public Object createFromParcel(Parcel parcel) {
            return new GetStorageSizeTask(parcel);
        }

        public Object[] newArray(int i) {
            return new GetStorageSizeTask[i];
        }
    }

    public GetStorageSizeTask() {
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f242656f = parcel.readString();
        this.f242657g = parcel.readInt();
    }

    /* renamed from: i */
    public void mo1552i() {
        Runnable runnable = this.f242658h;
        if (runnable != null) {
            ((C83993b) runnable).run();
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Class cls = C90388a.class;
        C29328h Np0 = C89909e.m112436a(cls) == null ? null : ((C90388a) C89909e.m112436a(cls)).Np0();
        if (Np0 == null) {
            mo114394b();
            return;
        }
        this.f242657g = Np0.mo56589Bk(this.f242656f);
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f242656f);
        parcel.writeInt(this.f242657g);
    }

    public GetStorageSizeTask(Parcel parcel) {
        mo1551g(parcel);
    }
}
