package kf1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64629pl1;
import tf1.C13914m;

/* renamed from: kf1.k9 */
public final class C9833k9 implements C0740i2 {

    /* renamed from: d */
    public C64629pl1 f30387d;

    /* renamed from: e */
    public final int f30388e;

    /* renamed from: f */
    public LinkedList<BaseFinderFeed> f30389f;

    /* renamed from: g */
    public long f30390g = C31543z5.m39453c();

    /* renamed from: h */
    public int f30391h;

    public C9833k9(C64629pl1 pl12, int i, LinkedList<BaseFinderFeed> linkedList) {
        C87412m.m108594g(pl12, "card");
        C87412m.m108594g(linkedList, "rvFeedList");
        this.f30387d = pl12;
        this.f30388e = i;
        this.f30389f = linkedList;
        Log.m105924i("FinderStreamCardFeed", "#init");
        this.f30391h = -1;
    }

    /* renamed from: c */
    public int mo75c() {
        int i = this.f30388e;
        if (i == 0) {
            return 2010;
        }
        if (i != 2) {
            return i != 4 ? 0 : 4;
        }
        return 2013;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        if (!(mVar instanceof C64629pl1)) {
            return -1;
        }
        C64629pl1 pl12 = (C64629pl1) mVar;
        long j = pl12.f184840d;
        C64629pl1 pl13 = this.f30387d;
        return (j == pl13.f184840d && pl12.f184847n == pl13.f184847n) ? 0 : -1;
    }

    public long getItemId() {
        return this.f30387d.f184854u;
    }
}
