package com.tencent.p014mm.plugin.account.p024ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;

/* renamed from: com.tencent.mm.plugin.account.ui.y1 */
public class C40425y1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f108647d;

    /* renamed from: e */
    public final /* synthetic */ MobileLoginOrForceReg f108648e;

    public C40425y1(MobileLoginOrForceReg mobileLoginOrForceReg, String str) {
        this.f108648e = mobileLoginOrForceReg;
        this.f108647d = str;
    }

    public void run() {
        Bitmap bitmap;
        try {
            bitmap = BackwardSupportUtil.BitmapFactory.decodeStream(C81035d.m98961b(this.f108647d, 10000, 20000));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.MobileLoginOrForceReg", "download avatar failed");
            Log.printErrStackTrace("MicroMsg.MobileLoginOrForceReg", e, "", new Object[0]);
            bitmap = null;
        }
        MMHandler mMHandler = this.f108648e.f344726A;
        mMHandler.sendMessage(mMHandler.obtainMessage(0, bitmap));
    }

    public String toString() {
        return super.toString() + "|loadBitmap";
    }
}
