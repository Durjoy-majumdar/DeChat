package sd2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: sd2.h */
public class C13657h extends Preference {

    /* renamed from: J */
    public View f38691J = null;

    /* renamed from: K */
    public boolean f38692K = false;

    /* renamed from: L */
    public boolean f38693L = false;

    /* renamed from: M */
    public boolean f38694M = true;

    public C13657h(Context context) {
        super(context);
        this.f121271G = C0966R.C0971layout.bal;
    }

    /* renamed from: t */
    public View mo2020t(View view, ViewGroup viewGroup) {
        if (this.f38691J == null) {
            this.f38691J = mo1087x(viewGroup);
        }
        mo1086w(this.f38691J);
        return this.f38691J;
    }

    /* renamed from: w */
    public void mo1086w(View view) {
        super.mo1086w(view);
        View findViewById = view.findViewById(C0966R.C0970id.gma);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) findViewById.getLayoutParams();
        int fromDPToPix = BackwardSupportUtil.BitmapFactory.fromDPToPix(this.f121274d, 10.0f);
        int i = this.f38692K ? fromDPToPix : 0;
        if (!this.f38693L) {
            fromDPToPix = 0;
        }
        layoutParams.setMargins(0, i, 0, fromDPToPix);
        findViewById.setLayoutParams(layoutParams);
        if (!this.f38694M) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(4);
            View view2 = findViewById;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(0);
        View view3 = findViewById;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/order/ui/preference/MallOrderDividerPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
