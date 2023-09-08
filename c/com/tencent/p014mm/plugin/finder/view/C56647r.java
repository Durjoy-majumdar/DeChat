package com.tencent.p014mm.plugin.finder.view;

import android.view.ContextMenu;
import android.view.View;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import eb0.C75592q0;
import er1.C58784w3;
import gy3.C87412m;
import up1.C37521f;
import up1.C65426w0;
import zc1.C66785b;

/* renamed from: com.tencent.mm.plugin.finder.view.r */
public final class C56647r implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public C55033u f162376d;

    /* renamed from: e */
    public final String f162377e;

    public C56647r(C55033u uVar, String str, boolean z) {
        C87412m.m108594g(uVar, "commentItem");
        C87412m.m108594g(str, "feedUsername");
        this.f162376d = uVar;
        this.f162377e = str;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, C0966R.string.f7936wt);
            String username = this.f162376d.f154492d.getUsername();
            C66785b bVar = C66785b.f191882e;
            boolean z = !C87412m.m108589b(username, bVar.mo90662O5()) && !C87412m.m108589b(this.f162376d.f154492d.getUsername(), C75592q0.m90789s());
            if (z) {
                contextMenu.add(0, 2, 1, C0966R.string.f7968xs);
            }
            C65426w0 w0Var = this.f162376d.f154492d;
            w0Var.getClass();
            if ((C87412m.m108589b(bVar.mo90662O5(), w0Var.getUsername()) || C87412m.m108589b(C75592q0.m90789s(), w0Var.getUsername())) || C58784w3.f168295a.mo83899R0(this.f162377e)) {
                contextMenu.add(0, 1, 2, C0966R.string.f7944x1);
            }
            if (z && C58784w3.f168295a.mo83899R0(this.f162377e) && !this.f162376d.f154492d.mo89544z2()) {
                if (this.f162376d.f154492d.mo89529l2() == 0) {
                    if (!this.f162376d.f154492d.mo89522A2()) {
                        contextMenu.add(0, 3, 3, C0966R.string.d0c);
                    } else if (C37521f.f99374d.mo61180f()) {
                        contextMenu.add(0, 3, 3, C0966R.string.d0c);
                    }
                } else if (this.f162376d.f154492d.mo89529l2() == 1) {
                    if (!this.f162376d.f154492d.mo89522A2()) {
                        contextMenu.add(0, 4, 3, C0966R.string.loe);
                    } else if (C37521f.f99374d.mo61180f()) {
                        contextMenu.add(0, 4, 3, C0966R.string.loe);
                    }
                }
            }
            if (BuildInfo.DEBUG) {
                contextMenu.add(0, 999, 4, "debug");
            }
        }
    }
}
