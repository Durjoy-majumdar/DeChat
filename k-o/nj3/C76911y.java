package nj3;

import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.KeyboardHeightProvider;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;
import com.tencent.p014mm.sdk.platformtools.Util;
import d22.C75319a;
import e22.C75506g0;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import nj3.C76905x;

/* renamed from: nj3.y */
public class C76911y implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C76905x.C76909d f224768d;

    /* renamed from: e */
    public final /* synthetic */ C76905x f224769e;

    public C76911y(C76905x xVar, C76905x.C76909d dVar) {
        this.f224769e = xVar;
        this.f224768d = dVar;
    }

    public void onClick(View view) {
        EditText editText;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/base/MMHalfBottomEditDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        String trim = (this.f224769e.f224757M.getText() == null || this.f224769e.f224757M.getText().toString() == null) ? "" : this.f224769e.f224757M.getText().toString().trim();
        if (this.f224768d != null && !Util.isNullOrNil(trim)) {
            C75506g0 g0Var = (C75506g0) this.f224768d;
            ContactLabelUI contactLabelUI = g0Var.f221877a;
            C76905x xVar = contactLabelUI.f198651e;
            if (!(xVar == null || (editText = xVar.f224757M) == null)) {
                contactLabelUI.hideVKB(editText);
            }
            g0Var.f221877a.f198651e.mo140680z();
            if (!g0Var.f221877a.f198661r.getTagList().contains(trim.toString())) {
                g0Var.f221877a.f198654h = true;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(trim);
                C97625j3.m125815e().mo123460f(new C75319a((List<String>) arrayList2));
                ContactLabelUI contactLabelUI2 = g0Var.f221877a;
                contactLabelUI2.mo95085H7(contactLabelUI2.getString(C0966R.string.g2h));
            }
            KeyboardHeightProvider keyboardHeightProvider = g0Var.f221877a.f198652f;
            if (keyboardHeightProvider != null) {
                keyboardHeightProvider.mo104021d();
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/base/MMHalfBottomEditDialog$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
