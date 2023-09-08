package com.tencent.p014mm.plugin.fts.logic;

import com.tencent.p014mm.plugin.fts.logic.FTS5SearchMessageLogic;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import lv1.C99664b;

/* renamed from: com.tencent.mm.plugin.fts.logic.d */
public class C93917d extends C99664b {

    /* renamed from: j */
    public final /* synthetic */ FTS5SearchMessageLogic.C938833 f271040j;

    public C93917d(FTS5SearchMessageLogic.C938833 r1) {
        this.f271040j = r1;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        FTS5SearchMessageLogic.this.f270937g.mo138626z(-200, MAlarmHandler.NEXT_FIRE_INTERVAL);
        return true;
    }

    public String toString() {
        return "ResetMessageCreateTimeCursor";
    }
}
