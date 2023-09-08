package cn2;

import android.content.Context;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.setting.p102ui.qrcode.ShowQRCodeStep1UI;
import p910lj.C76701a;

/* renamed from: cn2.e */
public class C0897e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ShowQRCodeStep1UI f2114d;

    public C0897e(ShowQRCodeStep1UI showQRCodeStep1UI) {
        this.f2114d = showQRCodeStep1UI;
    }

    public void run() {
        C76701a.makeText((Context) this.f2114d, (int) C0966R.string.iak, 1).show();
    }
}
