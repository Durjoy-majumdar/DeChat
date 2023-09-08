package com.tencent.p014mm.plugin.wepkg.model;

import android.os.Parcel;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;

/* renamed from: com.tencent.mm.plugin.wepkg.model.BaseWepkgProcessTask */
public abstract class BaseWepkgProcessTask extends MainProcessTask {

    /* renamed from: f */
    public boolean f120608f = false;

    /* renamed from: g */
    public boolean f120609g = false;

    /* renamed from: g */
    public final void mo1551g(Parcel parcel) {
        boolean z = true;
        this.f120608f = parcel.readByte() != 0;
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.f120609g = z;
        mo69252q(parcel);
    }

    /* renamed from: q */
    public abstract void mo69252q(Parcel parcel);

    /* renamed from: t */
    public abstract void mo69253t(Parcel parcel, int i);

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f120608f ? (byte) 1 : 0);
        parcel.writeByte(this.f120609g ? (byte) 1 : 0);
        mo69253t(parcel, i);
    }
}
