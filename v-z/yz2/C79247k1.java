package yz2;

import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivityV2;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.k1 */
public final class C79247k1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivityV2 f232669d;

    public C79247k1(TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2) {
        this.f232669d = textStatusDoWhatActivityV2;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = this.f232669d;
        TextStatusDoWhatActivityV2.C5642a aVar = TextStatusDoWhatActivityV2.f206792X0;
        textStatusDoWhatActivityV2.mo98427P7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
