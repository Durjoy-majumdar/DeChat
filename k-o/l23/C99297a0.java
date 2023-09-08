package l23;

import android.os.Bundle;
import c23.C92334b;
import c23.C92335c;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import d23.C106976a;
import gy3.C87412m;
import l23.C99310q;
import qh2.C101198e;
import rr3.C110625c0;
import sx3.C64197v;

/* renamed from: l23.a0 */
public final class C99297a0 implements C99310q.C99311a {

    /* renamed from: a */
    public final /* synthetic */ C99327z f291192a;

    public C99297a0(C99327z zVar) {
        this.f291192a = zVar;
    }

    /* renamed from: a */
    public void mo138697a() {
        C99327z zVar = this.f291192a;
        C92334b bVar = zVar.f291257s;
        if (bVar != null) {
            EffectManager effectManager = C106976a.f320215h;
            C87412m.m108591d(effectManager);
            C110625c0 c0Var = bVar.f264197c;
            effectManager.mo154934n(c0Var != null ? c0Var.f330967a : 0);
            zVar.f291248g.mo160455N(zVar.f291247f.f316438t.mo134615l(), zVar.f291247f.f316438t.mo134613j());
            C92335c cVar = zVar.f291256r;
            cVar.getClass();
            cVar.f264201a.remove(bVar);
            int size = cVar.f264201a.size();
            int i = 0;
            for (T next : cVar.f264201a) {
                int i2 = i + 1;
                if (i >= 0) {
                    ((C92334b) next).f264200f = size - i;
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            zVar.f291254p.mo106929c(zVar.f291256r.mo126327a());
            zVar.f291250i.setShow(true);
        }
        zVar.f291257s = null;
    }

    /* renamed from: b */
    public void mo138698b(long j, long j2) {
        C92334b bVar = this.f291192a.f291257s;
        if (bVar != null) {
            bVar.f264198d = j;
            bVar.f264199e = j2;
            C110625c0 c0Var = bVar.f264197c;
            if (c0Var != null) {
                c0Var.mo162189b(j, j2);
            }
        }
    }

    /* renamed from: c */
    public void mo138699c() {
        C110625c0 c0Var;
        C92334b bVar = this.f291192a.f291257s;
        if (bVar != null && (c0Var = bVar.f264197c) != null) {
            c0Var.mo162189b(0, 0);
        }
    }

    public void onFinish() {
        C99327z zVar = this.f291192a;
        zVar.f291248g.mo160455N(zVar.f291247f.f316438t.mo134615l(), this.f291192a.f291247f.f316438t.mo134613j());
        C101198e.C62622a.m73576a(this.f291192a.f291246e, C101198e.C101199b.EDIT_IN_PREVIEW, (Bundle) null, 2, (Object) null);
    }
}
