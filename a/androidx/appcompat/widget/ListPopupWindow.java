package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.tencent.p014mm.C0966R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p1130l.C109068h;
import p433g.C107593a;
import p849e3.C107168a0;
import p849e3.C107207u;

public class ListPopupWindow implements C109068h {

    /* renamed from: F */
    public static Method f305507F;

    /* renamed from: G */
    public static Method f305508G;

    /* renamed from: H */
    public static Method f305509H;

    /* renamed from: A */
    public final Handler f305510A;

    /* renamed from: B */
    public final Rect f305511B;

    /* renamed from: C */
    public Rect f305512C;

    /* renamed from: D */
    public boolean f305513D;

    /* renamed from: E */
    public PopupWindow f305514E;

    /* renamed from: d */
    public Context f305515d;

    /* renamed from: e */
    public ListAdapter f305516e;

    /* renamed from: f */
    public C103557q f305517f;

    /* renamed from: g */
    public int f305518g;

    /* renamed from: h */
    public int f305519h;

    /* renamed from: i */
    public int f305520i;

    /* renamed from: j */
    public int f305521j;

    /* renamed from: n */
    public int f305522n;

    /* renamed from: o */
    public boolean f305523o;

    /* renamed from: p */
    public boolean f305524p;

    /* renamed from: q */
    public boolean f305525q;

    /* renamed from: r */
    public int f305526r;

    /* renamed from: s */
    public int f305527s;

    /* renamed from: t */
    public DataSetObserver f305528t;

    /* renamed from: u */
    public View f305529u;

    /* renamed from: v */
    public AdapterView.OnItemClickListener f305530v;

    /* renamed from: w */
    public final C103498e f305531w;

    /* renamed from: x */
    public final C103497d f305532x;

    /* renamed from: y */
    public final C103496c f305533y;

    /* renamed from: z */
    public final C103494a f305534z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public class C103494a implements Runnable {
        public C103494a() {
        }

        public void run() {
            C103557q qVar = ListPopupWindow.this.f305517f;
            if (qVar != null) {
                qVar.setListSelectionHidden(true);
                qVar.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public class C103495b extends DataSetObserver {
        public C103495b() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public class C103496c implements AbsListView.OnScrollListener {
        public C103496c() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (ListPopupWindow.this.f305514E.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && ListPopupWindow.this.f305514E.getContentView() != null) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.f305510A.removeCallbacks(listPopupWindow.f305531w);
                    ListPopupWindow.this.f305531w.run();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public class C103497d implements View.OnTouchListener {
        public C103497d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f305514E) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f305514E.getWidth() && y >= 0 && y < ListPopupWindow.this.f305514E.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f305510A.postDelayed(listPopupWindow.f305531w, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f305510A.removeCallbacks(listPopupWindow2.f305531w);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public class C103498e implements Runnable {
        public C103498e() {
        }

        public void run() {
            C103557q qVar = ListPopupWindow.this.f305517f;
            if (qVar != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(qVar) && ListPopupWindow.this.f305517f.getCount() > ListPopupWindow.this.f305517f.getChildCount()) {
                    int childCount = ListPopupWindow.this.f305517f.getChildCount();
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    if (childCount <= listPopupWindow.f305527s) {
                        listPopupWindow.f305514E.setInputMethodMode(2);
                        ListPopupWindow.this.show();
                    }
                }
            }
        }
    }

    static {
        Class<PopupWindow> cls = PopupWindow.class;
        try {
            f305507F = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
        }
        Class<PopupWindow> cls2 = PopupWindow.class;
        try {
            f305508G = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
        }
        try {
            f305509H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0966R.attr.f2862tz);
    }

    /* renamed from: c */
    public C103557q mo144090c(Context context, boolean z) {
        return new C103557q(context, z);
    }

    /* renamed from: d */
    public void mo144018d(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f305528t;
        if (dataSetObserver == null) {
            this.f305528t = new C103495b();
        } else {
            ListAdapter listAdapter2 = this.f305516e;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f305516e = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f305528t);
        }
        C103557q qVar = this.f305517f;
        if (qVar != null) {
            qVar.setAdapter(this.f305516e);
        }
    }

    public void dismiss() {
        this.f305514E.dismiss();
        this.f305514E.setContentView((View) null);
        this.f305517f = null;
        this.f305510A.removeCallbacks(this.f305531w);
    }

    /* renamed from: e */
    public void mo144091e(int i) {
        Drawable background = this.f305514E.getBackground();
        if (background != null) {
            background.getPadding(this.f305511B);
            Rect rect = this.f305511B;
            this.f305519h = rect.left + rect.right + i;
            return;
        }
        this.f305519h = i;
    }

    public ListView getListView() {
        return this.f305517f;
    }

    public boolean isShowing() {
        return this.f305514E.isShowing();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0188  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void show() {
        /*
            r14 = this;
            androidx.appcompat.widget.q r0 = r14.f305517f
            r1 = 1
            if (r0 != 0) goto L_0x003f
            android.content.Context r0 = r14.f305515d
            boolean r2 = r14.f305513D
            r2 = r2 ^ r1
            androidx.appcompat.widget.q r0 = r14.mo144090c(r0, r2)
            r14.f305517f = r0
            android.widget.ListAdapter r2 = r14.f305516e
            r0.setAdapter(r2)
            androidx.appcompat.widget.q r0 = r14.f305517f
            android.widget.AdapterView$OnItemClickListener r2 = r14.f305530v
            r0.setOnItemClickListener(r2)
            androidx.appcompat.widget.q r0 = r14.f305517f
            r0.setFocusable(r1)
            androidx.appcompat.widget.q r0 = r14.f305517f
            r0.setFocusableInTouchMode(r1)
            androidx.appcompat.widget.q r0 = r14.f305517f
            androidx.appcompat.widget.t r2 = new androidx.appcompat.widget.t
            r2.<init>(r14)
            r0.setOnItemSelectedListener(r2)
            androidx.appcompat.widget.q r0 = r14.f305517f
            androidx.appcompat.widget.ListPopupWindow$c r2 = r14.f305533y
            r0.setOnScrollListener(r2)
            androidx.appcompat.widget.q r0 = r14.f305517f
            android.widget.PopupWindow r2 = r14.f305514E
            r2.setContentView(r0)
            goto L_0x0047
        L_0x003f:
            android.widget.PopupWindow r0 = r14.f305514E
            android.view.View r0 = r0.getContentView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L_0x0047:
            android.widget.PopupWindow r0 = r14.f305514E
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r2 = 0
            if (r0 == 0) goto L_0x0064
            android.graphics.Rect r3 = r14.f305511B
            r0.getPadding(r3)
            android.graphics.Rect r0 = r14.f305511B
            int r3 = r0.top
            int r0 = r0.bottom
            int r0 = r0 + r3
            boolean r4 = r14.f305523o
            if (r4 != 0) goto L_0x006a
            int r3 = -r3
            r14.f305521j = r3
            goto L_0x006a
        L_0x0064:
            android.graphics.Rect r0 = r14.f305511B
            r0.setEmpty()
            r0 = 0
        L_0x006a:
            android.widget.PopupWindow r3 = r14.f305514E
            int r3 = r3.getInputMethodMode()
            r4 = 2
            if (r3 != r4) goto L_0x0075
            r3 = 1
            goto L_0x0076
        L_0x0075:
            r3 = 0
        L_0x0076:
            android.view.View r5 = r14.f305529u
            int r6 = r14.f305521j
            java.lang.reflect.Method r7 = f305508G
            if (r7 == 0) goto L_0x009c
            android.widget.PopupWindow r8 = r14.f305514E     // Catch:{ Exception -> 0x009c }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x009c }
            r9[r2] = r5     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x009c }
            r9[r1] = r10     // Catch:{ Exception -> 0x009c }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x009c }
            r9[r4] = r3     // Catch:{ Exception -> 0x009c }
            java.lang.Object r3 = r7.invoke(r8, r9)     // Catch:{ Exception -> 0x009c }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x009c }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x009c }
            goto L_0x00a2
        L_0x009c:
            android.widget.PopupWindow r3 = r14.f305514E
            int r3 = r3.getMaxAvailableHeight(r5, r6)
        L_0x00a2:
            int r5 = r14.f305518g
            r6 = -2
            r7 = -1
            if (r5 != r7) goto L_0x00a9
            goto L_0x0108
        L_0x00a9:
            int r5 = r14.f305519h
            if (r5 == r6) goto L_0x00cf
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 == r7) goto L_0x00b6
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            goto L_0x00e9
        L_0x00b6:
            android.content.Context r5 = r14.f305515d
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            android.graphics.Rect r9 = r14.f305511B
            int r10 = r9.left
            int r9 = r9.right
            int r10 = r10 + r9
            int r5 = r5 - r10
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            goto L_0x00e9
        L_0x00cf:
            android.content.Context r5 = r14.f305515d
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            android.graphics.Rect r8 = r14.f305511B
            int r9 = r8.left
            int r8 = r8.right
            int r9 = r9 + r8
            int r5 = r5 - r9
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
        L_0x00e9:
            r9 = r5
            androidx.appcompat.widget.q r8 = r14.f305517f
            r10 = 0
            r11 = -1
            int r12 = r3 + 0
            r13 = -1
            int r3 = r8.mo144415b(r9, r10, r11, r12, r13)
            if (r3 <= 0) goto L_0x0107
            androidx.appcompat.widget.q r5 = r14.f305517f
            int r5 = r5.getPaddingTop()
            androidx.appcompat.widget.q r8 = r14.f305517f
            int r8 = r8.getPaddingBottom()
            int r5 = r5 + r8
            int r0 = r0 + r5
            int r0 = r0 + r2
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            int r3 = r3 + r0
            android.widget.PopupWindow r0 = r14.f305514E
            int r0 = r0.getInputMethodMode()
            if (r0 != r4) goto L_0x0113
            r0 = 1
            goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            android.widget.PopupWindow r4 = r14.f305514E
            int r5 = r14.f305522n
            androidx.core.widget.C103729f.m138094b(r4, r5)
            android.widget.PopupWindow r4 = r14.f305514E
            boolean r4 = r4.isShowing()
            if (r4 == 0) goto L_0x0188
            android.view.View r4 = r14.f305529u
            java.util.WeakHashMap<android.view.View, e3.a0> r5 = p849e3.C107207u.f320808a
            boolean r4 = p849e3.C107207u.C107211e.m145207b(r4)
            if (r4 != 0) goto L_0x012e
            return
        L_0x012e:
            int r4 = r14.f305519h
            if (r4 != r7) goto L_0x0134
            r4 = -1
            goto L_0x013c
        L_0x0134:
            if (r4 != r6) goto L_0x013c
            android.view.View r4 = r14.f305529u
            int r4 = r4.getWidth()
        L_0x013c:
            int r5 = r14.f305518g
            if (r5 != r7) goto L_0x0168
            if (r0 == 0) goto L_0x0143
            goto L_0x0144
        L_0x0143:
            r3 = -1
        L_0x0144:
            if (r0 == 0) goto L_0x0158
            android.widget.PopupWindow r0 = r14.f305514E
            int r5 = r14.f305519h
            if (r5 != r7) goto L_0x014e
            r5 = -1
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            r0.setWidth(r5)
            android.widget.PopupWindow r0 = r14.f305514E
            r0.setHeight(r2)
            goto L_0x016c
        L_0x0158:
            android.widget.PopupWindow r0 = r14.f305514E
            int r5 = r14.f305519h
            if (r5 != r7) goto L_0x015f
            r2 = -1
        L_0x015f:
            r0.setWidth(r2)
            android.widget.PopupWindow r0 = r14.f305514E
            r0.setHeight(r7)
            goto L_0x016c
        L_0x0168:
            if (r5 != r6) goto L_0x016b
            goto L_0x016c
        L_0x016b:
            r3 = r5
        L_0x016c:
            android.widget.PopupWindow r0 = r14.f305514E
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r8 = r14.f305514E
            android.view.View r9 = r14.f305529u
            int r10 = r14.f305520i
            int r11 = r14.f305521j
            if (r4 >= 0) goto L_0x017d
            r12 = -1
            goto L_0x017e
        L_0x017d:
            r12 = r4
        L_0x017e:
            if (r3 >= 0) goto L_0x0182
            r13 = -1
            goto L_0x0183
        L_0x0182:
            r13 = r3
        L_0x0183:
            r8.update(r9, r10, r11, r12, r13)
            goto L_0x0216
        L_0x0188:
            int r0 = r14.f305519h
            if (r0 != r7) goto L_0x018e
            r0 = -1
            goto L_0x0196
        L_0x018e:
            if (r0 != r6) goto L_0x0196
            android.view.View r0 = r14.f305529u
            int r0 = r0.getWidth()
        L_0x0196:
            int r4 = r14.f305518g
            if (r4 != r7) goto L_0x019c
            r3 = -1
            goto L_0x01a0
        L_0x019c:
            if (r4 != r6) goto L_0x019f
            goto L_0x01a0
        L_0x019f:
            r3 = r4
        L_0x01a0:
            android.widget.PopupWindow r4 = r14.f305514E
            r4.setWidth(r0)
            android.widget.PopupWindow r0 = r14.f305514E
            r0.setHeight(r3)
            java.lang.reflect.Method r0 = f305507F
            if (r0 == 0) goto L_0x01bb
            android.widget.PopupWindow r3 = r14.f305514E     // Catch:{ Exception -> 0x01ba }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01ba }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x01ba }
            r4[r2] = r5     // Catch:{ Exception -> 0x01ba }
            r0.invoke(r3, r4)     // Catch:{ Exception -> 0x01ba }
            goto L_0x01bb
        L_0x01ba:
        L_0x01bb:
            android.widget.PopupWindow r0 = r14.f305514E
            r0.setOutsideTouchable(r1)
            android.widget.PopupWindow r0 = r14.f305514E
            androidx.appcompat.widget.ListPopupWindow$d r3 = r14.f305532x
            r0.setTouchInterceptor(r3)
            boolean r0 = r14.f305525q
            if (r0 == 0) goto L_0x01d2
            android.widget.PopupWindow r0 = r14.f305514E
            boolean r3 = r14.f305524p
            androidx.core.widget.C103729f.m138093a(r0, r3)
        L_0x01d2:
            java.lang.reflect.Method r0 = f305509H
            if (r0 == 0) goto L_0x01e3
            android.widget.PopupWindow r3 = r14.f305514E     // Catch:{ Exception -> 0x01e2 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x01e2 }
            android.graphics.Rect r5 = r14.f305512C     // Catch:{ Exception -> 0x01e2 }
            r4[r2] = r5     // Catch:{ Exception -> 0x01e2 }
            r0.invoke(r3, r4)     // Catch:{ Exception -> 0x01e2 }
            goto L_0x01e3
        L_0x01e2:
        L_0x01e3:
            android.widget.PopupWindow r0 = r14.f305514E
            android.view.View r2 = r14.f305529u
            int r3 = r14.f305520i
            int r4 = r14.f305521j
            int r5 = r14.f305526r
            androidx.core.widget.C103729f.C103730a.m138095a(r0, r2, r3, r4, r5)
            androidx.appcompat.widget.q r0 = r14.f305517f
            r0.setSelection(r7)
            boolean r0 = r14.f305513D
            if (r0 == 0) goto L_0x0201
            androidx.appcompat.widget.q r0 = r14.f305517f
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x020b
        L_0x0201:
            androidx.appcompat.widget.q r0 = r14.f305517f
            if (r0 == 0) goto L_0x020b
            r0.setListSelectionHidden(r1)
            r0.requestLayout()
        L_0x020b:
            boolean r0 = r14.f305513D
            if (r0 != 0) goto L_0x0216
            android.os.Handler r0 = r14.f305510A
            androidx.appcompat.widget.ListPopupWindow$a r1 = r14.f305534z
            r0.post(r1)
        L_0x0216:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ListPopupWindow.show():void");
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f305518g = -2;
        this.f305519h = -2;
        this.f305522n = 1002;
        this.f305526r = 0;
        this.f305527s = Integer.MAX_VALUE;
        this.f305531w = new C103498e();
        this.f305532x = new C103497d();
        this.f305533y = new C103496c();
        this.f305534z = new C103494a();
        this.f305511B = new Rect();
        this.f305515d = context;
        this.f305510A = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C107593a.f321919s, i, i2);
        this.f305520i = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f305521j = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f305523o = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f305514E = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
