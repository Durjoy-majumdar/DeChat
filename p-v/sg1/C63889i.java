package sg1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import hg1.C8527b;
import ik1.C8923b;
import p165hr.C60106t;
import rx3.C36570n;
import sk1.C63947a;
import te3.C64321dp2;
import te3.C64390ga1;

/* renamed from: sg1.i */
public final class C63889i {

    /* renamed from: a */
    public static final C63889i f181100a = new C63889i();

    /* renamed from: b */
    public static C64321dp2 m75110b(C63889i iVar, long j, C64390ga1 ga12, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        C8923b bVar = (C8923b) iVar.mo88655c();
        if (!bVar.f28224f) {
            bVar.mo9437Lo();
        }
        C8923b.C8924a aVar = bVar.f28225g.get(Long.valueOf(j));
        int i3 = aVar != null ? aVar.f28228c : -1;
        Log.m105924i("FinderLiveChargeInfoStorage", "selectReplayChargeInfo liveId:" + j + ",time:" + i3 + ",cache size:" + bVar.f28225g.size());
        C13677a aVar2 = C13677a.f38723a;
        int i4 = ((Boolean) ((C36570n) C13677a.f38724b).getValue()).booleanValue() ? 180 : C63947a.f181274a.mo88723i(ga12, i);
        C64321dp2 dp22 = new C64321dp2();
        dp22.f182791d = i;
        int i5 = i4 - i3;
        if (i5 < 0) {
            i5 = 0;
        }
        dp22.f182792e = i5;
        dp22.f182793f = i4;
        dp22.f182794g = 0;
        C63889i iVar2 = f181100a;
        dp22.f182795h = iVar2.mo88655c().mo9440jo(j);
        dp22.f182796i = iVar2.mo88655c().mo9441qq(j);
        return dp22;
    }

    /* renamed from: a */
    public final C64321dp2 mo88654a(long j, C64390ga1 ga12) {
        if (ga12 != null) {
            C63947a aVar = C63947a.f181274a;
            int i = ga12.f183298g > 0 ? 2 : 1;
            int i2 = aVar.mo88723i(ga12, i);
            if (i == 1) {
                C63889i iVar = f181100a;
                C8923b bVar = (C8923b) iVar.mo88655c();
                if (!bVar.f28224f) {
                    bVar.mo9437Lo();
                }
                Log.m105924i("FinderLiveChargeInfoStorage", "selectLiveChargeInfo " + bVar.f28225g.get(Long.valueOf(j)));
                C8923b.C8924a aVar2 = bVar.f28225g.get(Long.valueOf(j));
                int i3 = aVar2 != null ? aVar2.f28227b : 0;
                C64321dp2 dp22 = new C64321dp2();
                dp22.f182791d = i;
                int i4 = i2 - i3;
                if (i4 < 0) {
                    i4 = 0;
                }
                dp22.f182792e = i4;
                dp22.f182793f = i2;
                dp22.f182794g = 0;
                dp22.f182795h = iVar.mo88655c().mo9440jo(j);
                dp22.f182796i = iVar.mo88655c().mo9441qq(j);
                return dp22;
            }
            C64321dp2 dp23 = new C64321dp2();
            dp23.f182791d = i;
            dp23.f182792e = i2;
            dp23.f182793f = i2;
            dp23.f182794g = ga12.f183298g;
            C63889i iVar2 = f181100a;
            dp23.f182795h = iVar2.mo88655c().mo9440jo(j);
            dp23.f182796i = iVar2.mo88655c().mo9441qq(j);
            return dp23;
        }
        C64321dp2 dp24 = new C64321dp2();
        dp24.f182791d = 1;
        dp24.f182792e = 0;
        dp24.f182793f = 0;
        dp24.f182794g = 0;
        C63889i iVar3 = f181100a;
        dp24.f182795h = iVar3.mo88655c().mo9440jo(j);
        dp24.f182796i = iVar3.mo88655c().mo9441qq(j);
        return dp24;
    }

    /* renamed from: c */
    public final C8527b mo88655c() {
        return ((C60106t) C86312j.m106911c(C60106t.class)).yx0();
    }
}
