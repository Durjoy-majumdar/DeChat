package com.tencent.p014mm.plugin.fav.p047ui;

import al3.C0086a;
import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import qo3.C77389a;
import qo3.C77398g;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavTipsUI */
public class FavTipsUI extends MMBaseActivity {

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavTipsUI$a */
    public class C115441a implements DialogInterface.OnClickListener {
        public C115441a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            FavTipsUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavTipsUI$b */
    public class C115442b implements DialogInterface.OnCancelListener {
        public C115442b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            FavTipsUI.this.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C77389a aVar = new C77389a();
        aVar.f225644a = getString(C0966R.string.cow);
        aVar.f225660q = getString(C0966R.string.cou) + "\n\n" + getString(C0966R.string.cov);
        aVar.f225663t = C0086a.m38a(this).getString(C0966R.string.cot);
        aVar.f225620C = new C115441a();
        aVar.f225622E = new C115442b();
        C77398g gVar = new C77398g(this, C0966R.style.a66);
        gVar.mo107525e(aVar);
        gVar.show();
    }
}
