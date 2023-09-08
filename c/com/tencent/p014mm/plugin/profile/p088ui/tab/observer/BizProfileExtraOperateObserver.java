package com.tencent.p014mm.plugin.profile.p088ui.tab.observer;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import junit.framework.Assert;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.observer.BizProfileExtraOperateObserver */
public class BizProfileExtraOperateObserver extends BaseBizProfileOperateObserver {
    /* renamed from: x */
    public boolean mo66899x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        if (gVar != null) {
            z2 = true;
        }
        Assert.assertTrue(z2);
        return true;
    }
}
