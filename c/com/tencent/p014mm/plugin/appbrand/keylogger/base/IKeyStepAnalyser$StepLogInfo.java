package com.tencent.p014mm.plugin.appbrand.keylogger.base;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo */
public final class IKeyStepAnalyser$StepLogInfo implements Parcelable {
    public static final Parcelable.Creator<IKeyStepAnalyser$StepLogInfo> CREATOR = new C83214a();

    /* renamed from: d */
    public long f243051d;

    /* renamed from: e */
    public String f243052e;

    /* renamed from: f */
    public String f243053f;

    /* renamed from: g */
    public boolean f243054g;

    /* renamed from: h */
    public String f243055h;

    /* renamed from: i */
    public String f243056i;

    /* renamed from: j */
    public long f243057j = -1;

    /* renamed from: com.tencent.mm.plugin.appbrand.keylogger.base.IKeyStepAnalyser$StepLogInfo$a */
    public class C83214a implements Parcelable.Creator<IKeyStepAnalyser$StepLogInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new IKeyStepAnalyser$StepLogInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new IKeyStepAnalyser$StepLogInfo[i];
        }
    }

    public IKeyStepAnalyser$StepLogInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f243051d);
        parcel.writeString(this.f243052e);
        parcel.writeString(this.f243053f);
        parcel.writeByte(this.f243054g ? (byte) 1 : 0);
        parcel.writeString(this.f243055h);
        parcel.writeString(this.f243056i);
        parcel.writeLong(this.f243057j);
    }

    public IKeyStepAnalyser$StepLogInfo(Parcel parcel) {
        this.f243051d = parcel.readLong();
        this.f243052e = parcel.readString();
        this.f243053f = parcel.readString();
        this.f243054g = parcel.readByte() != 0;
        this.f243055h = parcel.readString();
        this.f243056i = parcel.readString();
        this.f243057j = parcel.readLong();
    }
}
