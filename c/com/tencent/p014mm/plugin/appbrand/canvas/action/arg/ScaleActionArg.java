package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg */
public class ScaleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<ScaleActionArg> CREATOR = new C104753a();

    /* renamed from: e */
    public float f311112e;

    /* renamed from: f */
    public float f311113f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.ScaleActionArg$a */
    public class C104753a implements Parcelable.Creator<ScaleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new ScaleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new ScaleActionArg[i];
        }
    }

    public ScaleActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311112e = parcel.readFloat();
        this.f311113f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScaleActionArg) || !super.equals(obj)) {
            return false;
        }
        ScaleActionArg scaleActionArg = (ScaleActionArg) obj;
        return Float.compare(scaleActionArg.f311112e, this.f311112e) == 0 && Float.compare(scaleActionArg.f311113f, this.f311113f) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311112e), Float.valueOf(this.f311113f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311112e);
        parcel.writeFloat(this.f311113f);
    }

    public ScaleActionArg() {
    }
}
