package uz0;

import android.view.ContextMenu;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;

/* renamed from: uz0.j0 */
public final class C14395j0 implements View.OnCreateContextMenuListener {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f39968d;

    public C14395j0(HistoryCardListUI historyCardListUI) {
        this.f39968d = historyCardListUI;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f39968d.getString(C0966R.string.f7944x1));
    }
}
