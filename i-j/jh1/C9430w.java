package jh1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import kotlin.ResultKt;
import nj3.C76912y0;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.milestonelottery.MileStoneVoteWidget$voteRequest$$inlined$fail$default$1", mo125469f = "MileStoneVoteWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: jh1.w */
public final class C9430w extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ C0287e f29434d;

    /* renamed from: e */
    public final /* synthetic */ C9421t f29435e;

    /* renamed from: f */
    public final /* synthetic */ C9433z f29436f;

    /* renamed from: g */
    public final /* synthetic */ String f29437g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9430w(C0287e eVar, C15601d dVar, C9421t tVar, C9433z zVar, String str) {
        super(2, dVar);
        this.f29434d = eVar;
        this.f29435e = tVar;
        this.f29436f = zVar;
        this.f29437g = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C9430w(this.f29434d, dVar, this.f29435e, this.f29436f, this.f29437g);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C9430w) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        String str = this.f29435e.f29391c;
        Log.m105924i(str, "vote " + this.f29436f.f29458h + ", " + this.f29436f.f29454d.f145527d + ", voteId:" + this.f29437g + ", failed. " + ((C0280a) ((C0281b) this.f29434d).f843b));
        C76912y0.m92767f(this.f29435e.f29389a.getContext(), this.f29435e.f29389a.getContext().getString(C0966R.string.f360610ne0));
        return C13598b0.f38549a;
    }
}
