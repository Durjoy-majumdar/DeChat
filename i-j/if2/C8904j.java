package if2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: if2.j */
public final class C8904j implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C8894g f28186d;

    public C8904j(C8894g gVar) {
        this.f28186d = gVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C8894g gVar = this.f28186d;
        if (gVar.f28167f == 1) {
            gVar.f28167f = 2;
            gVar.mo9713d3().setText(this.f28186d.getResources().getString(C0966R.string.f8014z_));
        } else {
            gVar.f28167f = 1;
            gVar.mo9713d3().setText(this.f28186d.getResources().getString(C0966R.string.g1z));
        }
        Log.m105924i("NewBizInfoAuthScopeUIC", "btn state switched =  " + this.f28186d.mo9713d3().getText());
        RecyclerView.C16613e adapter = this.f28186d.mo9712c3().getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoAuthScopeUIC$initManageBtnClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
