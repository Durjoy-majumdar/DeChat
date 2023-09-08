package com.tencent.p014mm.plugin.game.chatroom.view;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$l */
public class GameChatCommentFooter$$l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f112500d;

    /* renamed from: e */
    public final /* synthetic */ GameChatCommentFooter f112501e;

    public GameChatCommentFooter$$l(GameChatCommentFooter gameChatCommentFooter, boolean z) {
        this.f112501e = gameChatCommentFooter;
        this.f112500d = z;
    }

    public void run() {
        if (this.f112500d) {
            GameChatCommentFooter gameChatCommentFooter = this.f112501e;
            int i = GameChatCommentFooter.f112455N;
            gameChatCommentFooter.mo65493g();
        }
    }
}
