package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74038i2;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i2$c$d$$a */
public final /* synthetic */ class i2$c$d$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74038i2.C74041c.C74045d f217300d;

    /* renamed from: e */
    public final /* synthetic */ Context f217301e;

    public /* synthetic */ i2$c$d$$a(C74038i2.C74041c.C74045d dVar, Context context) {
        this.f217300d = dVar;
        this.f217301e = context;
    }

    public final void run() {
        C74038i2.C74041c.C74045d dVar = this.f217300d;
        Context context = this.f217301e;
        dVar.getClass();
        Intent intent = new Intent(context, MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C74038i2.C74041c.this.f217265w);
        intent.putExtra("Retr_Msg_Type", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgGroupSolitatire$ChattingItemAppMsgGroupSolitatireFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
