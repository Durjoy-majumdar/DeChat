package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg */
public class SetShadowActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetShadowActionArg> CREATOR = new C104768a();

    /* renamed from: e */
    public float f311134e;

    /* renamed from: f */
    public float f311135f;

    /* renamed from: g */
    public float f311136g;

    /* renamed from: h */
    public int f311137h;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetShadowActionArg$a */
    public class C104768a implements Parcelable.Creator<SetShadowActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetShadowActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetShadowActionArg[i];
        }
    }

    public SetShadowActionArg() {
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311134e = parcel.readFloat();
        this.f311135f = parcel.readFloat();
        this.f311136g = parcel.readFloat();
        this.f311137h = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetShadowActionArg) || !super.equals(obj)) {
            return false;
        }
        SetShadowActionArg setShadowActionArg = (SetShadowActionArg) obj;
        return Float.compare(setShadowActionArg.f311134e, this.f311134e) == 0 && Float.compare(setShadowActionArg.f311135f, this.f311135f) == 0 && Float.compare(setShadowActionArg.f311136g, this.f311136g) == 0 && this.f311137h == setShadowActionArg.f311137h;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311134e), Float.valueOf(this.f311135f), Float.valueOf(this.f311136g), Integer.valueOf(this.f311137h)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311134e);
        parcel.writeFloat(this.f311135f);
        parcel.writeFloat(this.f311136g);
        parcel.writeInt(this.f311137h);
    }

    public SetShadowActionArg(Parcel parcel) {
        super(parcel);
    }
}
