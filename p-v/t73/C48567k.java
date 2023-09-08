package t73;

import android.webkit.ValueCallback;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import r73.C47930c;
import rx3.C13598b0;
import z04.C112551y;

/* renamed from: t73.k */
public final class C48567k extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f129937d;

    /* renamed from: e */
    public final /* synthetic */ C48558d f129938e;

    /* renamed from: f */
    public final /* synthetic */ String f129939f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48567k(String str, C48558d dVar, String str2) {
        super(1);
        this.f129937d = str;
        this.f129938e = dVar;
        this.f129939f = str2;
    }

    public Object invoke(Object obj) {
        String str;
        String str2 = (String) obj;
        C87412m.m108594g(str2, "prefetchId");
        String str3 = this.f129937d;
        if (str3 == null || C112551y.m153811k(str3)) {
            str = "";
        } else {
            str = ',' + this.f129937d;
        }
        C47930c.C47931a.m53253a(this.f129938e, this.f129939f, "{target:'" + str2 + '\'' + str + '}', (ValueCallback) null, 4, (Object) null);
        return C13598b0.f38549a;
    }
}
