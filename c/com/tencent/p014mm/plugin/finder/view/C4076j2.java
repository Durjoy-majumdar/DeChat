package com.tencent.p014mm.plugin.finder.view;

import a14.C0000n0;
import com.tencent.p014mm.plugin.finder.view.notice.NoticeStatusView;
import fy3.C32224a;
import fy3.C32227p;
import hs1.C8740e;
import kotlin.ResultKt;
import qo3.C12925w;
import rx3.C13598b0;
import te3.C49098d51;
import te3.C50523nc3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.view.FinderFeedLiveNoticeView$showNoticeBigCard$1$1$2$1$1", mo125469f = "FinderFeedLiveNoticeView.kt", mo125470l = {105, 108}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.finder.view.j2 */
public final class C4076j2 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f18203d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C49098d51> f18204e;

    /* renamed from: f */
    public final /* synthetic */ C8740e f18205f;

    /* renamed from: g */
    public final /* synthetic */ NoticeStatusView f18206g;

    /* renamed from: h */
    public final /* synthetic */ FinderFeedLiveNoticeView f18207h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4076j2(C32224a<? extends C49098d51> aVar, C8740e eVar, NoticeStatusView noticeStatusView, FinderFeedLiveNoticeView finderFeedLiveNoticeView, C15601d<? super C4076j2> dVar) {
        super(2, dVar);
        this.f18204e = aVar;
        this.f18205f = eVar;
        this.f18206g = noticeStatusView;
        this.f18207h = finderFeedLiveNoticeView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C4076j2(this.f18204e, this.f18205f, this.f18206g, this.f18207h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C4076j2) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f18203d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C50523nc3 nc32 = this.f18204e.invoke().f132128q;
            boolean z = false;
            if (nc32 != null && nc32.f138532d) {
                z = true;
            }
            if (z) {
                C12925w wVar = this.f18205f.f28019t;
                if (wVar != null) {
                    wVar.mo5085n();
                }
                NoticeStatusView noticeStatusView = this.f18206g;
                this.f18203d = 1;
                if (noticeStatusView.mo5016a(1, this) == aVar) {
                    return aVar;
                }
            } else {
                NoticeStatusView noticeStatusView2 = this.f18206g;
                this.f18203d = 2;
                if (noticeStatusView2.mo5016a(1, this) == aVar) {
                    return aVar;
                }
                this.f18205f.mo9569a(this.f18206g.getUsername(), this.f18204e.invoke());
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            this.f18205f.mo9569a(this.f18206g.getUsername(), this.f18204e.invoke());
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        FinderFeedLiveNoticeView.m4157a(this.f18207h);
        return C13598b0.f38549a;
    }
}
