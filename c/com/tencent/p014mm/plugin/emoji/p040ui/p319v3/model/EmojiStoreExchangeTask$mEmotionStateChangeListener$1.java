package com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.plugin.emoji.p040ui.p319v3.model.EmojiStoreExchangeTask;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/emoji/ui/v3/model/EmojiStoreExchangeTask$mEmotionStateChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/EmotionStateChangeEvent;", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.model.EmojiStoreExchangeTask$mEmotionStateChangeListener$1 */
public final class EmojiStoreExchangeTask$mEmotionStateChangeListener$1 extends IListener<EmotionStateChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreExchangeTask f269089d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreExchangeTask$mEmotionStateChangeListener$1(EmojiStoreExchangeTask emojiStoreExchangeTask, C40008f fVar) {
        super(fVar);
        this.f269089d = emojiStoreExchangeTask;
    }

    public boolean callback(IEvent iEvent) {
        EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
        C87412m.m108594g(emotionStateChangeEvent, "event");
        if (!C87412m.m108589b(emotionStateChangeEvent.f264696d.f264697a, this.f269089d.f269080d)) {
            return false;
        }
        String str = this.f269089d.f269086j;
        Log.m105924i(str, "callback: productId:" + emotionStateChangeEvent.f264696d.f264697a + " status:" + emotionStateChangeEvent.f264696d.f264698b + " progress:" + emotionStateChangeEvent.f264696d.f264699c);
        EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
        int i = aVar.f264698b;
        if (i == 6) {
            EmojiStoreExchangeTask.C93271a aVar2 = this.f269089d.f269085i;
            if (aVar2 == null) {
                return false;
            }
            aVar2.mo127925b(aVar.f264699c);
            return false;
        }
        EmojiStoreExchangeTask.C93271a aVar3 = this.f269089d.f269085i;
        if (aVar3 == null) {
            return false;
        }
        aVar3.mo127924a(i);
        return false;
    }
}
