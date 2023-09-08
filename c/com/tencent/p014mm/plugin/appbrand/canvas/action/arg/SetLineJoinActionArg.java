package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg */
public class SetLineJoinActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetLineJoinActionArg> CREATOR = new C104765a();

    /* renamed from: e */
    public String f311127e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineJoinActionArg$a */
    public class C104765a implements Parcelable.Creator<SetLineJoinActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetLineJoinActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetLineJoinActionArg[i];
        }
    }

    public SetLineJoinActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311127e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetLineJoinActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311127e, ((SetLineJoinActionArg) obj).f311127e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311127e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311127e);
    }

    public SetLineJoinActionArg() {
    }
}
