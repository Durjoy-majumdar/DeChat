package el2;

import com.tencent.p014mm.plugin.scanner.C71030z;
import com.tencent.p014mm.plugin.scanner.model.C42904e0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C31887k0;
import java.util.HashMap;
import sl2.C36680a;
import sl2.C36681b;
import zh3.C91753f;

/* renamed from: el2.h */
public class C31619h implements C31887k0.C31890c {

    /* renamed from: d */
    public HashMap<Integer, C91753f.C66827b> f84489d;

    /* renamed from: el2.h$a */
    public class C31620a implements C91753f.C66827b {
        public C31620a(C31619h hVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C36680a.f97477e;
        }
    }

    /* renamed from: el2.h$b */
    public class C31621b implements C91753f.C66827b {
        public C31621b(C31619h hVar) {
        }

        /* renamed from: a */
        public String[] mo6410a() {
            return C36681b.f97479e;
        }
    }

    public C31619h() {
        HashMap<Integer, C91753f.C66827b> hashMap = new HashMap<>();
        this.f84489d = hashMap;
        hashMap.put(-1720818490, new C31620a(this));
        this.f84489d.put(-499163268, new C31621b(this));
    }

    /* renamed from: Rg */
    public HashMap<Integer, C91753f.C66827b> mo9070Rg() {
        C42904e0.f116171a.mo67102c(MMApplicationContext.getContext(), false);
        C71030z.vx0().zx0();
        return this.f84489d;
    }
}
