package t51;

import android.view.View;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import p51.C110184g;
import p821rk.C48041n;

/* renamed from: t51.o */
public final class C110925o implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331742d;

    public C110925o(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331742d = springLuckyEggActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("MicroMsg.SpringLuckyEggActivity", "clicked bottom title");
        SpringLuckyEggActivity springLuckyEggActivity = this.f331742d;
        int i = SpringLuckyEggActivity.f312420n;
        if (springLuckyEggActivity.mo149514M7().f331791o.getValue() == null) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C48041n value = this.f331742d.mo149514M7().f331793q.getValue();
        C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 10, "", "", "", "", "", C110184g.f329624g, Long.valueOf(value != null ? value.f128876u : 0));
        SpringLuckyEggActivity springLuckyEggActivity2 = this.f331742d;
        SpringLuckyEggActivity.m141268I7(springLuckyEggActivity2, springLuckyEggActivity2.mo149514M7().f331791o.getValue());
        C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
