package g63;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBaseUI;
import g63.C45890a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: g63.b */
public class C59372b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45890a.C45894c f169688d;

    /* renamed from: e */
    public final /* synthetic */ EditText f169689e;

    /* renamed from: f */
    public final /* synthetic */ Context f169690f;

    /* renamed from: g */
    public final /* synthetic */ C77426q f169691g;

    public C59372b(C45890a.C45894c cVar, EditText editText, Context context, C77426q qVar) {
        this.f169688d = cVar;
        this.f169689e = editText;
        this.f169690f = context;
        this.f169691g = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C45890a.C45894c cVar = this.f169688d;
        if (cVar != null) {
            ((RemittanceBaseUI.C70630e) cVar).mo97290a(true, this.f169689e.getText().toString().trim(), (String) null, (String) null, (String) null);
        }
        Context context = this.f169690f;
        C77398g gVar = this.f169691g.f225839c;
        Intent intent = new Intent();
        intent.putExtra("launch_from_remittance", true);
        C88144b.m109796n(context, "address", ".ui.WalletSelectAddrUI", intent, 6, false);
        if (gVar != null) {
            gVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
