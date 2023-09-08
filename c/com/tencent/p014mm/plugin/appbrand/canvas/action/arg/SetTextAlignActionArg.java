package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg */
public class SetTextAlignActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetTextAlignActionArg> CREATOR = new C104770a();

    /* renamed from: e */
    public String f311139e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextAlignActionArg$a */
    public class C104770a implements Parcelable.Creator<SetTextAlignActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetTextAlignActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetTextAlignActionArg[i];
        }
    }

    public SetTextAlignActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311139e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetTextAlignActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311139e, ((SetTextAlignActionArg) obj).f311139e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311139e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311139e);
    }

    public SetTextAlignActionArg() {
    }
}
