package x70;

import a14.C0000n0;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53953u0;
import a14.C53973z1;
import android.os.Handler;
import android.os.HandlerThread;
import b14.C54392a;
import b14.C54394c;
import com.tencent.p014mm.autogen.mmdata.rpt.CameraKitMethodReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32227p;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import k14.C60949f;
import k14.C99088c;
import kotlin.ResultKt;
import p156gj.C87203t;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: x70.f */
public abstract class C112047f extends C112044e {

    /* renamed from: q */
    public static String f335427q = "";

    /* renamed from: j */
    public final HandlerThread f335428j;

    /* renamed from: n */
    public final C0000n0 f335429n;

    /* renamed from: o */
    public final Handler f335430o;

    /* renamed from: p */
    public final C99088c f335431p = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: x70.f$a */
    public static final class C38455a implements Runnable {

        /* renamed from: d */
        public static final C38455a f101426d = new C38455a();

        public final void run() {
            Map<String, String> d = C87203t.m108268d();
            String str = C112047f.f335427q;
            String str2 = (String) ((HashMap) d).get("hardware");
            C112047f.f335427q = str2 != null ? C112551y.m153814n(str2, ",", " ", false) : "";
            Log.m105924i("MicroMsg.Camera.Coroutines", "get cpu name:" + C112047f.f335427q);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitCoroutines$cameraAsync$1", mo125469f = "CameraKitCoroutines.kt", mo125470l = {79}, mo125471m = "invokeSuspend")
    /* renamed from: x70.f$b */
    public static final class C38456b extends C91594j implements C32227p<C0000n0, C15601d<? super T>, Object> {

        /* renamed from: d */
        public long f101427d;

        /* renamed from: e */
        public int f101428e;

        /* renamed from: f */
        public /* synthetic */ Object f101429f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C0000n0, C15601d<? super T>, Object> f101430g;

        /* renamed from: h */
        public final /* synthetic */ String f101431h;

        /* renamed from: i */
        public final /* synthetic */ long f101432i;

        /* renamed from: j */
        public final /* synthetic */ C112047f f101433j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38456b(C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar, String str, long j, C112047f fVar, C15601d<? super C38456b> dVar) {
            super(2, dVar);
            this.f101430g = pVar;
            this.f101431h = str;
            this.f101432i = j;
            this.f101433j = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C38456b bVar = new C38456b(this.f101430g, this.f101431h, this.f101432i, this.f101433j, dVar);
            bVar.f101429f = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C38456b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f101428e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                C32227p<C0000n0, C15601d<? super T>, Object> pVar = this.f101430g;
                this.f101427d = currentTimeMillis;
                this.f101428e = 1;
                obj = pVar.invoke((C0000n0) this.f101429f, this);
                if (obj == aVar) {
                    return aVar;
                }
                j = currentTimeMillis;
            } else if (i == 1) {
                j = this.f101427d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = C112047f.f335427q;
            Log.m105924i("MicroMsg.Camera.Coroutines", "Async End[" + this.f101431h + "] total cost:" + (currentTimeMillis2 - this.f101432i) + " post cost:" + (j - this.f101432i) + " exec cost:" + (currentTimeMillis2 - j));
            this.f101433j.mo163769q(this.f101431h, currentTimeMillis2 - this.f101432i);
            return obj;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitCoroutines$cameraLaunch$1", mo125469f = "CameraKitCoroutines.kt", mo125470l = {61}, mo125471m = "invokeSuspend")
    /* renamed from: x70.f$d */
    public static final class C38457d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public long f101434d;

        /* renamed from: e */
        public int f101435e;

        /* renamed from: f */
        public /* synthetic */ Object f101436f;

        /* renamed from: g */
        public final /* synthetic */ C32227p<C0000n0, C15601d<? super C13598b0>, Object> f101437g;

        /* renamed from: h */
        public final /* synthetic */ String f101438h;

        /* renamed from: i */
        public final /* synthetic */ long f101439i;

        /* renamed from: j */
        public final /* synthetic */ C112047f f101440j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38457d(C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, String str, long j, C112047f fVar, C15601d<? super C38457d> dVar) {
            super(2, dVar);
            this.f101437g = pVar;
            this.f101438h = str;
            this.f101439i = j;
            this.f101440j = fVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C38457d dVar2 = new C38457d(this.f101437g, this.f101438h, this.f101439i, this.f101440j, dVar);
            dVar2.f101436f = obj;
            return dVar2;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C38457d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            long j;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f101435e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long currentTimeMillis = System.currentTimeMillis();
                C32227p<C0000n0, C15601d<? super C13598b0>, Object> pVar = this.f101437g;
                this.f101434d = currentTimeMillis;
                this.f101435e = 1;
                if (pVar.invoke((C0000n0) this.f101436f, this) == aVar) {
                    return aVar;
                }
                j = currentTimeMillis;
            } else if (i == 1) {
                j = this.f101434d;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = C112047f.f335427q;
            Log.m105924i("MicroMsg.Camera.Coroutines", "Launch End[" + this.f101438h + "] total cost:" + (currentTimeMillis2 - this.f101439i) + " post cost:" + (j - this.f101439i) + " exec cost:" + (currentTimeMillis2 - j));
            this.f101440j.mo163769q(this.f101438h, currentTimeMillis2 - this.f101439i);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitCoroutines$execute$1", mo125469f = "CameraKitCoroutines.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: x70.f$f */
    public static final class C38458f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ Runnable f101441d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38458f(Runnable runnable, C15601d<? super C38458f> dVar) {
            super(2, dVar);
            this.f101441d = runnable;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C38458f(this.f101441d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C38458f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            Runnable runnable = this.f101441d;
            if (runnable != null) {
                runnable.run();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitCoroutines$cameraAsyncWithSync$1", mo125469f = "CameraKitCoroutines.kt", mo125470l = {157, 125}, mo125471m = "invokeSuspend")
    /* renamed from: x70.f$c */
    public static final class C112048c extends C91594j implements C32227p<C0000n0, C15601d<? super T>, Object> {

        /* renamed from: d */
        public Object f335432d;

        /* renamed from: e */
        public Object f335433e;

        /* renamed from: f */
        public long f335434f;

        /* renamed from: g */
        public int f335435g;

        /* renamed from: h */
        public /* synthetic */ Object f335436h;

        /* renamed from: i */
        public final /* synthetic */ C112047f f335437i;

        /* renamed from: j */
        public final /* synthetic */ String f335438j;

        /* renamed from: n */
        public final /* synthetic */ long f335439n;

        /* renamed from: o */
        public final /* synthetic */ C32227p<C0000n0, C15601d<? super T>, Object> f335440o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112048c(C112047f fVar, String str, long j, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar, C15601d<? super C112048c> dVar) {
            super(2, dVar);
            this.f335437i = fVar;
            this.f335438j = str;
            this.f335439n = j;
            this.f335440o = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112048c cVar = new C112048c(this.f335437i, this.f335438j, this.f335439n, this.f335440o, dVar);
            cVar.f335436h = obj;
            return cVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112048c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: type inference failed for: r3v3, types: [k14.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f335435g
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x0035
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                long r0 = r8.f335434f
                java.lang.Object r2 = r8.f335436h
                k14.c r2 = (k14.C99088c) r2
                kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0017 }
                goto L_0x006e
            L_0x0017:
                r9 = move-exception
                goto L_0x00bf
            L_0x001a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0022:
                long r5 = r8.f335434f
                java.lang.Object r1 = r8.f335433e
                fy3.p r1 = (fy3.C32227p) r1
                java.lang.Object r3 = r8.f335432d
                k14.c r3 = (k14.C99088c) r3
                java.lang.Object r7 = r8.f335436h
                a14.n0 r7 = (a14.C0000n0) r7
                kotlin.ResultKt.throwOnFailure(r9)
                r9 = r3
                goto L_0x005a
            L_0x0035:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f335436h
                r7 = r9
                a14.n0 r7 = (a14.C0000n0) r7
                long r5 = java.lang.System.currentTimeMillis()
                x70.f r9 = r8.f335437i
                k14.c r9 = r9.f335431p
                fy3.p<a14.n0, wx3.d<? super T>, java.lang.Object> r1 = r8.f335440o
                r8.f335436h = r7
                r8.f335432d = r9
                r8.f335433e = r1
                r8.f335434f = r5
                r8.f335435g = r3
                k14.d r9 = (k14.C60942d) r9
                java.lang.Object r3 = r9.mo85908b(r4, r8)
                if (r3 != r0) goto L_0x005a
                return r0
            L_0x005a:
                r8.f335436h = r9     // Catch:{ all -> 0x00bc }
                r8.f335432d = r4     // Catch:{ all -> 0x00bc }
                r8.f335433e = r4     // Catch:{ all -> 0x00bc }
                r8.f335434f = r5     // Catch:{ all -> 0x00bc }
                r8.f335435g = r2     // Catch:{ all -> 0x00bc }
                java.lang.Object r1 = r1.invoke(r7, r8)     // Catch:{ all -> 0x00bc }
                if (r1 != r0) goto L_0x006b
                return r0
            L_0x006b:
                r2 = r9
                r9 = r1
                r0 = r5
            L_0x006e:
                r2.mo85909c(r4)
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.String r4 = x70.C112047f.f335427q
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "cameraAsyncWithSync End["
                r4.append(r5)
                java.lang.String r5 = r8.f335438j
                r4.append(r5)
                java.lang.String r5 = "] total cost:"
                r4.append(r5)
                long r5 = r8.f335439n
                long r5 = r2 - r5
                r4.append(r5)
                java.lang.String r5 = " post cost:"
                r4.append(r5)
                long r5 = r8.f335439n
                long r5 = r0 - r5
                r4.append(r5)
                java.lang.String r5 = " exec cost:"
                r4.append(r5)
                long r0 = r2 - r0
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                java.lang.String r1 = "MicroMsg.Camera.Coroutines"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
                x70.f r0 = r8.f335437i
                java.lang.String r1 = r8.f335438j
                long r4 = r8.f335439n
                long r2 = r2 - r4
                r0.mo163769q(r1, r2)
                return r9
            L_0x00bc:
                r0 = move-exception
                r2 = r9
                r9 = r0
            L_0x00bf:
                r2.mo85909c(r4)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: x70.C112047f.C112048c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitCoroutines$cameraSyncLaunch$1", mo125469f = "CameraKitCoroutines.kt", mo125470l = {157, 105}, mo125471m = "invokeSuspend")
    /* renamed from: x70.f$e */
    public static final class C112049e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f335441d;

        /* renamed from: e */
        public Object f335442e;

        /* renamed from: f */
        public Object f335443f;

        /* renamed from: g */
        public long f335444g;

        /* renamed from: h */
        public int f335445h;

        /* renamed from: i */
        public /* synthetic */ Object f335446i;

        /* renamed from: j */
        public final /* synthetic */ String f335447j;

        /* renamed from: n */
        public final /* synthetic */ C112047f f335448n;

        /* renamed from: o */
        public final /* synthetic */ long f335449o;

        /* renamed from: p */
        public final /* synthetic */ C32227p<C0000n0, C15601d<? super C13598b0>, Object> f335450p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112049e(String str, C112047f fVar, long j, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar, C15601d<? super C112049e> dVar) {
            super(2, dVar);
            this.f335447j = str;
            this.f335448n = fVar;
            this.f335449o = j;
            this.f335450p = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112049e eVar = new C112049e(this.f335447j, this.f335448n, this.f335449o, this.f335450p, dVar);
            eVar.f335446i = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112049e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: k14.d} */
        /* JADX WARNING: type inference failed for: r9v4, types: [k14.c] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r12.f335445h
                r2 = 93
                r3 = 2
                r4 = 1
                java.lang.String r5 = "MicroMsg.Camera.Coroutines"
                r6 = 0
                if (r1 == 0) goto L_0x003e
                if (r1 == r4) goto L_0x0027
                if (r1 != r3) goto L_0x001f
                long r0 = r12.f335444g
                java.lang.Object r2 = r12.f335446i
                k14.c r2 = (k14.C99088c) r2
                kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ all -> 0x001c }
                goto L_0x00b2
            L_0x001c:
                r13 = move-exception
                goto L_0x0105
            L_0x001f:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0027:
                long r7 = r12.f335444g
                java.lang.Object r1 = r12.f335443f
                fy3.p r1 = (fy3.C32227p) r1
                java.lang.Object r4 = r12.f335442e
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r9 = r12.f335441d
                k14.c r9 = (k14.C99088c) r9
                java.lang.Object r10 = r12.f335446i
                a14.n0 r10 = (a14.C0000n0) r10
                kotlin.ResultKt.throwOnFailure(r13)
                r13 = r9
                goto L_0x0084
            L_0x003e:
                kotlin.ResultKt.throwOnFailure(r13)
                java.lang.Object r13 = r12.f335446i
                r10 = r13
                a14.n0 r10 = (a14.C0000n0) r10
                long r7 = java.lang.System.currentTimeMillis()
                java.lang.String r13 = x70.C112047f.f335427q
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r1 = "SyncLaunch Come In Launch["
                r13.append(r1)
                java.lang.String r1 = r12.f335447j
                r13.append(r1)
                r13.append(r2)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
                x70.f r13 = r12.f335448n
                k14.c r13 = r13.f335431p
                java.lang.String r1 = r12.f335447j
                fy3.p<a14.n0, wx3.d<? super rx3.b0>, java.lang.Object> r9 = r12.f335450p
                r12.f335446i = r10
                r12.f335441d = r13
                r12.f335442e = r1
                r12.f335443f = r9
                r12.f335444g = r7
                r12.f335445h = r4
                k14.d r13 = (k14.C60942d) r13
                java.lang.Object r4 = r13.mo85908b(r6, r12)
                if (r4 != r0) goto L_0x0082
                return r0
            L_0x0082:
                r4 = r1
                r1 = r9
            L_0x0084:
                java.lang.String r9 = x70.C112047f.f335427q     // Catch:{ all -> 0x0102 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
                r9.<init>()     // Catch:{ all -> 0x0102 }
                java.lang.String r11 = "SyncLaunch Come In Launch Lock["
                r9.append(r11)     // Catch:{ all -> 0x0102 }
                r9.append(r4)     // Catch:{ all -> 0x0102 }
                r9.append(r2)     // Catch:{ all -> 0x0102 }
                java.lang.String r2 = r9.toString()     // Catch:{ all -> 0x0102 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)     // Catch:{ all -> 0x0102 }
                r12.f335446i = r13     // Catch:{ all -> 0x0102 }
                r12.f335441d = r6     // Catch:{ all -> 0x0102 }
                r12.f335442e = r6     // Catch:{ all -> 0x0102 }
                r12.f335443f = r6     // Catch:{ all -> 0x0102 }
                r12.f335444g = r7     // Catch:{ all -> 0x0102 }
                r12.f335445h = r3     // Catch:{ all -> 0x0102 }
                java.lang.Object r1 = r1.invoke(r10, r12)     // Catch:{ all -> 0x0102 }
                if (r1 != r0) goto L_0x00b0
                return r0
            L_0x00b0:
                r2 = r13
                r0 = r7
            L_0x00b2:
                rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x001c }
                r2.mo85909c(r6)
                long r2 = java.lang.System.currentTimeMillis()
                java.lang.String r13 = x70.C112047f.f335427q
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r4 = "SyncLaunch End["
                r13.append(r4)
                java.lang.String r4 = r12.f335447j
                r13.append(r4)
                java.lang.String r4 = "] total cost:"
                r13.append(r4)
                long r6 = r12.f335449o
                long r6 = r2 - r6
                r13.append(r6)
                java.lang.String r4 = " post cost:"
                r13.append(r4)
                long r6 = r12.f335449o
                long r6 = r0 - r6
                r13.append(r6)
                java.lang.String r4 = " exec cost:"
                r13.append(r4)
                long r0 = r2 - r0
                r13.append(r0)
                java.lang.String r13 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
                x70.f r13 = r12.f335448n
                java.lang.String r0 = r12.f335447j
                long r4 = r12.f335449o
                long r2 = r2 - r4
                r13.mo163769q(r0, r2)
                rx3.b0 r13 = rx3.C13598b0.f38549a
                return r13
            L_0x0102:
                r0 = move-exception
                r2 = r13
                r13 = r0
            L_0x0105:
                r2.mo85909c(r6)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: x70.C112047f.C112049e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        ((C119157j) C119157j.f356862d).mo183875f(C38455a.f101426d);
    }

    public C112047f() {
        int i = C58834h.f168432b;
        HandlerThread a = C97749e.m126093a("CameraKit-Use", -2);
        this.f335428j = a;
        a.start();
        Handler handler = new Handler(a.getLooper());
        this.f335430o = handler;
        int i2 = C54394c.f152601a;
        this.f335429n = C53930o0.m60554a(new C54392a(handler, (String) null, false));
        this.f335424i.registerDisplayListener(this, handler);
        Log.m105924i("MicroMsg.Camera.Coroutines", '[' + hashCode() + "]CameraKit new instance,camera thread id:" + a.getThreadId());
    }

    /* renamed from: C */
    public C53973z1 mo163061C(String str, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        Log.m105924i("MicroMsg.Camera.Coroutines", "Launch Start[" + str + ']');
        long currentTimeMillis = System.currentTimeMillis();
        return C53895h.m60466d(this.f335429n, (C66212f) null, (C53934p0) null, new C38457d(pVar, str, currentTimeMillis, this, (C15601d<? super C38457d>) null), 3, (Object) null);
    }

    /* renamed from: D */
    public C53973z1 mo163062D(String str, C32227p<? super C0000n0, ? super C15601d<? super C13598b0>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        Log.m105924i("MicroMsg.Camera.Coroutines", "SyncLaunch Start[" + str + ']');
        long currentTimeMillis = System.currentTimeMillis();
        return C53895h.m60466d(this.f335429n, (C66212f) null, (C53934p0) null, new C112049e(str, this, currentTimeMillis, pVar, (C15601d<? super C112049e>) null), 3, (Object) null);
    }

    /* renamed from: J */
    public Handler mo163063J() {
        return this.f335430o;
    }

    /* renamed from: T */
    public <T> C53953u0<T> mo163064T(String str, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        Log.m105924i("MicroMsg.Camera.Coroutines", "cameraAsyncWithSync Start[" + str + ']');
        long currentTimeMillis = System.currentTimeMillis();
        return C53895h.m60464b(this.f335429n, (C66212f) null, (C53934p0) null, new C112048c(this, str, currentTimeMillis, pVar, (C15601d<? super C112048c>) null), 3, (Object) null);
    }

    public void execute(Runnable runnable) {
        mo163061C("execute", new C38458f(runnable, (C15601d<? super C38458f>) null));
    }

    /* renamed from: q */
    public final void mo163769q(String str, long j) {
        CameraKitMethodReportStruct cameraKitMethodReportStruct = new CameraKitMethodReportStruct();
        cameraKitMethodReportStruct.f310057i = cameraKitMethodReportStruct.mo86045b("SessionId", String.valueOf(this.f335419d), true);
        if (str == null) {
            str = "";
        }
        cameraKitMethodReportStruct.f310052d = cameraKitMethodReportStruct.mo86045b("MethodName", str, true);
        cameraKitMethodReportStruct.f310053e = (int) j;
        cameraKitMethodReportStruct.f310056h = cameraKitMethodReportStruct.mo86045b("CpuInfo", f335427q, true);
        cameraKitMethodReportStruct.mo86054n();
    }

    /* renamed from: y */
    public <T> C53953u0<T> mo163065y(String str, C32227p<? super C0000n0, ? super C15601d<? super T>, ? extends Object> pVar) {
        C87412m.m108594g(pVar, "block");
        Log.m105924i("MicroMsg.Camera.Coroutines", "Async Start[" + str + ']');
        long currentTimeMillis = System.currentTimeMillis();
        return C53895h.m60464b(this.f335429n, (C66212f) null, (C53934p0) null, new C38456b(pVar, str, currentTimeMillis, this, (C15601d<? super C38456b>) null), 3, (Object) null);
    }
}
