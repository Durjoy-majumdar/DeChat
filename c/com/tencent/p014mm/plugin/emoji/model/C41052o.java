package com.tencent.p014mm.plugin.emoji.model;

import com.tencent.p014mm.autogen.events.EmojiSyncTaskEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30790w2;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import j61.C46445t;
import java.util.Set;
import p441aq.C92054g;

/* renamed from: com.tencent.mm.plugin.emoji.model.o */
public final class C41052o extends IStaticListener<EmojiSyncTaskEvent> {
    public boolean callback(IEvent iEvent) {
        EmojiSyncTaskEvent emojiSyncTaskEvent = (EmojiSyncTaskEvent) iEvent;
        C87412m.m108594g(emojiSyncTaskEvent, "event");
        Set<String> set = C41048h0.f110524a;
        C87412m.m108591d(set);
        if (set.contains(emojiSyncTaskEvent.f107420d.f107422b)) {
            Set<String> set2 = C41048h0.f110526c;
            C87412m.m108591d(set2);
            set2.remove(emojiSyncTaskEvent.f107420d.f107422b);
            EmojiSyncTaskEvent.C40056a aVar = emojiSyncTaskEvent.f107420d;
            if (aVar.f107423c) {
                Log.m105925i("MicroMsg.emoji.WearEmojiLogic", "emoji downloaded %s success", aVar.f107422b);
                ((C92054g) C86312j.m106911c(C92054g.class)).getClass();
                C30790w2.m39221h().mo57715b().mo142021Ow(emojiSyncTaskEvent.f107420d.f107422b);
                C86709a0.m107529k().f251779b.mo123460f(new C46445t(emojiSyncTaskEvent.f107420d.f107422b, 2));
            } else {
                Log.m105925i("MicroMsg.emoji.WearEmojiLogic", "emoji downloaded %s fail", aVar.f107422b);
            }
            C41048h0.m44497a();
        }
        return false;
    }
}
