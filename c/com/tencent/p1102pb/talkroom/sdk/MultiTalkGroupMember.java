package com.tencent.p1102pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.tencent.pb.talkroom.sdk.MultiTalkGroupMember */
public class MultiTalkGroupMember implements Parcelable {
    public static final Parcelable.Creator<MultiTalkGroupMember> CREATOR = new C106881a();

    /* renamed from: d */
    public String f320048d = "";

    /* renamed from: e */
    public String f320049e = "";

    /* renamed from: f */
    public int f320050f;

    /* renamed from: g */
    public int f320051g;

    /* renamed from: h */
    public int f320052h;

    /* renamed from: com.tencent.pb.talkroom.sdk.MultiTalkGroupMember$a */
    public static class C106881a implements Parcelable.Creator<MultiTalkGroupMember> {
        public Object createFromParcel(Parcel parcel) {
            MultiTalkGroupMember multiTalkGroupMember = new MultiTalkGroupMember();
            multiTalkGroupMember.f320048d = parcel.readString();
            multiTalkGroupMember.f320049e = parcel.readString();
            multiTalkGroupMember.f320050f = parcel.readInt();
            multiTalkGroupMember.f320051g = parcel.readInt();
            multiTalkGroupMember.f320052h = parcel.readInt();
            return multiTalkGroupMember;
        }

        public Object[] newArray(int i) {
            return new MultiTalkGroupMember[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MultiTalkGroupMember [usrName=" + this.f320048d + ", inviteUsrName=" + this.f320049e + ", status=" + this.f320050f + ", reason=" + this.f320051g + ", inviteTime=" + this.f320052h + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.f320048d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        parcel.writeString(str);
        String str3 = this.f320049e;
        if (str3 != null) {
            str2 = str3;
        }
        parcel.writeString(str2);
        parcel.writeInt(this.f320050f);
        parcel.writeInt(this.f320051g);
        parcel.writeInt(this.f320052h);
    }
}
