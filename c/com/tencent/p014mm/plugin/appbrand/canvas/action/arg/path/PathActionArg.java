package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathActionArg */
public abstract class PathActionArg extends BasePathActionArg {

    /* renamed from: e */
    public float f311149e;

    /* renamed from: f */
    public float f311150f;

    /* renamed from: g */
    public float f311151g;

    /* renamed from: h */
    public float f311152h;

    /* renamed from: i */
    public float f311153i;

    /* renamed from: j */
    public boolean f311154j;

    public PathActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311149e = parcel.readFloat();
        this.f311150f = parcel.readFloat();
        this.f311151g = parcel.readFloat();
        this.f311152h = parcel.readFloat();
        this.f311153i = parcel.readFloat();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f311154j = z;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathActionArg)) {
            return false;
        }
        PathActionArg pathActionArg = (PathActionArg) obj;
        return pathActionArg.f311149e == this.f311149e && pathActionArg.f311150f == this.f311150f && pathActionArg.f311151g == this.f311151g && pathActionArg.f311152h == this.f311152h && pathActionArg.f311154j == this.f311154j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311149e);
        parcel.writeFloat(this.f311150f);
        parcel.writeFloat(this.f311151g);
        parcel.writeFloat(this.f311152h);
        parcel.writeFloat(this.f311153i);
        parcel.writeInt(this.f311154j ? 1 : 0);
    }

    public PathActionArg() {
    }
}
