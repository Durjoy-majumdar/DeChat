package com.tencent.p014mm.plugin.appbrand.appusage;

import com.tencent.p014mm.storage.C72994y1;
import eb0.C86491q2;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.appbrand.appusage.t0 */
public final class C29390t0 extends C86491q2 {
    /* renamed from: a */
    public String mo56580a() {
        return "MicroMsg.AppBrand.DuplicateUsageUsernameSetFlagDataTransfer";
    }

    /* renamed from: b */
    public boolean mo56581b(int i) {
        boolean z = true;
        boolean z2 = i != 0;
        if (i >= 637927936) {
            z = false;
        }
        return z2 & z;
    }

    /* renamed from: c */
    public void mo56582c(int i) {
        if (mo56581b(i)) {
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.APPBRAND_PREDOWNLOAD_DONE_USAGE_USERNAME_DUPLICATE_BEFORE_BOOLEAN_SYNC, Boolean.FALSE);
        }
    }
}
