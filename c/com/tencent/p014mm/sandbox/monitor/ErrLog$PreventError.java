package com.tencent.p014mm.sandbox.monitor;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$PreventError */
class ErrLog$PreventError implements Parcelable {
    public static final Parcelable.Creator<ErrLog$PreventError> CREATOR = new C85697a();

    /* renamed from: d */
    public String f249706d;

    /* renamed from: e */
    public String f249707e;

    /* renamed from: f */
    public ErrLog$Error f249708f;

    /* renamed from: g */
    public String f249709g;

    /* renamed from: com.tencent.mm.sandbox.monitor.ErrLog$PreventError$a */
    public class C85697a implements Parcelable.Creator<ErrLog$PreventError> {
        public Object createFromParcel(Parcel parcel) {
            return new ErrLog$PreventError(parcel);
        }

        public Object[] newArray(int i) {
            return new ErrLog$PreventError[i];
        }
    }

    public ErrLog$PreventError(String str, String str2, ErrLog$Error errLog$Error, String str3) {
        this.f249706d = str;
        this.f249707e = str2;
        this.f249708f = errLog$Error;
        this.f249709g = str3;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PreventError{username='" + this.f249706d + '\'' + ", tag='" + this.f249707e + '\'' + ", err=" + this.f249708f + ", processName='" + this.f249709g + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f249706d);
        parcel.writeString(this.f249707e);
        parcel.writeParcelable(this.f249708f, i);
        parcel.writeString(this.f249709g);
    }

    public ErrLog$PreventError(Parcel parcel) {
        this.f249706d = parcel.readString();
        this.f249707e = parcel.readString();
        this.f249708f = (ErrLog$Error) parcel.readParcelable(ErrLog$Error.class.getClassLoader());
        this.f249709g = parcel.readString();
    }
}
