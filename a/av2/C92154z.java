package av2;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import av2.C92094a;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.plugin.sns.model.C94867e2;
import com.tencent.p014mm.plugin.sns.p106ui.OnlineVideoView;
import com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.coroutines.LifecycleScopeExtKt;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import iq0.C98783b;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Result;
import kotlin.ResultKt;
import kr0.C109033l0;
import qo3.C77407n;
import rx3.C13598b0;
import sx3.C26236u;
import sx3.C64186f0;
import te3.C101804kv2;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: av2.z */
public final class C92154z {

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1", mo125469f = "AppBrandOpenMaterials_SnsOnlineVideoActivity.kt", mo125470l = {22}, mo125471m = "invokeSuspend")
    /* renamed from: av2.z$a */
    public static final class C92155a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f263781d;

        /* renamed from: e */
        public final /* synthetic */ SnsOnlineVideoActivity f263782e;

        /* renamed from: f */
        public final /* synthetic */ C92094a.C92097e f263783f;

        /* renamed from: av2.z$a$a */
        public static final class C92156a implements C92094a.C92095b {

            /* renamed from: a */
            public final /* synthetic */ SnsOnlineVideoActivity f263784a;

            public C92156a(SnsOnlineVideoActivity snsOnlineVideoActivity) {
                this.f263784a = snsOnlineVideoActivity;
            }

            public final C77407n provide() {
                C77407n nVar;
                SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$1");
                SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263784a;
                snsOnlineVideoActivity.getClass();
                SnsMethodCalculate.markStartTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                C92126r rVar = snsOnlineVideoActivity.f278411u;
                if (rVar == null) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "getBottomSheet, mShareSheet is null");
                    nVar = null;
                    SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else {
                    nVar = rVar.mo126101d();
                    SnsMethodCalculate.markEndTimeMs("getBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                }
                SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$1");
                return nVar;
            }
        }

        /* renamed from: av2.z$a$b */
        public static final class C92157b implements C92094a.C92096d {

            /* renamed from: a */
            public final /* synthetic */ SnsOnlineVideoActivity f263785a;

            public C92157b(SnsOnlineVideoActivity snsOnlineVideoActivity) {
                this.f263785a = snsOnlineVideoActivity;
            }

            public final String provide() {
                SnsMethodCalculate.markStartTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$2");
                String S7 = this.f263785a.mo132871S7();
                SnsMethodCalculate.markEndTimeMs("provide", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$2");
                return S7;
            }
        }

        /* renamed from: av2.z$a$c */
        public static final class C92158c implements C92094a.C54340c.C54341a {

            /* renamed from: a */
            public final /* synthetic */ SnsOnlineVideoActivity f263786a;

            /* renamed from: av2.z$a$c$a */
            public static final class C92159a implements OnlineVideoView.IDownloadListener {

                /* renamed from: a */
                public final /* synthetic */ String f263787a;

                /* renamed from: b */
                public final /* synthetic */ C15601d<Boolean> f263788b;

                /* renamed from: c */
                public final /* synthetic */ SnsOnlineVideoActivity f263789c;

                public C92159a(String str, C15601d<? super Boolean> dVar, SnsOnlineVideoActivity snsOnlineVideoActivity) {
                    this.f263787a = str;
                    this.f263788b = dVar;
                    this.f263789c = snsOnlineVideoActivity;
                }

                /* renamed from: o */
                public void mo126115o(String str, boolean z) {
                    SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                    Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "onDownloadFinish, mediaPath: " + str + ", success: " + z);
                    if (!C87412m.m108589b(str, this.f263787a)) {
                        SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                        return;
                    }
                    this.f263788b.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(z)));
                    SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263789c;
                    snsOnlineVideoActivity.getClass();
                    SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    OnlineVideoView onlineVideoView = snsOnlineVideoActivity.f278408r;
                    if (onlineVideoView == null) {
                        Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "removeDownloadListener, videoView is null");
                        SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    } else {
                        SnsMethodCalculate.markStartTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        List<OnlineVideoView.IDownloadListener> list = onlineVideoView.f277158G1;
                        if (list == null) {
                            SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        } else {
                            ((ArrayList) list).remove(this);
                            if (((ArrayList) onlineVideoView.f277158G1).isEmpty()) {
                                onlineVideoView.f277158G1 = null;
                            }
                            SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                        }
                        SnsMethodCalculate.markEndTimeMs("removeDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                    }
                    SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3$isGranted$2$1");
                }
            }

            public C92158c(SnsOnlineVideoActivity snsOnlineVideoActivity) {
                this.f263786a = snsOnlineVideoActivity;
            }

            /* renamed from: a */
            public Object mo75114a(C109033l0 l0Var, C92094a.C92098f fVar, C15601d<? super Boolean> dVar) {
                boolean z;
                SnsMethodCalculate.markStartTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263786a;
                C66218h hVar = new C66218h(C66447b.m78392b(dVar));
                String str = fVar.mo126095b().mo126089a().f267606f;
                C87412m.m108593f(str, "params.materialInfo.model.materialPath");
                snsOnlineVideoActivity.getClass();
                SnsMethodCalculate.markStartTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                OnlineVideoView onlineVideoView = snsOnlineVideoActivity.f278408r;
                if (onlineVideoView == null) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "startDownload, videoView is null");
                    z = false;
                    SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else {
                    z = onlineVideoView.mo132328T(str);
                    SnsMethodCalculate.markEndTimeMs("startDownload", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                }
                if (!z) {
                    Result.Companion companion = Result.Companion;
                    hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                }
                C92159a aVar = new C92159a(str, hVar, snsOnlineVideoActivity);
                SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                OnlineVideoView onlineVideoView2 = snsOnlineVideoActivity.f278408r;
                if (onlineVideoView2 == null) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "addDownloadListener, videoView is null");
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else {
                    SnsMethodCalculate.markStartTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    if (onlineVideoView2.f277158G1 == null) {
                        onlineVideoView2.f277158G1 = new ArrayList();
                    }
                    ((ArrayList) onlineVideoView2.f277158G1).add(aVar);
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.OnlineVideoView");
                    SnsMethodCalculate.markEndTimeMs("addDownloadListener", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                }
                Object b = hVar.mo90314b();
                C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
                SnsMethodCalculate.markEndTimeMs("isGranted", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                return b;
            }

            /* renamed from: c */
            public Boolean mo75115c(C109033l0 l0Var, C92094a.C92098f fVar) {
                C101804kv2 kv22;
                SnsMethodCalculate.markStartTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                C87412m.m108594g(l0Var, "openMaterialService");
                C87412m.m108594g(fVar, "params");
                SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263786a;
                snsOnlineVideoActivity.getClass();
                SnsMethodCalculate.markStartTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                String str = snsOnlineVideoActivity.f278397e;
                boolean z = false;
                if (str == null || (kv22 = snsOnlineVideoActivity.f278404o) == null) {
                    Log.m105924i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, localId or media is null");
                    SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                } else {
                    String f = C94867e2.m120287f(str, kv22);
                    Log.m105925i("MicroMsg.SnsOnlineVideoActivity", "getDownloadResult, downloadedPath: %s", f);
                    z = !TextUtils.isEmpty(f);
                    SnsMethodCalculate.markEndTimeMs("getDownloadResult", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                }
                Boolean bool = z ? Boolean.TRUE : null;
                SnsMethodCalculate.markEndTimeMs("isGrantedOrNull", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                return bool;
            }

            public String getName() {
                SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$3");
                return "SnsOnlineVideoActivity$Open";
            }
        }

        /* renamed from: av2.z$a$d */
        public static final class C92160d extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ SnsOnlineVideoActivity f263790d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C92160d(SnsOnlineVideoActivity snsOnlineVideoActivity) {
                super(0);
                this.f263790d = snsOnlineVideoActivity;
            }

            public Object invoke() {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$4");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$4");
                SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263790d;
                snsOnlineVideoActivity.getClass();
                SnsMethodCalculate.markStartTimeMs("keepMeOnPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                snsOnlineVideoActivity.f278412v = true;
                SnsMethodCalculate.markEndTimeMs("keepMeOnPause", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$4");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1$4");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92155a(SnsOnlineVideoActivity snsOnlineVideoActivity, C92094a.C92097e eVar, C15601d<? super C92155a> dVar) {
            super(2, dVar);
            this.f263782e = snsOnlineVideoActivity;
            this.f263783f = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            C92155a aVar = new C92155a(this.f263782e, this.f263783f, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            Object invokeSuspend = ((C92155a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f263781d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C92094a aVar2 = C92094a.f263646a;
                C0000n0 lifecycleScope = LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) this.f263782e);
                AppCompatActivity context = this.f263782e.getContext();
                C87412m.m108593f(context, "context");
                C92094a.C92097e eVar = this.f263783f;
                SnsOnlineVideoActivity snsOnlineVideoActivity = this.f263782e;
                C92094a.C92098f fVar = new C92094a.C92098f(lifecycleScope, context, eVar, new C92156a(snsOnlineVideoActivity), new C92157b(snsOnlineVideoActivity));
                C64186f0 f0Var = C64186f0.f181907d;
                List b = C26236u.m33719b(new C92158c(this.f263782e));
                C92160d dVar = new C92160d(this.f263782e);
                this.f263781d = 1;
                if (aVar2.mo126086c(fVar, f0Var, f0Var, b, dVar, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
                throw illegalStateException;
            }
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials$tryEnableOpenMaterialsForCurrentMaterial$1");
            return b0Var;
        }
    }

    /* renamed from: a */
    public static final void m115828a(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        C92094a.C92097e eVar;
        SnsMethodCalculate.markStartTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
        C87412m.m108594g(snsOnlineVideoActivity, "<this>");
        SnsMethodCalculate.markStartTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        String S7 = snsOnlineVideoActivity.mo132871S7();
        if (TextUtils.isEmpty(S7)) {
            SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
            eVar = null;
        } else {
            Objects.requireNonNull(S7);
            eVar = new C92094a.C92097e(MaterialModel.m117225b(S7, "mp4"), C98783b.SNS_VIDEO);
            SnsMethodCalculate.markEndTimeMs("getCurrentMaterialInfo", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        }
        if (eVar == null) {
            Log.m105928w("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo is null");
            SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
            return;
        }
        Log.m105924i("MicroMsg.AppBrandOpenMaterials_SnsOnlineVideoActivity", "tryEnableOpenMaterialsForCurrentMaterial, currentMaterialInfo: " + eVar);
        C53895h.m60466d(LifecycleScopeExtKt.getLifecycleScope((AppCompatActivity) snsOnlineVideoActivity), (C66212f) null, (C53934p0) null, new C92155a(snsOnlineVideoActivity, eVar, (C15601d<? super C92155a>) null), 3, (Object) null);
        SnsMethodCalculate.markEndTimeMs("tryEnableOpenMaterialsForCurrentMaterial", "com.tencent.mm.plugin.sns.ui.sheet.SnsOnlineVideoActivityOpenMaterials");
    }
}
