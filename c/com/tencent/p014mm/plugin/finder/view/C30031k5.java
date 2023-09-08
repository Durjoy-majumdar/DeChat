package com.tencent.p014mm.plugin.finder.view;

import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import rx3.C13604l;

/* renamed from: com.tencent.mm.plugin.finder.view.k5 */
public final class C30031k5 extends C4191v0 {

    /* renamed from: F */
    public static final C30032a f81274F = new C30032a((C8480h) null);

    /* renamed from: G */
    public static C13604l<Boolean, Long> f81275G = new C13604l<>(Boolean.FALSE, 0L);

    /* renamed from: com.tencent.mm.plugin.finder.view.k5$a */
    public static final class C30032a {
        public C30032a(C8480h hVar) {
        }

        /* renamed from: a */
        public final boolean mo57083a(MMFragmentActivity mMFragmentActivity) {
            C87412m.m108594g(mMFragmentActivity, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("isInShareStatus time interval:");
            long c = C31543z5.m39453c();
            C13604l<Boolean, Long> lVar = C30031k5.f81275G;
            sb.append(c - ((Number) lVar.f38556e).longValue());
            Log.m105924i("Finder.TimelineShareDialog", sb.toString());
            return ((Boolean) lVar.f38555d).booleanValue() && ((Number) lVar.f38556e).longValue() != 0 && C31543z5.m39453c() - ((Number) lVar.f38556e).longValue() < 500;
        }
    }
}
