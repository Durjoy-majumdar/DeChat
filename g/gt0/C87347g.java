package gt0;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import at0.C103915c;
import at0.C79630a;
import br0.C79774c;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.p026ui.C84700v4;
import com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView;
import com.tencent.p014mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView;
import fy3.C32224a;
import gt0.C87330d0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import lb0.C88394b;
import lb0.C88431k;
import p225rc.C89923l;
import p385u2.C111105a;
import wq0.C91070i;
import wq0.C91072j;
import yq0.C91566l;

/* renamed from: gt0.g */
public class C87347g extends Dialog implements C87370k0, C91566l {

    /* renamed from: A */
    public final List<C87330d0.C87331a> f253140A;

    /* renamed from: B */
    public C87330d0.C87332b f253141B;

    /* renamed from: C */
    public int f253142C;

    /* renamed from: d */
    public final C79774c f253143d;

    /* renamed from: e */
    public final View f253144e;

    /* renamed from: f */
    public ImageView f253145f;

    /* renamed from: g */
    public TextView f253146g;

    /* renamed from: h */
    public Button f253147h;

    /* renamed from: i */
    public Button f253148i;

    /* renamed from: j */
    public TextView f253149j;

    /* renamed from: n */
    public TextView f253150n;

    /* renamed from: o */
    public ImageView f253151o;

    /* renamed from: p */
    public TextView f253152p;

    /* renamed from: q */
    public LinearLayout f253153q;

    /* renamed from: r */
    public MaxHeightRecyclerView f253154r;

    /* renamed from: s */
    public TextView f253155s;

    /* renamed from: t */
    public View f253156t;

    /* renamed from: u */
    public C87350h f253157u;

    /* renamed from: v */
    public View f253158v;

    /* renamed from: w */
    public C87375o0 f253159w;

    /* renamed from: x */
    public C91566l.C91570c f253160x;

    /* renamed from: y */
    public C87330d0 f253161y;

    /* renamed from: z */
    public String f253162z = "";

    /* renamed from: gt0.g$c */
    public static final class C76060c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ double f222903d;

        /* renamed from: e */
        public final /* synthetic */ C87347g f222904e;

        public C76060c(double d, C87347g gVar) {
            this.f222903d = d;
            this.f222904e = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
            r4 = r4.getChildAt(r3);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onGlobalLayout() {
            /*
                r8 = this;
                double r0 = r8.f222903d
                r2 = 0
                r3 = 0
            L_0x0004:
                r4 = 0
                int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x0042
                gt0.g r4 = r8.f222904e
                com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r4 = r4.f253154r
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
                if (r4 == 0) goto L_0x001f
                android.view.View r4 = r4.getChildAt(r3)
                if (r4 == 0) goto L_0x001f
                int r4 = r4.getMeasuredHeight()
                goto L_0x0030
            L_0x001f:
                gt0.g r4 = r8.f222904e
                android.content.Context r4 = r4.getContext()
                android.content.res.Resources r4 = r4.getResources()
                r5 = 2131165980(0x7f07031c, float:1.7946192E38)
                int r4 = r4.getDimensionPixelSize(r5)
            L_0x0030:
                r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
                int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r7 < 0) goto L_0x0037
                goto L_0x003b
            L_0x0037:
                double r4 = (double) r4
                double r4 = r4 * r0
                int r4 = (int) r4
            L_0x003b:
                int r2 = r2 + r4
                r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                double r0 = r0 + r4
                int r3 = r3 + 1
                goto L_0x0004
            L_0x0042:
                gt0.g r0 = r8.f222904e
                com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r0 = r0.f253154r
                r0.setMaxHeight(r2)
                gt0.g r0 = r8.f222904e
                com.tencent.mm.plugin.appbrand.ui.MaxHeightRecyclerView r0 = r0.f253154r
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                r0.removeOnGlobalLayoutListener(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gt0.C87347g.C76060c.onGlobalLayout():void");
        }
    }

    /* renamed from: gt0.g$a */
    public static final class C87348a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87347g f253163d;

        public C87348a(C87347g gVar) {
            this.f253163d = gVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91566l.C91570c.C91571a.m114908a(this.f253163d.f253160x, 2, C87347g.m108451a(this.f253163d, false), 0, false, 12, (Object) null);
            C87347g gVar = this.f253163d;
            C87375o0 o0Var = gVar.f253159w;
            if (o0Var != null) {
                o0Var.mo121777a(gVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gt0.g$b */
    public static final class C87349b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87347g f253164d;

        public C87349b(C87347g gVar) {
            this.f253164d = gVar;
        }

        public final void onClick(View view) {
            int i;
            C87330d0.C87331a aVar;
            boolean z;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!this.f253164d.mo121755d()) {
                if (this.f253164d.f253157u.mo121761b() && !this.f253164d.f253157u.mo121760a()) {
                    ((ScrollView) this.f253164d.f253144e.findViewById(C0966R.C0970id.j48)).fullScroll(130);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            ArrayList a = C87347g.m108451a(this.f253164d, true);
            C87347g gVar = this.f253164d;
            C91566l.C91570c cVar = gVar.f253160x;
            Iterator<C87330d0.C87331a> it = gVar.f253161y.f253099d.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = it.next();
                if (aVar == null || !aVar.f253107f) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            if (aVar != null) {
                i = aVar.f253109h;
            }
            cVar.mo114536a(1, a, i, this.f253164d.f253157u.mo121762c());
            C87347g gVar2 = this.f253164d;
            C87375o0 o0Var = gVar2.f253159w;
            if (o0Var != null) {
                o0Var.mo121777a(gVar2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87347g(Context context, C79774c cVar, C91566l.C91570c cVar2) {
        super(context);
        Context context2 = context;
        C79774c cVar3 = cVar;
        C91566l.C91570c cVar4 = cVar2;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(cVar3, "windowAndroid");
        C87412m.m108594g(cVar4, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f253143d = cVar3;
        View inflate = View.inflate(context2, C0966R.C0971layout.f6463fj, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…and_request_dialog, null)");
        this.f253144e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.l1t);
        C87412m.m108593f(findViewById, "mRootView.findViewById(R.id.user_agreement_layout)");
        this.f253157u = new C87350h(context2, findViewById);
        this.f253160x = cVar4;
        ArrayList arrayList = new ArrayList();
        this.f253140A = arrayList;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.f359083iq3);
        C87412m.m108593f(findViewById2, "mRootView.findViewById(R.id.request_icon)");
        this.f253145f = (ImageView) findViewById2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.iq5);
        C87412m.m108593f(findViewById3, "mRootView.findViewById(R.id.request_name)");
        this.f253146g = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(C0966R.C0970id.ipy);
        C87412m.m108593f(findViewById4, "mRootView.findViewById(R.id.request_cancel)");
        Button button = (Button) findViewById4;
        this.f253148i = button;
        button.setOnClickListener(new C87348a(this));
        View findViewById5 = inflate.findViewById(C0966R.C0970id.iq6);
        C87412m.m108593f(findViewById5, "mRootView.findViewById(R.id.request_ok)");
        Button button2 = (Button) findViewById5;
        this.f253147h = button2;
        C89923l lVar = C89923l.f258408a;
        lVar.mo117504j(button2.getPaint());
        this.f253147h.setOnClickListener(new C87349b(this));
        View findViewById6 = inflate.findViewById(C0966R.C0970id.f359081iq1);
        C87412m.m108593f(findViewById6, "mRootView.findViewById(R.id.request_desc)");
        this.f253149j = (TextView) findViewById6;
        View findViewById7 = inflate.findViewById(C0966R.C0970id.jlj);
        C87412m.m108593f(findViewById7, "mRootView.findViewById(R.id.simple_detail_desc)");
        this.f253150n = (TextView) findViewById7;
        View findViewById8 = inflate.findViewById(C0966R.C0970id.f359080iq0);
        C87412m.m108593f(findViewById8, "mRootView.findViewById(R.id.request_content)");
        this.f253153q = (LinearLayout) findViewById8;
        View findViewById9 = inflate.findViewById(C0966R.C0970id.iq8);
        C87412m.m108593f(findViewById9, "mRootView.findViewById(R.id.request_right_icon)");
        ImageView imageView = (ImageView) findViewById9;
        this.f253151o = imageView;
        C103915c.C67105b bVar = C103915c.f307262l;
        Integer valueOf = Integer.valueOf(C0966R.string.f7885v1);
        Integer valueOf2 = Integer.valueOf(C0966R.dimen.f3723cd);
        C103915c.C67105b.m79374b(bVar, imageView, (Class) null, valueOf, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, valueOf2, 4090, (Object) null);
        View findViewById10 = inflate.findViewById(C0966R.C0970id.ipx);
        C87412m.m108593f(findViewById10, "mRootView.findViewById(R.id.request_apply_wording)");
        TextView textView = (TextView) findViewById10;
        this.f253152p = textView;
        lVar.mo117504j(textView.getPaint());
        View findViewById11 = inflate.findViewById(C0966R.C0970id.iq7);
        C87412m.m108593f(findViewById11, "mRootView.findViewById(R.id.request_recyclerview)");
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) findViewById11;
        this.f253154r = maxHeightRecyclerView;
        C103915c.C67105b.m79374b(bVar, maxHeightRecyclerView, (Class) null, (Integer) null, true, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8182, (Object) null);
        this.f253154r.setLayoutManager(new LinearLayoutManager(context2));
        C87330d0 d0Var = new C87330d0(arrayList);
        this.f253161y = d0Var;
        d0Var.f253100e = this.f253141B;
        this.f253154r.setAdapter(d0Var);
        this.f253154r.setItemAnimator((RecyclerView.C16616j) null);
        View findViewById12 = inflate.findViewById(C0966R.C0970id.iq4);
        C87412m.m108593f(findViewById12, "mRootView.findViewById(R.id.request_loading)");
        this.f253158v = findViewById12;
        View findViewById13 = inflate.findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById13, "mRootView.findViewById(R.id.button_group)");
        this.f253156t = findViewById13;
        View findViewById14 = inflate.findViewById(C0966R.C0970id.f359082iq2);
        C87412m.m108593f(findViewById14, "mRootView.findViewById(R.id.request_function)");
        TextView textView2 = (TextView) findViewById14;
        this.f253155s = textView2;
        C103915c.C67105b.m79374b(bVar, textView2, Button.class, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, valueOf2, 4092, (Object) null);
        if (Build.VERSION.SDK_INT >= 22) {
            this.f253152p.setAccessibilityTraversalAfter(C0966R.C0970id.iq5);
            this.f253152p.setAccessibilityTraversalBefore(C0966R.C0970id.iq8);
            this.f253149j.setAccessibilityTraversalAfter(C0966R.C0970id.ipx);
            this.f253149j.setAccessibilityTraversalBefore(C0966R.C0970id.iq7);
            this.f253155s.setAccessibilityTraversalAfter(C0966R.C0970id.iq7);
            this.f253155s.setAccessibilityTraversalBefore(C0966R.C0970id.ipy);
        }
        this.f253142C = 2;
    }

    /* renamed from: a */
    public static final ArrayList m108451a(C87347g gVar, boolean z) {
        String str;
        String str2;
        gVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(gVar.f253162z)) {
            arrayList.add(gVar.f253162z);
        } else {
            List<C87330d0.C87331a> list = gVar.f253161y.f253099d;
            if (list.size() == 1) {
                C87330d0.C87331a aVar = list.get(0);
                if (!(aVar == null || (str2 = aVar.f253105d) == null)) {
                    arrayList.add(str2);
                }
            } else {
                for (C87330d0.C87331a aVar2 : list) {
                    if ((aVar2 != null && aVar2.f253107f == z) && (str = aVar2.f253105d) != null) {
                        arrayList.add(str);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        C76064q0 q0Var = C76064q0.f222911a;
        Context context = this.f253144e.getContext();
        C87412m.m108593f(context, "contentView.context");
        q0Var.mo106274a(context, this.f253144e, this.f253156t, i, this.f253143d, this.f253157u.mo121761b());
        mo121754c(i);
    }

    /* renamed from: b */
    public void mo36937b() {
        C79630a.m96708a(this.f253144e);
    }

    /* renamed from: c */
    public final void mo121754c(int i) {
        this.f253154r.getViewTreeObserver().addOnGlobalLayoutListener(new C76060c((i == 1 || i == 3) ? 1.5d : 2.5d, this));
        this.f253154r.invalidate();
    }

    /* renamed from: d */
    public final boolean mo121755d() {
        if (!this.f253157u.mo121761b()) {
            return true;
        }
        return this.f253157u.mo121760a();
    }

    public void dismiss() {
        super.dismiss();
    }

    /* renamed from: e */
    public final void mo121757e(int i) {
        this.f253142C = i;
        if (i == 1) {
            View view = this.f253144e;
            Context context = getContext();
            Object obj = C111105a.f332697a;
            view.setBackground(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f4491e3));
        } else if (i == 2) {
            View view2 = this.f253144e;
            Context context2 = getContext();
            Object obj2 = C111105a.f332697a;
            view2.setBackground(C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.f4490e2));
        }
    }

    public View getContentView() {
        return this.f253144e;
    }

    public MotionEvent getLastPointerDownTouchEvent() {
        View view = this.f253144e;
        C87412m.m108592e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.widget.dialog.AppBrandDialogContentView");
        return ((AppBrandDialogContentView) view).getLastPointerDownTouchEvent();
    }

    public int getPosition() {
        return this.f253142C;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        mo121757e(this.f253142C);
        this.f253159w = o0Var;
        Object systemService = getContext().getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            C76064q0 q0Var = C76064q0.f222911a;
            Context context = this.f253144e.getContext();
            C87412m.m108593f(context, "contentView.context");
            q0Var.mo106274a(context, this.f253144e, this.f253156t, windowManager.getDefaultDisplay().getRotation(), this.f253143d, this.f253157u.mo121761b());
            mo121754c(windowManager.getDefaultDisplay().getRotation());
        }
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return false;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return true;
    }

    /* renamed from: n */
    public C91072j mo121450n(C81879g gVar, String str, C40469j0 j0Var) {
        C79774c cVar;
        C87412m.m108594g(gVar, "component");
        AppBrandRuntime runtime = gVar.getRuntime();
        if (runtime == null || (cVar = runtime.mo113054f0()) == null) {
            cVar = gVar.mo114271f0();
            C87412m.m108591d(cVar);
        }
        Context context = getContext();
        C87412m.m108593f(context, "this.context");
        C40469j0 j0Var2 = j0Var;
        String str2 = str;
        C87357i0 i0Var = new C87357i0(j0Var2, str2, context, this.f253144e.getMeasuredHeight(), cVar);
        i0Var.mo121772d(this.f253142C);
        return i0Var;
    }

    /* renamed from: o */
    public void mo121451o(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        mo121757e(this.f253142C);
        ((C87362k) C91070i.C91071a.m114253a(this, gVar)).mo121778b(this);
    }

    public void onCancel() {
        C91566l.C91570c.C91571a.m114908a(this.f253160x, 3, new ArrayList(), 0, false, 12, (Object) null);
    }

    /* renamed from: s */
    public void mo121452s(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        ((C87362k) C91070i.C91071a.m114253a(this, gVar)).mo121777a(this);
    }

    public void setAppBrandName(String str) {
        TextView textView = this.f253146g;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public void setApplyWording(String str) {
        this.f253152p.setText(str);
    }

    public void setExplainOnClickListener(View.OnClickListener onClickListener) {
        this.f253151o.setOnClickListener(onClickListener);
    }

    public void setFunctionButtonOnClickListener(View.OnClickListener onClickListener) {
        this.f253155s.setOnClickListener(onClickListener);
    }

    public void setFunctionButtonText(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f253155s.setText("");
            this.f253155s.setVisibility(4);
            return;
        }
        this.f253155s.setText(str);
        this.f253155s.setVisibility(0);
    }

    public void setFunctionButtonTextColor(int i) {
        this.f253155s.setTextColor(i);
    }

    public void setFunctionButtonVisibility(int i) {
        this.f253155s.setVisibility(i);
    }

    public void setIExternalToolsHelper(C40469j0 j0Var) {
        this.f253157u.f253171j = j0Var;
    }

    public void setIconUrl(String str) {
        String str2 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122786b(this.f253145f, str, C84700v4.m104349a(), C88431k.f255437d);
    }

    public void setItemCheckedListener(C87330d0.C87332b bVar) {
        this.f253141B = bVar;
        this.f253161y.f253100e = bVar;
    }

    public void setNegativeButtonText(String str) {
        if (str != null) {
            this.f253148i.setText(str);
        }
    }

    public void setOnListItemLongClickListener(C87330d0.C87333c cVar) {
        C87412m.m108594g(cVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f253161y.f253101f = cVar;
    }

    public void setPositiveButtonText(String str) {
        if (str != null) {
            this.f253147h.setText(str);
        }
    }

    public void setRequestDesc(String str) {
        this.f253149j.setText(str);
    }

    public void setScope(String str) {
        C87412m.m108594g(str, "scope");
        this.f253162z = str;
    }

    public void setSelectListItem(List<C87330d0.C87331a> list) {
        if (list != null && !list.isEmpty()) {
            ((ArrayList) this.f253140A).clear();
            ((ArrayList) this.f253140A).addAll(list);
            this.f253161y.notifyDataSetChanged();
            this.f253153q.setVisibility(0);
            View view = this.f253158v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeRequestDialog", "setSelectListItem", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void setSimpleDetailDesc(String str) {
        if (str != null) {
            this.f253150n.setVisibility(0);
            this.f253150n.setText(str);
        }
    }

    public void setUserAgreementCheckBoxWording(String str) {
        C87412m.m108594g(str, "wording");
        this.f253157u.setUserAgreementCheckBoxWording(str);
    }

    public void setUserAgreementCheckedAlertListener(C87381r0 r0Var) {
        this.f253157u.f253173o = r0Var;
    }

    /* renamed from: t */
    public void mo121473t(boolean z) {
        this.f253151o.setVisibility(z ? 0 : 8);
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
