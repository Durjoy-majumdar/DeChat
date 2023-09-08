package zn1;

import cm1.C0720c3;
import kotlin.Result;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter", mo125469f = "FinderPlayListDrawerPresenter.kt", mo125470l = {337}, mo125471m = "awaitCgiGetFinderTopic-gIAlu-s")
/* renamed from: zn1.m */
public final class C16329m extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f43663d;

    /* renamed from: e */
    public final /* synthetic */ C16323l f43664e;

    /* renamed from: f */
    public int f43665f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16329m(C16323l lVar, C15601d<? super C16329m> dVar) {
        super(dVar);
        this.f43664e = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f43663d = obj;
        this.f43665f |= Integer.MIN_VALUE;
        Object a = C16323l.m15171a(this.f43664e, (C0720c3) null, this);
        return a == C15911a.COROUTINE_SUSPENDED ? a : Result.m168113boximpl(a);
    }
}
