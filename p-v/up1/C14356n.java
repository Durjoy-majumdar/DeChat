package up1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import gy3.C87412m;
import pe1.C35464c;
import te3.C49842ig0;
import vc1.C37715b;
import yn1.C16055a;

/* renamed from: up1.n */
public final class C14356n {

    /* renamed from: a */
    public static final C14356n f39907a = new C14356n();

    /* renamed from: a */
    public void mo13660a(C49842ig0 ig02) {
        C87412m.m108594g(ig02, "finderBaseReq");
        ig02.f135315g = 0;
        C37521f fVar = C37521f.f99374d;
        fVar.getClass();
        if (C37521f.f99270R0.mo60266n().intValue() == 1) {
            ig02.f135315g |= 1;
        }
        if (C16055a.f43185a.mo14671a()) {
            ig02.f135315g |= 2;
        }
        fVar.getClass();
        if (C37521f.f99239N2.mo60266n().intValue() == 1) {
            ig02.f135315g |= 4;
        }
        fVar.getClass();
        if (C37521f.f99272R2.mo60266n().intValue() == 1) {
            ig02.f135315g |= 8;
        }
        ig02.f135315g = ig02.f135315g | 16 | 32 | 64 | 128 | 256;
        C37715b bVar = C37715b.f99914a;
        if (bVar.mo61298a()) {
            ig02.f135315g |= 512;
        }
        if (bVar.mo61299b()) {
            ig02.f135315g |= 1024;
        }
        fVar.getClass();
        if (C37521f.f99244N7.mo60266n().intValue() != 0) {
            ig02.f135315g |= 2097152;
        }
        ig02.f135315g = ig02.f135315g | 32768 | 16384;
        fVar.getClass();
        C35464c<Integer> cVar = C37521f.f99315W0;
        if (cVar.mo60266n().intValue() == 1) {
            ig02.f135315g |= 1048576;
        }
        fVar.getClass();
        if (cVar.mo60266n().intValue() == 2) {
            ig02.f135315g |= 8388608;
        }
        fVar.getClass();
        if (C37521f.f99528u3.mo60266n().intValue() == 1) {
            ig02.f135315g |= TPMediaCodecProfileLevel.HEVCHighTierLevel62;
        }
        fVar.getClass();
        if (C37521f.f99428j.mo60266n().intValue() == 1) {
            ig02.f135315g |= TPMediaCodecProfileLevel.HEVCMainTierLevel62;
        }
        Log.m105924i("Finder.ExptUtil", "[fillExptFlag] exptFlag=" + ig02.f135315g);
    }
}
