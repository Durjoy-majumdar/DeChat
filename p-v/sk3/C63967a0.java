package sk3;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53930o0;
import bl3.C39818r;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import f14.C58901s;
import fy3.C32227p;
import ht1.C60166f;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import p525fr.C59311b;
import rx3.C13598b0;
import te3.C64658qj1;
import te3.C64682rk1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemFinderFeedUIC$updateMatchInfo$1", mo125469f = "FTSMultiItemFinderFeedUIC.kt", mo125470l = {65}, mo125471m = "invokeSuspend")
/* renamed from: sk3.a0 */
public final class C63967a0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f181357d;

    /* renamed from: e */
    public /* synthetic */ Object f181358e;

    /* renamed from: f */
    public final /* synthetic */ ArrayList<C72963f4> f181359f;

    /* renamed from: g */
    public final /* synthetic */ C63970b0 f181360g;

    @C91590f(mo125468c = "com.tencent.mm.ui.chatting.search.multi.uic.FTSMultiItemFinderFeedUIC$updateMatchInfo$1$2", mo125469f = "FTSMultiItemFinderFeedUIC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sk3.a0$a */
    public static final class C63968a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C63970b0 f181361d;

        /* renamed from: e */
        public final /* synthetic */ List<C64658qj1> f181362e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63968a(C63970b0 b0Var, List<C64658qj1> list, C15601d<? super C63968a> dVar) {
            super(2, dVar);
            this.f181361d = b0Var;
            this.f181362e = list;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C63968a(this.f181361d, this.f181362e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C63968a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            String str = ((C64004q0) C39818r.f106831a.mo62444c(this.f181361d.getActivity()).mo75002a(C64004q0.class)).f181449f;
            C59311b bVar = this.f181361d.f181365r;
            if (bVar != null) {
                bVar.mo79132I(str, this.f181362e);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63967a0(ArrayList<C72963f4> arrayList, C63970b0 b0Var, C15601d<? super C63967a0> dVar) {
        super(2, dVar);
        this.f181359f = arrayList;
        this.f181360g = b0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C63967a0 a0Var = new C63967a0(this.f181359f, this.f181360g, dVar);
        a0Var.f181358e = obj;
        return a0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C63967a0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C68070l.C68072b u;
        C60166f fVar;
        C64682rk1 rk12;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f181357d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f181358e;
            ArrayList arrayList = new ArrayList();
            for (C72963f4 f4Var : this.f181359f) {
                if (!C53930o0.m60560g(n0Var)) {
                    Log.m105924i("MicroMsg.FTSMultiItemFinderFeedUIC", "is no active");
                    return C13598b0.f38549a;
                }
                String content = f4Var.getContent();
                if (!(content == null || (u = C68070l.C68072b.m80422u(content, (String) null)) == null || (fVar = (C60166f) u.mo93555w(C60166f.class)) == null || (rk12 = fVar.f171710b) == null)) {
                    C64658qj1 qj12 = new C64658qj1();
                    qj12.f185037d = f4Var.getMsgId();
                    qj12.f185038e = f4Var.getCreateTime();
                    qj12.f185039f = rk12;
                    arrayList.add(qj12);
                }
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C63968a aVar2 = new C63968a(this.f181360g, arrayList, (C15601d<? super C63968a>) null);
            this.f181357d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}
