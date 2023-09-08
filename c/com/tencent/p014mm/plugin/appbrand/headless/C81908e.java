package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di0.C86297n;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.e */
public final class C81908e implements C86297n {

    /* renamed from: a */
    public final /* synthetic */ int f240252a;

    /* renamed from: b */
    public final /* synthetic */ long f240253b;

    /* renamed from: c */
    public final /* synthetic */ C86297n f240254c;

    public C81908e(int i, long j, C86297n nVar) {
        this.f240252a = i;
        this.f240253b = j;
        this.f240254c = nVar;
    }

    /* renamed from: a */
    public void mo1541a(int i, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("onError, requestId:");
        sb.append(this.f240252a);
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
        sb.append(Util.ticksToNow(this.f240253b));
        Log.m105920e("MicroMsg.AppBrandHeadlessStartService", sb.toString());
        C86297n nVar = this.f240254c;
        if (nVar != null) {
            nVar.mo1541a(i, str);
        }
    }

    public void onSuccess() {
        Log.m105924i("MicroMsg.AppBrandHeadlessStartService", "onSuccess, requestId:" + this.f240252a + ", cost:" + Util.ticksToNow(this.f240253b));
        C86297n nVar = this.f240254c;
        if (nVar != null) {
            nVar.onSuccess();
        }
    }
}
