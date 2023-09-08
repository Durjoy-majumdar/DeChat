package qj1;

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

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLiveNoticeBubble$showNoticeBigCard$1$2$1$1", mo125469f = "FinderLiveNoticeBubble.kt", mo125470l = {351, 354}, mo125471m = "invokeSuspend")
/* renamed from: qj1.wc */
public final class C12730wc extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f36468d;

    /* renamed from: e */
    public final /* synthetic */ C32224a<C49098d51> f36469e;

    /* renamed from: f */
    public final /* synthetic */ C8740e f36470f;

    /* renamed from: g */
    public final /* synthetic */ NoticeStatusView f36471g;

    /* renamed from: h */
    public final /* synthetic */ C12572oc f36472h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12730wc(C32224a<? extends C49098d51> aVar, C8740e eVar, NoticeStatusView noticeStatusView, C12572oc ocVar, C15601d<? super C12730wc> dVar) {
        super(2, dVar);
        this.f36469e = aVar;
        this.f36470f = eVar;
        this.f36471g = noticeStatusView;
        this.f36472h = ocVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C12730wc(this.f36469e, this.f36470f, this.f36471g, this.f36472h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C12730wc) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f36468d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C50523nc3 nc32 = this.f36469e.invoke().f132128q;
            boolean z = false;
            if (nc32 != null && nc32.f138532d) {
                z = true;
            }
            if (z) {
                C12925w wVar = this.f36470f.f28019t;
                if (wVar != null) {
                    wVar.mo5085n();
                }
                NoticeStatusView noticeStatusView = this.f36471g;
                this.f36468d = 1;
                if (noticeStatusView.mo5016a(1, this) == aVar) {
                    return aVar;
                }
            } else {
                NoticeStatusView noticeStatusView2 = this.f36471g;
                this.f36468d = 2;
                if (noticeStatusView2.mo5016a(1, this) == aVar) {
                    return aVar;
                }
                this.f36470f.mo9569a(this.f36471g.getUsername(), this.f36469e.invoke());
                return C13598b0.f38549a;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            this.f36470f.mo9569a(this.f36471g.getUsername(), this.f36469e.invoke());
            return C13598b0.f38549a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C12572oc.m12100b(this.f36472h, this.f36471g);
        return C13598b0.f38549a;
    }
}
