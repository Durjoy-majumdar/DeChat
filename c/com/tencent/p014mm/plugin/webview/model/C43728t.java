package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.concurrent.CountDownLatch;
import ob0.C47350c;
import te3.C49193dv;

/* renamed from: com.tencent.mm.plugin.webview.model.t */
public class C43728t implements C40324j.C40326a {

    /* renamed from: a */
    public final /* synthetic */ int[] f118186a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f118187b;

    public C43728t(C43729u uVar, int[] iArr, CountDownLatch countDownLatch) {
        this.f118186a = iArr;
        this.f118187b = countDownLatch;
    }

    /* renamed from: a */
    public void mo288a(int i, int i2, String str, C47350c cVar) {
        Log.m105925i("MicroMsg.NetSceneCheckTextLanguage", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
        int[] iArr = this.f118186a;
        iArr[0] = 2;
        if (i == 0 && i2 == 0) {
            int i3 = ((C49193dv) cVar.f127056b.f127083a).f132542e;
            if (i3 == 1) {
                iArr[0] = 0;
            } else if (i3 == 2) {
                iArr[0] = 1;
            }
            this.f118187b.countDown();
            return;
        }
        this.f118187b.countDown();
    }
}
