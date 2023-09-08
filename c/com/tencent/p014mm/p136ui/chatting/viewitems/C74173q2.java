package com.tencent.p014mm.p136ui.chatting.viewitems;

import a11.C39479c;
import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75604z3;
import ed0.C75610d;
import f40.C86709a0;
import i21.C98591h;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76874e0;
import p740wo.C53193b;
import p763ym.C79138l;
import t22.C77833z;
import zj3.C79344c1;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.q2 */
public class C74173q2 extends C74023i {

    /* renamed from: v */
    public C67391b f217725v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6949t4);
        C74149o2 o2Var = new C74149o2();
        o2Var.mo103203a(n4Var, true);
        n4Var.setTag(o2Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        if (menuItem.getItemId() != 111) {
            return false;
        }
        Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        intent.putExtra("Retr_Msg_Type", 2);
        intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        C67391b bVar2 = bVar;
        C117292a.m165358d(bVar2, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgLocationShare$ChattingItemAppMsgLocationShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        bVar.mo91556Q((Intent) aVar.mo10231a(0));
        C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgLocationShare$ChattingItemAppMsgLocationShareTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        C72695v.m85071m(C75604z3.m90840l(this.f217725v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()));
        C68070l.C68072b u = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f217725v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null);
        C44561j GW = ((C79138l) C86312j.m106911c(C79138l.class)).mo73990GW(u.f195562d, false);
        C88144b.m109788f("favorite");
        if (GW == null || !GW.mo69359k()) {
            int i = u.f195582i;
            if (!(i == 10 || i == 13 || i == 20)) {
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        break;
                }
            }
            e0Var.add(b, 116, 0, (CharSequence) view.getContext().getString(C0966R.string.f361137hk2));
        }
        if (!f4Var.mo100967F3() && f4Var.mo100982U3() && ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217725v) && mo103081O(f4Var.mo108768t()))) {
            e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
        }
        if (!this.f217725v.mo91584y()) {
            e0Var.mo107136c(b, 100, 0, this.f217725v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        String r = bVar.mo91577r();
        boolean z = false;
        boolean z2 = C72996z1.m85820U5(r) && ((C39479c) C86709a0.m107533q(C39479c.class)).mo62086r1(r);
        boolean z3 = C72996z1.m85820U5(r) && !((C53193b) C86312j.m106911c(C53193b.class)).i90(r);
        Log.m105924i("MicroMsg.ChattingItemAppMsgLocationShareTo", "isChatroomDismiss = " + z2 + ", inChatRoom = " + z3);
        if (z2 || z3) {
            z = true;
        }
        if (z) {
            return true;
        }
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        ((C79344c1) bVar.f193278b.mo102812a(C79344c1.class)).mo102273z4(bVar.mo91577r(), "fromMessage", true);
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C74149o2 o2Var = (C74149o2) cVar;
        this.f217725v = bVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u != null) {
            o2Var.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), o2Var, (String) null));
            o2Var.clickArea.setOnClickListener(mo103099u(bVar));
            if (this.f217197d) {
                o2Var.clickArea.setOnLongClickListener(mo103098p(bVar));
                o2Var.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            }
            o2Var.f217663b.setText(u.f195570f);
        }
        if (C75610d.m90859a() != null) {
            if (((C77833z) C75610d.m90859a()).mo107954g(bVar.mo91577r())) {
                o2Var.f217663b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3245kn));
                o2Var.f217664c.setAlpha(1.0f);
                o2Var.clickArea.setClickable(true);
                o2Var.clickArea.setEnabled(true);
                return;
            }
        }
        o2Var.f217663b.setTextColor(bVar.mo91565f().getResources().getColor(C0966R.color.f3244km));
        o2Var.f217664c.setAlpha(0.3f);
        o2Var.clickArea.setClickable(false);
        o2Var.clickArea.setEnabled(false);
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == -1879048186;
    }
}
