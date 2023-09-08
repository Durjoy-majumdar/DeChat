package yz2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import di3.C86312j;
import gy3.C87412m;
import hz2.C76252b;
import j20.C117292a;
import java.util.ArrayList;
import p640ox.C77049b;
import uz2.C52718u;
import uz2.C78318v1;

/* renamed from: yz2.n1 */
public final class C79253n1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditActivity f232678d;

    public C79253n1(TextStatusEditActivity textStatusEditActivity) {
        this.f232678d = textStatusEditActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f232678d.mo98444O7().f206977d == 0) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AppCompatActivity context = this.f232678d.getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            if (C76252b.m91657a(this.f232678d.mo98445P7())) {
                v1Var.f229473L++;
            } else {
                v1Var.f229472K++;
            }
        }
        C52718u P7 = this.f232678d.mo98445P7();
        P7.f147249u = 1 ^ P7.f147249u;
        this.f232678d.mo98493v8();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
