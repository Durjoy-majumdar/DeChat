package lq1;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import eb0.C75592q0;
import er1.C58784w3;
import gy3.C87412m;
import sq1.C64147b;
import sq1.C64151e;
import up1.C37521f;
import zc1.C66785b;

/* renamed from: lq1.e0 */
public final class C61352e0 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public C64151e f174514d;

    /* renamed from: e */
    public final String f174515e;

    public C61352e0(C64151e eVar, String str, boolean z) {
        C87412m.m108594g(eVar, "commentItem");
        C87412m.m108594g(str, "feedUsername");
        this.f174514d = eVar;
        this.f174515e = str;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (contextMenu != null) {
            contextMenu.add(0, 0, 0, C0966R.string.f7936wt);
            String username = this.f174514d.f181868d.getUsername();
            C66785b bVar = C66785b.f191882e;
            boolean z = !C87412m.m108589b(username, bVar.mo90662O5()) && !C87412m.m108589b(this.f174514d.f181868d.getUsername(), C75592q0.m90789s());
            if (z) {
                contextMenu.add(0, 2, 1, C0966R.string.f7968xs);
            }
            C64147b bVar2 = this.f174514d.f181868d;
            bVar2.getClass();
            if ((C87412m.m108589b(bVar.mo90662O5(), bVar2.getUsername()) || C87412m.m108589b(C75592q0.m90789s(), bVar2.getUsername())) || C58784w3.f168295a.mo83899R0(this.f174515e)) {
                contextMenu.add(0, 1, 2, C0966R.string.f7944x1);
            }
            if (z && C58784w3.f168295a.mo83899R0(this.f174515e)) {
                if (!this.f174514d.f181868d.mo88885v2()) {
                    contextMenu.add(0, 3, 3, C0966R.string.d0c);
                } else if (C37521f.f99374d.mo61180f()) {
                    contextMenu.add(0, 3, 3, C0966R.string.d0c);
                }
            }
            if (BuildInfo.DEBUG) {
                contextMenu.add(0, 999, 4, "debug");
            }
        }
    }
}
