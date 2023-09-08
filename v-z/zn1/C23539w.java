package zn1;

import kotlin.Result;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.playlist.FinderPlayListPresenter", mo125469f = "FinderPlayListPresenter.kt", mo125470l = {204}, mo125471m = "awaitCgiGetFinderCollection-IoAF18A")
/* renamed from: zn1.w */
public final class C23539w extends C66704d {

    /* renamed from: d */
    public /* synthetic */ Object f67503d;

    /* renamed from: e */
    public final /* synthetic */ C23541z f67504e;

    /* renamed from: f */
    public int f67505f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23539w(C23541z zVar, C15601d<? super C23539w> dVar) {
        super(dVar);
        this.f67504e = zVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.f67503d = obj;
        this.f67505f |= Integer.MIN_VALUE;
        Object a = C23541z.m28105a(this.f67504e, this);
        return a == C15911a.COROUTINE_SUSPENDED ? a : Result.m168113boximpl(a);
    }
}
