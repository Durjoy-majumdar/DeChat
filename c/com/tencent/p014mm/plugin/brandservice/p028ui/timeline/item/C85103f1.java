package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C19636w0;
import kj2.C117407d;
import q73.C89576x;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.f1 */
public final class C85103f1 implements Runnable {

    /* renamed from: d */
    public static final C85103f1 f247983d = new C85103f1();

    public final void run() {
        BizTLRecCardJsEngine bizTLRecCardJsEngine;
        if (!C19636w0.f55627d && (bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0) != null) {
            C117407d.INSTANCE.mo182089r(1454, 133, 1);
            C85105i2 i2Var = bizTLRecCardJsEngine.f247975X;
            if (i2Var != null) {
                Log.m105924i(i2Var.f257756F, "forceRelease");
                ((C83174m) i2Var.mo63321n0(C83174m.class)).mo115384z0(new C89576x(i2Var));
                i2Var.destroy();
            }
            bizTLRecCardJsEngine.f247975X = null;
        }
    }
}
