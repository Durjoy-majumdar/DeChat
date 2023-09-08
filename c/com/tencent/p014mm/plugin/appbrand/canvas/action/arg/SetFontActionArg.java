package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg */
public class SetFontActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFontActionArg> CREATOR = new C104756a();

    /* renamed from: e */
    public String f311116e;

    /* renamed from: f */
    public float f311117f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontActionArg$a */
    public class C104756a implements Parcelable.Creator<SetFontActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFontActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFontActionArg[i];
        }
    }

    public SetFontActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311116e = parcel.readString();
        this.f311117f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetFontActionArg) || !super.equals(obj)) {
            return false;
        }
        SetFontActionArg setFontActionArg = (SetFontActionArg) obj;
        return Float.compare(setFontActionArg.f311117f, this.f311117f) == 0 && Objects.equals(this.f311116e, setFontActionArg.f311116e);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311116e, Float.valueOf(this.f311117f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311116e);
        parcel.writeFloat(this.f311117f);
    }

    public SetFontActionArg() {
    }
}
