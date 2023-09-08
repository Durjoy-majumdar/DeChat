package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg */
public class SetGlobalAlphaActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetGlobalAlphaActionArg> CREATOR = new C104761a();

    /* renamed from: e */
    public int f311122e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalAlphaActionArg$a */
    public class C104761a implements Parcelable.Creator<SetGlobalAlphaActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetGlobalAlphaActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetGlobalAlphaActionArg[i];
        }
    }

    public SetGlobalAlphaActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311122e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetGlobalAlphaActionArg) && super.equals(obj) && this.f311122e == ((SetGlobalAlphaActionArg) obj).f311122e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.f311122e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeInt(this.f311122e);
    }

    public SetGlobalAlphaActionArg() {
    }
}
