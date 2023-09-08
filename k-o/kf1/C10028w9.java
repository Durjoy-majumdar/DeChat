package kf1;

import cm1.C0716c;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import dp1.C58403t;
import dp1.C7459y1;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9499g;
import o40.C61926c;
import rs1.C13442s8;
import sx3.C64197v;
import up1.C14362s;

/* renamed from: kf1.w9 */
public final class C10028w9 extends C9499g<C9493c> {

    /* renamed from: a */
    public final /* synthetic */ C9957r9 f30731a;

    public C10028w9(C9957r9 r9Var) {
        this.f30731a = r9Var;
    }

    /* renamed from: b */
    public void mo752b(Set<C9494d<C9493c>> set) {
        C87412m.m108594g(set, "recordsSet");
        Log.m105924i("Finder.FinderTimelineLbsMixPresenter", "onExposeTimeRecorded: size = " + set.size());
        C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30731a.f30606d);
        C58403t k3 = f != null ? f.mo12855k3(-1) : null;
        if (k3 instanceof C7459y1) {
            ArrayList arrayList = new ArrayList();
            for (T next : set) {
                if (((C9494d) next).f29663a instanceof C0716c) {
                    arrayList.add(next);
                }
            }
            C7459y1 y1Var = (C7459y1) k3;
            long j = this.f30731a.f30612j;
            y1Var.getClass();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C9494d dVar = (C9494d) it.next();
                C14362s sVar = ((C0716c) dVar.f29663a).f1724d.f39807b;
                if (sVar != null) {
                    FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = new FinderLbsCardExposeReportStruct();
                    y1Var.mo8610P1(finderLbsCardExposeReportStruct);
                    y1Var.mo8609N1(finderLbsCardExposeReportStruct, sVar);
                    finderLbsCardExposeReportStruct.f9832g = finderLbsCardExposeReportStruct.mo86045b("refreshTime", C61926c.m72691p(j), true);
                    finderLbsCardExposeReportStruct.f9833h = 1;
                    finderLbsCardExposeReportStruct.f9835j = (long) dVar.f29667e;
                    long j2 = dVar.f29666d;
                    finderLbsCardExposeReportStruct.f9839n = j2;
                    long j3 = dVar.f29664b;
                    finderLbsCardExposeReportStruct.f9840o = j3;
                    long j4 = dVar.f29665c;
                    finderLbsCardExposeReportStruct.f9841p = j4;
                    finderLbsCardExposeReportStruct.f9844s = j2;
                    finderLbsCardExposeReportStruct.f9845t = j3;
                    finderLbsCardExposeReportStruct.f9846u = j4;
                    LinkedList<BaseFinderFeed> linkedList = sVar.f39920b;
                    int i = 0;
                    for (T next2 : linkedList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) next2;
                            if (i < 3) {
                                FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct2 = new FinderLbsCardExposeReportStruct(finderLbsCardExposeReportStruct.mo1005p());
                                y1Var.mo8611Q1(finderLbsCardExposeReportStruct2, baseFinderFeed);
                                finderLbsCardExposeReportStruct2.f9843r = (long) i;
                                finderLbsCardExposeReportStruct2.mo86054n();
                            }
                            i = i2;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    continue;
                }
            }
        }
    }
}
