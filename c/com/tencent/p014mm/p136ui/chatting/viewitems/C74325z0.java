package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GiftCardEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.transmit.MsgRetransmitUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import di3.C86312j;
import eb0.C75604z3;
import gz0.C76094i;
import i21.C98591h;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76874e0;
import p763ym.C79139p;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.z0 */
public class C74325z0 extends C74023i {

    /* renamed from: v */
    public C67391b f218335v;

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6956tb);
        C74294x0 x0Var = new C74294x0();
        x0Var.mo103283a(n4Var, false);
        n4Var.setTag(x0Var);
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        C68070l.C68072b u;
        int itemId = menuItem.getItemId();
        if (itemId == 103) {
            String content = f4Var.getContent();
            if (!(content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null || u.f195582i != 16)) {
                GiftCardEvent giftCardEvent = new GiftCardEvent();
                GiftCardEvent.C67716a aVar = giftCardEvent.f193670d;
                aVar.f193671a = u.f195522Q0;
                aVar.f193672b = f4Var.getMsgId();
                giftCardEvent.f193670d.f193673c = f4Var.mo108768t();
                giftCardEvent.publish();
            }
        } else if (itemId == 111) {
            String l = C75604z3.m90840l(bVar.mo91583x(), f4Var.getContent(), f4Var.mo108769t2());
            Intent intent = new Intent(bVar.mo91565f(), MsgRetransmitUI.class);
            intent.putExtra("Retr_Msg_content", l);
            C68070l.C68072b u2 = C68070l.C68072b.m80422u(l, (String) null);
            if (u2 == null || 16 != u2.f195582i) {
                intent.putExtra("Retr_Msg_Type", 2);
            } else {
                intent.putExtra("Retr_Msg_Type", 14);
            }
            intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            C67391b bVar2 = bVar;
            C117292a.m165358d(bVar2, aVar2.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            bVar.mo91556Q((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(bVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgCouponCard$ChattingItemAppMsgCouponCardTo", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return false;
        }
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C68070l.C68072b u;
        int b = ((C74243t8) view.getTag()).mo103252b();
        if (f4Var.getContent() == null || (u = C68070l.C68072b.m80422u(C75604z3.m90840l(this.f218335v.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null)) == null) {
            return true;
        }
        int i = u.f195582i;
        if (i == 16) {
            int i2 = u.f195531T0;
            if (i2 == 5 || i2 == 6 || i2 == 2) {
                if (i2 != 2) {
                    e0Var.clear();
                }
                C76874e0 e0Var2 = e0Var;
                int i3 = b;
                e0Var2.mo107136c(i3, 100, 0, this.f218335v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                e0Var2.mo107136c(i3, 122, 0, this.f218335v.mo91565f().getString(C0966R.string.b_5), C0966R.raw.icons_filled_multiple_choice);
                return false;
            }
        } else if (i == 34) {
            e0Var.clear();
            e0Var.mo107136c(b, 100, 0, this.f218335v.mo91572m().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
            return false;
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        String content = f4Var.getContent();
        if (content == null) {
            return false;
        }
        String str = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
        if (u == null) {
            return false;
        }
        int i = u.f195582i;
        if (i == 16) {
            C67391b bVar2 = bVar;
            if (Util.isNullOrNil(u.f195522Q0)) {
                return false;
            }
            Intent intent = new Intent();
            intent.setFlags(65536);
            intent.putExtra("key_card_app_msg", u.f195522Q0);
            intent.putExtra("key_from_scene", u.f195531T0);
            C88144b.m109791i(bVar.mo91565f(), "card", ".ui.CardDetailUI", intent, (Bundle) null);
            return true;
        } else if (i != 34) {
            return false;
        } else {
            C76094i a = C76094i.m91423a(u);
            if (1 < a.f223005c) {
                String K3 = ((C79139p) C86312j.m106911c(C79139p.class)).mo108862K3(u.f195590k, StateEvent.Name.MESSAGE);
                PackageInfo w = mo103101w(bVar.mo91565f(), u.f195562d);
                if (w != null) {
                    str = w.versionName;
                }
                mo103070B(bVar, K3, K3, str, w == null ? 0 : w.versionCode, u.f195562d, true, f4Var.getMsgId(), f4Var.mo108774y2(), f4Var, u);
            } else {
                Intent intent2 = new Intent();
                intent2.putExtra("key_from_user_name", mo103068y(bVar, f4Var));
                intent2.putExtra("key_biz_uin", a.f223003a);
                intent2.putExtra("key_order_id", a.f223004b);
                if (f4Var.mo108768t() != null && !f4Var.mo108768t().equals("") && C72996z1.m85820U5(f4Var.mo108768t())) {
                    intent2.putExtra("key_chatroom_name", f4Var.mo108768t());
                }
                C88144b.m109791i(bVar.mo91565f(), "card", ".ui.CardGiftAcceptUI", intent2, (Bundle) null);
            }
            return true;
        }
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        this.f218335v = bVar;
        C74294x0 x0Var = (C74294x0) cVar;
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (!(x0Var == null || u == null)) {
            x0Var.mo103284b(bVar.mo91565f(), u, f4Var.mo108765s2(), this.f217197d);
        }
        cVar.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), cVar, (String) null));
        cVar.clickArea.setOnClickListener(mo103099u(bVar));
        if (this.f217197d) {
            cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
            cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
        }
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        if (z) {
            return i == 452984881 || i == 520093745;
        }
        return false;
    }
}
