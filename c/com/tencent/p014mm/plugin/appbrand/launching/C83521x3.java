package com.tencent.p014mm.plugin.appbrand.launching;

import bp0.C79746b;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import java.util.concurrent.Callable;
import p977hj.C87526a;
import te3.C90436rm2;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.x3 */
public class C83521x3 implements Callable<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ C83496u2 f244014d;

    /* renamed from: e */
    public final /* synthetic */ C83515w2 f244015e;

    /* renamed from: f */
    public final /* synthetic */ C83524y3 f244016f;

    public C83521x3(C83524y3 y3Var, C83496u2 u2Var, C83515w2 w2Var) {
        this.f244016f = y3Var;
        this.f244014d = u2Var;
        this.f244015e = w2Var;
    }

    public Object call() {
        C83524y3 y3Var = this.f244016f;
        int i = y3Var.f244036z;
        if (i != 0) {
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch secFlagForSinglePageMode:%d", Integer.valueOf(i));
            C83524y3 y3Var2 = this.f244016f;
            C79746b.m96887a(25, y3Var2.f244021h, y3Var2.f244022i, y3Var2.f244023j);
            return Boolean.TRUE;
        }
        int i2 = y3Var.f244026p;
        int[] iArr = AppBrandGlobalSystemConfig.m100099b().f239316t;
        if (iArr != null && C87526a.m108856a(iArr, i2)) {
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, hit scene[%d] return true, appId[%s]", Integer.valueOf(this.f244016f.f244026p), this.f244016f.f244021h);
            C83524y3 y3Var3 = this.f244016f;
            C79746b.m96887a(21, y3Var3.f244021h, y3Var3.f244022i, y3Var3.f244023j);
            return Boolean.TRUE;
        } else if (!this.f244014d.get(this.f244015e, "appId")) {
            Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get NULL record, return true, appId[%s]", this.f244016f.f244021h);
            C83524y3 y3Var4 = this.f244016f;
            C79746b.m96887a(22, y3Var4.f244021h, y3Var4.f244022i, y3Var4.f244023j);
            return Boolean.TRUE;
        } else {
            C83515w2 w2Var = this.f244015e;
            if (!((w2Var == null || w2Var.field_jsapiInfo == null) ? false : true)) {
                Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, get INVALID record, return true, appId[%s]", this.f244016f.f244021h);
                C83524y3 y3Var5 = this.f244016f;
                C79746b.m96887a(23, y3Var5.f244021h, y3Var5.f244022i, y3Var5.f244023j);
                return Boolean.TRUE;
            }
            C90436rm2 rm22 = w2Var.field_launchAction;
            int i3 = rm22 == null ? -1 : rm22.f259816d;
            if (1 != i3) {
                Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, cached infoLaunchAction[%d], return true, appId[%s]", Integer.valueOf(i3), this.f244016f.f244021h);
                if (i3 == 2) {
                    C83524y3 y3Var6 = this.f244016f;
                    C79746b.m96887a(32, y3Var6.f244021h, y3Var6.f244022i, y3Var6.f244023j);
                } else if (i3 == 3) {
                    C83524y3 y3Var7 = this.f244016f;
                    C79746b.m96887a(33, y3Var7.f244021h, y3Var7.f244022i, y3Var7.f244023j);
                } else if (i3 == 4) {
                    C83524y3 y3Var8 = this.f244016f;
                    C79746b.m96887a(34, y3Var8.f244021h, y3Var8.f244022i, y3Var8.f244023j);
                } else if (i3 == 5) {
                    C83524y3 y3Var9 = this.f244016f;
                    C79746b.m96887a(35, y3Var9.f244021h, y3Var9.f244022i, y3Var9.f244023j);
                } else if (i3 != 6) {
                    C83524y3 y3Var10 = this.f244016f;
                    C79746b.m96887a(31, y3Var10.f244021h, y3Var10.f244022i, y3Var10.f244023j);
                } else {
                    C83524y3 y3Var11 = this.f244016f;
                    C79746b.m96887a(36, y3Var11.f244021h, y3Var11.f244022i, y3Var11.f244023j);
                }
                return Boolean.TRUE;
            }
            if (w2Var.field_expiredAtTimestampSeconds > 0) {
                long e = (long) C31543z5.m39455e();
                if (this.f244015e.field_expiredAtTimestampSeconds <= e) {
                    boolean e2 = C83466t2.m102425e();
                    Log.m105925i("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "checkIfNeedSyncLaunch, force update by expiredAtTimestampSeconds[%d], now[%d], appId[%s], isUnderWeakNet[%b]", Long.valueOf(this.f244015e.field_expiredAtTimestampSeconds), Long.valueOf(e), this.f244016f.f244021h, Boolean.valueOf(e2));
                    if (e2) {
                        return Boolean.FALSE;
                    }
                    C83524y3 y3Var12 = this.f244016f;
                    C79746b.m96887a(24, y3Var12.f244021h, y3Var12.f244022i, y3Var12.f244023j);
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        }
    }
}
