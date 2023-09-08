package xw2;

import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextClickEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kd0.C76546u;
import kd0.C76551y;

/* renamed from: xw2.c */
public class C79007c extends IStaticListener<ExtVoiceTransformTextClickEvent> {
    public boolean callback(IEvent iEvent) {
        ExtVoiceTransformTextClickEvent extVoiceTransformTextClickEvent = (ExtVoiceTransformTextClickEvent) iEvent;
        if (extVoiceTransformTextClickEvent == null) {
            return false;
        }
        if (Util.isNullOrNil(extVoiceTransformTextClickEvent.f193576d.f193577a)) {
            Log.m105920e("MicroMsg.VoiceTransformTextClickEventListener", "alvinluo fileName is null");
            return false;
        }
        C76551y jo = C76546u.yx0().mo106785jo(extVoiceTransformTextClickEvent.f193576d.f193577a);
        if (jo == null) {
            Log.m105920e("MicroMsg.VoiceTransformTextClickEventListener", "alvinluo voiceInfo is null");
            return false;
        }
        ExtVoiceTransformTextClickEvent.C67688a aVar = extVoiceTransformTextClickEvent.f193576d;
        int i = aVar.f193578b;
        if (i == 1 || i == 2) {
            String str = jo.f224053d;
            int i2 = aVar.f193579c;
            Log.m105925i("MicroMsg.VoiceTransformTextReporter", "alvinluo reportTransformTextClick voiceId: %s, clickScene: %d", str, Integer.valueOf(i2));
            C115669n.INSTANCE.mo160131h(14220, Integer.valueOf(i2), 0, 0, 0, 0, 0, 0, str);
        } else if (i == 3) {
            String str2 = jo.f224053d;
            int i3 = aVar.f193579c;
            Log.m105925i("MicroMsg.VoiceTransformTextReporter", "alvinluo reportTransformTextDoubleClick voiceId: %s, clickScene: %d", str2, Integer.valueOf(i3));
            C115669n.INSTANCE.mo160131h(14220, 0, Integer.valueOf(i3), 0, 0, 0, 0, 0, str2);
        }
        return true;
    }
}
