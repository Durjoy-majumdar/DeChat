package yz2;

import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.CustomStatusView;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.e1 */
public final class C79233e1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomStatusView f232604d;

    /* renamed from: e */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232605e;

    public C79233e1(CustomStatusView customStatusView, TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232604d = customStatusView;
        this.f232605e = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f232604d.f206686B) {
            TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232605e;
            TextStatusDoWhatActivityV2.C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
            textStatusDoWhatActivityV2.mo98424M7().mo98318b();
            this.f232605e.f206807P++;
        } else {
            TextStatusDoWhatActivityV2.m83900J7(this.f232605e);
            this.f232605e.f206808Q++;
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$initCustomStatusView$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
