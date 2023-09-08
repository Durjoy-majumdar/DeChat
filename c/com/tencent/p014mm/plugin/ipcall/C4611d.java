package com.tencent.p014mm.plugin.ipcall;

import com.tencent.p014mm.storage.C72994y1;
import eb0.C97625j3;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: com.tencent.mm.plugin.ipcall.d */
public class C4611d {
    /* renamed from: a */
    public static boolean m4902a() {
        C72994y1.C72995a aVar = C72994y1.C72995a.USERFINO_IPCALL_HAS_ENTRY_BOOLEAN;
        if (C97625j3.m125811a()) {
            if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WCOEntranceSwitch", 0) > 0) {
                C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
                return true;
            }
            C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.FALSE);
        }
        return false;
    }
}
