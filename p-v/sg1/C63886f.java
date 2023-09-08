package sg1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32229r;
import gy3.C87412m;
import gy3.C87413o;
import sk1.C63947a;
import te3.C64321dp2;
import te3.C64390ga1;

/* renamed from: sg1.f */
public final class C63886f extends C87413o implements C32229r<String, Integer, Long, C64390ga1, C64321dp2> {

    /* renamed from: d */
    public final /* synthetic */ C63888h f181085d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63886f(C63888h hVar) {
        super(4);
        this.f181085d = hVar;
    }

    /* renamed from: I */
    public Object mo162I(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        int intValue = ((Number) obj2).intValue();
        long longValue = ((Number) obj3).longValue();
        C64390ga1 ga12 = (C64390ga1) obj4;
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C64321dp2 b = intValue != 1 ? intValue != 2 ? null : C63889i.m75110b(C63889i.f181100a, longValue, ga12, 0, 4, (Object) null) : C63889i.f181100a.mo88654a(longValue, ga12);
        String str2 = this.f181085d.f181091e;
        Log.m105924i(str2, str + " timer generator liveId:" + longValue + ", mode:" + intValue + ", " + C63947a.f181274a.mo88731q(b));
        return b;
    }
}
