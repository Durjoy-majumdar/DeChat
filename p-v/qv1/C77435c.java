package qv1;

import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.plc.FTSQueryClickRecallFSC;
import com.tencent.p014mm.pluginsdk.platformtools.C72715f;
import com.tencent.p014mm.sdk.p134kt.CommonKt;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.tav.coremedia.TimeUtil;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import lv1.C99664b;
import p749xh.C78819m2;
import te3.C49322er2;
import te3.C49374f33;
import te3.C52065y40;
import z04.C112551y;

/* renamed from: qv1.c */
public final class C77435c extends C99664b {

    /* renamed from: j */
    public long f225853j;

    /* renamed from: n */
    public long f225854n;

    /* renamed from: o */
    public String f225855o = "";

    /* renamed from: p */
    public long f225856p;

    /* renamed from: q */
    public long f225857q;

    /* renamed from: r */
    public final /* synthetic */ FTSQueryClickRecallFSC f225858r;

    /* renamed from: s */
    public final /* synthetic */ C49322er2 f225859s;

    /* renamed from: t */
    public final /* synthetic */ C49374f33 f225860t;

    public C77435c(FTSQueryClickRecallFSC fTSQueryClickRecallFSC, C49322er2 er22, C49374f33 f332) {
        this.f225858r = fTSQueryClickRecallFSC;
        this.f225859s = er22;
        this.f225860t = f332;
    }

    /* renamed from: b */
    public boolean mo57099b() {
        C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
        C49322er2 er22 = this.f225859s;
        if (er22 != null) {
            int i = er22.f133084f;
            if (i <= 0) {
                i = 31536000;
            }
            this.f225853j = (long) C78819m2.f231075g.delete().where(C78819m2.f231078j.smallerThan((Number) Long.valueOf(C31543z5.m39453c() - ((long) (i * 1000)))).and(C78819m2.f231079n.equal((Number) 0L))).build().run(fVar.mo128795l());
            LinkedList<C52065y40> linkedList = er22.f133082d;
            C87412m.m108593f(linkedList, "localDict.items");
            for (List<C52065y40> it : CommonKt.splitList(linkedList, 50)) {
                fVar.mo128785a();
                for (C52065y40 y402 : it) {
                    String str = y402.f145108d;
                    if (str != null && (C112551y.m153811k(str) ^ true)) {
                        C78819m2 m2Var = new C78819m2();
                        m2Var.mo108777m2(y402.f145108d);
                        m2Var.mo108776l2(0);
                        m2Var.mo108778n2(C31543z5.m39451a());
                        m2Var.replaceToDB(fVar.mo128795l(), false);
                    }
                }
                fVar.mo128788d();
            }
            this.f225855o = er22.f133083e + ' ' + C72715f.m85111d(TimeUtil.YYYY2MM2DD_HH1MM1SS, (long) er22.f133083e);
            this.f225856p = (long) er22.f133082d.size();
        }
        C49374f33 f332 = this.f225860t;
        if (f332 != null) {
            this.f225854n = (long) C78819m2.f231075g.delete().where(C78819m2.f231079n.equal((Number) 1L)).build().run(fVar.mo128795l());
            LinkedList<C52065y40> linkedList2 = f332.f133271d;
            C87412m.m108593f(linkedList2, "networkDict.items");
            for (List<C52065y40> it4 : CommonKt.splitList(linkedList2, 50)) {
                fVar.mo128785a();
                for (C52065y40 y403 : it4) {
                    String str2 = y403.f145108d;
                    if (str2 != null && (C112551y.m153811k(str2) ^ true)) {
                        C78819m2 m2Var2 = new C78819m2();
                        m2Var2.mo108777m2("net@" + y403.f145108d);
                        m2Var2.mo108776l2(1);
                        m2Var2.mo108778n2(C31543z5.m39453c());
                        m2Var2.replaceToDB(fVar.mo128795l(), false);
                    }
                }
                fVar.mo128788d();
            }
            this.f225857q = (long) f332.f133271d.size();
        }
        this.f225858r.f198226f = C78819m2.f231075g.select((Column) C78819m2.f231076h.count()).build().singleLong(fVar.mo128795l());
        return true;
    }

    /* renamed from: c */
    public String mo94944c() {
        return "deleteLocalResult:" + this.f225853j + " deleteNetWorkResult:" + this.f225854n + " localUpdateTime:" + this.f225855o + " localDictCount:" + this.f225856p + " netWorkCount:" + this.f225857q + " currentDictCount:" + this.f225858r.f198226f;
    }
}
