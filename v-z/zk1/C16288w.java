package zk1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C101218e0;

/* renamed from: zk1.w */
public final class C16288w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43589d;

    public C16288w(C16229h hVar) {
        this.f43589d = hVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C16229h hVar = this.f43589d;
        C101218e0 e0Var = new C101218e0(hVar.getContext(), 0, 0);
        View inflate = LayoutInflater.from(hVar.getContext()).inflate(C0966R.C0971layout.ckv, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ice_ui_dialog_tips, null)");
        View findViewById = inflate.findViewById(C0966R.C0970id.f358425m23);
        WebView webView = (WebView) inflate.findViewById(C0966R.C0970id.c8q);
        C85875k4.m106189j0(((TextView) inflate.findViewById(C0966R.C0970id.f358211m03)).getPaint(), 0.8f);
        webView.loadUrl(hVar.f43467I);
        webView.getLayoutParams().height = C75044y4.m89990b(hVar.getContext()).y / 2;
        findViewById.setOnClickListener(new C16228g0(e0Var));
        e0Var.mo140664k(inflate, 0, 0);
        e0Var.mo140655A();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveNoticeUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
