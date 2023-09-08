package a33;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a33.C91954f;
import android.os.Bundle;
import android.widget.TextView;
import com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider;
import com.tencent.p014mm.plugin.vlog.model.C96552p0;
import com.tencent.p014mm.plugin.vlog.p117ui.video.EditorVideoCompositionPluginLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import f14.C58901s;
import fy3.C32227p;
import gy3.C87412m;
import h90.C98324b;
import i72.C98609j;
import java.util.List;
import kotlin.ResultKt;
import p206nj.C100115c;
import qh2.C101198e;
import rx3.C13598b0;
import sx3.C110823p;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zg2.C103020m;

@C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout$setupMediaData$1", mo125469f = "EditorVideoCompositionPluginLayout.kt", mo125470l = {153}, mo125471m = "invokeSuspend")
/* renamed from: a33.e */
public final class C91952e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f263250d;

    /* renamed from: e */
    public final /* synthetic */ EditorVideoCompositionPluginLayout f263251e;

    /* renamed from: f */
    public final /* synthetic */ List<String> f263252f;

    /* renamed from: g */
    public final /* synthetic */ List<Integer> f263253g;

    /* renamed from: h */
    public final /* synthetic */ Integer[] f263254h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout$setupMediaData$1$1", mo125469f = "EditorVideoCompositionPluginLayout.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: a33.e$a */
    public static final class C91953a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ EditorVideoCompositionPluginLayout f263255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C91953a(EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, C15601d<? super C91953a> dVar) {
            super(2, dVar);
            this.f263255d = editorVideoCompositionPluginLayout;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C91953a(this.f263255d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C91953a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C103020m.f303988d.set(this.f263255d.getMediaModel().f263262g);
            C91950d previewNewPlugin = this.f263255d.getPreviewNewPlugin();
            C98324b captureInfo = this.f263255d.getCaptureInfo();
            C87412m.m108591d(captureInfo);
            RecordConfigProvider configProvider = this.f263255d.getConfigProvider();
            previewNewPlugin.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("start preview ");
            sb.append(captureInfo);
            sb.append(' ');
            VideoCompositionPlayView videoCompositionPlayView = previewNewPlugin.f263236d;
            sb.append(videoCompositionPlayView != null ? Integer.valueOf(videoCompositionPlayView.hashCode()) : null);
            Log.m105924i("MicroMsg.EditVideoPreviewPlugin", sb.toString());
            previewNewPlugin.f263241i = captureInfo;
            previewNewPlugin.f263242j = configProvider != null ? configProvider.f272935w : 10000;
            if (previewNewPlugin.f263236d == null) {
                previewNewPlugin.f263236d = new VideoCompositionPlayView(previewNewPlugin.f263239g);
            }
            previewNewPlugin.f263247r = true;
            VideoCompositionPlayView videoCompositionPlayView2 = previewNewPlugin.f263236d;
            C100115c cVar = new C100115c(videoCompositionPlayView2 != null ? videoCompositionPlayView2.getContext() : null);
            previewNewPlugin.f263240h = cVar;
            cVar.mo139415b();
            VideoCompositionPlayView videoCompositionPlayView3 = previewNewPlugin.f263236d;
            if (videoCompositionPlayView3 != null) {
                videoCompositionPlayView3.setVisibility(0);
            }
            VideoCompositionPlayView videoCompositionPlayView4 = previewNewPlugin.f263236d;
            if (videoCompositionPlayView4 != null) {
                videoCompositionPlayView4.setPlayerCallback(previewNewPlugin.f263248s);
            }
            previewNewPlugin.f263244o = captureInfo.f288183d;
            previewNewPlugin.f263245p = captureInfo.f288184e;
            TextView textView = previewNewPlugin.f263238f;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = previewNewPlugin.f263238f;
            if (textView2 != null && WeChatEnvironment.hasDebugger()) {
                C98609j.f289118a.postToWorker(new C91949c(previewNewPlugin, textView2));
            }
            C91954f fVar = previewNewPlugin.f263246q;
            C96552p0 p0Var = fVar != null ? fVar.f263265j : null;
            VideoCompositionPlayView videoCompositionPlayView5 = previewNewPlugin.f263236d;
            if (videoCompositionPlayView5 != null) {
                C87412m.m108591d(p0Var);
                videoCompositionPlayView5.mo79510k(p0Var.mo134611h());
            }
            Bundle bundle = new Bundle();
            if (previewNewPlugin.f263245p - previewNewPlugin.f263244o > previewNewPlugin.f263242j + 750) {
                bundle.putBoolean("PARAM_VIDEO_NEED_CROP", true);
            }
            previewNewPlugin.f263237e.mo14585p(C101198e.C101199b.EDIT_VIDEO_PREPARE, bundle);
            int i = previewNewPlugin.f263245p - previewNewPlugin.f263244o;
            int i2 = previewNewPlugin.f263242j;
            if (i > i2 + 750) {
                previewNewPlugin.f263245p = i2 + 250;
                C101198e.C62622a.m73576a(previewNewPlugin.f263237e, C101198e.C101199b.EDIT_FORCE_CROP_VIDEO, (Bundle) null, 2, (Object) null);
            }
            this.f263255d.mo134646o();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91952e(EditorVideoCompositionPluginLayout editorVideoCompositionPluginLayout, List<String> list, List<Integer> list2, Integer[] numArr, C15601d<? super C91952e> dVar) {
        super(2, dVar);
        this.f263251e = editorVideoCompositionPluginLayout;
        this.f263252f = list;
        this.f263253g = list2;
        this.f263254h = numArr;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C91952e(this.f263251e, this.f263252f, this.f263253g, this.f263254h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C91952e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f263250d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f263251e.getMediaModel().mo125810f(this.f263252f, this.f263253g, C110823p.m151001a0(this.f263254h));
            this.f263251e.getMediaModel().mo125809e(C91954f.C91955a.FIT_CENTER);
            this.f263251e.getMediaModel().mo125806b();
            C53896h0 h0Var = C53872d1.f151117a;
            C53915k2 k2Var = C58901s.f168555a;
            C91953a aVar2 = new C91953a(this.f263251e, (C15601d<? super C91953a>) null);
            this.f263250d = 1;
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
