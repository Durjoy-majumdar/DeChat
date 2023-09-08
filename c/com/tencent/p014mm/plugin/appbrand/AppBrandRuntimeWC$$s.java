package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import li0.C88508b;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$s */
public class AppBrandRuntimeWC$$s implements C88509c.C88512b {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238337d;

    public AppBrandRuntimeWC$$s(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238337d = appBrandRuntimeWC;
    }

    /* renamed from: b */
    public void mo113102b(String str, C88508b bVar) {
        if (C88508b.BACKGROUND == bVar) {
            this.f238337d.f238113K.mo122982e(this);
            if (this.f238337d.mo113210l1().f239392w1 != null) {
                WeAppOpenUICallbackIPCProxy weAppOpenUICallbackIPCProxy = this.f238337d.mo113210l1().f239392w1;
                boolean z = this.f238337d.mo113026R() != null && this.f238337d.mo113026R().isFinishing();
                if (!weAppOpenUICallbackIPCProxy.f243390h) {
                    weAppOpenUICallbackIPCProxy.f243387e.mo111345a(new IPCBoolean(z));
                }
            }
        }
    }
}
