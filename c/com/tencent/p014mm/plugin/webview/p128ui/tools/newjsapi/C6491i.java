package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import ex0.C45696d;
import f40.C86709a0;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import p170ic.C87689c;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.i */
public final class C6491i extends C15053a {

    /* renamed from: d */
    public static final C6491i f23581d = new C6491i();

    /* renamed from: e */
    public static final int f23582e = 341;

    /* renamed from: f */
    public static final String f23583f = "createWebViewForFastLoad";

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.i$a */
    public static final class C6492a extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<Integer> f23584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6492a(ArrayList<Integer> arrayList) {
            super(1);
            this.f23584d = arrayList;
        }

        public Object invoke(Object obj) {
            int i;
            C87412m.m108594g(obj, "item");
            boolean z = obj instanceof String;
            if (z) {
                i = Util.safeParseInt(z ? (String) obj : null);
            } else {
                i = obj instanceof Integer ? ((Number) obj).intValue() : -1;
            }
            if (i != -1) {
                this.f23584d.add(Integer.valueOf(i));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        int safeParseInt = Util.safeParseInt(obj instanceof String ? (String) obj : null);
        String str = (String) h1Var.f38983a.get("itemShowTypes");
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            C87689c.m109089b(new JSONArray(str), new C6492a(arrayList));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(0);
        }
        Log.m105925i("MicroMsg.JsApiCreateWebViewForFastLoad", "createWebViewForFastLoad openScene: %d, itemShowTypeList: %s", Integer.valueOf(safeParseInt), arrayList);
        ((C45696d) C86709a0.m107533q(C45696d.class)).mo70988e3(safeParseInt, arrayList);
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, f23583f + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23582e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23583f;
    }
}
