package com.tencent.p014mm.plugin.game.chatroom.view;

import android.animation.ValueAnimator;
import android.widget.TextView;
import com.tencent.p014mm.plugin.game.chatroom.view.ChatMemberListView;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.i */
public class C41801i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ChatMemberListView.C41737c.C41738a f112654d;

    public C41801i(ChatMemberListView.C41737c.C41738a aVar) {
        this.f112654d = aVar;
    }

    public void run() {
        ChatMemberListView.C41737c.C41738a aVar = this.f112654d;
        ChatMemberListView.C41737c cVar = ChatMemberListView.C41737c.this;
        TextView textView = aVar.f112347F;
        String str = aVar.f112350I.username;
        cVar.getClass();
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[]{textView.getWidth(), 0});
        valueAnimator.addUpdateListener(new C41796g(cVar, textView));
        valueAnimator.setDuration(350);
        valueAnimator.addListener(new C41798h(cVar, textView, str));
        valueAnimator.start();
        if (this.f112654d.f112347F.getTag() instanceof ChatMemberListView.C41741e) {
            ChatMemberListView.C41741e eVar = (ChatMemberListView.C41741e) this.f112654d.f112347F.getTag();
            if (Util.nullAsNil(eVar.f112358a).equals(this.f112654d.f112350I.username)) {
                eVar.f112360c = valueAnimator;
                this.f112654d.f112347F.setTag(eVar);
            }
        }
    }
}
