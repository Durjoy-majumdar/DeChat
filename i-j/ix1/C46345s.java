package ix1;

import android.view.MenuItem;
import bx1.C39847a;
import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ChatroomMsgPack;
import f40.C86709a0;
import nj3.C11184p0;

/* renamed from: ix1.s */
public class C46345s implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ long f124905d;

    /* renamed from: e */
    public final /* synthetic */ C46337n f124906e;

    public C46345s(C46337n nVar, long j) {
        this.f124906e = nVar;
        this.f124905d = j;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 9530) {
            C86709a0.m107524d().mo123460f(new C39847a(this.f124906e.f124869Z0, this.f124905d));
            C46337n nVar = this.f124906e;
            ChatroomMsgPack chatroomMsgPack = nVar.f124841G;
            if (chatroomMsgPack != null) {
                C40308d.f108375a.mo62997g(10, 2, nVar.f124840F, nVar.f124839E, chatroomMsgPack.seq, chatroomMsgPack.from_username, 0, nVar.f124874e1);
            }
        }
    }
}
