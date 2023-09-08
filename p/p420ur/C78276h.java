package p420ur;

import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.plugin.fts.C93834f;
import com.tencent.p014mm.plugin.fts.C93836i;
import com.tencent.p014mm.plugin.fts.PluginFTS;
import com.tencent.p014mm.plugin.fts.plc.FTSQueryClickRecallFSC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.sql.Column;
import com.tencent.p014mm.sdk.storage.sql.ISqlColumn;
import com.tencent.p014mm.sdk.storage.sql.ISqlCondition;
import com.tencent.p014mm.sdk.storage.sql.ISqlOrder;
import com.tencent.p014mm.sdk.storage.sql.SelectSql;
import com.tencent.p014mm.sdk.storage.sql.SingleTable;
import di3.C86312j;
import ei3.C86522b;
import gy3.C87412m;
import h81.C32735h;
import i40.C98597b;
import i40.C98598e;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import kv1.C76636p;
import kv1.C99255j;
import p255vr.C78469f;
import p749xh.C78819m2;
import qv1.C77434b;
import sf3.C63879b;
import z04.C112551y;

@C86522b
/* renamed from: ur.h */
public final class C78276h extends C98598e implements C78469f {
    public void Vs0(String str) {
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        FTSQueryClickRecallFSC fTSQueryClickRecallFSC = (FTSQueryClickRecallFSC) C98597b.f289091e.mo85231a(this, FTSQueryClickRecallFSC.class);
        C76636p Jd = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).mo128743Jd();
        if (Jd != null) {
            ((C93836i) Jd).mo128803c(65536, new C77434b(str, fTSQueryClickRecallFSC));
        }
    }

    public boolean le0(String str) {
        boolean z;
        boolean z2;
        C87412m.m108594g(str, SearchIntents.EXTRA_QUERY);
        FTSQueryClickRecallFSC fTSQueryClickRecallFSC = (FTSQueryClickRecallFSC) C98597b.f289091e.mo85231a(this, FTSQueryClickRecallFSC.class);
        int dM = ((C32735h) C86312j.m106911c(C32735h.class)).mo58782dM(new C63879b());
        C99255j.C99256a aVar = C99255j.f291038a;
        if (!Util.isNullOrNil(str)) {
            char[] charArray = str.toCharArray();
            int codePointCount = Character.codePointCount(charArray, 0, charArray.length);
            int i = 0;
            while (true) {
                if (i >= codePointCount) {
                    break;
                }
                int codePointAt = Character.codePointAt(charArray, i);
                if ((128 <= codePointAt && codePointAt <= 687) || (768 <= codePointAt && codePointAt <= 1023) || ((1536 <= codePointAt && codePointAt <= 1791) || ((3072 <= codePointAt && codePointAt <= 3199) || ((7616 <= codePointAt && codePointAt <= 7679) || ((7680 <= codePointAt && codePointAt <= 7935) || ((8192 <= codePointAt && codePointAt <= 8351) || ((8400 <= codePointAt && codePointAt <= 8527) || ((8592 <= codePointAt && codePointAt <= 9215) || ((9312 <= codePointAt && codePointAt <= 9727) || ((9728 <= codePointAt && codePointAt <= 10223) || ((10496 <= codePointAt && codePointAt <= 10751) || ((11008 <= codePointAt && codePointAt <= 11263) || ((11360 <= codePointAt && codePointAt <= 11391) || ((11776 <= codePointAt && codePointAt <= 11903) || ((42128 <= codePointAt && codePointAt <= 42191) || ((57344 <= codePointAt && codePointAt <= 63743) || ((65024 <= codePointAt && codePointAt <= 65039) || ((65072 <= codePointAt && codePointAt <= 65103) || ((126976 <= codePointAt && codePointAt <= 127023) || ((127136 <= codePointAt && codePointAt <= 127231) || ((127232 <= codePointAt && codePointAt <= 128591) || ((128640 <= codePointAt && codePointAt <= 128767) || ((129296 <= codePointAt && codePointAt <= 129387) || (129408 <= codePointAt && codePointAt <= 129504)))))))))))))))))))))))) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        z = false;
        if (z) {
            Log.m105924i("MicroMsg.FTSQueryClickRecallPLC", str + " has emoji");
            return true;
        } else if (dM < 1 || fTSQueryClickRecallFSC.f198226f <= 20) {
            return true;
        } else {
            C93834f fVar = ((PluginFTS) C86312j.m106911c(PluginFTS.class)).f270759e;
            SingleTable singleTable = C78819m2.f231075g;
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            LinkedList linkedList3 = new LinkedList();
            Column column = C78819m2.f231077i;
            linkedList.add(column);
            ISqlCondition and = column.like('\'' + C112551y.m153814n(str, "'", "", false) + "%'").and(C78819m2.f231079n.equal((Number) 0L));
            SelectSql.Limit limit = new SelectSql.Limit(1, 0);
            SelectSql.Builder groupBy = C78819m2.f231075g.select((List<? extends ISqlColumn>) linkedList).where(and).orderBy((List<? extends ISqlOrder>) linkedList2).groupBy((List<? extends Column>) linkedList3);
            groupBy.limit(limit.getLimit(), limit.getOffset());
            SelectSql build = groupBy.build();
            C87412m.m108593f(build, "select().selectQuery().w…    ).limit(1, 0).build()");
            boolean isExist = build.isExist(fVar.mo128795l());
            if (!Util.isNullOrNil(str)) {
                char[] charArray2 = str.toCharArray();
                int length = charArray2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C99255j.m129317a(charArray2[i2])) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                LinkedList linkedList4 = new LinkedList();
                LinkedList linkedList5 = new LinkedList();
                LinkedList linkedList6 = new LinkedList();
                Column column2 = C78819m2.f231077i;
                linkedList4.add(column2);
                ISqlCondition and2 = column2.equal("net@" + C112551y.m153814n(str, "'", "", false)).and(C78819m2.f231079n.equal((Number) 1L));
                SelectSql.Limit limit2 = new SelectSql.Limit(1, 0);
                SelectSql.Builder groupBy2 = C78819m2.f231075g.select((List<? extends ISqlColumn>) linkedList4).where(and2).orderBy((List<? extends ISqlOrder>) linkedList5).groupBy((List<? extends Column>) linkedList6);
                groupBy2.limit(limit2.getLimit(), limit2.getOffset());
                SelectSql build2 = groupBy2.build();
                C87412m.m108593f(build2, "select().selectQuery().w…    ).limit(1, 0).build()");
                if (!build2.isExist(fVar.mo128795l())) {
                    return true;
                }
            }
            return isExist;
        }
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(FTSQueryClickRecallFSC.class);
    }
}
