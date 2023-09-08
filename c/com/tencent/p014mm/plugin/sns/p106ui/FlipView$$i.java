package com.tencent.p014mm.plugin.sns.p106ui;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.OutputStream;

/* renamed from: com.tencent.mm.plugin.sns.ui.FlipView$$i */
public class FlipView$$i implements BitmapUtil.ImageWriteOSCallback {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f276829a;

    public FlipView$$i(Bitmap bitmap) {
        this.f276829a = bitmap;
    }

    public void callback(OutputStream outputStream) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$8");
        try {
            this.f276829a.compress(Bitmap.CompressFormat.PNG, 80, outputStream);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FlipView", e, "", new Object[0]);
        } catch (Throwable th) {
            try {
                outputStream.close();
            } catch (Exception unused) {
            }
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$8");
            throw th;
        }
        try {
            outputStream.close();
        } catch (Exception unused2) {
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.FlipView$8");
    }
}
