package com.tencent.p014mm.plugin.fts.logic;

import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86301e;
import di3.C86312j;
import eb0.C31505r2;
import eb0.C86484b;
import ei3.C86522b;
import f40.C86709a0;
import lv1.C99664b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.fts.logic.h */
public class C93929h extends C86301e implements C31505r2 {

    /* renamed from: com.tencent.mm.plugin.fts.logic.h$b */
    public class C93930b extends C99664b {
        public C93930b(C93929h hVar, C30053a aVar) {
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
            if (fVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                fVar.mo128792i(String.format("Delete From %s;", new Object[]{"FTS5MetaMessage"}));
                fVar.mo128792i(String.format("Delete From %s;", new Object[]{"FTS5IndexMessage"}));
                Log.m105925i("MicroMsg.FTS.FTSIndexDB", "deleteAllMsg use time %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            }
            return true;
        }

        public String getName() {
            return "FTSDeleteMsgLogic.DeleteAllMsgTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.h$c */
    public class C93931c extends C99664b {

        /* renamed from: j */
        public long f271064j;

        public C93931c(C93929h hVar, long j) {
            this.f271064j = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
            if (fVar == null) {
                return true;
            }
            fVar.mo128790g(this.f271064j);
            return true;
        }

        public String getName() {
            return "FTSDeleteMsgLogic.DeleteSingleMsgTask";
        }
    }

    /* renamed from: com.tencent.mm.plugin.fts.logic.h$d */
    public class C93932d extends C99664b {

        /* renamed from: j */
        public String f271065j;

        /* renamed from: n */
        public long f271066n;

        public C93932d(C93929h hVar, String str, long j) {
            this.f271065j = str;
            this.f271066n = j;
        }

        /* renamed from: b */
        public boolean mo57099b() {
            C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
            if (fVar == null) {
                return true;
            }
            fVar.mo128791h(this.f271065j, this.f271066n);
            return true;
        }

        public String getName() {
            return "FTSDeleteMsgLogic.DeleteTalkerMsgByTimestamp";
        }
    }

    public void Wt0(long j) {
        Class cls = PluginFTS.class;
        if (C86709a0.m107522a()) {
            try {
                C93834f fVar = ((PluginFTS) C86312j.m106911c(cls)).f270759e;
                if (fVar != null) {
                    fVar.mo128790g(j);
                    return;
                }
                ((C93836i) ((PluginFTS) C86312j.m106911c(cls)).mo128743Jd()).mo128803c(65536, new C93931c(this, j));
                Log.m105925i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteSingleMsg post task to fts task daemon %d", Long.valueOf(j));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", e, "syncDeleteSingleMsg", new Object[0]);
            }
        } else {
            throw new C86484b();
        }
    }

    /* renamed from: XN */
    public void mo58206XN(String str, long j) {
        Class cls = PluginFTS.class;
        Log.m105925i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete fts talker msg %s %s", str, C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, j / 1000));
        if (C86709a0.m107522a()) {
            try {
                C93834f fVar = ((PluginFTS) C86312j.m106911c(cls)).f270759e;
                if (fVar != null) {
                    fVar.mo128791h(str, j);
                    return;
                }
                ((C93836i) ((PluginFTS) C86312j.m106911c(cls)).mo128743Jd()).mo128803c(65536, new C93932d(this, str, j));
                Log.m105925i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteTalkerMsg post task to fts task daemon %s %s", str, Long.valueOf(j));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FTS.FTSDeleteMsgLogic", e, "syncDeleteTalkerMsg", new Object[0]);
            }
        } else {
            throw new C86484b();
        }
    }

    public void xq0() {
        Log.m105924i("MicroMsg.FTS.FTSDeleteMsgLogic", "start to delete all msg");
        if (C86709a0.m107522a()) {
            ((C93836i) ((PluginFTS) C86312j.m106911c(PluginFTS.class)).mo128743Jd()).mo128803c(-131072, new C93930b(this, (C30053a) null));
            Log.m105924i("MicroMsg.FTS.FTSDeleteMsgLogic", "syncDeleteAllMsg post task to fts task daemon");
            return;
        }
        throw new C86484b();
    }
}
