package ry2;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import az2.C39674e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.view.TouchableLayout;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import nj3.C11184p0;
import rx3.C13598b0;
import uo3.C78253a;
import uy2.C52660e;
import uy2.C52665g;

/* renamed from: ry2.o */
public final class C48197o implements C32228q<View, Integer, C52660e, Boolean>, View.OnCreateContextMenuListener, C11184p0, PopupWindow.OnDismissListener {

    /* renamed from: d */
    public C32224a<C13598b0> f129171d;

    /* renamed from: e */
    public C52660e f129172e;

    public C48197o(C32224a<C13598b0> aVar, int i, C8480h hVar) {
        this.f129171d = (i & 1) != 0 ? null : aVar;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        int intValue = ((Number) obj2).intValue();
        C52660e eVar = (C52660e) obj3;
        C87412m.m108594g(view, "view");
        C87412m.m108594g(eVar, "item");
        this.f129172e = eVar;
        C78253a aVar = new C78253a(view.getContext());
        aVar.f229227C = this;
        aVar.mo108272g(view, intValue, 0, this, this, TouchableLayout.f24959d, TouchableLayout.f24960e);
        aVar.mo70679m();
        C52665g.C52666a aVar2 = C52665g.f147055f;
        String str = eVar.field_session_id;
        C87412m.m108593f(str, "item.field_session_id");
        aVar2.mo73606c(str, 106);
        return Boolean.TRUE;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C87412m.m108594g(contextMenu, "menu");
        C87412m.m108594g(view, "v");
        C87412m.m108594g(contextMenuInfo, "menuInfo");
        contextMenu.add(0, 2, 0, C0966R.string.f7944x1);
    }

    public void onDismiss() {
        this.f129172e = null;
    }

    public void onMMMenuItemSelected(MenuItem menuItem, int i) {
        C32224a<C13598b0> aVar;
        C87412m.m108594g(menuItem, "menuItem");
        C52660e eVar = this.f129172e;
        if (eVar != null && menuItem.getItemId() == 2) {
            C52665g.C52666a aVar2 = C52665g.f147055f;
            String str = eVar.field_session_id;
            C87412m.m108593f(str, "focused.field_session_id");
            aVar2.mo73606c(str, 107);
            if (C39674e.f106452d.mo62243O().delete(eVar, new String[0]) && (aVar = this.f129171d) != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }
}
