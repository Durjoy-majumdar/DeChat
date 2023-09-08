package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.k */
public class C41337k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ExdeviceDeviceProfileUI f111311d;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.k$a */
    public class C41338a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C89779i0 f111312d;

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.k$a$a */
        public class C41339a implements Runnable {
            public C41339a() {
            }

            public void run() {
                C41338a.this.f111312d.dismiss();
            }
        }

        public C41338a(C89779i0 i0Var) {
            this.f111312d = i0Var;
        }

        public boolean onTimerExpired() {
            C41337k.this.f111311d.runOnUiThread(new C41339a());
            return true;
        }
    }

    public C41337k(ExdeviceDeviceProfileUI exdeviceDeviceProfileUI) {
        this.f111311d = exdeviceDeviceProfileUI;
    }

    public void run() {
        ExdeviceDeviceProfileUI exdeviceDeviceProfileUI = this.f111311d;
        new MTimerHandler(new C41338a(C76879j.m92723Q(exdeviceDeviceProfileUI, exdeviceDeviceProfileUI.getString(C0966R.string.a3h), this.f111311d.getString(C0966R.string.cck), true, false, (DialogInterface.OnCancelListener) null)), false).startTimer(1000);
    }
}
