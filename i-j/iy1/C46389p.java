package iy1;

import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import gy3.C87412m;

/* renamed from: iy1.p */
public final class C46389p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ PostCommentDialogUI f124986d;

    public C46389p(PostCommentDialogUI postCommentDialogUI) {
        this.f124986d = postCommentDialogUI;
    }

    public final void run() {
        this.f124986d.mo65906L7().setVisibility(8);
        ChatFooterPanel chatFooterPanel = this.f124986d.f113141d;
        if (chatFooterPanel != null) {
            chatFooterPanel.mo100197i();
            ChatFooterPanel chatFooterPanel2 = this.f124986d.f113141d;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setVisibility(0);
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        } else {
            C87412m.m108603p("smileyPanel");
            throw null;
        }
    }
}
