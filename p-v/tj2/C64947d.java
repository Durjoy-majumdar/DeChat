package tj2;

import a14.C53895h;
import a14.C53934p0;
import android.view.View;
import androidx.lifecycle.C0120a0;
import bl3.C39818r;
import gy3.C87412m;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import pj2.C62324e;
import rx3.C36570n;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: tj2.d */
public final class C64947d<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C64948e f187019d;

    public C64947d(C64948e eVar) {
        this.f187019d = eVar;
    }

    public void onChanged(Object obj) {
        List<C62324e> list = (List) obj;
        if (!((C52348b) C39818r.f106831a.mo62444c(this.f187019d.getActivity()).mo75002a(C52348b.class)).f146318e) {
            this.f187019d.mo89112c3().mo26600h();
        } else {
            this.f187019d.mo89112c3().mo26580f(true);
        }
        this.f187019d.mo89112c3().mo26604l(true);
        this.f187019d.mo89112c3().getCommonConfig().f126541c = false;
        if (list == null) {
            this.f187019d.mo89114e3();
            return;
        }
        C64948e eVar = this.f187019d;
        Object value = ((C36570n) eVar.f187020d).getValue();
        C87412m.m108593f(value, "<get-noResultView>(...)");
        View view = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        eVar.mo89113d3().setVisibility(0);
        C64948e eVar2 = this.f187019d;
        for (C62324e cVar : list) {
            C53895h.m60466d(eVar2.getMainScope(), (C66212f) null, (C53934p0) null, new C64946c(eVar2, cVar, (C15601d<? super C64946c>) null), 3, (Object) null);
        }
    }
}
