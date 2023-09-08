package wu1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53973z1;
import com.tencent.p014mm.autogen.mmdata.rpt.FlutterVoIPP2PStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C8480h;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: wu1.b */
public final class C111864b {

    /* renamed from: a */
    public static final C111864b f334908a = new C111864b();

    /* renamed from: b */
    public static FlutterVoIPP2PStruct f334909b = new FlutterVoIPP2PStruct();

    /* renamed from: c */
    public static C0000n0 f334910c = C53930o0.m60554a(C53872d1.f151119c);

    /* renamed from: d */
    public static C53973z1 f334911d;

    /* renamed from: e */
    public static C111865a f334912e = new C111865a(0, 0, false, 0, 0, 0, 0, false, 255, (C8480h) null);

    /* renamed from: wu1.b$a */
    public static final class C111865a {

        /* renamed from: a */
        public long f334913a;

        /* renamed from: b */
        public long f334914b;

        /* renamed from: c */
        public boolean f334915c;

        /* renamed from: d */
        public long f334916d;

        /* renamed from: e */
        public int f334917e;

        /* renamed from: f */
        public long f334918f;

        /* renamed from: g */
        public int f334919g;

        /* renamed from: h */
        public boolean f334920h;

        public C111865a() {
            this(0, 0, false, 0, 0, 0, 0, false, 255, (C8480h) null);
        }

        public C111865a(long j, long j2, boolean z, long j3, int i, long j4, int i2, boolean z2, int i3, C8480h hVar) {
            int i4 = i3;
            long j5 = (i4 & 1) != 0 ? -1 : j;
            long j6 = 0;
            long j7 = (i4 & 2) != 0 ? 0 : j2;
            int i5 = 0;
            boolean z3 = (i4 & 4) != 0 ? false : z;
            long j8 = (i4 & 8) != 0 ? 0 : j3;
            int i6 = (i4 & 16) != 0 ? 0 : i;
            j6 = (i4 & 32) == 0 ? j4 : j6;
            i5 = (i4 & 64) == 0 ? i2 : i5;
            boolean z4 = (i4 & 128) != 0 ? true : z2;
            this.f334913a = j5;
            this.f334914b = j7;
            this.f334915c = z3;
            this.f334916d = j8;
            this.f334917e = i6;
            this.f334918f = j6;
            this.f334919g = i5;
            this.f334920h = z4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C111865a)) {
                return false;
            }
            C111865a aVar = (C111865a) obj;
            return this.f334913a == aVar.f334913a && this.f334914b == aVar.f334914b && this.f334915c == aVar.f334915c && this.f334916d == aVar.f334916d && this.f334917e == aVar.f334917e && this.f334918f == aVar.f334918f && this.f334919g == aVar.f334919g && this.f334920h == aVar.f334920h;
        }

        public int hashCode() {
            long j = this.f334913a;
            long j2 = this.f334914b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            boolean z = this.f334915c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            long j3 = this.f334916d;
            long j4 = this.f334918f;
            int i2 = (((((((((i + (z ? 1 : 0)) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f334917e) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f334919g) * 31;
            boolean z3 = this.f334920h;
            if (!z3) {
                z2 = z3;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            return "States(lastStartTime=" + this.f334913a + ", duration=" + this.f334914b + ", fromPip=" + this.f334915c + ", pssCollectSum=" + this.f334916d + ", pssCollectCount=" + this.f334917e + ", pipDurationSum=" + this.f334918f + ", pipDurationCount=" + this.f334919g + ", isConnected=" + this.f334920h + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.voip.flutterplugin.FlutterVoIPReportAgent$onCompleted$1", mo125469f = "FlutterVoIPReportAgent.kt", mo125470l = {91}, mo125471m = "invokeSuspend")
    /* renamed from: wu1.b$b */
    public static final class C111866b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f334921d;

        /* renamed from: e */
        public int f334922e;

        public C111866b(C15601d<? super C111866b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C111866b(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C111866b((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            FlutterVoIPP2PStruct flutterVoIPP2PStruct;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f334922e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlutterVoIPP2PStruct flutterVoIPP2PStruct2 = C111864b.f334909b;
                C111864b bVar = C111864b.f334908a;
                this.f334921d = flutterVoIPP2PStruct2;
                this.f334922e = 1;
                Object g = C53895h.m60469g(C53872d1.f151119c, new C91115c((C15601d<? super C91115c>) null), this);
                if (g == aVar) {
                    return aVar;
                }
                flutterVoIPP2PStruct = flutterVoIPP2PStruct2;
                obj = g;
            } else if (i == 1) {
                flutterVoIPP2PStruct = (FlutterVoIPP2PStruct) this.f334921d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flutterVoIPP2PStruct.f310183k = ((Number) obj).longValue();
            C111864b.f334909b.mo86054n();
            Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "report: " + C111864b.f334912e + "\n\n " + C111864b.f334909b.mo1006q());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo163610a() {
        Log.m105924i("MicroMsg.FlutterVoIPReportAgent", "onCompleted");
        C53973z1 z1Var = f334911d;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        f334911d = null;
        C111865a aVar = f334912e;
        if (aVar.f334913a > 0) {
            aVar.f334914b += System.currentTimeMillis() - f334912e.f334913a;
        }
        FlutterVoIPP2PStruct flutterVoIPP2PStruct = f334909b;
        C111865a aVar2 = f334912e;
        flutterVoIPP2PStruct.f310184l = aVar2.f334914b;
        int i = aVar2.f334917e;
        if (i > 0) {
            flutterVoIPP2PStruct.f310182j = aVar2.f334916d / ((long) i);
        } else {
            flutterVoIPP2PStruct.f310182j = flutterVoIPP2PStruct.f310181i;
        }
        int i2 = aVar2.f334919g;
        if (i2 > 0) {
            flutterVoIPP2PStruct.f310180h = aVar2.f334918f / ((long) i2);
        }
        C53895h.m60466d(f334910c, (C66212f) null, (C53934p0) null, new C111866b((C15601d<? super C111866b>) null), 3, (Object) null);
    }
}
