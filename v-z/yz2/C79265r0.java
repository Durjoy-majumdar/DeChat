package yz2;

import android.view.View;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusDoWhatActivity;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: yz2.r0 */
public final class C79265r0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ TextStatusDoWhatActivity f232710d;

    public C79265r0(TextStatusDoWhatActivity textStatusDoWhatActivity) {
        this.f232710d = textStatusDoWhatActivity;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        TextStatusDoWhatActivity textStatusDoWhatActivity = this.f232710d;
        TextStatusDoWhatActivity.C5638a aVar = TextStatusDoWhatActivity.f206763C;
        textStatusDoWhatActivity.mo98416K7();
        C117292a.m165361g(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$showCustomDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
