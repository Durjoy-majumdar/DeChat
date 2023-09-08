package zg2;

import ai2.C92019m;
import ai2.C92024r;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C64339ea;

/* renamed from: zg2.j */
public final class C103017j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f303975d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f303976e;

    /* renamed from: f */
    public final /* synthetic */ C64339ea f303977f;

    public C103017j(Context context, ViewGroup viewGroup, C64339ea eaVar) {
        this.f303975d = context;
        this.f303976e = viewGroup;
        this.f303977f = eaVar;
    }

    public final void run() {
        C103020m mVar = C103020m.f303985a;
        Context context = this.f303975d;
        ViewGroup viewGroup = this.f303976e;
        C64339ea eaVar = this.f303977f;
        C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
        C92019m mVar2 = new C92019m(eaVar);
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        C92024r rVar = new C92024r(context);
        viewGroup.addView(rVar, new RelativeLayout.LayoutParams(-1, -1));
        rVar.mo125997g(mVar2);
    }
}
