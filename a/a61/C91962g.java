package a61;

import com.tencent.p014mm.autogen.events.EmojiConfigEvent;
import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.smiley.C96926b0;
import com.tencent.p014mm.smiley.C96945j0;

/* renamed from: a61.g */
public class C91962g extends IStaticListener<EmojiConfigEvent> {
    public boolean callback(IEvent iEvent) {
        int i = ((EmojiConfigEvent) iEvent).f264694d.f264695a;
        if (i == 1) {
            C96945j0.m124519b().mo135536h();
            C96926b0.m124490b().mo135520e();
            new RefreshSmileyPanelEvent().publish();
            return false;
        } else if (i != 2) {
            Log.m105924i("MicroMsg.emoji.EmojiEvent", "unknown event.");
            return false;
        } else {
            C96926b0.m124490b().mo135520e();
            new RefreshSmileyPanelEvent().publish();
            return false;
        }
    }
}
