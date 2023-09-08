package kr0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82836n0;
import java.util.concurrent.CountDownLatch;
import kr0.e$$b;

public final /* synthetic */ class e$$b$a$$a implements C80669j.C80675f {

    /* renamed from: a */
    public final /* synthetic */ e$$b.C88268a f255136a;

    /* renamed from: b */
    public final /* synthetic */ C80669j f255137b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f255138c;

    public /* synthetic */ e$$b$a$$a(e$$b.C88268a aVar, C80669j jVar, CountDownLatch countDownLatch) {
        this.f255136a = aVar;
        this.f255137b = jVar;
        this.f255138c = countDownLatch;
    }

    /* renamed from: a */
    public final void mo112506a(String str, C80669j.C80676g gVar) {
        e$$b.C88268a aVar = this.f255136a;
        C80669j jVar = this.f255137b;
        CountDownLatch countDownLatch = this.f255138c;
        C82836n0.m101587a(e$$b.this.f245476a, jVar, str);
        countDownLatch.countDown();
    }
}
