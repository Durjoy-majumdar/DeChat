package com.tencent.p014mm.plugin.card.sharecard.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import dz0.C20483c;
import hz0.C46153l0;
import oz0.C47407b;
import p749xh.C118876h8;
import te3.C22500hn;
import te3.C22506ko;
import te3.C49029co;
import te3.C52139yn;
import te3.g44;
import wz0.C22945n;

/* renamed from: com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo */
public class ShareCardInfo extends C118876h8 implements Parcelable, C20483c {
    public static final Parcelable.Creator<ShareCardInfo> CREATOR = new C18544a();

    /* renamed from: Q0 */
    public static IAutoDBItem.MAutoDBInfo f51612Q0 = C118876h8.initAutoDBInfo(ShareCardInfo.class);

    /* renamed from: Y */
    public C22506ko f51613Y;

    /* renamed from: Z */
    public C22500hn f51614Z;

    /* renamed from: p0 */
    public g44 f51615p0;

    /* renamed from: x0 */
    public C49029co f51616x0;

    /* renamed from: y0 */
    public String f51617y0 = "";

    /* renamed from: com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo$a */
    public class C18544a implements Parcelable.Creator<ShareCardInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new ShareCardInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new ShareCardInfo[i];
        }
    }

    public ShareCardInfo() {
    }

    /* renamed from: A1 */
    public C49029co mo23260A1() {
        C49029co coVar = this.f51616x0;
        if (coVar != null) {
            return coVar;
        }
        try {
            C49029co coVar2 = (C49029co) new C49029co().parseFrom(this.field_shopInfoData);
            this.f51616x0 = coVar2;
            return coVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShareCardInfo", "getShopInfo fail ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: F */
    public boolean mo23261F() {
        if (!mo23296v1()) {
            return false;
        }
        if (this.f51613Y != null) {
            Log.m105924i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.f51613Y.f64122S);
        }
        Log.m105924i("MicroMsg.ShareCardInfo", "avail_num:" + this.f51614Z.f63949n);
        C22506ko koVar = this.f51613Y;
        if ((koVar != null && koVar.f64122S == 1) || this.f51614Z.f63949n > 0) {
            return true;
        }
        if (koVar != null) {
            int i = koVar.f64122S;
        }
        return false;
    }

    /* renamed from: G0 */
    public void mo23262G0(C49029co coVar) {
        this.f51616x0 = coVar;
        try {
            this.field_shopInfoData = coVar.toByteArray();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShareCardInfo", "setShopInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
        }
    }

    /* renamed from: J0 */
    public C22500hn mo23263J0() {
        C22500hn hnVar = this.f51614Z;
        if (hnVar != null) {
            return hnVar;
        }
        try {
            C22500hn hnVar2 = (C22500hn) new C22500hn().parseFrom(this.field_dataInfoData);
            this.f51614Z = hnVar2;
            return hnVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShareCardInfo", "getDataInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
            return new C22500hn();
        }
    }

    /* renamed from: L0 */
    public C22506ko mo23264L0() {
        C22506ko koVar = this.f51613Y;
        if (koVar != null) {
            return koVar;
        }
        try {
            C22506ko koVar2 = (C22506ko) new C22506ko().parseFrom(this.field_cardTpInfoData);
            this.f51613Y = koVar2;
            return koVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShareCardInfo", "getCardTpInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
            return new C22506ko();
        }
    }

    /* renamed from: N */
    public boolean mo23265N() {
        C22506ko koVar = this.f51613Y;
        return koVar != null && koVar.f64130W == 1;
    }

    /* renamed from: N0 */
    public boolean mo23266N0() {
        return C22945n.m26989B(mo23264L0().f64141i);
    }

    /* renamed from: O */
    public boolean mo23267O() {
        return mo23264L0() != null && mo23264L0().f64114L == 0;
    }

    /* renamed from: P */
    public String mo23268P(int i) {
        return i == 10 ? (String) C46153l0.yx0().mo71382a("key_share_card_local_city") : (i != 0 || !C47407b.m52741c()) ? "" : MMApplicationContext.getResources().getString(C0966R.string.b0n);
    }

    /* renamed from: Q0 */
    public boolean mo23269Q0() {
        return mo23264L0() != null && mo23264L0().f64120R == 1;
    }

    /* renamed from: R0 */
    public String mo23270R0() {
        return this.field_card_tp_id;
    }

    /* renamed from: R1 */
    public boolean mo23271R1() {
        return mo23264L0() != null && mo23264L0().f64141i == 20;
    }

    /* renamed from: T0 */
    public boolean mo23272T0() {
        return mo23264L0() != null && mo23264L0().f64114L == 1;
    }

    /* renamed from: U0 */
    public void mo23273U0(C22500hn hnVar) {
        this.f51614Z = hnVar;
        if (hnVar != null) {
            try {
                this.field_dataInfoData = hnVar.toByteArray();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.ShareCardInfo", "setDataInfo fail, ex = %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: W */
    public String mo23274W() {
        Log.m105918d("MicroMsg.ShareCardInfo", "encrypt_code:" + this.f51617y0);
        return this.f51617y0;
    }

    /* renamed from: W0 */
    public boolean mo23275W0() {
        return (mo23264L0().f64107E & 1) == 0;
    }

    /* renamed from: W1 */
    public boolean mo23276W1() {
        return (mo23264L0().f64107E & 2) > 0;
    }

    /* renamed from: X0 */
    public boolean mo23277X0() {
        C52139yn ynVar;
        C22506ko koVar = this.f51613Y;
        if (koVar == null || (ynVar = koVar.f64111I) == null || TextUtils.isEmpty(ynVar.f145414e)) {
            return false;
        }
        int i = this.f51613Y.f64111I.f145416g;
        return i > 0 && i - ((int) (System.currentTimeMillis() / 1000)) > 0;
    }

    /* renamed from: d0 */
    public boolean mo23278d0() {
        return (mo23264L0().f64107E & 8) > 0;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo23280e() {
        return this.field_from_username;
    }

    /* renamed from: f2 */
    public void mo23281f2(String str) {
        this.field_from_username = str;
    }

    /* renamed from: g */
    public boolean mo23282g() {
        return (mo23264L0().f64107E & 16) == 0;
    }

    public String getCardId() {
        return this.field_card_id;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f51612Q0;
    }

    /* renamed from: h */
    public boolean mo23284h() {
        return mo23264L0() != null && mo23264L0().f64141i == 0;
    }

    /* renamed from: h2 */
    public boolean mo23285h2() {
        return mo23264L0() != null && mo23264L0().f64141i == 30;
    }

    /* renamed from: i2 */
    public boolean mo23286i2() {
        return (mo23264L0().f64107E & 4) > 0;
    }

    /* renamed from: j */
    public boolean mo23287j() {
        return false;
    }

    /* renamed from: k1 */
    public String mo23288k1(int i) {
        return "";
    }

    /* renamed from: m0 */
    public boolean mo23289m0() {
        return mo23264L0() != null && mo23264L0().f64141i == 11;
    }

    /* renamed from: n0 */
    public long mo23290n0() {
        return this.field_local_updateTime;
    }

    /* renamed from: o */
    public boolean mo23291o() {
        return mo23264L0() != null && mo23264L0().f64141i == 10;
    }

    /* renamed from: p */
    public boolean mo23292p() {
        return (mo23264L0().f64104B & 1) == 0;
    }

    /* renamed from: u0 */
    public g44 mo23293u0() {
        g44 g44 = this.f51615p0;
        if (g44 != null) {
            return g44;
        }
        try {
            g44 g442 = (g44) new g44().parseFrom(this.field_shareInfoData);
            this.f51615p0 = g442;
            return g442;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.ShareCardInfo", "getShareInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.ShareCardInfo", e, "", new Object[0]);
            return new g44();
        }
    }

    /* renamed from: v */
    public boolean mo23294v() {
        return (mo23264L0().f64104B & 2) == 0;
    }

    /* renamed from: v0 */
    public boolean mo23295v0() {
        if (!mo23296v1()) {
            return false;
        }
        if (this.f51613Y != null) {
            Log.m105924i("MicroMsg.ShareCardInfo", "is_acceptable:" + this.f51613Y.f64122S);
        }
        Log.m105924i("MicroMsg.ShareCardInfo", "stock_num:" + this.f51614Z.f63953r + " limit_num:" + this.f51614Z.f63954s);
        C22506ko koVar = this.f51613Y;
        if (koVar != null && koVar.f64122S == 1) {
            return true;
        }
        if (koVar != null && koVar.f64122S == 0) {
            return false;
        }
        C22500hn hnVar = this.f51614Z;
        if (hnVar.f63953r != 0) {
            int i = hnVar.f63954s;
        }
        return false;
    }

    /* renamed from: v1 */
    public boolean mo23296v1() {
        C22500hn hnVar = this.f51614Z;
        return hnVar != null && hnVar.f63942d == 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_card_id);
        parcel.writeString(this.field_card_tp_id);
        parcel.writeString(this.field_from_username);
        parcel.writeInt(this.field_status);
        parcel.writeLong(this.field_share_time);
        parcel.writeLong(this.field_local_updateTime);
        parcel.writeLong(this.field_updateTime);
        parcel.writeLong(this.field_updateSeq);
        parcel.writeLong(this.field_block_mask);
        parcel.writeLong(this.field_end_time);
        parcel.writeInt(this.field_categoryType);
        parcel.writeInt(this.field_itemIndex);
        byte[] bArr = this.field_dataInfoData;
        int i2 = 0;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            int i3 = 0;
            while (true) {
                byte[] bArr2 = this.field_dataInfoData;
                if (i3 >= bArr2.length) {
                    break;
                }
                parcel.writeByte(bArr2[i3]);
                i3++;
            }
        }
        byte[] bArr3 = this.field_cardTpInfoData;
        if (bArr3 != null) {
            parcel.writeInt(bArr3.length);
            int i4 = 0;
            while (true) {
                byte[] bArr4 = this.field_cardTpInfoData;
                if (i4 >= bArr4.length) {
                    break;
                }
                parcel.writeByte(bArr4[i4]);
                i4++;
            }
        }
        byte[] bArr5 = this.field_shareInfoData;
        if (bArr5 != null) {
            parcel.writeInt(bArr5.length);
            int i5 = 0;
            while (true) {
                byte[] bArr6 = this.field_shareInfoData;
                if (i5 >= bArr6.length) {
                    break;
                }
                parcel.writeByte(bArr6[i5]);
                i5++;
            }
        }
        byte[] bArr7 = this.field_shopInfoData;
        if (bArr7 != null) {
            parcel.writeInt(bArr7.length);
            while (true) {
                byte[] bArr8 = this.field_shopInfoData;
                if (i2 < bArr8.length) {
                    parcel.writeByte(bArr8[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: y1 */
    public int mo23298y1() {
        return this.field_categoryType;
    }

    public ShareCardInfo(Parcel parcel) {
        this.field_card_id = parcel.readString();
        this.field_card_tp_id = parcel.readString();
        this.field_from_username = parcel.readString();
        this.field_status = parcel.readInt();
        this.field_share_time = parcel.readLong();
        this.field_local_updateTime = parcel.readLong();
        this.field_updateTime = parcel.readLong();
        this.field_updateSeq = parcel.readLong();
        this.field_block_mask = parcel.readLong();
        this.field_end_time = parcel.readLong();
        this.field_categoryType = parcel.readInt();
        this.field_itemIndex = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            this.field_dataInfoData = new byte[readInt];
            for (int i = 0; i < readInt; i++) {
                this.field_dataInfoData[i] = parcel.readByte();
            }
        }
        int readInt2 = parcel.readInt();
        if (readInt2 > 0) {
            this.field_cardTpInfoData = new byte[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                this.field_cardTpInfoData[i2] = parcel.readByte();
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            this.field_shareInfoData = new byte[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                this.field_shareInfoData[i3] = parcel.readByte();
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            this.field_shopInfoData = new byte[readInt4];
            for (int i4 = 0; i4 < readInt4; i4++) {
                this.field_shopInfoData[i4] = parcel.readByte();
            }
        }
    }
}
