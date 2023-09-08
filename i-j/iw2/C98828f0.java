package iw2;

import com.tencent.p014mm.plugin.story.model.StoryCore;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32229r;
import gw2.C98266k;
import gw2.C98267l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import kw2.C99268i;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: iw2.f0 */
public final class C98828f0 extends C87413o implements C32229r<Long, Boolean, String, String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C98880x f289719d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98828f0(C98880x xVar) {
        super(4);
        this.f289719d = xVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        long longValue = ((Number) obj).longValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        String str = (String) obj4;
        C87412m.m108594g((String) obj3, "fromUser");
        C87412m.m108594g(str, "storyOwner");
        Iterator<C98266k> it = this.f289719d.f289859i.iterator();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f288083f.f288069b == longValue) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0 && i < this.f289719d.f289859i.size()) {
            z = true;
        }
        if (z) {
            StoryCore.C96337h hVar = StoryCore.f281736t;
            if (Util.isEqual(str, hVar.mo134187e())) {
                C98266k kVar = this.f289719d.f289859i.get(i);
                C87412m.m108593f(kVar, "galleryItems[index]");
                C98266k kVar2 = kVar;
                C99268i Ow = hVar.mo134191i().mo138664Ow(longValue);
                if (Ow != null) {
                    C61926c.m72668M(new C98819e0(booleanValue, Ow, this.f289719d, i, new C98266k(Ow, Ow.mo138657p2(), C98267l.NORMAL)));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
