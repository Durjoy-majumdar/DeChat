package p248ug;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p014mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatSomeFeatureSwitch;
import com.tencent.p014mm.sdk.storage.IAutoDBItem;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C116734h6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p227rn.C48052u;
import p749xh.C53349s0;
import rb0.C47996o;

/* renamed from: ug.c */
public class C52558c extends C53349s0 implements C48052u {

    /* renamed from: Q0 */
    public static int f146781Q0 = 0;

    /* renamed from: R0 */
    public static C52560b f146782R0 = null;

    /* renamed from: y0 */
    public static IAutoDBItem.MAutoDBInfo f146783y0 = C53349s0.initAutoDBInfo(C52558c.class);

    /* renamed from: p0 */
    public List<C52559a> f146784p0;

    /* renamed from: x0 */
    public C52560b f146785x0;

    /* renamed from: ug.c$a */
    public static class C52559a {

        /* renamed from: a */
        public String f146786a;

        /* renamed from: b */
        public String f146787b;

        /* renamed from: c */
        public String f146788c;

        /* renamed from: d */
        public String f146789d;
    }

    /* renamed from: ug.c$b */
    public static class C52560b {

        /* renamed from: A */
        public String f146790A;

        /* renamed from: B */
        public String f146791B;

        /* renamed from: C */
        public boolean f146792C;

        /* renamed from: D */
        public C52561a f146793D;

        /* renamed from: E */
        public List<WxaAttributes.WxaEntryInfo> f146794E;

        /* renamed from: a */
        public JSONObject f146795a = null;

        /* renamed from: b */
        public boolean f146796b = false;

        /* renamed from: c */
        public boolean f146797c = false;

        /* renamed from: d */
        public boolean f146798d = false;

        /* renamed from: e */
        public String f146799e;

        /* renamed from: f */
        public String f146800f;

        /* renamed from: g */
        public List<C52568g> f146801g = null;

        /* renamed from: h */
        public C52566e f146802h = null;

        /* renamed from: i */
        public C52565d f146803i = null;

        /* renamed from: j */
        public C52563c f146804j = null;

        /* renamed from: k */
        public C52567f f146805k = null;

        /* renamed from: l */
        public C52563c.C52564a f146806l = null;

        /* renamed from: m */
        public boolean f146807m = false;

        /* renamed from: n */
        public boolean f146808n = false;

        /* renamed from: o */
        public int f146809o;

        /* renamed from: p */
        public boolean f146810p = false;

        /* renamed from: q */
        public int f146811q = 0;

        /* renamed from: r */
        public int f146812r = 0;

        /* renamed from: s */
        public String f146813s;

        /* renamed from: t */
        public C52562b f146814t = null;

        /* renamed from: u */
        public int f146815u = 0;

        /* renamed from: v */
        public int f146816v;

        /* renamed from: w */
        public String f146817w;

        /* renamed from: x */
        public boolean f146818x;

        /* renamed from: y */
        public int f146819y;

        /* renamed from: z */
        public C52569h f146820z;

        /* renamed from: ug.c$b$a */
        public static class C52561a {

            /* renamed from: a */
            public ArrayList<String> f146821a;
        }

        /* renamed from: ug.c$b$b */
        public static class C52562b {

            /* renamed from: a */
            public int f146822a;

            /* renamed from: b */
            public int f146823b;

            /* renamed from: c */
            public int f146824c;

            /* renamed from: a */
            public boolean mo73527a() {
                return (this.f146822a & 1) > 0;
            }
        }

        /* renamed from: ug.c$b$c */
        public static class C52563c {

            /* renamed from: a */
            public int f146825a;

            /* renamed from: b */
            public List<C47996o> f146826b = null;

            /* renamed from: ug.c$b$c$a */
            public static class C52564a {

                /* renamed from: a */
                public String f146827a;

                /* renamed from: b */
                public int f146828b;

                /* renamed from: c */
                public String f146829c;

                /* renamed from: d */
                public String f146830d;

                /* renamed from: e */
                public long f146831e = 0;
            }
        }

        /* renamed from: ug.c$b$d */
        public static class C52565d {

            /* renamed from: a */
            public String f146832a;

            /* renamed from: b */
            public String f146833b;

            /* renamed from: c */
            public String f146834c;

            /* renamed from: d */
            public String f146835d;
        }

        /* renamed from: ug.c$b$e */
        public static class C52566e {

            /* renamed from: a */
            public int f146836a = 0;

            /* renamed from: b */
            public String f146837b;

            /* renamed from: c */
            public String f146838c;

            /* renamed from: d */
            public String f146839d;

            /* renamed from: e */
            public String f146840e;
        }

        /* renamed from: ug.c$b$f */
        public static class C52567f {

            /* renamed from: a */
            public int f146841a;

            /* renamed from: b */
            public String f146842b;

            /* renamed from: c */
            public List<String> f146843c;

            /* renamed from: d */
            public String f146844d;
        }

        /* renamed from: ug.c$b$g */
        public static class C52568g {

            /* renamed from: a */
            public String f146845a;

            /* renamed from: b */
            public String f146846b;

            /* renamed from: c */
            public String f146847c;
        }

        /* renamed from: ug.c$b$h */
        public static class C52569h {

            /* renamed from: a */
            public String f146848a;

            /* renamed from: b */
            public String f146849b;

            /* renamed from: c */
            public boolean f146850c;

            /* renamed from: d */
            public String f146851d;
        }

        public C52560b() {
            IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52558c.f146783y0;
            this.f146816v = 0;
            this.f146818x = false;
            this.f146792C = false;
        }

        /* renamed from: a */
        public static C52560b m58867a(String str) {
            C52560b bVar = new C52560b();
            if (!Util.isNullOrNil(str)) {
                try {
                    System.currentTimeMillis();
                    bVar.f146795a = new JSONObject(str);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                }
            }
            return bVar;
        }

        /* renamed from: b */
        public C52561a mo73509b() {
            JSONObject jSONObject;
            C52561a aVar;
            if (this.f146793D == null && (jSONObject = this.f146795a) != null) {
                String optString = jSONObject.optString("AcctTransferInfo");
                if (Util.isNullOrNil(optString)) {
                    aVar = null;
                } else {
                    C52561a aVar2 = new C52561a();
                    Log.m105919d("MicroMsg.BizInfo", "BizAcctTransferInfo is [%s]", optString);
                    try {
                        JSONArray optJSONArray = new JSONObject(optString).optJSONArray("origin_name_list");
                        if (optJSONArray != null) {
                            aVar2.f146821a = new ArrayList<>();
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                aVar2.f146821a.add(optJSONArray.optString(i));
                            }
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                    aVar = aVar2;
                }
                this.f146793D = aVar;
            }
            return this.f146793D;
        }

        /* renamed from: c */
        public C52563c mo73510c() {
            String optString;
            JSONObject jSONObject = this.f146795a;
            if (!(jSONObject == null || this.f146804j != null || (optString = jSONObject.optString("MMBizMenu")) == null)) {
                Log.m105924i("MicroMsg.BizInfo", "MenuInfo = " + optString);
                C52563c cVar = new C52563c();
                if (optString.length() > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        jSONObject2.optInt("update_time");
                        cVar.f146825a = jSONObject2.optInt("type", 0);
                        cVar.f146826b = C47996o.m53358d(jSONObject2.optJSONArray("button_list"));
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146804j = cVar;
            }
            return this.f146804j;
        }

        /* renamed from: d */
        public C52563c.C52564a mo73511d() {
            String optString;
            JSONObject jSONObject = this.f146795a;
            if (!(jSONObject == null || this.f146806l != null || (optString = jSONObject.optString("EnterpriseBizInfo")) == null)) {
                Log.m105924i("MicroMsg.BizInfo", "EnterpriseBizInfo = " + optString);
                C52563c.C52564a aVar = new C52563c.C52564a();
                if (optString.length() > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        aVar.f146827a = jSONObject2.optString("belong");
                        jSONObject2.optString("freeze_wording");
                        aVar.f146828b = jSONObject2.optInt("child_type");
                        aVar.f146829c = jSONObject2.optString("home_url");
                        String optString2 = jSONObject2.optString("exattr");
                        if (Util.isNullOrNil(optString2)) {
                            aVar.f146830d = null;
                        } else {
                            JSONObject jSONObject3 = new JSONObject(optString2);
                            aVar.f146830d = jSONObject3.optString("chat_extension_url");
                            aVar.f146831e = jSONObject3.optLong("app_id");
                        }
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146806l = aVar;
            }
            return this.f146806l;
        }

        /* renamed from: e */
        public C52562b mo73512e() {
            String optString;
            JSONObject jSONObject = this.f146795a;
            if (!(jSONObject == null || this.f146814t != null || (optString = jSONObject.optString("HardwareBizInfo")) == null)) {
                Log.m105924i("MicroMsg.BizInfo", "HardwareBizInfo = " + optString);
                C52562b bVar = new C52562b();
                if (optString.length() > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        bVar.f146822a = jSONObject2.optInt("hardware_flag");
                        bVar.f146823b = jSONObject2.optInt("connect_status_display_mode");
                        bVar.f146824c = jSONObject2.optInt("special_internal_brand_type");
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146814t = bVar;
            }
            return this.f146814t;
        }

        /* renamed from: f */
        public C52567f mo73513f() {
            int length;
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null && this.f146805k == null) {
                String optString = jSONObject.optString("PayShowInfo");
                C52567f fVar = null;
                if (!Util.isNullOrNil(optString)) {
                    try {
                        C52567f fVar2 = new C52567f();
                        JSONObject jSONObject2 = new JSONObject(optString);
                        fVar2.f146841a = jSONObject2.optInt("reputation_level", -1);
                        fVar2.f146842b = jSONObject2.optString("scope_of_business");
                        fVar2.f146844d = jSONObject2.optString("guarantee_detail_h5_url");
                        JSONArray optJSONArray = jSONObject2.optJSONArray("guarantee_info");
                        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
                            fVar2.f146843c = new ArrayList();
                            for (int i = 0; i < length; i++) {
                                String string = optJSONArray.getString(i);
                                if (!Util.isNullOrNil(string)) {
                                    ((ArrayList) fVar2.f146843c).add(string);
                                }
                            }
                        }
                        fVar = fVar2;
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146805k = fVar;
            }
            return this.f146805k;
        }

        /* renamed from: g */
        public List<C52568g> mo73514g() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null && this.f146801g == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray("Privilege");
                LinkedList linkedList = new LinkedList();
                if (optJSONArray != null) {
                    try {
                        int length = optJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            C52568g gVar = new C52568g();
                            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                            gVar.f146845a = optJSONObject.optString("icon");
                            gVar.f146846b = optJSONObject.optString("description");
                            gVar.f146847c = optJSONObject.optString("description_key");
                            linkedList.add(gVar);
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146801g = linkedList;
            }
            return this.f146801g;
        }

        /* renamed from: h */
        public C52569h mo73515h() {
            String optString;
            JSONObject jSONObject = this.f146795a;
            if (!(jSONObject == null || this.f146820z != null || (optString = jSONObject.optString("RegisterSource")) == null)) {
                Log.m105925i("MicroMsg.BizInfo", "RegisterSource = %s", optString);
                C52569h hVar = new C52569h();
                if (optString.length() > 0) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        hVar.f146848a = jSONObject2.optString("RegisterBody");
                        hVar.f146849b = jSONObject2.optString("IntroUrl");
                        hVar.f146850c = jSONObject2.optInt("IsClose", 0) == 1;
                        hVar.f146851d = jSONObject2.optString("AboutBizUrl");
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception in RegisterSource:%s", Util.stackTraceToString(e));
                    }
                }
                this.f146820z = hVar;
            }
            return this.f146820z;
        }

        /* renamed from: i */
        public String mo73516i() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146817w = jSONObject.optString("ServicePhone");
            }
            return this.f146817w;
        }

        /* renamed from: j */
        public int mo73517j() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146812r = jSONObject.optInt("ServiceType", 0);
            }
            return this.f146812r;
        }

        /* renamed from: k */
        public String mo73518k() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146813s = jSONObject.optString("SupportEmoticonLinkPrefix");
            }
            return this.f146813s;
        }

        /* renamed from: l */
        public String mo73519l() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146791B = jSONObject.optString("TrademarkName");
            }
            return this.f146791B;
        }

        /* renamed from: m */
        public String mo73520m() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146790A = jSONObject.optString("TrademarkUrl");
            }
            return this.f146790A;
        }

        /* renamed from: n */
        public C52566e mo73521n() {
            C52566e eVar;
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null && this.f146802h == null) {
                String optString = jSONObject.optString("VerifySource");
                if (Util.isNullOrNil(optString)) {
                    eVar = null;
                } else {
                    Log.m105925i("MicroMsg.BizInfo", "biz verify info is [%s]", optString);
                    C52566e eVar2 = new C52566e();
                    try {
                        JSONObject jSONObject2 = new JSONObject(optString);
                        eVar2.f146836a = jSONObject2.optInt("Type");
                        eVar2.f146837b = jSONObject2.optString("Description");
                        eVar2.f146838c = jSONObject2.optString("Name");
                        eVar2.f146839d = jSONObject2.optString("IntroUrl");
                        eVar2.f146840e = jSONObject2.optString("VerifySubTitle");
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
                    }
                    Log.m105925i("MicroMsg.BizInfo", "type[%d],desc[%s],name[%s],url[%s]", Integer.valueOf(eVar2.f146836a), eVar2.f146837b, eVar2.f146838c, eVar2.f146839d);
                    eVar = eVar2;
                }
                this.f146802h = eVar;
            }
            return this.f146802h;
        }

        /* renamed from: o */
        public String mo73522o() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                this.f146799e = jSONObject.optString("VerifyContactPromptTitle");
            }
            return this.f146799e;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
        /* renamed from: p */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.tencent.p014mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo> mo73523p() {
            /*
                r7 = this;
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r0 = r7.f146794E
                if (r0 != 0) goto L_0x007d
                java.util.LinkedList r0 = new java.util.LinkedList
                r0.<init>()
                r7.f146794E = r0
                org.json.JSONObject r0 = r7.f146795a
                if (r0 == 0) goto L_0x007d
                java.lang.String r1 = "BindWxaInfo"
                java.lang.String r0 = r0.optString(r1)
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                r2 = 0
                if (r1 != 0) goto L_0x0023
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0022 }
                r1.<init>(r0)     // Catch:{ JSONException -> 0x0022 }
                goto L_0x0024
            L_0x0022:
            L_0x0023:
                r1 = r2
            L_0x0024:
                if (r1 == 0) goto L_0x002c
                java.lang.String r0 = "wxaEntryInfo"
                org.json.JSONArray r2 = r1.optJSONArray(r0)
            L_0x002c:
                if (r2 == 0) goto L_0x007d
                r0 = 0
            L_0x002f:
                int r1 = r2.length()
                if (r0 >= r1) goto L_0x007d
                org.json.JSONObject r1 = r2.optJSONObject(r0)
                if (r1 != 0) goto L_0x003c
                goto L_0x007a
            L_0x003c:
                java.lang.String r3 = "username"
                java.lang.String r3 = r1.optString(r3)
                java.lang.String r4 = "title"
                java.lang.String r4 = r1.optString(r4)
                java.lang.String r5 = "title_key"
                java.lang.String r5 = r1.optString(r5)
                java.lang.String r6 = "icon_url"
                java.lang.String r1 = r1.optString(r6)
                boolean r6 = android.text.TextUtils.isEmpty(r3)
                if (r6 == 0) goto L_0x005b
                goto L_0x007a
            L_0x005b:
                boolean r6 = android.text.TextUtils.isEmpty(r4)
                if (r6 == 0) goto L_0x0068
                boolean r6 = android.text.TextUtils.isEmpty(r5)
                if (r6 == 0) goto L_0x0068
                goto L_0x007a
            L_0x0068:
                com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo r6 = new com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo
                r6.<init>()
                r6.f108666d = r3
                r6.f108667e = r4
                r6.f108668f = r5
                r6.f108669g = r1
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r1 = r7.f146794E
                r1.add(r6)
            L_0x007a:
                int r0 = r0 + 1
                goto L_0x002f
            L_0x007d:
                java.util.List<com.tencent.mm.plugin.appbrand.config.WxaAttributes$WxaEntryInfo> r0 = r7.f146794E
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p248ug.C52558c.C52560b.mo73523p():java.util.List");
        }

        /* renamed from: q */
        public boolean mo73524q() {
            JSONObject jSONObject = this.f146795a;
            if (!(jSONObject == null || jSONObject.optJSONObject("WifiBizInfo") == null || this.f146795a.optJSONObject("WifiBizInfo").optInt("IsWXWiFi") != 1)) {
                this.f146792C = true;
            }
            return this.f146792C;
        }

        /* renamed from: r */
        public boolean mo73525r() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                boolean z = false;
                if (Util.getInt(jSONObject.optString("ReportLocationType"), 0) > 0) {
                    z = true;
                }
                this.f146807m = z;
            }
            return this.f146807m;
        }

        /* renamed from: s */
        public boolean mo73526s() {
            JSONObject jSONObject = this.f146795a;
            if (jSONObject != null) {
                String optString = jSONObject.optString("NotifyManage");
                IAutoDBItem.MAutoDBInfo mAutoDBInfo = C52558c.f146783y0;
                this.f146816v = Util.getInt(optString, 0);
            }
            int i = this.f146816v;
            IAutoDBItem.MAutoDBInfo mAutoDBInfo2 = C52558c.f146783y0;
            return i == 1;
        }
    }

    /* renamed from: B */
    public String mo72807B() {
        C52560b.C52563c.C52564a d;
        String str;
        mo73499q2();
        C52560b bVar = this.f146785x0;
        if (bVar == null || (d = bVar.mo73511d()) == null || (str = d.f146829c) == null || str.isEmpty()) {
            return null;
        }
        return d.f146829c;
    }

    /* renamed from: E1 */
    public String mo72808E1() {
        return this.field_extInfo;
    }

    /* renamed from: G1 */
    public boolean mo72809G1() {
        if (System.currentTimeMillis() - this.field_updateTime > 86400000) {
            return true;
        }
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        return this.field_updateTime < instance.getTimeInMillis();
    }

    public void convertFrom(Cursor cursor) {
        super.convertFrom(cursor);
    }

    public ContentValues convertTo() {
        return super.convertTo();
    }

    /* renamed from: e0 */
    public boolean mo72810e0() {
        mo73499q2();
        C52560b bVar = this.f146785x0;
        if (bVar == null) {
            Log.m105924i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo() null");
            return true;
        } else if (bVar.mo73515h() != null) {
            return !this.f146785x0.mo73515h().f146850c;
        } else {
            Log.m105924i("MicroMsg.BizInfo", "isShowUserName bizInfo.getExtInfo().getRegisterSource() null");
            return true;
        }
    }

    /* renamed from: g1 */
    public boolean mo72811g1() {
        mo73499q2();
        return this.field_type == 2;
    }

    public IAutoDBItem.MAutoDBInfo getDBInfo() {
        return f146783y0;
    }

    /* renamed from: i1 */
    public String mo72812i1() {
        return this.field_brandIconURL;
    }

    /* renamed from: l2 */
    public void mo73494l2() {
        mo73499q2();
        C52560b bVar = this.f146785x0;
        JSONObject jSONObject = bVar.f146795a;
        if (jSONObject != null) {
            bVar.f146809o = jSONObject.optInt("ConnectorMsgType");
        }
        this.field_acceptType = bVar.f146809o;
        this.field_type = mo73500r2(false).mo73517j();
        if (mo73501s2()) {
            this.field_bitFlag = 1 | this.field_bitFlag;
        } else {
            this.field_bitFlag &= -2;
        }
    }

    /* renamed from: m2 */
    public boolean mo73495m2() {
        return (this.field_brandFlag & 4) != 0;
    }

    /* renamed from: n1 */
    public boolean mo72813n1() {
        mo73499q2();
        C52560b bVar = this.f146785x0;
        JSONObject jSONObject = bVar.f146795a;
        if (jSONObject != null) {
            bVar.f146811q = jSONObject.optInt("ScanQRCodeType", 0);
        }
        return bVar.f146811q == 1;
    }

    /* renamed from: n2 */
    public List<C52559a> mo73496n2() {
        List<C52559a> list = this.f146784p0;
        if (list != null) {
            return list;
        }
        this.f146784p0 = new LinkedList();
        String str = this.field_brandInfo;
        if (str == null || str.length() == 0) {
            return this.f146784p0;
        }
        try {
            JSONArray optJSONArray = new JSONObject(this.field_brandInfo).optJSONArray("urls");
            for (int i = 0; i < optJSONArray.length(); i++) {
                C52559a aVar = new C52559a();
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                aVar.f146786a = optJSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                aVar.f146788c = optJSONObject.optString("url");
                aVar.f146787b = optJSONObject.optString("title_key");
                aVar.f146789d = optJSONObject.optString("description");
                this.f146784p0.add(aVar);
            }
        } catch (Exception e) {
            Log.m105921e("MicroMsg.BizInfo", "exception:%s", Util.stackTraceToString(e));
        }
        return this.f146784p0;
    }

    /* renamed from: o2 */
    public long mo73497o2() {
        C52560b.C52563c.C52564a d;
        mo73499q2();
        C52560b bVar = this.f146785x0;
        if (!(bVar == null || (d = bVar.mo73511d()) == null)) {
            long j = d.f146831e;
            if (j != 0) {
                return j;
            }
        }
        return 0;
    }

    /* renamed from: p2 */
    public String mo73498p2() {
        String str;
        try {
            str = mo73500r2(false).mo73511d().f146827a;
        } catch (NullPointerException unused) {
            str = "";
        }
        if (Util.isNullOrNil(str)) {
            Log.m105921e("MicroMsg.BizInfo", "check father: %s, %s", this.field_username, str);
        }
        return str;
    }

    /* renamed from: q2 */
    public C52560b mo73499q2() {
        return mo73500r2(false);
    }

    /* renamed from: r0 */
    public void mo72814r0(String str) {
        this.field_extInfo = str;
    }

    /* renamed from: r2 */
    public C52560b mo73500r2(boolean z) {
        if (this.f146785x0 == null || z) {
            if (Util.isNullOrNil(this.field_extInfo) || f146781Q0 != this.field_extInfo.hashCode()) {
                if (!C72996z1.m85805J5(this.field_username) || !WeChatSomeFeatureSwitch.hardcodeWeChatUSTeam()) {
                    C52560b a = C52560b.m58867a(this.field_extInfo);
                    this.f146785x0 = a;
                    f146782R0 = a;
                } else {
                    synchronized (C116734h6.C45610f.class) {
                        MMApplicationContext.getContext();
                        Log.m105920e("MicroMsg.XAgreementSettings", "hardcode_wechat_us_team is null!!!");
                    }
                    C52560b a2 = C52560b.m58867a("");
                    this.f146785x0 = a2;
                    f146782R0 = a2;
                }
                f146781Q0 = Util.nullAsNil(this.field_extInfo).hashCode();
            } else {
                this.f146785x0 = f146782R0;
            }
        }
        return this.f146785x0;
    }

    /* renamed from: s2 */
    public boolean mo73501s2() {
        mo73499q2();
        C52560b bVar = this.f146785x0;
        if (bVar == null || bVar.mo73511d() == null) {
            return false;
        }
        boolean z = this.f146785x0.f146806l.f146828b == 1;
        if (z) {
            int i = this.field_bitFlag;
            if (!((1 & i) != 0)) {
                this.field_bitFlag = i | 1;
                ((C52557b0) C86312j.m106911c(C52557b0.class)).ol0(this);
            }
        }
        if (z) {
            Log.m105919d("MicroMsg.BizInfo", "EnterpriseChat,userName : %s", this.field_username);
        }
        return z;
    }

    public void setUsername(String str) {
        this.field_username = str;
    }

    /* renamed from: t2 */
    public boolean mo73502t2() {
        mo73499q2();
        return this.field_type == 3;
    }

    /* renamed from: u2 */
    public boolean mo73503u2() {
        mo73499q2();
        int i = this.field_type;
        return i == 2 || i == 3;
    }

    /* renamed from: v2 */
    public boolean mo73504v2() {
        mo73499q2();
        C52560b bVar = this.f146785x0;
        if (bVar == null || bVar.mo73511d() == null) {
            return false;
        }
        boolean z = this.f146785x0.f146806l.f146828b == 2;
        if (z) {
            int i = this.field_bitFlag;
            if (!((2 & i) != 0)) {
                this.field_bitFlag = 2 | i;
                ((C52557b0) C86312j.m106911c(C52557b0.class)).ol0(this);
            }
        }
        if (z) {
            Log.m105919d("MicroMsg.BizInfo", "EnterpriseWeb,userName : %s", this.field_username);
        }
        return z;
    }

    /* renamed from: w2 */
    public boolean mo73505w2() {
        mo73499q2();
        Log.m105925i("MicroMsg.BizInfo", "is report location, user %s %B", this.field_username, Boolean.valueOf(this.f146785x0.mo73525r()));
        return this.f146785x0.mo73525r();
    }

    /* renamed from: x2 */
    public boolean mo73506x2() {
        mo73499q2();
        return this.field_type == 1;
    }

    /* renamed from: y2 */
    public boolean mo73507y2() {
        mo73499q2();
        return this.field_type == 0;
    }

    /* renamed from: z2 */
    public boolean mo73508z2() {
        return (this.field_brandFlag & 1) == 0;
    }
}
