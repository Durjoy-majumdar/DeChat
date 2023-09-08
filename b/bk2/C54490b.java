package bk2;

import a14.C53895h;
import a14.C53934p0;
import android.view.MenuItem;
import bl3.C39818r;
import ck2.C54883d0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ringtone.p100ui.RingtoneHistoryUI;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import java.util.List;
import nj3.C11184p0;
import nj3.C76912y0;
import pj2.C62323d;
import qo3.C77407n;
import tj2.C13961g;
import tj2.C13962j;
import tj2.C64948e;
import wx3.C15601d;
import wx3.C66212f;
import xj2.C66286a;

/* renamed from: bk2.b */
public final class C54490b implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ RingtoneHistoryUI f152772d;

    /* renamed from: e */
    public final /* synthetic */ C77407n f152773e;

    public C54490b(RingtoneHistoryUI ringtoneHistoryUI, C77407n nVar) {
        this.f152772d = ringtoneHistoryUI;
        this.f152773e = nVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        List<C62323d> data;
        if (menuItem.getItemId() == 1) {
            C39818r rVar = C39818r.f106831a;
            C13962j jVar = (C13962j) rVar.mo62444c(this.f152772d).mo75002a(C13962j.class);
            jVar.getClass();
            ((C54883d0) rVar.mo62444c(jVar.getActivity()).mo75002a(C54883d0.class)).mo75823T2();
            C53895h.m60466d(jVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C13961g((C15601d<? super C13961g>) null), 3, (Object) null);
            C64948e eVar = (C64948e) rVar.mo62444c(this.f152772d).mo75002a(C64948e.class);
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter = eVar.f187023g;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f165742u.clear();
            }
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter2 = eVar.f187023g;
            if (!(wxRecyclerAdapter2 == null || (data = wxRecyclerAdapter2.getData()) == null)) {
                data.clear();
            }
            WxRecyclerAdapter<C62323d> wxRecyclerAdapter3 = eVar.f187023g;
            if (wxRecyclerAdapter3 != null) {
                wxRecyclerAdapter3.notifyDataSetChanged();
            }
            C66286a.m78214a(2, "", 0);
            eVar.mo89114e3();
            this.f152773e.mo107572p();
            RingtoneHistoryUI ringtoneHistoryUI = this.f152772d;
            C76912y0.m92768g(ringtoneHistoryUI, ringtoneHistoryUI.getResources().getText(C0966R.string.f7932wm).toString());
        }
    }
}
