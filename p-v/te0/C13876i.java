package te0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import qo3.C12925w;

/* renamed from: te0.i */
public final class C13876i implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f39041d;

    public C13876i(ViewGroup viewGroup) {
        this.f39041d = viewGroup;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C48639m mVar = C48639m.f130178a;
        Context context = this.f39041d.getContext();
        C87412m.m108593f(context, "root.context");
        mVar.getClass();
        C12925w wVar = new C12925w(context);
        wVar.mo12470j(C0966R.C0971layout.cr6);
        ((WeImageView) wVar.f36927f.findViewById(C0966R.C0970id.f357484a32)).setOnClickListener(new C13877l(wVar));
        wVar.mo5086o();
        C117292a.m165361g(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuLocReqDialog$initDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
