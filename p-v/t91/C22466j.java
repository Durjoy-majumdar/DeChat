package t91;

import android.app.Activity;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.config.C115411b;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import i20.C21043a;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o91.C21787e;
import r91.C22219c;
import rx3.C13598b0;
import t91.C36981l;
import t91.C64208c;
import v91.C22728c;
import v91.C22730d;
import v91.C22734j;

/* renamed from: t91.j */
public final class C22466j {

    /* renamed from: a */
    public static final C22466j f63621a = new C22466j();

    /* renamed from: b */
    public static final HashMap<String, List<Pair<String, String>>> f63622b;

    /* renamed from: c */
    public static C21153d f63623c = new C22467a();

    /* renamed from: d */
    public static final List<C22462f> f63624d = new ArrayList();

    /* renamed from: e */
    public static final C22468k f63625e = new C22468k();

    /* renamed from: f */
    public static final C22457b f63626f = new C22457b();

    /* renamed from: g */
    public static final C36981l f63627g = new C36981l();

    /* renamed from: h */
    public static final C22219c f63628h = new C22219c();

    /* renamed from: i */
    public static final C21787e f63629i = new C21787e();

    /* renamed from: j */
    public static final C22730d f63630j = new C22730d();

    /* renamed from: k */
    public static final C22451a f63631k = new C22451a();

    /* renamed from: l */
    public static final C101740m f63632l = new C101740m();

    /* renamed from: t91.j$a */
    public static final class C22467a implements C21153d {
        /* renamed from: a */
        public void mo32409a(String str, String str2, String str3, Object obj, Object obj2) {
        }

        /* renamed from: b */
        public void mo32410b(String str, String str2, String str3, Object obj, Object[] objArr) {
            if (!C87412m.m108589b("onScrollStateChanged", str2) || !C87412m.m108589b("(Landroidx/recyclerview/widget/RecyclerView;I)V", str3)) {
                if (C87412m.m108589b("onScrolled", str2) && C87412m.m108589b("(Landroidx/recyclerview/widget/RecyclerView;II)V", str3) && objArr != null && objArr.length >= 3) {
                    RecyclerView recyclerView = objArr[0];
                    if (recyclerView instanceof RecyclerView) {
                        Integer num = objArr[1];
                        C87412m.m108592e(num, "null cannot be cast to non-null type kotlin.Int");
                        int intValue = num.intValue();
                        Integer num2 = objArr[2];
                        C87412m.m108592e(num2, "null cannot be cast to non-null type kotlin.Int");
                        C22466j.f63621a.mo35608f(recyclerView, intValue, num2.intValue());
                    }
                }
            } else if (objArr != null && objArr.length >= 2) {
                RecyclerView recyclerView2 = objArr[0];
                if (recyclerView2 instanceof RecyclerView) {
                    Integer num3 = objArr[1];
                    C87412m.m108592e(num3, "null cannot be cast to non-null type kotlin.Int");
                    C22466j.f63621a.mo35607e(recyclerView2, num3.intValue());
                }
            }
        }
    }

    static {
        HashMap<String, List<Pair<String, String>>> hashMap = new HashMap<>();
        f63622b = hashMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V"));
        arrayList.add(Pair.create("onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V"));
        hashMap.put("androidx/recyclerview/widget/RecyclerView$OnScrollListener", arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r1 = r1.f62954a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.fragment.app.Fragment m26184a() {
        /*
            t91.b r0 = f63626f
            r91.b r1 = r0.f63606e
            r2 = 0
            if (r1 == 0) goto L_0x0012
            java.lang.ref.WeakReference<androidx.fragment.app.Fragment> r1 = r1.f62954a
            if (r1 == 0) goto L_0x0012
            java.lang.Object r1 = r1.get()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            goto L_0x0013
        L_0x0012:
            r1 = r2
        L_0x0013:
            if (r1 != 0) goto L_0x0025
            java.lang.ref.WeakReference<com.tencent.mm.ui.component.UIComponentActivity> r1 = r0.f63607f
            if (r1 == 0) goto L_0x0020
            java.lang.Object r1 = r1.get()
            r2 = r1
            com.tencent.mm.ui.component.UIComponentActivity r2 = (com.tencent.p014mm.p136ui.component.UIComponentActivity) r2
        L_0x0020:
            r1 = -1
            com.tencent.mm.ui.component.UIComponentFragment r1 = r0.mo35599b(r2, r1)
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t91.C22466j.m26184a():androidx.fragment.app.Fragment");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010a  */
    /* renamed from: b */
    public static final void m26185b(android.app.Activity r20, long r21) {
        /*
            r0 = r21
            v91.d r2 = f63630j
            r2.getClass()
            if (r20 != 0) goto L_0x000b
            goto L_0x028a
        L_0x000b:
            java.lang.Class r3 = r20.getClass()
            java.lang.String r3 = r3.getName()
            java.util.ArrayList<java.lang.String> r4 = t91.C64208c.f181942I
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L_0x001d
            goto L_0x028a
        L_0x001d:
            java.lang.String r3 = e91.C116711b.m164583h(r3)
            if (r3 != 0) goto L_0x0025
            goto L_0x028a
        L_0x0025:
            int r4 = r20.hashCode()
            android.content.Intent r5 = r20.getIntent()
            java.lang.String r6 = "key_enter_source_info"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 != 0) goto L_0x0037
            java.lang.String r5 = ""
        L_0x0037:
            r6 = 0
            r2.f65378c = r6
            java.lang.String r6 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onFinishActivityV1: sPage="
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", hashCode="
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", enterSourceInfo="
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            v91.f$a r6 = v91.C22731f.f65379a
            te3.la3 r6 = r6.mo35822g(r3, r4)
            r8 = 0
            if (r6 != 0) goto L_0x006b
            goto L_0x0198
        L_0x006b:
            java.lang.String r9 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "onFinishActivityV1: compare, "
            r10.append(r11)
            java.lang.String r11 = r6.f64160e
            r10.append(r11)
            java.lang.String r11 = " == "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r11 = ", "
            r10.append(r11)
            int r11 = r6.f64161f
            r10.append(r11)
            java.lang.String r11 = " == "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            r6.f64164i = r0
            long r9 = r6.f64163h
            long r9 = r0 - r9
            java.util.LinkedList<java.lang.Long> r11 = r6.f64168p
            java.lang.String r12 = "statistics.stayTimeOnBackground"
            gy3.C87412m.m108593f(r11, r12)
            boolean r12 = r11.isEmpty()
            r13 = 2
            if (r12 == 0) goto L_0x00b3
            goto L_0x00fe
        L_0x00b3:
            int r12 = r11.size()
            int r12 = r12 % r13
            if (r12 == 0) goto L_0x00bd
            r11.removeLast()
        L_0x00bd:
            int r12 = r11.size()
            my3.j r12 = my3.C61595o.m72301i(r8, r12)
            my3.h r12 = my3.C61595o.m72300h(r12, r13)
            int r7 = r12.f175174d
            int r8 = r12.f175175e
            int r12 = r12.f175176f
            if (r12 <= 0) goto L_0x00d3
            if (r7 <= r8) goto L_0x00d7
        L_0x00d3:
            if (r12 >= 0) goto L_0x00fe
            if (r8 > r7) goto L_0x00fe
        L_0x00d7:
            r16 = 0
        L_0x00d9:
            int r13 = r7 + 1
            java.lang.Object r13 = r11.get(r13)
            java.lang.Number r13 = (java.lang.Number) r13
            long r18 = r13.longValue()
            java.lang.Object r13 = r11.get(r7)
            java.lang.String r14 = "timePairLsit[i]"
            gy3.C87412m.m108593f(r13, r14)
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            long r18 = r18 - r13
            long r16 = r16 + r18
            if (r7 == r8) goto L_0x0100
            int r7 = r7 + r12
            r13 = 2
            goto L_0x00d9
        L_0x00fe:
            r16 = 0
        L_0x0100:
            long r9 = r9 - r16
            r7 = 0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 >= 0) goto L_0x010a
            r14 = r7
            goto L_0x010b
        L_0x010a:
            r14 = r9
        L_0x010b:
            r6.f64162g = r14
            java.lang.String r7 = e91.C116711b.m164579d()
            r6.f64165j = r7
            r7 = 2
            r6.f64167o = r7
            r6.f64170r = r5
            u91.a$a r8 = u91.C22618a.f65058a
            u91.c r6 = r2.mo35815a(r6, r7)
            r8.mo35741b(r6)
            v91.f$a r6 = v91.C22731f.f65379a
            monitor-enter(r6)
            te3.na3 r7 = r6.mo35816a()     // Catch:{ all -> 0x028e }
            if (r7 != 0) goto L_0x012c
            monitor-exit(r6)
            goto L_0x017a
        L_0x012c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x028e }
            r8.<init>()     // Catch:{ all -> 0x028e }
            r8.append(r3)     // Catch:{ all -> 0x028e }
            r8.append(r4)     // Catch:{ all -> 0x028e }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x028e }
            java.util.LinkedList<te3.ma3> r9 = r7.f184449d     // Catch:{ all -> 0x028e }
            java.lang.String r10 = "pageMap.map"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x028e }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x028e }
        L_0x0147:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x028e }
            if (r10 == 0) goto L_0x0162
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x028e }
            te3.ma3 r10 = (te3.C64549ma3) r10     // Catch:{ all -> 0x028e }
            java.lang.String r11 = r10.f184256d     // Catch:{ all -> 0x028e }
            boolean r11 = gy3.C87412m.m108589b(r8, r11)     // Catch:{ all -> 0x028e }
            if (r11 == 0) goto L_0x0147
            java.util.LinkedList<te3.ma3> r8 = r7.f184449d     // Catch:{ all -> 0x028e }
            r8.remove(r10)     // Catch:{ all -> 0x028e }
            r8 = 1
            goto L_0x0163
        L_0x0162:
            r8 = 0
        L_0x0163:
            if (r8 == 0) goto L_0x0179
            java.util.LinkedList<te3.ma3> r8 = r7.f184449d     // Catch:{ all -> 0x028e }
            boolean r8 = r8.isEmpty()     // Catch:{ all -> 0x028e }
            if (r8 == 0) goto L_0x0176
            java.lang.String r7 = "hell_pge_sttics_d_1"
            r8 = 0
            byte[] r9 = new byte[r8]     // Catch:{ all -> 0x028e }
            f91.C116850b.m164834d(r7, r9)     // Catch:{ all -> 0x028e }
            goto L_0x0179
        L_0x0176:
            r6.mo35818c(r7)     // Catch:{ all -> 0x028e }
        L_0x0179:
            monitor-exit(r6)
        L_0x017a:
            java.lang.String r6 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onFinishActivityV1: report, "
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
        L_0x0198:
            java.lang.String r6 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "onFinishActivityV2: sPage="
            r7.append(r8)
            r7.append(r3)
            java.lang.String r8 = ", hashCode="
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = ", enterSourceInfo="
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            v91.f$a r6 = v91.C22731f.f65379a
            te3.la3 r7 = r6.mo35823h(r3, r4)
            if (r7 != 0) goto L_0x01c8
            goto L_0x028a
        L_0x01c8:
            java.lang.String r8 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "onFinishActivityV2: compare, "
            r9.append(r10)
            java.lang.String r10 = r7.f64160e
            r9.append(r10)
            java.lang.String r10 = " == "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = ", "
            r9.append(r10)
            int r10 = r7.f64161f
            r9.append(r10)
            java.lang.String r10 = " == "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r9)
            r7.f64164i = r0
            long r8 = r7.f64163h
            long r0 = r0 - r8
            r7.f64162g = r0
            java.lang.String r0 = e91.C116711b.m164579d()
            r7.f64165j = r0
            r0 = 1
            r7.f64167o = r0
            r7.f64170r = r5
            u91.a$a r1 = u91.C22618a.f65058a
            u91.c r2 = r2.mo35815a(r7, r0)
            r1.mo35741b(r2)
            monitor-enter(r6)
            te3.na3 r1 = r6.mo35817b()     // Catch:{ all -> 0x028b }
            if (r1 != 0) goto L_0x021e
            monitor-exit(r6)
            goto L_0x026c
        L_0x021e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x028b }
            r2.<init>()     // Catch:{ all -> 0x028b }
            r2.append(r3)     // Catch:{ all -> 0x028b }
            r2.append(r4)     // Catch:{ all -> 0x028b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x028b }
            java.util.LinkedList<te3.ma3> r5 = r1.f184449d     // Catch:{ all -> 0x028b }
            java.lang.String r7 = "pageMap.map"
            gy3.C87412m.m108593f(r5, r7)     // Catch:{ all -> 0x028b }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x028b }
        L_0x0239:
            boolean r7 = r5.hasNext()     // Catch:{ all -> 0x028b }
            if (r7 == 0) goto L_0x0254
            java.lang.Object r7 = r5.next()     // Catch:{ all -> 0x028b }
            te3.ma3 r7 = (te3.C64549ma3) r7     // Catch:{ all -> 0x028b }
            java.lang.String r8 = r7.f184256d     // Catch:{ all -> 0x028b }
            boolean r8 = gy3.C87412m.m108589b(r2, r8)     // Catch:{ all -> 0x028b }
            if (r8 == 0) goto L_0x0239
            java.util.LinkedList<te3.ma3> r2 = r1.f184449d     // Catch:{ all -> 0x028b }
            r2.remove(r7)     // Catch:{ all -> 0x028b }
            r7 = 1
            goto L_0x0255
        L_0x0254:
            r7 = 0
        L_0x0255:
            if (r7 == 0) goto L_0x026b
            java.util.LinkedList<te3.ma3> r0 = r1.f184449d     // Catch:{ all -> 0x028b }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x028b }
            if (r0 == 0) goto L_0x0268
            java.lang.String r0 = "hell_pge_sttics_d_3"
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x028b }
            f91.C116850b.m164834d(r0, r1)     // Catch:{ all -> 0x028b }
            goto L_0x026b
        L_0x0268:
            r6.mo35819d(r1)     // Catch:{ all -> 0x028b }
        L_0x026b:
            monitor-exit(r6)
        L_0x026c:
            java.lang.String r0 = "HABBYGE-MALI.FinderShareStatistics"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onFinishActivityV2: report, "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x028a:
            return
        L_0x028b:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x028e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t91.C22466j.m26185b(android.app.Activity, long):void");
    }

    /* renamed from: g */
    public static final void m26186g(String str) {
        C22457b bVar = f63626f;
        bVar.f63602a = str;
        if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            Log.m105924i("HABBYGE-MALI.FinderFragmentCallback", "monitor...");
            bVar.f63610i = -1;
            bVar.f63604c = true;
            bVar.f63605d = false;
            synchronized (bVar.f63612k) {
                if (!bVar.f63611j) {
                    bVar.f63611j = true;
                    C21043a.m23197h().mo32759m(bVar.f63613l, bVar.f63614m);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: h */
    public static final void m26187h(Activity activity, Fragment fragment, long j, int i) {
        C22219c cVar = f63628h;
        cVar.getClass();
        String name = fragment == null ? activity != null ? activity.getClass().getName() : null : fragment.getClass().getName();
        if (C64208c.f181943J.contains(name)) {
            Log.m105924i("HABBYGE-MALI.WaterfallsFlowMonitor", "monitor: poageName=" + name);
            C22466j jVar = f63621a;
            C22219c.C22220a aVar = cVar.f62960b;
            synchronized (jVar) {
                C87412m.m108594g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                List<C22462f> list = f63624d;
                if (!((ArrayList) list).contains(aVar)) {
                    ((ArrayList) list).add(aVar);
                }
            }
            C22734j jVar2 = new C22734j(activity, fragment);
            cVar.f62959a = jVar2;
            if (fragment == null) {
                String name2 = activity != null ? activity.getClass().getName() : null;
                if (!C87412m.m108589b(name2, C64208c.f181938E)) {
                    Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, ACTION: Back to activity !!");
                    jVar2.mo35836g(activity, j);
                } else if (C87412m.m108589b(name2, C64208c.f181940G)) {
                    Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, ACTION: 7Event !!");
                    jVar2.mo35836g(activity, j);
                } else {
                    Log.m105924i("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, ACTION: startActivity !!");
                }
                C64208c.f181939F = null;
                C64208c.f181938E = null;
            } else if (i == 0) {
                Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, fragment, resume !!");
                jVar2.mo35836g(fragment, j);
            } else if (i != 2) {
                Log.printErrStackTrace("HABBYGE-MALI.WaterfallsFlowStatistics", new NullPointerException("startCompute, fragment, miss !!"), "", new Object[0]);
            } else {
                Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, fragment, 7Event !!");
                jVar2.mo35836g(fragment, j);
            }
            C22728c.C22729a aVar2 = jVar2.f65419n.f65373e;
            C87412m.m108594g(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            synchronized (f63631k) {
                List<C22461e> list2 = C22451a.f63586k;
                if (!((ArrayList) list2).contains(aVar2)) {
                    ((ArrayList) list2).add(aVar2);
                }
            }
        }
    }

    /* renamed from: i */
    public static final void m26188i(String str) {
        C22457b bVar = f63626f;
        bVar.f63603b = str;
        if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            Log.m105924i("HABBYGE-MALI.FinderFragmentCallback", "unmonitor...");
            bVar.f63604c = false;
            bVar.f63605d = true;
            synchronized (bVar.f63612k) {
                C21043a.m23197h().mo32763q(bVar.f63613l, bVar.f63614m);
                bVar.f63611j = false;
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: j */
    public static final void m26189j(String str) {
        RecyclerView recyclerView;
        C22468k kVar = f63625e;
        kVar.getClass();
        if (!(!C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderTimelineMachineUI", str) && !C87412m.m108589b("com.tencent.mm.plugin.finder.search.FinderMixSearchUI", str) && !C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderFavFeedUI", str))) {
            Log.m105924i("HABBYGE-MALI.RecyclerItemDecorationCallback", "unmonitor");
            WeakReference<RecyclerView> weakReference = kVar.f63633a;
            if (!(weakReference == null || (recyclerView = weakReference.get()) == null)) {
                recyclerView.mo17098m1(kVar.f63636d);
            }
            WeakReference<RecyclerView> weakReference2 = kVar.f63633a;
            if (weakReference2 != null) {
                weakReference2.clear();
            }
            kVar.f63633a = null;
            C21043a.m23197h().mo32763q(kVar.f63634b, kVar.f63635c);
        }
    }

    /* renamed from: k */
    public static final void m26190k(String str) {
        if (C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.OccupyFinderUI5", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            f63631k.mo35598c();
            return;
        }
        String c = C115411b.f345922a.mo175246c();
        if (c != null) {
            switch (c.hashCode()) {
                case 48626:
                    if (!c.equals("101")) {
                        return;
                    }
                    break;
                case 48627:
                    if (!c.equals("102")) {
                        return;
                    }
                    break;
                case 48690:
                    if (!c.equals("123")) {
                        return;
                    }
                    break;
                case 56601:
                    if (!c.equals("999")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderTopicFeedUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI", str) || C87412m.m108589b("com.tencent.mm.plugin.finder.feed.ui.FinderNewUIB", str)) {
                f63631k.mo35598c();
            }
        }
    }

    /* renamed from: l */
    public static final void m26191l(Activity activity, Fragment fragment, long j, int i) {
        C22219c cVar = f63628h;
        cVar.getClass();
        String name = fragment == null ? activity != null ? activity.getClass().getName() : null : fragment.getClass().getName();
        C64208c.C64209a aVar = C64208c.f181951a;
        if (C64208c.f181943J.contains(name)) {
            Log.m105924i("HABBYGE-MALI.WaterfallsFlowMonitor", "unmonitor: poageName=" + name);
            C22466j jVar = f63621a;
            C22219c.C22220a aVar2 = cVar.f62960b;
            synchronized (jVar) {
                C87412m.m108594g(aVar2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                ((ArrayList) f63624d).remove(aVar2);
            }
            C22734j jVar2 = cVar.f62959a;
            if (jVar2 != null) {
                boolean z = false;
                if (fragment == null) {
                    String name2 = activity != null ? activity.getClass().getName() : null;
                    Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "stopCompute: pageName=" + name2);
                    if (C87412m.m108589b(name2, C64208c.f181939F)) {
                        Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "stopCompute: ACTION: finish cur page !");
                        jVar2.f65411f = 1;
                        z = true;
                    } else if (C87412m.m108589b(name2, C64208c.f181938E) || C64208c.f181938E == null) {
                        Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "stopCompute: ACTION: 8Event !");
                        jVar2.f65411f = 2;
                    } else {
                        Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "stopCompute: ACTION: startActivity another page !");
                        jVar2.f65411f = 1;
                    }
                    jVar2.mo35837h(activity, j);
                    if (z) {
                        Log.m105924i("HABBYGE-MALI.HellFinderConfig", "resetFeedIdCache...");
                        ((ArrayList) C64208c.f181975y).clear();
                        ((ArrayList) C64208c.f181976z).clear();
                        ((ArrayList) C64208c.f181934A).clear();
                    }
                } else if (i == 1) {
                    Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, fragment, pause !!");
                    jVar2.f65411f = 1;
                    jVar2.mo35837h(fragment, j);
                } else if (i != 3) {
                    Log.printErrStackTrace("HABBYGE-MALI.WaterfallsFlowStatistics", new NullPointerException("startCompute, fragment, miss !!"), "", new Object[0]);
                } else {
                    Log.m105918d("HABBYGE-MALI.WaterfallsFlowStatistics", "startCompute, fragment, 8Event !!");
                    jVar2.f65411f = 2;
                    jVar2.mo35837h(fragment, j);
                }
                C22728c.C22729a aVar3 = jVar2.f65419n.f65373e;
                C87412m.m108594g(aVar3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                synchronized (f63631k) {
                    ((ArrayList) C22451a.f63586k).remove(aVar3);
                }
            }
            cVar.f62959a = null;
        }
    }

    /* renamed from: c */
    public final synchronized void mo35605c(String str, C36981l.C36982a aVar) {
        Iterator it = ((ArrayList) f63624d).iterator();
        while (it.hasNext()) {
            ((C22462f) it.next()).mo35355b(str, aVar);
        }
    }

    /* renamed from: d */
    public final synchronized void mo35606d(String str, C36981l.C36982a aVar) {
        Iterator it = ((ArrayList) f63624d).iterator();
        while (it.hasNext()) {
            ((C22462f) it.next()).mo35354a(str, aVar);
        }
    }

    /* renamed from: e */
    public final synchronized void mo35607e(RecyclerView recyclerView, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Iterator it = ((ArrayList) f63624d).iterator();
        while (it.hasNext()) {
            ((C22462f) it.next()).mo35356c(recyclerView, i);
        }
    }

    /* renamed from: f */
    public final synchronized void mo35608f(RecyclerView recyclerView, int i, int i2) {
        C87412m.m108594g(recyclerView, "recyclerView");
        Iterator it = ((ArrayList) f63624d).iterator();
        while (it.hasNext()) {
            ((C22462f) it.next()).mo35359f(recyclerView, i, i2);
        }
    }
}
