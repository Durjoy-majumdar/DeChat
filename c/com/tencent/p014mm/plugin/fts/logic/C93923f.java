package com.tencent.p014mm.plugin.fts.logic;

import com.tencent.p014mm.plugin.fts.logic.FTS5SearchServiceNotifyLogic;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.fts.logic.f */
public class C93923f extends C99664b {

    /* renamed from: j */
    public final /* synthetic */ FTS5SearchServiceNotifyLogic.C938971 f271051j;

    public C93923f(FTS5SearchServiceNotifyLogic.C938971 r1) {
        this.f271051j = r1;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        FTS5SearchServiceNotifyLogic.this.f270983g.mo138626z(-201, MAlarmHandler.NEXT_FIRE_INTERVAL);
        return true;
    }

    public String toString() {
        return "ResetNotifyServiceCreateTimeCursor";
    }
}
