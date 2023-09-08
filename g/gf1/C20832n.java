package gf1;

import com.tencent.p014mm.autogen.events.FinderSyncRedDotEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderRedDotInfoStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderSyncRedDotStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fe1.C45770k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import te3.C49170dn1;
import te3.C49448fn1;
import te3.C50401mh0;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: gf1.n */
public class C20832n implements C45770k {

    /* renamed from: d */
    public FinderSyncRedDotStruct f58847d = new FinderSyncRedDotStruct();

    /* renamed from: a */
    public final void mo32532a(String str, String str2, int i, int i2) {
        if (!Util.isNullOrNil(str)) {
            FinderSyncRedDotStruct finderSyncRedDotStruct = this.f58847d;
            finderSyncRedDotStruct.f48478d = finderSyncRedDotStruct.mo86045b("TipsId", str, true);
            finderSyncRedDotStruct.f48481g = finderSyncRedDotStruct.mo86045b("CtrlType", str2, true);
            finderSyncRedDotStruct.f48479e = i;
            finderSyncRedDotStruct.f48480f = i2;
            finderSyncRedDotStruct.mo86054n();
            Log.m105925i("MicroMsg.FinderSyncReportHandler", "report RedDot [%s] ctrl[%s] scene[%d] cmdId[%d]", str, str2, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        C51978xi1 xi12;
        LinkedList<C64586nn1> linkedList;
        C50401mh0 mh03 = mh02;
        int i3 = i2;
        if (mh03 != null) {
            long currentTicks = Util.currentTicks();
            ArrayList arrayList = null;
            if (mh03.f138028d == 113) {
                ArrayList arrayList2 = new ArrayList();
                C49170dn1 dn12 = new C49170dn1();
                try {
                    dn12.parseFrom(mh03.f138029e.mo123703f());
                    if (dn12.f132433d != null) {
                        for (int i4 = 0; i4 < dn12.f132433d.size(); i4++) {
                            C49448fn1 fn12 = dn12.f132433d.get(i4);
                            if (!(fn12 == null || (xi12 = fn12.f133597d) == null || (linkedList = xi12.f144672g) == null || linkedList.isEmpty())) {
                                Iterator<C64586nn1> it = fn12.f133597d.f144672g.iterator();
                                while (it.hasNext()) {
                                    C64586nn1 next = it.next();
                                    if ("FinderEntrance".equals(next.f184507i) || "NearbyEntrance".equals(next.f184507i) || "FinderLiveEntrance".equals(next.f184507i)) {
                                        FinderRedDotInfoStruct finderRedDotInfoStruct = new FinderRedDotInfoStruct();
                                        finderRedDotInfoStruct.f48468d = finderRedDotInfoStruct.mo86045b("TipsId", fn12.f133597d.f144673h, true);
                                        finderRedDotInfoStruct.f48470f = fn12.f133597d.f144670e;
                                        finderRedDotInfoStruct.f48471g = finderRedDotInfoStruct.mo86045b("Path", next.f184507i, true);
                                        finderRedDotInfoStruct.f48472h = next.f184502d;
                                        finderRedDotInfoStruct.f48473i = finderRedDotInfoStruct.mo86045b("Url", Util.nullAs(next.f184505g, ""), true);
                                        finderRedDotInfoStruct.f48469e = i3;
                                        arrayList2.add(finderRedDotInfoStruct);
                                    }
                                }
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        StringBuffer stringBuffer = new StringBuffer();
                        StringBuffer stringBuffer2 = new StringBuffer();
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            FinderRedDotInfoStruct finderRedDotInfoStruct2 = (FinderRedDotInfoStruct) it4.next();
                            stringBuffer.append(finderRedDotInfoStruct2.f48468d);
                            stringBuffer.append(";");
                            stringBuffer2.append(finderRedDotInfoStruct2.f48470f);
                            stringBuffer2.append(";");
                        }
                        try {
                            mo32532a(stringBuffer.toString(), stringBuffer2.toString(), i3, mh03.f138028d);
                        } catch (Exception e) {
                            e = e;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.printErrStackTrace("MicroMsg.FinderSyncReportHandler", e, "report tab tips", new Object[0]);
                    arrayList = arrayList2;
                    FinderSyncRedDotEvent finderSyncRedDotEvent = new FinderSyncRedDotEvent();
                    FinderSyncRedDotEvent.C17678a aVar = finderSyncRedDotEvent.f48092d;
                    aVar.f48094b = mh03.f138028d;
                    aVar.f48093a = i3;
                    aVar.f48095c = arrayList;
                    finderSyncRedDotEvent.publish();
                    Log.m105925i("MicroMsg.FinderSyncReportHandler", "FinderSyncReport handle cmd[%d] selector[%d] scene[%d] cost[%d]", Integer.valueOf(mh03.f138028d), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(Util.ticksToNow(currentTicks)));
                }
                arrayList = arrayList2;
            }
            FinderSyncRedDotEvent finderSyncRedDotEvent2 = new FinderSyncRedDotEvent();
            FinderSyncRedDotEvent.C17678a aVar2 = finderSyncRedDotEvent2.f48092d;
            aVar2.f48094b = mh03.f138028d;
            aVar2.f48093a = i3;
            aVar2.f48095c = arrayList;
            finderSyncRedDotEvent2.publish();
            Log.m105925i("MicroMsg.FinderSyncReportHandler", "FinderSyncReport handle cmd[%d] selector[%d] scene[%d] cost[%d]", Integer.valueOf(mh03.f138028d), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(Util.ticksToNow(currentTicks)));
        }
    }
}
