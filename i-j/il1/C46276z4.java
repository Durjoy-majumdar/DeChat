package il1;

import com.tencent.p014mm.sdk.platformtools.Log;
import dj1.C45397x;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C49765hx0;
import te3.C51998xn0;

/* renamed from: il1.z4 */
public final class C46276z4 implements C45397x.C45398a {

    /* renamed from: a */
    public final /* synthetic */ C60541x4 f124733a;

    public C46276z4(C60541x4 x4Var) {
        this.f124733a = x4Var;
    }

    /* renamed from: a */
    public void mo70901a(int i, int i2, String str, C51998xn0 xn02) {
        C87412m.m108594g(xn02, "resp");
        Log.m105924i("Finder.FinderLiveLinkInviteAnchorWidget", "doGetMicCandidateList resp.contacts:" + xn02.f144758d.size());
        this.f124733a.f172583y.clear();
        LinkedList<C49765hx0> linkedList = xn02.f144758d;
        if (linkedList != null) {
            this.f124733a.f172583y.addAll(linkedList);
        }
    }
}
