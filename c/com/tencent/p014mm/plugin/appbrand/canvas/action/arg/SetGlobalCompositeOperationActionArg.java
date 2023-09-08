package com.tencent.p014mm.plugin.appbrand.canvas.action.arg;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg */
public class SetGlobalCompositeOperationActionArg extends BaseDrawActionArg {
    public static final Parcelable.Creator<SetGlobalCompositeOperationActionArg> CREATOR = new C104762a();

    /* renamed from: e */
    public String f311123e;

    /* renamed from: com.tencent.mm.plugin.appbrand.canvas.action.arg.SetGlobalCompositeOperationActionArg$a */
    public class C104762a implements Parcelable.Creator<SetGlobalCompositeOperationActionArg> {
        public Object createFromParcel(Parcel parcel) {
            return new SetGlobalCompositeOperationActionArg(parcel);
        }

        public Object[] newArray(int i) {
            return new SetGlobalCompositeOperationActionArg[i];
        }
    }

    public SetGlobalCompositeOperationActionArg(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: b */
    public void mo148410b(Parcel parcel) {
        this.f311050d = parcel.readString();
        this.f311123e = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SetGlobalCompositeOperationActionArg) && super.equals(obj)) {
            return Objects.equals(this.f311123e, ((SetGlobalCompositeOperationActionArg) obj).f311123e);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f311123e});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f311050d);
        parcel.writeString(this.f311123e);
    }

    public SetGlobalCompositeOperationActionArg() {
    }
}
