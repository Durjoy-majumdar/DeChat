package tt1;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import java.util.Map;
import p156gj.C107835h0;
import p602ly.C76737c;
import pv2.C35701m;
import rt3.C22252b;
import st1.C77767l;
import vt1.C78473a;
import vt1.C78476d;

/* renamed from: tt1.g */
public class C78093g extends C52363a {

    /* renamed from: tt1.g$a */
    public class C78094a implements C35701m {
        public C78094a(C78093g gVar) {
        }

        /* renamed from: n */
        public void mo59577n(int i, String str) {
            if (C22252b.m25806c()) {
                Log.m105925i("MicroMsg.DummyBiometricPayManager", "init success: %s", Integer.valueOf(i));
                C78102j jVar = new C78102j();
                jVar.prepare();
                C86709a0.m107532n(C78101i.class, jVar);
                return;
            }
            Log.m105925i("MicroMsg.DummyBiometricPayManager", "init failed: %s, %s", Integer.valueOf(i), str);
            C115669n.INSTANCE.mo175911u(1104, 43);
        }
    }

    public void Dq0(Context context, C78092f fVar, C78088b bVar) {
    }

    /* renamed from: G3 */
    public void mo108070G3(Object... objArr) {
    }

    /* renamed from: H0 */
    public boolean mo108071H0() {
        return false;
    }

    /* renamed from: Hz */
    public void mo108072Hz(boolean z, boolean z2, boolean z3, Bundle bundle) {
    }

    /* renamed from: J4 */
    public boolean mo108073J4() {
        return false;
    }

    /* renamed from: Qk */
    public boolean mo108074Qk() {
        return false;
    }

    /* renamed from: RQ */
    public C78476d mo108075RQ() {
        return null;
    }

    /* renamed from: Wy */
    public boolean mo108076Wy(Context context) {
        return false;
    }

    public void cancel() {
    }

    public int fr0() {
        return 0;
    }

    /* renamed from: gv */
    public boolean mo108079gv() {
        return false;
    }

    public boolean gw0() {
        return false;
    }

    /* renamed from: n3 */
    public boolean mo108081n3() {
        return false;
    }

    /* renamed from: n4 */
    public void mo108082n4(Context context, C78092f fVar, C78088b bVar) {
    }

    public void prepare() {
        Class cls = C76737c.class;
        Class cls2 = C78473a.class;
        if (((C78473a) C86709a0.m107533q(cls2)) == null) {
            C77767l lVar = new C77767l();
            lVar.f226572d = this;
            C86709a0.m107532n(cls2, lVar);
        }
        if (C107835h0.f322851h.f322842a && ((C76737c) C86312j.m106911c(cls)).p40()) {
            Log.m105924i("MicroMsg.DummyBiometricPayManager", "maybe soter init fail, reinit");
            C115669n.INSTANCE.mo175911u(1104, 42);
            ((C76737c) C86312j.m106911c(cls)).mo59454n6(true, true, new C78094a(this));
        }
    }

    /* renamed from: rn */
    public void mo108084rn(Context context, C78092f fVar, C78090d dVar) {
    }

    /* renamed from: t0 */
    public Map<String, String> mo108085t0() {
        return null;
    }

    /* renamed from: xx */
    public boolean mo108086xx() {
        return false;
    }

    /* renamed from: zy */
    public boolean mo108087zy(Context context) {
        return false;
    }
}
