package lo2;

import a14.C0000n0;
import a14.C53916l;
import a14.C53921m;
import co2.C92442i;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import kotlin.Result;
import kotlin.ResultKt;
import org.json.JSONObject;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: lo2.q0 */
public final class C10597q0 {

    /* renamed from: a */
    public static final C10597q0 f31952a = new C10597q0();

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper", mo125469f = "FollowRequestHelper.kt", mo125470l = {45}, mo125471m = "requestFollowBrand")
    /* renamed from: lo2.q0$a */
    public static final class C10598a extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f31953d;

        /* renamed from: e */
        public final /* synthetic */ C10597q0 f31954e;

        /* renamed from: f */
        public int f31955f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10598a(C10597q0 q0Var, C15601d<? super C10598a> dVar) {
            super(dVar);
            this.f31954e = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$1");
            this.f31953d = obj;
            this.f31955f |= Integer.MIN_VALUE;
            Object a = this.f31954e.mo10857a((String) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$1");
            return a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2", mo125469f = "FollowRequestHelper.kt", mo125470l = {154}, mo125471m = "invokeSuspend")
    /* renamed from: lo2.q0$b */
    public static final class C10599b extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31956d;

        /* renamed from: e */
        public int f31957e;

        /* renamed from: f */
        public final /* synthetic */ String f31958f;

        /* renamed from: g */
        public final /* synthetic */ int f31959g;

        /* renamed from: lo2.q0$b$a */
        public static final class C10600a implements AdLandingPagesProxy.C94830p {

            /* renamed from: a */
            public final /* synthetic */ C53916l<Boolean> f31960a;

            public C10600a(C53916l<? super Boolean> lVar) {
                this.f31960a = lVar;
            }

            /* renamed from: a */
            public void mo10855a(Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
            }

            /* renamed from: b */
            public void mo10856b(int i, int i2, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
                if (!(obj instanceof String)) {
                    C53916l<Boolean> lVar = this.f31960a;
                    Result.Companion companion = Result.Companion;
                    lVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
                    return;
                }
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject((String) obj);
                } catch (Throwable th) {
                    SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper");
                    Log.m105920e("FollowRequestHelper", th.toString());
                }
                if (jSONObject == null) {
                    C53916l<Boolean> lVar2 = this.f31960a;
                    Result.Companion companion2 = Result.Companion;
                    lVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
                    return;
                }
                jSONObject.optString("errMsg");
                String optString = jSONObject.optString("respUsername");
                if (i == 0 && i2 == 0 && !Util.isNullOrNil(optString)) {
                    C53916l<Boolean> lVar3 = this.f31960a;
                    Result.Companion companion3 = Result.Companion;
                    lVar3.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                } else {
                    C53916l<Boolean> lVar4 = this.f31960a;
                    Result.Companion companion4 = Result.Companion;
                    lVar4.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                }
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2$1$1");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10599b(String str, int i, C15601d<? super C10599b> dVar) {
            super(2, dVar);
            this.f31958f = str;
            this.f31959g = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            C10599b bVar = new C10599b(this.f31958f, this.f31959g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            Object invokeSuspend = ((C10599b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31957e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f31958f;
                int i2 = this.f31959g;
                this.f31956d = str;
                this.f31957e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                AdLandingPagesProxy.getInstance().doAddBrandScene(str, i2, new C10600a(mVar));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
                throw illegalStateException;
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowBrand$2");
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper", mo125469f = "FollowRequestHelper.kt", mo125470l = {27}, mo125471m = "requestFollowFinder")
    /* renamed from: lo2.q0$c */
    public static final class C10601c extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f31961d;

        /* renamed from: e */
        public final /* synthetic */ C10597q0 f31962e;

        /* renamed from: f */
        public int f31963f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10601c(C10597q0 q0Var, C15601d<? super C10601c> dVar) {
            super(dVar);
            this.f31962e = q0Var;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$1");
            this.f31961d = obj;
            this.f31963f |= Integer.MIN_VALUE;
            Object b = this.f31962e.mo10858b((String) null, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$1");
            return b;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2", mo125469f = "FollowRequestHelper.kt", mo125470l = {154}, mo125471m = "invokeSuspend")
    /* renamed from: lo2.q0$d */
    public static final class C10602d extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

        /* renamed from: d */
        public Object f31964d;

        /* renamed from: e */
        public int f31965e;

        /* renamed from: f */
        public final /* synthetic */ int f31966f;

        /* renamed from: g */
        public final /* synthetic */ String f31967g;

        /* renamed from: lo2.q0$d$a */
        public static final class C10603a implements AdLandingPagesProxy.C94830p {

            /* renamed from: a */
            public final /* synthetic */ C53916l<Boolean> f31968a;

            public C10603a(C53916l<? super Boolean> lVar) {
                this.f31968a = lVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0047 A[Catch:{ all -> 0x006e }] */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0051 A[Catch:{ all -> 0x006e }] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo10855a(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.String r0 = "onCallback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
                    a14.l<java.lang.Boolean> r2 = r10.f31968a
                    kotlin.Result$Companion r3 = kotlin.Result.Companion
                    java.lang.String r3 = "access$parseAdFinderFollowResult"
                    java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
                    java.lang.String r5 = "FollowRequestHelper"
                    java.lang.String r6 = "parseAdFinderFollowResult"
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
                    r7 = 0
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
                    r8.<init>()     // Catch:{ all -> 0x006e }
                    java.lang.String r9 = "parseAdFinderFollowResult, ret="
                    r8.append(r9)     // Catch:{ all -> 0x006e }
                    r8.append(r11)     // Catch:{ all -> 0x006e }
                    java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x006e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r8)     // Catch:{ all -> 0x006e }
                    boolean r8 = r11 instanceof java.lang.String     // Catch:{ all -> 0x006e }
                    if (r8 == 0) goto L_0x0038
                    java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x006e }
                    goto L_0x0039
                L_0x0038:
                    r11 = 0
                L_0x0039:
                    if (r11 == 0) goto L_0x0044
                    int r8 = r11.length()     // Catch:{ all -> 0x006e }
                    if (r8 != 0) goto L_0x0042
                    goto L_0x0044
                L_0x0042:
                    r8 = 0
                    goto L_0x0045
                L_0x0044:
                    r8 = 1
                L_0x0045:
                    if (r8 == 0) goto L_0x0051
                    java.lang.String r11 = "parseAdFinderFollowResult, null!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r11)     // Catch:{ all -> 0x006e }
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x006e }
                    goto L_0x0087
                L_0x0051:
                    org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x006e }
                    r8.<init>(r11)     // Catch:{ all -> 0x006e }
                    java.lang.String r11 = "followType"
                    int r11 = r8.optInt(r11)     // Catch:{ all -> 0x006e }
                    r9 = 2
                    if (r11 == r9) goto L_0x0063
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x006e }
                    goto L_0x0087
                L_0x0063:
                    java.lang.String r11 = "followRet"
                    boolean r11 = r8.optBoolean(r11)     // Catch:{ all -> 0x006e }
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)     // Catch:{ all -> 0x006e }
                    r7 = r11
                    goto L_0x0087
                L_0x006e:
                    r11 = move-exception
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r9 = "parseAdFinderFollowResult, exp="
                    r8.append(r9)
                    r8.append(r11)
                    java.lang.String r11 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r11)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
                L_0x0087:
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r7)
                    java.lang.Object r11 = kotlin.Result.m168114constructorimpl(r11)
                    r2.resumeWith(r11)
                    com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: lo2.C10597q0.C10602d.C10603a.mo10855a(java.lang.Object):void");
            }

            /* renamed from: b */
            public void mo10856b(int i, int i2, Object obj) {
                SnsMethodCalculate.markStartTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
                SnsMethodCalculate.markEndTimeMs("onCallback", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2$1$2");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10602d(int i, String str, C15601d<? super C10602d> dVar) {
            super(2, dVar);
            this.f31966f = i;
            this.f31967g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            C10602d dVar2 = new C10602d(this.f31966f, this.f31967g, dVar);
            SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            Object invokeSuspend = ((C10602d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            return invokeSuspend;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f31965e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f31966f;
                String str = this.f31967g;
                this.f31964d = str;
                this.f31965e = 1;
                C53921m mVar = new C53921m(C66447b.m78392b(this), 1);
                mVar.mo74609p();
                AdLandingPagesProxy instance = AdLandingPagesProxy.getInstance();
                C92442i iVar = new C92442i();
                iVar.f264532a = str;
                instance.addAdFinderContract(iVar, i2, new C10603a(mVar));
                obj = mVar.mo74608o();
                if (obj == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
                throw illegalStateException;
            }
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$requestFollowFinder$2");
            return obj;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10857a(java.lang.String r9, int r10, wx3.C15601d<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "requestFollowBrand"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof lo2.C10597q0.C10598a
            if (r2 == 0) goto L_0x001b
            r2 = r11
            lo2.q0$a r2 = (lo2.C10597q0.C10598a) r2
            int r3 = r2.f31955f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f31955f = r3
            goto L_0x0020
        L_0x001b:
            lo2.q0$a r2 = new lo2.q0$a
            r2.<init>(r8, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f31953d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f31955f
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = 15000(0x3a98, double:7.411E-320)
            lo2.q0$b r11 = new lo2.q0$b
            r4 = 0
            r11.<init>(r9, r10, r4)
            r2.f31955f = r5
            java.lang.Object r11 = a14.C53860b3.m60375c(r6, r11, r2)
            if (r11 != r3) goto L_0x0051
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0051:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x005a
            boolean r9 = r11.booleanValue()
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C10597q0.mo10857a(java.lang.String, int, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10858b(java.lang.String r9, int r10, wx3.C15601d<? super java.lang.Boolean> r11) {
        /*
            r8 = this;
            java.lang.String r0 = "requestFollowFinder"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = r11 instanceof lo2.C10597q0.C10601c
            if (r2 == 0) goto L_0x001b
            r2 = r11
            lo2.q0$c r2 = (lo2.C10597q0.C10601c) r2
            int r3 = r2.f31963f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001b
            int r3 = r3 - r4
            r2.f31963f = r3
            goto L_0x0020
        L_0x001b:
            lo2.q0$c r2 = new lo2.q0$c
            r2.<init>(r8, r11)
        L_0x0020:
            java.lang.Object r11 = r2.f31961d
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f31963f
            r5 = 1
            if (r4 == 0) goto L_0x003a
            if (r4 != r5) goto L_0x002f
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0051
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            throw r9
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = 15000(0x3a98, double:7.411E-320)
            lo2.q0$d r11 = new lo2.q0$d
            r4 = 0
            r11.<init>(r10, r9, r4)
            r2.f31963f = r5
            java.lang.Object r11 = a14.C53860b3.m60375c(r6, r11, r2)
            if (r11 != r3) goto L_0x0051
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r3
        L_0x0051:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            if (r11 == 0) goto L_0x005a
            boolean r9 = r11.booleanValue()
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: lo2.C10597q0.mo10858b(java.lang.String, int, wx3.d):java.lang.Object");
    }
}
