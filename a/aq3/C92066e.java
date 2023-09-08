package aq3;

import bl3.C39818r;
import com.tencent.p014mm.api.QueryImageData;
import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;

/* renamed from: aq3.e */
public final class C92066e implements MMViewPager.C19705g {

    /* renamed from: a */
    public final /* synthetic */ C92068g f263590a;

    public C92066e(C92068g gVar) {
        this.f263590a = gVar;
    }

    /* renamed from: a */
    public final void mo26055a() {
        Class cls = C92075j.class;
        Log.m105924i("MicroMsg.ImageGalleryPageUIC", "longClick");
        C39818r rVar = C39818r.f106831a;
        C92075j jVar = (C92075j) rVar.mo62444c(this.f263590a.getActivity()).mo75002a(cls);
        C54295a0 a0Var = jVar.f263622q;
        C54295a0 a0Var2 = C54295a0.CUR_STATE_RUNNING;
        if ((a0Var == a0Var2 || jVar.f263619n == a0Var2) ? false : true) {
            C92068g gVar = this.f263590a;
            ArrayList<QueryImageData> arrayList = gVar.f263594f;
            MMViewPager mMViewPager = gVar.f263593e;
            C87412m.m108591d(mMViewPager);
            ((C92075j) rVar.mo62444c(this.f263590a.getActivity()).mo75002a(cls)).mo126065g3(arrayList.get(mMViewPager.getCurrentItem()).f154723d);
        }
    }
}
