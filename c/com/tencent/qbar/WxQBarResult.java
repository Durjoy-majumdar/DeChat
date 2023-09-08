package com.tencent.qbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.qbar.C19931a;

public class WxQBarResult extends C19931a.C19932a implements Parcelable {
    public static final Parcelable.Creator<WxQBarResult> CREATOR = new C19930a();

    /* renamed from: j */
    public int f56823j = 0;

    /* renamed from: n */
    public WxQBarPoint f56824n;

    /* renamed from: com.tencent.qbar.WxQBarResult$a */
    public class C19930a implements Parcelable.Creator<WxQBarResult> {
        public Object createFromParcel(Parcel parcel) {
            return new WxQBarResult(parcel);
        }

        public Object[] newArray(int i) {
            return new WxQBarResult[i];
        }
    }

    public WxQBarResult(int i, String str, String str2, byte[] bArr, String str3, int i2) {
        this.f56827d = i;
        this.f56828e = str;
        this.f56829f = str2;
        this.f56830g = bArr;
        this.f56831h = str3;
        this.f56832i = i2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f56827d);
        parcel.writeString(this.f56828e);
        parcel.writeString(this.f56829f);
        parcel.writeByteArray(this.f56830g);
        parcel.writeString(this.f56831h);
        parcel.writeInt(this.f56823j);
        parcel.writeParcelable(this.f56824n, i);
        parcel.writeInt(this.f56832i);
    }

    public WxQBarResult(Parcel parcel) {
        this.f56827d = parcel.readInt();
        this.f56828e = parcel.readString();
        this.f56829f = parcel.readString();
        parcel.readByteArray(this.f56830g);
        this.f56831h = parcel.readString();
        this.f56823j = parcel.readInt();
        this.f56824n = (WxQBarPoint) parcel.readParcelable(WxQBarPoint.class.getClassLoader());
        this.f56832i = parcel.readInt();
    }
}
