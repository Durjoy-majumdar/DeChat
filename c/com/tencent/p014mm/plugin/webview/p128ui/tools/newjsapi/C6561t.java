package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import p910lj.C76701a;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import tm0.C14027j;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t */
public final class C6561t extends C15053a {

    /* renamed from: d */
    public static final C6561t f23767d = new C6561t();

    /* renamed from: e */
    public static final int f23768e = 404;

    /* renamed from: f */
    public static final String f23769f = C14027j.NAME;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t$a */
    public static final class C6562a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C13855j f23770d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6562a(C13855j jVar) {
            super(0);
            this.f23770d = jVar;
        }

        public Object invoke() {
            Context context = this.f23770d.f38998a;
            C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.lm4), 0).show();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        HashMap hashMap = new HashMap();
        Object systemService = MMApplicationContext.getContext().getSystemService("clipboard");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipData primaryClip = ((ClipboardManager) systemService).getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            CharSequence text = itemAt.getText();
            if (text != null) {
                hashMap.put("data", text);
            }
            String htmlText = itemAt.getHtmlText();
            if (htmlText != null) {
                hashMap.put("htmlText", htmlText);
            }
        }
        C61926c.m72668M(new C6562a(jVar));
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        gVar.mo10774a(str, h1Var.f38996i + ":ok", hashMap);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23768e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23769f;
    }
}
