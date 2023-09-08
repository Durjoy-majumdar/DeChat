package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.content.Intent;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import bl3.C39818r;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72963f4;
import di3.C86312j;
import ht1.C60150a;
import ht1.C60200t1;
import i21.C98591h;
import nj3.C76874e0;
import o40.C61926c;
import p185kq.C10383h;
import p565ir.C60606n;
import p629ny.C76979h;
import pl1.C11978e0;
import pl1.C11990s0;
import pl1.C62368t0;
import t91.C64208c;
import te3.C64623p81;
import up1.C27696y;
import zj3.C79368l;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.p1 */
public class C57785p1 extends C74023i {

    /* renamed from: v */
    public C67391b f165368v;

    /* renamed from: C */
    public boolean mo82212C() {
        return false;
    }

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.f6941sv);
        n4Var.setTag(new C57786q1(n4Var, Boolean.TRUE));
        return n4Var;
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return true;
    }

    /* renamed from: S */
    public boolean mo82213S() {
        return false;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        int b = ((C74243t8) view.getTag()).mo103252b();
        if ((f4Var.getStatus() == 2 || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f165368v) && mo103081O(f4Var.mo108768t()) && !this.f165368v.mo91580u()) {
            e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
        }
        return true;
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C64623p81 p812;
        ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
        String content = f4Var.getContent();
        C68070l.C68072b u = content != null ? C68070l.C68072b.m80422u(content, f4Var.mo108775z2()) : null;
        if (u == null || u.f195582i != 65) {
            return false;
        }
        try {
            C60150a aVar = (C60150a) u.mo93555w(C60150a.class);
            if (aVar != null && (p812 = aVar.f171697b) != null) {
                long P = C61926c.m72671P(p812.f184780f);
                long P2 = C61926c.m72671P(p812.f184778d);
                try {
                    String y = mo103068y(bVar, f4Var);
                    if (y == null) {
                        y = bVar.mo91574o().getUsername();
                    }
                    C64208c.f181958h = y;
                    C64208c.f181959i = ((C10383h) C86312j.m106911c(C10383h.class)).mo10700XQ((long) ((int) bVar.mo91574o().f108320R1));
                    new Intent().putExtra("KEY_PARAMS_SOURCE_TYPE", p812.f184793v);
                    ((C60606n) C86312j.m106911c(C60606n.class)).o90((Intent) null, MMApplicationContext.getContext(), P, Long.valueOf(P2), p812.f184790s, p812.f184782h, "", "", "");
                } catch (Exception e) {
                    e = e;
                    Log.m105929w("MicroMsg.ChattingItemAppMsgLiveInviteTo", "jump to live fail: %s", e.getMessage());
                    return true;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            Log.m105929w("MicroMsg.ChattingItemAppMsgLiveInviteTo", "jump to live fail: %s", e.getMessage());
            return true;
        }
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C68070l.C68072b bVar2;
        C60150a aVar;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        this.f165368v = bVar;
        if (cVar instanceof C57786q1) {
            C57786q1 q1Var = (C57786q1) cVar;
            String content = f4Var.getContent();
            if (content != null) {
                bVar2 = C68070l.C68072b.m80422u(content, f4Var.mo108775z2());
            } else {
                Log.m105921e("MicroMsg.ChattingItemAppMsgLiveInviteTo", "amessage, msgid:%s, user:%s", Long.valueOf(f4Var.getMsgId()), str);
                bVar2 = null;
            }
            if (!(bVar2 == null || (aVar = (C60150a) bVar2.mo93555w(C60150a.class)) == null)) {
                C64623p81 p812 = aVar.f171697b;
                q1Var.f165369b.mo104279b(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(bVar.mo91565f(), p812.f184781g));
                if (p812.f184783i != null) {
                    ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(((C62368t0) C86312j.m106911c(C62368t0.class)).mo87412UE(p812.f184783i, C27696y.THUMB_IMAGE), q1Var.f165371d, ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.MSG_THUMB));
                }
            }
            cVar.clickArea.setTag(new C74243t8(f4Var, bVar.mo91583x(), cVar, (String) null));
            cVar.clickArea.setOnClickListener(mo103099u(bVar));
            cVar.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
            cVar.clickArea.setOnLongClickListener(mo103098p(bVar));
        }
        Log.m105924i("MicroMsg.ChattingItemAppMsgLiveInviteTo", "filling");
    }

    /* renamed from: k0 */
    public boolean mo26238k0(int i, boolean z) {
        return z && i == 989855793;
    }
}
