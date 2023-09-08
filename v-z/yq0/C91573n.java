package yq0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import gt0.C87370k0;
import gt0.C87372l0;
import gt0.C87375o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p225rc.C89923l;

/* renamed from: yq0.n */
public class C91573n implements C87370k0 {

    /* renamed from: d */
    public final Context f262423d;

    /* renamed from: e */
    public View f262424e;

    /* renamed from: f */
    public C87375o0 f262425f;

    /* renamed from: yq0.n$a */
    public static final class C91574a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91573n f262426d;

        public C91574a(C91573n nVar) {
            this.f262426d = nVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/appbrand/permission/jsauth/WMPFVoipCallInScopeAuthNotifyBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f262426d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/plugin/appbrand/permission/jsauth/WMPFVoipCallInScopeAuthNotifyBottomSheet$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: yq0.n$b */
    public static final class C91575b implements C87372l0 {

        /* renamed from: a */
        public final /* synthetic */ C91573n f262427a;

        public C91575b(C91573n nVar) {
            this.f262427a = nVar;
        }

        /* renamed from: a */
        public void mo22185a(C87370k0 k0Var) {
            C87375o0 o0Var = this.f262427a.f262425f;
            if (o0Var != null) {
                o0Var.mo121779c(this);
            }
            this.f262427a.getClass();
        }
    }

    public C91573n(Context context) {
        C87412m.m108594g(context, "context");
        this.f262423d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.cub, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…_tip_bottom_dialog, null)");
        this.f262424e = inflate;
        inflate.findViewById(C0966R.C0970id.hll).setOnClickListener(new C91574a(this));
        ((ImageView) this.f262424e.findViewById(C0966R.C0970id.a8p)).setBackgroundResource(C89923l.f258408a.mo117495a() ? C0966R.raw.appbrand_wmpf_voip_call_in_notify_tip_bottom_dialog_bg_dark : C0966R.raw.appbrand_wmpf_voip_call_in_notify_tip_bottom_dialog_bg_light);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
    }

    /* renamed from: b */
    public void mo36937b() {
    }

    public void cancel() {
        C87375o0 o0Var = this.f262425f;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    public void dismiss() {
        C87375o0 o0Var = this.f262425f;
        if (o0Var != null) {
            o0Var.mo121780d(new C91575b(this));
        }
        C87375o0 o0Var2 = this.f262425f;
        if (o0Var2 != null) {
            o0Var2.mo121777a(this);
        }
    }

    public View getContentView() {
        return this.f262424e;
    }

    public int getPosition() {
        return 2;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        this.f262425f = o0Var;
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
        C87375o0 o0Var = this.f262425f;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
