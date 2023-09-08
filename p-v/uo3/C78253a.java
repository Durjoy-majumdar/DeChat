package uo3;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;
import com.tencent.p014mm.p136ui.base.MMListPopupWindow;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76891l0;
import nj3.C76901s0;

/* renamed from: uo3.a */
public class C78253a implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {

    /* renamed from: N */
    public static int f229222N;

    /* renamed from: P */
    public static int f229223P;

    /* renamed from: Q */
    public static boolean f229224Q;

    /* renamed from: A */
    public boolean f229225A;

    /* renamed from: B */
    public int f229226B;

    /* renamed from: C */
    public PopupWindow.OnDismissListener f229227C;

    /* renamed from: D */
    public boolean f229228D;

    /* renamed from: E */
    public boolean f229229E;

    /* renamed from: F */
    public boolean f229230F;

    /* renamed from: G */
    public int f229231G;

    /* renamed from: H */
    public boolean f229232H;

    /* renamed from: I */
    public boolean f229233I;

    /* renamed from: J */
    public long f229234J;

    /* renamed from: K */
    public C78262i f229235K;

    /* renamed from: L */
    public boolean f229236L;

    /* renamed from: M */
    public boolean f229237M;

    /* renamed from: d */
    public Context f229238d;

    /* renamed from: e */
    public LayoutInflater f229239e;

    /* renamed from: f */
    public View f229240f;

    /* renamed from: g */
    public C78263j f229241g;

    /* renamed from: h */
    public MMListPopupWindow f229242h;

    /* renamed from: i */
    public C76901s0 f229243i;

    /* renamed from: j */
    public C76901s0 f229244j;

    /* renamed from: n */
    public C76901s0 f229245n;

    /* renamed from: o */
    public int f229246o;

    /* renamed from: p */
    public DisplayMetrics f229247p;

    /* renamed from: q */
    public View f229248q;

    /* renamed from: r */
    public View.OnCreateContextMenuListener f229249r;

    /* renamed from: s */
    public C11183n0 f229250s;

    /* renamed from: t */
    public C11184p0 f229251t;

    /* renamed from: u */
    public C11184p0 f229252u;

    /* renamed from: v */
    public C76891l0 f229253v;

    /* renamed from: w */
    public C76874e0 f229254w;

    /* renamed from: x */
    public View f229255x;

    /* renamed from: y */
    public boolean f229256y;

    /* renamed from: z */
    public boolean f229257z;

    /* renamed from: uo3.a$a */
    public class C78254a implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f229258d;

        public C78254a(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f229258d = onCreateContextMenuListener;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new Object[0]);
            C78253a.this.f229254w.clear();
            C78253a aVar = C78253a.this;
            aVar.f229240f = view;
            this.f229258d.onCreateContextMenu(aVar.f229254w, view, (ContextMenu.ContextMenuInfo) null);
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                int[] iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
                if (iArr == null) {
                    C78253a.this.mo70679m();
                } else {
                    C78253a.this.mo71743n(iArr[0], iArr[1]);
                }
            } else {
                C78253a.this.mo70679m();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$10", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: uo3.a$b */
    public class C78255b implements View.OnTouchListener {
        public C78255b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if ((motionEvent.getAction() & 255) == 0) {
                C78253a.f229222N = (int) motionEvent.getRawX();
                C78253a.f229223P = (int) motionEvent.getRawY();
                C78253a aVar = C78253a.this;
                aVar.f229255x = aVar.f229240f;
                C78253a.f229224Q = true;
                C85975v4.m106306c("MicroMsg.MMPopupMenu", "popmenu view set , x_down=" + C78253a.f229222N + "y_down=" + C78253a.f229223P, new Object[0]);
            }
            C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$11", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: uo3.a$c */
    public class C78256c implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f229261d;

        public C78256c(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f229261d = onCreateContextMenuListener;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C78253a.this.f229254w.clear();
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new Object[0]);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
            this.f229261d.onCreateContextMenu(C78253a.this.f229254w, view, adapterContextMenuInfo);
            Iterator it = ((ArrayList) C78253a.this.f229254w.f224704d).iterator();
            while (it.hasNext()) {
                ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
            }
            C78253a.this.mo70679m();
            return true;
        }
    }

    /* renamed from: uo3.a$d */
    public class C78257d implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f229263d;

        public C78257d(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f229263d = onCreateContextMenuListener;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new Object[0]);
            C78253a.this.f229254w.clear();
            C78253a aVar = C78253a.this;
            aVar.f229240f = view;
            this.f229263d.onCreateContextMenu(aVar.f229254w, view, (ContextMenu.ContextMenuInfo) null);
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                int[] iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
                if (iArr == null) {
                    C78253a.this.mo70679m();
                } else {
                    C78253a.this.mo71743n(iArr[0], iArr[1]);
                }
            } else {
                C78253a.this.mo70679m();
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: uo3.a$e */
    public class C78258e implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76891l0 f229265d;

        public C78258e(C76891l0 l0Var) {
            this.f229265d = l0Var;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C78253a.this.f229254w.clear();
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new Object[0]);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
            this.f229265d.mo71744a(C78253a.this.f229254w, view, adapterContextMenuInfo);
            Iterator it = ((ArrayList) C78253a.this.f229254w.f224704d).iterator();
            while (it.hasNext()) {
                ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
            }
            C78253a.this.mo70679m();
            return true;
        }
    }

    /* renamed from: uo3.a$f */
    public class C78259f implements View.OnLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76891l0 f229267d;

        /* renamed from: e */
        public final /* synthetic */ View f229268e;

        public C78259f(C76891l0 l0Var, View view) {
            this.f229267d = l0Var;
            this.f229268e = view;
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view long click", new Object[0]);
            C78253a.this.f229254w.clear();
            C78253a aVar = C78253a.this;
            aVar.f229240f = view;
            this.f229267d.mo71744a(aVar.f229254w, view, (ContextMenu.ContextMenuInfo) null);
            int[] iArr = new int[2];
            this.f229268e.getLocationInWindow(iArr);
            int width = iArr[0] + ((int) (((float) this.f229268e.getWidth()) / 2.0f));
            int i = iArr[1];
            if (width == 0 && i == 0) {
                C78253a.this.mo70679m();
            } else {
                C78253a.this.mo71743n(width, i);
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: uo3.a$g */
    public class C78260g implements AdapterView.OnItemClickListener {
        public C78260g() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            C78253a aVar = C78253a.this;
            C11184p0 p0Var = aVar.f229251t;
            if (p0Var != null) {
                p0Var.onMMMenuItemSelected(aVar.f229254w.getItem(i), i);
            }
            C78253a aVar2 = C78253a.this;
            C11184p0 p0Var2 = aVar2.f229252u;
            if (p0Var2 != null) {
                p0Var2.onMMMenuItemSelected(aVar2.f229254w.getItem(i), i);
            }
            MMListPopupWindow mMListPopupWindow = C78253a.this.f229242h;
            if (mMListPopupWindow != null && mMListPopupWindow.f214823g.isShowing()) {
                C78253a.this.f229242h.mo101712a();
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$5", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }
    }

    /* renamed from: uo3.a$h */
    public class C78261h implements AdapterView.OnItemLongClickListener {

        /* renamed from: d */
        public final /* synthetic */ View.OnCreateContextMenuListener f229271d;

        public C78261h(View.OnCreateContextMenuListener onCreateContextMenuListener) {
            this.f229271d = onCreateContextMenuListener;
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            C78253a.this.f229254w.clear();
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView long click", new Object[0]);
            AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
            this.f229271d.onCreateContextMenu(C78253a.this.f229254w, view, adapterContextMenuInfo);
            Iterator it = ((ArrayList) C78253a.this.f229254w.f224704d).iterator();
            while (it.hasNext()) {
                ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
            }
            C78253a.this.mo70679m();
            return true;
        }
    }

    /* renamed from: uo3.a$i */
    public interface C78262i {
        /* renamed from: a */
        View mo103146a(Context context, MenuItem menuItem);
    }

    /* renamed from: uo3.a$j */
    public class C78263j extends BaseAdapter {
        public C78263j(C78256c cVar) {
        }

        public int getCount() {
            return C78253a.this.f229254w.size();
        }

        public Object getItem(int i) {
            return (String) ((MenuItem) ((ArrayList) C78253a.this.f229254w.f224704d).get(i)).getTitle();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView = view == null ? (TextView) C78253a.this.f229239e.inflate(C0966R.C0971layout.bng, viewGroup, false) : view instanceof TextView ? (TextView) view : null;
            String str = (String) ((MenuItem) ((ArrayList) C78253a.this.f229254w.f224704d).get(i)).getTitle();
            if (textView != null) {
                textView.setTag(str);
                textView.setText(str);
                textView.setBackgroundResource(C0966R.C0969drawable.am7);
            }
            C78253a aVar = C78253a.this;
            if (aVar.f229232H && aVar.f229231G != 0) {
                textView.setTextColor(aVar.f229238d.getResources().getColor(C78253a.this.f229231G));
            }
            C78253a aVar2 = C78253a.this;
            C11183n0 n0Var = aVar2.f229250s;
            if (n0Var != null) {
                n0Var.mo2585a(textView, i, (MenuItem) ((ArrayList) aVar2.f229254w.f224704d).get(i));
            }
            return textView;
        }
    }

    public C78253a(Context context, View view) {
        this.f229241g = null;
        this.f229256y = false;
        this.f229257z = false;
        this.f229225A = false;
        this.f229226B = 0;
        this.f229228D = false;
        this.f229229E = false;
        this.f229230F = true;
        this.f229231G = 0;
        this.f229232H = false;
        this.f229233I = false;
        this.f229234J = 0;
        this.f229236L = true;
        this.f229237M = false;
        this.f229238d = context;
        this.f229240f = view;
        this.f229239e = (LayoutInflater) context.getSystemService("layout_inflater");
        mo108268c();
        mo108277l();
    }

    /* renamed from: a */
    public boolean mo108266a() {
        if (mo108270e()) {
            MMListPopupWindow mMListPopupWindow = this.f229242h;
            if (mMListPopupWindow != null) {
                mMListPopupWindow.mo101712a();
            }
            return true;
        }
        C76901s0 s0Var = this.f229243i;
        if (s0Var != null && s0Var.isShowing()) {
            C76901s0 s0Var2 = this.f229243i;
            if (s0Var2 != null) {
                s0Var2.dismiss();
            }
            return true;
        } else if (!mo108269d()) {
            return false;
        } else {
            C76901s0 s0Var3 = this.f229244j;
            if (s0Var3 != null) {
                s0Var3.dismiss();
            }
            return true;
        }
    }

    /* renamed from: b */
    public int mo108267b() {
        C76901s0 s0Var = this.f229244j;
        if (s0Var == null || s0Var.getContentView() == null) {
            return 0;
        }
        View contentView = this.f229244j.getContentView();
        contentView.measure(0, 0);
        return contentView.getMeasuredHeight();
    }

    /* renamed from: c */
    public final void mo108268c() {
        mo108266a();
        this.f229254w = new C76874e0(this.f229238d);
        this.f229241g = new C78263j((C78256c) null);
        this.f229247p = this.f229238d.getResources().getDisplayMetrics();
    }

    /* renamed from: d */
    public boolean mo108269d() {
        C76901s0 s0Var = this.f229244j;
        return s0Var != null && s0Var.isShowing();
    }

    /* renamed from: e */
    public boolean mo108270e() {
        MMListPopupWindow mMListPopupWindow = this.f229242h;
        return mMListPopupWindow != null && mMListPopupWindow.f214823g.isShowing();
    }

    /* renamed from: f */
    public void mo108271f(View view, C76891l0 l0Var, C11184p0 p0Var, int i, int i2) {
        this.f229251t = p0Var;
        this.f229240f = view;
        if (!(view instanceof TextView) && (i == 0 || i2 == 0)) {
            mo108277l();
        }
        this.f229254w.clear();
        l0Var.mo71744a(this.f229254w, view, (ContextMenu.ContextMenuInfo) null);
        if (i == 0 && i2 == 0) {
            mo70679m();
        } else {
            mo71743n(i, i2);
        }
    }

    /* renamed from: g */
    public void mo108272g(View view, int i, long j, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var, int i2, int i3) {
        this.f229251t = p0Var;
        this.f229240f = view;
        mo108277l();
        this.f229254w.clear();
        AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = new AdapterView.AdapterContextMenuInfo(view, i, j);
        onCreateContextMenuListener.onCreateContextMenu(this.f229254w, view, adapterContextMenuInfo);
        Iterator it = ((ArrayList) this.f229254w.f224704d).iterator();
        while (it.hasNext()) {
            ((C76875f0) ((MenuItem) it.next())).f224728w = adapterContextMenuInfo;
        }
        if (i2 == 0 && i3 == 0) {
            mo70679m();
        } else {
            mo71743n(i2, i3);
        }
    }

    /* renamed from: h */
    public void mo108273h(View view, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var, int i, int i2) {
        this.f229251t = p0Var;
        this.f229240f = view;
        if (!(view instanceof TextView) && (i == 0 || i2 == 0)) {
            mo108277l();
        }
        this.f229254w.clear();
        onCreateContextMenuListener.onCreateContextMenu(this.f229254w, view, (ContextMenu.ContextMenuInfo) null);
        if (i == 0 && i2 == 0) {
            mo70679m();
        } else {
            mo71743n(i, i2);
        }
    }

    /* renamed from: i */
    public void mo108274i(View view, C76891l0 l0Var, C11184p0 p0Var) {
        this.f229240f = view;
        mo108277l();
        this.f229251t = p0Var;
        if (view instanceof AbsListView) {
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new Object[0]);
            ((AbsListView) view).setOnItemLongClickListener(new C78258e(l0Var));
            return;
        }
        C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new Object[0]);
        view.setOnLongClickListener(new C78259f(l0Var, view));
    }

    /* renamed from: j */
    public void mo108275j(View view, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var) {
        this.f229240f = view;
        mo108277l();
        this.f229251t = p0Var;
        if (view instanceof AbsListView) {
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new Object[0]);
            ((AbsListView) view).setOnItemLongClickListener(new C78256c(onCreateContextMenuListener));
            return;
        }
        C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new Object[0]);
        view.setOnLongClickListener(new C78257d(onCreateContextMenuListener));
    }

    /* renamed from: k */
    public void mo108276k(View view, View.OnCreateContextMenuListener onCreateContextMenuListener, C11184p0 p0Var) {
        this.f229240f = view;
        this.f229251t = p0Var;
        if (view instanceof AbsListView) {
            C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new Object[0]);
            ((AbsListView) view).setOnItemLongClickListener(new C78261h(onCreateContextMenuListener));
            return;
        }
        C85975v4.m106308e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new Object[0]);
        view.setOnLongClickListener(new C78254a(onCreateContextMenuListener));
    }

    /* renamed from: l */
    public final void mo108277l() {
        this.f229240f.setOnTouchListener(new C78255b());
    }

    /* renamed from: m */
    public boolean mo70679m() {
        return mo71743n(0, 0);
    }

    /* renamed from: n */
    public boolean mo71743n(int i, int i2) {
        View view = this.f229240f;
        if (((view != null && !view.equals(this.f229255x)) || !f229224Q) && !(i == 0 && i2 == 0)) {
            f229222N = i;
            f229223P = i2;
        }
        this.f229255x = null;
        int i3 = f229222N;
        int i4 = f229223P;
        boolean z = false;
        f229224Q = false;
        if (this.f229247p == null) {
            this.f229247p = this.f229238d.getResources().getDisplayMetrics();
        }
        View view2 = this.f229240f;
        if (view2 != null) {
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            if (i3 == 0) {
                i3 = iArr[0] + (this.f229240f.getWidth() / 2);
            }
            int i5 = iArr[1];
            int height = this.f229240f.getHeight() + i5;
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = this.f229247p.heightPixels;
            if (height > i6) {
                height = i6;
            }
            if (i4 == 0) {
                i4 = (i5 + height) / 2;
            }
        }
        C85975v4.m106306c("MicroMsg.MMPopupMenu", "show popMenu , xDown:%s, yDown:%s, showPointX:%s, showPointY:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        if (mo108270e()) {
            C76901s0 s0Var = this.f229243i;
            if (s0Var != null && s0Var.isShowing()) {
                z = true;
            }
            if (z && mo108269d()) {
                return mo108266a() & mo108278o(i3, i4);
            }
        }
        return mo108278o(i3, i4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:207:0x06f1  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0708  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x070d  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0716  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x07d9  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:266:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo108278o(int r27, int r28) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            boolean r3 = r26.mo108270e()
            r4 = 0
            if (r3 != 0) goto L_0x082c
            nj3.s0 r3 = r0.f229243i
            r5 = 1
            if (r3 == 0) goto L_0x001a
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x001a
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            if (r3 != 0) goto L_0x082c
            boolean r3 = r26.mo108269d()
            if (r3 == 0) goto L_0x0025
            goto L_0x082c
        L_0x0025:
            android.content.Context r3 = r0.f229238d
            boolean r6 = r3 instanceof android.app.Activity
            if (r6 == 0) goto L_0x004e
            android.app.Activity r3 = (android.app.Activity) r3
            android.view.Window r3 = r3.getWindow()
            android.view.View r3 = r3.getDecorView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r3 = r3.findViewById(r6)
            if (r3 == 0) goto L_0x004e
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r3.getGlobalVisibleRect(r6)
            int r3 = r6.left
            if (r3 <= 0) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            java.lang.String r6 = "MicroMsg.MMPopupMenu"
            if (r3 == 0) goto L_0x005b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "is swiping, PASS tryShow"
            com.tencent.p014mm.p136ui.C85975v4.m106309f(r6, r2, r1)
            return r4
        L_0x005b:
            boolean r3 = r0.f229257z
            r7 = 0
            if (r3 != 0) goto L_0x0064
            boolean r3 = r0.f229225A
            if (r3 == 0) goto L_0x0070
        L_0x0064:
            nj3.l0 r3 = r0.f229253v
            if (r3 == 0) goto L_0x0070
            nj3.e0 r8 = r0.f229254w
            android.view.View r9 = r0.f229240f
            r3.mo71744a(r8, r9, r7)
            goto L_0x007b
        L_0x0070:
            android.view.View$OnCreateContextMenuListener r3 = r0.f229249r
            if (r3 == 0) goto L_0x007b
            nj3.e0 r8 = r0.f229254w
            android.view.View r9 = r0.f229240f
            r3.onCreateContextMenu(r8, r9, r7)
        L_0x007b:
            uo3.a$j r3 = r0.f229241g
            int r3 = r3.getCount()
            android.content.Context r8 = r0.f229238d
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165643(0x7f0701cb, float:1.7945509E38)
            int r8 = r8.getDimensionPixelSize(r9)
            int r3 = r3 * r8
            if (r3 != 0) goto L_0x00b3
            boolean r8 = r0.f229256y
            if (r8 != 0) goto L_0x00b3
            boolean r8 = r0.f229257z
            if (r8 != 0) goto L_0x00b3
            boolean r8 = r0.f229225A
            if (r8 != 0) goto L_0x00b3
            java.lang.Object[] r1 = new java.lang.Object[r5]
            uo3.a$j r2 = r0.f229241g
            int r2 = r2.getCount()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r4] = r2
            java.lang.String r2 = "tryShow failed, count:%d"
            com.tencent.p014mm.p136ui.C85975v4.m106305b(r6, r2, r1)
            return r4
        L_0x00b3:
            android.content.Context r8 = r0.f229238d
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131166275(0x7f070443, float:1.794679E38)
            int r8 = r8.getDimensionPixelSize(r9)
            uo3.a$j r10 = r0.f229241g
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r13 = r10.getCount()
            r16 = r7
            r9 = 0
            r14 = 0
            r15 = 0
        L_0x00d3:
            if (r14 >= r13) goto L_0x0100
            int r7 = r10.getItemViewType(r14)
            if (r7 == r9) goto L_0x00de
            r9 = r7
            r7 = 0
            goto L_0x00e0
        L_0x00de:
            r7 = r16
        L_0x00e0:
            android.widget.FrameLayout r4 = new android.widget.FrameLayout
            android.content.Context r5 = r0.f229238d
            r4.<init>(r5)
            android.view.View r4 = r10.getView(r14, r7, r4)
            if (r4 == 0) goto L_0x00f8
            r4.measure(r11, r12)
            int r5 = r4.getMeasuredWidth()
            int r15 = java.lang.Math.max(r15, r5)
        L_0x00f8:
            int r14 = r14 + 1
            r16 = r4
            r4 = 0
            r5 = 1
            r7 = 0
            goto L_0x00d3
        L_0x0100:
            android.content.Context r4 = r0.f229238d
            r5 = 2131166892(0x7f0706ac, float:1.7948042E38)
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r4, r5)
            if (r15 >= r4) goto L_0x010c
            r15 = r4
        L_0x010c:
            nj3.e0 r4 = r0.f229254w
            int r4 = r4.size()
            r5 = 3
            if (r4 < r5) goto L_0x0117
            r4 = 0
            goto L_0x0118
        L_0x0117:
            r4 = 1
        L_0x0118:
            android.view.View r5 = r0.f229248q
            if (r5 == 0) goto L_0x0121
            r7 = 1
            r5.setSelected(r7)
            goto L_0x0127
        L_0x0121:
            r7 = 1
            android.view.View r5 = r0.f229240f
            r5.setSelected(r7)
        L_0x0127:
            boolean r5 = r0.f229256y
            r7 = -2
            r9 = 2131235137(0x7f081141, float:1.808646E38)
            r10 = 2131234427(0x7f080e7b, float:1.808502E38)
            if (r5 == 0) goto L_0x022f
            android.content.Context r3 = r0.f229238d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165590(0x7f070196, float:1.7945401E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            android.content.Context r4 = r0.f229238d
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131165553(0x7f070171, float:1.7945326E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            nj3.s0 r5 = new nj3.s0
            android.content.Context r6 = r0.f229238d
            r5.<init>((android.content.Context) r6)
            r0.f229243i = r5
            r5.setOnDismissListener(r0)
            nj3.s0 r5 = r0.f229243i
            r5.setWidth(r7)
            nj3.s0 r5 = r0.f229243i
            r5.setHeight(r7)
            nj3.s0 r5 = r0.f229243i
            android.content.Context r6 = r0.f229238d
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r9)
            r5.setBackgroundDrawable(r6)
            nj3.s0 r5 = r0.f229243i
            boolean r6 = r0.f229228D
            r5.setFocusable(r6)
            nj3.s0 r5 = r0.f229243i
            boolean r6 = r0.f229229E
            r5.setOutsideTouchable(r6)
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r6 = r0.f229238d
            r5.<init>(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r6.<init>(r7, r7)
            r5.setLayoutParams(r6)
            r6 = 0
            r5.setOrientation(r6)
            android.content.Context r6 = r0.f229238d
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131099654(0x7f060006, float:1.7811667E38)
            int r6 = r6.getColor(r7)
            r5.setBackgroundColor(r6)
            r6 = 0
        L_0x01a3:
            nj3.e0 r7 = r0.f229254w
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x01ef
            android.view.LayoutInflater r7 = r0.f229239e
            r8 = 2131495981(0x7f0c0c2d, float:1.8615514E38)
            r9 = 0
            r11 = 0
            android.view.View r7 = r7.inflate(r8, r9, r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r7.setBackgroundResource(r10)
            if (r6 != 0) goto L_0x01c1
            r7.setPadding(r4, r11, r3, r11)
            goto L_0x01ce
        L_0x01c1:
            nj3.e0 r8 = r0.f229254w
            int r8 = r8.size()
            int r8 = r8 + -1
            if (r6 != r8) goto L_0x01ce
            r7.setPadding(r3, r11, r4, r11)
        L_0x01ce:
            nj3.e0 r8 = r0.f229254w
            java.util.List<android.view.MenuItem> r8 = r8.f224704d
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r6)
            android.view.MenuItem r8 = (android.view.MenuItem) r8
            java.lang.CharSequence r8 = r8.getTitle()
            r7.setText(r8)
            uo3.b r8 = new uo3.b
            r8.<init>(r0, r6)
            r7.setOnClickListener(r8)
            r5.addView(r7)
            int r6 = r6 + 1
            goto L_0x01a3
        L_0x01ef:
            r6 = 0
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            r5.measure(r3, r4)
            int r3 = r5.getMeasuredHeight()
            nj3.s0 r4 = r0.f229243i
            int r6 = r5.getMeasuredWidth()
            android.content.Context r7 = r0.f229238d
            r8 = 24
            int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r8)
            int r6 = r6 + r7
            r4.setWidth(r6)
            nj3.s0 r4 = r0.f229243i
            r4.setContentView(r5)
            android.content.Context r4 = r0.f229238d
            boolean r5 = r4 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0828
            android.app.Activity r4 = (android.app.Activity) r4
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L_0x0828
            nj3.s0 r4 = r0.f229243i
            android.view.View r5 = r0.f229240f
            int r2 = r2 - r3
            r3 = 0
            r4.showAtLocation(r5, r3, r1, r2)
            goto L_0x0828
        L_0x022f:
            boolean r5 = r0.f229257z
            r12 = 2131300630(0x7f091116, float:1.8219295E38)
            r13 = 2131300629(0x7f091115, float:1.8219293E38)
            r14 = 2131886810(0x7f1202da, float:1.940821E38)
            r17 = 1073741824(0x40000000, float:2.0)
            r10 = 5
            r9 = 2
            r11 = 8
            if (r5 == 0) goto L_0x0528
            nj3.s0 r3 = new nj3.s0
            android.content.Context r4 = r0.f229238d
            r3.<init>((android.content.Context) r4)
            r0.f229244j = r3
            r3.setOnDismissListener(r0)
            nj3.s0 r3 = r0.f229244j
            r3.setWidth(r7)
            nj3.s0 r3 = r0.f229244j
            r3.setHeight(r7)
            nj3.s0 r3 = r0.f229244j
            boolean r4 = r0.f229230F
            r3.setFocusable(r4)
            nj3.s0 r3 = r0.f229244j
            r4 = 1
            r3.setOutsideTouchable(r4)
            nj3.s0 r3 = r0.f229244j
            r3.setAnimationStyle(r14)
            nj3.s0 r3 = r0.f229244j
            r3.setInputMethodMode(r9)
            android.content.Context r3 = r0.f229238d
            r4 = 2131495926(0x7f0c0bf6, float:1.8615402E38)
            r5 = 0
            android.view.View r3 = android.view.View.inflate(r3, r4, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r7, r7)
            r3.setLayoutParams(r4)
            r4 = 2131309148(0x7f09325c, float:1.8236572E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r5 = 2131309150(0x7f09325e, float:1.8236576E38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r6 = 2131309132(0x7f09324c, float:1.823654E38)
            android.view.View r6 = r3.findViewById(r6)
            android.view.View r7 = r3.findViewById(r13)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            android.view.View r8 = r3.findViewById(r12)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r9 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            r4.setVisibility(r9)
            r4.removeAllViews()
            nj3.e0 r13 = r0.f229254w
            int r13 = r13.size()
            if (r13 <= r10) goto L_0x02fc
            r5.setVisibility(r9)
            r5.removeAllViews()
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r9.mo10233c(r12)
            java.lang.Object[] r19 = r9.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/widget/menu/MMPopupMenu"
            java.lang.String r21 = "showGridMenu"
            java.lang.String r22 = "(II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6.setVisibility(r9)
            java.lang.String r19 = "com/tencent/mm/ui/widget/menu/MMPopupMenu"
            java.lang.String r20 = "showGridMenu"
            java.lang.String r21 = "(II)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x035c
        L_0x02fc:
            r9 = 0
        L_0x02fd:
            nj3.e0 r13 = r0.f229254w
            int r13 = r13.size()
            if (r9 >= r13) goto L_0x0316
            nj3.e0 r13 = r0.f229254w
            android.view.MenuItem r13 = r13.getItem(r9)
            nj3.f0 r13 = (nj3.C76875f0) r13
            boolean r13 = r13.f224708B
            if (r13 == 0) goto L_0x0313
            r9 = 1
            goto L_0x0317
        L_0x0313:
            int r9 = r9 + 1
            goto L_0x02fd
        L_0x0316:
            r9 = 0
        L_0x0317:
            if (r9 == 0) goto L_0x035c
            r9 = 0
            r5.setVisibility(r9)
            r5.removeAllViews()
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            r9.mo10233c(r12)
            java.lang.Object[] r19 = r9.mo10232b()
            java.lang.String r20 = "com/tencent/mm/ui/widget/menu/MMPopupMenu"
            java.lang.String r21 = "showGridMenu"
            java.lang.String r22 = "(II)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r6
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r12 = 0
            java.lang.Object r9 = r9.mo10231a(r12)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r6.setVisibility(r9)
            java.lang.String r19 = "com/tencent/mm/ui/widget/menu/MMPopupMenu"
            java.lang.String r20 = "showGridMenu"
            java.lang.String r21 = "(II)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
        L_0x035c:
            int r6 = r0.f229226B
            if (r6 <= 0) goto L_0x0378
            r6 = 2131311094(0x7f0939f6, float:1.8240519E38)
            android.view.View r6 = r3.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            int r9 = r0.f229226B
            r6.setMinimumWidth(r9)
            int r9 = r5.getVisibility()
            if (r9 == 0) goto L_0x0378
            r9 = 1
            r6.setGravity(r9)
        L_0x0378:
            r6 = 0
        L_0x0379:
            nj3.e0 r9 = r0.f229254w
            int r9 = r9.size()
            if (r6 >= r9) goto L_0x046a
            uo3.a$i r9 = r0.f229235K
            if (r9 == 0) goto L_0x0398
            android.content.Context r12 = r0.f229238d
            nj3.e0 r13 = r0.f229254w
            java.util.List<android.view.MenuItem> r13 = r13.f224704d
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r6)
            android.view.MenuItem r13 = (android.view.MenuItem) r13
            android.view.View r9 = r9.mo103146a(r12, r13)
            goto L_0x0399
        L_0x0398:
            r9 = 0
        L_0x0399:
            if (r9 != 0) goto L_0x0415
            android.content.Context r9 = r0.f229238d
            r12 = 2131496986(0x7f0c101a, float:1.8617552E38)
            r13 = 0
            android.view.View r9 = android.view.View.inflate(r9, r12, r13)
            r12 = 2131306160(0x7f0926b0, float:1.8230511E38)
            android.view.View r12 = r9.findViewById(r12)
            com.tencent.mm.ui.widget.imageview.WeImageView r12 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r12
            r13 = 2131315360(0x7f094aa0, float:1.8249171E38)
            android.view.View r13 = r9.findViewById(r13)
            android.widget.TextView r13 = (android.widget.TextView) r13
            nj3.e0 r14 = r0.f229254w
            java.util.List<android.view.MenuItem> r14 = r14.f224704d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r6)
            android.view.MenuItem r14 = (android.view.MenuItem) r14
            android.graphics.drawable.Drawable r14 = r14.getIcon()
            r12.setImageDrawable(r14)
            nj3.e0 r14 = r0.f229254w
            java.util.List<android.view.MenuItem> r14 = r14.f224704d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r6)
            android.view.MenuItem r14 = (android.view.MenuItem) r14
            java.lang.CharSequence r14 = r14.getTitle()
            r13.setText(r14)
            boolean r14 = r0.f229232H
            if (r14 == 0) goto L_0x0415
            nj3.e0 r14 = r0.f229254w
            java.util.List<android.view.MenuItem> r14 = r14.f224704d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r6)
            boolean r14 = r14 instanceof nj3.C76875f0
            if (r14 == 0) goto L_0x0415
            nj3.e0 r14 = r0.f229254w
            java.util.List<android.view.MenuItem> r14 = r14.f224704d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r6)
            nj3.f0 r14 = (nj3.C76875f0) r14
            int r14 = r14.f224725t
            nj3.e0 r15 = r0.f229254w
            java.util.List<android.view.MenuItem> r15 = r15.f224704d
            java.util.ArrayList r15 = (java.util.ArrayList) r15
            java.lang.Object r15 = r15.get(r6)
            nj3.f0 r15 = (nj3.C76875f0) r15
            int r15 = r15.f224718j
            if (r14 == 0) goto L_0x0410
            r12.setIconColor(r14)
        L_0x0410:
            if (r15 == 0) goto L_0x0415
            r13.setTextColor(r15)
        L_0x0415:
            nj3.e0 r12 = r0.f229254w
            java.util.List<android.view.MenuItem> r12 = r12.f224704d
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r6)
            nj3.f0 r12 = (nj3.C76875f0) r12
            nj3.q0 r13 = r12.f224711E
            if (r13 == 0) goto L_0x042a
            com.tencent.mm.ui.chatting.viewitems.d5 r13 = (com.tencent.p014mm.p136ui.chatting.viewitems.C73951d5) r13
            r13.mo103020a(r9)
        L_0x042a:
            uo3.c r13 = new uo3.c
            r13.<init>(r0, r6)
            r9.setOnClickListener(r13)
            nj3.n0 r13 = r0.f229250s
            if (r13 == 0) goto L_0x0445
            nj3.e0 r14 = r0.f229254w
            java.util.List<android.view.MenuItem> r14 = r14.f224704d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r6)
            android.view.MenuItem r14 = (android.view.MenuItem) r14
            r13.mo2585a(r9, r6, r14)
        L_0x0445:
            boolean r12 = r12.f224708B
            if (r12 == 0) goto L_0x0453
            int r12 = r5.getChildCount()
            if (r12 >= r10) goto L_0x0466
            r5.addView(r9)
            goto L_0x0466
        L_0x0453:
            int r12 = r4.getChildCount()
            if (r12 >= r10) goto L_0x045d
            r4.addView(r9)
            goto L_0x0466
        L_0x045d:
            int r12 = r5.getChildCount()
            if (r12 >= r10) goto L_0x0466
            r5.addView(r9)
        L_0x0466:
            int r6 = r6 + 1
            goto L_0x0379
        L_0x046a:
            nj3.s0 r4 = r0.f229244j
            r4.setContentView(r3)
            r4 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r3.measure(r5, r6)
            int r4 = r3.getMeasuredHeight()
            int r3 = r3.getMeasuredWidth()
            android.content.Context r5 = r0.f229238d
            r6 = 12
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r6)
            float r6 = (float) r3
            float r6 = r6 / r17
            int r6 = (int) r6
            int r6 = r1 - r6
            int r9 = r6 + r3
            android.util.DisplayMetrics r10 = r0.f229247p
            int r10 = r10.widthPixels
            int r10 = r10 - r5
            if (r9 <= r10) goto L_0x049d
            int r5 = r10 - r3
            goto L_0x04a1
        L_0x049d:
            if (r6 >= r5) goto L_0x04a0
            goto L_0x04a1
        L_0x04a0:
            r5 = r6
        L_0x04a1:
            int r3 = r2 - r4
            android.content.Context r4 = r0.f229238d
            r6 = 2131165281(0x7f070061, float:1.7944775E38)
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r4, r6)
            int r3 = r3 - r4
            if (r3 < 0) goto L_0x04d0
            boolean r4 = r0.f229233I
            if (r4 == 0) goto L_0x04b4
            goto L_0x04d0
        L_0x04b4:
            r8.setVisibility(r11)
            r2 = 0
            r7.setVisibility(r2)
            android.view.ViewGroup$LayoutParams r2 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r1 = r1 - r5
            android.content.Context r4 = r0.f229238d
            r6 = 7
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r6)
            int r1 = r1 - r4
            r2.leftMargin = r1
            r7.setLayoutParams(r2)
            goto L_0x04fc
        L_0x04d0:
            android.view.View r3 = r0.f229240f
            int r3 = r3.getHeight()
            int r2 = r2 + r3
            android.content.Context r3 = r0.f229238d
            r4 = 2131165281(0x7f070061, float:1.7944775E38)
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r3, r4)
            int r3 = r3 + r2
            r2 = 0
            r8.setVisibility(r2)
            r7.setVisibility(r11)
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r1 = r1 - r5
            android.content.Context r4 = r0.f229238d
            r6 = 7
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r6)
            int r1 = r1 - r4
            r2.leftMargin = r1
            r8.setLayoutParams(r2)
        L_0x04fc:
            nj3.e0 r1 = r0.f229254w
            int r1 = r1.size()
            if (r1 != 0) goto L_0x050a
            r7.setVisibility(r11)
            r8.setVisibility(r11)
        L_0x050a:
            android.content.Context r1 = r0.f229238d
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0828
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0828
            nj3.s0 r1 = r0.f229244j
            android.view.View r2 = r0.f229240f
            r4 = 0
            r1.showAtLocation(r2, r4, r5, r3)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f229234J = r1
            goto L_0x0828
        L_0x0528:
            boolean r5 = r0.f229225A
            if (r5 == 0) goto L_0x0699
            nj3.s0 r3 = new nj3.s0
            android.content.Context r4 = r0.f229238d
            r3.<init>((android.content.Context) r4)
            r0.f229245n = r3
            r3.setOnDismissListener(r0)
            nj3.s0 r3 = r0.f229245n
            r3.setWidth(r7)
            nj3.s0 r3 = r0.f229245n
            r3.setHeight(r7)
            nj3.s0 r3 = r0.f229245n
            r4 = 1
            r3.setFocusable(r4)
            nj3.s0 r3 = r0.f229245n
            r3.setOutsideTouchable(r4)
            nj3.s0 r3 = r0.f229245n
            r3.setAnimationStyle(r14)
            nj3.s0 r3 = r0.f229245n
            r3.setInputMethodMode(r9)
            android.content.Context r3 = r0.f229238d
            r4 = 2131498000(0x7f0c1410, float:1.861961E38)
            r5 = 0
            android.view.View r3 = android.view.View.inflate(r3, r4, r5)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r7, r7)
            r3.setLayoutParams(r4)
            r4 = 2131309147(0x7f09325b, float:1.823657E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            android.view.View r5 = r3.findViewById(r13)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.view.View r6 = r3.findViewById(r12)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r7 = 0
            r4.setVisibility(r7)
            r4.removeAllViews()
            r7 = 0
        L_0x0586:
            nj3.e0 r8 = r0.f229254w
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x05e3
            uo3.a$i r8 = r0.f229235K
            if (r8 == 0) goto L_0x05a6
            android.content.Context r9 = r0.f229238d
            nj3.e0 r12 = r0.f229254w
            java.util.List<android.view.MenuItem> r12 = r12.f224704d
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r7)
            android.view.MenuItem r12 = (android.view.MenuItem) r12
            android.view.View r8 = r8.mo103146a(r9, r12)
            r9 = r8
            goto L_0x05a7
        L_0x05a6:
            r9 = 0
        L_0x05a7:
            if (r9 != 0) goto L_0x05cf
            android.content.Context r8 = r0.f229238d
            r9 = 2131496987(0x7f0c101b, float:1.8617554E38)
            r12 = 0
            android.view.View r9 = android.view.View.inflate(r8, r9, r12)
            r8 = 2131300417(0x7f091041, float:1.8218863E38)
            android.view.View r8 = r9.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            nj3.e0 r12 = r0.f229254w
            java.util.List<android.view.MenuItem> r12 = r12.f224704d
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r7)
            android.view.MenuItem r12 = (android.view.MenuItem) r12
            java.lang.CharSequence r12 = r12.getTitle()
            r8.setText(r12)
        L_0x05cf:
            uo3.d r8 = new uo3.d
            r8.<init>(r0, r7)
            r9.setOnClickListener(r8)
            int r8 = r4.getChildCount()
            if (r8 >= r10) goto L_0x05e0
            r4.addView(r9)
        L_0x05e0:
            int r7 = r7 + 1
            goto L_0x0586
        L_0x05e3:
            nj3.s0 r4 = r0.f229245n
            r4.setContentView(r3)
            r4 = 0
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r4)
            r3.measure(r7, r8)
            int r4 = r3.getMeasuredHeight()
            int r3 = r3.getMeasuredWidth()
            android.content.Context r7 = r0.f229238d
            r8 = 12
            int r7 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r7, r8)
            float r8 = (float) r3
            float r8 = r8 / r17
            int r8 = (int) r8
            int r8 = r1 - r8
            int r9 = r8 + r3
            android.util.DisplayMetrics r10 = r0.f229247p
            int r10 = r10.widthPixels
            int r10 = r10 - r7
            if (r9 <= r10) goto L_0x0616
            int r7 = r10 - r3
            goto L_0x061a
        L_0x0616:
            if (r8 >= r7) goto L_0x0619
            goto L_0x061a
        L_0x0619:
            r7 = r8
        L_0x061a:
            int r3 = r2 - r4
            android.content.Context r4 = r0.f229238d
            r8 = 2131165281(0x7f070061, float:1.7944775E38)
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r4, r8)
            int r3 = r3 - r4
            if (r3 >= 0) goto L_0x0652
            android.view.View r3 = r0.f229240f
            int r3 = r3.getHeight()
            int r2 = r2 + r3
            android.content.Context r3 = r0.f229238d
            int r3 = com.tencent.p014mm.p136ui.C74942w4.m89786c(r3, r8)
            int r3 = r3 + r2
            r2 = 0
            r6.setVisibility(r2)
            r5.setVisibility(r11)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r1 = r1 - r7
            android.content.Context r4 = r0.f229238d
            r8 = 7
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r8)
            int r1 = r1 - r4
            r2.leftMargin = r1
            r6.setLayoutParams(r2)
            goto L_0x066d
        L_0x0652:
            r8 = 7
            r6.setVisibility(r11)
            r2 = 0
            r5.setVisibility(r2)
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int r1 = r1 - r7
            android.content.Context r4 = r0.f229238d
            int r4 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r4, r8)
            int r1 = r1 - r4
            r2.leftMargin = r1
            r5.setLayoutParams(r2)
        L_0x066d:
            nj3.e0 r1 = r0.f229254w
            int r1 = r1.size()
            if (r1 != 0) goto L_0x067b
            r5.setVisibility(r11)
            r6.setVisibility(r11)
        L_0x067b:
            android.content.Context r1 = r0.f229238d
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0828
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x0828
            nj3.s0 r1 = r0.f229245n
            android.view.View r2 = r0.f229240f
            r4 = 0
            r1.showAtLocation(r2, r4, r7, r3)
            long r1 = java.lang.System.currentTimeMillis()
            r0.f229234J = r1
            goto L_0x0828
        L_0x0699:
            android.content.Context r5 = r0.f229238d
            android.util.DisplayMetrics r7 = new android.util.DisplayMetrics
            r7.<init>()
            boolean r10 = r5 instanceof android.app.Activity
            if (r10 == 0) goto L_0x06b3
            r10 = r5
            android.app.Activity r10 = (android.app.Activity) r10
            android.view.WindowManager r10 = r10.getWindowManager()
            android.view.Display r10 = r10.getDefaultDisplay()
            r10.getMetrics(r7)
            goto L_0x06c3
        L_0x06b3:
            android.util.DisplayMetrics r7 = uo3.C78267e.f229280a
            if (r7 != 0) goto L_0x06c1
            android.content.res.Resources r7 = r5.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            uo3.C78267e.f229280a = r7
        L_0x06c1:
            android.util.DisplayMetrics r7 = uo3.C78267e.f229280a
        L_0x06c3:
            r10 = 95
            int r5 = com.tencent.p014mm.p136ui.C74942w4.m89784a(r5, r10)
            if (r15 >= r5) goto L_0x06cc
            goto L_0x06cd
        L_0x06cc:
            r5 = r15
        L_0x06cd:
            if (r1 >= 0) goto L_0x06d6
            int r1 = r7.widthPixels
            int r10 = r8 * 2
            int r10 = r10 + r5
            int r1 = r1 - r10
            goto L_0x06e7
        L_0x06d6:
            int r10 = r7.widthPixels
            int r5 = r5 + r1
            int r11 = r8 * 2
            int r11 = r11 + r5
            int r11 = r10 - r11
            if (r11 >= 0) goto L_0x06e5
            int r10 = r10 - r1
            int r10 = r10 - r8
            r1 = 0
            r5 = 1
            goto L_0x06ea
        L_0x06e5:
            int r1 = r10 - r5
        L_0x06e7:
            r10 = r1
            r1 = 1
            r5 = 0
        L_0x06ea:
            if (r2 < 0) goto L_0x06f3
            int r11 = r7.heightPixels
            if (r2 <= r11) goto L_0x06f1
            goto L_0x06f3
        L_0x06f1:
            r11 = r2
            goto L_0x06f9
        L_0x06f3:
            int r11 = r7.heightPixels
            float r11 = (float) r11
            float r11 = r11 / r17
            int r11 = (int) r11
        L_0x06f9:
            if (r4 == 0) goto L_0x0700
            int r4 = r3 + r8
            if (r11 >= r4) goto L_0x0708
            goto L_0x070d
        L_0x0700:
            int r4 = r7.heightPixels
            int r4 = r4 - r11
            int r7 = r8 * 3
            int r7 = r7 + r3
            if (r4 >= r7) goto L_0x070d
        L_0x0708:
            int r11 = r11 - r8
            int r11 = r11 - r3
            r3 = 1
            r4 = 0
            goto L_0x0710
        L_0x070d:
            int r11 = r11 - r8
            r3 = 0
            r4 = 1
        L_0x0710:
            if (r3 == 0) goto L_0x0716
            int r8 = r8 * 2
            int r11 = r11 - r8
            goto L_0x071b
        L_0x0716:
            if (r4 == 0) goto L_0x071b
            int r8 = r8 * 2
            int r11 = r11 + r8
        L_0x071b:
            r7 = 2131886812(0x7f1202dc, float:1.9408213E38)
            if (r1 == 0) goto L_0x0723
            if (r4 == 0) goto L_0x0723
            goto L_0x073a
        L_0x0723:
            if (r5 == 0) goto L_0x072b
            if (r4 == 0) goto L_0x072b
            r7 = 2131886814(0x7f1202de, float:1.9408217E38)
            goto L_0x073a
        L_0x072b:
            if (r1 == 0) goto L_0x0733
            if (r3 == 0) goto L_0x0733
            r7 = 2131886811(0x7f1202db, float:1.9408211E38)
            goto L_0x073a
        L_0x0733:
            if (r5 == 0) goto L_0x073a
            if (r3 == 0) goto L_0x073a
            r7 = 2131886813(0x7f1202dd, float:1.9408215E38)
        L_0x073a:
            android.content.Context r1 = r0.f229238d
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2131166275(0x7f070443, float:1.794679E38)
            int r1 = r1.getDimensionPixelSize(r3)
            int r1 = r2 - r1
            r0.f229246o = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "showPointY="
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = "verticalOffset="
            r1.append(r2)
            int r2 = r0.f229246o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            com.tencent.p014mm.p136ui.C85975v4.m106304a(r6, r1, r3)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = new com.tencent.mm.ui.base.MMListPopupWindow
            android.content.Context r3 = r0.f229238d
            r4 = 0
            r1.<init>(r3, r4, r2)
            r0.f229242h = r1
            nj3.s0 r1 = r1.f214823g
            r1.setOnDismissListener(r0)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            uo3.a$g r2 = new uo3.a$g
            r2.<init>()
            r1.f214834r = r2
            uo3.a$j r2 = r0.f229241g
            r1.mo101713b(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            boolean r2 = r0.f229236L
            r1.f214837u = r2
            nj3.s0 r1 = r1.f214823g
            r1.setFocusable(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            boolean r2 = r0.f229237M
            r1.f214831o = r2
            android.content.Context r2 = r0.f229238d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131235137(0x7f081141, float:1.808646E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            nj3.s0 r1 = r1.f214823g
            r1.setBackgroundDrawable(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            nj3.s0 r1 = r1.f214823g
            r1.setAnimationStyle(r7)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            r1.f214828l = r10
            r1.f214829m = r11
            r2 = 1
            r1.f214830n = r2
            android.view.View r2 = r0.f229240f
            r1.f214833q = r2
            r1.mo101714c(r15)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            nj3.s0 r1 = r1.f214823g
            r1.setInputMethodMode(r9)
            android.content.Context r1 = r0.f229238d
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x082a
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isFinishing()
            if (r1 != 0) goto L_0x082a
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            r1.mo101715d()
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            r1.setOnKeyListener(r0)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            android.content.Context r3 = r0.f229238d
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131101462(0x7f060716, float:1.7815334E38)
            int r3 = r3.getColor(r4)
            r2.<init>(r3)
            r1.setDivider(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            android.content.Context r2 = r0.f229238d
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131234427(0x7f080e7b, float:1.808502E38)
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3)
            r1.setSelector(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            r2 = 0
            r1.setDividerHeight(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            r1.setVerticalScrollBarEnabled(r2)
            com.tencent.mm.ui.base.MMListPopupWindow r1 = r0.f229242h
            com.tencent.mm.ui.base.MMListPopupWindow$a r1 = r1.f214825i
            r1.setHorizontalScrollBarEnabled(r2)
        L_0x0828:
            r1 = 1
            return r1
        L_0x082a:
            r2 = 0
            return r2
        L_0x082c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: uo3.C78253a.mo108278o(int, int):boolean");
    }

    public void onDismiss() {
        View view = this.f229248q;
        if (view != null) {
            view.setSelected(false);
        } else {
            this.f229240f.setSelected(false);
        }
        PopupWindow.OnDismissListener onDismissListener = this.f229227C;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        C117292a.m165361g(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(keyEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        C117292a.m165362h(false, this, "com/tencent/mm/ui/widget/menu/MMPopupMenu", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }

    public C78253a(Context context) {
        this.f229240f = null;
        this.f229241g = null;
        this.f229256y = false;
        this.f229257z = false;
        this.f229225A = false;
        this.f229226B = 0;
        this.f229228D = false;
        this.f229229E = false;
        this.f229230F = true;
        this.f229231G = 0;
        this.f229232H = false;
        this.f229233I = false;
        this.f229234J = 0;
        this.f229236L = true;
        this.f229237M = false;
        this.f229238d = context;
        this.f229239e = (LayoutInflater) context.getSystemService("layout_inflater");
        mo108268c();
    }
}
