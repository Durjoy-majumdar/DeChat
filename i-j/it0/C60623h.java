package it0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity$$c;
import com.tencent.p014mm.plugin.appbrand.config.HalfScreenConfig;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: it0.h */
public final class C60623h extends C87413o implements C32226l<HalfScreenConfig.C55451a, Integer> {

    /* renamed from: d */
    public static final C60623h f172727d = new C60623h();

    /* renamed from: it0.h$a */
    public /* synthetic */ class C60624a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f172728a;

        static {
            int[] iArr = new int[HalfScreenConfig.C55451a.values().length];
            iArr[0] = 1;
            f172728a = iArr;
        }
    }

    public C60623h() {
        super(1);
    }

    public Object invoke(Object obj) {
        HalfScreenConfig.C55451a aVar = (HalfScreenConfig.C55451a) obj;
        C87412m.m108594g(aVar, "style");
        return Integer.valueOf(C60624a.f172728a[aVar.ordinal()] == 1 ? C0966R.C0968anim.f2351af : MMFragmentActivity$$c.f318647d);
    }
}
