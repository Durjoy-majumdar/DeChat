package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.pointers.PInt;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.concurrent.CountDownLatch;
import r80.C89903h;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.e2 */
public class C82709e2 implements C89903h.C89905b {

    /* renamed from: a */
    public final /* synthetic */ PInt f242006a;

    /* renamed from: b */
    public final /* synthetic */ CountDownLatch f242007b;

    public C82709e2(PInt pInt, CountDownLatch countDownLatch) {
        this.f242006a = pInt;
        this.f242007b = countDownLatch;
    }

    /* renamed from: a */
    public void mo114978a(String str) {
        Log.m105918d("MicroMsg.RemuxHelper", "remux onFinish.");
        if (Util.isNullOrNil(str)) {
            this.f242006a.value = Util.isNullOrNil(str) ? -1 : 0;
        }
        this.f242007b.countDown();
    }
}
