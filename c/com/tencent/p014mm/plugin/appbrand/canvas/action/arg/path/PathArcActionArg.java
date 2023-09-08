package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg */
public class PathArcActionArg extends PathActionArg {
    public static final Parcelable.Creator<PathArcActionArg> CREATOR = new C104776a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcActionArg$a */
    public class C104776a implements Parcelable.Creator<PathArcActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathArcActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathArcActionArg[i];
        }
    }

    public PathArcActionArg(Parcel parcel) {
        super(parcel);
    }

    public PathArcActionArg() {
    }
}
