package p634or;

import a10.C112712b;
import android.content.Context;
import com.tencent.p014mm.autogen.mmdata.rpt.FlutterEngineCreateInfoStruct;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.feature.flutter.FlutterEngineService$initEngineGroup$2", mo125469f = "FlutterEngineService.kt", mo125470l = {143}, mo125471m = "invokeSuspend")
/* renamed from: or.h */
public final class C117885h extends C91594j implements C32226l<C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f352413d;

    /* renamed from: e */
    public int f352414e;

    /* renamed from: f */
    public final /* synthetic */ C117883g f352415f;

    /* renamed from: g */
    public final /* synthetic */ Context f352416g;

    /* renamed from: or.h$a */
    public static final class C117886a extends C87413o implements C32226l<C112712b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117883g f352417d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117886a(C117883g gVar) {
            super(1);
            this.f352417d = gVar;
        }

        public Object invoke(Object obj) {
            C112712b bVar = (C112712b) obj;
            C87412m.m108594g(bVar, LocaleUtil.ITALIAN);
            C117883g gVar = this.f352417d;
            gVar.getClass();
            FlutterEngineCreateInfoStruct flutterEngineCreateInfoStruct = new FlutterEngineCreateInfoStruct();
            flutterEngineCreateInfoStruct.f343737d = flutterEngineCreateInfoStruct.mo86045b("EngineId", bVar.f337456a, true);
            long j = 1;
            flutterEngineCreateInfoStruct.f343738e = bVar.f337458c ? 1 : 0;
            flutterEngineCreateInfoStruct.f343739f = bVar.f337457b;
            flutterEngineCreateInfoStruct.f343740g = bVar.f337459d;
            flutterEngineCreateInfoStruct.f343741h = bVar.f337460e;
            flutterEngineCreateInfoStruct.f343742i = bVar.f337461f;
            flutterEngineCreateInfoStruct.f343743j = flutterEngineCreateInfoStruct.mo86045b("Route", bVar.f337462g, true);
            flutterEngineCreateInfoStruct.f343744k = bVar.f337463h;
            flutterEngineCreateInfoStruct.f343745l = bVar.f337465j;
            if (!bVar.f337464i) {
                j = 0;
            }
            flutterEngineCreateInfoStruct.f343746m = j;
            flutterEngineCreateInfoStruct.f343747n = bVar.f337466k;
            Log.m105924i(gVar.f352403d, "reportEngineCreate: " + flutterEngineCreateInfoStruct.mo1006q());
            flutterEngineCreateInfoStruct.mo86054n();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: or.h$b */
    public static final class C117887b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C117883g f352418d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117887b(C117883g gVar) {
            super(0);
            this.f352418d = gVar;
        }

        public Object invoke() {
            C117883g gVar = this.f352418d;
            gVar.f352405f = null;
            gVar.f352406g = null;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117885h(C117883g gVar, Context context, C15601d<? super C117885h> dVar) {
        super(1, dVar);
        this.f352415f = gVar;
        this.f352416g = context;
    }

    public final C15601d<C13598b0> create(C15601d<?> dVar) {
        return new C117885h(this.f352415f, this.f352416g, dVar);
    }

    public Object invoke(Object obj) {
        return ((C117885h) create((C15601d) obj)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r3 != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r9.f352414e
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r0 = r9.f352413d
            or.g r0 = (p634or.C117883g) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0065
        L_0x0011:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r10)
            or.g r10 = r9.f352415f
            java.lang.String r10 = r10.f352403d
            java.lang.String r1 = "initEngineGroup"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            or.g r10 = r9.f352415f
            a10.c r1 = r10.f352405f
            if (r1 == 0) goto L_0x0035
            r3 = 0
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.f337471e
            if (r1 != 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            if (r3 == 0) goto L_0x0081
        L_0x0035:
            a10.a r1 = new a10.a
            r1.<init>()
            android.content.Context r3 = r9.f352416g
            java.lang.String r4 = "context"
            gy3.C87412m.m108594g(r3, r4)
            r1.f337442a = r3
            java.lang.String r3 = "root"
            r1.f337443b = r3
            or.g r3 = r9.f352415f
            java.lang.String[] r3 = r3.mo161652CL()
            r1.f337444c = r3
            or.h$a r3 = new or.h$a
            or.g r4 = r9.f352415f
            r3.<init>(r4)
            r1.f337445d = r3
            r9.f352413d = r10
            r9.f352414e = r2
            java.lang.Object r1 = r1.mo164445a(r9)
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r0 = r10
            r10 = r1
        L_0x0065:
            a10.c r10 = (a10.C112713c) r10
            r0.f352405f = r10
            gu1.f r1 = new gu1.f
            or.g r10 = r9.f352415f
            a10.c r2 = r10.f352405f
            gy3.C87412m.m108591d(r2)
            r3 = 30000(0x7530, double:1.4822E-319)
            r5 = 0
            or.h$b r6 = new or.h$b
            or.g r10 = r9.f352415f
            r6.<init>(r10)
            r7 = 4
            r8 = 0
            r1.<init>(r2, r3, r5, r6, r7, r8)
        L_0x0081:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p634or.C117885h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
