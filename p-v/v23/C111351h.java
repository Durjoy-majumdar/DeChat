package v23;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32227p;
import java.util.ArrayList;
import kotlin.ResultKt;
import li3.C109385a;
import rx3.C13598b0;
import sp3.C110801c;
import sp3.C110807k;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.TimelineEditorCorePlugin$updateTrackDuration$2", mo125469f = "TimelineEditorCorePlugin.kt", mo125470l = {343}, mo125471m = "invokeSuspend")
/* renamed from: v23.h */
public final class C111351h extends C91594j implements C32227p<C0000n0, C15601d<? super C110807k>, Object> {

    /* renamed from: d */
    public int f333366d;

    /* renamed from: e */
    public final /* synthetic */ long f333367e;

    /* renamed from: f */
    public final /* synthetic */ long f333368f;

    /* renamed from: g */
    public final /* synthetic */ Long f333369g;

    /* renamed from: h */
    public final /* synthetic */ C111348f f333370h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.timelineeditor.TimelineEditorCorePlugin$updateTrackDuration$2$2", mo125469f = "TimelineEditorCorePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: v23.h$a */
    public static final class C111352a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C111348f f333371d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C111352a(C111348f fVar, C15601d<? super C111352a> dVar) {
            super(2, dVar);
            this.f333371d = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111352a(this.f333371d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111352a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            this.f333371d.mo163027C();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111351h(long j, long j2, Long l, C111348f fVar, C15601d<? super C111351h> dVar) {
        super(2, dVar);
        this.f333367e = j;
        this.f333368f = j2;
        this.f333369g = l;
        this.f333370h = fVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C111351h(this.f333367e, this.f333368f, this.f333369g, this.f333370h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111351h) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList<C110801c> arrayList;
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f333366d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("MicroMsg.TimelineEditorCorePlugin", "updateTrackDuration startMs:" + this.f333367e + " endMs:" + this.f333368f);
            Long l = this.f333369g;
            if (l != null) {
                C111348f fVar = this.f333370h;
                long j = this.f333367e;
                long j2 = this.f333368f;
                l.longValue();
                C110807k kVar = fVar.f333357h;
                if (!(kVar == null || (arrayList = kVar.f331511l) == null)) {
                    for (C110801c cVar : arrayList) {
                        long j3 = cVar.f331463a;
                        if (l != null && j3 == l.longValue()) {
                            cVar.mo162368f(j);
                            cVar.mo162367e(j2);
                            fVar.mo163025A(fVar.f333356g.mo153353x(C109385a.m148548c(cVar)));
                        }
                    }
                }
            }
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C111352a aVar2 = new C111352a(this.f333370h, (C15601d<? super C111352a>) null);
            this.f333366d = 1;
            if (C53895h.m60469g(k2Var, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return this.f333370h.f333357h;
    }
}
