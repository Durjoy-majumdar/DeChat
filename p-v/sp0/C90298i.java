package sp0;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Map;
import sp0.C90291h;

/* renamed from: sp0.i */
public class C90298i {

    /* renamed from: A */
    public final boolean f259215A;

    /* renamed from: a */
    public int f259216a;

    /* renamed from: b */
    public byte[] f259217b;

    /* renamed from: c */
    public String f259218c;

    /* renamed from: d */
    public String f259219d;

    /* renamed from: e */
    public C90291h.C90294c f259220e;

    /* renamed from: f */
    public Map<String, String> f259221f;

    /* renamed from: g */
    public ArrayList<String> f259222g;

    /* renamed from: h */
    public int f259223h = 15;

    /* renamed from: i */
    public String f259224i;

    /* renamed from: j */
    public String f259225j;

    /* renamed from: k */
    public HttpURLConnection f259226k;

    /* renamed from: l */
    public String f259227l;

    /* renamed from: m */
    public long f259228m;

    /* renamed from: n */
    public String f259229n;

    /* renamed from: o */
    public Runnable f259230o = null;

    /* renamed from: p */
    public boolean f259231p = false;

    /* renamed from: q */
    public boolean f259232q = false;

    /* renamed from: r */
    public boolean f259233r = false;

    /* renamed from: s */
    public boolean f259234s = false;

    /* renamed from: t */
    public boolean f259235t = true;

    /* renamed from: u */
    public boolean f259236u = false;

    /* renamed from: v */
    public boolean f259237v = false;

    /* renamed from: w */
    public String f259238w;

    /* renamed from: x */
    public int f259239x;

    /* renamed from: y */
    public String f259240y;

    /* renamed from: z */
    public boolean f259241z = false;

    public C90298i(String str, byte[] bArr, int i, C90291h.C90294c cVar, String str2, boolean z, boolean z2, boolean z3, boolean z4, String str3, int i2, String str4, boolean z5, boolean z6) {
        this.f259218c = str;
        this.f259217b = bArr;
        this.f259220e = cVar;
        this.f259216a = i;
        this.f259219d = str2;
        this.f259228m = System.currentTimeMillis();
        this.f259232q = z;
        this.f259233r = z2;
        this.f259236u = z4;
        this.f259234s = z3;
        this.f259238w = str3;
        this.f259239x = i2;
        this.f259240y = str4;
        this.f259241z = z5;
        this.f259215A = z6;
    }

    /* renamed from: a */
    public C90291h.C90294c mo124517a() {
        return this.f259220e;
    }

    /* renamed from: b */
    public int mo124518b() {
        return this.f259223h;
    }

    /* renamed from: c */
    public int mo124519c() {
        return (int) (System.currentTimeMillis() - this.f259228m);
    }

    /* renamed from: d */
    public long mo124520d() {
        byte[] bArr = this.f259217b;
        if (bArr != null) {
            return (long) bArr.length;
        }
        return 0;
    }

    /* renamed from: e */
    public ArrayList<String> mo124521e() {
        return this.f259222g;
    }

    /* renamed from: f */
    public String mo124522f() {
        return this.f259229n;
    }

    /* renamed from: g */
    public Map<String, String> mo124523g() {
        return this.f259221f;
    }

    /* renamed from: h */
    public String mo124524h() {
        return this.f259219d;
    }

    /* renamed from: i */
    public byte[] mo124525i() {
        return this.f259217b;
    }

    /* renamed from: j */
    public String mo124526j() {
        return this.f259224i;
    }

    /* renamed from: k */
    public String mo124527k() {
        return this.f259225j;
    }

    /* renamed from: l */
    public int mo124528l() {
        return this.f259216a;
    }

    /* renamed from: m */
    public String mo124529m() {
        return this.f259218c;
    }

    /* renamed from: n */
    public void mo124530n(int i) {
        this.f259223h = i;
    }

    /* renamed from: o */
    public void mo124531o(HttpURLConnection httpURLConnection) {
        this.f259226k = httpURLConnection;
    }

    /* renamed from: p */
    public void mo124532p(String str) {
        this.f259218c = str;
    }
}
