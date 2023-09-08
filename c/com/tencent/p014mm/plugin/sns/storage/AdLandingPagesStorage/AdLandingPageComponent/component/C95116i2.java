package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53884f2;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53916l;
import a14.C53930o0;
import a14.C53934p0;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import kotlin.Result;
import org.json.JSONObject;
import qo3.C89779i0;
import qs2.C101259c0;
import qs2.C101271i0;
import rx3.C13598b0;
import rx3.C90107a;
import vr2.C102251n;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 */
public final class C95116i2 {

    /* renamed from: e */
    public static final C95117a f276048e = new C95117a((C8480h) null);

    /* renamed from: f */
    public static final C53901i0 f276049f = new C57368e(C53901i0.C39480a.f106019d);

    /* renamed from: a */
    public final C95206p1 f276050a;

    /* renamed from: b */
    public final C101259c0 f276051b;

    /* renamed from: c */
    public C0000n0 f276052c;

    /* renamed from: d */
    public String f276053d = "";

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$e */
    public static final class C57368e extends C66206a implements C53901i0 {
        public C57368e(C53901i0.C39480a aVar) {
            super(aVar);
        }

        public void handleException(C66212f fVar, Throwable th) {
            SnsMethodCalculate.markStartTimeMs("handleException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$special$$inlined$CoroutineExceptionHandler$1");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            Log.m105920e("AdLandingQRCodeBtnCompDelegate", "error = " + C90107a.m112736b(th));
            if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$special$$inlined$CoroutineExceptionHandler$1");
                throw th;
            } else {
                SnsMethodCalculate.markEndTimeMs("handleException", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$special$$inlined$CoroutineExceptionHandler$1");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$a */
    public static final class C95117a {
        public C95117a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo131643a() {
            SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$Companion");
            return "AdLandingQRCodeBtnCompDelegate";
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$b */
    public static final class C95118b {

        /* renamed from: a */
        public final String f276054a;

        public C95118b(boolean z, String str) {
            this.f276054a = str;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1", mo125469f = "AdLandingQRCodeBtnCompDelegate.kt", mo125470l = {276, 136}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c */
    public static final class C95119c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f276055d;

        /* renamed from: e */
        public Object f276056e;

        /* renamed from: f */
        public int f276057f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C89779i0> f276058g;

        /* renamed from: h */
        public final /* synthetic */ Context f276059h;

        /* renamed from: i */
        public final /* synthetic */ C95116i2 f276060i;

        /* renamed from: j */
        public final /* synthetic */ C101271i0 f276061j;

        /* renamed from: n */
        public final /* synthetic */ String f276062n;

        /* renamed from: o */
        public final /* synthetic */ C102251n f276063o;

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$a */
        public static final class C95120a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8479f0<C89779i0> f276064d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C95120a(C8479f0<C89779i0> f0Var) {
                super(0);
                this.f276064d = f0Var;
            }

            public Object invoke() {
                C89779i0 i0Var;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$1");
                C95116i2.f276048e.mo131643a();
                Log.m105924i("AdLandingQRCodeBtnCompDelegate", "request geo start !");
                C89779i0 i0Var2 = (C89779i0) this.f276064d.f27484d;
                boolean z = true;
                if (i0Var2 == null || !i0Var2.isShowing()) {
                    z = false;
                }
                if (!z && (i0Var = (C89779i0) this.f276064d.f27484d) != null) {
                    i0Var.show();
                }
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$1");
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$b */
        public static final class C95121b extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32228q<String, String, Map<String, ? extends Object>, C13598b0> f276065d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C95121b(C32228q<? super String, ? super String, ? super Map<String, ? extends Object>, C13598b0> qVar) {
                super(1);
                this.f276065d = qVar;
            }

            public Object invoke(Object obj) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$2");
                Throwable th = (Throwable) obj;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$2");
                C95116i2.f276048e.mo131643a();
                Log.m105924i("AdLandingQRCodeBtnCompDelegate", "requestQR() requestGeoLocation canceled!");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$2");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$2");
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$c */
        public static final class C95122c extends C87413o implements C32228q<String, String, Map<String, ? extends Object>, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C8477a0 f276066d;

            /* renamed from: e */
            public final /* synthetic */ C53916l<C95118b> f276067e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C95122c(C8477a0 a0Var, C53916l<? super C95118b> lVar) {
                super(3);
                this.f276066d = a0Var;
                this.f276067e = lVar;
            }

            public Object invoke(Object obj, Object obj2, Object obj3) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
                String str = (String) obj;
                String str2 = (String) obj2;
                Map map = (Map) obj3;
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
                if (map == null || !C87412m.m108589b(map.get("ret"), 0)) {
                    C95116i2.f276048e.mo131643a();
                    Log.m105924i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation failed");
                    C8477a0 a0Var = this.f276066d;
                    if (!a0Var.f27482d) {
                        a0Var.f27482d = true;
                        this.f276067e.resumeWith(Result.m168114constructorimpl(new C95118b(false, (String) null)));
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("latitude", map.get("latitude"));
                    jSONObject.put("longitude", map.get("longitude"));
                    C95116i2.f276048e.mo131643a();
                    Log.m105924i("AdLandingQRCodeBtnCompDelegate", "requestGeoLocation res = " + jSONObject);
                    C8477a0 a0Var2 = this.f276066d;
                    if (!a0Var2.f27482d) {
                        a0Var2.f27482d = true;
                        C53916l<C95118b> lVar = this.f276067e;
                        Result.Companion companion = Result.Companion;
                        lVar.resumeWith(Result.m168114constructorimpl(new C95118b(true, jSONObject.toString())));
                    }
                }
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$geoResult$1$resultCallback$1");
                return b0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$d */
        public static final class C95123d implements C102251n.C102257c {

            /* renamed from: a */
            public final /* synthetic */ C95116i2 f276068a;

            /* renamed from: b */
            public final /* synthetic */ C8479f0<C89779i0> f276069b;

            /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$d$a */
            public static final class C95124a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C95116i2 f276070d;

                /* renamed from: e */
                public final /* synthetic */ C8479f0<C89779i0> f276071e;

                public C95124a(C95116i2 i2Var, C8479f0<C89779i0> f0Var) {
                    this.f276070d = i2Var;
                    this.f276071e = f0Var;
                }

                public final void run() {
                    SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$qrResultListener$1$1");
                    C95116i2.m120990a(this.f276070d, (C89779i0) this.f276071e.f27484d);
                    SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$qrResultListener$1$1");
                }
            }

            public C95123d(C95116i2 i2Var, C8479f0<C89779i0> f0Var) {
                this.f276068a = i2Var;
                this.f276069b = f0Var;
            }

            /* renamed from: a */
            public final void mo131644a(String str, boolean z, String str2, Bundle bundle) {
                SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$qrResultListener$1");
                ((C119157j) C119157j.f356862d).mo183895z(new C95124a(this.f276068a, this.f276069b));
                SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1$qrResultListener$1");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95119c(C8479f0<C89779i0> f0Var, Context context, C95116i2 i2Var, C101271i0 i0Var, String str, C102251n nVar, C15601d<? super C95119c> dVar) {
            super(2, dVar);
            this.f276058g = f0Var;
            this.f276059h = context;
            this.f276060i = i2Var;
            this.f276061j = i0Var;
            this.f276062n = str;
            this.f276063o = nVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            C95119c cVar = new C95119c(this.f276058g, this.f276059h, this.f276060i, this.f276061j, this.f276062n, this.f276063o, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            Object invokeSuspend = ((C95119c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ca, code lost:
            if (r0 == null) goto L_0x00cc;
         */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x013c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r6 = r21
                java.lang.String r7 = "invokeSuspend"
                java.lang.String r8 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r7, r8)
                xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r6.f276057f
                r10 = 1
                java.lang.String r11 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate"
                java.lang.String r12 = "getBtnInfo"
                r1 = 0
                r13 = 2
                if (r0 == 0) goto L_0x003c
                if (r0 == r10) goto L_0x002d
                if (r0 != r13) goto L_0x0022
                kotlin.ResultKt.throwOnFailure(r22)
                r0 = r22
                goto L_0x0113
            L_0x0022:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                throw r0
            L_0x002d:
                java.lang.Object r0 = r6.f276056e
                gy3.f0 r0 = (gy3.C8479f0) r0
                java.lang.Object r0 = r6.f276055d
                android.content.Context r0 = (android.content.Context) r0
                kotlin.ResultKt.throwOnFailure(r22)
                r0 = r22
                goto L_0x00b9
            L_0x003c:
                kotlin.ResultKt.throwOnFailure(r22)
                gy3.f0<qo3.i0> r0 = r6.f276058g
                T r0 = r0.f27484d
                if (r0 != 0) goto L_0x0060
                android.content.Context r0 = r6.f276059h
                boolean r2 = r0 instanceof android.app.Activity
                if (r2 == 0) goto L_0x0060
                android.app.Activity r0 = (android.app.Activity) r0
                boolean r0 = r0.isFinishing()
                if (r0 != 0) goto L_0x0060
                gy3.f0<qo3.i0> r0 = r6.f276058g
                android.content.Context r2 = r6.f276059h
                r3 = 2131836803(0x7f113f83, float:1.9306783E38)
                qo3.i0 r2 = uo2.C90717a.m113753f(r2, r3, r1)
                r0.f27484d = r2
            L_0x0060:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r0 = r6.f276060i
                r0.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
                qs2.c0 r0 = r0.f276051b
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
                int r0 = r0.f296558d0
                if (r0 != r10) goto L_0x00cc
                android.content.Context r0 = r6.f276059h
                gy3.f0<qo3.i0> r2 = r6.f276058g
                r6.f276055d = r0
                r6.f276056e = r2
                r6.f276057f = r10
                a14.m r3 = new a14.m
                wx3.d r4 = xx3.C66447b.m78392b(r21)
                r3.<init>(r4, r10)
                r3.mo74609p()
                gy3.a0 r4 = new gy3.a0
                r4.<init>()
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$c r5 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$c
                r5.<init>(r4, r3)
                r17 = 1
                r18 = 0
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$a r4 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$a
                r4.<init>(r2)
                java.lang.String r14 = ""
                java.lang.String r15 = "GCJ02"
                r16 = r0
                r19 = r4
                r20 = r5
                us2.C102078g.m134487c(r14, r15, r16, r17, r18, r19, r20)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$b r0 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$b
                r0.<init>(r5)
                r3.mo74599v(r0)
                java.lang.Object r0 = r3.mo74608o()
                if (r0 != r9) goto L_0x00b9
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r9
            L_0x00b9:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$b r0 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.C95118b) r0
                r0.getClass()
                java.lang.String r2 = "getResult"
                java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$GEOResult"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
                java.lang.String r0 = r0.f276054a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
                if (r0 != 0) goto L_0x00ce
            L_0x00cc:
                java.lang.String r0 = ""
            L_0x00ce:
                r2 = r0
                gy3.f0<qo3.i0> r0 = r6.f276058g
                T r0 = r0.f27484d
                qo3.i0 r0 = (qo3.C89779i0) r0
                r3 = 0
                if (r0 == 0) goto L_0x00df
                boolean r0 = r0.isShowing()
                if (r0 != r10) goto L_0x00df
                r3 = 1
            L_0x00df:
                if (r3 != 0) goto L_0x00ec
                gy3.f0<qo3.i0> r0 = r6.f276058g
                T r0 = r0.f27484d
                qo3.i0 r0 = (qo3.C89779i0) r0
                if (r0 == 0) goto L_0x00ec
                r0.show()
            L_0x00ec:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r0 = r6.f276060i
                r0.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
                qs2.c0 r3 = r0.f276051b
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
                qs2.i0 r4 = r6.f276061j
                java.lang.String r5 = r6.f276062n
                r6.f276055d = r1
                r6.f276056e = r1
                r6.f276057f = r13
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r21
                java.lang.Object r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.m120991b(r0, r1, r2, r3, r4, r5)
                if (r0 != r9) goto L_0x0113
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r9
            L_0x0113:
                rx3.l r0 = (rx3.C13604l) r0
                A r1 = r0.f38555d
                java.lang.String r1 = (java.lang.String) r1
                B r0 = r0.f38556e
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto L_0x013c
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r0 = r6.f276060i
                gy3.f0<qo3.i0> r1 = r6.f276058g
                T r1 = r1.f27484d
                qo3.i0 r1 = (qo3.C89779i0) r1
                com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.m120990a(r0, r1)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$a r0 = com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.f276048e
                r0.mo131643a()
                java.lang.String r0 = "AdLandingQRCodeBtnCompDelegate"
                java.lang.String r1 = "downloadImgWithPath is null!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r0
            L_0x013c:
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$d r2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$c$d
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r3 = r6.f276060i
                gy3.f0<qo3.i0> r4 = r6.f276058g
                r2.<init>(r3, r4)
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r4 = 1936(0x790, float:2.713E-42)
                r3.mo175911u(r4, r13)
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r3 = r6.f276060i
                r3.getClass()
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r11)
                qs2.c0 r3 = r3.f276051b
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r11)
                int r3 = r3.f296557c0
                if (r3 != r10) goto L_0x0163
                vr2.n r3 = r6.f276063o
                r3.mo141816j(r0, r1, r2)
                goto L_0x0168
            L_0x0163:
                vr2.n r3 = r6.f276063o
                r3.mo141817k(r0, r1, r2)
            L_0x0168:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r7, r8)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.C95119c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2$d */
    public static final class C95125d extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C95116i2 f276072d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C89779i0> f276073e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C95125d(C95116i2 i2Var, C8479f0<C89779i0> f0Var) {
            super(1);
            this.f276072d = i2Var;
            this.f276073e = f0Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$2");
            Throwable th = (Throwable) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$2");
            C95116i2.f276048e.mo131643a();
            Log.m105924i("AdLandingQRCodeBtnCompDelegate", "requestQR() invokeOnCompletion called");
            C95116i2.m120990a(this.f276072d, (C89779i0) this.f276073e.f27484d);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate$requestQR$2");
            return b0Var;
        }
    }

    static {
        int i = C53901i0.f151153a0;
    }

    public C95116i2(C95206p1 p1Var, C101259c0 c0Var) {
        C87412m.m108594g(p1Var, "adLandingPageQRCodeBtnComp");
        this.f276050a = p1Var;
        this.f276051b = c0Var;
    }

    /* renamed from: a */
    public static final void m120990a(C95116i2 i2Var, C89779i0 i0Var) {
        SnsMethodCalculate.markStartTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        i2Var.getClass();
        SnsMethodCalculate.markStartTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        if (i0Var != null) {
            try {
                if (i0Var.isShowing()) {
                    i0Var.dismiss();
                }
            } catch (Throwable unused) {
            }
        }
        SnsMethodCalculate.markEndTimeMs("dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        SnsMethodCalculate.markEndTimeMs("access$dismissDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        if (r1 == r6) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m120991b(com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2 r22, java.lang.String r23, qs2.C101259c0 r24, qs2.C101271i0 r25, java.lang.String r26, wx3.C15601d r27) {
        /*
            r0 = r22
            r1 = r27
            java.lang.String r2 = "access$requestUrlAndImage"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r22.getClass()
            java.lang.String r4 = "requestUrlAndImage"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r3)
            boolean r5 = r1 instanceof com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95130j2
            if (r5 == 0) goto L_0x0027
            r5 = r1
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2 r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95130j2) r5
            int r6 = r5.f276088i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0027
            int r6 = r6 - r7
            r5.f276088i = r6
            goto L_0x002c
        L_0x0027:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2 r5 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.j2
            r5.<init>(r0, r1)
        L_0x002c:
            java.lang.Object r1 = r5.f276086g
            xx3.a r6 = xx3.C15911a.COROUTINE_SUSPENDED
            int r7 = r5.f276088i
            r8 = 0
            r9 = 1936(0x790, float:2.713E-42)
            r10 = 15000(0x3a98, double:7.411E-320)
            r12 = 2
            r13 = 0
            r14 = 1
            if (r7 == 0) goto L_0x006b
            if (r7 == r14) goto L_0x005a
            if (r7 != r12) goto L_0x004f
            int r0 = r5.f276085f
            java.lang.Object r6 = r5.f276084e
            gy3.f0 r6 = (gy3.C8479f0) r6
            java.lang.Object r5 = r5.f276083d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r5 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2) r5
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0104
        L_0x004f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            throw r0
        L_0x005a:
            java.lang.Object r0 = r5.f276084e
            qs2.c0 r0 = (qs2.C101259c0) r0
            java.lang.Object r7 = r5.f276083d
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2 r7 = (com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2) r7
            kotlin.ResultKt.throwOnFailure(r1)
            r21 = r7
            r7 = r0
            r0 = r21
            goto L_0x0091
        L_0x006b:
            kotlin.ResultKt.throwOnFailure(r1)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l2 r1 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l2
            r20 = 0
            r15 = r1
            r16 = r23
            r17 = r24
            r18 = r25
            r19 = r26
            r15.<init>(r16, r17, r18, r19, r20)
            r5.f276083d = r0
            r7 = r24
            r5.f276084e = r7
            r5.f276088i = r14
            java.lang.Object r1 = a14.C53860b3.m60375c(r10, r1, r5)
            if (r1 != r6) goto L_0x0091
        L_0x008c:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
            goto L_0x0138
        L_0x0091:
            java.lang.String r1 = (java.lang.String) r1
            gy3.f0 r15 = new gy3.f0
            r15.<init>()
            r15.f27484d = r1
            if (r1 == 0) goto L_0x00a5
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            r1 = 0
            goto L_0x00a6
        L_0x00a5:
            r1 = 1
        L_0x00a6:
            if (r1 == 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r14 = "requestQR: imageUrl get null! use originUrl! "
            r1.append(r14)
            java.lang.String r14 = r7.f296554Z
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.String r14 = "AdLandingQRCodeBtnCompDelegate"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r14, r1)
            java.lang.String r1 = r7.f296554Z
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = ""
        L_0x00c7:
            r15.f27484d = r1
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1.mo175911u(r9, r13)
            r1 = 0
            goto L_0x00d7
        L_0x00d0:
            T r1 = r15.f27484d
            java.lang.String r1 = (java.lang.String) r1
            r0.f276053d = r1
            r1 = 1
        L_0x00d7:
            T r7 = r15.f27484d
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            if (r7 == 0) goto L_0x00e6
            boolean r7 = z04.C112551y.m153811k(r7)
            if (r7 == 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            r7 = 0
            goto L_0x00e7
        L_0x00e6:
            r7 = 1
        L_0x00e7:
            if (r7 != 0) goto L_0x010a
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2 r7 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.k2
            r7.<init>(r15, r8)
            r5.f276083d = r0
            r5.f276084e = r15
            r5.f276085f = r1
            r5.f276088i = r12
            java.lang.Object r5 = a14.C53860b3.m60375c(r10, r7, r5)
            if (r5 != r6) goto L_0x00fd
            goto L_0x008c
        L_0x00fd:
            r6 = r15
            r21 = r5
            r5 = r0
            r0 = r1
            r1 = r21
        L_0x0104:
            r8 = r1
            java.lang.String r8 = (java.lang.String) r8
            r1 = r0
            r0 = r5
            r15 = r6
        L_0x010a:
            if (r8 == 0) goto L_0x0115
            boolean r5 = z04.C112551y.m153811k(r8)
            if (r5 == 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            r5 = 0
            goto L_0x0116
        L_0x0115:
            r5 = 1
        L_0x0116:
            if (r5 != 0) goto L_0x011d
            if (r1 == 0) goto L_0x011d
            r0.getClass()
        L_0x011d:
            if (r8 == 0) goto L_0x0125
            boolean r0 = z04.C112551y.m153811k(r8)
            if (r0 == 0) goto L_0x0126
        L_0x0125:
            r13 = 1
        L_0x0126:
            if (r13 == 0) goto L_0x012e
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 1
            r0.mo175911u(r9, r1)
        L_0x012e:
            rx3.l r6 = new rx3.l
            T r0 = r15.f27484d
            r6.<init>(r0, r8)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r3)
        L_0x0138:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95116i2.m120991b(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.i2, java.lang.String, qs2.c0, qs2.i0, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public final void mo131642c(Context context, C101271i0 i0Var, String str, C102251n nVar) {
        SnsMethodCalculate.markStartTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        if (nVar == null || this.f276051b == null || i0Var == null || context == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("requestQR failed! ");
            boolean z = true;
            sb.append(nVar == null);
            sb.append(' ');
            sb.append(this.f276051b == null);
            sb.append(' ');
            sb.append(i0Var == null);
            sb.append(' ');
            if (context != null) {
                z = false;
            }
            sb.append(z);
            sb.append(' ');
            Log.m105920e("AdLandingQRCodeBtnCompDelegate", sb.toString());
            SnsMethodCalculate.markEndTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            return;
        }
        try {
            String str2 = this.f276053d;
            if (C112551y.m153811k(str2) && (str2 = this.f276051b.f296554Z) == null) {
                str2 = "";
            }
            this.f276050a.f276010t.mo90729c("qrUrl", str2);
            this.f276050a.mo131613G();
        } catch (Throwable th) {
            Log.m105920e("AdLandingQRCodeBtnCompDelegate", "requestQR() clickReport err!" + th);
        }
        if (this.f276052c == null) {
            this.f276052c = C53930o0.m60555b();
        }
        C8479f0 f0Var = new C8479f0();
        C0000n0 n0Var = this.f276052c;
        if (n0Var != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            ((C53884f2) C53895h.m60466d(n0Var, C58901s.f168555a.plus(f276049f), (C53934p0) null, new C95119c(f0Var, context, this, i0Var, str, nVar, (C15601d<? super C95119c>) null), 2, (Object) null)).mo74515E(new C95125d(this, f0Var));
        }
        SnsMethodCalculate.markEndTimeMs("requestQR", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
    }
}
