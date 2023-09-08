package qg2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import eb0.C75604z3;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p654pw.C100971c;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: qg2.c0 */
public class C35855c0 extends C86301e implements C100971c {

    /* renamed from: d */
    public Map<Long, String> f95697d = Collections.synchronizedMap(new HashMap());

    public void Bh0(long j) {
        if (this.f95697d.keySet().contains(Long.valueOf(j))) {
            vx0(this.f95697d.get(Long.valueOf(j)), MMApplicationContext.getContext().getString(C0966R.string.aj7));
            this.f95697d.remove(Long.valueOf(j));
        }
    }

    public void Jf0(long j, String str) {
        if (this.f95697d.keySet().contains(Long.valueOf(j))) {
            vx0(str, MMApplicationContext.getContext().getString(C0966R.string.aj7));
            this.f95697d.remove(Long.valueOf(j));
        }
    }

    public void rm0(long j, String str) {
        this.f95697d.put(Long.valueOf(j), str);
    }

    public final void vx0(String str, String str2) {
        C72963f4 f4Var = new C72963f4();
        f4Var.mo108733M2(C75604z3.m90843o(str));
        f4Var.mo108749c3(str);
        f4Var.mo108732L2(str2);
        f4Var.setType(10000);
        f4Var.mo100991d(6);
        f4Var.mo108740T2(0);
        ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).my0(f4Var);
    }
}
