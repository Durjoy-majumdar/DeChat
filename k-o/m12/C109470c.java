package m12;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: m12.c */
public class C109470c {

    /* renamed from: A */
    public long f327646A = 0;

    /* renamed from: B */
    public String f327647B = "";

    /* renamed from: C */
    public long f327648C = 0;

    /* renamed from: D */
    public int f327649D = 0;

    /* renamed from: E */
    public int f327650E = 0;

    /* renamed from: F */
    public int f327651F = 0;

    /* renamed from: G */
    public int f327652G = 0;

    /* renamed from: a */
    public int f327653a = 0;

    /* renamed from: b */
    public int f327654b = 0;

    /* renamed from: c */
    public int f327655c = 0;

    /* renamed from: d */
    public int f327656d = 0;

    /* renamed from: e */
    public int f327657e = 0;

    /* renamed from: f */
    public long f327658f = 0;

    /* renamed from: g */
    public long f327659g = 0;

    /* renamed from: h */
    public int f327660h = 0;

    /* renamed from: i */
    public long f327661i = 0;

    /* renamed from: j */
    public int f327662j = 0;

    /* renamed from: k */
    public int f327663k = 0;

    /* renamed from: l */
    public int f327664l = 0;

    /* renamed from: m */
    public long f327665m = 0;

    /* renamed from: n */
    public long f327666n = 0;

    /* renamed from: o */
    public String f327667o = "";

    /* renamed from: p */
    public int f327668p = 0;

    /* renamed from: q */
    public String f327669q = "";

    /* renamed from: r */
    public long f327670r = 0;

    /* renamed from: s */
    public long f327671s = 0;

    /* renamed from: t */
    public long f327672t = 0;

    /* renamed from: u */
    public long f327673u = 0;

    /* renamed from: v */
    public long f327674v = 0;

    /* renamed from: w */
    public String f327675w = "";

    /* renamed from: x */
    public String f327676x = "";

    /* renamed from: y */
    public String f327677y = "";

    /* renamed from: z */
    public long f327678z = 0;

    /* renamed from: a */
    public void mo160705a() {
        Log.m105918d("MicroMsg.IPCallReportHelper", "markConnect");
        if (this.f327678z == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f327678z = currentTimeMillis;
            long j = currentTimeMillis - this.f327670r;
            this.f327646A = j;
            Log.m105919d("MicroMsg.IPCallReportHelper", "connectTime: %d", Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public void mo160706b() {
        Log.m105924i("MicroMsg.IPCallReportHelper", "selfCancel");
        this.f327656d = 1;
        if (this.f327648C == 0 && this.f327670r != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f327670r;
            this.f327648C = currentTimeMillis;
            Log.m105919d("MicroMsg.IPCallReportHelper", "cancelTime: %d", Long.valueOf(currentTimeMillis));
        }
    }
}
