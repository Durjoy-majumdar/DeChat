package if2;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hf2.C46035f;
import hp3.C87581a;
import java.util.LinkedList;
import nj3.C76912y0;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50273lj2;
import te3.C51246sh3;

/* renamed from: if2.l */
public final class C8906l<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8894g f28188a;

    /* renamed from: b */
    public final /* synthetic */ C51246sh3 f28189b;

    /* renamed from: c */
    public final /* synthetic */ int f28190c;

    public C8906l(C8894g gVar, C51246sh3 sh32, int i) {
        this.f28188a = gVar;
        this.f28189b = sh32;
        this.f28190c = i;
    }

    public Object call(Object obj) {
        RecyclerView.C16613e adapter;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        if (this.f28188a.getActivity().isFinishing()) {
            Log.m105924i("NewBizInfoAuthScopeUIC", "activity.isFinishing");
        } else {
            C8894g gVar = this.f28188a;
            C89779i0 i0Var = gVar.f28168g;
            if (i0Var != null) {
                i0Var.dismiss();
                gVar.f28168g = null;
            }
            Log.m105924i("NewBizInfoAuthScopeUIC", "mode: cgi result: " + cVar.f256793a + ", " + cVar.f256794b);
            if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                C76912y0.m92768g(this.f28188a.getActivity(), this.f28188a.getActivity().getResources().getString(C0966R.string.bk_));
                C50273lj2 lj22 = C46035f.f124140j;
                if (lj22 != null) {
                    LinkedList<C51246sh3> linkedList = lj22.f137459f;
                    C87412m.m108593f(linkedList, "NewBizInfoSettingJsApiUI…!.privacy_scope_item_list");
                    C51246sh3 sh32 = this.f28189b;
                    int i = this.f28190c;
                    for (C51246sh3 sh33 : linkedList) {
                        if (C87412m.m108589b(sh33.f141521d, sh32.f141521d)) {
                            sh33.f141523f = i;
                        }
                    }
                    RecyclerView c3 = this.f28188a.mo9712c3();
                    if (!(c3 == null || (adapter = c3.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                }
            } else {
                C76912y0.m92767f(this.f28188a.getContext(), this.f28188a.getContext().getResources().getString(C0966R.string.bks));
            }
        }
        return C13598b0.f38549a;
    }
}
