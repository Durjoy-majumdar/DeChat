package zd0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import gt0.C87370k0;
import gt0.C87372l0;
import gt0.C87375o0;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import p225rc.C89923l;
import zd0.C16137i;

/* renamed from: zd0.l */
public class C91663l implements C87370k0 {

    /* renamed from: d */
    public final Context f262640d;

    /* renamed from: e */
    public View f262641e;

    /* renamed from: f */
    public C87375o0 f262642f;

    /* renamed from: g */
    public C91665b f262643g;

    /* renamed from: zd0.l$a */
    public static final class C91664a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C91663l f262644d;

        public C91664a(C91663l lVar) {
            this.f262644d = lVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/SubscribeMsgForceNotifyGuideBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f262644d.dismiss();
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgForceNotifyGuideBottomDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: zd0.l$b */
    public interface C91665b {
        void onDismiss();
    }

    /* renamed from: zd0.l$c */
    public static final class C91666c implements C87372l0 {

        /* renamed from: a */
        public final /* synthetic */ C91663l f262645a;

        public C91666c(C91663l lVar) {
            this.f262645a = lVar;
        }

        /* renamed from: a */
        public void mo22185a(C87370k0 k0Var) {
            C87375o0 o0Var = this.f262645a.f262642f;
            if (o0Var != null) {
                o0Var.mo121779c(this);
            }
            C91665b bVar = this.f262645a.f262643g;
            if (bVar != null) {
                bVar.onDismiss();
            }
        }
    }

    public C91663l(Context context) {
        C87412m.m108594g(context, "context");
        this.f262640d = context;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.c7m, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…force_notify_guide, null)");
        this.f262641e = inflate;
        inflate.findViewById(C0966R.C0970id.hll).setOnClickListener(new C91664a(this));
        ((ImageView) this.f262641e.findViewById(C0966R.C0970id.a8p)).setBackgroundResource(C89923l.f258408a.mo117495a() ? C0966R.C0969drawable.ccs : C0966R.C0969drawable.cct);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
        C16137i.f43326a.mo14714a(i, this.f262641e);
    }

    /* renamed from: b */
    public void mo36937b() {
    }

    public void cancel() {
        C87375o0 o0Var = this.f262642f;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    public void dismiss() {
        C87375o0 o0Var = this.f262642f;
        if (o0Var != null) {
            o0Var.mo121780d(new C91666c(this));
        }
        C87375o0 o0Var2 = this.f262642f;
        if (o0Var2 != null) {
            o0Var2.mo121777a(this);
        }
    }

    public View getContentView() {
        return this.f262641e;
    }

    public int getPosition() {
        return 2;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        this.f262642f = o0Var;
        C16137i.C16138a aVar = C16137i.f43326a;
        Object systemService = this.f262640d.getSystemService("window");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        aVar.mo14714a(((WindowManager) systemService).getDefaultDisplay().getRotation(), this.f262641e);
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
        C87375o0 o0Var = this.f262642f;
        if (o0Var != null) {
            o0Var.mo121777a(this);
        }
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }
}
