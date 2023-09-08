package av2;

import a14.C0000n0;
import androidx.appcompat.app.AppCompatActivity;
import av2.C92094a;
import com.tencent.p014mm.plugin.scanner.ImageQBarDataBean;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$k;
import com.tencent.p014mm.plugin.sns.p106ui.FlipView$$l;
import com.tencent.p014mm.plugin.sns.p106ui.GalleryTitleManager;
import com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI;
import com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI$$i;
import com.tencent.p014mm.plugin.sns.p106ui.SnsInfoFlip;
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
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
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

/* renamed from: av2.t */
public final class C92138t {

    /* renamed from: a */
    public static WeakHashMap<SnsGalleryUI, HashSet<Integer>> f263749a;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1", mo125469f = "AppBrandOpenMaterials_SnsGalleryUI.kt", mo125470l = {86}, mo125471m = "invokeSuspend")
    /* renamed from: av2.t$a */
    public static final class C92139a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f263750d;

        /* renamed from: e */
        public final /* synthetic */ SnsGalleryUI f263751e;

        /* renamed from: f */
        public final /* synthetic */ C92094a.C92097e f263752f;

        /* renamed from: g */
        public final /* synthetic */ C77407n f263753g;

        /* renamed from: av2.t$a$a */
        public static final class C92140a implements C92094a.C92095b {

            /* renamed from: a */
            public final /* synthetic */ C77407n f263754a;

            public C92140a(C77407n nVar) {
                this.f263754a = nVar;
            }

            public final C77407n provide() {
                SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$1");
                C77407n nVar = this.f263754a;
                SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$1");
                return nVar;
            }
        }

        /* renamed from: av2.t$a$b */
        public static final class C92141b implements C92094a.C92096d {

            /* renamed from: a */
            public final /* synthetic */ SnsGalleryUI f263755a;

            public C92141b(SnsGalleryUI snsGalleryUI) {
                this.f263755a = snsGalleryUI;
            }

            public final String provide() {
                String str;
                SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
                SnsGalleryUI snsGalleryUI = this.f263755a;
                snsGalleryUI.getClass();
                SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                GalleryTitleManager T7 = snsGalleryUI.mo132591T7();
                if (T7 == null) {
                    str = null;
                    SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                } else {
                    SnsMethodCalculate.markStartTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    str = T7.mo132174i();
                    SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    SnsMethodCalculate.markEndTimeMs("getCurrentMaterialPath", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
                SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$2");
                return str;
            }
        }

        /* renamed from: av2.t$a$c */
        public static final class C92142c implements C92094a.C54340c.C54341a {

            /* renamed from: a */
            public final /* synthetic */ SnsGalleryUI f263756a;

            /* renamed from: av2.t$a$c$a */
            public static final class C92143a extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ SnsGalleryUI f263757d;

                /* renamed from: e */
                public final /* synthetic */ FlipView$$l f263758e;

                /* renamed from: f */
                public final /* synthetic */ SnsGalleryUI$$i f263759f;

                /* renamed from: g */
                public final /* synthetic */ C15601d<Boolean> f263760g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C92143a(SnsGalleryUI snsGalleryUI, FlipView$$l flipView$$l, SnsGalleryUI$$i snsGalleryUI$$i, C15601d<? super Boolean> dVar) {
                    super(1);
                    this.f263757d = snsGalleryUI;
                    this.f263758e = flipView$$l;
                    this.f263759f = snsGalleryUI$$i;
                    this.f263760g = dVar;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                    this.f263757d.mo132733g8(this.f263758e);
                    SnsGalleryUI snsGalleryUI = this.f263757d;
                    SnsGalleryUI$$i snsGalleryUI$$i = this.f263759f;
                    snsGalleryUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    List<SnsGalleryUI$$i> list = snsGalleryUI.f278086V;
                    if (list == null) {
                        SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    } else {
                        ((ArrayList) list).remove(snsGalleryUI$$i);
                        if (((ArrayList) snsGalleryUI.f278086V).isEmpty()) {
                            snsGalleryUI.f278086V = null;
                        }
                        SnsMethodCalculate.markEndTimeMs("removeScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    }
                    this.f263760g.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(booleanValue)));
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$1");
                    return b0Var;
                }
            }

            /* renamed from: av2.t$a$c$b */
            public static final class C92144b implements FlipView$$l {

                /* renamed from: a */
                public final /* synthetic */ String f263761a;

                /* renamed from: b */
                public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263762b;

                public C92144b(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                    this.f263761a = str;
                    this.f263762b = f0Var;
                }

                /* renamed from: a */
                public final void mo126096a(String str) {
                    SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$mediaChangeListener$1");
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onMediaChange, mediaPath: " + str);
                    if (!C87412m.m108589b(str, this.f263761a)) {
                        ((C32226l) this.f263762b.f27484d).invoke(Boolean.FALSE);
                    }
                    SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$mediaChangeListener$1");
                }
            }

            /* renamed from: av2.t$a$c$c */
            public static final class C92145c extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public static final C92145c f263763d = new C92145c();

                public C92145c() {
                    super(1);
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                    ((Boolean) obj).booleanValue();
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$resumeContinuation$1");
                    return b0Var;
                }
            }

            /* renamed from: av2.t$a$c$d */
            public static final class C92146d implements SnsGalleryUI$$i {

                /* renamed from: a */
                public final /* synthetic */ String f263764a;

                /* renamed from: b */
                public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263765b;

                /* renamed from: c */
                public final /* synthetic */ C109033l0 f263766c;

                public C92146d(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var, C109033l0 l0Var) {
                    this.f263764a = str;
                    this.f263765b = f0Var;
                    this.f263766c = l0Var;
                }

                /* renamed from: s */
                public final void mo126114s(String str, List<ImageQBarDataBean> list) {
                    SnsMethodCalculate.markStartTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onCodeScanned, mediaPath: " + str);
                    if (!C87412m.m108589b(str, this.f263764a)) {
                        SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                        return;
                    }
                    ((C32226l) this.f263765b.f27484d).invoke(Boolean.valueOf(this.f263766c.mo158320Qh(list)));
                    SnsMethodCalculate.markEndTimeMs("onCodeScanned", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3$isGranted$2$scanCodeListener$1");
                }
            }

            public C92142c(SnsGalleryUI snsGalleryUI) {
                this.f263756a = snsGalleryUI;
            }

            /* renamed from: a */
            public Object mo75114a(C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super Boolean> dVar) {
                SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                SnsGalleryUI snsGalleryUI = this.f263756a;
                C66218h hVar = new C66218h(C66447b.m78392b(dVar));
                if (fVar.mo126095b().mo126090b() != C98783b.SNS_IMAGE) {
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                } else {
                    String str = fVar.mo126095b().mo126089a().f267606f;
                    C87412m.m108593f(str, "params.materialInfo.model.materialPath");
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = C92145c.f263763d;
                    C92144b bVar = new C92144b(str, f0Var);
                    C92146d dVar2 = new C92146d(str, f0Var, l0Var);
                    f0Var.f27484d = new C92143a(snsGalleryUI, bVar, dVar2, hVar);
                    snsGalleryUI.mo132730d8(bVar);
                    SnsMethodCalculate.markStartTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    if (snsGalleryUI.f278086V == null) {
                        snsGalleryUI.f278086V = new ArrayList();
                    }
                    ((ArrayList) snsGalleryUI.f278086V).add(dVar2);
                    SnsMethodCalculate.markEndTimeMs("addScanCodeListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
                Object b = hVar.mo90314b();
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                return b;
            }

            /* renamed from: c */
            public Boolean mo75115c(C109033l0 l0Var, C92094a.C92098f fVar) {
                ArrayList<ImageQBarDataBean> arrayList;
                SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                C87412m.m108594g(l0Var, "openMaterialService");
                C87412m.m108594g(fVar, "params");
                if (fVar.mo126095b().mo126090b() != C98783b.SNS_IMAGE) {
                    Boolean bool = Boolean.TRUE;
                    SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                    return bool;
                }
                SnsGalleryUI snsGalleryUI = this.f263756a;
                String str = fVar.mo126095b().mo126089a().f267606f;
                snsGalleryUI.getClass();
                SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                GalleryTitleManager T7 = snsGalleryUI.mo132591T7();
                if (T7 == null) {
                    SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    arrayList = null;
                } else {
                    SnsMethodCalculate.markStartTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    String i = T7.mo132174i();
                    if (!str.equals(i)) {
                        Log.m105925i("MicroMsg.GalleryTitleManager", "getCodeScanResult, mediaPath: %s, curMediaPath: %s", str, i);
                        SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    } else if (T7.f276842i != null) {
                        Log.m105924i("MicroMsg.GalleryTitleManager", "getCodeScanResult, recognizingFilePath not null");
                        SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                    } else {
                        arrayList = T7.f276852v;
                        SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager");
                        SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    }
                    arrayList = null;
                    SnsMethodCalculate.markEndTimeMs("getCodeScanResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
                if (arrayList == null) {
                    SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                    return null;
                }
                Boolean valueOf = Boolean.valueOf(l0Var.mo158320Qh(arrayList));
                SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                return valueOf;
            }

            public String getName() {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$3");
                return "SnsGalleryUI$Fetch";
            }
        }

        /* renamed from: av2.t$a$d */
        public static final class C92147d implements C92094a.C54340c.C54341a {

            /* renamed from: a */
            public final /* synthetic */ SnsGalleryUI f263767a;

            /* renamed from: av2.t$a$d$a */
            public static final class C92148a extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ SnsGalleryUI f263768d;

                /* renamed from: e */
                public final /* synthetic */ FlipView$$l f263769e;

                /* renamed from: f */
                public final /* synthetic */ FlipView$$k f263770f;

                /* renamed from: g */
                public final /* synthetic */ C15601d<Boolean> f263771g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C92148a(SnsGalleryUI snsGalleryUI, FlipView$$l flipView$$l, FlipView$$k flipView$$k, C15601d<? super Boolean> dVar) {
                    super(1);
                    this.f263768d = snsGalleryUI;
                    this.f263769e = flipView$$l;
                    this.f263770f = flipView$$k;
                    this.f263771g = dVar;
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                    this.f263768d.mo132733g8(this.f263769e);
                    SnsGalleryUI snsGalleryUI = this.f263768d;
                    FlipView$$k flipView$$k = this.f263770f;
                    snsGalleryUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    SnsInfoFlip snsInfoFlip = snsGalleryUI.f277761o;
                    if (snsInfoFlip == null) {
                        SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    } else {
                        snsInfoFlip.mo132153o(flipView$$k);
                        SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    }
                    this.f263771g.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(booleanValue)));
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$1");
                    return b0Var;
                }
            }

            /* renamed from: av2.t$a$d$b */
            public static final class C92149b implements FlipView$$k {

                /* renamed from: a */
                public final /* synthetic */ String f263772a;

                /* renamed from: b */
                public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263773b;

                public C92149b(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                    this.f263772a = str;
                    this.f263773b = f0Var;
                }

                /* renamed from: o */
                public final void mo126098o(String str, boolean z) {
                    SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onDownloadFinish, mediaPath: " + str + ", success: " + z);
                    if (!C87412m.m108589b(str, this.f263772a)) {
                        SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
                        return;
                    }
                    ((C32226l) this.f263773b.f27484d).invoke(Boolean.valueOf(z));
                    SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$downloadListener$1");
                }
            }

            /* renamed from: av2.t$a$d$c */
            public static final class C92150c implements FlipView$$l {

                /* renamed from: a */
                public final /* synthetic */ String f263774a;

                /* renamed from: b */
                public final /* synthetic */ C8479f0<C32226l<Boolean, C13598b0>> f263775b;

                public C92150c(String str, C8479f0<C32226l<Boolean, C13598b0>> f0Var) {
                    this.f263774a = str;
                    this.f263775b = f0Var;
                }

                /* renamed from: a */
                public final void mo126096a(String str) {
                    SnsMethodCalculate.markStartTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "onMediaChange, mediaPath: " + str);
                    if (!C87412m.m108589b(str, this.f263774a)) {
                        ((C32226l) this.f263775b.f27484d).invoke(Boolean.FALSE);
                    }
                    SnsMethodCalculate.markEndTimeMs("onMediaChange", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$mediaChangeListener$1");
                }
            }

            /* renamed from: av2.t$a$d$d */
            public static final class C92151d extends C87413o implements C32226l<Boolean, C13598b0> {

                /* renamed from: d */
                public static final C92151d f263776d = new C92151d();

                public C92151d() {
                    super(1);
                }

                public Object invoke(Object obj) {
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                    ((Boolean) obj).booleanValue();
                    SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                    C13598b0 b0Var = C13598b0.f38549a;
                    SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4$isGranted$2$resumeContinuation$1");
                    return b0Var;
                }
            }

            public C92147d(SnsGalleryUI snsGalleryUI) {
                this.f263767a = snsGalleryUI;
            }

            /* renamed from: a */
            public Object mo75114a(C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super Boolean> dVar) {
                boolean z;
                SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                SnsGalleryUI snsGalleryUI = this.f263767a;
                C66218h hVar = new C66218h(C66447b.m78392b(dVar));
                String str = fVar.mo126095b().mo126089a().f267606f;
                C87412m.m108593f(str, "params.materialInfo.model.materialPath");
                if (fVar.mo126095b().mo126090b() == C98783b.SNS_VIDEO) {
                    snsGalleryUI.getClass();
                    SnsMethodCalculate.markStartTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    SnsInfoFlip snsInfoFlip = snsGalleryUI.f277761o;
                    if (snsInfoFlip == null) {
                        Log.m105928w("MicroMsg.SnsGalleryUI", "startDownloadVideo, flipView is null");
                        z = false;
                        SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    } else {
                        z = snsInfoFlip.mo132157r(str);
                        SnsMethodCalculate.markEndTimeMs("startDownloadVideo", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                    }
                    if (!z) {
                        Result.Companion companion = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    }
                }
                C8479f0 f0Var = new C8479f0();
                f0Var.f27484d = C92151d.f263776d;
                C92150c cVar = new C92150c(str, f0Var);
                C92149b bVar = new C92149b(str, f0Var);
                f0Var.f27484d = new C92148a(snsGalleryUI, cVar, bVar, hVar);
                snsGalleryUI.mo132730d8(cVar);
                SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                SnsInfoFlip snsInfoFlip2 = snsGalleryUI.f277761o;
                if (snsInfoFlip2 == null) {
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                } else {
                    SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                    if (snsInfoFlip2.f276788Q == null) {
                        snsInfoFlip2.f276788Q = new ArrayList();
                    }
                    ((ArrayList) snsInfoFlip2.f276788Q).add(bVar);
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.FlipView");
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
                Object b = hVar.mo90314b();
                SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                return b;
            }

            /* renamed from: c */
            public Boolean mo75115c(C109033l0 l0Var, C92094a.C92098f fVar) {
                boolean z;
                SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                C87412m.m108594g(l0Var, "openMaterialService");
                C87412m.m108594g(fVar, "params");
                SnsGalleryUI snsGalleryUI = this.f263767a;
                String str = fVar.mo126095b().mo126089a().f267606f;
                snsGalleryUI.getClass();
                SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                SnsInfoFlip snsInfoFlip = snsGalleryUI.f277761o;
                if (snsInfoFlip == null) {
                    Log.m105928w("MicroMsg.SnsGalleryUI", "getDownloadResult, flipView is null");
                    z = false;
                    SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                } else {
                    z = snsInfoFlip.mo132149j(str);
                    SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsGalleryUI");
                }
                Boolean bool = z ? Boolean.TRUE : null;
                SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                return bool;
            }

            public String getName() {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$controller$4");
                return "SnsGalleryUI$Open";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92139a(SnsGalleryUI snsGalleryUI, C92094a.C92097e eVar, C77407n nVar, C15601d<? super C92139a> dVar) {
            super(2, dVar);
            this.f263751e = snsGalleryUI;
            this.f263752f = eVar;
            this.f263753g = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            C92139a aVar = new C92139a(this.f263751e, this.f263752f, this.f263753g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            Object invokeSuspend = ((C92139a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f263750d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C92094a aVar2 = C92094a.f263646a;
                C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this.f263751e);
                AppCompatActivity context = this.f263751e.getContext();
                C87412m.m108593f(context, "context");
                C92094a.C92098f fVar = new C92094a.C92098f(lifecycleScope, context, this.f263752f, new C92140a(this.f263753g), new C92141b(this.f263751e));
                C64186f0 f0Var = C64186f0.f181907d;
                List b = C26236u.m33719b(new C92142c(this.f263751e));
                List b2 = C26236u.m33719b(new C92147d(this.f263751e));
                this.f263750d = 1;
                obj = C92094a.m115773d(aVar2, fVar, f0Var, b, b2, (C32224a) null, this, 16, (Object) null);
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                throw illegalStateException;
            }
            C107885g0 g0Var = (C107885g0) obj;
            if (g0Var != null) {
                new C92153u(this.f263751e, g0Var);
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return b0Var;
        }
    }

    /* renamed from: av2.t$b */
    public static final class C92152b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ SnsGalleryUI f263777d;

        /* renamed from: e */
        public final /* synthetic */ int f263778e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92152b(SnsGalleryUI snsGalleryUI, int i) {
            super(1);
            this.f263777d = snsGalleryUI;
            this.f263778e = i;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
            Throwable th = (Throwable) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
            SnsGalleryUI snsGalleryUI = this.f263777d;
            int i = this.f263778e;
            SnsMethodCalculate.markStartTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            SnsMethodCalculate.markStartTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsGalleryUI", "markTokenDone, token: " + i);
            WeakHashMap<SnsGalleryUI, HashSet<Integer>> weakHashMap = C92138t.f263749a;
            if (weakHashMap == null) {
                SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            } else {
                HashSet hashSet = weakHashMap.get(snsGalleryUI);
                if (hashSet == null) {
                    SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
                } else {
                    if (hashSet.remove(Integer.valueOf(i)) && hashSet.isEmpty() && weakHashMap.remove(snsGalleryUI) != null && weakHashMap.isEmpty()) {
                        C92138t.f263749a = null;
                    }
                    SnsMethodCalculate.markEndTimeMs("markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
                }
            }
            SnsMethodCalculate.markEndTimeMs("access$markTokenDone", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$2");
            return b0Var;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00aa, code lost:
        r7 = r7.get(r15);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m115818a(com.tencent.p014mm.plugin.sns.p106ui.SnsGalleryUI r15) {
        /*
            java.lang.String r0 = "tryEnableOpenMaterialsForCurrentMaterial"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.sheet.SnsGalleryUIOpenMaterials"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "<this>"
            gy3.C87412m.m108594g(r15, r2)
            java.lang.String r2 = "getBottomSheet"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.SnsGalleryUI"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager r4 = r15.mo132591T7()
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.GalleryTitleManager"
            r6 = 0
            if (r4 != 0) goto L_0x0022
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            r4 = r6
            goto L_0x003f
        L_0x0022:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r5)
            av2.r r4 = r4.f276841h
            if (r4 != 0) goto L_0x0035
            java.lang.String r4 = "MicroMsg.GalleryTitleManager"
            java.lang.String r7 = "getBottomSheet, mShareSheet is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r7)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
            r4 = r6
            goto L_0x003c
        L_0x0035:
            qo3.n r4 = r4.mo126101d()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r5)
        L_0x003c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L_0x003f:
            java.lang.String r2 = "MicroMsg.AppBrandOpenMaterials_SnsGalleryUI"
            if (r4 != 0) goto L_0x004d
            java.lang.String r15 = "tryEnableOpenMaterialsForCurrentMaterial, bottomSheet is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x004d:
            java.lang.String r7 = "getCurrentMaterialInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r3)
            com.tencent.mm.plugin.sns.ui.GalleryTitleManager r8 = r15.mo132591T7()
            if (r8 != 0) goto L_0x005d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
            r8 = r6
            goto L_0x006e
        L_0x005d:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r5)
            com.tencent.mm.plugin.sns.storage.SnsInfo r9 = r8.f276844n
            te3.kv2 r8 = r8.f276846p
            av2.a$e r8 = av2.C92094a.m115772a(r9, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r5)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r3)
        L_0x006e:
            if (r8 != 0) goto L_0x007a
            java.lang.String r15 = "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x007a:
            int r3 = r4.hashCode()
            int r5 = r8.hashCode()
            int r3 = r3 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: "
            r5.append(r7)
            r5.append(r8)
            java.lang.String r7 = ", token: "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)
            java.lang.String r5 = "isTokenInProgress"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.util.WeakHashMap<com.tencent.mm.plugin.sns.ui.SnsGalleryUI, java.util.HashSet<java.lang.Integer>> r7 = f263749a
            if (r7 == 0) goto L_0x00bb
            java.lang.Object r7 = r7.get(r15)
            java.util.HashSet r7 = (java.util.HashSet) r7
            if (r7 == 0) goto L_0x00bb
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r7 = r7.contains(r9)
            goto L_0x00bc
        L_0x00bb:
            r7 = 0
        L_0x00bc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            if (r7 == 0) goto L_0x00cb
            java.lang.String r15 = "tryEnableOpenMaterialsForCurrentMaterial, duplicate"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00cb:
            java.lang.String r5 = "markTokenInProgress"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "markTokenInProgress, token: "
            r7.append(r9)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            java.util.WeakHashMap<com.tencent.mm.plugin.sns.ui.SnsGalleryUI, java.util.HashSet<java.lang.Integer>> r2 = f263749a
            if (r2 != 0) goto L_0x00f1
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            f263749a = r2
        L_0x00f1:
            java.lang.Object r7 = r2.get(r15)
            if (r7 != 0) goto L_0x00ff
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r2.put(r15, r7)
        L_0x00ff:
            java.util.HashSet r7 = (java.util.HashSet) r7
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r7.add(r2)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r1)
            a14.n0 r9 = com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt.getLifecycleScope((androidx.appcompat.app.AppCompatActivity) r15)
            r10 = 0
            r11 = 0
            av2.t$a r12 = new av2.t$a
            r12.<init>(r15, r8, r4, r6)
            r13 = 3
            r14 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r9, r10, r11, r12, r13, r14)
            av2.t$b r4 = new av2.t$b
            r4.<init>(r15, r3)
            a14.f2 r2 = (a14.C53884f2) r2
            r2.mo74515E(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: av2.C92138t.m115818a(com.tencent.mm.plugin.sns.ui.SnsGalleryUI):void");
    }
}
