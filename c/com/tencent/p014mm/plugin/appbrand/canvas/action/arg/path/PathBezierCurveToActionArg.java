package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg */
public class PathBezierCurveToActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathBezierCurveToActionArg> CREATOR = new C104778a();

    /* renamed from: e */
    public float f311156e;

    /* renamed from: f */
    public float f311157f;

    /* renamed from: g */
    public float f311158g;

    /* renamed from: h */
    public float f311159h;

    /* renamed from: i */
    public float f311160i;

    /* renamed from: j */
    public float f311161j;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathBezierCurveToActionArg$a */
    public class C104778a implements Parcelable.Creator<PathBezierCurveToActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathBezierCurveToActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathBezierCurveToActionArg[i];
        }
    }

    public PathBezierCurveToActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311156e = parcel.readFloat();
        this.f311157f = parcel.readFloat();
        this.f311158g = parcel.readFloat();
        this.f311159h = parcel.readFloat();
        this.f311160i = parcel.readFloat();
        this.f311161j = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof PathBezierCurveToActionArg)) {
            return false;
        }
        PathBezierCurveToActionArg pathBezierCurveToActionArg = (PathBezierCurveToActionArg) obj;
        return pathBezierCurveToActionArg.f311156e == this.f311156e && pathBezierCurveToActionArg.f311157f == this.f311157f && pathBezierCurveToActionArg.f311158g == this.f311158g && pathBezierCurveToActionArg.f311159h == this.f311159h && pathBezierCurveToActionArg.f311160i == this.f311160i && pathBezierCurveToActionArg.f311161j == this.f311161j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311156e);
        parcel.writeFloat(this.f311157f);
        parcel.writeFloat(this.f311158g);
        parcel.writeFloat(this.f311159h);
        parcel.writeFloat(this.f311158g);
        parcel.writeFloat(this.f311159h);
    }

    public PathBezierCurveToActionArg() {
    }
}
