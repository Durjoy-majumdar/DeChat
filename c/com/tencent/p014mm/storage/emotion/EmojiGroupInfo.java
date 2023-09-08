package com.tencent.p014mm.storage.emotion;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p248ug.C102028f0;
import p749xh.C102675w1;
import te3.C101824o80;

/* renamed from: com.tencent.mm.storage.emotion.EmojiGroupInfo */
public class EmojiGroupInfo extends C102675w1 implements Parcelable, C102028f0 {
    public static final Parcelable.Creator<EmojiGroupInfo> CREATOR = new C96981a();

    /* renamed from: h1 */
    public static IAutoDBItem.MAutoDBInfo f284122h1 = C102675w1.initAutoDBInfo(EmojiGroupInfo.class);

    /* renamed from: com.tencent.mm.storage.emotion.EmojiGroupInfo$a */
    public class C96981a implements Parcelable.Creator<EmojiGroupInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new EmojiGroupInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new EmojiGroupInfo[i];
        }
    }

    public EmojiGroupInfo() {
    }

    /* renamed from: d */
    public void mo135599d(int i) {
        this.field_status = i;
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f284122h1;
    }

    /* renamed from: l2 */
    public C101824o80 mo135601l2() {
        C101824o80 o802 = new C101824o80();
        o802.f298994d = this.field_productID;
        o802.f298995e = this.field_packGrayIconUrl;
        o802.f298996f = this.field_packName;
        o802.f298997g = this.field_packDesc;
        o802.f298998h = this.field_packAuthInfo;
        String str = this.field_packPrice;
        o802.f298999i = str;
        o802.f299000j = this.field_packType;
        o802.f299001n = this.field_packFlag;
        o802.f299002o = this.field_packCoverUrl;
        o802.f299003p = (int) this.field_packExpire;
        o802.f299004q = this.field_packCopyright;
        o802.f299005r = (int) this.field_packTimeStamp;
        o802.f299007t = str;
        return o802;
    }

    /* renamed from: m2 */
    public void mo135602m2(String str) {
        this.field_packGrayIconUrl = str;
    }

    /* renamed from: n2 */
    public void mo135603n2(long j) {
        this.field_lastUseTime = j;
    }

    /* renamed from: o2 */
    public void mo135604o2(String str) {
        this.field_packIconUrl = str;
    }

    /* renamed from: p2 */
    public void mo135605p2(String str) {
        this.field_packName = str;
    }

    /* renamed from: q2 */
    public void mo135606q2(int i) {
        this.field_packStatus = i;
    }

    /* renamed from: r2 */
    public void mo135607r2(String str) {
        this.field_productID = str;
    }

    public void setType(int i) {
        this.field_type = i;
    }

    public String toString() {
        return "field_productID:" + this.field_productID + "\n" + "field_packIconUrl:" + this.field_packIconUrl + "\n" + "field_packGrayIconUrl:" + this.field_packGrayIconUrl + "\n" + "field_packCoverUrl:" + this.field_packCoverUrl + "\n" + "field_packName:" + this.field_packName + "\n" + "field_packDesc:" + this.field_packDesc + "\n" + "field_packAuthInfo:" + this.field_packAuthInfo + "\n" + "field_packPrice:" + this.field_packPrice + "\n" + "field_packType:" + this.field_packType + "\n" + "field_packFlag:" + this.field_packFlag + "\n" + "field_packExpire:" + this.field_packExpire + "\n" + "field_packTimeStamp:" + this.field_packTimeStamp + "\n" + "field_packCopyright:" + this.field_packCopyright + "\n" + "field_type:" + this.field_type + "\n" + "field_status:" + this.field_status + "\n" + "field_sort:" + this.field_sort + "\n" + "field_lastUseTime:" + this.field_lastUseTime + "\n" + "field_packStatus:" + this.field_packStatus + "\n" + "field_recommand:" + this.field_recommand + "\n" + "field_sync:" + this.field_sync + "\n" + "field_idx:" + this.field_idx + "\n" + "field_BigIconUrl:" + this.field_BigIconUrl + "\n" + "field_MutiLanName:" + this.field_MutiLanName + "\n" + "field_count:" + this.field_count + "\n";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_productID);
        parcel.writeString(this.field_packIconUrl);
        parcel.writeString(this.field_packGrayIconUrl);
        parcel.writeString(this.field_packCoverUrl);
        parcel.writeString(this.field_packName);
        parcel.writeString(this.field_packDesc);
        parcel.writeString(this.field_packAuthInfo);
        parcel.writeString(this.field_packPrice);
        parcel.writeInt(this.field_packType);
        parcel.writeInt(this.field_packFlag);
        parcel.writeLong(this.field_packExpire);
        parcel.writeLong(this.field_packTimeStamp);
        parcel.writeString(this.field_packCopyright);
        parcel.writeInt(this.field_type);
        parcel.writeInt(this.field_status);
        parcel.writeInt(this.field_sort);
        parcel.writeLong(this.field_lastUseTime);
        parcel.writeInt(this.field_packStatus);
        parcel.writeInt(this.field_flag);
        parcel.writeInt(this.field_recommand);
        parcel.writeInt(this.field_sync);
        parcel.writeInt(this.field_idx);
        parcel.writeString(this.field_BigIconUrl);
        parcel.writeString(this.field_MutiLanName);
        parcel.writeInt(this.field_recommandType);
        parcel.writeString(this.field_lang);
        parcel.writeString(this.field_recommandWord);
        parcel.writeInt(this.field_buttonType);
        parcel.writeInt(this.field_count);
        parcel.writeLong(this.systemRowid);
        parcel.writeString(this.field_ipKey);
    }

    public EmojiGroupInfo(Parcel parcel) {
        this.field_productID = parcel.readString();
        this.field_packIconUrl = parcel.readString();
        this.field_packGrayIconUrl = parcel.readString();
        this.field_packCoverUrl = parcel.readString();
        this.field_packName = parcel.readString();
        this.field_packDesc = parcel.readString();
        this.field_packAuthInfo = parcel.readString();
        this.field_packPrice = parcel.readString();
        this.field_packType = parcel.readInt();
        this.field_packFlag = parcel.readInt();
        this.field_packExpire = parcel.readLong();
        this.field_packTimeStamp = parcel.readLong();
        this.field_packCopyright = parcel.readString();
        this.field_type = parcel.readInt();
        this.field_status = parcel.readInt();
        this.field_sort = parcel.readInt();
        this.field_lastUseTime = parcel.readLong();
        this.field_packStatus = parcel.readInt();
        this.field_flag = parcel.readInt();
        this.field_recommand = parcel.readInt();
        this.field_sync = parcel.readInt();
        this.field_idx = parcel.readInt();
        this.field_BigIconUrl = parcel.readString();
        this.field_MutiLanName = parcel.readString();
        this.field_recommandType = parcel.readInt();
        this.field_lang = parcel.readString();
        this.field_recommandWord = parcel.readString();
        this.field_buttonType = parcel.readInt();
        this.field_count = parcel.readInt();
        this.systemRowid = parcel.readLong();
        this.field_ipKey = parcel.readString();
    }
}
