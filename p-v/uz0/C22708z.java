package uz0;

import android.view.MenuItem;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.p031ui.p034v4.HistoryCardListUI;
import java.util.List;

/* renamed from: uz0.z */
public final class C22708z<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ HistoryCardListUI f65287d;

    public C22708z(HistoryCardListUI historyCardListUI) {
        this.f65287d = historyCardListUI;
    }

    public void onChanged(Object obj) {
        List list = (List) obj;
        HistoryCardListUI historyCardListUI = this.f65287d;
        int i = HistoryCardListUI.f52269r;
        historyCardListUI.getClass();
        if (!(list == null || list.isEmpty())) {
            historyCardListUI.removeAllOptionMenu();
            historyCardListUI.addIconOptionMenu(0, 0, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C22686l0(historyCardListUI, list));
        }
    }
}
