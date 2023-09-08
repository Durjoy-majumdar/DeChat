package hi0;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53916l;
import a14.C53921m;
import a14.C53930o0;
import a14.C53934p0;
import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.utils.C84712a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.FileReaderHelper;
import eb0.C86484b;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gi0.C87194e;
import gy3.C87412m;
import gy3.C87413o;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import ki0.C88153c;
import ki0.C88154d;
import kotlin.Result;
import kotlin.ResultKt;
import lu3.C88656g;
import rx3.C13598b0;
import tm0.C90538k;
import wx3.C15601d;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;

/* renamed from: hi0.w */
public final class C87509w extends C84712a<C84712a.C84713a> implements C87508v {

    /* renamed from: g */
    public static final C87509w f253511g = new C87509w();

    /* renamed from: h */
    public static final ConcurrentSkipListSet<String> f253512h = new ConcurrentSkipListSet<>();

    /* renamed from: hi0.w$a */
    public static final class C87510a implements C84712a.C84713a, C88656g {

        /* renamed from: d */
        public final String f253513d = "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.CheckCmdAndSubmitTask";

        /* renamed from: e */
        public C32224a<C13598b0> f253514e;

        public String getKey() {
            return this.f253513d;
        }

        public void run() {
            int i;
            Class cls = C88154d.class;
            if (!C86709a0.m107523b().f251765p) {
                Log.m105920e(this.f253513d, "retry but account not ready");
                C87509w.f253511g.mo121961t();
                return;
            }
            C90538k.C90543e x = C90538k.m113361x(MMApplicationContext.getContext());
            switch (x.ordinal()) {
                case 0:
                case 6:
                    String str = this.f253513d;
                    Log.m105924i(str, "networkType(" + x + ") invalid, skip");
                    return;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                case 4:
                    i = 8;
                    break;
                case 5:
                    i = 1;
                    break;
                default:
                    i = -1;
                    break;
            }
            LinkedList<C88153c> linkedList = new LinkedList<>();
            C88154d dVar = (C88154d) C81161g2.Bx0(cls);
            dVar.getClass();
            boolean z = false;
            linkedList.addAll(dVar.mo122563qq("networkType=?", String.valueOf(0)));
            C88154d dVar2 = (C88154d) C81161g2.Bx0(cls);
            dVar2.getClass();
            List<C88153c> qq = dVar2.mo122563qq("networkType<>?", String.valueOf(0));
            C87412m.m108593f(qq, "getStorage(CmdGetCodePer….cmdsUnderSpecificNetType");
            for (C88153c cVar : qq) {
                if ((cVar.field_networkType & i) > 0) {
                    linkedList.add(cVar);
                }
            }
            for (C88153c cVar2 : linkedList) {
                if (cVar2.field_type == 0) {
                    C87509w wVar = C87509w.f253511g;
                    wVar.getClass();
                    wVar.mo117441d(new C87511b(cVar2));
                } else {
                    z = true;
                }
            }
            C32224a<C13598b0> aVar = this.f253514e;
            if (aVar != null) {
                aVar.invoke();
                if (z) {
                    C87502p._INSTANCE.mo121960b();
                    return;
                }
                return;
            }
            C87412m.m108603p("notifyQueueCallback");
            throw null;
        }
    }

    /* renamed from: hi0.w$b */
    public static final class C87511b implements C84712a.C84713a, C88656g {

        /* renamed from: d */
        public final C88153c f253515d;

        /* renamed from: e */
        public final String f253516e = "MicroMsg.AppBrand.GetCodeRetryQueueNewImpl.RunCmdTask";

        /* renamed from: f */
        public C32224a<C13598b0> f253517f;

        /* renamed from: hi0.w$b$b */
        public static final class C32924b extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C53916l<Boolean> f89498d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C32924b(C53916l<? super Boolean> lVar) {
                super(1);
                this.f89498d = lVar;
            }

            public Object invoke(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (this.f89498d.mo74597a()) {
                    if (!C86709a0.m107522a()) {
                        C53916l<Boolean> lVar = this.f89498d;
                        Result.Companion companion = Result.Companion;
                        lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C86484b())));
                    } else {
                        this.f89498d.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(booleanValue)));
                    }
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.appcache.predownload.cmd.GetCodeRetryQueueNewImpl$RunCmdTask$run$1", mo125469f = "GetCodeRetryQueueNewImpl.kt", mo125470l = {207}, mo125471m = "invokeSuspend")
        /* renamed from: hi0.w$b$a */
        public static final class C87512a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f253518d;

            /* renamed from: e */
            public final /* synthetic */ C87511b f253519e;

            /* renamed from: f */
            public final /* synthetic */ C88153c f253520f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C87512a(C87511b bVar, C88153c cVar, C15601d<? super C87512a> dVar) {
                super(2, dVar);
                this.f253519e = bVar;
                this.f253520f = cVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C87512a(this.f253519e, this.f253520f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C87512a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:75:0x0232 A[Catch:{ Exception -> 0x025e, all -> 0x025c }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                /*
                    r12 = this;
                    java.lang.Class<ki0.d> r0 = ki0.C88154d.class
                    xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r2 = r12.f253518d
                    r3 = 0
                    r4 = 1
                    if (r2 == 0) goto L_0x0019
                    if (r2 != r4) goto L_0x0011
                    kotlin.ResultKt.throwOnFailure(r13)     // Catch:{ Exception -> 0x025e }
                    goto L_0x01eb
                L_0x0011:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r0)
                    throw r13
                L_0x0019:
                    kotlin.ResultKt.throwOnFailure(r13)
                    com.tencent.mm.plugin.appbrand.appcache.j1 r13 = new com.tencent.mm.plugin.appbrand.appcache.j1     // Catch:{ Exception -> 0x025e }
                    hi0.w$b r2 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    ki0.c r2 = r2.f253515d     // Catch:{ Exception -> 0x025e }
                    java.lang.String r5 = r2.field_appId     // Catch:{ Exception -> 0x025e }
                    java.lang.String r6 = r2.field_packageKey     // Catch:{ Exception -> 0x025e }
                    int r2 = r2.field_packageType     // Catch:{ Exception -> 0x025e }
                    r13.<init>(r5, r6, r2)     // Catch:{ Exception -> 0x025e }
                    r2 = 0
                    hi0.w$b r5 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    ki0.c r5 = r5.f253515d     // Catch:{ Exception -> 0x025e }
                    java.lang.String r6 = r5.field_appId     // Catch:{ Exception -> 0x025e }
                    java.lang.String r7 = r5.field_packageKey     // Catch:{ Exception -> 0x025e }
                    int r5 = r5.field_packageType     // Catch:{ Exception -> 0x025e }
                    r8 = 36
                    java.lang.String r9 = ""
                    if (r5 == 0) goto L_0x0089
                    r10 = 6
                    if (r5 == r10) goto L_0x0086
                    r10 = 12
                    java.lang.String r11 = "__WITHOUT_PLUGINCODE__"
                    if (r5 == r10) goto L_0x008a
                    r10 = 13
                    if (r5 == r10) goto L_0x006f
                    r10 = 22
                    java.lang.String r11 = "__WITHOUT_MULTI_PLUGINCODE__"
                    if (r5 == r10) goto L_0x008a
                    r10 = 23
                    if (r5 == r10) goto L_0x0058
                    java.lang.String r11 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r7)     // Catch:{ Exception -> 0x025e }
                    goto L_0x008a
                L_0x0058:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r5.<init>()     // Catch:{ Exception -> 0x025e }
                    java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r7)     // Catch:{ Exception -> 0x025e }
                    r5.append(r7)     // Catch:{ Exception -> 0x025e }
                    r5.append(r8)     // Catch:{ Exception -> 0x025e }
                    r5.append(r11)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x025e }
                    goto L_0x008a
                L_0x006f:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r5.<init>()     // Catch:{ Exception -> 0x025e }
                    java.lang.String r7 = com.tencent.p014mm.plugin.appbrand.appcache.C81273j1.m99631a(r7)     // Catch:{ Exception -> 0x025e }
                    r5.append(r7)     // Catch:{ Exception -> 0x025e }
                    r5.append(r8)     // Catch:{ Exception -> 0x025e }
                    r5.append(r11)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r11 = r5.toString()     // Catch:{ Exception -> 0x025e }
                    goto L_0x008a
                L_0x0086:
                    java.lang.String r11 = "__PLUGINCODE__"
                    goto L_0x008a
                L_0x0089:
                    r11 = r9
                L_0x008a:
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)     // Catch:{ Exception -> 0x025e }
                    if (r5 == 0) goto L_0x00b5
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r2.<init>()     // Catch:{ Exception -> 0x025e }
                    r2.append(r6)     // Catch:{ Exception -> 0x025e }
                    boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r11)     // Catch:{ Exception -> 0x025e }
                    if (r5 == 0) goto L_0x009f
                    goto L_0x00ae
                L_0x009f:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r5.<init>()     // Catch:{ Exception -> 0x025e }
                    r5.append(r8)     // Catch:{ Exception -> 0x025e }
                    r5.append(r11)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r9 = r5.toString()     // Catch:{ Exception -> 0x025e }
                L_0x00ae:
                    r2.append(r9)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x025e }
                L_0x00b5:
                    r6 = r2
                    java.lang.String r2 = "PkgQueryKey(cmd.field_ap…d_packageType).toString()"
                    gy3.C87412m.m108593f(r6, r2)     // Catch:{ Exception -> 0x025e }
                    com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo r2 = com.tencent.p014mm.plugin.appbrand.launching.C83396o0.m102337b(r6, r3)     // Catch:{ Exception -> 0x025e }
                    r5 = 2
                    if (r2 == 0) goto L_0x0108
                    hi0.w$b r7 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    ki0.c r8 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r9 = r2.pkgVersion()     // Catch:{ Exception -> 0x025e }
                    ki0.c r10 = r7.f253515d     // Catch:{ Exception -> 0x025e }
                    int r10 = r10.field_version     // Catch:{ Exception -> 0x025e }
                    if (r9 < r10) goto L_0x0108
                    java.lang.String r1 = r7.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r6 = "available pkg(%s %d) >= record(%s %d), skip"
                    r7 = 4
                    java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x025e }
                    java.lang.String r9 = r13.toString()     // Catch:{ Exception -> 0x025e }
                    r7[r3] = r9     // Catch:{ Exception -> 0x025e }
                    int r2 = r2.pkgVersion     // Catch:{ Exception -> 0x025e }
                    java.lang.Integer r9 = new java.lang.Integer     // Catch:{ Exception -> 0x025e }
                    r9.<init>(r2)     // Catch:{ Exception -> 0x025e }
                    r7[r4] = r9     // Catch:{ Exception -> 0x025e }
                    java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x025e }
                    r7[r5] = r13     // Catch:{ Exception -> 0x025e }
                    r13 = 3
                    int r2 = r8.field_version     // Catch:{ Exception -> 0x025e }
                    java.lang.Integer r4 = new java.lang.Integer     // Catch:{ Exception -> 0x025e }
                    r4.<init>(r2)     // Catch:{ Exception -> 0x025e }
                    r7[r13] = r4     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r7)     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x025e }
                    ki0.d r13 = (ki0.C88154d) r13     // Catch:{ Exception -> 0x025e }
                    java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ Exception -> 0x025e }
                    r13.delete(r8, r0)     // Catch:{ Exception -> 0x025e }
                    rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x025e }
                    goto L_0x01ab
                L_0x0108:
                    ki0.c r2 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    boolean r7 = r2.field_firstTimeTried     // Catch:{ Exception -> 0x025e }
                    if (r7 != 0) goto L_0x0125
                    r2.field_firstTimeTried = r4     // Catch:{ Exception -> 0x025e }
                    long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x025e }
                    r2.field_lastRetryTime = r7     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x025e }
                    ki0.d r13 = (ki0.C88154d) r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ Exception -> 0x025e }
                    r13.update(r0, r2)     // Catch:{ Exception -> 0x025e }
                    goto L_0x01ca
                L_0x0125:
                    int r7 = r2.field_retryTimes     // Catch:{ Exception -> 0x025e }
                    if (r7 > 0) goto L_0x014b
                    hi0.w$b r1 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r1 = r1.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r2 = "record(%s) retryTimes == 0, skip"
                    java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x025e }
                    java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x025e }
                    r4[r3] = r13     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r4)     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x025e }
                    ki0.d r13 = (ki0.C88154d) r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Exception -> 0x025e }
                    r13.delete(r0, r1)     // Catch:{ Exception -> 0x025e }
                    rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x025e }
                    goto L_0x01ab
                L_0x014b:
                    long r7 = r2.field_lastRetryTime     // Catch:{ Exception -> 0x025e }
                    long r9 = r2.field_retryInterval     // Catch:{ Exception -> 0x025e }
                    long r7 = r7 + r9
                    long r9 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x025e }
                    int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0177
                    hi0.w$b r0 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r0 = r0.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r1 = "exceed record(%s) retryInterval %d, skip"
                    java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x025e }
                    java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x025e }
                    r2[r3] = r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r13 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    long r5 = r13.field_retryInterval     // Catch:{ Exception -> 0x025e }
                    java.lang.Long r13 = new java.lang.Long     // Catch:{ Exception -> 0x025e }
                    r13.<init>(r5)     // Catch:{ Exception -> 0x025e }
                    r2[r4] = r13     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r1, r2)     // Catch:{ Exception -> 0x025e }
                    rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x025e }
                    goto L_0x01ab
                L_0x0177:
                    ki0.c r2 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r7 = r2.field_retriedCount     // Catch:{ Exception -> 0x025e }
                    int r7 = r7 + r4
                    int r8 = r2.field_retryTimes     // Catch:{ Exception -> 0x025e }
                    if (r7 <= r8) goto L_0x01b5
                    hi0.w$b r1 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r1 = r1.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r2 = "exceed record(%s) retryTimes %d, skip"
                    java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x025e }
                    java.lang.String r13 = r13.toString()     // Catch:{ Exception -> 0x025e }
                    r5[r3] = r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r13 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r13 = r13.field_retryTimes     // Catch:{ Exception -> 0x025e }
                    java.lang.Integer r6 = new java.lang.Integer     // Catch:{ Exception -> 0x025e }
                    r6.<init>(r13)     // Catch:{ Exception -> 0x025e }
                    r5[r4] = r6     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r2, r5)     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x025e }
                    ki0.d r13 = (ki0.C88154d) r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Exception -> 0x025e }
                    r13.delete(r0, r1)     // Catch:{ Exception -> 0x025e }
                    rx3.b0 r13 = rx3.C13598b0.f38549a     // Catch:{ Exception -> 0x025e }
                L_0x01ab:
                    hi0.w$b r0 = r12.f253519e
                    fy3.a r0 = r0.mo121963a()
                    r0.invoke()
                    return r13
                L_0x01b5:
                    r2.field_retriedCount = r7     // Catch:{ Exception -> 0x025e }
                    long r7 = com.tencent.p014mm.sdk.platformtools.Util.nowSecond()     // Catch:{ Exception -> 0x025e }
                    r2.field_lastRetryTime = r7     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r0)     // Catch:{ Exception -> 0x025e }
                    ki0.d r13 = (ki0.C88154d) r13     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ Exception -> 0x025e }
                    r13.update(r0, r2)     // Catch:{ Exception -> 0x025e }
                L_0x01ca:
                    ki0.c r13 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r13 = r13.field_type     // Catch:{ Exception -> 0x025e }
                    if (r13 != 0) goto L_0x0260
                    com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()     // Catch:{ Exception -> 0x025e }
                    com.tencent.mm.plugin.appbrand.appcache.h3 r5 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238471g     // Catch:{ Exception -> 0x025e }
                    ki0.c r13 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r8 = r13.field_version     // Catch:{ Exception -> 0x025e }
                    java.lang.String r9 = r13.field_pkgMd5     // Catch:{ Exception -> 0x025e }
                    r7 = 0
                    r10 = 0
                    r5.mo113527k(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x025e }
                    hi0.w$b r13 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    r12.f253518d = r4     // Catch:{ Exception -> 0x025e }
                    java.lang.Object r13 = r13.mo121964b(r12)     // Catch:{ Exception -> 0x025e }
                    if (r13 != r1) goto L_0x01eb
                    return r1
                L_0x01eb:
                    java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ Exception -> 0x025e }
                    boolean r13 = r13.booleanValue()     // Catch:{ Exception -> 0x025e }
                    hi0.w$b r0 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r0 = r0.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r1.<init>()     // Catch:{ Exception -> 0x025e }
                    java.lang.String r2 = "record("
                    r1.append(r2)     // Catch:{ Exception -> 0x025e }
                    ki0.c r2 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    r1.append(r2)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r2 = ") completed, isSucceed("
                    r1.append(r2)     // Catch:{ Exception -> 0x025e }
                    if (r13 == 0) goto L_0x020e
                    r2 = 1
                    goto L_0x020f
                L_0x020e:
                    r2 = 0
                L_0x020f:
                    r1.append(r2)     // Catch:{ Exception -> 0x025e }
                    r2 = 41
                    r1.append(r2)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)     // Catch:{ Exception -> 0x025e }
                    if (r13 == 0) goto L_0x023a
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    java.lang.String r0 = r0.field_localRequestKey     // Catch:{ Exception -> 0x025e }
                    if (r0 == 0) goto L_0x022f
                    int r0 = r0.length()     // Catch:{ Exception -> 0x025e }
                    if (r0 != 0) goto L_0x022d
                    goto L_0x022f
                L_0x022d:
                    r0 = 0
                    goto L_0x0230
                L_0x022f:
                    r0 = 1
                L_0x0230:
                    if (r0 != 0) goto L_0x023a
                    com.tencent.mm.plugin.appbrand.appcache.predownload.h r13 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h.f238795a     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    r13.mo113612c(r0)     // Catch:{ Exception -> 0x025e }
                    goto L_0x02a8
                L_0x023a:
                    if (r13 != 0) goto L_0x02a8
                    ki0.c r13 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    int r0 = r13.field_retryTimes     // Catch:{ Exception -> 0x025e }
                    if (r0 <= 0) goto L_0x0247
                    int r1 = r13.field_retriedCount     // Catch:{ Exception -> 0x025e }
                    int r1 = r1 + r4
                    if (r1 <= r0) goto L_0x02a8
                L_0x0247:
                    java.lang.String r13 = r13.field_localRequestKey     // Catch:{ Exception -> 0x025e }
                    if (r13 == 0) goto L_0x0251
                    int r13 = r13.length()     // Catch:{ Exception -> 0x025e }
                    if (r13 != 0) goto L_0x0252
                L_0x0251:
                    r3 = 1
                L_0x0252:
                    if (r3 != 0) goto L_0x02a8
                    com.tencent.mm.plugin.appbrand.appcache.predownload.h r13 = com.tencent.p014mm.plugin.appbrand.appcache.predownload.C81334h.f238795a     // Catch:{ Exception -> 0x025e }
                    ki0.c r0 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    r13.mo113611b(r0)     // Catch:{ Exception -> 0x025e }
                    goto L_0x02a8
                L_0x025c:
                    r13 = move-exception
                    goto L_0x02b4
                L_0x025e:
                    r13 = move-exception
                    goto L_0x027c
                L_0x0260:
                    hi0.w$b r13 = r12.f253519e     // Catch:{ Exception -> 0x025e }
                    java.lang.String r13 = r13.f253516e     // Catch:{ Exception -> 0x025e }
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
                    r0.<init>()     // Catch:{ Exception -> 0x025e }
                    java.lang.String r1 = "skip unsupported type "
                    r0.append(r1)     // Catch:{ Exception -> 0x025e }
                    ki0.c r1 = r12.f253520f     // Catch:{ Exception -> 0x025e }
                    r0.append(r1)     // Catch:{ Exception -> 0x025e }
                    java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x025e }
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)     // Catch:{ Exception -> 0x025e }
                    goto L_0x02a8
                L_0x027c:
                    boolean r0 = r13 instanceof eb0.C86484b     // Catch:{ all -> 0x025c }
                    if (r0 == 0) goto L_0x0285
                    hi0.w r0 = hi0.C87509w.f253511g     // Catch:{ all -> 0x025c }
                    r0.mo121961t()     // Catch:{ all -> 0x025c }
                L_0x0285:
                    hi0.w$b r0 = r12.f253519e     // Catch:{ all -> 0x025c }
                    java.lang.String r0 = r0.f253516e     // Catch:{ all -> 0x025c }
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x025c }
                    r1.<init>()     // Catch:{ all -> 0x025c }
                    java.lang.String r2 = "try record("
                    r1.append(r2)     // Catch:{ all -> 0x025c }
                    ki0.c r2 = r12.f253520f     // Catch:{ all -> 0x025c }
                    r1.append(r2)     // Catch:{ all -> 0x025c }
                    java.lang.String r2 = ") get exception:"
                    r1.append(r2)     // Catch:{ all -> 0x025c }
                    r1.append(r13)     // Catch:{ all -> 0x025c }
                    java.lang.String r13 = r1.toString()     // Catch:{ all -> 0x025c }
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)     // Catch:{ all -> 0x025c }
                L_0x02a8:
                    hi0.w$b r13 = r12.f253519e
                    fy3.a r13 = r13.mo121963a()
                    r13.invoke()
                    rx3.b0 r13 = rx3.C13598b0.f38549a
                    return r13
                L_0x02b4:
                    hi0.w$b r0 = r12.f253519e
                    fy3.a r0 = r0.mo121963a()
                    r0.invoke()
                    throw r13
                */
                throw new UnsupportedOperationException("Method not decompiled: hi0.C87509w.C87511b.C87512a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C87511b(C88153c cVar) {
            C87412m.m108594g(cVar, FileReaderHelper.OPEN_FILE_FROM_CMD);
            this.f253515d = cVar;
        }

        /* renamed from: a */
        public final C32224a<C13598b0> mo121963a() {
            C32224a<C13598b0> aVar = this.f253517f;
            if (aVar != null) {
                return aVar;
            }
            C87412m.m108603p("notifyQueueCallback");
            throw null;
        }

        /* renamed from: b */
        public final Object mo121964b(C15601d<? super Boolean> dVar) {
            C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
            mVar.mo74609p();
            new C87194e(this.f253515d, new C32924b(mVar)).mo121631c();
            return mVar.mo74608o();
        }

        public String getKey() {
            return this.f253516e;
        }

        public void run() {
            String str = this.f253516e;
            Log.m105924i(str, "try record " + this.f253515d);
            C87509w.f253512h.add(this.f253515d.field_appId);
            C53895h.m60466d(C53930o0.m60555b(), C53872d1.f151119c, (C53934p0) null, new C87512a(this, this.f253515d, (C15601d<? super C87512a>) null), 2, (Object) null);
        }
    }

    public C87509w() {
        super(1);
    }

    /* renamed from: a */
    public boolean mo121959a(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return f253512h.contains(str);
    }

    /* renamed from: b */
    public void mo121960b() {
        Log.m105924i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "triggerRetry stack:" + android.util.Log.getStackTraceString(new Throwable()));
        mo117441d(new C87510a());
    }

    /* renamed from: f */
    public void mo117442f() {
        Log.m105924i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "onQueueDrained");
        f253512h.clear();
    }

    /* renamed from: g */
    public void mo114562g(C84712a.C84713a aVar, C32224a<C13598b0> aVar2) {
        C87412m.m108594g(aVar, "task");
        C87412m.m108594g(aVar2, "onEnd");
        if (aVar instanceof C87510a) {
            Log.m105924i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", "runTask CheckCmdAndSubmitTask");
            ((C87510a) aVar).f253514e = aVar2;
            ((C119157j) C119157j.f356862d).mo183884o((Runnable) aVar);
        } else if (aVar instanceof C87511b) {
            StringBuilder sb = new StringBuilder();
            sb.append("runTask RunCmdTask(");
            C87511b bVar = (C87511b) aVar;
            sb.append(bVar.f253515d);
            sb.append(')');
            Log.m105924i("MicroMsg.AppBrand.GetCodeRetryQueueNewImpl", sb.toString());
            bVar.f253517f = aVar2;
            ((C119157j) C119157j.f356862d).mo183884o((Runnable) aVar);
        }
    }

    /* renamed from: t */
    public void mo121961t() {
        this.f247102e.clear();
        f253512h.clear();
        C87502p._INSTANCE.mo121961t();
    }
}
