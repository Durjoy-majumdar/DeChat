package h21;

import android.view.View;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.plugin.collect.p038ui.CollectBillListUI;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: h21.f */
public class C76105f implements MMPullDownView.C73177d {

    /* renamed from: d */
    public final /* synthetic */ CollectBillListUI f223020d;

    public C76105f(CollectBillListUI collectBillListUI) {
        this.f223020d = collectBillListUI;
    }

    /* renamed from: q0 */
    public boolean mo64384q0() {
        if (this.f223020d.f197755g.getVisibility() == 0) {
            Log.m105918d("MicroMsg.CollectBillListUI", "empty view");
            return true;
        }
        ListView listView = this.f223020d.f197752d;
        View childAt = listView.getChildAt(listView.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= this.f223020d.f197752d.getHeight() && this.f223020d.f197752d.getLastVisiblePosition() == this.f223020d.f197752d.getAdapter().getCount() - 1;
    }
}
