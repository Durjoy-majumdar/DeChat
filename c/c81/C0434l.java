package c81;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: c81.l */
public final class C0434l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ String f1059d;

    /* renamed from: e */
    public final /* synthetic */ C39904a f1060e;

    public C0434l(String str, C39904a aVar) {
        this.f1059d = str;
        this.f1060e = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f1059d);
        C88144b.m109791i(this.f1060e.getActivity(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
