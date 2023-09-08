package com.tencent.p014mm.plugin.dbbackup;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.dbbackup.n */
public class C29837n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f80867d;

    public C29837n(C115392k kVar, String str) {
        this.f80867d = str;
    }

    public void run() {
        int i = 0;
        long j = ((long) (C86709a0.m107535s().mo121142i().mo119688i(89, 0) == 1 ? 7 : 30)) * 86400000;
        long currentTimeMillis = System.currentTimeMillis();
        C86009m1 m1Var = new C86009m1(this.f80867d + "corrupted");
        if (m1Var.mo119977o()) {
            C86009m1[] u = m1Var.mo119984u();
            int length = u.length;
            while (i < length) {
                if (currentTimeMillis - u[i].mo119979q() >= j) {
                    i++;
                } else {
                    return;
                }
            }
            if (C86013q1.m106446g(m1Var.mo119976n(), true)) {
                Log.m105924i("MicroMsg.SubCoreDBBackup", "Corrupted databases removed.");
            }
        }
    }
}
