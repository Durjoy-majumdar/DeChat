package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg */
public class SetTextBaseLineActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetTextBaseLineActionArg> CREATOR = new C104771a();

    /* renamed from: e */
    public String f311140e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetTextBaseLineActionArg$a */
    public class C104771a implements Parcelable.Creator<SetTextBaseLineActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetTextBaseLineActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetTextBaseLineActionArg[i];
        }
    }

    public SetTextBaseLineActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311140e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetTextBaseLineActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311140e, ((SetTextBaseLineActionArg) obj).f311140e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311140e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311140e);
    }

    public SetTextBaseLineActionArg() {
    }
}
