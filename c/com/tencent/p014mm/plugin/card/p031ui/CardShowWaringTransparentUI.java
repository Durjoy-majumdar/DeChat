package com.tencent.p014mm.plugin.card.p031ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import nj3.C76879j;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI */
public class CardShowWaringTransparentUI extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.card.ui.CardShowWaringTransparentUI$a */
    public class C2159a implements DialogInterface.OnClickListener {
        public C2159a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CardShowWaringTransparentUI.this.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6782od;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C76879j.m92754y(this, getString(C0966R.string.b1y, new Object[]{getIntent().getStringExtra("KEY_BRAND_NAME")}), getString(C0966R.string.b1z), getString(C0966R.string.ayp), new C2159a());
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            finish();
        }
        return super.onKeyUp(i, keyEvent);
    }
}
