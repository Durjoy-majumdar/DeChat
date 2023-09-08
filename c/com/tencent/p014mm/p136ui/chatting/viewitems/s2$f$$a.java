package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74202s2;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.s2$f$$a */
public final /* synthetic */ class s2$f$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C74202s2.C74209f f217856d;

    /* renamed from: e */
    public final /* synthetic */ Context f217857e;

    public /* synthetic */ s2$f$$a(C74202s2.C74209f fVar, Context context) {
        this.f217856d = fVar;
        this.f217857e = context;
    }

    public final void run() {
        C74202s2.C74209f fVar = this.f217856d;
        Context context = this.f217857e;
        fVar.getClass();
        Intent intent = new Intent(context, MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C74202s2.this.f217824w);
        intent.putExtra("Retr_Msg_Type", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgMsgQuote$ChattingItemAppMsgMsgQuoteFrom$6", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
