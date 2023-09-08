package com.tencent.p014mm.plugin.game.chatroom.view;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.b0 */
public class C41791b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f112641d;

    /* renamed from: e */
    public final /* synthetic */ GameChatCommentFooter f112642e;

    public C41791b0(GameChatCommentFooter gameChatCommentFooter, boolean z) {
        this.f112642e = gameChatCommentFooter;
        this.f112641d = z;
    }

    public void run() {
        if (this.f112641d) {
            GameChatCommentFooter gameChatCommentFooter = this.f112642e;
            int i = GameChatCommentFooter.f112455N;
            gameChatCommentFooter.mo65498k();
            return;
        }
        this.f112642e.f112478r.setVisibility(0);
    }
}
