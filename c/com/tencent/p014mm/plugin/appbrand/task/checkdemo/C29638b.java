package com.tencent.p014mm.plugin.appbrand.task.checkdemo;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.task.checkdemo.C84276a;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C117747y;
import ob0.C47350c;
import ob0.l0$$e;
import te3.C50446mt;
import te3.q45;

/* renamed from: com.tencent.mm.plugin.appbrand.task.checkdemo.b */
public class C29638b implements l0$$e {

    /* renamed from: d */
    public final /* synthetic */ C1256g f80570d;

    /* renamed from: e */
    public final /* synthetic */ IPCString f80571e;

    public C29638b(C84276a.C29637b bVar, C1256g gVar, IPCString iPCString) {
        this.f80570d = gVar;
        this.f80571e = iPCString;
    }

    /* renamed from: a */
    public int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
        q45 q45;
        if (yVar.getType() != 1124) {
            Log.m105924i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error mismatch ");
            return 0;
        }
        if (i == 0 && i2 == 0) {
            C50446mt mtVar = (C50446mt) cVar.f127056b.f127083a;
            if (mtVar == null || (q45 = mtVar.f138186d) == null) {
                Log.m105924i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error nil resp");
                C81161g2.requireAccountInitializedOnDemand();
                C81161g2.f238484w.mo56868Lo(this.f80571e.f10315d, false);
                this.f80570d.mo894a(new IPCBoolean(false));
            } else {
                int i3 = q45.f140139d;
                if (i3 != 0) {
                    Log.m105925i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error,ErrCode %d", Integer.valueOf(i3));
                    C81161g2.requireAccountInitializedOnDemand();
                    C81161g2.f238484w.mo56868Lo(this.f80571e.f10315d, false);
                    this.f80570d.mo894a(new IPCBoolean(false));
                } else {
                    Log.m105924i("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback success");
                    C81161g2.requireAccountInitializedOnDemand();
                    C81161g2.f238484w.mo56868Lo(this.f80571e.f10315d, true);
                    this.f80570d.mo894a(new IPCBoolean(true));
                }
            }
        } else {
            Log.m105921e("MicroMsg.AppBrand.AppBrandCheckDemoIPCTask", "CheckDemoTask callback error, errType %d, errCode %d, errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            this.f80570d.mo894a(new IPCBoolean(false));
        }
        return 0;
    }
}
