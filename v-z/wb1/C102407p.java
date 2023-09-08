package wb1;

import a14.C53934p0;
import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import java.util.HashMap;
import java.util.LinkedList;
import pb1.C100698b0;
import pb1.C100726o0;
import pb1.C100734q;
import rx3.C36570n;
import wx3.C15601d;

/* renamed from: wb1.p */
public final class C102407p extends C98597b implements C100726o0 {

    /* renamed from: f */
    public C102408q f301627f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102407p(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        if (!C100734q.m131843d0()) {
            this.f301627f = new C102408q();
        }
        run();
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        if (C100734q.m131843d0()) {
            ((LifecycleScope) ((C36570n) ((C102402n) C98597b.f289091e.mo85231a(this.f289092d, C102402n.class)).f301600h).getValue()).onDestroy();
            return;
        }
        C102408q qVar = this.f301627f;
        if (qVar != null) {
            Log.m105924i("MicroMsg.Fav.FavCheckCdnService", "stop");
            ((LinkedList) qVar.f301632g).clear();
            ((HashMap) C102408q.f301628n).clear();
            qVar.f301629d = false;
            qVar.f301631f = false;
            qVar.f301635j.stopTimer();
            C86709a0.m107524d().mo123470p(404, qVar);
            C86709a0.m107529k().mo121129d(qVar.f301634i);
        }
    }

    public void run() {
        Log.m105924i("MicroMsg.Fav.FavCheckCdnProxyFSC", "run");
        FavAddQualityStruct b = C100698b0.f295038a.mo140126b();
        if (C100734q.m131843d0()) {
            if (b != null) {
                b.f265505k = 1;
            }
            C102402n nVar = (C102402n) C98597b.f289091e.mo85231a(this.f289092d, C102402n.class);
            LifecycleScope.launchDefault$default((LifecycleScope) ((C36570n) nVar.f301600h).getValue(), (C53934p0) null, new C102406o(nVar, (C15601d<? super C102406o>) null), 1, (Object) null);
            return;
        }
        if (b != null) {
            b.f265505k = 0;
        }
        C102408q qVar = this.f301627f;
        if (qVar != null) {
            qVar.run();
        }
    }
}
