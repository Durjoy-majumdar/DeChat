package kr0;

import ai0.C79553f;
import com.tencent.p014mm.plugin.appbrand.C81596c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40482o;
import com.tencent.p014mm.plugin.appbrand.p025ad.p945ui.AppBrandAdUI;
import java.util.Map;

/* renamed from: kr0.f */
public class C88270f implements C82381f.C82382a {

    /* renamed from: a */
    public final /* synthetic */ C88267e f255143a;

    public C88270f(C88267e eVar) {
        this.f255143a = eVar;
    }

    /* renamed from: b */
    public boolean mo114784b(String str, C40482o oVar) {
        if ("requireRenderContext".equals(str)) {
            return true;
        }
        Map<String, Class<? extends AppBrandAdUI>> map = C79553f.f233288a;
        if (oVar instanceof C81596c) {
            return true;
        }
        if ("loadLibFiles".equals(str)) {
            return false;
        }
        return this.f255143a.isRunning();
    }
}
