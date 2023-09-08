package ia1;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import o91.C100312d;
import o91.C100316i;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.u84;
import te3.v84;

/* renamed from: ia1.h */
public final class C98625h extends RecyclerView.C0130p implements C11385n {

    /* renamed from: p */
    public static volatile C98625h f289179p;

    /* renamed from: d */
    public WeakReference<Activity> f289180d;

    /* renamed from: e */
    public C100312d f289181e = new C100312d(0, "16242", "1000");

    /* renamed from: f */
    public C98621f f289182f = new C98621f();

    /* renamed from: g */
    public int f289183g = 0;

    /* renamed from: h */
    public final C100316i f289184h = new C98626a();

    /* renamed from: i */
    public final C98620c f289185i = new C98627b();

    /* renamed from: j */
    public Field f289186j;

    /* renamed from: n */
    public int f289187n = 0;

    /* renamed from: o */
    public int f289188o = 0;

    /* renamed from: ia1.h$a */
    public class C98626a implements C100316i {
        public C98626a() {
        }

        /* renamed from: a */
        public void mo35476a(ViewGroup viewGroup, int i) {
            C98625h hVar = C98625h.this;
            hVar.getClass();
            int i2 = i != 0 ? i != 1 ? i != 2 ? -1 : 2 : 1 : 0;
            hVar.f289183g = i2;
            if (i2 == 1) {
                try {
                    hVar.f289187n = ((Integer) hVar.f289186j.get(viewGroup)).intValue();
                } catch (Exception e) {
                    Log.printErrStackTrace("HABBYGE-MALI.SnsMonitor", e, "beginScrollState", new Object[0]);
                }
            } else if (i2 == 2) {
                hVar.mo138057c(viewGroup);
            } else if (i2 == 0) {
                hVar.f289188o = 0;
            }
            hVar.f289181e.mo139594p(viewGroup, i2);
        }

        /* renamed from: b */
        public void mo35477b(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
            WeakReference<Activity> weakReference = C98625h.this.f289180d;
            if (weakReference != null) {
                Activity activity = weakReference.get();
                if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                    Log.printInfoStack("HABBYGE-MALI.SnsMonitor", "SnsMonitor onScroll is NULL or finishing", new Object[0]);
                    return;
                }
                C98625h hVar = C98625h.this;
                if (hVar.f289183g == 1) {
                    hVar.mo138057c(viewGroup);
                }
                hVar.f289181e.mo139593o(activity, viewGroup, i, i2, hVar.f289188o);
            }
        }
    }

    /* renamed from: ia1.h$b */
    public class C98627b implements C98620c {
        public C98627b() {
        }
    }

    public C98625h() {
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mMotionY");
            this.f289186j = declaredField;
            declaredField.setAccessible(true);
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.SnsMonitor", e, "SnsMonitor, crash: %s", e.getMessage());
        }
    }

    /* renamed from: a */
    public static C98625h m128225a() {
        if (f289179p == null) {
            synchronized (C98625h.class) {
                if (f289179p == null) {
                    f289179p = new C98625h();
                }
            }
        }
        return f289179p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo138056b(int r7, java.lang.String r8, android.app.Activity r9) {
        /*
            r6 = this;
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"
            boolean r0 = r0.equals(r8)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0015
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r0 = 0
            goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            if (r0 != 0) goto L_0x0019
            return
        L_0x0019:
            boolean r0 = d91.C20449a.m22052d()
            if (r0 == 0) goto L_0x0059
            com.tencent.mm.pointers.PBool r0 = d91.C20449a.f57470d
            if (r0 != 0) goto L_0x0041
            pa1.c r0 = pa1.C35418c.m40699b()
            h81.h$c r3 = h81.C32735h.C32737c.clicfg_hellhound_timeline_switch
            java.lang.String r4 = "1"
            java.lang.String r0 = r0.mo60251c(r3, r4, r1)
            com.tencent.mm.pointers.PBool r3 = new com.tencent.mm.pointers.PBool
            r3.<init>()
            d91.C20449a.f57470d = r3
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.getInt((java.lang.String) r0, (int) r1)
            if (r0 <= 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            r3.value = r0
        L_0x0041:
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r3 = "meizu"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0050
            com.tencent.mm.pointers.PBool r0 = d91.C20449a.f57470d
            r0.value = r1
        L_0x0050:
            com.tencent.mm.pointers.PBool r0 = d91.C20449a.f57470d
            boolean r0 = r0.value
            if (r0 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r0 = 0
            goto L_0x005a
        L_0x0059:
            r0 = 1
        L_0x005a:
            java.lang.String r3 = "HABBYGE-MALI.SnsMonitor"
            if (r0 == 0) goto L_0x0064
            java.lang.String r7 = "SnsMonitor, monitor, dontNeedMonitorTimeline true !!"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r7)
            return
        L_0x0064:
            r0 = 2
            java.lang.Object[] r4 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4[r1] = r5
            r4[r2] = r8
            java.lang.String r8 = "SnsMonitor, monitor: %d, %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r3, r8, r4)
            if (r7 == 0) goto L_0x009c
            if (r7 == r2) goto L_0x0092
            if (r7 == r0) goto L_0x0088
            r8 = 3
            if (r7 == r8) goto L_0x007e
            goto L_0x00ac
        L_0x007e:
            g91.c r7 = g91.C20813c.m22810a()
            r8 = 703(0x2bf, float:9.85E-43)
            r7.mo32507b(r8)
            goto L_0x00ac
        L_0x0088:
            g91.c r7 = g91.C20813c.m22810a()
            r8 = 702(0x2be, float:9.84E-43)
            r7.mo32507b(r8)
            goto L_0x00ac
        L_0x0092:
            g91.c r7 = g91.C20813c.m22810a()
            r8 = 701(0x2bd, float:9.82E-43)
            r7.mo32507b(r8)
            goto L_0x00ac
        L_0x009c:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r9)
            r6.f289180d = r7
            g91.c r7 = g91.C20813c.m22810a()
            r8 = 700(0x2bc, float:9.81E-43)
            r7.mo32507b(r8)
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia1.C98625h.mo138056b(int, java.lang.String, android.app.Activity):void");
    }

    /* renamed from: c */
    public final void mo138057c(ViewGroup viewGroup) {
        try {
            this.f289188o = ((Integer) this.f289186j.get(viewGroup)).intValue() - this.f289187n;
        } catch (Exception e) {
            Log.printErrStackTrace("HABBYGE-MALI.SnsMonitor", e, "SnsMonitor, beginFlingState, crash: %s", e.getMessage());
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            u84 u84 = (u84) ((C47350c) yVar.getReqResp()).f127056b.f127083a;
            if (this.f289181e != null) {
                String str2 = u84.f299589A + "";
                Log.m105925i("HABBYGE-MALI.SnsMonitor", "SnsMonitor, monitor, session:%s", str2);
                C100312d dVar = this.f289181e;
                v84 v84 = dVar.f293846f;
                if (v84 != null) {
                    String str3 = v84.f299662o;
                    if (TextUtils.isEmpty(str3)) {
                        dVar.f293846f.f299662o = str2;
                        return;
                    }
                    dVar.f293846f.f299662o = str3 + "#" + str2;
                }
            }
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        Log.m105918d("HABBYGE-MALI.SnsMonitor", "onScrollStateChanged");
        C100312d dVar = this.f289181e;
        int i2 = 2;
        if (i == 0) {
            i2 = 0;
        } else if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            i2 = -1;
        }
        dVar.mo139594p(recyclerView, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r15, int r16, int r17) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r15)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0.add(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor"
            java.lang.String r1 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r2 = "onScrolled"
            java.lang.String r3 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            r4 = r14
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.f289180d
            java.lang.String r8 = "(Landroidx/recyclerview/widget/RecyclerView;II)V"
            java.lang.String r9 = "onScrolled"
            java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
            java.lang.String r11 = "com/tencent/mm/plugin/expt/hellhound/ext/sns/SnsMonitor"
            if (r0 != 0) goto L_0x003d
            j20.C117292a.m165361g(r14, r11, r10, r9, r8)
            return
        L_0x003d:
            java.lang.String r0 = "recyclerView"
            gy3.C87412m.m108594g(r15, r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r15.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r2 = 0
            if (r1 != 0) goto L_0x004e
            r0 = r2
            goto L_0x0050
        L_0x004e:
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
        L_0x0050:
            r1 = -1
            if (r0 == 0) goto L_0x005f
            int r3 = r0.mo16957C()     // Catch:{ Exception -> 0x005e }
            int r1 = r0.getItemCount()     // Catch:{ Exception -> 0x005c }
            goto L_0x0060
        L_0x005c:
            goto L_0x0060
        L_0x005e:
        L_0x005f:
            r3 = -1
        L_0x0060:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = 0
            r0[r5] = r4
            int r4 = r15.getChildCount()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12 = 1
            r0[r12] = r4
            r4 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r4] = r1
            java.lang.String r1 = "HABBYGE-MALI.SnsMonitor"
            java.lang.String r4 = "onScrolled firstVisibleItemPosition [%d], visibleItemCount [%d], itemCount [%d]"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r1, r4, r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r6.f289180d
            java.lang.Object r0 = r0.get()
            r4 = r0
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x00cc
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x00cc
            boolean r0 = r4.isDestroyed()
            if (r0 == 0) goto L_0x009c
            goto L_0x00cc
        L_0x009c:
            o91.d r0 = r6.f289181e
            int r1 = r15.getChildCount()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = r15.getLayoutManager()
            boolean r13 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r13 != 0) goto L_0x00ab
            goto L_0x00ae
        L_0x00ab:
            r2 = r5
            androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
        L_0x00ae:
            if (r2 == 0) goto L_0x00bf
            int r5 = r2.mo16957C()     // Catch:{ Exception -> 0x00bf }
            int r2 = r2.mo16959E()     // Catch:{ Exception -> 0x00bf }
            int r2 = r2 - r5
            int r2 = r2 + r12
            if (r2 <= r1) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r5 = r2
            goto L_0x00c0
        L_0x00bf:
            r5 = r1
        L_0x00c0:
            r1 = r4
            r2 = r15
            r4 = r5
            r5 = r17
            r0.mo139593o(r1, r2, r3, r4, r5)
            j20.C117292a.m165361g(r14, r11, r10, r9, r8)
            return
        L_0x00cc:
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r2 = "SnsMonitor onScroll is NULL or finishing"
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r1, r2, r0)
            j20.C117292a.m165361g(r14, r11, r10, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia1.C98625h.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}
