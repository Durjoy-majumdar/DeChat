package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg */
public class SetFontStyleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFontStyleActionArg> CREATOR = new C104759a();

    /* renamed from: e */
    public String f311120e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontStyleActionArg$a */
    public class C104759a implements Parcelable.Creator<SetFontStyleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFontStyleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFontStyleActionArg[i];
        }
    }

    public SetFontStyleActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311120e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetFontStyleActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311120e, ((SetFontStyleActionArg) obj).f311120e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311120e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311120e);
    }

    public SetFontStyleActionArg() {
    }
}
