package com.tencent.p014mm.p136ui.chatting.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import p270xi.C91212b;
import zj3.C79373o;

@C91212b(exportInterface = C79373o.class)
/* renamed from: com.tencent.mm.ui.chatting.component.g1 */
public final class C73480g1 extends C73412a implements C79373o {

    /* renamed from: e */
    public LifecycleScope f215894e;

    /* renamed from: O4 */
    public void mo26162O4() {
        this.f215894e = new LifecycleScope("MicroMsg.ChattingScopeComponent", (C0125s) null, 1);
    }

    /* renamed from: Q4 */
    public LifecycleScope mo102442Q4() {
        return this.f215894e;
    }

    /* renamed from: n2 */
    public void mo26199n2() {
        LifecycleScope lifecycleScope = this.f215894e;
        if (lifecycleScope != null) {
            lifecycleScope.onDestroy();
        }
    }
}
