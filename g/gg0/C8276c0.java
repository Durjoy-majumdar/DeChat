package gg0;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.MobileFriendUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gg0.c0 */
public class C8276c0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ MobileFriendUI f27223d;

    public C8276c0(MobileFriendUI mobileFriendUI) {
        this.f27223d = mobileFriendUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMWizardActivity.m7017L7(this.f27223d, new Intent(this.f27223d, BindMContactIntroUI.class));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/MobileFriendUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
