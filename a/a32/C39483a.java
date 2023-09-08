package a32;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.login_exdevice.p070ui.LoginAsExDeviceUI;
import f40.C86709a0;
import nj3.C76879j;
import z22.C53735b;

/* renamed from: a32.a */
public class C39483a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ LoginAsExDeviceUI f106027d;

    public C39483a(LoginAsExDeviceUI loginAsExDeviceUI) {
        this.f106027d = loginAsExDeviceUI;
    }

    public void run() {
        C86709a0.m107524d().mo123460f(new C53735b());
        ProgressDialog progressDialog = this.f106027d.f115057p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        LoginAsExDeviceUI loginAsExDeviceUI = this.f106027d;
        loginAsExDeviceUI.f115057p = C76879j.m92723Q(loginAsExDeviceUI, "", loginAsExDeviceUI.getString(C0966R.string.gas), false, true, (DialogInterface.OnCancelListener) null);
    }
}
