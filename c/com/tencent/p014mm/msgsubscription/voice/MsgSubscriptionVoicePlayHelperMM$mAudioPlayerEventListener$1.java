package com.tencent.p014mm.msgsubscription.voice;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.AudioPlayerEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import nb0.C88913c;
import rx3.C13598b0;
import sx3.C110818d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/msgsubscription/voice/MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/AudioPlayerEvent;", "wxbiz-msgsubscription-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.msgsubscription.voice.MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1 */
public final class MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1 extends IListener<AudioPlayerEvent> {
    public MsgSubscriptionVoicePlayHelperMM$mAudioPlayerEventListener$1(C40008f fVar) {
        super(fVar);
    }

    public boolean callback(IEvent iEvent) {
        AudioPlayerEvent audioPlayerEvent = (AudioPlayerEvent) iEvent;
        C87412m.m108594g(audioPlayerEvent, "event");
        int i = audioPlayerEvent.f48073d.f48074a;
        if (i != 2 && i != 4 && i != 5) {
            return false;
        }
        synchronized (MsgSubscriptionVoicePlayHelperMM.f238029d) {
            Long l = (Long) ((LinkedHashMap) MsgSubscriptionVoicePlayHelperMM.f238028c).get(audioPlayerEvent.f48073d.f48076c);
            C88913c.m111004b(audioPlayerEvent.f48073d.f48076c);
            if (l != null) {
                MsgSubscriptionVoicePlayHelperMM.f238027b.remove(l);
            }
            Log.m105924i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] action[" + audioPlayerEvent.f48073d.f48074a + "]  id[" + l + ']');
            LinkedHashMap<Long, String> linkedHashMap = MsgSubscriptionVoicePlayHelperMM.f238027b;
            if (linkedHashMap.entrySet().size() > 0) {
                Log.m105924i("MicroMsg.MsgSubscriptionVoicePlayer", "[player event] play next audio, waiting to play size[" + linkedHashMap.size() + ']');
                Set<Map.Entry<Long, String>> entrySet = linkedHashMap.entrySet();
                C87412m.m108593f(entrySet, "urlsToPlay.entries");
                Object K = C110818d0.m150913K(entrySet);
                C87412m.m108593f(K, "urlsToPlay.entries.first()");
                Map.Entry entry = (Map.Entry) K;
                MsgSubscriptionVoicePlayHelperMM msgSubscriptionVoicePlayHelperMM = MsgSubscriptionVoicePlayHelperMM.f238026a;
                Object value = entry.getValue();
                C87412m.m108593f(value, "first.value");
                Object key = entry.getKey();
                C87412m.m108593f(key, "first.key");
                msgSubscriptionVoicePlayHelperMM.mo112915a((String) value, ((Number) key).longValue());
            } else {
                int i2 = MsgSubscriptionVoicePlayHelperMM.f238030e;
                if (i2 != -1) {
                    MsgSubscriptionVoicePlayHelperMM.f238031f.setStreamVolume(3, i2, 4);
                    MsgSubscriptionVoicePlayHelperMM.f238030e = -1;
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return false;
    }
}
