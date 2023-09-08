package gu0;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82836n0;
import gu0.C87384a;
import java.util.concurrent.CountDownLatch;

public final /* synthetic */ class a$a$$a implements C80669j.C80675f {

    /* renamed from: a */
    public final /* synthetic */ C87384a.C87385a f253233a;

    /* renamed from: b */
    public final /* synthetic */ C80669j f253234b;

    /* renamed from: c */
    public final /* synthetic */ CountDownLatch f253235c;

    public /* synthetic */ a$a$$a(C87384a.C87385a aVar, C80669j jVar, CountDownLatch countDownLatch) {
        this.f253233a = aVar;
        this.f253234b = jVar;
        this.f253235c = countDownLatch;
    }

    /* renamed from: a */
    public final void mo112506a(String str, C80669j.C80676g gVar) {
        C87384a.C87385a aVar = this.f253233a;
        C80669j jVar = this.f253234b;
        CountDownLatch countDownLatch = this.f253235c;
        C82836n0.m101587a(C87384a.this.f245476a, jVar, str);
        countDownLatch.countDown();
    }
}
