package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import nj3.C76879j;
import nj3.C88989a;
import qo3.C89779i0;

@C88989a(19)
/* renamed from: com.tencent.mm.ui.DataTransferUI */
public class DataTransferUI extends MMBaseActivity {

    /* renamed from: e */
    public C89779i0 f214215e;

    /* renamed from: f */
    public long f214216f = 0;

    /* renamed from: com.tencent.mm.ui.DataTransferUI$a */
    public class C73017a extends MMHandler {
        public C73017a() {
        }

        public void handleMessage(Message message) {
            C89779i0 i0Var = DataTransferUI.this.f214215e;
            if (i0Var != null && i0Var.isShowing()) {
                Log.m105920e("MicroMsg.DataTransferUI", "dialog has shown for a long time, auto dismiss it...");
                DataTransferUI.this.f214215e.dismiss();
                DataTransferUI.this.finish();
            }
        }
    }

    /* renamed from: E7 */
    public final void mo101266E7(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("finish_data_transfer", false);
        Log.m105918d("MicroMsg.DataTransferUI", "tryFinish, timestamp = " + System.currentTimeMillis() + ", finish = " + booleanExtra);
        if (booleanExtra) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Log.m105918d("MicroMsg.DataTransferUI", "onCreate, timestamp = " + System.currentTimeMillis());
        this.f214216f = System.currentTimeMillis();
        this.f214215e = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.f7940wx), true, false, (DialogInterface.OnCancelListener) null);
        new C73017a().sendEmptyMessageDelayed(0, 60000);
        mo101266E7(getIntent());
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105918d("MicroMsg.DataTransferUI", "onDestroy");
        C89779i0 i0Var = this.f214215e;
        if (i0Var != null && i0Var.isShowing()) {
            this.f214215e.dismiss();
        }
    }

    public void onNewIntent(Intent intent) {
        Log.m105918d("MicroMsg.DataTransferUI", "onNewIntent, timestamp = " + System.currentTimeMillis());
        mo101266E7(intent);
    }

    public void onPause() {
        Log.m105918d("MicroMsg.DataTransferUI", "edw DataTransferUI duration time = " + (System.currentTimeMillis() - this.f214216f));
        super.onPause();
    }
}
