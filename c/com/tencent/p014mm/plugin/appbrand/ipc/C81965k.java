package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.ipc.MainProcessTask;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.k */
public class C81965k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Parcelable f240366d;

    /* renamed from: e */
    public final /* synthetic */ MainProcessTask.C81949b.C81950a f240367e;

    public C81965k(MainProcessTask.C81949b.C81950a aVar, Parcelable parcelable) {
        this.f240367e = aVar;
        this.f240366d = parcelable;
    }

    public void run() {
        Parcelable parcelable = this.f240366d;
        MainProcessTask mainProcessTask = MainProcessTask.this;
        if (parcelable != null) {
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mainProcessTask.mo1551g(obtain);
            obtain.recycle();
        }
        MainProcessTask.this.mo1552i();
    }
}
