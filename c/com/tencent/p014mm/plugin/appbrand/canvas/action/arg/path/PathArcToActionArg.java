package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcToActionArg */
public class PathArcToActionArg extends PathActionArg {
    public static final Parcelable.Creator<PathArcToActionArg> CREATOR = new C104777a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.PathArcToActionArg$a */
    public class C104777a implements Parcelable.Creator<PathArcToActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new PathArcToActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new PathArcToActionArg[i];
        }
    }

    public PathArcToActionArg(Parcel parcel) {
        super(parcel);
    }

    public PathArcToActionArg() {
    }
}
