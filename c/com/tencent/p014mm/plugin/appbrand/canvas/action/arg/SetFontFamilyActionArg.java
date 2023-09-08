package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg */
public class SetFontFamilyActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFontFamilyActionArg> CREATOR = new C104757a();

    /* renamed from: e */
    public String f311118e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontFamilyActionArg$a */
    public class C104757a implements Parcelable.Creator<SetFontFamilyActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFontFamilyActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFontFamilyActionArg[i];
        }
    }

    public SetFontFamilyActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311118e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetFontFamilyActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311118e, ((SetFontFamilyActionArg) obj).f311118e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311118e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311118e);
    }

    public SetFontFamilyActionArg() {
    }
}
