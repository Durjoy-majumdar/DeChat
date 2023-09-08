package a33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a33.C91954f;
import android.graphics.Rect;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.vlog.p117ui.video.VideoCompositionRemuxUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fh2.C97882i;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import h90.C98324b;
import ih2.C60287a;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zg2.C103020m;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI$initMediaModel$1", mo125469f = "VideoCompositionRemuxUI.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
/* renamed from: a33.i */
public final class C91960i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f263292d;

    /* renamed from: e */
    public final /* synthetic */ VideoCompositionRemuxUI f263293e;

    /* renamed from: f */
    public final /* synthetic */ List<String> f263294f;

    /* renamed from: g */
    public final /* synthetic */ List<Integer> f263295g;

    /* renamed from: h */
    public final /* synthetic */ Integer[] f263296h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI$initMediaModel$1$1", mo125469f = "VideoCompositionRemuxUI.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: a33.i$a */
    public static final class C91961a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ VideoCompositionRemuxUI f263297d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91961a(VideoCompositionRemuxUI videoCompositionRemuxUI, C15601d<? super C91961a> dVar) {
            super(2, dVar);
            this.f263297d = videoCompositionRemuxUI;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C91961a(this.f263297d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C91961a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C103020m mVar = C103020m.f303985a;
            C103020m.f303988d.set(this.f263297d.f282731g.f263262g);
            VideoCompositionRemuxUI videoCompositionRemuxUI = this.f263297d;
            Log.m105924i(videoCompositionRemuxUI.f282729e, "startRemux in main");
            if (!videoCompositionRemuxUI.f282731g.mo125807c()) {
                Log.m105920e(videoCompositionRemuxUI.f282729e, "size is not valid,return this click");
            } else if (videoCompositionRemuxUI.f282731g.f263265j.f282570c.isEmpty()) {
                Log.m105920e(videoCompositionRemuxUI.f282729e, "composition track is empty");
            } else {
                C98324b bVar = videoCompositionRemuxUI.f282733i;
                C87412m.m108591d(bVar);
                int i = bVar.f288183d;
                C98324b bVar2 = videoCompositionRemuxUI.f282733i;
                C87412m.m108591d(bVar2);
                int i2 = bVar2.f288184e;
                float[] fArr = {0.0f, 0.0f, (float) C60287a.f171906a, (float) C60287a.f171907b};
                Rect rect = C103020m.f303988d;
                C97882i iVar = new C97882i(false, (AudioCacheInfo) null, (ArrayList) null, (ArrayList) null, fArr, i, i2, (ArrayList) null, (String) null, new float[]{(float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom}, 399, (C8480h) null);
                String str = videoCompositionRemuxUI.f282729e;
                Log.m105924i(str, "edit config: " + iVar);
                C91957h hVar = videoCompositionRemuxUI.f282730f;
                if (hVar != null) {
                    C98324b bVar3 = videoCompositionRemuxUI.f282733i;
                    C87412m.m108591d(bVar3);
                    RecordConfigProvider recordConfigProvider = videoCompositionRemuxUI.f282732h;
                    C87412m.m108591d(recordConfigProvider);
                    hVar.mo125815c(bVar3, recordConfigProvider);
                }
                C91957h hVar2 = videoCompositionRemuxUI.f282730f;
                if (hVar2 != null) {
                    hVar2.mo125817f(iVar, videoCompositionRemuxUI.f282731g);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91960i(VideoCompositionRemuxUI videoCompositionRemuxUI, List<String> list, List<Integer> list2, Integer[] numArr, C15601d<? super C91960i> dVar) {
        super(2, dVar);
        this.f263293e = videoCompositionRemuxUI;
        this.f263294f = list;
        this.f263295g = list2;
        this.f263296h = numArr;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C91960i(this.f263293e, this.f263294f, this.f263295g, this.f263296h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C91960i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f263292d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i(this.f263293e.f282729e, "in IO to init MediaModel");
            this.f263293e.f282731g.mo125810f(this.f263294f, this.f263295g, C110823p.m151001a0(this.f263296h));
            this.f263293e.f282731g.mo125809e(C91954f.C91955a.FIT_CENTER);
            this.f263293e.f282731g.mo125806b();
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C91961a aVar2 = new C91961a(this.f263293e, (C15601d<? super C91961a>) null);
            this.f263292d = 1;
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
