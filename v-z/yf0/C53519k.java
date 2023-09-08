package yf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import hp3.C98494b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117878c;
import op3.C117879d;
import zf0.C53774e;

/* renamed from: yf0.k */
public class C53519k implements C98494b<C53518j> {

    /* renamed from: a */
    public C53518j f150483a;

    /* renamed from: b */
    public final C53521b f150484b = new C53521b();

    /* renamed from: c */
    public final C53520a f150485c = new C53520a();

    /* renamed from: yf0.k$a */
    public class C53520a implements C88820e<Boolean, C117879d<String, Integer, String, Long>> {
        public C53520a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117879d dVar = (C117879d) obj;
            C53518j jVar = C53519k.this.f150483a;
            String str = (String) dVar.mo182596a(0);
            int intValue = ((Integer) dVar.mo182596a(1)).intValue();
            String str2 = (String) dVar.mo182596a(2);
            long longValue = ((Long) dVar.mo182596a(3)).longValue();
            jVar.getClass();
            jVar.f150481d = C88643g.m110544b();
            jVar.f150482e = longValue;
            if (Util.isNullOrNil(str)) {
                jVar.f150481d.mo72091a(Boolean.FALSE);
                return null;
            }
            C53774e eVar = new C53774e(str, intValue, str2);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(eVar);
            Log.m105925i("MicroMsg.CloseAALogic", "closeAA, billNo: %s, scene: %s", str, Integer.valueOf(intValue));
            jVar.f150481d = C88643g.m110545c();
            return null;
        }
    }

    /* renamed from: yf0.k$b */
    public class C53521b implements C88820e<Boolean, C117878c<String, Integer, String>> {
        public C53521b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117878c cVar = (C117878c) obj;
            C53518j jVar = C53519k.this.f150483a;
            String str = (String) cVar.mo182596a(0);
            int intValue = ((Integer) cVar.mo182596a(1)).intValue();
            String str2 = (String) cVar.mo182596a(2);
            jVar.getClass();
            jVar.f150481d = C88643g.m110544b();
            if (Util.isNullOrNil(str)) {
                jVar.f150481d.mo72091a(Boolean.FALSE);
                return null;
            }
            C53774e eVar = new C53774e(str, intValue, str2);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(eVar);
            Log.m105925i("MicroMsg.CloseAALogic", "closeAA, billNo: %s, scene: %s", str, Integer.valueOf(intValue));
            jVar.f150481d = C88643g.m110545c();
            return null;
        }
    }

    public C53519k() {
        C53518j jVar = new C53518j();
        this.f150483a = jVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f150483a;
    }
}
