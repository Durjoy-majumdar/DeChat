package com.tencent.p014mm.storage.emotion;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C38591j8;

/* renamed from: com.tencent.mm.storage.emotion.SmileyInfo */
public class SmileyInfo extends C38591j8 implements Parcelable {
    public static final Parcelable.Creator<SmileyInfo> CREATOR = new C30736a();

    /* renamed from: F */
    public static IAutoDBItem.MAutoDBInfo f82660F = C38591j8.initAutoDBInfo(SmileyInfo.class);

    /* renamed from: com.tencent.mm.storage.emotion.SmileyInfo$a */
    public class C30736a implements Parcelable.Creator<SmileyInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new SmileyInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new SmileyInfo[i];
        }
    }

    public SmileyInfo() {
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return null;
    }

    public String toString() {
        return "key:" + this.field_key + "/n" + "cn:" + this.field_cnValue + "/n" + "qq:" + this.field_qqValue + "/n" + "en:" + this.field_enValue + "/n" + "th:" + this.field_thValue + "/n" + "tw:" + this.field_twValue + "/n" + "position:" + this.field_position + "/n" + "file Name:" + this.field_fileName + "/n" + "egg index:" + this.field_eggIndex + "/n";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_key);
        parcel.writeString(this.field_cnValue);
        parcel.writeString(this.field_qqValue);
        parcel.writeString(this.field_twValue);
        parcel.writeString(this.field_enValue);
        parcel.writeString(this.field_thValue);
        parcel.writeString(this.field_fileName);
        parcel.writeInt(this.field_position);
        parcel.writeInt(this.field_eggIndex);
        parcel.writeInt(this.field_flag);
    }

    public SmileyInfo(Parcel parcel) {
        this.field_key = parcel.readString();
        this.field_cnValue = parcel.readString();
        this.field_qqValue = parcel.readString();
        this.field_twValue = parcel.readString();
        this.field_enValue = parcel.readString();
        this.field_thValue = parcel.readString();
        this.field_fileName = parcel.readString();
        this.field_position = parcel.readInt();
        this.field_eggIndex = parcel.readInt();
        this.field_flag = parcel.readInt();
    }

    public SmileyInfo(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        this.field_key = str;
        this.field_cnValue = str3;
        this.field_qqValue = str2;
        this.field_enValue = str5;
        this.field_thValue = str6;
        this.field_twValue = str4;
        this.field_position = i;
    }

    public SmileyInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        this.field_key = str;
        this.field_cnValue = str3;
        this.field_qqValue = str2;
        this.field_enValue = str5;
        this.field_thValue = str6;
        this.field_twValue = str4;
        this.field_fileName = str7;
        this.field_eggIndex = i;
    }
}
