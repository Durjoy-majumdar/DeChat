package com.tencent.p014mm.plugin.appbrand.launching;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.tencent.luggage.sdk.processes.C80249b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.appbrand.task.AppBrandProcessesManager;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import p206nj.C11171e;
import p564iq.C87790d;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.m3 */
public class C83385m3 implements MMActivity.C6739d, C83404p1 {

    /* renamed from: d */
    public final int f243636d = (C83385m3.class.hashCode() & 65535);

    /* renamed from: a */
    public static void m102323a(C83385m3 m3Var, C83506v1 v1Var, boolean z) {
        m3Var.getClass();
        if ((v1Var instanceof Activity) && !((Activity) v1Var).isFinishing()) {
            if (z) {
                String b = C84737f0.m104395b(C0966R.string.bdw, "");
                String lastObbErrorInfo = ((C87790d) C86312j.m106911c(C87790d.class)).getLastObbErrorInfo();
                if (!TextUtils.isEmpty(lastObbErrorInfo)) {
                    b = b + "\n" + lastObbErrorInfo;
                }
                C83454r3.m102416b(b, m3Var);
            } else {
                C83454r3.m102416b(C84737f0.m104395b(C0966R.string.f7749qd, ""), m3Var);
            }
            m3Var.mo115659c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009c, code lost:
        if ((r0.mo115706a() && ((com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r0.getBaseContext()).isDestroyed()) != false) goto L_0x009e;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115657b(com.tencent.p014mm.plugin.appbrand.launching.m3$$b r9) {
        /*
            r8 = this;
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r0 = com.tencent.xweb.XWebSdk.getInstalledNewstVersion(r0)
            java.lang.String r1 = "MicroMsg.AppBrand.PreLaunchCheckForXWEB"
            r2 = 400(0x190, float:5.6E-43)
            if (r0 <= r2) goto L_0x0017
            java.lang.String r9 = "have available version , no need check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r8.mo115660e()
            return
        L_0x0017:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.APPBRAND_TBS_CHECK_INSTALL_LAST_TIME_IN_SECOND_LONG
            r4 = 0
            long r4 = r2.mo119673G(r3, r4)
            long r6 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            long r6 = r6 - r4
            long r4 = java.lang.Math.abs(r6)
            r6 = 1800(0x708, double:8.893E-321)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            java.lang.String r9 = "check xweb download, not exceed interval, just return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            java.lang.String r9 = "not exceed interval"
            r8.mo115658b((java.lang.String) r9)
            return
        L_0x0041:
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            long r4 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.mo119677K(r3, r4)
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            long r5 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r5 = r5 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r3 = 0
            r4[r3] = r2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 1
            r4[r2] = r0
            java.lang.String r0 = "check xweb download, cost = %d, xweb core ver = %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r0, r4)
            if (r9 != 0) goto L_0x007b
            java.lang.String r9 = "ActivityProxy is null"
            r8.mo115658b((java.lang.String) r9)
            goto L_0x00b1
        L_0x007b:
            com.tencent.mm.plugin.appbrand.launching.precondition.c r9 = (com.tencent.p014mm.plugin.appbrand.launching.precondition.C83412c) r9
            com.tencent.mm.plugin.appbrand.launching.precondition.a r0 = r9.f243767d
            boolean r0 = r0.mo115707b()
            if (r0 != 0) goto L_0x009e
            com.tencent.mm.plugin.appbrand.launching.precondition.a r0 = r9.f243767d
            boolean r1 = r0.mo115706a()
            if (r1 == 0) goto L_0x009b
            android.content.Context r0 = r0.getBaseContext()
            com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI r0 = (com.tencent.p014mm.plugin.appbrand.launching.AppBrandLaunchProxyUI) r0
            boolean r0 = r0.isDestroyed()
            if (r0 == 0) goto L_0x009b
            r0 = 1
            goto L_0x009c
        L_0x009b:
            r0 = 0
        L_0x009c:
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r3 = 1
        L_0x009f:
            if (r3 == 0) goto L_0x00a7
            java.lang.String r9 = "ActivityProxy destroyed or finishing"
            r8.mo115658b((java.lang.String) r9)
            goto L_0x00b1
        L_0x00a7:
            com.tencent.mm.plugin.appbrand.launching.m3$$a r0 = new com.tencent.mm.plugin.appbrand.launching.m3$$a
            r0.<init>(r8, r9)
            com.tencent.mm.plugin.appbrand.launching.precondition.a r9 = r9.f243767d
            r9.mo115712h(r0)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.launching.C83385m3.mo115657b(com.tencent.mm.plugin.appbrand.launching.m3$$b):void");
    }

    /* renamed from: c */
    public void mo115659c() {
    }

    /* renamed from: d */
    public boolean mo115519d() {
        return true;
    }

    /* renamed from: e */
    public void mo115660e() {
    }

    public final void mmOnActivityResult(int i, int i2, Intent intent) {
        if (this.f243636d == i) {
            if (i2 == -1) {
                Log.m105924i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs download ok");
                AppBrandProcessesManager.m103869I().mo111405r(C80249b.KILL_TYPE_SILENT);
                mo115660e();
            } else if (i2 == 2) {
                Log.m105924i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs cancel loading, download in background");
                mo115659c();
            } else {
                Log.m105925i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "onActivityResult, tbs download unknown error, resultCode = %d, apiLevel = %d", Integer.valueOf(i2), Integer.valueOf(Build.VERSION.SDK_INT));
                C115669n.INSTANCE.idkeyStat(366, 8, 1, false);
                mo115658b("onActivityResult, tbs download unknown error");
            }
        }
    }

    /* renamed from: b */
    public final void mo115658b(String str) {
        Log.m105925i("MicroMsg.AppBrand.PreLaunchCheckForXWEB", "dealCannotDownload reason:%s", str);
        if (C11171e.m11046c(17)) {
            mo115660e();
        }
    }
}
