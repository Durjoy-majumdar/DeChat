package com.tencent.p014mm.plugin.fts.plc;

import android.content.Context;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import di3.C86312j;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import kv1.C76636p;
import lv1.C99664b;
import ob0.C89132b;
import p749xh.C78819m2;
import te3.C49600gr2;

/* renamed from: com.tencent.mm.plugin.fts.plc.FTSQueryClickRecallFSC */
public final class FTSQueryClickRecallFSC extends C98597b {

    /* renamed from: f */
    public long f198226f;

    /* renamed from: g */
    public long f198227g;

    /* renamed from: h */
    public C89132b<C49600gr2> f198228h;

    /* renamed from: com.tencent.mm.plugin.fts.plc.FTSQueryClickRecallFSC$a */
    public final class C68986a extends C99664b {
        public C68986a() {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
            C78819m2.createTable(fVar.mo128795l());
            SelectSql build = C78819m2.f231075g.select((Column) C78819m2.f231076h.count()).build();
            FTSQueryClickRecallFSC.this.f198226f = build.singleLong(fVar.mo128795l());
            return true;
        }

        /* renamed from: c */
        public String mo94944c() {
            return "currentDictCount:" + FTSQueryClickRecallFSC.this.f198226f;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTSQueryClickRecallFSC(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        C76636p Jd = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).mo128743Jd();
        if (Jd != null) {
            ((C93836i) Jd).mo128803c(-86016, new C68986a());
        }
        new FTSQueryClickRecallFSC$onAccountInit$1(this, this.f289092d).alive();
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        C89132b<C49600gr2> bVar = this.f198228h;
        if (bVar != null) {
            bVar.mo85581g();
        }
    }
}
