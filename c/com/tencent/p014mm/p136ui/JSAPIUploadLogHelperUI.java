package com.tencent.p014mm.p136ui;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75576f4;
import eb0.C75592q0;
import eb0.C97625j3;
import nj3.C76879j;

/* renamed from: com.tencent.mm.ui.JSAPIUploadLogHelperUI */
public class JSAPIUploadLogHelperUI extends MMBaseActivity {

    /* renamed from: e */
    public static volatile boolean f121147e;

    /* renamed from: f */
    public static final byte[] f121148f = new byte[0];

    public void onCreate(Bundle bundle) {
        Log.m105925i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", Boolean.valueOf(f121147e));
        super.onCreate(bundle);
        setContentView(C0966R.C0971layout.f6534hh);
        synchronized (f121148f) {
            if (f121147e) {
                Log.m105928w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
                finish();
            }
        }
        String stringExtra = getIntent().getStringExtra("key_user");
        int intExtra = getIntent().getIntExtra("key_time", 0);
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(stringExtra != null && stringExtra.equals(C75592q0.m90789s()));
        objArr[1] = Integer.valueOf(intExtra);
        Log.m105925i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", objArr);
        if (stringExtra == null) {
            Log.m105920e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
            finish();
        } else if (intExtra < 0) {
            Log.m105921e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", Integer.valueOf(intExtra));
            finish();
        } else {
            C97625j3.m125815e().mo123460f(new C75576f4(new C116179x0(this, intExtra, C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.lmu), true, false, (DialogInterface.OnCancelListener) null)), (String) null));
        }
    }

    public void onDestroy() {
        Log.m105925i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", Boolean.valueOf(f121147e));
        super.onDestroy();
    }
}
