package com.tencent.p014mm.plugin.game.chatroom.view;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$i */
public class GameChatCommentFooter$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f112495d;

    /* renamed from: e */
    public final /* synthetic */ boolean f112496e;

    /* renamed from: f */
    public final /* synthetic */ GameChatCommentFooter f112497f;

    public GameChatCommentFooter$$i(GameChatCommentFooter gameChatCommentFooter, int i, boolean z) {
        this.f112497f = gameChatCommentFooter;
        this.f112495d = i;
        this.f112496e = z;
    }

    public void run() {
        this.f112497f.setFooterVisibilityImpl(this.f112495d);
        GameChatCommentFooter$$o gameChatCommentFooter$$o = this.f112497f.f112458C;
        if (gameChatCommentFooter$$o != null) {
            gameChatCommentFooter$$o.mo65423d(this.f112496e);
        }
    }
}
