package mv0;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: mv0.d */
public class C99981d {

    /* renamed from: a */
    public int f292932a;

    /* renamed from: b */
    public int f292933b;

    /* renamed from: c */
    public int f292934c;

    /* renamed from: d */
    public int f292935d;

    /* renamed from: e */
    public int f292936e;

    /* renamed from: f */
    public int f292937f;

    /* renamed from: g */
    public int f292938g;

    /* renamed from: a */
    public void mo139323a() {
        int i = this.f292932a;
        if (i == 0) {
            this.f292932a = 0;
            this.f292933b = 0;
            this.f292934c = 0;
            this.f292935d = 0;
            this.f292936e = 0;
            this.f292937f = 0;
            this.f292938g = 0;
            return;
        }
        String format = String.format("%d,%d,%d,%d,%d,%d,%d,%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f292933b), Integer.valueOf(this.f292934c), 0, Integer.valueOf(this.f292935d), Integer.valueOf(this.f292936e), Integer.valueOf(this.f292937f), Integer.valueOf(this.f292938g)});
        Log.m105925i("MicroMsg.BakPCReportor", "report: %s", format);
        C115669n.INSTANCE.kvStat(11103, format);
        this.f292932a = 0;
        this.f292933b = 0;
        this.f292934c = 0;
        this.f292935d = 0;
        this.f292936e = 0;
        this.f292937f = 0;
        this.f292938g = 0;
    }
}
