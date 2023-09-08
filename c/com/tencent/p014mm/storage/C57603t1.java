package com.tencent.p014mm.storage;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.mvvm.IMvvmDBProvider;
import com.tencent.p014mm.sdk.storage.mvvm.MvvmStorage;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.Sql;
import gy3.C87412m;
import java.util.List;
import p749xh.C66267j1;
import sx3.C26236u;

/* renamed from: com.tencent.mm.storage.t1 */
public final class C57603t1 extends MvvmStorage<C57602s1> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57603t1(IMvvmDBProvider iMvvmDBProvider) {
        super(iMvvmDBProvider);
        C87412m.m108594g(iMvvmDBProvider, "dbProvider");
    }

    /* renamed from: c3 */
    public final void mo81951c3(String str) {
        C87412m.m108594g(str, "roomId");
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteClsByRoomId >> roomId: " + str);
        int run = C66267j1.f190595p.delete().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str)).build().run(getDbProvider().getDB());
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "deleteClsByRoomId >> result: " + run);
    }

    /* renamed from: d3 */
    public final List<C57602s1> mo81952d3(String str, String str2, int i, int i2) {
        C87412m.m108594g(str, "roomId");
        C87412m.m108594g(str2, "isRes");
        List<C57602s1> multiQuery = C66267j1.f190595p.selectAll().log("MicroMsg.ClsLabelInfoStorage").where(new Sql.Equal("chat_room_id", str).and(new Sql.Equal("is_recognize", str2))).orderBy((List<? extends ISqlOrder>) C26236u.m33719b(C66267j1.f190596q.orderDesc())).limit(i2, i).build().multiQuery(getDbProvider().getDB(), C57602s1.class);
        Log.m105924i("MicroMsg.ClsLabelInfoStorage", "getClsImageListByIsRec select result: " + multiQuery.size());
        return multiQuery;
    }

    public String getLogTag() {
        return "MicroMsg.ClsLabelInfoStorage";
    }
}
