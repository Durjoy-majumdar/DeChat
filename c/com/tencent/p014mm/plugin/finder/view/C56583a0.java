package com.tencent.p014mm.plugin.finder.view;

import lu3.C34379c;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.finder.view.a0 */
public final class C56583a0 {

    /* renamed from: a */
    public C89779i0 f162214a;

    /* renamed from: b */
    public C34379c<?> f162215b;

    public C56583a0(long j) {
    }

    /* renamed from: a */
    public final void mo79916a() {
        C34379c<?> cVar = this.f162215b;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f162215b = null;
        C89779i0 i0Var = this.f162214a;
        if (i0Var != null) {
            i0Var.dismiss();
        }
        this.f162214a = null;
    }
}
