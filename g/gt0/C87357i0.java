package gt0;

import android.content.Context;
import android.graphics.Color;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import at0.C103915c;
import at0.C79630a;
import br0.C79774c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C40469j0;
import com.tencent.p014mm.plugin.appbrand.utils.html.C84746b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import fy3.C32224a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p385u2.C111105a;
import p849e3.C107166a;
import p849e3.C107207u;
import wq0.C91070i;
import wq0.C91072j;

/* renamed from: gt0.i0 */
public final class C87357i0 implements C87370k0, C91072j {

    /* renamed from: d */
    public final C40469j0 f253183d;

    /* renamed from: e */
    public final Context f253184e;

    /* renamed from: f */
    public final C79774c f253185f;

    /* renamed from: g */
    public C87375o0 f253186g;

    /* renamed from: h */
    public final int f253187h;

    /* renamed from: i */
    public int f253188i;

    /* renamed from: j */
    public int f253189j;

    /* renamed from: n */
    public final View f253190n;

    /* renamed from: o */
    public final View f253191o;

    /* renamed from: gt0.i0$a */
    public static final class C87358a implements View.OnLayoutChangeListener {

        /* renamed from: d */
        public final /* synthetic */ C87357i0 f253192d;

        /* renamed from: gt0.i0$a$a */
        public static final class C87359a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C87357i0 f253193d;

            public C87359a(C87357i0 i0Var) {
                this.f253193d = i0Var;
            }

            public final void run() {
                this.f253193d.f253190n.getLayoutParams().height = this.f253193d.f253188i;
            }
        }

        public C87358a(C87357i0 i0Var) {
            this.f253192d = i0Var;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int abs = Math.abs(i4 - i2);
            C87357i0 i0Var = this.f253192d;
            int i9 = i0Var.f253188i;
            if (abs > i9 && i9 >= i0Var.f253187h) {
                i0Var.f253190n.post(new C87359a(i0Var));
            }
        }
    }

    /* renamed from: gt0.i0$b */
    public static final class C87360b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C87357i0 f253194d;

        public C87360b(C87357i0 i0Var) {
            this.f253194d = i0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/widget/dialog/DialogExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C87357i0 i0Var = this.f253194d;
            C87375o0 o0Var = i0Var.f253186g;
            if (o0Var != null) {
                o0Var.mo121777a(i0Var);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/widget/dialog/DialogExplainDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: gt0.i0$c */
    public static final class C87361c implements C84746b.C40567a {

        /* renamed from: a */
        public final /* synthetic */ C87357i0 f253195a;

        public C87361c(C87357i0 i0Var) {
            this.f253195a = i0Var;
        }

        /* renamed from: a */
        public final void mo63415a(String str) {
            C87357i0 i0Var = this.f253195a;
            C40469j0 j0Var = i0Var.f253183d;
            if (j0Var != null) {
                j0Var.mo56167JF(i0Var.f253184e, str, "", (C40469j0.C40470a) null);
            }
        }
    }

    public C87357i0(C40469j0 j0Var, String str, Context context, int i, C79774c cVar) {
        C40469j0 j0Var2 = j0Var;
        Context context2 = context;
        C79774c cVar2 = cVar;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(cVar2, "windowAndroid");
        this.f253183d = j0Var2;
        this.f253184e = context2;
        this.f253185f = cVar2;
        int a = C74942w4.m89784a(context2, v2helper.VOIP_ENC_HEIGHT_LV1);
        int i2 = i;
        a = a < i2 ? i2 : a;
        this.f253187h = a;
        this.f253188i = mo121770c();
        if (j0Var2 == null) {
            Log.m105928w("Luggage.FULL.DialogExplainDialog", "<init> get NULL webviewOpener");
        }
        this.f253189j = 2;
        C107166a aVar = null;
        View inflate = View.inflate(context2, C0966R.C0971layout.f6432ep, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…ber_explain_dialog, null)");
        this.f253191o = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.hv8);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…e_number_explain_content)");
        this.f253190n = findViewById;
        findViewById.setMinimumHeight(a);
        findViewById.addOnLayoutChangeListener(new C87358a(this));
        View findViewById2 = inflate.findViewById(C0966R.C0970id.hv9);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…mber_explain_dialog_back)");
        ImageView imageView = (ImageView) findViewById2;
        C103915c.C67105b.m79374b(C103915c.f307262l, imageView, (Class) null, (Integer) null, false, (Boolean) null, (Boolean) null, (Integer) null, (C32224a) null, 17, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(C0966R.dimen.f3723cd), 3838, (Object) null);
        imageView.setOnClickListener(new C87360b(this));
        View findViewById3 = inflate.findViewById(C0966R.C0970id.hva);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…ber_explain_dialog_title)");
        ((TextView) findViewById3).setText(inflate.getContext().getText(C0966R.string.a7l));
        View findViewById4 = inflate.findViewById(C0966R.C0970id.hv_);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…r_explain_dialog_content)");
        TextView textView = (TextView) findViewById4;
        textView.setText(C84746b.m104407a(str, false, new C87361c(this)));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(Color.parseColor("#FF576B95"));
        View.AccessibilityDelegate c = C107207u.m145162c(textView);
        aVar = c != null ? c instanceof C107166a.C107167a ? ((C107166a.C107167a) c).f320754a : new C107166a(c) : aVar;
        C107207u.m145168i(textView, aVar == null ? new C107166a() : aVar);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        mo121769a();
        this.f253188i = mo121770c();
    }

    /* renamed from: a */
    public final void mo121769a() {
        Object systemService = this.f253184e.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            C76064q0 q0Var = C76064q0.f222911a;
            Context context = this.f253191o.getContext();
            C87412m.m108593f(context, "contentView.context");
            q0Var.mo106274a(context, this.f253191o, (View) null, windowManager.getDefaultDisplay().getRotation(), this.f253185f, false);
        }
    }

    /* renamed from: b */
    public void mo36937b() {
        C79630a.m96708a(this.f253191o);
    }

    /* renamed from: c */
    public final int mo121770c() {
        int i = (int) (((float) this.f253184e.getResources().getDisplayMetrics().heightPixels) * (2 == this.f253184e.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        Log.m105924i("Luggage.FULL.DialogExplainDialog", "calculateMaxHeight, maxHeight: " + i);
        return i;
    }

    public void cancel() {
    }

    /* renamed from: d */
    public final void mo121772d(int i) {
        this.f253189j = i;
        if (i == 1) {
            View view = this.f253191o;
            Context context = this.f253184e;
            Object obj = C111105a.f332697a;
            view.setBackground(C111105a.C111110c.m151511b(context, C0966R.C0969drawable.f4491e3));
        } else if (i == 2) {
            View view2 = this.f253191o;
            Context context2 = this.f253184e;
            Object obj2 = C111105a.f332697a;
            view2.setBackground(C111105a.C111110c.m151511b(context2, C0966R.C0969drawable.f4490e2));
        }
    }

    public void dismiss() {
        C87375o0 o0Var = this.f253186g;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    public View getContentView() {
        return this.f253191o;
    }

    public int getPosition() {
        return this.f253189j;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        this.f253186g = o0Var;
        mo121769a();
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return true;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return true;
    }

    /* renamed from: o */
    public void mo121451o(C81879g gVar) {
        C87412m.m108594g(gVar, "component");
        mo121772d(this.f253189j);
        ((C87362k) C91070i.C91071a.m114253a(this, gVar)).mo121778b(this);
    }

    public void onCancel() {
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
