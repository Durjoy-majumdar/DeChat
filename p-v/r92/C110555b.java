package r92;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import h92.C108178b;
import j20.C117292a;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k20.C60958c;
import k20.C9556a;
import nj3.C88990b;
import p849e3.C107168a0;
import p849e3.C107207u;
import rx3.C13598b0;

/* renamed from: r92.b */
public class C110555b extends FrameLayout {

    /* renamed from: P */
    public static final int f330647P = C74942w4.m89784a(MMApplicationContext.getContext(), 36);

    /* renamed from: Q */
    public static final int f330648Q;

    /* renamed from: R */
    public static final float[] f330649R;

    /* renamed from: A */
    public boolean f330650A = true;

    /* renamed from: B */
    public float f330651B;

    /* renamed from: C */
    public boolean f330652C;

    /* renamed from: D */
    public View f330653D;

    /* renamed from: E */
    public int f330654E = -1;

    /* renamed from: F */
    public int f330655F = -1;

    /* renamed from: G */
    public View f330656G;

    /* renamed from: H */
    public View f330657H;

    /* renamed from: I */
    public int f330658I;

    /* renamed from: J */
    public int f330659J;

    /* renamed from: K */
    public float f330660K = 1.0f;

    /* renamed from: L */
    public int f330661L = -1;

    /* renamed from: M */
    public int f330662M = -1;

    /* renamed from: N */
    public C110557b f330663N = C110557b.COLLAPSED;

    /* renamed from: d */
    public C108178b f330664d;

    /* renamed from: e */
    public boolean f330665e = true;

    /* renamed from: f */
    public boolean f330666f;

    /* renamed from: g */
    public boolean f330667g;

    /* renamed from: h */
    public Vibrator f330668h;

    /* renamed from: i */
    public View.OnClickListener f330669i;

    /* renamed from: j */
    public CopyOnWriteArrayList<C110556a> f330670j = new CopyOnWriteArrayList<>();

    /* renamed from: n */
    public int f330671n = 1;

    /* renamed from: o */
    public int f330672o = 1;

    /* renamed from: p */
    public boolean f330673p;

    /* renamed from: q */
    public boolean f330674q = false;

    /* renamed from: r */
    public final boolean f330675r = true;

    /* renamed from: s */
    public int f330676s = ((int) 2566914048L);

    /* renamed from: t */
    public final Paint f330677t = new Paint();

    /* renamed from: u */
    public final Path f330678u = new Path();

    /* renamed from: v */
    public float f330679v;

    /* renamed from: w */
    public float f330680w;

    /* renamed from: x */
    public float f330681x;

    /* renamed from: y */
    public float f330682y;

    /* renamed from: z */
    public final Rect f330683z = new Rect();

    /* renamed from: r92.b$a */
    public interface C110556a {
        /* renamed from: D1 */
        boolean mo162047D1();

        /* renamed from: L */
        void mo162048L(float f);

        /* renamed from: Z */
        void mo162049Z(int i, int i2);

        /* renamed from: a3 */
        void mo162050a3(View view, C110557b bVar, C110557b bVar2);

        /* renamed from: i */
        void mo162051i(View view, float f);

        /* renamed from: p1 */
        void mo162052p1(View view, int i);

        /* renamed from: u1 */
        void mo162053u1();

        /* renamed from: v1 */
        void mo162054v1();

        /* renamed from: x2 */
        void mo162055x2();
    }

    /* renamed from: r92.b$b */
    public enum C110557b {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING
    }

    /* renamed from: r92.b$c */
    public final class C110558c extends C108178b.C108179a implements C88990b.C61771c {
        public C110558c() {
        }

        /* renamed from: a */
        public int mo158604a(View view, int i, int i2) {
            int d = C110555b.this.mo162008d(0.0f);
            int d2 = C110555b.this.mo162008d(1.0f);
            return C110555b.this.f330673p ? Math.min(Math.max(i, d2), d) : Math.min(Math.max(i, d), d2);
        }

        /* renamed from: b */
        public int mo158605b(View view) {
            return C110555b.this.f330658I;
        }

        /* renamed from: c */
        public void mo158606c(View view, int i) {
            Log.m105924i("MicroMsg.MultiTaskViewGroup", "onViewCaptured");
            C110555b.this.mo162021i();
        }

        /* renamed from: d */
        public void mo158607d(int i) {
            C110557b bVar = C110557b.COLLAPSED;
            C110557b bVar2 = C110557b.EXPANDED;
            Log.m105918d("MicroMsg.MultiTaskViewGroup", "onViewDragStateChanged, state:" + i);
            if (C110555b.this.getMDragHelper() != null) {
                C108178b mDragHelper = C110555b.this.getMDragHelper();
                boolean z = true;
                if (mDragHelper != null && mDragHelper.f323907a == 0) {
                    C110555b bVar3 = C110555b.this;
                    View view = bVar3.f330653D;
                    bVar3.f330651B = bVar3.mo162011e(view != null ? view.getLeft() : 0);
                    C110555b.this.mo162006c();
                    C110555b bVar4 = C110555b.this;
                    float f = bVar4.f330651B;
                    if (f == 1.0f) {
                        bVar4.mo162025m();
                        C110555b.this.setPanelStateInternal(bVar2);
                        return;
                    }
                    if (f != 0.0f) {
                        z = false;
                    }
                    if (z) {
                        bVar4.setPanelStateInternal(bVar);
                    } else if (f < 0.0f) {
                        bVar4.setPanelStateInternal(C110557b.HIDDEN);
                        View view2 = C110555b.this.f330653D;
                        if (view2 != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(4);
                            View view3 = view2;
                            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$ViewDragCallback", "onViewDragStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$ViewDragCallback", "onViewDragStateChanged", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    } else {
                        bVar4.mo162025m();
                        C110555b bVar5 = C110555b.this;
                        if (bVar5.f330667g) {
                            bVar5.setPanelStateInternal(C110557b.ANCHORED);
                        } else if (bVar5.f330651B <= 0.3f) {
                            bVar5.setPanelStateInternal(bVar);
                        } else {
                            bVar5.setPanelStateInternal(bVar2);
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        public void mo158608e(View view, int i, int i2, int i3, int i4) {
            Object[] objArr = new Object[5];
            objArr[0] = view != null ? view.toString() : null;
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = Integer.valueOf(i3);
            objArr[4] = Integer.valueOf(i4);
            Log.m105919d("MicroMsg.MultiTaskViewGroup", "changedView: %s, left: %d, top: %d, dx: %d, dy: %d", objArr);
            C110555b.m150480a(C110555b.this, i);
            C110555b.this.invalidate();
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
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
            	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x013c  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0155  */
        /* renamed from: f */
        public void mo158609f(android.view.View r9, float r10, float r11, float r12, float r13) {
            /*
                r8 = this;
                java.lang.String r0 = "MicroMsg.MultiTaskViewGroup"
                java.lang.String r1 = "onViewReleased, xvel: %f, yvel: %f, dx: %f, dy: %f"
                r2 = 4
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Float r3 = java.lang.Float.valueOf(r10)
                r4 = 0
                r2[r4] = r3
                java.lang.Float r11 = java.lang.Float.valueOf(r11)
                r3 = 1
                r2[r3] = r11
                java.lang.Float r11 = java.lang.Float.valueOf(r12)
                r5 = 2
                r2[r5] = r11
                java.lang.Float r11 = java.lang.Float.valueOf(r13)
                r13 = 3
                r2[r13] = r11
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r2)
                r92.b r11 = r92.C110555b.this
                boolean r13 = r11.f330673p
                if (r13 == 0) goto L_0x002e
                float r13 = -r10
                goto L_0x002f
            L_0x002e:
                r13 = r10
            L_0x002f:
                int r11 = r11.getWidth()
                r0 = 0
                if (r11 <= 0) goto L_0x0087
                r92.b r11 = r92.C110555b.this
                int r11 = r11.getWidth()
                float r11 = (float) r11
                r92.b r1 = r92.C110555b.this
                int r1 = r1.f330671n
                if (r1 != 0) goto L_0x0046
                r1 = 1048576000(0x3e800000, float:0.25)
                goto L_0x0048
            L_0x0046:
                r1 = 1056964608(0x3f000000, float:0.5)
            L_0x0048:
                float r11 = r11 * r1
                float r1 = java.lang.Math.abs(r12)
                int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
                if (r11 >= 0) goto L_0x0076
                float r11 = java.lang.Math.abs(r10)
                r92.b r1 = r92.C110555b.this
                h92.b r1 = r1.getMDragHelper()
                if (r1 == 0) goto L_0x0061
                float r1 = r1.f323919m
                goto L_0x0062
            L_0x0061:
                r1 = 0
            L_0x0062:
                r2 = 1064514355(0x3f733333, float:0.95)
                float r1 = r1 * r2
                int r11 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
                if (r11 > 0) goto L_0x0076
                r92.b r10 = r92.C110555b.this
                int r10 = r10.f330671n
                if (r10 != r3) goto L_0x0073
                r10 = 0
                goto L_0x0074
            L_0x0073:
                r10 = 1
            L_0x0074:
                r13 = 0
                goto L_0x0088
            L_0x0076:
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 != 0) goto L_0x007c
                r10 = 1
                goto L_0x007d
            L_0x007c:
                r10 = 0
            L_0x007d:
                if (r10 == 0) goto L_0x0087
                r92.b r10 = r92.C110555b.this
                boolean r10 = r10.f330673p
                if (r10 == 0) goto L_0x0086
                float r12 = -r12
            L_0x0086:
                r13 = r12
            L_0x0087:
                r10 = 1
            L_0x0088:
                r92.b r11 = r92.C110555b.this
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r12 = r11.f330670j
                monitor-enter(r12)
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r11 = r11.f330670j     // Catch:{ all -> 0x0188 }
                java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x0188 }
            L_0x0093:
                boolean r1 = r11.hasNext()     // Catch:{ all -> 0x0188 }
                if (r1 == 0) goto L_0x00a8
                java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x0188 }
                r92.b$a r1 = (r92.C110555b.C110556a) r1     // Catch:{ all -> 0x0188 }
                boolean r1 = r1.mo162047D1()     // Catch:{ all -> 0x0188 }
                if (r1 != 0) goto L_0x0093
                monitor-exit(r12)
                r3 = 0
                goto L_0x00ab
            L_0x00a8:
                rx3.b0 r11 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0188 }
                monitor-exit(r12)
            L_0x00ab:
                if (r3 != 0) goto L_0x00af
                r13 = 0
                goto L_0x00b0
            L_0x00af:
                r4 = r10
            L_0x00b0:
                int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r10 <= 0) goto L_0x00c4
                r92.b r11 = r92.C110555b.this
                float r12 = r11.f330651B
                float r1 = r11.f330660K
                int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r12 > 0) goto L_0x00c4
                int r10 = r11.mo162008d(r1)
            L_0x00c2:
                r1 = r10
                goto L_0x0122
            L_0x00c4:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r10 <= 0) goto L_0x00d7
                r92.b r10 = r92.C110555b.this
                float r12 = r10.f330651B
                float r1 = r10.f330660K
                int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r12 <= 0) goto L_0x00d7
                int r10 = r10.mo162008d(r11)
                goto L_0x00c2
            L_0x00d7:
                int r10 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r10 >= 0) goto L_0x00ea
                r92.b r12 = r92.C110555b.this
                float r13 = r12.f330651B
                float r1 = r12.f330660K
                int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                if (r13 < 0) goto L_0x00ea
                int r10 = r12.mo162008d(r1)
                goto L_0x00c2
            L_0x00ea:
                if (r10 >= 0) goto L_0x00fb
                r92.b r10 = r92.C110555b.this
                float r12 = r10.f330651B
                float r13 = r10.f330660K
                int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
                if (r12 >= 0) goto L_0x00fb
                int r10 = r10.mo162008d(r0)
                goto L_0x00c2
            L_0x00fb:
                r92.b r10 = r92.C110555b.this
                float r12 = r10.f330651B
                float r13 = r10.f330660K
                float r1 = r13 + r11
                float r2 = (float) r5
                float r1 = r1 / r2
                int r1 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r1 < 0) goto L_0x0110
                if (r4 == 0) goto L_0x0110
                int r10 = r10.mo162008d(r11)
                goto L_0x00c2
            L_0x0110:
                float r11 = r13 / r2
                int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r11 < 0) goto L_0x011d
                if (r4 == 0) goto L_0x011d
                int r10 = r10.mo162008d(r13)
                goto L_0x00c2
            L_0x011d:
                int r10 = r10.mo162008d(r0)
                goto L_0x00c2
            L_0x0122:
                r92.b r10 = r92.C110555b.this
                h92.b r10 = r10.getMDragHelper()
                if (r10 == 0) goto L_0x0161
                if (r9 == 0) goto L_0x0161
                r92.b r10 = r92.C110555b.this
                h92.b r0 = r10.getMDragHelper()
                if (r0 == 0) goto L_0x0161
                int r2 = r9.getTop()
                boolean r9 = r0.f323926t
                if (r9 == 0) goto L_0x0155
                android.view.VelocityTracker r9 = r0.f323918l
                int r10 = r0.f323909c
                float r9 = r9.getXVelocity(r10)
                int r3 = (int) r9
                android.view.VelocityTracker r9 = r0.f323918l
                int r10 = r0.f323909c
                float r9 = r9.getYVelocity(r10)
                int r4 = (int) r9
                r5 = 0
                r7 = 0
                r0.mo158595i(r1, r2, r3, r4, r5, r7)
                goto L_0x0161
            L_0x0155:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            L_0x0161:
                r92.b r9 = r92.C110555b.this
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r10 = r9.f330670j
                monitor-enter(r10)
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r9 = r9.f330670j     // Catch:{ all -> 0x0185 }
                java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0185 }
            L_0x016c:
                boolean r11 = r9.hasNext()     // Catch:{ all -> 0x0185 }
                if (r11 == 0) goto L_0x017c
                java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0185 }
                r92.b$a r11 = (r92.C110555b.C110556a) r11     // Catch:{ all -> 0x0185 }
                r11.mo162055x2()     // Catch:{ all -> 0x0185 }
                goto L_0x016c
            L_0x017c:
                rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0185 }
                monitor-exit(r10)
                r92.b r9 = r92.C110555b.this
                r9.invalidate()
                return
            L_0x0185:
                r9 = move-exception
                monitor-exit(r10)
                throw r9
            L_0x0188:
                r9 = move-exception
                monitor-exit(r12)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.C110558c.mo158609f(android.view.View, float, float, float, float):void");
        }

        /* renamed from: g */
        public void mo158610g(float f, float f2, int i, int i2, int i3, int i4) {
            Log.m105919d("MicroMsg.MultiTaskViewGroup", "touchX: %f, touchY: %f, dx: %d, dy: %d, adx: %d, ady: %d", Float.valueOf(f), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            C110555b bVar = C110555b.this;
            float f3 = bVar.f330651B;
            synchronized (bVar.f330670j) {
                Iterator<C110556a> it = bVar.f330670j.iterator();
                while (it.hasNext()) {
                    it.next().mo162048L(f3);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo158611h(android.view.View r7, int r8) {
            /*
                r6 = this;
                java.lang.String r0 = "MicroMsg.MultiTaskViewGroup"
                java.lang.String r1 = "tryCaptureView, child: %s"
                r2 = 1
                java.lang.Object[] r3 = new java.lang.Object[r2]
                if (r7 == 0) goto L_0x000e
                java.lang.String r7 = r7.toString()
                goto L_0x000f
            L_0x000e:
                r7 = 0
            L_0x000f:
                r4 = 0
                r3[r4] = r7
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r1, r3)
                r92.b r7 = r92.C110555b.this
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r0 = r7.f330670j
                monitor-enter(r0)
                java.util.concurrent.CopyOnWriteArrayList<r92.b$a> r7 = r7.f330670j     // Catch:{ all -> 0x00ab }
                java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x00ab }
            L_0x0020:
                boolean r1 = r7.hasNext()     // Catch:{ all -> 0x00ab }
                if (r1 == 0) goto L_0x0030
                java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x00ab }
                r92.b$a r1 = (r92.C110555b.C110556a) r1     // Catch:{ all -> 0x00ab }
                r1.mo162054v1()     // Catch:{ all -> 0x00ab }
                goto L_0x0020
            L_0x0030:
                rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00ab }
                monitor-exit(r0)
                r92.b r7 = r92.C110555b.this
                r92.b$b r0 = r7.f330663N
                r92.b$b r1 = r92.C110555b.C110557b.COLLAPSED
                r3 = 8
                if (r0 != r1) goto L_0x0052
                boolean r0 = r7.f330652C
                if (r0 != 0) goto L_0x0050
                h92.b r7 = r7.getMDragHelper()
                if (r7 == 0) goto L_0x004c
                boolean r7 = r7.mo158590d(r3, r8)
                goto L_0x004d
            L_0x004c:
                r7 = 0
            L_0x004d:
                if (r7 == 0) goto L_0x0050
                goto L_0x0051
            L_0x0050:
                r2 = 0
            L_0x0051:
                return r2
            L_0x0052:
                r92.b$b r1 = r92.C110555b.C110557b.EXPANDED
                r5 = 4
                if (r0 != r1) goto L_0x006c
                boolean r0 = r7.f330652C
                if (r0 != 0) goto L_0x006a
                h92.b r7 = r7.getMDragHelper()
                if (r7 == 0) goto L_0x0066
                boolean r7 = r7.mo158590d(r5, r8)
                goto L_0x0067
            L_0x0066:
                r7 = 0
            L_0x0067:
                if (r7 == 0) goto L_0x006a
                goto L_0x006b
            L_0x006a:
                r2 = 0
            L_0x006b:
                return r2
            L_0x006c:
                r92.b$b r1 = r92.C110555b.C110557b.DRAGGING
                if (r0 != r1) goto L_0x0071
                return r2
            L_0x0071:
                r92.b$b r1 = r92.C110555b.C110557b.ANCHORED
                if (r0 != r1) goto L_0x00a8
                boolean r0 = r7.f330652C
                if (r0 != 0) goto L_0x0089
                h92.b r7 = r7.getMDragHelper()
                if (r7 == 0) goto L_0x0084
                boolean r7 = r7.mo158590d(r3, r8)
                goto L_0x0085
            L_0x0084:
                r7 = 0
            L_0x0085:
                if (r7 == 0) goto L_0x0089
                r7 = 1
                goto L_0x008a
            L_0x0089:
                r7 = 0
            L_0x008a:
                r92.b r0 = r92.C110555b.this
                boolean r1 = r0.f330652C
                if (r1 != 0) goto L_0x00a0
                h92.b r0 = r0.getMDragHelper()
                if (r0 == 0) goto L_0x009b
                boolean r8 = r0.mo158590d(r5, r8)
                goto L_0x009c
            L_0x009b:
                r8 = 0
            L_0x009c:
                if (r8 == 0) goto L_0x00a0
                r8 = 1
                goto L_0x00a1
            L_0x00a0:
                r8 = 0
            L_0x00a1:
                if (r8 != 0) goto L_0x00a7
                if (r7 == 0) goto L_0x00a6
                goto L_0x00a7
            L_0x00a6:
                r2 = 0
            L_0x00a7:
                return r2
            L_0x00a8:
                r7.f330666f = r4
                return r4
            L_0x00ab:
                r7 = move-exception
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.C110558c.mo158611h(android.view.View, int):boolean");
        }

        public void onComplete(boolean z) {
            Log.m105918d("MicroMsg.MultiTaskViewGroup", "onComplete");
        }
    }

    static {
        int a = C74942w4.m89784a(MMApplicationContext.getContext(), 16);
        f330648Q = a;
        float f = (float) a;
        f330649R = new float[]{f, f, 0.0f, 0.0f, 0.0f, 0.0f, f, f};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110555b(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public static final void m150480a(C110555b bVar, int i) {
        bVar.setPanelStateInternal(C110557b.DRAGGING);
        float e = bVar.mo162011e(i);
        bVar.f330651B = e;
        if (bVar.f330671n == 1) {
            if (e <= 0.1f) {
                bVar.f330666f = false;
            }
            if (!bVar.f330666f) {
                if (((float) (bVar.getWidth() - bVar.f330655F)) * bVar.f330651B > ((float) bVar.getWidth()) * 0.25f) {
                    Vibrator vibrator = bVar.f330668h;
                    if (vibrator != null) {
                        vibrator.vibrate(10);
                    }
                    bVar.f330666f = true;
                    synchronized (bVar.f330670j) {
                        Iterator<C110556a> it = bVar.f330670j.iterator();
                        while (it.hasNext()) {
                            it.next().mo162053u1();
                        }
                        C13598b0 b0Var = C13598b0.f38549a;
                    }
                }
            }
        }
        bVar.mo162006c();
        View view = bVar.f330653D;
        synchronized (bVar.f330670j) {
            Iterator<C110556a> it4 = bVar.f330670j.iterator();
            while (it4.hasNext()) {
                it4.next().mo162051i(view, bVar.f330651B);
            }
            C13598b0 b0Var2 = C13598b0.f38549a;
        }
        Log.m105919d("MicroMsg.MultiTaskViewGroup", "onPanelDragged, newLeft: %d, slideOffset: %f", Integer.valueOf(i), Float.valueOf(bVar.f330651B));
    }

    private final C110557b getPanelState() {
        return this.f330663N;
    }

    /* access modifiers changed from: private */
    public final void setPanelStateInternal(C110557b bVar) {
        C110557b bVar2 = this.f330663N;
        if (bVar2 != bVar) {
            this.f330663N = bVar;
            if (bVar == C110557b.EXPANDED) {
                this.f330671n = 0;
                Log.m105924i("MicroMsg.MultiTaskViewGroup", "setPanelStateInternal, EXPANDED!");
            } else if (bVar == C110557b.COLLAPSED) {
                this.f330671n = 1;
                Log.m105924i("MicroMsg.MultiTaskViewGroup", "setPanelStateInternal, COLLAPSED!");
            }
            int i = this.f330671n;
            if (i != this.f330672o) {
                this.f330672o = i;
                synchronized (this.f330670j) {
                    Iterator<C110556a> it = this.f330670j.iterator();
                    while (it.hasNext()) {
                        it.next().mo162052p1(this, i);
                    }
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            }
            synchronized (this.f330670j) {
                Iterator<C110556a> it4 = this.f330670j.iterator();
                while (it4.hasNext()) {
                    it4.next().mo162050a3(this, bVar2, bVar);
                }
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
            sendAccessibilityEvent(32);
        }
    }

    /* renamed from: c */
    public final void mo162006c() {
        if (this.f330662M > 0) {
            int currentParallaxOffset = getCurrentParallaxOffset();
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            this.f330657H.setTranslationX((float) currentParallaxOffset);
        }
    }

    public void computeScroll() {
        View view;
        View view2;
        C108178b bVar = this.f330664d;
        if (bVar != null) {
            boolean z = false;
            if (bVar != null) {
                Boolean bool = Boolean.TRUE;
                if (bVar.f323907a == 2) {
                    boolean computeScrollOffset = bVar.f323923q.computeScrollOffset();
                    int currX = bVar.f323923q.getCurrX();
                    int currY = bVar.f323923q.getCurrY();
                    View view3 = bVar.f323925s;
                    int left = currX - (view3 != null ? view3.getLeft() : 0);
                    View view4 = bVar.f323925s;
                    int top = currY - (view4 != null ? view4.getTop() : 0);
                    if (!(left == 0 || (view2 = bVar.f323925s) == null)) {
                        view2.offsetLeftAndRight(left);
                    }
                    if (!(top == 0 || (view = bVar.f323925s) == null)) {
                        view.offsetTopAndBottom(top);
                    }
                    if (!(left == 0 && top == 0)) {
                        bVar.f323924r.mo158608e(bVar.f323925s, currX, currY, left, top);
                    }
                    if (computeScrollOffset && currX == bVar.f323923q.getFinalX() && currY == bVar.f323923q.getFinalY()) {
                        bVar.f323923q.abortAnimation();
                        computeScrollOffset = bVar.f323923q.isFinished();
                    }
                    if (!computeScrollOffset) {
                        bVar.f323927u.post(bVar.f323929w);
                    }
                }
                if (bVar.f323907a == 2) {
                    z = true;
                }
                z = C87412m.m108589b(bool, Boolean.valueOf(z));
            }
            if (!z) {
                return;
            }
            if (!isEnabled()) {
                C108178b bVar2 = this.f330664d;
                if (bVar2 != null) {
                    bVar2.mo158587a();
                    return;
                }
                return;
            }
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            C107207u.C107208b.m145183k(this);
        }
    }

    /* renamed from: d */
    public final int mo162008d(float f) {
        View view = this.f330653D;
        int measuredWidth = view != null ? view.getMeasuredWidth() : 0;
        int i = (int) (f * ((float) this.f330658I));
        return this.f330673p ? ((getMeasuredWidth() - getPaddingRight()) - (this.f330655F + this.f330659J)) - i : (getPaddingLeft() - measuredWidth) + this.f330655F + this.f330659J + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        if (r2 == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r5, r0)
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f330665e
            if (r1 != 0) goto L_0x001e
            h92.b r1 = r4.f330664d
            r2 = 1
            if (r1 == 0) goto L_0x001b
            android.widget.OverScroller r1 = r1.f323923q
            boolean r1 = r1.isFinished()
            if (r1 != r2) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            boolean r1 = r4.f330652C
            if (r1 == 0) goto L_0x0030
            if (r0 == 0) goto L_0x0030
        L_0x0024:
            h92.b r0 = r4.f330664d
            if (r0 == 0) goto L_0x002b
            r0.mo158587a()
        L_0x002b:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L_0x0030:
            float r1 = r5.getX()
            float r2 = r5.getY()
            if (r0 == 0) goto L_0x0060
            r3 = 2
            if (r0 == r3) goto L_0x003e
            goto L_0x0064
        L_0x003e:
            float r0 = r4.f330679v
            float r0 = r1 - r0
            float r3 = r4.f330680w
            float r3 = r2 - r3
            r4.f330679v = r1
            r4.f330680w = r2
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x005b
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L_0x005b:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L_0x0060:
            r4.f330679v = r1
            r4.f330680w = r2
        L_0x0064:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int i;
        int i2;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(view, "child");
        int save = canvas.save();
        View view2 = this.f330653D;
        if (view2 == null || !C87412m.m108589b(view2, view)) {
            canvas.getClipBounds(this.f330683z);
            int i3 = 0;
            if (!this.f330674q) {
                if (this.f330673p) {
                    Rect rect = this.f330683z;
                    int i4 = rect.left;
                    View view3 = this.f330657H;
                    rect.right = Math.max(i4, view3 != null ? view3.getTop() : 0);
                } else {
                    Rect rect2 = this.f330683z;
                    int i5 = rect2.left;
                    View view4 = this.f330657H;
                    rect2.left = Math.min(i5, view4 != null ? view4.getBottom() : getHeight());
                }
            } else if (this.f330673p) {
                Rect rect3 = this.f330683z;
                int i6 = rect3.right;
                View view5 = this.f330657H;
                rect3.right = Math.min(i6, view5 != null ? view5.getRight() : i6);
            } else {
                Rect rect4 = this.f330683z;
                int i7 = rect4.left;
                View view6 = this.f330657H;
                rect4.left = Math.max(i7, view6 != null ? view6.getLeft() : i7);
            }
            if (this.f330675r && this.f330651B > 0.0f) {
                float width = 0.5f - ((float) (f330647P / getWidth()));
                float f = this.f330651B;
                if (f >= width) {
                    float f2 = (f - width) / (((float) 1) - width);
                    int i8 = f330648Q;
                    float f3 = ((float) i8) * f2;
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    } else if (f3 > ((float) i8)) {
                        f3 = (float) i8;
                    }
                    float[] fArr = f330649R;
                    fArr[0] = f3;
                    fArr[1] = f3;
                    fArr[6] = f3;
                    fArr[7] = f3;
                    int i9 = (int) (f2 * ((float) 255));
                    if (i9 >= 0) {
                        i3 = i9 > 216 ? 216 : i9;
                    }
                    this.f330678u.reset();
                    RectF rectF = new RectF(this.f330683z);
                    rectF.left = this.f330651B * ((float) this.f330658I);
                    this.f330678u.addRoundRect(rectF, fArr, Path.Direction.CW);
                    this.f330678u.close();
                    canvas.clipPath(this.f330678u);
                    i = i3;
                    i3 = 1;
                    z = super.drawChild(canvas, view, j);
                    i2 = this.f330676s;
                    if (!(i2 == 0 || this.f330651B <= 0.0f || i3 == 0)) {
                        this.f330677t.setColor((i2 & 16777215) | (i << 24));
                        Rect rect5 = new Rect(this.f330683z);
                        rect5.left = (int) (this.f330651B * ((float) this.f330658I));
                        canvas.drawRect(rect5, this.f330677t);
                    }
                }
            }
            i = 0;
            z = super.drawChild(canvas, view, j);
            i2 = this.f330676s;
            this.f330677t.setColor((i2 & 16777215) | (i << 24));
            Rect rect52 = new Rect(this.f330683z);
            rect52.left = (int) (this.f330651B * ((float) this.f330658I));
            canvas.drawRect(rect52, this.f330677t);
        } else {
            canvas.getClipBounds(this.f330683z);
            if (!this.f330674q) {
                if (this.f330673p) {
                    Rect rect6 = this.f330683z;
                    int i15 = rect6.right;
                    View view7 = this.f330653D;
                    rect6.right = Math.min(i15, view7 != null ? view7.getRight() : i15);
                } else {
                    Rect rect7 = this.f330683z;
                    int i16 = rect7.left;
                    View view8 = this.f330653D;
                    rect7.left = Math.max(i16, view8 != null ? view8.getLeft() : i16);
                }
            } else if (this.f330673p) {
                Rect rect8 = this.f330683z;
                int i17 = rect8.right;
                View view9 = this.f330653D;
                rect8.right = Math.max(i17, view9 != null ? view9.getRight() : i17);
                this.f330683z.left -= getWidth();
            } else {
                Rect rect9 = this.f330683z;
                int i18 = rect9.left;
                View view10 = this.f330653D;
                rect9.left = Math.min(i18, view10 != null ? view10.getLeft() : i18);
                Rect rect10 = this.f330683z;
                rect10.right = rect10.left + getWidth();
            }
            if (this.f330675r) {
                canvas.clipRect(this.f330683z);
            }
            z = super.drawChild(canvas, view, j);
        }
        canvas.restoreToCount(save);
        return z;
    }

    /* renamed from: e */
    public final float mo162011e(int i) {
        int d = mo162008d(0.0f);
        return (this.f330673p ? (float) (d - i) : (float) (i - d)) / ((float) this.f330658I);
    }

    /* renamed from: f */
    public boolean mo162012f() {
        return getPanelState() == C110557b.ANCHORED;
    }

    /* renamed from: g */
    public boolean mo162013g() {
        return getPanelState() == C110557b.COLLAPSED;
    }

    public boolean getCanSlide() {
        return this.f330665e;
    }

    public int getCurItem() {
        return this.f330671n;
    }

    public int getCurrentParallaxOffset() {
        int max = (int) (((float) this.f330662M) * Math.max(this.f330651B, 0.0f));
        return this.f330673p ? -max : max;
    }

    public final C108178b getMDragHelper() {
        return this.f330664d;
    }

    public int getPanelWidth() {
        return this.f330654E;
    }

    public int getShadowWidth() {
        return this.f330661L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r8 = r2[1];
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo162020h(android.view.View r6, int r7, int r8) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 2
            int[] r2 = new int[r1]
            r6.getLocationOnScreen(r2)
            int[] r1 = new int[r1]
            r5.getLocationOnScreen(r1)
            r3 = r1[r0]
            int r3 = r3 + r7
            r7 = 1
            r1 = r1[r7]
            int r1 = r1 + r8
            r8 = r2[r0]
            if (r3 < r8) goto L_0x002d
            int r4 = r6.getWidth()
            int r8 = r8 + r4
            if (r3 >= r8) goto L_0x002d
            r8 = r2[r7]
            if (r1 < r8) goto L_0x002d
            int r6 = r6.getHeight()
            int r8 = r8 + r6
            if (r1 >= r8) goto L_0x002d
            r0 = 1
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.mo162020h(android.view.View, int, int):boolean");
    }

    /* renamed from: i */
    public void mo162021i() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(childAt, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: j */
    public void mo162022j(int i, boolean z) {
        C110557b bVar = C110557b.EXPANDED;
        C110557b bVar2 = C110557b.COLLAPSED;
        this.f330660K = 1.0f;
        this.f330667g = false;
        if (i == 0) {
            if (z) {
                mo162023k(bVar, 0, false);
            } else {
                mo162023k(bVar, 0, true);
            }
        } else if (z) {
            mo162023k(bVar2, 0, false);
        } else {
            mo162023k(bVar2, 0, true);
        }
        if (!z) {
            this.f330671n = i;
        }
    }

    /* renamed from: k */
    public void mo162023k(C110557b bVar, long j, boolean z) {
        C110557b bVar2;
        C110557b bVar3 = bVar;
        C110557b bVar4 = C110557b.DRAGGING;
        if (!((bVar3 == null || bVar3 == bVar4) ? false : true)) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.".toString());
        } else if (!isEnabled()) {
        } else {
            if ((this.f330650A || this.f330653D != null) && bVar3 != (bVar2 = this.f330663N) && bVar2 != bVar4) {
                C108178b bVar5 = this.f330664d;
                if (bVar5 != null && bVar5.f323907a == 2) {
                    Log.m105918d("MicroMsg.MultiTaskViewGroup", "View is settling. Aborting animation.");
                    C108178b bVar6 = this.f330664d;
                    if (bVar6 != null) {
                        bVar6.mo158587a();
                    }
                }
                if (this.f330650A) {
                    setPanelStateInternal(bVar);
                    return;
                }
                if (this.f330663N == C110557b.HIDDEN) {
                    View view = this.f330653D;
                    if (view != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        View view2 = view;
                        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setPanelState", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$PanelState;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setPanelState", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$PanelState;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    requestLayout();
                }
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    mo162024l(1.0f, 0, j, z);
                } else if (ordinal == 1) {
                    mo162024l(0.0f, 0, 250, z);
                } else if (ordinal == 2) {
                    mo162024l(this.f330660K, 0, j, z);
                } else if (ordinal == 3) {
                    mo162024l(mo162011e(mo162008d(0.0f) + (this.f330673p ? this.f330655F + this.f330659J : -(this.f330655F + this.f330659J))), 0, j, z);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo162024l(float r10, int r11, long r12, boolean r14) {
        /*
            r9 = this;
            boolean r11 = r9.isEnabled()
            r0 = 0
            if (r11 == 0) goto L_0x003c
            android.view.View r11 = r9.f330653D
            if (r11 != 0) goto L_0x000c
            goto L_0x003c
        L_0x000c:
            int r2 = r9.mo162008d(r10)
            h92.b r1 = r9.f330664d
            r10 = 1
            if (r1 == 0) goto L_0x0030
            android.view.View r11 = r9.f330653D
            if (r11 == 0) goto L_0x001e
            int r3 = r11.getTop()
            goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            r1.f323925s = r11
            r11 = -1
            r1.f323909c = r11
            r4 = 0
            r5 = 0
            r6 = r12
            r8 = r14
            boolean r11 = r1.mo158595i(r2, r3, r4, r5, r6, r8)
            if (r11 != r10) goto L_0x0030
            r11 = 1
            goto L_0x0031
        L_0x0030:
            r11 = 0
        L_0x0031:
            if (r11 == 0) goto L_0x003c
            r9.mo162021i()
            java.util.WeakHashMap<android.view.View, e3.a0> r11 = p849e3.C107207u.f320808a
            p849e3.C107207u.C107208b.m145183k(r9)
            return r10
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.mo162024l(float, int, long, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r10v4, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo162025m() {
        /*
            r20 = this;
            r0 = r20
            int r1 = r20.getChildCount()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r20.getPaddingLeft()
            int r2 = r20.getWidth()
            int r3 = r20.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r20.getPaddingTop()
            int r4 = r20.getHeight()
            int r5 = r20.getPaddingBottom()
            int r4 = r4 - r5
            android.view.View r5 = r0.f330653D
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x005c
            if (r5 == 0) goto L_0x002f
            android.graphics.drawable.Drawable r6 = r5.getBackground()
        L_0x002f:
            if (r6 == 0) goto L_0x003a
            int r6 = r6.getOpacity()
            r8 = -1
            if (r6 != r8) goto L_0x003a
            r6 = 1
            goto L_0x003b
        L_0x003a:
            r6 = 0
        L_0x003b:
            if (r6 == 0) goto L_0x004e
            int r6 = r5.getLeft()
            int r8 = r5.getRight()
            int r9 = r5.getTop()
            int r5 = r5.getBottom()
            goto L_0x0052
        L_0x004e:
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
        L_0x0052:
            rx3.b0 r10 = rx3.C13598b0.f38549a
            r19 = r8
            r8 = r6
            r6 = r10
            r10 = r9
            r9 = r19
            goto L_0x0060
        L_0x005c:
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0060:
            if (r6 != 0) goto L_0x0066
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0066:
            android.view.View r6 = r0.getChildAt(r7)
            int r11 = r6.getLeft()
            int r1 = java.lang.Math.max(r1, r11)
            int r11 = r6.getTop()
            int r3 = java.lang.Math.max(r3, r11)
            int r11 = r6.getRight()
            int r2 = java.lang.Math.min(r2, r11)
            int r11 = r6.getBottom()
            int r4 = java.lang.Math.min(r4, r11)
            if (r1 < r8) goto L_0x0094
            if (r3 < r10) goto L_0x0094
            if (r2 > r9) goto L_0x0094
            if (r4 > r5) goto L_0x0094
            r1 = 4
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.mo10233c(r1)
            java.lang.Object[] r12 = r2.mo10232b()
            java.lang.String r13 = "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout"
            java.lang.String r14 = "updateObscuredViewVisibility"
            java.lang.String r15 = "()V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r11 = r6
            j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r1 = r2.mo10231a(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6.setVisibility(r1)
            java.lang.String r12 = "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout"
            java.lang.String r13 = "updateObscuredViewVisibility"
            java.lang.String r14 = "()V"
            java.lang.String r15 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.mo162025m():void");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f330650A = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f330650A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r0 != 3) goto L_0x00eb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            java.lang.String r0 = "ev"
            gy3.C87412m.m108594g(r9, r0)
            boolean r0 = r8.f330665e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0024
            h92.b r0 = r8.f330664d
            if (r0 == 0) goto L_0x0019
            android.widget.OverScroller r0 = r0.f323923q
            boolean r0 = r0.isFinished()
            if (r0 != r1) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0024
            h92.b r9 = r8.f330664d
            if (r9 == 0) goto L_0x0023
            r9.mo158587a()
        L_0x0023:
            return r2
        L_0x0024:
            int r0 = r9.getActionMasked()
            float r3 = r9.getX()
            float r4 = r9.getY()
            float r5 = r8.f330681x
            float r5 = r3 - r5
            float r5 = java.lang.Math.abs(r5)
            float r6 = r8.f330682y
            float r6 = r4 - r6
            float r6 = java.lang.Math.abs(r6)
            if (r0 == 0) goto L_0x00b7
            if (r0 == r1) goto L_0x009f
            r7 = 2
            if (r0 == r7) goto L_0x004c
            r3 = 3
            if (r0 == r3) goto L_0x009f
            goto L_0x00eb
        L_0x004c:
            float r0 = r8.f330679v
            float r0 = r3 - r0
            float r7 = r8.f330680w
            float r7 = r4 - r7
            r8.f330679v = r3
            r8.f330680w = r4
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0086
            float r5 = java.lang.Math.abs(r7)
            float r6 = java.lang.Math.abs(r0)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            goto L_0x0086
        L_0x0069:
            int r5 = r8.f330671n
            if (r5 != r1) goto L_0x00eb
            android.view.View r5 = r8.f330657H
            int r3 = (int) r3
            int r4 = (int) r4
            boolean r3 = r8.mo162020h(r5, r3, r4)
            if (r3 == 0) goto L_0x00eb
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00eb
            h92.b r9 = r8.f330664d
            if (r9 == 0) goto L_0x0083
            r9.mo158588b()
        L_0x0083:
            r8.f330652C = r1
            return r2
        L_0x0086:
            int r9 = r8.f330671n
            if (r9 != 0) goto L_0x0095
            android.view.View r9 = r8.f330657H
            int r0 = (int) r3
            int r3 = (int) r4
            boolean r9 = r8.mo162020h(r9, r0, r3)
            if (r9 == 0) goto L_0x0095
            return r1
        L_0x0095:
            h92.b r9 = r8.f330664d
            if (r9 == 0) goto L_0x009c
            r9.mo158588b()
        L_0x009c:
            r8.f330652C = r1
            return r2
        L_0x009f:
            h92.b r0 = r8.f330664d
            if (r0 == 0) goto L_0x00ae
            int r3 = r0.f323907a
            if (r3 != r1) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 != r1) goto L_0x00ae
            r3 = 1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 == 0) goto L_0x00eb
            if (r0 == 0) goto L_0x00b6
            r0.mo158596j(r9)
        L_0x00b6:
            return r1
        L_0x00b7:
            r8.f330666f = r2
            r8.f330652C = r2
            r8.f330681x = r3
            r8.f330682y = r4
            r8.f330679v = r3
            r8.f330680w = r4
            android.view.View r0 = r8.f330656G
            int r3 = (int) r3
            int r4 = (int) r4
            boolean r0 = r8.mo162020h(r0, r3, r4)
            if (r0 != 0) goto L_0x00d7
            h92.b r9 = r8.f330664d
            if (r9 == 0) goto L_0x00d4
            r9.mo158588b()
        L_0x00d4:
            r8.f330652C = r1
            return r2
        L_0x00d7:
            int r0 = r8.f330671n
            if (r0 != 0) goto L_0x00e4
            android.view.View r0 = r8.f330657H
            boolean r0 = r8.mo162020h(r0, r3, r4)
            if (r0 == 0) goto L_0x00e4
            return r1
        L_0x00e4:
            r92.b$b r0 = r8.f330663N
            r92.b$b r3 = r92.C110555b.C110557b.ANCHORED
            if (r0 != r3) goto L_0x00eb
            return r1
        L_0x00eb:
            h92.b r0 = r8.f330664d
            if (r0 == 0) goto L_0x00f3
            boolean r2 = r0.mo158602p(r9)
        L_0x00f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r92.C110555b.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f330650A) {
            int ordinal = this.f330663N.ordinal();
            float f = 0.0f;
            if (ordinal == 0) {
                f = 1.0f;
            } else if (ordinal == 2) {
                f = this.f330660K;
            } else if (ordinal == 3) {
                f = mo162011e(mo162008d(0.0f) + (this.f330673p ? this.f330655F + this.f330659J : -(this.f330655F + this.f330659J)));
            }
            this.f330651B = f;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (childAt.getVisibility() != 8 || (i5 != 0 && !this.f330650A)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int d = C87412m.m108589b(childAt, this.f330653D) ? mo162008d(this.f330651B) : paddingLeft;
                int i6 = layoutParams2.topMargin + paddingTop;
                childAt.layout(d, i6, measuredWidth + d, childAt.getMeasuredHeight() + i6);
            }
        }
        if (this.f330650A) {
            mo162025m();
        }
        mo162006c();
        this.f330650A = false;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f330657H = getChildAt(0);
        View childAt = getChildAt(1);
        this.f330653D = childAt;
        if (this.f330656G == null) {
            setDragView(childAt);
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt2 = getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (childAt2.getVisibility() != 8 || i5 != 0) {
                if (C87412m.m108589b(childAt2, this.f330657H)) {
                    i3 = ((this.f330674q || this.f330663N == C110557b.HIDDEN) ? paddingLeft : paddingLeft - this.f330654E) - (layoutParams2.leftMargin + layoutParams2.rightMargin);
                } else {
                    i3 = C87412m.m108589b(childAt2, this.f330653D) ? (paddingLeft - layoutParams2.leftMargin) + this.f330659J : paddingLeft;
                }
                int i6 = layoutParams2.height;
                int makeMeasureSpec = i6 == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, Integer.MIN_VALUE) : i6 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                int i7 = layoutParams2.width;
                if (i7 == -2) {
                    i4 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                } else {
                    if (i7 != -1) {
                        i3 = i7;
                    }
                    i4 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                }
                childAt2.measure(i4, makeMeasureSpec);
                if (C87412m.m108589b(childAt2, this.f330653D)) {
                    int measuredWidth = childAt2.getMeasuredWidth() - (this.f330655F + this.f330659J);
                    this.f330658I = measuredWidth;
                    this.f330662M = measuredWidth;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4 || i != i3) {
            this.f330650A = true;
            synchronized (this.f330670j) {
                Iterator<C110556a> it = this.f330670j.iterator();
                while (it.hasNext()) {
                    it.next().mo162049Z(i, i2);
                }
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "ev");
        if (!this.f330665e) {
            C108178b bVar = this.f330664d;
            if (bVar != null && bVar.f323923q.isFinished()) {
                C108178b bVar2 = this.f330664d;
                if (bVar2 != null) {
                    bVar2.mo158587a();
                }
                return super.onTouchEvent(motionEvent);
            }
        }
        try {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                float abs = Math.abs(x - this.f330681x);
                float abs2 = Math.abs(y - this.f330682y);
                C108178b bVar3 = this.f330664d;
                float scaledTouchSlop = (float) (bVar3 != null ? bVar3.f323908b : ViewConfiguration.get(getContext()).getScaledTouchSlop());
                int i = (abs2 > scaledTouchSlop ? 1 : (abs2 == scaledTouchSlop ? 0 : -1));
                if (i <= 0 && abs <= scaledTouchSlop && this.f330671n == 0 && this.f330651B > 0.0f && mo162020h(this.f330657H, (int) this.f330681x, (int) this.f330682y) && this.f330669i != null && getPanelState() != C110557b.DRAGGING) {
                    View.OnClickListener onClickListener = this.f330669i;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    return true;
                } else if (i <= 0 && abs <= scaledTouchSlop && this.f330651B > 0.0f && this.f330663N == C110557b.ANCHORED) {
                    View.OnClickListener onClickListener2 = this.f330669i;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                    return true;
                }
            }
            C108178b bVar4 = this.f330664d;
            if (bVar4 != null) {
                bVar4.mo158596j(motionEvent);
            }
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.MultiTaskViewGroup", e, "get a Exception", new Object[0]);
            return false;
        }
    }

    public void setAnchorPoint(float f) {
        this.f330660K = f;
        this.f330667g = true;
    }

    public void setCanSlide(boolean z) {
        this.f330665e = z;
    }

    public void setCoveredFadeColor(int i) {
        this.f330676s = i;
        requestLayout();
    }

    public void setDragView(View view) {
        this.f330656G = view;
    }

    public void setExtraSlideRange(int i) {
        this.f330659J = i;
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        C87412m.m108594g(onClickListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f330669i = onClickListener;
    }

    public final void setMDragHelper(C108178b bVar) {
        this.f330664d = bVar;
    }

    public void setNeedAnchor(boolean z) {
        this.f330667g = z;
    }

    public void setOverlayed(boolean z) {
        this.f330674q = z;
    }

    public void setPanelExpose(int i) {
        this.f330655F = i;
    }

    public void setPanelWidth(int i) {
        if (getPanelWidth() != i) {
            this.f330654E = i;
            if (!this.f330650A) {
                requestLayout();
            }
            if (getPanelState() == C110557b.COLLAPSED) {
                mo162024l(0.0f, 0, 0, false);
                invalidate();
            }
        }
    }

    public void setParallaxOffset(int i) {
        this.f330662M = i;
        if (!this.f330650A) {
            requestLayout();
        }
    }

    public void setShadowWidth(int i) {
        this.f330661L = i;
        if (!this.f330650A) {
            invalidate();
        }
    }

    public void setSlideLeft(boolean z) {
        this.f330673p = z;
    }
}
