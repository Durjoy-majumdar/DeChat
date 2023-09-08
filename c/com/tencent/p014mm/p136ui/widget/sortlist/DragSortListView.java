package com.tencent.p014mm.p136ui.widget.sortlist;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.p014mm.p136ui.C85975v4;
import j20.C117292a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import wo3.C111819a;
import wo3.C111821b;
import wo3.C111822c;
import yo3.C79142a;

/* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView */
public class DragSortListView extends ListView {

    /* renamed from: d1 */
    public static final /* synthetic */ int f319726d1 = 0;

    /* renamed from: A */
    public int f319727A = 1;

    /* renamed from: B */
    public int f319728B;

    /* renamed from: C */
    public int f319729C;

    /* renamed from: D */
    public int f319730D = 0;

    /* renamed from: E */
    public View[] f319731E = new View[1];

    /* renamed from: F */
    public C106829f f319732F;

    /* renamed from: G */
    public float f319733G = 0.33333334f;

    /* renamed from: H */
    public float f319734H = 0.33333334f;

    /* renamed from: I */
    public int f319735I;

    /* renamed from: J */
    public int f319736J;

    /* renamed from: K */
    public float f319737K;

    /* renamed from: L */
    public float f319738L;

    /* renamed from: M */
    public float f319739M;

    /* renamed from: N */
    public float f319740N;

    /* renamed from: P */
    public float f319741P = 0.5f;

    /* renamed from: Q */
    public C106828e f319742Q = new C106825a();

    /* renamed from: Q0 */
    public float f319743Q0 = 0.25f;

    /* renamed from: R */
    public int f319744R;

    /* renamed from: R0 */
    public float f319745R0 = 0.0f;

    /* renamed from: S */
    public int f319746S;

    /* renamed from: S0 */
    public C106827c f319747S0;

    /* renamed from: T */
    public int f319748T;

    /* renamed from: T0 */
    public boolean f319749T0 = false;

    /* renamed from: U */
    public int f319750U = 0;

    /* renamed from: U0 */
    public C85982h f319751U0;

    /* renamed from: V */
    public boolean f319752V = false;

    /* renamed from: V0 */
    public boolean f319753V0 = false;

    /* renamed from: W */
    public boolean f319754W = false;

    /* renamed from: W0 */
    public boolean f319755W0 = false;

    /* renamed from: X0 */
    public C106832l f319756X0 = new C106832l(this, 3, (C106825a) null);

    /* renamed from: Y0 */
    public C106833m f319757Y0;

    /* renamed from: Z0 */
    public C106830i f319758Z0;

    /* renamed from: a1 */
    public boolean f319759a1;

    /* renamed from: b1 */
    public float f319760b1 = 0.0f;

    /* renamed from: c1 */
    public boolean f319761c1 = false;

    /* renamed from: d */
    public View f319762d;

    /* renamed from: e */
    public Point f319763e = new Point();

    /* renamed from: f */
    public Point f319764f = new Point();

    /* renamed from: g */
    public int f319765g;

    /* renamed from: h */
    public boolean f319766h = false;

    /* renamed from: i */
    public DataSetObserver f319767i;

    /* renamed from: j */
    public float f319768j = 1.0f;

    /* renamed from: n */
    public float f319769n = 1.0f;

    /* renamed from: o */
    public int f319770o;

    /* renamed from: p */
    public int f319771p;

    /* renamed from: p0 */
    public C106831k f319772p0 = null;

    /* renamed from: q */
    public int f319773q;

    /* renamed from: r */
    public boolean f319774r = false;

    /* renamed from: s */
    public int f319775s;

    /* renamed from: t */
    public int f319776t;

    /* renamed from: u */
    public int f319777u;

    /* renamed from: v */
    public C85980d f319778v;

    /* renamed from: w */
    public C85983j f319779w;

    /* renamed from: x */
    public C85984n f319780x;

    /* renamed from: x0 */
    public MotionEvent f319781x0;

    /* renamed from: y */
    public boolean f319782y = true;

    /* renamed from: y0 */
    public int f319783y0 = 0;

    /* renamed from: z */
    public int f319784z = 0;

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$d */
    public interface C85980d {
        /* renamed from: a */
        void mo119909a(int i, int i2);
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$g */
    public interface C85981g extends C85983j, C85980d, C85984n {
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$h */
    public class C85982h {

        /* renamed from: a */
        public StringBuilder f250432a = new StringBuilder();

        /* renamed from: b */
        public File f250433b;

        /* renamed from: c */
        public int f250434c = 0;

        /* renamed from: d */
        public int f250435d = 0;

        /* renamed from: e */
        public boolean f250436e = false;

        public C85982h() {
            File file = new File(Environment.getExternalStorageDirectory(), "dslv_state.txt");
            this.f250433b = file;
            if (!file.exists()) {
                try {
                    if (!this.f250433b.createNewFile()) {
                        C85975v4.m106305b("mobeta", "creat file fail!! file already exist", new Object[0]);
                    }
                    C85975v4.m106304a("mobeta", "file created", new Object[0]);
                } catch (IOException e) {
                    C85975v4.m106309f("mobeta", "Could not create dslv_state.txt", new Object[0]);
                    C85975v4.m106304a("mobeta", e.getMessage(), new Object[0]);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0054 A[SYNTHETIC, Splitter:B:22:0x0054] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[SYNTHETIC, Splitter:B:29:0x0061] */
        /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo119910a() {
            /*
                r10 = this;
                java.lang.String r0 = "IOException"
                java.lang.String r1 = "DragSortListView"
                boolean r2 = r10.f250436e
                if (r2 != 0) goto L_0x0009
                return
            L_0x0009:
                r2 = 0
                r3 = 0
                int r4 = r10.f250435d     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                r5 = 1
                if (r4 != 0) goto L_0x0012
                r4 = 0
                goto L_0x0013
            L_0x0012:
                r4 = 1
            L_0x0013:
                java.io.BufferedWriter r6 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                java.io.File r9 = r10.f250433b     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                r8.<init>(r9, r4)     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                java.lang.String r4 = "UTF-8"
                r7.<init>(r8, r4)     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                r6.<init>(r7)     // Catch:{ IOException -> 0x005f, all -> 0x004f }
                java.lang.StringBuilder r2 = r10.f250432a     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                r6.write(r2)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                java.lang.StringBuilder r2 = r10.f250432a     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                int r4 = r2.length()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                r2.delete(r3, r4)     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                r6.flush()     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                int r2 = r10.f250435d     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                int r2 = r2 + r5
                r10.f250435d = r2     // Catch:{ IOException -> 0x004d, all -> 0x004b }
                r6.close()     // Catch:{ IOException -> 0x0044 }
                goto L_0x006b
            L_0x0044:
                r2 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.tencent.p014mm.p136ui.C85975v4.m106307d(r1, r2, r0, r3)
                goto L_0x006b
            L_0x004b:
                r2 = move-exception
                goto L_0x0052
            L_0x004d:
                r2 = r6
                goto L_0x005f
            L_0x004f:
                r4 = move-exception
                r6 = r2
                r2 = r4
            L_0x0052:
                if (r6 == 0) goto L_0x005e
                r6.close()     // Catch:{ IOException -> 0x0058 }
                goto L_0x005e
            L_0x0058:
                r4 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.tencent.p014mm.p136ui.C85975v4.m106307d(r1, r4, r0, r3)
            L_0x005e:
                throw r2
            L_0x005f:
                if (r2 == 0) goto L_0x006b
                r2.close()     // Catch:{ IOException -> 0x0065 }
                goto L_0x006b
            L_0x0065:
                r2 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r3]
                com.tencent.p014mm.p136ui.C85975v4.m106307d(r1, r2, r0, r3)
            L_0x006b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView.C85982h.mo119910a():void");
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$j */
    public interface C85983j {
        /* renamed from: b */
        void mo81248b(int i, int i2);
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$n */
    public interface C85984n {
        void remove(int i);
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$a */
    public class C106825a implements C106828e {
        public C106825a() {
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$b */
    public class C106826b extends DataSetObserver {
        public C106826b() {
        }

        public void onChanged() {
            DragSortListView dragSortListView = DragSortListView.this;
            if (dragSortListView.f319784z == 4) {
                dragSortListView.mo154689g();
            }
        }

        public void onInvalidated() {
            DragSortListView dragSortListView = DragSortListView.this;
            if (dragSortListView.f319784z == 4) {
                dragSortListView.mo154689g();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$c */
    public class C106827c extends BaseAdapter {

        /* renamed from: d */
        public ListAdapter f319787d;

        public C106827c(ListAdapter listAdapter, C106825a aVar) {
            this.f319787d = listAdapter;
            listAdapter.registerDataSetObserver(new C106835a(this, DragSortListView.this));
        }

        public boolean areAllItemsEnabled() {
            return this.f319787d.areAllItemsEnabled();
        }

        public int getCount() {
            return this.f319787d.getCount();
        }

        public Object getItem(int i) {
            return this.f319787d.getItem(i);
        }

        public long getItemId(int i) {
            return this.f319787d.getItemId(i);
        }

        public int getItemViewType(int i) {
            return this.f319787d.getItemViewType(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C111821b bVar;
            if (view == null || !(view instanceof C111821b)) {
                View view2 = this.f319787d.getView(i, (View) null, DragSortListView.this);
                C111821b cVar = view2 instanceof Checkable ? new C111822c(DragSortListView.this.getContext()) : new C111821b(DragSortListView.this.getContext());
                cVar.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
                cVar.addView(view2);
                bVar = cVar;
            } else {
                bVar = (C111821b) view;
                View childAt = bVar.getChildAt(0);
                View view3 = this.f319787d.getView(i, childAt, DragSortListView.this);
                if (view3 != childAt) {
                    if (childAt != null) {
                        bVar.removeViewAt(0);
                    }
                    bVar.addView(view3);
                }
            }
            DragSortListView dragSortListView = DragSortListView.this;
            int i2 = DragSortListView.f319726d1;
            dragSortListView.mo154685c(i + dragSortListView.getHeaderViewsCount(), bVar, true);
            return bVar;
        }

        public int getViewTypeCount() {
            return this.f319787d.getViewTypeCount();
        }

        public boolean hasStableIds() {
            return this.f319787d.hasStableIds();
        }

        public boolean isEmpty() {
            return this.f319787d.isEmpty();
        }

        public boolean isEnabled(int i) {
            return this.f319787d.isEnabled(i);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$e */
    public interface C106828e {
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$f */
    public class C106829f implements Runnable {

        /* renamed from: d */
        public boolean f319789d;

        /* renamed from: e */
        public long f319790e;

        /* renamed from: f */
        public long f319791f;

        /* renamed from: g */
        public int f319792g;

        /* renamed from: h */
        public int f319793h;

        /* renamed from: i */
        public float f319794i;

        /* renamed from: j */
        public boolean f319795j = false;

        public C106829f() {
        }

        /* renamed from: a */
        public void mo154741a(boolean z) {
            if (z) {
                DragSortListView.this.removeCallbacks(this);
                this.f319795j = false;
                return;
            }
            this.f319789d = true;
        }

        public void run() {
            if (this.f319789d) {
                this.f319795j = false;
                return;
            }
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            int lastVisiblePosition = DragSortListView.this.getLastVisiblePosition();
            int count = DragSortListView.this.getCount();
            int paddingTop = DragSortListView.this.getPaddingTop();
            int height = (DragSortListView.this.getHeight() - paddingTop) - DragSortListView.this.getPaddingBottom();
            DragSortListView dragSortListView = DragSortListView.this;
            int min = Math.min(dragSortListView.f319746S, dragSortListView.f319765g + dragSortListView.f319729C);
            DragSortListView dragSortListView2 = DragSortListView.this;
            int max = Math.max(dragSortListView2.f319746S, dragSortListView2.f319765g - dragSortListView2.f319729C);
            if (this.f319793h == 0) {
                View childAt = DragSortListView.this.getChildAt(0);
                if (childAt == null) {
                    this.f319795j = false;
                    return;
                } else if (firstVisiblePosition == 0 && childAt.getTop() == paddingTop) {
                    this.f319795j = false;
                    return;
                } else {
                    DragSortListView dragSortListView3 = DragSortListView.this;
                    C106828e eVar = dragSortListView3.f319742Q;
                    this.f319794i = DragSortListView.this.f319741P * ((dragSortListView3.f319738L - ((float) max)) / dragSortListView3.f319739M);
                }
            } else {
                View childAt2 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
                if (childAt2 == null) {
                    this.f319795j = false;
                    return;
                } else if (lastVisiblePosition != count - 1 || childAt2.getBottom() > height + paddingTop) {
                    DragSortListView dragSortListView4 = DragSortListView.this;
                    C106828e eVar2 = dragSortListView4.f319742Q;
                    this.f319794i = -(DragSortListView.this.f319741P * ((((float) min) - dragSortListView4.f319737K) / dragSortListView4.f319740N));
                } else {
                    this.f319795j = false;
                    return;
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            this.f319791f = uptimeMillis;
            int round = Math.round(this.f319794i * ((float) (uptimeMillis - this.f319790e)));
            this.f319792g = round;
            if (round >= 0) {
                this.f319792g = Math.min(height, round);
                lastVisiblePosition = firstVisiblePosition;
            } else {
                this.f319792g = Math.max(-height, round);
            }
            View childAt3 = DragSortListView.this.getChildAt(lastVisiblePosition - firstVisiblePosition);
            int top = childAt3.getTop() + this.f319792g;
            if (lastVisiblePosition == 0 && top > paddingTop) {
                top = paddingTop;
            }
            DragSortListView dragSortListView5 = DragSortListView.this;
            dragSortListView5.f319753V0 = true;
            dragSortListView5.setSelectionFromTop(lastVisiblePosition, top - paddingTop);
            DragSortListView.this.layoutChildren();
            DragSortListView.this.invalidate();
            DragSortListView dragSortListView6 = DragSortListView.this;
            dragSortListView6.f319753V0 = false;
            dragSortListView6.mo154694j(lastVisiblePosition, childAt3, false);
            this.f319790e = this.f319791f;
            DragSortListView.this.post(this);
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$i */
    public class C106830i extends C106834o {

        /* renamed from: p */
        public int f319797p;

        /* renamed from: q */
        public int f319798q;

        /* renamed from: r */
        public float f319799r;

        /* renamed from: s */
        public float f319800s;

        public C106830i(float f, int i, C106825a aVar) {
            super(f, i, (C106825a) null);
        }

        /* renamed from: a */
        public void mo154743a() {
            DragSortListView dragSortListView = DragSortListView.this;
            int i = DragSortListView.f319726d1;
            dragSortListView.mo154699n();
        }

        /* renamed from: b */
        public void mo154744b(float f, float f2) {
            int c = mo154745c();
            int paddingLeft = DragSortListView.this.getPaddingLeft();
            Point point = DragSortListView.this.f319763e;
            float f3 = (float) (point.x - paddingLeft);
            float f4 = 1.0f - f2;
            if (f4 < Math.abs(((float) (point.y - c)) / this.f319799r) || f4 < Math.abs(f3 / this.f319800s)) {
                DragSortListView dragSortListView = DragSortListView.this;
                Point point2 = dragSortListView.f319763e;
                point2.y = c + ((int) (this.f319799r * f4));
                point2.x = dragSortListView.getPaddingLeft() + ((int) (this.f319800s * f4));
                DragSortListView.this.mo154695k(true);
            }
        }

        /* renamed from: c */
        public final int mo154745c() {
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            DragSortListView dragSortListView = DragSortListView.this;
            int dividerHeight = (dragSortListView.f319727A + dragSortListView.getDividerHeight()) / 2;
            View childAt = DragSortListView.this.getChildAt(this.f319797p - firstVisiblePosition);
            if (childAt != null) {
                int i = this.f319797p;
                int i2 = this.f319798q;
                return i == i2 ? childAt.getTop() : i < i2 ? childAt.getTop() - dividerHeight : (childAt.getBottom() + dividerHeight) - DragSortListView.this.f319728B;
            }
            this.f319820n = true;
            return -1;
        }

        /* renamed from: d */
        public void mo154746d() {
            DragSortListView dragSortListView = DragSortListView.this;
            this.f319797p = dragSortListView.f319770o;
            this.f319798q = dragSortListView.f319775s;
            dragSortListView.f319784z = 2;
            this.f319799r = (float) (dragSortListView.f319763e.y - mo154745c());
            DragSortListView dragSortListView2 = DragSortListView.this;
            this.f319800s = (float) (dragSortListView2.f319763e.x - dragSortListView2.getPaddingLeft());
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$k */
    public interface C106831k {
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$l */
    public class C106832l {

        /* renamed from: a */
        public SparseIntArray f319802a;

        /* renamed from: b */
        public ArrayList<Integer> f319803b;

        /* renamed from: c */
        public int f319804c;

        public C106832l(DragSortListView dragSortListView, int i, C106825a aVar) {
            this.f319802a = new SparseIntArray(i);
            this.f319803b = new ArrayList<>(i);
            this.f319804c = i;
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$m */
    public class C106833m extends C106834o {

        /* renamed from: p */
        public float f319805p;

        /* renamed from: q */
        public float f319806q;

        /* renamed from: r */
        public float f319807r;

        /* renamed from: s */
        public int f319808s = -1;

        /* renamed from: t */
        public int f319809t = -1;

        /* renamed from: u */
        public int f319810u;

        /* renamed from: v */
        public int f319811v;

        public C106833m(float f, int i, C106825a aVar) {
            super(f, i, (C106825a) null);
        }

        /* renamed from: a */
        public void mo154743a() {
            DragSortListView dragSortListView = DragSortListView.this;
            dragSortListView.mo154696l(dragSortListView.f319775s - dragSortListView.getHeaderViewsCount());
        }

        /* renamed from: b */
        public void mo154744b(float f, float f2) {
            View childAt;
            float f3 = 1.0f - f2;
            int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
            View childAt2 = DragSortListView.this.getChildAt(this.f319810u - firstVisiblePosition);
            if (DragSortListView.this.f319759a1) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f319813d)) / 1000.0f;
                if (uptimeMillis != 0.0f) {
                    DragSortListView dragSortListView = DragSortListView.this;
                    float f4 = dragSortListView.f319760b1 * uptimeMillis;
                    int width = dragSortListView.getWidth();
                    DragSortListView dragSortListView2 = DragSortListView.this;
                    float f5 = dragSortListView2.f319760b1;
                    float f6 = ((float) (f5 > 0.0f ? 1 : -1)) * uptimeMillis;
                    float f7 = (float) width;
                    dragSortListView2.f319760b1 = f5 + (f6 * f7);
                    float f8 = this.f319805p + f4;
                    this.f319805p = f8;
                    dragSortListView2.f319763e.x = (int) f8;
                    if (f8 < f7 && f8 > ((float) (-width))) {
                        this.f319813d = SystemClock.uptimeMillis();
                        DragSortListView.this.mo154695k(true);
                        return;
                    }
                } else {
                    return;
                }
            }
            if (childAt2 != null) {
                if (this.f319808s == -1) {
                    this.f319808s = DragSortListView.this.mo154706p(this.f319810u, childAt2, false);
                    this.f319806q = (float) (childAt2.getHeight() - this.f319808s);
                }
                int max = Math.max((int) (this.f319806q * f3), 1);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.height = this.f319808s + max;
                childAt2.setLayoutParams(layoutParams);
            }
            int i = this.f319811v;
            if (i != this.f319810u && (childAt = DragSortListView.this.getChildAt(i - firstVisiblePosition)) != null) {
                if (this.f319809t == -1) {
                    this.f319809t = DragSortListView.this.mo154706p(this.f319811v, childAt, false);
                    this.f319807r = (float) (childAt.getHeight() - this.f319809t);
                }
                int max2 = Math.max((int) (f3 * this.f319807r), 1);
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                layoutParams2.height = this.f319809t + max2;
                childAt.setLayoutParams(layoutParams2);
            }
        }

        /* renamed from: c */
        public void mo154747c() {
            int i = -1;
            this.f319808s = -1;
            this.f319809t = -1;
            DragSortListView dragSortListView = DragSortListView.this;
            this.f319810u = dragSortListView.f319771p;
            this.f319811v = dragSortListView.f319773q;
            dragSortListView.f319784z = 1;
            this.f319805p = (float) dragSortListView.f319763e.x;
            if (dragSortListView.f319759a1) {
                float width = ((float) dragSortListView.getWidth()) * 2.0f;
                DragSortListView dragSortListView2 = DragSortListView.this;
                float f = dragSortListView2.f319760b1;
                if (f == 0.0f) {
                    if (this.f319805p >= 0.0f) {
                        i = 1;
                    }
                    dragSortListView2.f319760b1 = ((float) i) * width;
                    return;
                }
                float f2 = width * 2.0f;
                if (f < 0.0f) {
                    float f3 = -f2;
                    if (f > f3) {
                        dragSortListView2.f319760b1 = f3;
                        return;
                    }
                }
                if (f > 0.0f && f < f2) {
                    dragSortListView2.f319760b1 = f2;
                    return;
                }
                return;
            }
            dragSortListView.mo154692h();
        }
    }

    /* renamed from: com.tencent.mm.ui.widget.sortlist.DragSortListView$o */
    public class C106834o implements Runnable {

        /* renamed from: d */
        public long f319813d;

        /* renamed from: e */
        public float f319814e;

        /* renamed from: f */
        public float f319815f;

        /* renamed from: g */
        public float f319816g;

        /* renamed from: h */
        public float f319817h;

        /* renamed from: i */
        public float f319818i;

        /* renamed from: j */
        public float f319819j;

        /* renamed from: n */
        public boolean f319820n;

        public C106834o(float f, int i, C106825a aVar) {
            this.f319815f = f;
            this.f319814e = (float) i;
            float f2 = 1.0f - f;
            float f3 = 1.0f / ((f * 2.0f) * f2);
            this.f319819j = f3;
            this.f319816g = f3;
            this.f319817h = f / ((f - 1.0f) * 2.0f);
            this.f319818i = 1.0f / f2;
        }

        /* renamed from: a */
        public void mo154743a() {
            throw null;
        }

        /* renamed from: b */
        public void mo154744b(float f, float f2) {
            throw null;
        }

        public void run() {
            float f;
            if (!this.f319820n) {
                float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f319813d)) / this.f319814e;
                if (uptimeMillis >= 1.0f) {
                    mo154744b(1.0f, 1.0f);
                    mo154743a();
                    return;
                }
                float f2 = this.f319815f;
                if (uptimeMillis < f2) {
                    f = this.f319816g * uptimeMillis * uptimeMillis;
                } else if (uptimeMillis < 1.0f - f2) {
                    f = this.f319817h + (this.f319818i * uptimeMillis);
                } else {
                    float f3 = uptimeMillis - 1.0f;
                    f = 1.0f - ((this.f319819j * f3) * f3);
                }
                mo154744b(uptimeMillis, f);
                DragSortListView.this.post(this);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragSortListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        float f;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = 150;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet2, C79142a.f232404c, 0, 0);
            this.f319727A = Math.max(1, obtainStyledAttributes.getDimensionPixelSize(1, 1));
            boolean z = obtainStyledAttributes.getBoolean(16, false);
            this.f319749T0 = z;
            if (z) {
                this.f319751U0 = new C85982h();
            }
            float f2 = obtainStyledAttributes.getFloat(8, this.f319768j);
            this.f319768j = f2;
            this.f319769n = f2;
            this.f319782y = obtainStyledAttributes.getBoolean(2, this.f319782y);
            float max = Math.max(0.0f, Math.min(1.0f, 1.0f - obtainStyledAttributes.getFloat(14, 0.75f)));
            this.f319743Q0 = max;
            this.f319774r = max > 0.0f;
            setDragScrollStart(obtainStyledAttributes.getFloat(4, this.f319733G));
            this.f319741P = obtainStyledAttributes.getFloat(10, this.f319741P);
            int i3 = obtainStyledAttributes.getInt(11, 150);
            i = obtainStyledAttributes.getInt(6, 150);
            if (obtainStyledAttributes.getBoolean(17, true)) {
                boolean z2 = obtainStyledAttributes.getBoolean(12, false);
                int i4 = obtainStyledAttributes.getInt(13, 1);
                boolean z3 = obtainStyledAttributes.getBoolean(15, true);
                int i5 = obtainStyledAttributes.getInt(5, 0);
                int resourceId = obtainStyledAttributes.getResourceId(3, 0);
                int resourceId2 = obtainStyledAttributes.getResourceId(7, 0);
                int resourceId3 = obtainStyledAttributes.getResourceId(0, 0);
                int color = obtainStyledAttributes.getColor(9, -16777216);
                C111819a aVar = r0;
                C111819a aVar2 = new C111819a(this, resourceId, i5, i4, resourceId3, resourceId2);
                aVar.f334811n = z2;
                aVar.f334809i = z3;
                aVar.f319825f = color;
                this.f319772p0 = aVar;
                setOnTouchListener(aVar);
            }
            obtainStyledAttributes.recycle();
            i2 = i3;
        } else {
            i = 150;
        }
        this.f319732F = new C106829f();
        if (i2 > 0) {
            f = 0.5f;
            this.f319757Y0 = new C106833m(0.5f, i2, (C106825a) null);
        } else {
            f = 0.5f;
        }
        if (i > 0) {
            this.f319758Z0 = new C106830i(f, i, (C106825a) null);
        }
        this.f319781x0 = MotionEvent.obtain(0, 0, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        this.f319767i = new C106826b();
    }

    /* renamed from: b */
    public final void mo154684b() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int lastVisiblePosition = getLastVisiblePosition();
        int min = Math.min(lastVisiblePosition - firstVisiblePosition, ((getCount() - 1) - getFooterViewsCount()) - firstVisiblePosition);
        for (int max = Math.max(0, getHeaderViewsCount() - firstVisiblePosition); max <= min; max++) {
            View childAt = getChildAt(max);
            if (childAt != null) {
                mo154685c(firstVisiblePosition + max, childAt, false);
            }
        }
    }

    /* renamed from: c */
    public final void mo154685c(int i, View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int f = (i == this.f319775s || i == this.f319771p || i == this.f319773q) ? mo154688f(i, mo154706p(i, view, z)) : -2;
        if (f != layoutParams.height) {
            layoutParams.height = f;
            view.setLayoutParams(layoutParams);
        }
        if (i == this.f319771p || i == this.f319773q) {
            int i2 = this.f319775s;
            if (i < i2) {
                ((C111821b) view).setGravity(80);
            } else if (i > i2) {
                ((C111821b) view).setGravity(48);
            }
        }
        int visibility = view.getVisibility();
        int i3 = (i != this.f319775s || this.f319762d == null) ? 0 : 4;
        if (i3 != visibility) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "adjustItem", "(ILandroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void dispatchDraw(Canvas canvas) {
        float f;
        super.dispatchDraw(canvas);
        if (this.f319784z != 0) {
            int i = this.f319771p;
            if (i != this.f319775s) {
                mo154698m(i, canvas);
            }
            int i2 = this.f319773q;
            if (!(i2 == this.f319771p || i2 == this.f319775s)) {
                mo154698m(i2, canvas);
            }
        }
        View view = this.f319762d;
        if (view != null) {
            int width = view.getWidth();
            int height = this.f319762d.getHeight();
            int i3 = this.f319763e.x;
            int width2 = getWidth();
            if (i3 < 0) {
                i3 = -i3;
            }
            if (i3 < width2) {
                float f2 = ((float) (width2 - i3)) / ((float) width2);
                f = f2 * f2;
            } else {
                f = 0.0f;
            }
            canvas.save();
            Point point = this.f319763e;
            canvas.translate((float) point.x, (float) point.y);
            canvas.clipRect(0, 0, width, height);
            Canvas canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, (float) width, (float) height, (int) (this.f319769n * 255.0f * f), 31);
            this.f319762d.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    /* renamed from: e */
    public final void mo154687e() {
        int firstVisiblePosition = getFirstVisiblePosition();
        if (this.f319775s < firstVisiblePosition) {
            int i = 0;
            View childAt = getChildAt(0);
            if (childAt != null) {
                i = childAt.getTop();
            }
            setSelectionFromTop(firstVisiblePosition - 1, i - getPaddingTop());
        }
    }

    /* renamed from: f */
    public final int mo154688f(int i, int i2) {
        boolean z = this.f319774r && this.f319771p != this.f319773q;
        int i3 = this.f319728B;
        int i4 = this.f319727A;
        int i5 = i3 - i4;
        int i6 = (int) (this.f319745R0 * ((float) i5));
        int i7 = this.f319775s;
        return i == i7 ? i7 == this.f319771p ? z ? i6 + i4 : i3 : i7 == this.f319773q ? i3 - i6 : i4 : i == this.f319771p ? z ? i2 + i6 : i2 + i5 : i == this.f319773q ? (i2 + i5) - i6 : i2;
    }

    /* renamed from: g */
    public void mo154689g() {
        if (this.f319784z == 4) {
            this.f319732F.mo154741a(true);
            mo154692h();
            this.f319775s = -1;
            this.f319771p = -1;
            this.f319773q = -1;
            this.f319770o = -1;
            mo154684b();
            if (this.f319754W) {
                this.f319784z = 3;
            } else {
                this.f319784z = 0;
            }
        }
    }

    public float getFloatAlpha() {
        return this.f319769n;
    }

    public ListAdapter getInputAdapter() {
        C106827c cVar = this.f319747S0;
        if (cVar == null) {
            return null;
        }
        return cVar.f319787d;
    }

    /* renamed from: h */
    public final void mo154692h() {
        View view = this.f319762d;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "destroyFloatView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C106831k kVar = this.f319772p0;
            if (kVar != null) {
                View view2 = this.f319762d;
                C106836b bVar = (C106836b) kVar;
                bVar.getClass();
                if (view2 instanceof ImageView) {
                    ((ImageView) view2).setImageDrawable((Drawable) null);
                }
                C85975v4.m106306c("MicroMsg.SimpleFloatViewManager", "bitmap recycle %s", bVar.f319823d.toString());
                bVar.f319823d.recycle();
                bVar.f319823d = null;
            }
            this.f319762d = null;
            invalidate();
        }
    }

    /* renamed from: i */
    public final void mo154693i() {
        this.f319783y0 = 0;
        this.f319754W = false;
        if (this.f319784z == 3) {
            this.f319784z = 0;
        }
        this.f319769n = this.f319768j;
        this.f319761c1 = false;
        C106832l lVar = this.f319756X0;
        lVar.f319802a.clear();
        lVar.f319803b.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0143, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ea  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo154694j(int r19, android.view.View r20, boolean r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            r0.f319753V0 = r2
            com.tencent.mm.ui.widget.sortlist.DragSortListView$k r3 = r0.f319772p0
            if (r3 == 0) goto L_0x0026
            android.graphics.Point r3 = r0.f319764f
            int r4 = r0.f319744R
            int r5 = r0.f319746S
            r3.set(r4, r5)
            com.tencent.mm.ui.widget.sortlist.DragSortListView$k r3 = r0.f319772p0
            android.graphics.Point r4 = r0.f319763e
            wo3.a r3 = (wo3.C111819a) r3
            boolean r5 = r3.f334811n
            if (r5 == 0) goto L_0x0026
            boolean r5 = r3.f334812o
            if (r5 == 0) goto L_0x0026
            int r4 = r4.x
            r3.f334806G = r4
        L_0x0026:
            android.graphics.Point r3 = r0.f319763e
            int r4 = r3.x
            int r3 = r3.y
            int r5 = r18.getPaddingLeft()
            int r6 = r0.f319750U
            r7 = r6 & 1
            if (r7 != 0) goto L_0x003d
            if (r4 <= r5) goto L_0x003d
            android.graphics.Point r4 = r0.f319763e
            r4.x = r5
            goto L_0x0047
        L_0x003d:
            r6 = r6 & 2
            if (r6 != 0) goto L_0x0047
            if (r4 >= r5) goto L_0x0047
            android.graphics.Point r4 = r0.f319763e
            r4.x = r5
        L_0x0047:
            int r4 = r18.getHeaderViewsCount()
            int r5 = r18.getFooterViewsCount()
            int r6 = r18.getFirstVisiblePosition()
            int r7 = r18.getLastVisiblePosition()
            int r8 = r18.getPaddingTop()
            if (r6 >= r4) goto L_0x0068
            int r4 = r4 - r6
            int r4 = r4 + -1
            android.view.View r4 = r0.getChildAt(r4)
            int r8 = r4.getBottom()
        L_0x0068:
            int r4 = r0.f319750U
            r4 = r4 & 8
            if (r4 != 0) goto L_0x007f
            int r4 = r0.f319775s
            if (r6 > r4) goto L_0x007f
            int r4 = r4 - r6
            android.view.View r4 = r0.getChildAt(r4)
            int r4 = r4.getTop()
            int r8 = java.lang.Math.max(r4, r8)
        L_0x007f:
            int r4 = r18.getHeight()
            int r9 = r18.getPaddingBottom()
            int r4 = r4 - r9
            int r9 = r18.getCount()
            int r9 = r9 - r5
            int r9 = r9 + -1
            if (r7 < r9) goto L_0x00a1
            int r4 = r18.getCount()
            int r4 = r4 - r5
            int r4 = r4 + -1
            int r4 = r4 - r6
            android.view.View r4 = r0.getChildAt(r4)
            int r4 = r4.getBottom()
        L_0x00a1:
            int r5 = r0.f319750U
            r5 = r5 & 4
            if (r5 != 0) goto L_0x00b8
            int r5 = r0.f319775s
            if (r7 < r5) goto L_0x00b8
            int r5 = r5 - r6
            android.view.View r5 = r0.getChildAt(r5)
            int r5 = r5.getBottom()
            int r4 = java.lang.Math.min(r5, r4)
        L_0x00b8:
            if (r3 >= r8) goto L_0x00bf
            android.graphics.Point r3 = r0.f319763e
            r3.y = r8
            goto L_0x00c9
        L_0x00bf:
            int r5 = r0.f319728B
            int r3 = r3 + r5
            if (r3 <= r4) goto L_0x00c9
            android.graphics.Point r3 = r0.f319763e
            int r4 = r4 - r5
            r3.y = r4
        L_0x00c9:
            android.graphics.Point r3 = r0.f319763e
            int r3 = r3.y
            int r4 = r0.f319729C
            int r3 = r3 + r4
            r0.f319765g = r3
            int r3 = r0.f319771p
            int r4 = r0.f319773q
            int r5 = r18.getFirstVisiblePosition()
            int r6 = r0.f319771p
            int r7 = r6 - r5
            android.view.View r7 = r0.getChildAt(r7)
            if (r7 != 0) goto L_0x00f1
            int r6 = r18.getChildCount()
            int r6 = r6 / 2
            int r6 = r6 + r5
            int r5 = r6 - r5
            android.view.View r7 = r0.getChildAt(r5)
        L_0x00f1:
            int r5 = r7.getTop()
            int r7 = r7.getHeight()
            int r8 = r0.mo154708r(r6, r5)
            int r9 = r18.getDividerHeight()
            int r10 = r0.f319765g
            if (r10 >= r8) goto L_0x011f
        L_0x0105:
            if (r6 < 0) goto L_0x0143
            int r6 = r6 + -1
            int r7 = r0.mo154707q(r6)
            if (r6 != 0) goto L_0x0112
            int r5 = r5 - r9
            int r5 = r5 - r7
            goto L_0x012b
        L_0x0112:
            int r7 = r7 + r9
            int r5 = r5 - r7
            int r7 = r0.mo154708r(r6, r5)
            int r10 = r0.f319765g
            if (r10 < r7) goto L_0x011d
            goto L_0x0144
        L_0x011d:
            r8 = r7
            goto L_0x0105
        L_0x011f:
            int r10 = r18.getCount()
        L_0x0123:
            if (r6 >= r10) goto L_0x0143
            int r11 = r10 + -1
            if (r6 != r11) goto L_0x012d
            int r5 = r5 + r9
            int r5 = r5 + r7
        L_0x012b:
            r7 = r5
            goto L_0x0144
        L_0x012d:
            int r7 = r7 + r9
            int r5 = r5 + r7
            int r7 = r6 + 1
            int r11 = r0.mo154707q(r7)
            int r12 = r0.mo154708r(r7, r5)
            int r13 = r0.f319765g
            if (r13 >= r12) goto L_0x013f
            r7 = r12
            goto L_0x0144
        L_0x013f:
            r6 = r7
            r7 = r11
            r8 = r12
            goto L_0x0123
        L_0x0143:
            r7 = r8
        L_0x0144:
            int r5 = r18.getHeaderViewsCount()
            int r9 = r18.getFooterViewsCount()
            int r10 = r0.f319771p
            int r11 = r0.f319773q
            float r12 = r0.f319745R0
            boolean r13 = r0.f319774r
            if (r13 == 0) goto L_0x019b
            int r13 = r7 - r8
            int r13 = java.lang.Math.abs(r13)
            int r14 = r0.f319765g
            if (r14 >= r7) goto L_0x0165
            r17 = r8
            r8 = r7
            r7 = r17
        L_0x0165:
            float r15 = r0.f319743Q0
            r16 = 1056964608(0x3f000000, float:0.5)
            float r15 = r15 * r16
            float r13 = (float) r13
            float r15 = r15 * r13
            int r13 = (int) r15
            float r15 = (float) r13
            int r7 = r7 + r13
            int r13 = r8 - r13
            if (r14 >= r7) goto L_0x0183
            int r8 = r6 + -1
            r0.f319771p = r8
            r0.f319773q = r6
            int r7 = r7 - r14
            float r7 = (float) r7
            float r7 = r7 * r16
            float r7 = r7 / r15
            r0.f319745R0 = r7
            goto L_0x019f
        L_0x0183:
            if (r14 >= r13) goto L_0x018a
            r0.f319771p = r6
            r0.f319773q = r6
            goto L_0x019f
        L_0x018a:
            r0.f319771p = r6
            int r7 = r6 + 1
            r0.f319773q = r7
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = r8 - r14
            float r8 = (float) r8
            float r8 = r8 / r15
            float r8 = r8 + r7
            float r8 = r8 * r16
            r0.f319745R0 = r8
            goto L_0x019f
        L_0x019b:
            r0.f319771p = r6
            r0.f319773q = r6
        L_0x019f:
            int r7 = r0.f319771p
            if (r7 >= r5) goto L_0x01a9
            r0.f319771p = r5
            r0.f319773q = r5
            r6 = r5
            goto L_0x01bd
        L_0x01a9:
            int r7 = r0.f319773q
            int r8 = r18.getCount()
            int r8 = r8 - r9
            if (r7 < r8) goto L_0x01bd
            int r6 = r18.getCount()
            int r6 = r6 - r9
            int r6 = r6 + -1
            r0.f319771p = r6
            r0.f319773q = r6
        L_0x01bd:
            int r7 = r0.f319771p
            r8 = 0
            if (r7 != r10) goto L_0x01d5
            int r7 = r0.f319773q
            if (r7 != r11) goto L_0x01d5
            float r7 = r0.f319745R0
            float r7 = r7 - r12
            float r7 = java.lang.Math.abs(r7)
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x01d3
            goto L_0x01d5
        L_0x01d3:
            r7 = 0
            goto L_0x01d6
        L_0x01d5:
            r7 = 1
        L_0x01d6:
            int r9 = r0.f319770o
            if (r6 == r9) goto L_0x01e7
            com.tencent.mm.ui.widget.sortlist.DragSortListView$d r7 = r0.f319778v
            if (r7 == 0) goto L_0x01e4
            int r9 = r9 - r5
            int r5 = r6 - r5
            r7.mo119909a(r9, r5)
        L_0x01e4:
            r0.f319770o = r6
            goto L_0x01e8
        L_0x01e7:
            r2 = r7
        L_0x01e8:
            if (r2 == 0) goto L_0x0246
            r18.mo154684b()
            int r5 = r18.mo154700o(r19)
            int r6 = r20.getHeight()
            int r7 = r0.mo154688f(r1, r5)
            int r9 = r0.f319775s
            if (r1 == r9) goto L_0x0202
            int r10 = r6 - r5
            int r5 = r7 - r5
            goto L_0x0204
        L_0x0202:
            r10 = r6
            r5 = r7
        L_0x0204:
            int r11 = r0.f319728B
            int r12 = r0.f319771p
            if (r9 == r12) goto L_0x0211
            int r13 = r0.f319773q
            if (r9 == r13) goto L_0x0211
            int r9 = r0.f319727A
            int r11 = r11 - r9
        L_0x0211:
            if (r1 > r3) goto L_0x0218
            if (r1 <= r12) goto L_0x0235
            int r11 = r11 - r5
            int r11 = r11 + r8
            goto L_0x0236
        L_0x0218:
            if (r1 != r4) goto L_0x0229
            if (r1 > r12) goto L_0x021e
            int r10 = r10 - r11
            goto L_0x0226
        L_0x021e:
            int r3 = r0.f319773q
            if (r1 != r3) goto L_0x0226
            int r6 = r6 - r7
            int r11 = r6 + 0
            goto L_0x0236
        L_0x0226:
            int r11 = r8 + r10
            goto L_0x0236
        L_0x0229:
            if (r1 > r12) goto L_0x022e
            int r11 = 0 - r11
            goto L_0x0236
        L_0x022e:
            int r3 = r0.f319773q
            if (r1 != r3) goto L_0x0235
            int r11 = 0 - r5
            goto L_0x0236
        L_0x0235:
            r11 = 0
        L_0x0236:
            int r3 = r20.getTop()
            int r3 = r3 + r11
            int r4 = r18.getPaddingTop()
            int r3 = r3 - r4
            r0.setSelectionFromTop(r1, r3)
            r18.layoutChildren()
        L_0x0246:
            if (r2 != 0) goto L_0x024a
            if (r21 == 0) goto L_0x024d
        L_0x024a:
            r18.invalidate()
        L_0x024d:
            r0.f319753V0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView.mo154694j(int, android.view.View, boolean):void");
    }

    /* renamed from: k */
    public final void mo154695k(boolean z) {
        int firstVisiblePosition = getFirstVisiblePosition() + (getChildCount() / 2);
        View childAt = getChildAt(getChildCount() / 2);
        if (childAt != null) {
            mo154694j(firstVisiblePosition, childAt, z);
        }
    }

    /* renamed from: l */
    public final void mo154696l(int i) {
        this.f319784z = 1;
        C85984n nVar = this.f319780x;
        if (nVar != null) {
            nVar.remove(i);
        }
        mo154692h();
        mo154687e();
        this.f319775s = -1;
        this.f319771p = -1;
        this.f319773q = -1;
        this.f319770o = -1;
        if (this.f319754W) {
            this.f319784z = 3;
        } else {
            this.f319784z = 0;
        }
    }

    public void layoutChildren() {
        super.layoutChildren();
        View view = this.f319762d;
        if (view != null) {
            if (view.isLayoutRequested() && !this.f319766h) {
                mo154710s();
            }
            View view2 = this.f319762d;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.f319762d.getMeasuredHeight());
            this.f319766h = false;
        }
    }

    /* renamed from: m */
    public final void mo154698m(int i, Canvas canvas) {
        ViewGroup viewGroup;
        int i2;
        int i3;
        Drawable divider = getDivider();
        int dividerHeight = getDividerHeight();
        if (divider != null && dividerHeight != 0 && (viewGroup = (ViewGroup) getChildAt(i - getFirstVisiblePosition())) != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int height = viewGroup.getChildAt(0).getHeight();
            if (i > this.f319775s) {
                i2 = viewGroup.getTop() + height;
                i3 = dividerHeight + i2;
            } else {
                int bottom = viewGroup.getBottom() - height;
                int i4 = bottom - dividerHeight;
                i3 = bottom;
                i2 = i4;
            }
            canvas.save();
            canvas.clipRect(paddingLeft, i2, width, i3);
            divider.setBounds(paddingLeft, i2, width, i3);
            divider.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: n */
    public final void mo154699n() {
        int i;
        this.f319784z = 2;
        if (this.f319779w != null && (i = this.f319770o) >= 0 && i < getCount()) {
            int headerViewsCount = getHeaderViewsCount();
            this.f319779w.mo81248b(this.f319775s - headerViewsCount, this.f319770o - headerViewsCount);
        }
        mo154692h();
        mo154687e();
        this.f319775s = -1;
        this.f319771p = -1;
        this.f319773q = -1;
        this.f319770o = -1;
        mo154684b();
        if (this.f319754W) {
            this.f319784z = 3;
        } else {
            this.f319784z = 0;
        }
    }

    /* renamed from: o */
    public final int mo154700o(int i) {
        View view;
        if (i == this.f319775s) {
            return 0;
        }
        View childAt = getChildAt(i - getFirstVisiblePosition());
        if (childAt != null) {
            return mo154706p(i, childAt, false);
        }
        int i2 = this.f319756X0.f319802a.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        ListAdapter adapter = getAdapter();
        int itemViewType = adapter.getItemViewType(i);
        int viewTypeCount = adapter.getViewTypeCount();
        if (viewTypeCount != this.f319731E.length) {
            this.f319731E = new View[viewTypeCount];
        }
        if (itemViewType >= 0) {
            View view2 = this.f319731E[itemViewType];
            if (view2 == null) {
                view = adapter.getView(i, (View) null, this);
                this.f319731E[itemViewType] = view;
            } else {
                view = adapter.getView(i, view2, this);
            }
        } else {
            view = adapter.getView(i, (View) null, this);
        }
        int p = mo154706p(i, view, true);
        C106832l lVar = this.f319756X0;
        int i3 = lVar.f319802a.get(i, -1);
        if (i3 != p) {
            if (i3 != -1) {
                lVar.f319803b.remove(Integer.valueOf(i));
            } else if (lVar.f319802a.size() == lVar.f319804c) {
                lVar.f319802a.delete(lVar.f319803b.remove(0).intValue());
            }
            lVar.f319802a.put(i, p);
            lVar.f319803b.add(Integer.valueOf(i));
        }
        return p;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f319749T0) {
            C85982h hVar = this.f319751U0;
            if (hVar.f250436e) {
                hVar.f250432a.append("<DSLVState>\n");
                int childCount = DragSortListView.this.getChildCount();
                int firstVisiblePosition = DragSortListView.this.getFirstVisiblePosition();
                hVar.f250432a.append("    <Positions>");
                for (int i = 0; i < childCount; i++) {
                    StringBuilder sb = hVar.f250432a;
                    sb.append(firstVisiblePosition + i);
                    sb.append(",");
                }
                hVar.f250432a.append("</Positions>\n");
                hVar.f250432a.append("    <Tops>");
                for (int i2 = 0; i2 < childCount; i2++) {
                    StringBuilder sb4 = hVar.f250432a;
                    sb4.append(DragSortListView.this.getChildAt(i2).getTop());
                    sb4.append(",");
                }
                hVar.f250432a.append("</Tops>\n");
                hVar.f250432a.append("    <Bottoms>");
                for (int i3 = 0; i3 < childCount; i3++) {
                    StringBuilder sb5 = hVar.f250432a;
                    sb5.append(DragSortListView.this.getChildAt(i3).getBottom());
                    sb5.append(",");
                }
                hVar.f250432a.append("</Bottoms>\n");
                StringBuilder sb6 = hVar.f250432a;
                sb6.append("    <FirstExpPos>");
                sb6.append(DragSortListView.this.f319771p);
                sb6.append("</FirstExpPos>\n");
                StringBuilder sb7 = hVar.f250432a;
                sb7.append("    <FirstExpBlankHeight>");
                DragSortListView dragSortListView = DragSortListView.this;
                int q = dragSortListView.mo154707q(dragSortListView.f319771p);
                DragSortListView dragSortListView2 = DragSortListView.this;
                sb7.append(q - dragSortListView2.mo154700o(dragSortListView2.f319771p));
                sb7.append("</FirstExpBlankHeight>\n");
                StringBuilder sb8 = hVar.f250432a;
                sb8.append("    <SecondExpPos>");
                sb8.append(DragSortListView.this.f319773q);
                sb8.append("</SecondExpPos>\n");
                StringBuilder sb9 = hVar.f250432a;
                sb9.append("    <SecondExpBlankHeight>");
                DragSortListView dragSortListView3 = DragSortListView.this;
                int q2 = dragSortListView3.mo154707q(dragSortListView3.f319773q);
                DragSortListView dragSortListView4 = DragSortListView.this;
                sb9.append(q2 - dragSortListView4.mo154700o(dragSortListView4.f319773q));
                sb9.append("</SecondExpBlankHeight>\n");
                StringBuilder sb10 = hVar.f250432a;
                sb10.append("    <SrcPos>");
                sb10.append(DragSortListView.this.f319775s);
                sb10.append("</SrcPos>\n");
                StringBuilder sb11 = hVar.f250432a;
                sb11.append("    <SrcHeight>");
                DragSortListView dragSortListView5 = DragSortListView.this;
                sb11.append(dragSortListView5.f319728B + dragSortListView5.getDividerHeight());
                sb11.append("</SrcHeight>\n");
                StringBuilder sb12 = hVar.f250432a;
                sb12.append("    <ViewHeight>");
                sb12.append(DragSortListView.this.getHeight());
                sb12.append("</ViewHeight>\n");
                StringBuilder sb13 = hVar.f250432a;
                sb13.append("    <LastY>");
                sb13.append(DragSortListView.this.f319748T);
                sb13.append("</LastY>\n");
                StringBuilder sb14 = hVar.f250432a;
                sb14.append("    <FloatY>");
                sb14.append(DragSortListView.this.f319765g);
                sb14.append("</FloatY>\n");
                hVar.f250432a.append("    <ShuffleEdges>");
                for (int i4 = 0; i4 < childCount; i4++) {
                    StringBuilder sb15 = hVar.f250432a;
                    DragSortListView dragSortListView6 = DragSortListView.this;
                    sb15.append(dragSortListView6.mo154708r(firstVisiblePosition + i4, dragSortListView6.getChildAt(i4).getTop()));
                    sb15.append(",");
                }
                hVar.f250432a.append("</ShuffleEdges>\n");
                hVar.f250432a.append("</DSLVState>\n");
                int i5 = hVar.f250434c + 1;
                hVar.f250434c = i5;
                if (i5 > 1000) {
                    hVar.mo119910a();
                    hVar.f250434c = 0;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.f319782y) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        mo154725w(motionEvent);
        this.f319752V = true;
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.f319784z != 0) {
                this.f319755W0 = true;
                return true;
            }
            this.f319754W = true;
        }
        if (this.f319762d != null) {
            z = true;
        } else {
            if (super.onInterceptTouchEvent(motionEvent)) {
                this.f319761c1 = true;
                z = true;
            } else {
                z = false;
            }
            if (action == 1 || action == 3) {
                mo154693i();
            } else if (z) {
                this.f319783y0 = 1;
            } else {
                this.f319783y0 = 2;
            }
        }
        if (action == 1 || action == 3) {
            this.f319754W = false;
        }
        return z;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.f319762d;
        if (view != null) {
            if (view.isLayoutRequested()) {
                mo154710s();
            }
            this.f319766h = true;
        }
        this.f319730D = i;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo154728z();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (this.f319755W0) {
            this.f319755W0 = false;
            return false;
        } else if (!this.f319782y) {
            return super.onTouchEvent(motionEvent);
        } else {
            boolean z2 = this.f319752V;
            this.f319752V = false;
            if (!z2) {
                mo154725w(motionEvent);
            }
            int i = this.f319784z;
            if (i == 4) {
                int action = motionEvent.getAction() & 255;
                if (action == 1) {
                    if (this.f319784z == 4) {
                        this.f319759a1 = false;
                        mo154727y(false, 0.0f);
                    }
                    mo154693i();
                    return true;
                } else if (action == 2) {
                    int y = (int) motionEvent.getY();
                    Point point = this.f319763e;
                    point.x = ((int) motionEvent.getX()) - this.f319776t;
                    point.y = y - this.f319777u;
                    mo154695k(true);
                    int min = Math.min(y, this.f319765g + this.f319729C);
                    int max = Math.max(y, this.f319765g - this.f319729C);
                    C106829f fVar = this.f319732F;
                    boolean z3 = fVar.f319795j;
                    int i2 = z3 ? fVar.f319793h : -1;
                    int i3 = this.f319748T;
                    if (min > i3 && min > this.f319736J && i2 != 1) {
                        if (i2 != -1) {
                            fVar.mo154741a(true);
                        }
                        C106829f fVar2 = this.f319732F;
                        if (fVar2.f319795j) {
                            return true;
                        }
                        fVar2.f319789d = false;
                        fVar2.f319795j = true;
                        fVar2.f319790e = SystemClock.uptimeMillis();
                        fVar2.f319793h = 1;
                        DragSortListView.this.post(fVar2);
                        return true;
                    } else if (max < i3 && max < this.f319735I && i2 != 0) {
                        if (i2 != -1) {
                            fVar.mo154741a(true);
                        }
                        C106829f fVar3 = this.f319732F;
                        if (fVar3.f319795j) {
                            return true;
                        }
                        fVar3.f319789d = false;
                        fVar3.f319795j = true;
                        fVar3.f319790e = SystemClock.uptimeMillis();
                        fVar3.f319793h = 0;
                        DragSortListView.this.post(fVar3);
                        return true;
                    } else if (max < this.f319735I || min > this.f319736J || !z3) {
                        return true;
                    } else {
                        fVar.mo154741a(true);
                        return true;
                    }
                } else if (action != 3) {
                    return true;
                } else {
                    if (this.f319784z == 4) {
                        mo154689g();
                    }
                    mo154693i();
                    return true;
                }
            } else {
                if (i == 0 && super.onTouchEvent(motionEvent)) {
                    z = true;
                }
                int action2 = motionEvent.getAction() & 255;
                if (action2 == 1 || action2 == 3) {
                    mo154693i();
                } else if (z) {
                    this.f319783y0 = 1;
                }
                return z;
            }
        }
    }

    /* renamed from: p */
    public final int mo154706p(int i, View view, boolean z) {
        int i2;
        if (i == this.f319775s) {
            return 0;
        }
        if (i >= getHeaderViewsCount() && i < getCount() - getFooterViewsCount()) {
            view = ((ViewGroup) view).getChildAt(0);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (i2 = layoutParams.height) > 0) {
            return i2;
        }
        int height = view.getHeight();
        if (height != 0 && !z) {
            return height;
        }
        mo154723t(view);
        return view.getMeasuredHeight();
    }

    /* renamed from: q */
    public final int mo154707q(int i) {
        View childAt = getChildAt(i - getFirstVisiblePosition());
        return childAt != null ? childAt.getHeight() : mo154688f(i, mo154700o(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r8 <= r5) goto L_0x003c;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo154708r(int r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.getHeaderViewsCount()
            int r1 = r7.getFooterViewsCount()
            if (r8 <= r0) goto L_0x0065
            int r0 = r7.getCount()
            int r0 = r0 - r1
            if (r8 < r0) goto L_0x0012
            goto L_0x0065
        L_0x0012:
            int r0 = r7.getDividerHeight()
            int r1 = r7.f319728B
            int r2 = r7.f319727A
            int r1 = r1 - r2
            int r2 = r7.mo154700o(r8)
            int r3 = r7.mo154707q(r8)
            int r4 = r7.f319773q
            int r5 = r7.f319775s
            if (r4 > r5) goto L_0x003e
            if (r8 != r4) goto L_0x0038
            int r6 = r7.f319771p
            if (r6 == r4) goto L_0x0038
            if (r8 != r5) goto L_0x0035
            int r9 = r9 + r3
            int r1 = r7.f319728B
            goto L_0x003c
        L_0x0035:
            int r3 = r3 - r2
            int r9 = r9 + r3
            goto L_0x003c
        L_0x0038:
            if (r8 <= r4) goto L_0x004e
            if (r8 > r5) goto L_0x004e
        L_0x003c:
            int r9 = r9 - r1
            goto L_0x004e
        L_0x003e:
            if (r8 <= r5) goto L_0x0046
            int r6 = r7.f319771p
            if (r8 > r6) goto L_0x0046
            int r9 = r9 + r1
            goto L_0x004e
        L_0x0046:
            if (r8 != r4) goto L_0x004e
            int r1 = r7.f319771p
            if (r1 == r4) goto L_0x004e
            int r3 = r3 - r2
            int r9 = r9 + r3
        L_0x004e:
            if (r8 > r5) goto L_0x005e
            int r1 = r7.f319728B
            int r1 = r1 - r0
            int r8 = r8 + -1
            int r8 = r7.mo154700o(r8)
            int r1 = r1 - r8
            int r1 = r1 / 2
            int r9 = r9 + r1
            goto L_0x0065
        L_0x005e:
            int r2 = r2 - r0
            int r8 = r7.f319728B
            int r2 = r2 - r8
            int r2 = r2 / 2
            int r9 = r9 + r2
        L_0x0065:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.widget.sortlist.DragSortListView.mo154708r(int, int):int");
    }

    public void requestLayout() {
        if (!this.f319753V0) {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final void mo154710s() {
        View view = this.f319762d;
        if (view != null) {
            mo154723t(view);
            int measuredHeight = this.f319762d.getMeasuredHeight();
            this.f319728B = measuredHeight;
            this.f319729C = measuredHeight / 2;
        }
    }

    public void setDragEnabled(boolean z) {
        this.f319782y = z;
    }

    public void setDragListener(C85980d dVar) {
        this.f319778v = dVar;
    }

    public void setDragScrollProfile(C106828e eVar) {
        if (eVar != null) {
            this.f319742Q = eVar;
        }
    }

    public void setDragScrollStart(float f) {
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i > 0) {
            this.f319734H = 0.5f;
        } else {
            this.f319734H = f;
        }
        if (i > 0) {
            this.f319733G = 0.5f;
        } else {
            this.f319733G = f;
        }
        if (getHeight() != 0) {
            mo154728z();
        }
    }

    public void setDragSortListener(C85981g gVar) {
        setDropListener(gVar);
        setDragListener(gVar);
        setRemoveListener(gVar);
    }

    public void setDropListener(C85983j jVar) {
        this.f319779w = jVar;
    }

    public void setFloatAlpha(float f) {
        this.f319769n = f;
    }

    public void setFloatViewManager(C106831k kVar) {
        this.f319772p0 = kVar;
    }

    public void setMaxScrollSpeed(float f) {
        this.f319741P = f;
    }

    public void setRemoveListener(C85984n nVar) {
        this.f319780x = nVar;
    }

    /* renamed from: t */
    public final void mo154723t(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(layoutParams);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f319730D, getListPaddingLeft() + getListPaddingRight(), layoutParams.width);
        int i = layoutParams.height;
        view.measure(childMeasureSpec, i > 0 ? View.MeasureSpec.makeMeasureSpec(i, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* renamed from: v */
    public void mo154724v(int i, float f) {
        int i2 = this.f319784z;
        if (i2 == 0 || i2 == 4) {
            if (i2 == 0) {
                int headerViewsCount = getHeaderViewsCount() + i;
                this.f319775s = headerViewsCount;
                this.f319771p = headerViewsCount;
                this.f319773q = headerViewsCount;
                this.f319770o = headerViewsCount;
                View childAt = getChildAt(headerViewsCount - getFirstVisiblePosition());
                if (childAt != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(4);
                    View view = childAt;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "removeItem", "(IF)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f319784z = 1;
            this.f319760b1 = f;
            if (this.f319754W) {
                int i3 = this.f319783y0;
                if (i3 == 1) {
                    super.onTouchEvent(this.f319781x0);
                } else if (i3 == 2) {
                    super.onInterceptTouchEvent(this.f319781x0);
                }
            }
            C106833m mVar = this.f319757Y0;
            if (mVar != null) {
                mVar.f319813d = SystemClock.uptimeMillis();
                mVar.f319820n = false;
                mVar.mo154747c();
                DragSortListView.this.post(mVar);
                return;
            }
            mo154696l(i);
        }
    }

    /* renamed from: w */
    public final void mo154725w(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            this.f319748T = this.f319746S;
        }
        this.f319744R = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        this.f319746S = y;
        if (action == 0) {
            this.f319748T = y;
        }
        motionEvent.getRawX();
        motionEvent.getRawY();
    }

    /* renamed from: x */
    public boolean mo154726x(int i, int i2, int i3, int i4) {
        C106831k kVar;
        ImageView imageView;
        int i5 = i3;
        int i6 = i4;
        if (!this.f319754W || (kVar = this.f319772p0) == null) {
            return false;
        }
        C106836b bVar = (C106836b) kVar;
        ListView listView = bVar.f319826g;
        View childAt = listView.getChildAt((i + listView.getHeaderViewsCount()) - bVar.f319826g.getFirstVisiblePosition());
        if (childAt == null) {
            imageView = null;
        } else {
            childAt.setPressed(false);
            childAt.setDrawingCacheEnabled(true);
            bVar.f319823d = Bitmap.createBitmap(childAt.getDrawingCache());
            childAt.setDrawingCacheEnabled(false);
            if (bVar.f319824e == null) {
                bVar.f319824e = new ImageView(bVar.f319826g.getContext());
            }
            bVar.f319824e.setBackgroundColor(bVar.f319825f);
            bVar.f319824e.setPadding(0, 0, 0, 0);
            bVar.f319824e.setImageBitmap(bVar.f319823d);
            bVar.f319824e.setLayoutParams(new ViewGroup.LayoutParams(childAt.getWidth(), childAt.getHeight()));
            imageView = bVar.f319824e;
        }
        if (imageView == null || this.f319784z != 0 || !this.f319754W || this.f319762d != null || !this.f319782y) {
            return false;
        }
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        int headerViewsCount = i + getHeaderViewsCount();
        this.f319771p = headerViewsCount;
        this.f319773q = headerViewsCount;
        this.f319775s = headerViewsCount;
        this.f319770o = headerViewsCount;
        this.f319784z = 4;
        this.f319750U = 0 | i2;
        this.f319762d = imageView;
        mo154710s();
        this.f319776t = i5;
        this.f319777u = i6;
        int i7 = this.f319746S;
        Point point = this.f319763e;
        point.x = this.f319744R - i5;
        point.y = i7 - i6;
        View childAt2 = getChildAt(this.f319775s - getFirstVisiblePosition());
        if (childAt2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view = childAt2;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/widget/sortlist/DragSortListView", "startDrag", "(ILandroid/view/View;III)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f319749T0) {
            C85982h hVar = this.f319751U0;
            hVar.f250432a.append("<DSLVStates>\n");
            hVar.f250435d = 0;
            hVar.f250436e = true;
        }
        int i8 = this.f319783y0;
        if (i8 == 1) {
            super.onTouchEvent(this.f319781x0);
        } else if (i8 == 2) {
            super.onInterceptTouchEvent(this.f319781x0);
        }
        requestLayout();
        return true;
    }

    /* renamed from: y */
    public boolean mo154727y(boolean z, float f) {
        if (this.f319762d == null) {
            return false;
        }
        this.f319732F.mo154741a(true);
        if (z) {
            mo154724v(this.f319775s - getHeaderViewsCount(), f);
        } else {
            C106830i iVar = this.f319758Z0;
            if (iVar != null) {
                iVar.f319813d = SystemClock.uptimeMillis();
                iVar.f319820n = false;
                iVar.mo154746d();
                DragSortListView.this.post(iVar);
            } else {
                mo154699n();
            }
        }
        if (this.f319749T0) {
            C85982h hVar = this.f319751U0;
            if (hVar.f250436e) {
                hVar.f250432a.append("</DSLVStates>\n");
                hVar.mo119910a();
                hVar.f250436e = false;
            }
        }
        return true;
    }

    /* renamed from: z */
    public final void mo154728z() {
        int paddingTop = getPaddingTop();
        int height = (getHeight() - paddingTop) - getPaddingBottom();
        float f = (float) height;
        float f2 = (float) paddingTop;
        float f3 = (this.f319733G * f) + f2;
        this.f319738L = f3;
        float f4 = ((1.0f - this.f319734H) * f) + f2;
        this.f319737K = f4;
        this.f319735I = (int) f3;
        this.f319736J = (int) f4;
        this.f319739M = f3 - f2;
        this.f319740N = ((float) (paddingTop + height)) - f4;
    }

    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            this.f319747S0 = new C106827c(listAdapter, (C106825a) null);
            listAdapter.registerDataSetObserver(this.f319767i);
            if (listAdapter instanceof C85983j) {
                setDropListener((C85983j) listAdapter);
            }
            if (listAdapter instanceof C85980d) {
                setDragListener((C85980d) listAdapter);
            }
            if (listAdapter instanceof C85984n) {
                setRemoveListener((C85984n) listAdapter);
            }
        } else {
            this.f319747S0 = null;
        }
        super.setAdapter(this.f319747S0);
    }
}
