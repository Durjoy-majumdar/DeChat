package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import gy3.C87412m;
import p749xh.C38581i6;

/* renamed from: com.tencent.mm.storage.i4 */
public final class C57596i4 extends MvvmStorage<C30744h4> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57596i4(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final void mo81949c3(String str) {
        C87412m.m108594g(str, "roomId");
        Log.m105924i("MicroMsg.MsgQueryHistoryInfoStorage", "deleteHistoryByRoomId >> roomId: " + str);
        int run = C38581i6.f102538h.delete().log("MicroMsg.MsgQueryHistoryInfoStorage").where(new Sql.Equal("chat_room_id", str)).build().run(getDbProvider().getDB());
        Log.m105924i("MicroMsg.MsgQueryHistoryInfoStorage", "deleteHistoryByRoomId >> roomId: " + str + " , result: " + run);
    }

    public String getLogTag() {
        return "MicroMsg.MsgQueryHistoryInfoStorage";
    }
}
