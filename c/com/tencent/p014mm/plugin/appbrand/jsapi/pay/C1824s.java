package com.tencent.p014mm.plugin.appbrand.jsapi.pay;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kr0.C88267e;
import m00.C10700d;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p240sx.C13796o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.pay.s */
public final class C1824s extends C82268c<C88267e> {
    public static final int CTRL_INDEX = 1216;
    public static final String NAME = "quickSendRedPacket";

    /* renamed from: g */
    public final int f11627g = C87687a.m109085a(this);

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        C88267e eVar = (C88267e) fVar;
        Log.m105924i("JsApiQuickSendRedPacket", "invode jsapi quick send red packet");
        if (eVar != null) {
            if (eVar.getRuntime() == null) {
                eVar.mo109647a(i, mo115109j("fail:internal error"));
            } else if (jSONObject == null) {
                eVar.mo109647a(i, mo115109j("fail:invalid data"));
            } else if (eVar.getContext() instanceof MMFragmentActivity) {
                Log.m105924i("JsApiQuickSendRedPacket", "is MMFragmentActivity");
                Context context = eVar.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                MMFragmentActivity mMFragmentActivity = (MMFragmentActivity) context;
                String optString = jSONObject.optString("sessionId");
                String optString2 = jSONObject.optString("materialId");
                C115669n.INSTANCE.mo160131h(27809, 1, optString2, optString2, "", optString, Long.valueOf(System.currentTimeMillis()), 12);
                String string = eVar.getContext().getString(C0966R.string.ncb);
                C87412m.m108593f(string, "env.context.getString(R.…elect_conversation_title)");
                Intent OX = ((C13796o) C86312j.m106911c(C13796o.class)).mo13154OX(mMFragmentActivity, string);
                OX.putExtra("KQuickSendRedPacketSessionId", optString);
                OX.putExtra("KQuickSendRedPacketMaterialId", optString2);
                OX.putExtra("KQuickSendRedPacketFromMakeSkinMiniProgram", true);
                ((C10700d) C86312j.m106911c(C10700d.class)).mo10955P3(OX);
                C89916g.m112446a(eVar.getContext()).mo124232f(new C1822r(this, new WeakReference(eVar), eVar, i));
                mMFragmentActivity.startActivityForResult(OX, this.f11627g);
            }
        }
    }
}
