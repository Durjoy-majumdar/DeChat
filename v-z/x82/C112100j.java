package x82;

import android.webkit.ValueCallback;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105851w0;
import gy3.C87412m;
import nj3.C76912y0;

/* renamed from: x82.j */
public final class C112100j<T> implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C112101k f335618a;

    public C112100j(C112101k kVar) {
        this.f335618a = kVar;
    }

    public void onReceiveValue(Object obj) {
        Integer num = (Integer) obj;
        if (num == null || num.intValue() != 0) {
            if (num != null && -17 == num.intValue()) {
                C76912y0.m92767f(this.f335618a.getContext(), this.f335618a.getContext().getString(C0966R.string.cv9));
            } else {
                C76912y0.m92767f(this.f335618a.getContext(), this.f335618a.getContext().getString(C0966R.string.ifp));
            }
            C112096g0 mScreenReportData = this.f335618a.getMScreenReportData();
            if (mScreenReportData != null) {
                C87412m.m108593f(num, "value");
                mScreenReportData.f335614j = num.intValue();
            }
            C105851w0.zx0().mo150664h();
        }
    }
}
