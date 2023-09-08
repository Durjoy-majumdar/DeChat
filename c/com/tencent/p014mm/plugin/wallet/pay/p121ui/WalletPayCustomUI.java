package com.tencent.p014mm.plugin.wallet.pay.p121ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C5791d1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72338c1;
import com.tencent.p014mm.plugin.wallet_core.p125ui.C72376e1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import eb0.C75592q0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import nj3.C76879j;
import nj3.C88989a;
import ob0.C117747y;
import te3.eh4;
import v53.C52766c0;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI */
public class WalletPayCustomUI extends WalletBaseUI {

    /* renamed from: d */
    public eh4 f208585d;

    /* renamed from: e */
    public String f208586e = "";

    /* renamed from: f */
    public String f208587f = "";

    /* renamed from: g */
    public boolean f208588g = false;

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI$a */
    public class C71909a implements C72338c1.C72345d {
        public C71909a() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI$b */
    public class C71910b implements DialogInterface.OnCancelListener {
        public C71910b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            WalletPayCustomUI.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI$c */
    public class C71911c implements C72338c1.C72344c {
        public C71911c() {
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentViewVisibility(8);
        this.f208587f = getIntent().getStringExtra("INTENT_PAYFEE");
        this.f208586e = getIntent().getStringExtra("INTENT_TITLE");
        this.f208588g = getIntent().getIntExtra("INTENT_CAN_TOUCH", 0) == 1;
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("INTENT_TOKENMESS");
        eh4 eh4 = new eh4();
        this.f208585d = eh4;
        try {
            eh4.parseFrom(byteArrayExtra);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.WalletPayCustomUI", e, "", new Object[0]);
        }
        eh4 eh42 = this.f208585d;
        Log.m105925i("MicroMsg.WalletPayCustomUI", "mTokeMess packageex:%s busi_id:%s sign:%s can_use_touch %s mPayFee %s mTitle %s", eh42.f132930d, eh42.f132934h, eh42.f132931e, Boolean.valueOf(this.f208588g), this.f208587f, this.f208586e);
        String str = this.f208586e;
        String str2 = this.f208587f;
        boolean z = this.f208588g;
        C71909a aVar = new C71909a();
        C71910b bVar = new C71910b();
        C71911c cVar = new C71911c();
        int i = C72338c1.f210352P;
        if (!isFinishing()) {
            C72338c1 c1Var = new C72338c1(this, C0966R.style.a6_);
            Button button = c1Var.f210368e;
            if (button != null) {
                c1Var.f210384x = null;
                button.setOnClickListener(new C5791d1(c1Var));
            }
            ImageView imageView = c1Var.f210369f;
            if (imageView != null) {
                c1Var.f210385y = bVar;
                imageView.setVisibility(0);
                c1Var.f210369f.setOnClickListener(new C72376e1(c1Var, bVar));
            }
            c1Var.setOnCancelListener(bVar);
            c1Var.setCancelable(true);
            c1Var.f210372i.setText(str);
            if (!TextUtils.isEmpty(str2)) {
                c1Var.f210374n.setVisibility(0);
                c1Var.f210374n.setText(str2);
            } else {
                c1Var.f210374n.setVisibility(8);
            }
            View view = c1Var.f210380t;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c1Var.f210383w = cVar;
            if (!TextUtils.isEmpty("")) {
                c1Var.f210381u.setVisibility(0);
                c1Var.f210381u.setText("");
            } else {
                Log.m105924i("MicroMsg.WalletPwdCustomDialog", "ChargeFee is null");
                c1Var.f210381u.setVisibility(8);
            }
            c1Var.f210378r = aVar;
            c1Var.f210358F = z;
            if (!C75592q0.m90763K()) {
                c1Var.mo99675i();
            }
            c1Var.show();
            C76879j.m92730a(this, c1Var);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.WalletPayCustomUI", "errorType %s errCode %s, errmsg %s, scene %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        if (yVar instanceof C52766c0) {
            if (i == 0 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("INTENT_RESULT_TOKEN", ((C52766c0) yVar).f147431d);
                intent.putExtras(getIntent());
                setResult(-1, intent);
            }
            finish();
        }
        return false;
    }
}
