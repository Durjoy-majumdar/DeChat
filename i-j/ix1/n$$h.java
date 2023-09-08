package ix1;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import uo3.C78253a;

public class n$$h extends C78253a {

    /* renamed from: R */
    public final /* synthetic */ View f124889R;

    /* renamed from: S */
    public final /* synthetic */ C46337n f124890S;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n$$h(C46337n nVar, Context context, View view) {
        super(context);
        this.f124890S = nVar;
        this.f124889R = view;
    }

    /* renamed from: n */
    public boolean mo71743n(int i, int i2) {
        if (this.f124890S.mo71734I() || this.f124890S.mo71725D()) {
            return false;
        }
        C46337n nVar = this.f124890S;
        ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
        if (chatroomMsgPack != null) {
            C40308d.f108375a.mo62997g(1, 27, nVar.f124840F, nVar.f124839E, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar.f124874e1);
        }
        if (this.f124889R.getParent() != null) {
            this.f124889R.getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.mo71743n(i, i2);
    }

    public void onDismiss() {
        if (this.f124889R.getParent() != null) {
            this.f124889R.getParent().requestDisallowInterceptTouchEvent(false);
        }
        super.onDismiss();
    }
}
