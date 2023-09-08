package ke1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.life.SupportLifecycle;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import f40.C86709a0;
import gy3.C87412m;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import je1.C9360p1;
import jp3.C46566c;
import jp3.C9486a;
import os1.C11739f;
import pe3.C89349b;
import te3.C49712hj1;
import tf1.C13922r;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ke1.x */
public final class C9610x extends SupportLifecycle {

    /* renamed from: g */
    public final int f29912g;

    /* renamed from: h */
    public final C49712hj1 f29913h;

    /* renamed from: i */
    public C9603s f29914i;

    /* renamed from: j */
    public C46566c<C9486a> f29915j = new C46566c<>();

    /* renamed from: n */
    public final C0000n0 f29916n;

    /* renamed from: o */
    public final int f29917o;

    /* renamed from: p */
    public volatile boolean f29918p;

    /* renamed from: q */
    public final C11739f f29919q;

    /* renamed from: r */
    public final C11739f.C11740a f29920r;

    /* renamed from: s */
    public volatile boolean f29921s;

    /* renamed from: t */
    public volatile int f29922t;

    /* renamed from: u */
    public final String f29923u;

    public C9610x(int i, C49712hj1 hj12, C9603s sVar) {
        this.f29912g = i;
        this.f29913h = hj12;
        this.f29914i = sVar;
        C13922r rVar = null;
        this.f29916n = C53930o0.m60554a(((C53884f2) C53959v2.m60598a((C53973z1) null, 1, (Object) null)).plus(C53872d1.f151119c));
        C9603s sVar2 = this.f29914i;
        this.f29917o = sVar2 != null ? sVar2.f29876i : 0;
        String valueOf = String.valueOf(i);
        rVar = true & true ? C13922r.NORMAL : rVar;
        valueOf = true & true ? "" : valueOf;
        C87412m.m108594g(rVar, "policy");
        C87412m.m108594g(valueOf, "name");
        new ReentrantLock().newCondition();
        new LinkedList();
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        C11739f fVar = (C11739f) a;
        this.f29919q = fVar;
        this.f29920r = fVar.mo11600c3(i);
        this.f29923u = "Finder.TimelineFeedFetcher#" + i;
    }

    /* renamed from: y1 */
    public static void m9284y1(C9610x xVar, C9360p1.C9361a aVar, int i, C9360p1.C9362b bVar, C89349b bVar2, boolean z, boolean z2, List list, int i2, Object obj) {
        C89349b bVar3;
        C9610x xVar2 = xVar;
        C9360p1.C9361a aVar2 = aVar;
        int i3 = (i2 & 2) != 0 ? 0 : i;
        Integer num = null;
        C9360p1.C9362b bVar4 = (i2 & 4) != 0 ? null : bVar;
        C89349b bVar5 = (i2 & 8) != 0 ? null : bVar2;
        boolean z3 = (i2 & 16) != 0 ? false : z;
        boolean z4 = (i2 & 32) != 0 ? false : z2;
        xVar.getClass();
        C87412m.m108594g(aVar2, "callback");
        String str = xVar2.f29923u;
        Log.m105924i(str, "[fetch] pullType=" + i3 + " tabType=" + xVar2.f29912g + " isPreloadMore=" + z3 + ", isGetHistory=" + xVar2.f29918p + " tabStateVM=" + xVar2.f29919q.hashCode() + " isAtAppPush=" + xVar2.f29920r.f34377j);
        C9604t tVar = new C9604t(aVar2);
        if (i3 == 0 || i3 == 1) {
            xVar2.f29918p = false;
        }
        boolean z5 = bVar5 == null;
        if (z5) {
            String str2 = xVar2.f29923u;
            Log.m105924i(str2, "[innerFetch] use tabType=" + xVar2.f29912g + " GlobalLastBuffer");
            if (i3 == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C58784w3.f168295a.mo83914a0(xVar2.f29912g), (Object) null);
            }
            Object f = C86709a0.m107535s().mo121142i().mo119685f(C58784w3.f168295a.mo83914a0(xVar2.f29912g), "");
            C87412m.m108592e(f, "null cannot be cast to non-null type kotlin.String");
            bVar3 = C89349b.m111674a(Util.decodeHexString((String) f));
        } else {
            bVar3 = bVar5;
        }
        String str3 = xVar2.f29923u;
        StringBuilder sb = new StringBuilder();
        sb.append("innerFetch: lastBufferSize=");
        if (bVar3 != null) {
            num = Integer.valueOf(bVar3.f257327a.length);
        }
        sb.append(num);
        sb.append(", lastBuffer=");
        sb.append(bVar3 == null ? "null" : MD5Util.getMD5String(bVar3.f257327a));
        Log.m105924i(str3, sb.toString());
        C53895h.m60466d(xVar2.f29916n, (C66212f) null, (C53934p0) null, new C9608w(xVar, i3, bVar3, list, z4, bVar4, z5, tVar, (C15601d<? super C9608w>) null), 3, (Object) null);
    }
}
