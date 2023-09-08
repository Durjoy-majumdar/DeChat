package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.p136ui.widget.snackbar.C75018a;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.C1640c;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import t83.C48590l;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.a3 */
public final class C6403a3 extends C15053a {

    /* renamed from: d */
    public static final C6403a3 f23376d = new C6403a3();

    /* renamed from: e */
    public static final int f23377e = C1640c.CTRL_INDEX;

    /* renamed from: f */
    public static final String f23378f = "showBottomToast";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.a3$a */
    public static final class C6404a implements C75018a.C75024d {

        /* renamed from: a */
        public final /* synthetic */ String f23379a;

        /* renamed from: b */
        public final /* synthetic */ C13855j f23380b;

        public C6404a(String str, C13855j jVar) {
            this.f23379a = str;
            this.f23380b = jVar;
        }

        /* renamed from: a */
        public final void mo7429a() {
            HashMap hashMap = new HashMap();
            String str = this.f23379a;
            C87412m.m108592e(str, "null cannot be cast to non-null type kotlin.String");
            hashMap.put("id", str);
            C13849g gVar = this.f23380b.f39001d;
            C87412m.m108592e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
            ((C48590l) gVar).mo8701f("onClickBottomToast", hashMap);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Context context = jVar.f38998a;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            Log.m105928w("MicroMsg.JsApiShowBottomToast", "invoke, activity is null");
            C13849g gVar = jVar.f39001d;
            String str = h1Var.f38990c;
            gVar.mo10774a(str, h1Var.f38996i + ":fail, activity is null!", (Map<String, Object>) null);
            return true;
        }
        String str2 = (String) h1Var.f38983a.get("id");
        String str3 = (String) h1Var.f38983a.get(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        if (Util.isNullOrNil(str2) || Util.isNullOrNil(str3)) {
            C13849g gVar2 = jVar.f39001d;
            String str4 = h1Var.f38990c;
            gVar2.mo10774a(str4, h1Var.f38996i + ":fail, id or title is null!", (Map<String, Object>) null);
            return true;
        }
        String str5 = (String) h1Var.f38983a.get("subtitle");
        if (C87412m.m108589b(h1Var.f38983a.get("clickable"), "true")) {
            C75026b.m89953c(activity, str3, str5, new C6404a(str2, jVar));
        } else {
            C75026b.m89953c(activity, str3, str5, (C75018a.C75024d) null);
        }
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23377e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23378f;
    }
}
