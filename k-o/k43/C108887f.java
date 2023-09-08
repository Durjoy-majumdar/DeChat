package k43;

import android.os.Build;
import com.tencent.p014mm.sdk.platformtools.Log;
import p156gj.C107842p;
import p156gj.C87203t;

/* renamed from: k43.f */
public class C108887f {

    /* renamed from: A */
    public int f326055A = 1;

    /* renamed from: B */
    public int f326056B = 0;

    /* renamed from: C */
    public int f326057C = 0;

    /* renamed from: D */
    public int f326058D = 0;

    /* renamed from: E */
    public int f326059E = 0;

    /* renamed from: F */
    public long f326060F = 0;

    /* renamed from: G */
    public int f326061G;

    /* renamed from: H */
    public long f326062H = 0;

    /* renamed from: I */
    public long f326063I = 0;

    /* renamed from: J */
    public long f326064J = 0;

    /* renamed from: K */
    public long f326065K = 0;

    /* renamed from: L */
    public int f326066L;

    /* renamed from: M */
    public int f326067M;

    /* renamed from: N */
    public int f326068N = 1;

    /* renamed from: O */
    public int f326069O = 0;

    /* renamed from: P */
    public int f326070P = 0;

    /* renamed from: Q */
    public int f326071Q = -1;

    /* renamed from: R */
    public int f326072R = 0;

    /* renamed from: S */
    public String f326073S = "";

    /* renamed from: T */
    public String f326074T = "";

    /* renamed from: U */
    public String f326075U = "";

    /* renamed from: V */
    public String f326076V = "";

    /* renamed from: W */
    public int f326077W = 0;

    /* renamed from: X */
    public int f326078X = 0;

    /* renamed from: Y */
    public int f326079Y = 0;

    /* renamed from: Z */
    public int f326080Z = 0;

    /* renamed from: a */
    public int f326081a = 0;

    /* renamed from: a0 */
    public int f326082a0 = 0;

    /* renamed from: b */
    public int f326083b = 0;

    /* renamed from: b0 */
    public int f326084b0 = C107842p.m146108a();

    /* renamed from: c */
    public int f326085c = 0;

    /* renamed from: c0 */
    public String f326086c0 = "";

    /* renamed from: d */
    public int f326087d = 0;

    /* renamed from: d0 */
    public String f326088d0 = "";

    /* renamed from: e */
    public int f326089e = 0;

    /* renamed from: f */
    public int f326090f = 0;

    /* renamed from: g */
    public int f326091g = 0;

    /* renamed from: h */
    public int f326092h = 0;

    /* renamed from: i */
    public int f326093i = 0;

    /* renamed from: j */
    public int f326094j = 0;

    /* renamed from: k */
    public int f326095k = 0;

    /* renamed from: l */
    public int f326096l = 0;

    /* renamed from: m */
    public int f326097m = 0;

    /* renamed from: n */
    public int f326098n;

    /* renamed from: o */
    public int f326099o = 0;

    /* renamed from: p */
    public long f326100p = 0;

    /* renamed from: q */
    public long f326101q = 0;

    /* renamed from: r */
    public String f326102r = "";

    /* renamed from: s */
    public int f326103s;

    /* renamed from: t */
    public int f326104t = 0;

    /* renamed from: u */
    public int f326105u = 0;

    /* renamed from: v */
    public int f326106v = 0;

    /* renamed from: w */
    public int f326107w = 0;

    /* renamed from: x */
    public int f326108x = 0;

    /* renamed from: y */
    public int f326109y = 0;

    /* renamed from: z */
    public int f326110z = 0;

    public C108887f() {
        String str = "" + Build.MANUFACTURER;
        this.f326073S = str;
        if (str.contains(",")) {
            this.f326073S = this.f326073S.replace(',', ' ');
        }
        String str2 = "" + C87203t.m108275k();
        this.f326074T = str2;
        if (str2.contains(",")) {
            this.f326074T = this.f326074T.replace(',', ' ');
        }
        String str3 = "" + Build.VERSION.SDK;
        this.f326075U = str3;
        if (str3.contains(",")) {
            this.f326075U = this.f326075U.replace(',', ' ');
        }
        String str4 = "" + Build.VERSION.RELEASE;
        this.f326076V = str4;
        if (str4.contains(",")) {
            this.f326076V = this.f326076V.replace(',', ' ');
        }
    }

    /* renamed from: a */
    public void mo160019a() {
        Log.m105918d("MicroMsg.VoipCSReportHelper", "markEndTalk");
        if (this.f326080Z == 0 && this.f326079Y != 0) {
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            this.f326080Z = currentTimeMillis;
            this.f326065K = (long) (currentTimeMillis - this.f326079Y);
        }
    }
}
