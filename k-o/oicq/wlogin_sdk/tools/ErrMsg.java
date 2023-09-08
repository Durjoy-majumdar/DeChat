package oicq.wlogin_sdk.tools;

import android.os.Parcel;
import android.os.Parcelable;

public class ErrMsg implements Cloneable, Parcelable {
    public static final Parcelable.Creator<ErrMsg> CREATOR = new C117789a();

    /* renamed from: d */
    public int f352322d;

    /* renamed from: e */
    public String f352323e;

    /* renamed from: f */
    public String f352324f;

    /* renamed from: g */
    public String f352325g;

    /* renamed from: oicq.wlogin_sdk.tools.ErrMsg$a */
    public class C117789a implements Parcelable.Creator<ErrMsg> {
        public Object createFromParcel(Parcel parcel) {
            return new ErrMsg(parcel, (ErrMsg) null);
        }

        public Object[] newArray(int i) {
            return new ErrMsg[i];
        }
    }

    public ErrMsg() {
        this.f352322d = 0;
        this.f352323e = "";
        this.f352324f = "";
        this.f352325g = "";
    }

    public Object clone() {
        return super.clone();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f352322d);
        parcel.writeString(this.f352323e);
        parcel.writeString(this.f352324f);
        parcel.writeString(this.f352325g);
    }

    public ErrMsg(Parcel parcel, ErrMsg errMsg) {
        this.f352322d = parcel.readInt();
        this.f352323e = parcel.readString();
        this.f352324f = parcel.readString();
        this.f352325g = parcel.readString();
    }
}
