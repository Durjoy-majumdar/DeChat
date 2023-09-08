package com.tencent.p014mm.plugin.appbrand.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.SampleTask2 */
public class SampleTask2 extends MainProcessTask {
    public static final Parcelable.Creator<SampleTask2> CREATOR = new C17869a();

    /* renamed from: com.tencent.mm.plugin.appbrand.ipc.SampleTask2$a */
    public class C17869a implements Parcelable.Creator<SampleTask2> {
        public Object createFromParcel(Parcel parcel) {
            return new SampleTask2();
        }

        public Object[] newArray(int i) {
            return new SampleTask2[i];
        }
    }

    /* renamed from: j */
    public void mo1553j() {
        Log.m105920e("SampleTask2", "Run in Main Process");
    }
}
