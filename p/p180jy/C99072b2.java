package p180jy;

import com.tencent.p014mm.autogen.events.SnsImageDownloadedEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94938q1;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C96983o3;
import vr2.C102236a0;
import vr2.C102268v;

/* renamed from: jy.b2 */
public class C99072b2 extends IStaticListener<SnsImageDownloadedEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        SnsImageDownloadedEvent snsImageDownloadedEvent = (SnsImageDownloadedEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        if (snsImageDownloadedEvent instanceof SnsImageDownloadedEvent) {
            SnsImageDownloadedEvent.C1139a aVar = snsImageDownloadedEvent.f9515d;
            int i = aVar.f9516a;
            if (i == 1) {
                Log.m105925i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download ", "[image-flow]", aVar.f9517b.f298689d);
                C102268v vVar = new C102268v(snsImageDownloadedEvent.f9515d.f9517b);
                vVar.mo141832d(1);
                vVar.mo141833e(snsImageDownloadedEvent.f9515d.f9517b.f298689d);
                if (snsImageDownloadedEvent.f9515d.f9517b.f298690e == 6) {
                    C94866e1.Vx0().mo130979d(snsImageDownloadedEvent.f9515d.f9517b, 5, vVar, C96983o3.f284141m);
                } else {
                    C94866e1.Vx0().mo130979d(snsImageDownloadedEvent.f9515d.f9517b, 1, vVar, C96983o3.f284141m);
                }
            } else if (i == 3) {
                String e = C94938q1.m120518e(C94866e1.m120262YO(), snsImageDownloadedEvent.f9515d.f9518c);
                String Y = C102236a0.m134730Y(snsImageDownloadedEvent.f9515d.f9518c);
                SnsImageDownloadedEvent.C1139a aVar2 = snsImageDownloadedEvent.f9515d;
                aVar2.f9519d = e + Y;
                SnsImageDownloadedEvent.C1139a aVar3 = snsImageDownloadedEvent.f9515d;
                Log.m105925i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]GENERATE_PATH:%s", "[image-flow]", aVar3.f9518c, aVar3.f9519d);
            } else if (i == 4) {
                Log.m105925i("MicroMsg.SnsImageDownloadListener", "[%s][media:%s]start do download big img", "[image-flow]", aVar.f9517b.f298689d);
                C102268v vVar2 = new C102268v(snsImageDownloadedEvent.f9515d.f9517b);
                vVar2.mo141832d(3);
                vVar2.mo141833e(snsImageDownloadedEvent.f9515d.f9517b.f298689d);
                if (snsImageDownloadedEvent.f9515d.f9517b.f298690e == 6) {
                    C94866e1.Vx0().mo130979d(snsImageDownloadedEvent.f9515d.f9517b, 4, (C102268v) null, C96983o3.f284141m);
                } else {
                    C94866e1.Vx0().mo130979d(snsImageDownloadedEvent.f9515d.f9517b, 2, vVar2, C96983o3.f284141m);
                }
            }
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsImageDownloadListener");
        return false;
    }
}
