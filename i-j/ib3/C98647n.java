package ib3;

import ab3.C91984b;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.WXRTEditText;
import gy3.C87412m;
import ib3.C98640j;

/* renamed from: ib3.n */
public final class C98647n implements C91984b {

    /* renamed from: a */
    public final /* synthetic */ C98640j.C98642b f289230a;

    public C98647n(C98640j.C98642b bVar) {
        this.f289230a = bVar;
    }

    /* renamed from: a */
    public boolean mo125824a(int i) {
        WXRTEditText wXRTEditText = this.f289230a.f289218f;
        if (wXRTEditText != null) {
            wXRTEditText.mo134853A(i);
            return true;
        }
        C87412m.m108603p("btnPre");
        throw null;
    }

    /* renamed from: b */
    public boolean mo125825b(int i, boolean z) {
        WXRTEditText wXRTEditText = this.f289230a.f289218f;
        if (wXRTEditText != null) {
            wXRTEditText.mo134894y(i, z);
            return true;
        }
        C87412m.m108603p("btnPre");
        throw null;
    }
}
