package il1;

import com.tencent.p014mm.C0966R;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: il1.w3 */
public final class C9158w3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C9143v3 f28850a;

    public C9158w3(C9143v3 v3Var) {
        this.f28850a = v3Var;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = true;
        this.f28850a.mo9958d(true);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            return C76912y0.m92769h(this.f28850a.getContext(), this.f28850a.getContext().getResources().getString(C0966R.string.dlu), C0966R.raw.icons_filled_done);
        }
        int i = cVar.f256794b;
        if (i == -200143) {
            String str = cVar.f256795c;
            if (!(str == null || str.length() == 0)) {
                z = false;
            }
            return C76912y0.m92769h(this.f28850a.getContext(), z ? this.f28850a.getContext().getResources().getString(C0966R.string.dlt) : cVar.f256795c, C0966R.raw.icons_filled_report_problem);
        } else if (i == -200144) {
            C76912y0.m92767f(this.f28850a.getContext(), cVar.f256795c);
            return C13598b0.f38549a;
        } else {
            String str2 = cVar.f256795c;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            C76912y0.m92767f(this.f28850a.getContext(), z ? this.f28850a.getContext().getResources().getString(C0966R.string.dls) : cVar.f256795c);
            return C13598b0.f38549a;
        }
    }
}
