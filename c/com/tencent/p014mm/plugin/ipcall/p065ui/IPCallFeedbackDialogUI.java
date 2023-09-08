package com.tencent.p014mm.plugin.ipcall.p065ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C88989a;

@C88989a(7)
/* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI */
public class IPCallFeedbackDialogUI extends MMActivity {

    /* renamed from: d */
    public C105408f0 f313309d;

    /* renamed from: com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI$a */
    public class C105388a implements DialogInterface.OnDismissListener {
        public C105388a() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            IPCallFeedbackDialogUI.this.finish();
        }
    }

    public void finish() {
        Log.m105924i("MicroMsg.IPCallFeedbackDialogUI", "finish");
        C105408f0 f0Var = this.f313309d;
        if (f0Var != null && f0Var.isShowing()) {
            this.f313309d.dismiss();
            this.f313309d = null;
        }
        super.finish();
    }

    public int getLayoutId() {
        return -1;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.IPCallFeedbackDialogUI", "onCreate");
        C105408f0 f0Var = new C105408f0(this, getContext(), getIntent().getIntExtra("IPCallFeedbackDialogUI_KRoomId", 0), getIntent().getLongExtra("IPCallFeedbackDialogUI_KCallseq", 0));
        this.f313309d = f0Var;
        f0Var.setOnDismissListener(new C105388a());
        this.f313309d.getWindow().setSoftInputMode(16);
        this.f313309d.show();
    }

    public void onDestroy() {
        Log.m105918d("MicroMsg.IPCallFeedbackDialogUI", "onDestroy");
        super.onDestroy();
    }

    public void onNewIntent(Intent intent) {
        Log.m105918d("MicroMsg.IPCallFeedbackDialogUI", "onNewIntent");
        super.onNewIntent(intent);
    }

    public void onResume() {
        Log.m105918d("MicroMsg.IPCallFeedbackDialogUI", "onResume");
        super.onResume();
    }
}
