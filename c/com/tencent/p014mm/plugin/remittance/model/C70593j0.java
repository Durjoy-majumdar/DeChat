package com.tencent.p014mm.plugin.remittance.model;

import android.util.Base64;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.wxpaysdk.api.ResendMsgInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import fr3.C75790l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import te3.C48730al;
import te3.C50456mv3;
import te3.C77933g43;
import te3.zf4;

/* renamed from: com.tencent.mm.plugin.remittance.model.j0 */
public class C70593j0 extends C75790l {

    /* renamed from: A */
    public int f204167A;

    /* renamed from: B */
    public C77933g43 f204168B;

    /* renamed from: C */
    public C70598e f204169C;

    /* renamed from: D */
    public ArrayList<C70602g> f204170D;

    /* renamed from: d */
    public String f204171d;

    /* renamed from: e */
    public int f204172e;

    /* renamed from: f */
    public double f204173f;

    /* renamed from: g */
    public String f204174g;

    /* renamed from: h */
    public int f204175h;

    /* renamed from: i */
    public String f204176i;

    /* renamed from: j */
    public String f204177j;

    /* renamed from: n */
    public boolean f204178n;

    /* renamed from: o */
    public int f204179o;

    /* renamed from: p */
    public String f204180p;

    /* renamed from: q */
    public int f204181q;

    /* renamed from: r */
    public String f204182r;

    /* renamed from: s */
    public String f204183s;

    /* renamed from: t */
    public int f204184t;

    /* renamed from: u */
    public String f204185u;

    /* renamed from: v */
    public C70594a f204186v;

    /* renamed from: w */
    public C70596c f204187w;

    /* renamed from: x */
    public C70602g f204188x;

    /* renamed from: y */
    public ResendMsgInfo f204189y;

    /* renamed from: z */
    public ArrayList<C70595b> f204190z;

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$a */
    public static class C70594a {

        /* renamed from: a */
        public String f204191a;

        /* renamed from: b */
        public String f204192b;

        /* renamed from: c */
        public String f204193c;

        public String toString() {
            return "AddressInfo{addressName='" + this.f204191a + '\'' + ", phoneNum='" + this.f204192b + '\'' + ", address='" + this.f204193c + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$b */
    public static class C70595b {

        /* renamed from: a */
        public String f204194a;

        /* renamed from: b */
        public String f204195b;

        /* renamed from: c */
        public boolean f204196c;

        public String toString() {
            return "DescItem{title='" + this.f204194a + '\'' + ", content='" + this.f204195b + '\'' + ", is_separate_line='" + this.f204196c + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$c */
    public static class C70596c {

        /* renamed from: a */
        public String f204197a;

        /* renamed from: b */
        public String f204198b;

        /* renamed from: c */
        public String f204199c;

        /* renamed from: d */
        public int f204200d;

        /* renamed from: e */
        public String f204201e;

        /* renamed from: f */
        public C70597d f204202f;

        public String toString() {
            return "ExposureInfo{icon='" + this.f204197a + '\'' + ", name='" + this.f204198b + '\'' + ", wording='" + this.f204199c + '\'' + ", isShowBtn=" + this.f204200d + ", btnWording='" + this.f204201e + '\'' + ", jumpInfo=" + this.f204202f + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$d */
    public static class C70597d {

        /* renamed from: a */
        public int f204203a;

        /* renamed from: b */
        public String f204204b;

        /* renamed from: c */
        public String f204205c;

        /* renamed from: d */
        public String f204206d;

        public String toString() {
            return "JumpInfo{type=" + this.f204203a + ", url='" + this.f204204b + '\'' + ", username='" + this.f204205c + '\'' + ", pagepath='" + this.f204206d + '\'' + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$e */
    public static class C70598e {

        /* renamed from: a */
        public C70603h f204207a;

        /* renamed from: b */
        public String f204208b;

        /* renamed from: c */
        public String f204209c;

        /* renamed from: d */
        public ArrayList<C70599f> f204210d;

        public String toString() {
            return "RecvAccountInfo{acct_usage_tips='" + this.f204207a + '\'' + ", no_availabel_account_wording='" + this.f204208b + '\'' + "list_title='" + this.f204209c + '\'' + ", recv_channel=" + this.f204210d + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$f */
    public static class C70599f {

        /* renamed from: a */
        public int f204211a;

        /* renamed from: b */
        public String f204212b;

        /* renamed from: c */
        public String f204213c;

        /* renamed from: d */
        public String f204214d;

        /* renamed from: e */
        public int f204215e;

        /* renamed from: f */
        public int f204216f;

        /* renamed from: g */
        public String f204217g;

        /* renamed from: h */
        public C70602g f204218h;

        /* renamed from: i */
        public C70603h f204219i;

        /* renamed from: j */
        public C70600a f204220j;

        /* renamed from: k */
        public zf4 f204221k;

        /* renamed from: l */
        public ArrayList<C70601b> f204222l;

        /* renamed from: m */
        public C70603h f204223m;

        /* renamed from: n */
        public C50456mv3 f204224n;

        /* renamed from: com.tencent.mm.plugin.remittance.model.j0$f$a */
        public static class C70600a {

            /* renamed from: a */
            public zf4 f204225a;

            /* renamed from: b */
            public C48730al f204226b;
        }

        /* renamed from: com.tencent.mm.plugin.remittance.model.j0$f$b */
        public static class C70601b {

            /* renamed from: a */
            public int f204227a;

            /* renamed from: b */
            public C70603h f204228b;
        }

        public String toString() {
            return "RecvChannel{recv_channel_type='" + this.f204211a + '\'' + ", recv_channel_name='" + this.f204212b + '\'' + ", recv_channel_logo='" + this.f204213c + '\'' + ", recv_channel_logo_darkmode='" + this.f204214d + '\'' + ", recv_channel_avail_state='" + this.f204215e + '\'' + ", recv_channel_unavail_reason='" + this.f204216f + '\'' + ", first_choose_wording='" + this.f204217g + '\'' + ", first_choose_guide='" + this.f204224n + '\'' + ", jump_remind_info='" + this.f204218h + '\'' + ", unavail_tips=" + this.f204219i + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$g */
    public static class C70602g {

        /* renamed from: a */
        public String f204229a;

        /* renamed from: b */
        public C70597d f204230b;

        public String toString() {
            return "TextInfo{wording='" + this.f204229a + '\'' + ", jumpInfo=" + this.f204230b + '}';
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.model.j0$h */
    public static class C70603h {

        /* renamed from: a */
        public String f204231a;

        /* renamed from: b */
        public String f204232b;

        /* renamed from: c */
        public String f204233c;

        public String toString() {
            return "TipsInfo{title='" + this.f204231a + '\'' + ", wording='" + this.f204232b + '\'' + ", btn_text=" + this.f204233c + '}';
        }
    }

    public C70593j0(int i, String str, String str2, int i2, String str3) {
        this.f204171d = str2;
        this.f204181q = i;
        HashMap hashMap = new HashMap();
        hashMap.put("transfer_id", str2);
        hashMap.put("trans_id", str);
        hashMap.put("invalid_time", i2 + "");
        hashMap.put("group_username", str3);
        setRequestData(hashMap);
    }

    /* renamed from: j1 */
    public static C70597d m83115j1(JSONObject jSONObject) {
        C70597d dVar = new C70597d();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        dVar.f204203a = jSONObject.optInt("type");
        dVar.f204204b = jSONObject.optString("url");
        dVar.f204205c = jSONObject.optString("username");
        dVar.f204206d = jSONObject.optString("pagepath");
        return dVar;
    }

    /* renamed from: k1 */
    public static C70599f m83116k1(JSONObject jSONObject) {
        C70599f.C70600a aVar;
        C70599f fVar = new C70599f();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        fVar.f204211a = jSONObject.optInt("recv_channel_type");
        fVar.f204212b = jSONObject.optString("recv_channel_name");
        fVar.f204213c = jSONObject.optString("recv_channel_logo");
        fVar.f204214d = jSONObject.optString("recv_channel_logo_darkmode");
        fVar.f204215e = jSONObject.optInt("recv_channel_avail_state");
        fVar.f204216f = jSONObject.optInt("recv_channel_unavail_reason");
        fVar.f204217g = jSONObject.optString("first_choose_wording");
        fVar.f204218h = m83117l1(jSONObject.optJSONObject("jump_remind_info"));
        fVar.f204219i = m83118m1(jSONObject.optJSONObject("unavail_tips"));
        JSONObject optJSONObject = jSONObject.optJSONObject("recv_channel_sub_title");
        ArrayList<C70599f.C70601b> arrayList = null;
        if (optJSONObject == null) {
            aVar = null;
        } else {
            aVar = new C70599f.C70600a();
            try {
                byte[] decode = Base64.decode(optJSONObject.optString("wording", ""), 0);
                if (decode.length != 0) {
                    zf4 zf4 = new zf4();
                    aVar.f204225a = zf4;
                    zf4.parseFrom(decode);
                }
            } catch (IOException e) {
                Log.printErrStackTrace("Micromsg.NetSceneTenpayRemittanceQuery", e, "", new Object[0]);
            }
            try {
                byte[] decode2 = Base64.decode(optJSONObject.optString("info_icon", ""), 0);
                if (decode2.length != 0) {
                    C48730al alVar = new C48730al();
                    aVar.f204226b = alVar;
                    alVar.parseFrom(decode2);
                }
            } catch (IOException unused) {
            }
        }
        fVar.f204220j = aVar;
        try {
            byte[] decode3 = Base64.decode(jSONObject.optString("recv_channel_name_note", ""), 0);
            if (decode3.length != 0) {
                zf4 zf42 = new zf4();
                fVar.f204221k = zf42;
                zf42.parseFrom(decode3);
            }
        } catch (IOException unused2) {
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("switch_availchannel_tips");
        if (optJSONArray != null) {
            arrayList = new ArrayList<>();
            int i = 0;
            while (i < optJSONArray.length()) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        C70599f.C70601b bVar = new C70599f.C70601b();
                        bVar.f204227a = jSONObject2.optInt("recv_channel_type", 0);
                        bVar.f204228b = m83118m1(jSONObject2.optJSONObject("switch_tips"));
                        arrayList.add(bVar);
                    }
                    i++;
                } catch (JSONException e2) {
                    Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e2.getMessage());
                }
            }
        }
        fVar.f204222l = arrayList;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("once_usage_tips");
        if (optJSONObject2 != null) {
            fVar.f204223m = m83118m1(optJSONObject2);
        }
        String optString = jSONObject.optString("first_choose_guide", "");
        if (!Util.isNullOrNil(optString)) {
            try {
                byte[] decode4 = Base64.decode(optString, 0);
                if (decode4.length != 0) {
                    C50456mv3 mv32 = new C50456mv3();
                    fVar.f204224n = mv32;
                    mv32.parseFrom(decode4);
                }
            } catch (IOException e3) {
                Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parse first_choose_guide error：%s", e3.getMessage());
            }
        }
        return fVar;
    }

    /* renamed from: l1 */
    public static C70602g m83117l1(JSONObject jSONObject) {
        C70602g gVar = new C70602g();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        gVar.f204229a = jSONObject.optString("wording");
        gVar.f204230b = m83115j1(jSONObject.optJSONObject("jump_info"));
        return gVar;
    }

    /* renamed from: m1 */
    public static C70603h m83118m1(JSONObject jSONObject) {
        C70603h hVar = new C70603h();
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        hVar.f204231a = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        hVar.f204232b = jSONObject.optString("wording");
        hVar.f204233c = jSONObject.optString("btn_text");
        return hVar;
    }

    public int getFuncId() {
        return 1628;
    }

    public int getTenpayCgicmd() {
        return 0;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/transferquery";
    }

    public void onGYNetEnd(int i, String str, JSONObject jSONObject) {
        C70598e eVar;
        Log.m105918d("Micromsg.NetSceneTenpayRemittanceQuery", "errCode " + i + " errMsg: " + str);
        if (i == 0) {
            this.f204172e = jSONObject.optInt("pay_time");
            this.f204173f = jSONObject.optDouble("fee") / 100.0d;
            this.f204174g = jSONObject.optString("fee_type");
            this.f204175h = jSONObject.optInt("trans_status");
            jSONObject.optString("trans_status_name");
            this.f204179o = jSONObject.optInt("modify_time");
            this.f204177j = jSONObject.optString("payer_name");
            this.f204176i = jSONObject.optString("receiver_name");
            this.f204178n = jSONObject.optBoolean("is_payer");
            this.f204180p = jSONObject.optString("refund_bank_type");
            this.f204182r = jSONObject.optString("status_desc");
            this.f204183s = jSONObject.optString("status_supplementary");
            this.f204184t = jSONObject.optInt("delay_confirm_flag");
            jSONObject.optString("banner_content");
            jSONObject.optString("banner_url");
            this.f204185u = jSONObject.optString("desc");
            JSONObject optJSONObject = jSONObject.optJSONObject("addr_info");
            C70594a aVar = new C70594a();
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            aVar.f204191a = optJSONObject.optString("address_name");
            aVar.f204192b = optJSONObject.optString("phone_num");
            aVar.f204193c = optJSONObject.optString("address");
            this.f204186v = aVar;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("exposure_info");
            C70596c cVar = new C70596c();
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            cVar.f204197a = optJSONObject2.optString("icon");
            cVar.f204198b = optJSONObject2.optString("name");
            cVar.f204199c = optJSONObject2.optString("wording");
            cVar.f204200d = optJSONObject2.optInt("is_show_btn");
            cVar.f204201e = optJSONObject2.optString("btn_wording");
            cVar.f204202f = m83115j1(optJSONObject2.optJSONObject("jump_info"));
            this.f204187w = cVar;
            this.f204188x = m83117l1(jSONObject.optJSONObject("text_info"));
            JSONObject optJSONObject3 = jSONObject.optJSONObject("resend_info");
            ResendMsgInfo resendMsgInfo = new ResendMsgInfo();
            if (optJSONObject3 == null) {
                optJSONObject3 = new JSONObject();
            }
            resendMsgInfo.f211425d = optJSONObject3.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            resendMsgInfo.f211426e = optJSONObject3.optString("pic");
            resendMsgInfo.f211427f = optJSONObject3.optString("description");
            resendMsgInfo.f211428g = optJSONObject3.optString("left_button_wording");
            resendMsgInfo.f211429h = optJSONObject3.optString("right_button_wording");
            this.f204189y = resendMsgInfo;
            m83117l1(jSONObject.optJSONObject("middle_info"));
            JSONArray optJSONArray = jSONObject.optJSONArray("desc_item_list");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList res：%s", optJSONArray.toString());
            ArrayList<C70595b> arrayList = new ArrayList<>();
            int i2 = 0;
            while (i2 < optJSONArray.length()) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                    if (jSONObject2 != null) {
                        C70595b bVar = new C70595b();
                        bVar.f204194a = jSONObject2.optString("key");
                        bVar.f204195b = jSONObject2.optString("value");
                        bVar.f204196c = jSONObject2.optBoolean("is_separate_line");
                        arrayList.add(bVar);
                    }
                    i2++;
                } catch (JSONException e) {
                    Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseDescItemList error：%s", e.getMessage());
                }
            }
            this.f204190z = arrayList;
            this.f204167A = jSONObject.optInt("trade_mem_type", 0);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("upright_corner_list");
            if (optJSONArray2 == null) {
                optJSONArray2 = new JSONArray();
            }
            Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList res：%s", optJSONArray2.toString());
            ArrayList<C70602g> arrayList2 = new ArrayList<>();
            int i3 = 0;
            while (i3 < optJSONArray2.length()) {
                try {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i3);
                    if (jSONObject3 != null) {
                        arrayList2.add(m83117l1(jSONObject3));
                    }
                    i3++;
                } catch (JSONException e2) {
                    Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e2.getMessage());
                }
            }
            this.f204170D = arrayList2;
            this.f204168B = C75228t.m90237b0(jSONObject.optJSONObject("notice_item"));
            JSONObject optJSONObject4 = jSONObject.optJSONObject("recv_account_info");
            if (optJSONObject4 == null) {
                eVar = null;
            } else {
                C70598e eVar2 = new C70598e();
                eVar2.f204207a = m83118m1(optJSONObject4.optJSONObject("acct_usage_tips"));
                eVar2.f204208b = optJSONObject4.optString("no_availabel_account_wording");
                eVar2.f204209c = optJSONObject4.optString("list_title");
                JSONArray optJSONArray3 = optJSONObject4.optJSONArray("recv_channel");
                if (optJSONArray3 == null) {
                    optJSONArray3 = new JSONArray();
                }
                ArrayList<C70599f> arrayList3 = new ArrayList<>();
                int i4 = 0;
                while (i4 < optJSONArray3.length()) {
                    try {
                        JSONObject jSONObject4 = optJSONArray3.getJSONObject(i4);
                        if (jSONObject4 != null) {
                            arrayList3.add(m83116k1(jSONObject4));
                        }
                        i4++;
                    } catch (JSONException e3) {
                        Log.m105925i("Micromsg.NetSceneTenpayRemittanceQuery", "parseOptionItemList error：%s", e3.getMessage());
                    }
                }
                eVar2.f204210d = arrayList3;
                eVar = eVar2;
            }
            this.f204169C = eVar;
        }
    }
}
