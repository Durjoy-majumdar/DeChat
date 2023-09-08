package zo1;

import android.view.MenuItem;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import nj3.C47269o0;
import nj3.C76875f0;
import qo3.C77407n;
import wc3.C15133e0;

/* renamed from: zo1.x */
public final class C16375x implements C47269o0 {

    /* renamed from: a */
    public final /* synthetic */ C77407n f43773a;

    /* renamed from: b */
    public final /* synthetic */ C15133e0 f43774b;

    public C16375x(C77407n nVar, C15133e0 e0Var) {
        this.f43773a = nVar;
        this.f43774b = e0Var;
    }

    /* renamed from: a */
    public final void mo2584a(MenuItem menuItem, int i) {
        C77407n nVar = this.f43773a;
        C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
        FinderObject finderObject = oVar != null ? oVar.f154341n : null;
        C15133e0 e0Var = this.f43774b;
        if (nVar != null && finderObject != null) {
            C87412m.m108592e(menuItem, "null cannot be cast to non-null type com.tencent.mm.ui.base.MMMenuItem");
            e0Var.mo14089YM(nVar, (C76875f0) menuItem);
        }
    }
}
