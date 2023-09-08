package wk2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C87412m;
import java.util.HashMap;
import p255vr.C65873e;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import u73.C101982p;
import u73.C14134p0;
import xk2.C15805b;
import z04.C112551y;

/* renamed from: wk2.z */
public final class C15508z extends C15805b {

    /* renamed from: f */
    public static final C15508z f42053f = new C15508z();

    /* renamed from: g */
    public static final String f42054g = "startWebSearch";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("queryStr");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String str3 = (String) h1Var.f38983a.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (str3 != null) {
            str2 = str3;
        }
        Log.m105924i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch queryStr: " + str + ", scene: " + str2);
        if (C112551y.m153811k(str) || C112551y.m153811k(str2)) {
            Log.m105920e("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call startWebSearch param is empty");
            HashMap hashMap = new HashMap();
            hashMap.put("ret", "1");
            C13849g gVar = jVar.f39001d;
            String str4 = h1Var.f38990c;
            gVar.mo10774a(str4, h1Var.f38996i + ":param invalid", hashMap);
        } else {
            int safeDecodeInt = Util.safeDecodeInt(str2);
            String ep02 = ((C65873e) C86312j.m106911c(C65873e.class)).ep0(safeDecodeInt);
            C87412m.m108593f(ep02, "getService(IFTSApiLogicS…getUnsignedMd5UInt(scene)");
            Log.m105924i("MicroMsg.JsApiStartWebSearch", "ScanJsApi-Call doStartWebSearch  scene:" + safeDecodeInt + "  sessionId:" + ep02);
            C14134p0 p0Var = new C14134p0();
            p0Var.f39544a = jVar.f38998a;
            p0Var.f39545b = safeDecodeInt;
            p0Var.f39547d = str;
            p0Var.f39548e = ep02;
            p0Var.f39549f = true;
            p0Var.f39551h = true;
            p0Var.f39552i = false;
            p0Var.f39560q = true;
            p0Var.f39555l = false;
            ((C101982p) C86312j.m106911c(C101982p.class)).mo6877X6(p0Var);
            HashMap hashMap2 = new HashMap();
            hashMap2.put("ret", "0");
            C13849g gVar2 = jVar.f39001d;
            String str5 = h1Var.f38990c;
            gVar2.mo10774a(str5, h1Var.f38996i + ":ok", hashMap2);
        }
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42054g;
    }
}
