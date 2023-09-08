package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg */
public class RealSetFillStyleActionRadialArg extends RealSetFillStyleActionArg {
    public static final Parcelable.Creator<RealSetFillStyleActionRadialArg> CREATOR = new C104747a();

    /* renamed from: e */
    public float f311094e;

    /* renamed from: f */
    public float f311095f;

    /* renamed from: g */
    public float f311096g;

    /* renamed from: h */
    public int[] f311097h;

    /* renamed from: i */
    public float[] f311098i;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionRadialArg$a */
    public class C104747a implements Parcelable.Creator<RealSetFillStyleActionRadialArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetFillStyleActionRadialArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetFillStyleActionRadialArg[i];
        }
    }

    public RealSetFillStyleActionRadialArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        if (this.f311097h == null || this.f311098i == null) {
            return false;
        }
        dVar.f329745b.setShader(new RadialGradient(this.f311094e, this.f311095f, this.f311096g, this.f311097h, this.f311098i, Shader.TileMode.CLAMP));
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311094e = parcel.readFloat();
        this.f311095f = parcel.readFloat();
        this.f311096g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f311097h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f311098i = fArr;
            parcel.readFloatArray(fArr);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealSetFillStyleActionRadialArg) || !super.equals(obj)) {
            return false;
        }
        RealSetFillStyleActionRadialArg realSetFillStyleActionRadialArg = (RealSetFillStyleActionRadialArg) obj;
        return Float.compare(realSetFillStyleActionRadialArg.f311094e, this.f311094e) == 0 && Float.compare(realSetFillStyleActionRadialArg.f311095f, this.f311095f) == 0 && Float.compare(realSetFillStyleActionRadialArg.f311096g, this.f311096g) == 0 && Arrays.equals(this.f311097h, realSetFillStyleActionRadialArg.f311097h) && Arrays.equals(this.f311098i, realSetFillStyleActionRadialArg.f311098i);
    }

    public int hashCode() {
        return (((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311094e), Float.valueOf(this.f311095f), Float.valueOf(this.f311096g)}) * 31) + Arrays.hashCode(this.f311097h)) * 31) + Arrays.hashCode(this.f311098i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311094e);
        parcel.writeFloat(this.f311095f);
        parcel.writeFloat(this.f311096g);
        int[] iArr = this.f311097h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f311097h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f311098i;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f311098i);
            return;
        }
        parcel.writeInt(0);
    }

    public RealSetFillStyleActionRadialArg(Parcel parcel) {
        super(parcel);
    }
}
