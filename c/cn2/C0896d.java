package cn2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.qrcode.ShowQRCodeStep1UI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.system.AndroidMediaUtil;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import java.io.OutputStream;
import p140cw.C7138g;
import p910lj.C76701a;

/* renamed from: cn2.d */
public class C0896d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShowQRCodeStep1UI f2113d;

    public C0896d(ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f2113d = showQRCodeStep1UI;
    }

    public void run() {
        Class cls = C7138g.class;
        byte[] bArr = this.f2113d.f20634g;
        if (bArr != null && bArr.length > 0) {
            String str = ((C7138g) C86312j.m106911c(cls)).mo8323lm() + "mmqrcode" + System.currentTimeMillis() + ".png";
            OutputStream outputStream = null;
            try {
                outputStream = C86013q1.m106429K(str, false);
                outputStream.write(bArr);
                ShowQRCodeStep1UI showQRCodeStep1UI = this.f2113d;
                C76701a.makeText((Context) showQRCodeStep1UI, (CharSequence) showQRCodeStep1UI.getString(C0966R.string.fn4, new Object[]{AndroidMediaUtil.getFriendlySdcardPath(str)}), 1).show();
                ((C7138g) C86312j.m106911c(cls)).mo8315Wr(str, this.f2113d);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ShowQRCodeStep1UI", e, "", new Object[0]);
                if (outputStream == null) {
                    return;
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
            try {
                outputStream.close();
            } catch (Exception unused2) {
            }
        }
    }
}
