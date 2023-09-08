package com.tencent.p014mm.plugin.finder.view;

import cj1.C0581o5;
import cj1.C0584p5;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import eb0.C75592q0;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C76874e0;
import o40.C61926c;
import ok1.C62042e;
import te3.C48770aw0;
import te3.C49765hx0;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.f7 */
public final class C56608f7 {

    /* renamed from: a */
    public static final C56608f7 f162301a = new C56608f7();

    /* renamed from: a */
    public static final void m65279a(C56608f7 f7Var, C45795b bVar, C76874e0 e0Var) {
        f7Var.getClass();
        Class cls = C54991o.class;
        if (C61926c.m72696u(((C54991o) bVar.mo71262a(cls)).f154388y0, 32768)) {
            Log.m105924i("LiveCommentPopupWindowCreater", "addTopComment spam, flag:" + ((C54991o) bVar.mo71262a(cls)).f154388y0);
        } else if (e0Var.findItem(152) == null) {
            e0Var.mo107146h(152, MMApplicationContext.getContext().getString(C0966R.string.djw), C0966R.raw.finder_live_icons_filled_top, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o));
        }
    }

    /* renamed from: b */
    public final void mo79953b(C45795b bVar, C76874e0 e0Var, String str) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(str, "username");
        if (C87412m.m108589b(((C54991o) bVar.mo71262a(C54991o.class)).f154262U0.get(str), Boolean.TRUE)) {
            e0Var.mo107144g(158, MMApplicationContext.getContext().getString(C0966R.string.djs), C0966R.raw.icons_filled_comment);
        } else {
            e0Var.mo107144g(158, MMApplicationContext.getContext().getString(C0966R.string.djr), C0966R.raw.icons_filled_comment_off);
        }
    }

    /* renamed from: c */
    public final void mo79954c(C76874e0 e0Var) {
        C87412m.m108594g(e0Var, "menu");
        if (e0Var.findItem(155) == null) {
            e0Var.mo107148i(155, MMApplicationContext.getContext().getString(C0966R.string.dx6), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_copy, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o));
        }
    }

    /* renamed from: d */
    public final void mo79955d(C76874e0 e0Var, C0581o5 o5Var) {
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(o5Var, "msg");
        if (o5Var.getSeq() > 0 && e0Var.findItem(165) == null && (o5Var instanceof C0584p5)) {
            if (((C0584p5) o5Var).mo583m()) {
                e0Var.mo107148i(166, MMApplicationContext.getContext().getString(C0966R.string.m3d), MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3415ar), C0966R.raw.icons_filled_call_good, MMApplicationContext.getContext().getResources().getColor(C0966R.color.f3415ar));
                return;
            }
            e0Var.mo107148i(165, MMApplicationContext.getContext().getString(C0966R.string.f360454cy3), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_call_good, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o));
        }
    }

    /* renamed from: e */
    public final void mo79956e(C76874e0 e0Var) {
        C87412m.m108594g(e0Var, "menu");
        e0Var.mo107148i(154, MMApplicationContext.getContext().getString(C0966R.string.dgj), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_reply, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o));
    }

    /* renamed from: f */
    public final void mo79957f(C45795b bVar, C76874e0 e0Var, C0581o5 o5Var) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(o5Var, "msg");
        if (e0Var.findItem(156) == null && !C87412m.m108589b(o5Var.mo571e(), C75592q0.m90789s()) && !C87412m.m108589b(o5Var.mo571e(), C66785b.f191882e.mo90662O5()) && !C87412m.m108589b(o5Var.mo571e(), C75592q0.m90782l()) && !((C54991o) bVar.mo71262a(C54991o.class)).f154190D) {
            e0Var.mo107148i(156, MMApplicationContext.getContext().getString(C0966R.string.dxw), MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o), C0966R.raw.icons_filled_report_problem, MMApplicationContext.getContext().getResources().getColor(C0966R.color.a8o));
        }
    }

    /* renamed from: g */
    public final void mo79958g(C45795b bVar, C76874e0 e0Var, String str) {
        C87412m.m108594g(bVar, "buContext");
        C87412m.m108594g(e0Var, "menu");
        C87412m.m108594g(str, "username");
        if (C87412m.m108589b(((C54991o) bVar.mo71262a(C54991o.class)).f154267V0.get(str), Boolean.TRUE)) {
            e0Var.mo107144g(168, MMApplicationContext.getContext().getString(C0966R.string.f360548m42), C0966R.raw.icons_filled_eyes_on_comment);
        } else {
            e0Var.mo107144g(168, MMApplicationContext.getContext().getString(C0966R.string.f360547m40), C0966R.raw.icons_filled_eyes_off_comment);
        }
    }

    /* renamed from: h */
    public final boolean mo79959h(C0581o5 o5Var) {
        C87412m.m108594g(o5Var, "msg");
        C49765hx0 i = o5Var.mo579i();
        C62042e.f176370a.getClass();
        LinkedList<C48770aw0> linkedList = i != null ? i.f134930r : null;
        if (linkedList != null) {
            for (C48770aw0 aw02 : linkedList) {
                if (aw02.f130789d == 5 && !C87412m.m108589b(aw02.f130793h, MMApplicationContext.getContext().getResources().getString(C0966R.string.f360620mg0))) {
                    return true;
                }
            }
        }
        return false;
    }
}
