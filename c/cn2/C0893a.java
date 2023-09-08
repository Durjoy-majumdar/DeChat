package cn2;

import android.content.DialogInterface;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.qrcode.ShareToQQUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import jg0.C9399k;
import nj3.C76879j;

/* renamed from: cn2.a */
public class C0893a extends C9399k {

    /* renamed from: d */
    public final /* synthetic */ ShareToQQUI f2110d;

    public C0893a(ShareToQQUI shareToQQUI) {
        this.f2110d = shareToQQUI;
    }

    /* renamed from: a */
    public void mo779a(int i, String str) {
        super.mo779a(i, str);
        if (i == 3) {
            ShareToQQUI shareToQQUI = this.f2110d;
            int i2 = ShareToQQUI.f20621i;
            shareToQQUI.getClass();
            Log.m105920e("MicroMsg.ShareToQQUI", "dealWithRefreshTokenFail");
            if (!shareToQQUI.f20626h) {
                String string = shareToQQUI.getContext().getString(C0966R.string.a3h);
                C76879j.m92750u(shareToQQUI.getContext(), shareToQQUI.getContext().getString(C0966R.string.cle), string, new C0894b(shareToQQUI), (DialogInterface.OnClickListener) null);
            }
        }
    }

    /* renamed from: b */
    public void mo780b(Bundle bundle) {
        super.mo780b(bundle);
    }
}
