package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg */
public class PathLineToActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathLineToActionArg> CREATOR = new C104780a();

    /* renamed from: e */
    public float f311162e;

    /* renamed from: f */
    public float f311163f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathLineToActionArg$a */
    public class C104780a implements Parcelable.Creator<PathLineToActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathLineToActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathLineToActionArg[i];
        }
    }

    public PathLineToActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311162e = parcel.readFloat();
        this.f311163f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathLineToActionArg)) {
            return false;
        }
        PathLineToActionArg pathLineToActionArg = (PathLineToActionArg) obj;
        return pathLineToActionArg.f311162e == this.f311162e && pathLineToActionArg.f311163f == this.f311163f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311162e);
        parcel.writeFloat(this.f311163f);
    }

    public PathLineToActionArg() {
    }
}
