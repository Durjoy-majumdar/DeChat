package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg */
public class SetPixelsActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetPixelsActionArg> CREATOR = new C104767a();

    /* renamed from: e */
    public int f311129e;

    /* renamed from: f */
    public int f311130f;

    /* renamed from: g */
    public int f311131g;

    /* renamed from: h */
    public int f311132h;

    /* renamed from: i */
    public Bitmap f311133i = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetPixelsActionArg$a */
    public class C104767a implements Parcelable.Creator<SetPixelsActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetPixelsActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetPixelsActionArg[i];
        }
    }

    public SetPixelsActionArg() {
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311129e = parcel.readInt();
        this.f311130f = parcel.readInt();
        this.f311131g = parcel.readInt();
        this.f311132h = parcel.readInt();
        this.f311133i = (Bitmap) parcel.readParcelable(SetPixelsActionArg.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPixelsActionArg) || !super.equals(obj)) {
            return false;
        }
        SetPixelsActionArg setPixelsActionArg = (SetPixelsActionArg) obj;
        return this.f311129e == setPixelsActionArg.f311129e && this.f311130f == setPixelsActionArg.f311130f && this.f311131g == setPixelsActionArg.f311131g && this.f311132h == setPixelsActionArg.f311132h && Objects.equals(this.f311133i, setPixelsActionArg.f311133i);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.f311129e), Integer.valueOf(this.f311130f), Integer.valueOf(this.f311131g), Integer.valueOf(this.f311132h), this.f311133i});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeInt(this.f311129e);
        parcel.writeInt(this.f311130f);
        parcel.writeInt(this.f311131g);
        parcel.writeInt(this.f311132h);
        parcel.writeParcelable(this.f311133i, i);
    }

    public SetPixelsActionArg(Parcel parcel) {
        super(parcel);
    }
}
