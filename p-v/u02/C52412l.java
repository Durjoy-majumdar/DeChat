package u02;

import android.view.View;
import com.tencent.p014mm.plugin.honey_pay.p063ui.HoneyPayMainUI;
import j20.C117292a;
import java.util.ArrayList;
import te3.C50826pg2;

/* renamed from: u02.l */
public class C52412l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C50826pg2 f146493d;

    /* renamed from: e */
    public final /* synthetic */ HoneyPayMainUI f146494e;

    public C52412l(HoneyPayMainUI honeyPayMainUI, C50826pg2 pg22) {
        this.f146494e = honeyPayMainUI;
        this.f146493d = pg22;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        HoneyPayMainUI honeyPayMainUI = this.f146494e;
        C50826pg2 pg22 = this.f146493d;
        String str = pg22.f139757i;
        String str2 = pg22.f139758j;
        int i = HoneyPayMainUI.f114848u;
        honeyPayMainUI.mo66527J7(str, false, str2);
        C117292a.m165361g(this, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
