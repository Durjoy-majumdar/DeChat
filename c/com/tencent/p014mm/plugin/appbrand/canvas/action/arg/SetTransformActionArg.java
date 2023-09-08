package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg */
public class SetTransformActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetTransformActionArg> CREATOR = new C104772a();

    /* renamed from: e */
    public float f311141e;

    /* renamed from: f */
    public float f311142f;

    /* renamed from: g */
    public float f311143g;

    /* renamed from: h */
    public float f311144h;

    /* renamed from: i */
    public float f311145i;

    /* renamed from: j */
    public float f311146j;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTransformActionArg$a */
    public class C104772a implements Parcelable.Creator<SetTransformActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetTransformActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetTransformActionArg[i];
        }
    }

    public SetTransformActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311141e = parcel.readFloat();
        this.f311142f = parcel.readFloat();
        this.f311143g = parcel.readFloat();
        this.f311144h = parcel.readFloat();
        this.f311145i = parcel.readFloat();
        this.f311146j = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetTransformActionArg) || !super.equals(obj)) {
            return false;
        }
        SetTransformActionArg setTransformActionArg = (SetTransformActionArg) obj;
        return Float.compare(setTransformActionArg.f311141e, this.f311141e) == 0 && Float.compare(setTransformActionArg.f311142f, this.f311142f) == 0 && Float.compare(setTransformActionArg.f311143g, this.f311143g) == 0 && Float.compare(setTransformActionArg.f311144h, this.f311144h) == 0 && Float.compare(setTransformActionArg.f311145i, this.f311145i) == 0 && Float.compare(setTransformActionArg.f311146j, this.f311146j) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311141e), Float.valueOf(this.f311142f), Float.valueOf(this.f311143g), Float.valueOf(this.f311144h), Float.valueOf(this.f311145i), Float.valueOf(this.f311146j)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311144h);
        parcel.writeFloat(this.f311142f);
        parcel.writeFloat(this.f311143g);
        parcel.writeFloat(this.f311144h);
        parcel.writeFloat(this.f311145i);
        parcel.writeFloat(this.f311146j);
    }

    public SetTransformActionArg() {
    }
}
