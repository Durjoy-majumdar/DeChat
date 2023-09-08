package aq3;

import com.tencent.p014mm.p136ui.base.MMViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: aq3.f */
public final class C92067f implements MMViewPager.C19691i {

    /* renamed from: a */
    public final /* synthetic */ C92068g f263591a;

    public C92067f(C92068g gVar) {
        this.f263591a = gVar;
    }

    /* renamed from: a */
    public void mo26046a() {
        Log.m105924i("MicroMsg.ImageGalleryPageUIC", "SingClickOver");
        C92068g gVar = this.f263591a;
        if (gVar.f263598j) {
            gVar.getActivity().finish();
        }
    }

    /* renamed from: b */
    public void mo26047b() {
    }
}
