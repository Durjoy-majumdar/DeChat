package com.tencent.p014mm.plugin.lite;

import com.tencent.p014mm.plugin.lite.C56832d;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.tencent.mm.plugin.lite.c */
public class C56831c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C56832d.C56835c f162859d;

    /* renamed from: e */
    public final /* synthetic */ String f162860e;

    /* renamed from: f */
    public final /* synthetic */ String f162861f;

    /* renamed from: g */
    public final /* synthetic */ CountDownLatch f162862g;

    /* renamed from: h */
    public final /* synthetic */ C56832d f162863h;

    public C56831c(C56832d dVar, C56832d.C56835c cVar, String str, String str2, CountDownLatch countDownLatch) {
        this.f162863h = dVar;
        this.f162859d = cVar;
        this.f162860e = str;
        this.f162861f = str2;
        this.f162862g = countDownLatch;
    }

    public void run() {
        this.f162859d.f162869a = this.f162863h.f162866c.mo80258a(this.f162860e, this.f162861f);
        this.f162862g.countDown();
    }
}
