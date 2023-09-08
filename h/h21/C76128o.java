package h21;

import android.view.MenuItem;
import com.tencent.p014mm.plugin.collect.p038ui.CollectCreateQRCodeNewUI;

/* renamed from: h21.o */
public class C76128o implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ CollectCreateQRCodeNewUI f223042d;

    public C76128o(CollectCreateQRCodeNewUI collectCreateQRCodeNewUI) {
        this.f223042d = collectCreateQRCodeNewUI;
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        this.f223042d.setResult(0);
        this.f223042d.finish();
        return true;
    }
}
