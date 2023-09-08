package com.tencent.p014mm.plugin.wxpaysdk.api;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo */
public class ResendMsgInfo implements Parcelable {
    public static final Parcelable.Creator<ResendMsgInfo> CREATOR = new C72669a();

    /* renamed from: d */
    public String f211425d;

    /* renamed from: e */
    public String f211426e;

    /* renamed from: f */
    public String f211427f;

    /* renamed from: g */
    public String f211428g;

    /* renamed from: h */
    public String f211429h;

    /* renamed from: com.tencent.mm.plugin.wxpaysdk.api.ResendMsgInfo$a */
    public class C72669a implements Parcelable.Creator<ResendMsgInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ResendMsgInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ResendMsgInfo[i];
        }
    }

    public ResendMsgInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ResendMsgInfo{title='" + this.f211425d + '\'' + ", pic='" + this.f211426e + '\'' + ", description='" + this.f211427f + '\'' + ", left_button_wording='" + this.f211428g + '\'' + ", right_button_wording='" + this.f211429h + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f211425d);
        parcel.writeString(this.f211426e);
        parcel.writeString(this.f211427f);
        parcel.writeString(this.f211428g);
        parcel.writeString(this.f211429h);
    }

    public ResendMsgInfo(Parcel parcel) {
        this.f211425d = parcel.readString();
        this.f211426e = parcel.readString();
        this.f211427f = parcel.readString();
        this.f211428g = parcel.readString();
        this.f211429h = parcel.readString();
    }
}
