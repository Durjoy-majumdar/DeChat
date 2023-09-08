package g63;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.p014mm.plugin.remittance.p098ui.RemittanceBaseUI;
import g63.C45890a;
import j20.C117292a;
import java.util.ArrayList;
import ke3.C88144b;
import qo3.C77398g;
import qo3.C77426q;

/* renamed from: g63.c */
public class C59373c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C45890a.C45894c f169692d;

    /* renamed from: e */
    public final /* synthetic */ EditText f169693e;

    /* renamed from: f */
    public final /* synthetic */ String f169694f;

    /* renamed from: g */
    public final /* synthetic */ String f169695g;

    /* renamed from: h */
    public final /* synthetic */ TextView f169696h;

    /* renamed from: i */
    public final /* synthetic */ Context f169697i;

    /* renamed from: j */
    public final /* synthetic */ C77426q f169698j;

    public C59373c(C45890a.C45894c cVar, EditText editText, String str, String str2, TextView textView, Context context, C77426q qVar) {
        this.f169692d = cVar;
        this.f169693e = editText;
        this.f169694f = str;
        this.f169695g = str2;
        this.f169696h = textView;
        this.f169697i = context;
        this.f169698j = qVar;
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C45890a.C45894c cVar = this.f169692d;
        if (cVar != null) {
            ((RemittanceBaseUI.C70630e) cVar).mo97290a(false, this.f169693e.getText().toString().trim(), this.f169694f, this.f169695g, this.f169696h.getText().toString().trim());
        }
        Context context = this.f169697i;
        C77398g gVar = this.f169698j.f225839c;
        Intent intent = new Intent();
        intent.putExtra("launch_from_remittance", true);
        C88144b.m109796n(context, "address", ".ui.WalletSelectAddrUI", intent, 6, false);
        if (gVar != null) {
            gVar.dismiss();
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/AlertWithMMEditText$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
