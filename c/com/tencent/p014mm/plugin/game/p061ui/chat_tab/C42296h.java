package com.tencent.p014mm.plugin.game.p061ui.chat_tab;

import android.database.Cursor;
import com.tencent.p014mm.plugin.game.model.C42040b0;
import com.tencent.p014mm.plugin.game.model.C42119w;
import com.tencent.p014mm.plugin.game.p061ui.message.C42355l;
import com.tencent.p014mm.plugin.game.p061ui.message.C42364r;
import com.tencent.p014mm.plugin.game.p061ui.message.InteractiveMsgMRecycleView;
import di3.C86312j;
import gy3.C87412m;
import java.util.LinkedList;
import sw1.C48484q;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.h */
public final class C42296h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ GameMsgNoticeFragment f114373d;

    public C42296h(GameMsgNoticeFragment gameMsgNoticeFragment) {
        this.f114373d = gameMsgNoticeFragment;
    }

    public final void run() {
        C42040b0 xi02 = ((C48484q) C86312j.m106911c(C48484q.class)).xi0();
        GameMsgNoticeFragment gameMsgNoticeFragment = this.f114373d;
        Cursor bF = xi02.mo66005bF(1, gameMsgNoticeFragment.f114250o, gameMsgNoticeFragment.f114251p);
        if (bF != null && bF.getCount() != 0) {
            InteractiveMsgMRecycleView interactiveMsgMRecycleView = this.f114373d.f114246h;
            if (interactiveMsgMRecycleView != null) {
                InteractiveMsgMRecycleView.C42326c cVar = interactiveMsgMRecycleView.getmAdapter();
                C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.ui.message.InteractiveMsgMRecycleView.InteractiveMsgAdapter");
                LinkedList linkedList = new LinkedList();
                if (bF.moveToFirst()) {
                    do {
                        C42119w wVar = new C42119w();
                        wVar.convertFrom(bF);
                        String str = wVar.field_quickResponseContentId;
                        C87412m.m108593f(str, "msg.field_quickResponseContentId");
                        if (str.length() > 0) {
                            InteractiveMsgMRecycleView interactiveMsgMRecycleView2 = this.f114373d.f114246h;
                            if (interactiveMsgMRecycleView2 == null) {
                                C87412m.m108603p("gameInteractiveMsgView");
                                throw null;
                            } else if (!interactiveMsgMRecycleView2.getQuickReplyList().contains(wVar.field_quickResponseContentId)) {
                                InteractiveMsgMRecycleView interactiveMsgMRecycleView3 = this.f114373d.f114246h;
                                if (interactiveMsgMRecycleView3 != null) {
                                    interactiveMsgMRecycleView3.getQuickReplyList().add(wVar.field_quickResponseContentId);
                                } else {
                                    C87412m.m108603p("gameInteractiveMsgView");
                                    throw null;
                                }
                            }
                        }
                        linkedList.add(wVar);
                    } while (bF.moveToNext());
                }
                bF.close();
                ((C119157j) C119157j.f356862d).mo183895z(new C42364r(cVar, linkedList));
                InteractiveMsgMRecycleView interactiveMsgMRecycleView4 = this.f114373d.f114246h;
                if (interactiveMsgMRecycleView4 != null) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C42355l(interactiveMsgMRecycleView4));
                    GameMsgNoticeFragment gameMsgNoticeFragment2 = this.f114373d;
                    gameMsgNoticeFragment2.f114250o += gameMsgNoticeFragment2.f114251p;
                    return;
                }
                C87412m.m108603p("gameInteractiveMsgView");
                throw null;
            }
            C87412m.m108603p("gameInteractiveMsgView");
            throw null;
        }
    }
}
