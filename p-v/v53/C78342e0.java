package v53;

import b63.C0248u;
import b63.C67187h;
import b63.C67204s;
import b63.C67207t;
import com.tencent.p014mm.plugin.wallet_core.model.ECardInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import fr3.C75790l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import vt1.C78473a;

/* renamed from: v53.e0 */
public class C78342e0 extends C75790l {

    /* renamed from: A */
    public C67207t f229553A;

    /* renamed from: B */
    public ArrayList<C0248u> f229554B;

    /* renamed from: C */
    public String f229555C;

    /* renamed from: D */
    public boolean f229556D = false;

    /* renamed from: d */
    public String f229557d;

    /* renamed from: e */
    public String f229558e;

    /* renamed from: f */
    public String f229559f;

    /* renamed from: g */
    public String f229560g;

    /* renamed from: h */
    public String f229561h;

    /* renamed from: i */
    public String f229562i = "";

    /* renamed from: j */
    public int f229563j = 0;

    /* renamed from: n */
    public String f229564n = "";

    /* renamed from: o */
    public String f229565o = "";

    /* renamed from: p */
    public String f229566p = "";

    /* renamed from: q */
    public String f229567q = "";

    /* renamed from: r */
    public String f229568r = "";

    /* renamed from: s */
    public String f229569s = "";

    /* renamed from: t */
    public LinkedList<String> f229570t = new LinkedList<>();

    /* renamed from: u */
    public ECardInfo f229571u;

    /* renamed from: v */
    public int f229572v = 0;

    /* renamed from: w */
    public Map<String, String> f229573w;

    /* renamed from: x */
    public Map<String, String> f229574x;

    /* renamed from: y */
    public C67187h f229575y;

    /* renamed from: z */
    public C67204s f229576z;

    public C78342e0(String str, int i) {
        Log.m105925i("MicroMsg.NetSceneTenpayQueryBindBankcard", "NetSceneTenpayQueryBoundBankcard scene:%s", Integer.valueOf(i));
        HashMap hashMap = new HashMap();
        this.f229573w = hashMap;
        this.f229572v = i;
        hashMap.put("req_key", str);
        Map<String, String> map = this.f229573w;
        map.put("bind_query_scene", "" + i);
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        if (aVar == null || !aVar.isRoot()) {
            this.f229573w.put("is_root", "0");
        } else {
            this.f229573w.put("is_root", "1");
        }
        if (aVar != null) {
            this.f229573w.put("is_device_open_touch", "1");
            Map<String, String> t0 = aVar.mo107915t0();
            if (t0 != null) {
                this.f229573w.putAll(t0);
            }
            Log.m105924i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is true");
        } else {
            this.f229573w.put("is_device_open_touch", "0");
            Log.m105924i("MicroMsg.NetSceneTenpayQueryBindBankcard", "is_device_open_touch is false");
        }
        setRequestData(this.f229573w);
        this.f229574x = new HashMap();
        C86709a0.m107528h();
        C86709a0.m107528h();
        this.f229574x.put("bind_serial", (String) C86709a0.m107535s().mo121142i().mo119684e(196612, (Object) null));
        this.f229574x.put("last_bind_serial", (String) C86709a0.m107535s().mo121142i().mo119684e(196613, (Object) null));
        setWXRequestData(this.f229574x);
    }

    public int getFuncId() {
        return 1501;
    }

    public int getTenpayCgicmd() {
        return 72;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/bindquerynew";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: b63.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: b63.h} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r17, java.lang.String r18, org.json.JSONObject r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            com.tencent.mm.storage.y1$a r2 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_OFFLINE_DISABLE_BLOCK_LAYER_STRING_SYNC
            java.lang.Class<ub3.b> r3 = ub3.C78144b.class
            com.tencent.mm.storage.y1$a r4 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_BIND_CARD_MENU_STRING_SYNC
            java.lang.Class<yz.v> r5 = p281yz.C79173v.class
            if (r17 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.String r6 = "real_name_info"
            boolean r7 = r1.has(r6)
            r8 = 0
            java.lang.String r9 = "MicroMsg.NetSceneTenpayQueryBindBankcard"
            java.lang.String r10 = ""
            r11 = 1
            r12 = 0
            if (r7 == 0) goto L_0x0148
            org.json.JSONObject r6 = r1.optJSONObject(r6)
            com.tencent.p014mm.plugin.wallet_core.model.ECardInfo.m5536b(r6)
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r13 = r6.toString()
            r7[r12] = r13
            java.lang.String r13 = "get real_name_info %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r13, r7)
            java.lang.String r7 = "guide_flag"
            java.lang.String r7 = r6.optString(r7)
            r0.f229557d = r7
            java.lang.String r7 = "guide_wording"
            java.lang.String r7 = r6.optString(r7)
            r0.f229558e = r7
            java.lang.String r7 = "left_button_wording"
            java.lang.String r7 = r6.optString(r7)
            r0.f229559f = r7
            java.lang.String r7 = "right_button_wording"
            java.lang.String r7 = r6.optString(r7)
            r0.f229560g = r7
            java.lang.String r7 = "upload_credit_url"
            java.lang.String r13 = r6.optString(r7)
            r0.f229561h = r13
            java.lang.String r13 = "done_button_wording"
            java.lang.String r13 = r6.optString(r13)
            r0.f229562i = r13
            java.lang.String r13 = "is_show_protocol"
            int r13 = r6.optInt(r13, r12)
            r0.f229563j = r13
            java.lang.String r13 = "left_protocol_wording"
            java.lang.String r13 = r6.optString(r13)
            r0.f229564n = r13
            java.lang.String r13 = "new_upload_credit_url"
            java.lang.String r13 = r6.optString(r13)
            r0.f229565o = r13
            java.lang.String r13 = "protocol_url"
            java.lang.String r13 = r6.optString(r13)
            r0.f229566p = r13
            java.lang.String r13 = "right_protocol_wording"
            java.lang.String r13 = r6.optString(r13)
            r0.f229567q = r13
            java.lang.String r13 = "subtitle"
            java.lang.String r13 = r6.optString(r13)
            r0.f229568r = r13
            java.lang.String r13 = "title"
            java.lang.String r13 = r6.optString(r13)
            r0.f229569s = r13
            java.lang.String r13 = "upload_reasons"
            org.json.JSONArray r13 = r6.optJSONArray(r13)
            java.util.LinkedList<java.lang.String> r14 = r0.f229570t
            r14.clear()
            if (r13 == 0) goto L_0x00bf
            r14 = 0
        L_0x00ac:
            int r15 = r13.length()
            if (r14 >= r15) goto L_0x00bf
            java.util.LinkedList<java.lang.String> r15 = r0.f229570t
            java.lang.String r11 = r13.optString(r14)
            r15.add(r11)
            int r14 = r14 + 1
            r11 = 1
            goto L_0x00ac
        L_0x00bf:
            java.lang.String r11 = "ecard_info"
            boolean r13 = r6.has(r11)
            if (r13 == 0) goto L_0x014b
            org.json.JSONObject r6 = r6.optJSONObject(r11)
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = new com.tencent.mm.plugin.wallet_core.model.ECardInfo
            r11.<init>()
            r0.f229571u = r11
            java.lang.String r13 = r0.f229569s
            r11.f21892p = r13
            java.util.ArrayList r13 = new java.util.ArrayList
            java.util.LinkedList<java.lang.String> r14 = r0.f229570t
            r13.<init>(r14)
            r11.f21893q = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = r0.f229566p
            r11.f21895s = r13
            java.lang.String r13 = r0.f229564n
            r11.f21896t = r13
            java.lang.String r13 = r0.f229567q
            r11.f21897u = r13
            java.lang.String r13 = r0.f229562i
            r11.f21894r = r13
            java.lang.String r13 = "ecard_open_scene"
            int r13 = r6.optInt(r13, r12)
            r11.f21883d = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "ecard_type"
            java.lang.String r13 = r6.optString(r13, r10)
            r11.f21884e = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "show_check_box"
            int r13 = r6.optInt(r13, r12)
            r11.f21885f = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "check_box_selected"
            int r13 = r6.optInt(r13, r12)
            r11.f21886g = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "check_box_left_wording"
            java.lang.String r13 = r6.optString(r13, r10)
            r11.f21887h = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "check_box_right_wording"
            java.lang.String r13 = r6.optString(r13, r10)
            r11.f21888i = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "check_box_url"
            java.lang.String r13 = r6.optString(r13, r10)
            r11.f21889j = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r13 = "is_upload_credid"
            int r13 = r6.optInt(r13, r12)
            r11.f21890n = r13
            com.tencent.mm.plugin.wallet_core.model.ECardInfo r11 = r0.f229571u
            java.lang.String r6 = r6.optString(r7, r10)
            r11.f21891o = r6
            goto L_0x014b
        L_0x0148:
            com.tencent.p014mm.plugin.wallet_core.model.ECardInfo.m5536b(r8)
        L_0x014b:
            java.lang.String r6 = "paymenu_array"
            boolean r7 = r1.has(r6)
            if (r7 == 0) goto L_0x0172
            int r7 = r0.f229572v
            r11 = 1
            if (r7 != r11) goto L_0x0172
            org.json.JSONArray r6 = r1.optJSONArray(r6)
            if (r6 == 0) goto L_0x0172
            java.lang.String r6 = r6.toString()
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_INDEX_MAIDAN_STRING_SYNC
            r7.mo119677K(r11, r6)
        L_0x0172:
            java.lang.String r6 = "pay_manage_label"
            boolean r7 = r1.has(r6)
            if (r7 == 0) goto L_0x01b4
            org.json.JSONArray r6 = r1.optJSONArray(r6)
            if (r6 == 0) goto L_0x01b4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.f229554B = r7
            r7 = 0
        L_0x0188:
            int r11 = r6.length()
            if (r7 >= r11) goto L_0x01a0
            org.json.JSONObject r11 = r6.optJSONObject(r7)
            if (r11 == 0) goto L_0x019d
            b63.u r11 = b63.C0248u.m207a(r11)
            java.util.ArrayList<b63.u> r13 = r0.f229554B
            r13.add(r11)
        L_0x019d:
            int r7 = r7 + 1
            goto L_0x0188
        L_0x01a0:
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_WALLET_PAY_MANAGE_LABEL_LIST_STRING_SYNC
            java.lang.String r6 = r6.toString()
            r7.mo119677K(r11, r6)
        L_0x01b4:
            java.lang.String r6 = "home_half_page"
            boolean r7 = r1.has(r6)
            if (r7 == 0) goto L_0x01c2
            java.lang.String r6 = r1.optString(r6)
            r0.f229555C = r6
        L_0x01c2:
            java.lang.String r6 = "time_stamp"
            long r6 = r1.optLong(r6)
            r13 = 0
            int r11 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x01e2
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            com.tencent.p014mm.wallet_core.model.C7088m0.m7308b(r6)
            goto L_0x01e7
        L_0x01e2:
            java.lang.String r6 = "no time_stamp in bindquerynew."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r6)
        L_0x01e7:
            int r6 = r0.f229572v
            boolean r7 = r0.f229556D
            r11 = 1
            b63.C67196n0.m79484k(r1, r6, r11, r7)
            int r6 = r0.f229572v
            boolean r6 = b63.C67196n0.m79481h(r6)
            if (r6 != 0) goto L_0x01fb
            int r6 = r0.f229572v
            if (r6 != r11) goto L_0x0231
        L_0x01fb:
            java.lang.String r6 = "bind_card_menu"
            org.json.JSONObject r6 = r1.optJSONObject(r6)
            if (r6 == 0) goto L_0x0223
            java.lang.Object[] r7 = new java.lang.Object[r11]
            java.lang.String r11 = r6.toString()
            r7[r12] = r11
            java.lang.String r11 = "bind card menu: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r11, r7)
            f40.C86709a0.m107528h()
            f40.o r7 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r7 = r7.mo121142i()
            java.lang.String r6 = r6.toString()
            r7.mo119677K(r4, r6)
            goto L_0x0231
        L_0x0223:
            f40.C86709a0.m107528h()
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            r6.mo119677K(r4, r10)
        L_0x0231:
            java.lang.Class<vt1.a> r4 = vt1.C78473a.class
            k40.a r4 = f40.C86709a0.m107533q(r4)
            vt1.a r4 = (vt1.C78473a) r4
            if (r4 == 0) goto L_0x02c5
            java.lang.String r6 = "IFingerPrintMgr is not null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            r4.mo107909dx()
            di3.d r6 = di3.C86312j.m106911c(r5)
            yz.v r6 = (p281yz.C79173v) r6
            b63.s0 r6 = r6.Ex0()
            int r6 = r6.mo91317G()
            if (r6 != 0) goto L_0x0289
            boolean r6 = r4.mo107921ys()
            if (r6 == 0) goto L_0x026e
            di3.d r5 = di3.C86312j.m106911c(r5)
            yz.v r5 = (p281yz.C79173v) r5
            b63.s0 r5 = r5.Ex0()
            boolean r5 = r5.mo91340v()
            r4.mo107878Fg(r5)
            r4.W00(r12)
            goto L_0x02ca
        L_0x026e:
            boolean r6 = r4.Fk0()
            if (r6 == 0) goto L_0x02ca
            di3.d r5 = di3.C86312j.m106911c(r5)
            yz.v r5 = (p281yz.C79173v) r5
            b63.s0 r5 = r5.Ex0()
            boolean r5 = r5.mo91340v()
            r4.W00(r5)
            r4.mo107878Fg(r12)
            goto L_0x02ca
        L_0x0289:
            r7 = 1
            if (r6 != r7) goto L_0x02a7
            boolean r7 = r4.mo107921ys()
            if (r7 == 0) goto L_0x02a7
            di3.d r5 = di3.C86312j.m106911c(r5)
            yz.v r5 = (p281yz.C79173v) r5
            b63.s0 r5 = r5.Ex0()
            boolean r5 = r5.mo91340v()
            r4.mo107878Fg(r5)
            r4.W00(r12)
            goto L_0x02ca
        L_0x02a7:
            r7 = 2
            if (r6 != r7) goto L_0x02ca
            boolean r6 = r4.Fk0()
            if (r6 == 0) goto L_0x02ca
            di3.d r5 = di3.C86312j.m106911c(r5)
            yz.v r5 = (p281yz.C79173v) r5
            b63.s0 r5 = r5.Ex0()
            boolean r5 = r5.mo91340v()
            r4.W00(r5)
            r4.mo107878Fg(r12)
            goto L_0x02ca
        L_0x02c5:
            java.lang.String r4 = "IFingerPrintMgr is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r4)
        L_0x02ca:
            int r4 = r0.f229572v
            r5 = 10
            if (r4 != r5) goto L_0x0326
            java.lang.String r2 = "action_entry"
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            if (r1 != 0) goto L_0x02d9
            goto L_0x0322
        L_0x02d9:
            b63.h r8 = new b63.h
            r8.<init>()
            java.lang.String r2 = "id"
            r1.optString(r2)
            java.lang.String r2 = "wording"
            java.lang.String r2 = r1.optString(r2)
            r8.f192894a = r2
            java.lang.String r2 = "color"
            r1.optString(r2)
            java.lang.String r2 = "type"
            int r2 = r1.optInt(r2)
            r8.f192895b = r2
            java.lang.String r2 = "native_url"
            java.lang.String r2 = r1.optString(r2)
            r8.f192896c = r2
            java.lang.String r2 = "web_url"
            java.lang.String r2 = r1.optString(r2)
            r8.f192897d = r2
            java.lang.String r2 = "tiny_app_username"
            java.lang.String r2 = r1.optString(r2)
            r8.f192898e = r2
            java.lang.String r2 = "tiny_app_path"
            java.lang.String r2 = r1.optString(r2)
            r8.f192899f = r2
            java.lang.String r2 = "entrance_type"
            r1.optInt(r2)
        L_0x0322:
            r0.f229575y = r8
            goto L_0x03a7
        L_0x0326:
            r5 = 8
            if (r4 != r5) goto L_0x03a7
            java.lang.String r4 = "block_layer"
            boolean r5 = r1.has(r4)
            if (r5 == 0) goto L_0x037a
            org.json.JSONObject r4 = r1.optJSONObject(r4)
            if (r4 != 0) goto L_0x0339
            goto L_0x0378
        L_0x0339:
            b63.s r8 = new b63.s
            r8.<init>()
            java.lang.String r5 = "view_id"
            int r5 = r4.optInt(r5)
            r8.f192941a = r5
            java.lang.String r5 = "is_show_block_layer"
            int r5 = r4.optInt(r5)
            r8.f192942b = r5
            java.lang.String r5 = "waiting_time"
            int r5 = r4.optInt(r5)
            r8.f192943c = r5
            java.lang.String r5 = "main_wording"
            java.lang.String r5 = r4.optString(r5)
            r8.f192944d = r5
            java.lang.String r5 = "reminder_content"
            java.lang.String r5 = r4.optString(r5)
            r8.f192945e = r5
            java.lang.String r5 = "repayment_tiny_app_path"
            java.lang.String r5 = r4.optString(r5)
            r8.f192947g = r5
            java.lang.String r5 = "repayment_tiny_app_username"
            java.lang.String r4 = r4.optString(r5)
            r8.f192946f = r4
        L_0x0378:
            r0.f229576z = r8
        L_0x037a:
            java.lang.String r4 = "disable_block_layer"
            org.json.JSONObject r1 = r1.optJSONObject(r4)
            if (r1 == 0) goto L_0x039a
            b63.t r4 = b63.C67207t.m79538a(r1)
            r0.f229553A = r4
            di3.d r3 = di3.C86312j.m106911c(r3)
            ub3.b r3 = (ub3.C78144b) r3
            com.tencent.mm.wallet_core.model.q0 r3 = r3.mo107980OI()
            java.lang.String r1 = r1.toString()
            r3.mo119993e(r2, r1)
            goto L_0x03a7
        L_0x039a:
            di3.d r1 = di3.C86312j.m106911c(r3)
            ub3.b r1 = (ub3.C78144b) r1
            com.tencent.mm.wallet_core.model.q0 r1 = r1.mo107980OI()
            r1.mo119993e(r2, r10)
        L_0x03a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v53.C78342e0.onGYNetEnd(int, java.lang.String, org.json.JSONObject):void");
    }
}
