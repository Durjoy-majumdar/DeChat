package zq0;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
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
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import fy3.C32224a;
import gt0.C76064q0;
import gt0.C87350h;
import gt0.C87370k0;
import gt0.C87374n0;
import gt0.C87375o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import lb0.C88394b;
import lb0.C88431k;
import p225rc.C89923l;
import p385u2.C111105a;
import qo3.C89778c;

/* renamed from: zq0.a */
public class C91841a extends Dialog implements C87370k0, C87374n0 {

    /* renamed from: d */
    public final C79774c f262959d;

    /* renamed from: e */
    public View f262960e;

    /* renamed from: f */
    public C87350h f262961f;

    /* renamed from: g */
    public ImageView f262962g;

    /* renamed from: h */
    public TextView f262963h;

    /* renamed from: i */
    public Button f262964i;

    /* renamed from: j */
    public TextView f262965j;

    /* renamed from: n */
    public TextView f262966n;

    /* renamed from: o */
    public ImageView f262967o;

    /* renamed from: p */
    public TextView f262968p;

    /* renamed from: q */
    public LinearLayout f262969q;

    /* renamed from: r */
    public RecyclerView f262970r;

    /* renamed from: s */
    public TextView f262971s;

    /* renamed from: t */
    public View f262972t;

    /* renamed from: u */
    public View f262973u;

    /* renamed from: v */
    public C87375o0 f262974v;

    /* renamed from: w */
    public C91844c f262975w;

    /* renamed from: x */
    public Drawable f262976x;

    /* renamed from: y */
    public int f262977y = 2;

    /* renamed from: zq0.a$a */
    public static final class C91842a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91841a f262978d;

        public C91842a(C91841a aVar) {
            this.f262978d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91844c cVar = this.f262978d.f262975w;
            if (cVar != null) {
                cVar.mo125673a(2, false);
            }
            C91841a aVar = this.f262978d;
            C87375o0 o0Var = aVar.f262974v;
            if (o0Var != null) {
                o0Var.mo121777a(aVar);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.a$b */
    public static final class C91843b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91841a f262979d;

        public C91843b(C91841a aVar) {
            this.f262979d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C91841a aVar = this.f262979d;
            if (!(!aVar.f262961f.mo121761b() ? true : aVar.f262961f.mo121760a())) {
                if (this.f262979d.f262961f.mo121761b() && !this.f262979d.f262961f.mo121760a()) {
                    ((ScrollView) this.f262979d.f262960e.findViewById(C0966R.C0970id.j48)).fullScroll(130);
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C91841a aVar2 = this.f262979d;
            C91844c cVar = aVar2.f262975w;
            if (cVar != null) {
                cVar.mo125673a(1, aVar2.f262961f.mo121760a());
            }
            C91841a aVar3 = this.f262979d;
            C87375o0 o0Var = aVar3.f262974v;
            if (o0Var != null) {
                o0Var.mo121777a(aVar3);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/phonenumber/BasePhoneNumberManageDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zq0.a$c */
    public interface C91844c {
        /* renamed from: a */
        void mo125673a(int i, boolean z);
    }

    /* renamed from: zq0.a$d */
    public static final class C91845d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91841a f262980d;

        public C91845d(C91841a aVar) {
            this.f262980d = aVar;
        }

        public final void run() {
            this.f262980d.dismiss();
        }
    }

    /* renamed from: zq0.a$e */
    public static final class C91846e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C91841a f262981d;

        public C91846e(C91841a aVar) {
            this.f262981d = aVar;
        }

        public final void run() {
            C89778c.m112244b(this.f262981d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91841a(Context context, C79774c cVar) {
        super(context);
        Context context2 = context;
        C79774c cVar2 = cVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(cVar2, "windowAndroid");
        this.f262959d = cVar2;
        View inflate = View.inflate(context2, C0966R.C0971layout.f6463fj, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…and_request_dialog, null)");
        this.f262960e = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.l1t);
        C87412m.m108593f(findViewById, "mRootView.findViewById(R.id.user_agreement_layout)");
        this.f262961f = new C87350h(context2, findViewById);
        View findViewById2 = this.f262960e.findViewById(C0966R.C0970id.f359083iq3);
        C87412m.m108593f(findViewById2, "mRootView.findViewById(R.id.request_icon)");
        this.f262962g = (ImageView) findViewById2;
        View findViewById3 = this.f262960e.findViewById(C0966R.C0970id.iq5);
        C87412m.m108593f(findViewById3, "mRootView.findViewById(R.id.request_name)");
        this.f262963h = (TextView) findViewById3;
        View findViewById4 = this.f262960e.findViewById(C0966R.C0970id.ipy);
        C87412m.m108593f(findViewById4, "mRootView.findViewById(R.id.request_cancel)");
        ((Button) findViewById4).setOnClickListener(new C91842a(this));
        View findViewById5 = this.f262960e.findViewById(C0966R.C0970id.iq6);
        C87412m.m108593f(findViewById5, "mRootView.findViewById(R.id.request_ok)");
        Button button = (Button) findViewById5;
        this.f262964i = button;
        C89923l lVar = C89923l.f258408a;
        lVar.mo117504j(button.getPaint());
        this.f262964i.setOnClickListener(new C91843b(this));
        View findViewById6 = this.f262960e.findViewById(C0966R.C0970id.f359081iq1);
        C87412m.m108593f(findViewById6, "mRootView.findViewById(R.id.request_desc)");
        this.f262965j = (TextView) findViewById6;
        View findViewById7 = this.f262960e.findViewById(C0966R.C0970id.jlj);
        C87412m.m108593f(findViewById7, "mRootView.findViewById(R.id.simple_detail_desc)");
        this.f262966n = (TextView) findViewById7;
        View findViewById8 = this.f262960e.findViewById(C0966R.C0970id.f359080iq0);
        C87412m.m108593f(findViewById8, "mRootView.findViewById(R.id.request_content)");
        this.f262969q = (LinearLayout) findViewById8;
        View findViewById9 = this.f262960e.findViewById(C0966R.C0970id.iq8);
        C87412m.m108593f(findViewById9, "mRootView.findViewById(R.id.request_right_icon)");
        ImageView imageView = (ImageView) findViewById9;
        this.f262967o = imageView;
        C103915c.C67105b bVar = C103915c.f307262l;
        Integer valueOf = Integer.valueOf(C0966R.dimen.f3723cd);
        C103915c.C67105b.m79374b(bVar, imageView, (Class) null, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, valueOf, 4094, (Object) null);
        View findViewById10 = this.f262960e.findViewById(C0966R.C0970id.ipx);
        C87412m.m108593f(findViewById10, "mRootView.findViewById(R.id.request_apply_wording)");
        TextView textView = (TextView) findViewById10;
        this.f262968p = textView;
        lVar.mo117504j(textView.getPaint());
        View findViewById11 = this.f262960e.findViewById(C0966R.C0970id.iq7);
        C87412m.m108593f(findViewById11, "mRootView.findViewById(R.id.request_recyclerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById11;
        this.f262970r = recyclerView;
        C103915c.C67105b bVar2 = bVar;
        C103915c.C67105b.m79374b(bVar2, recyclerView, (Class) null, (Integer) null, true, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 8182, (Object) null);
        this.f262970r.setLayoutManager(new LinearLayoutManager(context2));
        this.f262970r.setItemAnimator((RecyclerView.C16616j) null);
        View findViewById12 = this.f262960e.findViewById(C0966R.C0970id.iq4);
        C87412m.m108593f(findViewById12, "mRootView.findViewById(R.id.request_loading)");
        this.f262973u = findViewById12;
        View findViewById13 = this.f262960e.findViewById(C0966R.C0970id.aoi);
        C87412m.m108593f(findViewById13, "mRootView.findViewById(R.id.button_group)");
        this.f262972t = findViewById13;
        View findViewById14 = this.f262960e.findViewById(C0966R.C0970id.f359082iq2);
        C87412m.m108593f(findViewById14, "mRootView.findViewById(R.id.request_function)");
        TextView textView2 = (TextView) findViewById14;
        this.f262971s = textView2;
        C103915c.C67105b.m79374b(bVar2, textView2, Button.class, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, valueOf, 4092, (Object) null);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        C76064q0 q0Var = C76064q0.f222911a;
        Context context = this.f262960e.getContext();
        C87412m.m108593f(context, "mRootView.context");
        q0Var.mo106274a(context, this.f262960e, this.f262972t, i, this.f262959d, this.f262961f.mo121761b());
    }

    /* renamed from: a */
    public final void mo125667a(int i) {
        this.f262977y = i;
        if (i == 1) {
            View view = this.f262960e;
            Context context = getContext();
            Object obj = C111105a.f332697a;
            view.setBackground(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f4491e3));
        } else if (i == 2) {
            View view2 = this.f262960e;
            Context context2 = getContext();
            Object obj2 = C111105a.f332697a;
            view2.setBackground(C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.f4490e2));
        }
    }

    /* renamed from: b */
    public void mo36937b() {
        C79630a.m96708a(this.f262960e);
    }

    public void dismiss() {
        if (!C87412m.m108589b(Looper.getMainLooper(), Looper.myLooper())) {
            new MMHandler(Looper.getMainLooper()).post(new C91845d(this));
            return;
        }
        try {
            super.dismiss();
        } finally {
            ((C91877h0) this).onCancel();
            new MMHandler(Looper.getMainLooper()).post(new C91846e(this));
        }
    }

    public View getContentView() {
        return this.f262960e;
    }

    public int getPosition() {
        return this.f262977y;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        this.f262974v = o0Var;
        Object systemService = getContext().getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            C76064q0 q0Var = C76064q0.f222911a;
            Context context = this.f262960e.getContext();
            C87412m.m108593f(context, "mRootView.context");
            q0Var.mo106274a(context, this.f262960e, this.f262972t, windowManager.getDefaultDisplay().getRotation(), this.f262959d, this.f262961f.mo121761b());
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
        C91844c cVar = this.f262975w;
        if (cVar != null) {
            cVar.mo125673a(3, false);
        }
    }

    public final void setAppBrandName(String str) {
        TextView textView = this.f262963h;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public void setIExternalToolsHelper(C40469j0 j0Var) {
        this.f262961f.f253171j = j0Var;
    }

    public final void setIconUrl(String str) {
        String str2 = C88394b.f255384g;
        C88394b.C88418q.f255427a.mo122785a(this.f262962g, str, C0966R.C0969drawable.c8n, C88431k.f255437d);
    }

    public void setUserAgreementCheckBoxWording(String str) {
        C87412m.m108594g(str, "wording");
        this.f262961f.setUserAgreementCheckBoxWording(str);
    }
}
