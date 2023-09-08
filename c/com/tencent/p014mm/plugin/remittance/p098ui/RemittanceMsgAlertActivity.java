package com.tencent.p014mm.plugin.remittance.p098ui;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import qo3.C47883u;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity */
public class RemittanceMsgAlertActivity extends AppCompatActivity {

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity$a */
    public class C70777a implements C47883u {
        public C70777a(RemittanceMsgAlertActivity remittanceMsgAlertActivity) {
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.remittance.ui.RemittanceMsgAlertActivity$b */
    public class C70778b implements DialogInterface.OnDismissListener {
        public C70778b() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            RemittanceMsgAlertActivity.this.finish();
        }
    }

    public Resources getResources() {
        return MMApplicationContext.getResources();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        boolean booleanExtra = getIntent().getBooleanExtra("key_is_no_contact", false);
        C77426q qVar = new C77426q(this);
        qVar.mo107595g(MMApplicationContext.getContext().getString(booleanExtra ? C0966R.string.i1u : C0966R.string.i1t));
        qVar.mo107599k(MMApplicationContext.getContext().getResources().getColor(C0966R.color.akw));
        qVar.mo107601m(C0966R.string.fmz);
        qVar.mo107600l(new C70777a(this));
        qVar.mo107593e(new C70778b());
        qVar.mo107603o();
    }

    public void onDestroy() {
        super.onDestroy();
        overridePendingTransition(0, 0);
    }
}
