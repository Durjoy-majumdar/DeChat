package p180jy;

import android.database.Cursor;
import com.tencent.p014mm.autogen.events.FinderPostStatusEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderShareMomentReportStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.statistics.SnsReportHelper;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.protocal.protobuf.TimeLineObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import os2.C100400e0;
import te3.C101789j00;
import te3.C64682rk1;

/* renamed from: jy.u0 */
public class C99080u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderPostStatusEvent f290436d;

    public C99080u0(C33778v0 v0Var, FinderPostStatusEvent finderPostStatusEvent) {
        this.f290436d = finderPostStatusEvent;
    }

    public void run() {
        TimeLineObject timeLine;
        C101789j00 j002;
        C64682rk1 rk12;
        C64682rk1 rk13;
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
        C100400e0 Yx0 = C94866e1.Yx0();
        Yx0.getClass();
        SnsMethodCalculate.markStartTimeMs("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        ArrayList arrayList = new ArrayList();
        String str = "select *,rowid from SnsInfo  where " + C100400e0.f294101t;
        Cursor rawQuery = Yx0.f294108d.rawQuery(str, (String[]) null, 2);
        Log.m105918d("MicroMsg.SnsInfoStorage", "getLastUpload " + str);
        while (rawQuery.moveToNext()) {
            SnsInfo snsInfo = new SnsInfo();
            snsInfo.convertFrom(rawQuery);
            arrayList.add(snsInfo);
        }
        rawQuery.close();
        SnsMethodCalculate.markEndTimeMs("findoutHoldingFeed", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SnsInfo snsInfo2 = (SnsInfo) it.next();
            if (!(snsInfo2 == null || (timeLine = snsInfo2.getTimeLine()) == null || (j002 = timeLine.ContentObj) == null || (rk12 = j002.f298431o) == null)) {
                long j = rk12.f185192p;
                FinderPostStatusEvent.C28746a aVar = this.f290436d.f78800d;
                if (j == aVar.f78801a) {
                    if (!aVar.f78802b || (rk13 = aVar.f78803c) == null) {
                        SnsReportHelper.f275506m0.mo131391x().f265598g = 1;
                        SnsReportHelper.f275506m0.mo131372e();
                        SnsReportHelper.f275506m0.f275526T = 0;
                        snsInfo2.cleanPostHolding();
                        snsInfo2.setItemDie();
                    } else {
                        j002.f298431o = rk13;
                        FinderShareMomentReportStruct x = SnsReportHelper.f275506m0.mo131391x();
                        x.f265596e = x.mo86045b("Feedid", timeLine.ContentObj.f298431o.f185183d, true);
                        snsInfo2.setTimeLine(timeLine);
                        snsInfo2.cleanPostHolding();
                        C115669n.INSTANCE.mo160131h(18941, "", 5, 1, "", timeLine.ContentObj.f298431o.f185183d);
                    }
                    C94866e1.Yx0().Pq0(snsInfo2);
                    C94866e1.gy0().mo131192c();
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener$1");
    }
}
