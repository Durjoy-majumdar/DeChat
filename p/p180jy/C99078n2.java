package p180jy;

import com.tencent.p014mm.autogen.events.ChattingUIStatusEvent;
import com.tencent.p014mm.plugin.sns.model.C94866e1;
import com.tencent.p014mm.plugin.sns.model.C94869f2;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import fs2.C32163a;
import hd0.C98398h0;
import hd0.C98438x;
import hd0.C98444y;
import zt3.C119157j;

/* renamed from: jy.n2 */
public class C99078n2 extends IStaticListener<ChattingUIStatusEvent> {
    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        C94869f2 hy02 = C94866e1.hy0();
        hy02.f274921h = ((ChattingUIStatusEvent) iEvent).f78735d.f78736a;
        if ((hy02.f274922i && !C32163a.m39640a()) || hy02.f274921h) {
            hy02.mo131036v();
        }
        if (!hy02.f274921h && !hy02.f274922i) {
            hy02.mo131035u();
        }
        C98438x yx02 = C98398h0.yx0();
        boolean z = hy02.f274921h;
        yx02.f288723e = z;
        if (z) {
            yx02.mo137776g();
        } else {
            ((C119157j) C119157j.f356862d).mo183875f(new C98444y(yx02));
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsVideoServiceChattingUIStatusListener");
        return false;
    }
}
