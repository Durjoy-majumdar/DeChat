package kx0;

import android.content.Context;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.brandservice.p028ui.personalcenter.recentread.BizPCRecentReadUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import nj3.C11184p0;
import qo3.C77407n;

/* renamed from: kx0.n */
public final class C46785n implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ BizPCRecentReadUI f125903d;

    public C46785n(BizPCRecentReadUI bizPCRecentReadUI) {
        this.f125903d = bizPCRecentReadUI;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        if (menuItem.getItemId() == 0) {
            BizPCRecentReadUI bizPCRecentReadUI = this.f125903d;
            Log.m105924i(bizPCRecentReadUI.f109266d, "showCloseMakeSureMenu");
            C77407n nVar = new C77407n((Context) bizPCRecentReadUI.getContext(), 1, true);
            nVar.mo107568m(bizPCRecentReadUI.getString(C0966R.string.n0e), 17, C76577a.m92151b(bizPCRecentReadUI.getContext(), 12));
            nVar.f225771i = new C46781k(bizPCRecentReadUI);
            nVar.f225782p = new C46782l(bizPCRecentReadUI);
            nVar.mo107573q();
        }
    }
}
