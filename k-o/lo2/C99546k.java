package lo2;

import a14.C0000n0;
import a14.C53884f2;
import a14.C53895h;
import a14.C53901i0;
import a14.C53934p0;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94604a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.xweb.util.WXWebReporter;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import lo2.C99527d;
import nj3.C76879j;
import qo3.C101218e0;
import qo3.C89779i0;
import rx3.C13598b0;
import so2.C101683n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: lo2.k */
public final class C99546k implements C101218e0.C12907m {

    /* renamed from: a */
    public final /* synthetic */ Context f291802a;

    /* renamed from: b */
    public final /* synthetic */ C101218e0 f291803b;

    /* renamed from: c */
    public final /* synthetic */ C0000n0 f291804c;

    /* renamed from: d */
    public final /* synthetic */ C32227p<C99527d.C99528a, C99527d.C99528a, C13598b0> f291805d;

    /* renamed from: e */
    public final /* synthetic */ CheckBox f291806e;

    /* renamed from: f */
    public final /* synthetic */ C94604a0.C94606b f291807f;

    /* renamed from: g */
    public final /* synthetic */ C101683n.C101685b f291808g;

    /* renamed from: h */
    public final /* synthetic */ CheckBox f291809h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1", mo125469f = "AdCombineFollowHfScreenHelper.kt", mo125470l = {167, 168}, mo125471m = "invokeSuspend")
    /* renamed from: lo2.k$a */
    public static final class C99547a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f291810d;

        /* renamed from: e */
        public /* synthetic */ Object f291811e;

        /* renamed from: f */
        public final /* synthetic */ C89779i0 f291812f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C99527d.C99528a, C99527d.C99528a, C13598b0> f291813g;

        /* renamed from: h */
        public final /* synthetic */ CheckBox f291814h;

        /* renamed from: i */
        public final /* synthetic */ C94604a0.C94606b f291815i;

        /* renamed from: j */
        public final /* synthetic */ C101683n.C101685b f291816j;

        /* renamed from: n */
        public final /* synthetic */ CheckBox f291817n;

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1", mo125469f = "AdCombineFollowHfScreenHelper.kt", mo125470l = {150}, mo125471m = "invokeSuspend")
        /* renamed from: lo2.k$a$a */
        public static final class C99548a extends C91594j implements C32227p<C0000n0, C15601d<? super C99527d.C99528a>, Object> {

            /* renamed from: d */
            public int f291818d;

            /* renamed from: e */
            public final /* synthetic */ CheckBox f291819e;

            /* renamed from: f */
            public final /* synthetic */ C94604a0.C94606b f291820f;

            /* renamed from: g */
            public final /* synthetic */ C101683n.C101685b f291821g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99548a(CheckBox checkBox, C94604a0.C94606b bVar, C101683n.C101685b bVar2, C15601d<? super C99548a> dVar) {
                super(2, dVar);
                this.f291819e = checkBox;
                this.f291820f = bVar;
                this.f291821g = bVar2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                C99548a aVar = new C99548a(this.f291819e, this.f291820f, this.f291821g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                return aVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                Object invokeSuspend = ((C99548a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C99527d.C99528a aVar;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
                int i = this.f291818d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CheckBox checkBox = this.f291819e;
                    if (checkBox != null && checkBox.isChecked()) {
                        C94604a0.C94606b bVar = this.f291820f;
                        bVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                        boolean z = bVar.f273780b;
                        SnsMethodCalculate.markEndTimeMs("getBrandStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                        if (!z) {
                            C10597q0 q0Var = C10597q0.f31952a;
                            String a = this.f291821g.mo141133a().mo141132a();
                            this.f291818d = 1;
                            obj = q0Var.mo10857a(a, WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_DOWNLOAD_SUCCESS, this);
                            if (obj == aVar2) {
                                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                                return aVar2;
                            }
                        }
                    }
                    aVar = new C99527d.C99528a(false, true);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                    return aVar;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                    throw illegalStateException;
                }
                aVar = new C99527d.C99528a(true, ((Boolean) obj).booleanValue());
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$brandReqDeferred$1");
                return aVar;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1", mo125469f = "AdCombineFollowHfScreenHelper.kt", mo125470l = {159}, mo125471m = "invokeSuspend")
        /* renamed from: lo2.k$a$b */
        public static final class C99549b extends C91594j implements C32227p<C0000n0, C15601d<? super C99527d.C99528a>, Object> {

            /* renamed from: d */
            public int f291822d;

            /* renamed from: e */
            public final /* synthetic */ CheckBox f291823e;

            /* renamed from: f */
            public final /* synthetic */ C94604a0.C94606b f291824f;

            /* renamed from: g */
            public final /* synthetic */ C101683n.C101685b f291825g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C99549b(CheckBox checkBox, C94604a0.C94606b bVar, C101683n.C101685b bVar2, C15601d<? super C99549b> dVar) {
                super(2, dVar);
                this.f291823e = checkBox;
                this.f291824f = bVar;
                this.f291825g = bVar2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                C99549b bVar = new C99549b(this.f291823e, this.f291824f, this.f291825g, dVar);
                SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                return bVar;
            }

            public Object invoke(Object obj, Object obj2) {
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                Object invokeSuspend = ((C99549b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                return invokeSuspend;
            }

            public final Object invokeSuspend(Object obj) {
                C99527d.C99528a aVar;
                SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                C15911a aVar2 = C15911a.COROUTINE_SUSPENDED;
                int i = this.f291822d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CheckBox checkBox = this.f291823e;
                    if (checkBox != null && checkBox.isChecked()) {
                        C94604a0.C94606b bVar = this.f291824f;
                        bVar.getClass();
                        SnsMethodCalculate.markStartTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                        boolean z = bVar.f273779a;
                        SnsMethodCalculate.markEndTimeMs("getFinderStatus", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHfScreenCombineFollowComp$FollowStatus");
                        if (!z) {
                            C10597q0 q0Var = C10597q0.f31952a;
                            String a = this.f291825g.mo141134b().mo141135a();
                            this.f291822d = 1;
                            obj = q0Var.mo10858b(a, 1000, this);
                            if (obj == aVar2) {
                                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                                return aVar2;
                            }
                        }
                    }
                    aVar = new C99527d.C99528a(false, true);
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                    return aVar;
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                    throw illegalStateException;
                }
                aVar = new C99527d.C99528a(true, ((Boolean) obj).booleanValue());
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1$finderReqDeferred$1");
                return aVar;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99547a(C89779i0 i0Var, C32227p<? super C99527d.C99528a, ? super C99527d.C99528a, C13598b0> pVar, CheckBox checkBox, C94604a0.C94606b bVar, C101683n.C101685b bVar2, CheckBox checkBox2, C15601d<? super C99547a> dVar) {
            super(2, dVar);
            this.f291812f = i0Var;
            this.f291813g = pVar;
            this.f291814h = checkBox;
            this.f291815i = bVar;
            this.f291816j = bVar2;
            this.f291817n = checkBox2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            C99547a aVar = new C99547a(this.f291812f, this.f291813g, this.f291814h, this.f291815i, this.f291816j, this.f291817n, dVar);
            aVar.f291811e = obj;
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            Object invokeSuspend = ((C99547a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1");
            return invokeSuspend;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x00b9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.String r1 = "invokeSuspend"
                java.lang.String r2 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$1"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r2)
                xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r0.f291810d
                r5 = 2
                r6 = 1
                if (r4 == 0) goto L_0x0035
                if (r4 == r6) goto L_0x002b
                if (r4 != r5) goto L_0x0020
                java.lang.Object r3 = r0.f291811e
                lo2.d$a r3 = (lo2.C99527d.C99528a) r3
                kotlin.ResultKt.throwOnFailure(r18)
                r4 = r18
                goto L_0x0088
            L_0x0020:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r3.<init>(r4)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                throw r3
            L_0x002b:
                java.lang.Object r4 = r0.f291811e
                a14.u0 r4 = (a14.C53953u0) r4
                kotlin.ResultKt.throwOnFailure(r18)
                r6 = r18
                goto L_0x0077
            L_0x0035:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r4 = r0.f291811e
                a14.n0 r4 = (a14.C0000n0) r4
                r13 = 0
                r14 = 0
                lo2.k$a$a r10 = new lo2.k$a$a
                android.widget.CheckBox r7 = r0.f291814h
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$b r8 = r0.f291815i
                so2.n$b r9 = r0.f291816j
                r15 = 0
                r10.<init>(r7, r8, r9, r15)
                r11 = 3
                r12 = 0
                r8 = 0
                r9 = 0
                r7 = r4
                a14.u0 r16 = a14.C53895h.m60464b(r7, r8, r9, r10, r11, r12)
                lo2.k$a$b r10 = new lo2.k$a$b
                android.widget.CheckBox r7 = r0.f291817n
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a0$b r8 = r0.f291815i
                so2.n$b r9 = r0.f291816j
                r10.<init>(r7, r8, r9, r15)
                r7 = r4
                r8 = r13
                r9 = r14
                a14.u0 r4 = a14.C53895h.m60464b(r7, r8, r9, r10, r11, r12)
                r0.f291811e = r4
                r0.f291810d = r6
                r6 = r16
                a14.v0 r6 = (a14.C53957v0) r6
                java.lang.Object r6 = r6.mo74549z(r0)
                if (r6 != r3) goto L_0x0077
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x0077:
                lo2.d$a r6 = (lo2.C99527d.C99528a) r6
                r0.f291811e = r6
                r0.f291810d = r5
                java.lang.Object r4 = r4.mo74634A(r0)
                if (r4 != r3) goto L_0x0087
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            L_0x0087:
                r3 = r6
            L_0x0088:
                lo2.d$a r4 = (lo2.C99527d.C99528a) r4
                a14.i0 r5 = lo2.C99527d.f291768a
                java.lang.String r5 = "getTAG"
                java.lang.String r6 = "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper"
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r6)
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r6)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "scope result called "
                r5.append(r6)
                r5.append(r3)
                r6 = 32
                r5.append(r6)
                r5.append(r4)
                java.lang.String r5 = r5.toString()
                java.lang.String r6 = "AdCombineFollowHfScreenHelper"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
                qo3.i0 r5 = r0.f291812f
                if (r5 == 0) goto L_0x00bc
                r5.cancel()
            L_0x00bc:
                fy3.p<lo2.d$a, lo2.d$a, rx3.b0> r5 = r0.f291813g
                r5.invoke(r3, r4)
                rx3.b0 r3 = rx3.C13598b0.f38549a
                com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r2)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lo2.C99546k.C99547a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: lo2.k$b */
    public static final class C99550b extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f291826d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C99550b(C89779i0 i0Var) {
            super(1);
            this.f291826d = i0Var;
        }

        public Object invoke(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$2");
            Throwable th = (Throwable) obj;
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$2");
            C89779i0 i0Var = this.f291826d;
            if (i0Var != null) {
                i0Var.cancel();
            }
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$2");
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7$2");
            return b0Var;
        }
    }

    public C99546k(Context context, C101218e0 e0Var, C0000n0 n0Var, C32227p<? super C99527d.C99528a, ? super C99527d.C99528a, C13598b0> pVar, CheckBox checkBox, C94604a0.C94606b bVar, C101683n.C101685b bVar2, CheckBox checkBox2) {
        this.f291802a = context;
        this.f291803b = e0Var;
        this.f291804c = n0Var;
        this.f291805d = pVar;
        this.f291806e = checkBox;
        this.f291807f = bVar;
        this.f291808g = bVar2;
        this.f291809h = checkBox2;
    }

    /* renamed from: a */
    public final void mo2001a() {
        SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7");
        Context context = this.f291802a;
        C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f291802a.getString(C0966R.string.mpt), true, true, (DialogInterface.OnCancelListener) null);
        this.f291803b.mo140680z();
        C0000n0 n0Var = this.f291804c;
        if (n0Var != null) {
            C53901i0 i0Var = C99527d.f291768a;
            SnsMethodCalculate.markStartTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            C53901i0 i0Var2 = C99527d.f291768a;
            SnsMethodCalculate.markEndTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            C53901i0 i0Var3 = i0Var2;
            ((C53884f2) C53895h.m60466d(n0Var, i0Var3, (C53934p0) null, new C99547a(Q, this.f291805d, this.f291806e, this.f291807f, this.f291808g, this.f291809h, (C15601d<? super C99547a>) null), 2, (Object) null)).mo74515E(new C99550b(Q));
        }
        SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7");
    }
}
