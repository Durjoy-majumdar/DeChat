package t73;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import rx3.C13598b0;

/* renamed from: t73.i */
public final class C48566i<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C48558d f129932a;

    /* renamed from: b */
    public final /* synthetic */ String f129933b;

    /* renamed from: c */
    public final /* synthetic */ C40480g f129934c;

    /* renamed from: d */
    public final /* synthetic */ String f129935d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C40480g, C13598b0> f129936e;

    public C48566i(C48558d dVar, String str, C40480g gVar, String str2, C32226l<? super C40480g, C13598b0> lVar) {
        this.f129932a = dVar;
        this.f129933b = str;
        this.f129934c = gVar;
        this.f129935d = str2;
        this.f129936e = lVar;
    }

    public void onReceiveValue(Object obj) {
        String str = (String) obj;
        this.f129932a.f129913G.put(this.f129933b, Integer.valueOf(this.f129934c.getContextId()));
        C48558d dVar = this.f129932a;
        String str2 = this.f129935d;
        C87412m.m108593f(str2, "domain");
        dVar.mo63600P1(str2);
        C32226l<C40480g, C13598b0> lVar = this.f129936e;
        C40480g gVar = this.f129934c;
        C87412m.m108593f(gVar, "this@apply");
        lVar.invoke(gVar);
        String str3 = this.f129932a.f129908B;
        Log.m105926v(str3, "create domain:" + this.f129935d + '#' + this.f129933b + " end");
    }
}
