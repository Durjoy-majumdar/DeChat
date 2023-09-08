package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.graphics.Canvas;
import android.os.Parcel;
import pi0.C110229d;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg */
public abstract class BaseDrawActionArg implements DrawActionArg {

    /* renamed from: d */
    public String f311050d;

    public BaseDrawActionArg(Parcel parcel, Object obj) {
        this.f311050d = parcel.readString();
    }

    /* renamed from: a */
    public boolean mo148409a(C110229d dVar, Canvas canvas) {
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof BaseDrawActionArg) {
            String str = this.f311050d;
            String str2 = ((BaseDrawActionArg) obj).f311050d;
            if (str == str2) {
                return true;
            }
            return str != null && str.equals(str2);
        }
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return String.format("method %s", new Object[]{this.f311050d});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
    }

    public BaseDrawActionArg() {
    }

    @Deprecated
    public BaseDrawActionArg(Parcel parcel) {
        mo148410b(parcel);
    }
}
