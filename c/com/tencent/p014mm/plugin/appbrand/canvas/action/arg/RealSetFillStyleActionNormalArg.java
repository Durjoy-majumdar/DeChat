package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import pi0.C110229d;
import si0.C110791a;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionNormalArg */
public class RealSetFillStyleActionNormalArg extends RealSetFillStyleActionArg {
    public static final Parcelable.Creator<RealSetFillStyleActionNormalArg> CREATOR = new C104745a();

    /* renamed from: e */
    public int f311091e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionNormalArg$a */
    public class C104745a implements Parcelable.Creator<RealSetFillStyleActionNormalArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetFillStyleActionNormalArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetFillStyleActionNormalArg[i];
        }
    }

    public RealSetFillStyleActionNormalArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        C110791a aVar = dVar.f329745b;
        aVar.setShader((Shader) null);
        aVar.setColor(this.f311091e);
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311091e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RealSetFillStyleActionNormalArg) && super.equals(obj) && this.f311091e == ((RealSetFillStyleActionNormalArg) obj).f311091e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Integer.valueOf(this.f311091e)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeInt(this.f311091e);
    }

    public RealSetFillStyleActionNormalArg(Parcel parcel) {
        super(parcel);
    }
}
