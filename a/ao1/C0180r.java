package ao1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: ao1.r */
public final class C0180r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54277t f644d;

    public C0180r(C54277t tVar) {
        this.f644d = tVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C54277t tVar = this.f644d;
        C12925w wVar = new C12925w(tVar.getActivity());
        View inflate = LayoutInflater.from(tVar.getActivity()).inflate(C0966R.C0971layout.d4n, (ViewGroup) null);
        C87412m.m108593f(inflate, "from(activity).inflate(R…tips_dialog_layout, null)");
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.nvb);
        if (textView != null) {
            C85875k4.m106189j0(textView.getPaint(), 0.8f);
        }
        View findViewById = inflate.findViewById(C0966R.C0970id.nva);
        if (findViewById != null) {
            findViewById.setOnClickListener(new C0188w(wVar));
        }
        wVar.mo12471k(inflate);
        wVar.mo5086o();
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/post/PostEditUIC$initShortTitle$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
