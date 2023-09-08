package is2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.LinkedList;
import nj3.C11182m0;
import nj3.C76874e0;
import rx3.C13604l;

/* renamed from: is2.g */
public final class C9240g implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<C13604l<Integer, String>> f28977d;

    public C9240g(LinkedList<C13604l<Integer, String>> linkedList) {
        this.f28977d = linkedList;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$1");
        for (C13604l lVar : this.f28977d) {
            e0Var.mo107142f(((Number) lVar.f38555d).intValue(), (CharSequence) lVar.f38556e);
        }
        SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$1");
    }
}
