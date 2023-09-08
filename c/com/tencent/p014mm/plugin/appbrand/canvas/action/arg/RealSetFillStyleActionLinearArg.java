package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg */
public class RealSetFillStyleActionLinearArg extends RealSetFillStyleActionArg {
    public static final Parcelable.Creator<RealSetFillStyleActionLinearArg> CREATOR = new C104744a();

    /* renamed from: e */
    public float f311085e;

    /* renamed from: f */
    public float f311086f;

    /* renamed from: g */
    public float f311087g;

    /* renamed from: h */
    public float f311088h;

    /* renamed from: i */
    public int[] f311089i;

    /* renamed from: j */
    public float[] f311090j;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetFillStyleActionLinearArg$a */
    public class C104744a implements Parcelable.Creator<RealSetFillStyleActionLinearArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetFillStyleActionLinearArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetFillStyleActionLinearArg[i];
        }
    }

    public RealSetFillStyleActionLinearArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        if (this.f311089i == null || this.f311090j == null) {
            return false;
        }
        dVar.f329745b.setShader(new LinearGradient(this.f311085e, this.f311086f, this.f311087g, this.f311088h, this.f311089i, this.f311090j, Shader.TileMode.CLAMP));
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311085e = parcel.readFloat();
        this.f311086f = parcel.readFloat();
        this.f311087g = parcel.readFloat();
        this.f311088h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f311089i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f311090j = fArr;
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
        if (!(obj instanceof RealSetFillStyleActionLinearArg) || !super.equals(obj)) {
            return false;
        }
        RealSetFillStyleActionLinearArg realSetFillStyleActionLinearArg = (RealSetFillStyleActionLinearArg) obj;
        return Float.compare(realSetFillStyleActionLinearArg.f311085e, this.f311085e) == 0 && Float.compare(realSetFillStyleActionLinearArg.f311086f, this.f311086f) == 0 && Float.compare(realSetFillStyleActionLinearArg.f311087g, this.f311087g) == 0 && Float.compare(realSetFillStyleActionLinearArg.f311088h, this.f311088h) == 0 && Arrays.equals(this.f311089i, realSetFillStyleActionLinearArg.f311089i) && Arrays.equals(this.f311090j, realSetFillStyleActionLinearArg.f311090j);
    }

    public int hashCode() {
        return (((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311085e), Float.valueOf(this.f311086f), Float.valueOf(this.f311087g), Float.valueOf(this.f311088h)}) * 31) + Arrays.hashCode(this.f311089i)) * 31) + Arrays.hashCode(this.f311090j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311085e);
        parcel.writeFloat(this.f311086f);
        parcel.writeFloat(this.f311087g);
        parcel.writeFloat(this.f311088h);
        int[] iArr = this.f311089i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f311089i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f311090j;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f311090j);
            return;
        }
        parcel.writeInt(0);
    }

    public RealSetFillStyleActionLinearArg(Parcel parcel) {
        super(parcel);
    }
}
