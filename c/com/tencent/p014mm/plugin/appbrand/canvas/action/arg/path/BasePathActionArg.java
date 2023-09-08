package com.tencent.p014mm.plugin.appbrand.canvas.action.arg.path;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg */
public class BasePathActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<BasePathActionArg> CREATOR = new C104774a();

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.path.BasePathActionArg$a */
    public class C104774a implements Parcelable.Creator<BasePathActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new BasePathActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new BasePathActionArg[i];
        }
    }

    public BasePathActionArg() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
    }

    public BasePathActionArg(Parcel parcel) {
        super(parcel);
    }
}
