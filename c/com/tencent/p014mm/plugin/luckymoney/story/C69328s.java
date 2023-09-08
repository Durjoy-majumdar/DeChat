package com.tencent.p014mm.plugin.luckymoney.story;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.luckymoney.story.EnvelopeAppBarLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RecyclerHorizontalViewPager;
import f32.C75676e;
import jq3.C60905o;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.s */
public class C69328s implements RecyclerHorizontalViewPager.C57875a {

    /* renamed from: d */
    public final /* synthetic */ EnvelopeAppBarLayout f199619d;

    public C69328s(EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f199619d = envelopeAppBarLayout;
    }

    /* renamed from: a */
    public void mo23719a(int i, boolean z, boolean z2) {
        boolean z3;
        String str;
        int i2 = i;
        Log.m105925i("MicroMsg.EnvelopeAppBarLayout", "on page change: %s, %s", Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            EnvelopeAppBarLayout envelopeAppBarLayout = this.f199619d;
            if (envelopeAppBarLayout.f199486T0 != i2) {
                envelopeAppBarLayout.mo95438k(false);
                EnvelopeAppBarLayout envelopeAppBarLayout2 = this.f199619d;
                envelopeAppBarLayout2.f199486T0 = i2;
                C60905o oVar = (C60905o) envelopeAppBarLayout2.f199524w.mo17023I0(i2);
                if (oVar != null) {
                    boolean j = this.f199619d.mo95437j();
                    EnvelopeAppBarLayout.C69303g gVar = (EnvelopeAppBarLayout.C69303g) oVar.f173503E;
                    if (j) {
                        gVar.mo95453a();
                    } else {
                        C69315e0.f199595e++;
                    }
                    if (EnvelopeStoryVideoManager.m119069c(gVar.f199553g, gVar.f199555i)) {
                        str = gVar.f199555i;
                        z3 = true;
                    } else {
                        str = gVar.f199550d.f228307e;
                        z3 = false;
                    }
                    EnvelopeAppBarLayout envelopeAppBarLayout3 = this.f199619d;
                    envelopeAppBarLayout3.f199492W0.mo129407g(envelopeAppBarLayout3.getContext(), (FrameLayout) oVar.mo85812D(C0966R.C0970id.gdx), (ImageView) oVar.mo85812D(C0966R.C0970id.gdt), (ProgressBar) oVar.mo85812D(C0966R.C0970id.gdv), str, gVar.f199550d.f228308f, gVar.f199551e, gVar.f199552f, i, j, z3, false);
                    C75676e.m90932a(6);
                }
                C69315e0.f199592b++;
            } else {
                return;
            }
        }
        this.f199619d.f199459A.setCurrentIndex(i2);
    }
}
