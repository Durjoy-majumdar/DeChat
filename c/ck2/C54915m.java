package ck2;

import a14.C53895h;
import a14.C53934p0;
import android.content.DialogInterface;
import android.view.MenuItem;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneDataUIC;
import com.tencent.p014mm.plugin.ringtone.uic.RingtoneExclusiveMainUIC;
import nj2.C61759g;
import nj3.C11184p0;
import pj2.C62318a;
import qo3.C89779i0;
import r13.C63358c;
import rj2.C63447a;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.m */
public final class C54915m implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f153919d;

    /* renamed from: e */
    public final /* synthetic */ RingtoneExclusiveMainUIC f153920e;

    /* renamed from: f */
    public final /* synthetic */ C62318a f153921f;

    public C54915m(String str, RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC, C62318a aVar) {
        this.f153919d = str;
        this.f153920e = ringtoneExclusiveMainUIC;
        this.f153921f = aVar;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        int itemId = menuItem.getItemId();
        boolean z = true;
        if (itemId == 0) {
            String str = this.f153919d;
            C62318a aVar = this.f153921f;
            RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC = this.f153920e;
            C66132f a = C63447a.m74787a(aVar.getItemId());
            if (a == null || a.f190095r == null || a.mo90178i().f170150b == null || !C63358c.m74700b(a.mo90178i())) {
                z = false;
            }
            C39818r rVar = C39818r.f106831a;
            ((C54914j0) rVar.mo62444c(ringtoneExclusiveMainUIC.getActivity()).mo75002a(C54914j0.class)).mo75846f3(a, str, z);
            int i2 = ((RingtoneDataUIC) rVar.mo62444c(ringtoneExclusiveMainUIC.getActivity()).mo75002a(RingtoneDataUIC.class)).f164072e;
            C61759g.C61760a.m72462b(C61759g.f175551f, ringtoneExclusiveMainUIC.getActivity(), 2, str, i2, false, (C66132f) null, 48, (Object) null);
        } else if (itemId == 1) {
            RingtoneExclusiveMainUIC ringtoneExclusiveMainUIC2 = this.f153920e;
            String str2 = this.f153919d;
            ringtoneExclusiveMainUIC2.getClass();
            if (str2 != null) {
                C54897h hVar = (C54897h) C39818r.f106831a.mo62444c(ringtoneExclusiveMainUIC2.getActivity()).mo75002a(C54897h.class);
                hVar.getClass();
                C89779i0 e = C89779i0.m112248e(hVar.getContext(), hVar.getContext().getResources().getString(C0966R.string.byc), false, 3, (DialogInterface.OnCancelListener) null);
                e.show();
                C53895h.m60466d(hVar.getLifecycleScope(), (C66212f) null, (C53934p0) null, new C54888f(str2, hVar, e, (C15601d<? super C54888f>) null), 3, (Object) null);
            }
        }
    }
}
