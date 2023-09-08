package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import ck3.C67391b;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.storage.C72963f4;
import gy3.C87412m;
import nj3.C76874e0;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.u1 */
public final class C57797u1 extends C74023i implements C73774p2 {

    /* renamed from: v */
    public final C57800w1 f165388v = new C57800w1(false);

    /* renamed from: E */
    public View mo26231E(LayoutInflater layoutInflater, View view) {
        return this.f165388v.mo82226b(layoutInflater, view);
    }

    /* renamed from: R */
    public boolean mo26232R() {
        return !this.f165388v.f165392a;
    }

    /* renamed from: X */
    public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        this.f165388v.getClass();
        if (menuItem == null || bVar == null) {
            return false;
        }
        menuItem.getItemId();
        return false;
    }

    /* renamed from: Z */
    public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        return this.f165388v.mo82227c(this, e0Var, view, contextMenuInfo, f4Var);
    }

    /* renamed from: a */
    public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
        C87412m.m108594g(view, "v");
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var, "msg");
        this.f165388v.mo82229e(view, bVar, f4Var);
    }

    /* renamed from: a0 */
    public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msg");
        this.f165388v.mo82228d(view, bVar, f4Var);
        return true;
    }

    /* renamed from: f */
    public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        C87412m.m108594g(bVar, "ui");
        C87412m.m108594g(f4Var, "msg");
        this.f165388v.mo82225a(this, cVar instanceof ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder ? (ChattingItemAppMsgFinderOrder$AppMsgFinderOrderHolder) cVar : null, cVar, bVar, f4Var, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo26238k0(int r4, boolean r5) {
        /*
            r3 = this;
            com.tencent.mm.ui.chatting.viewitems.w1 r0 = r3.f165388v
            boolean r0 = r0.f165392a
            r1 = 1
            r2 = 977272881(0x3a400031, float:7.324247E-4)
            if (r0 == 0) goto L_0x000f
            if (r5 != 0) goto L_0x0014
            if (r4 != r2) goto L_0x0014
            goto L_0x0015
        L_0x000f:
            if (r5 == 0) goto L_0x0014
            if (r4 != r2) goto L_0x0014
            goto L_0x0015
        L_0x0014:
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C57797u1.mo26238k0(int, boolean):boolean");
    }
}
