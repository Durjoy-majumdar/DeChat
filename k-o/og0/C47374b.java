package og0;

import a14.C0000n0;
import a14.C53934p0;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.event.MvvmEventCenter;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C45252f;
import d14.C45253g;
import f40.C86709a0;
import fy3.C32227p;
import kotlin.ResultKt;
import ng0.C11158b;
import ng0.C11160d;
import ng0.C76855a;
import ob0.C47350c;
import p261wl.C38166b;
import pb0.C47445a;
import pb0.C47446b;
import qb0.C47798b;
import rx3.C13598b0;
import te3.C50126kf3;
import te3.C50258lf3;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.account.sdk.model.AccountComplianceReceiver$Companion$doPolicyCgi$1", mo125469f = "AccountComplianceReceiver.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: og0.b */
public final class C47374b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ int f127115d;

    /* renamed from: e */
    public final /* synthetic */ String f127116e;

    /* renamed from: f */
    public final /* synthetic */ String f127117f;

    /* renamed from: g */
    public final /* synthetic */ String f127118g;

    /* renamed from: h */
    public final /* synthetic */ String f127119h;

    @C91590f(mo125468c = "com.tencent.mm.plugin.account.sdk.model.AccountComplianceReceiver$Companion$doPolicyCgi$1$1", mo125469f = "AccountComplianceReceiver.kt", mo125470l = {77}, mo125471m = "invokeSuspend")
    /* renamed from: og0.b$a */
    public static final class C47375a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f127120d;

        /* renamed from: e */
        public final /* synthetic */ C45252f<C47445a<C50258lf3>> f127121e;

        /* renamed from: f */
        public final /* synthetic */ int f127122f;

        /* renamed from: g */
        public final /* synthetic */ String f127123g;

        /* renamed from: h */
        public final /* synthetic */ String f127124h;

        /* renamed from: i */
        public final /* synthetic */ String f127125i;

        /* renamed from: og0.b$a$a */
        public static final class C47376a<T> implements C45253g {

            /* renamed from: d */
            public final /* synthetic */ int f127126d;

            /* renamed from: e */
            public final /* synthetic */ String f127127e;

            /* renamed from: f */
            public final /* synthetic */ String f127128f;

            /* renamed from: g */
            public final /* synthetic */ String f127129g;

            public C47376a(int i, String str, String str2, String str3) {
                this.f127126d = i;
                this.f127127e = str;
                this.f127128f = str2;
                this.f127129g = str3;
            }

            public Object emit(Object obj, C15601d dVar) {
                C47445a aVar = (C47445a) obj;
                if (aVar.f128348a == C47798b.OnEnd) {
                    Log.m105924i("MicroMsg.Account.AccountComplianceReceiver", "onSceneEnd " + aVar.f128349b + ' ' + aVar.f128350c + ' ' + aVar.f128351d);
                    C11158b bVar = new C11158b(C11158b.C11159a.CgiEnd, this.f127126d, this.f127127e, this.f127128f, this.f127129g);
                    ((C76855a) MvvmEventCenter.Companion.getEvent(C76855a.class)).publish(bVar);
                    C38166b.m41755b(C11160d.class, new C11408a(bVar));
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C47375a(C45252f<C47445a<C50258lf3>> fVar, int i, String str, String str2, String str3, C15601d<? super C47375a> dVar) {
            super(2, dVar);
            this.f127121e = fVar;
            this.f127122f = i;
            this.f127123g = str;
            this.f127124h = str2;
            this.f127125i = str3;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C47375a(this.f127121e, this.f127122f, this.f127123g, this.f127124h, this.f127125i, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C47375a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f127120d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C45252f<C47445a<C50258lf3>> fVar = this.f127121e;
                C47376a aVar2 = new C47376a(this.f127122f, this.f127123g, this.f127124h, this.f127125i);
                this.f127120d = 1;
                if (fVar.mo31880a(aVar2, this) == aVar) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47374b(int i, String str, String str2, String str3, String str4, C15601d<? super C47374b> dVar) {
        super(2, dVar);
        this.f127115d = i;
        this.f127116e = str;
        this.f127117f = str2;
        this.f127118g = str3;
        this.f127119h = str4;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C47374b(this.f127115d, this.f127116e, this.f127117f, this.f127118g, this.f127119h, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C47374b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        ResultKt.throwOnFailure(obj);
        Log.m105924i("MicroMsg.Account.AccountComplianceReceiver", "doPolicyCgi isAgree:" + this.f127115d + " customInfo:" + this.f127116e + " ticket:" + this.f127117f + " policyList:" + this.f127118g + " from:" + this.f127119h);
        C50126kf3 kf32 = new C50126kf3();
        kf32.f136766d = this.f127115d == 1 ? 1 : 2;
        kf32.f136767e = 1;
        kf32.f136768f = this.f127118g;
        kf32.f136769g = this.f127117f;
        kf32.f136770h = this.f127116e;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5280;
        bVar.f127068c = "/cgi-bin/micromsg-bin/policyagreementop";
        bVar.f127066a = kf32;
        bVar.f127067b = new C50258lf3();
        C45252f a = C47446b.f127269a.mo72464a(bVar.mo72403a());
        LifecycleScope lifecycleScope = C86709a0.m107523b().f251755f.f123611e;
        if (lifecycleScope != null) {
            LifecycleScope.launchDefault$default(lifecycleScope, (C53934p0) null, new C47375a(a, this.f127115d, this.f127116e, this.f127117f, this.f127118g, (C15601d<? super C47375a>) null), 1, (Object) null);
        }
        return C13598b0.f38549a;
    }
}
