package p738wg;

import com.tencent.p014mm.autogen.events.ExtVoiceMsgIdToFileNameEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import kd0.C76546u;
import kd0.C76551y;

/* renamed from: wg.n */
public class C102439n extends IStaticListener<ExtVoiceMsgIdToFileNameEvent> {
    public boolean callback(IEvent iEvent) {
        ExtVoiceMsgIdToFileNameEvent extVoiceMsgIdToFileNameEvent = (ExtVoiceMsgIdToFileNameEvent) iEvent;
        if (C76546u.yx0() == null) {
            Log.m105920e("MicroMsg.ExtVoiceMsgIdToFileName", "SubCoreVoice.getVoiceStg()" + Util.getStack());
            extVoiceMsgIdToFileNameEvent.f264802e.f264804a = "";
        }
        C76551y qq = C76546u.yx0().mo106786qq((int) extVoiceMsgIdToFileNameEvent.f264801d.f264803a);
        if (qq == null) {
            extVoiceMsgIdToFileNameEvent.f264802e.f264804a = "";
            return true;
        }
        extVoiceMsgIdToFileNameEvent.f264802e.f264804a = qq.f224051b;
        return true;
    }
}
