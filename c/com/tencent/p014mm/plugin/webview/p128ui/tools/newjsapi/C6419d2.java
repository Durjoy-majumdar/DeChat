package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiAddDownloadTask;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1824s;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.Map;
import m00.C10700d;
import p240sx.C13796o;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.d2 */
public final class C6419d2 extends C15053a implements MMActivity.C6739d {

    /* renamed from: d */
    public static final C6419d2 f23411d = new C6419d2();

    /* renamed from: e */
    public static final String f23412e = "MicroMsg.JsApiQuickSendRedPacket";

    /* renamed from: f */
    public static final int f23413f = 215;

    /* renamed from: g */
    public static final int f23414g = JsApiAddDownloadTask.CTRL_INDEX;

    /* renamed from: h */
    public static final String f23415h = C1824s.NAME;

    /* renamed from: i */
    public static C13855j f23416i;

    /* renamed from: j */
    public static C13851h1 f23417j;

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (h1Var.f38983a.isEmpty()) {
            jVar.f39001d.mo10774a(h1Var.f38990c, "quickSendRedPacket:fail missing arguments", (Map<String, Object>) null);
        }
        f23416i = jVar;
        f23417j = h1Var;
        String str = (String) h1Var.f38983a.get("materialId");
        String str2 = (String) h1Var.f38983a.get("sessionId");
        if (jVar.f38998a instanceof MMActivity) {
            C115669n.INSTANCE.mo160131h(27809, 1, str, str, "", str2, Long.valueOf(System.currentTimeMillis()), 10);
            Context context = jVar.f38998a;
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            MMActivity mMActivity = (MMActivity) context;
            mMActivity.mmSetOnActivityResultCallback(this);
            String string = jVar.f38998a.getString(C0966R.string.n_y);
            C87412m.m108593f(string, "env.context.getString(R.…elect_conversation_title)");
            Intent OX = ((C13796o) C86312j.m106911c(C13796o.class)).mo13154OX(mMActivity, string);
            OX.putExtra("KQuickSendRedPacketSessionId", str2);
            OX.putExtra("KQuickSendRedPacketMaterialId", str);
            ((C10700d) C86312j.m106911c(C10700d.class)).mo10955P3(OX);
            mMActivity.startActivityForResult(OX, f23413f);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23414g;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23415h;
    }

    public void mmOnActivityResult(int i, int i2, Intent intent) {
        String str = f23412e;
        StringBuilder sb = new StringBuilder();
        sb.append("mmOnActivityResult. requestCode: ");
        sb.append(i);
        sb.append(", resultCode: ");
        sb.append(i2);
        sb.append(", data: ");
        sb.append(intent == null);
        Log.m105918d(str, sb.toString());
        if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("KEY_FINISH_ACTIVITY_REASON");
            if (C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_BACK_PRESSED")) {
                C13855j jVar = f23416i;
                if (jVar != null) {
                    C13849g gVar = jVar.f39001d;
                    C13851h1 h1Var = f23417j;
                    gVar.mo10774a(h1Var != null ? h1Var.f38990c : null, "quickSendRedPacket:selectSessionCancel ", (Map<String, Object>) null);
                }
            } else if (C87412m.m108589b(stringExtra, "KEY_FINISH_ACTIVITY_FOR_PAY_SUCCESS")) {
                C13855j jVar2 = f23416i;
                if (jVar2 != null) {
                    C13849g gVar2 = jVar2.f39001d;
                    C13851h1 h1Var2 = f23417j;
                    gVar2.mo10774a(h1Var2 != null ? h1Var2.f38990c : null, "quickSendRedPacket:ok", (Map<String, Object>) null);
                }
            } else {
                Log.m105924i(str, "unknow luckymoney finish reason");
                C13855j jVar3 = f23416i;
                if (jVar3 != null) {
                    C13849g gVar3 = jVar3.f39001d;
                    C13851h1 h1Var3 = f23417j;
                    gVar3.mo10774a(h1Var3 != null ? h1Var3.f38990c : null, "quickSendRedPacket:unknown ", (Map<String, Object>) null);
                }
            }
        }
    }
}
