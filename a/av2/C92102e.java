package av2;

import a14.C0000n0;
import android.content.Context;
import android.view.View;
import av2.C92094a;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$k;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$l;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$m;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gq0.C107885g0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import iq0.C98783b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C109033l0;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1", mo125469f = "AppBrandOpenMaterials_FlipView.kt", mo125470l = {84}, mo125471m = "invokeSuspend")
/* renamed from: av2.e */
public final class C92102e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f263669d;

    /* renamed from: e */
    public final /* synthetic */ FlipView f263670e;

    /* renamed from: f */
    public final /* synthetic */ C92094a.C92097e f263671f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f263672g;

    /* renamed from: av2.e$a */
    public static final class C92103a implements C92094a.C92095b {

        /* renamed from: a */
        public final /* synthetic */ C77407n f263673a;

        public C92103a(C77407n nVar) {
            this.f263673a = nVar;
        }

        public final C77407n provide() {
            SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$1");
            C77407n nVar = this.f263673a;
            SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$1");
            return nVar;
        }
    }

    /* renamed from: av2.e$b */
    public static final class C92104b implements C92094a.C92096d {

        /* renamed from: a */
        public final /* synthetic */ FlipView f263674a;

        public C92104b(FlipView flipView) {
            this.f263674a = flipView;
        }

        public final String provide() {
            SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
            String currentMaterialPath = this.f263674a.getCurrentMaterialPath();
            SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
            return currentMaterialPath;
        }
    }

    /* renamed from: av2.e$c */
    public static final class C92105c implements C92094a.C54340c.C54341a {

        /* renamed from: a */
        public final /* synthetic */ FlipView f263675a;

        /* renamed from: av2.e$c$a */
        public static final class C92106a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FlipView f263676d;

            /* renamed from: e */
            public final /* synthetic */ FlipView$$l f263677e;

            /* renamed from: f */
            public final /* synthetic */ FlipView$$m f263678f;

            /* renamed from: g */
            public final /* synthetic */ C15601d<Boolean> f263679g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92106a(FlipView flipView, FlipView$$l flipView$$l, FlipView$$m flipView$$m, C15601d<? super Boolean> dVar) {
                super(1);
                this.f263676d = flipView;
                this.f263677e = flipView$$l;
                this.f263678f = flipView$$m;
                this.f263679g = dVar;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                this.f263676d.mo132155p(this.f263677e);
                FlipView flipView = this.f263676d;
                FlipView$$m flipView$$m = this.f263678f;
                flipView.getClass();
                SnsMethodCalculate.markStartTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                List<FlipView$$m> list = flipView.f276787P;
                if (list == null) {
                    SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                } else {
                    ((ArrayList) list).remove(flipView$$m);
                    if (((ArrayList) flipView.f276787P).isEmpty()) {
                        flipView.f276787P = null;
                    }
                    SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                }
                this.f263679g.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(booleanValue)));
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                return b0Var;
            }
        }

        /* renamed from: av2.e$c$b */
        public static final class C92107b implements FlipView$$l {

            /* renamed from: a */
            public final /* synthetic */ String f263680a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263681b;

            public C92107b(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                this.f263680a = str;
                this.f263681b = f0Var;
            }

            /* renamed from: a */
            public final void mo126096a(String str) {
                SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$mediaChangeListener$1");
                Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, mediaPath: " + str);
                if (!C87412m.m108589b(str, this.f263680a)) {
                    ((C32226l) this.f263681b.f27484d).invoke(Boolean.FALSE);
                }
                SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$mediaChangeListener$1");
            }
        }

        /* renamed from: av2.e$c$c */
        public static final class C92108c extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C92108c f263682d = new C92108c();

            public C92108c() {
                super(1);
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                return b0Var;
            }
        }

        /* renamed from: av2.e$c$d */
        public static final class C92109d implements FlipView$$m {

            /* renamed from: a */
            public final /* synthetic */ String f263683a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263684b;

            /* renamed from: c */
            public final /* synthetic */ C109033l0 f263685c;

            public C92109d(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var, C109033l0 l0Var) {
                this.f263683a = str;
                this.f263684b = f0Var;
                this.f263685c = l0Var;
            }

            /* renamed from: s */
            public final void mo126097s(String str, List<ImageQBarDataBean> list) {
                SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "onCodeScanned, mediaPath: " + str);
                if (!C87412m.m108589b(str, this.f263683a)) {
                    SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    return;
                }
                ((C32226l) this.f263684b.f27484d).invoke(Boolean.valueOf(this.f263685c.mo158320Qh(list)));
                SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
            }
        }

        public C92105c(FlipView flipView) {
            this.f263675a = flipView;
        }

        /* renamed from: a */
        public Object mo75114a(C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super Boolean> dVar) {
            SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            FlipView flipView = this.f263675a;
            C66218h hVar = new C66218h(C66447b.m78392b(dVar));
            if (fVar.mo126095b().mo126090b() != C98783b.SNS_IMAGE) {
                Result.Companion companion = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
            } else {
                String str = fVar.mo126095b().mo126089a().f267606f;
                C87412m.m108593f(str, "params.materialInfo.model.materialPath");
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = C92108c.f263682d;
                C92107b bVar = new C92107b(str, f0Var);
                C92109d dVar2 = new C92109d(str, f0Var, l0Var);
                f0Var.f27484d = new C92106a(flipView, bVar, dVar2, hVar);
                flipView.mo132135e(bVar);
                SnsMethodCalculate.markStartTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                if (flipView.f276787P == null) {
                    flipView.f276787P = new ArrayList();
                }
                ((ArrayList) flipView.f276787P).add(dVar2);
                SnsMethodCalculate.markEndTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            }
            Object b = hVar.mo90314b();
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return b;
        }

        /* renamed from: c */
        public Boolean mo75115c(C109033l0 l0Var, C92094a.C92098f fVar) {
            SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            C87412m.m108594g(l0Var, "openMaterialService");
            C87412m.m108594g(fVar, "params");
            if (fVar.mo126095b().mo126090b() != C98783b.SNS_IMAGE) {
                Boolean bool = Boolean.TRUE;
                SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                return bool;
            }
            List<ImageQBarDataBean> i = this.f263675a.mo132148i(fVar.mo126095b().mo126089a().f267606f);
            if (i == null) {
                SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                return null;
            }
            Boolean valueOf = Boolean.valueOf(l0Var.mo158320Qh(i));
            SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return valueOf;
        }

        public String getName() {
            SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
            return "FlipView$Fetch";
        }
    }

    /* renamed from: av2.e$d */
    public static final class C92110d implements C92094a.C54340c.C54341a {

        /* renamed from: a */
        public final /* synthetic */ FlipView f263686a;

        /* renamed from: av2.e$d$a */
        public static final class C92111a extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FlipView f263687d;

            /* renamed from: e */
            public final /* synthetic */ FlipView$$l f263688e;

            /* renamed from: f */
            public final /* synthetic */ FlipView$$k f263689f;

            /* renamed from: g */
            public final /* synthetic */ C15601d<Boolean> f263690g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92111a(FlipView flipView, FlipView$$l flipView$$l, FlipView$$k flipView$$k, C15601d<? super Boolean> dVar) {
                super(1);
                this.f263687d = flipView;
                this.f263688e = flipView$$l;
                this.f263689f = flipView$$k;
                this.f263690g = dVar;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                boolean booleanValue = ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                this.f263687d.mo132155p(this.f263688e);
                this.f263687d.mo132153o(this.f263689f);
                this.f263690g.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(booleanValue)));
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                return b0Var;
            }
        }

        /* renamed from: av2.e$d$b */
        public static final class C92112b implements FlipView$$k {

            /* renamed from: a */
            public final /* synthetic */ String f263691a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263692b;

            public C92112b(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                this.f263691a = str;
                this.f263692b = f0Var;
            }

            /* renamed from: o */
            public final void mo126098o(String str, boolean z) {
                SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
                Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "onDownloadFinish, mediaPath: " + str + ", success: " + z);
                if (!C87412m.m108589b(str, this.f263691a)) {
                    SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
                    return;
                }
                ((C32226l) this.f263692b.f27484d).invoke(Boolean.valueOf(z));
                SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
            }
        }

        /* renamed from: av2.e$d$c */
        public static final class C92113c implements FlipView$$l {

            /* renamed from: a */
            public final /* synthetic */ String f263693a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263694b;

            public C92113c(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                this.f263693a = str;
                this.f263694b = f0Var;
            }

            /* renamed from: a */
            public final void mo126096a(String str) {
                SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
                Log.m105924i("MicroMsg.AppBrandOpenMaterials_FlipView", "onMediaChange, mediaPath: " + str);
                if (!C87412m.m108589b(str, this.f263693a)) {
                    ((C32226l) this.f263694b.f27484d).invoke(Boolean.FALSE);
                }
                SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
            }
        }

        /* renamed from: av2.e$d$d */
        public static final class C92114d extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public static final C92114d f263695d = new C92114d();

            public C92114d() {
                super(1);
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                ((Boolean) obj).booleanValue();
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                return b0Var;
            }
        }

        public C92110d(FlipView flipView) {
            this.f263686a = flipView;
        }

        /* renamed from: a */
        public Object mo75114a(C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super Boolean> dVar) {
            SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            FlipView flipView = this.f263686a;
            C66218h hVar = new C66218h(C66447b.m78392b(dVar));
            String str = fVar.mo126095b().mo126089a().f267606f;
            C87412m.m108593f(str, "params.materialInfo.model.materialPath");
            if (fVar.mo126095b().mo126090b() == C98783b.SNS_VIDEO && !flipView.mo132157r(str)) {
                Result.Companion companion = Result.Companion;
                hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
            }
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = C92114d.f263695d;
            C92113c cVar = new C92113c(str, f0Var);
            C92112b bVar = new C92112b(str, f0Var);
            f0Var.f27484d = new C92111a(flipView, cVar, bVar, hVar);
            flipView.mo132135e(cVar);
            SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            if (flipView.f276788Q == null) {
                flipView.f276788Q = new ArrayList();
            }
            ((ArrayList) flipView.f276788Q).add(bVar);
            SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
            Object b = hVar.mo90314b();
            SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            return b;
        }

        /* renamed from: c */
        public Boolean mo75115c(C109033l0 l0Var, C92094a.C92098f fVar) {
            SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            C87412m.m108594g(l0Var, "openMaterialService");
            C87412m.m108594g(fVar, "params");
            Boolean bool = this.f263686a.mo132149j(fVar.mo126095b().mo126089a().f267606f) ? Boolean.TRUE : null;
            SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            return bool;
        }

        public String getName() {
            SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
            return "FlipView$Open";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92102e(FlipView flipView, C92094a.C92097e eVar, C77407n nVar, C15601d<? super C92102e> dVar) {
        super(2, dVar);
        this.f263670e = flipView;
        this.f263671f = eVar;
        this.f263672g = nVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        C92102e eVar = new C92102e(this.f263670e, this.f263671f, this.f263672g, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        Object invokeSuspend = ((C92102e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f263669d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C92094a aVar2 = C92094a.f263646a;
            C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((View) this.f263670e);
            Context context = this.f263670e.getContext();
            C87412m.m108593f(context, "context");
            C92094a.C92098f fVar = new C92094a.C92098f(lifecycleScope, context, this.f263671f, new C92103a(this.f263672g), new C92104b(this.f263670e));
            C64186f0 f0Var = C64186f0.f181907d;
            List b = C26236u.m33719b(new C92105c(this.f263670e));
            List b2 = C26236u.m33719b(new C92110d(this.f263670e));
            this.f263669d = 1;
            obj = C92094a.m115773d(aVar2, fVar, f0Var, b, b2, (C32224a) null, this, 16, (Object) null);
            if (obj == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            throw illegalStateException;
        }
        C107885g0 g0Var = (C107885g0) obj;
        if (g0Var != null) {
            new C92117h(this.f263670e, g0Var);
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.FlipViewOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
        return b0Var;
    }
}
