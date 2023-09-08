package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg */
public class DrawRectActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<DrawRectActionArg> CREATOR = new C104740a();

    /* renamed from: e */
    public float f311073e;

    /* renamed from: f */
    public float f311074f;

    /* renamed from: g */
    public float f311075g;

    /* renamed from: h */
    public float f311076h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawRectActionArg$a */
    public class C104740a implements Parcelable.Creator<DrawRectActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawRectActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawRectActionArg[i];
        }
    }

    public DrawRectActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311073e = parcel.readFloat();
        this.f311074f = parcel.readFloat();
        this.f311075g = parcel.readFloat();
        this.f311076h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawRectActionArg) || !super.equals(obj)) {
            return false;
        }
        DrawRectActionArg drawRectActionArg = (DrawRectActionArg) obj;
        return Float.compare(drawRectActionArg.f311073e, this.f311073e) == 0 && Float.compare(drawRectActionArg.f311074f, this.f311074f) == 0 && Float.compare(drawRectActionArg.f311075g, this.f311075g) == 0 && Float.compare(drawRectActionArg.f311076h, this.f311076h) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311073e), Float.valueOf(this.f311074f), Float.valueOf(this.f311075g), Float.valueOf(this.f311076h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311073e);
        parcel.writeFloat(this.f311074f);
        parcel.writeFloat(this.f311075g);
        parcel.writeFloat(this.f311076h);
    }

    public DrawRectActionArg() {
    }
}
