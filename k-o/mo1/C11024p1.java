package mo1;

import cm1.C0714b2;
import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileQQMusicLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: mo1.p1 */
public final class C11024p1 extends C87413o implements C32226l<C0714b2, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C61514m1 f32749d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11024p1(C61514m1 m1Var) {
        super(1);
        this.f32749d = m1Var;
    }

    public Object invoke(Object obj) {
        int i;
        C0714b2 b2Var = (C0714b2) obj;
        C87412m.m108594g(b2Var, LocaleUtil.ITALIAN);
        FinderProfileQQMusicLoader c3 = this.f32749d.mo86477c3();
        long itemId = b2Var.getItemId();
        Iterator it = c3.getDataList().iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (((C0740i2) it.next()).getItemId() == itemId) {
                break;
            }
            i2++;
        }
        if (i2 == -1 && itemId != 0) {
            Iterator it4 = c3.getDataList().iterator();
            int i3 = 0;
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                C0740i2 i2Var = (C0740i2) it4.next();
                if ((i2Var instanceof BaseFinderFeed) && ((BaseFinderFeed) i2Var).mo3513o().getLocalId() == itemId) {
                    i = i3;
                    break;
                }
                i3++;
            }
            i2 = i;
        }
        String tag = c3.getTAG();
        Log.m105924i(tag, "findMusicIndex id:" + itemId + "  index:" + i2);
        FinderProfileQQMusicLoader c35 = this.f32749d.mo86477c3();
        String tag2 = c35.getTAG();
        Log.m105924i(tag2, "updateMusic index:" + i2 + " action:" + 33);
        if (i2 >= 0) {
            c35.dispatcher().mo13378c(i2, 1, new C13604l(33, 1));
        }
        return C13598b0.f38549a;
    }
}
