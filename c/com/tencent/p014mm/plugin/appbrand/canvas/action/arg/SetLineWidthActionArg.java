package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg */
public class SetLineWidthActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetLineWidthActionArg> CREATOR = new C104766a();

    /* renamed from: e */
    public float f311128e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetLineWidthActionArg$a */
    public class C104766a implements Parcelable.Creator<SetLineWidthActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetLineWidthActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetLineWidthActionArg[i];
        }
    }

    public SetLineWidthActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311128e = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetLineWidthActionArg) && super.equals(obj) && Float.compare(((SetLineWidthActionArg) obj).f311128e, this.f311128e) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311128e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311128e);
    }

    public SetLineWidthActionArg() {
    }
}
