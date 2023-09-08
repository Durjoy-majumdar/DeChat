package com.tencent.p014mm.plugin.scanner.model;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.scanner.model.k0 */
public final class C19025k0 implements C19027m0 {

    /* renamed from: d */
    public final /* synthetic */ int f53478d;

    public C19025k0(int i) {
        this.f53478d = i;
    }

    public final void run() {
        Log.m105925i("MicroMsg.ScanFastFocusEngineManager", "alvinluo setServerState: %d", Integer.valueOf(this.f53478d));
        C19021i0 i0Var = C19021i0.f53455a;
        int i = this.f53478d;
        C19021i0.f53462h = i;
        if (C19021i0.f53461g) {
            C19021i0.f53460f.setServerState(i);
        }
    }
}
