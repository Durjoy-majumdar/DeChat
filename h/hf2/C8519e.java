package hf2;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import qo3.C89779i0;
import rx3.C13598b0;

/* renamed from: hf2.e */
public final class C8519e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f27558a;

    /* renamed from: b */
    public final /* synthetic */ C46035f f27559b;

    /* renamed from: c */
    public final /* synthetic */ Preference f27560c;

    /* renamed from: d */
    public final /* synthetic */ boolean f27561d;

    public C8519e(C8477a0 a0Var, C46035f fVar, Preference preference, boolean z) {
        this.f27558a = a0Var;
        this.f27559b = fVar;
        this.f27560c = preference;
        this.f27561d = z;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        this.f27558a.f27482d = true;
        C46035f fVar = this.f27559b;
        C89779i0 i0Var = fVar.f124146i;
        if (i0Var != null) {
            i0Var.dismiss();
            fVar.f124146i = null;
        }
        if (this.f27559b.getActivity().isFinishing()) {
            Log.m105924i("NewBizInfoSettingJsApiUIC", "activity.isFinishing");
        } else {
            Log.m105924i("NewBizInfoSettingJsApiUIC", "mode: cgi result: " + cVar.f256793a + ", " + cVar.f256794b);
            if (!(cVar.f256794b == 0 && cVar.f256793a == 0)) {
                C76912y0.m92767f(this.f27559b.getContext(), this.f27559b.getContext().getResources().getString(C0966R.string.bks));
                ((CheckBoxPreference) this.f27560c).mo6808N(!this.f27561d);
            }
        }
        return C13598b0.f38549a;
    }
}
