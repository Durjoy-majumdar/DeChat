package a32;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.login_exdevice.p070ui.LoginAsExDeviceUI;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: a32.b */
public class C39484b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f106028d;

    /* renamed from: e */
    public final /* synthetic */ LoginAsExDeviceUI f106029e;

    /* renamed from: a32.b$a */
    public class C39485a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f106030d;

        public C39485a(Bitmap bitmap) {
            this.f106030d = bitmap;
        }

        public void run() {
            C39484b.this.f106029e.f115054j.setImageBitmap(this.f106030d);
        }
    }

    public C39484b(LoginAsExDeviceUI loginAsExDeviceUI, String str) {
        this.f106029e = loginAsExDeviceUI;
        this.f106028d = str;
    }

    public void run() {
        try {
            Bitmap decodeStream = BackwardSupportUtil.BitmapFactory.decodeStream(C81035d.m98961b(this.f106028d, 10000, 20000));
            if (decodeStream != null) {
                MMHandlerThread.postToMainThread(new C39485a(BitmapUtil.getRoundedCornerBitmap(decodeStream, true, (float) C74942w4.m89786c(this.f106029e.getContext(), C0966R.dimen.f3736cp))));
            }
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LoginAsExDeviceUI", "download avatar failed");
            Log.printErrStackTrace("MicroMsg.LoginAsExDeviceUI", e, "", new Object[0]);
        }
    }
}
