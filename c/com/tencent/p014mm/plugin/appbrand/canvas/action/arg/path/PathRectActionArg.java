package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg */
public class PathRectActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathRectActionArg> CREATOR = new C104783a();

    /* renamed from: e */
    public float f311170e;

    /* renamed from: f */
    public float f311171f;

    /* renamed from: g */
    public float f311172g;

    /* renamed from: h */
    public float f311173h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathRectActionArg$a */
    public class C104783a implements Parcelable.Creator<PathRectActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathRectActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathRectActionArg[i];
        }
    }

    public PathRectActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311170e = parcel.readFloat();
        this.f311171f = parcel.readFloat();
        this.f311172g = parcel.readFloat();
        this.f311173h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathRectActionArg)) {
            return false;
        }
        PathRectActionArg pathRectActionArg = (PathRectActionArg) obj;
        return pathRectActionArg.f311170e == this.f311170e && pathRectActionArg.f311171f == this.f311171f && pathRectActionArg.f311172g == this.f311172g && pathRectActionArg.f311173h == this.f311173h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311170e);
        parcel.writeFloat(this.f311171f);
        parcel.writeFloat(this.f311172g);
        parcel.writeFloat(this.f311173h);
    }

    public PathRectActionArg() {
    }
}
