package xw2;

import com.tencent.p014mm.autogen.events.ExtVoiceTransformTextResultEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kd0.C76546u;
import kd0.C76551y;

/* renamed from: xw2.f */
public class C79008f extends IStaticListener<ExtVoiceTransformTextResultEvent> {
    public boolean callback(IEvent iEvent) {
        ExtVoiceTransformTextResultEvent extVoiceTransformTextResultEvent = (ExtVoiceTransformTextResultEvent) iEvent;
        if (extVoiceTransformTextResultEvent == null) {
            return false;
        }
        if (Util.isNullOrNil(extVoiceTransformTextResultEvent.f193580d.f193581a)) {
            Log.m105920e("MicroMsg.VoiceTransformResultClickEventListener", "alvinluo fileName is null");
            return false;
        }
        C76551y jo = C76546u.yx0().mo106785jo(extVoiceTransformTextResultEvent.f193580d.f193581a);
        if (jo == null) {
            Log.m105920e("MicroMsg.VoiceTransformResultClickEventListener", "alvinluo voiceInfo is null");
            return false;
        }
        String str = jo.f224053d;
        extVoiceTransformTextResultEvent.f193580d.getClass();
        extVoiceTransformTextResultEvent.f193580d.getClass();
        extVoiceTransformTextResultEvent.f193580d.getClass();
        C38865e.m41967a(str, 0, 0, 0, extVoiceTransformTextResultEvent.f193580d.f193582b);
        return true;
    }
}
