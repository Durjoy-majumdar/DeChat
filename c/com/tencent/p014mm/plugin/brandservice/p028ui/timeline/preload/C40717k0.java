package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.network.C81038d0;
import com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.core.C5857x;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMCacheSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.__BATCH_RUN_OBJ;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import dx0.C45469b;
import ea3.C45590f;
import ea3.C45596j;
import ex0.C45700h;
import f93.C31962d;
import f93.C45767f;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import i93.C46206e;
import iy0.C46353a;
import iy0.C46368o;
import iy0.C9263p;
import iy0.C9266q;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import jy0.C46580b;
import jy0.C46581c;
import kotlin.Result;
import kotlin.ResultKt;
import ky0.C46799c;
import ly0.C46904a;
import my0.C47140c;
import my0.C47141d;
import my0.C47142e;
import ny0.C47306a;
import ny0.C47307b;
import o40.C61926c;
import pe3.C89349b;
import py0.C47539a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sf0.C48374j0;
import sx3.C110818d0;
import sx3.C36907w;
import t73.C48555a;
import t73.C48556b;
import t73.C48558d;
import t73.C48572p;
import te3.C50873pt1;
import te3.C51011qt1;
import te3.C51154rt1;
import te3.C51296st1;
import te3.C51444tt1;
import te3.C51737vt1;
import te3.m25;
import te3.n25;
import um0.C22657f;
import wx3.C15601d;
import wx3.C66212f;
import wx3.C66218h;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 */
public final class C40717k0 {

    /* renamed from: a */
    public static final C40717k0 f109363a = new C40717k0();

    /* renamed from: b */
    public static final MMKVSlotManager f109364b = new MMKVSlotManager(C40780x0.m44078a(), 604800);

    /* renamed from: c */
    public static final MMKVSlotManager f109365c = new MMKVSlotManager(C40780x0.m44078a(), 86400);

    /* renamed from: d */
    public static final MMKVSlotManager f109366d = new MMKVSlotManager(C40780x0.m44078a(), 604800);

    /* renamed from: e */
    public static final C13601g f109367e = C36568h.m40985a(C29774h.f80783d);

    /* renamed from: f */
    public static final C13601g f109368f = C36568h.m40985a(C29773f.f80782d);

    /* renamed from: g */
    public static final C13601g f109369g = C36568h.m40985a(C26890i.f74779B);

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$i */
    public static final class C26890i extends C87413o implements C32224a<Boolean> {

        /* renamed from: B */
        public static final C26890i f74779B = new C26890i();

        public C26890i() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_prefetcher_disable_remove_set_cookie, 0) == 1) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean booleanValue = valueOf.booleanValue();
            Log.m105924i("MicroMsg.WebPrefetcher", "disableRemoveSetCookieFromHeader " + booleanValue);
            return valueOf;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$f */
    public static final class C29773f extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C29773f f80782d = new C29773f();

        public C29773f() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (MultiProcessMMKV.getMMKV("__webview_command").decodeInt("prefetchTestMode", 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$h */
    public static final class C29774h extends C87413o implements C32224a<C45596j> {

        /* renamed from: d */
        public static final C29774h f80783d = new C29774h();

        public C29774h() {
            super(0);
        }

        public Object invoke() {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            return new C45596j(context);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$a */
    public static final class C40718a {

        /* renamed from: a */
        public final String f109370a;

        /* renamed from: b */
        public final String f109371b;

        /* renamed from: c */
        public final String f109372c;

        /* renamed from: d */
        public final boolean f109373d;

        /* renamed from: e */
        public final Map<String, String> f109374e;

        /* renamed from: f */
        public final int f109375f;

        public C40718a(String str, String str2, String str3, boolean z, Map<String, String> map, int i, int i2, C8480h hVar) {
            map = (i2 & 16) != 0 ? null : map;
            i = (i2 & 32) != 0 ? 0 : i;
            C87412m.m108594g(str, "host");
            C87412m.m108594g(str2, "rawUrl");
            C87412m.m108594g(str3, "prefetchUrl");
            this.f109370a = str;
            this.f109371b = str2;
            this.f109372c = str3;
            this.f109373d = z;
            this.f109374e = map;
            this.f109375f = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C40718a)) {
                return false;
            }
            C40718a aVar = (C40718a) obj;
            return C87412m.m108589b(this.f109370a, aVar.f109370a) && C87412m.m108589b(this.f109371b, aVar.f109371b) && C87412m.m108589b(this.f109372c, aVar.f109372c) && this.f109373d == aVar.f109373d && C87412m.m108589b(this.f109374e, aVar.f109374e) && this.f109375f == aVar.f109375f;
        }

        public int hashCode() {
            int hashCode = ((((this.f109370a.hashCode() * 31) + this.f109371b.hashCode()) * 31) + this.f109372c.hashCode()) * 31;
            boolean z = this.f109373d;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            Map<String, String> map = this.f109374e;
            return ((i + (map == null ? 0 : map.hashCode())) * 31) + this.f109375f;
        }

        public String toString() {
            return "PrefetchAction(host=" + this.f109370a + ", rawUrl=" + this.f109371b + ", prefetchUrl=" + this.f109372c + ", checkCacheOnly=" + this.f109373d + ", prefetchHeader=" + this.f109374e + ", bizScene=" + this.f109375f + ')';
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b */
    public enum C40719b {
        JS("JS"),
        CSS("CSS"),
        HTML("HTML"),
        WXA_PKG("WXA_PKG"),
        WX_PREFETCH_CONFIG_FILE("WX_PREFETCH_CONFIG_FILE"),
        UNKNOWN("unknown");
        

        /* renamed from: d */
        public final String f109383d;

        /* access modifiers changed from: public */
        C40719b(String str) {
            this.f109383d = str;
        }

        public String toString() {
            return this.f109383d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$c */
    public static final class C40720c extends C47140c<C81038d0> {

        /* renamed from: a */
        public final /* synthetic */ C48555a f109384a;

        /* renamed from: b */
        public final /* synthetic */ String f109385b;

        /* renamed from: c */
        public final /* synthetic */ C15601d<Boolean> f109386c;

        public C40720c(C48555a aVar, String str, C15601d<? super Boolean> dVar) {
            this.f109384a = aVar;
            this.f109385b = str;
            this.f109386c = dVar;
        }

        /* renamed from: a */
        public boolean mo63626a(Object obj, int i, HashMap hashMap) {
            C87412m.m108594g((C81038d0) obj, "connection");
            C87412m.m108594g(hashMap, "headers");
            C40819a.m44118d(hashMap, "fetchManifest");
            return i == 200;
        }

        /* renamed from: b */
        public void mo63627b(Object obj, C47142e eVar) {
            C81038d0 d0Var = (C81038d0) obj;
            C87412m.m108594g(eVar, "downloadResult");
            Log.m105924i("MicroMsg.WebPrefetcher", "fetchManifest: " + this.f109384a.f129887a.f140537d + '#' + this.f109385b + ", succ:" + eVar.f126661a + ", path:" + this.f109384a.f129888b.f141126d + ", url:" + this.f109384a.f129888b.f141127e);
            if (eVar.f126661a) {
                String str = this.f109384a.f129887a.f140537d;
                C87412m.m108593f(str, "manifest.domain.Domain");
                ConcurrentHashMap<String, String> concurrentHashMap = C40714i.f109359a;
                synchronized (C40714i.class) {
                    String str2 = WeChatProcess.PROCESS_MAIN;
                    C87412m.m108593f(str2, "PROCESS_MAIN");
                    C28947a.m38500a(str2, new IPCString(str), C40711g.f109357d, (C32226l) null);
                    if (!C44594n1.m49046b()) {
                        String str3 = WeChatProcess.PROCESS_TOOLS;
                        C87412m.m108593f(str3, "PROCESS_TOOLS");
                        C28947a.m38500a(str3, new IPCString(str), C40713h.f109358d, (C32226l) null);
                    }
                }
                C15601d<Boolean> dVar = this.f109386c;
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                return;
            }
            C15601d<Boolean> dVar2 = this.f109386c;
            Result.Companion companion2 = Result.Companion;
            dVar2.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
        }

        /* renamed from: c */
        public void mo63628c(Object obj) {
            C81038d0 d0Var = (C81038d0) obj;
            C87412m.m108594g(d0Var, "connection");
            if (C40819a.m44115a()) {
                d0Var.mo112921e("Cookie", C40819a.m44117c());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$d */
    public static final class C40721d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<String> f109387d;

        public C40721d(List<String> list) {
            this.f109387d = list;
        }

        public final void run() {
            LinkedList linkedList = new LinkedList();
            for (String str : this.f109387d) {
                try {
                    InetAddress byName = InetAddress.getByName(str);
                    Log.m105924i("MicroMsg.WebPrefetcher", "pre dns:" + byName);
                    MMCacheSlotManager mMCacheSlotManager = C45469b.f123066j;
                    ((MultiProcessMMKV) C45469b.f123068o.getSlotForWrite()).encode(str, true);
                    linkedList.add(str);
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.WebPrefetcher", "InetAddress Error, " + e.getMessage());
                }
            }
            int size = linkedList.size();
            C13601g gVar = C46206e.f124554a;
            C115669n.INSTANCE.mo175913w(1200, 1, (long) size);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcher$prefetch$$inlined$batchRun$default$1", mo125469f = "WebPrefetcher.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$e */
    public static final class C40722e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f109388d;

        /* renamed from: e */
        public /* synthetic */ Object f109389e;

        /* renamed from: f */
        public final /* synthetic */ long f109390f;

        /* renamed from: g */
        public final /* synthetic */ String f109391g;

        /* renamed from: h */
        public final /* synthetic */ String f109392h;

        /* renamed from: i */
        public final /* synthetic */ C48555a f109393i;

        /* renamed from: j */
        public final /* synthetic */ boolean f109394j;

        /* renamed from: n */
        public final /* synthetic */ boolean f109395n;

        /* renamed from: o */
        public final /* synthetic */ int f109396o;

        /* renamed from: p */
        public final /* synthetic */ int f109397p;

        /* renamed from: q */
        public final /* synthetic */ int f109398q;

        /* renamed from: r */
        public final /* synthetic */ String f109399r;

        /* renamed from: s */
        public final /* synthetic */ long f109400s;

        /* renamed from: t */
        public final /* synthetic */ String f109401t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40722e(long j, String str, C15601d dVar, String str2, C48555a aVar, boolean z, boolean z2, int i, int i2, int i3, String str3, long j2, String str4) {
            super(2, dVar);
            this.f109390f = j;
            this.f109391g = str;
            this.f109392h = str2;
            this.f109393i = aVar;
            this.f109394j = z;
            this.f109395n = z2;
            this.f109396o = i;
            this.f109397p = i2;
            this.f109398q = i3;
            this.f109399r = str3;
            this.f109400s = j2;
            this.f109401t = str4;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            long j = this.f109390f;
            String str = this.f109391g;
            String str2 = this.f109392h;
            C48555a aVar = this.f109393i;
            boolean z = this.f109394j;
            boolean z2 = this.f109395n;
            int i = this.f109396o;
            int i2 = this.f109397p;
            int i3 = this.f109398q;
            long j2 = this.f109400s;
            String str3 = this.f109401t;
            C40722e eVar = r1;
            C40722e eVar2 = new C40722e(j, str, dVar, str2, aVar, z, z2, i, i2, i3, this.f109399r, j2, str3);
            eVar.f109389e = obj;
            return eVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40722e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C0000n0 n0Var;
            ArrayList<C40718a> arrayList;
            C31962d.C31964b bVar = C31962d.C31964b.CONTENT;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f109388d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var2 = (C0000n0) this.f109389e;
                long j = this.f109390f;
                this.f109389e = n0Var2;
                this.f109388d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
                n0Var = n0Var2;
            } else if (i == 1) {
                n0Var = (C0000n0) this.f109389e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!C53930o0.m60560g(n0Var)) {
                return C13598b0.f38549a;
            }
            __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
            String str = this.f109391g;
            synchronized (__batch_run_obj) {
                Queue<?> queue = __batch_run_obj.getBatchData().get(str);
                Queue queue2 = queue instanceof Queue ? queue : null;
                if (queue2 != null) {
                    __batch_run_obj.getBatchData().remove(str);
                    arrayList = new ArrayList<>(queue2);
                } else {
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                for (C40718a aVar2 : arrayList) {
                    String str2 = aVar2.f109371b;
                    String i2 = C40714i.m43960i(str2, false);
                    C48556b bVar2 = C48558d.f129901M;
                    C40717k0 k0Var = C40717k0.f109363a;
                    k0Var.getClass();
                    MMKVSlotManager mMKVSlotManager = C40717k0.f109365c;
                    String str3 = this.f109392h;
                    C48555a aVar3 = this.f109393i;
                    C46353a aVar4 = new C46353a(str2, i2, bVar2, mMKVSlotManager, (String) null, str3, (Boolean) null, aVar3, this.f109394j, aVar3 != null ? C48572p.m53971b(aVar3) : null, (String) null, 1104, (C8480h) null);
                    if (!aVar4.mo71781w()) {
                        C31962d.C31963a aVar5 = C31962d.C31963a.ACTION_NO_CACHE_AND_DOWNLOAD;
                        String str4 = aVar2.f109370a;
                        int i3 = this.f109396o;
                        int i4 = this.f109397p;
                        int i5 = this.f109398q;
                        String str5 = this.f109399r;
                        C31962d.m39599a(aVar5, bVar, str4, i3, i4, i5, str5, str5);
                        C40717k0.m43985a(k0Var, aVar2.f109372c, aVar2.f109370a, aVar4, 0, aVar2.f109374e, this.f109393i);
                        C40746q0.f109487a.mo63642a(this.f109400s, this.f109401t, 13);
                    } else if (!aVar2.f109373d) {
                        int max = Math.max(aVar4.mo71772n() - 60, 60);
                        Log.m105927v("MicroMsg.WebPrefetcher", "prefetch needCheckUpdate: %s, forceFetchForDebug: %s", Boolean.valueOf(aVar4.mo71773o()), Boolean.valueOf(this.f109395n));
                        if (aVar4.mo71773o() || ((aVar4.mo71764f() > 0 && MMSlotKt.isExpire(aVar4.mo71764f(), max)) || this.f109395n)) {
                            C31962d.C31963a aVar6 = C31962d.C31963a.ACTION_CACHE_EXPIRE_AND_DOWNLOAD;
                            String str6 = aVar2.f109370a;
                            int i6 = this.f109396o;
                            int i7 = this.f109397p;
                            int i8 = this.f109398q;
                            String str7 = this.f109399r;
                            C31962d.m39599a(aVar6, bVar, str6, i6, i7, i8, str7, str7);
                            C40717k0.m43985a(k0Var, aVar2.f109372c, aVar2.f109370a, aVar4, 0, aVar2.f109374e, this.f109393i);
                            C40746q0.f109487a.mo63642a(this.f109400s, this.f109401t, 13);
                        } else {
                            C40746q0.f109487a.mo63642a(this.f109400s, this.f109401t, 12);
                            C31962d.C31963a aVar7 = C31962d.C31963a.ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD;
                            String str8 = aVar2.f109370a;
                            int i9 = this.f109396o;
                            int i15 = this.f109397p;
                            int i16 = this.f109398q;
                            String str9 = this.f109399r;
                            C31962d.m39599a(aVar7, bVar, str8, i9, i15, i16, str9, str9);
                        }
                    }
                }
            }
            __BATCH_RUN_OBJ.INSTANCE.getBatchJobs().remove(this.f109391g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$g */
    public static final class C40723g implements C47306a {

        /* renamed from: a */
        public final /* synthetic */ long f109402a;

        /* renamed from: b */
        public final /* synthetic */ HashMap<String, String> f109403b;

        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$g$a */
        public static final class C40724a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C51444tt1 f109404d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40724a(C51444tt1 tt12) {
                super(0);
                this.f109404d = tt12;
            }

            public Object invoke() {
                LinkedList<C51296st1> linkedList = this.f109404d.f142403n;
                C87412m.m108593f(linkedList, "req.ReqInfo");
                for (C51296st1 st12 : linkedList) {
                    n25 n25 = new n25();
                    n25.f138354d = st12.f141739e;
                    n25.f138356f = st12.f141745n;
                    C45767f fVar = C45767f.f123649a;
                    n25.f138355e = ((Number) ((C36570n) C45767f.f123652d).getValue()).intValue();
                    n25.f138361n = st12 instanceof C40748r ? ((C40748r) st12).f109498v : "";
                    byte[] byteArray = n25.toByteArray();
                    MMKVSlotManager mMKVSlotManager = C45767f.f123650b;
                    ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(n25.f138354d, byteArray);
                    String str = n25.f138361n;
                    if (!(str == null || str.length() == 0)) {
                        ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(n25.f138361n, byteArray);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcher$sendGetA8KeyLiteRequest$ret$1$onResponse$1$1", mo125469f = "WebPrefetcher.kt", mo125470l = {449, 449}, mo125471m = "invokeSuspend")
        /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$g$b */
        public static final class C40725b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public Object f109405d;

            /* renamed from: e */
            public Object f109406e;

            /* renamed from: f */
            public Object f109407f;

            /* renamed from: g */
            public long f109408g;

            /* renamed from: h */
            public int f109409h;

            /* renamed from: i */
            public final /* synthetic */ C51737vt1 f109410i;

            /* renamed from: j */
            public final /* synthetic */ long f109411j;

            /* renamed from: n */
            public final /* synthetic */ C51444tt1 f109412n;

            /* renamed from: o */
            public final /* synthetic */ HashMap<String, String> f109413o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40725b(C51737vt1 vt12, long j, C51444tt1 tt12, HashMap<String, String> hashMap, C15601d<? super C40725b> dVar) {
                super(2, dVar);
                this.f109410i = vt12;
                this.f109411j = j;
                this.f109412n = tt12;
                this.f109413o = hashMap;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C40725b(this.f109410i, this.f109411j, this.f109412n, this.f109413o, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C40725b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:24:0x0113, code lost:
                if (r4 == null) goto L_0x0118;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r36) {
                /*
                    r35 = this;
                    r8 = r35
                    xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
                    int r0 = r8.f109409h
                    r2 = 2
                    r3 = 1
                    if (r0 == 0) goto L_0x0035
                    if (r0 == r3) goto L_0x001b
                    if (r0 != r2) goto L_0x0013
                    kotlin.ResultKt.throwOnFailure(r36)
                    goto L_0x0420
                L_0x0013:
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L_0x001b:
                    long r3 = r8.f109408g
                    java.lang.Object r0 = r8.f109407f
                    te3.tt1 r0 = (te3.C51444tt1) r0
                    java.lang.Object r5 = r8.f109406e
                    te3.vt1 r5 = (te3.C51737vt1) r5
                    java.lang.Object r6 = r8.f109405d
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r6 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r6
                    kotlin.ResultKt.throwOnFailure(r36)
                    r2 = r3
                    r1 = r5
                    r18 = r6
                    r4 = r0
                    r0 = r36
                    goto L_0x0406
                L_0x0035:
                    kotlin.ResultKt.throwOnFailure(r36)
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109363a
                    te3.vt1 r4 = r8.f109410i
                    long r5 = r8.f109411j
                    te3.tt1 r7 = r8.f109412n
                    java.util.LinkedList<pe3.b> r10 = r7.f142404o
                    java.lang.String r11 = "req.PrefetchDomainInfos"
                    gy3.C87412m.m108593f(r10, r11)
                    r8.f109405d = r0
                    r8.f109406e = r4
                    r8.f109407f = r7
                    r8.f109408g = r5
                    r8.f109409h = r3
                    r0.getClass()
                    java.util.ArrayList r11 = new java.util.ArrayList
                    r12 = 10
                    int r13 = sx3.C36907w.m41090l(r10, r12)
                    r11.<init>(r13)
                    java.util.Iterator r10 = r10.iterator()
                L_0x0064:
                    boolean r13 = r10.hasNext()
                    if (r13 == 0) goto L_0x0080
                    java.lang.Object r13 = r10.next()
                    pe3.b r13 = (pe3.C89349b) r13
                    te3.qt1 r14 = new te3.qt1
                    r14.<init>()
                    byte[] r13 = r13.mo123703f()
                    r14.parseFrom(r13)
                    r11.add(r14)
                    goto L_0x0064
                L_0x0080:
                    java.util.List r10 = sx3.C110818d0.m150900B0(r11)
                    java.util.LinkedList<pe3.b> r11 = r4.f143690h
                    java.lang.String r13 = "PrefetchDomainInfos"
                    gy3.C87412m.m108593f(r11, r13)
                    java.util.ArrayList r13 = new java.util.ArrayList
                    int r12 = sx3.C36907w.m41090l(r11, r12)
                    r13.<init>(r12)
                    java.util.Iterator r11 = r11.iterator()
                L_0x0098:
                    boolean r12 = r11.hasNext()
                    if (r12 == 0) goto L_0x00b4
                    java.lang.Object r12 = r11.next()
                    pe3.b r12 = (pe3.C89349b) r12
                    te3.qt1 r14 = new te3.qt1
                    r14.<init>()
                    byte[] r12 = r12.mo123703f()
                    r14.parseFrom(r12)
                    r13.add(r14)
                    goto L_0x0098
                L_0x00b4:
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    java.lang.String r12 = "saveManifest before: localSize: "
                    r11.append(r12)
                    r12 = r10
                    java.util.ArrayList r12 = (java.util.ArrayList) r12
                    int r14 = r12.size()
                    r11.append(r14)
                    java.lang.String r14 = ", respSize:"
                    r11.append(r14)
                    int r15 = r13.size()
                    r11.append(r15)
                    java.lang.String r11 = r11.toString()
                    java.lang.String r15 = "MicroMsg.WebPrefetcher"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r11)
                    java.util.Iterator r11 = r13.iterator()
                L_0x00e2:
                    boolean r16 = r11.hasNext()
                    if (r16 == 0) goto L_0x03ae
                    java.lang.Object r16 = r11.next()
                    r1 = r16
                    te3.qt1 r1 = (te3.C51011qt1) r1
                    java.lang.String r2 = "domainInfo"
                    gy3.C87412m.m108594g(r1, r2)
                    com.tencent.mm.plugin.webview.core.v$b r2 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
                    boolean r17 = r2.mo67810a()
                    if (r17 == 0) goto L_0x01b3
                    boolean r17 = r2.mo67810a()
                    java.lang.String r3 = "DebugManifest"
                    r18 = r0
                    java.lang.String r0 = ""
                    if (r17 == 0) goto L_0x0116
                    r17 = r4
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r4 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
                    java.lang.String r4 = r4.getString(r3, r0)
                    if (r4 != 0) goto L_0x0119
                    goto L_0x0118
                L_0x0116:
                    r17 = r4
                L_0x0118:
                    r4 = r0
                L_0x0119:
                    int r4 = r4.length()
                    if (r4 <= 0) goto L_0x0121
                    r4 = 1
                    goto L_0x0122
                L_0x0121:
                    r4 = 0
                L_0x0122:
                    if (r4 == 0) goto L_0x01af
                    boolean r2 = r2.mo67810a()
                    if (r2 == 0) goto L_0x0138
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = com.tencent.p014mm.plugin.webview.core.C5857x.m5577a()
                    java.lang.String r2 = r2.getString(r3, r0)
                    if (r2 != 0) goto L_0x0135
                    goto L_0x0138
                L_0x0135:
                    r19 = r2
                    goto L_0x013a
                L_0x0138:
                    r19 = r0
                L_0x013a:
                    java.lang.String r0 = ","
                    java.lang.String[] r20 = new java.lang.String[]{r0}
                    r21 = 0
                    r22 = 0
                    r23 = 6
                    r24 = 0
                    java.util.List r0 = z04.C112550d0.m153785U(r19, r20, r21, r22, r23, r24)
                    r2 = 0
                    java.lang.Object r3 = sx3.C110818d0.m150917O(r0, r2)
                    java.lang.String r3 = (java.lang.String) r3
                    r2 = 1
                    java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r2)
                    java.lang.String r0 = (java.lang.String) r0
                    java.util.LinkedList<te3.rt1> r2 = r1.f140539f
                    java.lang.String r4 = "domainInfo.ResInfos"
                    gy3.C87412m.m108593f(r2, r4)
                    java.util.Iterator r2 = r2.iterator()
                L_0x0165:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L_0x01af
                    java.lang.Object r4 = r2.next()
                    te3.rt1 r4 = (te3.C51154rt1) r4
                    r19 = r2
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r20 = r5
                    java.lang.String r5 = r1.f140537d
                    r2.append(r5)
                    java.lang.String r5 = r4.f141126d
                    r2.append(r5)
                    java.lang.String r2 = r2.toString()
                    boolean r5 = r2.equals(r3)
                    r6 = 1
                    if (r5 != r6) goto L_0x01aa
                    r22 = r3
                    r5 = 2
                    java.lang.Object[] r3 = new java.lang.Object[r5]
                    r5 = 0
                    r3[r5] = r2
                    r3[r6] = r0
                    java.lang.String r2 = "MicroMsg.WebPrefetcherDebugUtils"
                    java.lang.String r6 = "saveManifest use debug manifestUrl, fullPath: %s, debugManifestUrl: %s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r6, r3)
                    r4.f141127e = r0
                    r2 = r19
                    r5 = r20
                    r3 = r22
                    goto L_0x0165
                L_0x01aa:
                    r2 = r19
                    r5 = r20
                    goto L_0x0165
                L_0x01af:
                    r20 = r5
                    r5 = 0
                    goto L_0x01b8
                L_0x01b3:
                    r18 = r0
                    r17 = r4
                    goto L_0x01af
                L_0x01b8:
                    java.lang.String r0 = r1.f140537d
                    java.lang.String r2 = "Domain"
                    gy3.C87412m.m108593f(r0, r2)
                    java.lang.String r0 = t73.C48572p.m53970a(r0)
                    java.util.LinkedList<te3.rt1> r2 = r1.f140539f
                    java.lang.String r3 = "ResInfos"
                    gy3.C87412m.m108593f(r2, r3)
                    java.util.HashMap r4 = new java.util.HashMap
                    r4.<init>()
                    java.util.Iterator r2 = r2.iterator()
                L_0x01d3:
                    boolean r6 = r2.hasNext()
                    if (r6 == 0) goto L_0x01f0
                    java.lang.Object r6 = r2.next()
                    te3.rt1 r6 = (te3.C51154rt1) r6
                    java.lang.String r5 = r6.f141126d
                    r19 = r2
                    java.lang.String r2 = "resInfo.Path"
                    gy3.C87412m.m108593f(r5, r2)
                    r4.put(r5, r6)
                    r2 = r19
                    r5 = 0
                    goto L_0x01d3
                L_0x01f0:
                    java.util.Iterator r2 = r12.iterator()
                L_0x01f4:
                    boolean r5 = r2.hasNext()
                    if (r5 == 0) goto L_0x0210
                    java.lang.Object r5 = r2.next()
                    te3.qt1 r5 = (te3.C51011qt1) r5
                    java.lang.String r6 = r5.f140537d
                    r19 = r2
                    java.lang.String r2 = r1.f140537d
                    boolean r2 = gy3.C87412m.m108589b(r6, r2)
                    if (r2 == 0) goto L_0x020d
                    goto L_0x0211
                L_0x020d:
                    r2 = r19
                    goto L_0x01f4
                L_0x0210:
                    r5 = 0
                L_0x0211:
                    if (r5 == 0) goto L_0x0219
                    java.util.LinkedList<te3.rt1> r2 = r5.f140539f
                    r12.remove(r5)
                    goto L_0x021a
                L_0x0219:
                    r2 = 0
                L_0x021a:
                    if (r2 == 0) goto L_0x02b6
                    java.util.Iterator r2 = r2.iterator()
                    r6 = 0
                    r19 = 0
                    r22 = 0
                L_0x0225:
                    boolean r23 = r2.hasNext()
                    if (r23 == 0) goto L_0x02b1
                    java.lang.Object r23 = r2.next()
                    r5 = r23
                    te3.rt1 r5 = (te3.C51154rt1) r5
                    r23 = r2
                    java.lang.String r2 = r5.f141126d
                    boolean r2 = r4.containsKey(r2)
                    if (r2 == 0) goto L_0x02a0
                    java.lang.String r2 = r5.f141126d
                    java.lang.Object r2 = r4.get(r2)
                    gy3.C87412m.m108591d(r2)
                    te3.rt1 r2 = (te3.C51154rt1) r2
                    r25 = r4
                    java.lang.String r4 = r5.f141127e
                    r26 = r6
                    java.lang.String r6 = r2.f141127e
                    boolean r4 = gy3.C87412m.m108589b(r4, r6)
                    if (r4 == 0) goto L_0x0268
                    pe3.b r4 = r5.f141133n
                    pe3.b r6 = r2.f141133n
                    boolean r4 = gy3.C87412m.m108589b(r4, r6)
                    if (r4 == 0) goto L_0x0268
                    int r2 = r2.f141129g
                    r4 = 1
                    if (r2 != r4) goto L_0x0266
                    goto L_0x0268
                L_0x0266:
                    r6 = 1
                    goto L_0x02ab
                L_0x0268:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "update manifest:"
                    r2.append(r4)
                    java.lang.String r4 = r1.f140537d
                    r2.append(r4)
                    r4 = 35
                    r2.append(r4)
                    r2.append(r0)
                    java.lang.String r4 = ", path:"
                    r2.append(r4)
                    java.lang.String r4 = r5.f141126d
                    r2.append(r4)
                    java.lang.String r4 = ", opType:"
                    r2.append(r4)
                    int r4 = r5.f141129g
                    r2.append(r4)
                    java.lang.String r2 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                    r6 = r26
                    r19 = 1
                    goto L_0x02ab
                L_0x02a0:
                    r25 = r4
                    r26 = r6
                    java.util.LinkedList<te3.rt1> r2 = r1.f140539f
                    r2.add(r5)
                    r22 = 1
                L_0x02ab:
                    r2 = r23
                    r4 = r25
                    goto L_0x0225
                L_0x02b1:
                    r26 = r6
                    r2 = r26
                    goto L_0x02bb
                L_0x02b6:
                    r2 = 0
                    r19 = 0
                    r22 = 0
                L_0x02bb:
                    java.util.LinkedList<te3.rt1> r4 = r1.f140539f
                    gy3.C87412m.m108593f(r4, r3)
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r5.<init>()
                    java.util.Iterator r4 = r4.iterator()
                L_0x02c9:
                    boolean r6 = r4.hasNext()
                    if (r6 == 0) goto L_0x02ec
                    java.lang.Object r6 = r4.next()
                    r23 = r4
                    r4 = r6
                    te3.rt1 r4 = (te3.C51154rt1) r4
                    int r4 = r4.f141129g
                    r25 = r7
                    r7 = 1
                    if (r4 != r7) goto L_0x02e1
                    r4 = 1
                    goto L_0x02e2
                L_0x02e1:
                    r4 = 0
                L_0x02e2:
                    if (r4 != 0) goto L_0x02e7
                    r5.add(r6)
                L_0x02e7:
                    r4 = r23
                    r7 = r25
                    goto L_0x02c9
                L_0x02ec:
                    r25 = r7
                    r7 = 1
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r6 = "saveManifest resultResInfos size:"
                    r4.append(r6)
                    int r6 = r5.size()
                    r4.append(r6)
                    java.lang.String r6 = ", ResInfos size:"
                    r4.append(r6)
                    java.util.LinkedList<te3.rt1> r6 = r1.f140539f
                    int r6 = r6.size()
                    r4.append(r6)
                    java.lang.String r4 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r4)
                    java.util.LinkedList r4 = new java.util.LinkedList
                    r4.<init>()
                    r4.addAll(r5)
                    r1.f140539f = r4
                    if (r2 == 0) goto L_0x034c
                    if (r19 != 0) goto L_0x034c
                    if (r22 == 0) goto L_0x0327
                    goto L_0x034c
                L_0x0327:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "resp manifest:"
                    r2.append(r3)
                    java.lang.String r1 = r1.f140537d
                    r2.append(r1)
                    r1 = 35
                    r2.append(r1)
                    r2.append(r0)
                    java.lang.String r0 = ", nothing changed"
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                    goto L_0x03a2
                L_0x034c:
                    com.tencent.mm.sdk.platformtools.MMKVSlotManager r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.f109364b
                    java.lang.Object r2 = r2.getSlotForWrite()
                    com.tencent.mm.sdk.platformtools.MultiProcessMMKV r2 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r2
                    byte[] r4 = r1.toByteArray()
                    r2.encode((java.lang.String) r0, (byte[]) r4)
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r4 = "save manifest:"
                    r2.append(r4)
                    java.lang.String r4 = r1.f140537d
                    r2.append(r4)
                    r4 = 35
                    r2.append(r4)
                    r2.append(r0)
                    java.lang.String r0 = ", ["
                    r2.append(r0)
                    java.util.LinkedList<te3.rt1> r0 = r1.f140539f
                    gy3.C87412m.m108593f(r0, r3)
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r31 = 0
                    com.tencent.mm.plugin.brandservice.ui.timeline.preload.o0 r32 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40743o0.f109459d
                    r33 = 30
                    r34 = 0
                    java.lang.String r27 = "\n"
                    r26 = r0
                    java.lang.String r0 = sx3.C110818d0.m150921S(r26, r27, r28, r29, r30, r31, r32, r33, r34)
                    r2.append(r0)
                    r0 = 93
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                L_0x03a2:
                    r4 = r17
                    r0 = r18
                    r5 = r20
                    r7 = r25
                    r2 = 2
                    r3 = 1
                    goto L_0x00e2
                L_0x03ae:
                    r18 = r0
                    r17 = r4
                    r20 = r5
                    r25 = r7
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "saveManifest after: localSize: "
                    r0.append(r1)
                    int r1 = r12.size()
                    r0.append(r1)
                    r0.append(r14)
                    int r1 = r13.size()
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r0.addAll(r13)
                    r0.addAll(r10)
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "saveManifest result: size: "
                    r1.append(r2)
                    int r2 = r0.size()
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r1)
                    if (r0 != r9) goto L_0x0400
                    return r9
                L_0x0400:
                    r1 = r17
                    r2 = r20
                    r4 = r25
                L_0x0406:
                    r5 = r0
                    java.util.List r5 = (java.util.List) r5
                    java.util.HashMap<java.lang.String, java.lang.String> r6 = r8.f109413o
                    r0 = 0
                    r8.f109405d = r0
                    r8.f109406e = r0
                    r8.f109407f = r0
                    r0 = 2
                    r8.f109409h = r0
                    r0 = r18
                    r7 = r35
                    java.lang.Object r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43986b(r0, r1, r2, r4, r5, r6, r7)
                    if (r0 != r9) goto L_0x0420
                    return r9
                L_0x0420:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40723g.C40725b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public C40723g(long j, HashMap<String, String> hashMap) {
            this.f109402a = j;
            this.f109403b = hashMap;
        }

        /* renamed from: a */
        public void mo63630a(C51444tt1 tt12, int i, int i2, String str, C51737vt1 vt12) {
            String string;
            int i3 = i;
            int i4 = i2;
            C51737vt1 vt13 = vt12;
            C87412m.m108594g(tt12, "req");
            if (i3 != 0 && i4 != 0) {
                Log.m105920e("MicroMsg.WebPrefetcher", "sendGetA8KeyLiteRequest:" + i3 + ", " + i4 + ", " + str);
            } else if (vt13 != null) {
                long j = this.f109402a;
                HashMap<String, String> hashMap = this.f109403b;
                Log.m105924i("MicroMsg.WebPrefetcher", "GetA8KeyLiteResponse: " + vt13.f143690h.size());
                if (BuildInfo.DEBUG) {
                    String str2 = "";
                    if (C43520v.f117665a.mo67810a() && (string = C5857x.m5577a().getString("DebugLocalIP", str2)) != null) {
                        str2 = string;
                    }
                    C51011qt1 qt12 = new C51011qt1();
                    qt12.f140537d = str2;
                    LinkedList<C51154rt1> linkedList = qt12.f140539f;
                    C51154rt1 rt12 = new C51154rt1();
                    rt12.f141126d = "/wechat_test/";
                    rt12.f141127e = HttpWrapperBase.PROTOCAL_HTTP + str2 + ":8000/wechat_test/manifest.js";
                    linkedList.add(rt12);
                    vt13.f143690h.add(new C89349b(qt12.toByteArray()));
                }
                C40717k0.f109363a.getClass();
                LinkedList<C50873pt1> linkedList2 = vt13.f143689g;
                C87412m.m108593f(linkedList2, "DomainInfos");
                for (C50873pt1 pt12 : linkedList2) {
                    String str3 = pt12.f139949d;
                    if (str3 != null) {
                        pt12.f139952g = MMSlotKt.now();
                        ((MultiProcessMMKV) C40717k0.f109364b.getSlotForWrite()).encode(C40714i.m43958g(str3, false, 2, (Object) null), pt12.toByteArray());
                        Log.m105924i("MicroMsg.WebPrefetcher", "save preauth domain:" + str3 + ' ' + pt12.f139950e + ' ' + pt12.f139951f);
                    }
                }
                C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C40725b(vt12, j, tt12, hashMap, (C15601d<? super C40725b>) null), 3, (Object) null);
            }
        }

        /* renamed from: b */
        public boolean mo63631b(C51444tt1 tt12) {
            C87412m.m108594g(tt12, "req");
            C45767f fVar = C45767f.f123649a;
            if (((Number) ((C36570n) C45767f.f123651c).getValue()).intValue() <= 0 || ((Number) ((C36570n) C45767f.f123652d).getValue()).intValue() != 2) {
                return false;
            }
            Log.m105924i("MicroMsg.WebViewPrefetchTestReportUtil", "ClosePrefetchAndA8key");
            return true;
        }

        /* renamed from: c */
        public void mo63632c(C51444tt1 tt12) {
            C87412m.m108594g(tt12, "req");
            C45767f fVar = C45767f.f123649a;
            if (((Number) ((C36570n) C45767f.f123651c).getValue()).intValue() > 0 || BuildInfo.DEBUG) {
                C61926c.m72656A((String) null, new C40724a(tt12));
            }
        }
    }

    static {
        new MMKVSlotManager(C40780x0.m44078a(), 43200);
    }

    /* renamed from: a */
    public static final void m43985a(C40717k0 k0Var, String str, String str2, C46353a aVar, int i, Map map, C48555a aVar2) {
        k0Var.getClass();
        boolean a = C46581c.m51903a();
        C89349b bVar = (C89349b) ((C36570n) aVar.f124940v).getValue();
        Log.m105924i("MicroMsg.WebPrefetcher", "fetchContent businessData: " + C48374j0.m53713b(bVar) + ", enableFetchByTransfer: " + a);
        C46580b bVar2 = new C46580b(str, aVar, str2, map);
        String b = C48374j0.m53713b(bVar);
        if (b == null) {
            b = "";
        }
        bVar2.f125483e = b;
        C40740m0 m0Var = new C40740m0(str, aVar, str2, map, aVar2);
        Iterator it = ((ArrayList) C46581c.f125485b).iterator();
        while (it.hasNext()) {
            C46799c cVar = (C46799c) it.next();
            if (cVar.mo72017a(bVar2) && cVar.mo72018b(bVar2, m0Var)) {
                Log.m105925i("MicroMsg.WebPrefetcherContentManager", "fetchContent by " + cVar.name() + ", url: %s", bVar2.f125479a);
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v1, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v4, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v69, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v2, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v70, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r39v3, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v51, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Can't wrap try/catch for region: R(27:85|(1:87)(1:88)|(1:90)(1:91)|92|(1:97)(1:96)|(2:99|(21:101|(2:(1:107)(1:106)|(4:109|(11:111|112|(19:114|117|131|(1:133)(1:134)|135|(2:137|(9:140|141|(13:199|201|221|222|223|224|225|(7:227|228|229|230|231|232|233)(1:238)|239|(1:241)(1:242)|247|250|(1:251)(0))|143|(1:145)(1:146)|147|(1:149)(11:150|151|(5:153|(8:166|167|171|(1:173)(1:174)|175|(1:177)(19:178|179|(3:184|(1:189)(1:188)|190)(1:182)|183|191|(4:193|(14:195|196|198|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0))|159|284)|197|198|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0)(0))|177|285)|155|(4:157|(11:160|161|(8:163|167|171|(0)(0)|175|(0)|177|285)|164|170|171|(0)(0)|175|(0)(0)|177|285)|159|284)|165)(1:168)|169|170|171|(0)(0)|175|(0)|177|285)|149|283))|200|201|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0))|115|129|131|(0)(0)|135|(13:200|201|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0)(0))|137|(0))|139|282))|116|117|131|(0)(0)|135|(0)|200|201|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0)))|118|(1:123)(1:122)|(4:125|(9:127|128|129|131|(0)(0)|135|(0)|137|(0))|139|282)|130|131|(0)(0)|135|(0)|200|201|221|222|223|224|225|(0)(0)|239|(0)(0)|247|250|(0)(0)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:227|228|229|230|231|232|233) */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0836, code lost:
        if (((java.lang.Boolean) ((rx3.C36570n) t73.C48558d.f129899K).getValue()).booleanValue() != false) goto L_0x0838;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x083a, code lost:
        if (r3.f129892f == false) goto L_0x083c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x083c, code lost:
        if (r8 == null) goto L_0x0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0845, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0847, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0848, code lost:
        if (r12 == false) goto L_0x084a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x084a, code lost:
        r12 = r21;
        r14 = r24;
        r14.f109467d = r12;
        r14.f109468e = r1;
        r14.f109469f = r0;
        r14.f109470g = r2;
        r21 = r11;
        r11 = r23;
        r14.f109471h = r11;
        r14.f109472i = r7;
        r23 = r7;
        r7 = r22;
        r14.f109473j = r7;
        r14.f109474n = r9;
        r22 = r9;
        r9 = r28;
        r14.f109475o = r9;
        r24 = r9;
        r9 = r29;
        r14.f109476p = r9;
        r28 = r9;
        r9 = r27;
        r14.f109477q = r9;
        r14.f109478r = r13;
        r14.f109479s = r13;
        r14.f109480t = r15;
        r64 = r15;
        r15 = r65;
        r14.f109481u = r15;
        r14.f109482v = r3;
        r14.f109483w = r4;
        r14.f109484x = r10;
        r14.f109485y = r8;
        r14.f109486z = r5;
        r29 = r5;
        r14.f109460A = r25;
        r14.f109461B = r20;
        r14.f109462C = 1;
        r14.f109466G = 1;
        r6 = r67.mo63616d(r3, r13, r14);
        r5 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x08a5, code lost:
        if (r6 != r5) goto L_0x08a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x08a9, code lost:
        r32 = r3;
        r31 = r4;
        r19 = r8;
        r27 = r10;
        r4 = r13;
        r3 = r24;
        r8 = r26;
        r33 = 1;
        r10 = r66;
        r26 = r1;
        r24 = r2;
        r1 = r15;
        r15 = r21;
        r2 = r64;
        r21 = r7;
        r7 = r63;
        r59 = r25;
        r25 = r0;
        r0 = r6;
        r6 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x08d4, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x08d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x08d6, code lost:
        r0 = r25;
        r25 = r6;
        r59 = r15;
        r15 = r1;
        r1 = r26;
        r26 = r8;
        r8 = r19;
        r19 = r4;
        r4 = r2;
        r2 = r24;
        r24 = r10;
        r10 = r27;
        r27 = r18;
        r18 = r59;
        r60 = r29;
        r29 = r3;
        r30 = r28;
        r3 = r32;
        r28 = r9;
        r9 = r22;
        r22 = r20;
        r20 = r13;
        r13 = r5;
        r5 = r60;
        r62 = r23;
        r23 = r7;
        r7 = r62;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x090a, code lost:
        r0 = r8;
        r8 = r19;
        r19 = r18;
        r18 = false;
        r59 = r14;
        r14 = r10;
        r10 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0918, code lost:
        r64 = r15;
        r12 = r21;
        r14 = r24;
        r24 = r28;
        r28 = r29;
        r15 = r65;
        r29 = r5;
        r21 = r11;
        r5 = r19;
        r11 = r23;
        r23 = r7;
        r7 = r22;
        r22 = r9;
        r9 = r27;
        r31 = r4;
        r19 = r13;
        r27 = r18;
        r18 = r21;
        r33 = 1;
        r4 = r64;
        r21 = r7;
        r7 = r23;
        r23 = r63;
        r13 = r5;
        r5 = r29;
        r29 = r24;
        r30 = r28;
        r24 = r66;
        r28 = r9;
        r9 = r22;
        r22 = r20;
        r20 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0957, code lost:
        r36 = r5;
        r38 = r13;
        r39 = r15;
        r13 = r19;
        r19 = r25;
        r6 = r26;
        r26 = r30;
        r5 = true;
        r15 = r14;
        r30 = r21;
        r25 = r23;
        r23 = r28;
        r21 = r4;
        r14 = r8;
        r28 = r9;
        r4 = r18;
        r18 = r22;
        r9 = r33;
        r8 = r2;
        r22 = r20;
        r20 = r31;
        r2 = r1;
        r59 = r29;
        r29 = r27;
        r27 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0986, code lost:
        r64 = r15;
        r12 = r21;
        r14 = r24;
        r24 = r28;
        r28 = r29;
        r15 = r65;
        r29 = r5;
        r21 = r11;
        r5 = r19;
        r11 = r23;
        r6 = r67;
        r23 = r7;
        r7 = r22;
        r22 = r9;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x09a4, code lost:
        if (r8 == null) goto L_0x09b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x09ad, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x09b0, code lost:
        r19 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x09b2, code lost:
        if (r19 != false) goto L_0x0a8d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x09b4, code lost:
        r14.f109467d = r12;
        r14.f109468e = r1;
        r14.f109469f = r0;
        r14.f109470g = r2;
        r14.f109471h = r11;
        r19 = r11;
        r11 = r23;
        r14.f109472i = r11;
        r14.f109473j = r7;
        r23 = r7;
        r14.f109474n = r22;
        r14.f109475o = r24;
        r14.f109476p = r28;
        r14.f109477q = r9;
        r14.f109478r = r13;
        r14.f109479s = r13;
        r14.f109480t = r64;
        r14.f109481u = r15;
        r14.f109482v = r3;
        r14.f109483w = r4;
        r14.f109484x = r10;
        r14.f109485y = r8;
        r27 = r8;
        r7 = r29;
        r14.f109486z = r7;
        r29 = r4;
        r4 = r25;
        r14.f109460A = r4;
        r25 = r10;
        r10 = r20;
        r14.f109461B = r10;
        r65 = r15;
        r14.f109462C = 0;
        r14.f109466G = 2;
        r6 = r6.mo63616d(r3, r13, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0a06, code lost:
        if (r6 != r5) goto L_0x0a0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0a0a, code lost:
        r15 = r66;
        r32 = r3;
        r20 = r25;
        r31 = r29;
        r33 = 0;
        r3 = r64;
        r25 = r0;
        r0 = r6;
        r29 = r7;
        r8 = r26;
        r7 = r63;
        r26 = r1;
        r6 = r4;
        r4 = r13;
        r1 = r65;
        r59 = r24;
        r24 = r2;
        r2 = r59;
        r60 = r23;
        r23 = r19;
        r19 = r21;
        r21 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0a33, code lost:
        r59 = r18;
        r18 = ((java.lang.Boolean) r0).booleanValue();
        r0 = r8;
        r8 = r27;
        r27 = r20;
        r20 = r10;
        r10 = r14;
        r14 = r15;
        r15 = r19;
        r19 = r59;
        r60 = r3;
        r3 = r2;
        r2 = r60;
        r61 = r23;
        r23 = r11;
        r11 = r61;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0a55, code lost:
        r39 = r1;
        r38 = r5;
        r5 = r18;
        r18 = r20;
        r36 = r29;
        r20 = r31;
        r29 = r19;
        r30 = r21;
        r21 = r2;
        r19 = r6;
        r2 = r26;
        r26 = r28;
        r6 = r0;
        r28 = r22;
        r0 = r25;
        r25 = r7;
        r22 = r13;
        r7 = r23;
        r13 = r4;
        r23 = r9;
        r4 = r15;
        r9 = r33;
        r15 = r10;
        r10 = r27;
        r27 = r3;
        r3 = r32;
        r59 = r14;
        r14 = r8;
        r8 = r24;
        r24 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0a8d, code lost:
        r19 = r11;
        r11 = r23;
        r23 = r7;
        r7 = r29;
        r29 = r4;
        r4 = r25;
        r25 = r10;
        r10 = r20;
        r39 = r15;
        r38 = r5;
        r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a.mo63590b();
        r36 = r7;
        r7 = r11;
        r15 = r14;
        r11 = r19;
        r30 = r23;
        r6 = r26;
        r14 = r8;
        r26 = r28;
        r20 = r29;
        r8 = r2;
        r19 = r4;
        r23 = r9;
        r29 = r18;
        r4 = r21;
        r28 = r22;
        r27 = r24;
        r9 = 0;
        r21 = r64;
        r24 = r66;
        r2 = r1;
        r18 = r10;
        r22 = r13;
        r10 = r25;
        r25 = r63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0ad7, code lost:
        r1 = new java.lang.StringBuilder();
        r31 = r7;
        r1.append("savePrefetch appId=");
        r1.append(r10);
        r1.append(" fetched=");
        r1.append(r5);
        r1.append(" debug:");
        r1.append(r3.f129892f);
        r1.append(" usePkg=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0afe, code lost:
        if (r9 == 0) goto L_0x0b02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0b00, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0b02, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0b03, code lost:
        r1.append(r7);
        r1.append(", manifestUrl: ");
        r1.append(r14);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0b15, code lost:
        if (r5 == false) goto L_0x106f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0b17, code lost:
        r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r5 = r13.f137783i;
        gy3.C87412m.m108593f(r5, r6);
        r15.f109467d = r12;
        r15.f109468e = r2;
        r15.f109469f = r0;
        r15.f109470g = r8;
        r15.f109471h = r11;
        r7 = r31;
        r15.f109472i = r7;
        r14 = r30;
        r15.f109473j = r14;
        r30 = r0;
        r15.f109474n = r28;
        r15.f109475o = r27;
        r15.f109476p = r26;
        r15.f109477q = r23;
        r15.f109478r = r22;
        r15.f109479s = r13;
        r15.f109480t = r21;
        r0 = r39;
        r15.f109481u = r0;
        r15.f109482v = r3;
        r31 = r0;
        r15.f109483w = r20;
        r15.f109484x = r10;
        r15.f109485y = null;
        r32 = r6;
        r33 = r7;
        r6 = r36;
        r15.f109486z = r6;
        r15.f109460A = r19;
        r15.f109461B = r18;
        r15.f109462C = r9;
        r15.f109466G = 3;
        r0 = r1.mo63599k(r3, r5, r15);
        r5 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0b78, code lost:
        if (r0 != r5) goto L_0x0b7d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0b7d, code lost:
        r1 = r2;
        r41 = r5;
        r43 = r6;
        r45 = r10;
        r40 = r18;
        r42 = r19;
        r46 = r20;
        r19 = r21;
        r21 = r22;
        r7 = r28;
        r2 = r30;
        r47 = r31;
        r5 = r32;
        r6 = r33;
        r10 = r3;
        r20 = r4;
        r18 = r9;
        r4 = r23;
        r9 = r26;
        r3 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0ba9, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x1042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0bad, code lost:
        if (r10.f129892f != false) goto L_0x0baf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0baf, code lost:
        r0 = android.net.Uri.parse(r13.f137783i).getHost();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0bba, code lost:
        r0 = r45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0bbc, code lost:
        r13.f137789r = r0;
        r63 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r0 = r13.f137783i;
        gy3.C87412m.m108593f(r0, r5);
        r15.f109467d = r12;
        r15.f109468e = r1;
        r15.f109469f = r2;
        r15.f109470g = r8;
        r15.f109471h = r11;
        r15.f109472i = r6;
        r15.f109473j = r14;
        r15.f109474n = r7;
        r15.f109475o = r3;
        r15.f109476p = r9;
        r15.f109477q = r4;
        r22 = r1;
        r15.f109478r = r21;
        r15.f109479s = r13;
        r15.f109480t = r19;
        r1 = r47;
        r15.f109481u = r1;
        r15.f109482v = r10;
        r23 = r1;
        r1 = r46;
        r15.f109483w = r1;
        r26 = r1;
        r1 = r45;
        r15.f109484x = r1;
        r28 = r1;
        r27 = r2;
        r1 = r43;
        r15.f109486z = r1;
        r30 = r1;
        r1 = r42;
        r15.f109460A = r1;
        r2 = r40;
        r15.f109461B = r2;
        r32 = r1;
        r15.f109462C = r18;
        r15.f109466G = 4;
        r0 = r63.mo63592d(r10, r0, r15);
        r1 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0c1e, code lost:
        if (r0 == r1) goto L_0x0c20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0c23, code lost:
        r48 = r1;
        r49 = r2;
        r1 = r22;
        r53 = r23;
        r2 = r27;
        r51 = r30;
        r50 = r32;
        r22 = r4;
        r4 = r10;
        r10 = r3;
        r3 = r18;
        r18 = r19;
        r19 = r5;
        r5 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0c3d, code lost:
        r0 = ((java.lang.Number) r0).intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0c43, code lost:
        if (r3 != 0) goto L_0x0c45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0c45, code lost:
        r69 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0c49, code lost:
        if (r4.f129892f != false) goto L_0x0d1c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0c4c, code lost:
        if (r0 == 1) goto L_0x0c4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0c4e, code lost:
        r63 = q73.C35796c0.f95588a;
        gy3.C87412m.m108593f(r5, "manifestAppId");
        r3 = r13.f137795x;
        r15.f109467d = r12;
        r15.f109468e = r1;
        r15.f109469f = r2;
        r15.f109470g = r8;
        r15.f109471h = r11;
        r15.f109472i = r6;
        r15.f109473j = r14;
        r15.f109474n = r7;
        r15.f109475o = r10;
        r15.f109476p = r9;
        r23 = r1;
        r15.f109477q = r22;
        r15.f109478r = r21;
        r15.f109479s = r13;
        r15.f109480t = r18;
        r1 = r53;
        r15.f109481u = r1;
        r15.f109482v = r4;
        r15.f109483w = r5;
        r27 = r1;
        r15.f109484x = null;
        r28 = r2;
        r1 = r51;
        r15.f109486z = r1;
        r30 = r1;
        r1 = r50;
        r15.f109460A = r1;
        r2 = r49;
        r15.f109461B = r2;
        r32 = r1;
        r1 = r69;
        r15.f109462C = r1;
        r15.f109463D = r0;
        r69 = r0;
        r15.f109466G = 5;
        r0 = r63.mo60403d(r4, r5, r26, r3, r15);
        r3 = r48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0cb7, code lost:
        if (r0 != r3) goto L_0x0cbc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0cbc, code lost:
        r26 = r5;
        r5 = r2;
        r2 = r15;
        r15 = r24;
        r24 = r28;
        r28 = r27;
        r27 = r4;
        r4 = r3;
        r3 = r1;
        r1 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0cd2, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0cd4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0cd4, code lost:
        r0 = r1;
        r48 = r4;
        r49 = r5;
        r1 = r23;
        r5 = r26;
        r53 = r28;
        r51 = r30;
        r50 = r32;
        r4 = r3;
        r3 = r18;
        r59 = r15;
        r15 = r2;
        r2 = r24;
        r24 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0cee, code lost:
        r0 = r1;
        r48 = r4;
        r49 = r5;
        r5 = r21;
        r4 = r22;
        r1 = r23;
        r53 = r28;
        r51 = r30;
        r50 = r32;
        r59 = r15;
        r15 = r2;
        r2 = r24;
        r24 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0d08, code lost:
        r23 = r1;
        r28 = r2;
        r3 = r48;
        r2 = r49;
        r32 = r50;
        r30 = r51;
        r27 = r53;
        r1 = r69;
        r69 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0d1c, code lost:
        r23 = r1;
        r28 = r2;
        r3 = r48;
        r2 = r49;
        r32 = r50;
        r30 = r51;
        r27 = r53;
        r1 = r69;
        r69 = r0;
        r3 = r18;
        r2 = r28;
        r27 = r4;
        r4 = r1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0d37, code lost:
        r64 = r1;
        r66 = r3;
        ((ex0.C45696d) f40.C86709a0.m107533q(r29)).mo70968P2(r5, r13.f137783i, "itemExpose", (java.lang.String) null);
        r1 = r0;
        r0 = r64;
        r2 = r2;
        r3 = r12;
        r5 = r14;
        r12 = r20;
        r54 = r22;
        r64 = r27;
        r18 = r48;
        r55 = r49;
        r56 = r50;
        r57 = r51;
        r63 = r53;
        r20 = r66;
        r22 = r9;
        r14 = r10;
        r10 = r19;
        r19 = r4;
        r9 = r7;
        r4 = r13;
        r7 = r25;
        r59 = r8;
        r8 = r6;
        r6 = r11;
        r11 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0d7c, code lost:
        r69 = r0;
        r23 = r1;
        r28 = r2;
        r1 = r3;
        r3 = r48;
        r2 = r49;
        r32 = r50;
        r30 = r51;
        r27 = r53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0d8d, code lost:
        r0 = r69;
        r49 = r2;
        r48 = r3;
        r5 = r21;
        r53 = r27;
        r2 = r28;
        r51 = r30;
        r50 = r32;
        r3 = r1;
        r27 = r4;
        r4 = r22;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0da4, code lost:
        r54 = r4;
        r21 = r5;
        r22 = r9;
        r4 = r13;
        r5 = r14;
        r64 = r27;
        r55 = r49;
        r56 = r50;
        r57 = r51;
        r63 = r53;
        r9 = r7;
        r14 = r10;
        r10 = r19;
        r7 = r25;
        r19 = r3;
        r3 = r12;
        r12 = r20;
        r20 = r18;
        r18 = r48;
        r59 = r1;
        r1 = r0;
        r0 = r59;
        r60 = r8;
        r8 = r6;
        r6 = r11;
        r11 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0dd0, code lost:
        r4.f137782h = r4.f137783i;
        r23 = r14;
        r25 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0de4, code lost:
        if (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a().getBoolean("tencent_view_inews_prefix", false) == false) goto L_0x0df8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0de6, code lost:
        r13 = r4.f137782h;
        gy3.C87412m.m108593f(r13, r7);
        r26 = r7;
        r4.f137782h = z04.C112551y.m153817q(r13, "//view.inews.qq.com", "//ssr.view.inews.qq.com", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0df8, code lost:
        r26 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0dfa, code lost:
        r4.f137785n = true;
        r4.f137790s = true;
        r4.f137792u = t73.C48572p.m53971b(r64);
        r7 = r64;
        r4.f137793v = r7.f129888b.f141133n;
        f109363a.mo63620m(r4);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, "prefetch call, header size: " + r63.size() + ", url: " + r4.f137782h + ", fetchPkgType: " + r1 + ", pkgFileKey: " + r4.f137792u);
        r27 = r12;
        r28 = r1;
        r30 = r7;
        f93.C31965e.m39600a(f93.C31965e.C31966a.ACTION_MANIFEST_OPEN_PREFETCH, r4.f137778d, r4.f137783i, r4.f137795x, r4.f137787p, r4.f137788q);
        r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r7 = r4.f137783i;
        gy3.C87412m.m108593f(r7, r10);
        r15.f109467d = r3;
        r15.f109468e = r0;
        r15.f109469f = r2;
        r15.f109470g = r11;
        r15.f109471h = r6;
        r15.f109472i = r8;
        r15.f109473j = r5;
        r9 = r25;
        r15.f109474n = r9;
        r12 = r23;
        r15.f109475o = r12;
        r13 = r22;
        r15.f109476p = r13;
        r14 = r54;
        r15.f109477q = r14;
        r22 = r0;
        r15.f109478r = r21;
        r15.f109479s = r4;
        r15.f109480t = r20;
        r0 = r63;
        r15.f109481u = r0;
        r23 = r0;
        r0 = r30;
        r15.f109482v = r0;
        r25 = r2;
        r15.f109483w = null;
        r15.f109484x = null;
        r30 = r3;
        r2 = r57;
        r15.f109486z = r2;
        r31 = r2;
        r2 = r56;
        r15.f109460A = r2;
        r3 = r55;
        r15.f109461B = r3;
        r33 = r2;
        r15.f109462C = r19;
        r15.f109463D = r28;
        r15.f109466G = 6;
        r1 = r1.mo63598j(r0, r7, r15);
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0ecd, code lost:
        if (r1 != r2) goto L_0x0ed2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0ed2, code lost:
        r63 = r0;
        r0 = r1;
        r18 = r2;
        r1 = r8;
        r37 = r23;
        r7 = r25;
        r2 = r28;
        r64 = r31;
        r8 = r6;
        r25 = r14;
        r23 = r20;
        r14 = r26;
        r6 = r30;
        r20 = r10;
        r10 = r13;
        r13 = r4;
        r4 = r22;
        r22 = r33;
        r59 = r21;
        r21 = r3;
        r3 = r24;
        r24 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0ef9, code lost:
        r0 = ((java.lang.Boolean) r0).booleanValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0eff, code lost:
        if (r19 == 0) goto L_0x0f12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0f04, code lost:
        r26 = r3;
        r46 = r9;
        r44 = r10;
        r45 = r12;
        r47 = r13;
        r28 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0f12, code lost:
        r30 = f109363a;
        r0 = r13.f137778d;
        gy3.C87412m.m108593f(r0, r3);
        r26 = r3;
        r3 = r13.f137782h;
        gy3.C87412m.m108593f(r3, r14);
        r28 = r14;
        r14 = r13.f137789r;
        r44 = r10;
        r10 = r13.f137787p;
        r45 = r12;
        r12 = r13.f137788q;
        r46 = r9;
        r9 = r13.f137795x;
        r47 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0f38, code lost:
        if (oy0.C35337b.m40642a() == false) goto L_0x0f40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0f3d, code lost:
        r42 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0f40, code lost:
        r42 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0f42, code lost:
        r30.mo63619l(r64, r0, r3, r14, false, r37, r10, r12, r9, r63, r42, com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44116b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0f5a, code lost:
        r5.f27482d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0f5c, code lost:
        if (r19 == 0) goto L_0x0f5e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0f5e, code lost:
        r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r15.f109467d = r6;
        r15.f109468e = r4;
        r15.f109469f = r7;
        r15.f109470g = r11;
        r15.f109471h = r8;
        r15.f109472i = r1;
        r15.f109473j = r5;
        r9 = r46;
        r15.f109474n = r9;
        r12 = r45;
        r15.f109475o = r12;
        r13 = r44;
        r15.f109476p = r13;
        r14 = r25;
        r15.f109477q = r14;
        r15.f109478r = r24;
        r15.f109479s = r47;
        r3 = r23;
        r15.f109480t = r3;
        r10 = r63;
        r15.f109481u = r10;
        r19 = r1;
        r15.f109482v = null;
        r1 = r64;
        r15.f109486z = r1;
        r23 = r1;
        r1 = r22;
        r15.f109460A = r1;
        r2 = r21;
        r15.f109461B = r2;
        r21 = r3;
        r15.f109466G = 7;
        r0 = r0.mo63591c(r10, r15);
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0fac, code lost:
        if (r0 != r3) goto L_0x0fb0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0fb0, code lost:
        r22 = r13;
        r18 = r14;
        r13 = r28;
        r14 = r47;
        r59 = r3;
        r3 = r1;
        r1 = r19;
        r19 = r7;
        r7 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0fc1, code lost:
        r10 = r10.f129887a.f140537d;
        r63 = r1;
        gy3.C87412m.m108593f(r10, "manifest.domain.Domain");
        r1 = r14.f137782h;
        gy3.C87412m.m108593f(r1, r13);
        oy0.C47404c.m52734a((java.util.List) r0, r10, r1);
        r64 = r63;
        r63 = r3;
        r28 = r13;
        r10 = r18;
        r13 = r21;
        r0 = r27;
        r3 = r2;
        r2 = r7;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0fe7, code lost:
        r2 = r21;
        r21 = r23;
        r12 = r45;
        r9 = r46;
        r23 = r64;
        r63 = r22;
        r22 = r44;
        r10 = r25;
        r64 = r1;
        r13 = r21;
        r0 = r27;
        r14 = r47;
        r3 = r2;
        r2 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x100d, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, "end prefetch #" + r13 + ' ' + r14.f137782h);
        r13 = r3;
        r27 = r10;
        r3 = r11;
        r1 = r22;
        r10 = r26;
        r11 = r8;
        r26 = r20;
        r8 = r5;
        r5 = r12;
        r12 = r63;
        r63 = r64;
        r64 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x1042, code lost:
        r0 = r3;
        r38 = r41;
        r18 = r40;
        r3 = r4;
        r64 = r14;
        r4 = r19;
        r65 = r1;
        r10 = r24;
        r63 = r2;
        r14 = r42;
        r27 = r0;
        r32 = r5;
        r5 = r20;
        r0 = r43;
        r59 = r7;
        r7 = r6;
        r6 = r9;
        r9 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x106f, code lost:
        r32 = r6;
        r14 = r30;
        r5 = r38;
        r30 = r0;
        r65 = r2;
        r0 = r36;
        r64 = r14;
        r14 = r19;
        r3 = r23;
        r10 = r24;
        r6 = r26;
        r9 = r28;
        r63 = r30;
        r7 = r31;
        r5 = r4;
        r4 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x1091, code lost:
        f109363a.mo63620m(r13);
        r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a;
        r66 = r3;
        r3 = r13.f137778d;
        gy3.C87412m.m108593f(r3, r10);
        r67 = r6;
        r2.mo63642a(r0, r3, 10);
        com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, "fail to prefetch #" + r4 + ' ' + r13.f137778d);
        r4 = r65;
        r23 = r0;
        r0 = r5;
        r3 = r8;
        r6 = r12;
        r12 = r14;
        r28 = r25;
        r5 = r27;
        r26 = r32;
        r8 = r64;
        r27 = r66;
        r1 = r67;
        r14 = r13;
        r13 = r18;
        r64 = r38;
        r59 = r7;
        r7 = r63;
        r63 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x10e5, code lost:
        r4 = r12;
        r66 = r14;
        r26 = r15;
        r10 = r20;
        r12 = r21;
        r14 = r24;
        r0 = r25;
        r24 = r28;
        r28 = r29;
        r21 = r11;
        r11 = r7;
        r7 = r5;
        r5 = r19;
        r19 = r23;
        r23 = r22;
        r22 = r9;
        r9 = r27;
        r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a;
        r15 = r13.f137778d;
        r3 = r66;
        gy3.C87412m.m108593f(r15, r3);
        r20 = r5;
        r6.mo63642a(r7, r15, 9);
        r5 = r13.f137783i;
        r6 = r26;
        gy3.C87412m.m108593f(r5, r6);
        r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43961j(r5);
        r15 = (te3.C51011qt1) r9.get(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x1127, code lost:
        if (r15 != null) goto L_0x1129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x1129, code lost:
        r26 = r6;
        r6 = new java.lang.Integer(r15.f140540g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x1133, code lost:
        r26 = r6;
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x1136, code lost:
        r15 = new java.lang.StringBuilder();
        r25 = r10;
        r15.append("savePrefetch host: ");
        r15.append(r5);
        r15.append(", openType: ");
        r15.append(r6);
        r10 = r21;
        com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r15.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x1157, code lost:
        if (r6 != null) goto L_0x115b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x1162, code lost:
        r5 = sx0.C48489d.f129685i;
        r13.f137785n = true;
        r13.f137790s = false;
        r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a;
        r15 = r13.f137778d;
        gy3.C87412m.m108593f(r15, r3);
        r14.f109467d = r12;
        r14.f109468e = r1;
        r14.f109469f = r0;
        r14.f109470g = r2;
        r5 = r19;
        r14.f109471h = r5;
        r14.f109472i = r11;
        r19 = r0;
        r14.f109473j = r23;
        r14.f109474n = r22;
        r64 = r2;
        r2 = r24;
        r14.f109475o = r2;
        r66 = r3;
        r3 = r28;
        r14.f109476p = r3;
        r14.f109477q = r9;
        r14.f109478r = r13;
        r14.f109479s = r13;
        r14.f109480t = null;
        r14.f109481u = null;
        r14.f109482v = null;
        r14.f109483w = null;
        r14.f109484x = null;
        r14.f109485y = null;
        r14.f109486z = r7;
        r14.f109460A = r4;
        r14.f109461B = r25;
        r14.f109466G = 8;
        r6 = r6.mo63589a(2, r15, r14);
        r15 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x11ba, code lost:
        if (r6 != r15) goto L_0x11bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x11bf, code lost:
        r21 = r2;
        r24 = r3;
        r0 = r13;
        r3 = r25;
        r2 = r64;
        r13 = r9;
        r9 = r66;
        r59 = r7;
        r8 = r63;
        r7 = r4;
        r4 = r15;
        r15 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x11d9, code lost:
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L_0x11db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x11db, code lost:
        r63 = r1;
        r25 = r0;
        r64 = r2;
        r65 = r4;
        ((ex0.C45696d) f40.C86709a0.m107533q(r18)).mo70968P2("", r0.f137778d, "urlExposed", (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x11f5, code lost:
        r25 = r0;
        r63 = r1;
        r64 = r2;
        r65 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x11fe, code lost:
        r1 = r63;
        r2 = r64;
        r17 = r8;
        r6 = r10;
        r27 = r13;
        r10 = r14;
        r0 = r19;
        r28 = r21;
        r8 = r23;
        r29 = r24;
        r13 = r25;
        r25 = r3;
        r14 = r9;
        r3 = r12;
        r9 = r22;
        r12 = r7;
        r7 = r11;
        r11 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x121d, code lost:
        r66 = r3;
        r5 = r19;
        r3 = r28;
        r17 = r63;
        r28 = r24;
        r29 = r3;
        r27 = r9;
        r6 = r10;
        r3 = r12;
        r10 = r14;
        r9 = r22;
        r2 = r2;
        r14 = r66;
        r12 = r4;
        r0 = r0;
        r59 = r7;
        r7 = r11;
        r11 = r20;
        r8 = r23;
        r15 = r59;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x1249, code lost:
        f109363a.mo63620m(r13);
        r4 = r1;
        r63 = r7;
        r64 = r11;
        r23 = r15;
        r1 = r29;
        r7 = r0;
        r11 = r5;
        r0 = r6;
        r15 = r10;
        r10 = r14;
        r29 = r18;
        r5 = r28;
        r6 = r3;
        r14 = r13;
        r28 = r17;
        r13 = r25;
        r3 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        r2 = r14.f137795x;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x1269, code lost:
        r65 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        r3 = (java.lang.Integer) r1.get(new java.lang.Integer(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x1276, code lost:
        if (r3 == null) goto L_0x1278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x127d, code lost:
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x1281, code lost:
        r67 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:?, code lost:
        r1.put(new java.lang.Integer(r2), new java.lang.Integer(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x128b, code lost:
        r67 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x128e, code lost:
        r66 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x1291, code lost:
        r66 = r4;
        r67 = r6;
        r1.put(new java.lang.Integer(r2), new java.lang.Integer(r3.intValue() + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x12a8, code lost:
        r3 = r14.f137778d;
        gy3.C87412m.m108593f(r3, r10);
        i93.C46206e.m51502i(0, r3, false, false, true, r9.f27482d, r8.f27482d, true);
        r3 = (java.lang.Integer) r5.get(new java.lang.Integer(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0563, code lost:
        if (r12 < r13) goto L_0x0565;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x12cf, code lost:
        if (r3 == null) goto L_0x12d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x12d1, code lost:
        r5.put(new java.lang.Integer(r2), new java.lang.Integer(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x12e0, code lost:
        r5.put(new java.lang.Integer(r2), new java.lang.Integer(r3.intValue() + 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x12f4, code lost:
        r65 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x12f7, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, "Report Error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x12fc, code lost:
        r19 = r64;
        r2 = r65;
        r3 = r67;
        r16 = r5;
        r14 = r10;
        r4 = r11;
        r10 = r15;
        r5 = r23;
        r15 = r26;
        r18 = r29;
        r11 = r0;
        r29 = r1;
        r0 = r7;
        r7 = r63;
        r1 = r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x1318, code lost:
        r64 = r2;
        r10 = r11;
        r66 = r14;
        r26 = r15;
        r15 = r19;
        r25 = r20;
        r14 = r24;
        r2 = r28;
        r3 = r29;
        r19 = r0;
        r11 = r7;
        r0 = r12;
        r12 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x132f, code lost:
        r7 = r5;
        r5 = r23;
        r23 = r22;
        r28 = r63;
        r16 = r2;
        r29 = r3;
        r4 = r5;
        r5 = r7;
        r27 = r27;
        r7 = r11;
        r3 = r12;
        r9 = r9;
        r8 = r23;
        r13 = r25;
        r2 = r64;
        r12 = r0;
        r11 = r10;
        r10 = r14;
        r0 = r19;
        r14 = r66;
        r19 = r15;
        r15 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0565, code lost:
        r20 = r13;
        r13 = new te3.m25();
        r21 = r3;
        r8.f27482d = false;
        r9.f27482d = false;
        r3 = r0.f142403n.get(r12).f141739e;
        r13.f137778d = r3;
        gy3.C87412m.m108593f(r3, r14);
        r13.f137796y = iy0.C9263p.m8908c(r3, r4);
        r13.f137783i = r1.f143688f.get(r12).f143116e;
        r13.f137791t = r1.f143688f.get(r12).f143131w;
        r3 = r13.f137778d;
        gy3.C87412m.m108593f(r3, r14);
        r22 = r8;
        r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r3, false);
        r8 = r0.f142403n.get(r12);
        r23 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x1359, code lost:
        r12 = r12 + 1;
        r63 = r28;
        r28 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x1361, code lost:
        r12 = r3;
        r10 = r11;
        r2 = r28;
        r3 = r29;
        r11 = r7;
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x1371, code lost:
        if ((!r11.isEmpty()) != false) goto L_0x1373;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:?, code lost:
        r12.mo63618k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x1377, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x1378, code lost:
        r4 = r0;
        com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, "preDns ex " + r4.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x1392, code lost:
        i93.C46206e.m51500g(r1.f143686d);
        r0 = new java.util.ArrayList(r2.size());
        r1 = r2.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x13ac, code lost:
        if (r1.hasNext() != false) goto L_0x13ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x05b6, code lost:
        if ((r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) != false) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x13ae, code lost:
        r4 = (java.util.Map.Entry) r1.next();
        i93.C46206e.m51498e(((java.lang.Number) r4.getValue()).intValue(), ((java.lang.Number) r4.getKey()).intValue());
        r0.add(rx3.C13598b0.f38549a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x13d1, code lost:
        r0 = new java.util.ArrayList(r3.size());
        r1 = r3.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x13e6, code lost:
        if (r1.hasNext() != false) goto L_0x13e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x13e8, code lost:
        r3 = (java.util.Map.Entry) r1.next();
        r4 = ((java.lang.Number) r3.getKey()).intValue();
        r3 = ((java.lang.Number) r3.getValue()).intValue();
        i93.C46206e.m51501h(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x140e, code lost:
        if (r2.get(new java.lang.Integer(r4)) != null) goto L_0x1410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x1410, code lost:
        r5 = r2.get(new java.lang.Integer(r4));
        gy3.C87412m.m108591d(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x1422, code lost:
        if (((java.lang.Number) r5).intValue() > r3) goto L_0x1424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x1424, code lost:
        r5 = r2.get(new java.lang.Integer(r4));
        gy3.C87412m.m108591d(r5);
        i93.C46206e.m51499f(((java.lang.Number) r5).intValue() - r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x143a, code lost:
        r0.add(rx3.C13598b0.f38549a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x05b8, code lost:
        r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x1440, code lost:
        com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.m44019b(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a, r7, false, 150, 2, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x05bc, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:?, code lost:
        return rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x05bd, code lost:
        if (r4 != null) goto L_0x05bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x05bf, code lost:
        r13.f137795x = r4.f109497u;
        r13.f137787p = r4.f109495s;
        r13.f137788q = r4.f109496t;
        r13.f137794w = r4.f109498v;
        r4 = rx3.C13598b0.f38549a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x05d1, code lost:
        r4 = r13.f137783i;
        gy3.C87412m.m108593f(r4, r15);
        r24 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x05df, code lost:
        if (z04.C112551y.m153819s(r4, "http", false) != false) goto L_0x05e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x05e1, code lost:
        r4 = new java.util.LinkedHashMap();
        r64 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x05f7, code lost:
        if (((h81.C32735h) di3.C86312j.m106911c(h81.C32735h.class)).mo58779Qe(h81.C32735h.C32737c.clicfg_webview_prefetch_get_a8key_lite_header, 1) == 1) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x05f9, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x05fb, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x05fc, code lost:
        r8 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a.mo67811b();
        r10 = new java.lang.StringBuilder();
        r25 = r0;
        r10.append("[TRACE_PREFETCH] useA8keyLiteHeader: ");
        r10.append(r3);
        r10.append(" mockUseA8keyLiteHeader: ");
        r10.append(r8);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0634, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, "[TRACE_PREFETCH] response header size : " + r1.f143688f.get(r12).f143130v.size());
        r0 = r1.f143688f.get(r12).f143130v;
        gy3.C87412m.m108593f(r0, "RespInfo[i].HttpHeader");
        r3 = new java.util.ArrayList();
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0672, code lost:
        if (r0.hasNext() != false) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0674, code lost:
        r8 = r0.next();
        r10 = (te3.C48857bh2) r8;
        r65 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x067f, code lost:
        if (r10.f131120d == null) goto L_0x0688;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0686, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0688, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0689, code lost:
        if (r0 == false) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x068b, code lost:
        r3.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x068e, code lost:
        r0 = r65;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0691, code lost:
        r0 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0699, code lost:
        if (r0.hasNext() != false) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x069b, code lost:
        r3 = (te3.C48857bh2) r0.next();
        r8 = r3.f131120d;
        gy3.C87412m.m108593f(r8, "it.Key");
        r3 = r3.f131121e;
        gy3.C87412m.m108593f(r3, "it.Value");
        r4.put(r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x06b3, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append("[TRACE_PREFETCH] useA8keyLiteHeader size : ");
        r0.append(r4.size());
        r0.append(" domains.size=");
        r0.append(r2.size());
        r0.append(", controlBytes: ");
        r3 = r1.f143688f.get(r12).f143131w;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x06df, code lost:
        if (r3 != null) goto L_0x06e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x06e1, code lost:
        r8 = new java.lang.Integer(r3.f257327a.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x06ea, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x06eb, code lost:
        r0.append(r8);
        r0.append(", authBits: ");
        r0.append(r1.f143688f.get(r12).f143126r);
        com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0.toString());
        r65 = r4;
        r13.f137779e = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now();
        r0 = r1.f143687e.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0717, code lost:
        if (r0 != null) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0720, code lost:
        r0 = true;
        r13.f137780f = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0724, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x072f, code lost:
        if (r1.f143688f.get(r12).f143126r != 0) goto L_0x0731;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0731, code lost:
        r13.f137781g = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0735, code lost:
        if (r13.f137780f == false) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0737, code lost:
        r7.add(r13.f137783i);
        r9.f27482d = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0742, code lost:
        if (r2.isEmpty() == false) goto L_0x0744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0744, code lost:
        f93.C31965e.m39600a(f93.C31965e.C31966a.ACTION_PREFETCH_RESP_VALID, r13.f137778d, r13.f137783i, r13.f137795x, r13.f137787p, r13.f137788q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0763, code lost:
        if (f93.C45767f.m51055a(r13.f137787p) != false) goto L_0x0765;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0765, code lost:
        f109363a.mo63620m(r13);
        r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a;
        r3 = r13.f137778d;
        gy3.C87412m.m108593f(r3, r14);
        r0.mo63642a(r5, r3, 11);
        r64 = r2;
        r10 = r11;
        r0 = r12;
        r66 = r14;
        r26 = r15;
        r15 = r19;
        r12 = r21;
        r14 = r24;
        r19 = r25;
        r2 = r28;
        r3 = r29;
        r11 = r7;
        r25 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x078f, code lost:
        r0 = f109363a;
        r3 = r13.f137783i;
        gy3.C87412m.m108593f(r3, r15);
        r3 = r0.mo63617h(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x079a, code lost:
        if (r3 == null) goto L_0x07a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x07a0, code lost:
        r4 = r4.f141132j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x07a3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x07a4, code lost:
        if (r3 != null) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x07a6, code lost:
        r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a;
        r10 = r13.f137778d;
        gy3.C87412m.m108593f(r10, r14);
        r26 = r15;
        r8.mo63642a(r5, r10, 7);
        r66 = r14;
        r67 = r0;
        f93.C31965e.m39600a(f93.C31965e.C31966a.ACTION_MATCH_MANIFEST, r13.f137778d, r13.f137783i, r13.f137795x, r13.f137787p, r13.f137788q);
        r0 = r25;
        r8 = r0.f142403n.get(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x07da, code lost:
        if ((r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) == false) goto L_0x07df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x07dc, code lost:
        r8 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x07df, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x07e0, code lost:
        if (r8 == null) goto L_0x07e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x07e2, code lost:
        r8 = r8.f109494r;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x07e5, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x07e6, code lost:
        r3.f129889c = r8;
        r3.f129890d = r13.f137787p;
        r3.f129891e = r13.f137788q;
        r8 = r3.f129888b;
        r10 = r8.f141131i;
        r8 = r8.f141127e;
        r14 = new java.lang.StringBuilder();
        r14.append("match prefetch#");
        r15 = r64;
        r14.append(r15);
        r25 = r12;
        r14.append(", ");
        r14.append(r13.f137778d);
        com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r14.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0818, code lost:
        if (r10 == null) goto L_0x0823;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0821, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0823, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0824, code lost:
        if (r12 == false) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0826, code lost:
        r12 = t73.C48558d.f129896H;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x09ad  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x09b0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0a0a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0b00  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0b02  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0b17  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0b7d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0de6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0df8  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0ecf  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0ed2  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x04ff  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x106f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x1129  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x1133  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x1162  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x11bc  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x11bf  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x121d  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x1278 A[Catch:{ Exception -> 0x128e }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x1291 A[Catch:{ Exception -> 0x12f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x12d1 A[Catch:{ Exception -> 0x12f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x12e0 A[Catch:{ Exception -> 0x12f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0565  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x1361  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x1373 A[SYNTHETIC, Splitter:B:253:0x1373] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x13ae A[LOOP:3: B:258:0x13a8->B:260:0x13ae, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x13e8  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0737  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0744  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0765  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x07a0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x07a3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x07df  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x07e2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0821  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0823  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0826  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m43986b(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0 r63, te3.C51737vt1 r64, long r65, te3.C51444tt1 r67, java.util.List r68, java.util.HashMap r69, wx3.C15601d r70) {
        /*
            r0 = r70
            r63.getClass()
            java.lang.Class<ex0.d> r1 = ex0.C45696d.class
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40745p0
            if (r2 == 0) goto L_0x001c
            r2 = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.p0 r2 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40745p0) r2
            int r3 = r2.f109466G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001c
            int r3 = r3 - r4
            r2.f109466G = r3
            r3 = r63
            goto L_0x0023
        L_0x001c:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.p0 r2 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.p0
            r3 = r63
            r2.<init>(r3, r0)
        L_0x0023:
            java.lang.Object r0 = r2.f109464E
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r2.f109466G
            java.lang.String r6 = "prefetchUrl"
            java.lang.String r7 = "fullUrl"
            java.lang.String r8 = "url"
            java.lang.String r9 = "MicroMsg.WebPrefetcher"
            switch(r5) {
                case 0: goto L_0x04ff;
                case 1: goto L_0x045c;
                case 2: goto L_0x03bb;
                case 3: goto L_0x0312;
                case 4: goto L_0x0269;
                case 5: goto L_0x01ca;
                case 6: goto L_0x0129;
                case 7: goto L_0x00aa;
                case 8: goto L_0x003e;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            int r3 = r2.f109461B
            int r5 = r2.f109460A
            long r11 = r2.f109486z
            java.lang.Object r13 = r2.f109479s
            te3.m25 r13 = (te3.m25) r13
            java.lang.Object r10 = r2.f109477q
            java.util.HashMap r10 = (java.util.HashMap) r10
            java.lang.Object r15 = r2.f109476p
            java.util.HashMap r15 = (java.util.HashMap) r15
            java.lang.Object r14 = r2.f109475o
            java.util.HashMap r14 = (java.util.HashMap) r14
            r18 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r63 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r64 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r65 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r66 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r67 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r68 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r69 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r22 = r63
            r23 = r64
            r19 = r68
            r26 = r7
            r21 = r14
            r24 = r15
            r14 = r2
            r7 = r5
            r15 = r11
            r11 = r65
            r5 = r66
            r2 = r67
            r12 = r1
            r1 = r69
            r59 = r6
            r6 = r0
            r0 = r13
            r13 = r10
            r10 = r9
            r9 = r8
            r8 = r59
            goto L_0x11d3
        L_0x00aa:
            r18 = r1
            int r1 = r2.f109461B
            int r3 = r2.f109460A
            long r10 = r2.f109486z
            java.lang.Object r5 = r2.f109481u
            t73.a r5 = (t73.C48555a) r5
            java.lang.Object r12 = r2.f109480t
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f109479s
            te3.m25 r13 = (te3.m25) r13
            java.lang.Object r14 = r2.f109477q
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.Object r15 = r2.f109476p
            java.util.HashMap r15 = (java.util.HashMap) r15
            r63 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r64 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r65 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r66 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r67 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r69 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r19 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r20 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r26 = r8
            r27 = r9
            r23 = r10
            r21 = r12
            r22 = r15
            r29 = r18
            r12 = r64
            r9 = r65
            r8 = r68
            r11 = r69
            r15 = r2
            r10 = r5
            r18 = r14
            r2 = r63
            r5 = r66
            r14 = r13
            r13 = r6
            r6 = r1
            r1 = r67
            r59 = r7
            r7 = r4
            r4 = r20
            r20 = r59
            goto L_0x0fc1
        L_0x0129:
            r18 = r1
            int r1 = r2.f109463D
            int r3 = r2.f109462C
            int r5 = r2.f109461B
            int r10 = r2.f109460A
            long r11 = r2.f109486z
            java.lang.Object r13 = r2.f109482v
            t73.a r13 = (t73.C48555a) r13
            java.lang.Object r14 = r2.f109481u
            java.util.Map r14 = (java.util.Map) r14
            java.lang.Object r15 = r2.f109480t
            java.lang.String r15 = (java.lang.String) r15
            r19 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r63 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r64 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r65 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r66 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r68 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r69 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r20 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r21 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r22 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r23 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r24 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r25 = r65
            r27 = r9
            r37 = r14
            r29 = r18
            r9 = r68
            r18 = r4
            r14 = r6
            r4 = r24
            r24 = r64
            r6 = r1
            r64 = r11
            r1 = r20
            r11 = r22
            r12 = r67
            r20 = r7
            r22 = r10
            r7 = r23
            r10 = r66
            r23 = r15
            r15 = r2
            r2 = r19
            r19 = r3
            r3 = r8
            r8 = r21
            r21 = r5
            r5 = r69
            r59 = r13
            r13 = r63
            r63 = r59
            goto L_0x0ef9
        L_0x01ca:
            r18 = r1
            int r1 = r2.f109463D
            int r3 = r2.f109462C
            int r5 = r2.f109461B
            int r10 = r2.f109460A
            long r11 = r2.f109486z
            java.lang.Object r13 = r2.f109483w
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f109482v
            t73.a r14 = (t73.C48555a) r14
            java.lang.Object r15 = r2.f109481u
            java.util.Map r15 = (java.util.Map) r15
            r19 = r1
            java.lang.Object r1 = r2.f109480t
            java.lang.String r1 = (java.lang.String) r1
            r63 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r64 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r65 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r66 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r69 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r20 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r21 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r22 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r23 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r24 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r25 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r32 = r10
            r30 = r11
            r26 = r13
            r27 = r14
            r28 = r15
            r29 = r18
            r14 = r20
            r11 = r22
            r18 = r63
            r13 = r64
            r22 = r66
            r10 = r68
            r12 = r1
            r15 = r8
            r20 = r9
            r1 = r19
            r8 = r23
            r23 = r25
            r9 = r67
            r25 = r6
            r19 = r7
            r6 = r21
            r21 = r65
            r7 = r69
            goto L_0x0ccc
        L_0x0269:
            r18 = r1
            int r1 = r2.f109462C
            int r3 = r2.f109461B
            int r5 = r2.f109460A
            long r10 = r2.f109486z
            java.lang.Object r12 = r2.f109484x
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f109483w
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f109482v
            t73.a r14 = (t73.C48555a) r14
            java.lang.Object r15 = r2.f109481u
            java.util.Map r15 = (java.util.Map) r15
            r19 = r1
            java.lang.Object r1 = r2.f109480t
            java.lang.String r1 = (java.lang.String) r1
            r63 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r64 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r65 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r66 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r69 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r20 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r21 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r22 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r23 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r24 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r25 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r49 = r3
            r48 = r4
            r50 = r5
            r51 = r10
            r5 = r12
            r26 = r13
            r4 = r14
            r53 = r15
            r29 = r18
            r3 = r19
            r14 = r20
            r11 = r22
            r18 = r63
            r13 = r64
            r22 = r66
            r10 = r68
            r12 = r1
            r15 = r2
            r19 = r7
            r20 = r9
            r2 = r24
            r1 = r25
            r9 = r67
            r7 = r69
            r25 = r6
            r24 = r8
            r6 = r21
            r8 = r23
            r21 = r65
            goto L_0x0c3d
        L_0x0312:
            r18 = r1
            int r1 = r2.f109462C
            int r3 = r2.f109461B
            int r5 = r2.f109460A
            long r10 = r2.f109486z
            java.lang.Object r12 = r2.f109484x
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f109483w
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f109482v
            t73.a r14 = (t73.C48555a) r14
            java.lang.Object r15 = r2.f109481u
            java.util.Map r15 = (java.util.Map) r15
            r19 = r1
            java.lang.Object r1 = r2.f109480t
            java.lang.String r1 = (java.lang.String) r1
            r63 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r64 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r65 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r66 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r69 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r20 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r21 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r22 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r23 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r24 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r25 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r40 = r3
            r41 = r4
            r42 = r5
            r5 = r7
            r43 = r10
            r45 = r12
            r46 = r13
            r10 = r14
            r47 = r15
            r29 = r18
            r18 = r19
            r14 = r20
            r11 = r22
            r19 = r63
            r13 = r64
            r4 = r66
            r3 = r68
            r7 = r69
            r12 = r1
            r15 = r2
            r20 = r9
            r2 = r24
            r1 = r25
            r9 = r67
            r25 = r6
            r24 = r8
            r6 = r21
            r8 = r23
            r21 = r65
            goto L_0x0ba3
        L_0x03bb:
            r18 = r1
            int r1 = r2.f109462C
            int r3 = r2.f109461B
            int r5 = r2.f109460A
            long r10 = r2.f109486z
            java.lang.Object r12 = r2.f109485y
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f109484x
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f109483w
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.f109482v
            t73.a r15 = (t73.C48555a) r15
            r19 = r1
            java.lang.Object r1 = r2.f109481u
            java.util.Map r1 = (java.util.Map) r1
            r63 = r1
            java.lang.Object r1 = r2.f109480t
            java.lang.String r1 = (java.lang.String) r1
            r64 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r65 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r66 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r69 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r20 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r21 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r22 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r23 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r24 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r25 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r26 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r28 = r68
            r29 = r10
            r27 = r12
            r31 = r14
            r32 = r15
            r33 = r19
            r11 = r22
            r12 = r1
            r14 = r2
            r10 = r3
            r15 = r8
            r19 = r9
            r22 = r20
            r1 = r63
            r3 = r64
            r9 = r67
            r2 = r69
            r8 = r7
            r20 = r13
            r13 = r66
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r65
            goto L_0x0a33
        L_0x045c:
            r18 = r1
            int r1 = r2.f109462C
            int r3 = r2.f109461B
            int r5 = r2.f109460A
            long r10 = r2.f109486z
            java.lang.Object r12 = r2.f109485y
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.f109484x
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.f109483w
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.f109482v
            t73.a r15 = (t73.C48555a) r15
            r19 = r1
            java.lang.Object r1 = r2.f109481u
            java.util.Map r1 = (java.util.Map) r1
            r63 = r1
            java.lang.Object r1 = r2.f109480t
            java.lang.String r1 = (java.lang.String) r1
            r64 = r1
            java.lang.Object r1 = r2.f109479s
            te3.m25 r1 = (te3.m25) r1
            r65 = r1
            java.lang.Object r1 = r2.f109478r
            te3.m25 r1 = (te3.m25) r1
            r66 = r1
            java.lang.Object r1 = r2.f109477q
            java.util.HashMap r1 = (java.util.HashMap) r1
            r67 = r1
            java.lang.Object r1 = r2.f109476p
            java.util.HashMap r1 = (java.util.HashMap) r1
            r68 = r1
            java.lang.Object r1 = r2.f109475o
            java.util.HashMap r1 = (java.util.HashMap) r1
            r69 = r1
            java.lang.Object r1 = r2.f109474n
            gy3.a0 r1 = (gy3.C8477a0) r1
            r20 = r1
            java.lang.Object r1 = r2.f109473j
            gy3.a0 r1 = (gy3.C8477a0) r1
            r21 = r1
            java.lang.Object r1 = r2.f109472i
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            r22 = r1
            java.lang.Object r1 = r2.f109471h
            java.util.HashMap r1 = (java.util.HashMap) r1
            r23 = r1
            java.lang.Object r1 = r2.f109470g
            java.util.List r1 = (java.util.List) r1
            r24 = r1
            java.lang.Object r1 = r2.f109469f
            te3.tt1 r1 = (te3.C51444tt1) r1
            r25 = r1
            java.lang.Object r1 = r2.f109468e
            te3.vt1 r1 = (te3.C51737vt1) r1
            r26 = r1
            java.lang.Object r1 = r2.f109467d
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r1 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0) r1
            kotlin.ResultKt.throwOnFailure(r0)
            r28 = r68
            r29 = r10
            r27 = r13
            r31 = r14
            r32 = r15
            r33 = r19
            r11 = r23
            r13 = r66
            r14 = r2
            r10 = r8
            r15 = r9
            r19 = r12
            r23 = r22
            r2 = r64
            r9 = r67
            r12 = r1
            r8 = r7
            r22 = r20
            r1 = r63
            r20 = r3
            r7 = r6
            r3 = r69
            r6 = r5
            r5 = r4
            r4 = r65
            goto L_0x08ce
        L_0x04ff:
            r18 = r1
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            gy3.a0 r1 = new gy3.a0
            r1.<init>()
            gy3.a0 r5 = new gy3.a0
            r5.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.Iterator r13 = r68.iterator()
        L_0x0526:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0541
            java.lang.Object r14 = r13.next()
            te3.qt1 r14 = (te3.C51011qt1) r14
            java.lang.String r15 = r14.f140537d
            r19 = r0
            java.lang.String r0 = "it.Domain"
            gy3.C87412m.m108593f(r15, r0)
            r12.put(r15, r14)
            r0 = r19
            goto L_0x0526
        L_0x0541:
            r19 = r0
            r0 = r64
            int r13 = r0.f143686d
            r63 = r6
            r15 = r7
            r14 = r8
            r28 = r10
            r29 = r11
            r27 = r12
            r7 = r19
            r12 = 0
            r8 = r1
            r10 = r2
            r19 = r4
            r11 = r9
            r2 = r68
            r4 = r69
            r1 = r0
            r9 = r5
            r5 = r65
            r0 = r67
        L_0x0563:
            if (r12 >= r13) goto L_0x1361
            r20 = r13
            te3.m25 r13 = new te3.m25
            r13.<init>()
            r21 = r3
            r3 = 0
            r8.f27482d = r3
            r9.f27482d = r3
            java.util.LinkedList<te3.st1> r3 = r0.f142403n
            java.lang.Object r3 = r3.get(r12)
            te3.st1 r3 = (te3.C51296st1) r3
            java.lang.String r3 = r3.f141739e
            r13.f137778d = r3
            gy3.C87412m.m108593f(r3, r14)
            java.lang.String r3 = iy0.C9263p.m8908c(r3, r4)
            r13.f137796y = r3
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            java.lang.String r3 = r3.f143116e
            r13.f137783i = r3
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            pe3.b r3 = r3.f143131w
            r13.f137791t = r3
            java.lang.String r3 = r13.f137778d
            gy3.C87412m.m108593f(r3, r14)
            r22 = r8
            r8 = 0
            java.lang.String r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r3, r8)
            java.util.LinkedList<te3.st1> r8 = r0.f142403n
            java.lang.Object r8 = r8.get(r12)
            r23 = r4
            boolean r4 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r
            if (r4 == 0) goto L_0x05bc
            r4 = r8
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r r4 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) r4
            goto L_0x05bd
        L_0x05bc:
            r4 = 0
        L_0x05bd:
            if (r4 == 0) goto L_0x05d1
            int r8 = r4.f109497u
            r13.f137795x = r8
            int r8 = r4.f109495s
            r13.f137787p = r8
            int r8 = r4.f109496t
            r13.f137788q = r8
            java.lang.String r4 = r4.f109498v
            r13.f137794w = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x05d1:
            java.lang.String r4 = r13.f137783i
            gy3.C87412m.m108593f(r4, r15)
            java.lang.String r8 = "http"
            r24 = r10
            r10 = 0
            boolean r4 = z04.C112551y.m153819s(r4, r8, r10)
            if (r4 == 0) goto L_0x1318
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.Class<h81.h> r8 = h81.C32735h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            h81.h r8 = (h81.C32735h) r8
            h81.h$c r10 = h81.C32735h.C32737c.clicfg_webview_prefetch_get_a8key_lite_header
            r64 = r3
            r3 = 1
            int r8 = r8.mo58779Qe(r10, r3)
            if (r8 != r3) goto L_0x05fb
            r3 = 1
            goto L_0x05fc
        L_0x05fb:
            r3 = 0
        L_0x05fc:
            com.tencent.mm.plugin.webview.core.v$b r8 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r8 = r8.mo67811b()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r25 = r0
            java.lang.String r0 = "[TRACE_PREFETCH] useA8keyLiteHeader: "
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = " mockUseA8keyLiteHeader: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r0 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            if (r3 != 0) goto L_0x0624
            if (r8 == 0) goto L_0x06b3
        L_0x0624:
            java.util.LinkedList<te3.ut1> r0 = r1.f143688f
            java.lang.Object r0 = r0.get(r12)
            te3.ut1 r0 = (te3.C51596ut1) r0
            java.util.LinkedList<te3.bh2> r0 = r0.f143130v
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r0)
            if (r0 != 0) goto L_0x06b3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[TRACE_PREFETCH] response header size : "
            r0.append(r3)
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            java.util.LinkedList<te3.bh2> r3 = r3.f143130v
            int r3 = r3.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.util.LinkedList<te3.ut1> r0 = r1.f143688f
            java.lang.Object r0 = r0.get(r12)
            te3.ut1 r0 = (te3.C51596ut1) r0
            java.util.LinkedList<te3.bh2> r0 = r0.f143130v
            java.lang.String r3 = "RespInfo[i].HttpHeader"
            gy3.C87412m.m108593f(r0, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x066e:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x0691
            java.lang.Object r8 = r0.next()
            r10 = r8
            te3.bh2 r10 = (te3.C48857bh2) r10
            r65 = r0
            java.lang.String r0 = r10.f131120d
            if (r0 == 0) goto L_0x0688
            java.lang.String r0 = r10.f131121e
            if (r0 != 0) goto L_0x0686
            goto L_0x0688
        L_0x0686:
            r0 = 0
            goto L_0x0689
        L_0x0688:
            r0 = 1
        L_0x0689:
            if (r0 != 0) goto L_0x068e
            r3.add(r8)
        L_0x068e:
            r0 = r65
            goto L_0x066e
        L_0x0691:
            java.util.Iterator r0 = r3.iterator()
        L_0x0695:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x06b3
            java.lang.Object r3 = r0.next()
            te3.bh2 r3 = (te3.C48857bh2) r3
            java.lang.String r8 = r3.f131120d
            java.lang.String r10 = "it.Key"
            gy3.C87412m.m108593f(r8, r10)
            java.lang.String r3 = r3.f131121e
            java.lang.String r10 = "it.Value"
            gy3.C87412m.m108593f(r3, r10)
            r4.put(r8, r3)
            goto L_0x0695
        L_0x06b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[TRACE_PREFETCH] useA8keyLiteHeader size : "
            r0.append(r3)
            int r3 = r4.size()
            r0.append(r3)
            java.lang.String r3 = " domains.size="
            r0.append(r3)
            int r3 = r2.size()
            r0.append(r3)
            java.lang.String r3 = ", controlBytes: "
            r0.append(r3)
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            pe3.b r3 = r3.f143131w
            if (r3 == 0) goto L_0x06ea
            byte[] r3 = r3.f257327a
            int r3 = r3.length
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r3)
            goto L_0x06eb
        L_0x06ea:
            r8 = 0
        L_0x06eb:
            r0.append(r8)
            java.lang.String r3 = ", authBits: "
            r0.append(r3)
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            int r3 = r3.f143126r
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            r65 = r4
            long r3 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.now()
            r13.f137779e = r3
            java.util.LinkedList<java.lang.Integer> r0 = r1.f143687e
            java.lang.Object r0 = r0.get(r12)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x071a
            goto L_0x0720
        L_0x071a:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0724
        L_0x0720:
            r0 = 1
            r13.f137780f = r0
            goto L_0x0733
        L_0x0724:
            r0 = 1
            java.util.LinkedList<te3.ut1> r3 = r1.f143688f
            java.lang.Object r3 = r3.get(r12)
            te3.ut1 r3 = (te3.C51596ut1) r3
            int r3 = r3.f143126r
            if (r3 == 0) goto L_0x0733
            r13.f137781g = r0
        L_0x0733:
            boolean r3 = r13.f137780f
            if (r3 != 0) goto L_0x073e
            java.lang.String r3 = r13.f137783i
            r7.add(r3)
            r9.f27482d = r0
        L_0x073e:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x075d
            f93.e$a r30 = f93.C31965e.C31966a.ACTION_PREFETCH_RESP_VALID
            java.lang.String r0 = r13.f137778d
            java.lang.String r3 = r13.f137783i
            int r4 = r13.f137795x
            int r8 = r13.f137787p
            int r10 = r13.f137788q
            r31 = r0
            r32 = r3
            r33 = r4
            r34 = r8
            r35 = r10
            f93.C31965e.m39600a(r30, r31, r32, r33, r34, r35)
        L_0x075d:
            int r0 = r13.f137787p
            boolean r0 = f93.C45767f.m51055a(r0)
            if (r0 == 0) goto L_0x078f
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = f109363a
            r0.mo63620m(r13)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            java.lang.String r3 = r13.f137778d
            gy3.C87412m.m108593f(r3, r14)
            r4 = 11
            r0.mo63642a(r5, r3, r4)
            r64 = r2
            r10 = r11
            r0 = r12
            r66 = r14
            r26 = r15
            r15 = r19
            r12 = r21
            r14 = r24
            r19 = r25
            r2 = r28
            r3 = r29
            r11 = r7
            r25 = r20
            goto L_0x132f
        L_0x078f:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = f109363a
            java.lang.String r3 = r13.f137783i
            gy3.C87412m.m108593f(r3, r15)
            t73.a r3 = r0.mo63617h(r3, r2)
            if (r3 == 0) goto L_0x07a3
            te3.rt1 r4 = r3.f129888b
            if (r4 == 0) goto L_0x07a3
            java.lang.String r4 = r4.f141132j
            goto L_0x07a4
        L_0x07a3:
            r4 = 0
        L_0x07a4:
            if (r3 == 0) goto L_0x10e5
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            java.lang.String r10 = r13.f137778d
            gy3.C87412m.m108593f(r10, r14)
            r26 = r15
            r15 = 7
            r8.mo63642a(r5, r10, r15)
            f93.e$a r30 = f93.C31965e.C31966a.ACTION_MATCH_MANIFEST
            java.lang.String r8 = r13.f137778d
            java.lang.String r10 = r13.f137783i
            int r15 = r13.f137795x
            r66 = r14
            int r14 = r13.f137787p
            r67 = r0
            int r0 = r13.f137788q
            r31 = r8
            r32 = r10
            r33 = r15
            r34 = r14
            r35 = r0
            f93.C31965e.m39600a(r30, r31, r32, r33, r34, r35)
            r0 = r25
            java.util.LinkedList<te3.st1> r8 = r0.f142403n
            java.lang.Object r8 = r8.get(r12)
            boolean r10 = r8 instanceof com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r
            if (r10 == 0) goto L_0x07df
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r r8 = (com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40748r) r8
            goto L_0x07e0
        L_0x07df:
            r8 = 0
        L_0x07e0:
            if (r8 == 0) goto L_0x07e5
            java.lang.String r8 = r8.f109494r
            goto L_0x07e6
        L_0x07e5:
            r8 = 0
        L_0x07e6:
            r3.f129889c = r8
            int r8 = r13.f137787p
            r3.f129890d = r8
            int r8 = r13.f137788q
            r3.f129891e = r8
            te3.rt1 r8 = r3.f129888b
            java.lang.String r10 = r8.f141131i
            java.lang.String r8 = r8.f141127e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "match prefetch#"
            r14.append(r15)
            r15 = r64
            r14.append(r15)
            r25 = r12
            java.lang.String r12 = ", "
            r14.append(r12)
            java.lang.String r12 = r13.f137778d
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r11, r12)
            if (r10 == 0) goto L_0x0823
            boolean r12 = z04.C112551y.m153811k(r10)
            if (r12 == 0) goto L_0x0821
            goto L_0x0823
        L_0x0821:
            r12 = 0
            goto L_0x0824
        L_0x0823:
            r12 = 1
        L_0x0824:
            if (r12 != 0) goto L_0x0986
            t73.d$b r12 = t73.C48558d.f129896H
            rx3.g<java.lang.Boolean> r12 = t73.C48558d.f129899K
            rx3.n r12 = (rx3.C36570n) r12
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0986
            boolean r12 = r3.f129892f
            if (r12 != 0) goto L_0x0918
            if (r8 == 0) goto L_0x0847
            boolean r12 = z04.C112551y.m153811k(r8)
            if (r12 == 0) goto L_0x0845
            goto L_0x0847
        L_0x0845:
            r12 = 0
            goto L_0x0848
        L_0x0847:
            r12 = 1
        L_0x0848:
            if (r12 != 0) goto L_0x0918
            r12 = r21
            r14 = r24
            r14.f109467d = r12
            r14.f109468e = r1
            r14.f109469f = r0
            r14.f109470g = r2
            r21 = r11
            r11 = r23
            r14.f109471h = r11
            r14.f109472i = r7
            r23 = r7
            r7 = r22
            r14.f109473j = r7
            r14.f109474n = r9
            r22 = r9
            r9 = r28
            r14.f109475o = r9
            r24 = r9
            r9 = r29
            r14.f109476p = r9
            r28 = r9
            r9 = r27
            r14.f109477q = r9
            r14.f109478r = r13
            r14.f109479s = r13
            r14.f109480t = r15
            r64 = r15
            r15 = r65
            r14.f109481u = r15
            r14.f109482v = r3
            r14.f109483w = r4
            r14.f109484x = r10
            r14.f109485y = r8
            r14.f109486z = r5
            r29 = r5
            r5 = r25
            r14.f109460A = r5
            r6 = r20
            r14.f109461B = r6
            r6 = 1
            r14.f109462C = r6
            r14.f109466G = r6
            r6 = r67
            java.lang.Object r6 = r6.mo63616d(r3, r13, r14)
            r5 = r19
            if (r6 != r5) goto L_0x08a9
            goto L_0x0a08
        L_0x08a9:
            r32 = r3
            r31 = r4
            r19 = r8
            r27 = r10
            r4 = r13
            r3 = r24
            r8 = r26
            r33 = 1
            r10 = r66
            r26 = r1
            r24 = r2
            r1 = r15
            r15 = r21
            r2 = r64
            r21 = r7
            r7 = r63
            r59 = r25
            r25 = r0
            r0 = r6
            r6 = r59
        L_0x08ce:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x090a
            r0 = r25
            r25 = r6
            r59 = r15
            r15 = r1
            r1 = r26
            r26 = r8
            r8 = r19
            r19 = r4
            r4 = r2
            r2 = r24
            r24 = r10
            r10 = r27
            r27 = r18
            r18 = r59
            r60 = r29
            r29 = r3
            r30 = r28
            r3 = r32
            r28 = r9
            r9 = r22
            r22 = r20
            r20 = r13
            r13 = r5
            r5 = r60
            r62 = r23
            r23 = r7
            r7 = r62
            goto L_0x0957
        L_0x090a:
            r0 = r8
            r8 = r19
            r19 = r18
            r18 = 0
            r59 = r14
            r14 = r10
            r10 = r59
            goto L_0x0a55
        L_0x0918:
            r64 = r15
            r12 = r21
            r14 = r24
            r24 = r28
            r28 = r29
            r15 = r65
            r29 = r5
            r21 = r11
            r5 = r19
            r11 = r23
            r23 = r7
            r7 = r22
            r22 = r9
            r9 = r27
            r31 = r4
            r19 = r13
            r27 = r18
            r18 = r21
            r33 = 1
            r4 = r64
            r21 = r7
            r7 = r23
            r23 = r63
            r13 = r5
            r5 = r29
            r29 = r24
            r30 = r28
            r24 = r66
            r28 = r9
            r9 = r22
            r22 = r20
            r20 = r19
        L_0x0957:
            r36 = r5
            r38 = r13
            r39 = r15
            r13 = r19
            r19 = r25
            r6 = r26
            r26 = r30
            r5 = 1
            r15 = r14
            r30 = r21
            r25 = r23
            r23 = r28
            r21 = r4
            r14 = r8
            r28 = r9
            r4 = r18
            r18 = r22
            r9 = r33
            r8 = r2
            r22 = r20
            r20 = r31
            r2 = r1
            r59 = r29
            r29 = r27
            r27 = r59
            goto L_0x0ad7
        L_0x0986:
            r64 = r15
            r12 = r21
            r14 = r24
            r24 = r28
            r28 = r29
            r15 = r65
            r29 = r5
            r21 = r11
            r5 = r19
            r11 = r23
            r6 = r67
            r23 = r7
            r7 = r22
            r22 = r9
            r9 = r27
            if (r8 == 0) goto L_0x09b0
            boolean r19 = z04.C112551y.m153811k(r8)
            if (r19 == 0) goto L_0x09ad
            goto L_0x09b0
        L_0x09ad:
            r19 = 0
            goto L_0x09b2
        L_0x09b0:
            r19 = 1
        L_0x09b2:
            if (r19 != 0) goto L_0x0a8d
            r14.f109467d = r12
            r14.f109468e = r1
            r14.f109469f = r0
            r14.f109470g = r2
            r14.f109471h = r11
            r19 = r11
            r11 = r23
            r14.f109472i = r11
            r14.f109473j = r7
            r23 = r7
            r7 = r22
            r14.f109474n = r7
            r7 = r24
            r14.f109475o = r7
            r7 = r28
            r14.f109476p = r7
            r14.f109477q = r9
            r14.f109478r = r13
            r14.f109479s = r13
            r7 = r64
            r14.f109480t = r7
            r14.f109481u = r15
            r14.f109482v = r3
            r14.f109483w = r4
            r14.f109484x = r10
            r14.f109485y = r8
            r27 = r8
            r7 = r29
            r14.f109486z = r7
            r29 = r4
            r4 = r25
            r14.f109460A = r4
            r25 = r10
            r10 = r20
            r14.f109461B = r10
            r65 = r15
            r15 = 0
            r14.f109462C = r15
            r15 = 2
            r14.f109466G = r15
            java.lang.Object r6 = r6.mo63616d(r3, r13, r14)
            if (r6 != r5) goto L_0x0a0a
        L_0x0a08:
            goto L_0x0b7a
        L_0x0a0a:
            r15 = r66
            r32 = r3
            r20 = r25
            r31 = r29
            r33 = 0
            r3 = r64
            r25 = r0
            r0 = r6
            r29 = r7
            r8 = r26
            r7 = r63
            r26 = r1
            r6 = r4
            r4 = r13
            r1 = r65
            r59 = r24
            r24 = r2
            r2 = r59
            r60 = r23
            r23 = r19
            r19 = r21
            r21 = r60
        L_0x0a33:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r59 = r18
            r18 = r0
            r0 = r8
            r8 = r27
            r27 = r20
            r20 = r10
            r10 = r14
            r14 = r15
            r15 = r19
            r19 = r59
            r60 = r3
            r3 = r2
            r2 = r60
            r61 = r23
            r23 = r11
            r11 = r61
        L_0x0a55:
            r39 = r1
            r38 = r5
            r5 = r18
            r18 = r20
            r36 = r29
            r20 = r31
            r29 = r19
            r30 = r21
            r21 = r2
            r19 = r6
            r2 = r26
            r26 = r28
            r6 = r0
            r28 = r22
            r0 = r25
            r25 = r7
            r22 = r13
            r7 = r23
            r13 = r4
            r23 = r9
            r4 = r15
            r9 = r33
            r15 = r10
            r10 = r27
            r27 = r3
            r3 = r32
            r59 = r14
            r14 = r8
            r8 = r24
            r24 = r59
            goto L_0x0ad7
        L_0x0a8d:
            r27 = r8
            r19 = r11
            r65 = r15
            r11 = r23
            r23 = r7
            r7 = r29
            r29 = r4
            r4 = r25
            r25 = r10
            r10 = r20
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            boolean r6 = r6.mo63590b()
            r39 = r65
            r38 = r5
            r5 = r6
            r36 = r7
            r7 = r11
            r15 = r14
            r11 = r19
            r30 = r23
            r6 = r26
            r14 = r27
            r26 = r28
            r20 = r29
            r8 = r2
            r19 = r4
            r23 = r9
            r29 = r18
            r4 = r21
            r28 = r22
            r27 = r24
            r9 = 0
            r21 = r64
            r24 = r66
            r2 = r1
            r18 = r10
            r22 = r13
            r10 = r25
            r25 = r63
        L_0x0ad7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r31 = r7
            java.lang.String r7 = "savePrefetch appId="
            r1.append(r7)
            r1.append(r10)
            java.lang.String r7 = " fetched="
            r1.append(r7)
            r1.append(r5)
            java.lang.String r7 = " debug:"
            r1.append(r7)
            boolean r7 = r3.f129892f
            r1.append(r7)
            java.lang.String r7 = " usePkg="
            r1.append(r7)
            if (r9 == 0) goto L_0x0b02
            r7 = 1
            goto L_0x0b03
        L_0x0b02:
            r7 = 0
        L_0x0b03:
            r1.append(r7)
            java.lang.String r7 = ", manifestUrl: "
            r1.append(r7)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r1)
            if (r5 == 0) goto L_0x106f
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            java.lang.String r5 = r13.f137783i
            gy3.C87412m.m108593f(r5, r6)
            r15.f109467d = r12
            r15.f109468e = r2
            r15.f109469f = r0
            r15.f109470g = r8
            r15.f109471h = r11
            r7 = r31
            r15.f109472i = r7
            r14 = r30
            r15.f109473j = r14
            r30 = r0
            r0 = r28
            r15.f109474n = r0
            r0 = r27
            r15.f109475o = r0
            r0 = r26
            r15.f109476p = r0
            r0 = r23
            r15.f109477q = r0
            r0 = r22
            r15.f109478r = r0
            r15.f109479s = r13
            r0 = r21
            r15.f109480t = r0
            r0 = r39
            r15.f109481u = r0
            r15.f109482v = r3
            r31 = r0
            r0 = r20
            r15.f109483w = r0
            r15.f109484x = r10
            r0 = 0
            r15.f109485y = r0
            r32 = r6
            r33 = r7
            r6 = r36
            r15.f109486z = r6
            r0 = r19
            r15.f109460A = r0
            r0 = r18
            r15.f109461B = r0
            r15.f109462C = r9
            r0 = 3
            r15.f109466G = r0
            java.lang.Object r0 = r1.mo63599k(r3, r5, r15)
            r5 = r38
            if (r0 != r5) goto L_0x0b7d
        L_0x0b7a:
            r11 = r5
            goto L_0x144f
        L_0x0b7d:
            r1 = r2
            r41 = r5
            r43 = r6
            r45 = r10
            r40 = r18
            r42 = r19
            r46 = r20
            r19 = r21
            r21 = r22
            r7 = r28
            r2 = r30
            r47 = r31
            r5 = r32
            r6 = r33
            r10 = r3
            r20 = r4
            r18 = r9
            r4 = r23
            r9 = r26
            r3 = r27
        L_0x0ba3:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x1042
            boolean r0 = r10.f129892f
            if (r0 == 0) goto L_0x0bba
            java.lang.String r0 = r13.f137783i
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r0 = r0.getHost()
            goto L_0x0bbc
        L_0x0bba:
            r0 = r45
        L_0x0bbc:
            r13.f137789r = r0
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            r63 = r0
            java.lang.String r0 = r13.f137783i
            gy3.C87412m.m108593f(r0, r5)
            r15.f109467d = r12
            r15.f109468e = r1
            r15.f109469f = r2
            r15.f109470g = r8
            r15.f109471h = r11
            r15.f109472i = r6
            r15.f109473j = r14
            r15.f109474n = r7
            r15.f109475o = r3
            r15.f109476p = r9
            r15.f109477q = r4
            r22 = r1
            r1 = r21
            r15.f109478r = r1
            r15.f109479s = r13
            r1 = r19
            r15.f109480t = r1
            r1 = r47
            r15.f109481u = r1
            r15.f109482v = r10
            r23 = r1
            r1 = r46
            r15.f109483w = r1
            r26 = r1
            r1 = r45
            r15.f109484x = r1
            r28 = r1
            r27 = r2
            r1 = r43
            r15.f109486z = r1
            r30 = r1
            r1 = r42
            r15.f109460A = r1
            r2 = r40
            r15.f109461B = r2
            r32 = r1
            r1 = r18
            r15.f109462C = r1
            r1 = 4
            r15.f109466G = r1
            r1 = r63
            java.lang.Object r0 = r1.mo63592d(r10, r0, r15)
            r1 = r41
            if (r0 != r1) goto L_0x0c23
            r11 = r1
            goto L_0x144f
        L_0x0c23:
            r48 = r1
            r49 = r2
            r1 = r22
            r53 = r23
            r2 = r27
            r51 = r30
            r50 = r32
            r22 = r4
            r4 = r10
            r10 = r3
            r3 = r18
            r18 = r19
            r19 = r5
            r5 = r28
        L_0x0c3d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r3 == 0) goto L_0x0d7c
            r69 = r3
            boolean r3 = r4.f129892f
            if (r3 != 0) goto L_0x0d1c
            r3 = 1
            if (r0 != r3) goto L_0x0d08
            q73.c0 r3 = q73.C35796c0.f95588a
            r63 = r3
            java.lang.String r3 = "manifestAppId"
            gy3.C87412m.m108593f(r5, r3)
            int r3 = r13.f137795x
            r15.f109467d = r12
            r15.f109468e = r1
            r15.f109469f = r2
            r15.f109470g = r8
            r15.f109471h = r11
            r15.f109472i = r6
            r15.f109473j = r14
            r15.f109474n = r7
            r15.f109475o = r10
            r15.f109476p = r9
            r23 = r1
            r1 = r22
            r15.f109477q = r1
            r1 = r21
            r15.f109478r = r1
            r15.f109479s = r13
            r1 = r18
            r15.f109480t = r1
            r1 = r53
            r15.f109481u = r1
            r15.f109482v = r4
            r15.f109483w = r5
            r27 = r1
            r1 = 0
            r15.f109484x = r1
            r28 = r2
            r1 = r51
            r15.f109486z = r1
            r30 = r1
            r1 = r50
            r15.f109460A = r1
            r2 = r49
            r15.f109461B = r2
            r32 = r1
            r1 = r69
            r15.f109462C = r1
            r15.f109463D = r0
            r69 = r0
            r0 = 5
            r15.f109466G = r0
            r64 = r4
            r65 = r5
            r66 = r26
            r67 = r3
            r68 = r15
            java.lang.Object r0 = r63.mo60403d(r64, r65, r66, r67, r68)
            r3 = r48
            if (r0 != r3) goto L_0x0cbc
        L_0x0cb9:
            r11 = r3
            goto L_0x144f
        L_0x0cbc:
            r26 = r5
            r5 = r2
            r2 = r15
            r15 = r24
            r24 = r28
            r28 = r27
            r27 = r4
            r4 = r3
            r3 = r1
            r1 = r69
        L_0x0ccc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0cee
            r0 = r1
            r48 = r4
            r49 = r5
            r1 = r23
            r5 = r26
            r53 = r28
            r51 = r30
            r50 = r32
            r4 = r3
            r3 = r18
            r59 = r15
            r15 = r2
            r2 = r24
            r24 = r59
            goto L_0x0d37
        L_0x0cee:
            r0 = r1
            r48 = r4
            r49 = r5
            r5 = r21
            r4 = r22
            r1 = r23
            r53 = r28
            r51 = r30
            r50 = r32
            r59 = r15
            r15 = r2
            r2 = r24
            r24 = r59
            goto L_0x0da4
        L_0x0d08:
            r23 = r1
            r28 = r2
            r3 = r48
            r2 = r49
            r32 = r50
            r30 = r51
            r27 = r53
            r1 = r69
            r69 = r0
            goto L_0x0d8d
        L_0x0d1c:
            r23 = r1
            r28 = r2
            r3 = r48
            r2 = r49
            r32 = r50
            r30 = r51
            r27 = r53
            r1 = r69
            r69 = r0
            r3 = r18
            r2 = r28
            r27 = r4
            r4 = r1
            r1 = r23
        L_0x0d37:
            k40.a r18 = f40.C86709a0.m107533q(r29)
            r63 = r0
            r0 = r18
            ex0.d r0 = (ex0.C45696d) r0
            r64 = r1
            java.lang.String r1 = r13.f137783i
            r65 = r2
            java.lang.String r2 = "itemExpose"
            r66 = r3
            r3 = 0
            r0.mo70968P2(r5, r1, r2, r3)
            r1 = r63
            r0 = r64
            r2 = r65
            r3 = r12
            r5 = r14
            r12 = r20
            r54 = r22
            r64 = r27
            r18 = r48
            r55 = r49
            r56 = r50
            r57 = r51
            r63 = r53
            r20 = r66
            r22 = r9
            r14 = r10
            r10 = r19
            r19 = r4
            r9 = r7
            r4 = r13
            r7 = r25
            r59 = r8
            r8 = r6
            r6 = r11
            r11 = r59
            goto L_0x0dd0
        L_0x0d7c:
            r69 = r0
            r23 = r1
            r28 = r2
            r1 = r3
            r3 = r48
            r2 = r49
            r32 = r50
            r30 = r51
            r27 = r53
        L_0x0d8d:
            r0 = r69
            r49 = r2
            r48 = r3
            r5 = r21
            r53 = r27
            r2 = r28
            r51 = r30
            r50 = r32
            r3 = r1
            r27 = r4
            r4 = r22
            r1 = r23
        L_0x0da4:
            r54 = r4
            r21 = r5
            r22 = r9
            r4 = r13
            r5 = r14
            r64 = r27
            r55 = r49
            r56 = r50
            r57 = r51
            r63 = r53
            r9 = r7
            r14 = r10
            r10 = r19
            r7 = r25
            r19 = r3
            r3 = r12
            r12 = r20
            r20 = r18
            r18 = r48
            r59 = r1
            r1 = r0
            r0 = r59
            r60 = r8
            r8 = r6
            r6 = r11
            r11 = r60
        L_0x0dd0:
            java.lang.String r13 = r4.f137783i
            r4.f137782h = r13
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r13 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            r23 = r14
            java.lang.String r14 = "tencent_view_inews_prefix"
            r25 = r9
            r9 = 0
            boolean r13 = r13.getBoolean(r14, r9)
            if (r13 == 0) goto L_0x0df8
            java.lang.String r13 = r4.f137782h
            gy3.C87412m.m108593f(r13, r7)
            java.lang.String r14 = "//view.inews.qq.com"
            r26 = r7
            java.lang.String r7 = "//ssr.view.inews.qq.com"
            java.lang.String r7 = z04.C112551y.m153817q(r13, r14, r7, r9)
            r4.f137782h = r7
            goto L_0x0dfa
        L_0x0df8:
            r26 = r7
        L_0x0dfa:
            r7 = 1
            r4.f137785n = r7
            r4.f137790s = r7
            java.lang.String r7 = t73.C48572p.m53971b(r64)
            r4.f137792u = r7
            r7 = r64
            te3.rt1 r9 = r7.f129888b
            pe3.b r9 = r9.f141133n
            r4.f137793v = r9
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r9 = f109363a
            r9.mo63620m(r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "prefetch call, header size: "
            r9.append(r13)
            int r13 = r63.size()
            r9.append(r13)
            java.lang.String r13 = ", url: "
            r9.append(r13)
            java.lang.String r13 = r4.f137782h
            r9.append(r13)
            java.lang.String r13 = ", fetchPkgType: "
            r9.append(r13)
            r9.append(r1)
            java.lang.String r13 = ", pkgFileKey: "
            r9.append(r13)
            java.lang.String r13 = r4.f137792u
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            f93.e$a r9 = f93.C31965e.C31966a.ACTION_MANIFEST_OPEN_PREFETCH
            java.lang.String r13 = r4.f137778d
            java.lang.String r14 = r4.f137783i
            r27 = r12
            int r12 = r4.f137795x
            r28 = r1
            int r1 = r4.f137787p
            r30 = r7
            int r7 = r4.f137788q
            r64 = r9
            r65 = r13
            r66 = r14
            r67 = r12
            r68 = r1
            r69 = r7
            f93.C31965e.m39600a(r64, r65, r66, r67, r68, r69)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            java.lang.String r7 = r4.f137783i
            gy3.C87412m.m108593f(r7, r10)
            r15.f109467d = r3
            r15.f109468e = r0
            r15.f109469f = r2
            r15.f109470g = r11
            r15.f109471h = r6
            r15.f109472i = r8
            r15.f109473j = r5
            r9 = r25
            r15.f109474n = r9
            r12 = r23
            r15.f109475o = r12
            r13 = r22
            r15.f109476p = r13
            r14 = r54
            r15.f109477q = r14
            r22 = r0
            r0 = r21
            r15.f109478r = r0
            r15.f109479s = r4
            r0 = r20
            r15.f109480t = r0
            r0 = r63
            r15.f109481u = r0
            r23 = r0
            r0 = r30
            r15.f109482v = r0
            r25 = r2
            r2 = 0
            r15.f109483w = r2
            r15.f109484x = r2
            r30 = r3
            r2 = r57
            r15.f109486z = r2
            r31 = r2
            r2 = r56
            r15.f109460A = r2
            r3 = r55
            r15.f109461B = r3
            r33 = r2
            r2 = r19
            r15.f109462C = r2
            r2 = r28
            r15.f109463D = r2
            r2 = 6
            r15.f109466G = r2
            java.lang.Object r1 = r1.mo63598j(r0, r7, r15)
            r2 = r18
            if (r1 != r2) goto L_0x0ed2
            r11 = r2
            goto L_0x144f
        L_0x0ed2:
            r63 = r0
            r0 = r1
            r18 = r2
            r1 = r8
            r37 = r23
            r7 = r25
            r2 = r28
            r64 = r31
            r8 = r6
            r25 = r14
            r23 = r20
            r14 = r26
            r6 = r30
            r20 = r10
            r10 = r13
            r13 = r4
            r4 = r22
            r22 = r33
            r59 = r21
            r21 = r3
            r3 = r24
            r24 = r59
        L_0x0ef9:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r19 == 0) goto L_0x0f12
            if (r0 == 0) goto L_0x0f04
            goto L_0x0f12
        L_0x0f04:
            r26 = r3
            r46 = r9
            r44 = r10
            r45 = r12
            r47 = r13
            r28 = r14
        L_0x0f10:
            r0 = 1
            goto L_0x0f5a
        L_0x0f12:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r30 = f109363a
            java.lang.String r0 = r13.f137778d
            gy3.C87412m.m108593f(r0, r3)
            r26 = r3
            java.lang.String r3 = r13.f137782h
            gy3.C87412m.m108593f(r3, r14)
            r28 = r14
            java.lang.String r14 = r13.f137789r
            r36 = 0
            r44 = r10
            int r10 = r13.f137787p
            r45 = r12
            int r12 = r13.f137788q
            r46 = r9
            int r9 = r13.f137795x
            boolean r31 = oy0.C35337b.m40642a()
            r47 = r13
            if (r31 == 0) goto L_0x0f40
            r13 = 2
            if (r2 != r13) goto L_0x0f40
            r42 = 1
            goto L_0x0f42
        L_0x0f40:
            r42 = 0
        L_0x0f42:
            boolean r43 = com.tencent.p014mm.plugin.brandservice.webprefetcher.debug.C40819a.m44116b()
            r31 = r64
            r33 = r0
            r34 = r3
            r35 = r14
            r38 = r10
            r39 = r12
            r40 = r9
            r41 = r63
            r30.mo63619l(r31, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            goto L_0x0f10
        L_0x0f5a:
            r5.f27482d = r0
            if (r19 != 0) goto L_0x0fe7
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            r15.f109467d = r6
            r15.f109468e = r4
            r15.f109469f = r7
            r15.f109470g = r11
            r15.f109471h = r8
            r15.f109472i = r1
            r15.f109473j = r5
            r9 = r46
            r15.f109474n = r9
            r12 = r45
            r15.f109475o = r12
            r13 = r44
            r15.f109476p = r13
            r14 = r25
            r15.f109477q = r14
            r2 = r24
            r15.f109478r = r2
            r2 = r47
            r15.f109479s = r2
            r3 = r23
            r15.f109480t = r3
            r10 = r63
            r15.f109481u = r10
            r19 = r1
            r1 = 0
            r15.f109482v = r1
            r1 = r64
            r15.f109486z = r1
            r23 = r1
            r1 = r22
            r15.f109460A = r1
            r2 = r21
            r15.f109461B = r2
            r21 = r3
            r3 = 7
            r15.f109466G = r3
            java.lang.Object r0 = r0.mo63591c(r10, r15)
            r3 = r18
            if (r0 != r3) goto L_0x0fb0
            goto L_0x0cb9
        L_0x0fb0:
            r22 = r13
            r18 = r14
            r13 = r28
            r14 = r47
            r59 = r3
            r3 = r1
            r1 = r19
            r19 = r7
            r7 = r59
        L_0x0fc1:
            java.util.List r0 = (java.util.List) r0
            te3.qt1 r10 = r10.f129887a
            java.lang.String r10 = r10.f140537d
            r63 = r1
            java.lang.String r1 = "manifest.domain.Domain"
            gy3.C87412m.m108593f(r10, r1)
            java.lang.String r1 = r14.f137782h
            gy3.C87412m.m108593f(r1, r13)
            oy0.C47404c.m52734a(r0, r10, r1)
            r64 = r63
            r63 = r3
            r28 = r13
            r10 = r18
            r13 = r21
            r0 = r27
            r3 = r2
            r2 = r7
            r7 = r19
            goto L_0x100d
        L_0x0fe7:
            r19 = r1
            r3 = r18
            r2 = r21
            r1 = r22
            r21 = r23
            r14 = r25
            r13 = r44
            r12 = r45
            r9 = r46
            r23 = r64
            r63 = r1
            r22 = r13
            r10 = r14
            r64 = r19
            r13 = r21
            r0 = r27
            r14 = r47
            r59 = r3
            r3 = r2
            r2 = r59
        L_0x100d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r65 = r2
            java.lang.String r2 = "end prefetch #"
            r1.append(r2)
            r1.append(r13)
            r2 = 32
            r1.append(r2)
            java.lang.String r2 = r14.f137782h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
            r13 = r3
            r27 = r10
            r3 = r11
            r1 = r22
            r10 = r26
            r11 = r8
            r26 = r20
            r8 = r5
            r5 = r12
            r12 = r63
            r63 = r64
            r64 = r65
            goto L_0x1267
        L_0x1042:
            r22 = r1
            r27 = r2
            r0 = r3
            r2 = r40
            r1 = r41
            r32 = r42
            r30 = r43
            r38 = r1
            r18 = r2
            r3 = r4
            r64 = r14
            r4 = r19
            r65 = r22
            r10 = r24
            r63 = r27
            r14 = r32
            r27 = r0
            r32 = r5
            r5 = r20
            r0 = r30
            r59 = r7
            r7 = r6
            r6 = r9
            r9 = r59
            goto L_0x1091
        L_0x106f:
            r32 = r6
            r14 = r30
            r33 = r31
            r6 = r36
            r5 = r38
            r30 = r0
            r65 = r2
            r0 = r6
            r64 = r14
            r14 = r19
            r3 = r23
            r10 = r24
            r6 = r26
            r9 = r28
            r63 = r30
            r7 = r33
            r5 = r4
            r4 = r21
        L_0x1091:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r2 = f109363a
            r2.mo63620m(r13)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            r66 = r3
            java.lang.String r3 = r13.f137778d
            gy3.C87412m.m108593f(r3, r10)
            r67 = r6
            r6 = 10
            r2.mo63642a(r0, r3, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fail to prefetch #"
            r2.append(r3)
            r2.append(r4)
            r3 = 32
            r2.append(r3)
            java.lang.String r4 = r13.f137778d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r2)
            r4 = r65
            r23 = r0
            r0 = r5
            r3 = r8
            r6 = r12
            r12 = r14
            r28 = r25
            r5 = r27
            r26 = r32
            r8 = r64
            r27 = r66
            r1 = r67
            r14 = r13
            r13 = r18
            r64 = r38
            r59 = r7
            r7 = r63
            r63 = r59
            goto L_0x1267
        L_0x10e5:
            r4 = r12
            r66 = r14
            r26 = r15
            r10 = r20
            r12 = r21
            r14 = r24
            r0 = r25
            r24 = r28
            r28 = r29
            r3 = 32
            r21 = r11
            r11 = r7
            r7 = r5
            r5 = r19
            r19 = r23
            r23 = r22
            r22 = r9
            r9 = r27
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            java.lang.String r15 = r13.f137778d
            r3 = r66
            gy3.C87412m.m108593f(r15, r3)
            r20 = r5
            r5 = 9
            r6.mo63642a(r7, r15, r5)
            java.lang.String r5 = r13.f137783i
            r6 = r26
            gy3.C87412m.m108593f(r5, r6)
            java.lang.String r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43961j(r5)
            java.lang.Object r15 = r9.get(r5)
            te3.qt1 r15 = (te3.C51011qt1) r15
            if (r15 == 0) goto L_0x1133
            int r15 = r15.f140540g
            r26 = r6
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r15)
            goto L_0x1136
        L_0x1133:
            r26 = r6
            r6 = 0
        L_0x1136:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r25 = r10
            java.lang.String r10 = "savePrefetch host: "
            r15.append(r10)
            r15.append(r5)
            java.lang.String r5 = ", openType: "
            r15.append(r5)
            r15.append(r6)
            java.lang.String r5 = r15.toString()
            r10 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r10, r5)
            if (r6 != 0) goto L_0x115b
            goto L_0x121d
        L_0x115b:
            int r5 = r6.intValue()
            r6 = 1
            if (r5 != r6) goto L_0x121d
            int r5 = sx0.C48489d.f129685i
            r13.f137785n = r6
            r5 = 0
            r13.f137790s = r5
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
            java.lang.String r15 = r13.f137778d
            gy3.C87412m.m108593f(r15, r3)
            r14.f109467d = r12
            r14.f109468e = r1
            r14.f109469f = r0
            r14.f109470g = r2
            r5 = r19
            r14.f109471h = r5
            r14.f109472i = r11
            r19 = r0
            r0 = r23
            r14.f109473j = r0
            r0 = r22
            r14.f109474n = r0
            r64 = r2
            r2 = r24
            r14.f109475o = r2
            r66 = r3
            r3 = r28
            r14.f109476p = r3
            r14.f109477q = r9
            r14.f109478r = r13
            r14.f109479s = r13
            r0 = 0
            r14.f109480t = r0
            r14.f109481u = r0
            r14.f109482v = r0
            r14.f109483w = r0
            r14.f109484x = r0
            r14.f109485y = r0
            r14.f109486z = r7
            r14.f109460A = r4
            r0 = r25
            r14.f109461B = r0
            r0 = 8
            r14.f109466G = r0
            r0 = 2
            java.lang.Object r6 = r6.mo63589a(r0, r15, r14)
            r15 = r20
            if (r6 != r15) goto L_0x11bf
            r11 = r15
            goto L_0x144f
        L_0x11bf:
            r21 = r2
            r24 = r3
            r0 = r13
            r3 = r25
            r2 = r64
            r13 = r9
            r9 = r66
            r59 = r7
            r8 = r63
            r7 = r4
            r4 = r15
            r15 = r59
        L_0x11d3:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x11f5
            k40.a r6 = f40.C86709a0.m107533q(r18)
            ex0.d r6 = (ex0.C45696d) r6
            r63 = r1
            java.lang.String r1 = r0.f137778d
            r25 = r0
            java.lang.String r0 = ""
            r64 = r2
            java.lang.String r2 = "urlExposed"
            r65 = r4
            r4 = 0
            r6.mo70968P2(r0, r1, r2, r4)
            goto L_0x11fe
        L_0x11f5:
            r25 = r0
            r63 = r1
            r64 = r2
            r65 = r4
            r4 = 0
        L_0x11fe:
            r1 = r63
            r2 = r64
            r17 = r8
            r6 = r10
            r27 = r13
            r10 = r14
            r0 = r19
            r28 = r21
            r8 = r23
            r29 = r24
            r13 = r25
            r25 = r3
            r14 = r9
            r3 = r12
            r9 = r22
            r12 = r7
            r7 = r11
            r11 = r65
            goto L_0x1249
        L_0x121d:
            r64 = r2
            r66 = r3
            r5 = r19
            r15 = r20
            r2 = r24
            r3 = r28
            r19 = r0
            r0 = r4
            r4 = 0
            r17 = r63
            r28 = r2
            r29 = r3
            r27 = r9
            r6 = r10
            r3 = r12
            r10 = r14
            r9 = r22
            r2 = r64
            r14 = r66
            r12 = r0
            r0 = r19
            r59 = r7
            r7 = r11
            r11 = r15
            r8 = r23
            r15 = r59
        L_0x1249:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r4 = f109363a
            r4.mo63620m(r13)
            r4 = r1
            r63 = r7
            r64 = r11
            r23 = r15
            r1 = r29
            r7 = r0
            r11 = r5
            r0 = r6
            r15 = r10
            r10 = r14
            r29 = r18
            r5 = r28
            r6 = r3
            r14 = r13
            r28 = r17
            r13 = r25
            r3 = r2
        L_0x1267:
            int r2 = r14.f137795x     // Catch:{ Exception -> 0x12f4 }
            r65 = r3
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x128e }
            r3.<init>(r2)     // Catch:{ Exception -> 0x128e }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ Exception -> 0x128e }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x128e }
            if (r3 != 0) goto L_0x1291
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x128e }
            r3.<init>(r2)     // Catch:{ Exception -> 0x128e }
            r66 = r4
            java.lang.Integer r4 = new java.lang.Integer     // Catch:{ Exception -> 0x128b }
            r67 = r6
            r6 = 1
            r4.<init>(r6)     // Catch:{ Exception -> 0x12f7 }
            r1.put(r3, r4)     // Catch:{ Exception -> 0x12f7 }
            goto L_0x12a8
        L_0x128b:
            r67 = r6
            goto L_0x12f7
        L_0x128e:
            r66 = r4
            goto L_0x128b
        L_0x1291:
            r66 = r4
            r67 = r6
            java.lang.Integer r4 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x12f7 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x12f7 }
            r6 = 1
            int r3 = r3 + r6
            java.lang.Integer r6 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r6.<init>(r3)     // Catch:{ Exception -> 0x12f7 }
            r1.put(r4, r6)     // Catch:{ Exception -> 0x12f7 }
        L_0x12a8:
            r30 = 0
            java.lang.String r3 = r14.f137778d     // Catch:{ Exception -> 0x12f7 }
            gy3.C87412m.m108593f(r3, r10)     // Catch:{ Exception -> 0x12f7 }
            r32 = 0
            r33 = 0
            r34 = 1
            boolean r4 = r9.f27482d     // Catch:{ Exception -> 0x12f7 }
            boolean r6 = r8.f27482d     // Catch:{ Exception -> 0x12f7 }
            r37 = 1
            r31 = r3
            r35 = r4
            r36 = r6
            i93.C46206e.m51502i(r30, r31, r32, r33, r34, r35, r36, r37)     // Catch:{ Exception -> 0x12f7 }
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x12f7 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ Exception -> 0x12f7 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x12f7 }
            if (r3 != 0) goto L_0x12e0
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x12f7 }
            java.lang.Integer r2 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r4 = 1
            r2.<init>(r4)     // Catch:{ Exception -> 0x12f7 }
            r5.put(r3, r2)     // Catch:{ Exception -> 0x12f7 }
            goto L_0x12fc
        L_0x12e0:
            java.lang.Integer r4 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x12f7 }
            int r2 = r3.intValue()     // Catch:{ Exception -> 0x12f7 }
            r3 = 1
            int r2 = r2 + r3
            java.lang.Integer r3 = new java.lang.Integer     // Catch:{ Exception -> 0x12f7 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x12f7 }
            r5.put(r4, r3)     // Catch:{ Exception -> 0x12f7 }
            goto L_0x12fc
        L_0x12f4:
            r65 = r3
            goto L_0x128e
        L_0x12f7:
            java.lang.String r2 = "Report Error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r2)
        L_0x12fc:
            r19 = r64
            r2 = r65
            r3 = r67
            r16 = r5
            r14 = r10
            r4 = r11
            r10 = r15
            r5 = r23
            r15 = r26
            r18 = r29
            r17 = 1
            r11 = r0
            r29 = r1
            r0 = r7
            r7 = r63
            r1 = r66
            goto L_0x1359
        L_0x1318:
            r64 = r2
            r10 = r11
            r66 = r14
            r26 = r15
            r15 = r19
            r25 = r20
            r14 = r24
            r2 = r28
            r3 = r29
            r19 = r0
            r11 = r7
            r0 = r12
            r12 = r21
        L_0x132f:
            r7 = r5
            r5 = r23
            r23 = r22
            r22 = r9
            r9 = r27
            r28 = r63
            r16 = r2
            r29 = r3
            r4 = r5
            r5 = r7
            r27 = r9
            r7 = r11
            r3 = r12
            r9 = r22
            r8 = r23
            r13 = r25
            r17 = 1
            r2 = r64
            r12 = r0
            r11 = r10
            r10 = r14
            r0 = r19
            r14 = r66
            r19 = r15
            r15 = r26
        L_0x1359:
            int r12 = r12 + 1
            r63 = r28
            r28 = r16
            goto L_0x0563
        L_0x1361:
            r12 = r3
            r10 = r11
            r2 = r28
            r3 = r29
            r17 = 1
            r11 = r7
            r7 = r5
            boolean r0 = r11.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x1392
            r12.mo63618k(r11)     // Catch:{ Exception -> 0x1377 }
            goto L_0x1392
        L_0x1377:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "preDns ex "
            r0.append(r5)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x1392:
            int r0 = r1.f143686d
            i93.C46206e.m51500g(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Set r1 = r2.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x13a8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x13d1
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            i93.C46206e.m51498e(r4, r5)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r0.add(r4)
            goto L_0x13a8
        L_0x13d1:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            java.util.Set r1 = r3.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x13e2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x1440
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            i93.C46206e.m51501h(r3, r4)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Object r5 = r2.get(r5)
            if (r5 == 0) goto L_0x143a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Object r5 = r2.get(r5)
            gy3.C87412m.m108591d(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r5 <= r3) goto L_0x143a
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            java.lang.Object r5 = r2.get(r5)
            gy3.C87412m.m108591d(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int r5 = r5 - r3
            i93.C46206e.m51499f(r5, r4)
        L_0x143a:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r0.add(r3)
            goto L_0x13e2
        L_0x1440:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r4 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            r0 = 0
            r1 = 150(0x96, double:7.4E-322)
            r10 = 2
            r11 = 0
            r5 = r7
            r7 = r0
            r8 = r1
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.m44019b(r4, r5, r7, r8, r10, r11)
            rx3.b0 r11 = rx3.C13598b0.f38549a
        L_0x144f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43986b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0, te3.vt1, long, te3.tt1, java.util.List, java.util.HashMap, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        if (r1.equals("application/x-javascript") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.f109381j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.f109376e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1.equals("text/javascript") == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r1.equals("application/javascript") == false) goto L_0x005e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b m43987e(java.lang.String r1) {
        /*
            java.lang.String r0 = "contentType"
            gy3.C87412m.m108594g(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1347062799: goto L_0x0052;
                case -1082243251: goto L_0x0045;
                case -1004747231: goto L_0x0038;
                case -723118015: goto L_0x002c;
                case 168355044: goto L_0x0020;
                case 1440428940: goto L_0x0017;
                case 2132236175: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x005e
        L_0x000d:
            java.lang.String r0 = "text/javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0035
            goto L_0x005e
        L_0x0017:
            java.lang.String r0 = "application/javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0035
            goto L_0x005e
        L_0x0020:
            java.lang.String r0 = "application/wxprefetcher"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0029
            goto L_0x005e
        L_0x0029:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.WX_PREFETCH_CONFIG_FILE
            goto L_0x0060
        L_0x002c:
            java.lang.String r0 = "application/x-javascript"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0035
            goto L_0x005e
        L_0x0035:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.JS
            goto L_0x0060
        L_0x0038:
            java.lang.String r0 = "text/css"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x0042
            goto L_0x005e
        L_0x0042:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.CSS
            goto L_0x0060
        L_0x0045:
            java.lang.String r0 = "text/html"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x004f
            goto L_0x005e
        L_0x004f:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.HTML
            goto L_0x0060
        L_0x0052:
            java.lang.String r0 = "application/wspkg"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.WXA_PKG
            goto L_0x0060
        L_0x005e:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.C40719b.UNKNOWN
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.m43987e(java.lang.String):com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$b");
    }

    /* renamed from: f */
    public static final C40719b m43988f(HashMap<String, List<String>> hashMap) {
        String str;
        C87412m.m108594g(hashMap, "headers");
        List list = hashMap.get("content-type");
        if (list == null || (str = (String) C110818d0.m150914L(list)) == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase();
        C87412m.m108593f(lowerCase, "this as java.lang.String).toLowerCase()");
        return m43987e(lowerCase);
    }

    /* renamed from: g */
    public static final boolean m43989g(String str) {
        C87412m.m108594g(str, "url");
        return !C45590f.m50653m(str) || C45590f.m50649i(str) || C45590f.m50651k(str) || C45590f.m50652l(str) || C112551y.m153819s(str, "https://channels.weixin.qq.com/mobile-support/pages", false);
    }

    /* renamed from: i */
    public static void m43990i(String str, String str2, String str3, String str4, String str5, int i, int i2, long j, String str6, int i3, Object obj) {
        String str7 = str;
        int i4 = i3;
        String str8 = (i4 & 2) != 0 ? "" : str2;
        String str9 = (i4 & 4) != 0 ? "" : str3;
        String str10 = (i4 & 8) != 0 ? "" : str4;
        String str11 = (i4 & 16) != 0 ? "" : str5;
        int i5 = -1;
        int i6 = (i4 & 32) != 0 ? -1 : i;
        if ((i4 & 64) == 0) {
            i5 = i2;
        }
        long j2 = (i4 & 128) != 0 ? 1000 : j;
        String str12 = (i4 & 256) != 0 ? null : str6;
        C87412m.m108594g(str7, "url");
        C87412m.m108594g(str8, "appId");
        C87412m.m108594g(str9, FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        C87412m.m108594g(str10, "desc");
        C87412m.m108594g(str11, "from");
        Log.m105926v("MicroMsg.WebPrefetcher", "preAuth: " + str9 + " prefetchId: " + str12 + ", " + str7);
        C47307b.C47308a aVar = r1;
        long j3 = j2;
        C47307b.C47308a aVar2 = new C47307b.C47308a(str, str8, str9, str10, str11, i5, i6, 0, (String) null, (String) null, str12, C22657f.CTRL_INDEX, (C8480h) null);
        C40717k0 k0Var = f109363a;
        String str13 = C47307b.C47308a.class.getCanonicalName() + '_' + "addToPreload";
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        synchronized (__batch_run_obj) {
            C53973z1 z1Var = __batch_run_obj.getBatchJobs().get(str13);
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            HashMap<String, Queue<?>> batchData = __batch_run_obj.getBatchData();
            if (!batchData.containsKey(str13)) {
                batchData.put(str13, new LinkedList());
            }
            Queue<?> queue = batchData.get(str13);
            C87412m.m108592e(queue, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda-1$lambda-0>");
            ((LinkedList) queue).add(aVar);
        }
        __batch_run_obj.getBatchJobs().put(str13, C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C40742n0(j3, str13, (C15601d) null, k0Var), 2, (Object) null));
    }

    /* renamed from: j */
    public static final void m43991j(long j, List<? extends C45700h.C45702b> list) {
        List<? extends C45700h.C45702b> list2 = list;
        C87412m.m108594g(list2, "auths");
        if (!list.isEmpty()) {
            MMKVSlotManager mMKVSlotManager = C9263p.f29013a;
            ((C119157j) C119157j.f356862d).mo183871b(new C9266q(list2), "MicroMsg.WebPrefetcherUrlQueryManager");
            HashMap hashMap = new HashMap();
            for (C45700h.C45702b bVar : list) {
                String str = bVar.f123504a;
                C87412m.m108593f(str, "info.url");
                boolean z = false;
                if (C112551y.m153819s(str, "http", false)) {
                    String a = C9263p.m8906a(bVar.f123504a);
                    String b = C9263p.m8907b(a, bVar);
                    if (a.length() > 0) {
                        if (b.length() > 0) {
                            z = true;
                        }
                        if (z) {
                            hashMap.put(a, b);
                        }
                    }
                }
            }
            C40717k0 k0Var = f109363a;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list2, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                C45700h.C45702b bVar2 = (C45700h.C45702b) it.next();
                String str2 = bVar2.f123504a;
                C87412m.m108593f(str2, "info.url");
                String str3 = bVar2.f123508e;
                String str4 = str3 == null ? "" : str3;
                String str5 = bVar2.f123509f;
                String str6 = str5 == null ? "" : str5;
                String str7 = bVar2.f123510g;
                String str8 = str7 == null ? "" : str7;
                String str9 = bVar2.f123511h;
                Iterator<T> it4 = it;
                C47307b.C47308a aVar = r6;
                C47307b.C47308a aVar2 = new C47307b.C47308a(str2, str4, str6, str8, str9 == null ? "" : str9, bVar2.f123507d, bVar2.f123506c, bVar2.f123513j, (String) null, bVar2.f123512i, bVar2.f123505b, 256, (C8480h) null);
                arrayList.add(aVar);
                it = it4;
            }
            k0Var.mo63621n(arrayList, j, hashMap);
        }
    }

    /* renamed from: c */
    public final C47141d mo63615c(String str, C46353a aVar) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(aVar, "target");
        C48556b bVar = aVar.f124921c;
        C87412m.m108591d(bVar);
        C47141d dVar = new C47141d(str, bVar.mo73172B(aVar.mo71762d()));
        boolean g = dVar.f126657b.mo119967g();
        Log.m105924i("MicroMsg.WebPrefetcher", "fetchContent request savedFileExist: " + g + ", eTag: " + aVar.mo71767i() + ", wxETag: " + aVar.mo71780v());
        if (g) {
            dVar.f126659d = aVar.mo71767i();
            dVar.f126660e = aVar.mo71780v();
        }
        return dVar;
    }

    /* renamed from: d */
    public final Object mo63616d(C48555a aVar, m25 m25, C15601d<? super Boolean> dVar) {
        C31962d.C31964b bVar = C31962d.C31964b.MANIFEST;
        C66218h hVar = new C66218h(C66447b.m78392b(dVar));
        String str = aVar.f129888b.f141127e;
        C87412m.m108593f(str, "manifest.manifest.ManifestUrl");
        String a = C48572p.m53970a(str);
        C48558d.C48560b bVar2 = C48558d.f129896H;
        C48556b bVar3 = C48558d.f129903P;
        if (!bVar3.mo73171A(a)) {
            if (C43520v.f117665a.mo67810a()) {
                String str2 = aVar.f129888b.f141127e;
                C87412m.m108593f(str2, "manifest.manifest.ManifestUrl");
                if (C112551y.m153819s(str2, "file://", false)) {
                    long d = C86013q1.m106443d(aVar.f129888b.f141127e, bVar3.mo73172B(a).mo119971i(), false);
                    Log.m105925i("MicroMsg.WebPrefetcher", "fetchManifest from local file: %s, size: %d", aVar.f129888b.f141127e, new Long(bVar3.mo73172B(a).mo119980r()));
                    if (d > 0) {
                        Result.Companion companion = Result.Companion;
                        hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
                    }
                }
            }
            C31962d.m39599a(C31962d.C31963a.ACTION_NO_CACHE_AND_DOWNLOAD, bVar, aVar.f129887a.f140537d, m25.f137795x, aVar.f129890d, aVar.f129891e, "", aVar.f129888b.f141127e);
            String str3 = aVar.f129888b.f141127e;
            C87412m.m108593f(str3, "manifest.manifest.ManifestUrl");
            C46904a.m52237a(new C47141d(str3, bVar3.mo73172B(a)), new C40720c(aVar, a, hVar));
        } else {
            C31962d.m39599a(C31962d.C31963a.ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD, bVar, aVar.f129887a.f140537d, m25.f137795x, aVar.f129890d, aVar.f129891e, "", aVar.f129888b.f141127e);
            Result.Companion companion2 = Result.Companion;
            hVar.resumeWith(Result.m168114constructorimpl(Boolean.TRUE));
        }
        return hVar.mo90314b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final t73.C48555a mo63617h(java.lang.String r13, java.util.List<? extends te3.C51011qt1> r14) {
        /*
            r12 = this;
            android.net.Uri r13 = android.net.Uri.parse(r13)
            t73.d$b r0 = t73.C48558d.f129896H
            java.lang.String r1 = r13.getHost()
            t73.a r0 = r0.mo73181c(r1)
            if (r0 == 0) goto L_0x0018
            java.lang.String r13 = "MicroMsg.WebPrefetcher"
            java.lang.String r14 = "matchManifest debug"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r13, r14)
            return r0
        L_0x0018:
            java.util.Iterator r14 = r14.iterator()
        L_0x001c:
            boolean r0 = r14.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.Object r0 = r14.next()
            r3 = r0
            te3.qt1 r3 = (te3.C51011qt1) r3
            java.lang.String r0 = r13.getHost()
            java.lang.String r2 = r3.f140537d
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x001c
            java.util.LinkedList<te3.rt1> r0 = r3.f140539f
            java.lang.String r2 = "domain.ResInfos"
            gy3.C87412m.m108593f(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0041:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x001c
            java.lang.Object r2 = r0.next()
            r4 = r2
            te3.rt1 r4 = (te3.C51154rt1) r4
            java.lang.String r2 = r13.getPath()
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0066
            java.lang.String r7 = r4.f141126d
            java.lang.String r8 = "resInfo.Path"
            gy3.C87412m.m108593f(r7, r8)
            r8 = 2
            boolean r2 = p225rc.C12969d.m12409c(r2, r7, r6, r8, r1)
            if (r2 != r5) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r5 = 0
        L_0x0067:
            if (r5 == 0) goto L_0x0041
            t73.a r13 = new t73.a
            java.lang.String r14 = "resInfo"
            gy3.C87412m.m108593f(r4, r14)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 124(0x7c, float:1.74E-43)
            r11 = 0
            r2 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.mo63617h(java.lang.String, java.util.List):t73.a");
    }

    /* renamed from: k */
    public final void mo63618k(List<String> list) {
        boolean z;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (String parse : list) {
            String host = Uri.parse(parse).getHost();
            if (host == null) {
                host = "";
            }
            arrayList.add(host);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String str = (String) next;
            C87412m.m108593f(str, LocaleUtil.ITALIAN);
            if (!C112551y.m153811k(str)) {
                MMCacheSlotManager mMCacheSlotManager = C45469b.f123066j;
                if (!C45469b.f123068o.containsKey(str)) {
                    z = true;
                }
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        List E = C110818d0.m150905E(arrayList2);
        if (E.isEmpty()) {
            z = true;
        }
        if (!z) {
            ((C119157j) C119157j.f356862d).mo183884o(new C40721d(E));
        }
    }

    /* renamed from: l */
    public final void mo63619l(long j, String str, String str2, String str3, boolean z, Map<String, String> map, int i, int i2, int i3, C48555a aVar, boolean z2, boolean z3) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(str2, "prefetchUrl");
        C40718a aVar2 = new C40718a(C40714i.m43961j(str), str, str2, z, map, 0, 32, (C8480h) null);
        String str4 = C40718a.class.getCanonicalName() + '_' + MStorageEventData.EventType.BATCH;
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        synchronized (__batch_run_obj) {
            C53973z1 z1Var = __batch_run_obj.getBatchJobs().get(str4);
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            HashMap<String, Queue<?>> batchData = __batch_run_obj.getBatchData();
            if (!batchData.containsKey(str4)) {
                batchData.put(str4, new LinkedList());
            }
            Queue<?> queue = batchData.get(str4);
            C87412m.m108592e(queue, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda-1$lambda-0>");
            ((LinkedList) queue).add(aVar2);
        }
        __batch_run_obj.getBatchJobs().put(str4, C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C40722e(50, str4, (C15601d) null, str3, aVar, z2, z3, i3, i, i2, str2, j, str), 2, (Object) null));
    }

    /* renamed from: m */
    public final void mo63620m(m25 m25) {
        String str = m25.f137778d;
        C87412m.m108593f(str, "url");
        String i = C40714i.m43960i(str, false);
        String str2 = m25.f137794w;
        if (str2 == null || str2.length() == 0) {
            C46368o oVar = C46368o.f124957a;
            String str3 = m25.f137778d;
            C87412m.m108593f(str3, "url");
            m25.f137794w = oVar.mo71786b(str3, m25.f137796y, false);
        }
        String str4 = m25.f137783i;
        C87412m.m108593f(str4, "fullUrl");
        m25.f137784j = C40714i.m43960i(str4, true);
        String str5 = m25.f137794w;
        C87412m.m108594g(i, "webId");
        C46368o.C46369a aVar = C46368o.C46369a.f124958a;
        Log.m105927v("MicroMsg.WebPrefetcherInfoManager", "savePrefetchInfo webId: %s, prefetchId: %s", i, str5);
        MMKVSlotManager mMKVSlotManager = C46368o.C46369a.f124959b;
        ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(i, m25.toByteArray());
        if (!(str5 == null || str5.length() == 0) && !C87412m.m108589b(i, str5)) {
            ((MultiProcessMMKV) mMKVSlotManager.getSlotForWrite()).encode(str5, i);
        }
        String str6 = m25.f137778d;
        C87412m.m108593f(str6, "url");
        int i2 = m25.f137795x;
        MMKVSlotManager mMKVSlotManager2 = C47539a.f127550a;
        ((MultiProcessMMKV) C47539a.f127550a.getSlotForWrite()).encode(C40714i.m43960i(str6, false), i2);
        StringBuilder sb = new StringBuilder();
        sb.append("save preauth webid:");
        sb.append(i);
        sb.append(" bizId: ");
        sb.append(m25.f137784j);
        sb.append(" prefetchId: ");
        sb.append(m25.f137794w);
        sb.append(", prefetch:");
        sb.append(m25.f137785n);
        sb.append(", authorized:");
        sb.append(m25.f137781g);
        sb.append(", antispam:");
        sb.append(m25.f137780f);
        sb.append(", lastModify:");
        sb.append(m25.f137779e);
        sb.append(", appId: ");
        sb.append(m25.f137789r);
        sb.append(", pkgFileKey: ");
        sb.append(m25.f137792u);
        sb.append(", jsapiControlBytes: ");
        C89349b bVar = m25.f137791t;
        sb.append(bVar != null ? Integer.valueOf(bVar.f257327a.length) : null);
        sb.append(", url: %s");
        Log.m105925i("MicroMsg.WebPrefetcher", sb.toString(), m25.f137778d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x031b  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01dc  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63621n(java.util.List<ny0.C47307b.C47308a> r29, long r30, java.util.HashMap<java.lang.String, java.lang.String> r32) {
        /*
            r28 = this;
            r0 = r29
            r1 = r30
            java.lang.String r3 = "MicroMsg.WebPrefetcherCallbackManager"
            java.lang.String r5 = "preAuths"
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0035
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r6 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            gy3.C87412m.m108594g(r0, r5)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t0 r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.t0
            r6.<init>(r1, r0)
            zt3.t r7 = zt3.C119157j.f356862d
            zt3.j r7 = (zt3.C119157j) r7
            r7.mo183876g(r6, r3)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0 r6 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.u0
            r6.<init>(r1)
            r7 = 60000(0xea60, double:2.9644E-319)
            zt3.t r9 = zt3.C119157j.f356862d
            zt3.j r9 = (zt3.C119157j) r9
            r9.mo183879j(r6, r7, r3)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$g r7 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0$g
            r8 = r32
            r7.<init>(r1, r8)
            ny0.b r8 = ny0.C47307b.f126966a
            java.lang.String r8 = "req.ReqInfo"
            gy3.C87412m.m108594g(r0, r5)
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            int r10 = r29.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            java.lang.String r10 = "MicroMsg.WebPrefetcherPreAuther"
            java.lang.String r12 = "[TRACE_PREFETCH-preAuth] preAuths size = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r10, r12, r9)
            te3.tt1 r9 = new te3.tt1
            r9.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r29.iterator()
        L_0x0068:
            boolean r0 = r13.hasNext()
            r14 = 2
            if (r0 == 0) goto L_0x01e9
            java.lang.Object r15 = r13.next()
            r4 = r15
            ny0.b$a r4 = (ny0.C47307b.C47308a) r4
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.k0 r0 = f109363a
            r0.getClass()
            rx3.g r0 = f109368f
            rx3.n r0 = (rx3.C36570n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x01d5
            com.tencent.mm.sdk.platformtools.MMCacheSlotManager r0 = ny0.C47307b.f126967b
            java.lang.String r11 = r4.f126969a
            java.lang.String r11 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43959h(r11)
            boolean r0 = r0.contains(r11)
            r0 = r0 ^ r5
            ny0.b r11 = ny0.C47307b.f126966a
            r5 = 3
            r11.mo72359a(r4, r0, r6, r5)
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = r4.f126969a
            boolean r0 = m43989g(r0)
            r5 = 4
            r11.mo72359a(r4, r0, r6, r5)
            if (r0 == 0) goto L_0x01bd
            java.lang.String r11 = r4.f126969a
            java.lang.String r5 = "url"
            gy3.C87412m.m108594g(r11, r5)
            java.lang.String r0 = ea3.C45590f.m50647g(r11)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = r0.getHost()
            if (r0 == 0) goto L_0x013d
            r18 = r3
            r17 = r13
            r3 = 0
            r13 = 0
            java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43958g(r0, r3, r14, r13)
            com.tencent.mm.sdk.platformtools.MMKVSlotManager r3 = f109364b
            java.lang.Object r3 = r3.findSlot(r0)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r3
            if (r3 == 0) goto L_0x010d
            boolean r13 = r3.containsKey(r0)
            if (r13 == 0) goto L_0x010d
            byte[] r0 = r3.decodeBytes(r0)
            if (r0 == 0) goto L_0x010d
            int r3 = r0.length
            if (r3 != 0) goto L_0x00eb
            r3 = 1
            r16 = 1
            goto L_0x00ee
        L_0x00eb:
            r3 = 1
            r16 = 0
        L_0x00ee:
            r13 = r16 ^ 1
            if (r13 == 0) goto L_0x010d
            java.lang.Class<te3.pt1> r3 = te3.C50873pt1.class
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0102 }
            r13 = r3
            pe3.a r13 = (pe3.C47465a) r13     // Catch:{ Exception -> 0x0102 }
            r13.parseFrom(r0)     // Catch:{ Exception -> 0x0102 }
            r13 = r3
            pe3.a r13 = (pe3.C47465a) r13     // Catch:{ Exception -> 0x0102 }
            goto L_0x010e
        L_0x0102:
            r0 = move-exception
            r3 = 0
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r3 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r14 = "decode ProtoBuffer"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r0, r14, r13)
        L_0x010d:
            r13 = 0
        L_0x010e:
            te3.pt1 r13 = (te3.C50873pt1) r13
            if (r13 == 0) goto L_0x0123
            int r0 = r13.f139950e
            r3 = 1
            if (r0 != r3) goto L_0x0123
            long r0 = r13.f139952g
            int r2 = r13.f139951f
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.isExpire((long) r0, (int) r2)
            if (r0 != 0) goto L_0x0123
            r0 = 1
            goto L_0x0124
        L_0x0123:
            r0 = 0
        L_0x0124:
            if (r0 == 0) goto L_0x0142
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[TRACE_PREFETCH] preauth cancelled, in whiteList:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.WebPrefetcher"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r1)
            goto L_0x0142
        L_0x013d:
            r18 = r3
            r17 = r13
            r0 = 0
        L_0x0142:
            r1 = 1
            r0 = r0 ^ r1
            ny0.b r1 = ny0.C47307b.f126966a
            r2 = 4
            r1.mo72359a(r4, r0, r6, r2)
            if (r0 == 0) goto L_0x01c1
            iy0.o r0 = iy0.C46368o.f124957a
            java.lang.String r2 = r4.f126969a
            gy3.C87412m.m108594g(r2, r5)
            iy0.o$a r3 = iy0.C46368o.C46369a.f124958a
            r3 = 0
            java.lang.String r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43960i(r2, r3)
            r3 = 0
            te3.m25 r0 = r0.mo71785a(r5, r3)
            if (r0 == 0) goto L_0x016c
            long r13 = r0.f137779e
            r0 = 540(0x21c, float:7.57E-43)
            boolean r0 = com.tencent.p014mm.sdk.platformtools.MMSlotKt.isExpire((long) r13, (int) r0)
            r11 = r0
            r13 = 1
            goto L_0x016f
        L_0x016c:
            r0 = 0
            r11 = 1
            r13 = 0
        L_0x016f:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r3 = "[TRACE_PREFETCH] needReauth:"
            r14.append(r3)
            r14.append(r11)
            java.lang.String r3 = ", webId:"
            r14.append(r3)
            r14.append(r5)
            java.lang.String r3 = ", cached:"
            r14.append(r3)
            r14.append(r13)
            java.lang.String r3 = ", expired:"
            r14.append(r3)
            r14.append(r0)
            java.lang.String r0 = ", url:"
            r14.append(r0)
            r14.append(r2)
            java.lang.String r0 = r14.toString()
            java.lang.String r2 = "MicroMsg.WebPrefetcherInfoManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r2, r0)
            r0 = 5
            r1.mo72359a(r4, r11, r6, r0)
            if (r11 == 0) goto L_0x01c1
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r0 = ny0.C47307b.f126968c
            java.lang.String r2 = r4.f126969a
            boolean r0 = r0.contains(r2)
            r2 = 1
            r0 = r0 ^ r2
            r2 = 6
            r1.mo72359a(r4, r0, r6, r2)
            if (r0 == 0) goto L_0x01c1
            r0 = 1
            goto L_0x01c2
        L_0x01bd:
            r18 = r3
            r17 = r13
        L_0x01c1:
            r0 = 0
        L_0x01c2:
            if (r0 == 0) goto L_0x01d0
            if (r6 == 0) goto L_0x01d0
            ny0.b r1 = ny0.C47307b.f126966a
            r2 = 1
            ex0.h$d r1 = r1.mo72360b(r4, r2)
            r6.add(r1)
        L_0x01d0:
            if (r0 == 0) goto L_0x01d3
            goto L_0x01d9
        L_0x01d3:
            r0 = 0
            goto L_0x01da
        L_0x01d5:
            r18 = r3
            r17 = r13
        L_0x01d9:
            r0 = 1
        L_0x01da:
            if (r0 == 0) goto L_0x01df
            r12.add(r15)
        L_0x01df:
            r1 = r30
            r13 = r17
            r3 = r18
            r5 = 1
            r11 = 0
            goto L_0x0068
        L_0x01e9:
            r18 = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = sx3.C36907w.m41090l(r12, r1)
            r0.<init>(r2)
            java.util.Iterator r2 = r12.iterator()
            r3 = 0
        L_0x01fb:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x024a
            java.lang.Object r4 = r2.next()
            ny0.b$a r4 = (ny0.C47307b.C47308a) r4
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.r r5 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.r
            r5.<init>()
            java.lang.String r11 = r4.f126969a
            r5.f141739e = r11
            java.lang.String r12 = r4.f126970b
            r5.f141740f = r12
            java.lang.String r12 = r4.f126971c
            r5.f141741g = r12
            java.lang.String r12 = r4.f126972d
            r5.f141742h = r12
            int r12 = r3 + 1
            r5.f141738d = r3
            java.lang.String r3 = r4.f126976h
            r5.f141743i = r3
            int r3 = r4.f126974f
            r5.f141745n = r3
            int r3 = r4.f126975g
            r5.f109496t = r3
            int r3 = r4.f126973e
            r5.f109497u = r3
            com.tencent.mm.sdk.platformtools.MMCacheSlotManager r3 = ny0.C47307b.f126967b
            java.lang.String r11 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43959h(r11)
            r3.add(r11)
            java.lang.String r3 = r4.f126977i
            r5.f109494r = r3
            int r3 = r4.f126974f
            r5.f109495s = r3
            java.lang.String r3 = r4.f126978j
            r5.f109498v = r3
            r0.add(r5)
            r3 = r12
            goto L_0x01fb
        L_0x024a:
            java.util.LinkedList<te3.st1> r2 = r9.f142403n
            r2.addAll(r0)
            java.util.LinkedList<te3.st1> r0 = r9.f142403n
            int r0 = r0.size()
            r9.f142396d = r0
            r2 = 0
            r9.f142397e = r2
            r9.f142398f = r2
            java.util.LinkedList<te3.st1> r0 = r9.f142403n
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x026a
            java.lang.String r0 = "[TRACE_PREFETCH-preAuth] preAuths: nothing to preauth"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r0)
            goto L_0x028e
        L_0x026a:
            r7.mo63632c(r9)
            boolean r0 = r7.mo63631b(r9)
            r3 = 1
            if (r0 != r3) goto L_0x0276
            r0 = 1
            goto L_0x0277
        L_0x0276:
            r0 = 0
        L_0x0277:
            if (r0 == 0) goto L_0x0291
            if (r6 == 0) goto L_0x028e
            java.util.Iterator r0 = r6.iterator()
        L_0x027f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x028e
            java.lang.Object r1 = r0.next()
            ex0.h$d r1 = (ex0.C45700h.C45704d) r1
            r1.f123530b = r14
            goto L_0x027f
        L_0x028e:
            r5 = 0
            goto L_0x0319
        L_0x0291:
            java.util.concurrent.ConcurrentSkipListSet<java.lang.String> r0 = ny0.C47307b.f126968c     // Catch:{ Exception -> 0x02bb }
            java.util.LinkedList<te3.st1> r2 = r9.f142403n     // Catch:{ Exception -> 0x02bb }
            gy3.C87412m.m108593f(r2, r8)     // Catch:{ Exception -> 0x02bb }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x02bb }
            int r1 = sx3.C36907w.m41090l(r2, r1)     // Catch:{ Exception -> 0x02bb }
            r3.<init>(r1)     // Catch:{ Exception -> 0x02bb }
            java.util.Iterator r1 = r2.iterator()     // Catch:{ Exception -> 0x02bb }
        L_0x02a5:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x02bb }
            if (r2 == 0) goto L_0x02b7
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x02bb }
            te3.st1 r2 = (te3.C51296st1) r2     // Catch:{ Exception -> 0x02bb }
            java.lang.String r2 = r2.f141739e     // Catch:{ Exception -> 0x02bb }
            r3.add(r2)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02a5
        L_0x02b7:
            r0.addAll(r3)     // Catch:{ Exception -> 0x02bb }
            goto L_0x02d4
        L_0x02bb:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[TRACE_PREFETCH-preAuth] Concurrent Add Exception: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r10, r0)
        L_0x02d4:
            com.tencent.mm.plugin.webview.core.v$b r0 = com.tencent.p014mm.plugin.webview.core.C43520v.f117665a
            boolean r0 = r0.mo67810a()
            if (r0 == 0) goto L_0x02e0
            r1 = 1
            com.tencent.mars.cdn.CronetLogic.setUserCertVerify(r1)
        L_0x02e0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[TRACE_PREFETCH-preAuth] sendGetA8KeyLiteRequest batch req: "
            r0.append(r1)
            java.util.LinkedList<te3.st1> r1 = r9.f142403n
            gy3.C87412m.m108593f(r1, r8)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            ny0.c r25 = ny0.C47309c.f126979d
            r26 = 30
            r27 = 0
            java.lang.String r20 = ","
            r19 = r1
            java.lang.String r1 = sx3.C110818d0.m150921S(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r0)
            ny0.e r0 = new ny0.e
            r0.<init>(r9, r7)
            r1 = 1
            o40.C61926c.m72657B(r10, r1, r0)
            r5 = 1
        L_0x0319:
            if (r6 == 0) goto L_0x032e
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0 r0 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.v0
            r1 = r30
            r0.<init>(r1, r6)
            zt3.t r3 = zt3.C119157j.f356862d
            zt3.j r3 = (zt3.C119157j) r3
            r4 = r18
            r3.mo183876g(r0, r4)
            goto L_0x0330
        L_0x032e:
            r1 = r30
        L_0x0330:
            if (r5 != 0) goto L_0x033e
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.q0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.f109487a
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r1 = r30
            com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40746q0.m44019b(r0, r1, r3, r4, r6, r7)
        L_0x033e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40717k0.mo63621n(java.util.List, long, java.util.HashMap):void");
    }
}
