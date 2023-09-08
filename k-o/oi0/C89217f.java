package oi0;

import com.tencent.p014mm.plugin.appbrand.app.C81161g2;
import com.tencent.p014mm.plugin.appbrand.utils.C84737f0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import js0.C88024r;
import oi0.C62022m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C50644o72;
import te3.C64716sw;
import te3.C90419io3;

/* renamed from: oi0.f */
public final class C89217f {

    /* renamed from: o */
    public static final C89218a f257071o = new C89218a((C8480h) null);

    /* renamed from: p */
    public static C89217f f257072p;

    /* renamed from: a */
    public final C89229q f257073a = new C89229q();

    /* renamed from: b */
    public final C89215e f257074b = new C89215e();

    /* renamed from: c */
    public final C13601g f257075c = C36568h.m40985a(C89222e.f257090d);

    /* renamed from: d */
    public long f257076d;

    /* renamed from: e */
    public long f257077e;

    /* renamed from: f */
    public long f257078f;

    /* renamed from: g */
    public int f257079g;

    /* renamed from: h */
    public int f257080h;

    /* renamed from: i */
    public boolean f257081i;

    /* renamed from: j */
    public int f257082j;

    /* renamed from: k */
    public int f257083k = 1;

    /* renamed from: l */
    public final C13601g f257084l = C36568h.m40985a(C89220c.f257088d);

    /* renamed from: m */
    public C62022m.C62023a f257085m = new C89219b(this);

    /* renamed from: n */
    public C32228q<? super Integer, ? super LinkedList<C90419io3>, ? super Integer, C13598b0> f257086n = C89221d.f257089d;

    /* renamed from: oi0.f$a */
    public static final class C89218a {
        public C89218a(C8480h hVar) {
        }
    }

    /* renamed from: oi0.f$b */
    public static final class C89219b implements C62022m.C62023a {

        /* renamed from: a */
        public final /* synthetic */ C89217f f257087a;

        public C89219b(C89217f fVar) {
            this.f257087a = fVar;
        }

        /* renamed from: a */
        public void mo86898a() {
            C89217f fVar = this.f257087a;
            LinkedList linkedList = new LinkedList();
            C32228q<? super Integer, ? super LinkedList<C90419io3>, ? super Integer, C13598b0> qVar = fVar.f257086n;
            if (qVar != null) {
                qVar.invoke(1, linkedList, 0);
            }
        }

        /* renamed from: b */
        public void mo86899b(C50644o72 o722) {
            LinkedList<C90419io3> linkedList;
            LinkedList<C90419io3> linkedList2;
            C87412m.m108594g(o722, "response");
            C89217f fVar = this.f257087a;
            fVar.getClass();
            Class cls = C89212b.class;
            fVar.f257077e = o722.f139001f;
            fVar.f257078f = (long) o722.f139003h;
            fVar.f257079g = o722.f138999d;
            fVar.f257076d = Util.nowSecond();
            Object[] objArr = new Object[4];
            objArr[0] = Long.valueOf(o722.f139001f);
            objArr[1] = Integer.valueOf(o722.f138999d);
            LinkedList<C90419io3> linkedList3 = o722.f139002g;
            objArr[2] = Integer.valueOf(linkedList3 == null ? 0 : linkedList3.size());
            objArr[3] = Long.valueOf(fVar.f257078f);
            Log.m105925i("MicroMsg.Recommend.AppBrandRecommendLogic", "success sessionId:%d, remain_count:%d, size:%d, cache_seconds:%d", objArr);
            if (fVar.f257080h == 0 && (linkedList2 = o722.f139002g) != null && !linkedList2.isEmpty()) {
                Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLogic", "save to database");
                C89212b bVar = (C89212b) C81161g2.Bx0(cls);
                bVar.f257058d.execSQL("AppBrandRecommendCard", "delete from AppBrandRecommendCard");
                LinkedList<C90419io3> linkedList4 = o722.f139002g;
                Log.m105924i("MicroMsg.Recommend.AppBrandRecommendCardStorage", "addRecommendWxaList()");
                LinkedList linkedList5 = new LinkedList();
                linkedList5.addAll(linkedList4);
                Iterator it = linkedList5.iterator();
                while (it.hasNext()) {
                    C90419io3 io32 = (C90419io3) it.next();
                    C35168a aVar = new C35168a();
                    aVar.field_appId = io32.f259585f;
                    aVar.field_recommendCard = io32;
                    bVar.insert(aVar);
                }
                fVar.mo123547c().clear();
            } else if (fVar.f257080h == 0 && ((linkedList = o722.f139002g) == null || linkedList.isEmpty())) {
                Log.m105924i("MicroMsg.Recommend.AppBrandRecommendLogic", "page num is 0, recommend_card_list is empty, delete all data");
                fVar.mo123547c().clear();
                ((C89212b) C81161g2.Bx0(cls)).f257058d.execSQL("AppBrandRecommendCard", "delete from AppBrandRecommendCard");
            }
            boolean z = BuildInfo.DEBUG;
            LinkedList<C90419io3> linkedList6 = o722.f139002g;
            if (linkedList6 != null && linkedList6.size() > 0) {
                C89229q qVar = fVar.f257073a;
                C90419io3 io33 = o722.f139002g.get(0);
                C87412m.m108593f(io33, "response.recommend_card_list[0]");
                C90419io3 io34 = io33;
                qVar.getClass();
                qVar.getClass();
                fVar.mo123547c().addAll(o722.f139002g);
                fVar.f257080h++;
            }
            LinkedList<C90419io3> linkedList7 = o722.f139002g;
            C87412m.m108593f(linkedList7, "response.recommend_card_list");
            int i = o722.f138999d;
            C32228q<? super Integer, ? super LinkedList<C90419io3>, ? super Integer, C13598b0> qVar2 = fVar.f257086n;
            if (qVar2 != null) {
                qVar2.invoke(0, linkedList7, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: oi0.f$c */
    public static final class C89220c extends C87413o implements C32224a<LinkedList<C90419io3>> {

        /* renamed from: d */
        public static final C89220c f257088d = new C89220c();

        public C89220c() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* renamed from: oi0.f$d */
    public static final class C89221d extends C87413o implements C32228q<Integer, LinkedList<C90419io3>, Integer, C13598b0> {

        /* renamed from: d */
        public static final C89221d f257089d = new C89221d();

        public C89221d() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj).intValue();
            ((Number) obj3).intValue();
            C87412m.m108594g((LinkedList) obj2, "<anonymous parameter 1>");
            return C13598b0.f38549a;
        }
    }

    /* renamed from: oi0.f$e */
    public static final class C89222e extends C87413o implements C32224a<LinkedList<Integer>> {

        /* renamed from: d */
        public static final C89222e f257090d = new C89222e();

        public C89222e() {
            super(0);
        }

        public Object invoke() {
            return new LinkedList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m111507a(oi0.C89217f r7, int r8) {
        /*
            r7.getClass()
            boolean r0 = f40.C86709a0.m107522a()
            if (r0 != 0) goto L_0x000b
            goto L_0x0116
        L_0x000b:
            r0 = 1
            r1 = 0
            if (r8 != 0) goto L_0x0063
            java.lang.Class<oi0.b> r2 = oi0.C89212b.class
            java.lang.Object r2 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Bx0(r2)
            oi0.b r2 = (oi0.C89212b) r2
            com.tencent.mm.sdk.storage.ISQLiteDatabase r2 = r2.f257058d
            r3 = 0
            java.lang.String r4 = "select * from AppBrandRecommendCard LIMIT 100"
            android.database.Cursor r2 = r2.rawQuery(r4, r3)
            if (r2 != 0) goto L_0x0024
            goto L_0x0047
        L_0x0024:
            java.lang.String r3 = "MicroMsg.Recommend.AppBrandRecommendCardStorage"
            java.lang.String r4 = "getRecommendWxaList()"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
        L_0x0030:
            boolean r4 = r2.moveToNext()
            if (r4 == 0) goto L_0x0044
            oi0.a r4 = new oi0.a
            r4.<init>()
            r4.convertFrom(r2)
            te3.io3 r4 = r4.field_recommendCard
            r3.add(r4)
            goto L_0x0030
        L_0x0044:
            r2.close()
        L_0x0047:
            java.lang.String r2 = "dataFetchFromDB"
            gy3.C87412m.m108593f(r3, r2)
            boolean r2 = r3.isEmpty()
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x0063
            r2 = 2
            fy3.q<? super java.lang.Integer, ? super java.util.LinkedList<te3.io3>, ? super java.lang.Integer, rx3.b0> r4 = r7.f257086n
            if (r4 == 0) goto L_0x0063
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4.invoke(r2, r3, r5)
        L_0x0063:
            oi0.e r2 = r7.f257074b
            r2.getClass()
            float r2 = oi0.C89215e.f257067d
            r3 = -1029046272(0xffffffffc2aa0000, float:-85.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x008f
            float r2 = oi0.C89215e.f257066c
            r3 = -998637568(0xffffffffc47a0000, float:-1000.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0079
            goto L_0x008f
        L_0x0079:
            long r2 = com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()
            long r4 = oi0.C89215e.f257068e
            long r2 = r2 - r4
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0089
            r2 = 1
            goto L_0x008a
        L_0x0089:
            r2 = 0
        L_0x008a:
            if (r2 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r2 = 1
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            if (r2 == 0) goto L_0x009b
            float r0 = oi0.C89215e.f257066c
            float r1 = oi0.C89215e.f257067d
            r7.mo123546b(r8, r0, r1)
            goto L_0x0116
        L_0x009b:
            rx3.g r2 = r7.f257075c
            rx3.n r2 = (rx3.C36570n) r2
            java.lang.Object r2 = r2.getValue()
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r2.add(r8)
            oi0.e r8 = r7.f257074b
            oi0.e$a r2 = r8.f257070b
            if (r2 == 0) goto L_0x00b4
            r2 = 1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            if (r2 != 0) goto L_0x00be
            oi0.g r2 = new oi0.g
            r2.<init>(r7)
            r8.f257070b = r2
        L_0x00be:
            boolean r7 = r8.f257069a
            if (r7 == 0) goto L_0x00c3
            goto L_0x0116
        L_0x00c3:
            java.lang.String r7 = "MicroMsg.Recommend.AppBrandRecommendLocationGet"
            java.lang.String r2 = "startLocation"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
            r8.f257069a = r0
            com.tencent.mm.pointers.PBool r7 = new com.tencent.mm.pointers.PBool
            r7.<init>()
            com.tencent.mm.pointers.PBool r0 = new com.tencent.mm.pointers.PBool
            r0.<init>()
            r7.value = r1
            r0.value = r1
            com.tencent.mm.sdk.platformtools.MTimerHandler r2 = new com.tencent.mm.sdk.platformtools.MTimerHandler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            oi0.c r4 = new oi0.c
            r4.<init>(r8, r0, r7)
            r2.<init>((android.os.Looper) r3, (com.tencent.p014mm.sdk.platformtools.MTimerHandler.CallBack) r4, (boolean) r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            r4 = 20
            long r3 = r3.toMillis(r4)
            r2.startTimer(r3)
            oi0.d r2 = new oi0.d
            r2.<init>(r8, r7, r0)
            java.util.Set<java.lang.Object> r7 = com.tencent.p014mm.plugin.appbrand.utils.C84737f0.f247137a
            java.util.HashSet r7 = (java.util.HashSet) r7
            r7.add(r2)
            java.lang.Class<ts.c> r7 = p702ts.C78085c.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            ts.c r7 = (p702ts.C78085c) r7
            cc0.b r7 = r7.mo108056ms()
            r7.mo126412f(r2, r1)
            r7 = 22
            r8 = 10
            com.tencent.p014mm.plugin.report.service.C5139t.m5183e(r7, r8)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oi0.C89217f.m111507a(oi0.f, int):void");
    }

    /* renamed from: b */
    public final void mo123546b(int i, float f, float f2) {
        if (C86709a0.m107522a()) {
            C64716sw swVar = new C64716sw();
            swVar.f185450d = NetStatusUtil.getNetTypeString(MMApplicationContext.getContext());
            swVar.f185451e = (double) f;
            swVar.f185452f = (double) f2;
            boolean z = BuildInfo.DEBUG;
            long j = this.f257077e;
            C62022m.C62023a aVar = this.f257085m;
            int i2 = this.f257083k;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            Set<Object> set = C84737f0.f247137a;
            C88024r.m109571a().postToWorker(new C62020l(i, swVar, j, i2, currentTimeMillis, aVar));
        }
    }

    /* renamed from: c */
    public final LinkedList<C90419io3> mo123547c() {
        return (LinkedList) ((C36570n) this.f257084l).getValue();
    }
}
