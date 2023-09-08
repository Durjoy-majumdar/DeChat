package q12;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: q12.i */
public class C12034i extends C12027a {

    /* renamed from: b */
    public long f35049b;

    /* renamed from: c */
    public long f35050c;

    /* renamed from: d */
    public long f35051d = 0;

    /* renamed from: e */
    public long f35052e = 0;

    /* renamed from: f */
    public long f35053f = 0;

    /* renamed from: a */
    public void mo11890a() {
        C115669n.INSTANCE.mo160131h(12934, Long.valueOf(this.f35049b), Long.valueOf(this.f35050c), Long.valueOf(this.f35051d), Long.valueOf(this.f35052e), Long.valueOf(this.f35053f));
    }

    /* renamed from: c */
    public void mo11892c() {
        this.f35049b = 0;
        this.f35050c = 0;
        this.f35051d = 0;
        this.f35052e = 0;
        this.f35053f = 0;
    }

    /* renamed from: d */
    public void mo11893d() {
        super.mo11893d();
        this.f35049b = Util.nowMilliSecond();
    }
}
