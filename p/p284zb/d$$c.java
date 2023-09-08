package p284zb;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82836n0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import java.util.concurrent.CountDownLatch;

/* renamed from: zb.d$$c */
public final /* synthetic */ class d$$c implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C81879g f262547a;

    /* renamed from: b */
    public final /* synthetic */ C40480g f262548b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f262549c;

    public /* synthetic */ d$$c(C81879g gVar, C40480g gVar2, CountDownLatch countDownLatch) {
        this.f262547a = gVar;
        this.f262548b = gVar2;
        this.f262549c = countDownLatch;
    }

    public final void onReceiveValue(Object obj) {
        C81879g gVar = this.f262547a;
        C40480g gVar2 = this.f262548b;
        CountDownLatch countDownLatch = this.f262549c;
        C82836n0.m101587a(gVar, gVar2, (String) obj);
        countDownLatch.countDown();
    }
}
