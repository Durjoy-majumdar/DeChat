package gg0;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindQQUI;
import com.tencent.p014mm.plugin.account.bind.p021ui.VerifyQQUI;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: gg0.r */
public class C45916r implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BindQQUI f123895d;

    public C45916r(BindQQUI bindQQUI) {
        this.f123895d = bindQQUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMWizardActivity.m7017L7(this.f123895d, new Intent(this.f123895d, VerifyQQUI.class));
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
