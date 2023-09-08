package com.tencent.p014mm.plugin.game.chatroom.view;

import qo3.C101218e0;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$b */
public final /* synthetic */ class GameChatCommentFooter$$b implements C101218e0.C77394n {

    /* renamed from: a */
    public final /* synthetic */ GameChatCommentFooter f112488a;

    public /* synthetic */ GameChatCommentFooter$$b(GameChatCommentFooter gameChatCommentFooter) {
        this.f112488a = gameChatCommentFooter;
    }

    public final void dismiss() {
        GameChatCommentFooter gameChatCommentFooter = this.f112488a;
        int i = GameChatCommentFooter.f112455N;
        gameChatCommentFooter.getClass();
        gameChatCommentFooter.postDelayed(new GameChatCommentFooter$$c(gameChatCommentFooter), 200);
    }
}
