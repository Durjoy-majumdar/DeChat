package com.tencent.p014mm.plugin.luckymoney.model;

import android.os.Handler;
import android.os.Message;
import com.tencent.p014mm.sdk.platformtools.Log;
import f32.C75672b;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.n0 */
public class C69250n0 implements C75672b.C75673a {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f199280a;

    /* renamed from: b */
    public final /* synthetic */ Handler.Callback f199281b;

    public C69250n0(AtomicInteger atomicInteger, Handler.Callback callback) {
        this.f199280a = atomicInteger;
        this.f199281b = callback;
    }

    public void onComplete(boolean z) {
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopePreview", "load ok : %s", Boolean.valueOf(z));
        this.f199280a.incrementAndGet();
        Message obtain = Message.obtain();
        obtain.arg1 = this.f199280a.get();
        this.f199281b.handleMessage(obtain);
    }
}
