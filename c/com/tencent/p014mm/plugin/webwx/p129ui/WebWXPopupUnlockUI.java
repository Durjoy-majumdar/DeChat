package com.tencent.p014mm.plugin.webwx.p129ui;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.maas.instamovie.MJTextResolver;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMBaseActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import p923xj.C78853a;

/* renamed from: com.tencent.mm.plugin.webwx.ui.WebWXPopupUnlockUI */
public class WebWXPopupUnlockUI extends MMBaseActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra(MJTextResolver.KEY_DEVICE_NAME);
            if (stringExtra != null) {
                C78853a aVar = new C78853a(this);
                aVar.requestWindowFeature(1);
                View inflate = View.inflate(this, C0966R.C0971layout.a57, (ViewGroup) null);
                ((TextView) inflate.findViewById(C0966R.C0970id.l06)).setOnClickListener(new C6628l(this, aVar));
                aVar.setOnDismissListener(new C6629m(this));
                ((TextView) inflate.findViewById(C0966R.C0970id.c4o)).setText(stringExtra);
                aVar.setContentView(inflate);
                aVar.show();
                return;
            }
            Log.m105928w("MicroMsg.WebWxPopUnlockUI", "Mac WeChat request to unlock,the deviceName is null");
        }
    }
}
