package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.SampleTask1 */
public class SampleTask1 extends MainProcessTask {
    public static final Parcelable.Creator<SampleTask1> CREATOR = new C29494a();

    /* renamed from: f */
    public String f80357f;

    /* renamed from: g */
    public String f80358g;

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.SampleTask1$a */
    public class C29494a implements Parcelable.Creator<SampleTask1> {
        public Object createFromParcel(Parcel parcel) {
            return new SampleTask1(parcel);
        }

        public Object[] newArray(int i) {
            return new SampleTask1[i];
        }
    }

    public SampleTask1(Parcel parcel) {
        mo1551g(parcel);
    }

    /* renamed from: g */
    public void mo1551g(Parcel parcel) {
        this.f80357f = parcel.readString();
        this.f80358g = parcel.readString();
    }

    /* renamed from: i */
    public void mo1552i() {
        Log.m105920e("SampleTask", this.f80358g);
    }

    /* renamed from: j */
    public void mo1553j() {
        Log.m105920e("SampleTask", this.f80357f);
        this.f80358g = "String from Main Process";
        mo114394b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f80357f);
        parcel.writeString(this.f80358g);
    }
}
