package vb2;

import a14.C0000n0;
import c14.C54624g;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.p081mv.p082ui.widget.MvFrameListView;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45253g;
import d14.C58022c;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.ResultKt;
import rb2.C63380a;
import rx3.C13598b0;
import u23.C65003a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mv.ui.widget.MvFrameListView$setTrackInfo$1", mo125469f = "MvFrameListView.kt", mo125470l = {68}, mo125471m = "invokeSuspend")
/* renamed from: vb2.a */
public final class C65562a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f188641d;

    /* renamed from: e */
    public final /* synthetic */ C63380a f188642e;

    /* renamed from: f */
    public final /* synthetic */ C65003a f188643f;

    /* renamed from: g */
    public final /* synthetic */ MvFrameListView f188644g;

    /* renamed from: vb2.a$a */
    public static final class C65563a<T> implements C45253g {

        /* renamed from: d */
        public final /* synthetic */ C65003a f188645d;

        /* renamed from: e */
        public final /* synthetic */ MvFrameListView f188646e;

        public C65563a(C65003a aVar, MvFrameListView mvFrameListView) {
            this.f188645d = aVar;
            this.f188646e = mvFrameListView;
        }

        public Object emit(Object obj, C15601d dVar) {
            long longValue = ((Number) obj).longValue();
            Log.m105924i("MicroMsg.MvFrameListView", this.f188645d + " receives " + longValue);
            this.f188646e.postInvalidate();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65562a(C63380a aVar, C65003a aVar2, MvFrameListView mvFrameListView, C15601d<? super C65562a> dVar) {
        super(2, dVar);
        this.f188642e = aVar;
        this.f188643f = aVar2;
        this.f188644g = mvFrameListView;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C65562a(this.f188642e, this.f188643f, this.f188644g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C65562a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f188641d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C63380a aVar2 = this.f188642e;
            C65003a aVar3 = this.f188643f;
            aVar2.getClass();
            C87412m.m108594g(aVar3, FFmpegMetadataRetriever.METADATA_KEY_TRACK);
            C58022c cVar = new C58022c(aVar2.mo88287a(aVar3).f179788e.mo75552e(), false, (C66212f) null, 0, (C54624g) null, 28, (C8480h) null);
            C65563a aVar4 = new C65563a(this.f188643f, this.f188644g);
            this.f188641d = 1;
            if (cVar.mo31880a(aVar4, this) == aVar) {
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
