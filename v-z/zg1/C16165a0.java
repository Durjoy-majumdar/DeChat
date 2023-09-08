package zg1;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C87413o;
import nj3.C76912y0;
import ok1.C62042e;
import rx3.C13598b0;

/* renamed from: zg1.a0 */
public final class C16165a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public static final C16165a0 f43357d = new C16165a0();

    public C16165a0() {
        super(0);
    }

    public Object invoke() {
        Context context = MMApplicationContext.getContext();
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null && C62042e.f176370a.mo87032P0(bVar)) {
            C76912y0.makeText(context, (CharSequence) context.getString(C0966R.string.e3c), 0).show();
        }
        return C13598b0.f38549a;
    }
}
