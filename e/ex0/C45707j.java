package ex0;

import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.vfs.C86009m1;
import fy3.C32224a;
import gy3.C87413o;
import java.util.HashMap;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sx3.C90364q0;

/* renamed from: ex0.j */
public final class C45707j {

    /* renamed from: a */
    public static final C45707j f123535a = new C45707j();

    /* renamed from: b */
    public static final C13601g f123536b = C36568h.m40985a(C45708a.f123537d);

    /* renamed from: ex0.j$a */
    public static final class C45708a extends C87413o implements C32224a<HashMap<String, String>> {

        /* renamed from: d */
        public static final C45708a f123537d = new C45708a();

        public C45708a() {
            super(0);
        }

        public Object invoke() {
            C45707j jVar = C45707j.f123535a;
            return C90364q0.m113146e(new C13604l(C45707j.m50952a(jVar, 0), "weixin://resourceid/WeSearch/"), new C13604l(C45707j.m50952a(jVar, 1), "weixin://resourceid/TopStories/"));
        }
    }

    /* renamed from: a */
    public static final String m50952a(C45707j jVar, int i) {
        jVar.getClass();
        C86009m1 m1Var = new C86009m1(C43471q.m46978b(i));
        return "file://" + m1Var.mo119971i();
    }
}
