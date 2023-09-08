package rd2;

import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.order.p889ui.MallOrderDetailInfoUI;
import nj3.C76879j;

/* renamed from: rd2.c */
public class C77512c implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ MallOrderDetailInfoUI f226013d;

    public C77512c(MallOrderDetailInfoUI mallOrderDetailInfoUI) {
        this.f226013d = mallOrderDetailInfoUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        MallOrderDetailInfoUI mallOrderDetailInfoUI = this.f226013d;
        int i = MallOrderDetailInfoUI.f202176B;
        C76879j.m92737h(mallOrderDetailInfoUI, "", new String[]{mallOrderDetailInfoUI.getString(C0966R.string.gnr)}, "", false, new C77513d(mallOrderDetailInfoUI));
        return true;
    }
}
