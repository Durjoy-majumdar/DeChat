package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg */
public class SetStrokeStyleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetStrokeStyleActionArg> CREATOR = new C104769a();

    /* renamed from: e */
    public RealSetStrokeStyleActionArg f311138e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetStrokeStyleActionArg$a */
    public class C104769a implements Parcelable.Creator<SetStrokeStyleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetStrokeStyleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetStrokeStyleActionArg[i];
        }
    }

    public SetStrokeStyleActionArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        RealSetStrokeStyleActionArg realSetStrokeStyleActionArg = this.f311138e;
        if (realSetStrokeStyleActionArg == null) {
            return false;
        }
        return realSetStrokeStyleActionArg.mo148409a(dVar, canvas);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311138e = (RealSetStrokeStyleActionArg) parcel.readParcelable(SetStrokeStyleActionArg.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetStrokeStyleActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311138e, ((SetStrokeStyleActionArg) obj).f311138e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311138e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeParcelable(this.f311138e, i);
    }

    public SetStrokeStyleActionArg(Parcel parcel) {
        super(parcel);
    }
}
