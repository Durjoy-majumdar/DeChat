package com.tencent.p014mm.plugin.appbrand.widget.input;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84545i3;
import com.tencent.p014mm.plugin.appbrand.page.C83873p2;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84963i1;
import com.tencent.p014mm.plugin.appbrand.widget.input.C84967l0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.system.AndroidContextUtil;
import in3.C87773e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import nt0.C89093a;
import p224ra.C89909e;
import p849e3.C107168a0;
import p849e3.C107207u;
import qt0.C89843b;
import qt0.C89851g;
import to0.C90561a;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0 */
public class C84983t0 extends LinearLayout implements C84967l0.C84969b, C84956g1 {

    /* renamed from: C */
    public static final /* synthetic */ int f247662C = 0;

    /* renamed from: A */
    public boolean f247663A = false;

    /* renamed from: B */
    public boolean f247664B = false;

    /* renamed from: d */
    public final List<C84990i> f247665d = new ArrayList();

    /* renamed from: e */
    public int f247666e = 0;

    /* renamed from: f */
    public final Runnable f247667f = new C84985b();

    /* renamed from: g */
    public C84991j f247668g;

    /* renamed from: h */
    public C84989h f247669h;

    /* renamed from: i */
    public boolean f247670i = false;

    /* renamed from: j */
    public C84992k f247671j;

    /* renamed from: n */
    public int f247672n = 2;

    /* renamed from: o */
    public final MMHandler f247673o = new C68720d(this, Looper.getMainLooper());

    /* renamed from: p */
    public C89843b f247674p;

    /* renamed from: q */
    public View f247675q;

    /* renamed from: r */
    public View f247676r;

    /* renamed from: s */
    public ImageButton f247677s;

    /* renamed from: t */
    public boolean f247678t;

    /* renamed from: u */
    public View f247679u;

    /* renamed from: v */
    public boolean f247680v;

    /* renamed from: w */
    public EditText f247681w;

    /* renamed from: x */
    public Context f247682x;

    /* renamed from: y */
    public final C84963i1 f247683y;

    /* renamed from: z */
    public C90561a f247684z = null;

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$d */
    public class C68720d extends MMHandler {
        public C68720d(C84983t0 t0Var, Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (1 == message.what) {
                ((Runnable) message.obj).run();
            } else {
                super.handleMessage(message);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$g */
    public interface C68721g {
        /* renamed from: a */
        void mo94518a(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$m */
    public static final class C68722m extends FrameLayout implements C68721g {

        /* renamed from: d */
        public boolean f197395d = false;

        public C68722m(Context context) {
            super(context);
            LayoutInflater.from(context).inflate(C0966R.C0971layout.f6516gz, this);
        }

        /* renamed from: a */
        public void mo94518a(boolean z) {
            boolean z2 = z != this.f197395d;
            this.f197395d = z;
            if (z2 && !isInLayout()) {
                requestLayout();
            }
        }

        public void onMeasure(int i, int i2) {
            if (this.f197395d || !isShown()) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                i2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                i = makeMeasureSpec;
            }
            super.onMeasure(i, i2);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$a */
    public class C84984a implements Runnable {
        public C84984a() {
        }

        public void run() {
            C84983t0 t0Var = C84983t0.this;
            if (!t0Var.f247678t || 1 != t0Var.f247672n) {
                t0Var.mo117893z();
            } else {
                C84983t0.m104782w(t0Var);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$b */
    public class C84985b implements Runnable {
        public C84985b() {
        }

        public void run() {
            View view = C84983t0.this.f247675q;
            if (view != null) {
                WeakHashMap<View, C107168a0> weakHashMap = C107207u.f320808a;
                if (C107207u.C107211e.m145207b(view)) {
                    if (C84983t0.this.f247674p.mo124121n()) {
                        Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "postMeasure inLayout, skip");
                        C84983t0.this.post(this);
                        return;
                    }
                    C84983t0 t0Var = C84983t0.this;
                    t0Var.getClass();
                    Log.m105926v("MicroMsg.AppBrandSoftKeyboardPanel", "[scrollUp] forceMeasurePanel enter");
                    t0Var.f247675q.requestLayout();
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$c */
    public class C84986c implements C89851g {
        public C84986c() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$e */
    public class C84987e implements View.OnClickListener {
        public C84987e() {
        }

        public void onClick(View view) {
            C84989h hVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C84983t0 t0Var = C84983t0.this;
            if (!t0Var.f247670i && (hVar = t0Var.f247669h) != null) {
                t0Var.f247670i = true;
                hVar.mo117898a(true);
                t0Var.f247670i = false;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$f */
    public class C84988f implements View.OnClickListener {
        public C84988f() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (view.isSelected()) {
                int i = C84983t0.f247662C;
                C84983t0 t0Var = C84983t0.this;
                t0Var.f247683y.showVKB();
                t0Var.mo117862A();
                view.setSelected(false);
            } else {
                int i2 = C84983t0.f247662C;
                C84983t0 t0Var2 = C84983t0.this;
                t0Var2.f247683y.hideVKB();
                C84983t0.m104782w(t0Var2);
                t0Var2.mo117851e(C84967l0.m104750c(t0Var2.f247682x));
                view.setSelected(true);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$h */
    public interface C84989h {
        /* renamed from: a */
        void mo117898a(boolean z);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$i */
    public interface C84990i {
        /* renamed from: a */
        void mo117899a(int i);

        /* renamed from: b */
        EditText mo117900b();
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$j */
    public interface C84991j {
        /* renamed from: a */
        boolean mo117901a(String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$k */
    public interface C84992k {
        /* renamed from: a */
        void mo117902a(int i);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.widget.input.t0$l */
    public static final class C84993l {
        public C84993l(C84984a aVar) {
        }
    }

    static {
        new C84993l((C84984a) null);
    }

    public C84983t0(Context context, C90561a aVar, boolean z) {
        super(context);
        this.f247682x = context;
        C84963i1 a = C84963i1.C84964a.m104748a(context);
        this.f247683y = a == null ? new C89093a() : a;
        Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "mComponentView is assigned");
        this.f247684z = aVar;
        mo117863B(z);
    }

    /* renamed from: G */
    public static C84983t0 m104780G(View view, Context context, C90561a aVar) {
        C85004y d = C85004y.m104825d(view);
        if (d == null) {
            return null;
        }
        C85004y.m104826e(view);
        C84983t0 y = m104783y(view);
        if (y == null) {
            Context castActivityOrNull = AndroidContextUtil.castActivityOrNull(view.getContext());
            if (castActivityOrNull == null) {
                castActivityOrNull = C87773e.m109212f(view.getContext());
            }
            if (castActivityOrNull != null) {
                context = castActivityOrNull;
            }
            y = view instanceof C84983t0 ? (C84983t0) view : new C84983t0(context, aVar, false);
            d.mo117919a(y, false);
        }
        if (y.f247684z != aVar) {
            Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "mComponentView != componentView so we set mComponentView = componentView;");
            y.f247684z = aVar;
        }
        return y;
    }

    /* access modifiers changed from: private */
    public void setPanelHeightImpl(int i) {
        if (this.f247674p.mo124119l(i)) {
            ((C84985b) this.f247667f).run();
        }
    }

    /* renamed from: w */
    public static void m104782w(C84983t0 t0Var) {
        t0Var.f247674p.onResume();
        if (C84545i3.m104134k(t0Var)) {
            t0Var.mo117871K(8);
            t0Var.mo117870J();
        } else {
            if (t0Var.isShown()) {
                View view = t0Var.f247675q;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "show", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!t0Var.f247678t) {
                t0Var.f247674p.mo124128s(true);
            } else {
                t0Var.f247674p.mo124126p();
            }
        }
        ImageButton imageButton = t0Var.f247677s;
        if (imageButton != null) {
            imageButton.setSelected(true);
        }
        t0Var.f247673o.obtainMessage(1, new C84995u0(t0Var, 1, t0Var.f247670i)).sendToTarget();
    }

    /* renamed from: y */
    public static C84983t0 m104783y(View view) {
        return (C84983t0) view.getRootView().findViewById(C0966R.C0970id.f5935sq);
    }

    /* renamed from: A */
    public final void mo117862A() {
        this.f247674p.onPause();
        if (isShown()) {
            View view = this.f247675q;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel$PanImpl", "hide", "(Lcom/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f247674p.mo124128s(!this.f247678t);
        ImageButton imageButton = this.f247677s;
        if (imageButton != null) {
            imageButton.setSelected(false);
        }
        this.f247673o.obtainMessage(1, new C84995u0(this, 0, this.f247670i)).sendToTarget();
    }

    /* renamed from: B */
    public final void mo117863B(boolean z) {
        ViewGroup viewGroup;
        Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        super.setId(mo117891t());
        setOrientation(1);
        if (this.f247663A) {
            this.f247676r = this.f247684z;
        } else {
            this.f247676r = mo117892x();
        }
        View view = this.f247676r;
        if (!(view == null || (viewGroup = (ViewGroup) view.getParent()) == null)) {
            Log.m105925i("MicroMsg.AppBrandSoftKeyboardPanel", "toolbar is already existed in a layout,the class of the parent is %s  the id is : %d", viewGroup.getClass().toString(), Integer.valueOf(viewGroup.getId()));
            viewGroup.removeView(this.f247676r);
        }
        addView(this.f247676r);
        this.f247664B = false;
        C89843b.C89846b bVar = (C89843b.C89846b) C89909e.m112436a(C89843b.C89846b.class);
        C89843b US = bVar == null ? null : bVar.mo124134US(this.f247682x, z);
        this.f247674p = US;
        if (US == null) {
            this.f247674p = new C89843b.C89844a(this.f247682x);
        }
        int c = C84967l0.m104750c(getContext());
        if (C84545i3.m104134k(this)) {
            mo117871K(8);
        } else if (this.f247675q != null && c > 0) {
            setPanelHeightImpl(c);
        }
        View panelView = this.f247674p.getPanelView();
        this.f247675q = panelView;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view2 = panelView;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        panelView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f247675q.setBackgroundColor(0);
        addView(this.f247675q);
        mo117872L();
    }

    /* renamed from: C */
    public void mo117864C() {
    }

    /* renamed from: D */
    public void mo117865D() {
        setCanSmileyInput(this.f247678t);
        setShowDoneButton(this.f247680v);
        mo117872L();
    }

    /* renamed from: E */
    public void mo117866E() {
        m104780G(this, (Context) null, this.f247684z);
    }

    /* renamed from: F */
    public void mo117867F(View view) {
        ViewGroup viewGroup;
        if (view != null && (viewGroup = (ViewGroup) view.getParent()) != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: H */
    public final ImageButton mo117868H(View view) {
        ImageButton imageButton;
        if (view == null || (imageButton = (ImageButton) view.findViewById(C0966R.C0970id.jnw)) == null) {
            return null;
        }
        imageButton.setSelected(false);
        imageButton.setOnClickListener(new C84988f());
        return imageButton;
    }

    /* renamed from: I */
    public void mo117869I() {
        if (this.f247681w != null) {
            mo117870J();
        }
        mo117865D();
        if (!isShown()) {
            mo117871K(0);
        }
    }

    /* renamed from: J */
    public final void mo117870J() {
        mo117862A();
        EditText editText = this.f247681w;
        if (editText != null) {
            InputMethodManager b = C84975p1.m104767b(editText);
            if (!b.showSoftInput(this.f247681w, 1)) {
                b.showSoftInput(this.f247681w, 2);
                return;
            }
            return;
        }
        this.f247683y.showVKB();
    }

    /* renamed from: K */
    public void mo117871K(int i) {
        if (i == 0 && C84545i3.m104134k(this)) {
            i = 8;
        }
        if (getVisibility() != i) {
            super.setVisibility(i);
            if (i == 0) {
                mo117866E();
                C85004y d = C85004y.m104825d(this);
                if (d == null) {
                    Log.m105920e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
                } else {
                    ((C84967l0) d.getOnLayoutListener()).f247631h = this;
                }
            } else {
                C85004y d2 = C85004y.m104825d(this);
                if (d2 != null && d2.getOnLayoutListener() != null) {
                    ((C84967l0) d2.getOnLayoutListener()).f247631h = null;
                }
            }
        }
    }

    /* renamed from: L */
    public void mo117872L() {
        View view = this.f247676r;
        if (view != null && (view instanceof C68721g)) {
            C68721g gVar = (C68721g) view;
            boolean z = true;
            if ((!(!this.f247678t) || !(!this.f247680v)) && !C84545i3.m104134k(this)) {
                z = false;
            }
            gVar.mo94518a(z);
        }
    }

    /* renamed from: N */
    public void mo117873N() {
        View view;
        View view2 = this.f247676r;
        if (view2 != null) {
            if (this.f247664B) {
                mo117867F(view2);
                if (this.f247663A) {
                    this.f247676r = this.f247684z;
                } else {
                    this.f247676r = mo117892x();
                }
                mo117867F(this.f247676r);
                addView(this.f247676r, 0);
                Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "toolbar is changed in updateToolbar() because of toolbarChanged");
                this.f247664B = false;
            }
            if (this.f247663A && (view = this.f247676r) != this.f247684z) {
                mo117867F(view);
                C90561a aVar = this.f247684z;
                this.f247676r = aVar;
                mo117867F(aVar);
                addView(this.f247676r, 0);
                Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "toolbar is changed in updateToolbar() because toolbar != mComponentView");
            }
            if (this.f247663A && this.f247676r.getParent() != this) {
                mo117867F(this.f247676r);
                addView(this.f247676r, 0);
            }
        }
    }

    /* renamed from: c */
    public boolean mo117874c(EditText editText) {
        if (editText != this.f247681w) {
            return false;
        }
        this.f247681w = null;
        return true;
    }

    /* renamed from: d */
    public void mo117850d(boolean z) {
        Log.m105925i("MicroMsg.AppBrandSoftKeyboardPanel", "onKeyboardStateChanged, kbShown = %b", Boolean.valueOf(z));
        if (z) {
            mo117871K(0);
            mo117862A();
        } else if (isShown()) {
            C84984a aVar = new C84984a();
            if (this.f247673o.hasMessages(1)) {
                this.f247673o.post(aVar);
            } else {
                aVar.run();
            }
        }
    }

    /* renamed from: e */
    public void mo117851e(int i) {
        Log.m105919d("MicroMsg.AppBrandSoftKeyboardPanel", "[scrollUp] refreshHeight %d", Integer.valueOf(i));
        if (C84545i3.m104134k(this)) {
            mo117871K(8);
        } else if (this.f247675q != null && i > 0) {
            setPanelHeightImpl(i);
        }
    }

    public EditText getAttachedEditText() {
        return this.f247681w;
    }

    public int getMinimumHeight() {
        View view;
        C90561a aVar;
        if (getVisibility() != 0 || ((view = this.f247676r) != null && (view.getVisibility() != 0 || (this.f247676r.getMeasuredWidth() == 0 && this.f247676r.getMeasuredHeight() == 0)))) {
            return 0;
        }
        if (!this.f247663A || (aVar = this.f247684z) == null) {
            return C76577a.m92151b(getContext(), 48);
        }
        C83873p2 customViewContainer = aVar.getCustomViewContainer();
        if (customViewContainer != null) {
            ViewGroup viewGroup = customViewContainer.f244867a;
            if ((viewGroup instanceof ViewGroup) && viewGroup.getChildCount() > 0 && customViewContainer.f244867a.getChildAt(0).getLayoutParams() != null) {
                return Math.max(customViewContainer.f244867a.getChildAt(0).getLayoutParams().height, 0);
            }
        }
        return 0;
    }

    /* renamed from: j */
    public void mo117877j(C84990i iVar) {
        if (!((ArrayList) this.f247665d).contains(iVar)) {
            ((ArrayList) this.f247665d).add(iVar);
        }
    }

    /* renamed from: o */
    public void mo117878o(C84990i iVar) {
        ((ArrayList) this.f247665d).remove(iVar);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo117866E();
        C85004y d = C85004y.m104825d(this);
        if (d == null) {
            Log.m105920e("MicroMsg.AppBrandSoftKeyboardPanel", "registerSystemSoftKeyboardHeightListener get null rootLayout");
        } else {
            ((C84967l0) d.getOnLayoutListener()).f247631h = this;
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo117871K(8);
        if (this.f247682x != null) {
            EditText editText = this.f247681w;
            if (editText != null) {
                this.f247683y.hideVKB(editText);
            } else {
                this.f247683y.hideVKB();
            }
        }
        this.f247674p.onDestroy();
        ImageButton imageButton = this.f247677s;
        if (imageButton != null) {
            imageButton.setOnClickListener((View.OnClickListener) null);
        }
        this.f247668g = null;
        removeAllViews();
        this.f247682x = null;
        ((ArrayList) this.f247665d).clear();
        C85004y d = C85004y.m104825d(this);
        if (d != null && d.getOnLayoutListener() != null) {
            ((C84967l0) d.getOnLayoutListener()).f247631h = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = getMeasuredHeight();
        int i5 = this.f247666e;
        if (measuredHeight != i5) {
            Log.m105925i("MicroMsg.AppBrandSoftKeyboardPanel", "update panel height from %d to %d", Integer.valueOf(i5), Integer.valueOf(measuredHeight));
            this.f247666e = measuredHeight;
            Iterator it = ((ArrayList) this.f247665d).iterator();
            while (it.hasNext()) {
                C84990i iVar = (C84990i) it.next();
                if (iVar != null && iVar.mo117900b() == this.f247681w) {
                    iVar.mo117899a(this.f247666e);
                }
            }
        }
        Log.m105927v("MicroMsg.AppBrandSoftKeyboardPanel", "[scrollUp] SoftKeyboardPanel onLayout measuredHeight = %d", Integer.valueOf(getMeasuredHeight()));
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Log.m105918d("MicroMsg.AppBrandSoftKeyboardPanel", "smileyPanelWrapper, onMeasure");
    }

    /* renamed from: q */
    public boolean mo117827q() {
        return this.f247674p.mo117827q();
    }

    public void setCanSmileyInput(boolean z) {
        boolean z2 = true;
        int i = 0;
        boolean z3 = z && this.f247674p.mo124118k();
        boolean z4 = this.f247664B;
        if (this.f247678t == z3) {
            z2 = false;
        }
        this.f247664B = z2 | z4;
        this.f247678t = z3;
        mo117873N();
        ImageButton imageButton = this.f247677s;
        if (imageButton != null) {
            if (!this.f247678t) {
                i = 8;
            }
            imageButton.setVisibility(i);
        }
        mo117872L();
    }

    public void setComponentView(boolean z) {
        if (this.f247663A != z) {
            this.f247663A = z;
            this.f247664B = true;
        }
    }

    public void setId(int i) {
    }

    public void setOnDoneListener(C84989h hVar) {
        this.f247669h = hVar;
    }

    public void setOnSmileyChosenListener(C84991j jVar) {
        boolean z = jVar != this.f247668g;
        this.f247668g = jVar;
        if (z) {
            this.f247674p.setOnTextOperationListener(new C84986c());
        }
    }

    public void setOnVisibilityChangedListener(C84992k kVar) {
        this.f247671j = kVar;
    }

    public void setShowDoneButton(boolean z) {
        mo117873N();
        this.f247680v = z;
        View view = this.f247679u;
        if (view != null) {
            int i = z ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", "setShowDoneButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandSoftKeyboardPanel", "setShowDoneButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        mo117872L();
    }

    public void setVisibility(int i) {
        C84989h hVar;
        if (i == 8) {
            if (!(getVisibility() == i || this.f247670i || (hVar = this.f247669h) == null)) {
                this.f247670i = true;
                hVar.mo117898a(false);
                this.f247670i = false;
            }
            mo117893z();
        } else if (i == 0) {
            mo117869I();
        } else {
            mo117871K(i);
        }
    }

    /* renamed from: t */
    public int mo117891t() {
        return C0966R.C0970id.f5935sq;
    }

    /* renamed from: x */
    public <T extends View & C68721g> T mo117892x() {
        T mVar = new C68722m(getContext());
        ImageButton H = mo117868H(mVar);
        this.f247677s = H;
        if (H != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842913}, MMApplicationContext.getResources().getDrawable(C0966R.C0969drawable.cdd));
            stateListDrawable.addState(new int[0], MMApplicationContext.getResources().getDrawable(C0966R.C0969drawable.cdc));
            this.f247677s.setImageDrawable(stateListDrawable);
        }
        View findViewById = mVar.findViewById(C0966R.C0970id.jnv);
        this.f247679u = findViewById;
        findViewById.setOnClickListener(new C84987e());
        return mVar;
    }

    /* renamed from: z */
    public void mo117893z() {
        if (isShown()) {
            mo117871K(8);
            if (this.f247681w != null && !this.f247683y.hideVKBHavingResult()) {
                try {
                    C84975p1.m104767b(this).hideSoftInputFromWindow(getWindowToken(), 0);
                } catch (Exception unused) {
                }
            }
            mo117862A();
            mo117864C();
        }
    }
}
