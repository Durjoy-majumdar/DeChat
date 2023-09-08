package p858ng;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75569c4;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C76874e0;
import p434ig.C98672d;
import p855lg.C61278a;
import ph0.C100792a;
import rx3.C36570n;

/* renamed from: ng.g */
public final class C61699g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C61278a f175394d;

    /* renamed from: e */
    public final /* synthetic */ C61704k f175395e;

    public C61699g(C61278a aVar, C61704k kVar) {
        this.f175394d = aVar;
        this.f175395e = kVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        e0Var.clear();
        C61278a aVar = this.f175394d;
        C72963f4 f4Var = null;
        int k = C75569c4.m90678k(aVar != null ? aVar.f174390i : null);
        boolean z = true;
        if (!(k == 3 || k == 4)) {
            C61278a aVar2 = this.f175394d;
            if (!C75569c4.m90692y(aVar2 != null ? aVar2.f174390i : null)) {
                C61278a aVar3 = this.f175394d;
                if (!C75569c4.m90671d(aVar3 != null ? aVar3.f174390i : null)) {
                    e0Var.mo107146h(0, this.f175395e.getString(C0966R.string.i4e), C0966R.raw.icons_filled_share, this.f175395e.getActivity().getResources().getColor(C0966R.color.f2939n));
                    C61278a aVar4 = this.f175394d;
                    C98672d dVar = aVar4 != null ? aVar4.f174389h : null;
                    if (dVar == null || dVar.mo55274P() != 2) {
                        z = false;
                    }
                    if (z) {
                        C100792a aVar5 = C100792a.f295260a;
                        C61278a aVar6 = this.f175394d;
                        C98672d dVar2 = aVar6 != null ? aVar6.f174389h : null;
                        if (aVar6 != null) {
                            f4Var = aVar6.f174390i;
                        }
                        if (C86013q1.m106450k(aVar5.mo140233d(dVar2, f4Var))) {
                            e0Var.mo107146h(5, this.f175395e.getString(C0966R.string.hrf), C0966R.raw.bottomsheet_icon_moment, 0);
                        }
                    }
                    if (((Number) ((C36570n) this.f175395e.f175403d).getValue()).intValue() != 5) {
                        C88144b.m109788f("favorite");
                        e0Var.mo107146h(2, this.f175395e.getString(C0966R.string.f361137hk2), C0966R.raw.bottomsheet_icon_fav, 0);
                    }
                }
            }
        }
    }
}
