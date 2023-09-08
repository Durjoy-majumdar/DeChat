package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.sdk.platformtools.MMFileSlotManager;
import gy3.C87412m;
import te3.C48812b6;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.g0 */
public final class C40712g0 {
    /* renamed from: a */
    public static final boolean m43951a(C48812b6 b6Var) {
        C87412m.m108594g(b6Var, "<this>");
        C40789z zVar = C40789z.f109640a;
        MMFileSlotManager mMFileSlotManager = C40789z.f109644e;
        String e = C40714i.m43956e(b6Var);
        C87412m.m108594g(mMFileSlotManager, "<this>");
        C87412m.m108594g(e, "contentId");
        return mMFileSlotManager.findSlot(e) != null;
    }
}
