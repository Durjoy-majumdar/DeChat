package com.tencent.p014mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;

/* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData */
public class MultiTalkGroupMemberData implements Parcelable {
    public static final Parcelable.Creator<MultiTalkGroupMemberData> CREATOR = new C105593a();

    /* renamed from: d */
    public MultiTalkGroupMember f314042d;

    /* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupMemberData$a */
    public class C105593a implements Parcelable.Creator<MultiTalkGroupMemberData> {
        public Object createFromParcel(Parcel parcel) {
            MultiTalkGroupMember multiTalkGroupMember = new MultiTalkGroupMember();
            multiTalkGroupMember.f320048d = Util.nullAs(parcel.readString(), "");
            multiTalkGroupMember.f320049e = Util.nullAs(parcel.readString(), "");
            multiTalkGroupMember.f320050f = parcel.readInt();
            multiTalkGroupMember.f320051g = parcel.readInt();
            multiTalkGroupMember.f320052h = parcel.readInt();
            return new MultiTalkGroupMemberData(multiTalkGroupMember);
        }

        public Object[] newArray(int i) {
            return new MultiTalkGroupMemberData[i];
        }
    }

    public MultiTalkGroupMemberData(MultiTalkGroupMember multiTalkGroupMember) {
        this.f314042d = multiTalkGroupMember;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Util.nullAs(this.f314042d.f320048d, ""));
        parcel.writeString(Util.nullAs(this.f314042d.f320049e, ""));
        parcel.writeInt(this.f314042d.f320050f);
        parcel.writeInt(this.f314042d.f320051g);
        parcel.writeInt(this.f314042d.f320052h);
    }
}
