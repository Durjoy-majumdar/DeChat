package gl3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;

/* renamed from: gl3.l */
public class C8358l implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C75939h f27320d;

    /* renamed from: e */
    public final /* synthetic */ Context f27321e;

    public C8358l(C75945m mVar, C75939h hVar, Context context) {
        this.f27320d = hVar;
        this.f27321e = context;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f27320d.f222602y);
        intent.putExtra("Contact_Scene", 3);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (!Util.isNullOrNil(this.f27320d.f222602y)) {
            C88144b.m109791i(this.f27321e, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/item/ContactViewItemDelegate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
