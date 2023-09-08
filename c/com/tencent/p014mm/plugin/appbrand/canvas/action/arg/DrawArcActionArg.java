package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg */
public class DrawArcActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<DrawArcActionArg> CREATOR = new C104738a();

    /* renamed from: e */
    public float f311058e;

    /* renamed from: f */
    public float f311059f;

    /* renamed from: g */
    public float f311060g;

    /* renamed from: h */
    public float f311061h;

    /* renamed from: i */
    public float f311062i;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawArcActionArg$a */
    public class C104738a implements Parcelable.Creator<DrawArcActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawArcActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawArcActionArg[i];
        }
    }

    public DrawArcActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311058e = parcel.readFloat();
        this.f311059f = parcel.readFloat();
        this.f311060g = parcel.readFloat();
        this.f311061h = parcel.readFloat();
        this.f311062i = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawArcActionArg) || !super.equals(obj)) {
            return false;
        }
        DrawArcActionArg drawArcActionArg = (DrawArcActionArg) obj;
        return Float.compare(drawArcActionArg.f311058e, this.f311058e) == 0 && Float.compare(drawArcActionArg.f311059f, this.f311059f) == 0 && Float.compare(drawArcActionArg.f311060g, this.f311060g) == 0 && Float.compare(drawArcActionArg.f311061h, this.f311061h) == 0 && Float.compare(drawArcActionArg.f311062i, this.f311062i) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311058e), Float.valueOf(this.f311059f), Float.valueOf(this.f311060g), Float.valueOf(this.f311061h), Float.valueOf(this.f311062i)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311058e);
        parcel.writeFloat(this.f311059f);
        parcel.writeFloat(this.f311060g);
        parcel.writeFloat(this.f311061h);
        parcel.writeFloat(this.f311062i);
    }

    public DrawArcActionArg() {
    }
}
