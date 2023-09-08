package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C0327w;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy;
import com.tencent.p014mm.plugin.findersdk.receiver.HeadsetReceiver;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eu3.C58834h;
import eu3.C97749e;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C8478d0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListSet;
import mt1.C61580b;
import o40.C61926c;
import rs1.C13129bb;
import rs1.C63566lb;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C36907w;
import up1.C37521f;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler */
public final class FinderVideoRecycler extends C0327w<FinderCommonFeatureService> implements C63566lb {

    /* renamed from: e */
    public boolean f162525e = true;

    /* renamed from: f */
    public int f162526f = 1;

    /* renamed from: g */
    public int f162527g;

    /* renamed from: h */
    public final MMHandler f162528h = new MMHandler(Looper.getMainLooper());

    /* renamed from: i */
    public final HashSet<C59670o2> f162529i = new HashSet<>();

    /* renamed from: j */
    public final ConcurrentLinkedQueue<WeakReference<? extends C59670o2>> f162530j = new ConcurrentLinkedQueue<>();

    /* renamed from: n */
    public final HashMap<Integer, String> f162531n = new HashMap<>();

    /* renamed from: o */
    public final HashMap<Integer, C56697a> f162532o = new HashMap<>();

    /* renamed from: p */
    public final HashSet<String> f162533p = new HashSet<>();

    /* renamed from: q */
    public int f162534q;

    /* renamed from: r */
    public HeadsetReceiver f162535r;

    /* renamed from: s */
    public final LinkedList<C61580b> f162536s = new LinkedList<>();

    /* renamed from: t */
    public C61580b f162537t = new C56704h(this);

    /* renamed from: u */
    public C59670o2 f162538u;

    /* renamed from: v */
    public HandlerThread f162539v;

    /* renamed from: w */
    public ConcurrentSkipListSet<String> f162540w = new ConcurrentSkipListSet<>();

    /* renamed from: x */
    public final HashMap<Integer, Object> f162541x = new HashMap<>();

    /* renamed from: y */
    public final FinderVideoRecycler$onlineVideoEventListener$1 f162542y = new FinderVideoRecycler$onlineVideoEventListener$1(this, C40008f.f107254d);

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$a */
    public interface C56697a {
        /* renamed from: a */
        boolean mo80086a(C59670o2 o2Var);
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$b */
    public static final class C56698b extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Context f162543d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<C59670o2> f162544e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56698b(Context context, C8479f0<C59670o2> f0Var) {
            super(1);
            this.f162543d = context;
            this.f162544e = f0Var;
        }

        public Object invoke(Object obj) {
            T t = (C59670o2) obj;
            C87412m.m108594g(t, LocaleUtil.ITALIAN);
            int contextTag = t.getContextTag();
            Context context = this.f162543d;
            if (contextTag == (context != null ? context.hashCode() : -1) && (t.getVideoViewFocused() || t.mo78610g())) {
                this.f162544e.f27484d = t;
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$c */
    public static final class C56699c extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Class<? extends C59670o2> f162545d;

        /* renamed from: e */
        public final /* synthetic */ Context f162546e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56699c(Class<? extends C59670o2> cls, Context context) {
            super(1);
            this.f162545d = cls;
            this.f162546e = context;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f162545d.isAssignableFrom(o2Var.getClass()) && o2Var.getContextTag() == this.f162546e.hashCode());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$d */
    public static final class C56700d implements C56697a {

        /* renamed from: a */
        public final /* synthetic */ FinderVideoRecycler f162547a;

        /* renamed from: b */
        public final /* synthetic */ int f162548b;

        /* renamed from: c */
        public final /* synthetic */ String f162549c;

        /* renamed from: d */
        public final /* synthetic */ C32226l<C59670o2, C13598b0> f162550d;

        public C56700d(FinderVideoRecycler finderVideoRecycler, int i, String str, C32226l<? super C59670o2, C13598b0> lVar) {
            this.f162547a = finderVideoRecycler;
            this.f162548b = i;
            this.f162549c = str;
            this.f162550d = lVar;
        }

        /* renamed from: a */
        public boolean mo80086a(C59670o2 o2Var) {
            C87412m.m108594g(o2Var, "videoView");
            if (C87412m.m108589b(this.f162547a.f162531n.get(Integer.valueOf(this.f162548b)), this.f162549c)) {
                Log.m105924i("Finder.VideoRecycler", "getOrCreate hit cache for wait recycled for mediaId:" + this.f162549c + ' ' + this.f162548b);
                this.f162550d.invoke(o2Var);
                return true;
            }
            Log.m105924i("Finder.VideoRecycler", "getOrCreate wait for callback, but it(" + this.f162549c + ") has been replace(" + this.f162547a.f162531n.get(Integer.valueOf(this.f162548b)) + "). key=" + this.f162548b);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$e */
    public static final class C56701e extends C87413o implements C32226l<C59670o2, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ViewGroup f162551d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoRecycler f162552e;

        /* renamed from: f */
        public final /* synthetic */ C32226l<C59670o2, C13598b0> f162553f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56701e(ViewGroup viewGroup, FinderVideoRecycler finderVideoRecycler, C32226l<? super C59670o2, C13598b0> lVar) {
            super(1);
            this.f162551d = viewGroup;
            this.f162552e = finderVideoRecycler;
            this.f162553f = lVar;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            C87412m.m108594g(o2Var, "videoView");
            o2Var.setTag(Integer.valueOf(this.f162551d.hashCode()));
            int indexOfChild = this.f162551d.indexOfChild(this.f162551d.findViewById(C0966R.C0970id.kk8)) + 1;
            ViewGroup viewGroup = this.f162551d;
            View videoView = o2Var.getVideoView();
            if (indexOfChild <= 0) {
                indexOfChild = 0;
            }
            viewGroup.addView(videoView, indexOfChild, new FrameLayout.LayoutParams(-1, -1));
            o2Var.setTag(C0966R.C0970id.e8p, Long.valueOf(SystemClock.uptimeMillis()));
            this.f162552e.f162531n.put(Integer.valueOf(this.f162551d.hashCode()), (Object) null);
            this.f162553f.invoke(o2Var);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$f */
    public static final class C56702f extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ Class<? extends C59670o2> f162554d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f162555e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56702f(Class<? extends C59670o2> cls, C8478d0 d0Var) {
            super(1);
            this.f162554d = cls;
            this.f162555e = d0Var;
        }

        public Object invoke(Object obj) {
            C59670o2 o2Var = (C59670o2) obj;
            C87412m.m108594g(o2Var, LocaleUtil.ITALIAN);
            Class<? extends C59670o2> cls = this.f162554d;
            if (cls == null || cls.isAssignableFrom(o2Var.getClass())) {
                this.f162555e.f27483d++;
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$g */
    public static final class C56703g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162556d;

        public C56703g(FinderVideoRecycler finderVideoRecycler) {
            this.f162556d = finderVideoRecycler;
        }

        public final void run() {
            StringBuilder sb = new StringBuilder();
            sb.append("onFinish createdVideoViews ");
            ConcurrentLinkedQueue<WeakReference<? extends C59670o2>> concurrentLinkedQueue = this.f162556d.f162530j;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(concurrentLinkedQueue, 10));
            for (WeakReference hashCode : concurrentLinkedQueue) {
                arrayList.add(Integer.valueOf(hashCode.hashCode()));
            }
            sb.append(arrayList);
            Log.m105924i("Finder.VideoRecycler", sb.toString());
            FinderVideoRecycler finderVideoRecycler = this.f162556d;
            finderVideoRecycler.f162530j.size();
            finderVideoRecycler.getClass();
            for (WeakReference weakReference : this.f162556d.f162530j) {
                C59670o2 o2Var = (C59670o2) weakReference.get();
                if (o2Var != null) {
                    o2Var.mo78608c();
                    if (o2Var instanceof FinderThumbPlayerProxy) {
                        ((FinderThumbPlayerProxy) o2Var).mo79444N("onReleaseSync", true);
                    }
                }
            }
            this.f162556d.f162530j.clear();
            this.f162556d.f162529i.clear();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$h */
    public static final class C56704h implements C61580b {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162557d;

        public C56704h(FinderVideoRecycler finderVideoRecycler) {
            this.f162557d = finderVideoRecycler;
        }

        /* renamed from: g5 */
        public void mo80088g5(boolean z) {
            Log.m105924i("Finder.VideoRecycler", "onHeadsetStateChange on:" + z);
            for (C61580b g5 : this.f162557d.f162536s) {
                g5.mo80088g5(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$i */
    public static final class C56705i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162558d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<C59670o2, Boolean> f162559e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56705i(FinderVideoRecycler finderVideoRecycler, C32226l<? super C59670o2, Boolean> lVar) {
            super(0);
            this.f162558d = finderVideoRecycler;
            this.f162559e = lVar;
        }

        public Object invoke() {
            this.f162558d.mo80074d3(new C56746s(this.f162559e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$j */
    public static final class C56706j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162560d;

        /* renamed from: e */
        public final /* synthetic */ Context f162561e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56706j(FinderVideoRecycler finderVideoRecycler, Context context) {
            super(0);
            this.f162560d = finderVideoRecycler;
            this.f162561e = context;
        }

        public Object invoke() {
            this.f162560d.mo80074d3(new C56747t(this.f162561e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$k */
    public static final class C56707k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59670o2 f162562d;

        /* renamed from: e */
        public final /* synthetic */ FinderVideoRecycler f162563e;

        /* renamed from: f */
        public final /* synthetic */ long f162564f;

        /* renamed from: g */
        public final /* synthetic */ String f162565g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56707k(C59670o2 o2Var, FinderVideoRecycler finderVideoRecycler, long j, String str) {
            super(0);
            this.f162562d = o2Var;
            this.f162563e = finderVideoRecycler;
            this.f162564f = j;
            this.f162565g = str;
        }

        public Object invoke() {
            C59670o2 o2Var = this.f162562d;
            if (o2Var instanceof FinderThumbPlayerProxy) {
                ((FinderThumbPlayerProxy) o2Var).setOnPlayerStopListener(new C56748u(this.f162563e, o2Var, this.f162564f, this.f162565g));
                this.f162562d.mo78608c();
            } else {
                o2Var.mo78608c();
                FinderVideoRecycler finderVideoRecycler = this.f162563e;
                finderVideoRecycler.f162528h.post(new C56750v(finderVideoRecycler, this.f162562d, this.f162564f, this.f162565g));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$l */
    public static final class C56708l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162566d;

        /* renamed from: e */
        public final /* synthetic */ Context f162567e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56708l(FinderVideoRecycler finderVideoRecycler, Context context) {
            super(0);
            this.f162566d = finderVideoRecycler;
            this.f162567e = context;
        }

        public Object invoke() {
            this.f162566d.mo80074d3(new C56751w(this.f162567e));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$m */
    public static final class C56709m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderVideoRecycler f162568d;

        /* renamed from: e */
        public final /* synthetic */ Context f162569e;

        /* renamed from: f */
        public final /* synthetic */ boolean f162570f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56709m(FinderVideoRecycler finderVideoRecycler, Context context, boolean z) {
            super(0);
            this.f162568d = finderVideoRecycler;
            this.f162569e = context;
            this.f162570f = z;
        }

        public Object invoke() {
            this.f162568d.mo80074d3(new C56752x(this.f162569e, this.f162570f));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c3 */
    public static final void m65428c3(FinderVideoRecycler finderVideoRecycler, C59670o2 o2Var) {
        finderVideoRecycler.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = false;
        o2Var.setTag(C0966R.C0970id.e8p, 0);
        finderVideoRecycler.mo80074d3(new C13129bb(o2Var));
        finderVideoRecycler.f162529i.remove(o2Var);
        if (finderVideoRecycler.mo80078g3((Class<? extends C59670o2>) null) < finderVideoRecycler.f162526f && finderVideoRecycler.f162533p.contains(String.valueOf(o2Var.getVideoView().getContext().hashCode()))) {
            z = true;
        }
        if (z) {
            finderVideoRecycler.f162530j.add(new WeakReference(o2Var));
            finderVideoRecycler.f162529i.add(o2Var);
            C56697a remove = finderVideoRecycler.f162532o.remove(Integer.valueOf(o2Var.hashCode()));
            if (remove != null && remove.mo80086a(o2Var)) {
                finderVideoRecycler.f162529i.remove(o2Var);
            }
        } else {
            o2Var.mo78609d();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[recycledVideoView] ret=");
        sb.append(z);
        sb.append(" cost=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append("ms view=");
        sb.append(o2Var.hashCode());
        sb.append(" videoCount=");
        sb.append(finderVideoRecycler.mo80078g3((Class<? extends C59670o2>) null));
        sb.append(", recycledCount=");
        sb.append(finderVideoRecycler.f162529i.size());
        sb.append(", ");
        HashSet<C59670o2> hashSet = finderVideoRecycler.f162529i;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(hashSet, 10));
        Iterator<C59670o2> it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().hashCode()));
        }
        sb.append(arrayList);
        sb.append(' ');
        Log.m105924i("Finder.VideoRecycler", sb.toString());
    }

    /* renamed from: B0 */
    public void mo80066B0(C32226l<? super C59670o2, Boolean> lVar) {
        C87412m.m108594g(lVar, "filter");
        C61926c.m72668M(new C56705i(this, lVar));
    }

    /* renamed from: F2 */
    public void mo80067F2(C61580b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162536s.add(bVar);
    }

    /* renamed from: N */
    public void mo80068N(Context context) {
        C61926c.m72668M(new C56706j(this, context));
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c1  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80069R(android.view.ViewGroup r18, pl1.C62369u0 r19, fy3.C32226l<? super gr1.C59670o2, rx3.C13598b0> r20) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r0 = r19
            r1 = r20
            java.lang.String r2 = "parent"
            gy3.C87412m.m108594g(r8, r2)
            java.lang.String r2 = "finderVideo"
            gy3.C87412m.m108594g(r0, r2)
            java.lang.String r2 = "completedTo"
            gy3.C87412m.m108594g(r1, r2)
            android.content.Context r9 = r18.getContext()
            te3.rq2 r2 = r19.mo87421f()
            pl1.r0 r0 = (pl1.C62367r0) r0
            java.lang.String r10 = r0.mo11841b()
            er1.w3 r0 = er1.C58784w3.f168295a
            r0.getClass()
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0037
            int r6 = r2.f185268f
            r11 = 9
            if (r6 != r11) goto L_0x0037
            r11 = 2
            goto L_0x004a
        L_0x0037:
            if (r2 == 0) goto L_0x0049
            te3.zy r6 = r2.f185235B
            if (r6 == 0) goto L_0x0043
            boolean r6 = r6.f186905j
            if (r6 != r4) goto L_0x0043
            r6 = 1
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r11 = 1
            goto L_0x004a
        L_0x0049:
            r11 = 0
        L_0x004a:
            boolean r6 = r0.mo83894P0(r2)
            if (r6 == 0) goto L_0x0067
            r0.getClass()
            java.lang.String r0 = "localFinderMedia"
            gy3.C87412m.m108594g(r2, r0)
            boolean r0 = r2.f185280t
            if (r0 == 0) goto L_0x0062
            te3.jr2 r0 = r2.f185281u
            if (r0 == 0) goto L_0x0062
            r0 = 1
            goto L_0x0063
        L_0x0062:
            r0 = 0
        L_0x0063:
            if (r0 == 0) goto L_0x0067
            r12 = 1
            goto L_0x0068
        L_0x0067:
            r12 = 0
        L_0x0068:
            int r0 = r18.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.view.View r0 = r8.findViewWithTag(r0)
            boolean r2 = r0 instanceof gr1.C59670o2
            r13 = 0
            if (r2 == 0) goto L_0x007c
            gr1.o2 r0 = (gr1.C59670o2) r0
            goto L_0x007d
        L_0x007c:
            r0 = r13
        L_0x007d:
            java.lang.String r14 = "Finder.VideoRecycler"
            if (r0 == 0) goto L_0x00c1
            java.lang.String r2 = r0.getVideoMediaId()
            if (r2 == 0) goto L_0x0091
            java.lang.String r2 = r0.getVideoMediaId()
            boolean r2 = gy3.C87412m.m108589b(r2, r10)
            if (r2 == 0) goto L_0x00c1
        L_0x0091:
            java.lang.Object r2 = r0.getPlayer()
            if (r2 == 0) goto L_0x00c1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getOrCreate hit cache for "
            r2.append(r3)
            java.lang.String r3 = r7.mo80077f3(r10, r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r2)
            r2 = 2131304857(0x7f092199, float:1.8227868E38)
            long r3 = android.os.SystemClock.uptimeMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.setTag(r2, r3)
            r1.invoke(r0)
            return
        L_0x00c1:
            if (r0 == 0) goto L_0x00c8
            android.view.View r0 = r0.getVideoView()
            goto L_0x00c9
        L_0x00c8:
            r0 = r13
        L_0x00c9:
            r7.mo80084k3(r0)
            boolean r0 = r7.f162525e
            if (r0 == 0) goto L_0x0140
            java.util.HashMap<java.lang.Integer, java.lang.String> r0 = r7.f162531n
            int r2 = r18.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = gy3.C87412m.m108589b(r0, r10)
            if (r2 == 0) goto L_0x00e7
            return
        L_0x00e7:
            if (r0 == 0) goto L_0x011f
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r7.f162531n
            int r4 = r18.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2.put(r4, r10)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "replace callback. "
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = " => "
            r2.append(r0)
            r2.append(r10)
            java.lang.String r0 = ", parent="
            r2.append(r0)
            int r0 = r18.hashCode()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            goto L_0x0140
        L_0x011f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "wait for callback. mediaId="
            r0.append(r2)
            r0.append(r10)
            java.lang.String r2 = " parent="
            r0.append(r2)
            int r2 = r18.hashCode()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
        L_0x0140:
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$e r15 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$e
            r15.<init>(r8, r7, r1)
            if (r11 == 0) goto L_0x016f
            if (r11 == r3) goto L_0x0162
            java.lang.Class<lr.b> r0 = p599lr.C61381b.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            lr.b r0 = (p599lr.C61381b) r0
            qo1.k r0 = r0.pa0()
            java.lang.Object r0 = r0.mo12425f()
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.plugin.finder.video.IFinderVideoView>"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x0160:
            r1 = r0
            goto L_0x0185
        L_0x0162:
            java.lang.Class<tf0.q1> r0 = tf0.C13887q1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.q1 r0 = (tf0.C13887q1) r0
            java.lang.Class r0 = r0.S40()
            goto L_0x0160
        L_0x016f:
            java.lang.Class<dz.h> r0 = p501dz.C58466h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            dz.h r0 = (p501dz.C58466h) r0
            boolean r0 = r0.mo31868LF()
            if (r0 == 0) goto L_0x0182
            if (r12 != 0) goto L_0x0182
            java.lang.Class<com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy> r0 = com.tencent.p014mm.plugin.finder.video.FinderThumbPlayerProxy.class
            goto L_0x0160
        L_0x0182:
            java.lang.Class<com.tencent.mm.plugin.finder.video.FinderCropVideoView> r0 = com.tencent.p014mm.plugin.finder.video.FinderCropVideoView.class
            goto L_0x0160
        L_0x0185:
            boolean r0 = r9 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            if (r0 == 0) goto L_0x026a
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore r0 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160325a
            r0.getClass()
            java.lang.String r0 = "mediaId"
            gy3.C87412m.m108594g(r10, r0)
            pl1.r0 r0 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160327c
            if (r0 == 0) goto L_0x019c
            java.lang.String r0 = r0.mo11841b()
            goto L_0x019d
        L_0x019c:
            r0 = r13
        L_0x019d:
            boolean r0 = gy3.C87412m.m108589b(r0, r10)
            if (r0 == 0) goto L_0x0234
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getCacheFinderVideoView: usedMedia="
            r0.append(r2)
            com.tencent.mm.plugin.finder.storage.FeedData r2 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160328d
            if (r2 == 0) goto L_0x01b6
            java.lang.String r2 = r2.getDescription()
            goto L_0x01b7
        L_0x01b6:
            r2 = r13
        L_0x01b7:
            if (r2 == 0) goto L_0x01d4
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L_0x01c0
            goto L_0x01d4
        L_0x01c0:
            r4 = 4
            int r6 = r2.length()
            int r4 = java.lang.Math.min(r4, r6)
            java.lang.String r2 = r2.substring(r5, r4)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            gy3.C87412m.m108593f(r2, r4)
            goto L_0x01d6
        L_0x01d4:
            java.lang.String r2 = ""
        L_0x01d6:
            r0.append(r2)
            r2 = 46
            r0.append(r2)
            pl1.r0 r2 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160327c
            if (r2 == 0) goto L_0x01e7
            java.lang.String r2 = r2.mo11841b()
            goto L_0x01e8
        L_0x01e7:
            r2 = r13
        L_0x01e8:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FinderPlayerPreloadCore"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160326b
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e
            if (r2 == 0) goto L_0x022b
            androidx.lifecycle.r r4 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160330f
            if (r4 == 0) goto L_0x0215
            android.content.Context r5 = r2.getContext()
            boolean r6 = r5 instanceof androidx.appcompat.app.AppCompatActivity
            if (r6 == 0) goto L_0x0209
            androidx.appcompat.app.AppCompatActivity r5 = (androidx.appcompat.app.AppCompatActivity) r5
            goto L_0x020a
        L_0x0209:
            r5 = r13
        L_0x020a:
            if (r5 == 0) goto L_0x0215
            androidx.lifecycle.j r5 = r5.getLifecycle()
            if (r5 == 0) goto L_0x0215
            r5.removeObserver(r4)
        L_0x0215:
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160330f = r13
            r2.removeAllViews()
            android.view.ViewParent r4 = r2.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x0225
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0226
        L_0x0225:
            r4 = r13
        L_0x0226:
            if (r4 == 0) goto L_0x022b
            r4.removeView(r2)
        L_0x022b:
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160329e = r13
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160326b = r13
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160327c = r13
            com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderPlayerPreloadCore.f160328d = r13
            goto L_0x0235
        L_0x0234:
            r0 = r13
        L_0x0235:
            if (r0 == 0) goto L_0x026a
            java.lang.Class r2 = r0.getClass()
            boolean r2 = r1.isAssignableFrom(r2)
            if (r2 == 0) goto L_0x026a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getOrCreate: hit preload cache mediaId="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            int r1 = r9.hashCode()
            r0.setContextTag(r1)
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.ref.WeakReference<? extends gr1.o2>> r1 = r7.f162530j
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r0)
            r1.add(r2)
            r15.invoke(r0)
            return
        L_0x026a:
            java.util.HashSet<gr1.o2> r0 = r7.f162529i
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$c r2 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$c
            r2.<init>(r1, r9)
            java.lang.Object r0 = o40.C61926c.m72672Q(r0, r2)
            gr1.o2 r0 = (gr1.C59670o2) r0
            if (r0 == 0) goto L_0x02ae
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[getOrCreate] get a recycled videoView("
            r1.append(r2)
            int r2 = r0.hashCode()
            r1.append(r2)
            java.lang.String r2 = ") parent="
            r1.append(r2)
            int r2 = r18.hashCode()
            r1.append(r2)
            java.lang.String r2 = " videoCount="
            r1.append(r2)
            int r2 = r7.mo80078g3(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r1)
            r15.invoke(r0)
            goto L_0x03d9
        L_0x02ae:
            int r0 = r7.mo80078g3(r1)
            java.util.HashMap<java.lang.Integer, java.lang.Object> r2 = r7.f162541x
            int r2 = r2.size()
            int r6 = r0 - r2
            int r0 = r7.f162526f
            java.lang.String r5 = "context"
            if (r6 < r0) goto L_0x03aa
            boolean r4 = r7.f162525e
            gy3.e0 r2 = new gy3.e0
            r2.<init>()
            r19 = r14
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.f124000d = r13
            gy3.f0 r13 = new gy3.f0
            r13.<init>()
            int[] r3 = new int[r3]
            rs1.za r14 = new rs1.za
            r0 = r14
            r8 = r5
            r5 = r17
            r16 = r11
            r11 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.mo80074d3(r14)
            T r0 = r13.f27484d
            gr1.o2 r0 = (gr1.C59670o2) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[getOrCreate] over count(max="
            r1.append(r2)
            int r2 = r7.f162526f
            r1.append(r2)
            r2 = 58
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = ") releasingVideoSize:"
            r1.append(r2)
            java.util.HashMap<java.lang.Integer, java.lang.Object> r2 = r7.f162541x
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = " waitForRelease="
            r1.append(r2)
            boolean r2 = r7.f162525e
            r1.append(r2)
            java.lang.String r2 = " oldest="
            r1.append(r2)
            if (r0 == 0) goto L_0x032a
            int r2 = r0.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x032b
        L_0x032a:
            r2 = 0
        L_0x032b:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = r19
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            boolean r1 = r7.f162525e
            java.lang.String r3 = "getOrCreate"
            if (r1 == 0) goto L_0x0380
            if (r0 == 0) goto L_0x0364
            int r1 = r18.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.util.HashMap<java.lang.Integer, java.lang.String> r5 = r7.f162531n
            r5.put(r4, r10)
            java.util.HashMap<java.lang.Integer, com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$a> r4 = r7.f162532o
            int r5 = r0.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$d r6 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler$d
            r6.<init>(r7, r1, r10, r15)
            r4.put(r5, r6)
            r7.mo80082j3(r0, r3)
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0365
        L_0x0364:
            r13 = 0
        L_0x0365:
            if (r13 != 0) goto L_0x03d9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[getOrCreate] oldest is null! parent="
            r0.append(r1)
            int r1 = r18.hashCode()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r0)
            goto L_0x03d9
        L_0x0380:
            if (r0 == 0) goto L_0x0385
            r7.mo80082j3(r0, r3)
        L_0x0385:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getOrCreate hit create and release old for "
            r1.append(r3)
            java.lang.String r0 = r7.mo80077f3(r10, r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gy3.C87412m.m108593f(r9, r8)
            r3 = r16
            gr1.o2 r0 = r7.mo80075e3(r9, r3, r12)
            r15.invoke(r0)
            goto L_0x03d9
        L_0x03aa:
            r8 = r5
            r3 = r11
            r2 = r14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "getOrCreate hit create for mediaId:"
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = " releasing:"
            r0.append(r1)
            java.util.HashMap<java.lang.Integer, java.lang.Object> r1 = r7.f162541x
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            gy3.C87412m.m108593f(r9, r8)
            gr1.o2 r0 = r7.mo80075e3(r9, r3, r12)
            r15.invoke(r0)
        L_0x03d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.mo80069R(android.view.ViewGroup, pl1.u0, fy3.l):void");
    }

    /* renamed from: Y */
    public void mo80070Y(boolean z, Context context) {
        C61926c.m72668M(new C56709m(this, context, z));
    }

    /* renamed from: Z2 */
    public void mo80071Z2() {
        Log.m105924i("Finder.VideoRecycler", "releaseUnFocusView before createdVideoViews:" + this.f162530j.size() + " recycledVideoViews:" + this.f162529i.size());
        Iterator<WeakReference<? extends C59670o2>> it = this.f162530j.iterator();
        while (it.hasNext()) {
            C59670o2 o2Var = (C59670o2) it.next().get();
            if (o2Var != null) {
                if (!C87412m.m108589b(o2Var, this.f162538u)) {
                    Log.m105924i("Finder.VideoRecycler", "releaseUnFocusView view:" + o2Var + " mediaid:" + o2Var.getVideoMediaId());
                    o2Var.mo78608c();
                    o2Var.mo78609d();
                    mo80084k3(o2Var.getVideoView());
                    it.remove();
                } else {
                    Log.m105924i("Finder.VideoRecycler", "releaseUnFocusView return for view:" + o2Var + " mediaid:" + o2Var.getVideoMediaId());
                }
            }
        }
        Log.m105924i("Finder.VideoRecycler", "releaseUnFocusView after createdVideoViews:" + this.f162530j.size() + " recycledVideoViews:" + this.f162529i.size());
    }

    /* renamed from: a0 */
    public void mo80072a0() {
        Log.m105924i("Finder.VideoRecycler", "releaseAllView before createdVideoViews:" + this.f162530j.size() + " recycledVideoViews:" + this.f162529i.size());
        Iterator<WeakReference<? extends C59670o2>> it = this.f162530j.iterator();
        while (it.hasNext()) {
            C59670o2 o2Var = (C59670o2) it.next().get();
            if (o2Var != null) {
                Log.m105924i("Finder.VideoRecycler", "releaseAllView view:" + o2Var + " mediaid:" + o2Var.getVideoMediaId());
                o2Var.mo78608c();
                o2Var.mo78609d();
                mo80084k3(o2Var.getVideoView());
                it.remove();
            }
        }
        Log.m105924i("Finder.VideoRecycler", "releaseAllView after createdVideoViews:" + this.f162530j.size() + " recycledVideoViews:" + this.f162529i.size());
    }

    /* renamed from: c1 */
    public void mo80073c1(C59670o2 o2Var) {
        Log.m105924i("Finder.VideoRecycler", "markRecentFocusView videoView:" + o2Var);
        this.f162538u = o2Var;
    }

    /* renamed from: d3 */
    public final void mo80074d3(C32226l<? super C59670o2, Boolean> lVar) {
        C13598b0 b0Var;
        C87412m.m108594g(lVar, "isRemoveFun");
        Iterator<WeakReference<? extends C59670o2>> it = this.f162530j.iterator();
        while (it.hasNext()) {
            C59670o2 o2Var = (C59670o2) it.next().get();
            if (o2Var != null) {
                if (lVar.invoke(o2Var).booleanValue()) {
                    Log.m105924i("Finder.VideoRecycler", "acrossCreatedVideoViews 1 remove it:" + o2Var + " mediaid:" + o2Var.getVideoMediaId());
                    it.remove();
                }
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                Log.m105924i("Finder.VideoRecycler", "acrossCreatedVideoViews 2 remove");
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.mm.plugin.finder.video.FinderCropVideoView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: com.tencent.mm.plugin.finder.video.FinderCropVideoView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: com.tencent.mm.plugin.finder.video.FinderCropVideoView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: com.tencent.mm.plugin.finder.video.FinderCropVideoView} */
    /* JADX WARNING: type inference failed for: r6v13, types: [gr1.a, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: e3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gr1.C59670o2 mo80075e3(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1
            if (r6 != r2) goto L_0x0027
            java.lang.Class<lr.b> r6 = p599lr.C61381b.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            lr.b r6 = (p599lr.C61381b) r6
            qo1.k r6 = r6.pa0()
            java.lang.Object r6 = r6.mo12420a(r5)
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.IFinderVideoView"
            gy3.C87412m.m108592e(r6, r7)
            gr1.o2 r6 = (gr1.C59670o2) r6
            int r7 = r5.hashCode()
            r6.setContextTag(r7)
            goto L_0x00af
        L_0x0027:
            r2 = 2
            java.lang.String r3 = "getContext()"
            if (r6 != r2) goto L_0x0058
            java.lang.Class<tf0.q1> r6 = tf0.C13887q1.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            tf0.q1 r6 = (tf0.C13887q1) r6
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r3)
            gr1.o2 r6 = r6.mo13333W8(r7)
            int r7 = r5.hashCode()
            r6.setContextTag(r7)
            gr1.l2 r7 = r6.getVideoAdapter()
            if (r7 == 0) goto L_0x00af
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r7.setContextSimpleName(r2)
            goto L_0x00af
        L_0x0058:
            java.lang.Class<dz.h> r6 = p501dz.C58466h.class
            di3.d r6 = di3.C86312j.m106911c(r6)
            dz.h r6 = (p501dz.C58466h) r6
            boolean r6 = r6.mo31868LF()
            if (r6 == 0) goto L_0x00a3
            if (r7 != 0) goto L_0x00a3
            up1.f r6 = up1.C37521f.f99374d
            r6.getClass()
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99286S7
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 <= 0) goto L_0x008f
            gr1.a r6 = new gr1.a
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r3)
            r6.<init>(r7)
            int r7 = r5.hashCode()
            r6.setContextTag(r7)
            goto L_0x00af
        L_0x008f:
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r6 = new com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            gy3.C87412m.m108593f(r7, r3)
            r6.<init>(r7)
            int r7 = r5.hashCode()
            r6.setContextTag(r7)
            goto L_0x00af
        L_0x00a3:
            com.tencent.mm.plugin.finder.video.FinderCropVideoView r6 = new com.tencent.mm.plugin.finder.video.FinderCropVideoView
            r6.<init>(r5)
            int r7 = r5.hashCode()
            r6.setContextTag(r7)
        L_0x00af:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.ref.WeakReference<? extends gr1.o2>> r7 = r4.f162530j
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r6)
            r7.add(r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "[createVideoView] activity="
            r7.append(r2)
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r7.append(r5)
            java.lang.String r5 = " videoCount="
            r7.append(r5)
            r5 = 0
            int r5 = r4.mo80078g3(r5)
            r7.append(r5)
            java.lang.String r5 = " videoView="
            r7.append(r5)
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r7.append(r5)
            java.lang.String r5 = " cost="
            r7.append(r5)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r7.append(r2)
            java.lang.String r5 = "ms"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            java.lang.String r7 = "Finder.VideoRecycler"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.mo80075e3(android.content.Context, int, boolean):gr1.o2");
    }

    /* renamed from: f1 */
    public void mo80076f1(Context context) {
        C61926c.m72668M(new C56708l(this, context));
    }

    /* renamed from: f3 */
    public final String mo80077f3(String str, C59670o2 o2Var) {
        if (o2Var instanceof FinderThumbPlayerProxy) {
            return "ftpp:" + ((FinderThumbPlayerProxy) o2Var).getFTPPTag() + " mediaId:" + str;
        }
        return "mediaId:" + str;
    }

    /* renamed from: g3 */
    public final int mo80078g3(Class<? extends C59670o2> cls) {
        C8478d0 d0Var = new C8478d0();
        mo80074d3(new C56702f(cls, d0Var));
        return d0Var.f27483d;
    }

    /* renamed from: i3 */
    public final void mo80079i3() {
        Log.m105924i("Finder.VideoRecycler", "onFinish");
        this.f162538u = null;
        this.f162542y.dead();
        this.f162528h.post(new C56703g(this));
        this.f162533p.clear();
        this.f162532o.clear();
        this.f162536s.clear();
        HeadsetReceiver headsetReceiver = this.f162535r;
        if (headsetReceiver != null) {
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            headsetReceiver.mo80134c(context);
        }
    }

    /* renamed from: j0 */
    public void mo80080j0(AppCompatActivity appCompatActivity, boolean z) {
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        String valueOf = String.valueOf(appCompatActivity.hashCode());
        if (this.f162534q == 0) {
            this.f162542y.alive();
            C13604l<Integer, Boolean> Q = C37521f.f99374d.mo61163Q();
            this.f162526f = ((Number) Q.f38555d).intValue();
            this.f162525e = ((Boolean) Q.f38556e).booleanValue();
            int i = this.f162526f - 1;
            if (i > 4) {
                i = 4;
            }
            this.f162527g = i;
            HeadsetReceiver headsetReceiver = new HeadsetReceiver();
            this.f162535r = headsetReceiver;
            Context context = MMApplicationContext.getContext();
            C87412m.m108593f(context, "getContext()");
            headsetReceiver.mo80133b(context, this.f162537t);
            boolean z2 = C37521f.f99146C8.mo60266n().intValue() == 1;
            if (this.f162539v == null && z2) {
                int i2 = C58834h.f168432b;
                HandlerThread a = C97749e.m126093a("FinderTPWorkThread", 0);
                this.f162539v = a;
                a.start();
            }
            Log.m105924i("Finder.VideoRecycler", "[onInit] maxVideoCount=" + this.f162526f + " preInflateCount=" + this.f162527g + " waitForRelease=" + this.f162525e + " enableFinderTpWorkThreadReuse:" + z2);
        }
        if (this.f162533p.add(valueOf)) {
            Log.m105924i("Finder.VideoRecycler", "[register] activity=" + appCompatActivity.getClass().getSimpleName() + " key:" + valueOf + " activityCount:" + this.f162534q + " isPreInflate=" + z);
            this.f162534q = this.f162534q + 1;
            appCompatActivity.getLifecycle().addObserver(new FinderVideoRecycler$make$1(this, appCompatActivity, valueOf));
        }
    }

    /* renamed from: j1 */
    public void mo80081j1(C61580b bVar) {
        C87412m.m108594g(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f162536s.remove(bVar);
    }

    /* renamed from: j3 */
    public final void mo80082j3(C59670o2 o2Var, String str) {
        if (this.f162541x.containsKey(Integer.valueOf(o2Var.hashCode()))) {
            Log.m105928w("Finder.VideoRecycler", "[releaseVideoView] videoView=" + o2Var.hashCode() + " is releasing, source=" + str);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f162541x.put(Integer.valueOf(o2Var.hashCode()), new Object());
        mo80084k3(o2Var.getVideoView());
        o2Var.pause();
        StringBuilder sb = new StringBuilder();
        sb.append("[releaseVideoView] async release videoView(");
        sb.append(o2Var.hashCode());
        sb.append(") parent=");
        ViewParent parentView = o2Var.getParentView();
        sb.append(parentView != null ? parentView.hashCode() : 0);
        sb.append(" source=");
        sb.append(str);
        Log.m105924i("Finder.VideoRecycler", sb.toString());
        C61926c.m72656A((String) null, new C56707k(o2Var, this, currentTimeMillis, str));
    }

    /* renamed from: k0 */
    public void mo80083k0(ViewGroup viewGroup, boolean z, boolean z2) {
        C87412m.m108594g(viewGroup, "parent");
        this.f162531n.put(Integer.valueOf(viewGroup.hashCode()), (Object) null);
        View findViewWithTag = viewGroup.findViewWithTag(Integer.valueOf(viewGroup.hashCode()));
        if (findViewWithTag instanceof C59670o2) {
            C59670o2 o2Var = (C59670o2) findViewWithTag;
            o2Var.getVideoMediaId();
            Log.m105924i("Finder.VideoRecycler", "[pauseOrRecycle] pauseWithCancel mediaId:" + o2Var.getVideoMediaId() + " videoView(" + o2Var.hashCode() + ") isForceRemove=" + z + " isTryKeep=" + z2);
            o2Var.setVideoViewFocused(false);
            if (z2 || !z) {
                o2Var.mo51226q();
            } else {
                mo80082j3(o2Var, "pauseAndRecycle");
            }
        }
    }

    /* renamed from: k3 */
    public final boolean mo80084k3(View view) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return false;
        }
        this.f162531n.put(Integer.valueOf(parent.hashCode()), (Object) null);
        ViewGroup viewGroup = (ViewGroup) parent;
        viewGroup.removeView(view);
        Log.m105924i("Finder.VideoRecycler", "[removeViewFromParent] parent=" + parent.hashCode() + ", videoView=" + view.hashCode() + ", parentTag=" + viewGroup.getTag());
        return true;
    }

    public void onCleared() {
        Log.m105924i("Finder.VideoRecycler", "[onCleared] videoCount=" + mo80078g3((Class<? extends C59670o2>) null));
        mo80079i3();
    }

    /* renamed from: x */
    public C59670o2 mo80085x(Context context) {
        C8479f0 f0Var = new C8479f0();
        mo80074d3(new C56698b(context, f0Var));
        return (C59670o2) f0Var.f27484d;
    }
}
