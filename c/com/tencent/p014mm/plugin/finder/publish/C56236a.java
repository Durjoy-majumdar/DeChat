package com.tencent.p014mm.plugin.finder.publish;

import com.tencent.p014mm.autogen.events.SnsPostInfoEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsPostSyncFinderPostStruct;
import di3.C86312j;
import dp1.C58417y0;
import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import qo1.C12898c;
import rx3.C13598b0;
import rx3.C13604l;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.publish.a */
public final class C56236a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C56237b f160687d;

    /* renamed from: e */
    public final /* synthetic */ SnsPostInfoEvent f160688e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56236a(C56237b bVar, SnsPostInfoEvent snsPostInfoEvent) {
        super(0);
        this.f160687d = bVar;
        this.f160688e = snsPostInfoEvent;
    }

    public Object invoke() {
        C56237b bVar = this.f160687d;
        SnsPostInfoEvent.C55166a aVar = this.f160688e.f154876d;
        long j = (long) aVar.f154878b;
        long j2 = aVar.f154877a;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) ((C36570n) bVar.f160689d).getValue()).iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) ((C13604l) next).f38555d).longValue() != j) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            SnsPostSyncFinderPostStruct snsPostSyncFinderPostStruct = (SnsPostSyncFinderPostStruct) ((C13604l) it4.next()).f38556e;
            snsPostSyncFinderPostStruct.f156854e = snsPostSyncFinderPostStruct.mo86045b("snsfeedid", j2 != 0 ? C61926c.m72691p(j2) : "", true);
            snsPostSyncFinderPostStruct.mo86054n();
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Ec0(snsPostSyncFinderPostStruct);
        }
        C61926c.m72673R((ArrayList) ((C36570n) bVar.f160689d).getValue(), new C12898c(j));
        if (((ArrayList) ((C36570n) bVar.f160689d).getValue()).isEmpty()) {
            ((FinderPublishFeatureService$snsPostListener$2$1) ((C36570n) bVar.f160690e).getValue()).dead();
        }
        return C13598b0.f38549a;
    }
}
