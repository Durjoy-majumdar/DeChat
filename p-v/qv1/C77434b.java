package qv1;

import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.plc.FTSQueryClickRecallFSC;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.regex.Pattern;
import lv1.C99664b;
import p749xh.C78819m2;

/* renamed from: qv1.b */
public final class C77434b extends C99664b {

    /* renamed from: j */
    public String f225849j = "";

    /* renamed from: n */
    public long f225850n;

    /* renamed from: o */
    public final /* synthetic */ String f225851o;

    /* renamed from: p */
    public final /* synthetic */ FTSQueryClickRecallFSC f225852p;

    public C77434b(String str, FTSQueryClickRecallFSC fTSQueryClickRecallFSC) {
        this.f225851o = str;
        this.f225852p = fTSQueryClickRecallFSC;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
        C78819m2 m2Var = new C78819m2();
        String str = this.f225851o;
        Pattern compile = Pattern.compile("[,|，']");
        C87412m.m108593f(compile, "compile(pattern)");
        C87412m.m108594g(str, "input");
        String replaceAll = compile.matcher(str).replaceAll("");
        C87412m.m108593f(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        this.f225849j = replaceAll;
        m2Var.mo108777m2(replaceAll);
        m2Var.mo108776l2(0);
        m2Var.mo108778n2(C31543z5.m39453c());
        this.f225850n = m2Var.replaceToDB(fVar.mo128795l(), false);
        fVar.mo128788d();
        SelectSql build = C78819m2.f231075g.select((Column) C78819m2.f231076h.count()).build();
        this.f225852p.f198226f = build.singleLong(fVar.mo128795l());
        return true;
    }

    /* renamed from: c */
    public String mo94944c() {
        return "processQuery:" + this.f225849j + " result:" + this.f225850n;
    }
}
