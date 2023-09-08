package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg */
public class DrawTextActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<DrawTextActionArg> CREATOR = new C104741a();

    /* renamed from: e */
    public String f311077e;

    /* renamed from: f */
    public float f311078f;

    /* renamed from: g */
    public float f311079g;

    /* renamed from: h */
    public float f311080h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawTextActionArg$a */
    public class C104741a implements Parcelable.Creator<DrawTextActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawTextActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawTextActionArg[i];
        }
    }

    public DrawTextActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311077e = parcel.readString();
        this.f311078f = parcel.readFloat();
        this.f311079g = parcel.readFloat();
        this.f311080h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawTextActionArg) || !super.equals(obj)) {
            return false;
        }
        DrawTextActionArg drawTextActionArg = (DrawTextActionArg) obj;
        return Float.compare(drawTextActionArg.f311078f, this.f311078f) == 0 && Float.compare(drawTextActionArg.f311079g, this.f311079g) == 0 && Float.compare(drawTextActionArg.f311080h, this.f311080h) == 0 && Objects.equals(this.f311077e, drawTextActionArg.f311077e);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311077e, Float.valueOf(this.f311078f), Float.valueOf(this.f311079g), Float.valueOf(this.f311080h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311077e);
        parcel.writeFloat(this.f311078f);
        parcel.writeFloat(this.f311079g);
        parcel.writeFloat(this.f311080h);
    }

    public DrawTextActionArg() {
    }
}
