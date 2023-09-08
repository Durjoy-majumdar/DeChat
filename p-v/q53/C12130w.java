package q53;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: q53.w */
public final class C12130w implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C12049b0 f35232d;

    public C12130w(C12049b0 b0Var) {
        this.f35232d = b0Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i("WeCoinConsumePanel", "click confirm button");
        View view2 = this.f35232d.f35103j;
        if (view2 != null) {
            if (view2.getVisibility() == 8) {
                C12049b0 b0Var = this.f35232d;
                b0Var.f35095b.f35123f.invoke(b0Var);
            } else {
                CheckBox checkBox = this.f35232d.f35104k;
                if (checkBox == null) {
                    C87412m.m108603p("recharge_agreement_link_checkbox");
                    throw null;
                } else if (checkBox.isChecked()) {
                    C12049b0 b0Var2 = this.f35232d;
                    b0Var2.f35095b.f35123f.invoke(b0Var2);
                } else {
                    C12049b0 b0Var3 = this.f35232d;
                    Animation loadAnimation = AnimationUtils.loadAnimation(b0Var3.f35094a, C0966R.C0968anim.f2342a7);
                    View view3 = b0Var3.f35103j;
                    if (view3 != null) {
                        view3.startAnimation(loadAnimation);
                    } else {
                        C87412m.m108603p("recharge_agreement_link_ll");
                        throw null;
                    }
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("recharge_agreement_link_ll");
        throw null;
    }
}
