package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.a0 */
public final class C29768a0 extends C87413o implements C32226l<Bundle, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C1256g<Bundle> f80778d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29768a0(C1256g<Bundle> gVar) {
        super(1);
        this.f80778d = gVar;
    }

    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, LocaleUtil.ITALIAN);
        try {
            this.f80778d.mo894a(bundle);
        } catch (Exception e) {
            C40789z zVar = C40789z.f109640a;
            Log.printErrStackTrace("MicroMsg.PreloadLogic", e, "ipc invoke callback", new Object[0]);
        }
        return C13598b0.f38549a;
    }
}
