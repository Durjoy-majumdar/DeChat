package com.tencent.p014mm.storage.emotion;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38599k8;

/* renamed from: com.tencent.mm.storage.emotion.SmileyPanelConfigInfo */
public class SmileyPanelConfigInfo extends C38599k8 implements Parcelable {
    public static final Parcelable.Creator<SmileyPanelConfigInfo> CREATOR = new C30737a();

    /* renamed from: p */
    public static IAutoDBItem.MAutoDBInfo f82661p = C38599k8.initAutoDBInfo(SmileyPanelConfigInfo.class);

    /* renamed from: com.tencent.mm.storage.emotion.SmileyPanelConfigInfo$a */
    public class C30737a implements Parcelable.Creator<SmileyPanelConfigInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new SmileyPanelConfigInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new SmileyPanelConfigInfo[i];
        }
    }

    public SmileyPanelConfigInfo(Parcel parcel) {
        this.field_position = parcel.readInt();
        this.field_key = parcel.readString();
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }

    public String toString() {
        return "index:" + this.field_position + "key  :" + this.field_key;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.field_position);
        parcel.writeString(this.field_key);
    }

    public SmileyPanelConfigInfo() {
    }

    public SmileyPanelConfigInfo(int i, String str) {
        this.field_position = i;
        this.field_key = str;
    }
}
