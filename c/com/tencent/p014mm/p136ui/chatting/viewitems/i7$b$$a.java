package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import j20.C117292a;
import jv1.C76450b;
import k20.C9556a;
import zj3.C79350e1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i7$b$$a */
public final /* synthetic */ class i7$b$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C67391b f217359d;

    /* renamed from: e */
    public final /* synthetic */ C72963f4 f217360e;

    public /* synthetic */ i7$b$$a(C67391b bVar, C72963f4 f4Var) {
        this.f217359d = bVar;
        this.f217360e = f4Var;
    }

    public final void run() {
        C67391b bVar = this.f217359d;
        C72963f4 f4Var = this.f217360e;
        Class cls = C79350e1.class;
        Class cls2 = C76450b.class;
        Activity f = bVar.mo91565f();
        if (!((C76450b) C86312j.m106911c(cls2)).mo60662mb() || !(f instanceof AppCompatActivity)) {
            Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
            String z = ((C79350e1) bVar.f193278b.mo102812a(cls)).mo102315z(f4Var, false);
            if (f4Var.mo100988a4()) {
                intent.putExtra("Retr_Msg_content", z);
                intent.putExtra("Retr_Msg_Type", 6);
            } else {
                intent.putExtra("Retr_Msg_content", z);
                intent.putExtra("Retr_Msg_Type", 4);
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            }
            intent.putExtra("scene_from", 17);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(bVar, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar.mo10231a(0));
            C117292a.m165359e(bVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        String z2 = ((C79350e1) bVar.f193278b.mo102812a(cls)).mo102315z(f4Var, false);
        AppCompatActivity appCompatActivity = (AppCompatActivity) bVar.mo91565f();
        Intent HY = ((C76450b) C86312j.m106911c(cls2)).mo60659HY(appCompatActivity, z2);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(HY);
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        C117292a.m165358d(appCompatActivity2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        appCompatActivity.startActivity((Intent) aVar2.mo10231a(0));
        C117292a.m165359e(appCompatActivity2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$ChattingItemTextTo", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
