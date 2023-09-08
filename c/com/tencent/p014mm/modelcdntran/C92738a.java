package com.tencent.p014mm.modelcdntran;

import a14.C0000n0;
import a14.C53934p0;
import a14.C53973z1;
import android.content.Context;
import c14.C54624g;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.modelcdntran.C92798v;
import com.tencent.p014mm.sdk.coroutines.LifecycleScope;
import com.tencent.p014mm.sdk.observer.IMvvmObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import d14.C58017a1;
import d14.C58085t0;
import d14.C58090v0;
import d14.C58097y0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C24565l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i40.C98597b;
import i40.C98598e;
import java.util.concurrent.ConcurrentHashMap;
import k14.C60949f;
import k14.C99088c;
import kotlin.ResultKt;
import p1081gi.C98124g;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: com.tencent.mm.modelcdntran.a */
public class C92738a extends C98597b {

    /* renamed from: f */
    public final C13601g f266931f;

    /* renamed from: g */
    public final C99088c f266932g = C60949f.m71437a(false, 1, (Object) null);

    /* renamed from: h */
    public ConcurrentHashMap<String, C92739a> f266933h;

    /* renamed from: i */
    public ConcurrentHashMap<String, C92739a> f266934i;

    /* renamed from: com.tencent.mm.modelcdntran.a$a */
    public final class C92739a {

        /* renamed from: a */
        public final C98124g f266935a;

        /* renamed from: b */
        public final C58085t0<C92798v> f266936b;

        public C92739a(C92738a aVar, C98124g gVar, C58085t0<C92798v> t0Var) {
            C87412m.m108594g(gVar, "task");
            C87412m.m108594g(t0Var, "mutableSharedFlow");
            this.f266935a = gVar;
            this.f266936b = t0Var;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$cancelDownloadTask$1", mo125469f = "CdnFSC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelcdntran.a$b */
    public static final class C92740b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f266937d;

        /* renamed from: e */
        public final /* synthetic */ C92738a f266938e;

        /* renamed from: f */
        public final /* synthetic */ C58085t0<C92798v> f266939f;

        /* renamed from: g */
        public final /* synthetic */ String f266940g;

        /* renamed from: com.tencent.mm.modelcdntran.a$b$a */
        public /* synthetic */ class C92741a extends C24565l implements C32227p<String, C92739a, Integer> {
            public C92741a(Object obj) {
                super(2, obj, C92738a.class, "doCancel", "doCancel(Ljava/lang/String;Lcom/tencent/mm/modelcdntran/CdnFSC$RunningObj;)I", 0);
            }

            public Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                C92739a aVar = (C92739a) obj2;
                C87412m.m108594g(str, "p0");
                C87412m.m108594g(aVar, "p1");
                ((C92738a) this.receiver).mo126972j3(str, aVar);
                return 0;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92740b(C92738a aVar, C58085t0<C92798v> t0Var, String str, C15601d<? super C92740b> dVar) {
            super(2, dVar);
            this.f266938e = aVar;
            this.f266939f = t0Var;
            this.f266940g = str;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C92740b bVar = new C92740b(this.f266938e, this.f266939f, this.f266940g, dVar);
            bVar.f266937d = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92740b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f266937d;
            C92738a aVar = this.f266938e;
            ConcurrentHashMap<String, C92739a> concurrentHashMap = aVar.f266933h;
            int i = -1;
            if (concurrentHashMap != null) {
                String str = this.f266940g;
                C92741a aVar2 = new C92741a(aVar);
                C92739a remove = concurrentHashMap.remove(str);
                if (remove != null) {
                    i = ((Number) aVar2.invoke(str, remove)).intValue();
                }
            }
            C92738a aVar3 = this.f266938e;
            C58085t0<C92798v> t0Var = this.f266939f;
            C92798v vVar = new C92798v(C92798v.C92799a.OnDownloadCancel, this.f266940g);
            vVar.f267132c = i;
            C13598b0 b0Var = C13598b0.f38549a;
            aVar3.mo126973k3(t0Var, vVar);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$emitInner$1", mo125469f = "CdnFSC.kt", mo125470l = {324}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelcdntran.a$c */
    public static final class C92742c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f266941d;

        /* renamed from: e */
        public final /* synthetic */ C58085t0<C92798v> f266942e;

        /* renamed from: f */
        public final /* synthetic */ C92798v f266943f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92742c(C58085t0<C92798v> t0Var, C92798v vVar, C15601d<? super C92742c> dVar) {
            super(2, dVar);
            this.f266942e = t0Var;
            this.f266943f = vVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C92742c(this.f266942e, this.f266943f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92742c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f266941d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C58085t0<C92798v> t0Var = this.f266942e;
                C92798v vVar = this.f266943f;
                this.f266941d = 1;
                if (t0Var.emit(vVar, this) == aVar) {
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

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC", mo125469f = "CdnFSC.kt", mo125470l = {334}, mo125471m = "isTaskDownloading")
    /* renamed from: com.tencent.mm.modelcdntran.a$d */
    public static final class C92743d extends C66704d {

        /* renamed from: d */
        public Object f266944d;

        /* renamed from: e */
        public Object f266945e;

        /* renamed from: f */
        public Object f266946f;

        /* renamed from: g */
        public /* synthetic */ Object f266947g;

        /* renamed from: h */
        public final /* synthetic */ C92738a f266948h;

        /* renamed from: i */
        public int f266949i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92743d(C92738a aVar, C15601d<? super C92743d> dVar) {
            super(dVar);
            this.f266948h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f266947g = obj;
            this.f266949i |= Integer.MIN_VALUE;
            return this.f266948h.mo126975m3((String) null, this);
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.a$e */
    public static final class C92744e<E> implements IMvvmObserver {

        /* renamed from: d */
        public final /* synthetic */ C92738a f266950d;

        public C92744e(C92738a aVar) {
            this.f266950d = aVar;
        }

        public void onChanged(Object obj) {
            C92798v vVar = (C92798v) obj;
            C87412m.m108594g(vVar, "event");
            String str = "event:" + vVar.f267130a + " mediaId:" + vVar.f267131b + " ret:" + vVar.f267132c;
            this.f266950d.getClass();
            C87412m.m108594g(str, "log");
            Log.m105918d("MicroMsg.Cdn.CdnFSC", str);
            LifecycleScope.launchDefault$default(this.f266950d.mo126974l3(), (C53934p0) null, new C92751c(vVar, this.f266950d, (C15601d<? super C92751c>) null), 1, (Object) null);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$startDownloadTask$1", mo125469f = "CdnFSC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelcdntran.a$f */
    public static final class C92745f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f266951d;

        /* renamed from: e */
        public final /* synthetic */ C92738a f266952e;

        /* renamed from: f */
        public final /* synthetic */ C98124g f266953f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<C92798v> f266954g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92745f(C92738a aVar, C98124g gVar, C58085t0<C92798v> t0Var, C15601d<? super C92745f> dVar) {
            super(2, dVar);
            this.f266952e = aVar;
            this.f266953f = gVar;
            this.f266954g = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C92745f fVar = new C92745f(this.f266952e, this.f266953f, this.f266954g, dVar);
            fVar.f266951d = obj;
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92745f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f266951d;
            C92738a aVar = this.f266952e;
            ConcurrentHashMap<String, C92739a> concurrentHashMap = aVar.f266933h;
            if (concurrentHashMap != null) {
                C92738a.m116914g3(aVar, concurrentHashMap, this.f266953f, this.f266954g);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C92738a aVar2 = this.f266952e;
                C58085t0<C92798v> t0Var = this.f266954g;
                C98124g gVar = this.f266953f;
                C92798v.C92799a aVar3 = C92798v.C92799a.OnDownloadStartError;
                C87412m.m108594g(gVar, "taskInfo");
                String str = gVar.field_mediaId;
                if (str == null) {
                    str = "";
                }
                C92798v vVar = new C92798v(aVar3, str);
                vVar.f267133d = gVar;
                vVar.f267132c = -1;
                C13598b0 b0Var2 = C13598b0.f38549a;
                aVar2.mo126973k3(t0Var, vVar);
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.modelcdntran.CdnFSC$startUploadTask$1", mo125469f = "CdnFSC.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.modelcdntran.a$g */
    public static final class C92746g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f266955d;

        /* renamed from: e */
        public final /* synthetic */ C92738a f266956e;

        /* renamed from: f */
        public final /* synthetic */ C98124g f266957f;

        /* renamed from: g */
        public final /* synthetic */ C58085t0<C92798v> f266958g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92746g(C92738a aVar, C98124g gVar, C58085t0<C92798v> t0Var, C15601d<? super C92746g> dVar) {
            super(2, dVar);
            this.f266956e = aVar;
            this.f266957f = gVar;
            this.f266958g = t0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C92746g gVar = new C92746g(this.f266956e, this.f266957f, this.f266958g, dVar);
            gVar.f266955d = obj;
            return gVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C92746g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C13598b0 b0Var;
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f266955d;
            C92738a aVar = this.f266956e;
            ConcurrentHashMap<String, C92739a> concurrentHashMap = aVar.f266934i;
            if (concurrentHashMap != null) {
                C92738a.m116914g3(aVar, concurrentHashMap, this.f266957f, this.f266958g);
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                C92738a aVar2 = this.f266956e;
                C58085t0<C92798v> t0Var = this.f266958g;
                C98124g gVar = this.f266957f;
                C92798v.C92799a aVar3 = C92798v.C92799a.OnUploadStartError;
                C87412m.m108594g(gVar, "taskInfo");
                String str = gVar.field_mediaId;
                if (str == null) {
                    str = "";
                }
                C92798v vVar = new C92798v(aVar3, str);
                vVar.f267133d = gVar;
                vVar.f267132c = -1;
                C13598b0 b0Var2 = C13598b0.f38549a;
                aVar2.mo126973k3(t0Var, vVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.modelcdntran.a$h */
    public static final class C92747h extends C87413o implements C32224a<LifecycleScope> {

        /* renamed from: d */
        public final /* synthetic */ C98598e f266959d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C92747h(C98598e eVar) {
            super(0);
            this.f266959d = eVar;
        }

        public Object invoke() {
            return new LifecycleScope("CdnFSC_SCOPE", this.f266959d, 0, 4, (C8480h) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92738a(C98598e eVar) {
        super(eVar);
        C87412m.m108594g(eVar, "service");
        this.f266931f = C36568h.m40985a(new C92747h(eVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m116914g3(com.tencent.p014mm.modelcdntran.C92738a r11, java.util.concurrent.ConcurrentHashMap r12, p1081gi.C98124g r13, d14.C58085t0 r14) {
        /*
            r11.getClass()
            com.tencent.mm.modelcdntran.v$a r0 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadStartSuccess
            java.lang.String r1 = r13.field_mediaId
            boolean r1 = r12.containsKey(r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x003b
            boolean r12 = r13.f287661e
            if (r12 == 0) goto L_0x0027
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnUploadAlreadyRunning
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            r2 = r1
        L_0x001d:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            r11.mo126973k3(r14, r0)
            goto L_0x017f
        L_0x0027:
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadAlreadyRunning
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            r11.mo126973k3(r14, r0)
            goto L_0x017f
        L_0x003b:
            long r3 = eb0.C31543z5.m39453c()
            r13.field_startTime = r3
            oa1.d r1 = oa1.C117731d.m166007c()
            tf3.s r3 = new tf3.s
            r3.<init>()
            int r1 = r1.mo182440a(r3)
            r3 = 1
            r4 = 0
            if (r1 != r3) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            if (r1 == 0) goto L_0x00a0
            boolean r1 = r13.f287661e
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r13.field_filemd5
            if (r1 == 0) goto L_0x0068
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 0
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            if (r1 != 0) goto L_0x00a0
            int r1 = r13.field_totalLen
            if (r1 <= 0) goto L_0x00a0
            java.lang.String r1 = r13.field_fullpath
            if (r1 == 0) goto L_0x007b
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x007a
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            if (r3 != 0) goto L_0x00a0
            java.lang.Class<xp.b> r1 = p753xp.C102704b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            r5 = r1
            xp.b r5 = (p753xp.C102704b) r5
            java.lang.String r6 = r13.field_filemd5
            java.lang.String r1 = "task.field_filemd5"
            gy3.C87412m.m108593f(r6, r1)
            int r1 = r13.field_totalLen
            long r7 = (long) r1
            java.lang.String r9 = r13.field_fullpath
            java.lang.String r1 = "task.field_fullpath"
            gy3.C87412m.m108593f(r9, r1)
            int r10 = r13.field_fileType
            boolean r1 = r5.Fp0(r6, r7, r9, r10)
            goto L_0x00a1
        L_0x00a0:
            r1 = 0
        L_0x00a1:
            if (r1 == 0) goto L_0x00d1
            com.tencent.mm.modelcdntran.v r12 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x00aa
            r1 = r2
        L_0x00aa:
            r12.<init>(r0, r1)
            r12.f267133d = r13
            r11.mo126973k3(r14, r12)
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadCallbackFindLocal
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r2 = r1
        L_0x00bc:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            gi.d r12 = new gi.d
            r12.<init>()
            r0.f267135f = r12
            r12.field_retCode = r4
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.mo126973k3(r14, r0)
            goto L_0x017f
        L_0x00d1:
            com.tencent.mm.modelcdntran.a$a r1 = new com.tencent.mm.modelcdntran.a$a
            r1.<init>(r11, r13, r14)
            com.tencent.mm.modelcdntran.d r3 = new com.tencent.mm.modelcdntran.d
            r3.<init>(r11)
            gi.g r4 = r1.f266935a
            java.lang.String r4 = r4.field_mediaId
            r12.put(r4, r1)
            java.lang.Object r3 = r3.invoke(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 == 0) goto L_0x00f5
            gi.g r4 = r1.f266935a
            java.lang.String r4 = r4.field_mediaId
            r12.remove(r4)
        L_0x00f5:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r4 = "startJniTask "
            r12.append(r4)
            gi.g r1 = r1.f266935a
            java.lang.String r1 = r1.field_mediaId
            r12.append(r1)
            r1 = 32
            r12.append(r1)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            java.lang.String r1 = "log"
            gy3.C87412m.m108594g(r12, r1)
            java.lang.String r1 = "MicroMsg.Cdn.CdnFSC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r12)
            boolean r12 = r13.f287661e
            if (r12 == 0) goto L_0x0152
            if (r3 != 0) goto L_0x013b
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnUploadStartSuccess
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r2 = r1
        L_0x012e:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            r0.f267132c = r3
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.mo126973k3(r14, r0)
            goto L_0x017f
        L_0x013b:
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnUploadStartError
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r2 = r1
        L_0x0145:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            r0.f267132c = r3
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.mo126973k3(r14, r0)
            goto L_0x017f
        L_0x0152:
            if (r3 != 0) goto L_0x0169
            com.tencent.mm.modelcdntran.v r12 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r2 = r1
        L_0x015c:
            r12.<init>(r0, r2)
            r12.f267133d = r13
            r12.f267132c = r3
            rx3.b0 r13 = rx3.C13598b0.f38549a
            r11.mo126973k3(r14, r12)
            goto L_0x017f
        L_0x0169:
            com.tencent.mm.modelcdntran.v$a r12 = com.tencent.p014mm.modelcdntran.C92798v.C92799a.OnDownloadStartError
            com.tencent.mm.modelcdntran.v r0 = new com.tencent.mm.modelcdntran.v
            java.lang.String r1 = r13.field_mediaId
            if (r1 != 0) goto L_0x0172
            goto L_0x0173
        L_0x0172:
            r2 = r1
        L_0x0173:
            r0.<init>(r12, r2)
            r0.f267133d = r13
            r0.f267132c = r3
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r11.mo126973k3(r14, r0)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92738a.m116914g3(com.tencent.mm.modelcdntran.a, java.util.concurrent.ConcurrentHashMap, gi.g, d14.t0):void");
    }

    /* renamed from: d3 */
    public void mo57310d3(Context context) {
        C87412m.m108594g(context, "context");
        this.f266933h = new ConcurrentHashMap<>();
        this.f266934i = new ConcurrentHashMap<>();
        C92779i0.Dx0().f267124q.observe(this.f289092d, new C92744e(this));
    }

    /* renamed from: f3 */
    public void mo57311f3() {
        this.f266933h = null;
        this.f266934i = null;
    }

    /* renamed from: i3 */
    public final C58097y0<C92798v> mo126971i3(String str) {
        C87412m.m108594g(str, "mediaId");
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        LifecycleScope.launchDefault$default(mo126974l3(), (C53934p0) null, new C92740b(this, b, str, (C15601d<? super C92740b>) null), 1, (Object) null);
        return new C58090v0(b, (C53973z1) null);
    }

    /* renamed from: j3 */
    public int mo126972j3(String str, C92739a aVar) {
        C87412m.m108594g(str, "mediaId");
        C87412m.m108594g(aVar, "runningObj");
        if (aVar.f266935a.f287661e) {
            C92779i0.Dx0().getClass();
            CdnLogic.cancelTask(str);
            C58085t0<C92798v> t0Var = aVar.f266936b;
            C92798v vVar = new C92798v(C92798v.C92799a.OnUploadCancel, str);
            vVar.f267132c = 0;
            C13598b0 b0Var = C13598b0.f38549a;
            mo126973k3(t0Var, vVar);
        } else {
            C92779i0.Dx0().getClass();
            CdnLogic.cancelTask(str);
            C58085t0<C92798v> t0Var2 = aVar.f266936b;
            C92798v vVar2 = new C92798v(C92798v.C92799a.OnDownloadCancel, str);
            vVar2.f267132c = 0;
            C13598b0 b0Var2 = C13598b0.f38549a;
            mo126973k3(t0Var2, vVar2);
        }
        return 0;
    }

    /* renamed from: k3 */
    public final void mo126973k3(C58085t0<C92798v> t0Var, C92798v vVar) {
        C87412m.m108594g(t0Var, "<this>");
        C87412m.m108594g(vVar, "event");
        LifecycleScope.launchDefault$default(mo126974l3(), (C53934p0) null, new C92742c(t0Var, vVar, (C15601d<? super C92742c>) null), 1, (Object) null);
    }

    /* renamed from: l3 */
    public final LifecycleScope mo126974l3() {
        return (LifecycleScope) ((C36570n) this.f266931f).getValue();
    }

    /* JADX WARNING: type inference failed for: r6v9, types: [k14.c] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e A[Catch:{ all -> 0x0067 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo126975m3(java.lang.String r6, wx3.C15601d<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.tencent.p014mm.modelcdntran.C92738a.C92743d
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.tencent.mm.modelcdntran.a$d r0 = (com.tencent.p014mm.modelcdntran.C92738a.C92743d) r0
            int r1 = r0.f266949i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f266949i = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.modelcdntran.a$d r0 = new com.tencent.mm.modelcdntran.a$d
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f266947g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f266949i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003e
            if (r2 != r4) goto L_0x0036
            java.lang.Object r6 = r0.f266946f
            k14.c r6 = (k14.C99088c) r6
            java.lang.Object r1 = r0.f266945e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.f266944d
            com.tencent.mm.modelcdntran.a r0 = (com.tencent.p014mm.modelcdntran.C92738a) r0
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r6
            r6 = r1
            goto L_0x0055
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r7)
            k14.c r7 = r5.f266932g
            r0.f266944d = r5
            r0.f266945e = r6
            r0.f266946f = r7
            r0.f266949i = r4
            k14.d r7 = (k14.C60942d) r7
            java.lang.Object r0 = r7.mo85908b(r3, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r5
        L_0x0055:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.modelcdntran.a$a> r0 = r0.f266933h     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x005e
            boolean r6 = r0.containsKey(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x005f
        L_0x005e:
            r6 = 0
        L_0x005f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x0067 }
            r7.mo85909c(r3)
            return r6
        L_0x0067:
            r6 = move-exception
            r7.mo85909c(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.modelcdntran.C92738a.mo126975m3(java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: n3 */
    public final C58097y0<C92798v> mo126976n3(C98124g gVar) {
        C87412m.m108594g(gVar, "task");
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        String str = gVar.field_mediaId;
        if (str == null || str.length() == 0) {
            C92798v.C92799a aVar = C92798v.C92799a.OnDownloadInvalidMediaId;
            String str2 = gVar.field_mediaId;
            if (str2 == null) {
                str2 = "";
            }
            C92798v vVar = new C92798v(aVar, str2);
            vVar.f267133d = gVar;
            mo126973k3(b, vVar);
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startDownloadTask ");
        sb.append(gVar.field_mediaId);
        sb.append(' ');
        ConcurrentHashMap<String, C92739a> concurrentHashMap = this.f266933h;
        sb.append(concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "log");
        Log.m105924i("MicroMsg.Cdn.CdnFSC", sb4);
        gVar.f287661e = false;
        LifecycleScope.launchDefault$default(mo126974l3(), (C53934p0) null, new C92745f(this, gVar, b, (C15601d<? super C92745f>) null), 1, (Object) null);
        return new C58090v0(b, (C53973z1) null);
    }

    /* renamed from: o3 */
    public final C58097y0<C92798v> mo126977o3(C98124g gVar) {
        C87412m.m108594g(gVar, "task");
        boolean z = false;
        C58085t0 b = C58017a1.m67173b(0, 0, (C54624g) null, 7, (Object) null);
        String str = gVar.field_mediaId;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            C92798v.C92799a aVar = C92798v.C92799a.OnUploadInvalidMediaId;
            String str2 = gVar.field_mediaId;
            if (str2 == null) {
                str2 = "";
            }
            C92798v vVar = new C92798v(aVar, str2);
            vVar.f267133d = gVar;
            mo126973k3(b, vVar);
            return new C58090v0(b, (C53973z1) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("startUploadTask ");
        sb.append(gVar.field_mediaId);
        sb.append(' ');
        ConcurrentHashMap<String, C92739a> concurrentHashMap = this.f266933h;
        sb.append(concurrentHashMap != null ? Integer.valueOf(concurrentHashMap.size()) : null);
        String sb4 = sb.toString();
        C87412m.m108594g(sb4, "log");
        Log.m105924i("MicroMsg.Cdn.CdnFSC", sb4);
        gVar.f287661e = true;
        LifecycleScope.launchDefault$default(mo126974l3(), (C53934p0) null, new C92746g(this, gVar, b, (C15601d<? super C92746g>) null), 1, (Object) null);
        return new C58090v0(b, (C53973z1) null);
    }
}
