package yz2;

import android.view.View;
import com.tencent.p014mm.api.IEmojiInfo;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusEditActivity;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import rx3.C36570n;
import uz2.C78318v1;

/* renamed from: yz2.r1 */
public final class C79266r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusEditActivity f232711d;

    public C79266r1(TextStatusEditActivity textStatusEditActivity) {
        this.f232711d = textStatusEditActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object value = ((C36570n) this.f232711d.f206891K).getValue();
        C87412m.m108593f(value, "<get-layoutEmojiView>(...)");
        View view2 = (View) value;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f232711d.mo98494w8();
        this.f232711d.mo98448S7().setEmojiInfo((IEmojiInfo) null);
        C78318v1 Y7 = this.f232711d.mo98454Y7();
        if (Y7 != null) {
            Y7.f229482S0++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$initSmileyPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
