package com.tencent.p014mm.plugin.appbrand.jsapi.auth;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import az0.C39666f;
import az0.C79640g;
import br0.C79774c;
import bz0.C79889p;
import bz0.C79890q;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.C83705n3;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListUI;
import com.tencent.p014mm.plugin.car_license_plate.p030ui.CarLicensePlateListViewContract$ViewModel;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cr0.C86127t;
import cz0.C86159b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gt0.C87327c0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import li0.C88508b;
import li0.C88509c;
import op0.C89256c;
import p210o.C11323a;
import rx3.C13598b0;
import sx3.C64186f0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yq0.C91566l;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0 */
public final class C82185m0 implements C79890q, C83705n3 {

    /* renamed from: a */
    public C81879g f241036a;

    /* renamed from: b */
    public final C0000n0 f241037b = C53930o0.m60555b();

    /* renamed from: c */
    public C82187b f241038c;

    /* renamed from: d */
    public C79889p f241039d;

    /* renamed from: e */
    public C91566l f241040e;

    /* renamed from: f */
    public DialogInterface f241041f;

    /* renamed from: g */
    public AtomicBoolean f241042g = new AtomicBoolean(false);

    /* renamed from: h */
    public final WACarLicensePlateAuthLogStruct f241043h = new WACarLicensePlateAuthLogStruct();

    /* renamed from: i */
    public final C82193g f241044i;

    /* renamed from: j */
    public final C82188c f241045j;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$a */
    public interface C82186a {
        /* renamed from: a */
        void mo114597a(String str);

        void onUserCancel();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b */
    public enum C82187b {
        HALF_SCREEN_DIALOG,
        ACTIVITY
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$c */
    public static final class C82188c implements C88509c.C88512b, C82531i.C82534c {

        /* renamed from: d */
        public final /* synthetic */ C82185m0 f241049d;

        public C82188c(C82185m0 m0Var) {
            this.f241049d = m0Var;
        }

        /* renamed from: b */
        public void mo113102b(String str, C88508b bVar) {
            if (C88508b.DESTROYED == bVar) {
                this.f241049d.mo114594g(false);
            }
        }

        public void onDestroy() {
            this.f241049d.mo114594g(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$d */
    public static final class C82189d extends C87413o implements C32226l<Instrumentation.ActivityResult, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C82185m0 f241050d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82189d(C82185m0 m0Var) {
            super(1);
            this.f241050d = m0Var;
        }

        public Object invoke(Object obj) {
            Instrumentation.ActivityResult activityResult = (Instrumentation.ActivityResult) obj;
            C87412m.m108594g(activityResult, LocaleUtil.ITALIAN);
            int resultCode = activityResult.getResultCode();
            Intent resultData = activityResult.getResultData();
            if (resultCode == -1) {
                List stringArrayListExtra = resultData != null ? resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST") : null;
                if (stringArrayListExtra == null) {
                    stringArrayListExtra = C64186f0.f181907d;
                }
                if (stringArrayListExtra.isEmpty()) {
                    C82185m0 m0Var = this.f241050d;
                    m0Var.f241043h.f236459i = 2;
                    m0Var.f241044i.onUserCancel();
                } else {
                    C82185m0 m0Var2 = this.f241050d;
                    m0Var2.f241038c = C82187b.HALF_SCREEN_DIALOG;
                    m0Var2.f241043h.f236459i = 1;
                    m0Var2.mo114595h().mo118135b(stringArrayListExtra);
                    C82185m0 m0Var3 = this.f241050d;
                    m0Var3.mo110053a(m0Var3.mo114595h().f248031d);
                }
            } else {
                this.f241050d.f241044i.onUserCancel();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$e */
    public static final class C82190e<I, O> implements C11323a {

        /* renamed from: a */
        public final /* synthetic */ AppBrandRuntime f241051a;

        public C82190e(AppBrandRuntime appBrandRuntime) {
            this.f241051a = appBrandRuntime;
        }

        public Object apply(Object obj) {
            Context context = (Context) obj;
            C87327c0 c0Var = new C87327c0(this.f241051a.f238141d);
            c0Var.setMessage(MMApplicationContext.getString(C0966R.string.f360085a04));
            return c0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.jsapi.auth.WxaCarLicensePlateChooserViewController$startListUI$1", mo125469f = "JsApiChooseLicensePlate.kt", mo125470l = {402, 407}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$f */
    public static final class C82191f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f241052d;

        /* renamed from: e */
        public final /* synthetic */ Activity f241053e;

        /* renamed from: f */
        public final /* synthetic */ CarLicensePlateListViewContract$ViewModel f241054f;

        /* renamed from: g */
        public final /* synthetic */ C32226l<Instrumentation.ActivityResult, C13598b0> f241055g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$f$a */
        public static final class C82192a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32226l<Instrumentation.ActivityResult, C13598b0> f241056d;

            /* renamed from: e */
            public final /* synthetic */ Instrumentation.ActivityResult f241057e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C82192a(C32226l<? super Instrumentation.ActivityResult, C13598b0> lVar, Instrumentation.ActivityResult activityResult) {
                super(0);
                this.f241056d = lVar;
                this.f241057e = activityResult;
            }

            public Object invoke() {
                C32226l<Instrumentation.ActivityResult, C13598b0> lVar = this.f241056d;
                if (lVar != null) {
                    lVar.invoke(this.f241057e);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C82191f(Activity activity, CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel, C32226l<? super Instrumentation.ActivityResult, C13598b0> lVar, C15601d<? super C82191f> dVar) {
            super(2, dVar);
            this.f241053e = activity;
            this.f241054f = carLicensePlateListViewContract$ViewModel;
            this.f241055g = lVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C82191f(this.f241053e, this.f241054f, this.f241055g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C82191f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f241052d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Activity activity = this.f241053e;
                Intent intent = new Intent(this.f241053e, CarLicensePlateListUI.class);
                CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f241054f;
                if (carLicensePlateListViewContract$ViewModel != null) {
                    intent.putExtra("INTENT_KEY_VIEW_MODEL", carLicensePlateListViewContract$ViewModel);
                }
                this.f241052d = 1;
                obj = C86159b.m106675c(activity, intent, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return C13598b0.f38549a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C82192a aVar2 = new C82192a(this.f241055g, (Instrumentation.ActivityResult) obj);
            this.f241052d = 2;
            if (C86159b.m106676d(aVar2, this) == aVar) {
                return aVar;
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.auth.m0$g */
    public static final class C82193g implements C82186a {

        /* renamed from: a */
        public final /* synthetic */ C82186a f241058a;

        /* renamed from: b */
        public final /* synthetic */ C82185m0 f241059b;

        public C82193g(C82186a aVar, C82185m0 m0Var) {
            this.f241058a = aVar;
            this.f241059b = m0Var;
        }

        /* renamed from: a */
        public void mo114597a(String str) {
            C87412m.m108594g(str, "plateNo");
            C82186a aVar = this.f241058a;
            if (aVar != null) {
                aVar.mo114597a(str);
            }
            this.f241059b.mo114594g(true);
        }

        public void onUserCancel() {
            C82186a aVar = this.f241058a;
            if (aVar != null) {
                aVar.onUserCancel();
            }
            this.f241059b.mo114594g(true);
        }
    }

    public C82185m0(C81879g gVar, C82186a aVar) {
        this.f241036a = gVar;
        this.f241044i = new C82193g(aVar, this);
        this.f241045j = new C82188c(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: sx3.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: sx3.f0} */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r7 = r1.f247996d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo110053a(com.tencent.p014mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b r2 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82185m0.C82187b.ACTIVITY
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b r3 = com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82185m0.C82187b.HALF_SCREEN_DIALOG
            java.util.concurrent.atomic.AtomicBoolean r4 = r0.f241042g
            boolean r4 = r4.get()
            if (r4 == 0) goto L_0x0011
            return
        L_0x0011:
            android.content.DialogInterface r4 = r0.f241041f
            if (r4 == 0) goto L_0x0018
            r4.dismiss()
        L_0x0018:
            r4 = 0
            r0.f241041f = r4
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x002c
            java.util.ArrayList<java.lang.String> r7 = r1.f247996d
            if (r7 == 0) goto L_0x002c
            boolean r7 = r7.isEmpty()
            r7 = r7 ^ r6
            if (r7 != r6) goto L_0x002c
            r7 = 1
            goto L_0x002d
        L_0x002c:
            r7 = 0
        L_0x002d:
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b r8 = r0.f241038c
            r9 = 2
            if (r8 != 0) goto L_0x0050
            if (r7 == 0) goto L_0x0037
            r8 = r3
            goto L_0x0038
        L_0x0037:
            r8 = r2
        L_0x0038:
            r0.f241038c = r8
            int r8 = r8.ordinal()
            if (r8 == 0) goto L_0x0048
            if (r8 == r6) goto L_0x0043
            goto L_0x0050
        L_0x0043:
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct r8 = r0.f241043h
            r8.f236458h = r9
            goto L_0x0050
        L_0x0048:
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct r8 = r0.f241043h
            r11 = 1
            r8.f236458h = r11
            r8.f236460j = r11
        L_0x0050:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "onRenderData, isNotEmpty:"
            r8.append(r11)
            r8.append(r7)
            java.lang.String r11 = ", settled displayMode:"
            r8.append(r11)
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b r11 = r0.f241038c
            java.lang.String r12 = "displayMode"
            if (r11 == 0) goto L_0x0212
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "MicroMsg.WxaCarLicensePlateChooserViewController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r8)
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$b r8 = r0.f241038c
            if (r8 == 0) goto L_0x020e
            if (r3 == r8) goto L_0x00a3
            if (r8 == 0) goto L_0x009f
            if (r2 != r8) goto L_0x0081
            if (r7 == 0) goto L_0x0081
            goto L_0x00a3
        L_0x0081:
            if (r8 == 0) goto L_0x009b
            if (r2 != r8) goto L_0x020d
            if (r7 != 0) goto L_0x020d
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r1 = r18.mo114595h()
            r1.f248032e = r6
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r1 = r18.mo114595h()
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$d r2 = new com.tencent.mm.plugin.appbrand.jsapi.auth.m0$d
            r2.<init>(r0)
            r0.mo114596i(r1, r2)
            goto L_0x020d
        L_0x009b:
            gy3.C87412m.m108603p(r12)
            throw r4
        L_0x009f:
            gy3.C87412m.m108603p(r12)
            throw r4
        L_0x00a3:
            com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel r2 = r18.mo114595h()
            r2.f248032e = r5
            com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct r2 = r0.f241043h
            long r11 = r2.f236460j
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x00b5
            r8 = 3
            r2.f236460j = r8
        L_0x00b5:
            if (r7 == 0) goto L_0x0208
            yq0.l r2 = r0.f241040e
            if (r2 != 0) goto L_0x0193
            com.tencent.mm.plugin.appbrand.g r2 = r0.f241036a
            gy3.C87412m.m108591d(r2)
            com.tencent.mm.plugin.appbrand.jsapi.auth.n0 r3 = new com.tencent.mm.plugin.appbrand.jsapi.auth.n0
            r3.<init>(r0, r2)
            yq0.l r3 = yq0.C91566l.C91567a.m114904a(r2, r3, r4)
            r0.f241040e = r3
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = r2.getRuntime()
            wi0.l r8 = r8.mo113051d0()
            java.lang.String r8 = r8.f261061d
            r3.setAppBrandName(r8)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r8 = r2.getRuntime()
            wi0.l r8 = r8.mo113051d0()
            java.lang.String r8 = r8.f261063f
            r3.setIconUrl(r8)
            r8 = 2131822975(0x7f11097f, float:1.9278737E38)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r8)
            r3.setApplyWording(r8)
            r8 = 2131822976(0x7f110980, float:1.9278739E38)
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r8)
            r3.setRequestDesc(r8)
            zy0.a r8 = zy0.C91946a.f263217a
            r8.getClass()
            rc.i r9 = zy0.C91946a.f263219c
            ny3.m<java.lang.Object>[] r10 = zy0.C91946a.f263218b
            r11 = r10[r5]
            java.lang.Object r9 = r9.mo124238b(r8, r11)
            java.lang.String r9 = (java.lang.String) r9
            r3.setSimpleDetailDesc(r9)
            rc.i r9 = zy0.C91946a.f263220d
            r10 = r10[r6]
            java.lang.Object r8 = r9.mo124238b(r8, r10)
            te3.p4 r8 = (te3.C90429p4) r8
            boolean r9 = r8.f259729d
            if (r9 == 0) goto L_0x0137
            java.lang.String r9 = r8.f259730e
            if (r9 == 0) goto L_0x0128
            int r9 = r9.length()
            if (r9 != 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            r9 = 0
            goto L_0x0129
        L_0x0128:
            r9 = 1
        L_0x0129:
            if (r9 != 0) goto L_0x0137
            r3.mo121473t(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.o0 r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.o0
            r6.<init>(r3, r2, r8)
            r3.setExplainOnClickListener(r6)
            goto L_0x013a
        L_0x0137:
            r3.mo121473t(r5)
        L_0x013a:
            r6 = 2131822981(0x7f110985, float:1.9278749E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r6)
            r3.setFunctionButtonText(r6)
            r6 = 2131101015(0x7f060557, float:1.7814428E38)
            int r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getColor(r6)
            r3.setFunctionButtonTextColor(r6)
            com.tencent.mm.plugin.appbrand.jsapi.auth.p0 r6 = new com.tencent.mm.plugin.appbrand.jsapi.auth.p0
            r6.<init>(r0)
            r3.setFunctionButtonOnClickListener(r6)
            r6 = 2131832234(0x7f112daa, float:1.9297516E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r6)
            r3.setPositiveButtonText(r6)
            r6 = 2131832299(0x7f112deb, float:1.9297648E38)
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getString(r6)
            r3.setNegativeButtonText(r6)
            te3.gp4 r6 = zy0.C91946a.f263222f
            if (r6 == 0) goto L_0x0190
            boolean r8 = r6.f183354d
            if (r8 == 0) goto L_0x0190
            java.lang.String r8 = r6.f183355e
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x0190
            java.lang.String r6 = r6.f183355e
            java.lang.String r8 = "userPrivacyProtectInfo.wording"
            gy3.C87412m.m108593f(r6, r8)
            r3.setUserAgreementCheckBoxWording(r6)
            java.lang.Class<com.tencent.mm.plugin.appbrand.jsapi.j0> r6 = com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0.class
            ra.b r6 = r2.mo109668l(r6)
            com.tencent.mm.plugin.appbrand.jsapi.j0 r6 = (com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0) r6
            r3.setIExternalToolsHelper(r6)
        L_0x0190:
            r3.mo121451o(r2)
        L_0x0193:
            yq0.l r2 = r0.f241040e
            if (r2 == 0) goto L_0x0202
            if (r7 == 0) goto L_0x01fc
            gy3.C87412m.m108591d(r19)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList<java.lang.String> r6 = r1.f247996d
            java.util.Iterator r6 = r6.iterator()
            r15 = 0
        L_0x01a8:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01fe
            java.lang.Object r7 = r6.next()
            int r16 = r15 + 1
            if (r15 < 0) goto L_0x01f8
            java.lang.String r7 = (java.lang.String) r7
            gt0.d0$a r14 = new gt0.d0$a
            r8 = 1
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 2
            java.lang.String r11 = u24.C90599h.m113522o(r7, r5, r10)
            r9.append(r11)
            r11 = 183(0xb7, float:2.56E-43)
            r9.append(r11)
            int r11 = r7.length()
            java.lang.String r10 = u24.C90599h.m113522o(r7, r10, r11)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r12 = 0
            java.lang.String r10 = r1.f247997e
            boolean r13 = gy3.C87412m.m108589b(r10, r7)
            java.lang.String r10 = ""
            java.lang.String r11 = "webapi_userplateinfo"
            java.lang.String r17 = ""
            r7 = r14
            r5 = r14
            r14 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r3.add(r5)
            r15 = r16
            r5 = 0
            goto L_0x01a8
        L_0x01f8:
            sx3.C64197v.m75542k()
            throw r4
        L_0x01fc:
            sx3.f0 r3 = sx3.C64186f0.f181907d
        L_0x01fe:
            r2.setSelectListItem(r3)
            goto L_0x020d
        L_0x0202:
            java.lang.String r1 = "listHalfScreenDialog"
            gy3.C87412m.m108603p(r1)
            throw r4
        L_0x0208:
            com.tencent.mm.plugin.appbrand.jsapi.auth.m0$g r1 = r0.f241044i
            r1.onUserCancel()
        L_0x020d:
            return
        L_0x020e:
            gy3.C87412m.m108603p(r12)
            throw r4
        L_0x0212:
            gy3.C87412m.m108603p(r12)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.auth.C82185m0.mo110053a(com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo):void");
    }

    /* renamed from: b */
    public void mo110054b(C79890q.C79891a aVar) {
        C87412m.m108594g(aVar, "request");
        if (C79890q.C79891a.FETCH_DATA_NO_CACHE == aVar) {
            C81879g gVar = this.f241036a;
            AppBrandRuntime runtime = gVar != null ? gVar.getRuntime() : null;
            if (runtime != null) {
                C89256c cVar = new C89256c();
                cVar.f257150d = new C82190e(runtime);
                cVar.mo123573a(runtime);
                this.f241041f = cVar;
            }
        }
    }

    /* renamed from: c */
    public void mo110055c(C39666f fVar) {
        C87412m.m108594g(fVar, "exception");
        Log.m105920e("MicroMsg.WxaCarLicensePlateChooserViewController", "onRenderError(" + fVar + ')');
        C86159b.m106674b(fVar);
        if ((fVar.f106441g instanceof C79640g) && this.f241038c == null) {
            this.f241044i.onUserCancel();
        }
    }

    /* renamed from: d */
    public Activity mo110056d() {
        C81879g gVar = this.f241036a;
        C79774c f0 = gVar != null ? gVar.mo114271f0() : null;
        C86127t tVar = f0 instanceof C86127t ? (C86127t) f0 : null;
        if (tVar != null) {
            return tVar.mo120548w();
        }
        return null;
    }

    /* renamed from: e */
    public void mo114593e(AppBrandRuntime appBrandRuntime, AppBrandInitConfig appBrandInitConfig) {
        if (appBrandRuntime != null) {
            appBrandRuntime.f238108F.remove(this);
        }
        mo114594g(false);
    }

    /* renamed from: f */
    public C0000n0 mo110057f() {
        return this.f241037b;
    }

    /* renamed from: g */
    public final void mo114594g(boolean z) {
        AppBrandRuntime runtime;
        C88509c cVar;
        if (!this.f241042g.getAndSet(true)) {
            Log.m105924i("MicroMsg.WxaCarLicensePlateChooserViewController", "dismiss stack:" + android.util.Log.getStackTraceString(new Throwable()));
            C81879g gVar = this.f241036a;
            C83780d1 d1Var = gVar instanceof C83780d1 ? (C83780d1) gVar : null;
            if (d1Var != null) {
                d1Var.mo114867r(this.f241045j);
            }
            C81879g gVar2 = this.f241036a;
            if (!(gVar2 == null || (runtime = gVar2.getRuntime()) == null || (cVar = runtime.f238113K) == null)) {
                cVar.mo122982e(this.f241045j);
            }
            this.f241042g.set(true);
            C53930o0.m60558e(this.f241037b, (CancellationException) null, 1, (Object) null);
            C91566l lVar = this.f241040e;
            if (lVar != null) {
                if (lVar != null) {
                    C81879g gVar3 = this.f241036a;
                    C87412m.m108591d(gVar3);
                    lVar.mo121452s(gVar3);
                } else {
                    C87412m.m108603p("listHalfScreenDialog");
                    throw null;
                }
            }
            DialogInterface dialogInterface = this.f241041f;
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
            this.f241041f = null;
            this.f241036a = null;
            if (z) {
                this.f241043h.mo86054n();
            }
        }
    }

    /* renamed from: h */
    public final CarLicensePlateListViewContract$ViewModel mo114595h() {
        C79889p pVar = this.f241039d;
        if (pVar != null) {
            return pVar.getViewModel();
        }
        C87412m.m108603p("viewPresenter");
        throw null;
    }

    /* renamed from: i */
    public final void mo114596i(CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel, C32226l<? super Instrumentation.ActivityResult, C13598b0> lVar) {
        Activity d = mo110056d();
        if (d == null) {
            Log.m105920e("MicroMsg.WxaCarLicensePlateChooserViewController", "startListUI get NULL activity");
            if (lVar != null) {
                lVar.invoke(new Instrumentation.ActivityResult(0, (Intent) null));
                return;
            }
            return;
        }
        C53895h.m60466d(this.f241037b, (C66212f) null, (C53934p0) null, new C82191f(d, carLicensePlateListViewContract$ViewModel, lVar, (C15601d<? super C82191f>) null), 3, (Object) null);
    }
}
