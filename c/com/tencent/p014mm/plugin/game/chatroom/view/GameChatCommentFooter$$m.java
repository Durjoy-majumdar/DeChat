package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72806l1;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.GameChatCommentFooter$$m */
public class GameChatCommentFooter$$m implements C72806l1.C44611a {

    /* renamed from: a */
    public final /* synthetic */ GameChatCommentFooter f112502a;

    public GameChatCommentFooter$$m(GameChatCommentFooter gameChatCommentFooter) {
        this.f112502a = gameChatCommentFooter;
    }

    public void clear() {
        GameChatCommentFooter gameChatCommentFooter = this.f112502a;
        MMEditText mMEditText = gameChatCommentFooter.f112473j;
        if (mMEditText != null) {
            mMEditText.setText("");
            ChatFooterPanel chatFooterPanel = gameChatCommentFooter.f112478r;
            if (chatFooterPanel != null) {
                chatFooterPanel.setToSendText("");
            }
        }
    }
}
