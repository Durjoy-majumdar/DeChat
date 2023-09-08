package com.tencent.p014mm.plugin.remittance.mobile.p097ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import p158gt.C76057w;

/* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.s */
public class C70575s implements C76057w.C76058a {

    /* renamed from: a */
    public final /* synthetic */ MobileRemittanceUI f204037a;

    /* renamed from: com.tencent.mm.plugin.remittance.mobile.ui.s$a */
    public class C70576a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f204038d;

        public C70576a(Bitmap bitmap) {
            this.f204038d = bitmap;
        }

        public void run() {
            Bitmap bitmap = this.f204038d;
            if (bitmap != null) {
                C70575s.this.f204037a.f203944D.setImageBitmap(BitmapUtil.getRoundedCornerBitmap(bitmap, false, ((float) bitmap.getWidth()) * 0.1f));
            } else {
                C70575s.this.f204037a.f203944D.setImageResource(C0966R.C0969drawable.bfa);
            }
        }
    }

    public C70575s(MobileRemittanceUI mobileRemittanceUI) {
        this.f204037a = mobileRemittanceUI;
    }

    /* renamed from: a */
    public void mo25933a(String str, Bitmap bitmap, String str2) {
        MMHandlerThread.postToMainThread(new C70576a(bitmap));
    }
}
