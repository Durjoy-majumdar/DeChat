package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DefaultDrawActionArg */
public class DefaultDrawActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<DefaultDrawActionArg> CREATOR = new C104736a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.DefaultDrawActionArg$a */
    public class C104736a implements Parcelable.Creator<DefaultDrawActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new DefaultDrawActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new DefaultDrawActionArg[i];
        }
    }

    public DefaultDrawActionArg(Parcel parcel) {
        super(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public DefaultDrawActionArg() {
    }
}
