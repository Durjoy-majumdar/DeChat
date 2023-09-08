package sz0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p032v2.CardInvalidTicketListUI;

/* renamed from: sz0.f */
public final class C13802f implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ CardInvalidTicketListUI f38930d;

    public C13802f(CardInvalidTicketListUI cardInvalidTicketListUI) {
        this.f38930d = cardInvalidTicketListUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f38930d.getString(C0966R.string.f7944x1));
    }
}
