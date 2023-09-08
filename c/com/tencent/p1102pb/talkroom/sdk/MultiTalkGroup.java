package com.tencent.p1102pb.talkroom.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import bs3.C104161b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.pb.talkroom.sdk.MultiTalkGroup */
public class MultiTalkGroup implements Parcelable {
    public static final Parcelable.Creator<MultiTalkGroup> CREATOR = new C106880a();

    /* renamed from: d */
    public String f320042d = "";

    /* renamed from: e */
    public String f320043e = "";

    /* renamed from: f */
    public String f320044f = "";

    /* renamed from: g */
    public int f320045g;

    /* renamed from: h */
    public String f320046h = "";

    /* renamed from: i */
    public List<MultiTalkGroupMember> f320047i = new ArrayList();

    /* renamed from: com.tencent.pb.talkroom.sdk.MultiTalkGroup$a */
    public static class C106880a implements Parcelable.Creator<MultiTalkGroup> {
        public Object createFromParcel(Parcel parcel) {
            MultiTalkGroup multiTalkGroup = new MultiTalkGroup();
            multiTalkGroup.f320042d = parcel.readString();
            multiTalkGroup.f320043e = parcel.readString();
            multiTalkGroup.f320044f = parcel.readString();
            multiTalkGroup.f320045g = parcel.readInt();
            multiTalkGroup.f320046h = parcel.readString();
            int readInt = parcel.readInt();
            multiTalkGroup.f320047i = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                MultiTalkGroupMember multiTalkGroupMember = (MultiTalkGroupMember) parcel.readParcelable(MultiTalkGroupMember.class.getClassLoader());
                if (multiTalkGroupMember != null) {
                    multiTalkGroup.f320047i.add(multiTalkGroupMember);
                } else {
                    C104161b.m138993b("MultiTalkGroup", "CLTNOT readParcelable member = null");
                }
            }
            return multiTalkGroup;
        }

        public Object[] newArray(int i) {
            return new MultiTalkGroup[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MultiTalkGroup [mMultiTalkGroupId=" + this.f320042d + ", mMultiTalkClientGroupId=" + this.f320043e + ", mWxGroupId=" + this.f320044f + ", mRouteId=" + this.f320045g + ", mCreatorUsrName=" + this.f320046h + ", mMultiTalkGroupMemberList=" + this.f320047i + "]";
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str = this.f320042d;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        parcel.writeString(str);
        String str3 = this.f320043e;
        if (str3 == null) {
            str3 = str2;
        }
        parcel.writeString(str3);
        String str4 = this.f320044f;
        if (str4 == null) {
            str4 = str2;
        }
        parcel.writeString(str4);
        parcel.writeInt(this.f320045g);
        String str5 = this.f320046h;
        if (str5 != null) {
            str2 = str5;
        }
        parcel.writeString(str2);
        List<MultiTalkGroupMember> list = this.f320047i;
        int size = list == null ? 0 : list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f320047i.get(i2), i);
        }
    }
}
