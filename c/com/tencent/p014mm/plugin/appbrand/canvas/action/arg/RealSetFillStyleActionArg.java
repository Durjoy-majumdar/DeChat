package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg */
public class RealSetFillStyleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<RealSetFillStyleActionArg> CREATOR = new C104743a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionArg$a */
    public class C104743a implements Parcelable.Creator<RealSetFillStyleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetFillStyleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetFillStyleActionArg[i];
        }
    }

    public RealSetFillStyleActionArg() {
    }

    public int describeContents() {
        return 0;
    }

    public RealSetFillStyleActionArg(Parcel parcel) {
        super(parcel);
    }
}
