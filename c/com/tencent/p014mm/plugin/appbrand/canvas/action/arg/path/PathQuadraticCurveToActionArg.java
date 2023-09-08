package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg */
public class PathQuadraticCurveToActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathQuadraticCurveToActionArg> CREATOR = new C104782a();

    /* renamed from: e */
    public float f311166e;

    /* renamed from: f */
    public float f311167f;

    /* renamed from: g */
    public float f311168g;

    /* renamed from: h */
    public float f311169h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathQuadraticCurveToActionArg$a */
    public class C104782a implements Parcelable.Creator<PathQuadraticCurveToActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathQuadraticCurveToActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathQuadraticCurveToActionArg[i];
        }
    }

    public PathQuadraticCurveToActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311166e = parcel.readFloat();
        this.f311167f = parcel.readFloat();
        this.f311168g = parcel.readFloat();
        this.f311169h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathQuadraticCurveToActionArg)) {
            return false;
        }
        PathQuadraticCurveToActionArg pathQuadraticCurveToActionArg = (PathQuadraticCurveToActionArg) obj;
        return pathQuadraticCurveToActionArg.f311166e == this.f311166e && pathQuadraticCurveToActionArg.f311167f == this.f311167f && pathQuadraticCurveToActionArg.f311168g == this.f311168g && pathQuadraticCurveToActionArg.f311169h == this.f311169h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311166e);
        parcel.writeFloat(this.f311167f);
        parcel.writeFloat(this.f311168g);
        parcel.writeFloat(this.f311169h);
    }

    public PathQuadraticCurveToActionArg() {
    }
}
