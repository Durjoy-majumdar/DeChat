package zg2;

import ai2.C92011d;
import ai2.C92020n;
import ai2.C92021o;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import te3.C101773e70;
import te3.C64339ea;

/* renamed from: zg2.l */
public final class C103019l implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C101773e70 f303981d;

    /* renamed from: e */
    public final /* synthetic */ C64339ea f303982e;

    /* renamed from: f */
    public final /* synthetic */ Context f303983f;

    /* renamed from: g */
    public final /* synthetic */ ViewGroup f303984g;

    public C103019l(C101773e70 e702, C64339ea eaVar, Context context, ViewGroup viewGroup) {
        this.f303981d = e702;
        this.f303982e = eaVar;
        this.f303983f = context;
        this.f303984g = viewGroup;
    }

    public final void run() {
        C101773e70 e702 = this.f303981d;
        long j = e702.f298160f - e702.f298159e;
        C64339ea eaVar = this.f303982e;
        C87412m.m108593f(eaVar, LocaleUtil.ITALIAN);
        C92020n nVar = new C92020n(eaVar);
        nVar.mo125920i(j);
        C103020m mVar = C103020m.f303985a;
        Context context = this.f303983f;
        ViewGroup viewGroup = this.f303984g;
        Log.m105924i("MicroMsg.mix_background.VideoEditStorageUtil", "fake story reshow the position item view");
        C92021o oVar = new C92021o(context);
        viewGroup.addView(oVar, new RelativeLayout.LayoutParams(-1, -1));
        oVar.f263481R = nVar;
        oVar.setViewMatrix(nVar.f263407f);
        oVar.mo125958p(nVar.f263463g);
        oVar.mo125922c();
        oVar.f263473I = C92011d.LYRICS;
    }
}
