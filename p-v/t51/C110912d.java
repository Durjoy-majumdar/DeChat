package t51;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import gy3.C87412m;

/* renamed from: t51.d */
public final class C110912d<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331724d;

    public C110912d(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331724d = springLuckyEggActivity;
    }

    public final void onChanged(T t) {
        int J7 = SpringLuckyEggActivity.m141269J7(this.f331724d, (String) t, C0966R.color.ae8);
        C110928q qVar = this.f331724d.f312423f;
        if (qVar != null) {
            qVar.f331745a.setBackgroundColor(J7);
            this.f331724d.setActionbarColor(J7);
            this.f331724d.getWindow().setStatusBarColor(0);
            this.f331724d.getWindow().setNavigationBarColor(0);
            return;
        }
        C87412m.m108603p("viewBinding");
        throw null;
    }
}
