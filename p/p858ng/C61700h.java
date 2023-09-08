package p858ng;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import eb0.C75569c4;
import nj3.C11182m0;
import nj3.C76874e0;
import p434ig.C98672d;
import p855lg.C61278a;
import ph0.C100792a;

/* renamed from: ng.h */
public final class C61700h implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ C61278a f175396d;

    /* renamed from: e */
    public final /* synthetic */ C61704k f175397e;

    public C61700h(C61278a aVar, C61704k kVar) {
        this.f175396d = aVar;
        this.f175397e = kVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        C98672d dVar;
        e0Var.clear();
        C61278a aVar = this.f175396d;
        C72963f4 f4Var = null;
        if (!C75569c4.m90688u(aVar != null ? aVar.f174390i : null)) {
            C61278a aVar2 = this.f175396d;
            if (!C75569c4.m90692y(aVar2 != null ? aVar2.f174390i : null)) {
                C61278a aVar3 = this.f175396d;
                Integer valueOf = (aVar3 == null || (dVar = aVar3.f174389h) == null) ? null : Integer.valueOf(dVar.mo55274P());
                boolean z = true;
                e0Var.mo107144g(1, (valueOf != null && valueOf.intValue() == 2) ? this.f175397e.getString(C0966R.string.iam) : (valueOf != null && valueOf.intValue() == 4) ? this.f175397e.getString(C0966R.string.iar) : this.f175397e.getString(C0966R.string.iaq), C0966R.raw.icons_outlined_download);
                C61278a aVar4 = this.f175396d;
                C98672d dVar2 = aVar4 != null ? aVar4.f174389h : null;
                if (dVar2 == null || dVar2.mo55274P() != 2) {
                    z = false;
                }
                if (z) {
                    C100792a aVar5 = C100792a.f295260a;
                    C61278a aVar6 = this.f175396d;
                    C98672d dVar3 = aVar6 != null ? aVar6.f174389h : null;
                    if (aVar6 != null) {
                        f4Var = aVar6.f174390i;
                    }
                    if (C86013q1.m106450k(aVar5.mo140233d(dVar3, f4Var))) {
                        e0Var.mo107144g(3, this.f175397e.getString(C0966R.string.b8g), C0966R.raw.icons_outlined_pencil);
                        if (C30391y.f81992d) {
                            e0Var.mo107144g(4, this.f175397e.getString(C0966R.string.b8i), C0966R.raw.icons_outlined_translate);
                        }
                    }
                }
            }
        }
    }
}
