package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83436t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86297n;
import di0.C86299o;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.t */
public final class C84258t {

    /* renamed from: a */
    public static final C84258t f246113a = new C84258t();

    /* renamed from: com.tencent.mm.plugin.appbrand.t$a */
    public static final class C84259a implements C86297n {

        /* renamed from: a */
        public final /* synthetic */ int f246114a;

        /* renamed from: b */
        public final /* synthetic */ long f246115b;

        /* renamed from: c */
        public final /* synthetic */ C86297n f246116c;

        public C84259a(int i, long j, C86297n nVar) {
            this.f246114a = i;
            this.f246115b = j;
            this.f246116c = nVar;
        }

        /* renamed from: a */
        public void mo1541a(int i, String str) {
            String str2;
            int i2;
            StringBuilder sb = new StringBuilder();
            sb.append("onError, requestId:");
            sb.append(this.f246114a);
            sb.append(", errCode:");
            switch (i) {
                case -10:
                    str2 = "ERR_TASK_BANNED";
                    break;
                case -9:
                    str2 = "ERR_TASK_LOAD_MODULE_FAILED";
                    break;
                case -8:
                    str2 = "ERR_TASK_UNSUPPORTED";
                    break;
                case -7:
                    str2 = "ERR_TASK_RESOURCE_PREPARE_FAIL";
                    break;
                case -6:
                    str2 = "ERR_TASK_CREATE_RUNTIME_FAILED";
                    break;
                case -5:
                    str2 = "ERR_TASK_REMOTE_SERVICE_DIED";
                    break;
                case -4:
                    str2 = "ERR_TASK_BIND_REMOTE_SERVICE_FAIL";
                    break;
                case -3:
                    str2 = "ERR_TASK_GET_ATTRS_FAIL";
                    break;
                case -2:
                    str2 = "ERR_TASK_ALREADY_ALIVE";
                    break;
                case -1:
                    str2 = "ERR_INVALID_PARAMS";
                    break;
                case 0:
                    str2 = "OK";
                    break;
                default:
                    str2 = "UNKNOWN";
                    break;
            }
            sb.append(str2);
            sb.append(", errMsg:");
            sb.append(str);
            sb.append(", cost:");
            sb.append(Util.ticksToNow(this.f246115b));
            Log.m105920e("MicroMsg.AppBrandPreRenderColdStartService", sb.toString());
            C86297n nVar = this.f246116c;
            if (nVar != null) {
                nVar.mo1541a(i, str);
            }
            C115669n nVar2 = C115669n.INSTANCE;
            switch (i) {
                case -10:
                    i2 = 10;
                    break;
                case -8:
                    i2 = 9;
                    break;
                case -7:
                    i2 = 8;
                    break;
                case -6:
                    i2 = 7;
                    break;
                case -5:
                    i2 = 6;
                    break;
                case -4:
                    i2 = 5;
                    break;
                case -3:
                    i2 = 4;
                    break;
                case -2:
                    i2 = 3;
                    break;
                case -1:
                    i2 = 2;
                    break;
                case 0:
                    i2 = 1;
                    break;
                default:
                    i2 = 10000;
                    break;
            }
            nVar2.mo175911u(1519, i2);
        }

        public void onSuccess() {
            Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService", "onSuccess, requestId:" + this.f246114a + ", cost:" + Util.ticksToNow(this.f246115b));
            C86297n nVar = this.f246116c;
            if (nVar != null) {
                nVar.onSuccess();
            }
            C115669n.INSTANCE.mo175911u(1519, 1);
        }
    }

    /* renamed from: a */
    public final void mo116939a(C86299o oVar, C86297n nVar) {
        C87412m.m108594g(oVar, "bundle");
        int hashCode = oVar.hashCode();
        long currentTicks = Util.currentTicks();
        Log.m105924i("MicroMsg.AppBrandPreRenderColdStartService", "start with id:" + hashCode + " username:" + oVar.f250929a + " appId:" + oVar.f250930b + " versionType:" + oVar.f250931c + " path:" + oVar.f250934f + " scene:" + oVar.f250939k);
        C115669n.INSTANCE.mo175911u(1519, 0);
        C84259a aVar = new C84259a(hashCode, currentTicks, nVar);
        new C83436t(hashCode, oVar, new C84345u(hashCode, aVar), aVar, true).mo115726a();
    }
}
