package com.tencent.p014mm.plugin.finder.service;

import android.os.SystemClock;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C46117w1;
import mu3.C109639a;
import p749xh.C53330c3;
import ue1.C52528f;
import ue1.C65326e;
import up1.C52593j;
import z04.C112551y;

@C86522b
/* renamed from: com.tencent.mm.plugin.finder.service.a0 */
public final class C41487a0 extends C86301e implements C46117w1 {
    public C41487a0() {
        C109639a.m148950a("FinderConversationNotify");
    }

    /* renamed from: G */
    public boolean mo64578G(String str, String str2) {
        if ((str == null || str.length() == 0) || str2 == null) {
            return false;
        }
        if (C72996z1.m85825X4(str)) {
            C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
            C87412m.m108594g(str, "sessionId");
            C52528f fVar = Bx0.get(str);
            fVar.field_editingMsg = str2;
            boolean update = Bx0.update(fVar.systemRowid, fVar, false);
            Bx0.doNotify(fVar.field_sessionId, 7, fVar);
            Log.m105924i("Finder.ConversationStorage", "[setTopPlace] ret=" + update + " editing=" + str2 + " sessionId=" + str);
            return update;
        }
        throw new RuntimeException("sessionId[" + str + "] is not session");
    }

    /* renamed from: K */
    public void mo64579K(String str) {
        if (!(str == null || str.length() == 0)) {
            if (C72996z1.m85825X4(str)) {
                ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().mo71566K(str);
                return;
            }
            throw new RuntimeException("sessionId[" + str + "] is not session");
        }
    }

    public boolean P20(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (C72996z1.m85825X4(str)) {
            return ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().get(str).field_placedFlag > 0;
        }
        throw new RuntimeException("sessionId[" + str + "] is not session");
    }

    /* renamed from: U */
    public String mo64581U(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (C72996z1.m85825X4(str)) {
            String str2 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().get(str).field_editingMsg;
            return str2 == null ? "" : str2;
        }
        throw new RuntimeException("sessionId[" + str + "] is not session");
    }

    /* renamed from: V */
    public int mo64582V(String str) {
        String str2 = str;
        if (str2 == null || str.length() == 0) {
            return 0;
        }
        if (C72996z1.m85825X4(str)) {
            C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4();
            C87412m.m108594g(str2, "sessionId");
            SingleTable singleTable = C53330c3.f149030B;
            Column column = C53330c3.f149032D;
            C87412m.m108593f(column, "UNREADCOUNT");
            SelectSql build = singleTable.select(column).where(C53330c3.f149031C.equal(str2)).log("Finder.ConversationStorage").build();
            long uptimeMillis = SystemClock.uptimeMillis();
            int singleInt = build.singleInt(Bx0.f146897d);
            String name = Thread.currentThread().getName();
            C87412m.m108593f(name, "currentThread().name");
            String sql = build.toSql();
            C87412m.m108594g(sql, "sql");
            new C65326e("FinderConversationStorage.getUnreadCount#sessionId", C112551y.m153815o(sql, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
            Log.m105924i("Finder.ConversationStorage", "[getUnreadCount] sessionId=" + str2 + ' ' + singleInt);
            return singleInt;
        }
        throw new RuntimeException("sessionId[" + str2 + "] is not session");
    }

    public boolean cn0(String str, boolean z) {
        return false;
    }
}
