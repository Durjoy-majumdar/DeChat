package qp1;

import android.app.Activity;
import android.content.DialogInterface;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.shopping.presenter.FinderLiveShoppingManagerPresenter;
import dj1.C58293y0;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import o40.C61926c;
import qo3.C89779i0;
import rx3.C13598b0;
import te3.C50095k81;
import te3.v44;

/* renamed from: qp1.e */
public final class C63310e extends C87413o implements C32227p<Long, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C63313h f179645d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63310e(C63313h hVar) {
        super(2);
        this.f179645d = hVar;
    }

    public Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        String str = (String) obj2;
        C87412m.m108594g(str, "wording");
        FinderLiveShoppingManagerPresenter finderLiveShoppingManagerPresenter = this.f179645d.f179651b;
        finderLiveShoppingManagerPresenter.getClass();
        v44 v44 = finderLiveShoppingManagerPresenter.f160924f;
        if (v44 != null) {
            Activity activity = finderLiveShoppingManagerPresenter.f160919a;
            C89779i0 e = C89779i0.m112248e(activity, activity.getString(C0966R.string.a4d), false, 3, (DialogInterface.OnCancelListener) null);
            long j = v44.f185840f;
            long j2 = v44.f185841g;
            int i = v44.f185846o;
            String str2 = v44.f185842h;
            C50095k81 k812 = new C50095k81();
            k812.f136610d = longValue;
            k812.f136611e = v44.f185842h;
            k812.f136612f = str;
            C13598b0 b0Var = C13598b0.f38549a;
            C61926c.m72665J(new C58293y0(j, j2, i, str2, k812, ((C60172g4) C39818r.f106831a.mo62443b(finderLiveShoppingManagerPresenter.f160919a).mo62447c(C60172g4.class)).mo12861q3()).mo9225i(), new C63306b(e, finderLiveShoppingManagerPresenter, longValue, str));
        }
        return C13598b0.f38549a;
    }
}
