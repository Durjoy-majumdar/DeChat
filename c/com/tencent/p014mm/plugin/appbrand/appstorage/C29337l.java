package com.tencent.p014mm.plugin.appbrand.appstorage;

import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86011o1;

/* renamed from: com.tencent.mm.plugin.appbrand.appstorage.l */
public class C29337l implements C86011o1 {
    public boolean accept(C86009m1 m1Var) {
        return m1Var.mo119967g() && !m1Var.mo119977o() && !Util.isNullOrNil(m1Var.getName()) && m1Var.getName().startsWith("store_");
    }
}
