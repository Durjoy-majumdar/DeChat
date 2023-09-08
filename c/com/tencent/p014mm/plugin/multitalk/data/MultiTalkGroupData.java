package com.tencent.p014mm.plugin.multitalk.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData */
public class MultiTalkGroupData implements Parcelable {
    public static final Parcelable.Creator<MultiTalkGroupData> CREATOR = new C105592a();

    /* renamed from: d */
    public MultiTalkGroup f314041d;

    /* renamed from: com.tencent.mm.plugin.multitalk.data.MultiTalkGroupData$a */
    public class C105592a implements Parcelable.Creator<MultiTalkGroupData> {
        public Object createFromParcel(Parcel parcel) {
            MultiTalkGroup multiTalkGroup = new MultiTalkGroup();
            multiTalkGroup.f320042d = Util.nullAs(parcel.readString(), "");
            multiTalkGroup.f320043e = Util.nullAs(parcel.readString(), "");
            multiTalkGroup.f320044f = Util.nullAs(parcel.readString(), "");
            multiTalkGroup.f320045g = parcel.readInt();
            multiTalkGroup.f320046h = Util.nullAs(parcel.readString(), "");
            int readInt = parcel.readInt();
            multiTalkGroup.f320047i = new ArrayList();
            for (int i = 0; i < readInt; i++) {
                multiTalkGroup.f320047i.add(((MultiTalkGroupMemberData) parcel.readParcelable(MultiTalkGroupMemberData.class.getClassLoader())).f314042d);
            }
            return new MultiTalkGroupData(multiTalkGroup);
        }

        public Object[] newArray(int i) {
            return new MultiTalkGroupData[i];
        }
    }

    public MultiTalkGroupData() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Util.nullAs(this.f314041d.f320042d, ""));
        parcel.writeString(Util.nullAs(this.f314041d.f320043e, ""));
        parcel.writeString(Util.nullAs(this.f314041d.f320044f, ""));
        parcel.writeInt(this.f314041d.f320045g);
        parcel.writeString(Util.nullAs(this.f314041d.f320046h, ""));
        parcel.writeInt(this.f314041d.f320047i.size());
        for (int i2 = 0; i2 < this.f314041d.f320047i.size(); i2++) {
            parcel.writeParcelable(new MultiTalkGroupMemberData(this.f314041d.f320047i.get(i2)), i);
        }
    }

    public MultiTalkGroupData(MultiTalkGroup multiTalkGroup) {
        this.f314041d = multiTalkGroup;
    }
}
