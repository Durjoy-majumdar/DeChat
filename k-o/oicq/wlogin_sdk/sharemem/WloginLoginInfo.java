package oicq.wlogin_sdk.sharemem;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class WloginLoginInfo implements Serializable, Parcelable {
    public static final Parcelable.Creator<WloginLoginInfo> CREATOR = new C117787a();
    public static int TYPE_LOACL = 1;
    public static int TYPE_REMOTE = 2;
    private static final long serialVersionUID = 5551948389726789420L;
    public String mAccount;
    public long mAppid;
    public long mCreateTime;
    public int mType;
    public long mUin;

    /* renamed from: oicq.wlogin_sdk.sharemem.WloginLoginInfo$a */
    public class C117787a implements Parcelable.Creator<WloginLoginInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new WloginLoginInfo(parcel, (WloginLoginInfo) null);
        }

        public Object[] newArray(int i) {
            return new WloginLoginInfo[i];
        }
    }

    public WloginLoginInfo(String str, long j, long j2, long j3, int i) {
        this.mAccount = str;
        this.mUin = j;
        this.mAppid = j2;
        this.mCreateTime = j3;
        this.mType = i;
    }

    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mAccount = parcel.readString();
        this.mUin = parcel.readLong();
        this.mAppid = parcel.readLong();
        this.mCreateTime = parcel.readLong();
        this.mType = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mAccount);
        parcel.writeLong(this.mUin);
        parcel.writeLong(this.mAppid);
        parcel.writeLong(this.mCreateTime);
        parcel.writeInt(this.mType);
    }

    private WloginLoginInfo(Parcel parcel) {
        readFromParcel(parcel);
    }

    public /* synthetic */ WloginLoginInfo(Parcel parcel, WloginLoginInfo wloginLoginInfo) {
        this(parcel);
    }
}
