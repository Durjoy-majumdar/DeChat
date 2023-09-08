package sz0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardTicketListUI;

/* renamed from: sz0.m */
public final class C13809m implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ CardTicketListUI f38939d;

    public C13809m(CardTicketListUI cardTicketListUI) {
        this.f38939d = cardTicketListUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f38939d.getString(C0966R.string.f7944x1));
    }
}
