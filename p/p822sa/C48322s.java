package p822sa;

import android.webkit.JavascriptInterface;

/* renamed from: sa.s */
public class C48322s {

    /* renamed from: a */
    public C48318o f129386a;

    public C48322s(C48318o oVar) {
        this.f129386a = oVar;
    }

    @JavascriptInterface
    public String send(String str, boolean z) {
        C48318o oVar = this.f129386a;
        if (z) {
            return oVar.mo73015a(str, true);
        }
        oVar.f129376b.post(new C48317n(oVar, str));
        return "";
    }
}
