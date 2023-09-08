package com.tencent.p014mm.plugin.emoji.p040ui.p319v3;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.EmotionStateChangeEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/EmotionStateChangeEvent;", "plugin-emoji_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1 */
public final class EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1 extends IListener<EmotionStateChangeEvent> {

    /* renamed from: d */
    public final /* synthetic */ EmojiStoreV3HomeBaseFragment f269017d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3HomeBaseFragment$emotionStateChangeListener$1(EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment, C40008f fVar) {
        super(fVar);
        this.f269017d = emojiStoreV3HomeBaseFragment;
    }

    public boolean callback(IEvent iEvent) {
        EmotionStateChangeEvent emotionStateChangeEvent = (EmotionStateChangeEvent) iEvent;
        C87412m.m108594g(emotionStateChangeEvent, "event");
        try {
            EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f269017d;
            EmotionStateChangeEvent.C92476a aVar = emotionStateChangeEvent.f264696d;
            EmojiStoreV3HomeBaseFragment.m117739K(emojiStoreV3HomeBaseFragment, aVar.f264697a, aVar.f264698b, aVar.f264699c, aVar.f264700d);
            return false;
        } catch (NullPointerException unused) {
            Log.m105924i(this.f269017d.f268992d, "emotionStateChange callback failed, event null");
            return false;
        }
    }
}
