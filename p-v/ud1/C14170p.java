package ud1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import com.tencent.p014mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC;
import di3.C86312j;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.ResultKt;
import p272xq.C102712e;
import p749xh.C102666r2;
import pb1.C11883v0;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$queryFavStatus$1", mo125469f = "FinderMusicTopicHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ud1.p */
public final class C14170p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f39611d;

    /* renamed from: e */
    public final /* synthetic */ String f39612e;

    /* renamed from: f */
    public final /* synthetic */ String f39613f;

    /* renamed from: g */
    public final /* synthetic */ FinderMusicTopicHeaderUIC f39614g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.activity.music.uic.FinderMusicTopicHeaderUIC$queryFavStatus$1$1$1", mo125469f = "FinderMusicTopicHeaderUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: ud1.p$a */
    public static final class C14171a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ FinderMusicTopicHeaderUIC f39615d;

        /* renamed from: e */
        public final /* synthetic */ C102666r2 f39616e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14171a(FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, C102666r2 r2Var, C15601d<? super C14171a> dVar) {
            super(2, dVar);
            this.f39615d = finderMusicTopicHeaderUIC;
            this.f39616e = r2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C14171a(this.f39615d, this.f39616e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C14171a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f39615d;
            finderMusicTopicHeaderUIC.f12473h = true;
            finderMusicTopicHeaderUIC.f12475j = this.f39616e;
            finderMusicTopicHeaderUIC.mo2210I3();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14170p(String str, String str2, String str3, FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC, C15601d<? super C14170p> dVar) {
        super(2, dVar);
        this.f39611d = str;
        this.f39612e = str2;
        this.f39613f = str3;
        this.f39614g = finderMusicTopicHeaderUIC;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C14170p(this.f39611d, this.f39612e, this.f39613f, this.f39614g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C14170p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f39611d);
        arrayList.add(this.f39612e);
        ArrayList<C102666r2> Lf = ((C102712e) C86312j.m106911c(C102712e.class)).mo142092Lf(arrayList, new ArrayList(), 7, (List<C102666r2>) null, (Set<Integer>) null, (C11883v0) null);
        if (Lf != null) {
            String str = this.f39613f;
            FinderMusicTopicHeaderUIC finderMusicTopicHeaderUIC = this.f39614g;
            for (C102666r2 r2Var : Lf) {
                if (C87412m.m108589b(r2Var.field_sourceId, str)) {
                    C53895h.m60466d(finderMusicTopicHeaderUIC.getMainScope(), (C66212f) null, (C53934p0) null, new C14171a(finderMusicTopicHeaderUIC, r2Var, (C15601d<? super C14171a>) null), 3, (Object) null);
                    return C13598b0.f38549a;
                }
            }
        }
        return C13598b0.f38549a;
    }
}
