package b33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import f14.C58901s;
import f33.C97826d;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C87412m;
import kotlin.ResultKt;
import p749xh.C102651h0;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoBySnsLocalId$2", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {44}, mo125471m = "invokeSuspend")
/* renamed from: b33.a */
public final class C92169a extends C91594j implements C32227p<C0000n0, C15601d<? super Long>, Object> {

    /* renamed from: d */
    public Object f263798d;

    /* renamed from: e */
    public int f263799e;

    /* renamed from: f */
    public final /* synthetic */ int f263800f;

    /* renamed from: g */
    public final /* synthetic */ boolean f263801g;

    /* renamed from: h */
    public final /* synthetic */ int f263802h;

    /* renamed from: i */
    public final /* synthetic */ VideoCompositionPlayView f263803i;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoBySnsLocalId$2$1", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {47}, mo125471m = "invokeSuspend")
    /* renamed from: b33.a$a */
    public static final class C92170a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f263804d;

        /* renamed from: e */
        public final /* synthetic */ C45983e0 f263805e;

        /* renamed from: f */
        public final /* synthetic */ C102651h0 f263806f;

        /* renamed from: g */
        public final /* synthetic */ VideoCompositionPlayView f263807g;

        /* renamed from: h */
        public final /* synthetic */ boolean f263808h;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoBySnsLocalId$2$1$1", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: b33.a$a$a */
        public static final class C92171a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C45983e0 f263809d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92171a(C45983e0 e0Var, C15601d<? super C92171a> dVar) {
                super(2, dVar);
                this.f263809d = e0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C92171a(this.f263809d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C92171a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C92176d dVar = C92175c.f263820b.get(new Long(this.f263809d.f124000d));
                if (dVar == null) {
                    return null;
                }
                dVar.mo126135a();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92170a(C45983e0 e0Var, C102651h0 h0Var, VideoCompositionPlayView videoCompositionPlayView, boolean z, C15601d<? super C92170a> dVar) {
            super(2, dVar);
            this.f263805e = e0Var;
            this.f263806f = h0Var;
            this.f263807g = videoCompositionPlayView;
            this.f263808h = z;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92170a(this.f263805e, this.f263806f, this.f263807g, this.f263808h, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92170a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f263804d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: true, action: 1");
                SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f266021d = 1;
                snsFakeVideoLogStruct.f266030m = 1;
                snsFakeVideoLogStruct.mo86054n();
                C45983e0 e0Var = this.f263805e;
                C92175c cVar = C92175c.f263819a;
                byte[] bArr = this.f263806f.field_composition_info;
                C87412m.m108593f(bArr, "info.field_composition_info");
                e0Var.f124000d = cVar.mo126134a(bArr, this.f263807g, this.f263808h);
                C53896h0 h0Var = C53872d1.f151119c;
                C92171a aVar2 = new C92171a(this.f263805e, (C15601d<? super C92171a>) null);
                this.f263804d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C92176d dVar = C92175c.f263820b.get(new Long(this.f263805e.f124000d));
            if (dVar == null) {
                return null;
            }
            dVar.f263821a.mo79510k(dVar.f263824d.mo134611h());
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92169a(int i, boolean z, int i2, VideoCompositionPlayView videoCompositionPlayView, C15601d<? super C92169a> dVar) {
        super(2, dVar);
        this.f263800f = i;
        this.f263801g = z;
        this.f263802h = i2;
        this.f263803i = videoCompositionPlayView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92169a(this.f263800f, this.f263801g, this.f263802h, this.f263803i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92169a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C45983e0 e0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f263799e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideo >> snsLocalId: " + this.f263800f + ", isMute: " + this.f263801g + ", snsCreateTime: " + this.f263802h);
            C102651h0 c = C97826d.f286974a.mo137160c(this.f263800f, this.f263802h);
            if ((c != null ? c.field_composition_info : null) != null) {
                C45983e0 e0Var2 = new C45983e0();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C92170a aVar2 = new C92170a(e0Var2, c, this.f263803i, this.f263801g, (C15601d<? super C92170a>) null);
                this.f263798d = e0Var2;
                this.f263799e = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
                e0Var = e0Var2;
            } else {
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: " + false + ", action: " + 1);
                SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f266021d = 1;
                snsFakeVideoLogStruct.f266030m = 2;
                snsFakeVideoLogStruct.mo86054n();
                Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> snsLocalId: " + this.f263800f + " no in db");
                return new Long(-1);
            }
        } else if (i == 1) {
            e0Var = (C45983e0) this.f263798d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoBySnsLocalId >> id = " + e0Var.f124000d);
        return new Long(e0Var.f124000d);
    }
}
