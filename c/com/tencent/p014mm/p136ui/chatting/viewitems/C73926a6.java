package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.os.Looper;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.autogen.events.EmojiUpdatePanelEvent;
import com.tencent.p014mm.autogen.events.RefreshSmileyPanelEvent;
import com.tencent.p014mm.p136ui.chatting.ChattingUIFragment;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import jg3.C98942a;
import zj3.C79387w;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.a6 */
public class C73926a6 implements View.OnClickListener {

    /* renamed from: d */
    public C67391b f216990d;

    public C73926a6(C67391b bVar) {
        this.f216990d = bVar;
    }

    public void onClick(View view) {
        Class cls = C79387w.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.EmojiCaptureTipsClickListener", "onClick: ");
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_EMOJI_CAPTURE_PANEL_FROM_TIPS_TIME_LONG, Long.valueOf(System.currentTimeMillis()));
        C115669n.INSTANCE.mo160131h(15982, 24, 0, 0, 0, 0, 0, 0, 0, 0, 0, "", 0, 0);
        EmojiUpdatePanelEvent emojiUpdatePanelEvent = new EmojiUpdatePanelEvent();
        emojiUpdatePanelEvent.f193547d.f193549a = 2;
        emojiUpdatePanelEvent.publish();
        new RefreshSmileyPanelEvent().publish();
        if (!emojiUpdatePanelEvent.f193548e.f193550a) {
            C98942a.f290038b.mo122420a(-29414086, "capture");
            ((C79387w) this.f216990d.f193278b.mo102812a(cls)).mo102193k1().setDefaultSmileyByDetail("capture");
        }
        ((C79387w) this.f216990d.f193278b.mo102812a(cls)).mo102193k1().mo100373R0();
        C67391b bVar = this.f216990d;
        bVar.getClass();
        Log.m105924i("MicroMsg.ChattingContext", "[scrollToLast]0");
        ChattingUIFragment chattingUIFragment = (ChattingUIFragment) bVar.f193287k;
        chattingUIFragment.getClass();
        chattingUIFragment.mo102088p0(false, Looper.myLooper() != Looper.getMainLooper(), true);
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemEmoji$EmojiCaptureTipsClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
