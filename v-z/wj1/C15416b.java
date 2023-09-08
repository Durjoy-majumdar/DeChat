package wj1;

import a14.C0000n0;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cl1.C0657g1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import er1.C7859p5;
import f40.C86709a0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import te3.C51306sw0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$handleFaceResult$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {133, 199, 206}, mo125471m = "invokeSuspend")
/* renamed from: wj1.b */
public final class C15416b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f41818d;

    /* renamed from: e */
    public int f41819e;

    /* renamed from: f */
    public final /* synthetic */ C15410a f41820f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$handleFaceResult$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wj1.b$a */
    public static final class C15417a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f41821d;

        /* renamed from: e */
        public final /* synthetic */ C15410a f41822e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15417a(C0287e eVar, C15601d dVar, C15410a aVar) {
            super(2, dVar);
            this.f41821d = eVar;
            this.f41822e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15417a(this.f41821d, dVar, this.f41822e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15417a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Log.m105924i("FinderLiveRestrictConsumePlugin", "handleFaceResult verify fail: " + ((C0280a) ((C0281b) this.f41821d).f843b));
            ((C0657g1) this.f41822e.mo87696x0(C0657g1.class)).f1558j.postValue(C0657g1.C0659b.f1560a);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.quota.FinderLiveRestrictConsumePlugin$handleFaceResult$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveRestrictConsumePlugin.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: wj1.b$b */
    public static final class C15418b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C0287e f41823d;

        /* renamed from: e */
        public final /* synthetic */ C15410a f41824e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15418b(C0287e eVar, C15601d dVar, C15410a aVar) {
            super(2, dVar);
            this.f41823d = eVar;
            this.f41824e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C15418b(this.f41823d, dVar, this.f41824e);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C15418b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            Class cls = C0657g1.class;
            ResultKt.throwOnFailure(obj);
            C51306sw0 sw02 = (C51306sw0) ((C0288f) this.f41823d).f855b;
            Log.m105924i("FinderLiveRestrictConsumePlugin", "handleFaceResult verify success is_passed: " + sw02.f141789d);
            if (sw02.f141789d) {
                C15419c cVar = C15419c.f41825a;
                C7859p5 p5Var = C7859p5.VERIFY_SEND;
                Long value = ((C0657g1) this.f41824e.mo87696x0(cls)).f1554f.getValue();
                if (value == null) {
                    value = new Long(0);
                }
                cVar.mo14214a(p5Var, value.longValue());
                Log.m105924i("QuotaUtil", "setFaceVerifySuccess");
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_LIVE_QUOTA_CONSUME_FACE_VERIFY_TIME_LONG_SYNC, Long.valueOf(System.currentTimeMillis()));
                ((C0657g1) this.f41824e.mo87696x0(cls)).f1558j.postValue(C0657g1.C0662e.f1566a);
            } else {
                ((C0657g1) this.f41824e.mo87696x0(cls)).f1558j.postValue(C0657g1.C0659b.f1560a);
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15416b(C15410a aVar, C15601d<? super C15416b> dVar) {
        super(2, dVar);
        this.f41820f = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C15416b(this.f41820f, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C15416b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f41819e
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x002d
            if (r1 == r5) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r7.f41818d
            bi1.e r0 = (bi1.C0287e) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00a8
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r7.f41818d
            bi1.e r1 = (bi1.C0287e) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008a
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0069
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.rw0 r8 = new te3.rw0
            r8.<init>()
            r8.f141182e = r5
            ob0.c$b r1 = new ob0.c$b
            r1.<init>()
            r6 = 9322(0x246a, float:1.3063E-41)
            r1.f127069d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivecheckverifyresult"
            r1.f127068c = r6
            r1.f127066a = r8
            te3.sw0 r8 = new te3.sw0
            r8.<init>()
            r1.f127067b = r8
            ob0.c r8 = r1.mo72403a()
            java.lang.Class<ht1.s1> r1 = ht1.C8802s1.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ht1.s1 r1 = (ht1.C8802s1) r1
            ob0.b r1 = r1.mo9632ui()
            r1.mo123453j(r8)
            r7.f41819e = r5
            java.lang.Object r8 = bi1.C0283d.m245c(r1, r4, r7, r5, r4)
            if (r8 != r0) goto L_0x0069
            return r0
        L_0x0069:
            r1 = r8
            bi1.e r1 = (bi1.C0287e) r1
            wj1.a r8 = r7.f41820f
            boolean r5 = r1 instanceof bi1.C0288f
            if (r5 == 0) goto L_0x008a
            wx3.f r5 = r1.f854a
            if (r5 != 0) goto L_0x007a
            wx3.f r5 = r7.getContext()
        L_0x007a:
            wj1.b$b r6 = new wj1.b$b
            r6.<init>(r1, r4, r8)
            r7.f41818d = r1
            r7.f41819e = r3
            java.lang.Object r8 = a14.C53895h.m60469g(r5, r6, r7)
            if (r8 != r0) goto L_0x008a
            return r0
        L_0x008a:
            wj1.a r8 = r7.f41820f
            boolean r3 = r1 instanceof bi1.C0281b
            if (r3 == 0) goto L_0x00a8
            wx3.f r3 = r1.f854a
            if (r3 != 0) goto L_0x0098
            wx3.f r3 = r7.getContext()
        L_0x0098:
            wj1.b$a r5 = new wj1.b$a
            r5.<init>(r1, r4, r8)
            r7.f41818d = r1
            r7.f41819e = r2
            java.lang.Object r8 = a14.C53895h.m60469g(r3, r5, r7)
            if (r8 != r0) goto L_0x00a8
            return r0
        L_0x00a8:
            wj1.a r8 = r7.f41820f
            r0 = 0
            r8.f41808r = r0
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wj1.C15416b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
