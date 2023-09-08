package com.tencent.p014mm.plugin.webview.webcompt;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53901i0;
import a14.C53934p0;
import a70.C112760b;
import android.webkit.ValueCallback;
import c30.C104289g;
import c30.C26827e;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83148d;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83164h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C45112n1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import cy3.C58003b;
import cy3.C86147a;
import d93.C45297a;
import d93.C45298c;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import o40.C61926c;
import ob0.C47350c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C90364q0;
import t83.C48590l;
import te3.C48857bh2;
import te3.C48869bk2;
import te3.C52018xt1;
import te3.g25;
import te3.h25;
import wc3.C53143h0;
import wx3.C15601d;
import wx3.C66206a;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import z04.C119027c;
import z04.C66725r;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.webcompt.c */
public final class C44408c {

    /* renamed from: e */
    public static final C44410b f120395e = new C44410b();

    /* renamed from: f */
    public static final String f120396f = "webcompt://";

    /* renamed from: g */
    public static final String f120397g = "MicroMsg.WebComponent";

    /* renamed from: h */
    public static final C13601g<C104289g> f120398h = C36568h.m40985a(C44424g.f120451d);

    /* renamed from: i */
    public static final C13601g<String> f120399i = C36568h.m40985a(C44421d.f120448d);

    /* renamed from: j */
    public static final C13601g<List<Integer>> f120400j = C36568h.m40985a(C44423f.f120450d);

    /* renamed from: k */
    public static final C13601g<String> f120401k = C36568h.m40985a(C44425i.f120452d);

    /* renamed from: l */
    public static final C13601g<Boolean> f120402l = C36568h.m40985a(C30620h.f82441d);

    /* renamed from: m */
    public static final C13601g<C85595k> f120403m = C36568h.m40985a(C44422e.f120449d);

    /* renamed from: n */
    public static String f120404n = "";

    /* renamed from: o */
    public static final LinkedList<C44428l> f120405o = new LinkedList<>();

    /* renamed from: p */
    public static C44410b.C44415e f120406p;

    /* renamed from: q */
    public static final String f120407q = (C112760b.m154195C() + "webcompt_debug/");

    /* renamed from: r */
    public static final C13601g<C44410b.C44412b> f120408r = C36568h.m40985a(C44420c.f120447d);

    /* renamed from: a */
    public final WeakReference<C48590l> f120409a;

    /* renamed from: b */
    public final C44462y f120410b = new C44462y();

    /* renamed from: c */
    public boolean f120411c;

    /* renamed from: d */
    public final C13601g f120412d;

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$h */
    public static final class C30620h extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C30620h f82441d = new C30620h();

        public C30620h() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_pause_jscore_on_background, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$a */
    public static final class C44409a {

        /* renamed from: a */
        public final C45298c f120413a;

        /* renamed from: b */
        public final String f120414b;

        /* renamed from: c */
        public final Map<String, String> f120415c;

        public C44409a(C45298c cVar, String str, Map<String, String> map) {
            C87412m.m108594g(cVar, "a8key");
            C87412m.m108594g(str, "fullUrl");
            C87412m.m108594g(map, "httpHeaders");
            this.f120413a = cVar;
            this.f120414b = str;
            this.f120415c = map;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b */
    public static final class C44410b {

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$a */
        public enum C44411a {
            NA,
            PARAM,
            SDCARD,
            SDCARD_PKG,
            COMMAND
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$b */
        public static final class C44412b {

            /* renamed from: a */
            public final LinkedList<C44417f> f120422a = new LinkedList<>();

            /* renamed from: b */
            public final LinkedList<C44414d> f120423b = new LinkedList<>();

            /* renamed from: c */
            public C44413c f120424c = C44413c.NA;

            /* renamed from: d */
            public boolean f120425d;

            /* renamed from: e */
            public int f120426e;
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$c */
        public enum C44413c {
            NA,
            CACHE,
            NETWORK,
            ASSETS
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$d */
        public static final class C44414d {

            /* renamed from: a */
            public final String f120432a;

            /* renamed from: b */
            public final C44413c f120433b;

            /* renamed from: c */
            public final C44411a f120434c;

            public C44414d(String str, C44413c cVar, C44411a aVar) {
                C87412m.m108594g(str, "uri");
                C87412m.m108594g(cVar, "resType");
                C87412m.m108594g(aVar, "debugType");
                this.f120432a = str;
                this.f120433b = cVar;
                this.f120434c = aVar;
            }

            public String toString() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append("[script]\n                ");
                if (this.f120433b != C44413c.NA) {
                    str = "resType: " + this.f120433b;
                } else {
                    str = "debugType: " + this.f120434c;
                }
                sb.append(str);
                sb.append("\n                ");
                sb.append(this.f120432a);
                sb.append("\n                ");
                return C66725r.m78728b(sb.toString());
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C44414d(String str, C44413c cVar, C44411a aVar, int i, C8480h hVar) {
                this(str, (i & 2) != 0 ? C44413c.NA : cVar, (i & 4) != 0 ? C44411a.NA : aVar);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$e */
        public static final class C44415e {

            /* renamed from: a */
            public final C40427l0 f120435a;

            /* renamed from: b */
            public final C13601g f120436b = C36568h.m40985a(new C44416a(this));

            /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$e$a */
            public static final class C44416a extends C87413o implements C32224a<Integer> {

                /* renamed from: d */
                public final /* synthetic */ C44415e f120437d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C44416a(C44415e eVar) {
                    super(0);
                    this.f120437d = eVar;
                }

                public Object invoke() {
                    return Integer.valueOf(C44408c.f120395e.mo69193k(this.f120437d.f120435a));
                }
            }

            public C44415e(C40427l0 l0Var) {
                C87412m.m108594g(l0Var, "wxaPkg");
                this.f120435a = l0Var;
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$f */
        public static final class C44417f {

            /* renamed from: a */
            public final int f120438a;

            /* renamed from: b */
            public final boolean f120439b;

            /* renamed from: c */
            public final boolean f120440c;

            /* renamed from: d */
            public final LinkedList<C44414d> f120441d;

            public C44417f(int i, boolean z, boolean z2, int i2, C8480h hVar) {
                z = (i2 & 2) != 0 ? false : z;
                z2 = (i2 & 4) != 0 ? false : z2;
                this.f120438a = i;
                this.f120439b = z;
                this.f120440c = z2;
                this.f120441d = new LinkedList<>();
            }

            public String toString() {
                return C66725r.m78728b("[worker #" + this.f120438a + "]\n                preload: " + this.f120439b + "\n                recycled: " + this.f120440c + "\n\n                " + C110818d0.m150921S(this.f120441d, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null) + "\n                ");
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$Companion", mo125469f = "WebComponent.kt", mo125470l = {789}, mo125471m = "checkPkgVersion")
        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$g */
        public static final class C44418g extends C66704d {

            /* renamed from: d */
            public Object f120442d;

            /* renamed from: e */
            public /* synthetic */ Object f120443e;

            /* renamed from: f */
            public final /* synthetic */ C44410b f120444f;

            /* renamed from: g */
            public int f120445g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44418g(C44410b bVar, C15601d<? super C44418g> dVar) {
                super(dVar);
                this.f120444f = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f120443e = obj;
                this.f120445g |= Integer.MIN_VALUE;
                return this.f120444f.mo69187d(this);
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$Companion$preloadWorker$1", mo125469f = "WebComponent.kt", mo125470l = {806}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$b$h */
        public static final class C44419h extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f120446d;

            public C44419h(C15601d<? super C44419h> dVar) {
                super(2, dVar);
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C44419h(dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                C0000n0 n0Var = (C0000n0) obj;
                return new C44419h((C15601d) obj2).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f120446d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C44410b bVar = C44408c.f120395e;
                    this.f120446d = 1;
                    if (C44410b.m48780a(bVar, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C44428l lVar = new C44428l();
                if (lVar.f120464e == -1) {
                    C44410b bVar2 = C44408c.f120395e;
                    C85595k b = C44410b.m48781b(bVar2);
                    String i2 = bVar2.mo69191i("/wxwebcompt.js", lVar.f120465f.f120441d);
                    b.getClass();
                    C87412m.m108594g(i2, "script");
                    C40480g X = b.mo115378X();
                    ((C83148d) X).evaluateJavascript(i2, (ValueCallback<String>) null);
                    lVar.f120464e = ((C83161f) X).f242978h;
                    String str = C44408c.f120397g;
                    Log.m105924i(str, "preload workerManager#" + lVar.f120463d);
                } else {
                    C44408c.f120395e.getClass();
                    String str2 = C44408c.f120397g;
                    Log.m105928w(str2, "preload twice #" + lVar.f120463d);
                }
                C44408c.f120405o.offerFirst(lVar);
                return C13598b0.f38549a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static final java.lang.Object m48780a(com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b r4, wx3.C15601d r5) {
            /*
                r4.getClass()
                boolean r0 = r5 instanceof com.tencent.p014mm.plugin.webview.webcompt.C44443e
                if (r0 == 0) goto L_0x0016
                r0 = r5
                com.tencent.mm.plugin.webview.webcompt.e r0 = (com.tencent.p014mm.plugin.webview.webcompt.C44443e) r0
                int r1 = r0.f120538f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0016
                int r1 = r1 - r2
                r0.f120538f = r1
                goto L_0x001b
            L_0x0016:
                com.tencent.mm.plugin.webview.webcompt.e r0 = new com.tencent.mm.plugin.webview.webcompt.e
                r0.<init>(r4, r5)
            L_0x001b:
                java.lang.Object r5 = r0.f120536d
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f120538f
                r3 = 1
                if (r2 == 0) goto L_0x0032
                if (r2 != r3) goto L_0x002a
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x003e
            L_0x002a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L_0x0032:
                kotlin.ResultKt.throwOnFailure(r5)
                r0.f120538f = r3
                java.lang.Object r4 = r4.mo69187d(r0)
                if (r4 != r1) goto L_0x003e
                goto L_0x005c
            L_0x003e:
                java.lang.String r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120404n
                boolean r4 = z04.C112551y.m153811k(r4)
                r4 = r4 ^ r3
                if (r4 == 0) goto L_0x004a
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x005c
            L_0x004a:
                java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
                java.lang.String r5 = "PROCESS_MAIN"
                gy3.C87412m.m108593f(r4, r5)
                com.tencent.mm.ipcinvoker.type.IPCVoid r5 = com.tencent.p014mm.ipcinvoker.type.IPCVoid.f10316d
                com.tencent.mm.plugin.webview.webcompt.f<InputType, ResultType> r0 = com.tencent.p014mm.plugin.webview.webcompt.C6607f.f23863d
                com.tencent.mm.plugin.webview.webcompt.g r1 = com.tencent.p014mm.plugin.webview.webcompt.C44444g.f120539d
                com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r4, r5, r0, r1)
                rx3.b0 r1 = rx3.C13598b0.f38549a
            L_0x005c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48780a(com.tencent.mm.plugin.webview.webcompt.c$b, wx3.d):java.lang.Object");
        }

        /* renamed from: b */
        public static final C85595k m48781b(C44410b bVar) {
            bVar.getClass();
            return (C85595k) ((C36570n) C44408c.f120403m).getValue();
        }

        /* renamed from: c */
        public static final String m48782c(C44410b bVar, C48869bk2 bk22) {
            bVar.getClass();
            return C112760b.m154225d() + "webcompt/" + bk22.f131168d + XVFSFile.SEPARATOR_CHAR + bk22.f131170f;
        }

        /* renamed from: e */
        public static void m48783e(C44410b bVar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            bVar.getClass();
            if (z) {
                C86009m1[] v = new C86009m1(C44408c.f120407q + "jsapi/").mo119985v(C30621d.f82442a);
                C87412m.m108591d(v);
                for (C86009m1 f : v) {
                    f.mo119966f();
                }
            }
            if (z2) {
                C86009m1[] v2 = new C86009m1(C44408c.f120407q).mo119985v(C30621d.f82442a);
                C87412m.m108591d(v2);
                for (C86009m1 f2 : v2) {
                    f2.mo119966f();
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x007c  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo69187d(wx3.C15601d<? super rx3.C13598b0> r8) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44418g
                if (r0 == 0) goto L_0x0013
                r0 = r8
                com.tencent.mm.plugin.webview.webcompt.c$b$g r0 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44418g) r0
                int r1 = r0.f120445g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f120445g = r1
                goto L_0x0018
            L_0x0013:
                com.tencent.mm.plugin.webview.webcompt.c$b$g r0 = new com.tencent.mm.plugin.webview.webcompt.c$b$g
                r0.<init>(r7, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f120443e
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f120445g
                r3 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 != r3) goto L_0x002b
                java.lang.Object r0 = r0.f120442d
                com.tencent.mm.plugin.webview.webcompt.c$b r0 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b) r0
                kotlin.ResultKt.throwOnFailure(r8)
                goto L_0x005e
            L_0x002b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0033:
                kotlin.ResultKt.throwOnFailure(r8)
                r0.f120442d = r7
                r0.f120445g = r3
                wx3.h r8 = new wx3.h
                wx3.d r0 = xx3.C66447b.m78392b(r0)
                r8.<init>(r0)
                java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
                java.lang.String r2 = "PROCESS_MAIN"
                gy3.C87412m.m108593f(r0, r2)
                com.tencent.mm.ipcinvoker.type.IPCVoid r2 = com.tencent.p014mm.ipcinvoker.type.IPCVoid.f10316d
                com.tencent.mm.plugin.webview.webcompt.h<InputType, ResultType> r3 = com.tencent.p014mm.plugin.webview.webcompt.C44445h.f120540d
                com.tencent.mm.plugin.webview.webcompt.i r4 = new com.tencent.mm.plugin.webview.webcompt.i
                r4.<init>(r8)
                com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r0, r2, r3, r4)
                java.lang.Object r8 = r8.mo90314b()
                if (r8 != r1) goto L_0x005d
                return r1
            L_0x005d:
                r0 = r7
            L_0x005e:
                java.lang.Number r8 = (java.lang.Number) r8
                int r8 = r8.intValue()
                r0.getClass()
                java.lang.String r0 = "webcompt_mmkv"
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
                java.lang.String r2 = "getMMKV(\"webcompt_mmkv\")"
                gy3.C87412m.m108593f(r1, r2)
                r3 = 0
                java.lang.String r4 = "lastSavePkgVersion"
                int r1 = r1.decodeInt(r4, r3)
                if (r1 == r8) goto L_0x00ad
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "checkPkgVersion lastSaveVersion="
                r5.append(r6)
                r5.append(r1)
                java.lang.String r6 = ", currentVersion="
                r5.append(r6)
                r5.append(r8)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
                if (r1 <= 0) goto L_0x00a3
                r1 = 0
                com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120406p = r1
                java.lang.String r1 = ""
                com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120404n = r1
            L_0x00a3:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMMKV(r0)
                gy3.C87412m.m108593f(r0, r2)
                r0.encode((java.lang.String) r4, (int) r8)
            L_0x00ad:
                rx3.b0 r8 = rx3.C13598b0.f38549a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.mo69187d(wx3.d):java.lang.Object");
        }

        /* renamed from: f */
        public final String mo69188f() {
            C44412b h = mo69190h();
            StringBuilder sb = new StringBuilder();
            sb.append("\n            [debug]\n            debug: ");
            boolean z = false;
            if (C6612w.m6920a().containsKey("debug")) {
                z = C6612w.m6920a().getBoolean("debug", false);
            } else if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                z = true;
            }
            sb.append(z);
            sb.append("\n\n            [lib]\n            version: ");
            sb.append(h.f120426e);
            sb.append("\n            res: ");
            sb.append(h.f120424c);
            sb.append("\n\n            ");
            sb.append(C110818d0.m150921S(h.f120423b, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            sb.append("\n\n            ");
            sb.append(C110818d0.m150921S(h.f120422a, "\n\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null));
            sb.append("\n            ");
            return C66725r.m78728b(sb.toString());
        }

        /* renamed from: g */
        public final String mo69189g(String str) {
            return C44408c.f120407q + str;
        }

        /* renamed from: h */
        public final C44412b mo69190h() {
            return (C44412b) ((C36570n) C44408c.f120408r).getValue();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009e, code lost:
            cy3.C58003b.m67160a(r13, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f5, code lost:
            if ((r2.length() > 0) == true) goto L_0x00f9;
         */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo69191i(java.lang.String r12, java.util.LinkedList<com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44414d> r13) {
            /*
                r11 = this;
                java.lang.String r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = 0
                r2[r3] = r12
                java.lang.String r4 = "getLocalScript: %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r2)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                java.lang.String r2 = "debug"
                boolean r0 = r0.containsKey(r2)
                if (r0 == 0) goto L_0x0022
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r0 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                boolean r0 = r0.getBoolean(r2, r3)
                goto L_0x002e
            L_0x0022:
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r0 != 0) goto L_0x002d
                boolean r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r0 == 0) goto L_0x002b
                goto L_0x002d
            L_0x002b:
                r0 = 0
                goto L_0x002e
            L_0x002d:
                r0 = 1
            L_0x002e:
                r2 = 0
                if (r0 == 0) goto L_0x00a2
                com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "jsapi"
                r4.append(r5)
                r4.append(r12)
                java.lang.String r4 = r4.toString()
                java.lang.String r4 = r11.mo69189g(r4)
                r0.<init>((java.lang.String) r4)
                boolean r4 = r0.mo119967g()
                if (r4 == 0) goto L_0x0067
                if (r13 == 0) goto L_0x0062
                com.tencent.mm.plugin.webview.webcompt.c$b$d r3 = new com.tencent.mm.plugin.webview.webcompt.c$b$d
                r7 = 0
                com.tencent.mm.plugin.webview.webcompt.c$b$a r8 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.SDCARD
                r9 = 2
                r10 = 0
                r5 = r3
                r6 = r12
                r5.<init>(r6, r7, r8, r9, r10)
                r13.add(r3)
            L_0x0062:
                java.lang.String r12 = com.tencent.p014mm.vfs.C45112n1.m49954a(r0, r2, r1, r2)
                return r12
            L_0x0067:
                com.tencent.mm.vfs.m1 r0 = new com.tencent.mm.vfs.m1
                java.lang.String r4 = "jsapi/webcompt.wcpkg"
                java.lang.String r4 = r11.mo69189g(r4)
                r0.<init>((java.lang.String) r4)
                boolean r4 = r0.mo119967g()
                if (r4 == 0) goto L_0x00a2
                if (r13 == 0) goto L_0x0089
                com.tencent.mm.plugin.webview.webcompt.c$b$d r1 = new com.tencent.mm.plugin.webview.webcompt.c$b$d
                r7 = 0
                com.tencent.mm.plugin.webview.webcompt.c$b$a r8 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.SDCARD_PKG
                r9 = 2
                r10 = 0
                r5 = r1
                r6 = r12
                r5.<init>(r6, r7, r8, r9, r10)
                r13.add(r1)
            L_0x0089:
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg r13 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg
                r13.<init>((com.tencent.p014mm.vfs.C86009m1) r0)
                r13.mo63189b()     // Catch:{ all -> 0x009b }
                com.tencent.mm.plugin.webview.webcompt.c$b r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e     // Catch:{ all -> 0x009b }
                java.lang.String r12 = r0.mo69195m(r13, r12)     // Catch:{ all -> 0x009b }
                cy3.C58003b.m67160a(r13, r2)
                return r12
            L_0x009b:
                r12 = move-exception
                throw r12     // Catch:{ all -> 0x009d }
            L_0x009d:
                r0 = move-exception
                cy3.C58003b.m67160a(r13, r12)
                throw r0
            L_0x00a2:
                com.tencent.mm.plugin.webview.webcompt.c$b$e r0 = r11.mo69192j()
                java.lang.String r4 = "path"
                gy3.C87412m.m108594g(r12, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "WebComp_Script_"
                r4.append(r5)
                r4.append(r12)
                java.lang.String r4 = r4.toString()
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.String>> r5 = com.tencent.p014mm.pluginsdk.model.C30681m1.f82565a
                java.lang.String r5 = "key"
                gy3.C87412m.m108594g(r4, r5)
                boolean r5 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
                if (r5 != 0) goto L_0x00ca
                goto L_0x00ea
            L_0x00ca:
                kj2.d r5 = kj2.C117407d.INSTANCE
                r6 = 220(0xdc, float:3.08E-43)
                r7 = 1009(0x3f1, float:1.414E-42)
                r5.mo182088q(r7, r6)
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.String>> r6 = com.tencent.p014mm.pluginsdk.model.C30681m1.f82565a
                java.lang.Object r6 = r6.get(r4)
                java.lang.ref.WeakReference r6 = (java.lang.ref.WeakReference) r6
                if (r6 == 0) goto L_0x00e3
                java.lang.Object r2 = r6.get()
                java.lang.String r2 = (java.lang.String) r2
            L_0x00e3:
                if (r2 == 0) goto L_0x00ea
                r6 = 221(0xdd, float:3.1E-43)
                r5.mo182088q(r7, r6)
            L_0x00ea:
                if (r2 == 0) goto L_0x00f8
                int r5 = r2.length()
                if (r5 <= 0) goto L_0x00f4
                r5 = 1
                goto L_0x00f5
            L_0x00f4:
                r5 = 0
            L_0x00f5:
                if (r5 != r1) goto L_0x00f8
                goto L_0x00f9
            L_0x00f8:
                r1 = 0
            L_0x00f9:
                if (r1 == 0) goto L_0x00fc
                goto L_0x0115
            L_0x00fc:
                com.tencent.mm.plugin.webview.webcompt.c$b r1 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                com.tencent.mm.plugin.appbrand.appcache.l0 r0 = r0.f120435a
                java.lang.String r2 = r1.mo69195m(r0, r12)
                boolean r0 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()
                if (r0 != 0) goto L_0x010b
                goto L_0x0115
            L_0x010b:
                java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ref.WeakReference<java.lang.String>> r0 = com.tencent.p014mm.pluginsdk.model.C30681m1.f82565a
                java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
                r1.<init>(r2)
                r0.put(r4, r1)
            L_0x0115:
                if (r13 == 0) goto L_0x012c
                com.tencent.mm.plugin.webview.webcompt.c$b$d r0 = new com.tencent.mm.plugin.webview.webcompt.c$b$d
                com.tencent.mm.plugin.webview.webcompt.c$b r1 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                com.tencent.mm.plugin.webview.webcompt.c$b$b r1 = r1.mo69190h()
                com.tencent.mm.plugin.webview.webcompt.c$b$c r5 = r1.f120424c
                r6 = 0
                r7 = 4
                r8 = 0
                r3 = r0
                r4 = r12
                r3.<init>(r4, r5, r6, r7, r8)
                r13.add(r0)
            L_0x012c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.mo69191i(java.lang.String, java.util.LinkedList):java.lang.String");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.tencent.mm.plugin.appbrand.appcache.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.tencent.mm.plugin.appbrand.appcache.h} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.tencent.mm.plugin.appbrand.appcache.WxaPkg} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.tencent.mm.plugin.appbrand.appcache.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44415e mo69192j() {
            /*
                r7 = this;
                com.tencent.mm.plugin.webview.webcompt.c$b$e r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120406p
                if (r0 != 0) goto L_0x00c3
                com.tencent.mm.plugin.appbrand.appcache.h r0 = new com.tencent.mm.plugin.appbrand.appcache.h
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r2 = "jsapi/webcompt.wcpkg"
                r0.<init>(r1, r2)
                r0.mo63189b()
                com.tencent.mm.plugin.webview.webcompt.c$b r1 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e     // Catch:{ Exception -> 0x0091 }
                int r2 = r1.mo69193k(r0)     // Catch:{ Exception -> 0x0091 }
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120404n     // Catch:{ Exception -> 0x0091 }
                boolean r3 = z04.C112551y.m153811k(r3)     // Catch:{ Exception -> 0x0091 }
                r3 = r3 ^ 1
                if (r3 == 0) goto L_0x0066
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120404n     // Catch:{ Exception -> 0x0091 }
                boolean r3 = com.tencent.p014mm.vfs.C86013q1.m106450k(r3)     // Catch:{ Exception -> 0x0091 }
                if (r3 == 0) goto L_0x0066
                com.tencent.mm.plugin.appbrand.appcache.WxaPkg r3 = new com.tencent.mm.plugin.appbrand.appcache.WxaPkg     // Catch:{ Exception -> 0x0091 }
                java.lang.String r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120404n     // Catch:{ Exception -> 0x0091 }
                r3.<init>((java.lang.String) r4)     // Catch:{ Exception -> 0x0091 }
                r3.mo63189b()     // Catch:{ Exception -> 0x0091 }
                int r4 = r1.mo69193k(r3)     // Catch:{ Exception -> 0x0091 }
                if (r4 <= r2) goto L_0x0066
                r1.getClass()     // Catch:{ Exception -> 0x0091 }
                java.lang.String r2 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g     // Catch:{ Exception -> 0x0091 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
                r5.<init>()     // Catch:{ Exception -> 0x0091 }
                java.lang.String r6 = "ScriptManager use pkg res:"
                r5.append(r6)     // Catch:{ Exception -> 0x0091 }
                r5.append(r4)     // Catch:{ Exception -> 0x0091 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0091 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r5)     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r2 = r1.mo69190h()     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$c r5 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44413c.NETWORK     // Catch:{ Exception -> 0x0091 }
                r2.getClass()     // Catch:{ Exception -> 0x0091 }
                r2.f120424c = r5     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r1 = r1.mo69190h()     // Catch:{ Exception -> 0x0091 }
                r1.f120426e = r4     // Catch:{ Exception -> 0x0091 }
                r0 = r3
                goto L_0x00bb
            L_0x0066:
                r1.getClass()     // Catch:{ Exception -> 0x0091 }
                java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g     // Catch:{ Exception -> 0x0091 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
                r4.<init>()     // Catch:{ Exception -> 0x0091 }
                java.lang.String r5 = "ScriptManager use assets res"
                r4.append(r5)     // Catch:{ Exception -> 0x0091 }
                r4.append(r2)     // Catch:{ Exception -> 0x0091 }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0091 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r3 = r1.mo69190h()     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$c r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44413c.ASSETS     // Catch:{ Exception -> 0x0091 }
                r3.getClass()     // Catch:{ Exception -> 0x0091 }
                r3.f120424c = r4     // Catch:{ Exception -> 0x0091 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r1 = r1.mo69190h()     // Catch:{ Exception -> 0x0091 }
                r1.f120426e = r2     // Catch:{ Exception -> 0x0091 }
                goto L_0x00bb
            L_0x0091:
                r1 = move-exception
                com.tencent.mm.plugin.webview.webcompt.c$b r2 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r2.getClass()
                java.lang.String r2 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "pkg handle error: "
                r3.append(r4)
                java.lang.String r1 = r1.getMessage()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r1)
                com.tencent.mm.plugin.webview.webcompt.y r1 = new com.tencent.mm.plugin.webview.webcompt.y
                r1.<init>()
                com.tencent.mm.plugin.webview.webcompt.b r2 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.PARSE_RES_VERSION_ERR
                r1.mo69224a(r2)
            L_0x00bb:
                com.tencent.mm.plugin.webview.webcompt.c$b$e r1 = new com.tencent.mm.plugin.webview.webcompt.c$b$e
                r1.<init>(r0)
                com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120406p = r1
                r0 = r1
            L_0x00c3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.mo69192j():com.tencent.mm.plugin.webview.webcompt.c$b$e");
        }

        /* renamed from: k */
        public final int mo69193k(C40427l0 l0Var) {
            try {
                String m = mo69195m(l0Var, "/meta.json");
                if (m.length() == 0) {
                    return 0;
                }
                return new C104289g(m).optInt(ProviderConstants.API_COLNAME_FEATURE_VERSION);
            } catch (Exception e) {
                String str = C44408c.f120397g;
                Log.m105920e(str, "parse IWxaPkg.version Error:" + e.getMessage());
                return 0;
            }
        }

        /* renamed from: l */
        public final void mo69194l(boolean z) {
            LinkedList<C44428l> linkedList = C44408c.f120405o;
            if (linkedList.size() >= 3) {
                return;
            }
            if (z || !(!linkedList.isEmpty())) {
                C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C44419h((C15601d<? super C44419h>) null), 2, (Object) null);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            cy3.C58003b.m67160a(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
            r0 = move-exception;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo69195m(com.tencent.p014mm.plugin.appbrand.appcache.C40427l0 r4, java.lang.String r5) {
            /*
                r3 = this;
                java.io.InputStream r4 = r4.mo63188a(r5)
                if (r4 == 0) goto L_0x001d
                r5 = 0
                java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0016 }
                byte[] r1 = cy3.C86147a.m106661c(r4)     // Catch:{ all -> 0x0016 }
                java.nio.charset.Charset r2 = z04.C119027c.f356488a     // Catch:{ all -> 0x0016 }
                r0.<init>(r1, r2)     // Catch:{ all -> 0x0016 }
                cy3.C58003b.m67160a(r4, r5)
                goto L_0x001f
            L_0x0016:
                r5 = move-exception
                throw r5     // Catch:{ all -> 0x0018 }
            L_0x0018:
                r0 = move-exception
                cy3.C58003b.m67160a(r4, r5)
                throw r0
            L_0x001d:
                java.lang.String r0 = ""
            L_0x001f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.mo69195m(com.tencent.mm.plugin.appbrand.appcache.l0, java.lang.String):java.lang.String");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$c */
    public static final class C44420c extends C87413o implements C32224a<C44410b.C44412b> {

        /* renamed from: d */
        public static final C44420c f120447d = new C44420c();

        public C44420c() {
            super(0);
        }

        public Object invoke() {
            return new C44410b.C44412b();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$d */
    public static final class C44421d extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C44421d f120448d = new C44421d();

        public C44421d() {
            super(0);
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            C44408c.f120395e.getClass();
            sb.append(C44408c.f120396f);
            sb.append(((C104289g) ((C36570n) C44408c.f120398h).getValue()).getString("iframeUrlPattern"));
            return sb.toString();
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$e */
    public static final class C44422e extends C87413o implements C32224a<C85595k> {

        /* renamed from: d */
        public static final C44422e f120449d = new C44422e();

        public C44422e() {
            super(0);
        }

        public Object invoke() {
            C85595k kVar = new C85595k();
            ((C119157j) C119157j.f356862d).mo183895z(C44449l.f120544d);
            return kVar;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$f */
    public static final class C44423f extends C87413o implements C32224a<List<? extends Integer>> {

        /* renamed from: d */
        public static final C44423f f120450d = new C44423f();

        public C44423f() {
            super(0);
        }

        public Object invoke() {
            C44408c.f120395e.getClass();
            C26827e j = ((C104289g) ((C36570n) C44408c.f120398h).getValue()).mo110108i("matrix");
            C87412m.m108593f(j, "meta.getJSONArray(\"matrix\")");
            LinkedList linkedList = new LinkedList();
            int length = j.length();
            for (int i = 0; i < length; i++) {
                linkedList.add(Integer.valueOf(j.getInt(i)));
            }
            return linkedList;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$g */
    public static final class C44424g extends C87413o implements C32224a<C104289g> {

        /* renamed from: d */
        public static final C44424g f120451d = new C44424g();

        public C44424g() {
            super(0);
        }

        public Object invoke() {
            return new C104289g(C44408c.f120395e.mo69191i("/meta.json", (LinkedList<C44410b.C44414d>) null));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$i */
    public static final class C44425i extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C44425i f120452d = new C44425i();

        public C44425i() {
            super(0);
        }

        public Object invoke() {
            return C44408c.f120395e.mo69191i("/skeleton.html", (LinkedList<C44410b.C44414d>) null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$j */
    public static final class C44426j extends Exception {

        /* renamed from: d */
        public final int f120453d;

        /* renamed from: e */
        public final String f120454e;

        /* renamed from: f */
        public final String f120455f;

        public C44426j(int i, String str, String str2) {
            C87412m.m108594g(str, "webComptName");
            C87412m.m108594g(str2, "errMsg");
            this.f120453d = i;
            this.f120454e = str;
            this.f120455f = str2;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$k */
    public enum C44427k {
        STEP_CREATE_JS_CXT("createJsContext"),
        STEP_EVAL_MAIN_FRAME("evalMainFrame"),
        STEP_GET_A8KEY("GetA8Key"),
        STEP_FETCH_WORKER("FetchWorker"),
        STEP_GET_APP_SCRIPT("GetAppScript");
        

        /* renamed from: d */
        public final String f120462d;

        /* access modifiers changed from: public */
        C44427k(String str) {
            this.f120462d = str;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$m */
    public /* synthetic */ class C44430m {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120480a;

        static {
            int[] iArr = new int[C44410b.C44413c.values().length];
            iArr[2] = 1;
            f120480a = iArr;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$n */
    public static final class C44431n extends C66206a implements C53901i0 {

        /* renamed from: d */
        public final /* synthetic */ C44408c f120481d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0 f120482e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44431n(C53901i0.C39480a aVar, C44408c cVar, C8479f0 f0Var) {
            super(aVar);
            this.f120481d = cVar;
            this.f120482e = f0Var;
        }

        public void handleException(C66212f fVar, Throwable th) {
            this.f120481d.f120410b.mo69224a(C44406b.CREATE_JS_CONTEXT_ERR);
            if (th instanceof C44426j) {
                ((C32226l) this.f120482e.f27484d).invoke(th);
                return;
            }
            C115669n.INSTANCE.idkeyStat(1653, 12, 1, false);
            Log.printErrStackTrace(C44408c.f120397g, th, "createJsContext", new Object[0]);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$createJsContext$2", mo125469f = "WebComponent.kt", mo125470l = {251, 352, 357, 364}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o */
    public static final class C44432o extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f120483d;

        /* renamed from: e */
        public Object f120484e;

        /* renamed from: f */
        public Object f120485f;

        /* renamed from: g */
        public Object f120486g;

        /* renamed from: h */
        public Object f120487h;

        /* renamed from: i */
        public int f120488i;

        /* renamed from: j */
        public /* synthetic */ Object f120489j;

        /* renamed from: n */
        public final /* synthetic */ boolean f120490n;

        /* renamed from: o */
        public final /* synthetic */ C44408c f120491o;

        /* renamed from: p */
        public final /* synthetic */ C53143h0 f120492p;

        /* renamed from: q */
        public final /* synthetic */ C48869bk2 f120493q;

        /* renamed from: r */
        public final /* synthetic */ String f120494r;

        /* renamed from: s */
        public final /* synthetic */ String f120495s;

        /* renamed from: t */
        public final /* synthetic */ String f120496t;

        /* renamed from: u */
        public final /* synthetic */ C8479f0<C32226l<C44426j, C13598b0>> f120497u;

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o$a */
        public static final class C44433a implements C83164h {

            /* renamed from: a */
            public final /* synthetic */ String f120498a;

            /* renamed from: b */
            public final /* synthetic */ C44408c f120499b;

            public C44433a(String str, C44408c cVar) {
                this.f120498a = str;
                this.f120499b = cVar;
            }

            /* renamed from: a */
            public final void mo69211a(String str, String str2) {
                C44408c.f120395e.getClass();
                String str3 = C44408c.f120397g;
                Log.m105920e(str3, "engine " + this.f120498a + " exception: " + str + " \nstackTrace:\n" + str2);
                C44408c cVar = this.f120499b;
                String str4 = this.f120498a;
                C87412m.m108593f(str4, "name");
                C87412m.m108593f(str, StateEvent.Name.MESSAGE);
                cVar.mo69182g(str4, str, str2, 0, 0);
                this.f120499b.f120410b.mo69224a(C44406b.EX_JS_CONTEXT);
            }
        }

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o$b */
        public static final class C44434b extends C87413o implements C32226l<C44426j, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C44408c f120500d;

            /* renamed from: e */
            public final /* synthetic */ C40480g f120501e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44434b(C44408c cVar, C40480g gVar) {
                super(1);
                this.f120500d = cVar;
                this.f120501e = gVar;
            }

            public Object invoke(Object obj) {
                C44426j jVar = (C44426j) obj;
                C87412m.m108594g(jVar, "ex");
                C44408c cVar = this.f120500d;
                C40480g gVar = this.f120501e;
                StringBuilder sb = new StringBuilder();
                sb.append("WeixinWebCompt.onError(");
                C104289g gVar2 = new C104289g();
                gVar2.mo145953n("retCode", jVar.f120453d);
                gVar2.put("webComptName", C44404a.m48767d(jVar.f120454e));
                gVar2.put("error", C44404a.m48767d(jVar.f120455f));
                String gVar3 = gVar2.toString();
                C87412m.m108593f(gVar3, "JSONObject().apply {\n   …\n            }.toString()");
                C44408c.f120395e.getClass();
                String str = C44408c.f120397g;
                Log.m105920e(str, "CreateJSContextException:" + gVar3);
                sb.append(gVar3);
                sb.append(')');
                String sb4 = sb.toString();
                cVar.getClass();
                gVar.evaluateJavascript(sb4, (ValueCallback<String>) null);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$createJsContext$2$1$1$asyncA8Key$1", mo125469f = "WebComponent.kt", mo125470l = {326}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o$c */
        public static final class C44435c extends C91594j implements C32227p<C0000n0, C15601d<? super C44409a>, Object> {

            /* renamed from: d */
            public int f120502d;

            /* renamed from: e */
            public final /* synthetic */ C44408c f120503e;

            /* renamed from: f */
            public final /* synthetic */ C53143h0 f120504f;

            /* renamed from: g */
            public final /* synthetic */ String f120505g;

            /* renamed from: h */
            public final /* synthetic */ C48869bk2 f120506h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44435c(C44408c cVar, C53143h0 h0Var, String str, C48869bk2 bk22, C15601d<? super C44435c> dVar) {
                super(2, dVar);
                this.f120503e = cVar;
                this.f120504f = h0Var;
                this.f120505g = str;
                this.f120506h = bk22;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C44435c(this.f120503e, this.f120504f, this.f120505g, this.f120506h, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C44435c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C44427k kVar = C44427k.STEP_GET_A8KEY;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f120502d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C44408c cVar = this.f120503e;
                    C53143h0 h0Var = this.f120504f;
                    C44410b bVar = C44408c.f120395e;
                    cVar.mo69185k(h0Var, kVar);
                    C44408c cVar2 = this.f120503e;
                    String str = this.f120505g;
                    String str2 = this.f120506h.f131168d;
                    C87412m.m108593f(str2, "webCompt.name");
                    this.f120502d = 1;
                    obj = cVar2.mo69183h(str, str2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C44409a aVar2 = (C44409a) obj;
                C44408c.m48768a(this.f120503e, this.f120504f, kVar);
                return obj;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.webview.webcompt.WebComponent$createJsContext$2$1$1$asyncAppScript$1", mo125469f = "WebComponent.kt", mo125470l = {332}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o$d */
        public static final class C44436d extends C91594j implements C32227p<C0000n0, C15601d<? super C13604l<? extends String, ? extends String>>, Object> {

            /* renamed from: d */
            public Object f120507d;

            /* renamed from: e */
            public Object f120508e;

            /* renamed from: f */
            public Object f120509f;

            /* renamed from: g */
            public Object f120510g;

            /* renamed from: h */
            public Object f120511h;

            /* renamed from: i */
            public int f120512i;

            /* renamed from: j */
            public final /* synthetic */ C44408c f120513j;

            /* renamed from: n */
            public final /* synthetic */ C53143h0 f120514n;

            /* renamed from: o */
            public final /* synthetic */ C104289g f120515o;

            /* renamed from: p */
            public final /* synthetic */ C48869bk2 f120516p;

            /* renamed from: q */
            public final /* synthetic */ C8479f0<C32226l<C44426j, C13598b0>> f120517q;

            /* renamed from: r */
            public final /* synthetic */ C40480g f120518r;

            /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$o$d$a */
            public static final class C44437a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ C44408c f120519d;

                /* renamed from: e */
                public final /* synthetic */ C104289g f120520e;

                /* renamed from: f */
                public final /* synthetic */ C48869bk2 f120521f;

                /* renamed from: g */
                public final /* synthetic */ C15601d<C13604l<String, String>> f120522g;

                /* renamed from: h */
                public final /* synthetic */ C8479f0<C32226l<C44426j, C13598b0>> f120523h;

                /* renamed from: i */
                public final /* synthetic */ C40480g f120524i;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C44437a(C44408c cVar, C104289g gVar, C48869bk2 bk22, C15601d<? super C13604l<String, String>> dVar, C8479f0<C32226l<C44426j, C13598b0>> f0Var, C40480g gVar2) {
                    super(0);
                    this.f120519d = cVar;
                    this.f120520e = gVar;
                    this.f120521f = bk22;
                    this.f120522g = dVar;
                    this.f120523h = f0Var;
                    this.f120524i = gVar2;
                }

                public Object invoke() {
                    try {
                        this.f120522g.resumeWith(Result.m168114constructorimpl(C44408c.m48769b(this.f120519d, this.f120520e, this.f120521f)));
                    } catch (Exception e) {
                        if (e instanceof C44426j) {
                            ((C32226l) this.f120523h.f27484d).invoke(e);
                        } else {
                            C44408c cVar = this.f120519d;
                            C44410b bVar = C44408c.f120395e;
                            cVar.getClass();
                            this.f120524i.evaluateJavascript("WeixinWebCompt.onError(" + e.getMessage() + ')', (ValueCallback<String>) null);
                        }
                        C15601d<C13604l<String, String>> dVar = this.f120522g;
                        Result.Companion companion = Result.Companion;
                        dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(e)));
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C44436d(C44408c cVar, C53143h0 h0Var, C104289g gVar, C48869bk2 bk22, C8479f0<C32226l<C44426j, C13598b0>> f0Var, C40480g gVar2, C15601d<? super C44436d> dVar) {
                super(2, dVar);
                this.f120513j = cVar;
                this.f120514n = h0Var;
                this.f120515o = gVar;
                this.f120516p = bk22;
                this.f120517q = f0Var;
                this.f120518r = gVar2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C44436d(this.f120513j, this.f120514n, this.f120515o, this.f120516p, this.f120517q, this.f120518r, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C44436d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C44427k kVar = C44427k.STEP_GET_APP_SCRIPT;
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f120512i;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C44408c cVar = this.f120513j;
                    C53143h0 h0Var = this.f120514n;
                    C44410b bVar = C44408c.f120395e;
                    cVar.mo69185k(h0Var, kVar);
                    C44408c cVar2 = this.f120513j;
                    C104289g gVar = this.f120515o;
                    C48869bk2 bk22 = this.f120516p;
                    C8479f0<C32226l<C44426j, C13598b0>> f0Var = this.f120517q;
                    C40480g gVar2 = this.f120518r;
                    this.f120507d = cVar2;
                    this.f120508e = gVar;
                    this.f120509f = bk22;
                    this.f120510g = f0Var;
                    this.f120511h = gVar2;
                    this.f120512i = 1;
                    C66218h hVar = new C66218h(C66447b.m78392b(this));
                    C44408c.f120395e.getClass();
                    C61926c.m72659D(C44408c.f120397g, false, new C44437a(cVar2, gVar, bk22, hVar, f0Var, gVar2), 2, (Object) null);
                    obj = hVar.mo90314b();
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C40480g gVar3 = (C40480g) this.f120511h;
                    C8479f0 f0Var2 = (C8479f0) this.f120510g;
                    C48869bk2 bk23 = (C48869bk2) this.f120509f;
                    C104289g gVar4 = (C104289g) this.f120508e;
                    C44408c cVar3 = (C44408c) this.f120507d;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13604l lVar = (C13604l) obj;
                C44408c.m48768a(this.f120513j, this.f120514n, kVar);
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44432o(boolean z, C44408c cVar, C53143h0 h0Var, C48869bk2 bk22, String str, String str2, String str3, C8479f0<C32226l<C44426j, C13598b0>> f0Var, C15601d<? super C44432o> dVar) {
            super(2, dVar);
            this.f120490n = z;
            this.f120491o = cVar;
            this.f120492p = h0Var;
            this.f120493q = bk22;
            this.f120494r = str;
            this.f120495s = str2;
            this.f120496t = str3;
            this.f120497u = f0Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C44432o oVar = new C44432o(this.f120490n, this.f120491o, this.f120492p, this.f120493q, this.f120494r, this.f120495s, this.f120496t, this.f120497u, dVar);
            oVar.f120489j = obj;
            return oVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C44432o) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
            java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            	at java.base/java.util.Objects.checkIndex(Objects.java:372)
            	at java.base/java.util.ArrayList.get(ArrayList.java:458)
            	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:103:0x04f1 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x04f2  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x054a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:108:0x054b  */
        /* JADX WARNING: Removed duplicated region for block: B:111:0x0578  */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                r24 = this;
                r1 = r24
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r0 = r1.f120488i
                r3 = 2
                r4 = 3
                r5 = 4
                r7 = 1
                if (r0 == 0) goto L_0x0077
                if (r0 == r7) goto L_0x006f
                if (r0 == r3) goto L_0x0049
                if (r0 == r4) goto L_0x002d
                if (r0 != r5) goto L_0x0025
                java.lang.Object r0 = r1.f120484e
                com.tencent.mm.plugin.appbrand.jsruntime.g r0 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g) r0
                java.lang.Object r0 = r1.f120483d
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r2 = r1.f120489j
                com.tencent.mm.plugin.webview.webcompt.c r2 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c) r2
                kotlin.ResultKt.throwOnFailure(r25)
                goto L_0x054d
            L_0x0025:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r2)
                throw r0
            L_0x002d:
                java.lang.Object r0 = r1.f120486g
                com.tencent.mm.plugin.appbrand.jsruntime.g r0 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g) r0
                java.lang.Object r3 = r1.f120485f
                com.tencent.mm.plugin.appbrand.jsruntime.g r3 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g) r3
                java.lang.Object r4 = r1.f120484e
                com.tencent.mm.plugin.webview.webcompt.c$l$a r4 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44428l.C44429a) r4
                java.lang.Object r8 = r1.f120483d
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r1.f120489j
                com.tencent.mm.plugin.webview.webcompt.c r9 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c) r9
                kotlin.ResultKt.throwOnFailure(r25)
                r6 = r3
                r3 = r25
                goto L_0x04f4
            L_0x0049:
                java.lang.Object r0 = r1.f120487h
                a14.u0 r0 = (a14.C53953u0) r0
                java.lang.Object r3 = r1.f120486g
                com.tencent.mm.plugin.appbrand.jsruntime.g r3 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g) r3
                java.lang.Object r8 = r1.f120485f
                com.tencent.mm.plugin.appbrand.jsruntime.g r8 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g) r8
                java.lang.Object r9 = r1.f120484e
                com.tencent.mm.plugin.webview.webcompt.c$l$a r9 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44428l.C44429a) r9
                java.lang.Object r10 = r1.f120483d
                java.lang.String r10 = (java.lang.String) r10
                java.lang.Object r11 = r1.f120489j
                com.tencent.mm.plugin.webview.webcompt.c r11 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c) r11
                kotlin.ResultKt.throwOnFailure(r25)
                r5 = r25
                r6 = r8
                r4 = r9
                r23 = r3
                r3 = r0
                r0 = r23
                goto L_0x04a8
            L_0x006f:
                java.lang.Object r0 = r1.f120489j
                a14.n0 r0 = (a14.C0000n0) r0
                kotlin.ResultKt.throwOnFailure(r25)
                goto L_0x008b
            L_0x0077:
                kotlin.ResultKt.throwOnFailure(r25)
                java.lang.Object r0 = r1.f120489j
                a14.n0 r0 = (a14.C0000n0) r0
                com.tencent.mm.plugin.webview.webcompt.c$b r8 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r1.f120489j = r0
                r1.f120488i = r7
                java.lang.Object r8 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48780a(r8, r1)
                if (r8 != r2) goto L_0x008b
                return r2
            L_0x008b:
                r8 = r0
                boolean r0 = r1.f120490n
                if (r0 == 0) goto L_0x00de
                com.tencent.mm.plugin.webview.webcompt.c r0 = r1.f120491o
                wc3.h0 r9 = r1.f120492p
                com.tencent.mm.plugin.webview.webcompt.c$b r10 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                com.tencent.mm.plugin.webview.webcompt.c$k r10 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44427k.STEP_EVAL_MAIN_FRAME
                r0.mo69185k(r9, r10)
                com.tencent.mm.plugin.webview.webcompt.c$b r10 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                com.tencent.mm.plugin.webview.webcompt.c$b$b r11 = r10.mo69190h()
                java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$d> r11 = r11.f120423b
                java.lang.String r12 = "/wxtags.js"
                java.lang.String r11 = r10.mo69191i(r12, r11)
                com.tencent.mm.plugin.webview.webcompt.q r12 = new com.tencent.mm.plugin.webview.webcompt.q
                r12.<init>(r0, r9)
                com.tencent.mm.plugin.webview.webcompt.o r9 = new com.tencent.mm.plugin.webview.webcompt.o
                r9.<init>(r0, r11, r12)
                o40.C61926c.m72668M(r9)
                java.lang.String r9 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.String r11 = "launchMainFrame"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r11)
                com.tencent.mm.plugin.webview.webcompt.y r9 = r0.f120410b
                com.tencent.mm.plugin.webview.webcompt.c$b$b r10 = r10.mo69190h()
                com.tencent.mm.plugin.webview.webcompt.c$b$c r10 = r10.f120424c
                int[] r11 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44430m.f120480a
                int r10 = r10.ordinal()
                r10 = r11[r10]
                if (r10 != r7) goto L_0x00d2
                com.tencent.mm.plugin.webview.webcompt.b r10 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.PKG_SCRIPT_FROM_PACKAGE
                goto L_0x00d4
            L_0x00d2:
                com.tencent.mm.plugin.webview.webcompt.b r10 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.PKG_SCRIPT_FROM_ASSESTS
            L_0x00d4:
                r9.mo69224a(r10)
                com.tencent.mm.plugin.webview.webcompt.y r0 = r0.f120410b
                com.tencent.mm.plugin.webview.webcompt.b r9 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.EVAL_MAIN_FRAME
                r0.mo69224a(r9)
            L_0x00de:
                c30.g r15 = new c30.g
                r15.<init>()
                java.lang.String r0 = r1.f120496t
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                java.lang.String r10 = "debug"
                boolean r9 = r9.containsKey(r10)
                r11 = 0
                if (r9 == 0) goto L_0x00fb
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                boolean r9 = r9.getBoolean(r10, r11)
                goto L_0x0107
            L_0x00fb:
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r9 != 0) goto L_0x0106
                boolean r9 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r9 == 0) goto L_0x0104
                goto L_0x0106
            L_0x0104:
                r9 = 0
                goto L_0x0107
            L_0x0106:
                r9 = 1
            L_0x0107:
                if (r9 == 0) goto L_0x018c
                java.lang.String r9 = "#"
                java.lang.String r16 = z04.C112550d0.m153794d0(r0, r9, r0)
                java.lang.String r0 = "&"
                java.lang.String[] r17 = new java.lang.String[]{r0}
                r18 = 0
                r19 = 0
                r20 = 6
                r21 = 0
                java.util.List r0 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
                java.util.Iterator r9 = r0.iterator()
            L_0x0125:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto L_0x018c
                java.lang.Object r0 = r9.next()
                r16 = r0
                java.lang.String r16 = (java.lang.String) r16
                java.lang.String r0 = "="
                java.lang.String[] r17 = new java.lang.String[]{r0}
                r18 = 0
                r19 = 0
                r20 = 6
                r21 = 0
                java.util.List r10 = z04.C112550d0.m153785U(r16, r17, r18, r19, r20, r21)
                int r0 = r10.size()
                if (r0 != r3) goto L_0x0125
                java.lang.Object r0 = r10.get(r11)     // Catch:{ Exception -> 0x0161 }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0161 }
                java.lang.Object r12 = r10.get(r7)     // Catch:{ Exception -> 0x0161 }
                java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x0161 }
                java.lang.String r13 = "UTF-8"
                java.lang.String r12 = java.net.URLDecoder.decode(r12, r13)     // Catch:{ Exception -> 0x0161 }
                r15.put(r0, r12)     // Catch:{ Exception -> 0x0161 }
                goto L_0x0125
            L_0x0161:
                r0 = move-exception
                com.tencent.mm.plugin.webview.webcompt.c$b r12 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r12.getClass()
                java.lang.String r12 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                java.lang.String r14 = "parse paramsObject '"
                r13.append(r14)
                java.lang.Object r10 = r10.get(r11)
                java.lang.String r10 = (java.lang.String) r10
                r13.append(r10)
                java.lang.String r10 = "' exception: "
                r13.append(r10)
                r13.append(r0)
                java.lang.String r0 = r13.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                goto L_0x0125
            L_0x018c:
                java.lang.String r0 = r1.f120494r
                java.lang.String r9 = r1.f120495s
                java.lang.String r10 = r1.f120496t
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                java.lang.String r13 = "debug"
                boolean r12 = r12.containsKey(r13)
                if (r12 == 0) goto L_0x01a7
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                boolean r12 = r12.getBoolean(r13, r11)
                goto L_0x01b3
            L_0x01a7:
                boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
                if (r12 != 0) goto L_0x01b2
                boolean r12 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
                if (r12 == 0) goto L_0x01b0
                goto L_0x01b2
            L_0x01b0:
                r12 = 0
                goto L_0x01b3
            L_0x01b2:
                r12 = 1
            L_0x01b3:
                if (r12 == 0) goto L_0x0211
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r12 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
                java.lang.String r13 = "debugA8Key"
                java.lang.String r14 = ""
                java.lang.String r12 = r12.getString(r13, r14)
                gy3.C87412m.m108591d(r12)
                boolean r13 = z04.C112551y.m153811k(r12)
                r13 = r13 ^ r7
                if (r13 == 0) goto L_0x01d3
                rx3.l r13 = new rx3.l
                com.tencent.mm.plugin.webview.webcompt.c$b$a r14 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.COMMAND
                r13.<init>(r12, r14)
                goto L_0x01ea
            L_0x01d3:
                java.lang.String r12 = "debugA8Key"
                boolean r12 = r15.has(r12)
                if (r12 == 0) goto L_0x01e9
                rx3.l r13 = new rx3.l
                java.lang.String r12 = "debugA8Key"
                java.lang.String r12 = r15.getString(r12)
                com.tencent.mm.plugin.webview.webcompt.c$b$a r14 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.PARAM
                r13.<init>(r12, r14)
                goto L_0x01ea
            L_0x01e9:
                r13 = 0
            L_0x01ea:
                if (r13 == 0) goto L_0x0211
                A r0 = r13.f38555d
                java.lang.String r0 = (java.lang.String) r0
                B r9 = r13.f38556e
                r19 = r9
                com.tencent.mm.plugin.webview.webcompt.c$b$a r19 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a) r19
                com.tencent.mm.plugin.webview.webcompt.c$b r9 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                com.tencent.mm.plugin.webview.webcompt.c$b$b r9 = r9.mo69190h()
                java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$d> r9 = r9.f120423b
                com.tencent.mm.plugin.webview.webcompt.c$b$d r10 = new com.tencent.mm.plugin.webview.webcompt.c$b$d
                r18 = 0
                r20 = 2
                r21 = 0
                r16 = r10
                r17 = r0
                r16.<init>(r17, r18, r19, r20, r21)
                r9.add(r10)
                goto L_0x0244
            L_0x0211:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                com.tencent.mm.plugin.webview.webcompt.c$b r13 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r13.getClass()
                java.lang.String r13 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120396f
                r12.append(r13)
                r12.append(r0)
                java.lang.String r0 = "?appId="
                r12.append(r0)
                r12.append(r9)
                java.lang.String r0 = "&src="
                r12.append(r0)
                java.util.HashMap<java.lang.String, java.lang.Integer> r0 = com.tencent.p014mm.plugin.webview.webcompt.C44404a.f120354a
                java.lang.String r0 = "<this>"
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "UTF-8"
                java.lang.String r0 = p206nj.C117627q.m165909b(r10, r0)
                r12.append(r0)
                java.lang.String r0 = r12.toString()
            L_0x0244:
                com.tencent.mm.plugin.webview.webcompt.c$b r9 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r9.getClass()
                java.lang.String r10 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "createJsContext a8key:"
                r12.append(r13)
                r12.append(r0)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r12)
                com.tencent.mm.plugin.webview.webcompt.c r12 = r1.f120491o
                wc3.h0 r13 = r1.f120492p
                com.tencent.mm.plugin.webview.webcompt.c$k r14 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44427k.STEP_CREATE_JS_CXT
                com.tencent.p014mm.plugin.webview.webcompt.C44408c.m48768a(r12, r13, r14)
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "createJsContext init "
                r12.append(r13)
                java.lang.String r13 = r1.f120494r
                r12.append(r13)
                java.lang.String r12 = r12.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r12)
                com.tencent.mm.plugin.webview.webcompt.c r12 = r1.f120491o
                wc3.h0 r13 = r1.f120492p
                com.tencent.mm.plugin.webview.webcompt.c$k r14 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44427k.STEP_FETCH_WORKER
                r12.mo69185k(r13, r14)
                com.tencent.mm.plugin.webview.webcompt.c r12 = r1.f120491o
                com.tencent.mm.plugin.webview.webcompt.c$l r12 = r12.mo69184j()
                java.lang.String r13 = r1.f120495s
                te3.bk2 r5 = r1.f120493q
                com.tencent.mm.plugin.webview.webcompt.c r4 = r1.f120491o
                monitor-enter(r12)
                java.lang.String r3 = "appId"
                gy3.C87412m.m108594g(r13, r3)     // Catch:{ all -> 0x0582 }
                java.lang.String r3 = "webComptInfo"
                gy3.C87412m.m108594g(r5, r3)     // Catch:{ all -> 0x0582 }
                java.lang.String r3 = "webCompt"
                gy3.C87412m.m108594g(r4, r3)     // Catch:{ all -> 0x0582 }
                java.lang.String r3 = r5.f131168d     // Catch:{ all -> 0x0582 }
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.webcompt.c$l$a> r11 = r12.f120466g     // Catch:{ all -> 0x0582 }
                boolean r11 = r11.containsKey(r3)     // Catch:{ all -> 0x0582 }
                if (r11 == 0) goto L_0x02ef
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.webcompt.c$l$a> r11 = r12.f120466g     // Catch:{ all -> 0x0582 }
                java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$l$a r11 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44428l.C44429a) r11     // Catch:{ all -> 0x0582 }
                if (r11 == 0) goto L_0x02ef
                java.lang.String r6 = r11.f120473g     // Catch:{ all -> 0x0582 }
                boolean r6 = gy3.C87412m.m108589b(r6, r13)     // Catch:{ all -> 0x0582 }
                if (r6 == 0) goto L_0x02ef
                java.util.HashMap<java.lang.String, com.tencent.mm.plugin.webview.webcompt.c$l$a> r4 = r12.f120466g     // Catch:{ all -> 0x0582 }
                r4.remove(r3)     // Catch:{ all -> 0x0582 }
                java.lang.String r4 = "webComptName"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0582 }
                r12.put(r3, r11)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r3 = r9.mo69190h()     // Catch:{ all -> 0x0582 }
                java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$f> r3 = r3.f120422a     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$b$f r4 = new com.tencent.mm.plugin.webview.webcompt.c$b$f     // Catch:{ all -> 0x0582 }
                int r5 = r12.f120463d     // Catch:{ all -> 0x0582 }
                r18 = 0
                r19 = 1
                r20 = 2
                r21 = 0
                r16 = r4
                r17 = r5
                r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0582 }
                r3.add(r4)     // Catch:{ all -> 0x0582 }
                monitor-exit(r12)
            L_0x02ec:
                r3 = r11
                goto L_0x0387
            L_0x02ef:
                int r6 = r12.f120464e     // Catch:{ all -> 0x0582 }
                r11 = -1
                if (r6 == r11) goto L_0x02f6
                r6 = 1
                goto L_0x02f7
            L_0x02f6:
                r6 = 0
            L_0x02f7:
                if (r6 != r7) goto L_0x0313
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0582 }
                r13.<init>()     // Catch:{ all -> 0x0582 }
                java.lang.String r11 = "use preload workerManager#"
                r13.append(r11)     // Catch:{ all -> 0x0582 }
                int r11 = r12.f120463d     // Catch:{ all -> 0x0582 }
                r13.append(r11)     // Catch:{ all -> 0x0582 }
                java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0582 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$b$f r11 = r12.f120465f     // Catch:{ all -> 0x0582 }
                goto L_0x033c
            L_0x0313:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0582 }
                r11.<init>()     // Catch:{ all -> 0x0582 }
                java.lang.String r13 = "create new workerManager#"
                r11.append(r13)     // Catch:{ all -> 0x0582 }
                int r13 = r12.f120463d     // Catch:{ all -> 0x0582 }
                r11.append(r13)     // Catch:{ all -> 0x0582 }
                java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0582 }
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$b$f r11 = new com.tencent.mm.plugin.webview.webcompt.c$b$f     // Catch:{ all -> 0x0582 }
                int r13 = r12.f120463d     // Catch:{ all -> 0x0582 }
                r19 = 0
                r20 = 4
                r21 = 0
                r16 = r11
                r17 = r13
                r18 = r6
                r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0582 }
            L_0x033c:
                com.tencent.mm.plugin.webview.webcompt.c$b$b r13 = r9.mo69190h()     // Catch:{ all -> 0x0582 }
                java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$f> r13 = r13.f120422a     // Catch:{ all -> 0x0582 }
                r13.add(r11)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.webview.webcompt.c$b$b r13 = r9.mo69190h()     // Catch:{ all -> 0x0582 }
                r13.f120425d = r6     // Catch:{ all -> 0x0582 }
                if (r6 != r7) goto L_0x0350
                int r6 = r12.f120464e     // Catch:{ all -> 0x0582 }
                goto L_0x0373
            L_0x0350:
                com.tencent.mm.plugin.webview.webcompt.k r6 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48781b(r9)     // Catch:{ all -> 0x0582 }
                java.lang.String r13 = "/wxwebcompt.js"
                java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$d> r11 = r11.f120441d     // Catch:{ all -> 0x0582 }
                java.lang.String r9 = r9.mo69191i(r13, r11)     // Catch:{ all -> 0x0582 }
                r6.getClass()     // Catch:{ all -> 0x0582 }
                java.lang.String r11 = "script"
                gy3.C87412m.m108594g(r9, r11)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.appbrand.jsruntime.g r6 = r6.mo115378X()     // Catch:{ all -> 0x0582 }
                r11 = r6
                com.tencent.mm.plugin.appbrand.jsruntime.d r11 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83148d) r11     // Catch:{ all -> 0x0582 }
                r13 = 0
                r11.evaluateJavascript(r9, r13)     // Catch:{ all -> 0x0582 }
                com.tencent.mm.plugin.appbrand.jsruntime.f r6 = (com.tencent.p014mm.plugin.appbrand.jsruntime.C83161f) r6     // Catch:{ all -> 0x0582 }
                int r6 = r6.f242978h     // Catch:{ all -> 0x0582 }
            L_0x0373:
                com.tencent.mm.plugin.webview.webcompt.c$l$a r11 = new com.tencent.mm.plugin.webview.webcompt.c$l$a     // Catch:{ all -> 0x0582 }
                r11.<init>(r12, r6, r5, r4)     // Catch:{ all -> 0x0582 }
                r4 = -1
                r12.f120464e = r4     // Catch:{ all -> 0x0582 }
                java.lang.String r4 = "webComptName"
                gy3.C87412m.m108593f(r3, r4)     // Catch:{ all -> 0x0582 }
                r12.put(r3, r11)     // Catch:{ all -> 0x0582 }
                monitor-exit(r12)
                goto L_0x02ec
            L_0x0387:
                com.tencent.mm.plugin.webview.webcompt.c r4 = r1.f120491o
                wc3.h0 r5 = r1.f120492p
                java.lang.String r6 = r1.f120496t
                java.lang.String r9 = r1.f120495s
                te3.bk2 r13 = r1.f120493q
                gy3.f0<fy3.l<com.tencent.mm.plugin.webview.webcompt.c$j, rx3.b0>> r12 = r1.f120497u
                java.lang.String r11 = r1.f120494r
                com.tencent.p014mm.plugin.webview.webcompt.C44408c.m48768a(r4, r5, r14)
                java.lang.String r14 = "<set-?>"
                gy3.C87412m.m108594g(r6, r14)
                r3.f120474h = r6
                r3.f120478l = r5
                java.lang.String r6 = "appId"
                gy3.C87412m.m108594g(r9, r6)
                boolean r6 = r3.f120472f
                if (r6 == 0) goto L_0x03e1
                java.lang.String r6 = r3.f120473g
                boolean r6 = gy3.C87412m.m108589b(r6, r9)
                if (r6 == 0) goto L_0x03e1
                r6 = 0
                r3.f120472f = r6
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r14 = "WebComptWorker.reuse "
                r6.append(r14)
                r6.append(r9)
                r14 = 64
                r6.append(r14)
                te3.bk2 r14 = r3.f120468b
                java.lang.String r14 = r14.f131168d
                r6.append(r14)
                r14 = 58
                r6.append(r14)
                int r14 = r3.f120467a
                r6.append(r14)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
                r6 = 1
                goto L_0x03e2
            L_0x03e1:
                r6 = 0
            L_0x03e2:
                if (r6 == 0) goto L_0x03ff
                com.tencent.mm.plugin.appbrand.jsruntime.g r17 = r3.mo69209a()
                long r2 = r5.f148278a
                r21 = 1
                r16 = r4
                r18 = r13
                r19 = r2
                r16.mo69178c(r17, r18, r19, r21)
                com.tencent.mm.plugin.webview.webcompt.y r0 = r4.f120410b
                com.tencent.mm.plugin.webview.webcompt.b r2 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.RECYCLE_JS_CXT_USE
                r0.mo69224a(r2)
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x03ff:
                r3.f120473g = r9
                java.lang.String r6 = "<set-?>"
                gy3.C87412m.m108594g(r0, r6)
                r3.f120475i = r0
                java.lang.String r6 = r13.f131170f
                java.lang.String r9 = "webCompt.md5"
                gy3.C87412m.m108593f(r6, r9)
                r3.f120477k = r6
                java.lang.String r6 = r13.f131169e
                java.lang.String r9 = "webCompt.url"
                gy3.C87412m.m108593f(r6, r9)
                r3.f120476j = r6
                com.tencent.mm.plugin.appbrand.jsruntime.g r6 = r3.mo69209a()
                com.tencent.mm.plugin.webview.webcompt.c$o$a r9 = new com.tencent.mm.plugin.webview.webcompt.c$o$a
                r9.<init>(r11, r4)
                r6.setJsExceptionHandler(r9)
                com.tencent.mm.plugin.webview.webcompt.c$o$b r9 = new com.tencent.mm.plugin.webview.webcompt.c$o$b
                r9.<init>(r4, r6)
                r12.f27484d = r9
                long r9 = r5.f148278a
                r21 = 0
                r16 = r4
                r17 = r6
                r18 = r13
                r19 = r9
                r16.mo69178c(r17, r18, r19, r21)
                wx3.f r10 = r8.getCoroutineContext()
                r14 = 0
                com.tencent.mm.plugin.webview.webcompt.c$o$c r22 = new com.tencent.mm.plugin.webview.webcompt.c$o$c
                r21 = 0
                r16 = r22
                r17 = r4
                r18 = r5
                r19 = r0
                r20 = r13
                r16.<init>(r17, r18, r19, r20, r21)
                r0 = 2
                r16 = 0
                r9 = r8
                r7 = r11
                r11 = r14
                r17 = r12
                r12 = r22
                r19 = r13
                r13 = r0
                r14 = r16
                a14.u0 r0 = a14.C53895h.m60464b(r9, r10, r11, r12, r13, r14)
                wx3.f r20 = r8.getCoroutineContext()
                com.tencent.mm.plugin.webview.webcompt.c$o$d r22 = new com.tencent.mm.plugin.webview.webcompt.c$o$d
                r9 = 0
                r10 = r22
                r11 = r4
                r12 = r5
                r13 = r15
                r14 = r19
                r15 = r17
                r16 = r6
                r17 = r9
                r10.<init>(r11, r12, r13, r14, r15, r16, r17)
                r13 = 2
                r14 = 0
                r9 = r8
                r10 = r20
                r11 = r21
                r12 = r22
                a14.u0 r5 = a14.C53895h.m60464b(r9, r10, r11, r12, r13, r14)
                r1.f120489j = r4
                r1.f120483d = r7
                r1.f120484e = r3
                r1.f120485f = r6
                r1.f120486g = r6
                r1.f120487h = r0
                r8 = 2
                r1.f120488i = r8
                a14.v0 r5 = (a14.C53957v0) r5
                java.lang.Object r5 = r5.mo74549z(r1)
                if (r5 != r2) goto L_0x04a3
                return r2
            L_0x04a3:
                r11 = r4
                r10 = r7
                r4 = r3
                r3 = r0
                r0 = r6
            L_0x04a8:
                rx3.l r5 = (rx3.C13604l) r5
                A r7 = r5.f38555d
                java.lang.String r7 = (java.lang.String) r7
                B r5 = r5.f38556e
                java.lang.String r5 = (java.lang.String) r5
                r4.getClass()
                java.lang.String r8 = "<set-?>"
                gy3.C87412m.m108594g(r7, r8)
                r4.f120476j = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "(function(WeixinWebCompt){"
                r7.append(r8)
                r7.append(r5)
                java.lang.String r5 = "})(WeixinWebCompt);"
                r7.append(r5)
                java.lang.String r5 = r7.toString()
                com.tencent.mm.plugin.webview.webcompt.c$b r7 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r11.getClass()
                r7 = 0
                r0.evaluateJavascript(r5, r7)
                r1.f120489j = r11
                r1.f120483d = r10
                r1.f120484e = r4
                r1.f120485f = r6
                r1.f120486g = r0
                r1.f120487h = r7
                r5 = 3
                r1.f120488i = r5
                java.lang.Object r3 = r3.mo74634A(r1)
                if (r3 != r2) goto L_0x04f2
                return r2
            L_0x04f2:
                r8 = r10
                r9 = r11
            L_0x04f4:
                com.tencent.mm.plugin.webview.webcompt.c$a r3 = (com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44409a) r3
                com.tencent.mm.plugin.webview.webcompt.x r5 = r4.f120479m
                d93.c r7 = r3.f120413a
                java.lang.String r10 = r3.f120414b
                com.tencent.mm.protocal.JsapiPermissionWrapper r7 = r7.mo70841g(r10)
                gy3.C87412m.m108591d(r7)
                r5.getClass()
                r5.f120560c = r7
                com.tencent.mm.plugin.webview.webcompt.c$b r5 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r9.getClass()
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r7 = "WeixinWebCompt.launch("
                r5.append(r7)
                java.lang.String r3 = r9.mo69186l(r3)
                r5.append(r3)
                java.lang.String r3 = ");"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r5 = 0
                r0.evaluateJavascript(r3, r5)
                java.lang.String r0 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.String r3 = "WeixinWebCompt.launch"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
                r3 = 1
                r4.f120471e = r3
                r3 = 1000(0x3e8, double:4.94E-321)
                r1.f120489j = r9
                r1.f120483d = r8
                r1.f120484e = r6
                r1.f120485f = r5
                r1.f120486g = r5
                r5 = 4
                r1.f120488i = r5
                java.lang.Object r0 = a14.C53965x0.m60607b(r3, r1)
                if (r0 != r2) goto L_0x054b
                return r2
            L_0x054b:
                r0 = r8
                r2 = r9
            L_0x054d:
                com.tencent.mm.plugin.webview.webcompt.c$b r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120395e
                r4 = 1
                r3.mo69194l(r4)
                com.tencent.mm.plugin.webview.webcompt.y r4 = r2.f120410b
                com.tencent.mm.plugin.webview.webcompt.b r5 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.PRELOAD_JS_CONTEXT
                r4.mo69224a(r5)
                java.lang.String r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.f120397g
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "createJsContext init finish "
                r5.append(r6)
                r5.append(r0)
                java.lang.String r0 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
                com.tencent.mm.plugin.webview.webcompt.c$b$b r0 = r3.mo69190h()
                boolean r0 = r0.f120425d
                if (r0 == 0) goto L_0x057f
                com.tencent.mm.plugin.webview.webcompt.y r0 = r2.f120410b
                com.tencent.mm.plugin.webview.webcompt.b r2 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.PRELOAD_JS_CONTEXT_USE
                r0.mo69224a(r2)
            L_0x057f:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            L_0x0582:
                r0 = move-exception
                monitor-exit(r12)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44432o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$p */
    public static final class C44438p extends C87413o implements C32226l<C44426j, C13598b0> {

        /* renamed from: d */
        public static final C44438p f120525d = new C44438p();

        public C44438p() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C44426j) obj, LocaleUtil.ITALIAN);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$q */
    public static final class C44439q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C44408c f120526d;

        /* renamed from: e */
        public final /* synthetic */ String f120527e;

        /* renamed from: f */
        public final /* synthetic */ String f120528f;

        /* renamed from: g */
        public final /* synthetic */ String f120529g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44439q(C44408c cVar, String str, String str2, String str3) {
            super(0);
            this.f120526d = cVar;
            this.f120527e = str;
            this.f120528f = str2;
            this.f120529g = str3;
        }

        public Object invoke() {
            C40480g f = this.f120526d.mo69181f(this.f120527e);
            if (f != null) {
                this.f120526d.getClass();
                f.evaluateJavascript("WeixinWebCompt._dispatch('" + this.f120528f + "', " + this.f120529g + ')', (ValueCallback<String>) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$r */
    public static final class C44440r implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C44408c f120530a;

        public C44440r(C44408c cVar) {
            this.f120530a = cVar;
        }

        /* renamed from: a */
        public final void mo288a(int i, int i2, String str, C47350c cVar) {
            if (i != 0 || i2 != 0) {
                this.f120530a.f120410b.mo69224a(C44406b.REQUEST_JS_ERR_REPORT_ERR);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$s */
    public static final class C44441s implements C45297a<C52018xt1> {

        /* renamed from: a */
        public final /* synthetic */ C15601d<C44409a> f120531a;

        /* renamed from: b */
        public final /* synthetic */ C45298c f120532b;

        /* renamed from: c */
        public final /* synthetic */ C44408c f120533c;

        /* renamed from: d */
        public final /* synthetic */ String f120534d;

        public C44441s(C15601d<? super C44409a> dVar, C45298c cVar, C44408c cVar2, String str) {
            this.f120531a = dVar;
            this.f120532b = cVar;
            this.f120533c = cVar2;
            this.f120534d = str;
        }

        /* renamed from: A */
        public void mo63661A(int i, String str, int i2, int i3, String str2) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "errMsg");
            C15601d<C44409a> dVar = this.f120531a;
            Result.Companion companion = Result.Companion;
            String str3 = this.f120534d;
            dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(new C44426j(20001, str3, "getA8Key error:" + i2 + ", " + i3 + ", " + str2))));
            this.f120533c.f120410b.mo69224a(C44406b.GET_A8KEY_ERR);
        }

        /* renamed from: B */
        public void mo65764B(int i, String str) {
            C87412m.m108594g(str, "reqUrl");
        }

        /* renamed from: D */
        public void mo65765D(int i, String str) {
            C87412m.m108594g(str, "reqUrl");
        }

        /* renamed from: j */
        public void mo63682j(int i, String str, String str2, Object obj) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            C87412m.m108594g((C52018xt1) obj, "response");
        }

        /* renamed from: k */
        public boolean mo65766k(int i, String str, Object obj) {
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g((C52018xt1) obj, "response");
            return false;
        }

        /* renamed from: l */
        public void mo65767l(int i, boolean z, String str, String str2, Object obj) {
            C52018xt1 xt12 = (C52018xt1) obj;
            C87412m.m108594g(str, "reqUrl");
            C87412m.m108594g(str2, "fullUrl");
            C87412m.m108594g(xt12, "response");
            C44408c.f120395e.getClass();
            String str3 = C44408c.f120397g;
            Log.m105924i(str3, "finish geta8key:" + str2);
            C15601d<C44409a> dVar = this.f120531a;
            C45298c cVar = this.f120532b;
            LinkedList<C48857bh2> linkedList = xt12.f144958x;
            C87412m.m108593f(linkedList, "response.HttpHeader");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (C48857bh2 bh22 : linkedList) {
                arrayList.add(new C13604l(bh22.f131120d, bh22.f131121e));
            }
            HashMap hashMap = new HashMap();
            C90364q0.m113153l(arrayList, hashMap);
            dVar.resumeWith(Result.m168114constructorimpl(new C44409a(cVar, str2, hashMap)));
            this.f120533c.f120410b.mo69224a(C44406b.GET_A8KEY_SUCC);
        }

        /* renamed from: r */
        public void mo65768r(int i, String str, String str2) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$t */
    public static final class C44442t extends C87413o implements C32224a<C44428l> {

        /* renamed from: d */
        public final /* synthetic */ C44408c f120535d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44442t(C44408c cVar) {
            super(0);
            this.f120535d = cVar;
        }

        public Object invoke() {
            C44428l poll = C44408c.f120405o.poll();
            if (poll == null) {
                poll = new C44428l();
            }
            this.f120535d.f120411c = true;
            return poll;
        }
    }

    public C44408c(WeakReference<C48590l> weakReference) {
        C87412m.m108594g(weakReference, "weakJsapi");
        this.f120409a = weakReference;
        C44410b.C44412b h = f120395e.mo69190h();
        h.f120422a.clear();
        h.f120423b.clear();
        this.f120412d = C36568h.m40985a(new C44442t(this));
    }

    /* renamed from: a */
    public static final void m48768a(C44408c cVar, C53143h0 h0Var, C44427k kVar) {
        cVar.getClass();
        h0Var.mo73829a(kVar.f120462d + "_END", System.currentTimeMillis());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x017d, code lost:
        if (r1 != null) goto L_0x02fb;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final rx3.C13604l m48769b(com.tencent.p014mm.plugin.webview.webcompt.C44408c r21, c30.C104289g r22, te3.C48869bk2 r23) {
        /*
            r0 = r21
            r1 = r22
            r10 = r23
            com.tencent.mm.plugin.webview.webcompt.c$b$a r7 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.PARAM
            com.tencent.mm.plugin.webview.webcompt.y r2 = r0.f120410b
            com.tencent.mm.plugin.webview.webcompt.b r3 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.LOAD_APP_SCRIPT
            r2.mo69224a(r3)
            java.lang.String r11 = f120397g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "start getappscript:"
            r2.append(r3)
            java.lang.String r3 = r10.f131168d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r2)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            java.lang.String r3 = "debug"
            boolean r2 = r2.containsKey(r3)
            r12 = 0
            r13 = 1
            if (r2 == 0) goto L_0x003e
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            boolean r2 = r2.getBoolean(r3, r12)
            goto L_0x004a
        L_0x003e:
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r2 != 0) goto L_0x0049
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r2 = 0
            goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            r14 = 0
            java.lang.String r15 = ".js"
            if (r2 == 0) goto L_0x0181
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.plugin.webview.webcompt.C6612w.m6920a()
            java.lang.String r3 = "debugJS"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)
            gy3.C87412m.m108591d(r2)
            boolean r4 = z04.C112551y.m153811k(r2)
            r4 = r4 ^ r13
            if (r4 == 0) goto L_0x007f
            java.net.URL r1 = new java.net.URL
            r1.<init>(r2)
            r5 = 100101(0x18705, float:1.40271E-40)
            r6 = 0
            com.tencent.mm.plugin.webview.webcompt.c$b$a r7 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.COMMAND
            r8 = 16
            r9 = 0
            java.lang.String r4 = "command debug"
            r2 = r21
            r3 = r23
            rx3.l r1 = m48770i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x017d
        L_0x007f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "debugJS_"
            r2.append(r4)
            java.lang.String r5 = r10.f131168d
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            boolean r2 = r1.has(r2)
            if (r2 == 0) goto L_0x00d7
            java.net.URL r2 = new java.net.URL
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = r10.f131168d
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.getString(r3)
            r2.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "param debugJS_"
            r1.append(r3)
            java.lang.String r3 = r10.f131168d
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r5 = 100102(0x18706, float:1.40273E-40)
            r6 = 0
            r8 = 16
            r9 = 0
            r1 = r2
            r2 = r21
            r3 = r23
            rx3.l r1 = m48770i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x017d
        L_0x00d7:
            boolean r2 = r1.has(r3)
            if (r2 == 0) goto L_0x00fa
            java.net.URL r2 = new java.net.URL
            java.lang.String r1 = r1.getString(r3)
            r2.<init>(r1)
            r5 = 100103(0x18707, float:1.40274E-40)
            r6 = 0
            r8 = 16
            r9 = 0
            java.lang.String r4 = "param debugJS"
            r1 = r2
            r2 = r21
            r3 = r23
            rx3.l r1 = m48770i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x017d
        L_0x00fa:
            com.tencent.mm.plugin.webview.webcompt.c$b r1 = f120395e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f131168d
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r1.mo69189g(r2)
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)
            java.lang.String r3 = r2.getPath()
            if (r3 == 0) goto L_0x0135
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r12, r12)
            java.lang.String r4 = r2.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0135
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r3)
            android.net.Uri r2 = r2.build()
        L_0x0135:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r2 = r3.mo177799l(r2, r14)
            boolean r3 = r2.mo177810a()
            if (r3 != 0) goto L_0x0143
            r2 = 0
            goto L_0x014b
        L_0x0143:
            com.tencent.mm.vfs.FileSystem$c r3 = r2.f348991a
            java.lang.String r2 = r2.f348992b
            boolean r2 = r3.mo119948x(r2)
        L_0x014b:
            if (r2 == 0) goto L_0x017c
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.f131168d
            r3.append(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = r1.mo69189g(r3)
            r2.<init>((java.lang.String) r1)
            r5 = 100104(0x18708, float:1.40276E-40)
            r6 = 0
            com.tencent.mm.plugin.webview.webcompt.c$b$a r7 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44411a.SDCARD
            r8 = 16
            r9 = 0
            java.lang.String r4 = "sdcard debug"
            r1 = r2
            r2 = r21
            r3 = r23
            rx3.l r1 = m48770i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x017d
        L_0x017c:
            r1 = r14
        L_0x017d:
            if (r1 == 0) goto L_0x0181
            goto L_0x02fb
        L_0x0181:
            java.lang.String r1 = r10.f131169e
            if (r1 == 0) goto L_0x018e
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x018c
            goto L_0x018e
        L_0x018c:
            r1 = 0
            goto L_0x018f
        L_0x018e:
            r1 = 1
        L_0x018f:
            java.lang.String r2 = "webCompt.name"
            if (r1 != 0) goto L_0x03ab
            java.lang.String r1 = r10.f131170f
            if (r1 == 0) goto L_0x01a1
            boolean r1 = z04.C112551y.m153811k(r1)
            if (r1 == 0) goto L_0x019f
            goto L_0x01a1
        L_0x019f:
            r1 = 0
            goto L_0x01a2
        L_0x01a1:
            r1 = 1
        L_0x01a2:
            if (r1 != 0) goto L_0x03ab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.tencent.mm.plugin.webview.webcompt.c$b r3 = f120395e
            java.lang.String r4 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48782c(r3, r10)
            r1.append(r4)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
            java.lang.String r4 = r1.getPath()
            if (r4 == 0) goto L_0x01dd
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r12, r12)
            java.lang.String r5 = r1.getPath()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x01dd
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r4)
            android.net.Uri r1 = r1.build()
        L_0x01dd:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r1, r14)
            boolean r5 = r1.mo177810a()
            if (r5 != 0) goto L_0x01eb
            r1 = 0
            goto L_0x01f3
        L_0x01eb:
            com.tencent.mm.vfs.FileSystem$c r5 = r1.f348991a
            java.lang.String r1 = r1.f348992b
            boolean r1 = r5.mo119948x(r1)
        L_0x01f3:
            if (r1 == 0) goto L_0x0228
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48782c(r3, r10)
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>((java.lang.String) r2)
            r5 = 21004(0x520c, float:2.9433E-41)
            com.tencent.mm.plugin.webview.webcompt.c$b$c r6 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44413c.CACHE
            r7 = 0
            r8 = 32
            r9 = 0
            java.lang.String r4 = "cache file"
            r2 = r21
            r3 = r23
            rx3.l r1 = m48770i(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.webview.webcompt.y r0 = r0.f120410b
            com.tencent.mm.plugin.webview.webcompt.b r2 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.APP_SCRIPT_FROM_CACHE
            r0.mo69224a(r2)
            goto L_0x02fb
        L_0x0228:
            java.net.URL r1 = new java.net.URL
            java.lang.String r5 = r10.f131169e
            r1.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "createJsContext appScript url:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r5)
            java.io.InputStream r5 = r1.openStream()     // Catch:{ Exception -> 0x0380 }
            java.lang.String r6 = "input"
            gy3.C87412m.m108593f(r5, r6)     // Catch:{ all -> 0x0377 }
            byte[] r6 = cy3.C86147a.m106661c(r5)     // Catch:{ all -> 0x0377 }
            java.lang.String r7 = r10.f131170f     // Catch:{ all -> 0x0377 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0377 }
            r8.<init>(r6)     // Catch:{ all -> 0x0377 }
            int r9 = r6.length     // Catch:{ all -> 0x0377 }
            java.lang.String r8 = p823sg.C90193h.m112874b(r8, r9)     // Catch:{ all -> 0x0377 }
            boolean r7 = gy3.C87412m.m108589b(r7, r8)     // Catch:{ all -> 0x0377 }
            if (r7 == 0) goto L_0x0352
            com.tencent.mm.vfs.m1 r7 = new com.tencent.mm.vfs.m1     // Catch:{ all -> 0x0377 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0377 }
            r8.<init>()     // Catch:{ all -> 0x0377 }
            java.lang.String r9 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.m48782c(r3, r10)     // Catch:{ all -> 0x0377 }
            r8.append(r9)     // Catch:{ all -> 0x0377 }
            r8.append(r15)     // Catch:{ all -> 0x0377 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0377 }
            r7.<init>((java.lang.String) r8)     // Catch:{ all -> 0x0377 }
            java.lang.String r8 = r7.mo119973k()     // Catch:{ all -> 0x0377 }
            gy3.C87412m.m108591d(r8)     // Catch:{ all -> 0x0377 }
            android.net.Uri r8 = com.tencent.p014mm.vfs.C116299g2.m163858n(r8)     // Catch:{ all -> 0x0377 }
            java.lang.String r9 = r8.getPath()     // Catch:{ all -> 0x0377 }
            if (r9 == 0) goto L_0x02a5
            java.lang.String r9 = com.tencent.p014mm.vfs.C116299g2.m163855k(r9, r12, r12)     // Catch:{ all -> 0x0377 }
            java.lang.String r15 = r8.getPath()     // Catch:{ all -> 0x0377 }
            boolean r15 = r15.equals(r9)     // Catch:{ all -> 0x0377 }
            if (r15 != 0) goto L_0x02a5
            android.net.Uri$Builder r8 = r8.buildUpon()     // Catch:{ all -> 0x0377 }
            android.net.Uri$Builder r8 = r8.path(r9)     // Catch:{ all -> 0x0377 }
            android.net.Uri r8 = r8.build()     // Catch:{ all -> 0x0377 }
        L_0x02a5:
            com.tencent.mm.vfs.f0$h r4 = r4.mo177799l(r8, r14)     // Catch:{ all -> 0x0377 }
            boolean r8 = r4.mo177810a()     // Catch:{ all -> 0x0377 }
            if (r8 != 0) goto L_0x02b0
            goto L_0x02b7
        L_0x02b0:
            com.tencent.mm.vfs.FileSystem$c r8 = r4.f348991a     // Catch:{ all -> 0x0377 }
            java.lang.String r4 = r4.f348992b     // Catch:{ all -> 0x0377 }
            r8.mo119937g(r4)     // Catch:{ all -> 0x0377 }
        L_0x02b7:
            r7.mo119964e()     // Catch:{ all -> 0x0377 }
            com.tencent.p014mm.vfs.C45112n1.m49955b(r7, r6)     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.c$b$b r3 = r3.mo69190h()     // Catch:{ all -> 0x0377 }
            java.util.LinkedList<com.tencent.mm.plugin.webview.webcompt.c$b$d> r3 = r3.f120423b     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.c$b$d r4 = new com.tencent.mm.plugin.webview.webcompt.c$b$d     // Catch:{ all -> 0x0377 }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x0377 }
            java.lang.String r8 = "url.toString()"
            gy3.C87412m.m108593f(r7, r8)     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.c$b$c r17 = com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44410b.C44413c.NETWORK     // Catch:{ all -> 0x0377 }
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r4
            r16 = r7
            r15.<init>(r16, r17, r18, r19, r20)     // Catch:{ all -> 0x0377 }
            r3.add(r4)     // Catch:{ all -> 0x0377 }
            rx3.l r3 = new rx3.l     // Catch:{ all -> 0x0377 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0377 }
            java.lang.String r7 = new java.lang.String     // Catch:{ all -> 0x0377 }
            java.nio.charset.Charset r8 = z04.C119027c.f356488a     // Catch:{ all -> 0x0377 }
            r7.<init>(r6, r8)     // Catch:{ all -> 0x0377 }
            r3.<init>(r4, r7)     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.y r0 = r0.f120410b     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.b r4 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.APP_SCRIPT_FROM_NETWORK     // Catch:{ all -> 0x0377 }
            r0.mo69224a(r4)     // Catch:{ all -> 0x0377 }
            cy3.C58003b.m67160a(r5, r14)     // Catch:{ Exception -> 0x0380 }
            r1 = r3
        L_0x02fb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "finish getappscript:"
            r0.append(r2)
            java.lang.String r2 = r10.f131168d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            B r0 = r1.f38556e
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 <= r13) goto L_0x0351
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "appscript:"
            r0.append(r2)
            java.lang.String r2 = r10.f131168d
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            B r2 = r1.f38556e
            java.lang.String r2 = (java.lang.String) r2
            r3 = 100
            int r4 = r2.length()
            int r4 = r4 - r13
            int r3 = java.lang.Math.min(r3, r4)
            java.lang.String r2 = r2.substring(r12, r3)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r2, r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r0)
        L_0x0351:
            return r1
        L_0x0352:
            com.tencent.mm.plugin.webview.webcompt.y r0 = r0.f120410b     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.b r3 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.APP_SCRIPT_MD5_INVALID     // Catch:{ all -> 0x0377 }
            r0.mo69224a(r3)     // Catch:{ all -> 0x0377 }
            com.tencent.mm.plugin.webview.webcompt.c$j r0 = new com.tencent.mm.plugin.webview.webcompt.c$j     // Catch:{ all -> 0x0377 }
            r3 = 21003(0x520b, float:2.9431E-41)
            java.lang.String r4 = r10.f131168d     // Catch:{ all -> 0x0377 }
            gy3.C87412m.m108593f(r4, r2)     // Catch:{ all -> 0x0377 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0377 }
            r6.<init>()     // Catch:{ all -> 0x0377 }
            java.lang.String r7 = "load appScript file md5 fail:"
            r6.append(r7)     // Catch:{ all -> 0x0377 }
            r6.append(r1)     // Catch:{ all -> 0x0377 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0377 }
            r0.<init>(r3, r4, r6)     // Catch:{ all -> 0x0377 }
            throw r0     // Catch:{ all -> 0x0377 }
        L_0x0377:
            r0 = move-exception
            r3 = r0
            throw r3     // Catch:{ all -> 0x037a }
        L_0x037a:
            r0 = move-exception
            r4 = r0
            cy3.C58003b.m67160a(r5, r3)     // Catch:{ Exception -> 0x0380 }
            throw r4     // Catch:{ Exception -> 0x0380 }
        L_0x0380:
            r0 = move-exception
            com.tencent.mm.plugin.webview.webcompt.c$j r3 = new com.tencent.mm.plugin.webview.webcompt.c$j
            r4 = 21002(0x520a, float:2.943E-41)
            java.lang.String r5 = r10.f131168d
            gy3.C87412m.m108593f(r5, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "load appScript ex:"
            r2.append(r6)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = ", url="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r3.<init>(r4, r5, r0)
            throw r3
        L_0x03ab:
            com.tencent.mm.plugin.webview.webcompt.c$j r0 = new com.tencent.mm.plugin.webview.webcompt.c$j
            r1 = 21001(0x5209, float:2.9429E-41)
            java.lang.String r3 = r10.f131168d
            gy3.C87412m.m108593f(r3, r2)
            java.lang.String r2 = "url invalid"
            r0.<init>(r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.m48769b(com.tencent.mm.plugin.webview.webcompt.c, c30.g, te3.bk2):rx3.l");
    }

    /* renamed from: i */
    public static C13604l m48770i(Object obj, C44408c cVar, C48869bk2 bk22, String str, int i, C44410b.C44413c cVar2, C44410b.C44411a aVar, int i2, Object obj2) {
        C13604l lVar;
        Throwable th;
        Object obj3 = obj;
        C44408c cVar3 = cVar;
        String str2 = str;
        C44410b.C44413c cVar4 = (i2 & 16) != 0 ? C44410b.C44413c.NA : cVar2;
        C44410b.C44411a aVar2 = (i2 & 32) != 0 ? C44410b.C44411a.NA : aVar;
        String str3 = f120397g;
        Log.m105918d(str3, "createJsContext appScript " + str2 + ", " + obj3);
        try {
            if (obj3 instanceof C86009m1) {
                lVar = new C13604l(((C86009m1) obj3).mo119971i(), C45112n1.m49954a((C86009m1) obj3, (Charset) null, 1, (Object) null));
            } else if (obj3 instanceof URL) {
                String obj4 = obj.toString();
                Charset charset = C119027c.f356488a;
                InputStream openStream = ((URL) obj3).openStream();
                try {
                    C87412m.m108593f(openStream, LocaleUtil.ITALIAN);
                    byte[] c = C86147a.m106661c(openStream);
                    C58003b.m67160a(openStream, (Throwable) null);
                    lVar = new C13604l(obj4, new String(c, charset));
                    cVar3.f120410b.mo69224a(C44406b.APP_SCRIPT_DOWNLOAD);
                } catch (Throwable th4) {
                    Throwable th5 = th4;
                    C58003b.m67160a(openStream, th);
                    throw th5;
                }
            } else {
                lVar = new C13604l("", "");
            }
            cVar3.f120410b.mo69224a(C44406b.LOAD_APP_SCRIPT_SUCC);
            f120395e.mo69190h().f120423b.add(new C44410b.C44414d(C112551y.m153818r((String) lVar.f38555d, f120407q, "", false, 4, (Object) null), cVar4, aVar2));
            return lVar;
        } catch (Exception e) {
            if (obj3 instanceof URL) {
                cVar3.f120410b.mo69224a(C44406b.APP_SCRIPT_DOWNLOAD_ERR);
            }
            cVar3.f120410b.mo69224a(C44406b.LOAD_APP_SCRIPT_ERR);
            cVar3.f120410b.mo69224a(C44406b.EX_APP_SCRIPT);
            String str4 = bk22.f131168d;
            C87412m.m108593f(str4, "webCompt.name");
            throw new C44426j(i, str4, "load " + str2 + " fail:" + obj3 + ", " + e);
        }
    }

    /* renamed from: c */
    public final void mo69178c(C40480g gVar, C48869bk2 bk22, long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("WeixinWebCompt.config({resume:");
        sb.append(z);
        sb.append(", debug:");
        boolean z2 = false;
        if (C6612w.m6920a().containsKey("debug")) {
            z2 = C6612w.m6920a().getBoolean("debug", false);
        } else if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            z2 = true;
        }
        sb.append(z2);
        sb.append(", iframeUrlPattern:'");
        f120395e.getClass();
        sb.append((String) ((C36570n) f120399i).getValue());
        sb.append("', configFinishTs:");
        sb.append(j);
        sb.append(", bizReportId:");
        sb.append(bk22.f131173i);
        sb.append(", options:");
        sb.append(bk22.f131174j);
        sb.append("})");
        gVar.evaluateJavascript(sb.toString(), (ValueCallback<String>) null);
        String str = f120397g;
        Log.m105924i(str, "WeixinWebCompt.config:" + bk22.f131174j);
    }

    /* renamed from: d */
    public final void mo69179d(String str, String str2, C48869bk2 bk22, C53143h0 h0Var, boolean z) {
        C48869bk2 bk23 = bk22;
        C53143h0 h0Var2 = h0Var;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "url");
        C87412m.m108594g(bk23, "webCompt");
        C87412m.m108594g(h0Var2, "performanceHelper");
        mo69185k(h0Var2, C44427k.STEP_CREATE_JS_CXT);
        this.f120410b.mo69224a(C44406b.CREATE_JS_CONTEXT);
        String str3 = bk23.f131168d;
        String str4 = f120397g;
        Log.m105924i(str4, "createJsContext " + str3);
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = C44438p.f120525d;
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var3 = C53872d1.f151119c;
        int i = C53901i0.f151153a0;
        C53895h.m60466d(s1Var, h0Var3.plus(new C44431n(C53901i0.C39480a.f106019d, this, f0Var)), (C53934p0) null, new C44432o(z, this, h0Var, bk22, str3, str, str2, f0Var, (C15601d<? super C44432o>) null), 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo69180e(String str, String str2, String str3) {
        C87412m.m108594g(str, "webCompt");
        C87412m.m108594g(str2, "event");
        if (Util.isNullOrNil(str2)) {
            Log.m105928w(f120397g, "dispatch event is null");
            return;
        }
        Log.m105927v(f120397g, "dispatch event=%s, value=%s", str2, str3);
        C61926c.m72668M(new C44439q(this, str, str2, str3));
        this.f120410b.mo69224a(C44406b.SEND_EVENT_TO_JS_CONTEXT);
    }

    /* renamed from: f */
    public final C40480g mo69181f(String str) {
        C87412m.m108594g(str, "webCompt");
        C44428l.C44429a aVar = (C44428l.C44429a) mo69184j().get(str);
        if (aVar != null) {
            return aVar.mo69209a();
        }
        return null;
    }

    /* renamed from: g */
    public final void mo69182g(String str, String str2, String str3, int i, int i2) {
        String str4;
        C87412m.m108594g(str, "webCompt");
        C87412m.m108594g(str2, "errMsg");
        C44428l.C44429a aVar = (C44428l.C44429a) mo69184j().get(str);
        if (aVar != null) {
            g25 g25 = new g25();
            g25.f133812d = str2;
            g25.f133813e = str3;
            g25.f133814f = i;
            g25.f133815g = i2;
            C48590l lVar = this.f120409a.get();
            if (lVar == null || (str4 = lVar.f129997b) == null) {
                str4 = "";
            }
            g25.f133816h = str4;
            g25.f133817i = aVar.f120474h;
            g25.f133818j = aVar.f120473g;
            g25.f133819n = str;
            g25.f133820o = ((Number) ((C36570n) f120395e.mo69192j().f120436b).getValue()).intValue();
            g25.f133821p = aVar.f120476j;
            g25.f133822q = aVar.f120477k;
            this.f120410b.mo69224a(C44406b.REQUEST_JS_ERR_REPORT);
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = g25;
            bVar.f127067b = new h25();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/webcompt/reportjserr";
            bVar.f127069d = 2914;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C44440r(this));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    public final java.lang.Object mo69183h(java.lang.String r4, java.lang.String r5, wx3.C15601d<? super com.tencent.p014mm.plugin.webview.webcompt.C44408c.C44409a> r6) {
        /*
            r3 = this;
            wx3.h r0 = new wx3.h
            wx3.d r6 = xx3.C66447b.m78392b(r6)
            r0.<init>(r6)
            com.tencent.mm.plugin.webview.webcompt.y r6 = r3.f120410b
            com.tencent.mm.plugin.webview.webcompt.b r1 = com.tencent.p014mm.plugin.webview.webcompt.C44406b.GET_A8KEY
            r6.mo69224a(r1)
            java.lang.String r6 = f120397g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "start geta8key:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
            d93.c r6 = new d93.c
            r6.<init>()
            java.lang.ref.WeakReference<t83.l> r1 = r3.f120409a
            java.lang.Object r1 = r1.get()
            t83.l r1 = (t83.C48590l) r1
            if (r1 == 0) goto L_0x0040
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f130002g
            java.lang.String r2 = "srcUsername"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0041
        L_0x0040:
            r1 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0045
            java.lang.String r1 = ""
        L_0x0045:
            r6.f122688e = r1
            com.tencent.mm.plugin.webview.webcompt.c$s r1 = new com.tencent.mm.plugin.webview.webcompt.c$s
            r1.<init>(r0, r6, r3, r5)
            monitor-enter(r6)
            monitor-enter(r6)     // Catch:{ all -> 0x005d }
            r5 = 0
            r2 = -1
            r6.mo70851q(r4, r5, r2, r1)     // Catch:{ all -> 0x005a }
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r6)
            java.lang.Object r4 = r0.mo90314b()
            return r4
        L_0x005a:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r4     // Catch:{ all -> 0x005d }
        L_0x005d:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.webcompt.C44408c.mo69183h(java.lang.String, java.lang.String, wx3.d):java.lang.Object");
    }

    /* renamed from: j */
    public final C44428l mo69184j() {
        return (C44428l) ((C36570n) this.f120412d).getValue();
    }

    /* renamed from: k */
    public final void mo69185k(C53143h0 h0Var, C44427k kVar) {
        h0Var.mo73829a(kVar.f120462d + "_START", System.currentTimeMillis());
    }

    /* renamed from: l */
    public final String mo69186l(C44409a aVar) {
        Map<String, String> map = aVar.f120415c;
        C48590l lVar = this.f120409a.get();
        String str = lVar != null ? lVar.f129997b : null;
        if (str == null) {
            str = "";
        }
        map.put("User-agent", str);
        String gVar = new C104289g((Map) map).toString();
        C87412m.m108593f(gVar, "JSONObject(httpHeaders.a… \"\"\n        }).toString()");
        StringBuilder sb = new StringBuilder();
        sb.append("{clientVersion:");
        String str2 = BuildInfo.CLIENT_VERSION;
        C87412m.m108593f(str2, "CLIENT_VERSION");
        sb.append(C44404a.m48767d(str2));
        sb.append(",headers:");
        sb.append(gVar);
        sb.append(",fullUrl:");
        sb.append(C44404a.m48767d(aVar.f120414b));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$l */
    public static final class C44428l extends HashMap<String, C44429a> {

        /* renamed from: d */
        public final int f120463d;

        /* renamed from: e */
        public int f120464e = -1;

        /* renamed from: f */
        public C44410b.C44417f f120465f;

        /* renamed from: g */
        public final HashMap<String, C44429a> f120466g;

        /* renamed from: com.tencent.mm.plugin.webview.webcompt.c$l$a */
        public final class C44429a {

            /* renamed from: a */
            public final int f120467a;

            /* renamed from: b */
            public final C48869bk2 f120468b;

            /* renamed from: c */
            public final C44408c f120469c;

            /* renamed from: d */
            public boolean f120470d;

            /* renamed from: e */
            public boolean f120471e;

            /* renamed from: f */
            public boolean f120472f;

            /* renamed from: g */
            public String f120473g = "";

            /* renamed from: h */
            public String f120474h = "";

            /* renamed from: i */
            public String f120475i = "";

            /* renamed from: j */
            public String f120476j = "";

            /* renamed from: k */
            public String f120477k = "";

            /* renamed from: l */
            public C53143h0 f120478l;

            /* renamed from: m */
            public C44456x f120479m;

            public C44429a(C44428l lVar, int i, C48869bk2 bk22, C44408c cVar) {
                C87412m.m108594g(bk22, "webComptInfo");
                C87412m.m108594g(cVar, "webCompt");
                this.f120467a = i;
                this.f120468b = bk22;
                this.f120469c = cVar;
                String str = bk22.f131168d;
                C87412m.m108593f(str, "webComptInfo.name");
                this.f120479m = new C44456x(cVar, str);
                mo69209a().addJavascriptInterface(this.f120479m, "__webcompt");
            }

            /* renamed from: a */
            public final C40480g mo69209a() {
                C40480g F0 = C44410b.m48781b(C44408c.f120395e).mo115375F0(this.f120467a);
                C87412m.m108593f(F0, "manager.getJsContext(workerId)");
                return F0;
            }
        }

        public C44428l() {
            int currentTimeMillis = (int) (System.currentTimeMillis() % ((long) 1000));
            this.f120463d = currentTimeMillis;
            this.f120465f = new C44410b.C44417f(currentTimeMillis, true, false, 4, (C8480h) null);
            this.f120466g = new HashMap<>();
        }

        /* renamed from: a */
        public final void mo69198a(C44462y yVar) {
            int i;
            C87412m.m108594g(yVar, "reporter");
            C44408c.f120395e.getClass();
            String str = C44408c.f120397g;
            Log.m105924i(str, "clear workerManager#" + this.f120463d);
            int i2 = -1;
            for (Map.Entry entry : entrySet()) {
                C44429a aVar = (C44429a) entry.getValue();
                if (!aVar.f120470d && aVar.f120471e && !this.f120466g.containsKey(entry.getKey())) {
                    aVar.f120472f = true;
                    aVar.f120478l = null;
                    C44408c.f120395e.getClass();
                    String str2 = C44408c.f120397g;
                    Log.m105924i(str2, "WebComptWorker.recycle " + aVar.f120473g + '@' + aVar.f120468b.f131168d + XVFSFile.PATH_SEPARATOR_CHAR + aVar.f120467a);
                    this.f120466g.put(entry.getKey(), aVar);
                    yVar.mo69224a(C44406b.RECYCLE_JS_CXT);
                } else if (aVar.f120470d || aVar.f120467a != (i = this.f120464e)) {
                    C44408c cVar = aVar.f120469c;
                    String str3 = aVar.f120468b.f131168d;
                    C87412m.m108593f(str3, "webComptInfo.name");
                    cVar.mo69180e(str3, "onWebComptDestroy", "{}");
                    aVar.mo69209a().destroy();
                } else {
                    i2 = i;
                }
            }
            this.f120464e = i2;
            clear();
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.containsKey((String) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof C44429a)) {
                return false;
            }
            return super.containsValue((C44429a) obj);
        }

        public final /* bridge */ Set<Map.Entry<String, C44429a>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return (C44429a) super.get((String) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : (C44429a) super.getOrDefault((String) obj, (C44429a) obj2);
        }

        public final /* bridge */ Set<String> keySet() {
            return super.keySet();
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof String)) {
                return null;
            }
            return (C44429a) super.remove((String) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<C44429a> values() {
            return super.values();
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && (obj2 instanceof C44429a)) {
                return super.remove((String) obj, (C44429a) obj2);
            }
            return false;
        }
    }
}
