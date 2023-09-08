package ja0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import com.tencent.maas.instamovie.base.MJError;
import com.tencent.p014mm.autogen.mmdata.rpt.MaaSCreationReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;

/* renamed from: ja0.e */
public final class C60784e {

    /* renamed from: a */
    public static final C60784e f173126a = new C60784e();

    /* renamed from: b */
    public static final C0000n0 f173127b = C53930o0.m60554a(C53872d1.f151119c.plus(C53959v2.m60598a((C53973z1) null, 1, (Object) null)));

    /* renamed from: c */
    public static MaaSCreationReportStruct f173128c = new MaaSCreationReportStruct();

    /* renamed from: d */
    public static C53973z1 f173129d;

    @C91590f(mo125468c = "com.tencent.mm.mj_template.maas.report.MaasReport24946$report$1", mo125469f = "MaasReport24946.kt", mo125470l = {94}, mo125471m = "invokeSuspend")
    /* renamed from: ja0.e$a */
    public static final class C60785a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f173130d;

        /* renamed from: e */
        public final /* synthetic */ C53973z1 f173131e;

        /* renamed from: f */
        public final /* synthetic */ int f173132f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60785a(C53973z1 z1Var, int i, C15601d<? super C60785a> dVar) {
            super(2, dVar);
            this.f173131e = z1Var;
            this.f173132f = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C60785a(this.f173131e, this.f173132f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C60785a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f173130d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C53973z1 z1Var = this.f173131e;
                if (z1Var != null) {
                    this.f173130d = 1;
                    if (z1Var.mo74521O(this) == aVar) {
                        return aVar;
                    }
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MaaSCreationReportStruct maaSCreationReportStruct = C60784e.f173128c;
            int i2 = this.f173132f;
            maaSCreationReportStruct.f156477d = maaSCreationReportStruct.mo86045b("sessionKey", C60781a.f173118a, true);
            maaSCreationReportStruct.f156478e = C60781a.f173119b;
            maaSCreationReportStruct.f156486m = i2;
            Log.m105924i("MaasReport24946", "report creationResult: " + i2);
            maaSCreationReportStruct.mo86054n();
            C60784e.f173128c = new MaaSCreationReportStruct();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo85716a(MJError mJError) {
        C87412m.m108594g(mJError, "error");
        f173128c.f156484k = mJError.f154609ec.getErrorCode();
        MaaSCreationReportStruct maaSCreationReportStruct = f173128c;
        String str = mJError.message;
        C87412m.m108593f(str, "error.message");
        maaSCreationReportStruct.f156485l = maaSCreationReportStruct.mo86045b("exportResultErrorMessage", C112551y.m153814n(str, ",", ";", false), true);
    }

    /* renamed from: b */
    public final void mo85717b(int i) {
        f173129d = C53895h.m60466d(f173127b, (C66212f) null, (C53934p0) null, new C60785a(f173129d, i, (C15601d<? super C60785a>) null), 3, (Object) null);
    }
}
