package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg */
public class RealSetStrokeStyleActionLinearArg extends RealSetStrokeStyleActionArg {
    public static final Parcelable.Creator<RealSetStrokeStyleActionLinearArg> CREATOR = new C104749a();

    /* renamed from: e */
    public float f311099e;

    /* renamed from: f */
    public float f311100f;

    /* renamed from: g */
    public float f311101g;

    /* renamed from: h */
    public float f311102h;

    /* renamed from: i */
    public int[] f311103i;

    /* renamed from: j */
    public float[] f311104j;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.RealSetStrokeStyleActionLinearArg$a */
    public class C104749a implements Parcelable.Creator<RealSetStrokeStyleActionLinearArg> {
        public Object createFromParcel(Parcel parcel) {
            return new RealSetStrokeStyleActionLinearArg(parcel);
        }

        public Object[] newArray(int i) {
            return new RealSetStrokeStyleActionLinearArg[i];
        }
    }

    public RealSetStrokeStyleActionLinearArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        if (this.f311103i == null || this.f311104j == null) {
            return false;
        }
        dVar.f329744a.setShader(new LinearGradient(this.f311099e, this.f311100f, this.f311101g, this.f311102h, this.f311103i, this.f311104j, Shader.TileMode.CLAMP));
        return true;
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311099e = parcel.readFloat();
        this.f311100f = parcel.readFloat();
        this.f311101g = parcel.readFloat();
        this.f311102h = parcel.readFloat();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f311103i = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            float[] fArr = new float[readInt2];
            this.f311104j = fArr;
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
        if (!(obj instanceof RealSetStrokeStyleActionLinearArg) || !super.equals(obj)) {
            return false;
        }
        RealSetStrokeStyleActionLinearArg realSetStrokeStyleActionLinearArg = (RealSetStrokeStyleActionLinearArg) obj;
        return Float.compare(realSetStrokeStyleActionLinearArg.f311099e, this.f311099e) == 0 && Float.compare(realSetStrokeStyleActionLinearArg.f311100f, this.f311100f) == 0 && Float.compare(realSetStrokeStyleActionLinearArg.f311101g, this.f311101g) == 0 && Float.compare(realSetStrokeStyleActionLinearArg.f311102h, this.f311102h) == 0 && Arrays.equals(this.f311103i, realSetStrokeStyleActionLinearArg.f311103i) && Arrays.equals(this.f311104j, realSetStrokeStyleActionLinearArg.f311104j);
    }

    public int hashCode() {
        return (((Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), Float.valueOf(this.f311099e), Float.valueOf(this.f311100f), Float.valueOf(this.f311101g), Float.valueOf(this.f311102h)}) * 31) + Arrays.hashCode(this.f311103i)) * 31) + Arrays.hashCode(this.f311104j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeFloat(this.f311099e);
        parcel.writeFloat(this.f311100f);
        parcel.writeFloat(this.f311101g);
        parcel.writeFloat(this.f311102h);
        int[] iArr = this.f311103i;
        if (iArr != null) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f311103i);
        } else {
            parcel.writeInt(0);
        }
        float[] fArr = this.f311104j;
        if (fArr != null) {
            parcel.writeInt(fArr.length);
            parcel.writeFloatArray(this.f311104j);
            return;
        }
        parcel.writeInt(0);
    }

    public RealSetStrokeStyleActionLinearArg(Parcel parcel) {
        super(parcel);
    }
}
