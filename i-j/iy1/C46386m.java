package iy1;

import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.game.luggage.p801ui.circle.PostCommentDialogUI;
import com.tencent.p014mm.pluginsdk.p133ui.ChatFooterPanel;
import com.tencent.p014mm.pluginsdk.p133ui.chat.C72837v1;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: iy1.m */
public final class C46386m implements C72837v1 {

    /* renamed from: a */
    public final /* synthetic */ PostCommentDialogUI f124982a;

    public C46386m(PostCommentDialogUI postCommentDialogUI) {
        this.f124982a = postCommentDialogUI;
    }

    /* renamed from: X1 */
    public void mo65586X1(IEmojiInfo iEmojiInfo) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSendCustomEmoji emoji = ");
        sb.append(iEmojiInfo != null ? iEmojiInfo.getContent() : null);
        Log.m105924i("MicroMsg.PostCommentDialogUI", sb.toString());
        if (iEmojiInfo != null) {
            PostCommentDialogUI postCommentDialogUI = this.f124982a;
            String str = postCommentDialogUI.f113155u;
            if (str == null || str.length() == 0) {
                postCommentDialogUI.mo65912R7(iEmojiInfo);
            } else {
                postCommentDialogUI.mo65911Q7(iEmojiInfo);
            }
        }
    }

    /* renamed from: a */
    public void mo65587a() {
    }

    /* renamed from: b */
    public void mo65588b(boolean z, int i) {
        Log.m105924i("MicroMsg.PostCommentDialogUI", "onSearchDialogShow isShow = " + z);
        if (z) {
            ChatFooterPanel chatFooterPanel = this.f124982a.f113141d;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(8);
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        } else {
            ChatFooterPanel chatFooterPanel2 = this.f124982a.f113141d;
            if (chatFooterPanel2 != null) {
                chatFooterPanel2.setVisibility(0);
            } else {
                C87412m.m108603p("smileyPanel");
                throw null;
            }
        }
    }
}
