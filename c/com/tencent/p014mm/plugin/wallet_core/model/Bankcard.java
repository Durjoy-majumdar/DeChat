package com.tencent.p014mm.plugin.wallet_core.model;

import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import b63.C67176b;
import b63.C67183e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import java.util.ArrayList;
import p749xh.C78816l9;

/* renamed from: com.tencent.mm.plugin.wallet_core.model.Bankcard */
public class Bankcard extends C78816l9 implements Parcelable {
    public static final Parcelable.Creator<Bankcard> CREATOR = new C72172a();

    /* renamed from: V2 */
    public static IAutoDBItem.MAutoDBInfo f209387V2 = C78816l9.initAutoDBInfo(Bankcard.class);

    /* renamed from: A2 */
    public int f209388A2;

    /* renamed from: B2 */
    public int f209389B2;

    /* renamed from: C2 */
    public String f209390C2;

    /* renamed from: D2 */
    public String f209391D2;

    /* renamed from: E2 */
    public int f209392E2;

    /* renamed from: F2 */
    public String f209393F2;

    /* renamed from: G2 */
    public long f209394G2;

    /* renamed from: H2 */
    public String f209395H2;

    /* renamed from: I2 */
    public String f209396I2;

    /* renamed from: J2 */
    public String f209397J2;

    /* renamed from: K2 */
    public String f209398K2;

    /* renamed from: L2 */
    public String f209399L2;

    /* renamed from: M2 */
    public String f209400M2;

    /* renamed from: N2 */
    public String f209401N2;

    /* renamed from: O2 */
    public String f209402O2;

    /* renamed from: P2 */
    public ArrayList<String> f209403P2;

    /* renamed from: Q2 */
    public String f209404Q2;

    /* renamed from: R2 */
    public String f209405R2;

    /* renamed from: S2 */
    public int f209406S2;

    /* renamed from: T2 */
    public String f209407T2;

    /* renamed from: U2 */
    public ArrayList<String> f209408U2;

    /* renamed from: d2 */
    public String f209409d2;

    /* renamed from: e2 */
    public String f209410e2;

    /* renamed from: f2 */
    public String f209411f2;

    /* renamed from: g2 */
    public String f209412g2;

    /* renamed from: h2 */
    public String f209413h2;

    /* renamed from: i2 */
    public String f209414i2;

    /* renamed from: j2 */
    public double f209415j2;

    /* renamed from: k2 */
    public String f209416k2;

    /* renamed from: l2 */
    public double f209417l2;

    /* renamed from: m2 */
    public String f209418m2;

    /* renamed from: n2 */
    public String f209419n2;

    /* renamed from: o2 */
    public String f209420o2;

    /* renamed from: p2 */
    public String f209421p2;

    /* renamed from: q2 */
    public String f209422q2;

    /* renamed from: r2 */
    public C67176b f209423r2;

    /* renamed from: s2 */
    public int f209424s2;

    /* renamed from: t2 */
    public String f209425t2;

    /* renamed from: u2 */
    public boolean f209426u2;

    /* renamed from: v2 */
    public C67183e f209427v2;

    /* renamed from: w2 */
    public long f209428w2;

    /* renamed from: x2 */
    public long f209429x2;

    /* renamed from: y2 */
    public long f209430y2;

    /* renamed from: z2 */
    public String f209431z2;

    /* renamed from: com.tencent.mm.plugin.wallet_core.model.Bankcard$a */
    public class C72172a implements Parcelable.Creator<Bankcard> {
        public Object createFromParcel(Parcel parcel) {
            return new Bankcard(parcel);
        }

        public Object[] newArray(int i) {
            return new Bankcard[i];
        }
    }

    public Bankcard() {
        this.f209414i2 = null;
        this.f209425t2 = null;
        this.f209426u2 = false;
        this.f209403P2 = new ArrayList<>();
        this.f209408U2 = new ArrayList<>();
    }

    /* renamed from: m2 */
    public static String m84544m2(Context context, int i) {
        switch (i) {
            case 1:
                return context.getString(C0966R.string.l3q);
            case 2:
                return context.getString(C0966R.string.l3w);
            case 3:
                return context.getString(C0966R.string.f361598l41);
            case 4:
                return context.getString(C0966R.string.l3s);
            case 5:
                return context.getString(C0966R.string.l3o);
            case 6:
                return context.getString(C0966R.string.l3u);
            case 7:
                return context.getString(C0966R.string.l3z);
            default:
                return context.getString(C0966R.string.l3x);
        }
    }

    /* renamed from: t2 */
    public static boolean m84545t2(int i, int i2) {
        Log.m105918d("MicroMsg.Bankcard", "supportBankcardTag : " + i + ", bankcardTag : " + i2);
        return (i & i2) > 0;
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public int describeContents() {
        return 0;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f209387V2;
    }

    /* renamed from: l2 */
    public int mo99387l2(int i, Orders orders) {
        if (this.field_bankcardState != 0) {
            Log.m105918d("MicroMsg.Bankcard", " bankcardState : " + this.field_bankcardState);
            return this.field_bankcardState;
        } else if (orders != null && orders.f209563e.equals(this.f209414i2)) {
            return 4;
        } else {
            return !((i & this.field_bankcardTag) > 0) ? mo99390p2() ? 5 : 6 : (orders == null || orders.f209537H.isEmpty() || orders.f209537H.contains(this.field_bankcardType)) ? 0 : 7;
        }
    }

    /* renamed from: n2 */
    public boolean mo99388n2() {
        boolean z = (this.field_cardType & 8) > 0;
        Log.m105918d("MicroMsg.Bankcard", "isWXCredit, ret = " + z);
        return z;
    }

    /* renamed from: o2 */
    public boolean mo99389o2() {
        boolean z = (this.field_cardType & 2) > 0;
        Log.m105918d("MicroMsg.Bankcard", "isCredit, ret = " + z);
        return z;
    }

    /* renamed from: p2 */
    public boolean mo99390p2() {
        boolean z = true;
        if ((this.field_cardType & 1) > 0) {
            z = false;
        }
        Log.m105918d("MicroMsg.Bankcard", "isDomestic, ret = " + z);
        return z;
    }

    /* renamed from: q2 */
    public boolean mo99391q2() {
        return (this.field_cardType & 256) > 0;
    }

    /* renamed from: r2 */
    public boolean mo99392r2() {
        return (this.field_cardType & 128) > 0;
    }

    /* renamed from: s2 */
    public boolean mo99393s2() {
        boolean z = (this.field_cardType & 64) > 0;
        Log.m105918d("MicroMsg.Bankcard", "isLqtCard, ret = " + z);
        return z;
    }

    /* renamed from: u2 */
    public boolean mo99394u2() {
        boolean z = (this.field_cardType & 4) > 0;
        Log.m105918d("MicroMsg.Bankcard", "isWXCredit, ret = " + z);
        return z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_bankName);
        parcel.writeString(this.field_desc);
        parcel.writeString(this.field_bankcardType);
        parcel.writeString(this.field_bindSerial);
        parcel.writeInt(this.field_defaultCardState);
        parcel.writeInt(this.field_cardType);
        parcel.writeInt(this.f209426u2 ? 1 : 0);
        parcel.writeString(this.field_mobile);
        parcel.writeDouble(this.field_onceQuotaKind);
        parcel.writeDouble(this.field_onceQuotaVirtual);
        parcel.writeDouble(this.field_dayQuotaKind);
        parcel.writeDouble(this.field_dayQuotaVirtual);
        parcel.writeString(this.field_bankcardTail);
        parcel.writeString(this.field_bankPhone);
        parcel.writeInt(this.field_bankcardTag);
        parcel.writeInt(this.field_bankcardState);
        parcel.writeString(this.f209414i2);
        parcel.writeInt(this.f209424s2);
        parcel.writeString(this.f209425t2);
        parcel.writeInt(this.field_bankcardClientType);
        parcel.writeString(this.field_ext_msg);
        parcel.writeInt(this.field_support_micropay ? 1 : 0);
        parcel.writeString(this.field_arrive_type);
        parcel.writeDouble(this.field_fetch_charge_rate);
        parcel.writeDouble(this.field_full_fetch_charge_fee);
        parcel.writeString(this.field_no_micro_word);
        parcel.writeString(this.field_card_bottom_wording);
        parcel.writeString(this.f209431z2);
        parcel.writeLong(this.f209428w2);
        parcel.writeLong(this.f209430y2);
        parcel.writeLong(this.f209429x2);
        parcel.writeInt(this.f209388A2);
        parcel.writeInt(this.f209392E2);
        parcel.writeInt(this.f209389B2);
        parcel.writeString(this.f209390C2);
        parcel.writeString(this.f209391D2);
        parcel.writeString(this.f209393F2);
        parcel.writeLong(this.f209394G2);
        parcel.writeString(this.f209395H2);
        parcel.writeString(this.f209396I2);
        parcel.writeString(this.f209397J2);
        parcel.writeString(this.f209398K2);
        parcel.writeString(this.f209399L2);
        parcel.writeString(this.f209400M2);
        parcel.writeString(this.f209401N2);
        parcel.writeString(this.f209402O2);
        parcel.writeStringList(this.f209403P2);
        parcel.writeString(this.f209404Q2);
        parcel.writeString(this.f209405R2);
        parcel.writeInt(this.f209406S2);
        parcel.writeString(this.f209407T2);
        parcel.writeStringList(this.f209408U2);
    }

    public Bankcard(int i) {
        this.f209414i2 = null;
        this.f209425t2 = null;
        this.f209426u2 = false;
        this.f209403P2 = new ArrayList<>();
        this.f209408U2 = new ArrayList<>();
        this.field_bankcardTag = i;
    }

    public Bankcard(String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, double d2, String str8, String str9, String str10, String str11, String str12, C67176b bVar, int i, String str13, boolean z, C67183e eVar, long j, long j2, long j3, String str14, int i2, int i3, String str15, String str16, int i4, String str17, long j4, String str18, String str19, String str20, String str21, String str22) {
        this.f209414i2 = null;
        this.f209425t2 = null;
        this.f209426u2 = false;
        this.f209403P2 = new ArrayList<>();
        this.f209408U2 = new ArrayList<>();
        this.f209409d2 = str;
        this.f209410e2 = str2;
        this.f209411f2 = str3;
        this.f209412g2 = str4;
        this.f209413h2 = str5;
        this.f209414i2 = str6;
        this.f209415j2 = d;
        this.f209416k2 = str7;
        this.f209417l2 = d2;
        this.f209418m2 = str8;
        this.f209419n2 = str9;
        this.f209420o2 = str10;
        this.f209421p2 = str11;
        this.f209422q2 = str12;
        this.f209423r2 = bVar;
        this.f209424s2 = i;
        this.f209425t2 = str13;
        this.f209426u2 = z;
        this.f209427v2 = eVar;
        this.f209428w2 = j;
        this.f209429x2 = j2;
        this.f209430y2 = j3;
        this.f209431z2 = str14;
        this.f209388A2 = i2;
        this.f209389B2 = i3;
        this.f209390C2 = str15;
        this.f209391D2 = str16;
        this.f209392E2 = i4;
        this.f209393F2 = str17;
        this.f209394G2 = j4;
        this.f209395H2 = str18;
        this.f209396I2 = str19;
        this.f209397J2 = str20;
        this.f209398K2 = str21;
        this.f209399L2 = str22;
    }

    public Bankcard(Parcel parcel) {
        this.f209414i2 = null;
        this.f209425t2 = null;
        boolean z = false;
        this.f209426u2 = false;
        this.f209403P2 = new ArrayList<>();
        this.f209408U2 = new ArrayList<>();
        this.field_bankName = parcel.readString();
        this.field_desc = parcel.readString();
        this.field_bankcardType = parcel.readString();
        this.field_bindSerial = parcel.readString();
        this.field_defaultCardState = parcel.readInt();
        this.field_cardType = parcel.readInt();
        this.f209426u2 = parcel.readInt() == 1;
        this.field_mobile = parcel.readString();
        this.field_onceQuotaKind = parcel.readDouble();
        this.field_onceQuotaVirtual = parcel.readDouble();
        this.field_dayQuotaKind = parcel.readDouble();
        this.field_dayQuotaVirtual = parcel.readDouble();
        this.field_bankcardTail = parcel.readString();
        this.field_bankPhone = parcel.readString();
        this.field_bankcardTag = parcel.readInt();
        this.field_bankcardState = parcel.readInt();
        this.f209414i2 = parcel.readString();
        this.f209424s2 = parcel.readInt();
        this.f209425t2 = parcel.readString();
        this.field_bankcardClientType = parcel.readInt();
        this.field_ext_msg = parcel.readString();
        this.field_support_micropay = parcel.readInt() == 1 ? true : z;
        this.field_arrive_type = parcel.readString();
        this.field_fetch_charge_rate = parcel.readDouble();
        this.field_full_fetch_charge_fee = parcel.readDouble();
        this.field_no_micro_word = parcel.readString();
        this.field_card_bottom_wording = parcel.readString();
        this.f209431z2 = parcel.readString();
        this.f209428w2 = parcel.readLong();
        this.f209430y2 = parcel.readLong();
        this.f209429x2 = parcel.readLong();
        this.f209388A2 = parcel.readInt();
        this.f209392E2 = parcel.readInt();
        this.f209389B2 = parcel.readInt();
        this.f209390C2 = parcel.readString();
        this.f209391D2 = parcel.readString();
        this.f209393F2 = parcel.readString();
        this.f209394G2 = parcel.readLong();
        this.f209395H2 = parcel.readString();
        this.f209396I2 = parcel.readString();
        this.f209397J2 = parcel.readString();
        this.f209398K2 = parcel.readString();
        this.f209399L2 = parcel.readString();
        this.f209400M2 = parcel.readString();
        this.f209401N2 = parcel.readString();
        this.f209402O2 = parcel.readString();
        parcel.readStringList(this.f209403P2);
        this.f209404Q2 = parcel.readString();
        this.f209405R2 = parcel.readString();
        this.f209406S2 = parcel.readInt();
        this.f209407T2 = parcel.readString();
        parcel.readStringList(this.f209408U2);
    }
}
