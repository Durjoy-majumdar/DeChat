package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.TranslateActionArg */
public class TranslateActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<TranslateActionArg> CREATOR = new C104773a();

    /* renamed from: e */
    public float f311147e;

    /* renamed from: f */
    public float f311148f;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.TranslateActionArg$a */
    public class C104773a implements Parcelable.Creator<TranslateActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new TranslateActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new TranslateActionArg[i];
        }
    }

    public TranslateActionArg() {
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311147e = parcel.readFloat();
        this.f311148f = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TranslateActionArg) || !super.equals(obj)) {
            return false;
        }
        TranslateActionArg translateActionArg = (TranslateActionArg) obj;
        return Float.compare(translateActionArg.f311147e, this.f311147e) == 0 && Float.compare(translateActionArg.f311148f, this.f311148f) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311147e), Float.valueOf(this.f311148f)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311147e);
        parcel.writeFloat(this.f311148f);
    }

    public TranslateActionArg(Parcel parcel) {
        super(parcel);
    }
}
