package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg */
public class SetFillStyleActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetFillStyleActionArg> CREATOR = new C104755a();

    /* renamed from: e */
    public RealSetFillStyleActionArg f311115e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetFillStyleActionArg$a */
    public class C104755a implements Parcelable.Creator<SetFillStyleActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetFillStyleActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetFillStyleActionArg[i];
        }
    }

    public SetFillStyleActionArg() {
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        RealSetFillStyleActionArg realSetFillStyleActionArg = this.f311115e;
        if (realSetFillStyleActionArg == null) {
            return false;
        }
        return realSetFillStyleActionArg.mo148409a(dVar, canvas);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311115e = (RealSetFillStyleActionArg) parcel.readParcelable(SetFillStyleActionArg.class.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetFillStyleActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311115e, ((SetFillStyleActionArg) obj).f311115e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311115e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeParcelable(this.f311115e, i);
    }

    public SetFillStyleActionArg(Parcel parcel) {
        super(parcel);
    }
}
