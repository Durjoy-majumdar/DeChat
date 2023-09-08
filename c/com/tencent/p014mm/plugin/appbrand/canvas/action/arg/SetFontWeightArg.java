package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg */
public class SetFontWeightArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFontWeightArg> CREATOR = new C104760a();

    /* renamed from: e */
    public String f311121e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontWeightArg$a */
    public class C104760a implements Parcelable.Creator<SetFontWeightArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFontWeightArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFontWeightArg[i];
        }
    }

    public SetFontWeightArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311121e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetFontWeightArg) && super.equals(obj)) {
            return Objects.equals(this.f311121e, ((SetFontWeightArg) obj).f311121e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311121e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311121e);
    }

    public SetFontWeightArg() {
    }
}
