package com.tencent.p014mm.plugin.finder.feed.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import te3.C51270sn1;

/* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderParcelTopicInfo */
public class FinderParcelTopicInfo implements Parcelable {
    public static final Parcelable.Creator<FinderParcelTopicInfo> CREATOR = new C2727a();

    /* renamed from: d */
    public C51270sn1 f13764d;

    /* renamed from: com.tencent.mm.plugin.finder.feed.model.FinderParcelTopicInfo$a */
    public class C2727a implements Parcelable.Creator<FinderParcelTopicInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new FinderParcelTopicInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new FinderParcelTopicInfo[i];
        }
    }

    public FinderParcelTopicInfo(C51270sn1 sn12) {
        this.f13764d = sn12;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        try {
            byte[] byteArray = this.f13764d.toByteArray();
            parcel.writeInt(byteArray.length);
            parcel.writeByteArray(byteArray);
        } catch (IOException unused) {
        }
    }

    public FinderParcelTopicInfo(Parcel parcel) {
        this.f13764d = new C51270sn1();
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        try {
            this.f13764d.parseFrom(bArr);
        } catch (IOException unused) {
        }
    }
}
