package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.g0 */
public class C41797g0 implements C72837v1 {

    /* renamed from: a */
    public final /* synthetic */ GameChatCommentFooter f112648a;

    public C41797g0(GameChatCommentFooter gameChatCommentFooter) {
        this.f112648a = gameChatCommentFooter;
    }

    /* renamed from: X1 */
    public void mo65586X1(IEmojiInfo iEmojiInfo) {
        GameChatCommentFooter$$o gameChatCommentFooter$$o = this.f112648a.f112458C;
        if (gameChatCommentFooter$$o != null) {
            gameChatCommentFooter$$o.mo65421b(iEmojiInfo);
        }
    }

    /* renamed from: a */
    public void mo65587a() {
    }

    /* renamed from: b */
    public void mo65588b(boolean z, int i) {
        this.f112648a.f112465J = z;
    }
}
