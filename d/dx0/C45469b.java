package dx0;

import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import ad0.C91997p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.camera.core.FocusMeteringAction;
import ay0.C39656k;
import ba3.C39750a;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.message.C92721n;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.biz.C55579f;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.BizTLRecCardJsEngine;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item.C18355t;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40707d0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40714i;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40780x0;
import com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.C40789z;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44079o;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C44080p;
import com.tencent.p014mm.plugin.webview.p128ui.tools.media.C96674u;
import com.tencent.p014mm.pluginsdk.model.C19428d;
import com.tencent.p014mm.pluginsdk.model.C44545a;
import com.tencent.p014mm.pluginsdk.model.C44591c;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMCacheSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMKVSlotManager;
import com.tencent.p014mm.sdk.platformtools.MMSlotKt;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19623o0;
import com.tencent.p014mm.storage.C19627t;
import com.tencent.p014mm.storage.C19636w0;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import ea3.C45590f;
import eb0.C20583z;
import eb0.C75592q0;
import ex0.C20642c;
import ex0.C45695b;
import ex0.C45696d;
import f40.C86709a0;
import fx0.C45821d;
import fx0.C45825h;
import fx0.C45834o;
import fx0.C45838p;
import fy0.C20734b;
import fy3.C32224a;
import fy3.C32226l;
import gw0.C76073b;
import gy3.C87412m;
import gy3.C87413o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ke3.C88144b;
import org.json.JSONObject;
import p166hy.C60228r0;
import p206nj.C117627q;
import p274xx.C15907f;
import px0.C22058r;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import s00.C90110f;
import s90.C48298d;
import s90.C48299e;
import s90.C77630j;
import sx3.C110818d0;
import sx3.C36907w;
import sx3.C64175a0;
import te3.C118459qf;
import te3.C49399fa;
import te3.C50637o6;
import te3.C64273c21;
import um0.C22657f;
import wx3.C15601d;
import xx0.C53458b;
import z04.C112551y;
import zt3.C119157j;

/* renamed from: dx0.b */
public final class C45469b implements C45696d {

    /* renamed from: j */
    public static final MMCacheSlotManager f123066j = new MMCacheSlotManager();

    /* renamed from: n */
    public static final MMCacheSlotManager f123067n = new MMCacheSlotManager();

    /* renamed from: o */
    public static final MMKVSlotManager f123068o = new MMKVSlotManager(C40780x0.m44078a(), 60);

    /* renamed from: d */
    public final C13601g f123069d = C36568h.m40985a(new C45475g(this));

    /* renamed from: e */
    public final ConcurrentHashMap<String, Long> f123070e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public int f123071f = -1;

    /* renamed from: g */
    public int f123072g = -1;

    /* renamed from: h */
    public final long f123073h = 15000;

    /* renamed from: i */
    public final C13601g f123074i = C36568h.m40985a(C31333f.f83872d);

    /* renamed from: dx0.b$f */
    public static final class C31333f extends C87413o implements C32224a<MMHandler> {

        /* renamed from: d */
        public static final C31333f f83872d = new C31333f();

        public C31333f() {
            super(0);
        }

        public Object invoke() {
            return new MMHandler("WebCanvasPreload");
        }
    }

    /* renamed from: dx0.b$a */
    public static final class C45470a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f123075d;

        /* renamed from: e */
        public final /* synthetic */ int f123076e;

        /* renamed from: f */
        public final /* synthetic */ int f123077f;

        /* renamed from: g */
        public final /* synthetic */ Object[] f123078g;

        /* renamed from: h */
        public final /* synthetic */ C45469b f123079h;

        public C45470a(String str, int i, int i2, Object[] objArr, C45469b bVar) {
            this.f123075d = str;
            this.f123076e = i;
            this.f123077f = i2;
            this.f123078g = objArr;
            this.f123079h = bVar;
        }

        public final void run() {
            try {
                String str = this.f123075d;
                int i = this.f123076e;
                int i2 = this.f123077f;
                Object[] objArr = this.f123078g;
                C40789z.m44093b(str, i, i2, Arrays.copyOf(objArr, objArr.length));
            } catch (Exception e) {
                String unused = this.f123079h.getClass();
                Log.m105929w("MicroMsg.BrandServiceImpl", "addToPreload ex %s", e.getMessage());
            }
        }
    }

    /* renamed from: dx0.b$b */
    public static final class C45471b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ String f123080d;

        /* renamed from: e */
        public final /* synthetic */ String f123081e;

        /* renamed from: f */
        public final /* synthetic */ String f123082f;

        /* renamed from: g */
        public final /* synthetic */ String f123083g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45471b(String str, String str2, String str3, String str4) {
            super(0);
            this.f123080d = str;
            this.f123081e = str2;
            this.f123082f = str3;
            this.f123083g = str4;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
            if ((r2 == null || z04.C112551y.m153811k(r2)) != false) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r9 = this;
                com.tencent.mm.plugin.brandservice.ui.timeline.preload.WebPrefetcherManifest r0 = com.tencent.p014mm.plugin.brandservice.p028ui.timeline.preload.WebPrefetcherManifest.f109312a
                java.lang.String r1 = r9.f123080d
                java.lang.String r2 = r9.f123081e
                java.lang.String r3 = r9.f123082f
                java.lang.String r4 = r9.f123083g
                java.lang.String r5 = "event"
                gy3.C87412m.m108594g(r3, r5)
                t73.d r0 = r0.mo63594f()
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0020
                boolean r7 = z04.C112551y.m153811k(r1)
                if (r7 == 0) goto L_0x001e
                goto L_0x0020
            L_0x001e:
                r7 = 0
                goto L_0x0021
            L_0x0020:
                r7 = 1
            L_0x0021:
                if (r7 == 0) goto L_0x0033
                if (r2 == 0) goto L_0x002e
                boolean r7 = z04.C112551y.m153811k(r2)
                if (r7 == 0) goto L_0x002c
                goto L_0x002e
            L_0x002c:
                r7 = 0
                goto L_0x002f
            L_0x002e:
                r7 = 1
            L_0x002f:
                if (r7 == 0) goto L_0x0033
                goto L_0x00aa
            L_0x0033:
                java.util.concurrent.ConcurrentLinkedDeque<t73.o> r7 = r0.f129909C
                java.util.Iterator r7 = r7.iterator()
            L_0x0039:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x004c
                java.lang.Object r8 = r7.next()
                t73.o r8 = (t73.C48571o) r8
                boolean r8 = r8.mo63601b(r1, r2, r3, r4)
                if (r8 == 0) goto L_0x0039
                goto L_0x00aa
            L_0x004c:
                if (r1 == 0) goto L_0x0056
                boolean r2 = z04.C112551y.m153811k(r1)
                if (r2 == 0) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r5 = 0
            L_0x0056:
                if (r5 != 0) goto L_0x00aa
                t73.k r2 = new t73.k
                r2.<init>(r4, r0, r3)
                java.lang.String r3 = "appId"
                gy3.C87412m.m108594g(r1, r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "_prefetcher_"
                r3.append(r4)
                r3.append(r1)
                java.lang.String r3 = r3.toString()
                java.util.HashMap<java.lang.String, java.lang.Integer> r4 = r0.f129913G
                boolean r4 = r4.containsKey(r3)
                if (r4 == 0) goto L_0x007f
                r2.invoke(r3)
                goto L_0x00aa
            L_0x007f:
                com.tencent.mm.plugin.appbrand.appcache.l0 r4 = r0.mo73175O1(r1, r6)     // Catch:{ Exception -> 0x008c }
                t73.j r5 = new t73.j     // Catch:{ Exception -> 0x008c }
                r5.<init>(r2, r3)     // Catch:{ Exception -> 0x008c }
                r0.mo73176Q1(r4, r1, r5)     // Catch:{ Exception -> 0x008c }
                goto L_0x00aa
            L_0x008c:
                r2 = move-exception
                java.lang.String r0 = r0.f129908B
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "createPrefetcherJsContext "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " exception"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r2, r1, r3)
            L_0x00aa:
                rx3.b0 r0 = rx3.C13598b0.f38549a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: dx0.C45469b.C45471b.invoke():java.lang.Object");
        }
    }

    /* renamed from: dx0.b$c */
    public static final class C45472c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f123084d;

        /* renamed from: e */
        public final /* synthetic */ int f123085e;

        /* renamed from: f */
        public final /* synthetic */ int f123086f;

        /* renamed from: g */
        public final /* synthetic */ int f123087g;

        public C45472c(String str, int i, int i2, int i3) {
            this.f123084d = str;
            this.f123085e = i;
            this.f123086f = i2;
            this.f123087g = i3;
        }

        public final void run() {
            C45834o oVar = C45834o.f123751a;
            String str = this.f123084d;
            int i = this.f123085e;
            int i2 = this.f123086f;
            int i3 = this.f123087g;
            C87412m.m108594g(str, "url");
            long currentTimeMillis = System.currentTimeMillis();
            C53895h.m60466d(C0001s1.f0d, C53872d1.f151119c, (C53934p0) null, new C45838p(currentTimeMillis, str, i, i3, i2, 2, (C15601d<? super C45838p>) null), 2, (Object) null);
        }
    }

    /* renamed from: dx0.b$d */
    public static final class C45473d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<C48299e> f123088d;

        /* renamed from: e */
        public final /* synthetic */ int f123089e;

        public C45473d(List<? extends C48299e> list, int i) {
            this.f123088d = list;
            this.f123089e = i;
        }

        public final void run() {
            C45834o oVar = C45834o.f123751a;
            List<C48299e> list = this.f123088d;
            int i = this.f123089e;
            C87412m.m108594g(list, "items");
            C45834o.f123754d = 0;
            ((LinkedList) C45834o.f123755e).clear();
            LinkedList linkedList = new LinkedList();
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                String str = ((C48299e) next).f129336d;
                if (str == null ? false : C45590f.m50650j(str)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C48299e eVar = (C48299e) it.next();
                C50637o6 o6Var = new C50637o6();
                String str2 = eVar.f129336d;
                o6Var.f138971e = str2;
                C45834o oVar2 = C45834o.f123751a;
                C87412m.m108593f(str2, "appMsgUrlInfo.Url");
                o6Var.f138970d = oVar2.mo71301b(str2);
                o6Var.f138973g = eVar.f129338f;
                int i2 = eVar.f129337e;
                o6Var.f138972f = i2;
                if (i2 > 0) {
                    linkedList.add(o6Var);
                }
            }
            Log.m105926v("MicroMsg.MPDataLogic", "getAppMsgRelatedInfoForAppMsg size:" + list.size());
            oVar.mo71300a(linkedList, i);
        }
    }

    /* renamed from: dx0.b$e */
    public static final class C45474e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<C48299e> f123090d;

        /* renamed from: e */
        public final /* synthetic */ int f123091e;

        public C45474e(List<? extends C48299e> list, int i) {
            this.f123090d = list;
            this.f123091e = i;
        }

        public final void run() {
            C45834o oVar = C45834o.f123751a;
            List<C48299e> list = this.f123090d;
            int i = this.f123091e;
            C87412m.m108594g(list, "items");
            C45834o.f123754d = 0;
            ((LinkedList) C45834o.f123755e).clear();
            LinkedList linkedList = new LinkedList();
            ArrayList arrayList = new ArrayList();
            for (C48299e eVar : list) {
                LinkedList<C77630j> linkedList2 = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(eVar.f129340h, eVar.f129339g).f226295i;
                C87412m.m108593f(linkedList2, "getService(IAppMsgBizHel….msgId, it.Content).items");
                C64175a0.m75508p(arrayList, linkedList2);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = ((C77630j) next).f226326e;
                if (str == null ? false : C45590f.m50650j(str)) {
                    arrayList2.add(next);
                }
            }
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                C77630j jVar = (C77630j) it4.next();
                C50637o6 o6Var = new C50637o6();
                String str2 = jVar.f226326e;
                o6Var.f138971e = str2;
                C45834o oVar2 = C45834o.f123751a;
                C87412m.m108593f(str2, "appMsgUrlInfo.Url");
                o6Var.f138970d = oVar2.mo71301b(str2);
                o6Var.f138973g = jVar.f226333o;
                o6Var.f138974h = jVar.f226320L;
                if (i != 0) {
                    if (jVar.f226317I == 1) {
                        o6Var.f138972f = 3;
                    } else {
                        o6Var.f138972f = 1;
                    }
                    linkedList.add(o6Var);
                } else if (jVar.f226317I == 1) {
                    o6Var.f138972f = 2;
                    linkedList.add(o6Var);
                }
            }
            Log.m105926v("MicroMsg.MPDataLogic", "getAppMsgRelatedInfoForBizMsg size:" + linkedList.size());
            oVar.mo71300a(linkedList, i);
        }
    }

    /* renamed from: dx0.b$g */
    public static final class C45475g extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public final /* synthetic */ C45469b f123092d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45475g(C45469b bVar) {
            super(0);
            this.f123092d = bVar;
        }

        public Object invoke() {
            String unused = this.f123092d.getClass();
            return MultiProcessMMKV.getSingleMMKV("MicroMsg.BrandServiceImpl");
        }
    }

    /* renamed from: dx0.b$h */
    public static final class C45476h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<List<String>> f123093d;

        /* renamed from: e */
        public final /* synthetic */ int f123094e;

        public C45476h(List<? extends List<String>> list, int i) {
            this.f123093d = list;
            this.f123094e = i;
        }

        public final void run() {
            List<List<String>> list = this.f123093d;
            int i = this.f123094e;
            C40789z zVar = C40789z.f109640a;
            C87412m.m108594g(list, "items");
            if (!list.isEmpty()) {
                C40789z zVar2 = C40789z.f109640a;
                int i2 = 2;
                int i3 = i != 1 ? i != 2 ? 0 : 2 : 1;
                if (i3 != 0) {
                    for (List list2 : list) {
                        C115669n nVar = C115669n.INSTANCE;
                        Object[] objArr = new Object[11];
                        objArr[0] = Integer.valueOf(i3);
                        objArr[1] = list2.get(i2);
                        objArr[i2] = C117627q.m165908a((String) list2.get(0));
                        C40789z zVar3 = C40789z.f109640a;
                        objArr[3] = zVar3.mo63723p(list2, 3, "");
                        objArr[4] = zVar3.mo63723p(list2, 4, "");
                        objArr[5] = 1;
                        objArr[6] = list2.get(1);
                        objArr[7] = zVar3.mo63723p(list2, 5, "");
                        objArr[8] = zVar3.mo63723p(list2, 6, "");
                        objArr[9] = zVar3.mo63723p(list2, 7, "");
                        objArr[10] = Integer.valueOf((!C87412m.m108589b(list2.get(1), "-1") || !C45590f.m50650j((String) list2.get(0))) ? 0 : 1);
                        nVar.mo160131h(16468, objArr);
                        i2 = 2;
                    }
                }
                if (C40789z.m44094e(C40789z.f109640a.mo63724r(i))) {
                    int n = C40714i.m43965n(i);
                    ArrayList arrayList = new ArrayList();
                    for (T next : list) {
                        if (!(!C45590f.m50650j((String) ((List) next).get(0)))) {
                            arrayList.add(next);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        List list3 = (List) it.next();
                        arrayList2.add(new C40789z.C40792d((String) list3.get(0), C40789z.f109640a.mo63719j(Integer.parseInt((String) list3.get(1)))));
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        C40789z.C40792d dVar = (C40789z.C40792d) next2;
                        String str = dVar.f109653a;
                        if (!(!C45590f.m50653m(str) || C40789z.f109646g.mo63726b(str, dVar.f109654b))) {
                            arrayList3.add(next2);
                        }
                    }
                    int max = Math.max(arrayList3.size() - n, 0);
                    List<C40789z.C40792d> s0 = C110818d0.m150947s0(arrayList3, n);
                    if (!s0.isEmpty()) {
                        C40789z.f109640a.mo63714d(s0, i, max, 1);
                        if (Log.getLogLevel() == 0) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("preloadData preloadByIdAndUrls toStrip:");
                            sb.append(n);
                            sb.append(" strip:");
                            sb.append(max);
                            sb.append(" dispatch:");
                            ArrayList arrayList4 = new ArrayList(C36907w.m41090l(s0, 10));
                            for (C40789z.C40792d dVar2 : s0) {
                                arrayList4.add(C40714i.m43955d(dVar2.f109653a));
                            }
                            sb.append(arrayList4);
                            Log.m105926v("MicroMsg.PreloadLogic", sb.toString());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: dx0.b$i */
    public static final class C45477i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List<String[]> f123095d;

        /* renamed from: e */
        public final /* synthetic */ int f123096e;

        public C45477i(List<String[]> list, int i) {
            this.f123095d = list;
            this.f123096e = i;
        }

        public final void run() {
            List<String[]> list = this.f123095d;
            int i = this.f123096e;
            C40789z zVar = C40789z.f109640a;
            C87412m.m108594g(list, "items");
            if (C40789z.m44094e(C40789z.f109640a.mo63724r(i))) {
                int n = C40714i.m43965n(i);
                ArrayList arrayList = new ArrayList();
                for (String[] strArr : list) {
                    int parseInt = Integer.parseInt(strArr[2]);
                    Iterable iterable = ((C76073b) C86312j.m106911c(C76073b.class)).mo94597JZ(Long.parseLong(strArr[0]), strArr[1]).f226295i;
                    if (parseInt > 0) {
                        C87412m.m108593f(iterable, LocaleUtil.ITALIAN);
                        iterable = C110818d0.m150947s0(iterable, parseInt);
                    }
                    C87412m.m108593f(iterable, "getService(IAppMsgBizHel…else it\n                }");
                    C64175a0.m75508p(arrayList, iterable);
                }
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C77630j jVar = (C77630j) it.next();
                    String str = jVar.f226326e;
                    if (str == null) {
                        str = "";
                    }
                    arrayList2.add(new C40789z.C40792d(str, C40789z.f109640a.mo63719j(jVar.f226333o)));
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    Object next = it4.next();
                    C40789z.C40792d dVar = (C40789z.C40792d) next;
                    String str2 = dVar.f109653a;
                    if (!(!C45590f.m50653m(str2) || C40789z.f109646g.mo63726b(str2, dVar.f109654b))) {
                        arrayList3.add(next);
                    }
                }
                int max = Math.max(arrayList3.size() - n, 0);
                List<C40789z.C40792d> s0 = C110818d0.m150947s0(arrayList3, n);
                if (!s0.isEmpty()) {
                    C40789z.f109640a.mo63714d(s0, i, max, 1);
                    if (Log.getLogLevel() == 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("preloadData preloadByInfoIdAndBuffer toStrip:");
                        sb.append(n);
                        sb.append(" strip:");
                        sb.append(max);
                        sb.append(" dispatch:");
                        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(s0, 10));
                        for (C40789z.C40792d dVar2 : s0) {
                            arrayList4.add(C40714i.m43955d(dVar2.f109653a));
                        }
                        sb.append(arrayList4);
                        Log.m105926v("MicroMsg.PreloadLogic", sb.toString());
                    }
                }
            }
        }
    }

    /* renamed from: dx0.b$j */
    public static final class C45478j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45469b f123097d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45478j(C45469b bVar) {
            super(0);
            this.f123097d = bVar;
        }

        public Object invoke() {
            BizTLRecCardJsEngine.f247961Y.mo118094a();
            String unused = this.f123097d.getClass();
            Log.m105924i("MicroMsg.BrandServiceImpl", "preloadTimelineCanvas");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dx0.b$k */
    public static final class C45479k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C45469b f123098d;

        /* renamed from: e */
        public final /* synthetic */ String f123099e;

        /* renamed from: f */
        public final /* synthetic */ String f123100f;

        /* renamed from: g */
        public final /* synthetic */ String f123101g;

        /* renamed from: h */
        public final /* synthetic */ long f123102h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45479k(C45469b bVar, String str, String str2, String str3, long j) {
            super(0);
            this.f123098d = bVar;
            this.f123099e = str;
            this.f123100f = str2;
            this.f123101g = str3;
            this.f123102h = j;
        }

        public Object invoke() {
            C45469b bVar = this.f123098d;
            String str = this.f123099e;
            String str2 = this.f123100f;
            String str3 = this.f123101g;
            long j = this.f123102h;
            bVar.getClass();
            if (!Util.isNullOrNil(str)) {
                BizTLRecCardJsEngine a = BizTLRecCardJsEngine.f247961Y.mo118094a();
                C87412m.m108594g(str2, "canvasId");
                if (j != 0) {
                    Log.m105918d("MicroMsg.BizTLRecCardJsEngine", "updateMsgIds canvasId=" + str2 + ", msgIds=" + j);
                    a.f247970S.put(str2, Long.valueOf(j));
                }
                ((MMHandler) ((C36570n) bVar.f123074i).getValue()).post(new C45483d(bVar, new C45482c(str, str2, str3)));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: dx0.b$l */
    public static final class C45480l implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f123103d;

        public C45480l(C32224a<C13598b0> aVar) {
            this.f123103d = aVar;
        }

        public final void run() {
            this.f123103d.invoke();
        }
    }

    /* renamed from: dx0.b$m */
    public static final class C45481m implements C15907f.C15909b {

        /* renamed from: a */
        public final /* synthetic */ C45469b f123104a;

        /* renamed from: b */
        public final /* synthetic */ C32226l<Boolean, C13598b0> f123105b;

        public C45481m(C45469b bVar, C32226l<? super Boolean, C13598b0> lVar) {
            this.f123104a = bVar;
            this.f123105b = lVar;
        }

        /* renamed from: a */
        public void mo6380a() {
            String unused = this.f123104a.getClass();
            Log.m105924i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onCancelBtn.");
            C32226l<Boolean, C13598b0> lVar = this.f123105b;
            if (lVar != null) {
                lVar.invoke(Boolean.FALSE);
            }
        }

        public void onSuccess() {
            ((C15907f) C86312j.m106911c(C15907f.class)).mo14559vq(true, 256);
            String unused = this.f123104a.getClass();
            Log.m105924i("MicroMsg.BrandServiceImpl", "changeSwitchWechatForStatus2CommonTips onAgreeBtn.");
            C32226l<Boolean, C13598b0> lVar = this.f123105b;
            if (lVar != null) {
                lVar.invoke(Boolean.TRUE);
            }
        }
    }

    /* renamed from: A9 */
    public String mo70950A9(String str) {
        C87412m.m108594g(str, "url");
        ConcurrentHashMap<String, String> concurrentHashMap = C40714i.f109359a;
        return C40714i.m43968q(str, false, 2, (Object) null);
    }

    /* renamed from: AL */
    public void mo70951AL(String str) {
        C87412m.m108594g(str, "canvasId");
        if (C19627t.f55586a.mo25833g()) {
            BizTLRecCardJsEngine a = BizTLRecCardJsEngine.f247961Y.mo118094a();
            synchronized (a) {
                if (a.f257697D.containsKey(str)) {
                    Integer num = a.f257697D.get(str);
                    if (num != null) {
                        a.mo123865W1(str, num.intValue());
                    }
                    a.f257697D.remove(str);
                }
            }
        }
    }

    public boolean B60(String str) {
        if (str != null) {
            return C45590f.m50653m(str);
        }
        return false;
    }

    /* renamed from: B7 */
    public void mo70953B7() {
        mo70990f().clearAll();
    }

    public void Bw0(Context context, C32226l<? super Boolean, C13598b0> lVar) {
        ((C15907f) C86312j.m106911c(C15907f.class)).mo14557hz(context, 256, true, new C45481m(this, lVar));
    }

    public boolean Cl0() {
        return true;
    }

    /* renamed from: DY */
    public void mo70956DY(Context context, String str, String str2, int i, int i2, String str3) {
        C87412m.m108594g(context, "context");
        C19428d.f54856a.mo25191z(context, str, str2, i, i2, (List<? extends C118459qf>) null, str3);
    }

    /* renamed from: E5 */
    public boolean mo70957E5(int i) {
        return C40789z.m44094e(i);
    }

    /* renamed from: Eh */
    public void mo70958Eh() {
        C40789z zVar = C40789z.f109640a;
        Log.m105918d("MicroMsg.PreloadLogic", "removeAllPreload");
        C40789z.f109646g.getClass();
        C40789z.f109643d.clearAll();
    }

    /* renamed from: F2 */
    public String mo70959F2(String str, int i, int i2, int i3) {
        return C92721n.m116873a(str, i, i2, i3);
    }

    public C45695b F60(int i) {
        return new C44591c(i);
    }

    /* renamed from: Gb */
    public void mo70961Gb(long j, String str) {
        String a = mo70985a();
        mo70990f().encode(a + '_' + str, j);
    }

    public int Ie0() {
        return C19636w0.f55626c;
    }

    /* renamed from: J2 */
    public long mo70963J2(String str) {
        C87412m.m108594g(str, "chatName");
        Long l = this.f123070e.get(str);
        if (l == null) {
            return -1;
        }
        return l.longValue();
    }

    public void J90(C49399fa faVar) {
        C96674u.f283144a.mo134852b(faVar);
    }

    public void Ks0(String str, C64273c21 c212) {
        if (c212 == null || Util.isNullOrNil(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("liveInfo == null? ");
            sb.append(c212 == null);
            sb.append(", exportId empty? ");
            sb.append(Util.isNullOrNil(str));
            Log.m105924i("MicroMsg.BrandServiceImpl", sb.toString());
            return;
        }
        String b = mo70986b();
        mo70990f().encode(b + '_' + str, c212.toByteArray());
    }

    public void Md0() {
        C39656k.f106417a.mo62221d(-1);
    }

    public boolean Ms0(Context context, String str, int i, boolean z, int i2, int i3, Intent intent) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        Intent intent2 = intent;
        C87412m.m108594g(intent2, "intent");
        return C40789z.m44097q(context, str, i, z, i2, i3, intent2, 0, (C45696d.C7944a) null, false, C22657f.CTRL_INDEX, (Object) null);
    }

    /* renamed from: P2 */
    public void mo70968P2(String str, String str2, String str3, String str4) {
        C87412m.m108594g(str3, "event");
        mo70992g(new C45471b(str, str2, str3, str4));
    }

    public C64273c21 Pr0(String str) {
        String b = mo70986b();
        byte[] decodeBytes = mo70990f().decodeBytes(b + '_' + str);
        if (decodeBytes == null || decodeBytes.length == 0) {
            return null;
        }
        try {
            C64273c21 c212 = new C64273c21();
            c212.parseFrom(decodeBytes);
            return c212;
        } catch (IOException e) {
            Log.m105921e("MicroMsg.BrandServiceImpl", "parse finderLive fail, parseFrom:%s", e.getMessage());
            return null;
        }
    }

    /* renamed from: Q2 */
    public boolean mo70970Q2(Object obj, Object obj2, int i) {
        C77630j jVar = null;
        C19623o0 o0Var = obj instanceof C19623o0 ? (C19623o0) obj : null;
        if (obj2 instanceof C77630j) {
            jVar = (C77630j) obj2;
        }
        return C20734b.m22688a(o0Var, jVar, i);
    }

    public boolean Q20() {
        return mo70990f().decodeBool(String.valueOf(mo70987c()));
    }

    /* renamed from: RM */
    public void mo70972RM(int i) {
        AtomicBoolean atomicBoolean = C40789z.f109641b;
        if (!atomicBoolean.get()) {
            atomicBoolean.set(true);
            if (i == 10000) {
                ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
                C40789z.f109640a.mo63722o(i);
                atomicBoolean.set(false);
                return;
            }
            Looper.myQueue().addIdleHandler(new C40707d0(i));
        }
    }

    public boolean Rq0() {
        return C112551y.m153809i("CN", C86709a0.m107535s().mo121142i().mo119674H(274436, "CN"), true);
    }

    /* renamed from: T2 */
    public void mo70974T2() {
        C19428d.f54856a.mo25151D();
    }

    /* renamed from: T4 */
    public long mo70975T4(String str) {
        String a = mo70985a();
        return mo70990f().decodeLong(a + '_' + str, 0);
    }

    public void Tn0(String str, int i, int i2, Object... objArr) {
        C87412m.m108594g(str, "url");
        C87412m.m108594g(objArr, "vals");
        String h = C40714i.m43959h(str);
        MMCacheSlotManager mMCacheSlotManager = f123066j;
        if (!mMCacheSlotManager.contains(h)) {
            mMCacheSlotManager.add(h);
            Log.m105926v("MicroMsg.BrandServiceImpl", "preloadData: addToPreload:" + h);
            ((C119157j) C119157j.f356862d).mo183876g(new C45470a(str, i, i2, objArr, this), "tmplPreload");
        }
    }

    /* renamed from: U2 */
    public int mo70977U2() {
        int i;
        try {
            BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
            BizTLRecCardJsEngine bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0;
            if (bizTLRecCardJsEngine != null) {
                i = bizTLRecCardJsEngine.mo63612u0();
            } else {
                int i2 = this.f123071f;
                i = i2 > 0 ? i2 : companion.mo118094a().mo63612u0();
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.BrandServiceImpl", "getTimelineCanvasPkgVersion ex " + e.getMessage());
            i = 0;
        }
        this.f123071f = i;
        Log.m105918d("MicroMsg.BrandServiceImpl", "getTimelineCanvasPkgVersion bizPkgVersion =  " + this.f123071f);
        return i;
    }

    public void U30(String str) {
        C20583z.C20584b bVar = C20583z.f57949a;
        C20583z.f57956h = str;
    }

    /* renamed from: WX */
    public void mo70979WX(String str) {
        Log.m105919d("MicroMsg.BrandServiceImpl", "alvinluo saveChannelFeeds %s", str);
        mo70990f().putString("video_channel_feeds_data", str);
    }

    /* renamed from: Wc */
    public boolean mo70980Wc() {
        return C22058r.f62431b;
    }

    /* renamed from: Wh */
    public void mo70981Wh(String str, int i) {
        C87412m.m108594g(str, "url");
        C45821d.f123719a.mo71283a(str, i);
    }

    public void Wn0(boolean z) {
        mo70990f().encode(String.valueOf(mo70987c()), z);
    }

    public void Xe0(String str) {
        C87412m.m108594g(str, "chatName");
        this.f123070e.put(str, Long.valueOf(MMSlotKt.now()));
    }

    public boolean Zi0(Context context, String str, int i, boolean z, int i2, int i3, Intent intent, int i4, C45696d.C7944a aVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(str, "url");
        Intent intent2 = intent;
        C87412m.m108594g(intent2, "intent");
        C45696d.C7944a aVar2 = aVar;
        C87412m.m108594g(aVar2, "result");
        return C40789z.m44097q(context, str, i, z, i2, i3, intent2, i4, aVar2, false, 512, (Object) null);
    }

    /* renamed from: a */
    public final String mo70985a() {
        return "Biz_" + C86709a0.m107523b().mo121111i() + "_EnterProfileTime";
    }

    /* renamed from: b */
    public final String mo70986b() {
        return "Biz_" + C86709a0.m107523b().mo121111i() + "_LivesInfo";
    }

    /* renamed from: c */
    public final String mo70987c() {
        return "Biz_" + C86709a0.m107523b().mo121111i() + "_UserHasMigrateUnEncryptBizDb";
    }

    /* renamed from: e3 */
    public void mo70988e3(int i, List<Integer> list) {
        if (!C40789z.m44094e(i)) {
            Log.m105929w("MicroMsg.BrandServiceImpl", "preloadWebView can not preload scene: %d", Integer.valueOf(i));
            return;
        }
        Log.m105924i("MicroMsg.BrandServiceImpl", "preloadWebView openScene: " + i + ", itemShowTypeList: " + list);
        ((C90110f) C86312j.m106911c(C90110f.class)).mo124152cj();
        C40789z.f109640a.mo63716g(i, C44545a.f120794a.mo69323a());
        if (list != null) {
            for (Number intValue : list) {
                C40789z.m44095k(C40789z.f109640a.mo63719j(intValue.intValue()));
            }
        }
    }

    /* renamed from: eQ */
    public boolean mo70989eQ(String str) {
        if (str != null) {
            return C45590f.m50650j(str);
        }
        return false;
    }

    /* renamed from: f */
    public final MultiProcessMMKV mo70990f() {
        return (MultiProcessMMKV) ((C36570n) this.f123069d).getValue();
    }

    public int fk0() {
        int i;
        try {
            BizTLRecCardJsEngine.Companion companion = BizTLRecCardJsEngine.f247961Y;
            BizTLRecCardJsEngine bizTLRecCardJsEngine = BizTLRecCardJsEngine.f247960R0;
            if (bizTLRecCardJsEngine != null) {
                i = bizTLRecCardJsEngine.mo63609i0();
            } else {
                int i2 = this.f123072g;
                i = i2 > 0 ? i2 : companion.mo118094a().mo63609i0();
            }
        } catch (Exception e) {
            Log.m105928w("MicroMsg.BrandServiceImpl", "getTimelineCanvasBasePkgVersion ex " + e.getMessage());
            i = 0;
        }
        this.f123072g = i;
        Log.m105918d("MicroMsg.BrandServiceImpl", "getTimelineCanvasBasePkgVersion basePkgVersion = " + this.f123072g);
        return i;
    }

    /* renamed from: g */
    public final void mo70992g(C32224a<C13598b0> aVar) {
        long currentTimeMillis = System.currentTimeMillis() - C55579f.f158250d;
        long j = this.f123073h;
        if (currentTimeMillis >= j || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
            aVar.invoke();
            return;
        }
        ((C119157j) C119157j.f356862d).mo183878i(new C45480l(aVar), Math.max(j - currentTimeMillis, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION));
    }

    /* renamed from: g3 */
    public boolean mo70993g3() {
        return Rq0() || (C75592q0.m90780j() & 256) != 0;
    }

    public int gg0(String str) {
        return C19428d.f54856a.mo25174h(str);
    }

    /* renamed from: gj */
    public void mo70995gj(Context context, String str, String str2, int i, int i2) {
        C87412m.m108594g(context, "context");
        C19428d.f54856a.mo25190y(context, str, str2, i, i2, (List<? extends C118459qf>) null);
    }

    public void hi0(String str, C49399fa faVar, String str2, C1256g<Bundle> gVar) {
        C87412m.m108594g(str, "toUser");
        C87412m.m108594g(faVar, "msgInfo");
        C87412m.m108594g(gVar, "callback");
        C44080p.f119428a.mo68713a(str, faVar, str2, gVar);
    }

    /* renamed from: i5 */
    public void mo70997i5(C49399fa faVar, MMActivity mMActivity, int i) {
        if (faVar == null || mMActivity == null) {
            Log.m105928w("MicroMsg.MPVideoShareToSns", "doShareToSns msgInfo is null");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("ksnsupload_mp_video_xml", ((C91997p) ((C60228r0) C86312j.m106911c(C60228r0.class)).mo84719FU(faVar)).mo74685b());
        intent.putExtra("Ksnsupload_type", 19);
        intent.putExtra("need_result", true);
        C88144b.m109803u(mMActivity, ".plugin.sns.ui.SnsUploadUI", intent, 209, new C44079o(mMActivity, faVar, i));
    }

    /* renamed from: iD */
    public boolean mo70998iD(int i) {
        return i == 16;
    }

    public boolean k20() {
        return true;
    }

    public String kk0() {
        String str = C53458b.f150359b;
        C87412m.m108593f(str, "HARDCODE_URL");
        return str;
    }

    /* renamed from: l4 */
    public void mo71001l4() {
        if (C19627t.f55586a.mo25835i()) {
            ((MMHandler) ((C36570n) this.f123074i).getValue()).post(new C45483d(this, new C45478j(this)));
        }
    }

    public void n90(List<String[]> list, int i) {
        C87412m.m108594g(list, "items");
        ArrayList<String[]> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String h = C40714i.m43959h(((String[]) next)[0]);
            MMCacheSlotManager mMCacheSlotManager = f123066j;
            if (mMCacheSlotManager.contains(h)) {
                z = false;
            } else {
                mMCacheSlotManager.add(h);
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (Log.getLogLevel() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("preloadData: preloadByInfoIdAndBuffer:");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                for (String[] strArr : arrayList) {
                    arrayList2.add(C40714i.m43959h(strArr[0]));
                }
                sb.append(arrayList2);
                Log.m105926v("MicroMsg.BrandServiceImpl", sb.toString());
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C45477i(arrayList, i), "tmplPreload");
        }
    }

    /* renamed from: o4 */
    public void mo71003o4(String str, int i, int i2, int i3) {
        if (str != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C45472c(str, i, i2, i3), "getAppMsgRelatedInfo");
        }
    }

    /* renamed from: o8 */
    public void mo71004o8(List<? extends List<String>> list, int i) {
        C87412m.m108594g(list, "items");
        ArrayList<List> arrayList = new ArrayList<>();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String h = C40714i.m43959h((String) ((List) next).get(0));
            MMCacheSlotManager mMCacheSlotManager = f123066j;
            if (mMCacheSlotManager.contains(h)) {
                z = false;
            } else {
                mMCacheSlotManager.add(h);
            }
            if (z) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            if (Log.getLogLevel() == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("preloadData: preloadByIdAndUrls:");
                ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                for (List list2 : arrayList) {
                    arrayList2.add(C40714i.m43959h((String) list2.get(0)));
                }
                sb.append(arrayList2);
                Log.m105926v("MicroMsg.BrandServiceImpl", sb.toString());
            }
            ((C119157j) C119157j.f356862d).mo183876g(new C45476h(arrayList, i), "tmplPreload");
        }
    }

    /* renamed from: oD */
    public void mo71005oD(String str, String str2, String str3, long j) {
        C87412m.m108594g(str, "path");
        C87412m.m108594g(str2, "canvasId");
        C87412m.m108594g(str3, "data");
        if (C19627t.f55586a.mo25835i()) {
            mo70992g(new C45479k(this, str, str2, str3, j));
        }
    }

    public boolean ou0() {
        C19428d dVar = C19428d.f54856a;
        return ((Boolean) ((C36570n) C19428d.f54868m).getValue()).booleanValue();
    }

    public void p90(C45696d.C45697b bVar) {
        C45825h.f123727a.mo71292c(bVar);
    }

    /* renamed from: pB */
    public String mo71008pB() {
        String string = mo70990f().getString("video_channel_feeds_data", "");
        return string == null ? "" : string;
    }

    public C48298d pq0(String str) {
        return C45834o.C45835a.f123756a.mo71304a(str);
    }

    public void pr0(Context context, JSONObject jSONObject, HashMap<String, Object> hashMap) {
        Class cls;
        String str;
        JSONObject jSONObject2 = jSONObject;
        Class cls2 = C45696d.class;
        C87412m.m108594g(hashMap, "ret");
        if (jSONObject2 != null) {
            int optInt = jSONObject2.optInt("item_show_type");
            Bundle bundle = new Bundle();
            if (optInt == 5) {
                C39750a aVar = C39750a.f106644a;
                if (aVar.mo62385a()) {
                    Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload");
                    String optString = jSONObject2.optString(TPReportKeys.Common.COMMON_VID);
                    if (Util.isNullOrNil(optString)) {
                        Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload vid null");
                    } else {
                        int i = (int) Util.getFloat(jSONObject2.optString("videoInitialTime"), 0.0f);
                        String optString2 = jSONObject2.optString("videoInitialSnapshot");
                        if (Util.isNullOrNil(optString2)) {
                            Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "saveVideo openwebviewusefastload bitmap null");
                        } else {
                            MultiProcessMMKV multiProcessMMKV = (MultiProcessMMKV) C39750a.f106646c.getSlotForWrite();
                            multiProcessMMKV.encode("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_playTime", i);
                            cls = cls2;
                            multiProcessMMKV.encode("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_expire", (System.currentTimeMillis() / ((long) 1000)) + 600);
                            multiProcessMMKV.encode("MicroMsg.MPVideoPreviewDataMgr_" + optString + "_bitmap", optString2);
                            aVar.mo62388d(optString);
                            C115669n.INSTANCE.idkeyStat(1061, 21, 1, false);
                        }
                    }
                }
                cls = cls2;
                C115669n.INSTANCE.idkeyStat(1061, 21, 1, false);
            } else {
                cls = cls2;
            }
            bundle.putString("url", jSONObject2.optString("url"));
            bundle.putInt("item_show_type", jSONObject2.optInt("item_show_type"));
            bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, jSONObject2.optInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE));
            bundle.putInt("subscene", jSONObject2.optInt("subscene"));
            bundle.putInt("openType", jSONObject2.optInt("openType"));
            bundle.putString("biz_video_channel_session_id", jSONObject2.optString("channelSessionId"));
            C45696d.C7944a aVar2 = new C45696d.C7944a();
            Intent intent = new Intent();
            intent.putExtra("immersiveUIStyle", jSONObject2.optBoolean("immersiveUIStyle", false) ? 1 : 0);
            int i2 = bundle.getInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            int i3 = bundle.getInt("subscene", 10000);
            String string = bundle.getString("url");
            if (((C45696d) C86709a0.m107533q(cls)).B60(string)) {
                string = ((C45696d) C86709a0.m107533q(cls)).mo70959F2(string, i2, i3, (int) (System.currentTimeMillis() / ((long) 1000)));
            }
            Context context2 = context;
            HashMap<String, Object> hashMap2 = hashMap;
            hashMap2.put("success", Boolean.valueOf(((C45696d) C86709a0.m107533q(cls)).Zi0(context2, string, bundle.getInt("item_show_type"), bundle.getBoolean("isNativePage"), i2, i3, intent, bundle.getInt("openType"), aVar2)));
            if (!aVar2.f26630a && (str = aVar2.f26631b) != null) {
                C87412m.m108593f(str, "result.message");
                hashMap2.put("desc", str);
            }
        }
    }

    /* renamed from: q4 */
    public String mo71011q4(String str) {
        return C19428d.f54856a.mo25172f(str);
    }

    /* renamed from: rU */
    public boolean mo71012rU(int i) {
        return C18355t.m18924c(i);
    }

    /* renamed from: rx */
    public void mo71013rx(List<? extends C48299e> list, int i) {
        C87412m.m108594g(list, "items");
        if (!Util.isNullOrNil((List) list)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C45473d(list, i), "getAppMsgRelatedInfo");
        }
    }

    /* renamed from: uw */
    public boolean mo71014uw() {
        C19428d dVar = C19428d.f54856a;
        return ((Boolean) ((C36570n) C19428d.f54867l).getValue()).booleanValue();
    }

    /* renamed from: wL */
    public boolean mo71015wL(String str) {
        return C19428d.f54856a.mo25185t(str);
    }

    /* renamed from: xs */
    public void mo71016xs(List<? extends C48299e> list, int i) {
        C87412m.m108594g(list, "items");
        if (!Util.isNullOrNil((List) list)) {
            ((C119157j) C119157j.f356862d).mo183876g(new C45474e(list, i), "getAppMsgRelatedInfo");
        }
    }

    /* renamed from: z3 */
    public int mo71017z3() {
        C20642c cVar = (C20642c) C86312j.m106911c(C20642c.class);
        if (cVar != null) {
            return cVar.mo32323z3();
        }
        return -1;
    }
}
