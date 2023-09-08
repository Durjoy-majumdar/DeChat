package mo1;

import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import java.util.LinkedList;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import te3.C101824o80;
import te3.C49103d62;

/* renamed from: mo1.c2 */
public final class C47084c2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderProfileTabUIC f126521a;

    public C47084c2(FinderProfileTabUIC finderProfileTabUIC) {
        this.f126521a = finderProfileTabUIC;
    }

    public Object call(Object obj) {
        LinkedList<C101824o80> linkedList;
        LinkedList<C101824o80> linkedList2;
        C89132b.C89134c cVar = (C89132b.C89134c) obj;
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        Log.m105924i("Finder.FinderProfileTabUIC", "checkEmojiTab: " + i + ", " + i2);
        C49103d62 d622 = (C49103d62) cVar.f256796d;
        boolean z = false;
        if (i == 0 && i2 == 0) {
            if (!(d622 == null || (linkedList2 = d622.f132149i) == null)) {
                z = linkedList2.isEmpty();
            }
            if (!z) {
                FinderProfileTabUIC finderProfileTabUIC = this.f126521a;
                finderProfileTabUIC.getClass();
                C61926c.m72668M(new C61548y1(finderProfileTabUIC));
            } else {
                FinderProfileTabUIC finderProfileTabUIC2 = this.f126521a;
                finderProfileTabUIC2.getClass();
                C61926c.m72668M(new C47087h2(finderProfileTabUIC2));
            }
        } else if (i == 4 && i2 == 2) {
            if (!(d622 == null || (linkedList = d622.f132149i) == null)) {
                z = linkedList.isEmpty();
            }
            if (!z) {
                FinderProfileTabUIC finderProfileTabUIC3 = this.f126521a;
                finderProfileTabUIC3.getClass();
                C61926c.m72668M(new C61548y1(finderProfileTabUIC3));
            } else {
                FinderProfileTabUIC finderProfileTabUIC4 = this.f126521a;
                finderProfileTabUIC4.getClass();
                C61926c.m72668M(new C47087h2(finderProfileTabUIC4));
            }
        } else {
            FinderProfileTabUIC finderProfileTabUIC5 = this.f126521a;
            finderProfileTabUIC5.getClass();
            C61926c.m72668M(new C47087h2(finderProfileTabUIC5));
        }
        return C13598b0.f38549a;
    }
}
