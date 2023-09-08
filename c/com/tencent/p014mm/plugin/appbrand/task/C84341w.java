package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C29553m0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84566n2;
import rx3.C13603j;

/* renamed from: com.tencent.mm.plugin.appbrand.task.w */
public final class C84341w {
    /* renamed from: a */
    public static final int m103967a(LuggageServiceType luggageServiceType) {
        int ordinal = luggageServiceType.ordinal();
        if (ordinal == 0) {
            return Integer.MAX_VALUE;
        }
        if (ordinal == 1) {
            return C84343y.m103970b();
        }
        if (ordinal == 2) {
            return 0;
        }
        throw new C13603j();
    }

    /* renamed from: b */
    public static final AppBrandProcessesManager m103968b() {
        return C84566n2.m104160i() ? new C84344z() : C84566n2.m104161j() ? new C84273a0() : C84566n2.m104162k() ? new C84279d0() : C29553m0.f80469a.mo56808a() ? new C84291g0() : new C84316p();
    }
}
