package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RotateActionArg */
public class RotateActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<RotateActionArg> CREATOR = new C104752a();

    /* renamed from: e */
    public float f311111e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RotateActionArg$a */
    public class C104752a implements Parcelable.Creator<RotateActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RotateActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RotateActionArg[i];
        }
    }

    public RotateActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311111e = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RotateActionArg) && super.equals(obj) && Float.compare(((RotateActionArg) obj).f311111e, this.f311111e) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311111e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311111e);
    }

    public RotateActionArg() {
    }
}
