package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.MMTrimMemoryEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kj2.C117407d;
import kotlin.Metadata;
import kotlin.Result;
import q73.C35796c0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s73.C48255c;
import sx0.C48489d;
import t73.C48555a;
import t73.C48558d;
import t73.C48568l;
import t73.C48571o;
import wx3.C15601d;
import wx3.C66218h;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest */
public final class WebPrefetcherManifest {

    /* renamed from: a */
    public static final WebPrefetcherManifest f109312a = new WebPrefetcherManifest();

    /* renamed from: b */
    public static final C13601g f109313b = C36568h.m40985a(C2127c.f12093d);

    /* renamed from: c */
    public static final ReentrantLock f109314c;

    /* renamed from: d */
    public static final Condition f109315d;

    /* renamed from: e */
    public static C40692a f109316e;

    /* renamed from: f */
    public static MMTrimMemoryEventListener f109317f;

    /* renamed from: g */
    public static C114668z.C104589a f109318g;

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$b */
    public static final class C2126b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C15601d<Boolean> f12092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2126b(C15601d<? super Boolean> dVar) {
            super(1);
            this.f12092d = dVar;
        }

        public Object invoke(Object obj) {
            this.f12092d.resumeWith(Result.m168114constructorimpl(Boolean.valueOf(((Boolean) obj).booleanValue())));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$c */
    public static final class C2127c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C2127c f12093d = new C2127c();

        public C2127c() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_prefetcher_enable_prefetch_without_manifest_js, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/WebPrefetcherManifest$MMTrimMemoryEventListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/MMTrimMemoryEvent;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$MMTrimMemoryEventListener */
    public static final class MMTrimMemoryEventListener extends IListener<MMTrimMemoryEvent> {
        public MMTrimMemoryEventListener() {
            super(C40008f.f107254d);
        }

        public boolean callback(IEvent iEvent) {
            C87412m.m108594g((MMTrimMemoryEvent) iEvent, "event");
            Log.m105924i("MicroMsg.WebPrefetcherManifest", "MMTrimMemoryEvent callback received");
            WebPrefetcherManifest.f109312a.mo63597i();
            C117407d.INSTANCE.mo182089r(1454, 131, 1);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$a */
    public static final class C40692a extends C48558d {
        public C40692a() {
            C35796c0.f95588a.mo60413o();
            mo73174N1(new C40698a());
            mo73174N1(new C40781y());
            mo73174N1(new C48489d());
        }

        /* renamed from: P1 */
        public void mo63600P1(String str) {
            C87412m.m108594g(str, "domain");
            C40714i.m43952a(str);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest", mo125469f = "WebPrefetcherManifest.kt", mo125470l = {152}, mo125471m = "getAllCaches")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$d */
    public static final class C40693d extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f109319d;

        /* renamed from: e */
        public final /* synthetic */ WebPrefetcherManifest f109320e;

        /* renamed from: f */
        public int f109321f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40693d(WebPrefetcherManifest webPrefetcherManifest, C15601d<? super C40693d> dVar) {
            super(dVar);
            this.f109320e = webPrefetcherManifest;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109319d = obj;
            this.f109321f |= Integer.MIN_VALUE;
            return this.f109320e.mo63591c((C48555a) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest", mo125469f = "WebPrefetcherManifest.kt", mo125470l = {137}, mo125471m = "getFetchPkgType")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$e */
    public static final class C40694e extends C66704d {

        /* renamed from: d */
        public Object f109322d;

        /* renamed from: e */
        public /* synthetic */ Object f109323e;

        /* renamed from: f */
        public final /* synthetic */ WebPrefetcherManifest f109324f;

        /* renamed from: g */
        public int f109325g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40694e(WebPrefetcherManifest webPrefetcherManifest, C15601d<? super C40694e> dVar) {
            super(dVar);
            this.f109324f = webPrefetcherManifest;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109323e = obj;
            this.f109325g |= Integer.MIN_VALUE;
            return this.f109324f.mo63592d((C48555a) null, (String) null, this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$f */
    public static final class C40695f extends C87413o implements C32226l<String, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f109326d;

        /* renamed from: e */
        public final /* synthetic */ String f109327e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f109328f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40695f(C8479f0<String> f0Var, String str, C8477a0 a0Var) {
            super(1);
            this.f109326d = f0Var;
            this.f109327e = str;
            this.f109328f = a0Var;
        }

        public Object invoke(Object obj) {
            boolean z;
            String str = (String) obj;
            ReentrantLock reentrantLock = WebPrefetcherManifest.f109314c;
            C8479f0<String> f0Var = this.f109326d;
            String str2 = this.f109327e;
            C8477a0 a0Var = this.f109328f;
            reentrantLock.lock();
            if (str != null) {
                try {
                    if (str.length() != 0) {
                        z = false;
                        if (!z && !C87412m.m108589b(str, "null") && !C87412m.m108589b(str, "undefined")) {
                            f0Var.f27484d = "_manifest_" + C40714i.m43961j(str2) + '_' + str;
                        }
                        WebPrefetcherManifest.f109315d.signalAll();
                        a0Var.f27482d = false;
                        C13598b0 b0Var = C13598b0.f38549a;
                        reentrantLock.unlock();
                        return C13598b0.f38549a;
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            z = true;
            f0Var.f27484d = "_manifest_" + C40714i.m43961j(str2) + '_' + str;
            WebPrefetcherManifest.f109315d.signalAll();
            a0Var.f27482d = false;
            C13598b0 b0Var2 = C13598b0.f38549a;
            reentrantLock.unlock();
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest", mo125469f = "WebPrefetcherManifest.kt", mo125470l = {125}, mo125471m = "shouldFetchContent")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$g */
    public static final class C40696g extends C66704d {

        /* renamed from: d */
        public Object f109329d;

        /* renamed from: e */
        public /* synthetic */ Object f109330e;

        /* renamed from: f */
        public final /* synthetic */ WebPrefetcherManifest f109331f;

        /* renamed from: g */
        public int f109332g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40696g(WebPrefetcherManifest webPrefetcherManifest, C15601d<? super C40696g> dVar) {
            super(dVar);
            this.f109331f = webPrefetcherManifest;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109330e = obj;
            this.f109332g |= Integer.MIN_VALUE;
            return this.f109331f.mo63598j((C48555a) null, (String) null, this);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest", mo125469f = "WebPrefetcherManifest.kt", mo125470l = {114}, mo125471m = "shouldPrefetch")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$h */
    public static final class C40697h extends C66704d {

        /* renamed from: d */
        public Object f109333d;

        /* renamed from: e */
        public /* synthetic */ Object f109334e;

        /* renamed from: f */
        public final /* synthetic */ WebPrefetcherManifest f109335f;

        /* renamed from: g */
        public int f109336g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40697h(WebPrefetcherManifest webPrefetcherManifest, C15601d<? super C40697h> dVar) {
            super(dVar);
            this.f109335f = webPrefetcherManifest;
        }

        public final Object invokeSuspend(Object obj) {
            this.f109334e = obj;
            this.f109336g |= Integer.MIN_VALUE;
            return this.f109335f.mo63599k((C48555a) null, (String) null, this);
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f109314c = reentrantLock;
        f109315d = reentrantLock.newCondition();
    }

    /* renamed from: a */
    public final Object mo63589a(int i, String str, C15601d<? super Boolean> dVar) {
        boolean z;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        C48558d f = f109312a.mo63594f();
        C2126b bVar = new C2126b(hVar);
        C87412m.m108594g(str, "url");
        Iterator<C48571o> it = f.f129909C.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo73123a(i, str, bVar)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            Result.Companion companion = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }
        return hVar.mo90314b();
    }

    /* renamed from: b */
    public final boolean mo63590b() {
        return ((Boolean) ((C36570n) f109313b).getValue()).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r3 == null) goto L_0x006b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d A[LOOP:0: B:31:0x007b->B:32:0x007d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo63591c(t73.C48555a r7, wx3.C15601d<? super java.util.List<java.lang.String>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40693d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$d r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40693d) r0
            int r1 = r0.f109321f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f109321f = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$d r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$d
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f109319d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f109321f
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r5) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x005d
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.rt1 r8 = r7.f129888b
            java.lang.String r8 = r8.f141127e
            if (r8 == 0) goto L_0x0043
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            r8 = 0
            goto L_0x0044
        L_0x0043:
            r8 = 1
        L_0x0044:
            if (r8 == 0) goto L_0x004c
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto L_0x0088
        L_0x004c:
            t73.d r8 = r6.mo63594f()
            r0.f109321f = r5
            t73.d$b r2 = t73.C48558d.f129896H
            java.lang.String r2 = "getAllCaches"
            java.lang.Object r8 = r8.mo73177R1(r7, r2, r3, r0)
            if (r8 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x006b
            boolean r7 = z04.C112551y.m153811k(r8)
            r7 = r7 ^ r5
            if (r7 == 0) goto L_0x0069
            r3 = r8
        L_0x0069:
            if (r3 != 0) goto L_0x006d
        L_0x006b:
            java.lang.String r3 = "[]"
        L_0x006d:
            c30.e r7 = new c30.e
            r7.<init>((java.lang.String) r3)
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            int r0 = r7.length()
        L_0x007b:
            if (r4 >= r0) goto L_0x0087
            java.lang.String r1 = r7.getString(r4)
            r8.add(r1)
            int r4 = r4 + 1
            goto L_0x007b
        L_0x0087:
            r7 = r8
        L_0x0088:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63591c(t73.a, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo63592d(t73.C48555a r6, java.lang.String r7, wx3.C15601d<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40694e
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$e r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40694e) r0
            int r1 = r0.f109325g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f109325g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$e r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$e
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f109323e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f109325g
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r0.f109322d
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x006e
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.rt1 r8 = r6.f129888b
            java.lang.String r8 = r8.f141127e
            r2 = 0
            if (r8 == 0) goto L_0x0047
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r8 = 0
            goto L_0x0048
        L_0x0047:
            r8 = 1
        L_0x0048:
            if (r8 == 0) goto L_0x0050
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            return r6
        L_0x0050:
            t73.d r8 = r5.mo63594f()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r2] = r7
            java.lang.String r2 = r6.f129889c
            r4[r3] = r2
            java.util.List r2 = sx3.C64197v.m75537f(r4)
            r0.f109322d = r7
            r0.f109325g = r3
            java.lang.String r4 = "getFetchPkgType"
            java.lang.Object r8 = r8.mo73177R1(r6, r4, r2, r0)
            if (r8 != r1) goto L_0x006e
            return r1
        L_0x006e:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "getFetchPkgType: '"
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = "', "
            r6.append(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.WebPrefetcherManifest"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            int r6 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r8)
            if (r6 == 0) goto L_0x009a
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r6)
            return r7
        L_0x009a:
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63592d(t73.a, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e7 A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00e8 A[Catch:{ all -> 0x0114 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo63593e(java.lang.String r12, t73.C48555a r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r12, r0)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = "manifest"
            gy3.C87412m.m108594g(r13, r0)     // Catch:{ all -> 0x0119 }
            te3.rt1 r0 = r13.f129888b     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.f141127e     // Catch:{ all -> 0x0119 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001d
            int r0 = r0.length()     // Catch:{ all -> 0x0119 }
            if (r0 != 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = 0
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 != 0) goto L_0x005a
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a     // Catch:{ all -> 0x0119 }
            r0.getClass()     // Catch:{ all -> 0x0119 }
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109364b     // Catch:{ all -> 0x0119 }
            te3.rt1 r4 = r13.f129888b     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r4.f141127e     // Catch:{ all -> 0x0119 }
            java.lang.String r5 = "manifest.manifest.ManifestUrl"
            gy3.C87412m.m108593f(r4, r5)     // Catch:{ all -> 0x0119 }
            boolean r4 = r3.containsKey(r4)     // Catch:{ all -> 0x0119 }
            if (r4 == 0) goto L_0x005a
            r0.getClass()     // Catch:{ all -> 0x0119 }
            te3.rt1 r0 = r13.f129888b     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r0.f141127e     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = "manifest.manifest.ManifestUrl"
            gy3.C87412m.m108593f(r0, r4)     // Catch:{ all -> 0x0119 }
            boolean r0 = r3.decodeBool(r0, r2)     // Catch:{ all -> 0x0119 }
            if (r0 != 0) goto L_0x005a
            java.lang.String r12 = "MicroMsg.WebPrefetcherManifest"
            java.lang.String r0 = "getId manifest not have getId and ignore %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0119 }
            te3.rt1 r13 = r13.f129888b     // Catch:{ all -> 0x0119 }
            java.lang.String r13 = r13.f141127e     // Catch:{ all -> 0x0119 }
            r2[r1] = r13     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r12, r0, r2)     // Catch:{ all -> 0x0119 }
            r12 = 0
            monitor-exit(r11)
            return r12
        L_0x005a:
            gy3.f0 r0 = new gy3.f0     // Catch:{ all -> 0x0119 }
            r0.<init>()     // Catch:{ all -> 0x0119 }
            gy3.a0 r3 = new gy3.a0     // Catch:{ all -> 0x0119 }
            r3.<init>()     // Catch:{ all -> 0x0119 }
            r3.f27482d = r2     // Catch:{ all -> 0x0119 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0119 }
            java.util.concurrent.locks.ReentrantLock r6 = f109314c     // Catch:{ all -> 0x0119 }
            r6.lock()     // Catch:{ all -> 0x0119 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r7 = f109312a     // Catch:{ all -> 0x0114 }
            t73.d r7 = r7.mo63594f()     // Catch:{ all -> 0x0114 }
            java.lang.String r8 = "getId"
            java.util.List r9 = sx3.C26236u.m33719b(r12)     // Catch:{ all -> 0x0114 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$f r10 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$f     // Catch:{ all -> 0x0114 }
            r10.<init>(r0, r12, r3)     // Catch:{ all -> 0x0114 }
            r7.mo73178S1(r13, r8, r9, r10)     // Catch:{ all -> 0x0114 }
            java.util.concurrent.locks.Condition r7 = f109315d     // Catch:{ all -> 0x0114 }
            r8 = 100
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0114 }
            r7.await(r8, r10)     // Catch:{ all -> 0x0114 }
            r6.unlock()     // Catch:{ all -> 0x0119 }
            T r6 = r0.f27484d     // Catch:{ all -> 0x0119 }
            if (r6 == 0) goto L_0x00cc
            java.lang.String r6 = "MicroMsg.WebPrefetcherManifest"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r7.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r8 = "manifest getId:"
            r7.append(r8)     // Catch:{ all -> 0x0119 }
            T r8 = r0.f27484d     // Catch:{ all -> 0x0119 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0119 }
            r7.append(r8)     // Catch:{ all -> 0x0119 }
            java.lang.String r8 = " cost: "
            r7.append(r8)     // Catch:{ all -> 0x0119 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0119 }
            long r8 = r8 - r4
            r7.append(r8)     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = ", timeout: "
            r7.append(r4)     // Catch:{ all -> 0x0119 }
            boolean r4 = r3.f27482d     // Catch:{ all -> 0x0119 }
            r7.append(r4)     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = ", result "
            r7.append(r4)     // Catch:{ all -> 0x0119 }
            r7.append(r12)     // Catch:{ all -> 0x0119 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r4)     // Catch:{ all -> 0x0119 }
        L_0x00cc:
            te3.rt1 r13 = r13.f129888b     // Catch:{ all -> 0x0119 }
            java.lang.String r13 = r13.f141127e     // Catch:{ all -> 0x0119 }
            if (r13 == 0) goto L_0x00ec
            boolean r3 = r3.f27482d     // Catch:{ all -> 0x0119 }
            if (r3 != 0) goto L_0x00ec
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a     // Catch:{ all -> 0x0119 }
            r3.getClass()     // Catch:{ all -> 0x0119 }
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109364b     // Catch:{ all -> 0x0119 }
            java.lang.Object r3 = r3.getSlotForWrite()     // Catch:{ all -> 0x0119 }
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r3     // Catch:{ all -> 0x0119 }
            T r4 = r0.f27484d     // Catch:{ all -> 0x0119 }
            if (r4 == 0) goto L_0x00e8
            goto L_0x00e9
        L_0x00e8:
            r2 = 0
        L_0x00e9:
            r3.encode((java.lang.String) r13, (boolean) r2)     // Catch:{ all -> 0x0119 }
        L_0x00ec:
            T r13 = r0.f27484d     // Catch:{ all -> 0x0119 }
            if (r13 != 0) goto L_0x010e
            java.lang.String r13 = "https://view.inews.qq.com/"
            boolean r13 = z04.C112551y.m153819s(r12, r13, r1)     // Catch:{ all -> 0x0119 }
            if (r13 == 0) goto L_0x010e
            java.lang.String r13 = "MicroMsg.WebPrefetcherManifest"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0119 }
            r1.<init>()     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "getId fail:"
            r1.append(r2)     // Catch:{ all -> 0x0119 }
            r1.append(r12)     // Catch:{ all -> 0x0119 }
            java.lang.String r12 = r1.toString()     // Catch:{ all -> 0x0119 }
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r12)     // Catch:{ all -> 0x0119 }
        L_0x010e:
            T r12 = r0.f27484d     // Catch:{ all -> 0x0119 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0119 }
            monitor-exit(r11)
            return r12
        L_0x0114:
            r12 = move-exception
            r6.unlock()     // Catch:{ all -> 0x0119 }
            throw r12     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63593e(java.lang.String, t73.a):java.lang.String");
    }

    /* renamed from: f */
    public final synchronized C48558d mo63594f() {
        C40692a aVar;
        if (f109316e == null) {
            C40692a aVar2 = new C40692a();
            f109316e = aVar2;
            Log.m105925i("MicroMsg.WebPrefetcherManifest", "createEngine %s", Integer.valueOf(aVar2.hashCode()));
        }
        if (f109317f == null) {
            C48255c.C36632b bVar = C48255c.f129277x;
            if (((Boolean) ((C36570n) C48255c.f129278y).getValue()).booleanValue()) {
                MMTrimMemoryEventListener mMTrimMemoryEventListener = new MMTrimMemoryEventListener();
                mMTrimMemoryEventListener.alive();
                f109317f = mMTrimMemoryEventListener;
            }
        }
        if (f109318g == null) {
            C48558d.C48560b bVar2 = C48558d.f129896H;
            if (((Boolean) ((C36570n) C48558d.f129900L).getValue()).booleanValue()) {
                C40787y0 y0Var = new C40787y0();
                y0Var.alive();
                f109318g = y0Var;
            }
        }
        aVar = f109316e;
        C87412m.m108591d(aVar);
        return aVar;
    }

    /* renamed from: g */
    public final void mo63595g(C48555a aVar, String str, List<? extends Object> list, C32226l<? super String, C13598b0> lVar) {
        C87412m.m108594g(aVar, "manifest");
        C87412m.m108594g(str, "func");
        C87412m.m108594g(list, "params");
        C87412m.m108594g(lVar, "onCallback");
        mo63594f().mo73178S1(aVar, str, list, lVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: pe3.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t73.C48555a mo63596h(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r20
            java.lang.String r0 = "url"
            gy3.C87412m.m108594g(r1, r0)
            t73.d$b r0 = t73.C48558d.f129896H
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
            r2.getClass()
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109364b
            java.lang.String r3 = "settingManager"
            gy3.C87412m.m108594g(r2, r3)
            android.net.Uri r3 = android.net.Uri.parse(r20)
            java.lang.String r4 = r3.getHost()
            t73.a r0 = r0.mo73181c(r4)
            java.lang.String r4 = "MicroMsg.WebPrefetcherJsEngine"
            if (r0 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "matchDebug:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            goto L_0x0142
        L_0x003d:
            java.lang.String r0 = r3.getHost()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r5 = t73.C48572p.m53970a(r0)
            java.lang.Object r0 = r2.findSlot(r5)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r0
            r2 = 0
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0082
            boolean r8 = r0.containsKey(r5)
            if (r8 == 0) goto L_0x0082
            byte[] r0 = r0.decodeBytes(r5)
            if (r0 == 0) goto L_0x0082
            int r8 = r0.length
            if (r8 != 0) goto L_0x0065
            r8 = 1
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            r8 = r8 ^ r7
            if (r8 == 0) goto L_0x0082
            java.lang.Class<te3.qt1> r8 = te3.C51011qt1.class
            java.lang.Object r8 = r8.newInstance()     // Catch:{ Exception -> 0x0078 }
            r9 = r8
            pe3.a r9 = (pe3.C47465a) r9     // Catch:{ Exception -> 0x0078 }
            r9.parseFrom(r0)     // Catch:{ Exception -> 0x0078 }
            pe3.a r8 = (pe3.C47465a) r8     // Catch:{ Exception -> 0x0078 }
            goto L_0x0083
        L_0x0078:
            r0 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[r6]
            java.lang.String r9 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r10 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r8)
        L_0x0082:
            r8 = r2
        L_0x0083:
            r10 = r8
            te3.qt1 r10 = (te3.C51011qt1) r10
            java.lang.String r0 = ", "
            if (r10 == 0) goto L_0x0125
            java.util.LinkedList<te3.rt1> r8 = r10.f140539f
            java.lang.String r9 = "ResInfos"
            gy3.C87412m.m108593f(r8, r9)
            java.util.Iterator r8 = r8.iterator()
        L_0x0095:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0125
            java.lang.Object r9 = r8.next()
            r11 = r9
            te3.rt1 r11 = (te3.C51154rt1) r11
            java.lang.String r9 = r3.getPath()
            if (r9 == 0) goto L_0x00b9
            java.lang.String r12 = r11.f141126d
            java.lang.String r13 = "res.Path"
            gy3.C87412m.m108593f(r12, r13)
            r13 = 2
            boolean r9 = p225rc.C12969d.m12409c(r9, r12, r6, r13, r2)
            if (r9 != r7) goto L_0x00b9
            r9 = 1
            goto L_0x00ba
        L_0x00b9:
            r9 = 0
        L_0x00ba:
            if (r9 == 0) goto L_0x0095
            t73.b r9 = t73.C48558d.f129903P
            java.lang.String r12 = r11.f141127e
            java.lang.String r13 = "res.ManifestUrl"
            gy3.C87412m.m108593f(r12, r13)
            java.lang.String r12 = t73.C48572p.m53970a(r12)
            com.tencent.mm.vfs.m1 r9 = r9.mo73172B(r12)
            boolean r9 = r9.mo119967g()
            if (r9 == 0) goto L_0x0107
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "match:#"
            r2.append(r3)
            r2.append(r5)
            r2.append(r0)
            java.lang.String r3 = r11.f141126d
            r2.append(r3)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r0)
            t73.a r0 = new t73.a
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 124(0x7c, float:1.74E-43)
            r18 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0142
        L_0x0107:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r12 = "manifest lost:#"
            r9.append(r12)
            r9.append(r5)
            r9.append(r0)
            java.lang.String r11 = r11.f141126d
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r9)
            goto L_0x0095
        L_0x0125:
            t73.d$b r3 = t73.C48558d.f129896H
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "not match:#"
            r3.append(r6)
            r3.append(r5)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r4, r0)
            r0 = r2
        L_0x0142:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63596h(java.lang.String):t73.a");
    }

    /* renamed from: i */
    public final synchronized void mo63597i() {
        C40692a aVar = f109316e;
        if (aVar != null) {
            C117407d.INSTANCE.mo182089r(1454, 135, 1);
            ((C119157j) C119157j.f356862d).mo183878i(new C48568l(aVar), 3000);
            aVar.destroy();
            C114668z.C104589a aVar2 = aVar.f129912F;
            if (aVar2 != null) {
                aVar2.dead();
            }
        }
        f109316e = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo63598j(t73.C48555a r6, java.lang.String r7, wx3.C15601d<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40696g
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$g r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40696g) r0
            int r1 = r0.f109332g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f109332g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$g r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$g
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f109330e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f109332g
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r0.f109329d
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0078
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.rt1 r8 = r6.f129888b
            java.lang.String r8 = r8.f141127e
            r2 = 0
            if (r8 == 0) goto L_0x0047
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r8 = 0
            goto L_0x0048
        L_0x0047:
            r8 = 1
        L_0x0048:
            if (r8 == 0) goto L_0x0059
            rx3.g r6 = f109313b
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L_0x00a1
        L_0x0059:
            t73.d r8 = r5.mo63594f()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r2] = r7
            java.lang.String r2 = r6.f129889c
            r4[r3] = r2
            java.util.List r2 = sx3.C64197v.m75537f(r4)
            r0.f109329d = r7
            r0.f109332g = r3
            java.lang.String r3 = "shouldFetchContent"
            java.lang.Object r8 = r8.mo73177R1(r6, r3, r2, r0)
            if (r8 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "shouldFetchContent: '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "', "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "MicroMsg.WebPrefetcherManifest"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            java.lang.String r6 = "true"
            boolean r6 = gy3.C87412m.m108589b(r8, r6)
        L_0x00a1:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63598j(t73.a, java.lang.String, wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo63599k(t73.C48555a r6, java.lang.String r7, wx3.C15601d<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40697h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$h r0 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.C40697h) r0
            int r1 = r0.f109336g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f109336g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$h r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest$h
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f109334e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f109336g
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            java.lang.Object r6 = r0.f109333d
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0077
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r8)
            te3.rt1 r8 = r6.f129888b
            java.lang.String r8 = r8.f141127e
            r2 = 0
            if (r8 == 0) goto L_0x0047
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r8 = 0
            goto L_0x0048
        L_0x0047:
            r8 = 1
        L_0x0048:
            if (r8 == 0) goto L_0x0059
            rx3.g r6 = f109313b
            rx3.n r6 = (rx3.C36570n) r6
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L_0x00a0
        L_0x0059:
            t73.d r8 = r5.mo63594f()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r2] = r7
            java.lang.String r2 = r6.f129889c
            r4[r3] = r2
            java.util.List r2 = sx3.C64197v.m75537f(r4)
            r0.f109333d = r7
            r0.f109336g = r3
            java.lang.String r3 = "fetch"
            java.lang.Object r8 = r8.mo73177R1(r6, r3, r2, r0)
            if (r8 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r6 = r8
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "shouldPrefetch: '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "', "
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "MicroMsg.WebPrefetcherManifest"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r7, r6)
            java.lang.String r6 = "true"
            boolean r6 = gy3.C87412m.m108589b(r8, r6)
        L_0x00a0:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.mo63599k(t73.a, java.lang.String, wx3.d):java.lang.Object");
    }
}
