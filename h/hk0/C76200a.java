package hk0;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.p026ui.MaxHeightRecyclerView;
import com.tencent.p014mm.plugin.appbrand.phonenumber.PhoneItem;
import com.tencent.p014mm.sdk.platformtools.Util;
import cr0.C86127t;
import fy3.C32224a;
import fy3.C32226l;
import gt0.C76064q0;
import gt0.C87370k0;
import gt0.C87375o0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import js0.C88024r;
import rx3.C13598b0;
import zq0.C79426u;

/* renamed from: hk0.a */
public final class C76200a extends Dialog implements C87370k0 {

    /* renamed from: A */
    public ArrayList<PhoneItem> f223234A = new ArrayList<>();

    /* renamed from: B */
    public C32224a<C13598b0> f223235B;

    /* renamed from: C */
    public C32224a<C13598b0> f223236C;

    /* renamed from: D */
    public C32224a<C13598b0> f223237D;

    /* renamed from: E */
    public C32226l<? super Boolean, C13598b0> f223238E;

    /* renamed from: F */
    public C32224a<C13598b0> f223239F;

    /* renamed from: G */
    public C32224a<C13598b0> f223240G;

    /* renamed from: H */
    public C32224a<C13598b0> f223241H;

    /* renamed from: I */
    public C32224a<C13598b0> f223242I;

    /* renamed from: d */
    public View f223243d;

    /* renamed from: e */
    public ImageView f223244e;

    /* renamed from: f */
    public TextView f223245f;

    /* renamed from: g */
    public TextView f223246g;

    /* renamed from: h */
    public ImageView f223247h;

    /* renamed from: i */
    public ViewGroup f223248i;

    /* renamed from: j */
    public TextView f223249j;

    /* renamed from: n */
    public TextView f223250n;

    /* renamed from: o */
    public ViewGroup f223251o;

    /* renamed from: p */
    public TextView f223252p;

    /* renamed from: q */
    public MaxHeightRecyclerView f223253q;

    /* renamed from: r */
    public TextView f223254r;

    /* renamed from: s */
    public ViewGroup f223255s;

    /* renamed from: t */
    public CheckBox f223256t;

    /* renamed from: u */
    public TextView f223257u;

    /* renamed from: v */
    public View f223258v;

    /* renamed from: w */
    public Button f223259w;

    /* renamed from: x */
    public Button f223260x;

    /* renamed from: y */
    public C79426u f223261y;

    /* renamed from: z */
    public final C86127t f223262z;

    /* renamed from: hk0.a$a */
    public static final class C76201a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76200a f223263d;

        public C76201a(C76200a aVar) {
            this.f223263d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223263d.f223240G.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hk0.a$b */
    public static final class C76202b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76200a f223264d;

        public C76202b(C76200a aVar) {
            this.f223264d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f223264d.f223234A.size() == 1) {
                this.f223264d.f223241H.invoke();
            } else {
                this.f223264d.f223242I.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hk0.a$c */
    public static final class C76203c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76200a f223265d;

        public C76203c(C76200a aVar) {
            this.f223265d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223265d.f223235B.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hk0.a$d */
    public static final class C76204d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ C76200a f223266a;

        public C76204d(C76200a aVar) {
            this.f223266a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f223266a.f223238E.invoke(Boolean.valueOf(z));
            this.f223266a.f223259w.setEnabled(z);
        }
    }

    /* renamed from: hk0.a$e */
    public static final class C76205e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C76200a f223267d;

        public C76205e(C76200a aVar) {
            this.f223267d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f223267d.f223236C.invoke();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/jsapi/autofill/realname_auth/AppBrandRealnameAuthDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: hk0.a$f */
    public static final class C76206f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76206f f223268d = new C76206f();

        public C76206f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$g */
    public static final class C76207g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76207g f223269d = new C76207g();

        public C76207g() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$h */
    public static final class C76208h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76208h f223270d = new C76208h();

        public C76208h() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$i */
    public static final class C76209i extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public static final C76209i f223271d = new C76209i();

        public C76209i() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$j */
    public static final class C76210j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76210j f223272d = new C76210j();

        public C76210j() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$k */
    public static final class C76211k extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76211k f223273d = new C76211k();

        public C76211k() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$l */
    public static final class C76212l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76212l f223274d = new C76212l();

        public C76212l() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$m */
    public static final class C76213m extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C76213m f223275d = new C76213m();

        public C76213m() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hk0.a$n */
    public static final class C76214n implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C76200a f223276d;

        public C76214n(C76200a aVar) {
            this.f223276d = aVar;
        }

        public final void run() {
            C76200a aVar = this.f223276d;
            Context context = aVar.getContext();
            C87412m.m108593f(context, "context");
            aVar.f223261y = new C79426u("", context, this.f223276d.f223234A);
            C76200a aVar2 = this.f223276d;
            aVar2.f223253q.setAdapter(aVar2.f223261y);
            if (this.f223276d.f223234A.size() == 0) {
                this.f223276d.f223251o.setVisibility(8);
            } else if (this.f223276d.f223234A.size() == 1) {
                this.f223276d.f223251o.setVisibility(0);
                RecyclerView.C16613e adapter = this.f223276d.f223253q.getAdapter();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                }
                C76200a aVar3 = this.f223276d;
                aVar3.f223254r.setText(aVar3.getContext().getString(C0966R.string.a85));
            } else {
                this.f223276d.f223251o.setVisibility(0);
                RecyclerView.C16613e adapter2 = this.f223276d.f223253q.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
                C76200a aVar4 = this.f223276d;
                aVar4.f223254r.setText(aVar4.getContext().getString(C0966R.string.f360122a83));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76200a(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = View.inflate(context, C0966R.C0971layout.f6448f5, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…uth_request_dialog, null)");
        this.f223243d = inflate;
        C86127t tVar = new C86127t();
        tVar.mo120546A(context);
        this.f223262z = tVar;
        View findViewById = this.f223243d.findViewById(C0966R.C0970id.f359083iq3);
        C87412m.m108593f(findViewById, "mRootView.findViewById(R.id.request_icon)");
        this.f223244e = (ImageView) findViewById;
        View findViewById2 = this.f223243d.findViewById(C0966R.C0970id.iq5);
        C87412m.m108593f(findViewById2, "mRootView.findViewById(R.id.request_name)");
        this.f223245f = (TextView) findViewById2;
        View findViewById3 = this.f223243d.findViewById(C0966R.C0970id.ipx);
        C87412m.m108593f(findViewById3, "mRootView.findViewById(R.id.request_apply_wording)");
        this.f223246g = (TextView) findViewById3;
        View findViewById4 = this.f223243d.findViewById(C0966R.C0970id.iq8);
        C87412m.m108593f(findViewById4, "mRootView.findViewById(R.id.request_right_icon)");
        ImageView imageView = (ImageView) findViewById4;
        this.f223247h = imageView;
        imageView.setOnClickListener(new C76201a(this));
        View findViewById5 = this.f223243d.findViewById(C0966R.C0970id.f2v);
        C87412m.m108593f(findViewById5, "mRootView.findViewById(R…d.id_card_info_container)");
        this.f223248i = (ViewGroup) findViewById5;
        View findViewById6 = this.f223243d.findViewById(C0966R.C0970id.f2x);
        C87412m.m108593f(findViewById6, "mRootView.findViewById(R…d_card_info_request_desc)");
        this.f223249j = (TextView) findViewById6;
        View findViewById7 = this.f223243d.findViewById(C0966R.C0970id.f2w);
        C87412m.m108593f(findViewById7, "mRootView.findViewById(R…id_card_info_detail_desc)");
        this.f223250n = (TextView) findViewById7;
        View findViewById8 = this.f223243d.findViewById(C0966R.C0970id.huz);
        C87412m.m108593f(findViewById8, "mRootView.findViewById(R…phone_num_info_container)");
        this.f223251o = (ViewGroup) findViewById8;
        View findViewById9 = this.f223243d.findViewById(C0966R.C0970id.f358919hv0);
        C87412m.m108593f(findViewById9, "mRootView.findViewById(R…ne_num_info_request_desc)");
        this.f223252p = (TextView) findViewById9;
        View findViewById10 = this.f223243d.findViewById(C0966R.C0970id.iq7);
        C87412m.m108593f(findViewById10, "mRootView.findViewById(R.id.request_recyclerview)");
        MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) findViewById10;
        this.f223253q = maxHeightRecyclerView;
        maxHeightRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        this.f223253q.setItemAnimator((RecyclerView.C16616j) null);
        View findViewById11 = this.f223243d.findViewById(C0966R.C0970id.f359082iq2);
        C87412m.m108593f(findViewById11, "mRootView.findViewById(R.id.request_function)");
        TextView textView = (TextView) findViewById11;
        this.f223254r = textView;
        textView.setOnClickListener(new C76202b(this));
        View findViewById12 = this.f223243d.findViewById(C0966R.C0970id.i8e);
        C87412m.m108593f(findViewById12, "mRootView.findViewById(R.id.protocal_container)");
        this.f223255s = (ViewGroup) findViewById12;
        View findViewById13 = this.f223243d.findViewById(C0966R.C0970id.f358434f32);
        C87412m.m108593f(findViewById13, "mRootView.findViewById(R.id.idcard_checkbox)");
        this.f223256t = (CheckBox) findViewById13;
        View findViewById14 = this.f223243d.findViewById(C0966R.C0970id.jka);
        C87412m.m108593f(findViewById14, "mRootView.findViewById(R.id.show_protocal)");
        this.f223257u = (TextView) findViewById14;
        View findViewById15 = this.f223243d.findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById15, "mRootView.findViewById(R.id.button_group)");
        this.f223258v = findViewById15;
        View findViewById16 = this.f223243d.findViewById(C0966R.C0970id.ipy);
        C87412m.m108593f(findViewById16, "mRootView.findViewById(R.id.request_cancel)");
        this.f223260x = (Button) findViewById16;
        View findViewById17 = this.f223243d.findViewById(C0966R.C0970id.iq6);
        C87412m.m108593f(findViewById17, "mRootView.findViewById(R.id.request_ok)");
        Button button = (Button) findViewById17;
        this.f223259w = button;
        button.setOnClickListener(new C76203c(this));
        this.f223256t.setOnCheckedChangeListener(new C76204d(this));
        this.f223260x.setOnClickListener(new C76205e(this));
        this.f223235B = C76206f.f223268d;
        this.f223236C = C76213m.f223275d;
        this.f223237D = C76208h.f223270d;
        this.f223238E = C76209i.f223271d;
        this.f223239F = C76212l.f223274d;
        this.f223240G = C76210j.f223272d;
        this.f223241H = C76207g.f223269d;
        this.f223242I = C76211k.f223273d;
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        C76064q0 q0Var = C76064q0.f222911a;
        Context context = getContext();
        C87412m.m108593f(context, "context");
        q0Var.mo106274a(context, this.f223243d, this.f223258v, i, this.f223262z, false);
        mo106464a(i);
    }

    /* renamed from: a */
    public final void mo106464a(int i) {
        this.f223253q.setMaxHeight((int) (((double) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f4148u3)) * ((i == 1 || i == 3) ? 1.5d : 2.5d)));
    }

    /* renamed from: b */
    public void mo36937b() {
    }

    /* renamed from: c */
    public final void mo106465c(String str) {
        if (Util.isNullOrNil(str)) {
            this.f223248i.setVisibility(8);
            this.f223255s.setVisibility(8);
            return;
        }
        this.f223248i.setVisibility(0);
        this.f223250n.setText(str);
        this.f223255s.setVisibility(0);
    }

    /* renamed from: d */
    public final void mo106466d(ArrayList<PhoneItem> arrayList) {
        C87412m.m108594g(arrayList, "value");
        this.f223234A.clear();
        this.f223234A.addAll(arrayList);
        C88024r.m109572b(new C76214n(this));
    }

    public void dismiss() {
        super.dismiss();
        onCancel();
    }

    public View getContentView() {
        return this.f223243d;
    }

    public int getPosition() {
        return 2;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        Object systemService = getContext().getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            C76064q0 q0Var = C76064q0.f222911a;
            Context context = getContext();
            C87412m.m108593f(context, "context");
            q0Var.mo106274a(context, this.f223243d, this.f223258v, windowManager.getDefaultDisplay().getRotation(), this.f223262z, false);
            mo106464a(windowManager.getDefaultDisplay().getRotation());
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

    public void onCancel() {
        this.f223237D.invoke();
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
