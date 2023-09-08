package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import j20.C117292a;
import java.util.List;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.n */
public class C5057n extends C7089c0 {

    /* renamed from: g */
    public final /* synthetic */ List f20410g;

    /* renamed from: h */
    public final /* synthetic */ MobileRemittanceUI f20411h;

    public C5057n(MobileRemittanceUI mobileRemittanceUI, List list) {
        this.f20411h = mobileRemittanceUI;
        this.f20410g = list;
    }

    /* renamed from: a */
    public void mo2066a(View view) {
        for (View view2 : this.f20410g) {
            View findViewById = view2.findViewById(C0966R.C0970id.gwd);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = findViewById;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setContentDescription(((TextView) view2.findViewById(C0966R.C0970id.gwe)).getText());
        }
        ImageView imageView = (ImageView) view.getTag();
        this.f20411h.f203958S = ((Integer) imageView.getTag()).intValue();
        imageView.setVisibility(0);
        view.setContentDescription(this.f20411h.getString(C0966R.string.hih) + ((TextView) view.findViewById(C0966R.C0970id.gwe)).getText());
    }
}
