package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import ay0.C39656k;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCInteger;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMFileSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.sdk.platformtools.__BATCH_RUN_OBJ;
import com.tencent.p014mm.vfs.C45112n1;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.xweb.IXWebBroadcastListener;
import com.tencent.xweb.file.XVFSFile;
import ea3.C45590f;
import f40.C86709a0;
import fx0.C45834o;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import g93.C32355a;
import g93.C45902c;
import gy3.C45984j0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import ob0.C117747y;
import ob0.C47350c;
import ob0.C89144l0;
import ob0.l0$$e;
import p206nj.C117627q;
import pe3.C47465a;
import q20.C89449a;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64197v;
import te3.C48812b6;
import te3.C49336ev;
import te3.C49948j6;
import te3.C50036jt3;
import te3.C50885pw3;
import te3.C51023qw3;
import te3.C51805wa;
import te3.C51944xa;
import te3.C52115yg3;
import te3.zg4;
import wx0.C38340c;
import wx0.C38342e;
import wx3.C15601d;
import xx0.C53458b;
import xx0.C53461c;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import z04.C112550d0;
import z04.C112551y;
import z04.C119027c;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z */
public final class C40789z {

    /* renamed from: a */
    public static final C40789z f109640a = new C40789z();

    /* renamed from: b */
    public static final AtomicBoolean f109641b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final C13601g f109642c = C36568h.m40985a(C40793e.f109655d);

    /* renamed from: d */
    public static final MMKVSlotManager f109643d = new MMKVSlotManager(C40716j0.m43979g(), 0, 2, (C8480h) null);

    /* renamed from: e */
    public static final MMFileSlotManager f109644e = new MMFileSlotManager("webcached", 0, 2, (C8480h) null);

    /* renamed from: f */
    public static final HashMap<Integer, Boolean> f109645f = new HashMap<>();

    /* renamed from: g */
    public static final C40790a f109646g = new C40790a();

    /* renamed from: h */
    public static final C13601g f109647h = C36568h.m40985a(C29785h.f80792d);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/timeline/preload/z$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-brandservice_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$b */
    public static final class C29784b implements C80883e<Bundle, Bundle> {
        public void invoke(Object obj, C1256g gVar) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, "bundle");
            C87412m.m108594g(gVar, "callback");
            C40789z.f109640a.mo63721n(bundle, new C29768a0(gVar));
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$h */
    public static final class C29785h extends C87413o implements C32224a<ConcurrentHashMap<String, ConcurrentLinkedDeque<C32226l<? super Bundle, ? extends C13598b0>>>> {

        /* renamed from: d */
        public static final C29785h f80792d = new C29785h();

        public C29785h() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCString;", "kotlin.jvm.PlatformType", "url", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCString;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$m */
    public static final class C29786m<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C29786m<InputType, ResultType> f80793d = new C29786m<>();

        public void invoke(Object obj, C1256g gVar) {
            String str = ((IPCString) obj).f10315d;
            if (Util.isNullOrNil(str)) {
                Log.m105928w("MicroMsg.Preload.BizAppMsgReportMgr", "url is null, err");
                return;
            }
            C49948j6 j6Var = new C49948j6();
            j6Var.f135877d = str;
            C32355a.m39689a(50);
            C32355a.m39689a(56);
            LinkedList linkedList = new LinkedList();
            linkedList.add(j6Var);
            C89144l0.m111429e(C38342e.m41837a(linkedList, 0).mo72403a(), new C38340c(0, j6Var), false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$a */
    public static final class C40790a {
        /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final te3.C48812b6 mo63725a(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.String r0 = "url"
                gy3.C87412m.m108594g(r7, r0)
                java.lang.String r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43962k(r7)
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.z r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.f109640a
                com.tencent.mm.sdk.platformtools.MMKVSlotManager r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.f109643d
                java.lang.Object r1 = r1.findSlot(r0)
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = (com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV) r1
                r2 = 0
                if (r1 == 0) goto L_0x0047
                boolean r3 = r1.containsKey(r0)
                if (r3 == 0) goto L_0x0047
                byte[] r1 = r1.decodeBytes(r0)
                if (r1 == 0) goto L_0x0047
                int r3 = r1.length
                r4 = 1
                r5 = 0
                if (r3 != 0) goto L_0x002a
                r3 = 1
                goto L_0x002b
            L_0x002a:
                r3 = 0
            L_0x002b:
                r3 = r3 ^ r4
                if (r3 == 0) goto L_0x0047
                java.lang.Class<te3.b6> r3 = te3.C48812b6.class
                java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x003d }
                r4 = r3
                pe3.a r4 = (pe3.C47465a) r4     // Catch:{ Exception -> 0x003d }
                r4.parseFrom(r1)     // Catch:{ Exception -> 0x003d }
                pe3.a r3 = (pe3.C47465a) r3     // Catch:{ Exception -> 0x003d }
                goto L_0x0048
            L_0x003d:
                r1 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r5]
                java.lang.String r4 = "MultiProcessMMKV.decodeProtoBuffer"
                java.lang.String r5 = "decode ProtoBuffer"
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r4, r1, r5, r3)
            L_0x0047:
                r3 = r2
            L_0x0048:
                te3.b6 r3 = (te3.C48812b6) r3
                java.lang.String r1 = "MicroMsg.Preload.BizAppMsgContextCache"
                if (r3 == 0) goto L_0x006f
                r3.f130962d = r7
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r2 = "found:"
                r7.append(r2)
                r7.append(r0)
                java.lang.String r0 = " last modify:"
                r7.append(r0)
                int r0 = r3.f130966h
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
                return r3
            L_0x006f:
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r3 = "not found:"
                r7.append(r3)
                r7.append(r0)
                java.lang.String r7 = r7.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r7)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.C40790a.mo63725a(java.lang.String):te3.b6");
        }

        /* renamed from: b */
        public final boolean mo63726b(String str, int i) {
            boolean z;
            C87412m.m108594g(str, "url");
            C48812b6 a = mo63725a(str);
            boolean z2 = false;
            if (a == null) {
                return false;
            }
            C40789z zVar = C40789z.f109640a;
            int j = zVar.mo63719j(a.f130973r);
            if (j != -1) {
                i = j;
            }
            if (!zVar.mo63715f(a, i)) {
                Log.m105926v("MicroMsg.Preload.BizAppMsgContextCache", "checkValid: invalid version:data(" + a.f130968j + ')');
            } else {
                if (C29783w.m38875a().getBoolean("preload_data_noexpire", false)) {
                    Log.m105924i("MicroMsg.Preload.BizAppMsgContextCache", "checkValid: debug to expire");
                } else {
                    String str2 = a.f130962d;
                    C87412m.m108593f(str2, "appMsgContext.Url");
                    String l = C40714i.m43963l(str2);
                    MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C40789z.f109643d.findSlot(l);
                    if (multiProcessMMKV != null) {
                        C87412m.m108594g(l, "key");
                        z = MMSlotKt.isExpire(multiProcessMMKV.getLong(l, 0), ((long) a.f130964f) * 1000);
                    } else {
                        z = true;
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.Preload.BizAppMsgContextCache", "checkValid: expire for " + a.f130964f);
                    }
                }
                z2 = true;
            }
            if (!z2) {
                Log.m105918d("MicroMsg.Preload.BizAppMsgContextCache", "init invalid:" + C40714i.m43962k(str));
            }
            return z2;
        }

        /* renamed from: c */
        public final void mo63727c(String str, C48812b6 b6Var) {
            C87412m.m108594g(str, "url");
            if (b6Var != null) {
                String str2 = b6Var.f130963e;
                if (!(str2 == null || C112551y.m153811k(str2))) {
                    String k = C40714i.m43962k(str);
                    String str3 = b6Var.f130963e;
                    try {
                        C48812b6 b6Var2 = new C48812b6();
                        b6Var2.parseFrom(b6Var.toByteArray());
                        b6Var2.f130963e = null;
                        byte[] byteArray = b6Var2.toByteArray();
                        C40789z zVar = C40789z.f109640a;
                        MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C40789z.f109643d.getSlotForWrite();
                        multiProcessMMKV.encode(k, byteArray);
                        MMFileSlotManager mMFileSlotManager = C40789z.f109644e;
                        String d = C40714i.m43955d(str);
                        C87412m.m108594g(mMFileSlotManager, "<this>");
                        C87412m.m108594g(d, "contentId");
                        C86009m1 f = C40714i.m43957f((C86009m1) mMFileSlotManager.getSlotForWrite(), d);
                        C40714i.m43953b(f);
                        C87412m.m108593f(str3, "content");
                        Charset charset = C119027c.f356488a;
                        C87412m.m108594g(charset, "charset");
                        byte[] bytes = str3.getBytes(charset);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        C45112n1.m49955b(f, bytes);
                        C40744p.m44017c(multiProcessMMKV, C40714i.m43963l(str));
                    } catch (IOException e) {
                        Log.printErrStackTrace("MicroMsg.Preload.BizAppMsgContextCache", e, "save " + k, new Object[0]);
                    }
                    Log.m105924i("MicroMsg.Preload.BizAppMsgContextCache", "saveInfo " + k + " last modify:" + Integer.valueOf(b6Var.f130966h));
                    return;
                }
            }
            Log.m105920e("MicroMsg.Preload.BizAppMsgContextCache", "save fail, appMsgContext is null");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$c */
    public static final class C40791c {

        /* renamed from: a */
        public boolean f109648a;

        /* renamed from: b */
        public long f109649b;

        /* renamed from: c */
        public long f109650c;

        /* renamed from: d */
        public boolean f109651d;

        /* renamed from: e */
        public boolean f109652e;

        public C40791c(boolean z, long j, long j2, boolean z2, boolean z3, int i, C8480h hVar) {
            z3 = (i & 16) != 0 ? false : z3;
            this.f109648a = z;
            this.f109649b = j;
            this.f109650c = j2;
            this.f109651d = z2;
            this.f109652e = z3;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$d */
    public static final class C40792d {

        /* renamed from: a */
        public final String f109653a;

        /* renamed from: b */
        public final int f109654b;

        public C40792d(String str, int i) {
            C87412m.m108594g(str, "url");
            this.f109653a = str;
            this.f109654b = i;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$e */
    public static final class C40793e extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C40793e f109655d = new C40793e();

        public C40793e() {
            super(0);
        }

        public Object invoke() {
            return C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic$addToPreload$$inlined$batchRun$1", mo125469f = "PreloadLogic.kt", mo125470l = {28}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$f */
    public static final class C40794f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f109656d;

        /* renamed from: e */
        public /* synthetic */ Object f109657e;

        /* renamed from: f */
        public final /* synthetic */ long f109658f;

        /* renamed from: g */
        public final /* synthetic */ String f109659g;

        /* renamed from: h */
        public final /* synthetic */ int f109660h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40794f(long j, String str, C15601d dVar, int i) {
            super(2, dVar);
            this.f109658f = j;
            this.f109659g = str;
            this.f109660h = i;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C40794f fVar = new C40794f(this.f109658f, this.f109659g, dVar, this.f109660h);
            fVar.f109657e = obj;
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C40794f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C0000n0 n0Var;
            ArrayList<ArrayList> arrayList;
            int i;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i2 = this.f109656d;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C0000n0 n0Var2 = (C0000n0) this.f109657e;
                long j = this.f109658f;
                this.f109657e = n0Var2;
                this.f109656d = 1;
                if (C53965x0.m60607b(j, this) == aVar) {
                    return aVar;
                }
                n0Var = n0Var2;
            } else if (i2 == 1) {
                n0Var = (C0000n0) this.f109657e;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!C53930o0.m60560g(n0Var)) {
                return C13598b0.f38549a;
            }
            __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
            String str = this.f109659g;
            synchronized (__batch_run_obj) {
                Queue<?> queue = __batch_run_obj.getBatchData().get(str);
                arrayList = null;
                Queue queue2 = queue instanceof Queue ? queue : null;
                if (queue2 != null) {
                    __batch_run_obj.getBatchData().remove(str);
                    arrayList = new ArrayList<>(queue2);
                }
            }
            if (arrayList != null) {
                if (WeChatEnvironment.hasDebugger() && Log.getLogLevel() == 0 && !arrayList.isEmpty()) {
                    C40789z zVar = C40789z.f109640a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("preloadData addToPreload batch:");
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    for (ArrayList arrayList3 : arrayList) {
                        arrayList2.add(C40714i.m43955d(arrayList3.get(0).toString()));
                    }
                    sb.append(arrayList2);
                    Log.m105926v("MicroMsg.PreloadLogic", sb.toString());
                }
                List h0 = C110818d0.m150936h0(arrayList);
                ArrayList arrayList4 = new ArrayList();
                for (Object next : h0) {
                    ArrayList arrayList5 = (ArrayList) next;
                    if (arrayList5 != null && (arrayList5.get(0) instanceof String)) {
                        arrayList4.add(next);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList6 = new ArrayList();
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    Object next2 = it.next();
                    Object obj2 = ((ArrayList) next2).get(0);
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
                    if (hashSet.add(C40714i.m43955d((String) obj2))) {
                        arrayList6.add(next2);
                    }
                }
                if (!arrayList6.isEmpty()) {
                    C40789z zVar2 = C40789z.f109640a;
                    int i3 = this.f109660h;
                    int i4 = 2;
                    int i5 = i3 != 1 ? i3 != 2 ? 0 : 2 : 1;
                    if (i5 != 0) {
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            ArrayList arrayList7 = (ArrayList) it4.next();
                            C115669n nVar = C115669n.INSTANCE;
                            Object[] objArr = new Object[11];
                            objArr[0] = new Integer(i5);
                            C40789z zVar3 = C40789z.f109640a;
                            objArr[1] = zVar3.mo63723p(arrayList7, i4, "");
                            Object obj3 = arrayList7.get(0);
                            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.String");
                            objArr[i4] = C117627q.m165908a((String) obj3);
                            objArr[3] = zVar3.mo63723p(arrayList7, 3, "");
                            objArr[4] = zVar3.mo63723p(arrayList7, 4, "");
                            objArr[5] = new Integer(i4);
                            objArr[6] = arrayList7.get(1);
                            objArr[7] = zVar3.mo63723p(arrayList7, 5, "");
                            objArr[8] = zVar3.mo63723p(arrayList7, 6, "");
                            objArr[9] = zVar3.mo63723p(arrayList7, 7, "");
                            Object obj4 = arrayList7.get(1);
                            C87412m.m108592e(obj4, "null cannot be cast to non-null type kotlin.Int");
                            if (((Integer) obj4).intValue() == -1) {
                                Object obj5 = arrayList7.get(0);
                                C87412m.m108592e(obj5, "null cannot be cast to non-null type kotlin.String");
                                if (C45590f.m50650j((String) obj5)) {
                                    i = 1;
                                    objArr[10] = new Integer(i);
                                    nVar.mo160131h(16468, objArr);
                                    i4 = 2;
                                }
                            }
                            i = 0;
                            objArr[10] = new Integer(i);
                            nVar.mo160131h(16468, objArr);
                            i4 = 2;
                        }
                    }
                    if (C40789z.m44094e(C40789z.f109640a.mo63724r(this.f109660h))) {
                        int n = C40714i.m43965n(this.f109660h);
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it5 = arrayList6.iterator();
                        while (it5.hasNext()) {
                            Object next3 = it5.next();
                            Object obj6 = ((ArrayList) next3).get(0);
                            C87412m.m108592e(obj6, "null cannot be cast to non-null type kotlin.String");
                            if (!(!C45590f.m50650j((String) obj6))) {
                                arrayList8.add(next3);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(C36907w.m41090l(arrayList8, 10));
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            ArrayList arrayList10 = (ArrayList) it6.next();
                            Object obj7 = arrayList10.get(0);
                            C87412m.m108592e(obj7, "null cannot be cast to non-null type kotlin.String");
                            C40789z zVar4 = C40789z.f109640a;
                            Object obj8 = arrayList10.get(1);
                            C87412m.m108592e(obj8, "null cannot be cast to non-null type kotlin.Int");
                            arrayList9.add(new C40792d((String) obj7, zVar4.mo63719j(((Integer) obj8).intValue())));
                        }
                        ArrayList arrayList11 = new ArrayList();
                        Iterator it7 = arrayList9.iterator();
                        while (it7.hasNext()) {
                            Object next4 = it7.next();
                            C40792d dVar = (C40792d) next4;
                            String str2 = dVar.f109653a;
                            if (!(!C45590f.m50653m(str2) || C40789z.f109646g.mo63726b(str2, dVar.f109654b))) {
                                arrayList11.add(next4);
                            }
                        }
                        int max = Math.max(arrayList11.size() - n, 0);
                        List<C40792d> s0 = C110818d0.m150947s0(arrayList11, n);
                        if (true ^ s0.isEmpty()) {
                            C40789z.f109640a.mo63714d(s0, this.f109660h, max, 2);
                            if (Log.getLogLevel() == 0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("preloadData addToPreload toStrip:");
                                sb4.append(n);
                                sb4.append(" strip:");
                                sb4.append(max);
                                sb4.append("  dispatch:");
                                ArrayList arrayList12 = new ArrayList(C36907w.m41090l(s0, 10));
                                for (C40792d dVar2 : s0) {
                                    arrayList12.add(C40714i.m43955d(dVar2.f109653a));
                                }
                                sb4.append(arrayList12);
                                Log.m105926v("MicroMsg.PreloadLogic", sb4.toString());
                            }
                        }
                    }
                }
            }
            __BATCH_RUN_OBJ.INSTANCE.getBatchJobs().remove(this.f109659g);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$g */
    public static final class C40795g extends C87413o implements C32227p<C40791c, C51944xa, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ List<C40792d> f109661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40795g(List<C40792d> list) {
            super(2);
            this.f109661d = list;
        }

        public Object invoke(Object obj, Object obj2) {
            String str;
            C40791c cVar = (C40791c) obj;
            C51944xa xaVar = (C51944xa) obj2;
            C87412m.m108594g(cVar, "result");
            C87412m.m108594g(xaVar, "response");
            if (cVar.f109648a) {
                C40789z zVar = C40789z.f109640a;
                StringBuilder sb = new StringBuilder();
                sb.append("response.AppMsgContextList size:");
                LinkedList<C48812b6> linkedList = xaVar.f144555d;
                sb.append(linkedList != null ? Integer.valueOf(linkedList.size()) : null);
                Log.m105924i("MicroMsg.PreloadLogic", sb.toString());
                C45902c cVar2 = new C45902c();
                cVar2.f123869d = cVar.f109649b;
                cVar2.f123866a = this.f109661d.size();
                LinkedList<C48812b6> linkedList2 = xaVar.f144555d;
                if (linkedList2 != null) {
                    for (C48812b6 b6Var : linkedList2) {
                        int i = 0;
                        if (!((b6Var == null || (str = b6Var.f130962d) == null || !C45590f.m50653m(str)) ? false : true)) {
                            C40789z zVar2 = C40789z.f109640a;
                            Log.m105920e("MicroMsg.PreloadLogic", "batchSyncAppMsgContext no Url response");
                        } else {
                            C87412m.m108593f(b6Var, LocaleUtil.ITALIAN);
                            C40789z zVar3 = C40789z.f109640a;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("appMsgContext url:");
                            sb4.append(b6Var.f130962d);
                            sb4.append(" content:");
                            String str2 = b6Var.f130963e;
                            if (str2 != null) {
                                i = str2.length();
                            }
                            sb4.append(i);
                            sb4.append(" clientCacheTime:");
                            sb4.append(b6Var.f130964f);
                            sb4.append(" forceUrl:");
                            sb4.append(b6Var.f130965g);
                            sb4.append(" lastModifyTime:");
                            sb4.append(b6Var.f130966h);
                            sb4.append(" noNeedUpdate:");
                            sb4.append(b6Var.f130967i);
                            Log.m105926v("MicroMsg.PreloadLogic", sb4.toString());
                            C40790a aVar = C40789z.f109646g;
                            String str3 = b6Var.f130962d;
                            C87412m.m108593f(str3, "Url");
                            aVar.mo63727c(str3, b6Var);
                            C45834o oVar = C45834o.f123751a;
                            String str4 = b6Var.f130962d;
                            C87412m.m108593f(str4, "Url");
                            if (oVar.mo71303d(str4)) {
                                String str5 = b6Var.f130962d;
                                C87412m.m108593f(str5, "Url");
                                int i2 = b6Var.f130969n;
                                int i3 = b6Var.f130970o;
                                int i4 = b6Var.f130971p;
                                String str6 = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + XVFSFile.SEPARATOR_CHAR;
                                String str7 = HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.f360885fm3) + XVFSFile.SEPARATOR_CHAR;
                                try {
                                    byte[] bytes = String.valueOf(i2).getBytes(C119027c.f356488a);
                                    C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                                    String encodeToString = Base64.encodeToString(bytes, 2);
                                    C87412m.m108593f(encodeToString, "encodeToString(\"$bizUin\"…eArray(), Base64.NO_WRAP)");
                                    str7 = C45590f.m50642b(C45590f.m50642b(C45590f.m50642b(str6, "__biz", encodeToString), "mid", String.valueOf(i3)), "idx", String.valueOf(i4));
                                } catch (Exception unused) {
                                }
                                C40714i.m43970s(str5, str7);
                            }
                            if (!cVar.f109651d) {
                                if (b6Var.f130967i) {
                                    cVar2.f123868c++;
                                    C32355a.m39689a(31);
                                } else {
                                    cVar2.f123867b++;
                                    C32355a.m39689a(32);
                                }
                                cVar2.f123871f += b6Var.computeSize();
                            }
                            C40789z zVar4 = C40789z.f109640a;
                            Log.m105918d("MicroMsg.PreloadLogic", "terry trace: preloaded " + b6Var.f130962d);
                        }
                    }
                }
                cVar2.mo71329a();
            } else {
                C40789z zVar5 = C40789z.f109640a;
                Log.m105928w("MicroMsg.PreloadLogic", "terry trace: preloaded fail");
            }
            if (!cVar.f109651d) {
                C32355a.m39689a(23);
                C32355a.m39690b(908, 26, this.f109661d.size(), true);
                C32355a.m39689a(cVar.f109648a ? 24 : 25);
            }
            return C13598b0.f38549a;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "bundle", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$i */
    public static final class C40796i<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C40796i<InputType, ResultType> f109662d = new C40796i<>();

        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void invoke(java.lang.Object r6, com.tencent.p014mm.ipcinvoker.C1256g r7) {
            /*
                r5 = this;
                android.os.Bundle r6 = (android.os.Bundle) r6
                java.lang.String r7 = "openScene"
                r0 = 10000(0x2710, float:1.4013E-41)
                int r7 = r6.getInt(r7, r0)
                java.lang.String r0 = "netType"
                java.lang.String r1 = "unknown"
                java.lang.String r6 = r6.getString(r0, r1)
                java.lang.String r0 = "netType"
                gy3.C87412m.m108593f(r6, r0)
                xx0.b r0 = xx0.C53458b.f150358a
                java.lang.Class<xx0.b> r0 = xx0.C53458b.class
                monitor-enter(r0)
                android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x006d }
                boolean r1 = com.tencent.p014mm.sdk.platformtools.NetStatusUtil.is2G(r1)     // Catch:{ all -> 0x006d }
                if (r1 == 0) goto L_0x0031
                java.lang.String r6 = "MicroMsg.Preload.TmplInfoManager"
                java.lang.String r7 = "[checkTmpl] not check, because network is 2g"
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r7)     // Catch:{ all -> 0x006d }
                monitor-exit(r0)
                goto L_0x006c
            L_0x0031:
                boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED     // Catch:{ all -> 0x006d }
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x0038
                goto L_0x0048
            L_0x0038:
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()     // Catch:{ all -> 0x006d }
                java.lang.String r4 = "preload_type"
                int r1 = r1.getInt(r4, r3)     // Catch:{ all -> 0x006d }
                r4 = 3
                if (r1 != r4) goto L_0x0048
                r1 = 1
                goto L_0x0049
            L_0x0048:
                r1 = 0
            L_0x0049:
                if (r1 == 0) goto L_0x0055
                java.lang.String r6 = "MicroMsg.Preload.TmplInfoManager"
                java.lang.String r7 = "use local file, ignore"
                com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29770h0.m38873a(r6, r7)     // Catch:{ all -> 0x006d }
                monitor-exit(r0)
                goto L_0x006c
            L_0x0055:
                r1 = -1
                if (r7 != r1) goto L_0x005d
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Long> r1 = xx0.C53458b.f150363f     // Catch:{ all -> 0x006d }
                r1.clear()     // Catch:{ all -> 0x006d }
            L_0x005d:
                java.util.LinkedList r1 = xx0.C53458b.m59914i(r2)     // Catch:{ all -> 0x006d }
                boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x006d }
                r2 = r2 ^ r3
                if (r2 == 0) goto L_0x006b
                xx0.C53458b.m59909a(r1, r7, r6)     // Catch:{ all -> 0x006d }
            L_0x006b:
                monitor-exit(r0)
            L_0x006c:
                return
            L_0x006d:
                r6 = move-exception
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.C40796i.invoke(java.lang.Object, com.tencent.mm.ipcinvoker.g):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$j */
    public static final class C40797j extends C87413o implements C32227p<C40791c, C51944xa, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32228q<WeakReference<Object>, C40791c, C48812b6, C13598b0> f109663d;

        /* renamed from: e */
        public final /* synthetic */ WeakReference<Object> f109664e;

        /* renamed from: f */
        public final /* synthetic */ String f109665f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40797j(C32228q<? super WeakReference<Object>, ? super C40791c, ? super C48812b6, C13598b0> qVar, WeakReference<Object> weakReference, String str) {
            super(2);
            this.f109663d = qVar;
            this.f109664e = weakReference;
            this.f109665f = str;
        }

        public Object invoke(Object obj, Object obj2) {
            C40791c cVar = (C40791c) obj;
            C51944xa xaVar = (C51944xa) obj2;
            C87412m.m108594g(cVar, "result");
            C87412m.m108594g(xaVar, "response");
            if (cVar.f109648a) {
                LinkedList<C48812b6> linkedList = xaVar.f144555d;
                Boolean bool = null;
                if (linkedList != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = linkedList.iterator();
                    while (true) {
                        boolean z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        T next = it.next();
                        C48812b6 b6Var = (C48812b6) next;
                        String str = b6Var != null ? b6Var.f130962d : null;
                        if (!(str == null || str.length() == 0)) {
                            z = false;
                        }
                        if (!z) {
                            arrayList.add(next);
                        }
                    }
                    C48812b6 b6Var2 = arrayList.isEmpty() ^ true ? (C48812b6) arrayList.get(0) : null;
                    if (b6Var2 != null) {
                        String str2 = this.f109665f;
                        C32228q<WeakReference<Object>, C40791c, C48812b6, C13598b0> qVar = this.f109663d;
                        WeakReference<Object> weakReference = this.f109664e;
                        C40789z zVar = C40789z.f109640a;
                        Log.m105925i("MicroMsg.PreloadLogic", "[findAppMsgContext] url:%s", str2);
                        if (!cVar.f109651d) {
                            C40790a aVar = C40789z.f109646g;
                            String str3 = b6Var2.f130962d;
                            C87412m.m108593f(str3, "appMsgContext.Url");
                            aVar.mo63727c(str3, b6Var2);
                            C45902c cVar2 = new C45902c();
                            cVar2.f123869d = cVar.f109649b;
                            cVar2.f123870e = cVar.f109650c;
                            cVar2.f123866a = 1;
                            if (b6Var2.f130967i) {
                                cVar2.f123868c++;
                                C32355a.m39689a(31);
                            } else {
                                cVar2.f123867b++;
                                C32355a.m39689a(32);
                            }
                            cVar2.f123871f += b6Var2.computeSize();
                            cVar2.mo71329a();
                        }
                        qVar.invoke(weakReference, cVar, b6Var2);
                        bool = Boolean.TRUE;
                    }
                }
                if (!C87412m.m108589b(bool, Boolean.TRUE)) {
                    cVar.f109648a = false;
                    this.f109663d.invoke(this.f109664e, cVar, new C48812b6());
                }
            } else {
                this.f109663d.invoke(this.f109664e, cVar, new C48812b6());
            }
            if (!cVar.f109651d) {
                C32355a.m39689a(20);
                C32355a.m39689a(26);
                C32355a.m39689a(cVar.f109648a ? 24 : 25);
            }
            return C13598b0.f38549a;
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo182094d2 = {"Lcom/tencent/mm/ipcinvoker/type/IPCInteger;", "kotlin.jvm.PlatformType", "tmplType", "Lcom/tencent/mm/ipcinvoker/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Lrx3/b0;", "invoke", "(Lcom/tencent/mm/ipcinvoker/type/IPCInteger;Lcom/tencent/mm/ipcinvoker/g;)V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$l */
    public static final class C40799l<InputType, ResultType> implements C80883e {

        /* renamed from: d */
        public static final C40799l<InputType, ResultType> f109666d = new C40799l<>();

        public void invoke(Object obj, C1256g gVar) {
            C39656k.f106417a.mo62221d(((IPCInteger) obj).f10313d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$n */
    public static final class C40800n extends C87413o implements C32226l<Bundle, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C40791c, C51944xa, C13598b0> f109667d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40800n(C32227p<? super C40791c, ? super C51944xa, C13598b0> pVar) {
            super(1);
            this.f109667d = pVar;
        }

        public Object invoke(Object obj) {
            Bundle bundle = (Bundle) obj;
            C87412m.m108594g(bundle, LocaleUtil.ITALIAN);
            C40789z.m44092a(C40789z.f109640a, bundle, this.f109667d);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$o */
    public static final class C40801o<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ C32227p<C40791c, C51944xa, C13598b0> f109668d;

        public C40801o(C32227p<? super C40791c, ? super C51944xa, C13598b0> pVar) {
            this.f109668d = pVar;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            Bundle bundle = (Bundle) obj;
            C40789z zVar = C40789z.f109640a;
            C87412m.m108593f(bundle, "bundle");
            C40789z.m44092a(zVar, bundle, this.f109668d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$p */
    public static final class C40802p implements l0$$e {

        /* renamed from: d */
        public final /* synthetic */ long f109669d;

        /* renamed from: e */
        public final /* synthetic */ long f109670e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<Bundle, C13598b0> f109671f;

        /* renamed from: g */
        public final /* synthetic */ ArrayList<String> f109672g;

        public C40802p(long j, long j2, C32226l<? super Bundle, C13598b0> lVar, ArrayList<String> arrayList) {
            this.f109669d = j;
            this.f109670e = j2;
            this.f109671f = lVar;
            this.f109672g = arrayList;
        }

        /* renamed from: a */
        public final int mo1488a(int i, int i2, String str, C47350c cVar, C117747y yVar) {
            C47465a aVar;
            C40789z zVar = C40789z.f109640a;
            Log.m105925i("MicroMsg.PreloadLogic", "callback, errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            Bundle bundle = new Bundle();
            if (i != 0 || i2 != 0 || (aVar = cVar.f127056b.f127083a) == null || !(aVar instanceof C51944xa)) {
                bundle.putBoolean("success", false);
            } else {
                C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetAppMsgResp");
                C51944xa xaVar = (C51944xa) aVar;
                bundle.putBoolean("success", true);
                bundle.putByteArray("response", xaVar.toByteArray());
                LinkedList<C50885pw3> linkedList = xaVar.f144556e;
                C87412m.m108593f(linkedList, "response.SceneControlList");
                if (!linkedList.isEmpty()) {
                    MultiProcessMMKV g = C40716j0.m43979g();
                    C51023qw3 qw32 = new C51023qw3();
                    qw32.f140590d = xaVar.f144556e;
                    C13598b0 b0Var = C13598b0.f38549a;
                    g.encode("_msg_scene_strip", qw32.toByteArray());
                }
            }
            bundle.putLong(IXWebBroadcastListener.STAGE_START, this.f109669d);
            long currentTimeMillis = System.currentTimeMillis();
            bundle.putLong("end", currentTimeMillis);
            Log.m105926v("MicroMsg.PreloadLogic", "terry performance runCGI #" + this.f109670e + ": " + this.f109669d + ',' + currentTimeMillis);
            this.f109671f.invoke(bundle);
            bundle.putBoolean("mount", true);
            ArrayList<String> arrayList = this.f109672g;
            if (arrayList != null) {
                for (String str2 : arrayList) {
                    C87412m.m108593f(str2, "url");
                    String d = C40714i.m43955d(str2);
                    C40789z zVar2 = C40789z.f109640a;
                    ConcurrentLinkedDeque<C32226l> concurrentLinkedDeque = zVar2.mo63718i().get(d);
                    zVar2.mo63718i().remove(d);
                    if (concurrentLinkedDeque != null) {
                        for (C32226l invoke : concurrentLinkedDeque) {
                            bundle.putString("id", d);
                            invoke.invoke(bundle);
                        }
                    }
                }
            }
            return 0;
        }
    }

    static {
        new AtomicBoolean(false);
        new C40798k();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: te3.b6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m44092a(com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z r11, android.os.Bundle r12, fy3.C32227p r13) {
        /*
            r11.getClass()
            java.lang.String r11 = "success"
            boolean r11 = r12.getBoolean(r11)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$c r10 = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$c
            java.lang.String r0 = "start"
            long r2 = r12.getLong(r0)
            java.lang.String r0 = "end"
            long r4 = r12.getLong(r0)
            java.lang.String r0 = "mount"
            boolean r6 = r12.getBoolean(r0)
            r7 = 0
            r8 = 16
            r9 = 0
            r0 = r10
            r1 = r11
            r0.<init>(r1, r2, r4, r6, r7, r8, r9)
            if (r11 == 0) goto L_0x00ad
            te3.xa r11 = new te3.xa
            r11.<init>()
            java.lang.String r0 = "response"
            byte[] r0 = r12.getByteArray(r0)
            r11.parseFrom(r0)
            boolean r0 = r10.f109651d
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "MicroMsg.PreloadLogic"
            java.lang.String r1 = "cgi mount"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r1)
            java.util.LinkedList<te3.b6> r0 = r11.f144555d
            java.lang.String r1 = ""
            gy3.C87412m.m108593f(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0054:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r2.next()
            r5 = r3
            te3.b6 r5 = (te3.C48812b6) r5
            if (r5 == 0) goto L_0x0066
            java.lang.String r4 = r5.f130962d
        L_0x0066:
            if (r4 == 0) goto L_0x0071
            int r4 = r4.length()
            if (r4 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r4 = 0
            goto L_0x0072
        L_0x0071:
            r4 = 1
        L_0x0072:
            if (r4 != 0) goto L_0x0054
            r1.add(r3)
            goto L_0x0054
        L_0x0078:
            java.util.Iterator r1 = r1.iterator()
        L_0x007c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a1
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.b6 r3 = (te3.C48812b6) r3
            java.lang.String r3 = r3.f130962d
            java.lang.String r5 = "appMsgContext.Url"
            gy3.C87412m.m108593f(r3, r5)
            java.lang.String r3 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43955d(r3)
            java.lang.String r5 = "id"
            java.lang.String r5 = r12.getString(r5)
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 == 0) goto L_0x007c
            r4 = r2
        L_0x00a1:
            te3.b6 r4 = (te3.C48812b6) r4
            r0.clear()
            r0.add(r4)
        L_0x00a9:
            r13.invoke(r10, r11)
            goto L_0x00b5
        L_0x00ad:
            te3.xa r11 = new te3.xa
            r11.<init>()
            r13.invoke(r10, r11)
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.m44092a(com.tencent.mm.plugin.brandservice.ui.timeline.preload.z, android.os.Bundle, fy3.p):void");
    }

    /* renamed from: b */
    public static final void m44093b(String str, int i, int i2, Object... objArr) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(objArr, "params");
        C45984j0 j0Var = new C45984j0(3);
        j0Var.mo71372a(str);
        j0Var.mo71372a(Integer.valueOf(i));
        j0Var.mo71373b(objArr);
        ArrayList c = C64197v.m75534c(j0Var.mo71375d(new Object[j0Var.mo71374c()]));
        String str2 = ArrayList.class.getCanonicalName() + '_' + "addToPreload";
        __BATCH_RUN_OBJ __batch_run_obj = __BATCH_RUN_OBJ.INSTANCE;
        synchronized (__batch_run_obj) {
            C53973z1 z1Var = __batch_run_obj.getBatchJobs().get(str2);
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            HashMap<String, Queue<?>> batchData = __batch_run_obj.getBatchData();
            if (!batchData.containsKey(str2)) {
                batchData.put(str2, new LinkedList());
            }
            Queue<?> queue = batchData.get(str2);
            C87412m.m108592e(queue, "null cannot be cast to non-null type java.util.LinkedList<T of com.tencent.mm.sdk.platformtools.MMBatchRunKt.batchRun$lambda-1$lambda-0>");
            ((LinkedList) queue).add(c);
        }
        __batch_run_obj.getBatchJobs().put(str2, C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C40794f(1000, str2, (C15601d) null, i2), 2, (Object) null));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0168, code lost:
        if ((((h81.C32735h) di3.C86312j.m106911c(r3)).mo58779Qe(r2, 7) & 2) != 0) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m44094e(int r11) {
        /*
            h81.h$c r0 = h81.C32735h.C32737c.clicfg_mpfastload_android_mpprofile
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_sns
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_mpfastload_android_forward
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            r4 = 102(0x66, float:1.43E-43)
            r5 = 0
            if (r11 != r4) goto L_0x000e
            return r5
        L_0x000e:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r6 = f109645f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            boolean r7 = r6.containsKey(r7)
            if (r7 == 0) goto L_0x002c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r6.get(r11)
            gy3.C87412m.m108591d(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x002c:
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r7 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            java.lang.String r8 = "preload_tmpl_test_no_red"
            boolean r7 = r7.getBoolean(r8, r5)
            r8 = 1
            if (r7 != 0) goto L_0x006a
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r7 != 0) goto L_0x0042
            boolean r7 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r7 == 0) goto L_0x006a
        L_0x0042:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r1 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            java.lang.String r2 = "preload_use"
            boolean r1 = r1.getBoolean(r2, r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r6.put(r0, r1)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r6.get(r11)
            gy3.C87412m.m108591d(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            return r11
        L_0x006a:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x0172 }
            r9 = 13
            r10 = 7
            if (r11 == r9) goto L_0x015c
            r9 = 14
            if (r11 == r9) goto L_0x014d
            r9 = 16
            if (r11 == r9) goto L_0x013e
            r9 = 20
            if (r11 == r9) goto L_0x012f
            r9 = 26
            if (r11 == r9) goto L_0x0120
            if (r11 == r4) goto L_0x011e
            r4 = 23
            if (r11 == r4) goto L_0x010f
            r4 = 24
            if (r11 == r4) goto L_0x0100
            switch(r11) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x00e0;
                case 3: goto L_0x00d1;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00b2;
                case 6: goto L_0x00a3;
                case 7: goto L_0x0092;
                default: goto L_0x0090;
            }     // Catch:{ Exception -> 0x0172 }
        L_0x0090:
            goto L_0x011e
        L_0x0092:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_search     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r8)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00a3:
            di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r1 = (h81.C32735h) r1     // Catch:{ Exception -> 0x0172 }
            int r0 = r1.mo58779Qe(r0, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00b2:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_jsapi     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r8)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00c2:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00d1:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r2, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & r8
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00e0:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_chat     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r8)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x00f0:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_biz_timeline     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r8)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x0100:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x010f:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r2, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x011e:
            r8 = 0
            goto L_0x016a
        L_0x0120:
            di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r1 = (h81.C32735h) r1     // Catch:{ Exception -> 0x0172 }
            int r0 = r1.mo58779Qe(r0, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x012f:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            h81.h$c r1 = h81.C32735h.C32737c.clicfg_mpfastload_android_mpprocess     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r8)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x013e:
            di3.d r1 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r1 = (h81.C32735h) r1     // Catch:{ Exception -> 0x0172 }
            int r0 = r1.mo58779Qe(r0, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x014d:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r1, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x011e
            goto L_0x016a
        L_0x015c:
            di3.d r0 = di3.C86312j.m106911c(r3)     // Catch:{ Exception -> 0x0172 }
            h81.h r0 = (h81.C32735h) r0     // Catch:{ Exception -> 0x0172 }
            int r0 = r0.mo58779Qe(r2, r10)     // Catch:{ Exception -> 0x0172 }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x011e
        L_0x016a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ Exception -> 0x0172 }
            r6.put(r7, r0)     // Catch:{ Exception -> 0x0172 }
            goto L_0x0187
        L_0x0172:
            r0 = move-exception
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r2 = f109645f
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.put(r1, r3)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "MicroMsg.PreloadLogic"
            java.lang.String r3 = "canPreloadIn"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r1)
        L_0x0187:
            java.util.HashMap<java.lang.Integer, java.lang.Boolean> r0 = f109645f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            boolean r1 = r0.containsKey(r1)
            if (r1 == 0) goto L_0x01a4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r11 = r0.get(r11)
            gy3.C87412m.m108591d(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r5 = r11.booleanValue()
        L_0x01a4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.m44094e(int):boolean");
    }

    /* renamed from: k */
    public static final void m44095k(int i) {
        boolean z = C29783w.m38875a().getBoolean("preload_webview", true);
        if (!z) {
            Log.m105924i("MicroMsg.UseNewProfile", "//mppagefastopen webview false");
        }
        if (z) {
            String str = (String) ((C36570n) f109642c).getValue();
            C87412m.m108593f(str, "PROCESS_NAME");
            C28947a.m38500a(str, new IPCInteger(i), C40799l.f109666d, (C32226l) null);
        }
    }

    /* renamed from: l */
    public static final void m44096l(String str) {
        C87412m.m108594g(str, "url");
        String str2 = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str2, "PROCESS_MAIN");
        C28947a.m38500a(str2, new IPCString(str), C29786m.f80793d, (C32226l) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x02d9  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x026c  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44097q(android.content.Context r25, java.lang.String r26, int r27, boolean r28, int r29, int r30, android.content.Intent r31, int r32, ex0.C45696d.C7944a r33, boolean r34, int r35, java.lang.Object r36) {
        /*
            r1 = r25
            r0 = r26
            r2 = r27
            r3 = r35
            r4 = r3 & 64
            java.lang.String r5 = "rawUrl"
            if (r4 == 0) goto L_0x0018
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r4.putExtra(r5, r0)
            goto L_0x001a
        L_0x0018:
            r4 = r31
        L_0x001a:
            r6 = r3 & 128(0x80, float:1.794E-43)
            r7 = -1
            if (r6 == 0) goto L_0x0021
            r6 = -1
            goto L_0x0023
        L_0x0021:
            r6 = r32
        L_0x0023:
            r8 = r3 & 256(0x100, float:3.59E-43)
            r9 = 1
            if (r8 == 0) goto L_0x0030
            ex0.d$a r8 = new ex0.d$a
            r8.<init>()
            r8.f26630a = r9
            goto L_0x0032
        L_0x0030:
            r8 = r33
        L_0x0032:
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x0038
            r3 = 1
            goto L_0x003a
        L_0x0038:
            r3 = r34
        L_0x003a:
            java.lang.String r10 = "context"
            gy3.C87412m.m108594g(r1, r10)
            gy3.C87412m.m108594g(r0, r5)
            java.lang.String r10 = "intent"
            gy3.C87412m.m108594g(r4, r10)
            java.lang.String r10 = "result"
            gy3.C87412m.m108594g(r8, r10)
            boolean r10 = z04.C112551y.m153811k(r26)
            r11 = 0
            if (r10 == 0) goto L_0x005c
            r8.f26630a = r11
            java.lang.String r0 = "invalid url"
            r8.f26631b = r0
            goto L_0x046d
        L_0x005c:
            boolean r10 = ea3.C45590f.m50653m(r26)
            if (r10 != 0) goto L_0x006a
            r8.f26630a = r11
            java.lang.String r0 = "invalid host"
            r8.f26631b = r0
            goto L_0x046d
        L_0x006a:
            com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r10 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.SessionOa
            boolean r10 = r10.checkAvailable(r1)
            java.lang.String r12 = "MicroMsg.PreloadLogic"
            if (r10 != 0) goto L_0x0085
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r11] = r0
            java.lang.String r0 = "Block mp rawUrl %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)
            r8.f26630a = r11
            java.lang.String r0 = "mp url currently blocked"
            r8.f26631b = r0
            goto L_0x046d
        L_0x0085:
            if (r2 != r7) goto L_0x0092
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$a r10 = f109646g
            te3.b6 r10 = r10.mo63725a(r0)
            if (r10 == 0) goto L_0x0092
            int r10 = r10.f130973r
            goto L_0x0093
        L_0x0092:
            r10 = r2
        L_0x0093:
            r13 = 16
            if (r10 != r13) goto L_0x00aa
            java.lang.String r13 = "immersiveVideoStyle"
            r4.putExtra(r13, r9)
            java.lang.String r13 = "immersivePageBgIsDark"
            r4.putExtra(r13, r9)
            r13 = 17170444(0x106000c, float:2.4611947E-38)
            java.lang.String r14 = "webview_bg_color_rsID"
            r4.putExtra(r14, r13)
        L_0x00aa:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.z r13 = f109640a
            int r14 = r13.mo63719j(r10)
            if (r14 != r7) goto L_0x00c9
            r8.f26630a = r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invalid itemShowType:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            r8.f26631b = r0
            goto L_0x046d
        L_0x00c9:
            int r15 = com.tencent.p014mm.storage.C19636w0.f55626c
            java.lang.String r9 = "scene"
            java.lang.String r9 = ea3.C45590f.m50646f(r0, r9)
            java.lang.String r11 = "compile(pattern)"
            java.lang.String r16 = "\\d+"
            if (r9 == 0) goto L_0x00ee
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r16)
            gy3.C87412m.m108593f(r7, r11)
            java.util.regex.Matcher r7 = r7.matcher(r9)
            boolean r7 = r7.matches()
            if (r7 == 0) goto L_0x00ee
            int r7 = java.lang.Integer.parseInt(r9)
            goto L_0x00f0
        L_0x00ee:
            r7 = r29
        L_0x00f0:
            java.lang.String r9 = "subscene"
            java.lang.String r9 = ea3.C45590f.m50646f(r0, r9)
            if (r9 == 0) goto L_0x010f
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r16)
            gy3.C87412m.m108593f(r1, r11)
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x010f
            int r1 = java.lang.Integer.parseInt(r9)
            goto L_0x0111
        L_0x010f:
            r1 = r30
        L_0x0111:
            java.lang.String r9 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122318j
            r4.putExtra(r9, r10)
            java.lang.String r9 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122314f
            r4.putExtra(r9, r15)
            java.lang.String r9 = "KOpenArticleSceneFromScene"
            r32 = r3
            r11 = -1
            int r3 = r4.getIntExtra(r9, r11)
            if (r3 != r11) goto L_0x0129
            r4.putExtra(r9, r7)
        L_0x0129:
            java.lang.String r3 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122315g
            r4.putExtra(r3, r1)
            java.lang.String r3 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122319k
            r4.putExtra(r3, r6)
            java.lang.String r3 = "geta8key_scene"
            r9 = 0
            int r3 = r4.getIntExtra(r3, r9)
            te3.yg3 r9 = new te3.yg3
            r9.<init>()
            r9.f145278d = r15
            r9.f145279e = r0
            r9.f145280f = r10
            r9.f145281g = r14
            r9.f145282h = r7
            r9.f145283i = r1
            r9.f145284j = r3
            if (r10 == r2) goto L_0x0151
            r0 = 1
            goto L_0x0152
        L_0x0151:
            r0 = 0
        L_0x0152:
            r9.f145291t = r0
            te3.ah4 r1 = xx0.C53458b.m59912d(r14)
            r2 = 2
            if (r1 != 0) goto L_0x0188
            int r0 = r9.f145280f
            if (r0 == 0) goto L_0x0162
            r3 = -1
            if (r0 != r3) goto L_0x0188
        L_0x0162:
            java.lang.String r0 = "tmplParams is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
            r1 = 0
            r8.f26630a = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "not support tmplType="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ".tmplType"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.f26631b = r0
            r0 = 0
            r14 = r25
            goto L_0x02d6
        L_0x0188:
            com.tencent.mm.hardcoder.WXHardCoderJNI r14 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r15 = r0.getHcBizEnable()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r16 = r0.getHcBizDelay()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r17 = r0.getHcBizCPU()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r18 = r0.getHcBizIO()
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            boolean r0 = r0.getHcBizThr()
            if (r0 == 0) goto L_0x01bd
            int r0 = android.os.Process.myTid()
            r19 = r0
            goto L_0x01bf
        L_0x01bd:
            r19 = 0
        L_0x01bf:
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            int r20 = r0.getHcBizTimeout()
            r21 = 902(0x386, float:1.264E-42)
            com.tencent.mm.hardcoder.WXHardCoderJNI r0 = com.tencent.p014mm.hardcoder.C40318k.m43492a()
            long r22 = r0.getHcBizAction()
            java.lang.String r24 = "MicroMsg.PreloadLogic"
            int r0 = r14.startPerformance(r15, r16, r17, r18, r19, r20, r21, r22, r24)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r10 = "summer hardcoder biz startPerformance %s,%s, tmplParams null:"
            r3.append(r10)
            if (r1 != 0) goto L_0x01e6
            r10 = 1
            goto L_0x01e7
        L_0x01e6:
            r10 = 0
        L_0x01e7:
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r11 = 902(0x386, float:1.264E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14 = 0
            r10[r14] = r11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11 = 1
            r10[r11] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r3, r10)
            java.lang.String r0 = "session.url"
            java.lang.String r3 = "screen_orientation"
            r10 = 0
            if (r1 != 0) goto L_0x022c
            java.lang.String r8 = "startPreloadWebView tmplParams is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            java.lang.String r8 = r9.f145279e
            gy3.C87412m.m108593f(r8, r0)
            java.lang.String r0 = r13.mo63713c(r8, r4)
            java.lang.String r0 = ea3.C45590f.m50641a(r0, r9)
            r4.putExtra(r5, r0)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122321m
            r11 = 1
            r4.putExtra(r0, r11)
            r14 = r25
            goto L_0x035f
        L_0x022c:
            r11 = 1
            java.lang.String r14 = r1.f130541i
            r9.f145285n = r14
            int r14 = r1.f130544o
            r15 = 104(0x68, float:1.46E-43)
            g93.C32355a.m39690b(r14, r15, r11, r11)
            java.lang.String r11 = r9.f145279e
            gy3.C87412m.m108593f(r11, r0)
            int r14 = r9.f145281g
            boolean r15 = z04.C112551y.m153811k(r11)
            if (r15 == 0) goto L_0x024b
            java.lang.String r11 = "[findAppMsgContextInCache] url is null, return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r11)
            goto L_0x0258
        L_0x024b:
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$a r15 = f109646g
            boolean r14 = r15.mo63726b(r11, r14)
            if (r14 == 0) goto L_0x0258
            te3.b6 r11 = r15.mo63725a(r11)
            goto L_0x0259
        L_0x0258:
            r11 = r10
        L_0x0259:
            if (r11 == 0) goto L_0x0269
            java.lang.String r14 = r11.f130965g
            if (r14 == 0) goto L_0x0269
            boolean r14 = z04.C112551y.m153811k(r14)
            r15 = 1
            r14 = r14 ^ r15
            if (r14 != r15) goto L_0x0269
            r14 = 1
            goto L_0x026a
        L_0x0269:
            r14 = 0
        L_0x026a:
            if (r14 == 0) goto L_0x02d9
            boolean r0 = r11.f130974s
            if (r0 != 0) goto L_0x027c
            int r0 = r9.f145280f
            if (r0 != 0) goto L_0x0275
            goto L_0x027c
        L_0x0275:
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122321m
            r14 = 1
            r4.putExtra(r0, r14)
            goto L_0x0282
        L_0x027c:
            r14 = 1
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
        L_0x0282:
            java.lang.String r0 = r11.f130965g
            java.lang.String r11 = "appMsgContext.ForceUrl"
            gy3.C87412m.m108593f(r0, r11)
            java.lang.String r0 = ea3.C45590f.m50641a(r0, r9)
            java.lang.String r0 = r13.mo63713c(r0, r4)
            java.lang.Object[] r11 = new java.lang.Object[r14]
            r13 = 0
            r11[r13] = r0
            java.lang.String r13 = "appMsgContext forceUrl:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
            r4.putExtra(r5, r0)
            if (r32 == 0) goto L_0x02b6
            int r5 = r9.f145280f
            boolean r5 = com.tencent.p014mm.message.C68065f.m80397f(r5)
            if (r5 == 0) goto L_0x02ab
            r4.putExtra(r3, r14)
        L_0x02ab:
            java.lang.String r3 = "webview"
            java.lang.String r5 = ".ui.tools.WebViewUI"
            r14 = r25
            ke3.C88144b.m109791i(r14, r3, r5, r4, r10)
            goto L_0x02b8
        L_0x02b6:
            r14 = r25
        L_0x02b8:
            int r1 = r1.f130544o
            r3 = 107(0x6b, float:1.5E-43)
            r4 = 1
            g93.C32355a.m39690b(r1, r3, r4, r4)
            r8.f26630a = r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "has forceUrl="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.f26631b = r0
            r0 = 1
        L_0x02d6:
            r9 = r0
            goto L_0x0435
        L_0x02d9:
            r14 = r25
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "startPreloadWebView with fastLoad itemShowType="
            r8.append(r15)
            int r15 = r9.f145280f
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r8)
            java.lang.String r8 = r9.f145279e
            gy3.C87412m.m108593f(r8, r0)
            java.lang.String r8 = ea3.C45590f.m50641a(r8, r9)
            java.lang.String r8 = r13.mo63713c(r8, r4)
            r9.f145279e = r8
            r4.putExtra(r5, r8)
            r5 = 1
            r9.f145286o = r5
            int r5 = r1.f130536d
            te3.zg4 r5 = xx0.C53458b.m59913g(r5)
            boolean r8 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43983k(r5)
            r9.f145288q = r8
            java.lang.String r8 = xx0.C53458b.f150360c
            java.lang.String r15 = "PREFIX"
            gy3.C87412m.m108593f(r8, r15)
            java.lang.String r15 = "mptmpl://"
            boolean r8 = gy3.C87412m.m108589b(r8, r15)
            boolean r15 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43983k(r5)
            if (r15 == 0) goto L_0x032a
            if (r8 == 0) goto L_0x032a
            r15 = 1
            goto L_0x032b
        L_0x032a:
            r15 = 0
        L_0x032b:
            r9.f145289r = r15
            boolean r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40716j0.m43983k(r5)
            if (r5 == 0) goto L_0x0337
            if (r8 != 0) goto L_0x0337
            r5 = 1
            goto L_0x0338
        L_0x0337:
            r5 = 0
        L_0x0338:
            r9.f145290s = r5
            if (r11 == 0) goto L_0x0355
            boolean r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40712g0.m43951a(r11)
            if (r5 == 0) goto L_0x0355
            r5 = 1
            r9.f145287p = r5
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i.m43956e(r11)
            r8 = 0
            r0[r8] = r5
            java.lang.String r5 = "set contentId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r5, r0)
            goto L_0x035f
        L_0x0355:
            java.lang.String r5 = r9.f145279e
            gy3.C87412m.m108593f(r5, r0)
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.c0 r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40704c0.f109352d
            r13.mo63717h(r14, r5, r9, r0)
        L_0x035f:
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122311c
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r5 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C29783w.m38875a()
            java.lang.String r8 = "preload_webview"
            r11 = 1
            boolean r5 = r5.getBoolean(r8, r11)
            if (r5 != 0) goto L_0x0376
            java.lang.String r8 = "MicroMsg.UseNewProfile"
            java.lang.String r11 = "//mppagefastopen webview false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r11)
        L_0x0376:
            r4.putExtra(r0, r5)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122312d
            r27 = r3
            long r2 = java.lang.System.currentTimeMillis()
            r4.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122313e
            java.lang.String r2 = r9.f145279e
            r4.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122310b
            if (r1 == 0) goto L_0x0394
            byte[] r2 = r1.toByteArray()
            goto L_0x0395
        L_0x0394:
            r2 = r10
        L_0x0395:
            r4.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122320l
            byte[] r2 = r9.toByteArray()
            r4.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122317i
            int r2 = android.os.Process.myPid()
            r4.putExtra(r0, r2)
            java.lang.String r0 = com.tencent.p014mm.p136ui.C74928u.C45093i.f122316h     // Catch:{ Exception -> 0x042a }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.e0 r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40708e0.f109355d     // Catch:{ Exception -> 0x042a }
            boolean r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40744p.m44016b(r14, r2)     // Catch:{ Exception -> 0x042a }
            r4.putExtra(r0, r2)     // Catch:{ Exception -> 0x042a }
            if (r32 == 0) goto L_0x0408
            boolean r0 = r9.f145287p     // Catch:{ Exception -> 0x042a }
            if (r0 == 0) goto L_0x03ea
            rx3.g r0 = f109642c     // Catch:{ all -> 0x03d0 }
            rx3.n r0 = (rx3.C36570n) r0     // Catch:{ all -> 0x03d0 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x03d0 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03d0 }
            java.lang.String r2 = "PROCESS_NAME"
            gy3.C87412m.m108593f(r0, r2)     // Catch:{ all -> 0x03d0 }
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.f0<InputType, ResultType> r2 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40710f0.f109356d     // Catch:{ all -> 0x03d0 }
            com.tencent.p014mm.ipcinvoker.C28947a.m38500a(r0, r4, r2, r10)     // Catch:{ all -> 0x03d0 }
            goto L_0x03ea
        L_0x03d0:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x042a }
            r2.<init>()     // Catch:{ Exception -> 0x042a }
            java.lang.String r3 = "updateWebview ex "
            r2.append(r3)     // Catch:{ Exception -> 0x042a }
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x042a }
            r2.append(r0)     // Catch:{ Exception -> 0x042a }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x042a }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)     // Catch:{ Exception -> 0x042a }
        L_0x03ea:
            boolean r0 = com.tencent.p014mm.pluginsdk.model.C44594n1.m49046b()     // Catch:{ Exception -> 0x042a }
            if (r0 == 0) goto L_0x03f3
            java.lang.String r0 = ".ui.timeline.preload.ui.TmplWebViewMMUI"
            goto L_0x03f5
        L_0x03f3:
            java.lang.String r0 = ".ui.timeline.preload.ui.TmplWebViewToolUI"
        L_0x03f5:
            java.lang.String r2 = "brandservice"
            int r3 = r9.f145280f     // Catch:{ Exception -> 0x042a }
            boolean r3 = com.tencent.p014mm.message.C68065f.m80397f(r3)     // Catch:{ Exception -> 0x042a }
            if (r3 == 0) goto L_0x0405
            r3 = r27
            r5 = 1
            r4.putExtra(r3, r5)     // Catch:{ Exception -> 0x042a }
        L_0x0405:
            ke3.C88144b.m109791i(r14, r2, r0, r4, r10)     // Catch:{ Exception -> 0x042a }
        L_0x0408:
            if (r1 == 0) goto L_0x0428
            int r0 = r1.f130544o     // Catch:{ Exception -> 0x042a }
            r2 = 106(0x6a, float:1.49E-43)
            r3 = 1
            g93.C32355a.m39690b(r0, r2, r3, r3)     // Catch:{ Exception -> 0x042a }
            r0 = 100
            g93.C32355a.m39691c(r0)     // Catch:{ Exception -> 0x042a }
            boolean r0 = r9.f145288q     // Catch:{ Exception -> 0x042a }
            if (r0 == 0) goto L_0x0428
            int r0 = r1.f130544o     // Catch:{ Exception -> 0x042a }
            r1 = 231(0xe7, float:3.24E-43)
            r2 = 1
            g93.C32355a.m39690b(r0, r1, r2, r2)     // Catch:{ Exception -> 0x042a }
            r0 = 110(0x6e, float:1.54E-43)
            g93.C32355a.m39691c(r0)     // Catch:{ Exception -> 0x042a }
        L_0x0428:
            r9 = 1
            goto L_0x0435
        L_0x042a:
            r0 = move-exception
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = "startPreloadWebView"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r1, r2)
            r9 = 0
        L_0x0435:
            if (r9 == 0) goto L_0x046c
            r1 = -1
            if (r6 == r1) goto L_0x044d
            boolean r0 = r14 instanceof com.tencent.p014mm.p136ui.MMActivity
            if (r0 == 0) goto L_0x044d
            r2 = 1
            if (r6 != r2) goto L_0x044d
            r0 = r14
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.p014mm.p136ui.MMActivity) r0
            r2 = 2130772149(0x7f0100b5, float:1.7147408E38)
            r3 = 2130772148(0x7f0100b4, float:1.7147406E38)
            r0.overridePendingTransition(r2, r3)
        L_0x044d:
            r0 = 974(0x3ce, float:1.365E-42)
            r2 = 1
            if (r7 == 0) goto L_0x0466
            if (r7 == r2) goto L_0x0463
            r3 = 2
            if (r7 == r3) goto L_0x0460
            r3 = 90
            r1 = 0
            if (r7 == r3) goto L_0x045e
            r7 = -1
            goto L_0x0469
        L_0x045e:
            r7 = 1
            goto L_0x0469
        L_0x0460:
            r1 = 0
            r7 = 0
            goto L_0x0469
        L_0x0463:
            r7 = 3
            r1 = 0
            goto L_0x0469
        L_0x0466:
            r3 = 2
            r1 = 0
            r7 = 2
        L_0x0469:
            g93.C32355a.m39690b(r0, r7, r2, r1)
        L_0x046c:
            r11 = r9
        L_0x046d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z.m44097q(android.content.Context, java.lang.String, int, boolean, int, int, android.content.Intent, int, ex0.d$a, boolean, int, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final String mo63713c(String str, Intent intent) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / ((long) 1000));
        intent.putExtra("bizEnterId", currentTimeMillis);
        String b = !C112550d0.m153803w(str, "clicktime", false, 2, (Object) null) ? C45590f.m50642b(str, "clicktime", String.valueOf(currentTimeMillis)) : str;
        return !C112550d0.m153803w(str, "enterid", false, 2, (Object) null) ? C45590f.m50642b(b, "enterid", String.valueOf(currentTimeMillis)) : b;
    }

    /* renamed from: d */
    public final void mo63714d(List<C40792d> list, int i, int i2, int i3) {
        boolean z = C29783w.m38875a().getBoolean("preload_data", true);
        if (!z) {
            Log.m105924i("MicroMsg.UseNewProfile", "//mppagefastopen data false");
        }
        if (z) {
            mo63720m(list, i, i2, i3, new C40795g(list));
        }
    }

    /* renamed from: f */
    public final boolean mo63715f(C48812b6 b6Var, int i) {
        LinkedList<zg4> linkedList;
        zg4 g = C53458b.m59913g(i);
        String str = b6Var.f130965g;
        if (!(str == null || C112551y.m153811k(str))) {
            return true;
        }
        if (!C40716j0.m43982j(g) || (linkedList = b6Var.f130975t) == null) {
            return false;
        }
        for (zg4 zg4 : linkedList) {
            Log.m105926v("MicroMsg.PreloadLogic", "checkDataVerVaild: " + zg4.f145937d + ' ' + g.f145937d + ' ' + zg4.f145947q + ' ' + g.f145947q);
            if (zg4.f145937d == g.f145937d && C87412m.m108589b(zg4.f145947q, g.f145947q)) {
                Log.m105926v("MicroMsg.PreloadLogic", "checkDataVerVaild: " + zg4.f145938e + " tmplInfo:" + g.f145938e);
                return zg4.f145938e >= g.f145938e;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void mo63716g(int i, String str) {
        C87412m.m108594g(str, DownloadInfo.NETTYPE);
        String str2 = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str2, "PROCESS_MAIN");
        Bundle bundle = new Bundle();
        bundle.putInt("openScene", i);
        bundle.putString(DownloadInfo.NETTYPE, str);
        C28947a.m38500a(str2, bundle, C40796i.f109662d, (C32226l) null);
    }

    /* renamed from: h */
    public final void mo63717h(Object obj, String str, C52115yg3 yg32, C32228q<? super WeakReference<Object>, ? super C40791c, ? super C48812b6, C13598b0> qVar) {
        C87412m.m108594g(obj, "context");
        C87412m.m108594g(str, "url");
        C87412m.m108594g(yg32, "session");
        C87412m.m108594g(qVar, "callback");
        WeakReference weakReference = new WeakReference(obj);
        C40791c cVar = new C40791c(false, System.currentTimeMillis(), System.currentTimeMillis(), false, false, 16, (C8480h) null);
        boolean z = false;
        boolean z2 = C29783w.m38875a().getBoolean("preload_data_null", false);
        if (!z2) {
            Log.m105924i("MicroMsg.UseNewProfile", "//mppagefastopen data null");
        }
        if (z2) {
            cVar.f109648a = true;
            C13598b0 b0Var = C13598b0.f38549a;
            qVar.invoke(weakReference, cVar, new C48812b6());
        } else if (C112551y.m153811k(str) || !C45590f.m50653m(str)) {
            qVar.invoke(weakReference, cVar, new C48812b6());
        } else {
            int i = yg32.f145281g;
            C48812b6 b6Var = null;
            if (C112551y.m153811k(str)) {
                Log.m105920e("MicroMsg.PreloadLogic", "[findAppMsgContextInCache] url is null, return");
            } else {
                C40790a aVar = f109646g;
                if (aVar.mo63726b(str, i)) {
                    b6Var = aVar.mo63725a(str);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("getAppMsgContext scene = ");
            sb.append(yg32.f145282h);
            sb.append(' ');
            if (b6Var == null) {
                z = true;
            }
            sb.append(z);
            Log.m105918d("MicroMsg.PreloadLogic", sb.toString());
            if (b6Var != null) {
                cVar.f109648a = true;
                cVar.f109652e = true;
                C13598b0 b0Var2 = C13598b0.f38549a;
                qVar.invoke(weakReference, cVar, b6Var);
                return;
            }
            String a = C45590f.m50641a(str, yg32);
            LinkedList linkedList = new LinkedList();
            linkedList.add(new C40792d(a, yg32.f145281g));
            mo63720m(linkedList, yg32.f145282h, 0, 0, new C40797j(qVar, weakReference, a));
        }
    }

    /* renamed from: i */
    public final ConcurrentHashMap<String, ConcurrentLinkedDeque<C32226l<Bundle, C13598b0>>> mo63718i() {
        return (ConcurrentHashMap) ((C36570n) f109647h).getValue();
    }

    /* renamed from: j */
    public final int mo63719j(int i) {
        if (i == 0) {
            return m44094e(102) ? 5 : 0;
        }
        if (i == 5 || i == 8 || i == 10 || i == 16 || i == 17) {
            return m44094e(102) ? 5 : 4;
        }
        return -1;
    }

    /* renamed from: m */
    public final void mo63720m(List<C40792d> list, int i, int i2, int i3, C32227p<? super C40791c, ? super C51944xa, C13598b0> pVar) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (C40792d dVar : list) {
            arrayList.add(dVar.f109653a);
        }
        bundle.putStringArrayList("urls", new ArrayList(arrayList));
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(list, 10));
        for (C40792d dVar2 : list) {
            arrayList2.add(Integer.valueOf(dVar2.f109654b));
        }
        bundle.putIntegerArrayList("tmplTypes", new ArrayList(arrayList2));
        bundle.putInt("openScene", i);
        bundle.putInt("strip", i2);
        bundle.putInt("stripType", i3);
        if (C86709a0.m107531m().mo58407a().mo71804b()) {
            mo63721n(bundle, new C40800n(pVar));
        } else {
            C80907o.m98781d(WeChatProcess.PROCESS_MAIN, bundle, C29784b.class, new C40801o(pVar));
        }
    }

    /* renamed from: n */
    public final void mo63721n(Bundle bundle, C32226l<? super Bundle, C13598b0> lVar) {
        int i;
        ArrayList<Integer> arrayList;
        Bundle bundle2 = bundle;
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis() % ((long) 100);
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("urls");
        int i2 = 0;
        if (stringArrayList != null && stringArrayList.size() == 1) {
            String str = stringArrayList.get(0);
            C87412m.m108593f(str, "urls[0]");
            String d = C40714i.m43955d(str);
            if (mo63718i().containsKey(d)) {
                ConcurrentLinkedDeque concurrentLinkedDeque = mo63718i().get(d);
                if (concurrentLinkedDeque != null) {
                    concurrentLinkedDeque.add(lVar);
                }
                Log.m105926v("MicroMsg.PreloadLogic", "terry trace cgi mounted:" + d + '#' + currentTimeMillis2);
                return;
            }
        }
        C32226l<? super Bundle, C13598b0> lVar2 = lVar;
        ArrayList<Integer> integerArrayList = bundle2.getIntegerArrayList("tmplTypes");
        int i3 = bundle2.getInt("openScene");
        int i4 = bundle2.getInt("strip", 0);
        int i5 = bundle2.getInt("stripType", 0);
        LinkedList<C40792d> linkedList = new LinkedList<>();
        if (stringArrayList != null) {
            int size = stringArrayList.size();
            while (i2 < size) {
                CharSequence charSequence = stringArrayList.get(i2);
                if (!(charSequence == null || charSequence.length() == 0)) {
                    String str2 = stringArrayList.get(i2);
                    C87412m.m108593f(str2, "urls[i]");
                    C87412m.m108591d(integerArrayList);
                    i = size;
                    Integer num = integerArrayList.get(i2);
                    arrayList = integerArrayList;
                    C87412m.m108593f(num, "tmplTypes!![i]");
                    linkedList.add(new C40792d(str2, num.intValue()));
                    String str3 = stringArrayList.get(i2);
                    C87412m.m108593f(str3, "urls[i]");
                    String d2 = C40714i.m43955d(str3);
                    mo63718i().put(d2, new ConcurrentLinkedDeque());
                    Log.m105926v("MicroMsg.PreloadLogic", "terry trace cgi send:" + d2 + '#' + currentTimeMillis2);
                } else {
                    arrayList = integerArrayList;
                    i = size;
                }
                i2++;
                size = i;
                C32226l<? super Bundle, C13598b0> lVar3 = lVar;
                integerArrayList = arrayList;
            }
        }
        C51805wa waVar = new C51805wa();
        waVar.f143940f = C44545a.f120794a.mo69323a();
        waVar.f143941g = ((Number) ((C36570n) C40716j0.f109362a).getValue()).longValue();
        waVar.f143939e = new LinkedList<>();
        waVar.f143942h = i4;
        waVar.f143943i = i5;
        waVar.f143944j = C53458b.m59914i(true);
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
        for (C40792d dVar : linkedList) {
            String str4 = dVar.f109653a;
            int i6 = dVar.f109654b;
            C50036jt3 jt32 = new C50036jt3();
            jt32.f136326d = str4;
            jt32.f136327e = 0;
            jt32.f136328f = i3;
            C48812b6 a = f109646g.mo63725a(str4);
            if (a != null) {
                jt32.f136327e = a.f130966h;
                if (!f109640a.mo63715f(a, i6)) {
                    jt32.f136327e = 0;
                }
            }
            arrayList2.add(jt32);
        }
        waVar.f143939e.addAll(arrayList2);
        Log.m105925i("MicroMsg.PreloadLogic", "[batchSyncAppMsgContext]urlList ReqInfoList:%d openScene=" + i3, Integer.valueOf(waVar.f143939e.size()));
        Log.m105919d("MicroMsg.PreloadLogic", "[batchSyncAppMsgContext]urlList:%s", linkedList);
        LinkedList<C49336ev> linkedList2 = waVar.f143944j;
        C87412m.m108593f(linkedList2, "batchGetAppMsgReq.TypeInfoList");
        for (C49336ev evVar : linkedList2) {
            Log.m105927v("MicroMsg.PreloadLogic", "[batchSyncAppMsgContext] typeInfo: type: %s, uids: %s, uidInUse: %s, controlFlag: %s", Integer.valueOf(evVar.f133128d), evVar.f133129e, evVar.f133130f, Long.valueOf(evVar.f133131g));
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2594;
        bVar.f127068c = "/cgi-bin/mmbiz-bin/batchgetappmsg";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127066a = waVar;
        bVar.f127067b = new C51944xa();
        C32355a.m39690b(908, (i3 == 0 || i3 != 90) ? 35 : 34, waVar.f143939e.size(), true);
        C89144l0.m111429e(bVar.mo72403a(), new C40802p(currentTimeMillis, currentTimeMillis2, lVar, stringArrayList), true);
    }

    /* renamed from: o */
    public final void mo63722o(int i) {
        Log.m105924i("MicroMsg.PreloadLogic", "start in preCreate");
        mo63716g(i, C44545a.f120794a.mo69323a());
        m44095k(-1);
        String str = WeChatProcess.PROCESS_MAIN;
        C87412m.m108593f(str, "PROCESS_MAIN");
        C28947a.m38500a(str, null, C29769b0.f80779d, (C32226l) null);
        f109646g.getClass();
        f109643d.verifyAllSlot();
        Log.m105924i("MicroMsg.PreloadLogic", "clear() isOk:true");
        C53458b bVar = C53458b.f150358a;
        ((C119157j) C119157j.f356862d).mo183876g(C53461c.f150374d, "tmplPreload");
    }

    /* renamed from: p */
    public final <T extends List<? extends C>, C> C mo63723p(T t, int i, C c) {
        return t.size() > i ? t.get(i) : c;
    }

    /* renamed from: r */
    public final int mo63724r(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 13;
        }
        if (i == 2) {
            return 14;
        }
        if (i != 92) {
            return i != 126 ? 0 : 6;
        }
        return 2;
    }

    /* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.preload.z$k */
    public static final class C40798k extends HashMap<Integer, String> {
        public C40798k() {
            put(1, "100463");
            put(3, "100486");
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof Integer)) {
                return false;
            }
            return super.containsKey((Integer) obj);
        }

        public final /* bridge */ boolean containsValue(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            return super.containsValue((String) obj);
        }

        public final /* bridge */ Set<Map.Entry<Integer, String>> entrySet() {
            return super.entrySet();
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return (String) super.get((Integer) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Integer) ? obj2 : (String) super.getOrDefault((Integer) obj, (String) obj2);
        }

        public final /* bridge */ Set<Integer> keySet() {
            return super.keySet();
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof Integer)) {
                return null;
            }
            return (String) super.remove((Integer) obj);
        }

        public final /* bridge */ int size() {
            return super.size();
        }

        public final /* bridge */ Collection<String> values() {
            return super.values();
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Integer) && (obj2 instanceof String)) {
                return super.remove((Integer) obj, (String) obj2);
            }
            return false;
        }
    }
}
