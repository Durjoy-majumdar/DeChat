package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.os.SystemClock;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2469j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import p749xh.C53330c3;
import ue1.C52528f;
import ue1.C52541j;
import ue1.C65326e;
import up1.C52593j;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderConversationTempUI;", "Lcom/tencent/mm/plugin/finder/ui/FinderConversationParentUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderConversationTempUI */
public final class FinderConversationTempUI extends FinderConversationParentUI {

    /* renamed from: p */
    public int f111788p;

    /* renamed from: J7 */
    public String mo2994J7() {
        return "FinderConversationTempUI";
    }

    /* renamed from: O7 */
    public String mo2965O7() {
        String string = getString(C0966R.string.d4s);
        C87412m.m108593f(string, "this.getString(com.tence…nversation_message_title)");
        return string;
    }

    public void finish() {
        Class cls = FinderCommonFeatureService.class;
        super.finish();
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c.mo2441a();
        C2469j jVar = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().f158526c;
        jVar.f12931c.removeMessages(9);
        jVar.f12931c.sendEmptyMessage(9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f111788p = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).mo76776L4().mo73553qq(1, 3, "");
    }

    public void onResume() {
        Class cls = FinderCommonFeatureService.class;
        super.onResume();
        String str = "";
        int qq = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4().mo73553qq(1, 3, str);
        C52541j jVar = (C52541j) ((FinderBaseConversationFragment) mo4019N7()).mo62824Z();
        List<C52528f> Yt = ((C52593j) jVar.mo62834L4()).mo73550Yt(jVar.f146749a, 0, 1, new int[]{3}, jVar.f146751c);
        if (!Yt.isEmpty()) {
            str = Yt.get(0).f146722a1 + XVFSFile.PATH_SEPARATOR_CHAR + Yt.get(0).field_digest;
        }
        long j = Yt.isEmpty() ? 0 : Yt.get(0).field_updateTime;
        Log.m105924i("Finder.FinderConversationParentUI", "[onResume] digest:" + str);
        C52593j Bx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).mo76776L4();
        long uptimeMillis = SystemClock.uptimeMillis();
        SingleTable singleTable = C53330c3.f149030B;
        SelectSql build = C53330c3.f149030B.select((List<? extends ISqlColumn>) new LinkedList()).where(C53330c3.f149036H.equal((Number) 1).and(C53330c3.f149035G.equal((Number) 3))).orderBy((List<? extends ISqlOrder>) new LinkedList()).groupBy((List<? extends Column>) new LinkedList()).build();
        C87412m.m108593f(build, "select()\n            .wh…S))\n            ).build()");
        List<C52528f> multiQuery = build.multiQuery(Bx0.f146897d, C52528f.class);
        String name = Thread.currentThread().getName();
        C87412m.m108593f(name, "currentThread().name");
        String sql = build.toSql();
        C87412m.m108594g(sql, "sql");
        new C65326e("FinderConversationStorage.getAliasConvCount", C112551y.m153815o(sql, ',', ';', false, 4, (Object) null), SystemClock.uptimeMillis() - uptimeMillis, name, 0).mo89421a();
        int size = multiQuery.size();
        C52528f fVar = Bx0.get("finderaliassessionholder");
        if (size <= 0) {
            long j2 = fVar.systemRowid;
            if (j2 > 0 && size == 0 && Bx0.delete(j2)) {
                Bx0.doNotify(fVar.field_sessionId, 6, fVar);
            }
        } else if (fVar.systemRowid > 0 && (!C87412m.m108589b(str, fVar.field_digest) || j != fVar.field_updateTime)) {
            fVar.field_digest = str;
            fVar.field_updateTime = j;
            if (Bx0.update(fVar.systemRowid, fVar, false)) {
                Bx0.doNotify(fVar.field_sessionId, 1, fVar);
            }
        } else if (this.f111788p != qq) {
            this.f111788p = qq;
            Bx0.doNotify(fVar.field_sessionId, 1, fVar);
        }
    }
}
