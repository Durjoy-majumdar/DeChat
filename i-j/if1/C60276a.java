package if1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60152b4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import o40.C61926c;
import rx3.C13604l;
import te3.C51978xi1;
import te3.C64586nn1;

/* renamed from: if1.a */
public final class C60276a {

    /* renamed from: a */
    public static final C60276a f171840a = new C60276a();

    /* renamed from: if1.a$b */
    public static final class C8884b extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C8884b f28151d = new C8884b();

        public C8884b() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "FinderLiveEntrance"));
        }
    }

    /* renamed from: if1.a$a */
    public static final class C60277a extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C60277a f171841d = new C60277a();

        public C60277a() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "FinderLiveEntrance"));
        }
    }

    /* renamed from: if1.a$c */
    public static final class C60278c extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C60278c f171842d = new C60278c();

        public C60278c() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "NearbyLiveTab"));
        }
    }

    /* renamed from: if1.a$d */
    public static final class C60279d extends C87413o implements C32226l<C64586nn1, Boolean> {

        /* renamed from: d */
        public static final C60279d f171843d = new C60279d();

        public C60279d() {
            super(1);
        }

        public Object invoke(Object obj) {
            return Boolean.valueOf(C87412m.m108589b(((C64586nn1) obj).f184507i, "NearbyEntrance"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = r11.f144672g;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85252a(te3.C51978xi1 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0025
            java.util.LinkedList<te3.nn1> r1 = r11.f144672g
            if (r1 == 0) goto L_0x0025
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.nn1 r3 = (te3.C64586nn1) r3
            java.lang.String r3 = r3.f184507i
            java.lang.String r4 = "FinderLiveEntrance"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x000b
            r0 = r2
        L_0x0023:
            te3.nn1 r0 = (te3.C64586nn1) r0
        L_0x0025:
            r3 = r0
            if (r11 == 0) goto L_0x0033
            java.util.LinkedList<te3.nn1> r0 = r11.f144672g
            if (r0 == 0) goto L_0x0033
            if1.a$a r1 = if1.C60276a.C60277a.f171841d
            boolean r0 = o40.C61926c.m72675T(r0, r1)
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0054
            er1.w3 r0 = er1.C58784w3.f168295a
            er1.j4 r0 = er1.C58739j4.f168176a
            if (r11 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0054
            dp1.v0 r1 = dp1.C58413v0.f167346a
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = new com.tencent.mm.plugin.finder.extension.reddot.s0
            r2.<init>()
            r4 = 0
            r2.mo77305l2(r11, r4)
            r4 = 5
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            dp1.C58413v0.m67782j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.C60276a.mo85252a(te3.xi1):void");
    }

    /* renamed from: b */
    public final void mo85253b(String str) {
        C64586nn1 nn12;
        T t;
        String str2 = str;
        Class cls = FinderCommonFeatureService.class;
        C87412m.m108594g(str2, FirebaseAnalytics.C113379b.SOURCE);
        Log.m105924i("Finder.RedDotManager", "[removeFinderLiveEntranceShowInfo] " + str2);
        for (C55718s0 s0Var : ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77277q()) {
            LinkedList<C64586nn1> linkedList = s0Var.field_ctrInfo.f144672g;
            Boolean bool = null;
            if (linkedList != null) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C87412m.m108589b(((C64586nn1) t).f184507i, "FinderLiveEntrance")) {
                        break;
                    }
                }
                nn12 = (C64586nn1) t;
            } else {
                nn12 = null;
            }
            if (!(nn12 != null)) {
                s0Var = null;
            }
            if (s0Var != null) {
                LinkedList<C64586nn1> linkedList2 = s0Var.field_ctrInfo.f144672g;
                if (linkedList2 != null) {
                    bool = Boolean.valueOf(C61926c.m72675T(linkedList2, C8884b.f28151d));
                }
                Log.m105924i("Finder.RedDotManager", "removeFinderLiveEntranceShowInfo " + str2 + " result:" + bool);
                LinkedList<C64586nn1> linkedList3 = s0Var.field_ctrInfo.f144672g;
                if (linkedList3 != null) {
                    ArrayList<C64586nn1> arrayList = new ArrayList<>();
                    for (T next : linkedList3) {
                        if (C87412m.m108589b(((C64586nn1) next).f184508j, "FinderLiveEntrance")) {
                            arrayList.add(next);
                        }
                    }
                    for (C64586nn1 nn13 : arrayList) {
                        nn13.f184506h = 1;
                        nn13.f184508j = "";
                    }
                }
                C51978xi1 xi12 = new C51978xi1();
                xi12.parseFrom(s0Var.field_ctrInfo.toByteArray());
                C60152b4.C8759a.m8561a(((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0(), xi12, "removeFinderLiveEntranceShowInfo", (HashSet) null, false, (C13604l) null, (C32226l) null, 0, false, 252, (Object) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = r11.f144672g;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85254c(te3.C51978xi1 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0025
            java.util.LinkedList<te3.nn1> r1 = r11.f144672g
            if (r1 == 0) goto L_0x0025
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.nn1 r3 = (te3.C64586nn1) r3
            java.lang.String r3 = r3.f184507i
            java.lang.String r4 = "NearbyLiveTab"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x000b
            r0 = r2
        L_0x0023:
            te3.nn1 r0 = (te3.C64586nn1) r0
        L_0x0025:
            r3 = r0
            if (r11 == 0) goto L_0x0033
            java.util.LinkedList<te3.nn1> r0 = r11.f144672g
            if (r0 == 0) goto L_0x0033
            if1.a$c r1 = if1.C60276a.C60278c.f171842d
            boolean r0 = o40.C61926c.m72675T(r0, r1)
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0054
            er1.w3 r0 = er1.C58784w3.f168295a
            er1.j4 r0 = er1.C58739j4.f168176a
            if (r11 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0054
            dp1.v0 r1 = dp1.C58413v0.f167346a
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = new com.tencent.mm.plugin.finder.extension.reddot.s0
            r2.<init>()
            r4 = 0
            r2.mo77305l2(r11, r4)
            r4 = 5
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            dp1.C58413v0.m67782j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.C60276a.mo85254c(te3.xi1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = r11.f144672g;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85255d(te3.C51978xi1 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0025
            java.util.LinkedList<te3.nn1> r1 = r11.f144672g
            if (r1 == 0) goto L_0x0025
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            r3 = r2
            te3.nn1 r3 = (te3.C64586nn1) r3
            java.lang.String r3 = r3.f184507i
            java.lang.String r4 = "NearbyEntrance"
            boolean r3 = gy3.C87412m.m108589b(r3, r4)
            if (r3 == 0) goto L_0x000b
            r0 = r2
        L_0x0023:
            te3.nn1 r0 = (te3.C64586nn1) r0
        L_0x0025:
            r3 = r0
            if (r11 == 0) goto L_0x0033
            java.util.LinkedList<te3.nn1> r0 = r11.f144672g
            if (r0 == 0) goto L_0x0033
            if1.a$d r1 = if1.C60276a.C60279d.f171843d
            boolean r0 = o40.C61926c.m72675T(r0, r1)
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0054
            er1.w3 r0 = er1.C58784w3.f168295a
            er1.j4 r0 = er1.C58739j4.f168176a
            if (r11 == 0) goto L_0x0054
            if (r3 == 0) goto L_0x0054
            dp1.v0 r1 = dp1.C58413v0.f167346a
            com.tencent.mm.plugin.finder.extension.reddot.s0 r2 = new com.tencent.mm.plugin.finder.extension.reddot.s0
            r2.<init>()
            r4 = 0
            r2.mo77305l2(r11, r4)
            r4 = 5
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 48
            r9 = 0
            dp1.C58413v0.m67782j(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.C60276a.mo85255d(te3.xi1):void");
    }
}
