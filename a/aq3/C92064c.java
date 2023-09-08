package aq3;

import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import com.tencent.p014mm.p136ui.base.WxImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq3.C98177a;
import gy3.C87412m;

/* renamed from: aq3.c */
public final class C92064c implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C92068g f263588d;

    public C92064c(C92068g gVar) {
        this.f263588d = gVar;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        WxImageView f2;
        if (i2 == 0 && this.f263588d.f263599n == 0) {
            Log.m105924i("MicroMsg.ImageGalleryPageUIC", "onScroll>> position: " + i);
            C98177a aVar = this.f263588d.f263592d;
            if (!(aVar == null || (f2 = aVar.mo129061f(0, true)) == null)) {
                f2.mo26059d();
            }
            C92068g gVar = this.f263588d;
            if (gVar.f263600o) {
                String str = this.f263588d.f263594f.get(i).f154726g;
                C87412m.m108593f(str, "imageDataList[position].scanImagePath");
                ((C54290a) C39818r.f106831a.mo62444c(gVar.getActivity()).mo75002a(C54290a.class)).mo75094d3(str, this.f263588d.f263596h);
                this.f263588d.f263600o = false;
            }
        }
    }

    public void onPageSelected(int i) {
        Log.m105924i("MicroMsg.ImageGalleryPageUIC", i + " + select");
        C92068g gVar = this.f263588d;
        gVar.f263597i = gVar.f263594f.get(i).f154723d;
        C39818r rVar = C39818r.f106831a;
        ((C92069h) rVar.mo62444c(this.f263588d.getActivity()).mo75002a(C92069h.class)).mo126059d3();
        ((C92075j) rVar.mo62444c(this.f263588d.getActivity()).mo75002a(C92075j.class)).mo126061c3();
        String str = this.f263588d.f263594f.get(i).f154726g;
        C87412m.m108593f(str, "imageDataList[position].scanImagePath");
        ((C54290a) rVar.mo62444c(this.f263588d.getActivity()).mo75002a(C54290a.class)).mo75094d3(str, this.f263588d.f263596h);
        C92068g gVar2 = this.f263588d;
        gVar2.f263599n = gVar2.f263595g;
        gVar2.f263595g = i;
    }
}
