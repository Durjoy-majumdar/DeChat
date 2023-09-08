package os0;

import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C8480h;
import in0.C87762h;
import kn0.C88235m;
import p300c8.C79946g;
import p300c8.C79953p;
import p300c8.C79958t;
import p300c8.C79967x;
import p333e8.C86463o;

/* renamed from: os0.b */
public final class C89293b extends C79953p {

    /* renamed from: r */
    public static final C89294a f257243r = new C89294a((C8480h) null);

    /* renamed from: os0.b$a */
    public static final class C89294a implements C79946g.C79947a {
        public C89294a(C8480h hVar) {
        }

        /* renamed from: a */
        public C89293b createDataSource() {
            return new C89293b(C87762h.m109196a(MMApplicationContext.getContext()), (C86463o<String>) null, C88235m.f255053a, 8000, 8000, true, new C79958t.C79963e());
        }
    }

    public C89293b(String str, C86463o<String> oVar, C79967x<? super C79953p> xVar, int i, int i2, boolean z, C79958t.C79963e eVar) {
        super(str, oVar, xVar, i, i2, z, eVar);
    }
}
