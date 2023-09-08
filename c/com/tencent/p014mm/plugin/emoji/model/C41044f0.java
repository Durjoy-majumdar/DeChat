package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.autogen.events.WearDownloadEmojiEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.emoji.model.f0 */
public final class C41044f0 extends IStaticListener<WearDownloadEmojiEvent> {
    public boolean callback(IEvent iEvent) {
        WearDownloadEmojiEvent wearDownloadEmojiEvent = (WearDownloadEmojiEvent) iEvent;
        C87412m.m108594g(wearDownloadEmojiEvent, "event");
        if (wearDownloadEmojiEvent.f107823d.f107824a != 1) {
            return false;
        }
        Set<String> set = C41048h0.f110524a;
        C87412m.m108591d(set);
        ArrayList<String> stringsToList = Util.stringsToList(wearDownloadEmojiEvent.f107823d.f107825b);
        C87412m.m108593f(stringsToList, "stringsToList(emojiEvent.data.emojiProductLists)");
        set.addAll(stringsToList);
        Set<String> set2 = C41048h0.f110525b;
        C87412m.m108591d(set2);
        set2.addAll(set);
        C41048h0.m44497a();
        return false;
    }
}
