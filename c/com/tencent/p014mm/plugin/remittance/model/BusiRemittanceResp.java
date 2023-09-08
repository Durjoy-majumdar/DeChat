package com.tencent.p014mm.plugin.remittance.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C77907be0;
import te3.C77912ce0;
import te3.C77920eb0;
import te3.C77927fb0;
import te3.C77995sj;
import te3.cz4;
import te3.dz4;
import te3.ez4;

/* renamed from: com.tencent.mm.plugin.remittance.model.BusiRemittanceResp */
public class BusiRemittanceResp implements Parcelable {
    public static final Parcelable.Creator<BusiRemittanceResp> CREATOR = new C70579a();

    /* renamed from: d */
    public int f204042d = 0;

    /* renamed from: e */
    public String f204043e = "";

    /* renamed from: f */
    public String f204044f = "";

    /* renamed from: g */
    public int f204045g;

    /* renamed from: h */
    public String f204046h;

    /* renamed from: i */
    public String f204047i;

    /* renamed from: j */
    public List<C77912ce0> f204048j = new LinkedList();

    /* renamed from: n */
    public C77995sj f204049n;

    /* renamed from: o */
    public dz4 f204050o;

    /* renamed from: p */
    public int f204051p = 0;

    /* renamed from: q */
    public int f204052q = 0;

    /* renamed from: r */
    public String f204053r;

    /* renamed from: s */
    public String f204054s;

    /* renamed from: t */
    public int f204055t = 400;

    /* renamed from: u */
    public C77927fb0 f204056u;

    /* renamed from: v */
    public String f204057v;

    /* renamed from: w */
    public String f204058w;

    /* renamed from: x */
    public Boolean f204059x;

    /* renamed from: com.tencent.mm.plugin.remittance.model.BusiRemittanceResp$a */
    public class C70579a implements Parcelable.Creator<BusiRemittanceResp> {
        public Object createFromParcel(Parcel parcel) {
            return new BusiRemittanceResp(parcel);
        }

        public Object[] newArray(int i) {
            return new BusiRemittanceResp[i];
        }
    }

    public BusiRemittanceResp() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f204042d);
        parcel.writeString(this.f204043e);
        parcel.writeString(this.f204044f);
        parcel.writeInt(this.f204045g);
        parcel.writeString(this.f204046h);
        parcel.writeString(this.f204047i);
        parcel.writeInt(this.f204051p);
        parcel.writeInt(this.f204052q);
        parcel.writeString(this.f204053r);
        parcel.writeString(this.f204054s);
        parcel.writeInt(this.f204055t);
        parcel.writeInt(this.f204048j.size());
        if (this.f204048j.size() > 0) {
            for (int i2 = 0; i2 < this.f204048j.size(); i2++) {
                byte[] bArr = new byte[0];
                try {
                    bArr = this.f204048j.get(i2).toByteArray();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e, "", new Object[0]);
                }
                parcel.writeInt(bArr.length);
                if (bArr.length > 0) {
                    parcel.writeByteArray(bArr);
                }
            }
        }
        byte[] bArr2 = new byte[0];
        try {
            bArr2 = this.f204049n.toByteArray();
        } catch (Exception e2) {
            Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e2, "", new Object[0]);
        }
        parcel.writeInt(bArr2.length);
        if (bArr2.length > 0) {
            parcel.writeByteArray(bArr2);
        }
        byte[] bArr3 = new byte[0];
        try {
            bArr3 = this.f204050o.toByteArray();
        } catch (Exception e3) {
            Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e3, "", new Object[0]);
        }
        parcel.writeInt(bArr3.length);
        if (bArr3.length > 0) {
            parcel.writeByteArray(bArr3);
        }
        byte[] bArr4 = new byte[0];
        try {
            bArr4 = this.f204056u.toByteArray();
        } catch (Exception e4) {
            Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e4, "", new Object[0]);
        }
        parcel.writeInt(bArr4.length);
        if (bArr4.length > 0) {
            parcel.writeByteArray(bArr4);
        }
        parcel.writeString(this.f204057v);
        parcel.writeString(this.f204058w);
        parcel.writeInt(this.f204059x.booleanValue() ? 1 : 0);
    }

    public BusiRemittanceResp(JSONObject jSONObject) {
        this.f204042d = jSONObject.optInt("show_photo", 0);
        this.f204043e = jSONObject.optString("photo_url", "");
        this.f204044f = jSONObject.optString("favor_desc", "");
        this.f204045g = jSONObject.optInt("scan_scene", 0);
        this.f204046h = jSONObject.optString("favor_req_sign", "");
        this.f204047i = jSONObject.optString("favor_req_extend", "");
        this.f204053r = jSONObject.optString("paying_rcvr_info", "");
        this.f204054s = jSONObject.optString("succpage_rcvr_info", "");
        this.f204051p = jSONObject.optInt("get_favor_flag", 0);
        this.f204052q = jSONObject.optInt("photo_style", 0);
        this.f204055t = jSONObject.optInt("get_favor_interval", 400);
        this.f204048j = C70581b.m83112b(jSONObject.optJSONArray("favor_list"));
        JSONObject optJSONObject = jSONObject.optJSONObject("favor_comm_resp");
        if (optJSONObject != null) {
            C77995sj sjVar = new C77995sj();
            this.f204049n = sjVar;
            sjVar.f228222f = optJSONObject.optString("default_fav_compose_id");
            this.f204049n.f228220d = C70581b.m83112b(optJSONObject.optJSONArray("favor_info_list"));
            this.f204049n.f228223g = optJSONObject.optString("favor_resp_sign");
            this.f204049n.f228224h = optJSONObject.optString("no_compose_wording");
            C77995sj sjVar2 = this.f204049n;
            JSONArray optJSONArray = optJSONObject.optJSONArray("favor_compose_result_list");
            LinkedList<C77907be0> linkedList = new LinkedList<>();
            if (optJSONArray != null) {
                int i = 0;
                while (i < optJSONArray.length()) {
                    try {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        C77907be0 be02 = new C77907be0();
                        be02.f226995d = jSONObject2.optString("favor_compose_id");
                        be02.f226997f = jSONObject2.optLong("show_favor_amount");
                        be02.f226998g = jSONObject2.optLong("show_pay_amount");
                        be02.f226999h = jSONObject2.optString("total_favor_amount");
                        be02.f227000i = jSONObject2.optString("favor_desc");
                        be02.f227001j = jSONObject2.optLong("compose_sort_flag");
                        be02.f227002n = jSONObject2.optString("extend_str");
                        be02.f226996e = C70581b.m83112b(jSONObject2.optJSONArray("favor_info_list"));
                        linkedList.add(be02);
                        i++;
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BusiFavorInfoParser", e, "", new Object[0]);
                    }
                }
            }
            sjVar2.f228221e = linkedList;
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("notice");
        if (optJSONObject2 != null) {
            dz4 dz4 = new dz4();
            this.f204050o = dz4;
            dz4.f132590d = optJSONObject2.optInt("is_show_notice");
            dz4 dz42 = this.f204050o;
            JSONObject optJSONObject3 = optJSONObject2.optJSONObject("text_info");
            ez4 ez4 = new ez4();
            optJSONObject3 = optJSONObject3 == null ? new JSONObject() : optJSONObject3;
            ez4.f133210d = optJSONObject3.optString("wording");
            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("jump_info");
            cz4 cz4 = new cz4();
            optJSONObject4 = optJSONObject4 == null ? new JSONObject() : optJSONObject4;
            cz4.f132043d = optJSONObject4.optInt("type");
            cz4.f132044e = optJSONObject4.optString("url");
            cz4.f132045f = optJSONObject4.optString("username");
            cz4.f132046g = optJSONObject4.optString("pagepath");
            ez4.f133211e = cz4;
            dz42.f132591e = ez4;
            this.f204050o.f132592f = optJSONObject2.optString("text_color");
            this.f204050o.f132593g = optJSONObject2.optString("text_dark_color");
            this.f204050o.f132594h = optJSONObject2.optString("lefticon");
            this.f204050o.f132595i = optJSONObject2.optString("lefticon_dark");
            this.f204050o.f132596j = optJSONObject2.optString("righticon");
            this.f204050o.f132597n = optJSONObject2.optString("righticon_dark");
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("extra_buy");
        if (optJSONObject5 != null) {
            C77927fb0 fb02 = new C77927fb0();
            this.f204056u = fb02;
            fb02.f227352d = optJSONObject5.optString("select_wording");
            this.f204056u.f227353e = optJSONObject5.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            C77927fb0 fb03 = this.f204056u;
            JSONArray optJSONArray2 = optJSONObject5.optJSONArray("extra_buy_detail_infos");
            LinkedList<C77920eb0> linkedList2 = new LinkedList<>();
            if (optJSONArray2 != null) {
                int i2 = 0;
                while (i2 < optJSONArray2.length()) {
                    try {
                        JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                        C77920eb0 eb02 = new C77920eb0();
                        eb02.f227241d = jSONObject3.optLong("extra_buy_id");
                        eb02.f227242e = jSONObject3.optString("extra_buy_name");
                        eb02.f227243f = jSONObject3.optLong("good_original_price");
                        eb02.f227244g = jSONObject3.optLong("good_add_price");
                        eb02.f227245h = jSONObject3.optString("extra_buy_good_name");
                        eb02.f227246i = jSONObject3.optString("extra_buy_good_pic");
                        eb02.f227247j = jSONObject3.optInt("unavailable");
                        eb02.f227248n = jSONObject3.optString("unavailable_reason");
                        eb02.f227249o = jSONObject3.optBoolean("selected");
                        linkedList2.add(eb02);
                        i2++;
                    } catch (Exception e2) {
                        Log.printErrStackTrace("MicroMsg.BusiExtraBuyInfoParser", e2, "", new Object[0]);
                    }
                }
            }
            fb03.f227354f = linkedList2;
        }
        this.f204057v = jSONObject.optString("favor_title");
        this.f204058w = jSONObject.optString("extra_buy_title");
        this.f204059x = Boolean.valueOf(jSONObject.optBoolean("enable_union_pay"));
    }

    public BusiRemittanceResp(Parcel parcel) {
        boolean z = false;
        this.f204042d = parcel.readInt();
        this.f204043e = parcel.readString();
        this.f204044f = parcel.readString();
        this.f204045g = parcel.readInt();
        this.f204046h = parcel.readString();
        this.f204047i = parcel.readString();
        this.f204051p = parcel.readInt();
        this.f204052q = parcel.readInt();
        this.f204053r = parcel.readString();
        this.f204054s = parcel.readString();
        this.f204055t = parcel.readInt();
        this.f204048j = new LinkedList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                byte[] bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
                try {
                    C77912ce0 ce02 = new C77912ce0();
                    ce02.parseFrom(bArr);
                    this.f204048j.add(ce02);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e, "", new Object[0]);
                }
            }
        }
        int readInt3 = parcel.readInt();
        if (readInt3 > 0) {
            byte[] bArr2 = new byte[readInt3];
            parcel.readByteArray(bArr2);
            C77995sj sjVar = new C77995sj();
            this.f204049n = sjVar;
            try {
                sjVar.parseFrom(bArr2);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e2, "", new Object[0]);
            }
        }
        int readInt4 = parcel.readInt();
        if (readInt4 > 0) {
            byte[] bArr3 = new byte[readInt4];
            parcel.readByteArray(bArr3);
            dz4 dz4 = new dz4();
            this.f204050o = dz4;
            try {
                dz4.parseFrom(bArr3);
            } catch (Exception e3) {
                Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e3, "", new Object[0]);
            }
        }
        int readInt5 = parcel.readInt();
        if (readInt5 > 0) {
            byte[] bArr4 = new byte[readInt5];
            parcel.readByteArray(bArr4);
            C77927fb0 fb02 = new C77927fb0();
            this.f204056u = fb02;
            try {
                fb02.parseFrom(bArr4);
            } catch (Exception e4) {
                Log.printErrStackTrace("MicroMsg.BusiRemittanceResp", e4, "", new Object[0]);
            }
        }
        this.f204057v = parcel.readString();
        this.f204058w = parcel.readString();
        this.f204059x = Boolean.valueOf(parcel.readInt() == 1 ? true : z);
    }
}
