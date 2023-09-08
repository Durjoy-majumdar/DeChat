package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg */
public class RealSetStrokeStyleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<RealSetStrokeStyleActionArg> CREATOR = new C104748a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionArg$a */
    public class C104748a implements Parcelable.Creator<RealSetStrokeStyleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetStrokeStyleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetStrokeStyleActionArg[i];
        }
    }

    public RealSetStrokeStyleActionArg() {
    }

    public int describeContents() {
        return 0;
    }

    public RealSetStrokeStyleActionArg(Parcel parcel) {
        super(parcel);
    }
}
