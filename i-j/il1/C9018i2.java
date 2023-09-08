package il1;

import com.tencent.p014mm.C0966R;
import fy3.C32227p;
import hp3.C87581a;
import nj3.C76912y0;
import ob0.C89132b;
import rx3.C13598b0;

/* renamed from: il1.i2 */
public final class C9018i2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C9002h2 f28489a;

    /* renamed from: b */
    public final /* synthetic */ String f28490b;

    public C9018i2(C9002h2 h2Var, String str) {
        this.f28489a = h2Var;
        this.f28490b = str;
    }

    public Object call(Object obj) {
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        boolean z = true;
        this.f28489a.mo9811d(true);
        if (cVar.f256793a == 0 && cVar.f256794b == 0) {
            C76912y0.m92769h(this.f28489a.getContext(), this.f28489a.getContext().getResources().getString(C0966R.string.dl9), C0966R.raw.icons_filled_done);
            C32227p<Boolean, String, C13598b0> createResultCallback = this.f28489a.getCreateResultCallback();
            if (createResultCallback == null) {
                return null;
            }
            createResultCallback.invoke(Boolean.TRUE, this.f28490b);
            return C13598b0.f38549a;
        }
        String str = cVar.f256795c;
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        C76912y0.m92767f(this.f28489a.getContext(), z ? this.f28489a.getContext().getResources().getString(C0966R.string.dl8) : cVar.f256795c);
        return C13598b0.f38549a;
    }
}
