package h41;

import a41.C112756b;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import j20.C117292a;
import j20.C21152b;
import j20.C21153d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import l31.C61213g;
import m41.C117534a;
import m41.C117536f;
import o41.C117709a;
import o41.C117710b;
import op3.C117877b;
import t31.C118361a;
import u31.C118568a;
import v31.C118643c;

@C86522b(creator = C117067b.class, onProcess = {C80625v0.MATCH_MM, C80625v0.MATCH_TOOLS, C80625v0.MATCH_APPBRAND})
/* renamed from: h41.b */
public class C117067b extends C86301e implements C61213g {

    /* renamed from: A */
    public static final Map<String, List<Pair<String, String>>> f350751A;

    /* renamed from: B */
    public static final Map<String, List<Pair<String, String>>> f350752B;

    /* renamed from: C */
    public static volatile C117067b f350753C;

    /* renamed from: d */
    public b$$u f350754d = new b$$u(this);

    /* renamed from: e */
    public C117709a<View> f350755e = new C117709a<>();

    /* renamed from: f */
    public C117709a<View> f350756f = new C117709a<>();

    /* renamed from: g */
    public C117710b<C61213g.C61215b> f350757g = new C117710b<>(C0966R.C0970id.o4z);

    /* renamed from: h */
    public C117710b<C61213g.C61214a> f350758h = new C117710b<>(C0966R.C0970id.o4y);

    /* renamed from: i */
    public Map<View, Object> f350759i = new WeakHashMap();

    /* renamed from: j */
    public WeakReference<Object> f350760j;

    /* renamed from: n */
    public C117709a<Object> f350761n = new C117709a<>();

    /* renamed from: o */
    public C117709a<View> f350762o = new C117709a<>();

    /* renamed from: p */
    public Map<View, C117877b<Long, Integer>> f350763p = new WeakHashMap();

    /* renamed from: q */
    public boolean f350764q = true;

    /* renamed from: r */
    public List<C61213g.C61214a> f350765r = new ArrayList();

    /* renamed from: s */
    public List<C61213g.C61215b> f350766s = new ArrayList();

    /* renamed from: t */
    public float f350767t = 0.0f;

    /* renamed from: u */
    public int f350768u = 0;

    /* renamed from: v */
    public int f350769v;

    /* renamed from: w */
    public int f350770w;

    /* renamed from: x */
    public long f350771x;

    /* renamed from: y */
    public final C21152b f350772y;

    /* renamed from: z */
    public final C21153d f350773z;

    static {
        HashMap hashMap = new HashMap();
        f350751A = hashMap;
        HashMap hashMap2 = new HashMap();
        f350752B = hashMap2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Pair.create("setAlpha", "(F)V"));
        arrayList.add(Pair.create("setVisibility", "(I)V"));
        hashMap.put("android/view/View", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Pair.create("onScroll", "(Landroid/widget/AbsListView;III)V"));
        arrayList2.add(Pair.create("onScrollStateChanged", "(Landroid/widget/AbsListView;I)V"));
        hashMap2.put("android/widget/AbsListView$OnScrollListener", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(Pair.create("onScrollChange", "(Landroid/widget/ScrollView;IIII)V"));
        hashMap2.put("com/tencent/mm/ui/base/CustomScrollView$OnScrollChangeListener", arrayList3);
    }

    public C117067b() {
        new ArrayList();
        this.f350772y = new b$$r(this);
        this.f350773z = new b$$s(this);
    }

    public static void vx0(C117067b bVar, View view, int i, int i2) {
        bVar.getClass();
        if (view != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(i - bVar.f350769v) > 25 || Math.abs(i2 - bVar.f350770w) > 25 || currentTimeMillis - bVar.f350771x > 75) {
                bVar.f350769v = i;
                bVar.f350770w = i2;
                bVar.f350771x = currentTimeMillis;
                C117536f.m165799a(new b$$p(bVar));
            }
        }
    }

    public static C117067b wx0() {
        if (f350753C == null) {
            synchronized (C117067b.class) {
                if (f350753C == null) {
                    f350753C = new C117067b();
                }
            }
        }
        return f350753C;
    }

    public final List<View> Ax0(View view, View view2, int i) {
        List<View> Ax0;
        if (!(view == null || view2 == null)) {
            boolean z = true;
            int i2 = i + 1;
            if (i2 > 99 || view == view2) {
                Log.m105924i("Amoeba.ViewExposeMonitor", "deep : " + i2);
            } else {
                ArrayList arrayList = new ArrayList();
                if (!(view instanceof ScrollView) && !(view instanceof ListView) && !(view instanceof RecyclerView) && !(view instanceof ViewPager) && !(view instanceof AppBarLayout)) {
                    z = false;
                }
                if (z) {
                    arrayList.add(view);
                }
                ViewParent parent = view.getParent();
                if (parent != null && (parent instanceof View) && (Ax0 = Ax0((View) parent, view2, i2)) != null && Ax0.size() > 0) {
                    arrayList.addAll(Ax0);
                }
                return arrayList;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f8, code lost:
        if (r11 < r9) goto L_0x012e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0137 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0134  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bx0(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            o41.a<android.view.View> r2 = r0.f350755e
            if (r2 == 0) goto L_0x037e
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x037e
            boolean r2 = r0.f350764q
            if (r2 != 0) goto L_0x0014
            goto L_0x037e
        L_0x0014:
            o41.a<java.lang.Object> r2 = r0.f350761n
            r2.mo182401f()
            r3 = 0
            java.util.List<java.lang.ref.WeakReference<T>> r2 = r2.f352035d     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            r4 = r2
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            int r4 = r4.size()     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            int r4 = r4 + -1
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            java.lang.Object r2 = r2.get(r4)     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r2.get()     // Catch:{ IndexOutOfBoundsException -> 0x0034 }
            goto L_0x0036
        L_0x0034:
        L_0x0035:
            r2 = r3
        L_0x0036:
            if (r2 == 0) goto L_0x0039
            goto L_0x0043
        L_0x0039:
            java.lang.ref.WeakReference<java.lang.Object> r2 = r0.f350760j
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r2.get()
            goto L_0x0043
        L_0x0042:
            r2 = r3
        L_0x0043:
            if (r2 != 0) goto L_0x0046
            return
        L_0x0046:
            o41.a<android.view.View> r4 = r0.f350755e
            r6 = 0
            if (r4 == 0) goto L_0x013a
            int r4 = r4.size()
            if (r4 > 0) goto L_0x0053
            goto L_0x013a
        L_0x0053:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            o41.a<android.view.View> r4 = r0.f350755e
            r4.iterator()
        L_0x005d:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x013a
            java.lang.Object r7 = r4.next()
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x012d
            boolean r8 = r7.isAttachedToWindow()
            if (r8 != 0) goto L_0x0073
            goto L_0x012d
        L_0x0073:
            android.view.View r8 = m41.C117534a.m165784g(r2)
            if (r8 != 0) goto L_0x007b
            goto L_0x012d
        L_0x007b:
            android.view.View r9 = m41.C117534a.m165784g(r7)
            if (r9 != 0) goto L_0x0083
            goto L_0x012d
        L_0x0083:
            if (r9 == r8) goto L_0x0087
            goto L_0x012d
        L_0x0087:
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            boolean r9 = r7.getGlobalVisibleRect(r8)
            if (r9 != 0) goto L_0x0094
            goto L_0x012d
        L_0x0094:
            int r9 = r8.bottom
            int r10 = r8.top
            int r9 = r9 - r10
            if (r9 <= 0) goto L_0x012d
            int r9 = r8.right
            int r10 = r8.left
            int r9 = r9 - r10
            if (r9 > 0) goto L_0x00a4
            goto L_0x012d
        L_0x00a4:
            w31.b r9 = u31.C118568a.f354847a
            java.lang.String r9 = "view_exp_min_rate"
            boolean r10 = u24.C90599h.m113511d(r9)
            r11 = 0
            if (r10 == 0) goto L_0x00b2
            goto L_0x00c7
        L_0x00b2:
            v31.c r10 = u31.C118568a.m167240g(r7, r6)
            java.lang.Object r9 = x31.C118825b.m167529a(r10, r9)
            if (r9 == 0) goto L_0x00c7
            boolean r10 = r9 instanceof java.lang.Double
            if (r10 == 0) goto L_0x00c7
            java.lang.Double r9 = (java.lang.Double) r9
            double r9 = r9.doubleValue()
            goto L_0x00c8
        L_0x00c7:
            r9 = r11
        L_0x00c8:
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x00fb
            android.graphics.Rect r13 = new android.graphics.Rect
            r13.<init>()
            r7.getDrawingRect(r13)
            int r14 = r8.right
            int r15 = r8.left
            int r14 = r14 - r15
            int r15 = r8.bottom
            int r8 = r8.top
            int r15 = r15 - r8
            int r14 = r14 * r15
            double r14 = (double) r14
            int r8 = r13.right
            int r5 = r13.left
            int r8 = r8 - r5
            int r5 = r13.bottom
            int r13 = r13.top
            int r5 = r5 - r13
            int r8 = r8 * r5
            r13 = r7
            double r6 = (double) r8
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 > 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            double r11 = r14 / r6
        L_0x00f6:
            int r6 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x00fc
            goto L_0x010f
        L_0x00fb:
            r13 = r7
        L_0x00fc:
            r6 = r13
            r7 = 0
        L_0x00fe:
            int r8 = r6.getVisibility()
            if (r8 != 0) goto L_0x012e
            float r8 = r13.getAlpha()
            r9 = 822702175(0x3109705f, float:2.0E-9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x0110
        L_0x010f:
            goto L_0x012e
        L_0x0110:
            r5 = 0
            v31.c r8 = u31.C118568a.m167240g(r6, r5)
            java.lang.Object r6 = m41.C117534a.m165778a(r6, r8)
            if (r6 != 0) goto L_0x011c
            goto L_0x012f
        L_0x011c:
            boolean r8 = r6 instanceof android.view.View
            if (r8 != 0) goto L_0x0124
            r8 = 1
            r16 = 1
            goto L_0x0132
        L_0x0124:
            android.view.View r6 = (android.view.View) r6
            r8 = 1
            int r7 = r7 + r8
            r9 = 100
            if (r7 < r9) goto L_0x00fe
            goto L_0x0130
        L_0x012d:
            r13 = r7
        L_0x012e:
            r5 = 0
        L_0x012f:
            r8 = 1
        L_0x0130:
            r16 = 0
        L_0x0132:
            if (r16 == 0) goto L_0x0137
            r3.add(r13)
        L_0x0137:
            r6 = 0
            goto L_0x005d
        L_0x013a:
            r5 = 0
            r8 = 1
            if (r3 != 0) goto L_0x0143
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0143:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0151:
            boolean r6 = r3.hasNext()
            r9 = 0
            if (r6 == 0) goto L_0x016f
            java.lang.Object r6 = r3.next()
            android.view.View r6 = (android.view.View) r6
            long r11 = u31.C118568a.m167241h(r6)
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x016b
            r4.add(r6)
            goto L_0x0151
        L_0x016b:
            r2.add(r6)
            goto L_0x0151
        L_0x016f:
            long r6 = java.lang.System.currentTimeMillis()
            java.util.Iterator r3 = r4.iterator()
        L_0x0177:
            boolean r11 = r3.hasNext()
            if (r11 == 0) goto L_0x01ce
            java.lang.Object r11 = r3.next()
            android.view.View r11 = (android.view.View) r11
            o41.a<android.view.View> r12 = r0.f350762o
            r12.iterator()
        L_0x0188:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0198
            java.lang.Object r13 = r12.next()
            android.view.View r13 = (android.view.View) r13
            if (r11 != r13) goto L_0x0188
            r12 = 1
            goto L_0x0199
        L_0x0198:
            r12 = 0
        L_0x0199:
            if (r12 != 0) goto L_0x0177
            if (r11 != 0) goto L_0x019e
            goto L_0x0177
        L_0x019e:
            long r12 = u31.C118568a.m167241h(r11)
            int r14 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r14 > 0) goto L_0x01a7
            goto L_0x0177
        L_0x01a7:
            java.util.Map<android.view.View, op3.b<java.lang.Long, java.lang.Integer>> r14 = r0.f350763p
            java.util.WeakHashMap r14 = (java.util.WeakHashMap) r14
            boolean r14 = r14.containsKey(r11)
            if (r14 != 0) goto L_0x0177
            java.util.Map<android.view.View, op3.b<java.lang.Long, java.lang.Integer>> r14 = r0.f350763p
            java.lang.Long r15 = java.lang.Long.valueOf(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r18)
            op3.b r5 = op3.C117882j.m166284c(r15, r5)
            java.util.WeakHashMap r14 = (java.util.WeakHashMap) r14
            r14.put(r11, r5)
            h41.b$$f r5 = new h41.b$$f
            r5.<init>(r0)
            m41.C117536f.m165802d(r5, r12)
            r5 = 0
            goto L_0x0177
        L_0x01ce:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            o41.a<android.view.View> r5 = r0.f350762o
            r5.iterator()
        L_0x01d8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x020c
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            java.util.Iterator r7 = r4.iterator()
        L_0x01e8:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x01f8
            java.lang.Object r9 = r7.next()
            android.view.View r9 = (android.view.View) r9
            if (r9 != r6) goto L_0x01e8
            r7 = 0
            goto L_0x01f9
        L_0x01f8:
            r7 = 1
        L_0x01f9:
            if (r7 == 0) goto L_0x01d8
            r0.Dx0(r6, r1)
            r3.add(r6)
            if (r6 != 0) goto L_0x0204
            goto L_0x01d8
        L_0x0204:
            java.util.Map<android.view.View, op3.b<java.lang.Long, java.lang.Integer>> r7 = r0.f350763p
            java.util.WeakHashMap r7 = (java.util.WeakHashMap) r7
            r7.remove(r6)
            goto L_0x01d8
        L_0x020c:
            java.util.Iterator r3 = r3.iterator()
        L_0x0210:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0222
            java.lang.Object r5 = r3.next()
            android.view.View r5 = (android.view.View) r5
            o41.a<android.view.View> r6 = r0.f350762o
            r6.mo182402h(r5)
            goto L_0x0210
        L_0x0222:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Map<android.view.View, op3.b<java.lang.Long, java.lang.Integer>> r5 = r0.f350763p
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0233:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x025a
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            java.util.Iterator r7 = r4.iterator()
        L_0x0243:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0253
            java.lang.Object r9 = r7.next()
            android.view.View r9 = (android.view.View) r9
            if (r9 != r6) goto L_0x0243
            r7 = 0
            goto L_0x0254
        L_0x0253:
            r7 = 1
        L_0x0254:
            if (r7 == 0) goto L_0x0233
            r3.add(r6)
            goto L_0x0233
        L_0x025a:
            java.util.Iterator r3 = r3.iterator()
        L_0x025e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L_0x026d
            goto L_0x025e
        L_0x026d:
            java.util.Map<android.view.View, op3.b<java.lang.Long, java.lang.Integer>> r5 = r0.f350763p
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5
            r5.remove(r4)
            goto L_0x025e
        L_0x0275:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r2.iterator()
        L_0x0283:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02ab
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            o41.a<android.view.View> r7 = r0.f350756f
            r7.iterator()
        L_0x0294:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02a4
            java.lang.Object r9 = r7.next()
            android.view.View r9 = (android.view.View) r9
            if (r6 != r9) goto L_0x0294
            r7 = 1
            goto L_0x02a5
        L_0x02a4:
            r7 = 0
        L_0x02a5:
            if (r7 != 0) goto L_0x0283
            r3.add(r6)
            goto L_0x0283
        L_0x02ab:
            o41.a<android.view.View> r5 = r0.f350756f
            r5.iterator()
        L_0x02b0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02d7
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            java.util.Iterator r7 = r2.iterator()
        L_0x02c0:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x02d0
            java.lang.Object r9 = r7.next()
            android.view.View r9 = (android.view.View) r9
            if (r9 != r6) goto L_0x02c0
            r7 = 0
            goto L_0x02d1
        L_0x02d0:
            r7 = 1
        L_0x02d1:
            if (r7 == 0) goto L_0x02b0
            r4.add(r6)
            goto L_0x02b0
        L_0x02d7:
            java.util.Iterator r5 = r4.iterator()
        L_0x02db:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x02f5
            java.lang.Object r6 = r5.next()
            android.view.View r6 = (android.view.View) r6
            java.util.Map<android.view.View, java.lang.Object> r7 = r0.f350759i
            java.util.WeakHashMap r7 = (java.util.WeakHashMap) r7
            boolean r7 = r7.containsKey(r6)
            if (r7 != 0) goto L_0x02db
            r0.Dx0(r6, r1)
            goto L_0x02db
        L_0x02f5:
            java.util.Iterator r4 = r4.iterator()
        L_0x02f9:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0313
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Map<android.view.View, java.lang.Object> r6 = r0.f350759i
            java.util.WeakHashMap r6 = (java.util.WeakHashMap) r6
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x02f9
            r0.Dx0(r5, r1)
            goto L_0x02f9
        L_0x0313:
            java.util.Iterator r4 = r3.iterator()
        L_0x0317:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0339
            java.lang.Object r5 = r4.next()
            android.view.View r5 = (android.view.View) r5
            java.util.Map<android.view.View, java.lang.Object> r6 = r0.f350759i
            java.util.WeakHashMap r6 = (java.util.WeakHashMap) r6
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0317
            h41.b$$l r6 = new h41.b$$l
            r6.<init>(r0, r5, r1)
            m41.C117536f.m165801c(r6)
            r2.add(r5)
            goto L_0x0317
        L_0x0339:
            java.util.Iterator r3 = r3.iterator()
        L_0x033d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x035f
            java.lang.Object r4 = r3.next()
            android.view.View r4 = (android.view.View) r4
            java.util.Map<android.view.View, java.lang.Object> r5 = r0.f350759i
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5
            boolean r5 = r5.containsKey(r4)
            if (r5 != 0) goto L_0x033d
            h41.b$$m r5 = new h41.b$$m
            r5.<init>(r0, r4, r1)
            m41.C117536f.m165801c(r5)
            r2.add(r4)
            goto L_0x033d
        L_0x035f:
            o41.a<android.view.View> r1 = r0.f350756f
            java.util.List<java.lang.ref.WeakReference<T>> r1 = r1.f352035d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.clear()
            java.util.Iterator r1 = r2.iterator()
        L_0x036c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x037e
            java.lang.Object r2 = r1.next()
            android.view.View r2 = (android.view.View) r2
            o41.a<android.view.View> r3 = r0.f350756f
            r3.add(r2)
            goto L_0x036c
        L_0x037e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h41.C117067b.Bx0(int):void");
    }

    public final void Cx0(View view, int i) {
        Object obj;
        if (view != null || this.f350764q) {
            Object[] objArr = new Object[4];
            Object obj2 = "";
            if (C118568a.m167243j(view)) {
                C118643c g = C118568a.m167240g(view, false);
                obj = g == null ? null : g.f355023a;
            } else {
                obj = obj2;
            }
            objArr[0] = obj;
            objArr[1] = Integer.valueOf(view.hashCode());
            objArr[2] = Integer.valueOf(view.getId());
            if (view instanceof TextView) {
                obj2 = ((TextView) view).getText();
            }
            objArr[3] = obj2;
            Log.m105925i("Amoeba.ViewExposeMonitor", "[viewExpose] viewId : %s, hash : %d, resId : %d, text : %s", objArr);
            Iterator it = ((ArrayList) this.f350766s).iterator();
            while (it.hasNext()) {
                ((C61213g.C61215b) it.next()).mo77122J(view, i);
            }
            Object obj3 = ((WeakHashMap) this.f350759i).get(view);
            if (obj3 != null) {
                Iterator it4 = ((ArrayList) this.f350765r).iterator();
                while (it4.hasNext()) {
                    ((C61213g.C61214a) it4.next()).mo86192b(obj3, i);
                }
            }
            C61213g.C61215b c = this.f350757g.mo182409c(view);
            if (c != null) {
                c.mo77122J(view, i);
            }
            C61213g.C61214a c2 = this.f350758h.mo182409c(view);
            if (c2 != null && obj3 != null) {
                c2.mo86192b(obj3, i);
            }
        }
    }

    public final void Dx0(View view, int i) {
        Object obj;
        if (view != null || this.f350764q) {
            Object[] objArr = new Object[4];
            Object obj2 = "";
            if (C118568a.m167243j(view)) {
                C118643c g = C118568a.m167240g(view, false);
                obj = g == null ? null : g.f355023a;
            } else {
                obj = obj2;
            }
            objArr[0] = obj;
            objArr[1] = Integer.valueOf(view.hashCode());
            objArr[2] = Integer.valueOf(view.getId());
            if (view instanceof TextView) {
                obj2 = ((TextView) view).getText();
            }
            objArr[3] = obj2;
            Log.m105925i("Amoeba.ViewExposeMonitor", "[viewUnExpose] viewId : %s, hash : %d, resId : %d, text : %s", objArr);
            Iterator it = ((ArrayList) this.f350766s).iterator();
            while (it.hasNext()) {
                ((C61213g.C61215b) it.next()).mo77123l(view, i);
            }
            Object obj3 = ((WeakHashMap) this.f350759i).get(view);
            if (obj3 != null) {
                Iterator it4 = ((ArrayList) this.f350765r).iterator();
                while (it4.hasNext()) {
                    ((C61213g.C61214a) it4.next()).mo86191a(obj3, i);
                }
            }
            C61213g.C61215b c = this.f350757g.mo182409c(view);
            if (c != null) {
                c.mo77123l(view, i);
            }
            C61213g.C61214a c2 = this.f350758h.mo182409c(view);
            if (c2 != null && obj3 != null) {
                c2.mo86191a(obj3, i);
            }
        }
    }

    public void Uw0(View view, boolean z) {
        if (view != null) {
            C117536f.m165799a(new b$$n(this, view, z));
        }
    }

    /* renamed from: mV */
    public void mo86190mV(View view, C61213g.C61215b bVar) {
        if (view != null && bVar != null) {
            C117536f.m165802d(new b$$o(this, view, bVar), 251);
        }
    }

    public final void xx0(View view) {
        View g;
        AppBarLayout appBarLayout;
        View view2 = view;
        if (view2 != null && (g = C117534a.m165784g(view)) != null) {
            if ((g instanceof ViewGroup) && g.getTag(C0966R.C0970id.n2c) == null) {
                try {
                    b$$t b__t = new b$$t(this, g.getContext());
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Float.valueOf(2.0E-9f));
                    C117292a.m165358d(b__t, aVar.mo10232b(), "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    b__t.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                    C117292a.m165359e(b__t, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(4);
                    C117292a.m165358d(b__t, aVar2.mo10232b(), "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    b__t.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(b__t, "com/tencent/mm/plugin/datareport/monitor/adapter/view/expose/ViewExposeMonitor", "addAssistMonitorView", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((ViewGroup) g).addView(b__t, new ViewGroup.LayoutParams(0, 0));
                    g.setTag(C0966R.C0970id.n2c, Boolean.TRUE);
                } catch (Exception e) {
                    Log.m105920e("Amoeba.ViewExposeMonitor", "[addAssistantView] fail, view : " + g + ", Exception : " + e.getMessage());
                } catch (Error e2) {
                    Log.m105920e("Amoeba.ViewExposeMonitor", "[addAssistantView] fail, view : " + g + ", Error : " + e2.getMessage());
                }
            }
            Object tag = view2.getTag(C0966R.C0970id.n4x);
            if (tag != null && (tag instanceof View.OnAttachStateChangeListener)) {
                view2.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener) tag);
            }
            C117068c cVar = new C117068c(this, view2);
            view2.addOnAttachStateChangeListener(cVar);
            view2.setTag(C0966R.C0970id.n4x, cVar);
            List<View> Ax0 = Ax0(view2, g, 0);
            if (Ax0 != null) {
                ArrayList arrayList = (ArrayList) Ax0;
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        View view3 = (View) it.next();
                        if (!(view3 instanceof ScrollView) && !(view3 instanceof ListView)) {
                            if (view3 instanceof ViewPager) {
                                ViewPager viewPager = (ViewPager) view3;
                                if (viewPager != null) {
                                    Object tag2 = viewPager.getTag(C0966R.C0970id.n4y);
                                    if (tag2 != null && (tag2 instanceof ViewPager.OnPageChangeListener)) {
                                        viewPager.removeOnPageChangeListener((ViewPager.OnPageChangeListener) tag2);
                                    }
                                    C108058e eVar = new C108058e(this);
                                    viewPager.addOnPageChangeListener(eVar);
                                    viewPager.setTag(C0966R.C0970id.n4y, eVar);
                                }
                            } else if (view3 instanceof RecyclerView) {
                                RecyclerView recyclerView = (RecyclerView) view3;
                                if (recyclerView != null) {
                                    Object tag3 = recyclerView.getTag(C0966R.C0970id.n3e);
                                    if (tag3 != null && (tag3 instanceof RecyclerView.C0130p)) {
                                        recyclerView.mo17098m1((RecyclerView.C0130p) tag3);
                                    }
                                    C117069d dVar = new C117069d(this);
                                    recyclerView.mo17043c(dVar);
                                    recyclerView.setTag(C0966R.C0970id.n3e, dVar);
                                }
                            } else if ((view3 instanceof AppBarLayout) && (appBarLayout = (AppBarLayout) view3) != null) {
                                Object tag4 = appBarLayout.getTag(C0966R.C0970id.a3n);
                                if (tag4 != null && (tag4 instanceof AppBarLayout.C67444b)) {
                                    AppBarLayout.C67444b bVar = (AppBarLayout.C67444b) tag4;
                                    List<AppBarLayout.C67444b> list = appBarLayout.f309049j;
                                    if (list != null) {
                                        ((ArrayList) list).remove(bVar);
                                    }
                                }
                                C117070f fVar = new C117070f(this, appBarLayout);
                                appBarLayout.mo146159a(fVar);
                                appBarLayout.setTag(C0966R.C0970id.a3n, fVar);
                            }
                        }
                    }
                }
            }
        }
    }

    public void yx0(Object obj) {
        if (obj != null) {
            if (!C118361a.m166983a().mo183164b(new C112756b(obj))) {
                this.f350760j = new WeakReference<>(obj);
                Log.m105924i("Amoeba.ViewExposeMonitor", "[pageChange] page : " + obj);
            }
            C117536f.m165799a(new b$$h(this));
        }
    }

    public void zx0(int i, long j) {
        b$$u b__u = this.f350754d;
        b__u.f350805d = i;
        C117536f.f351647a.removeCallbacks(b__u);
        C117536f.m165802d(this.f350754d, j);
    }
}
