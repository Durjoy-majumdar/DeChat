package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.appbrand.C84072q1;
import com.tencent.p014mm.plugin.appbrand.config.GetOnLineInfoInfoResult;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import java.util.List;
import kr0.C34016t0;

/* renamed from: com.tencent.mm.plugin.appbrand.task.a */
public class C29633a {

    /* renamed from: com.tencent.mm.plugin.appbrand.task.a$a */
    public class C29634a implements C1256g<GetOnLineInfoInfoResult> {

        /* renamed from: d */
        public final /* synthetic */ String f80568d;

        public C29634a(String str) {
            this.f80568d = str;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            GetOnLineInfoInfoResult getOnLineInfoInfoResult = (GetOnLineInfoInfoResult) obj;
            if (getOnLineInfoInfoResult != null) {
                C84072q1.m103586a(this.f80568d).f245472p = getOnLineInfoInfoResult.f80323d;
                C84072q1.m103586a(this.f80568d).f245473q = getOnLineInfoInfoResult.f80324e;
                C84072q1.m103586a(this.f80568d).f245474r = getOnLineInfoInfoResult.f80325f;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.a$b */
    public static class C29635b implements C80883e<IPCString, GetOnLineInfoInfoResult> {
        private C29635b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C34016t0 t0Var = (C34016t0) C86312j.m106911c(C34016t0.class);
            if (t0Var != null) {
                GetOnLineInfoInfoResult getOnLineInfoInfoResult = new GetOnLineInfoInfoResult();
                List<Integer> v7 = t0Var.mo56399v7();
                if (v7.contains(1)) {
                    getOnLineInfoInfoResult.f80323d = 1;
                } else if (v7.contains(2)) {
                    getOnLineInfoInfoResult.f80323d = 2;
                } else {
                    getOnLineInfoInfoResult.f80323d = -1;
                }
                getOnLineInfoInfoResult.f80324e = t0Var.Wu0();
                getOnLineInfoInfoResult.f80325f = t0Var.Ld0();
                gVar.mo894a(getOnLineInfoInfoResult);
            }
        }
    }

    /* renamed from: a */
    public static void m38842a(String str) {
        Log.m105925i("MicroMsg.AppBrand.AppBrandCheckOnlineStatusTask", "invoke appId:%s", str);
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(""), C29635b.class, new C29634a(str));
    }
}
