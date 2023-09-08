package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg */
public class ClearRectActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<ClearRectActionArg> CREATOR = new C104735a();

    /* renamed from: e */
    public float f311051e;

    /* renamed from: f */
    public float f311052f;

    /* renamed from: g */
    public float f311053g;

    /* renamed from: h */
    public float f311054h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.ClearRectActionArg$a */
    public class C104735a implements Parcelable.Creator<ClearRectActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new ClearRectActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new ClearRectActionArg[i];
        }
    }

    public ClearRectActionArg() {
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311051e = parcel.readFloat();
        this.f311052f = parcel.readFloat();
        this.f311053g = parcel.readFloat();
        this.f311054h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearRectActionArg) || !super.equals(obj)) {
            return false;
        }
        ClearRectActionArg clearRectActionArg = (ClearRectActionArg) obj;
        return Float.compare(clearRectActionArg.f311051e, this.f311051e) == 0 && Float.compare(clearRectActionArg.f311052f, this.f311052f) == 0 && Float.compare(clearRectActionArg.f311053g, this.f311053g) == 0 && Float.compare(clearRectActionArg.f311054h, this.f311054h) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311051e), Float.valueOf(this.f311052f), Float.valueOf(this.f311053g), Float.valueOf(this.f311054h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311051e);
        parcel.writeFloat(this.f311052f);
        parcel.writeFloat(this.f311053g);
        parcel.writeFloat(this.f311054h);
    }

    public ClearRectActionArg(Parcel parcel) {
        super(parcel);
    }
}
