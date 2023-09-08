package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg */
public class SetLineCapActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetLineCapActionArg> CREATOR = new C104763a();

    /* renamed from: e */
    public String f311124e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineCapActionArg$a */
    public class C104763a implements Parcelable.Creator<SetLineCapActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetLineCapActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetLineCapActionArg[i];
        }
    }

    public SetLineCapActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311124e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetLineCapActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311124e, ((SetLineCapActionArg) obj).f311124e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311124e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311124e);
    }

    public SetLineCapActionArg() {
    }
}
