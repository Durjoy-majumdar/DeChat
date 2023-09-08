package a61;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.EmojiRewardTipsEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import p441aq.C92054g;
import p910lj.C76701a;

/* renamed from: a61.v */
public class C27797v extends IStaticListener<EmojiRewardTipsEvent> {
    public boolean callback(IEvent iEvent) {
        EmojiRewardTipsEvent emojiRewardTipsEvent = (EmojiRewardTipsEvent) iEvent;
        if (emojiRewardTipsEvent != null) {
            boolean z = emojiRewardTipsEvent.f78776d.f78777a;
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_REWARD_TIP_ENABLE_BOOLEAN, Boolean.valueOf(z));
            ((C92054g) C86312j.m106911c(C92054g.class)).yx0().f90112b = z;
            if (!z) {
                C115669n.INSTANCE.mo160131h(12953, 2, "");
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.c5d, 0).show();
            } else {
                C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.c5f, 0).show();
            }
        }
        return false;
    }
}
