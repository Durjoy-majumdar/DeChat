package cm1;

import gy3.C8480h;
import gy3.C87412m;
import java.util.concurrent.ConcurrentLinkedQueue;
import jq3.C60898l;
import te3.C48878bm1;
import tf1.C13914m;

/* renamed from: cm1.n0 */
public final class C0755n0 extends C60898l.C60899a implements C13914m {

    /* renamed from: d */
    public final C0735h f1776d;

    /* renamed from: e */
    public final C0709a2 f1777e;

    /* renamed from: f */
    public final ConcurrentLinkedQueue<C55014f> f1778f;

    /* renamed from: g */
    public C0737h2 f1779g;

    public C0755n0(C0735h hVar, C0709a2 a2Var, ConcurrentLinkedQueue concurrentLinkedQueue, C0737h2 h2Var, int i, C8480h hVar2) {
        h2Var = (i & 8) != 0 ? new C0737h2(0, -1, (C48878bm1) null, 4, (C8480h) null) : h2Var;
        C87412m.m108594g(hVar, "msgNotifyData");
        C87412m.m108594g(a2Var, "privateMsgNotifyData");
        C87412m.m108594g(concurrentLinkedQueue, "commentFailedNotifyDataList");
        C87412m.m108594g(h2Var, "friendTabLikeTipsState");
        this.f1776d = hVar;
        this.f1777e = a2Var;
        this.f1778f = concurrentLinkedQueue;
        this.f1779g = h2Var;
    }

    /* renamed from: c */
    public int mo75c() {
        return 2019;
    }

    /* renamed from: f */
    public int mo76f(C13914m mVar) {
        C87412m.m108594g(mVar, "obj");
        return Integer.MAX_VALUE;
    }

    public long getItemId() {
        return (long) hashCode();
    }
}
