package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg */
public class SetLineDashActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetLineDashActionArg> CREATOR = new C104764a();

    /* renamed from: e */
    public float[] f311125e = null;

    /* renamed from: f */
    public float f311126f = Float.MIN_VALUE;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineDashActionArg$a */
    public class C104764a implements Parcelable.Creator<SetLineDashActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetLineDashActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetLineDashActionArg[i];
        }
    }

    public SetLineDashActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            float[] fArr = new float[readInt];
            this.f311125e = fArr;
            parcel.readFloatArray(fArr);
        }
        this.f311126f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetLineDashActionArg) || !super.equals(obj)) {
            return false;
        }
        SetLineDashActionArg setLineDashActionArg = (SetLineDashActionArg) obj;
        return Float.compare(setLineDashActionArg.f311126f, this.f311126f) == 0 && Arrays.equals(this.f311125e, setLineDashActionArg.f311125e);
    }

    public int hashCode() {
        return (Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311126f)}) * 31) + Arrays.hashCode(this.f311125e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        float[] fArr = this.f311125e;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f311125e);
        }
        parcel.writeFloat(this.f311126f);
    }

    public SetLineDashActionArg() {
    }
}
