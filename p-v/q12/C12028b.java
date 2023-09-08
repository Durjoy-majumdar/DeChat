package q12;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: q12.b */
public class C12028b extends C12027a {

    /* renamed from: b */
    public long f35020b;

    /* renamed from: c */
    public long f35021c;

    /* renamed from: d */
    public long f35022d = 0;

    /* renamed from: e */
    public long f35023e = 0;

    /* renamed from: f */
    public long f35024f = 0;

    /* renamed from: a */
    public void mo11890a() {
        C115669n.INSTANCE.mo160131h(12930, Long.valueOf(this.f35020b), Long.valueOf(this.f35021c), Long.valueOf(this.f35022d), Long.valueOf(this.f35023e), Long.valueOf(this.f35024f));
    }

    /* renamed from: c */
    public void mo11892c() {
        this.f35020b = 0;
        this.f35021c = 0;
        this.f35022d = 0;
        this.f35023e = 0;
        this.f35024f = 0;
    }

    /* renamed from: d */
    public void mo11893d() {
        super.mo11893d();
        this.f35020b = Util.nowMilliSecond();
    }
}
