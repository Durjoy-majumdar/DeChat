package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6230e3;
import java.util.concurrent.CountDownLatch;
import p158gt.C8451i;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.f3 */
public class C6238f3 implements C8451i.C8452a {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f23002a;

    public C6238f3(C6230e3.C6233c cVar, CountDownLatch countDownLatch) {
        this.f23002a = countDownLatch;
    }

    /* renamed from: a */
    public void mo24a(Bitmap bitmap, byte[] bArr) {
        this.f23002a.countDown();
    }
}
