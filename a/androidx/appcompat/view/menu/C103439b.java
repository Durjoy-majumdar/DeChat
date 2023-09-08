package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.widget.C103564u;
import androidx.appcompat.widget.C103565v;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p1130l.C109066f;
import p849e3.C107168a0;
import p849e3.C107207u;

/* renamed from: androidx.appcompat.view.menu.b */
public final class C103439b extends C109066f implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public int f305180A;

    /* renamed from: B */
    public boolean f305181B;

    /* renamed from: C */
    public boolean f305182C;

    /* renamed from: D */
    public C103456i.C103457a f305183D;

    /* renamed from: E */
    public ViewTreeObserver f305184E;

    /* renamed from: F */
    public PopupWindow.OnDismissListener f305185F;

    /* renamed from: G */
    public boolean f305186G;

    /* renamed from: e */
    public final Context f305187e;

    /* renamed from: f */
    public final int f305188f;

    /* renamed from: g */
    public final int f305189g;

    /* renamed from: h */
    public final int f305190h;

    /* renamed from: i */
    public final boolean f305191i;

    /* renamed from: j */
    public final Handler f305192j;

    /* renamed from: n */
    public final List<C103448e> f305193n = new ArrayList();

    /* renamed from: o */
    public final List<C103444d> f305194o = new ArrayList();

    /* renamed from: p */
    public final ViewTreeObserver.OnGlobalLayoutListener f305195p = new C103440a();

    /* renamed from: q */
    public final View.OnAttachStateChangeListener f305196q = new C103441b();

    /* renamed from: r */
    public final C103564u f305197r = new C103442c();

    /* renamed from: s */
    public int f305198s;

    /* renamed from: t */
    public int f305199t;

    /* renamed from: u */
    public View f305200u;

    /* renamed from: v */
    public View f305201v;

    /* renamed from: w */
    public int f305202w;

    /* renamed from: x */
    public boolean f305203x;

    /* renamed from: y */
    public boolean f305204y;

    /* renamed from: z */
    public int f305205z;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class C103440a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C103440a() {
        }

        public void onGlobalLayout() {
            if (C103439b.this.isShowing() && ((ArrayList) C103439b.this.f305194o).size() > 0 && !((C103444d) ((ArrayList) C103439b.this.f305194o).get(0)).f305213a.f305513D) {
                View view = C103439b.this.f305201v;
                if (view == null || !view.isShown()) {
                    C103439b.this.dismiss();
                    return;
                }
                Iterator it = ((ArrayList) C103439b.this.f305194o).iterator();
                while (it.hasNext()) {
                    ((C103444d) it.next()).f305213a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class C103441b implements View.OnAttachStateChangeListener {
        public C103441b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C103439b.this.f305184E;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C103439b.this.f305184E = view.getViewTreeObserver();
                }
                C103439b bVar = C103439b.this;
                bVar.f305184E.removeGlobalOnLayoutListener(bVar.f305195p);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class C103442c implements C103564u {

        /* renamed from: androidx.appcompat.view.menu.b$c$a */
        public class C103443a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C103444d f305209d;

            /* renamed from: e */
            public final /* synthetic */ MenuItem f305210e;

            /* renamed from: f */
            public final /* synthetic */ C103448e f305211f;

            public C103443a(C103444d dVar, MenuItem menuItem, C103448e eVar) {
                this.f305209d = dVar;
                this.f305210e = menuItem;
                this.f305211f = eVar;
            }

            public void run() {
                C103444d dVar = this.f305209d;
                if (dVar != null) {
                    C103439b.this.f305186G = true;
                    dVar.f305214b.mo143591c(false);
                    C103439b.this.f305186G = false;
                }
                if (this.f305210e.isEnabled() && this.f305210e.hasSubMenu()) {
                    this.f305211f.mo143614q(this.f305210e, (C103456i) null, 4);
                }
            }
        }

        public C103442c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo143561a(androidx.appcompat.view.menu.C103448e r6, android.view.MenuItem r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C103439b.this
                android.os.Handler r0 = r0.f305192j
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C103439b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f305194o
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r0 = r0.size()
                r2 = 0
            L_0x0013:
                r3 = -1
                if (r2 >= r0) goto L_0x002a
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.C103439b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r4 = r4.f305194o
                java.util.ArrayList r4 = (java.util.ArrayList) r4
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.C103439b.C103444d) r4
                androidx.appcompat.view.menu.e r4 = r4.f305214b
                if (r6 != r4) goto L_0x0027
                goto L_0x002b
            L_0x0027:
                int r2 = r2 + 1
                goto L_0x0013
            L_0x002a:
                r2 = -1
            L_0x002b:
                if (r2 != r3) goto L_0x002e
                return
            L_0x002e:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C103439b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f305194o
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0049
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C103439b.this
                java.util.List<androidx.appcompat.view.menu.b$d> r0 = r0.f305194o
                java.util.ArrayList r0 = (java.util.ArrayList) r0
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.C103439b.C103444d) r1
            L_0x0049:
                androidx.appcompat.view.menu.b$c$a r0 = new androidx.appcompat.view.menu.b$c$a
                r0.<init>(r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.C103439b.this
                android.os.Handler r7 = r7.f305192j
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103439b.C103442c.mo143561a(androidx.appcompat.view.menu.e, android.view.MenuItem):void");
        }

        /* renamed from: b */
        public void mo143562b(C103448e eVar, MenuItem menuItem) {
            C103439b.this.f305192j.removeCallbacksAndMessages(eVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class C103444d {

        /* renamed from: a */
        public final C103565v f305213a;

        /* renamed from: b */
        public final C103448e f305214b;

        /* renamed from: c */
        public final int f305215c;

        public C103444d(C103565v vVar, C103448e eVar, int i) {
            this.f305213a = vVar;
            this.f305214b = eVar;
            this.f305215c = i;
        }
    }

    public C103439b(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f305198s = 0;
        this.f305199t = 0;
        this.f305187e = context;
        this.f305200u = view;
        this.f305189g = i;
        this.f305190h = i2;
        this.f305191i = z;
        this.f305181B = false;
        WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
        this.f305202w = C107207u.C107209c.m145195d(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f305188f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0966R.dimen.f4012nr));
        this.f305192j = new Handler();
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
        int size = ((ArrayList) this.f305194o).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (eVar == ((C103444d) ((ArrayList) this.f305194o).get(i)).f305214b) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            int i2 = i + 1;
            if (i2 < ((ArrayList) this.f305194o).size()) {
                ((C103444d) ((ArrayList) this.f305194o).get(i2)).f305214b.mo143591c(false);
            }
            C103444d dVar = (C103444d) ((ArrayList) this.f305194o).remove(i);
            dVar.f305214b.mo143615r(this);
            if (this.f305186G) {
                dVar.f305213a.mo144443g((Object) null);
                dVar.f305213a.f305514E.setAnimationStyle(0);
            }
            dVar.f305213a.dismiss();
            int size2 = ((ArrayList) this.f305194o).size();
            if (size2 > 0) {
                this.f305202w = ((C103444d) ((ArrayList) this.f305194o).get(size2 - 1)).f305215c;
            } else {
                View view = this.f305200u;
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                this.f305202w = C107207u.C107209c.m145195d(view) == 1 ? 0 : 1;
            }
            if (size2 == 0) {
                dismiss();
                C103456i.C103457a aVar = this.f305183D;
                if (aVar != null) {
                    aVar.mo143414a(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f305184E;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f305184E.removeGlobalOnLayoutListener(this.f305195p);
                    }
                    this.f305184E = null;
                }
                this.f305201v.removeOnAttachStateChangeListener(this.f305196q);
                this.f305185F.onDismiss();
            } else if (z) {
                ((C103444d) ((ArrayList) this.f305194o).get(0)).f305214b.mo143591c(false);
            }
        }
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        return null;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        Iterator it = ((ArrayList) this.f305194o).iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C103444d) it.next()).f305213a.f305517f.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C103447d) adapter).notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    public boolean mo143540d(C103463l lVar) {
        Iterator it = ((ArrayList) this.f305194o).iterator();
        while (it.hasNext()) {
            C103444d dVar = (C103444d) it.next();
            if (lVar == dVar.f305214b) {
                dVar.f305213a.f305517f.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        mo143546k(lVar);
        C103456i.C103457a aVar = this.f305183D;
        if (aVar != null) {
            aVar.mo143415d(lVar);
        }
        return true;
    }

    public void dismiss() {
        int size = ((ArrayList) this.f305194o).size();
        if (size > 0) {
            C103444d[] dVarArr = (C103444d[]) ((ArrayList) this.f305194o).toArray(new C103444d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C103444d dVar = dVarArr[i];
                if (dVar.f305213a.isShowing()) {
                    dVar.f305213a.dismiss();
                }
            }
        }
    }

    /* renamed from: f */
    public boolean mo143542f() {
        return false;
    }

    public ListView getListView() {
        if (((ArrayList) this.f305194o).isEmpty()) {
            return null;
        }
        List<C103444d> list = this.f305194o;
        return ((C103444d) ((ArrayList) list).get(((ArrayList) list).size() - 1)).f305213a.f305517f;
    }

    /* renamed from: i */
    public void mo143536i(C103456i.C103457a aVar) {
        this.f305183D = aVar;
    }

    public boolean isShowing() {
        return ((ArrayList) this.f305194o).size() > 0 && ((C103444d) ((ArrayList) this.f305194o).get(0)).f305213a.isShowing();
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
    }

    /* renamed from: k */
    public void mo143546k(C103448e eVar) {
        eVar.mo143590b(this, this.f305187e);
        if (isShowing()) {
            mo143557u(eVar);
        } else {
            ((ArrayList) this.f305193n).add(eVar);
        }
    }

    /* renamed from: m */
    public void mo143547m(View view) {
        if (this.f305200u != view) {
            this.f305200u = view;
            int i = this.f305198s;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            this.f305199t = Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(view));
        }
    }

    /* renamed from: n */
    public void mo143548n(boolean z) {
        this.f305181B = z;
    }

    /* renamed from: o */
    public void mo143549o(int i) {
        if (this.f305198s != i) {
            this.f305198s = i;
            View view = this.f305200u;
            WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
            this.f305199t = Gravity.getAbsoluteGravity(i, C107207u.C107209c.m145195d(view));
        }
    }

    public void onDismiss() {
        C103444d dVar;
        int size = ((ArrayList) this.f305194o).size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C103444d) ((ArrayList) this.f305194o).get(i);
            if (!dVar.f305213a.isShowing()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f305214b.mo143591c(false);
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public void mo143552p(int i) {
        this.f305203x = true;
        this.f305205z = i;
    }

    /* renamed from: q */
    public void mo143553q(PopupWindow.OnDismissListener onDismissListener) {
        this.f305185F = onDismissListener;
    }

    /* renamed from: r */
    public void mo143554r(boolean z) {
        this.f305182C = z;
    }

    /* renamed from: s */
    public void mo143555s(int i) {
        this.f305204y = true;
        this.f305180A = i;
    }

    public void show() {
        if (!isShowing()) {
            Iterator it = ((ArrayList) this.f305193n).iterator();
            while (it.hasNext()) {
                mo143557u((C103448e) it.next());
            }
            ((ArrayList) this.f305193n).clear();
            View view = this.f305200u;
            this.f305201v = view;
            if (view != null) {
                boolean z = this.f305184E == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f305184E = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f305195p);
                }
                this.f305201v.addOnAttachStateChangeListener(this.f305196q);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo143557u(androidx.appcompat.view.menu.C103448e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f305187e
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f305191i
            r5 = 2131492917(0x7f0c0035, float:1.86093E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.isShowing()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.f305181B
            if (r4 == 0) goto L_0x0022
            r3.f305226f = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.isShowing()
            if (r4 == 0) goto L_0x002e
            boolean r4 = p1130l.C109066f.m148068t(r17)
            r3.f305226f = r4
        L_0x002e:
            android.content.Context r4 = r0.f305187e
            int r6 = r0.f305188f
            r7 = 0
            int r4 = p1130l.C109066f.m148067l(r3, r7, r4, r6)
            androidx.appcompat.widget.v r6 = new androidx.appcompat.widget.v
            android.content.Context r8 = r0.f305187e
            int r9 = r0.f305189g
            int r10 = r0.f305190h
            r6.<init>(r8, r7, r9, r10)
            androidx.appcompat.widget.u r8 = r0.f305197r
            r6.f305851I = r8
            r6.f305530v = r0
            android.widget.PopupWindow r8 = r6.f305514E
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f305200u
            r6.f305529u = r8
            int r8 = r0.f305199t
            r6.f305526r = r8
            r6.f305513D = r5
            android.widget.PopupWindow r8 = r6.f305514E
            r8.setFocusable(r5)
            android.widget.PopupWindow r8 = r6.f305514E
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.mo144018d(r3)
            r6.mo144091e(r4)
            int r3 = r0.f305199t
            r6.f305526r = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f305194o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00ee
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f305194o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.C103439b.C103444d) r3
            androidx.appcompat.view.menu.e r10 = r3.f305214b
            int r11 = r10.size()
            r12 = 0
        L_0x008d:
            if (r12 >= r11) goto L_0x00a3
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x00a0
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x00a0
            goto L_0x00a4
        L_0x00a0:
            int r12 = r12 + 1
            goto L_0x008d
        L_0x00a3:
            r13 = r7
        L_0x00a4:
            if (r13 != 0) goto L_0x00a7
            goto L_0x00f0
        L_0x00a7:
            androidx.appcompat.widget.v r10 = r3.f305213a
            androidx.appcompat.widget.q r10 = r10.f305517f
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00c0
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C103447d) r11
            goto L_0x00c3
        L_0x00c0:
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.C103447d) r11
            r12 = 0
        L_0x00c3:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c8:
            r9 = -1
            if (r15 >= r14) goto L_0x00d6
            androidx.appcompat.view.menu.g r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00d2
            goto L_0x00d7
        L_0x00d2:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00c8
        L_0x00d6:
            r15 = -1
        L_0x00d7:
            if (r15 != r9) goto L_0x00da
            goto L_0x00ef
        L_0x00da:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00ef
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e9
            goto L_0x00ef
        L_0x00e9:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00f0
        L_0x00ee:
            r3 = 0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            if (r7 == 0) goto L_0x01a8
            java.lang.reflect.Method r9 = androidx.appcompat.widget.C103565v.f305850J
            if (r9 == 0) goto L_0x0103
            android.widget.PopupWindow r10 = r6.f305514E     // Catch:{ Exception -> 0x0102 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0102 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0102 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0102 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0103
        L_0x0102:
        L_0x0103:
            r9 = 0
            r6.mo144442f(r9)
            java.util.List<androidx.appcompat.view.menu.b$d> r9 = r0.f305194o
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r10 = r9.size()
            int r10 = r10 - r5
            java.lang.Object r9 = r9.get(r10)
            androidx.appcompat.view.menu.b$d r9 = (androidx.appcompat.view.menu.C103439b.C103444d) r9
            androidx.appcompat.widget.v r9 = r9.f305213a
            androidx.appcompat.widget.q r9 = r9.f305517f
            r10 = 2
            int[] r11 = new int[r10]
            r9.getLocationOnScreen(r11)
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            android.view.View r12 = r0.f305201v
            r12.getWindowVisibleDisplayFrame(r10)
            int r12 = r0.f305202w
            if (r12 != r5) goto L_0x013b
            r11 = r11[r8]
            int r9 = r9.getWidth()
            int r11 = r11 + r9
            int r11 = r11 + r4
            int r9 = r10.right
            if (r11 <= r9) goto L_0x0140
            goto L_0x0142
        L_0x013b:
            r9 = r11[r8]
            int r9 = r9 - r4
            if (r9 >= 0) goto L_0x0142
        L_0x0140:
            r9 = 1
            goto L_0x0143
        L_0x0142:
            r9 = 0
        L_0x0143:
            if (r9 != r5) goto L_0x0147
            r10 = 1
            goto L_0x0148
        L_0x0147:
            r10 = 0
        L_0x0148:
            r0.f305202w = r9
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 26
            r12 = 5
            if (r9 < r11) goto L_0x0156
            r6.f305529u = r7
            r9 = 0
            r13 = 0
            goto L_0x0187
        L_0x0156:
            r9 = 2
            int[] r11 = new int[r9]
            android.view.View r13 = r0.f305200u
            r13.getLocationOnScreen(r11)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f305199t
            r13 = r13 & 7
            if (r13 != r12) goto L_0x017d
            r13 = r11[r8]
            android.view.View r14 = r0.f305200u
            int r14 = r14.getWidth()
            int r13 = r13 + r14
            r11[r8] = r13
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r13 = r13 + r14
            r9[r8] = r13
        L_0x017d:
            r13 = r9[r8]
            r14 = r11[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r11 = r11[r5]
            int r9 = r9 - r11
        L_0x0187:
            int r11 = r0.f305199t
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0194
            if (r10 == 0) goto L_0x018f
            goto L_0x019a
        L_0x018f:
            int r4 = r7.getWidth()
            goto L_0x019c
        L_0x0194:
            if (r10 == 0) goto L_0x019c
            int r4 = r7.getWidth()
        L_0x019a:
            int r13 = r13 + r4
            goto L_0x019d
        L_0x019c:
            int r13 = r13 - r4
        L_0x019d:
            r6.f305520i = r13
            r6.f305525q = r5
            r6.f305524p = r5
            r6.f305521j = r9
            r6.f305523o = r5
            goto L_0x01be
        L_0x01a8:
            boolean r4 = r0.f305203x
            if (r4 == 0) goto L_0x01b0
            int r4 = r0.f305205z
            r6.f305520i = r4
        L_0x01b0:
            boolean r4 = r0.f305204y
            if (r4 == 0) goto L_0x01ba
            int r4 = r0.f305180A
            r6.f305521j = r4
            r6.f305523o = r5
        L_0x01ba:
            android.graphics.Rect r4 = r0.f326632d
            r6.f305512C = r4
        L_0x01be:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f305202w
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f305194o
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r4)
            r6.show()
            androidx.appcompat.widget.q r4 = r6.f305517f
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x01ff
            boolean r3 = r0.f305182C
            if (r3 == 0) goto L_0x01ff
            java.lang.CharSequence r3 = r1.f305247s
            if (r3 == 0) goto L_0x01ff
            r3 = 2131492924(0x7f0c003c, float:1.8609314E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f305247s
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.show()
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C103439b.mo143557u(androidx.appcompat.view.menu.e):void");
    }
}
