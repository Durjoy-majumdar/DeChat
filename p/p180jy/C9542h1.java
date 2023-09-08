package p180jy;

import com.tencent.p014mm.autogen.events.OpenCanvasEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import ps2.C12004a;
import ps2.C35631d0;
import vr2.C102260r;

/* renamed from: jy.h1 */
public class C9542h1 extends IStaticListener<OpenCanvasEvent> {
    public boolean callback(IEvent iEvent) {
        String str;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        OpenCanvasEvent openCanvasEvent = (OpenCanvasEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        OpenCanvasEvent.C1103a aVar = openCanvasEvent.f9369d;
        if (aVar.f9376f == 1) {
            C35631d0 b = C35631d0.m40782b();
            OpenCanvasEvent.C1103a aVar2 = openCanvasEvent.f9369d;
            str = b.mo60343d(aVar2.f9371a, aVar2.f9372b, aVar2.f9373c, aVar2.f9374d);
        } else {
            long safeParseLong = Util.safeParseLong(aVar.f9371a);
            String D = C102260r.m134835D(openCanvasEvent.f9369d.f9377g);
            OpenCanvasEvent.C1103a aVar3 = openCanvasEvent.f9369d;
            String str2 = aVar3.f9378h;
            int i = aVar3.f9375e;
            C12004a aVar4 = new C12004a();
            aVar4.f35001d = false;
            C35631d0 b2 = C35631d0.m40782b();
            OpenCanvasEvent.C1103a aVar5 = openCanvasEvent.f9369d;
            str = b2.mo60342c(safeParseLong, aVar5.f9373c, aVar5.f9379i, aVar5.f9374d, i, D, str2, aVar4);
        }
        openCanvasEvent.f9370e.f9380a = str;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.OpenCanvasLsn");
        return false;
    }
}
