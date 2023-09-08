package s83;

import android.net.Uri;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.vfs.C116299g2;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.Map;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: s83.c */
public final class C48291c extends C87413o implements C32226l<C81038d0, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48292d f129309d;

    /* renamed from: e */
    public final /* synthetic */ Map<String, String> f129310e;

    /* renamed from: f */
    public final /* synthetic */ C15601d<Map<String, ? extends List<String>>> f129311f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48291c(C48292d dVar, Map<String, String> map, C15601d<? super Map<String, ? extends List<String>>> dVar2) {
        super(1);
        this.f129309d = dVar;
        this.f129310e = map;
        this.f129311f = dVar2;
    }

    public Object invoke(Object obj) {
        C81038d0 d0Var = (C81038d0) obj;
        C87412m.m108594g(d0Var, "conn");
        C48292d dVar = this.f129309d;
        Map<String, String> map = this.f129310e;
        C48290b bVar = new C48290b(dVar, this.f129311f);
        dVar.getClass();
        d0Var.f238054j = false;
        d0Var.f238053i = "GET";
        d0Var.f238056l = true;
        d0Var.f238058n = 2;
        for (Map.Entry next : map.entrySet()) {
            d0Var.mo112921e((String) next.getKey(), (String) next.getValue());
        }
        Uri n = C116299g2.m163858n("wcf://WebPrefetchContent/spa/auth");
        String path = n.getPath();
        if (path != null) {
            String k = C116299g2.m163855k(path, false, false);
            if (!n.getPath().equals(k)) {
                n = n.buildUpon().path(k).build();
            }
        }
        d0Var.f238055k = C116299g2.m163865u(n);
        d0Var.f238057m = new C48289a(bVar);
        d0Var.f238050f = 10000;
        d0Var.f238049e = 3000;
        d0Var.mo112934h();
        return C13598b0.f38549a;
    }
}
