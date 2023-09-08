package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.storage.C72963f4;
import eb0.C75604z3;
import j20.C117292a;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.l3$$a */
public final /* synthetic */ class l3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67391b f217482d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217483e;

    public /* synthetic */ l3$$a(C67391b bVar, C72963f4 f4Var) {
        this.f217482d = bVar;
        this.f217483e = f4Var;
    }

    public final void run() {
        C67391b bVar = this.f217482d;
        C72963f4 f4Var = this.f217483e;
        Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgText$ChattingItemAppMsgTextFrom", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
