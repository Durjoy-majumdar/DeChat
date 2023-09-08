package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg */
public class SeMiterLimitActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SeMiterLimitActionArg> CREATOR = new C104754a();

    /* renamed from: e */
    public float f311114e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SeMiterLimitActionArg$a */
    public class C104754a implements Parcelable.Creator<SeMiterLimitActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SeMiterLimitActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SeMiterLimitActionArg[i];
        }
    }

    public SeMiterLimitActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311114e = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeMiterLimitActionArg) && super.equals(obj) && Float.compare(((SeMiterLimitActionArg) obj).f311114e, this.f311114e) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311114e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311114e);
    }

    public SeMiterLimitActionArg() {
    }
}
