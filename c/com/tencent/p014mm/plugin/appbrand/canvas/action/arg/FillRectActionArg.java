package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg */
public class FillRectActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<FillRectActionArg> CREATOR = new C104742a();

    /* renamed from: e */
    public float f311081e;

    /* renamed from: f */
    public float f311082f;

    /* renamed from: g */
    public float f311083g;

    /* renamed from: h */
    public float f311084h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.FillRectActionArg$a */
    public class C104742a implements Parcelable.Creator<FillRectActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new FillRectActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new FillRectActionArg[i];
        }
    }

    public FillRectActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311081e = parcel.readFloat();
        this.f311082f = parcel.readFloat();
        this.f311083g = parcel.readFloat();
        this.f311084h = parcel.readFloat();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillRectActionArg) || !super.equals(obj)) {
            return false;
        }
        FillRectActionArg fillRectActionArg = (FillRectActionArg) obj;
        return Float.compare(fillRectActionArg.f311081e, this.f311081e) == 0 && Float.compare(fillRectActionArg.f311082f, this.f311082f) == 0 && Float.compare(fillRectActionArg.f311083g, this.f311083g) == 0 && Float.compare(fillRectActionArg.f311084h, this.f311084h) == 0;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311081e), Float.valueOf(this.f311082f), Float.valueOf(this.f311083g), Float.valueOf(this.f311084h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311081e);
        parcel.writeFloat(this.f311082f);
        parcel.writeFloat(this.f311083g);
        parcel.writeFloat(this.f311084h);
    }

    public FillRectActionArg() {
    }
}
