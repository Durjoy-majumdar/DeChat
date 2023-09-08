package yf0;

import f40.C86709a0;
import hp3.C98494b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117880e;
import te3.C78021z;
import zf0.C53776k;

/* renamed from: yf0.c */
public class C79093c implements C98494b<C79092b> {

    /* renamed from: a */
    public C79092b f232240a;

    /* renamed from: b */
    public final C79094a f232241b = new C79094a();

    /* renamed from: yf0.c$a */
    public class C79094a implements C88820e<C78021z, C117880e<String, Integer, String, String, Integer>> {
        public C79094a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117880e eVar = (C117880e) obj;
            C79092b bVar = C79093c.this.f232240a;
            int intValue = ((Integer) eVar.mo182596a(4)).intValue();
            bVar.getClass();
            C53776k kVar = new C53776k((String) eVar.mo182596a(0), ((Integer) eVar.mo182596a(1)).intValue(), (String) eVar.mo182596a(2), (String) eVar.mo182596a(3), intValue);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(kVar);
            bVar.f232239d = C88643g.m110545c();
            return null;
        }
    }

    public C79093c() {
        C79092b bVar = new C79092b();
        this.f232240a = bVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f232240a;
    }
}
