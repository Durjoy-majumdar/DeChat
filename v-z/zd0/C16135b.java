package zd0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import be0.C0265d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.msgsubscription.p017ui.AppBrandAuthorizeSubscribeMsgDetailUI;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: zd0.b */
public class C16135b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeSubscribeMsgDetailUI f43324d;

    /* renamed from: zd0.b$a */
    public class C16136a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C101218e0 f43325d;

        public C16136a(C16135b bVar, C101218e0 e0Var) {
            this.f43325d = e0Var;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f43325d.mo140680z();
            C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C16135b(AppBrandAuthorizeSubscribeMsgDetailUI appBrandAuthorizeSubscribeMsgDetailUI) {
        this.f43324d = appBrandAuthorizeSubscribeMsgDetailUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        View inflate = LayoutInflater.from(this.f43324d).inflate(C0966R.C0971layout.bzd, (ViewGroup) null);
        C0265d dVar = C0265d.f821a;
        AppBrandAuthorizeSubscribeMsgDetailUI appBrandAuthorizeSubscribeMsgDetailUI = this.f43324d;
        ((LinearLayout) inflate.findViewById(C0966R.C0970id.f357785br0)).addView(dVar.mo309a(appBrandAuthorizeSubscribeMsgDetailUI, appBrandAuthorizeSubscribeMsgDetailUI.f344106e.f49024i, 0));
        View findViewById = inflate.findViewById(C0966R.C0970id.f357722bf2);
        ((TextView) inflate.findViewById(C0966R.C0970id.j0l)).setText(this.f43324d.f344106e.f49020e);
        C101218e0 e0Var = new C101218e0(this.f43324d);
        e0Var.mo140664k(inflate, 0, 0);
        e0Var.mo140655A();
        findViewById.setOnClickListener(new C16136a(this, e0Var));
        findViewById.setContentDescription(this.f43324d.getResources().getString(C0966R.string.f7933wn));
        C117292a.m165361g(this, "com/tencent/mm/msgsubscription/ui/AppBrandAuthorizeSubscribeMsgDetailUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
