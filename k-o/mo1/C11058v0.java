package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileHeaderUIC;
import gy3.C87412m;
import ht1.C8797q5;
import java.util.List;
import p823sg.C101614i;
import te3.C49098d51;

/* renamed from: mo1.v0 */
public final class C11058v0 implements C8797q5.C8799b {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileHeaderUIC f32818a;

    public C11058v0(FinderProfileHeaderUIC finderProfileHeaderUIC) {
        this.f32818a = finderProfileHeaderUIC;
    }

    /* renamed from: a */
    public void mo9630a(List<C49098d51> list, int i) {
        C49098d51 d512;
        C87412m.m108594g(list, "noticeList");
        C101614i<String, FinderProfileHeaderUIC.C3463b> iVar = FinderProfileHeaderUIC.f16192h1;
        FinderProfileHeaderUIC.C3463b bVar = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(this.f32818a.f16213S0);
        if (!(bVar == null || (d512 = bVar.f16265d) == null)) {
            FinderProfileHeaderUIC finderProfileHeaderUIC = this.f32818a;
            for (C49098d51 d513 : list) {
                if (C87412m.m108589b(d512.f132122h, d513.f132122h)) {
                    C101614i<String, FinderProfileHeaderUIC.C3463b> iVar2 = FinderProfileHeaderUIC.f16192h1;
                    FinderProfileHeaderUIC.C3463b bVar2 = (FinderProfileHeaderUIC.C3463b) FinderProfileHeaderUIC.f16192h1.get(finderProfileHeaderUIC.f16213S0);
                    if (bVar2 != null) {
                        bVar2.f16265d = d513;
                    }
                }
            }
        }
        FinderProfileHeaderUIC.m3564X3(this.f32818a, "moreLiveListWidget-onDismiss", (String) null, 2, (Object) null);
    }
}
