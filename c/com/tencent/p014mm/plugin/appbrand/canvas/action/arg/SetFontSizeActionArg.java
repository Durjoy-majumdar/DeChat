package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg */
public class SetFontSizeActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFontSizeActionArg> CREATOR = new C104758a();

    /* renamed from: e */
    public int f311119e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFontSizeActionArg$a */
    public class C104758a implements Parcelable.Creator<SetFontSizeActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFontSizeActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFontSizeActionArg[i];
        }
    }

    public SetFontSizeActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311119e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetFontSizeActionArg) && super.equals(obj) && this.f311119e == ((SetFontSizeActionArg) obj).f311119e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.f311119e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeInt(this.f311119e);
    }

    public SetFontSizeActionArg() {
    }
}
