package com.tencent.p014mm.p136ui.contact;

import android.content.DialogInterface;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76879j;
import nm2.C76927a;

/* renamed from: com.tencent.mm.ui.contact.n3 */
public class C74530n3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ SelectContactUI f219100d;

    /* renamed from: com.tencent.mm.ui.contact.n3$a */
    public class C74531a implements DialogInterface.OnClickListener {
        public C74531a(C74530n3 n3Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectContactUI", "initMenu(uploading) click i know");
        }
    }

    /* renamed from: com.tencent.mm.ui.contact.n3$b */
    public class C74532b implements DialogInterface.OnClickListener {
        public C74532b(C74530n3 n3Var) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.SelectContactUI", "initMenu(upload fail) click i know");
        }
    }

    public C74530n3(SelectContactUI selectContactUI) {
        this.f219100d = selectContactUI;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        SelectContactUI selectContactUI = this.f219100d;
        if (selectContactUI.f218771b1 || selectContactUI.f218775f1) {
            C76879j.m92754y(selectContactUI, selectContactUI.getString(C0966R.string.huc), "", this.f219100d.getString(C0966R.string.lkg), new C74531a(this));
            C76927a.m92781a().f224812m++;
        } else if (selectContactUI.f218772c1 || selectContactUI.f218776g1) {
            C76879j.m92754y(selectContactUI, selectContactUI.getString(C0966R.string.hub), "", this.f219100d.getString(C0966R.string.lkg), new C74532b(this));
            C76927a.m92781a().f224813n++;
            C76927a.m92781a().f224811l++;
        } else {
            SelectContactUI.m88927g8(selectContactUI);
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/contact/SelectContactUI$18", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
