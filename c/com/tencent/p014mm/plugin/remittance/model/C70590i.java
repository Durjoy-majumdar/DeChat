package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import te3.C77907be0;
import te3.C77912ce0;
import te3.C77920eb0;
import te3.C77995sj;
import te3.C78000tj;
import te3.C78003uj;

/* renamed from: com.tencent.mm.plugin.remittance.model.i */
public class C70590i extends C75123k0 {

    /* renamed from: d */
    public C47350c f204118d;

    /* renamed from: e */
    public C78000tj f204119e;

    /* renamed from: f */
    public C78003uj f204120f;

    /* renamed from: g */
    public C11385n f204121g;

    /* renamed from: h */
    public C70582d f204122h;

    /* renamed from: i */
    public C70583e f204123i;

    /* renamed from: j */
    public boolean f204124j = false;

    /* renamed from: n */
    public String f204125n = "";

    /* renamed from: o */
    public boolean f204126o = false;

    /* renamed from: p */
    public int f204127p = 0;

    /* renamed from: com.tencent.mm.plugin.remittance.model.i$a */
    public static class C70591a {

        /* renamed from: a */
        public int f204128a;

        /* renamed from: b */
        public int f204129b;

        /* renamed from: c */
        public int f204130c;

        /* renamed from: d */
        public int f204131d;

        /* renamed from: e */
        public String f204132e;

        /* renamed from: f */
        public String f204133f;

        /* renamed from: g */
        public String f204134g;

        /* renamed from: h */
        public String f204135h;

        /* renamed from: i */
        public String f204136i;

        /* renamed from: j */
        public String f204137j;

        /* renamed from: k */
        public int f204138k;

        /* renamed from: l */
        public LinkedList<C77920eb0> f204139l;
    }

    public C70590i(C70591a aVar, C70582d dVar, C70583e eVar) {
        this.f204125n = System.currentTimeMillis() + "" + aVar.f204129b;
        C47350c.C47352b bVar = new C47350c.C47352b();
        this.f204127p = aVar.f204129b;
        bVar.f127066a = new C78000tj();
        bVar.f127067b = new C78003uj();
        bVar.f127069d = 2677;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fgetfavor";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f204118d = a;
        C78000tj tjVar = (C78000tj) a.f127055a.f127080a;
        this.f204119e = tjVar;
        tjVar.f228263d = aVar.f204129b;
        tjVar.f228264e = aVar.f204130c;
        tjVar.f228265f = aVar.f204131d;
        tjVar.f228266g = aVar.f204132e;
        tjVar.f228267h = aVar.f204133f;
        tjVar.f228268i = aVar.f204134g;
        tjVar.f228269j = aVar.f204135h;
        tjVar.f228270n = aVar.f204136i;
        tjVar.f228271o = aVar.f204137j;
        tjVar.f228272p = aVar.f204138k;
        tjVar.f228273q = aVar.f204128a;
        tjVar.f228274r = aVar.f204139l;
        this.f204122h = dVar;
        this.f204123i = eVar;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(String.format("request.amount %s", new Object[]{Integer.valueOf(this.f204119e.f228263d)}));
        stringBuffer.append(String.format("request.channel %s", new Object[]{Integer.valueOf(this.f204119e.f228264e)}));
        stringBuffer.append(String.format("request.scan_scene %s", new Object[]{Integer.valueOf(this.f204119e.f228265f)}));
        stringBuffer.append(String.format("request.receiver_desc %s", new Object[]{this.f204119e.f228266g}));
        stringBuffer.append(String.format("request.mch_name %s", new Object[]{this.f204119e.f228267h}));
        stringBuffer.append(String.format("request.favor_req_sign %s", new Object[]{this.f204119e.f228268i}));
        stringBuffer.append(String.format("request.receiver_openid %s", new Object[]{this.f204119e.f228269j}));
        stringBuffer.append(String.format("request.receiver_username %s", new Object[]{this.f204119e.f228270n}));
        stringBuffer.append(String.format("request.favor_req_extend %s", new Object[]{this.f204119e.f228271o}));
        stringBuffer.append(String.format("request.fail_click_cell %s", new Object[]{Integer.valueOf(this.f204119e.f228272p)}));
        Log.m105925i("MicroMsg.NetSceneBusiF2fGetFavor", "NetSceneBusiF2fGetFavor req %s", stringBuffer.toString());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f204121g = nVar;
        return dispatch(gVar, this.f204118d, this);
    }

    public int getType() {
        return 2677;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str2 = str;
        Log.m105925i("MicroMsg.NetSceneBusiF2fGetFavor", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str2);
        C78003uj ujVar = (C78003uj) ((C47350c) uVar).f127056b.f127083a;
        this.f204120f = ujVar;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(ujVar.f228302d);
        C78003uj ujVar2 = this.f204120f;
        objArr[1] = ujVar2.f228303e;
        C77995sj sjVar = ujVar2.f228304f;
        if (sjVar == null) {
            jSONObject = new JSONObject();
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("favor_info_list", C70580a.m83107a(sjVar.f228220d, new C77912ce0()));
                LinkedList<C77907be0> linkedList = sjVar.f228221e;
                new C77907be0();
                if (linkedList == null) {
                    jSONArray = new JSONArray();
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        int i4 = 0;
                        for (C77907be0 c : linkedList) {
                            jSONArray2.put(i4, C70580a.m83109c(c));
                            i4++;
                        }
                    } catch (Exception e) {
                        Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e, "", new Object[0]);
                    }
                    jSONArray = jSONArray2;
                }
                jSONObject2.put("favor_compose_result_list", jSONArray);
                jSONObject2.put("default_fav_compose_id", sjVar.f228222f);
                jSONObject2.put("favor_resp_sign", sjVar.f228223g);
                jSONObject2.put("no_compose_wording", sjVar.f228224h);
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e2, "", new Object[0]);
            }
            jSONObject = jSONObject2;
        }
        objArr[2] = jSONObject;
        Log.m105925i("MicroMsg.NetSceneBusiF2fGetFavor", "ret_code: %s, ret_msg: %s favor_comm_resp : %s", objArr);
        C11385n nVar = this.f204121g;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str2, this);
        }
    }
}
