package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg */
public class DrawImageActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<DrawImageActionArg> CREATOR = new C104739a();

    /* renamed from: e */
    public int f311063e;

    /* renamed from: f */
    public String f311064f;

    /* renamed from: g */
    public float f311065g;

    /* renamed from: h */
    public float f311066h;

    /* renamed from: i */
    public float f311067i;

    /* renamed from: j */
    public float f311068j;

    /* renamed from: n */
    public int f311069n;

    /* renamed from: o */
    public int f311070o;

    /* renamed from: p */
    public int f311071p;

    /* renamed from: q */
    public int f311072q;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawImageActionArg$a */
    public class C104739a implements Parcelable.Creator<DrawImageActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DrawImageActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DrawImageActionArg[i];
        }
    }

    public DrawImageActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311063e = parcel.readInt();
        this.f311064f = parcel.readString();
        this.f311065g = parcel.readFloat();
        this.f311066h = parcel.readFloat();
        this.f311067i = parcel.readFloat();
        this.f311068j = parcel.readFloat();
        this.f311069n = parcel.readInt();
        this.f311070o = parcel.readInt();
        this.f311071p = parcel.readInt();
        this.f311072q = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawImageActionArg) || !super.equals(obj)) {
            return false;
        }
        DrawImageActionArg drawImageActionArg = (DrawImageActionArg) obj;
        return this.f311063e == drawImageActionArg.f311063e && Float.compare(drawImageActionArg.f311065g, this.f311065g) == 0 && Float.compare(drawImageActionArg.f311066h, this.f311066h) == 0 && Float.compare(drawImageActionArg.f311067i, this.f311067i) == 0 && Float.compare(drawImageActionArg.f311068j, this.f311068j) == 0 && this.f311069n == drawImageActionArg.f311069n && this.f311070o == drawImageActionArg.f311070o && this.f311071p == drawImageActionArg.f311071p && this.f311072q == drawImageActionArg.f311072q && Objects.equals(this.f311064f, drawImageActionArg.f311064f);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.f311063e), this.f311064f, Float.valueOf(this.f311065g), Float.valueOf(this.f311066h), Float.valueOf(this.f311067i), Float.valueOf(this.f311068j), Integer.valueOf(this.f311069n), Integer.valueOf(this.f311070o), Integer.valueOf(this.f311071p), Integer.valueOf(this.f311072q)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeInt(this.f311063e);
        parcel.writeString(this.f311064f);
        parcel.writeFloat(this.f311065g);
        parcel.writeFloat(this.f311066h);
        parcel.writeFloat(this.f311067i);
        parcel.writeFloat(this.f311068j);
        parcel.writeInt(this.f311069n);
        parcel.writeInt(this.f311070o);
        parcel.writeInt(this.f311071p);
        parcel.writeInt(this.f311072q);
    }

    public DrawImageActionArg() {
    }
}
