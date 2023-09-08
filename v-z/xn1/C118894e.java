package xn1;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import gs1.C59695l;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.json.JSONObject;
import p849e3.C107168a0;
import p849e3.C107207u;
import xn1.C118888a;
import xn1.C66375g;

/* renamed from: xn1.e */
public final class C118894e extends RecyclerView.C0130p {

    /* renamed from: d */
    public final String f356172d;

    /* renamed from: e */
    public C118888a.C118890b f356173e;

    /* renamed from: f */
    public int f356174f;

    /* renamed from: g */
    public final Handler f356175g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public boolean f356176h;

    /* renamed from: i */
    public final boolean f356177i;

    /* renamed from: j */
    public long f356178j;

    /* renamed from: n */
    public int f356179n;

    /* renamed from: xn1.e$a */
    public static final class C118895a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C118894e f356180d;

        public C118895a(C118894e eVar) {
            this.f356180d = eVar;
        }

        public final void run() {
            C118888a.C118890b bVar = this.f356180d.f356173e;
            if (bVar != null) {
                C118888a.C118889a aVar = bVar.f356162e;
                long j = aVar.f356151c;
                if (aVar.f356152d <= 0) {
                    aVar.f356152d = System.nanoTime();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007d, code lost:
        if (r6 < r5) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (r6 < r5) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        if (r6 < r5) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        if (r6 < r5) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b8, code lost:
        if (r6 < r5) goto L_0x00ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C118894e(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "scene"
            gy3.C87412m.m108594g(r11, r0)
            r10.<init>()
            r10.f356172d = r11
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r10.f356175g = r0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = xn1.C38775f.f104593a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Boolean> r0 = xn1.C38775f.f104593a
            java.lang.Object r1 = r0.get(r11)
            if (r1 != 0) goto L_0x00fd
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x003e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r1 != 0) goto L_0x003e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_P_ALPHA
            if (r1 != 0) goto L_0x003e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_RED
            if (r1 != 0) goto L_0x003e
            boolean r1 = qe3.C89625d.f257844j
            if (r1 != 0) goto L_0x003e
            boolean r1 = com.tencent.p014mm.sdk.platformtools.WeChatEnvironment.hasDebugger()
            if (r1 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r1 = 0
            goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            java.lang.ref.WeakReference r4 = com.tencent.p014mm.app.AppForegroundDelegate.m161224g()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r4.get()
            android.app.Activity r4 = (android.app.Activity) r4
            if (r4 == 0) goto L_0x0058
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x0058
            int r4 = xn1.C91312b.m114551a(r4)
            goto L_0x0059
        L_0x0058:
            r4 = 0
        L_0x0059:
            r5 = 0
            if (r1 != 0) goto L_0x00bc
            r6 = 70
            r7 = 1036831949(0x3dcccccd, float:0.1)
            if (r4 <= r6) goto L_0x0066
            r5 = 1036831949(0x3dcccccd, float:0.1)
        L_0x0066:
            long r8 = java.lang.System.currentTimeMillis()
            ky3.c r6 = ky3.C88336d.m110136a(r8)
            float r6 = r6.mo122716e()
            java.lang.String r8 = "FinderHomeAffinityUI#"
            boolean r8 = z04.C112551y.m153819s(r11, r8, r3)
            if (r8 == 0) goto L_0x0080
            float r5 = r5 + r7
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00ba
        L_0x0080:
            java.lang.String r7 = "FinderShareFeedRelUI#"
            boolean r7 = z04.C112551y.m153819s(r11, r7, r3)
            if (r7 == 0) goto L_0x0091
            r7 = 1043878380(0x3e3851ec, float:0.18)
            float r5 = r5 + r7
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00ba
        L_0x0091:
            java.lang.String r7 = "FinderCommentDrawer#"
            boolean r7 = z04.C112551y.m153819s(r11, r7, r3)
            if (r7 == 0) goto L_0x00a2
            r7 = 1045220557(0x3e4ccccd, float:0.2)
            float r5 = r5 + r7
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00ba
        L_0x00a2:
            java.lang.String r7 = "FinderLive"
            boolean r7 = z04.C112551y.m153819s(r11, r7, r3)
            if (r7 == 0) goto L_0x00b3
            r7 = 1058642330(0x3f19999a, float:0.6)
            float r5 = r5 + r7
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bc
            goto L_0x00ba
        L_0x00b3:
            r7 = 1048576000(0x3e800000, float:0.25)
            float r5 = r5 + r7
            int r6 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00bc
        L_0x00ba:
            r6 = 1
            goto L_0x00bd
        L_0x00bc:
            r6 = 0
        L_0x00bd:
            if (r1 != 0) goto L_0x00c3
            if (r6 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r2 = 0
        L_0x00c3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "scene="
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = " enable="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r3 = " threshold="
            r1.append(r3)
            r1.append(r5)
            java.lang.String r3 = " refreshRate="
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.PerformanceConfig"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r11 = r0.putIfAbsent(r11, r1)
            if (r11 != 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r1 = r11
        L_0x00fd:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.String r11 = "enable"
            gy3.C87412m.m108593f(r1, r11)
            boolean r11 = r1.booleanValue()
            r10.f356177i = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xn1.C118894e.<init>(java.lang.String):void");
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        C87412m.m108594g(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (!this.f356177i) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        if (!this.f356176h) {
            this.f356176h = true;
            Context context = recyclerView.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type android.app.Activity");
            Window window = ((Activity) context).getWindow();
            C87412m.m108593f(window, "recyclerView.context as Activity).window");
            int a = 1000 / C91312b.m114551a(window);
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C59695l lVar = layoutManager instanceof C59695l ? (C59695l) layoutManager : null;
            if (lVar != null) {
                lVar.mo77960d(new C118893d(a, this));
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            if (!C107207u.C107211e.m145207b(recyclerView)) {
                JSONObject jSONObject = new JSONObject();
                int i2 = this.f356179n;
                if (i2 > 0) {
                    jSONObject.put("avgScrollCostMs", C60641c.m70922c((double) ((((float) this.f356178j) * 1.0f) / ((float) i2))));
                    ((C66375g.C66377b) C66375g.f191088a).mo90471a(this.f356172d, jSONObject);
                }
                C118888a.f356146a.mo183586a(C66375g.f191088a);
            } else {
                recyclerView.addOnAttachStateChangeListener(new C118892c(recyclerView, this));
            }
        }
        Context context2 = recyclerView.getContext();
        C87412m.m108592e(context2, "null cannot be cast to non-null type android.app.Activity");
        Window window2 = ((Activity) context2).getWindow();
        if (i != 0) {
            if ((i == 1 || i == 2) && this.f356174f == 0) {
                C118888a.C118890b bVar = this.f356173e;
                if (bVar != null) {
                    C118888a.C118889a aVar = bVar.f356162e;
                    long j = aVar.f356151c;
                    if (aVar.f356152d <= 0) {
                        aVar.f356152d = System.nanoTime();
                    }
                }
                String str = this.f356172d;
                C87412m.m108593f(window2, "window");
                C118888a.C118890b bVar2 = new C118888a.C118890b(str, window2, this.f356175g);
                bVar2.mo183590a();
                this.f356173e = bVar2;
            }
        } else if (recyclerView.getScrollState() == 0) {
            recyclerView.post(new C118895a(this));
        }
        this.f356174f = i;
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        super.onScrolled(recyclerView, i, i2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/performance/FinderFpsScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
