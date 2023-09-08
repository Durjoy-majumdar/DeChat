package gl3;

import android.widget.PopupWindow;
import com.tencent.p014mm.p136ui.contact.item.RecentForwardListDataItem;

/* renamed from: gl3.x */
public final class C75977x implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ RecentForwardListDataItem f222775d;

    public C75977x(RecentForwardListDataItem recentForwardListDataItem) {
        this.f222775d = recentForwardListDataItem;
    }

    public final void onDismiss() {
        this.f222775d.f219069F = null;
    }
}
