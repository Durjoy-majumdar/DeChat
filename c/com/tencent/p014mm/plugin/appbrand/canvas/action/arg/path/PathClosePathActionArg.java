package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathClosePathActionArg */
public class PathClosePathActionArg extends BasePathActionArg {
    public static final Parcelable.Creator<PathClosePathActionArg> CREATOR = new C104779a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathClosePathActionArg$a */
    public class C104779a implements Parcelable.Creator<PathClosePathActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathClosePathActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathClosePathActionArg[i];
        }
    }

    public PathClosePathActionArg(Parcel parcel) {
        super(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public PathClosePathActionArg() {
    }
}
