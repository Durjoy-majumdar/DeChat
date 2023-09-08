package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$a$$e$$a */
public final /* synthetic */ class i7$a$$e$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ i7$a$$e f217335d;

    /* renamed from: e */
    public final /* synthetic */ Context f217336e;

    /* renamed from: f */
    public final /* synthetic */ C74243t8 f217337f;

    public /* synthetic */ i7$a$$e$$a(i7$a$$e i7_a__e, Context context, C74243t8 t8Var) {
        this.f217335d = i7_a__e;
        this.f217336e = context;
        this.f217337f = t8Var;
    }

    public final void run() {
        i7$a$$e i7_a__e = this.f217335d;
        Context context = this.f217336e;
        C74243t8 t8Var = this.f217337f;
        i7_a__e.getClass();
        Intent intent = new Intent(context, MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_Id", t8Var.f212238a.getMsgId());
        intent.putExtra("Retr_Msg_content", i7_a__e.f217355h.f217304x);
        intent.putExtra("Retr_Msg_Type", 4);
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextFrom$4", "lambda$onMMMenuItemSelected$0", "(Landroid/content/Context;Lcom/tencent/mm/ui/chatting/viewitems/ItemDataTag;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
