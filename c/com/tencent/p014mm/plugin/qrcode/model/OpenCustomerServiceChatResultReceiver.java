package com.tencent.p014mm.plugin.qrcode.model;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.tencent.p014mm.plugin.qrcode.model.C94313a;
import com.tencent.p014mm.sdk.platformtools.Log;
import vl2.C102212j;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.qrcode.model.OpenCustomerServiceChatResultReceiver */
public class OpenCustomerServiceChatResultReceiver extends ResultReceiver {

    /* renamed from: d */
    public boolean f272495d = false;

    /* renamed from: e */
    public C94313a.C94323j f272496e;

    /* renamed from: f */
    public Runnable f272497f;

    public OpenCustomerServiceChatResultReceiver(Handler handler, C94313a.C94323j jVar, Runnable runnable) {
        super(handler);
        this.f272496e = jVar;
        this.f272497f = runnable;
    }

    public void onReceiveResult(int i, Bundle bundle) {
        int i2;
        C94313a.C94323j jVar;
        C94313a.C94323j jVar2;
        if (bundle != null && (i2 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i3 = bundle.getInt("result_key_err_code", -1);
            Log.m105925i("MicroMsg.OpenCustomerServiceChatResultReceiver", "alvinluo startKfConversation onReceiveResult action: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), bundle.getString("result_key_err_msg"));
            if (i2 == 5) {
                this.f272495d = true;
            } else if (i2 == 2) {
                C94313a.C94323j jVar3 = this.f272496e;
                if (jVar3 != null) {
                    ((C102212j) jVar3).mo141756s(true);
                }
            } else if (i2 == 4) {
                if (!this.f272495d && (jVar2 = this.f272496e) != null) {
                    ((C102212j) jVar2).mo141756s(true);
                }
            } else if (i2 == 3) {
                if (this.f272497f != null) {
                    Log.m105918d("MicroMsg.OpenCustomerServiceChatResultReceiver", "release");
                    this.f272496e = null;
                    ((C119157j) C119157j.f356862d).mo183869C(this.f272497f, 600);
                }
            } else if (i2 == 6 && !this.f272495d && (jVar = this.f272496e) != null) {
                ((C102212j) jVar).mo141756s(true);
            }
        }
    }
}
