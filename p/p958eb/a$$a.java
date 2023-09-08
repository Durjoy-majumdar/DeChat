package p958eb;

import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82836n0;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C40480g;
import java.util.concurrent.CountDownLatch;

/* renamed from: eb.a$$a */
public final /* synthetic */ class a$$a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C81879g f251278a;

    /* renamed from: b */
    public final /* synthetic */ C40480g f251279b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f251280c;

    public /* synthetic */ a$$a(C81879g gVar, C40480g gVar2, CountDownLatch countDownLatch) {
        this.f251278a = gVar;
        this.f251279b = gVar2;
        this.f251280c = countDownLatch;
    }

    public final void onReceiveValue(Object obj) {
        C81879g gVar = this.f251278a;
        C40480g gVar2 = this.f251279b;
        CountDownLatch countDownLatch = this.f251280c;
        C82836n0.m101587a(gVar, gVar2, (String) obj);
        countDownLatch.countDown();
    }
}
