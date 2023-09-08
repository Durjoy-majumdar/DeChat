package yz2;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditHalfScreenActivity;
import di3.C86312j;
import gy3.C87412m;
import hz2.C76252b;
import j20.C117292a;
import java.util.ArrayList;
import p640ox.C77049b;
import uz2.C52718u;
import uz2.C78318v1;

/* renamed from: yz2.w1 */
public final class C79279w1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditHalfScreenActivity f232728d;

    public C79279w1(TextStatusEditHalfScreenActivity textStatusEditHalfScreenActivity) {
        this.f232728d = textStatusEditHalfScreenActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f232728d.mo98557P7().f207188d == 0) {
            C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        AppCompatActivity context = this.f232728d.getContext();
        C87412m.m108593f(context, "context");
        C78318v1 v1Var = (C78318v1) ((C77049b) C86312j.m106911c(C77049b.class)).Wi0(context, 8, C78318v1.class);
        if (v1Var != null) {
            if (C76252b.m91657a(this.f232728d.mo98558Q7())) {
                v1Var.f229473L++;
            } else {
                v1Var.f229472K++;
            }
        }
        C52718u Q7 = this.f232728d.mo98558Q7();
        Q7.f147249u = 1 ^ Q7.f147249u;
        this.f232728d.mo98544G8();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditHalfScreenActivity$initBlur$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
