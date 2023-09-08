package qn1;

import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import eb0.C31543z5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import sx3.C64175a0;
import sx3.C64197v;
import te3.C50353m43;
import te3.C51096re1;
import z04.C112550d0;

/* renamed from: qn1.c */
public final class C12883c {

    /* renamed from: h */
    public static final C12885b f36861h = new C12885b((C8480h) null);

    /* renamed from: i */
    public static final C13601g<C12883c> f36862i = C36568h.m40985a(C12884a.f36870d);

    /* renamed from: a */
    public final LinkedList<C12892j> f36863a = new LinkedList<>();

    /* renamed from: b */
    public boolean f36864b;

    /* renamed from: c */
    public final List<Integer> f36865c = C64197v.m75537f(1, 2);

    /* renamed from: d */
    public final List<Integer> f36866d = C64197v.m75537f(2, 1);

    /* renamed from: e */
    public final List<Integer> f36867e = C64197v.m75537f(1, 2);

    /* renamed from: f */
    public final List<Integer> f36868f = C26236u.m33719b(1);

    /* renamed from: g */
    public final C13601g f36869g = C36568h.m40985a(new C12887d(this));

    /* renamed from: qn1.c$a */
    public static final class C12884a extends C87413o implements C32224a<C12883c> {

        /* renamed from: d */
        public static final C12884a f36870d = new C12884a();

        public C12884a() {
            super(0);
        }

        public Object invoke() {
            return new C12883c();
        }
    }

    /* renamed from: qn1.c$b */
    public static final class C12885b {
        public C12885b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C12883c mo12405a() {
            return (C12883c) ((C36570n) C12883c.f36862i).getValue();
        }
    }

    /* renamed from: qn1.c$c */
    public static final class C12886c extends C87413o implements C32226l<C12892j, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ long f36871d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12886c(long j) {
            super(1);
            this.f36871d = j;
        }

        public Object invoke(Object obj) {
            C12892j jVar = (C12892j) obj;
            C87412m.m108594g(jVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(jVar.f36875a.f140853d == this.f36871d);
        }
    }

    /* renamed from: qn1.c$d */
    public static final class C12887d extends C87413o implements C32224a<C50353m43> {

        /* renamed from: d */
        public final /* synthetic */ C12883c f36872d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C12887d(C12883c cVar) {
            super(0);
            this.f36872d = cVar;
        }

        public Object invoke() {
            C50353m43 m432 = new C50353m43();
            C12883c cVar = this.f36872d;
            m432.f137836f = C12883c.m12305a(cVar, cVar.f36865c);
            m432.f137834d = C12883c.m12305a(cVar, cVar.f36866d);
            m432.f137835e = C12883c.m12305a(cVar, cVar.f36868f);
            m432.f137837g = C12883c.m12305a(cVar, cVar.f36867e);
            return m432;
        }
    }

    /* renamed from: a */
    public static final int m12305a(C12883c cVar, List list) {
        cVar.getClass();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((Number) it.next()).intValue();
        }
        return i;
    }

    /* renamed from: b */
    public final void mo12398b() {
        try {
            if (!this.f36864b) {
                this.f36863a.clear();
                for (C12893k e : mo12402f()) {
                    C12892j e2 = mo12401e(e);
                    C51096re1 re12 = e2.f36875a;
                    if (mo12400d(re12)) {
                        mo12403g(re12.f140853d);
                    } else {
                        this.f36863a.add(e2);
                    }
                }
                Log.m105924i("Finder.NpsSurveyConfMgr", "checkLoadFromDb load config from db, size = " + this.f36863a.size());
                this.f36864b = true;
            }
        } catch (Exception e3) {
            Log.m105920e("Finder.NpsSurveyConfMgr", "checkLoadFromDb failed, message = " + e3.getMessage());
        }
    }

    /* renamed from: c */
    public final void mo12399c(C51096re1 re12, boolean z, long j) {
        boolean z2;
        T t;
        boolean z3;
        C87412m.m108594g(re12, "config");
        C12892j jVar = new C12892j(re12, z, j);
        mo12404h(jVar.f36875a.f140853d);
        mo12398b();
        int size = this.f36863a.size();
        Iterator<T> it = this.f36863a.iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C12892j) t).f36875a.f140857h > jVar.f36875a.f140857h) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        C12892j jVar2 = (C12892j) t;
        if (jVar2 != null) {
            size = this.f36863a.indexOf(jVar2);
        }
        if (size < 0 || size > this.f36863a.size()) {
            z2 = this.f36863a.add(jVar);
        } else {
            this.f36863a.add(size, jVar);
        }
        C51096re1 re13 = jVar.f36875a;
        C12893k kVar = new C12893k();
        kVar.field_taskId = re13.f140853d;
        kVar.field_conditions = re13.f140854e;
        LinkedList<Integer> linkedList = re13.f140855f;
        C87412m.m108593f(linkedList, "config.feed_pos");
        kVar.field_feedPos = C110818d0.m150921S(linkedList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C12888d.f36873d, 30, (Object) null);
        kVar.field_deliverScenes = re13.f140856g;
        kVar.field_startTime = re13.f140857h;
        kVar.field_expireTime = re13.f140858i;
        kVar.field_excludeDays = re13.f140859j;
        kVar.field_isPreview = re13.f140860n;
        kVar.field_delayAppearTime = re13.f140861o;
        kVar.field_autoDisappearTime = re13.f140862p;
        kVar.field_feedMediaTypes = re13.f140863q;
        kVar.field_isFromJumper = jVar.f36876b;
        kVar.field_bindFeedId = jVar.f36877c;
        boolean insert = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Mx0().insert(kVar);
        Log.m105924i("Finder.NpsSurveyConfMgr", "insert conf = " + kVar + " success = " + insert);
        Log.m105924i("Finder.NpsSurveyConfMgr", "insertConfig taskId = " + jVar.f36875a.f140853d + " memoryAdded = " + z2 + " dbAdded = " + insert);
    }

    /* renamed from: d */
    public final boolean mo12400d(C51096re1 re12) {
        long c = C31543z5.m39453c() / 1000;
        long j = re12.f140857h;
        boolean z = false;
        if (c < re12.f140858i && j <= c) {
            z = true;
        }
        boolean z2 = !z;
        Log.m105924i("Finder.NpsSurveyConfMgr", "isConfigExpired nowSec: " + c + " conf.start: " + re12.f140857h + " conf.expire: " + re12.f140858i + " result: " + z2);
        return z2;
    }

    /* renamed from: e */
    public final C12892j mo12401e(C12893k kVar) {
        LinkedList<Integer> linkedList;
        C51096re1 re12 = new C51096re1();
        re12.f140853d = kVar.field_taskId;
        re12.f140854e = kVar.field_conditions;
        if (!Util.isNullOrNil(kVar.field_feedPos)) {
            String str = kVar.field_feedPos;
            C87412m.m108593f(str, "localConfig.field_feedPos");
            List<String> U = C112550d0.m153785U(str, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(U, 10));
            for (String str2 : U) {
                arrayList.add(Integer.valueOf(Util.getInt(str2, -1)));
            }
            linkedList = new LinkedList<>(arrayList);
        } else {
            linkedList = new LinkedList<>();
        }
        re12.f140855f = linkedList;
        re12.f140856g = kVar.field_deliverScenes;
        re12.f140857h = kVar.field_startTime;
        re12.f140858i = kVar.field_expireTime;
        re12.f140859j = kVar.field_excludeDays;
        re12.f140860n = kVar.field_isPreview;
        re12.f140861o = kVar.field_delayAppearTime;
        re12.f140862p = kVar.field_autoDisappearTime;
        re12.f140863q = kVar.field_feedMediaTypes;
        return new C12892j(re12, kVar.field_isFromJumper, kVar.field_bindFeedId);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0051, code lost:
        cy3.C58003b.m67160a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0054, code lost:
        throw r2;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<qn1.C12893k> mo12402f() {
        /*
            r5 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            qn1.e r0 = r0.Mx0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM "
            r1.append(r2)
            java.lang.String r2 = r0.getTableName()
            r1.append(r2)
            java.lang.String r2 = " ORDER BY startTime ASC"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            if (r0 == 0) goto L_0x0055
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 0
        L_0x0035:
            boolean r4 = r0.moveToNext()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x004a
            java.lang.Class<qn1.k> r4 = qn1.C12893k.class
            java.lang.Object r4 = r4.newInstance()     // Catch:{ all -> 0x004e }
            com.tencent.mm.sdk.storage.IAutoDBItem r4 = (com.tencent.p014mm.sdk.storage.IAutoDBItem) r4     // Catch:{ all -> 0x004e }
            r4.convertFrom(r0)     // Catch:{ all -> 0x004e }
            r2.add(r4)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x004a:
            cy3.C58003b.m67160a(r0, r3)
            goto L_0x005a
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2 = move-exception
            cy3.C58003b.m67160a(r0, r1)
            throw r2
        L_0x0055:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x005a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "queryAll sql: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ", size: "
            r0.append(r1)
            int r1 = r2.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.NpsSurveyConfMgr"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qn1.C12883c.mo12402f():java.util.List");
    }

    /* renamed from: g */
    public final boolean mo12403g(long j) {
        C12889e Mx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Mx0();
        String str = "DELETE FROM " + Mx0.getTableName() + " WHERE taskId = " + j;
        boolean execSQL = Mx0.execSQL(Mx0.getTableName(), str);
        Log.m105924i("Finder.NpsSurveyConfMgr", "removeById sql: " + str + ", success: " + execSQL);
        return execSQL;
    }

    /* renamed from: h */
    public final void mo12404h(long j) {
        boolean g = mo12403g(j);
        mo12398b();
        boolean t = C64175a0.m75512t(this.f36863a, new C12886c(j));
        Log.m105924i("Finder.NpsSurveyConfMgr", "removeConfig taskId = " + j + " memoryRemoved = " + t + " dbRemoved = " + g);
    }
}
