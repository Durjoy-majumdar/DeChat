package e22;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.p136ui.contact.AddressUI;
import com.tencent.p014mm.plugin.label.p067ui.ContactEditLabel;
import com.tencent.p014mm.storage.C72996z1;
import gl3.C75922b;
import gl3.C75939h;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C9556a;
import ke3.C88144b;

/* renamed from: e22.b */
public final class C7587b implements AdapterView.OnItemClickListener {

    /* renamed from: d */
    public final /* synthetic */ ContactEditLabel f25856d;

    public C7587b(ContactEditLabel contactEditLabel) {
        this.f25856d = contactEditLabel;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ContactEditLabel.C69040a aVar = this.f25856d.f198447A;
        if (aVar != null) {
            C75922b j2 = aVar.getItem(i);
            if (j2 == null || !(j2 instanceof C75939h)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            String str = ((C75939h) j2).f222602y;
            ContactEditLabel.C69040a aVar2 = this.f25856d.f198447A;
            if (aVar2 != null) {
                boolean z = false;
                if (aVar2.f219057f) {
                    if (aVar2 != null) {
                        C87412m.m108593f(str, "username");
                        if (aVar2.f198476r.contains(str)) {
                            aVar2.f198476r.remove(str);
                        } else {
                            aVar2.f198476r.add(str);
                        }
                        aVar2.notifyDataSetChanged();
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                } else if (C72996z1.m85841l5(str)) {
                    Intent intent = new Intent(this.f25856d.getContext(), AddressUI.class);
                    intent.putExtra("Contact_GroupFilter_DisplayName", "@biz.contact");
                    ContactEditLabel contactEditLabel = this.f25856d;
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(intent);
                    ContactEditLabel contactEditLabel2 = contactEditLabel;
                    C117292a.m165358d(contactEditLabel2, aVar3.mo10232b(), "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    contactEditLabel.startActivity((Intent) aVar3.mo10231a(0));
                    C117292a.m165359e(contactEditLabel2, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                    return;
                }
                Intent intent2 = new Intent();
                intent2.putExtra("Contact_User", str);
                intent2.putExtra("Contact_Scene", 3);
                intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
                if (str != null) {
                    if (str.length() > 0) {
                        z = true;
                    }
                    if (z) {
                        C88144b.m109791i(this.f25856d.getContext(), Scopes.PROFILE, ".ui.ContactInfoUI", intent2, (Bundle) null);
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/label/ui/ContactEditLabel$bindUIAndSetListener$2", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
                return;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
        C87412m.m108603p("adapter");
        throw null;
    }
}
