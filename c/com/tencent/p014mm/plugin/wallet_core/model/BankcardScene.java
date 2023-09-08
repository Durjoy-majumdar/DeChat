package com.tencent.p014mm.plugin.wallet_core.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import b63.C67176b;
import b63.C67183e;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import p749xh.C78820m9;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.BankcardScene */
public class BankcardScene extends C78820m9 implements Parcelable {
    public static final Parcelable.Creator<BankcardScene> CREATOR = new C72173a();

    /* renamed from: Q2 */
    public static IAutoDBItem.MAutoDBInfo f209432Q2 = C78820m9.initAutoDBInfo(BankcardScene.class);

    /* renamed from: A2 */
    public long f209433A2;

    /* renamed from: B2 */
    public long f209434B2;

    /* renamed from: C2 */
    public long f209435C2;

    /* renamed from: D2 */
    public String f209436D2;

    /* renamed from: E2 */
    public int f209437E2;

    /* renamed from: F2 */
    public int f209438F2;

    /* renamed from: G2 */
    public String f209439G2;

    /* renamed from: H2 */
    public String f209440H2;

    /* renamed from: I2 */
    public int f209441I2;

    /* renamed from: J2 */
    public String f209442J2;

    /* renamed from: K2 */
    public long f209443K2;

    /* renamed from: L2 */
    public String f209444L2;

    /* renamed from: M2 */
    public String f209445M2;

    /* renamed from: N2 */
    public String f209446N2;

    /* renamed from: O2 */
    public String f209447O2;

    /* renamed from: P2 */
    public String f209448P2;

    /* renamed from: h2 */
    public String f209449h2;

    /* renamed from: i2 */
    public String f209450i2;

    /* renamed from: j2 */
    public String f209451j2;

    /* renamed from: k2 */
    public String f209452k2;

    /* renamed from: l2 */
    public String f209453l2;

    /* renamed from: m2 */
    public String f209454m2;

    /* renamed from: n2 */
    public double f209455n2;

    /* renamed from: o2 */
    public String f209456o2;

    /* renamed from: p2 */
    public double f209457p2;

    /* renamed from: q2 */
    public String f209458q2;

    /* renamed from: r2 */
    public String f209459r2;

    /* renamed from: s2 */
    public String f209460s2;

    /* renamed from: t2 */
    public String f209461t2;

    /* renamed from: u2 */
    public String f209462u2;

    /* renamed from: v2 */
    public C67176b f209463v2;

    /* renamed from: w2 */
    public int f209464w2;

    /* renamed from: x2 */
    public String f209465x2;

    /* renamed from: y2 */
    public boolean f209466y2;

    /* renamed from: z2 */
    public C67183e f209467z2;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.BankcardScene$a */
    public class C72173a implements Parcelable.Creator<BankcardScene> {
        public Object createFromParcel(Parcel parcel) {
            return new BankcardScene(parcel);
        }

        public Object[] newArray(int i) {
            return new BankcardScene[i];
        }
    }

    public BankcardScene() {
        this.f209454m2 = null;
        this.f209465x2 = null;
        this.f209466y2 = false;
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public ContentValues convertTo() {
        ContentValues convertTo = super.convertTo();
        convertTo.remove("fakePk");
        return convertTo;
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f209432Q2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_bankName);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_bankcardType);
        parcel.writeString(this.field_bindSerial);
        parcel.writeInt(this.field_cardType);
        parcel.writeInt(this.f209466y2 ? 1 : 0);
        parcel.writeString(this.field_mobile);
        parcel.writeDouble(this.field_onceQuotaKind);
        parcel.writeDouble(this.field_onceQuotaVirtual);
        parcel.writeDouble(this.field_dayQuotaKind);
        parcel.writeDouble(this.field_dayQuotaVirtual);
        parcel.writeString(this.field_bankcardTail);
        parcel.writeString(this.field_bankPhone);
        parcel.writeInt(this.field_bankcardTag);
        parcel.writeInt(this.field_bankcardState);
        parcel.writeString(this.f209454m2);
        parcel.writeInt(this.f209464w2);
        parcel.writeString(this.f209465x2);
        parcel.writeInt(this.field_bankcardClientType);
        parcel.writeString(this.field_ext_msg);
        parcel.writeInt(this.field_support_micropay ? 1 : 0);
        parcel.writeString(this.field_arrive_type);
        parcel.writeDouble(this.field_fetch_charge_rate);
        parcel.writeDouble(this.field_full_fetch_charge_fee);
        parcel.writeString(this.field_no_micro_word);
        parcel.writeString(this.field_card_bottom_wording);
        parcel.writeString(this.f209436D2);
        parcel.writeLong(this.f209433A2);
        parcel.writeLong(this.f209435C2);
        parcel.writeLong(this.f209434B2);
        parcel.writeInt(this.f209437E2);
        parcel.writeInt(this.f209441I2);
        parcel.writeInt(this.f209438F2);
        parcel.writeString(this.f209439G2);
        parcel.writeString(this.f209440H2);
        parcel.writeString(this.f209442J2);
        parcel.writeLong(this.f209443K2);
        parcel.writeString(this.f209444L2);
        parcel.writeString(this.f209445M2);
        parcel.writeString(this.f209446N2);
        parcel.writeString(this.f209447O2);
        parcel.writeString(this.f209448P2);
    }

    public BankcardScene(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, double d2, String str8, String str9, String str10, String str11, String str12, C67176b bVar, int i, String str13, boolean z, C67183e eVar, long j, long j2, long j3, String str14, int i2, int i3, String str15, String str16, int i4, String str17, long j4, String str18, String str19, String str20, String str21, String str22) {
        this.f209449h2 = str;
        this.f209450i2 = str2;
        this.f209451j2 = str3;
        this.f209452k2 = str4;
        this.f209453l2 = str5;
        this.f209454m2 = str6;
        this.f209455n2 = d;
        this.f209456o2 = str7;
        this.f209457p2 = d2;
        this.f209458q2 = str8;
        this.f209459r2 = str9;
        this.f209460s2 = str10;
        this.f209461t2 = str11;
        this.f209462u2 = str12;
        this.f209463v2 = bVar;
        this.f209464w2 = i;
        this.f209465x2 = str13;
        this.f209466y2 = z;
        this.f209467z2 = eVar;
        this.f209433A2 = j;
        this.f209434B2 = j2;
        this.f209435C2 = j3;
        this.f209436D2 = str14;
        this.f209437E2 = i2;
        this.f209438F2 = i3;
        this.f209439G2 = str15;
        this.f209440H2 = str16;
        this.f209441I2 = i4;
        this.f209442J2 = str17;
        this.f209443K2 = j4;
        this.f209444L2 = str18;
        this.f209445M2 = str19;
        this.f209446N2 = str20;
        this.f209447O2 = str21;
        this.f209448P2 = str22;
    }

    public BankcardScene(Parcel parcel) {
        this.f209454m2 = null;
        this.f209465x2 = null;
        boolean z = false;
        this.f209466y2 = false;
        this.field_bankName = parcel.readString();
        this.field_desc = parcel.readString();
        this.field_bankcardType = parcel.readString();
        this.field_bindSerial = parcel.readString();
        this.field_cardType = parcel.readInt();
        this.f209466y2 = parcel.readInt() == 1;
        this.field_mobile = parcel.readString();
        this.field_onceQuotaKind = parcel.readDouble();
        this.field_onceQuotaVirtual = parcel.readDouble();
        this.field_dayQuotaKind = parcel.readDouble();
        this.field_dayQuotaVirtual = parcel.readDouble();
        this.field_bankcardTail = parcel.readString();
        this.field_bankPhone = parcel.readString();
        this.field_bankcardTag = parcel.readInt();
        this.field_bankcardState = parcel.readInt();
        this.f209454m2 = parcel.readString();
        this.f209464w2 = parcel.readInt();
        this.f209465x2 = parcel.readString();
        this.field_bankcardClientType = parcel.readInt();
        this.field_ext_msg = parcel.readString();
        this.field_support_micropay = parcel.readInt() == 1 ? true : z;
        this.field_arrive_type = parcel.readString();
        this.field_fetch_charge_rate = parcel.readDouble();
        this.field_full_fetch_charge_fee = parcel.readDouble();
        this.field_no_micro_word = parcel.readString();
        this.field_card_bottom_wording = parcel.readString();
        this.f209436D2 = parcel.readString();
        this.f209433A2 = parcel.readLong();
        this.f209435C2 = parcel.readLong();
        this.f209434B2 = parcel.readLong();
        this.f209437E2 = parcel.readInt();
        this.f209441I2 = parcel.readInt();
        this.f209438F2 = parcel.readInt();
        this.f209439G2 = parcel.readString();
        this.f209440H2 = parcel.readString();
        this.f209442J2 = parcel.readString();
        this.f209443K2 = parcel.readLong();
        this.f209444L2 = parcel.readString();
        this.f209445M2 = parcel.readString();
        this.f209446N2 = parcel.readString();
        this.f209447O2 = parcel.readString();
        this.f209448P2 = parcel.readString();
    }
}
