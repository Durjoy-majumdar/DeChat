package wk2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.Map;
import nj3.C76912y0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import xk2.C15805b;

/* renamed from: wk2.e */
public final class C15488e extends C15805b {

    /* renamed from: f */
    public static final C15488e f42016f = new C15488e();

    /* renamed from: g */
    public static final String f42017g = "copy";

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        String str = (String) h1Var.f38983a.get("content");
        if (str == null) {
            str = "";
        }
        boolean z = false;
        Log.m105925i("MicroMsg.JsApiCopy", "ScanJsApi-Call:copy content: %s", str);
        ClipboardHelper.setText(MMApplicationContext.getContext(), str, str);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f42579e == 0 || System.currentTimeMillis() - this.f42579e >= 2000) {
            this.f42579e = currentTimeMillis;
            z = true;
        }
        if (z) {
            Context context = jVar.f38998a;
            C76912y0.m92773l(context, context.getString(C0966R.string.f7938wv));
        }
        C13849g gVar = jVar.f39001d;
        String str2 = h1Var.f38990c;
        gVar.mo10774a(str2, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f42017g;
    }
}
