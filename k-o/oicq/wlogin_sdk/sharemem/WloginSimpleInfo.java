package oicq.wlogin_sdk.sharemem;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class WloginSimpleInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<WloginSimpleInfo> CREATOR = new C117788a();
    private static final long serialVersionUID = 1;
    public byte[] _age;
    public byte[] _face;
    public byte[] _gender;
    public byte[] _nick;
    public long _uin;

    /* renamed from: oicq.wlogin_sdk.sharemem.WloginSimpleInfo$a */
    public class C117788a implements Parcelable.Creator<WloginSimpleInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new WloginSimpleInfo(parcel, (WloginSimpleInfo) null);
        }

        public Object[] newArray(int i) {
            return new WloginSimpleInfo[i];
        }
    }

    public WloginSimpleInfo(long j, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this._uin = j;
        this._face = (byte[]) bArr.clone();
        this._age = (byte[]) bArr2.clone();
        this._gender = (byte[]) bArr3.clone();
        this._nick = (byte[]) bArr4.clone();
    }

    public int describeContents() {
        return 0;
    }

    public void get_clone(WloginSimpleInfo wloginSimpleInfo) {
        this._uin = wloginSimpleInfo._uin;
        this._face = (byte[]) wloginSimpleInfo._face.clone();
        this._age = (byte[]) wloginSimpleInfo._age.clone();
        this._gender = (byte[]) wloginSimpleInfo._gender.clone();
        this._nick = (byte[]) wloginSimpleInfo._nick.clone();
    }

    public void readFromParcel(Parcel parcel) {
        this._uin = parcel.readLong();
        this._face = parcel.createByteArray();
        this._age = parcel.createByteArray();
        this._gender = parcel.createByteArray();
        this._nick = parcel.createByteArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this._uin);
        parcel.writeByteArray(this._face);
        parcel.writeByteArray(this._age);
        parcel.writeByteArray(this._gender);
        parcel.writeByteArray(this._nick);
    }

    public WloginSimpleInfo get_clone() {
        WloginSimpleInfo wloginSimpleInfo = new WloginSimpleInfo();
        wloginSimpleInfo._uin = this._uin;
        wloginSimpleInfo._face = (byte[]) this._face.clone();
        wloginSimpleInfo._age = (byte[]) this._age.clone();
        wloginSimpleInfo._gender = (byte[]) this._gender.clone();
        wloginSimpleInfo._nick = (byte[]) this._nick.clone();
        return wloginSimpleInfo;
    }

    public WloginSimpleInfo() {
        this._uin = 0;
        this._face = new byte[0];
        this._age = new byte[0];
        this._gender = new byte[0];
        this._nick = new byte[0];
    }

    private WloginSimpleInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public /* synthetic */ WloginSimpleInfo(Parcel parcel, WloginSimpleInfo wloginSimpleInfo) {
        this(parcel);
    }
}
