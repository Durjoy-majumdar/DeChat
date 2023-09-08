package ne1;

import com.tencent.p014mm.autogen.events.FeedStickyEvent;
import com.tencent.p014mm.plugin.finder.service.C3602m1;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import ei3.C86522b;
import gy3.C87412m;
import ht1.C8794p5;
import pe3.C89349b;
import te3.C49688hd1;
import vp1.C65834e;

@C86522b
/* renamed from: ne1.l0 */
public final class C11153l0 extends C61685z0<C49688hd1> implements C3602m1 {

    /* renamed from: e */
    public final String f32932e = "Finder.FinderModProfileStickySetting";

    /* renamed from: jP */
    public void mo3966jP(long j, int i, String str, C8794p5<C49688hd1> p5Var) {
        C87412m.m108594g(str, "nonceId");
        C49688hd1 hd12 = new C49688hd1();
        hd12.f134570d = j;
        hd12.f134571e = i;
        hd12.f134572f = str;
        C61685z0.Ax0(this, hd12, p5Var, false, false, 12, (Object) null);
    }

    public C89349b vx0(Object obj) {
        C49688hd1 hd12 = (C49688hd1) obj;
        C87412m.m108594g(hd12, "cmdBufItem");
        return C89349b.m111674a(hd12.toByteArray());
    }

    public int xx0() {
        return 12;
    }

    public String yx0() {
        return this.f32932e;
    }

    public void zx0(Object obj, int i) {
        C49688hd1 hd12 = (C49688hd1) obj;
        C87412m.m108594g(hd12, "cmdBufItem");
        String str = this.f32932e;
        Log.m105924i(str, "retcode:" + i);
        if (i == 0) {
            int e = hd12.f134571e == 0 ? C31543z5.m39455e() : 0;
            FinderItem e2 = C65834e.f189316a.mo89871e(hd12.f134570d);
            if (e2 != null) {
                e2.setStickyTime(e);
            }
            FeedStickyEvent feedStickyEvent = new FeedStickyEvent();
            FeedStickyEvent.C1040a aVar = feedStickyEvent.f9169d;
            aVar.f9172c = 1000;
            aVar.f9170a = hd12.f134570d;
            aVar.f9171b = e;
            feedStickyEvent.publish();
        }
    }
}
