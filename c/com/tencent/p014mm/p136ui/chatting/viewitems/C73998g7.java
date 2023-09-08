package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.TextPreviewUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import d62.C7240a;
import j20.C117292a;
import k20.C9556a;
import nj3.C88990b;
import wd3.C53155r0;
import zj3.C79350e1;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.g7 */
public class C73998g7 extends C7240a {

    /* renamed from: e */
    public final /* synthetic */ C67391b f217122e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73998g7(int i, C53155r0 r0Var, C67391b bVar) {
        super(i, r0Var);
        this.f217122e = bVar;
    }

    /* renamed from: a */
    public void mo1118a(View view) {
        Intent intent = new Intent(view.getContext(), TextPreviewUI.class);
        intent.addFlags(67108864);
        ChattingItemTranslate.C73916c cVar = (ChattingItemTranslate.C73916c) view.getTag();
        if (cVar != null) {
            intent.putExtra("Chat_Msg_Id", cVar.f212238a.getMsgId());
            intent.putExtra("key_chat_text", ((C79350e1) this.f217122e.f193278b.mo102812a(C79350e1.class)).mo102315z(cVar.f212238a, false));
            C74059i7.m88000e(cVar.f212238a, 1, 0);
        }
        intent.putExtra("is_group_chat", this.f217122e.mo91583x());
        Context context = view.getContext();
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        Context context2 = context;
        C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(context2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemText$1", "onClickImp", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C88990b.m111199h(view.getContext());
    }
}
