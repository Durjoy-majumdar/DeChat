package vi1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import p910lj.C76701a;

/* renamed from: vi1.e */
public final class C65755e<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C65750a f189160d;

    public C65755e(C65750a aVar) {
        this.f189160d = aVar;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        Log.m105924i("FinderLiveMicIntercomBo", "receive micCloseListener " + str + " windowShow: " + this.f189160d.mo89761c1().f190050r);
        if (this.f189160d.mo89761c1().f190050r && C87412m.m108589b(this.f189160d.f189150v, str) && C87412m.m108589b(this.f189160d.mo89761c1().mo71666a().getValue(), Boolean.TRUE)) {
            C65750a.m77372Z0(this.f189160d);
            C76701a.makeText(this.f189160d.f166287d.getContext(), (int) C0966R.string.fpx, 0).show();
        }
    }
}
