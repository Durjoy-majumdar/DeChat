package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg */
public class PathMoveToActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathMoveToActionArg> CREATOR = new C104781a();

    /* renamed from: e */
    public float f311164e;

    /* renamed from: f */
    public float f311165f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathMoveToActionArg$a */
    public class C104781a implements Parcelable.Creator<PathMoveToActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathMoveToActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathMoveToActionArg[i];
        }
    }

    public PathMoveToActionArg() {
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311164e = parcel.readFloat();
        this.f311165f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathMoveToActionArg)) {
            return false;
        }
        PathMoveToActionArg pathMoveToActionArg = (PathMoveToActionArg) obj;
        return pathMoveToActionArg.f311164e == this.f311164e && pathMoveToActionArg.f311165f == this.f311165f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311164e);
        parcel.writeFloat(this.f311165f);
    }

    public PathMoveToActionArg(Parcel parcel) {
        super(parcel);
    }
}
