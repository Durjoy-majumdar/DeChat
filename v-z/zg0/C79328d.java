package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.profile.C40475h;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51947xa2;
import te3.C52093ya2;

/* renamed from: zg0.d */
public class C79328d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f232891d;

    /* renamed from: e */
    public C47350c f232892e;

    public C79328d() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51947xa2();
        bVar.f127067b = new C52093ya2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/getinfo";
        bVar.f127069d = C40475h.CTRL_INDEX;
        C47350c a = bVar.mo72403a();
        this.f232892e = a;
        C51947xa2 xa22 = (C51947xa2) a.f127055a.f127080a;
        xa22.f144564g = 2;
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("invoice_info.title");
        linkedList.add("invoice_info.tax_number");
        linkedList.add("invoice_info.bank_number");
        linkedList.add("invoice_info.bank_name");
        linkedList.add("invoice_info.type");
        linkedList.add("invoice_info.email");
        linkedList.add("invoice_info.company_address");
        linkedList.add("invoice_info.company_address_detail");
        linkedList.add("invoice_info.company_address_postcode");
        linkedList.add("invoice_info.phone");
        xa22.f144563f = linkedList;
        xa22.f144562e = false;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f232891d = nVar;
        return dispatch(gVar, this.f232892e, this);
    }

    public int getType() {
        return C40475h.CTRL_INDEX;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:61|62|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e("MicroMsg.NetSceneGetUserAutoFillInfo", "parse error for no." + r9);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0199 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGYNetEnd(int r18, int r19, int r20, java.lang.String r21, com.tencent.p014mm.network.C114799u r22, byte[] r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            java.lang.String r4 = "invoice_url"
            java.lang.String r5 = "group_id"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "errType:"
            r6.append(r7)
            r6.append(r1)
            java.lang.String r7 = ",errCode:"
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = ",errMsg"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.NetSceneGetUserAutoFillInfo"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r6)
            if (r1 != 0) goto L_0x01b7
            if (r2 != 0) goto L_0x01b7
            yg0.a r6 = xg0.C78803b.wx0()
            r6.getClass()
            i12.a r8 = new i12.a
            r8.<init>()
            r6.f232271a = r8
            java.lang.String r6 = "return is 0.now we resetList and parse the json .."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            r6 = r22
            ob0.c r6 = (ob0.C47350c) r6
            ob0.c$d r6 = r6.f127056b
            pe3.a r6 = r6.f127083a
            te3.ya2 r6 = (te3.C52093ya2) r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "resp json is.."
            r8.append(r9)
            java.lang.String r9 = r6.f145212d
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            java.lang.String r8 = r6.f145212d
            if (r8 == 0) goto L_0x01b7
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r6 = r6.f145212d     // Catch:{ JSONException -> 0x01b2 }
            r8.<init>(r6)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r6 = "user_data_list"
            org.json.JSONArray r6 = r8.getJSONArray(r6)     // Catch:{ JSONException -> 0x01b2 }
            r8 = 0
            org.json.JSONObject r6 = r6.getJSONObject(r8)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r9 = "group_info_list"
            org.json.JSONArray r6 = r6.getJSONArray(r9)     // Catch:{ JSONException -> 0x01b2 }
            if (r6 == 0) goto L_0x01b7
            int r9 = r6.length()     // Catch:{ JSONException -> 0x01b2 }
            if (r9 <= 0) goto L_0x01b7
            r9 = 0
        L_0x008f:
            int r10 = r6.length()     // Catch:{ JSONException -> 0x01b2 }
            if (r9 >= r10) goto L_0x01b7
            org.json.JSONObject r10 = r6.getJSONObject(r9)     // Catch:{ JSONException -> 0x0199 }
            i12.b r11 = new i12.b     // Catch:{ JSONException -> 0x0199 }
            r11.<init>()     // Catch:{ JSONException -> 0x0199 }
            int r12 = r10.getInt(r5)     // Catch:{ JSONException -> 0x0199 }
            r11.f223378d = r12     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r12 = r10.getString(r4)     // Catch:{ JSONException -> 0x0199 }
            r11.f223390s = r12     // Catch:{ JSONException -> 0x0199 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0199 }
            r12.<init>()     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r13 = "get groupid:"
            r12.append(r13)     // Catch:{ JSONException -> 0x0199 }
            int r13 = r10.getInt(r5)     // Catch:{ JSONException -> 0x0199 }
            r12.append(r13)     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r13 = "get invoiceUrl:"
            r12.append(r13)     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r13 = r10.getString(r4)     // Catch:{ JSONException -> 0x0199 }
            r12.append(r13)     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0199 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r12)     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r12 = "field_list"
            org.json.JSONArray r10 = r10.getJSONArray(r12)     // Catch:{ JSONException -> 0x0199 }
            if (r10 == 0) goto L_0x0191
            int r12 = r10.length()     // Catch:{ JSONException -> 0x0199 }
            if (r12 <= 0) goto L_0x0191
            r12 = 0
        L_0x00dd:
            int r13 = r10.length()     // Catch:{ JSONException -> 0x0199 }
            if (r12 >= r13) goto L_0x0191
            org.json.JSONObject r13 = r10.getJSONObject(r12)     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r14 = "key"
            java.lang.String r14 = r13.getString(r14)     // Catch:{ JSONException -> 0x0199 }
            r15 = -1
            int r16 = r14.hashCode()     // Catch:{ JSONException -> 0x0199 }
            switch(r16) {
                case -1787383122: goto L_0x013f;
                case -192204195: goto L_0x0134;
                case 3575610: goto L_0x0129;
                case 96619420: goto L_0x011f;
                case 106642798: goto L_0x0115;
                case 110371416: goto L_0x010a;
                case 330208940: goto L_0x0100;
                case 944498430: goto L_0x00f6;
                default: goto L_0x00f5;
            }     // Catch:{ JSONException -> 0x0199 }
        L_0x00f5:
            goto L_0x0148
        L_0x00f6:
            java.lang.String r8 = "company_address_detail"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 7
            goto L_0x0148
        L_0x0100:
            java.lang.String r8 = "bank_number"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 3
            goto L_0x0148
        L_0x010a:
            java.lang.String r8 = "title"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 0
            goto L_0x0148
        L_0x0115:
            java.lang.String r8 = "phone"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 6
            goto L_0x0148
        L_0x011f:
            java.lang.String r8 = "email"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 5
            goto L_0x0148
        L_0x0129:
            java.lang.String r8 = "type"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 4
            goto L_0x0148
        L_0x0134:
            java.lang.String r8 = "tax_number"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 1
            goto L_0x0148
        L_0x013f:
            java.lang.String r8 = "bank_name"
            boolean r8 = r14.equals(r8)     // Catch:{ JSONException -> 0x0199 }
            if (r8 == 0) goto L_0x0148
            r15 = 2
        L_0x0148:
            java.lang.String r8 = "value"
            switch(r15) {
                case 0: goto L_0x0186;
                case 1: goto L_0x017f;
                case 2: goto L_0x0178;
                case 3: goto L_0x0171;
                case 4: goto L_0x016a;
                case 5: goto L_0x0163;
                case 6: goto L_0x0156;
                case 7: goto L_0x014f;
                default: goto L_0x014e;
            }
        L_0x014e:
            goto L_0x018c
        L_0x014f:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223389r = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x0156:
            java.lang.String r14 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223386o = r14     // Catch:{ JSONException -> 0x0199 }
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223387p = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x0163:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223388q = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x016a:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223379e = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x0171:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223383i = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x0178:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223384j = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x017f:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223382h = r8     // Catch:{ JSONException -> 0x0199 }
            goto L_0x018c
        L_0x0186:
            java.lang.String r8 = r13.getString(r8)     // Catch:{ JSONException -> 0x0199 }
            r11.f223380f = r8     // Catch:{ JSONException -> 0x0199 }
        L_0x018c:
            int r12 = r12 + 1
            r8 = 0
            goto L_0x00dd
        L_0x0191:
            yg0.a r8 = xg0.C78803b.wx0()     // Catch:{ JSONException -> 0x0199 }
            r8.mo109034a(r11)     // Catch:{ JSONException -> 0x0199 }
            goto L_0x01ad
        L_0x0199:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x01b2 }
            r8.<init>()     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r10 = "parse error for no."
            r8.append(r10)     // Catch:{ JSONException -> 0x01b2 }
            r8.append(r9)     // Catch:{ JSONException -> 0x01b2 }
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x01b2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r8)     // Catch:{ JSONException -> 0x01b2 }
        L_0x01ad:
            int r9 = r9 + 1
            r8 = 0
            goto L_0x008f
        L_0x01b2:
            java.lang.String r4 = "error parse this json"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r4)
        L_0x01b7:
            ob0.n r4 = r0.f232891d
            r4.onSceneEnd(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg0.C79328d.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.u, byte[]):void");
    }
}
