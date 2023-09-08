package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import o40.C61926c;
import p910lj.C76701a;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import tm0.C14044y;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p2 */
public final class C6539p2 extends C15053a {

    /* renamed from: d */
    public static final C6539p2 f23706d = new C6539p2();

    /* renamed from: e */
    public static final int f23707e = 403;

    /* renamed from: f */
    public static final String f23708f = C14044y.NAME;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.p2$a */
    public static final class C6540a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6540a(C13855j jVar) {
            super(0);
            this.f23709d = jVar;
        }

        public Object invoke() {
            Context context = this.f23709d.f38998a;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lmm), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("data");
        String str = obj instanceof String ? (String) obj : null;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        Object obj2 = h1Var.f38983a.get("htmlText");
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        if (str3 != null) {
            str2 = str3;
        }
        ClipboardHelper.setText(jVar.f38998a, MimeTypes.BASE_TYPE_TEXT, str, str2);
        C61926c.m72668M(new C6540a(jVar));
        C13849g gVar = jVar.f39001d;
        String str4 = h1Var.f38990c;
        gVar.mo10774a(str4, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23707e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23708f;
    }
}
