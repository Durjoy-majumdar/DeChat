package com.tencent.p014mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import nj3.C88989a;
import ob0.C117747y;
import yq3.C79148e;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity */
public class RealnameDialogActivity extends WalletBaseUI {

    /* renamed from: d */
    public RealnameGuideHelper f209040d;

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity$a */
    public class C72066a implements DialogInterface.OnClickListener {
        public C72066a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            RealnameDialogActivity.this.finish();
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity$b */
    public class C72067b implements DialogInterface.OnClickListener {
        public C72067b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            RealnameDialogActivity.this.finish();
        }
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("key_realname_guide_helper")) {
            finish();
            return;
        }
        this.f209040d = (RealnameGuideHelper) intent.getParcelableExtra("key_realname_guide_helper");
        Bundle bundle2 = new Bundle();
        bundle2.putString("realname_verify_process_jump_plugin", "wallet_core");
        bundle2.putString("realname_verify_process_jump_activity", ".id_verify.RealnameDialogActivity");
        bundle2.putBoolean("process_finish_stay_orgpage", false);
        Bundle bundle3 = bundle2;
        boolean b = this.f209040d.mo99371b(this, bundle3, new C72066a(), (C79148e.C79149a) null, true);
        boolean c = this.f209040d.mo99372c(this, bundle3, new C72067b(), (C79148e.C79149a) null, false);
        if (!b && !c) {
            finish();
        }
    }

    public boolean onSceneEnd(int i, int i2, String str, C117747y yVar) {
        return false;
    }
}
