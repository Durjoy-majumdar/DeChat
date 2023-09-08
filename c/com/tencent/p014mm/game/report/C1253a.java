package com.tencent.p014mm.game.report;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.game.report.a */
public class C1253a implements C11385n {

    /* renamed from: d */
    public static C1253a f10311d;

    public C1253a() {
        C86709a0.m107524d().mo123455a(1223, this);
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.GameMsgReportService", "onSceneEnd, errType : %d, errCode : %d", Integer.valueOf(i), Integer.valueOf(i2));
    }
}
