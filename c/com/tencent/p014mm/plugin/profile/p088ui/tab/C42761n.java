package com.tencent.p014mm.plugin.profile.p088ui.tab;

import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.ProfileHdHeadImg;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.profile.ui.tab.n */
public final class C42761n implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C42734m f115778d;

    public C42761n(C42734m mVar) {
        this.f115778d = mVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ContactWidgetTabBizHeaderController contactWidgetTabBizHeaderController = ContactWidgetTabBizHeaderController.this;
        String username = contactWidgetTabBizHeaderController.f115559j.getUsername();
        Intent intent = new Intent(contactWidgetTabBizHeaderController.f115556g, ProfileHdHeadImg.class);
        intent.putExtra("username", username);
        intent.putExtra("brand_icon_url", contactWidgetTabBizHeaderController.f115560n);
        MMActivity mMActivity = contactWidgetTabBizHeaderController.f115556g;
        C9556a aVar = new C9556a();
        aVar.mo10233c(intent);
        MMActivity mMActivity2 = mMActivity;
        C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity.startActivity((Intent) aVar.mo10231a(0));
        C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderController", "doEnterAvatar", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/ContactWidgetTabBizHeaderView$updateAvatar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
