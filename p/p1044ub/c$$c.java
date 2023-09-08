package p1044ub;

import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82510g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82865o;

/* renamed from: ub.c$$c */
public class c$$c extends C82865o {

    /* renamed from: b */
    public final /* synthetic */ C90630c f260379b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c$$c(C90630c cVar, C82510g gVar) {
        super(gVar);
        this.f260379b = cVar;
    }

    @JavascriptInterface
    public String readLibSync(String str) {
        return TextUtils.isEmpty(str) ? "" : this.f260379b.mo114272k().mo113372b(str);
    }
}
