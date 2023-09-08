package bg0;

import hp3.C98494b;
import java.util.Map;
import lp3.C88633e;
import lp3.C88643g;
import mp3.C88820e;
import op3.C117877b;
import op3.C117878c;
import yf0.C79098e;

/* renamed from: bg0.f */
public class C67230f implements C98494b<C67229e> {

    /* renamed from: a */
    public C67229e f193053a;

    /* renamed from: b */
    public final C67232b f193054b = new C67232b();

    /* renamed from: c */
    public final C67234d f193055c = new C67234d();

    /* renamed from: d */
    public final C67233c f193056d = new C67233c();

    /* renamed from: e */
    public final C67231a f193057e = new C67231a();

    /* renamed from: bg0.f$a */
    public class C67231a implements C88820e<C79098e, Void> {
        public C67231a() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Void voidR = (Void) obj;
            C67229e eVar = C67230f.this.f193053a;
            eVar.getClass();
            C88643g.m110543a(((C88633e) C88643g.m110546d()).mo123061d(eVar.f193052r.f232253b));
            return null;
        }
    }

    /* renamed from: bg0.f$b */
    public class C67232b implements C88820e<Boolean, C117877b<Integer, Map<String, Object>>> {
        public C67232b() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            C117877b bVar = (C117877b) obj;
            C67229e eVar = C67230f.this.f193053a;
            int intValue = ((Integer) bVar.mo182596a(0)).intValue();
            Map map = (Map) bVar.mo182596a(1);
            map.put("launchScene", Integer.valueOf(eVar.f286525o.mo106599a("enter_scene", 1)));
            C88643g.m110543a(((C88633e) C88643g.m110548f(Integer.valueOf(intValue), map)).mo123061d(eVar.f193051q.f232265b));
            return null;
        }
    }

    /* renamed from: bg0.f$c */
    public class C67233c implements C88820e<C117878c<Boolean, String, Long>, Map<String, Object>> {
        public C67233c() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Map map = (Map) obj;
            C67229e eVar = C67230f.this.f193053a;
            map.put("launchScene", Integer.valueOf(eVar.f286525o.mo106599a("enter_scene", 1)));
            C88643g.m110543a(((C88633e) C88643g.m110547e(map)).mo123061d(eVar.f193051q.f232267d));
            return null;
        }
    }

    /* renamed from: bg0.f$d */
    public class C67234d implements C88820e<C117878c<Boolean, String, Long>, Map<String, Object>> {
        public C67234d() {
        }

        /* renamed from: a */
        public String mo55914a() {
            return "Vending.LOGIC";
        }

        public Object call(Object obj) {
            Map map = (Map) obj;
            C67229e eVar = C67230f.this.f193053a;
            map.put("launchScene", Integer.valueOf(eVar.f286525o.mo106599a("enter_scene", 1)));
            C88643g.m110543a(((C88633e) C88643g.m110547e(map)).mo123061d(eVar.f193051q.f232266c));
            return null;
        }
    }

    public C67230f() {
        C67229e eVar = new C67229e();
        this.f193053a = eVar;
    }

    /* renamed from: a */
    public Object mo67527a() {
        return this.f193053a;
    }
}
