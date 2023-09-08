package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg */
public class RealSetStrokeStyleActionRadialArg extends RealSetStrokeStyleActionArg {
    public static final Parcelable.Creator<RealSetStrokeStyleActionRadialArg> CREATOR = new C104751a();

    /* renamed from: e */
    public float f311106e;

    /* renamed from: f */
    public float f311107f;

    /* renamed from: g */
    public float f311108g;

    /* renamed from: h */
    public int[] f311109h;

    /* renamed from: i */
    public float[] f311110i;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionRadialArg$a */
    public class C104751a implements Parcelable.Creator<RealSetStrokeStyleActionRadialArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetStrokeStyleActionRadialArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetStrokeStyleActionRadialArg[i];
        }
    }

    public RealSetStrokeStyleActionRadialArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        if (this.f311109h == null || this.f311110i == null) {
            return false;
        }
        dVar.f329744a.setShader(new RadialGradient(this.f311106e, this.f311107f, this.f311108g, this.f311109h, this.f311110i, Shader.TileMode.CLAMP));
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311106e = parcel.readFloat();
        this.f311107f = parcel.readFloat();
        this.f311108g = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f311109h = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f311110i = fArr;
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
        if (!(obj instanceof RealSetStrokeStyleActionRadialArg) || !super.equals(obj)) {
            return false;
        }
        RealSetStrokeStyleActionRadialArg realSetStrokeStyleActionRadialArg = (RealSetStrokeStyleActionRadialArg) obj;
        return Float.compare(realSetStrokeStyleActionRadialArg.f311106e, this.f311106e) == 0 && Float.compare(realSetStrokeStyleActionRadialArg.f311107f, this.f311107f) == 0 && Float.compare(realSetStrokeStyleActionRadialArg.f311108g, this.f311108g) == 0 && Arrays.equals(this.f311109h, realSetStrokeStyleActionRadialArg.f311109h) && Arrays.equals(this.f311110i, realSetStrokeStyleActionRadialArg.f311110i);
    }

    public int hashCode() {
        return (((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311106e), Float.valueOf(this.f311107f), Float.valueOf(this.f311108g)}) * 31) + Arrays.hashCode(this.f311109h)) * 31) + Arrays.hashCode(this.f311110i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311106e);
        parcel.writeFloat(this.f311107f);
        parcel.writeFloat(this.f311108g);
        int[] iArr = this.f311109h;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f311109h);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f311110i;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f311110i);
            return;
        }
        parcel.writeInt(0);
    }

    public RealSetStrokeStyleActionRadialArg(Parcel parcel) {
        super(parcel);
    }
}
