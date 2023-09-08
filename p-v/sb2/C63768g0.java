package sb2;

import ac2.C39535k;
import ac2.C91988j;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.view.recyclerview.WxLinearLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;

/* renamed from: sb2.g0 */
public final class C63768g0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C63759f0 f180798d;

    public C63768g0(C63759f0 f0Var) {
        this.f180798d = f0Var;
    }

    public void onChanged(Object obj) {
        if (((C91988j) obj).f263327a == C39535k.UIRefresh) {
            WxLinearLayoutManager wxLinearLayoutManager = (WxLinearLayoutManager) ((C36570n) this.f180798d.f180775n).getValue();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(this.f180798d.f180772h.f272353o.size() - 1));
            C117292a.m165358d(wxLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            wxLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(wxLinearLayoutManager, "com/tencent/mm/plugin/mv/ui/uic/MusicMvMakerFlexEditUIC$initEditUI$1", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
    }
}
