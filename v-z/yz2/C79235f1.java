package yz2;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C36570n;

/* renamed from: yz2.f1 */
public final class C79235f1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232609d;

    public C79235f1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232609d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Object value = ((C36570n) this.f232609d.f206802J).getValue();
        C87412m.m108593f(value, "<get-scrollView>(...)");
        ((NestedScrollView) value).scrollTo(0, 0);
        this.f232609d.mo98424M7().mo98318b();
        if (!this.f232609d.mo98424M7().f206686B) {
            this.f232609d.f206807P++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
