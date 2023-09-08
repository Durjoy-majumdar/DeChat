package com.tencent.p014mm.plugin.flutter.base;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53959v2;
import a14.C53973z1;
import android.os.HandlerThread;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32227p;
import gu1.C107915m;
import gu1.C8457i;
import gu1.C8459n;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.ResultKt;
import p172io.flutter.embedding.engine.FlutterEngine;
import p220pr.C100835h;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines */
public final class CachedFlutterEngines {

    /* renamed from: a */
    public static final CachedFlutterEngines f346097a = new CachedFlutterEngines();

    /* renamed from: b */
    public static final HashMap<String, C105354a> f346098b = new HashMap<>();

    /* renamed from: c */
    public static C53973z1 f346099c;

    /* renamed from: d */
    public static final C0000n0 f346100d = C53930o0.m60561h(C53930o0.m60554a(C53872d1.f151119c), C53959v2.m60598a((C53973z1) null, 1, (Object) null));

    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$a */
    public static final class C105354a {

        /* renamed from: a */
        public final HandlerThread f313152a;

        /* renamed from: b */
        public final MMHandler f313153b;

        public C105354a(HandlerThread handlerThread, MMHandler mMHandler) {
            C87412m.m108594g(handlerThread, "thread");
            C87412m.m108594g(mMHandler, "handler");
            this.f313152a = handlerThread;
            this.f313153b = mMHandler;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C105354a)) {
                return false;
            }
            C105354a aVar = (C105354a) obj;
            return C87412m.m108589b(this.f313152a, aVar.f313152a) && C87412m.m108589b(this.f313153b, aVar.f313153b);
        }

        public int hashCode() {
            return (this.f313152a.hashCode() * 31) + this.f313153b.hashCode();
        }

        public String toString() {
            return "EngineBackgroundThread(thread=" + this.f313152a + ", handler=" + this.f313153b + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$create$2", mo125469f = "CachedFlutterEngines.kt", mo125470l = {159}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$c */
    public static final class C105355c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f313154d;

        public C105355c(C15601d<? super C105355c> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105355c(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C105355c((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f313154d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CachedFlutterEngines cachedFlutterEngines = CachedFlutterEngines.f346097a;
                this.f313154d = 1;
                if (CachedFlutterEngines.m162295a(cachedFlutterEngines, this) == aVar) {
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

    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$d */
    public static final class C105356d implements Executor {

        /* renamed from: d */
        public final /* synthetic */ MMHandler f313155d;

        public C105356d(MMHandler mMHandler) {
            this.f313155d = mMHandler;
        }

        public final void execute(Runnable runnable) {
            Log.printInfoStack("MicroMsg.CachedFlutterEngines", "post background task:" + runnable.hashCode(), new Object[0]);
            this.f313155d.post(runnable);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$warmUpEngine$1", mo125469f = "CachedFlutterEngines.kt", mo125470l = {71}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$f */
    public static final class C105357f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f313156d;

        public C105357f(C15601d<? super C105357f> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105357f(dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            C0000n0 n0Var = (C0000n0) obj;
            return new C105357f((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f313156d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CachedFlutterEngines cachedFlutterEngines = CachedFlutterEngines.f346097a;
                this.f313156d = 1;
                if (CachedFlutterEngines.m162295a(cachedFlutterEngines, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Log.m105924i("MicroMsg.CachedFlutterEngines", "warmUpEngine finished");
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.flutter.base.CachedFlutterEngines", mo125469f = "CachedFlutterEngines.kt", mo125470l = {156, 158}, mo125471m = "create")
    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$b */
    public static final class C115447b extends C66704d {

        /* renamed from: d */
        public Object f346101d;

        /* renamed from: e */
        public Object f346102e;

        /* renamed from: f */
        public Object f346103f;

        /* renamed from: g */
        public Object f346104g;

        /* renamed from: h */
        public Object f346105h;

        /* renamed from: i */
        public boolean f346106i;

        /* renamed from: j */
        public /* synthetic */ Object f346107j;

        /* renamed from: n */
        public final /* synthetic */ CachedFlutterEngines f346108n;

        /* renamed from: o */
        public int f346109o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C115447b(CachedFlutterEngines cachedFlutterEngines, C15601d<? super C115447b> dVar) {
            super(dVar);
            this.f346108n = cachedFlutterEngines;
        }

        public final Object invokeSuspend(Object obj) {
            this.f346107j = obj;
            this.f346109o |= Integer.MIN_VALUE;
            return this.f346108n.mo175365c((String) null, (String) null, (String) null, false, (C32227p<? super FlutterEngine, ? super Map<String, Object>, C13598b0>) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$e */
    public static final class C115448e implements FlutterEngine.EngineLifecycleListener {

        /* renamed from: a */
        public final /* synthetic */ String f346110a;

        public C115448e(String str) {
            this.f346110a = str;
        }

        public void onEngineWillDestroy() {
            CachedFlutterEngines.m162296b(CachedFlutterEngines.f346097a, this.f346110a);
        }

        public void onPreEngineRestart() {
        }
    }

    static {
        new HashMap();
        CachedFlutterEngines$checkWarmupListener$1 cachedFlutterEngines$checkWarmupListener$1 = new CachedFlutterEngines$checkWarmupListener$1(C40008f.f107254d);
        p172io.flutter.Log.setLogLevel(p172io.flutter.Log.VERBOSE);
        p172io.flutter.Log.setLogDelegate(new C8459n());
        cachedFlutterEngines$checkWarmupListener$1.alive();
    }

    /* renamed from: a */
    public static final Object m162295a(CachedFlutterEngines cachedFlutterEngines, C15601d dVar) {
        cachedFlutterEngines.getClass();
        Class cls = C100835h.class;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        if (!((C100835h) C86312j.m106911c(cls)).Ah0()) {
            Log.m105924i("MicroMsg.CachedFlutterEngines", "start to init FlutterLoader");
            ((C100835h) C86312j.m106911c(cls)).f40(true, new C8457i(Util.currentTicks(), hVar));
        } else {
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        Object b = hVar.mo90314b();
        return b == C15911a.COROUTINE_SUSPENDED ? b : C13598b0.f38549a;
    }

    /* renamed from: b */
    public static final void m162296b(CachedFlutterEngines cachedFlutterEngines, String str) {
        C105354a aVar;
        cachedFlutterEngines.getClass();
        HashMap<String, C105354a> hashMap = f346098b;
        if (hashMap.containsKey(str) && (aVar = hashMap.get(str)) != null) {
            if (aVar.f313152a.isAlive()) {
                aVar.f313153b.postDelayed(new C107915m(aVar, str), 1000);
            }
            hashMap.remove(str);
            Log.m105924i("MicroMsg.CachedFlutterEngines", "clear engine remove background executor:" + str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00da A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x02ce  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo175365c(java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, fy3.C32227p<? super p172io.flutter.embedding.engine.FlutterEngine, ? super java.util.Map<java.lang.String, java.lang.Object>, rx3.C13598b0> r23, wx3.C15601d<? super rx3.C13604l<java.lang.String, ? extends p172io.flutter.embedding.engine.FlutterEngine>> r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r24
            java.lang.Class<z51.h> r2 = z51.C119061h.class
            boolean r3 = r1 instanceof com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines.C115447b
            if (r3 == 0) goto L_0x0019
            r3 = r1
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$b r3 = (com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines.C115447b) r3
            int r4 = r3.f346109o
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f346109o = r4
            goto L_0x001e
        L_0x0019:
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$b r3 = new com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$b
            r3.<init>(r0, r1)
        L_0x001e:
            java.lang.Object r1 = r3.f346107j
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f346109o
            r6 = 2
            java.lang.String r7 = "MicroMsg.CachedFlutterEngines"
            r9 = 1
            if (r5 == 0) goto L_0x0070
            if (r5 == r9) goto L_0x0051
            if (r5 != r6) goto L_0x0049
            boolean r4 = r3.f346106i
            java.lang.Object r5 = r3.f346105h
            fy3.p r5 = (fy3.C32227p) r5
            java.lang.Object r6 = r3.f346104g
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r10 = r3.f346103f
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r3.f346102e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r3.f346101d
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines r3 = (com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines) r3
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x00e0
        L_0x0049:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0051:
            boolean r5 = r3.f346106i
            java.lang.Object r10 = r3.f346105h
            fy3.p r10 = (fy3.C32227p) r10
            java.lang.Object r11 = r3.f346104g
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r3.f346103f
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r3.f346102e
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r3.f346101d
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines r14 = (com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines) r14
            kotlin.ResultKt.throwOnFailure(r1)
            r17 = r12
            r12 = r10
            r10 = r17
            goto L_0x00be
        L_0x0070:
            kotlin.ResultKt.throwOnFailure(r1)
            a14.z1 r1 = f346099c
            if (r1 == 0) goto L_0x00ae
            a14.f2 r1 = (a14.C53884f2) r1
            boolean r1 = r1.mo74530c()
            if (r1 != 0) goto L_0x0081
            r1 = 1
            goto L_0x0082
        L_0x0081:
            r1 = 0
        L_0x0082:
            if (r1 == 0) goto L_0x00ae
            java.lang.String r1 = "create engine wait warmUp job finished"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            a14.z1 r1 = f346099c
            if (r1 == 0) goto L_0x00ae
            r3.f346101d = r0
            r5 = r19
            r3.f346102e = r5
            r10 = r20
            r3.f346103f = r10
            r11 = r21
            r3.f346104g = r11
            r12 = r23
            r3.f346105h = r12
            r13 = r22
            r3.f346106i = r13
            r3.f346109o = r9
            a14.f2 r1 = (a14.C53884f2) r1
            java.lang.Object r1 = r1.mo74521O(r3)
            if (r1 != r4) goto L_0x00b8
            return r4
        L_0x00ae:
            r5 = r19
            r10 = r20
            r11 = r21
            r13 = r22
            r12 = r23
        L_0x00b8:
            r14 = r0
            r17 = r13
            r13 = r5
            r5 = r17
        L_0x00be:
            a14.h0 r1 = a14.C53872d1.f151119c
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$c r15 = new com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$c
            r9 = 0
            r15.<init>(r9)
            r3.f346101d = r14
            r3.f346102e = r13
            r3.f346103f = r10
            r3.f346104g = r11
            r3.f346105h = r12
            r3.f346106i = r5
            r3.f346109o = r6
            java.lang.Object r1 = a14.C53895h.m60469g(r1, r15, r3)
            if (r1 != r4) goto L_0x00db
            return r4
        L_0x00db:
            r4 = r5
            r6 = r11
            r5 = r12
            r11 = r13
            r3 = r14
        L_0x00e0:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            float r13 = kg3.C76577a.m92165p(r9)
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r13)
            java.lang.String r13 = "fontScale"
            r12.put(r13, r14)
            float r13 = kg3.C76577a.m92175z(r9)
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r13)
            java.lang.String r13 = "layoutScale"
            r12.put(r13, r14)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            java.lang.String r14 = "language"
            r12.put(r14, r13)
            java.util.UUID r13 = java.util.UUID.randomUUID()
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "sessionId"
            r12.put(r14, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.h r13 = (z51.C119061h) r13
            java.lang.String r14 = ""
            if (r13 != 0) goto L_0x012c
            r13 = r14
            goto L_0x0130
        L_0x012c:
            java.lang.String r13 = r13.G70()
        L_0x0130:
            java.lang.String r15 = "SystemEmojiResPath"
            r12.put(r15, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.h r13 = (z51.C119061h) r13
            if (r13 != 0) goto L_0x013f
            r13 = r14
            goto L_0x0143
        L_0x013f:
            java.lang.String r13 = r13.mo141692gU()
        L_0x0143:
            java.lang.String r15 = "QQSmileyDirPath"
            r12.put(r15, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.h r13 = (z51.C119061h) r13
            if (r13 != 0) goto L_0x0152
            r13 = r14
            goto L_0x0156
        L_0x0152:
            java.lang.String r13 = r13.mo141689MP()
        L_0x0156:
            java.lang.String r15 = "NewSmileyDirPath"
            r12.put(r15, r13)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.h r13 = (z51.C119061h) r13
            if (r13 != 0) goto L_0x0164
            goto L_0x0168
        L_0x0164:
            java.lang.String r14 = r13.mo141693jF()
        L_0x0168:
            java.lang.String r13 = "EmojiPanelConfigPath"
            r12.put(r13, r14)
            di3.d r13 = di3.C86312j.m106911c(r2)
            z51.h r13 = (z51.C119061h) r13
            if (r13 != 0) goto L_0x0177
            r13 = 1
            goto L_0x017b
        L_0x0177:
            boolean r13 = r13.Qe0()
        L_0x017b:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            java.lang.String r14 = "IsEnableInitOnIsolate"
            r12.put(r14, r13)
            di3.d r2 = di3.C86312j.m106911c(r2)
            z51.h r2 = (z51.C119061h) r2
            if (r2 != 0) goto L_0x018e
            r2 = 1
            goto L_0x0192
        L_0x018e:
            boolean r2 = r2.mo141691fJ()
        L_0x0192:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.String r13 = "IsEnableSupportEmoji"
            r12.put(r13, r2)
            long r13 = java.lang.System.currentTimeMillis()
            io.flutter.embedding.engine.FlutterEngine r2 = new io.flutter.embedding.engine.FlutterEngine
            android.content.Context r15 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Class<pr.g> r16 = p220pr.C110245g.class
            di3.d r16 = di3.C86312j.m106911c(r16)
            pr.g r16 = (p220pr.C110245g) r16
            java.lang.String[] r8 = r16.mo161652CL()
            r2.<init>((android.content.Context) r15, (java.lang.String[]) r8, (boolean) r4)
            java.lang.String r4 = "System.loadLibrary libdart2cpp.so"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r7, r4)
            java.lang.String r4 = "dart2cpp"
            p206nj.C88957l.m111078n(r4)
            r4 = r7
            long r7 = java.lang.System.currentTimeMillis()
            io.flutter.embedding.engine.plugins.PluginRegistry r15 = r2.getPlugins()
            tf0.d1 r0 = new tf0.d1
            r0.<init>(r13, r7)
            r15.add((p172io.flutter.embedding.engine.plugins.FlutterPlugin) r0)
            gu1.g r0 = gu1.C116990g.f350564a
            io.flutter.embedding.engine.plugins.PluginRegistry r7 = r2.getPlugins()
            java.lang.String r8 = "flutterEngine.plugins"
            gy3.C87412m.m108593f(r7, r8)
            r0.mo180958a(r7)
            if (r5 == 0) goto L_0x01e2
            r5.invoke(r2, r1)
        L_0x01e2:
            io.flutter.embedding.engine.systemchannels.NavigationChannel r0 = r2.getNavigationChannel()
            c30.g r5 = new c30.g
            r5.<init>()
            java.lang.String r7 = "plugin"
            r5.put(r7, r11)     // Catch:{ f -> 0x021b }
            java.lang.String r7 = "entry"
            r5.put(r7, r10)     // Catch:{ f -> 0x021b }
            java.lang.String r7 = "route"
            r5.put(r7, r6)     // Catch:{ f -> 0x021b }
            c30.g r6 = new c30.g     // Catch:{ f -> 0x021b }
            r6.<init>((java.util.Map) r1)     // Catch:{ f -> 0x021b }
            java.lang.String r1 = "params"
            r5.put(r1, r6)     // Catch:{ f -> 0x021b }
            c30.g r1 = new c30.g     // Catch:{ f -> 0x021b }
            r1.<init>((java.util.Map) r12)     // Catch:{ f -> 0x021b }
            java.lang.String r6 = "initParams"
            r5.put(r6, r1)     // Catch:{ f -> 0x021b }
            java.lang.String r1 = "parentPageType"
            r6 = 0
            r5.mo145953n(r1, r6)     // Catch:{ f -> 0x021b }
            java.lang.String r1 = "isInitRoute"
            r6 = 1
            r5.mo145966q(r1, r6)     // Catch:{ f -> 0x021c }
            goto L_0x021c
        L_0x021b:
            r6 = 1
        L_0x021c:
            java.lang.String r1 = r5.toString()
            r0.setInitialRoute(r1)
            io.flutter.embedding.engine.dart.DartExecutor r0 = r2.getDartExecutor()
            io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint r1 = new io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint
            io.flutter.FlutterInjector r5 = p172io.flutter.FlutterInjector.instance()
            io.flutter.embedding.engine.loader.FlutterLoader r5 = r5.flutterLoader()
            java.lang.String r5 = r5.findAppBundlePath()
            r1.<init>(r5, r10)
            r0.executeDartEntrypoint(r1)
            hu1.a r0 = new hu1.a
            r0.<init>(r2)
            r2.addDataReportListener(r0)
            r3.getClass()
        L_0x0246:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "randomUUID().toString()"
            gy3.C87412m.m108593f(r0, r1)
            io.flutter.embedding.engine.FlutterEngineCache r1 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x0246
            io.flutter.embedding.engine.FlutterEngineCache r1 = p172io.flutter.embedding.engine.FlutterEngineCache.getInstance()
            r1.put(r0, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 <= r3) goto L_0x027e
            java.lang.Class<h81.h> r1 = h81.C32735h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            h81.h r1 = (h81.C32735h) r1
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_flutter_enable_surface_background_executor
            r5 = 0
            boolean r1 = r1.mo58784wf(r3, r5)
            if (r1 == 0) goto L_0x027c
            goto L_0x027f
        L_0x027c:
            r1 = 0
            goto L_0x0280
        L_0x027e:
            r5 = 0
        L_0x027f:
            r1 = 1
        L_0x0280:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "FlutterEngineBackgroundExecutor_"
            r3.append(r7)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r7 = 5
            int r8 = eu3.C58834h.f168432b
            android.os.HandlerThread r3 = eu3.C97749e.m126093a(r3, r7)
            r3.start()
            com.tencent.mm.sdk.platformtools.MMHandler r7 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r8 = r3.getLooper()
            r7.<init>((android.os.Looper) r8)
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$d r8 = new com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$d
            r8.<init>(r7)
            r2.setBackgroundExecutor(r8, r1)
            java.util.HashMap<java.lang.String, com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$a> r1 = f346098b
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$a r8 = new com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$a
            r8.<init>(r3, r7)
            r1.put(r0, r8)
            android.content.res.Resources r1 = r9.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            r3 = 32
            if (r1 != r3) goto L_0x02c8
            r8 = 1
            goto L_0x02c9
        L_0x02c8:
            r8 = 0
        L_0x02c9:
            if (r8 == 0) goto L_0x02ce
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r1 = p172io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.dark
            goto L_0x02d0
        L_0x02ce:
            io.flutter.embedding.engine.systemchannels.SettingsChannel$PlatformBrightness r1 = p172io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness.light
        L_0x02d0:
            io.flutter.embedding.engine.systemchannels.SettingsChannel r3 = r2.getSettingsChannel()
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r3 = r3.startMessage()
            android.content.res.Resources r5 = r9.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            float r5 = r5.fontScale
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r3 = r3.setTextScaleFactor(r5)
            boolean r5 = android.text.format.DateFormat.is24HourFormat(r9)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r3 = r3.setUse24HourFormat(r5)
            io.flutter.embedding.engine.systemchannels.SettingsChannel$MessageBuilder r1 = r3.setPlatformBrightness(r1)
            r1.send()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "preload: pluginName="
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = ", vmEntry="
            r1.append(r3)
            r1.append(r10)
            java.lang.String r3 = ", engineId="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$e r1 = new com.tencent.mm.plugin.flutter.base.CachedFlutterEngines$e
            r1.<init>(r0)
            r2.addEngineLifecycleListener(r1)
            rx3.l r1 = new rx3.l
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.flutter.base.CachedFlutterEngines.mo175365c(java.lang.String, java.lang.String, java.lang.String, boolean, fy3.p, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final synchronized C53973z1 mo175366d() {
        C53973z1 z1Var;
        Log.m105924i("MicroMsg.CachedFlutterEngines", "warmUpEngine");
        if (f346099c == null) {
            f346099c = C53895h.m60466d(f346100d, (C66212f) null, (C53934p0) null, new C105357f((C15601d<? super C105357f>) null), 3, (Object) null);
        }
        z1Var = f346099c;
        C87412m.m108591d(z1Var);
        return z1Var;
    }
}
