package p180jy;

import com.tencent.p014mm.autogen.events.FinderPostStatusEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import zt3.C119157j;

/* renamed from: jy.v0 */
public class C33778v0 extends IStaticListener<FinderPostStatusEvent> {
    public boolean callback(IEvent iEvent) {
        FinderPostStatusEvent.C28746a aVar;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        FinderPostStatusEvent finderPostStatusEvent = (FinderPostStatusEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        if (!C86709a0.m107522a()) {
            Log.m105928w("MicroMsg.FinderPostFinishListener", "FinderPostStatusEvent arrived before account was ready, ignore it.");
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        } else {
            if (!(finderPostStatusEvent == null || (aVar = finderPostStatusEvent.f78800d) == null || aVar.f78801a <= 0)) {
                ((C119157j) C119157j.f356862d).mo183875f(new C99080u0(this, finderPostStatusEvent));
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.FinderPostFinishListener");
        return false;
    }
}
