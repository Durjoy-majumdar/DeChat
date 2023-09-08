package com.tencent.p014mm.plugin.game.chatroom.view;

import android.view.View;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.c0 */
public class C41792c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112643d;

    public C41792c0(GameChatCommentFooter gameChatCommentFooter) {
        this.f112643d = gameChatCommentFooter;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f112643d.f112470g.setVisibility(8);
        GameChatCommentFooter$$n gameChatCommentFooter$$n = this.f112643d.f112462G;
        gameChatCommentFooter$$n.f112503a = false;
        gameChatCommentFooter$$n.f112505c = null;
        gameChatCommentFooter$$n.f112504b = false;
        C117292a.m165361g(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
