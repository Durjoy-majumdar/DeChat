package ob0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114773i;
import com.tencent.p014mm.network.C114778k;
import com.tencent.p014mm.network.C114789o;
import com.tencent.p014mm.network.C114800v;
import com.tencent.p014mm.network.C26882h;
import com.tencent.p014mm.network.C40377j;
import com.tencent.p014mm.network.C40384w;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.network.C81040l;
import com.tencent.p014mm.network.C81044x;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ee0.C31566b;
import java.util.List;
import qe3.C89619a1;

/* renamed from: ob0.g0 */
public class C27640g0 implements C114770g {

    /* renamed from: d */
    public final C26882h f76557d;

    /* renamed from: e */
    public C27639f0 f76558e;

    public C27640g0(C26882h hVar) {
        this.f76557d = hVar;
    }

    /* renamed from: A3 */
    public C81039e mo55443A3() {
        try {
            if (this.f76558e == null) {
                this.f76558e = new C27639f0(this.f76557d.mo54136A3());
            }
            return this.f76558e;
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "getAccInfo failed, core service down, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: B3 */
    public void mo55444B3(long j, long j2) {
        try {
            this.f76557d.mo54137B3(j, j2);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: D5 */
    public void mo55445D5() {
        try {
            this.f76557d.mo54138D5();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: E5 */
    public String[] mo55446E5(boolean z) {
        try {
            return this.f76557d.mo54139E5(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: F3 */
    public String[] mo55447F3() {
        try {
            return this.f76557d.mo54140F3();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: H0 */
    public long mo55448H0() {
        try {
            return this.f76557d.mo54141H0();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return 0;
        }
    }

    /* renamed from: H1 */
    public void mo55449H1(String str) {
        try {
            this.f76557d.mo54142H1(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: I4 */
    public void mo55450I4() {
        try {
            this.f76557d.mo54143I4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: J3 */
    public void mo55451J3(C31566b bVar) {
        try {
            this.f76557d.mo54144J3(bVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: J4 */
    public void mo55452J4(boolean z) {
        try {
            this.f76557d.mo54145J4(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: O0 */
    public int mo55453O0(String str, int i, int i2, int i3, int i4, byte[] bArr, byte[] bArr2, C40384w wVar) {
        try {
            return this.f76557d.mo54146O0(str, i, i2, i3, i4, bArr, bArr2, wVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: O4 */
    public void mo55454O4(String str) {
        try {
            this.f76557d.mo54147O4(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Q */
    public void mo55455Q() {
        try {
            this.f76557d.mo54148Q();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Q2 */
    public void mo55456Q2(C114778k kVar) {
        try {
            this.f76557d.mo54149Q2(kVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Q4 */
    public String mo55457Q4() {
        try {
            return this.f76557d.mo54150Q4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: S1 */
    public int mo55458S1(int[] iArr, boolean z, long j, int i, int i2, String str) {
        try {
            return this.f76557d.mo54151S1(iArr, z, j, i, i2, str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: S4 */
    public String mo55459S4() {
        try {
            return this.f76557d.mo54152S4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "query remote network server ip failed, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: T0 */
    public void mo55460T0(boolean z) {
        try {
            this.f76557d.mo54153T0(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "change active status failed, core service down, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: T2 */
    public void mo55461T2(C40377j jVar) {
        try {
            this.f76557d.mo54154T2(jVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: T4 */
    public int mo55462T4(String str, boolean z, List<String> list) {
        try {
            return this.f76557d.mo54155T4(str, z, list);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: U2 */
    public void mo55463U2(int i) {
        try {
            this.f76557d.mo54156U2(i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "cancel remote rr failed, netid=%d, %s", Integer.valueOf(i), e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Y5 */
    public void mo55464Y5(String str, String str2, String str3) {
        try {
            this.f76557d.mo54157Y5(str, str2, str3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: Z5 */
    public C81040l mo55465Z5() {
        try {
            return this.f76557d.yu0();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: a */
    public void mo55466a(C81044x xVar) {
        try {
            this.f76557d.hi0(xVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: a4 */
    public int mo55467a4(C114800v vVar, C114789o oVar) {
        try {
            return this.f76557d.mo54158a4(vVar, oVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "remote dispatcher lost, send failed, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: b3 */
    public void mo55468b3(boolean z) {
        try {
            this.f76557d.mo54159b3(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: c4 */
    public void mo55469c4() {
        try {
            this.f76557d.mo54160c4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: d4 */
    public void mo55470d4(boolean z) {
        try {
            this.f76557d.mo54161d4(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: e4 */
    public void mo55471e4(boolean z) {
        try {
            this.f76557d.mo54162e4(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: e5 */
    public void mo55472e5(String[] strArr, String[] strArr2, int[] iArr) {
        try {
            this.f76557d.mo54163e5(strArr, strArr2, iArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: f0 */
    public void mo55473f0(String str) {
        try {
            this.f76557d.mo54164f0(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "ipxxStatistics remote call error, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: g0 */
    public void mo55474g0(String str) {
        try {
            this.f76557d.mo54165g0(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: g5 */
    public int mo55475g5(String str, long j, int i) {
        try {
            return this.f76557d.mo54166g5(str, j, i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: h1 */
    public boolean mo55476h1() {
        try {
            return this.f76557d.mo54167h1();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "core service down, guess network stable, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return true;
        }
    }

    /* renamed from: i2 */
    public void mo55477i2(C114773i iVar) {
        try {
            this.f76557d.mo54169i2(iVar);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: i5 */
    public String[] mo55478i5(String str) {
        try {
            return this.f76557d.mo54170i5(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: j0 */
    public void mo55479j0(boolean z) {
        try {
            this.f76557d.mo54171j0(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: j3 */
    public void mo55480j3(String str, String str2, int i) {
        try {
            this.f76557d.mo54172j3(str, str2, i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: k1 */
    public void mo55481k1(String[] strArr, String[] strArr2, int[] iArr) {
        try {
            this.f76557d.mo54173k1(strArr, strArr2, iArr);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: l3 */
    public void mo55482l3(boolean z) {
        try {
            this.f76557d.mo54174l3(z);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: n1 */
    public void mo55483n1(boolean z, String str, String str2, int[] iArr, int[] iArr2, int i, int i2, String str3, String str4) {
        try {
            this.f76557d.mo54175n1(z, str, str2, iArr, iArr2, i, i2, str3, str4);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "dkidc setIDCHostInfo ip failed, core service down, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: n3 */
    public void mo55484n3(C89619a1 a1Var) {
        try {
            this.f76557d.mo54176n3(a1Var);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: n4 */
    public void mo55485n4(int i) {
        try {
            this.f76557d.mo54177n4(i);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: o4 */
    public int mo55486o4() {
        try {
            return this.f76557d.mo54178o4();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return 1;
        }
    }

    /* renamed from: q */
    public void mo55487q() {
        try {
            this.f76557d.mo54179q();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: r3 */
    public void mo55488r3() {
        try {
            this.f76557d.mo54180r3();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    public void reset() {
        try {
            this.f76557d.reset();
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "reset failed, core service down, %s", e);
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: s5 */
    public void mo55490s5(String str) {
        try {
            this.f76557d.mo54182s5(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: t0 */
    public void mo55491t0(String str) {
        try {
            this.f76557d.mo54183t0(str);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
        }
    }

    /* renamed from: v5 */
    public int mo55492v5(String str, int i, long j, String str2, String str3) {
        try {
            return this.f76557d.mo54184v5(str, i, j, str2, str3);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }

    /* renamed from: w3 */
    public int mo55493w3(String str, List<String> list) {
        try {
            return this.f76557d.mo54185w3(str, list);
        } catch (Exception e) {
            Log.m105921e("MicroMsg.RDispatcher", "exception:%s", Util.stackTraceToString(e));
            return -1;
        }
    }
}
