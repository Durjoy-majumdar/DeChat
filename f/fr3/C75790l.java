package fr3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45118l0;
import com.tencent.p014mm.wallet_core.model.C75108e;
import com.tencent.p014mm.wallet_core.model.C75117g0;
import com.tencent.p014mm.wallet_core.model.C75140t0;
import com.tencent.xweb.util.WXWebReporter;
import com.tenpay.android.wechat.TenpayUtil;
import eb0.C75592q0;
import ie3.C76330f;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import ob0.C11385n;
import ob0.C47350c;
import org.json.JSONObject;
import te3.C51018qv3;
import te3.tf4;
import te3.uf4;

/* renamed from: fr3.l */
public abstract class C75790l extends C75117g0 {
    public static final boolean IS_SPLIT_CGI = true;
    public static final String TAG = "MicroMsg.NetSenceTenPayBase";
    public static Vector<String> cgiFunNameVector = new Vector<>();
    public boolean isFake = false;

    static {
        int i = 0;
        while (true) {
            String[] strArr = C76330f.f223588b;
            if (i < strArr.length) {
                cgiFunNameVector.add(strArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public boolean canRetry() {
        return true;
    }

    public void certSignConfig() {
        String str = this.f221047rr.f127057c;
        if (cgiFunNameVector.contains(str)) {
            Log.m105919d(TAG, "black cgi bye bye %s", str);
            return;
        }
        Log.m105925i(TAG, "cert try get errormsg %s", Integer.valueOf(C75108e.m90085b().mo104812c()));
        long currentTimeMillis = System.currentTimeMillis();
        C75108e.m90085b().mo104814e(MMApplicationContext.getContext());
        tf4 tf4 = (tf4) this.f221047rr.f127055a.f127080a;
        C51018qv3 qv32 = tf4.f185553f;
        String str2 = qv32 != null ? new String(qv32.f140574f.f257327a) : "";
        C51018qv3 qv33 = tf4.f185554g;
        String str3 = qv33 != null ? new String(qv33.f140574f.f257327a) : "";
        String str4 = new String((str2 + "&&" + str3).getBytes());
        C75140t0.m90124c().getClass();
        String b = C75140t0.m90123b();
        if (C75108e.m90085b().mo104815f(b)) {
            C115669n nVar = C115669n.INSTANCE;
            nVar.idkeyStat(414, 20, 1, true);
            C75108e b2 = C75108e.m90085b();
            b2.getClass();
            String a = b2.mo104811a(b, str4.getBytes(StandardCharsets.UTF_8));
            if (Util.isNullOrNil(a)) {
                nVar.mo160131h(20743, "user_identification", "pay_cert_sign", "", "", "", "", Integer.valueOf(C75108e.m90085b().mo104812c()));
            }
            C115669n nVar2 = nVar;
            String str5 = a;
            nVar2.idkeyStat(414, 21, System.currentTimeMillis() - currentTimeMillis, true);
            Log.m105927v(TAG, "sign ret src:%s sign:%s", str4, str5);
            tf4.f185555h = str5;
            tf4.f185556i = b;
        } else {
            Log.m105925i(TAG, "cert not exist cn %s %s", b, Integer.valueOf(C75108e.m90085b().mo104812c()));
        }
        Log.m105925i(TAG, "sign cost time %s cn %s", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), b);
    }

    public void configRequest(boolean z, boolean z2) {
        C47350c commReqResp = getCommReqResp();
        if (commReqResp == null) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new tf4();
            bVar.f127067b = new uf4();
            String uri = getUri();
            int funcId = getFuncId();
            bVar.f127068c = uri;
            bVar.f127069d = funcId;
            bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_DOWNLOAD;
            bVar.f127071f = 1000000185;
            commReqResp = bVar.mo72403a();
            commReqResp.setIsUserCmd(!canRetry());
        }
        tf4 tf4 = (tf4) commReqResp.f127055a.f127080a;
        if (z) {
            tf4.f185551d = getTenpayCgicmd();
        }
        if (z2) {
            tf4.f185552e = 1;
        }
        setCommReqResp(commReqResp);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        int doSceneSimulately;
        this.callback = nVar;
        certSignConfig();
        if (this.isFake && (doSceneSimulately = doSceneSimulately(this.f221047rr, gVar, nVar)) != -1) {
            return doSceneSimulately;
        }
        if (!C75592q0.m90763K()) {
            return dispatch(gVar, this.f221047rr, this);
        }
        Log.m105920e(TAG, "hy: serious error: is payupay");
        nVar.onSceneEnd(1000, -100868, "Pay Method Err", this);
        return 1;
    }

    public int doSceneSimulately(C47350c cVar, C114770g gVar, C11385n nVar) {
        tf4 tf4 = (tf4) cVar.f127055a.f127080a;
        C51018qv3 qv32 = tf4.f185553f;
        if (qv32 != null) {
            new String(qv32.f140574f.f257327a);
        }
        C51018qv3 qv33 = tf4.f185554g;
        if (qv33 != null) {
            new String(qv33.f140574f.f257327a);
        }
        MMApplicationContext.getContext();
        getPayCgicmd();
        if (!this.isFake) {
            return -1;
        }
        uf4 uf4 = (uf4) cVar.f127056b.f127083a;
        if (uf4 == null) {
            uf4 = new uf4();
        }
        byte[] bytes = "".getBytes();
        C51018qv3 qv34 = new C51018qv3();
        qv34.mo73350k(bytes);
        uf4.f185731d = qv34;
        uf4.f185734g = getPayCgicmd();
        uf4.f185732e = 0;
        try {
            JSONObject jSONObject = new JSONObject((String) null);
            uf4.f185735h = jSONObject.optInt("TenpayErrType");
            uf4.f185736i = jSONObject.optString("TenpayErrMsg");
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        onGYNetEnd(1, 0, 0, "", cVar, (byte[]) null);
        return 1;
    }

    public String getEncryptUrl(String str) {
        return TenpayUtil.signWith3Des(str);
    }

    public int getFuncId() {
        return 385;
    }

    public int getPayCgicmd() {
        return getTenpayCgicmd();
    }

    public C45118l0 getRetModel(C47350c cVar) {
        uf4 uf4 = (uf4) cVar.f127056b.f127083a;
        C45118l0 l0Var = new C45118l0();
        int i = uf4.f185734g;
        l0Var.f122388c = uf4.f185733f;
        l0Var.f122387b = uf4.f185732e;
        l0Var.f122386a = uf4.f185731d;
        l0Var.f122390e = uf4.f185736i;
        l0Var.f122389d = uf4.f185735h;
        return l0Var;
    }

    public abstract int getTenpayCgicmd();

    public int getType() {
        return 385;
    }

    public String getUri() {
        return "/cgi-bin/micromsg-bin/tenpay";
    }

    public void putToReqText(C47350c cVar, C51018qv3 qv32) {
        ((tf4) cVar.f127055a.f127080a).f185553f = qv32;
    }

    public void putToWXReqText(C47350c cVar, C51018qv3 qv32) {
        ((tf4) cVar.f127055a.f127080a).f185554g = qv32;
    }

    public void setFake() {
        this.isFake = true;
    }
}
