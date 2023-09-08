package ix1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import com.tencent.p014mm.plugin.game.autogen.chatroom.MsgContent;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import di3.C86312j;
import nj3.C76874e0;
import nj3.C76879j;
import p629ny.C76979h;

/* renamed from: ix1.k */
public class C46330k extends C46337n {

    /* renamed from: g1 */
    public MMNeat7extView f124823g1;

    public C46330k(View view, int i) {
        super(view, i);
    }

    /* renamed from: B */
    public void mo71705B(ChatroomMsgPack chatroomMsgPack) {
        MsgContent msgContent;
        if (chatroomMsgPack != null && (msgContent = chatroomMsgPack.msg_content) != null && msgContent.chatroom_text != null) {
            this.f124823g1.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f124838D, chatroomMsgPack.msg_content.chatroom_text.content));
        }
    }

    /* renamed from: F */
    public View mo71706F(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(this.f124838D).inflate(C0966R.C0971layout.avb, (ViewGroup) null);
        this.f124823g1 = (MMNeat7extView) inflate.findViewById(C0966R.C0970id.eic);
        return inflate;
    }

    /* renamed from: J */
    public void mo71726J(C76874e0 e0Var) {
        int u = e0Var.mo107175u(9531);
        int u2 = e0Var.mo107175u(9532);
        if (e0Var.findItem(1001) != null) {
            return;
        }
        if (u >= 0) {
            e0Var.mo107141e(1001, u + 1, this.f124838D.getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy, 0, false);
        } else if (u2 >= 0) {
            e0Var.mo107141e(1001, u2 + 1, this.f124838D.getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy, 0, false);
        } else {
            e0Var.mo107141e(1001, 0, this.f124838D.getString(C0966R.string.f7936wt), C0966R.raw.icons_filled_copy, 0, false);
        }
    }

    /* renamed from: L */
    public void mo71727L(int i) {
        if (i == 1001) {
            ClipboardHelper.setText(this.f124823g1.mo154968a());
            Context context = this.f124838D;
            C76879j.m92729W(context, context.getString(C0966R.string.f7938wv));
        }
    }
}
