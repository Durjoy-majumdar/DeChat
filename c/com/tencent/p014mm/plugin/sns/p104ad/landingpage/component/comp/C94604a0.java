package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53901i0;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsns.SnsAdClick;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95108i0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import ke3.C88144b;
import kotlin.ResultKt;
import lo2.C10594f;
import lo2.C10595g;
import lo2.C10596p0;
import lo2.C46880j;
import lo2.C61320e;
import lo2.C61325o0;
import lo2.C99527d;
import lo2.C99541h;
import lo2.C99543i;
import lo2.C99546k;
import nj3.C76879j;
import qo3.C101218e0;
import qo3.C89779i0;
import qs2.C101271i0;
import rx3.C13598b0;
import rx3.C90107a;
import so2.C101683n;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import xx3.C15911a;
import xx3.C66447b;
import ys2.C66696h;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0 */
public final class C94604a0 extends C95108i0 {

    /* renamed from: G */
    public static final C53901i0 f273773G = new C57326e(C53901i0.C39480a.f106019d);

    /* renamed from: B */
    public final Context f273774B;

    /* renamed from: C */
    public final C101683n f273775C;

    /* renamed from: D */
    public C0000n0 f273776D = C53930o0.m60555b();

    /* renamed from: E */
    public boolean f273777E;

    /* renamed from: F */
    public boolean f273778F;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1", mo125469f = "AdLandingHfScreenCombineFollowComp.kt", mo125470l = {253}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$c */
    public static final class C57325c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f164213d;

        /* renamed from: e */
        public int f164214e;

        /* renamed from: f */
        public final /* synthetic */ Context f164215f;

        /* renamed from: g */
        public final /* synthetic */ int f164216g;

        /* renamed from: h */
        public final /* synthetic */ C94604a0 f164217h;

        /* renamed from: i */
        public final /* synthetic */ String f164218i;

        /* renamed from: j */
        public final /* synthetic */ int f164219j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57325c(Context context, int i, C94604a0 a0Var, String str, int i2, C15601d<? super C57325c> dVar) {
            super(2, dVar);
            this.f164215f = context;
            this.f164216g = i;
            this.f164217h = a0Var;
            this.f164218i = str;
            this.f164219j = i2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            C57325c cVar = new C57325c(this.f164215f, this.f164216g, this.f164217h, this.f164218i, this.f164219j, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            Object invokeSuspend = ((C57325c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            C89779i0 i0Var;
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f164214e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Context context = this.f164215f;
                C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f164215f.getString(C0966R.string.j_t), true, true, (DialogInterface.OnCancelListener) null);
                this.f164213d = Q;
                this.f164214e = 1;
                if (C53965x0.m60607b((long) this.f164216g, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
                    return aVar;
                }
                i0Var = Q;
            } else if (i == 1) {
                i0Var = (C89779i0) this.f164213d;
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
                throw illegalStateException;
            }
            if (i0Var != null) {
                i0Var.cancel();
            }
            C94604a0 a0Var = this.f164217h;
            String str = this.f164218i;
            int i2 = this.f164219j;
            Context context2 = this.f164215f;
            C53901i0 i0Var2 = C94604a0.f273773G;
            SnsMethodCalculate.markStartTimeMs("access$jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            a0Var.mo130185d0(str, i2, context2);
            SnsMethodCalculate.markEndTimeMs("access$jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$jumpBrandUI$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$e */
    public static final class C57326e extends C66206a implements C53901i0 {
        public C57326e(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$special$$inlined$CoroutineExceptionHandler$1");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            Log.m105920e("AdLandingHfScreenCombineFollowComp", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            } else {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$special$$inlined$CoroutineExceptionHandler$1");
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1", mo125469f = "AdLandingHfScreenCombineFollowComp.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$f */
    public static final class C57327f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f164220d;

        /* renamed from: e */
        public final /* synthetic */ C94604a0 f164221e;

        /* renamed from: f */
        public final /* synthetic */ String f164222f;

        /* renamed from: g */
        public final /* synthetic */ String f164223g;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1", mo125469f = "AdLandingHfScreenCombineFollowComp.kt", mo125470l = {72}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$f$a */
        public static final class C57328a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f164224d;

            /* renamed from: e */
            public int f164225e;

            /* renamed from: f */
            public final /* synthetic */ C94604a0 f164226f;

            /* renamed from: g */
            public final /* synthetic */ String f164227g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57328a(C94604a0 a0Var, String str, C15601d<? super C57328a> dVar) {
                super(2, dVar);
                this.f164226f = a0Var;
                this.f164227g = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                C57328a aVar = new C57328a(this.f164226f, this.f164227g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                Object invokeSuspend = ((C57328a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C94604a0 a0Var;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f164225e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C94604a0 a0Var2 = this.f164226f;
                    String str = this.f164227g;
                    this.f164224d = a0Var2;
                    this.f164225e = 1;
                    SnsMethodCalculate.markStartTimeMs("getFinderFollowStatus", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                    mVar.mo74609p();
                    AdLandingPagesProxy.getInstance().getAdFinderContact(str, new C10596p0(mVar));
                    Object o = mVar.mo74608o();
                    SnsMethodCalculate.markEndTimeMs("getFinderFollowStatus", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    if (o == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                        return aVar;
                    }
                    a0Var = a0Var2;
                    obj = o;
                } else if (i == 1) {
                    a0Var = (C94604a0) this.f164224d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                    throw illegalStateException;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a0Var.getClass();
                SnsMethodCalculate.markStartTimeMs("setFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                a0Var.f273777E = booleanValue;
                SnsMethodCalculate.markEndTimeMs("setFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                C53901i0 i0Var = C94604a0.f273773G;
                SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$Companion");
                StringBuilder sb = new StringBuilder();
                sb.append("finderStatus = ");
                C94604a0 a0Var3 = this.f164226f;
                a0Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                boolean z = a0Var3.f273777E;
                SnsMethodCalculate.markEndTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                sb.append(z);
                Log.m105924i("AdLandingHfScreenCombineFollowComp", sb.toString());
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$1");
                return b0Var;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2", mo125469f = "AdLandingHfScreenCombineFollowComp.kt", mo125470l = {76}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$f$b */
        public static final class C57329b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f164228d;

            /* renamed from: e */
            public int f164229e;

            /* renamed from: f */
            public final /* synthetic */ C94604a0 f164230f;

            /* renamed from: g */
            public final /* synthetic */ String f164231g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C57329b(C94604a0 a0Var, String str, C15601d<? super C57329b> dVar) {
                super(2, dVar);
                this.f164230f = a0Var;
                this.f164231g = str;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                C57329b bVar = new C57329b(this.f164230f, this.f164231g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                Object invokeSuspend = ((C57329b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C94604a0 a0Var;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f164229e;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C94604a0 a0Var2 = this.f164230f;
                    String str = this.f164231g;
                    this.f164228d = a0Var2;
                    this.f164229e = 1;
                    SnsMethodCalculate.markStartTimeMs("getBrandFollowStatus", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    Object g = C53895h.m60469g(C53872d1.f151119c, new C61325o0(str, (C15601d<? super C61325o0>) null), this);
                    SnsMethodCalculate.markEndTimeMs("getBrandFollowStatus", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    if (g == aVar) {
                        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                        return aVar;
                    }
                    a0Var = a0Var2;
                    obj = g;
                } else if (i == 1) {
                    a0Var = (C94604a0) this.f164228d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                    throw illegalStateException;
                }
                boolean booleanValue = ((Boolean) obj).booleanValue();
                a0Var.getClass();
                SnsMethodCalculate.markStartTimeMs("setBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                a0Var.f273778F = booleanValue;
                SnsMethodCalculate.markEndTimeMs("setBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                C53901i0 i0Var = C94604a0.f273773G;
                SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$Companion");
                StringBuilder sb = new StringBuilder();
                sb.append("brandStatus = ");
                C94604a0 a0Var3 = this.f164230f;
                a0Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                boolean z = a0Var3.f273778F;
                SnsMethodCalculate.markEndTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                sb.append(z);
                Log.m105924i("AdLandingHfScreenCombineFollowComp", sb.toString());
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1$2");
                return b0Var;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57327f(C94604a0 a0Var, String str, String str2, C15601d<? super C57327f> dVar) {
            super(2, dVar);
            this.f164221e = a0Var;
            this.f164222f = str;
            this.f164223g = str2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            C57327f fVar = new C57327f(this.f164221e, this.f164222f, this.f164223g, dVar);
            fVar.f164220d = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            Object invokeSuspend = ((C57327f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f164220d;
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C57328a(this.f164221e, this.f164222f, (C15601d<? super C57328a>) null), 3, (Object) null);
            C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C57329b(this.f164221e, this.f164223g, (C15601d<? super C57329b>) null), 3, (Object) null);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$viewWillAppear$1");
            return b0Var;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$a */
    public static final class C94605a {
        public C94605a(C8480h hVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$b */
    public static final class C94606b {

        /* renamed from: a */
        public final boolean f273779a;

        /* renamed from: b */
        public final boolean f273780b;

        public C94606b(boolean z, boolean z2) {
            this.f273779a = z;
            this.f273780b = z2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$d */
    public static final class C94607d extends C87413o implements C32227p<C99527d.C99528a, C99527d.C99528a, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C94604a0 f273781d;

        /* renamed from: e */
        public final /* synthetic */ C101683n.C101685b f273782e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C94607d(C94604a0 a0Var, C101683n.C101685b bVar) {
            super(2);
            this.f273781d = a0Var;
            this.f273782e = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:68:0x0239  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x023b  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0259  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x025b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r21, java.lang.Object r22) {
            /*
                r20 = this;
                r0 = r20
                java.lang.String r1 = "invoke"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$onBtnClick$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                r3 = r21
                lo2.d$a r3 = (lo2.C99527d.C99528a) r3
                r4 = r22
                lo2.d$a r4 = (lo2.C99527d.C99528a) r4
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                java.lang.String r5 = "brandResult"
                gy3.C87412m.m108594g(r3, r5)
                java.lang.String r6 = "finderResult"
                gy3.C87412m.m108594g(r4, r6)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0 r7 = r0.f273781d
                so2.n$b r8 = r0.f273782e
                java.lang.String r9 = "access$jumpByFollowResult"
                java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
                r7.getClass()
                java.lang.String r11 = "jumpByFollowResult"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r10)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "jumpByFollowResult: "
                r12.append(r13)
                r12.append(r3)
                r13 = 32
                r12.append(r13)
                r12.append(r4)
                r12.append(r13)
                r8.getClass()
                java.lang.String r14 = "getAllFollowedJumpType"
                java.lang.String r15 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r15)
                int r13 = r8.f297678c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r15)
                r12.append(r13)
                r13 = 32
                r12.append(r13)
                java.lang.String r13 = "getAllFollowSuccessJumpType"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
                int r14 = r8.f297679d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
                r12.append(r14)
                java.lang.String r12 = r12.toString()
                java.lang.String r14 = "AdLandingHfScreenCombineFollowComp"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r12)
                boolean r12 = r3.mo138923b()
                r16 = r1
                r1 = 1
                if (r12 == 0) goto L_0x0088
                boolean r12 = r3.mo138922a()
                if (r12 == 0) goto L_0x0094
            L_0x0088:
                boolean r12 = r4.mo138923b()
                if (r12 == 0) goto L_0x00c4
                boolean r12 = r4.mo138922a()
                if (r12 != 0) goto L_0x00c4
            L_0x0094:
                android.content.Context r8 = r7.f273774B
                if (r8 == 0) goto L_0x00a6
                r12 = 2131836783(0x7f113f6f, float:1.9306743E38)
                java.lang.String r12 = r8.getString(r12)
                android.widget.Toast r8 = p910lj.C76701a.makeText((android.content.Context) r8, (java.lang.CharSequence) r12, (int) r1)
                r8.show()
            L_0x00a6:
                boolean r8 = r3.mo138923b()
                if (r8 == 0) goto L_0x00b4
                boolean r8 = r3.mo138922a()
                if (r8 == 0) goto L_0x00b4
                r7.f273778F = r1
            L_0x00b4:
                boolean r8 = r4.mo138923b()
                if (r8 == 0) goto L_0x0133
                boolean r8 = r4.mo138922a()
                if (r8 == 0) goto L_0x0133
                r7.f273777E = r1
                goto L_0x0133
            L_0x00c4:
                boolean r12 = r3.mo138922a()
                r1 = 2000(0x7d0, float:2.803E-42)
                if (r12 == 0) goto L_0x00ee
                boolean r12 = r3.mo138923b()
                if (r12 == 0) goto L_0x00ee
                boolean r12 = r4.mo138923b()
                if (r12 != 0) goto L_0x00ee
                android.content.Context r12 = r7.f273774B
                qs2.i0 r13 = r7.mo131854m()
                int r13 = r13.mo140742i()
                so2.n$a r8 = r8.mo141133a()
                java.lang.String r8 = r8.mo141132a()
                r7.mo130184c0(r12, r13, r8, r1)
                goto L_0x0133
            L_0x00ee:
                boolean r12 = r4.mo138922a()
                java.lang.String r17 = ""
                r18 = 0
                if (r12 == 0) goto L_0x0136
                boolean r12 = r4.mo138923b()
                if (r12 == 0) goto L_0x0136
                boolean r12 = r3.mo138923b()
                if (r12 != 0) goto L_0x0136
                android.content.Context r1 = r7.f273774B
                so2.n$c r8 = r8.mo141134b()
                java.lang.String r8 = r8.mo141135a()
                qs2.i0 r12 = r7.mo131854m()
                if (r12 == 0) goto L_0x0119
                java.lang.String r12 = r12.mo140745l()
                goto L_0x011b
            L_0x0119:
                r12 = r18
            L_0x011b:
                if (r12 != 0) goto L_0x011f
                r12 = r17
            L_0x011f:
                qs2.i0 r13 = r7.mo131854m()
                if (r13 == 0) goto L_0x0129
                java.lang.String r18 = r13.mo140741h()
            L_0x0129:
                if (r18 != 0) goto L_0x012e
                r13 = r17
                goto L_0x0130
            L_0x012e:
                r13 = r18
            L_0x0130:
                r7.mo130186e0(r1, r8, r12, r13)
            L_0x0133:
                r19 = r2
                goto L_0x019b
            L_0x0136:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r15)
                int r12 = r8.f297679d
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r15)
                java.lang.String r13 = "getJUMP_TYPE_TO_BRAND"
                java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r1)
                r19 = r2
                java.lang.String r2 = "access$getJUMP_TYPE_TO_BRAND$cp"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r15)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r1)
                if (r12 != 0) goto L_0x016c
                android.content.Context r1 = r7.f273774B
                qs2.i0 r2 = r7.mo131854m()
                int r2 = r2.mo140742i()
                so2.n$a r8 = r8.mo141133a()
                java.lang.String r8 = r8.mo141132a()
                r12 = 2000(0x7d0, float:2.803E-42)
                r7.mo130184c0(r1, r2, r8, r12)
                goto L_0x019b
            L_0x016c:
                android.content.Context r1 = r7.f273774B
                so2.n$c r2 = r8.mo141134b()
                java.lang.String r2 = r2.mo141135a()
                qs2.i0 r8 = r7.mo131854m()
                if (r8 == 0) goto L_0x0181
                java.lang.String r8 = r8.mo140745l()
                goto L_0x0183
            L_0x0181:
                r8 = r18
            L_0x0183:
                if (r8 != 0) goto L_0x0187
                r8 = r17
            L_0x0187:
                qs2.i0 r12 = r7.mo131854m()
                if (r12 == 0) goto L_0x0191
                java.lang.String r18 = r12.mo140741h()
            L_0x0191:
                if (r18 != 0) goto L_0x0196
                r12 = r17
                goto L_0x0198
            L_0x0196:
                r12 = r18
            L_0x0198:
                r7.mo130186e0(r1, r2, r8, r12)
            L_0x019b:
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0 r1 = r0.f273781d
                so2.n$b r2 = r0.f273782e
                java.lang.String r7 = "access$reportCombineFollowResult"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r10)
                r1.getClass()
                java.lang.String r8 = "reportCombineFollowResult"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r10)
                org.json.JSONObject r9 = new org.json.JSONObject
                r9.<init>()
                qs2.i0 r11 = r1.mo131854m()
                java.lang.String r11 = r11.mo140741h()
                java.lang.String r12 = "snsid"
                r9.put(r12, r11)
                qs2.i0 r11 = r1.mo131854m()
                java.lang.String r11 = r11.mo140745l()
                java.lang.String r12 = "uxinfo"
                r9.put(r12, r11)
                qs2.i0 r11 = r1.mo131854m()
                int r11 = r11.mo140742i()
                java.lang.String r12 = "scene"
                r9.put(r12, r11)
                qs2.i0 r1 = r1.mo131854m()
                java.lang.String r1 = r1.mo140734a()
                java.lang.String r11 = "adExtInfo"
                r9.put(r11, r1)
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                java.lang.String r11 = "extInfo"
                r9.put(r11, r1)
                so2.n$a r11 = r2.mo141133a()
                java.lang.String r11 = r11.mo141132a()
                java.lang.String r12 = "brandUsername"
                r1.put(r12, r11)
                so2.n$a r11 = r2.mo141133a()
                r11.getClass()
                java.lang.String r12 = "getOpenType"
                java.lang.String r13 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
                int r11 = r11.f297675c
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
                java.lang.String r12 = "brandOpenType"
                r1.put(r12, r11)
                so2.n$c r2 = r2.mo141134b()
                java.lang.String r2 = r2.mo141135a()
                java.lang.String r11 = "finderUsername"
                r1.put(r11, r2)
                boolean r2 = r3.mo138923b()
                r11 = -1
                r12 = 0
                if (r2 == 0) goto L_0x023b
                boolean r2 = r3.mo138922a()
                if (r2 == 0) goto L_0x023b
                r2 = 0
                goto L_0x024a
            L_0x023b:
                boolean r2 = r3.mo138923b()
                if (r2 == 0) goto L_0x0249
                boolean r2 = r3.mo138922a()
                if (r2 != 0) goto L_0x0249
                r2 = -1
                goto L_0x024a
            L_0x0249:
                r2 = 1
            L_0x024a:
                r1.put(r5, r2)
                boolean r2 = r4.mo138923b()
                if (r2 == 0) goto L_0x025b
                boolean r2 = r4.mo138922a()
                if (r2 == 0) goto L_0x025b
                r11 = 0
                goto L_0x0269
            L_0x025b:
                boolean r2 = r4.mo138923b()
                if (r2 == 0) goto L_0x0268
                boolean r2 = r4.mo138922a()
                if (r2 != 0) goto L_0x0268
                goto L_0x0269
            L_0x0268:
                r11 = 1
            L_0x0269:
                r1.put(r6, r11)
                java.lang.String r2 = "source"
                r1.put(r2, r12)
                java.lang.String r1 = r9.toString()
                java.lang.String r2 = "obj.toString()"
                gy3.C87412m.m108593f(r1, r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "combineFollowInfo:"
                r2.append(r3)
                r2.append(r1)
                java.lang.String r2 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
                java.lang.String r2 = "sns_ad_halfscreen_combine_follow_result"
                vr2.C102260r.m134858a(r2, r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r10)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r10)
                r1 = r16
                r2 = r19
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0.C94607d.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C94605a((C8480h) null);
    }

    public C94604a0(Context context, C101683n nVar, ViewGroup viewGroup) {
        super(context, nVar, viewGroup);
        this.f273774B = context;
        this.f273775C = nVar;
    }

    /* renamed from: B */
    public void mo124360B() {
        C101683n.C101685b b;
        C101683n.C101686c b2;
        String a;
        C101683n.C101685b b3;
        C101683n.C101684a a2;
        String a3;
        SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        super.mo124360B();
        Log.m105924i("AdLandingHfScreenCombineFollowComp", "viewWillAppear() called");
        if (this.f273776D == null) {
            this.f273776D = C53930o0.m60555b();
        }
        if (mo130183b0()) {
            SnsMethodCalculate.markStartTimeMs("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            if (this.f276027v == null) {
                Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, btn is null");
                SnsMethodCalculate.markEndTimeMs("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else if (this.f276025A) {
                Log.m105928w("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, has already set!");
                SnsMethodCalculate.markEndTimeMs("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            } else {
                this.f276025A = true;
                try {
                    int safeParseDouble = (int) (Util.safeParseDouble("0.6") * 255.0d);
                    if (!Util.isNullOrNil(mo131626O().f296709U)) {
                        mo131626O().f296691C = mo131626O().f296709U;
                    } else if (!Util.isNullOrNil(mo131626O().f296691C)) {
                        mo131626O().f296691C = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), mo131626O().f296691C.substring(1)});
                    }
                    if (!Util.isNullOrNil(mo131626O().f296711W)) {
                        mo131626O().f296696H = mo131626O().f296711W;
                    } else if (!Util.isNullOrNil(mo131626O().f296696H)) {
                        mo131626O().f296696H = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), mo131626O().f296696H.substring(1)});
                    }
                    if (!Util.isNullOrNil(mo131626O().f296710V)) {
                        mo131626O().f296695G = mo131626O().f296710V;
                    } else if (!Util.isNullOrNil(mo131626O().f296695G)) {
                        mo131626O().f296695G = String.format("#%02x%s", new Object[]{Integer.valueOf(safeParseDouble), mo131626O().f296695G.substring(1)});
                    }
                    mo131629U();
                } catch (Throwable th) {
                    Log.m105920e("MicroMsg.Sns.AdLandingPageBtnComponent", "setBtnUIDisable, exp is " + th.toString());
                }
                SnsMethodCalculate.markEndTimeMs("setBtnUIDisable", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageBtnComponent");
            }
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        C101683n nVar = this.f273775C;
        if (nVar == null || (b = nVar.mo141131b()) == null || (b2 = b.mo141134b()) == null || (a = b2.mo141135a()) == null) {
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        C101683n nVar2 = this.f273775C;
        if (nVar2 == null || (b3 = nVar2.mo141131b()) == null || (a2 = b3.mo141133a()) == null || (a3 = a2.mo141132a()) == null) {
            SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        C0000n0 n0Var = this.f273776D;
        if (n0Var != null) {
            C53895h.m60466d(n0Var, f273773G, (C53934p0) null, new C57327f(this, a, a3, (C15601d<? super C57327f>) null), 2, (Object) null);
        }
        SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    /* renamed from: C */
    public void mo67235C() {
        SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        super.mo67235C();
        C0000n0 n0Var = this.f273776D;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        this.f273776D = null;
        SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    /* renamed from: P */
    public void mo130182P() {
        C101683n.C101685b b;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        View view;
        C94606b bVar;
        String str6;
        C94607d dVar;
        boolean z;
        String str7;
        C101218e0 e0Var;
        boolean z2;
        C94606b bVar2;
        boolean z3;
        boolean z4;
        SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        C101683n nVar = this.f273775C;
        if (nVar == null || (b = nVar.mo141131b()) == null) {
            mo131613G();
            SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
            return;
        }
        if (this.f273776D == null) {
            this.f273776D = C53930o0.m60555b();
        }
        C66696h.C66697a aVar = this.f276010t;
        SnsMethodCalculate.markStartTimeMs("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        String str8 = b.f297676a;
        SnsMethodCalculate.markEndTimeMs("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
        String str9 = "";
        if (str8 == null) {
            str8 = str9;
        }
        aVar.mo90729c("headTitle", str8);
        C66696h.C66697a aVar2 = this.f276010t;
        String a = b.mo141133a().mo141132a();
        if (a == null) {
            a = str9;
        }
        aVar2.mo90729c("brandUsername", a);
        C66696h.C66697a aVar3 = this.f276010t;
        String a2 = b.mo141134b().mo141135a();
        if (a2 == null) {
            a2 = str9;
        }
        aVar3.mo90729c("finderUsername", a2);
        if (mo130183b0()) {
            Log.m105928w("AdLandingHfScreenCombineFollowComp", "canNotJumpAddBrand!");
            mo131613G();
            str2 = "onBtnClick";
            str = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
        } else {
            boolean z5 = this.f273777E;
            if (!z5 || !this.f273778F) {
                C53901i0 i0Var = C99527d.f291768a;
                Context context = this.f273774B;
                C0000n0 n0Var = this.f273776D;
                boolean z6 = this.f273778F;
                C94606b bVar3 = new C94606b(z5, z6);
                C94607d dVar2 = new C94607d(this, b);
                boolean z7 = z6;
                SnsMethodCalculate.markStartTimeMs("showHfScreen", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
                if (context == null) {
                    SnsMethodCalculate.markEndTimeMs("showHfScreen", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
                } else {
                    String str10 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper";
                    C101218e0 e0Var2 = new C101218e0(context, 1, 0);
                    e0Var2.mo140667n(context.getString(C0966R.string.f7926wf), context.getString(C0966R.string.a18));
                    View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.czf, (ViewGroup) null);
                    View findViewById = inflate != null ? inflate.findViewById(C0966R.C0970id.ncf) : null;
                    if (inflate != null) {
                        view = inflate.findViewById(C0966R.C0970id.ncg);
                        str5 = str9;
                    } else {
                        str5 = str9;
                        view = null;
                    }
                    CheckBox checkBox = findViewById != null ? (CheckBox) findViewById.findViewById(C0966R.C0970id.nch) : null;
                    CheckBox checkBox2 = view != null ? (CheckBox) view.findViewById(C0966R.C0970id.nch) : null;
                    if (n0Var != null) {
                        str3 = "onBtnClick";
                        dVar = dVar2;
                        str6 = "showHfScreen";
                        z = z7;
                        e0Var = e0Var2;
                        str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
                        str7 = str10;
                        bVar = bVar3;
                        C53895h.m60466d(n0Var, C99527d.f291768a, (C53934p0) null, new C61320e(inflate, b, context, (C15601d<? super C61320e>) null), 2, (Object) null);
                    } else {
                        str3 = "onBtnClick";
                        str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
                        str6 = "showHfScreen";
                        dVar = dVar2;
                        e0Var = e0Var2;
                        bVar = bVar3;
                        z = z7;
                        str7 = str10;
                    }
                    TextView textView = inflate != null ? (TextView) inflate.findViewById(C0966R.C0970id.nce) : null;
                    if (textView != null) {
                        SnsMethodCalculate.markStartTimeMs("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                        String str11 = b.f297676a;
                        SnsMethodCalculate.markEndTimeMs("getHeadTitle", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                        textView.setText(str11);
                    }
                    TextView textView2 = findViewById != null ? (TextView) findViewById.findViewById(C0966R.C0970id.nck) : null;
                    if (textView2 != null) {
                        textView2.setText(context.getString(C0966R.string.mpo));
                    }
                    TextView textView3 = findViewById != null ? (TextView) findViewById.findViewById(C0966R.C0970id.nci) : null;
                    if (textView3 != null) {
                        C101683n.C101684a a3 = b.mo141133a();
                        a3.getClass();
                        SnsMethodCalculate.markStartTimeMs("getBrandDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
                        String str12 = a3.f297674b;
                        SnsMethodCalculate.markEndTimeMs("getBrandDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo");
                        if (str12 == null) {
                            str12 = str5;
                        }
                        textView3.setText(str12);
                    }
                    TextView textView4 = view != null ? (TextView) view.findViewById(C0966R.C0970id.nck) : null;
                    if (textView4 != null) {
                        textView4.setText(context.getString(C0966R.string.mpq));
                    }
                    TextView textView5 = view != null ? (TextView) view.findViewById(C0966R.C0970id.nci) : null;
                    if (textView5 != null) {
                        C101683n.C101686c b2 = b.mo141134b();
                        b2.getClass();
                        SnsMethodCalculate.markStartTimeMs("getFinderDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
                        String str13 = b2.f297683b;
                        SnsMethodCalculate.markEndTimeMs("getFinderDesc", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$FinderFollowInfo");
                        if (str13 == null) {
                            str13 = str5;
                        }
                        textView5.setText(str13);
                    }
                    CheckBox checkBox3 = checkBox;
                    if (checkBox3 == null) {
                        z2 = true;
                    } else {
                        z2 = true;
                        checkBox3.setChecked(true);
                    }
                    if (checkBox2 != null) {
                        checkBox2.setChecked(z2);
                    }
                    SnsMethodCalculate.markStartTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    SnsMethodCalculate.markEndTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    if (z) {
                        TextView textView6 = findViewById != null ? (TextView) findViewById.findViewById(C0966R.C0970id.ncj) : null;
                        if (textView6 == null) {
                            z4 = false;
                        } else {
                            z4 = false;
                            textView6.setVisibility(0);
                        }
                        if (checkBox3 != null) {
                            checkBox3.setEnabled(z4);
                        }
                    } else if (findViewById != null) {
                        findViewById.setOnClickListener(new C10594f(checkBox3));
                    }
                    SnsMethodCalculate.markStartTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    SnsMethodCalculate.markEndTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                    if (z5) {
                        TextView textView7 = view != null ? (TextView) view.findViewById(C0966R.C0970id.ncj) : null;
                        if (textView7 == null) {
                            z3 = false;
                        } else {
                            z3 = false;
                            textView7.setVisibility(0);
                        }
                        if (checkBox2 != null) {
                            checkBox2.setEnabled(z3);
                        }
                    } else if (view != null) {
                        view.setOnClickListener(new C10595g(checkBox2));
                    }
                    if (checkBox3 != null) {
                        bVar2 = bVar;
                        checkBox3.setOnCheckedChangeListener(new C99541h(checkBox3, bVar2, checkBox2, e0Var));
                    } else {
                        bVar2 = bVar;
                    }
                    if (checkBox2 != null) {
                        checkBox2.setOnCheckedChangeListener(new C99543i(checkBox3, bVar2, checkBox2, e0Var));
                    }
                    e0Var.mo140668o(0);
                    C46880j jVar = new C46880j(e0Var);
                    C99546k kVar = new C99546k(context, e0Var, n0Var, dVar, checkBox3, bVar2, b, checkBox2);
                    e0Var.f296373D = jVar;
                    e0Var.f296374E = kVar;
                    e0Var.mo140663j(inflate);
                    e0Var.mo140655A();
                    SnsMethodCalculate.markEndTimeMs(str6, str7);
                    mo131613G();
                    str = str4;
                    str2 = str3;
                }
            } else {
                SnsMethodCalculate.markStartTimeMs("getAllFollowedJumpType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                int i = b.f297678c;
                SnsMethodCalculate.markEndTimeMs("getAllFollowedJumpType", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                SnsMethodCalculate.markStartTimeMs("getJUMP_TYPE_TO_BRAND", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
                SnsMethodCalculate.markStartTimeMs("access$getJUMP_TYPE_TO_BRAND$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                SnsMethodCalculate.markEndTimeMs("access$getJUMP_TYPE_TO_BRAND$cp", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo");
                SnsMethodCalculate.markEndTimeMs("getJUMP_TYPE_TO_BRAND", "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$CombineFollowInfo$Companion");
                if (i == 0) {
                    Context context2 = this.f273774B;
                    int i2 = mo131854m().mo140742i();
                    String a4 = b.mo141133a().mo141132a();
                    SnsMethodCalculate.markStartTimeMs("jumpBrandUI$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                    mo130184c0(context2, i2, a4, 0);
                    SnsMethodCalculate.markEndTimeMs("jumpBrandUI$default", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
                } else {
                    Context context3 = this.f273774B;
                    String a5 = b.mo141134b().mo141135a();
                    C101271i0 m = mo131854m();
                    String l = m != null ? m.mo140745l() : null;
                    if (l == null) {
                        l = str9;
                    }
                    C101271i0 m2 = mo131854m();
                    String h = m2 != null ? m2.mo140741h() : null;
                    if (h != null) {
                        str9 = h;
                    }
                    mo130186e0(context3, a5, l, str9);
                }
            }
            str3 = "onBtnClick";
            str4 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp";
            mo131613G();
            str = str4;
            str2 = str3;
        }
        SnsMethodCalculate.markEndTimeMs(str2, str);
    }

    /* renamed from: b0 */
    public final boolean mo130183b0() {
        SnsMethodCalculate.markStartTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        int i = mo131854m().mo140742i();
        int e = mo131854m().mo140738e();
        Log.m105924i("AdLandingHfScreenCombineFollowComp", "canNotJumpAddBrand, source=" + i + ", originSource=" + e);
        boolean z = SnsAdNativeLandingPagesUI.m121814z8(i) || SnsAdNativeLandingPagesUI.m121814z8(e) || i == 27 || e == 27 || i == 7 || e == 7;
        SnsMethodCalculate.markEndTimeMs("canNotJumpAddBrand", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0101  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo130184c0(android.content.Context r20, int r21, java.lang.String r22, int r23) {
        /*
            r19 = this;
            r8 = r19
            r0 = r20
            r5 = r22
            java.lang.String r9 = "jumpBrandUI"
            java.lang.String r10 = "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r10)
            if (r0 == 0) goto L_0x012e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r22)
            if (r1 == 0) goto L_0x0018
            goto L_0x012e
        L_0x0018:
            so2.n r1 = r8.f273775C
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x004c
            so2.n$b r1 = r1.mo141131b()
            if (r1 == 0) goto L_0x004c
            so2.n$a r1 = r1.mo141133a()
            if (r1 == 0) goto L_0x004c
            java.lang.String r4 = "getOpenType"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r6)
            int r1 = r1.f297675c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r6)
            java.lang.String r4 = "getOPEN_TYPE_TO_CHAT"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.landingpage.component.info.AdLandingHfScreenCombineFollowInfo$BrandFollowInfo$Companion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r7)
            java.lang.String r11 = "access$getOPEN_TYPE_TO_CHAT$cp"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r6)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r7)
            if (r1 != r3) goto L_0x004c
            r1 = 1
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            if (r1 == 0) goto L_0x0101
            if (r5 != 0) goto L_0x0054
            java.lang.String r0 = ""
            r5 = r0
        L_0x0054:
            java.lang.String r1 = "jumpToBrand"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r10)
            android.content.Context r0 = r8.f273774B
            java.lang.String r4 = "AdLandingHfScreenCombineFollowComp"
            if (r0 == 0) goto L_0x00f5
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r0 == 0) goto L_0x0068
            goto L_0x00f5
        L_0x0068:
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy r0 = com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy.getInstance()     // Catch:{ Exception -> 0x0085 }
            r0.updateContact(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0085 }
            r0.<init>()     // Catch:{ Exception -> 0x0085 }
            java.lang.String r6 = "jumpToBrand: updateContact, tools, respUsername = "
            r0.append(r6)     // Catch:{ Exception -> 0x0085 }
            r0.append(r5)     // Catch:{ Exception -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0085 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)     // Catch:{ Exception -> 0x0085 }
            goto L_0x009b
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "updateContact: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r0)
        L_0x009b:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r4 = "Chat_User"
            r0.putExtra(r4, r5)
            java.lang.String r4 = "key_has_add_contact"
            r0.putExtra(r4, r3)
            java.lang.String r4 = "finish_direct"
            r0.putExtra(r4, r3)
            android.content.Context r3 = r8.f273774B
            java.lang.String r4 = "com.tencent.mm.ui.chatting.ChattingUI"
            r0.setClassName(r3, r4)
            android.content.Context r3 = r8.f273774B
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r0)
            java.lang.Object[] r12 = r4.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHfScreenCombineFollowComp"
            java.lang.String r14 = "jumpToBrand"
            java.lang.String r15 = "(Ljava/lang/String;)V"
            java.lang.String r16 = "Undefined"
            java.lang.String r17 = "startActivity"
            java.lang.String r18 = "(Landroid/content/Intent;)V"
            r11 = r3
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = r4.mo10231a(r2)
            android.content.Intent r0 = (android.content.Intent) r0
            r3.startActivity(r0)
            java.lang.String r12 = "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHfScreenCombineFollowComp"
            java.lang.String r13 = "jumpToBrand"
            java.lang.String r14 = "(Ljava/lang/String;)V"
            java.lang.String r15 = "Undefined"
            java.lang.String r16 = "startActivity"
            java.lang.String r17 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
            goto L_0x00fd
        L_0x00f5:
            java.lang.String r0 = "context or name is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r10)
        L_0x00fd:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x0101:
            if (r23 <= 0) goto L_0x0125
            a14.n0 r11 = r8.f273776D
            if (r11 == 0) goto L_0x012a
            a14.i0 r12 = f273773G
            r13 = 0
            com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$c r14 = new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$c
            r7 = 0
            r1 = r14
            r2 = r20
            r3 = r23
            r4 = r19
            r5 = r22
            r6 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r4 = 2
            r5 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            a14.C53895h.m60466d(r0, r1, r2, r3, r4, r5)
            goto L_0x012a
        L_0x0125:
            r1 = r21
            r8.mo130185d0(r5, r1, r0)
        L_0x012a:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        L_0x012e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0.mo130184c0(android.content.Context, int, java.lang.String, int):void");
    }

    /* renamed from: d0 */
    public final void mo130185d0(String str, int i, Context context) {
        SnsMethodCalculate.markStartTimeMs("jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        Intent intent = new Intent();
        intent.putExtra("Contact_User", str);
        SnsAdClick snsAdClick = new SnsAdClick();
        snsAdClick.f267472g = 101;
        intent.putExtra("KSnsAdTag", snsAdClick);
        intent.putExtra("Contact_Scene", WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", i == 0 ? 6 : 1);
        C88144b.m109791i(context, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        SnsMethodCalculate.markEndTimeMs("jumpBrandUIInternal", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }

    /* renamed from: e0 */
    public final void mo130186e0(Context context, String str, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("jumpFinderUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
        C87412m.m108594g(str, "finderUserName");
        C87412m.m108594g(str2, "uxInfo");
        C87412m.m108594g(str3, "snsId");
        AdLandingPagesProxy.getInstance().doJumpToFinderProfileUI(context, str, str2, str3, 5);
        SnsMethodCalculate.markEndTimeMs("jumpFinderUI", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp");
    }
}
