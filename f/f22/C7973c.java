package f22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.storage.C72996z1;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: f22.c */
public final class C7973c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C58909a f26653d;

    public C7973c(C58909a aVar) {
        this.f26653d = aVar;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/searchContact/ContactDataItem$fillingViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        C72996z1 z1Var = this.f26653d.f168570n;
        intent.putExtra("Contact_User", z1Var != null ? z1Var.getUsername() : null);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 62);
        C88144b.m109791i(view.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/searchContact/ContactDataItem$fillingViewItem$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
