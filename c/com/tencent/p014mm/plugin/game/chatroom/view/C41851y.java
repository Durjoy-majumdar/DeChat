package com.tencent.p014mm.plugin.game.chatroom.view;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C45078p0;
import qn3.C77382c;

/* renamed from: com.tencent.mm.plugin.game.chatroom.view.y */
public class C41851y implements C77382c.C77383a {

    /* renamed from: d */
    public final /* synthetic */ GameChatCommentFooter f112795d;

    public C41851y(GameChatCommentFooter gameChatCommentFooter) {
        this.f112795d = gameChatCommentFooter;
    }

    /* renamed from: L0 */
    public void mo4083L0(String str) {
        this.f112795d.f112474n.setText(C45078p0.m49923b(1000, str));
        GameChatCommentFooter gameChatCommentFooter = this.f112795d;
        gameChatCommentFooter.f112474n.setTextColor(gameChatCommentFooter.getResources().getColor(C0966R.color.f2966ao));
        this.f112795d.f112474n.setVisibility(0);
    }

    /* renamed from: L3 */
    public void mo4084L3(String str) {
        this.f112795d.f112474n.setVisibility(8);
    }

    /* renamed from: P4 */
    public void mo4086P4(String str) {
        int b = C45078p0.m49923b(1000, str);
        if (b > 5) {
            this.f112795d.f112474n.setVisibility(8);
            return;
        }
        this.f112795d.f112474n.setText(String.valueOf(b));
        GameChatCommentFooter gameChatCommentFooter = this.f112795d;
        gameChatCommentFooter.f112474n.setTextColor(gameChatCommentFooter.getResources().getColor(C0966R.color.BW_100_Alpha_0_5));
        this.f112795d.f112474n.setVisibility(0);
    }
}
