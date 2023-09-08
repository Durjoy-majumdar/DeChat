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

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoByWorkTagId$2", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {23}, mo125471m = "invokeSuspend")
/* renamed from: b33.b */
public final class C92172b extends C91594j implements C32227p<C0000n0, C15601d<? super Long>, Object> {

    /* renamed from: d */
    public Object f263810d;

    /* renamed from: e */
    public int f263811e;

    /* renamed from: f */
    public final /* synthetic */ String f263812f;

    /* renamed from: g */
    public final /* synthetic */ VideoCompositionPlayView f263813g;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoByWorkTagId$2$1", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {26}, mo125471m = "invokeSuspend")
    /* renamed from: b33.b$a */
    public static final class C92173a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f263814d;

        /* renamed from: e */
        public final /* synthetic */ C45983e0 f263815e;

        /* renamed from: f */
        public final /* synthetic */ C102651h0 f263816f;

        /* renamed from: g */
        public final /* synthetic */ VideoCompositionPlayView f263817g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.play.SnsFakeVideoPlayManager$playFakeVideoByWorkTagId$2$1$1", mo125469f = "SnsFakeVideoPlayManager.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: b33.b$a$a */
        public static final class C92174a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C45983e0 f263818d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92174a(C45983e0 e0Var, C15601d<? super C92174a> dVar) {
                super(2, dVar);
                this.f263818d = e0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C92174a(this.f263818d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C92174a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C92176d dVar = C92175c.f263820b.get(new Long(this.f263818d.f124000d));
                if (dVar == null) {
                    return null;
                }
                dVar.mo126135a();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92173a(C45983e0 e0Var, C102651h0 h0Var, VideoCompositionPlayView videoCompositionPlayView, C15601d<? super C92173a> dVar) {
            super(2, dVar);
            this.f263815e = e0Var;
            this.f263816f = h0Var;
            this.f263817g = videoCompositionPlayView;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92173a(this.f263815e, this.f263816f, this.f263817g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92173a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f263814d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: true, action: 2");
                SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f266021d = 2;
                snsFakeVideoLogStruct.f266030m = 1;
                snsFakeVideoLogStruct.mo86054n();
                C45983e0 e0Var = this.f263815e;
                C92175c cVar = C92175c.f263819a;
                byte[] bArr = this.f263816f.field_composition_info;
                C87412m.m108593f(bArr, "info.field_composition_info");
                e0Var.f124000d = cVar.mo126134a(bArr, this.f263817g, false);
                C53896h0 h0Var = C53872d1.f151119c;
                C92174a aVar2 = new C92174a(this.f263815e, (C15601d<? super C92174a>) null);
                this.f263814d = 1;
                if (C53895h.m60469g(h0Var, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C92176d dVar = C92175c.f263820b.get(new Long(this.f263815e.f124000d));
            if (dVar == null) {
                return null;
            }
            dVar.f263821a.mo79510k(dVar.f263824d.mo134611h());
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92172b(String str, VideoCompositionPlayView videoCompositionPlayView, C15601d<? super C92172b> dVar) {
        super(2, dVar);
        this.f263812f = str;
        this.f263813g = videoCompositionPlayView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C92172b(this.f263812f, this.f263813g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C92172b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C45983e0 e0Var;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f263811e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideo >> workTagId: " + this.f263812f);
            C102651h0 d = C97826d.f286974a.mo137161d(this.f263812f);
            if ((d != null ? d.field_composition_info : null) != null) {
                C45983e0 e0Var2 = new C45983e0();
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C92173a aVar2 = new C92173a(e0Var2, d, this.f263813g, (C15601d<? super C92173a>) null);
                this.f263810d = e0Var2;
                this.f263811e = 1;
                if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                    return aVar;
                }
                e0Var = e0Var2;
            } else {
                Log.m105924i("MicroMsg.FakeVideoTecReporter", "FakeVideoTecReporter >> isSuccess: " + false + ", action: " + 2);
                SnsFakeVideoLogStruct snsFakeVideoLogStruct = new SnsFakeVideoLogStruct();
                snsFakeVideoLogStruct.f266021d = 2;
                snsFakeVideoLogStruct.f266030m = 2;
                snsFakeVideoLogStruct.mo86054n();
                Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> workTagId: " + this.f263812f + " no in db");
                return new Long(-1);
            }
        } else if (i == 1) {
            e0Var = (C45983e0) this.f263810d;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Log.m105924i("MicroMsg.SnsFakeVideoPlayManager", "playFakeVideoByWorkTagId >> id = " + e0Var.f124000d);
        return new Long(e0Var.f124000d);
    }
}
