package t51;

import android.view.View;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import j20.C117292a;
import java.util.ArrayList;
import p51.C110184g;
import p821rk.C48041n;

/* renamed from: t51.n */
public final class C110924n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331741d;

    public C110924n(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331741d = springLuckyEggActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SpringLuckyEggActivity springLuckyEggActivity = this.f331741d;
        int i = SpringLuckyEggActivity.f312420n;
        C48041n value = springLuckyEggActivity.mo149514M7().f331793q.getValue();
        C115669n.INSTANCE.mo160131h(18916, C110184g.f329622e, "", 22, "", "", "", "", "", C110184g.f329624g, Long.valueOf(value != null ? value.f128876u : 0));
        SpringLuckyEggActivity springLuckyEggActivity2 = this.f331741d;
        SpringLuckyEggActivity.m141268I7(springLuckyEggActivity2, springLuckyEggActivity2.mo149514M7().f331792p.getValue());
        C117292a.m165361g(this, "com/tencent/mm/plugin/eggspring/ui/SpringLuckyEggActivity$setupViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
