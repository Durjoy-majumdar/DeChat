package com.tencent.p014mm.plugin.card.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import dz0.C20483c;
import p749xh.C118875e9;
import te3.C22500hn;
import te3.C22506ko;
import te3.C49029co;
import te3.C52139yn;
import te3.g44;
import wz0.C22945n;

/* renamed from: com.tencent.mm.plugin.card.model.CardInfo */
public class CardInfo extends C118875e9 implements Parcelable, C20483c {
    public static final Parcelable.Creator<CardInfo> CREATOR = new C18543a();

    /* renamed from: W0 */
    public static IAutoDBItem.MAutoDBInfo f51606W0 = C118875e9.initAutoDBInfo(CardInfo.class);

    /* renamed from: R0 */
    public C22506ko f51607R0;

    /* renamed from: S0 */
    public C22500hn f51608S0;

    /* renamed from: T0 */
    public g44 f51609T0;

    /* renamed from: U0 */
    public C49029co f51610U0;

    /* renamed from: V0 */
    public String f51611V0 = "";

    /* renamed from: com.tencent.mm.plugin.card.model.CardInfo$a */
    public class C18543a implements Parcelable.Creator<CardInfo> {
        public Object createFromParcel(Parcel parcel) {
            return new CardInfo(parcel);
        }

        public Object[] newArray(int i) {
            return new CardInfo[i];
        }
    }

    public CardInfo() {
        this.field_card_type = -1;
    }

    /* renamed from: A1 */
    public C49029co mo23260A1() {
        C49029co coVar = this.f51610U0;
        if (coVar != null) {
            return coVar;
        }
        try {
            if (this.field_shopInfoData == null) {
                return null;
            }
            C49029co coVar2 = (C49029co) new C49029co().parseFrom(this.field_shopInfoData);
            this.f51610U0 = coVar2;
            return coVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardInfo", "getShopInfo fail ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
            return null;
        }
    }

    /* renamed from: F */
    public boolean mo23261F() {
        if (!mo23296v1()) {
            return false;
        }
        if (this.f51607R0 != null) {
            Log.m105924i("MicroMsg.CardInfo", "is_acceptable:" + this.f51607R0.f64122S);
        }
        Log.m105924i("MicroMsg.CardInfo", "avail_num:" + this.f51608S0.f63949n);
        C22506ko koVar = this.f51607R0;
        if ((koVar != null && koVar.f64122S == 1) || this.f51608S0.f63949n > 0) {
            return true;
        }
        if (koVar != null) {
            int i = koVar.f64122S;
        }
        return false;
    }

    /* renamed from: G0 */
    public void mo23262G0(C49029co coVar) {
        this.f51610U0 = coVar;
        if (coVar != null) {
            try {
                this.field_shopInfoData = coVar.toByteArray();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.CardInfo", "setShopInfo fail, ex = %s", e.getMessage());
                Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
            }
        }
    }

    /* renamed from: J0 */
    public C22500hn mo23263J0() {
        C22500hn hnVar = this.f51608S0;
        if (hnVar != null) {
            return hnVar;
        }
        try {
            if (this.field_dataInfoData == null) {
                return new C22500hn();
            }
            C22500hn hnVar2 = (C22500hn) new C22500hn().parseFrom(this.field_dataInfoData);
            this.f51608S0 = hnVar2;
            return hnVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardInfo", "getDataInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
            return new C22500hn();
        }
    }

    /* renamed from: L0 */
    public C22506ko mo23264L0() {
        C22506ko koVar = this.f51607R0;
        if (koVar != null) {
            return koVar;
        }
        try {
            if (this.field_cardTpInfoData == null) {
                return new C22506ko();
            }
            C22506ko koVar2 = (C22506ko) new C22506ko().parseFrom(this.field_cardTpInfoData);
            this.f51607R0 = koVar2;
            return koVar2;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardInfo", "getCardTpInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
            return new C22506ko();
        }
    }

    /* renamed from: N */
    public boolean mo23265N() {
        C22506ko koVar = this.f51607R0;
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
        return null;
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
        this.f51608S0 = hnVar;
        if (hnVar != null) {
            this.field_status = hnVar.f63942d;
            if (hnVar != null) {
                try {
                    this.field_dataInfoData = hnVar.toByteArray();
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.CardInfo", "setDataInfo fail, ex = %s", e.getMessage());
                    Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
                }
            }
        }
    }

    /* renamed from: W */
    public String mo23274W() {
        Log.m105918d("MicroMsg.CardInfo", "encrypt_code:" + this.f51611V0);
        return this.f51611V0;
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
        C22506ko koVar = this.f51607R0;
        if (koVar == null || (ynVar = koVar.f64111I) == null || TextUtils.isEmpty(ynVar.f145414e)) {
            return false;
        }
        int i = this.f51607R0.f64111I.f145416g;
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
        return f51606W0;
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
        return (mo23264L0().f64107E & 32) > 0;
    }

    /* renamed from: k1 */
    public String mo23288k1(int i) {
        return null;
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
        g44 g44 = this.f51609T0;
        if (g44 != null) {
            return g44;
        }
        try {
            if (this.field_shareInfoData == null) {
                return new g44();
            }
            g44 g442 = (g44) new g44().parseFrom(this.field_shareInfoData);
            this.f51609T0 = g442;
            return g442;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.CardInfo", "getShareInfo fail, ex = %s", e.getMessage());
            Log.printErrStackTrace("MicroMsg.CardInfo", e, "", new Object[0]);
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
        if (this.f51607R0 != null) {
            Log.m105924i("MicroMsg.CardInfo", "is_acceptable:" + this.f51607R0.f64122S);
        }
        Log.m105924i("MicroMsg.CardInfo", "stock_num:" + this.f51608S0.f63953r + " limit_num:" + this.f51608S0.f63954s);
        C22506ko koVar = this.f51607R0;
        if (koVar != null && koVar.f64122S == 1) {
            return true;
        }
        if (koVar != null && koVar.f64122S == 0) {
            return false;
        }
        C22500hn hnVar = this.f51608S0;
        if (hnVar.f63953r != 0) {
            int i = hnVar.f63954s;
        }
        return false;
    }

    /* renamed from: v1 */
    public boolean mo23296v1() {
        C22500hn hnVar = this.f51608S0;
        return hnVar != null && hnVar.f63942d == 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.field_card_id);
        parcel.writeString(this.field_card_tp_id);
        parcel.writeString(this.field_from_username);
        parcel.writeInt(this.field_status);
        parcel.writeInt(this.field_delete_state_flag);
        parcel.writeLong(this.field_local_updateTime);
        parcel.writeLong(this.field_updateTime);
        parcel.writeLong(this.field_updateSeq);
        parcel.writeLong(this.field_create_time);
        parcel.writeLong(this.field_begin_time);
        parcel.writeLong(this.field_end_time);
        parcel.writeString(this.field_block_mask);
        parcel.writeInt(this.field_stickyIndex);
        parcel.writeInt(this.field_stickyEndTime);
        parcel.writeString(this.field_stickyAnnouncement);
        parcel.writeInt(this.field_card_type);
        parcel.writeString(this.field_label_wording);
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
        } else {
            parcel.writeInt(0);
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
        } else {
            parcel.writeInt(0);
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
        } else {
            parcel.writeInt(0);
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
        } else {
            parcel.writeInt(0);
        }
    }

    /* renamed from: y1 */
    public int mo23298y1() {
        return 0;
    }

    public CardInfo(Parcel parcel) {
        this.field_card_id = parcel.readString();
        this.field_card_tp_id = parcel.readString();
        this.field_from_username = parcel.readString();
        this.field_status = parcel.readInt();
        this.field_delete_state_flag = parcel.readInt();
        this.field_local_updateTime = parcel.readLong();
        this.field_updateTime = parcel.readLong();
        this.field_updateSeq = parcel.readLong();
        this.field_create_time = parcel.readLong();
        this.field_begin_time = parcel.readLong();
        this.field_end_time = parcel.readLong();
        this.field_block_mask = parcel.readString();
        this.field_stickyIndex = parcel.readInt();
        this.field_stickyEndTime = parcel.readInt();
        this.field_stickyAnnouncement = parcel.readString();
        this.field_card_type = parcel.readInt();
        this.field_label_wording = parcel.readString();
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
