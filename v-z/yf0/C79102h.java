package yf0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hp3.C98494b;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117881f;
import zf0.C53775j;

/* renamed from: yf0.h */
public class C79102h implements C98494b<C79101g> {

    /* renamed from: a */
    public C79101g f232257a;

    /* renamed from: b */
    public final C79103a f232258b = new C79103a();

    /* renamed from: yf0.h$a */
    public class C79103a implements C88820e<C117877b<String, String>, C117881f<String, Long, Integer, String, String, String>> {
        public C79103a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117881f fVar = (C117881f) obj;
            C79101g gVar = C79102h.this.f232257a;
            String str = (String) fVar.mo182596a(0);
            long longValue = ((Long) fVar.mo182596a(1)).longValue();
            int intValue = ((Integer) fVar.mo182596a(2)).intValue();
            String str2 = (String) fVar.mo182596a(3);
            String str3 = (String) fVar.mo182596a(4);
            String str4 = (String) fVar.mo182596a(5);
            if (gVar.f232256e) {
                Log.m105920e("MicroMsg.AAPayLogic", "aaPay, isPaying!");
                return null;
            }
            C53775j jVar = new C53775j(str, longValue, intValue, str2, str3, str4);
            C86709a0.m107528h();
            C86709a0.m107529k().f251779b.mo123460f(jVar);
            gVar.f232255d = C88643g.m110545c();
            gVar.f232256e = true;
            return null;
        }
    }

    public C79102h() {
        C79101g gVar = new C79101g();
        this.f232257a = gVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f232257a;
    }
}
