package w33;

import c30.C104289g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.HashMap;
import java.util.NoSuchElementException;
import l33.C109247e;
import sx3.C110823p;
import x33.C112039b;

/* renamed from: w33.b */
public final class C111717b {

    /* renamed from: a */
    public HashMap<String, C112039b.C112040a> f334411a = new HashMap<>();

    /* renamed from: b */
    public HashMap<String, C112039b.C112040a> f334412b = new HashMap<>();

    /* renamed from: c */
    public String f334413c;

    /* renamed from: d */
    public String f334414d;

    /* renamed from: e */
    public int f334415e;

    /* renamed from: f */
    public int f334416f;

    /* renamed from: g */
    public int[] f334417g = new int[2];

    /* renamed from: h */
    public long[] f334418h = new long[2];

    /* renamed from: i */
    public long f334419i;

    /* renamed from: j */
    public long f334420j;

    /* renamed from: a */
    public final void mo163393a() {
        Log.m105924i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame happened");
        long j = C109247e.vx0().f333458r;
        C112039b.C112040a aVar = this.f334412b.get("EncoderSourceTimeoutNotFrame");
        if (aVar == null) {
            aVar = new C112039b.C112040a();
        }
        aVar.f335401a = "EncoderSourceTimeoutNotFrame";
        aVar.mo163760d(Util.milliSecondsToNow(j));
        this.f334412b.put("EncoderSourceTimeoutNotFrame", aVar);
    }

    /* renamed from: b */
    public final void mo163394b(long j) {
        Log.m105924i("MicroMsg.VoIPEncoderReport", "timeoutEncodeNoFrame resume cost " + j);
        C112039b.C112040a aVar = this.f334412b.get("EncoderSourceTimeoutNotFrame");
        if (aVar != null) {
            aVar.mo163761e(j);
            aVar.f335404d = j;
            aVar.f335402b++;
        }
    }

    /* renamed from: c */
    public final String mo163395c() {
        C104289g gVar = new C104289g();
        int[] iArr = this.f334417g;
        if (iArr != null) {
            gVar.mo145953n("max", C110823p.m150975A(iArr));
            gVar.mo145953n("min", C110823p.m150988N(iArr));
            gVar.mo145953n("avg", this.f334415e);
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "json.toString()");
        return gVar2;
    }

    /* renamed from: d */
    public final String mo163396d() {
        C104289g gVar = new C104289g();
        long[] jArr = this.f334418h;
        if (jArr != null) {
            boolean z = true;
            if (!(jArr.length == 0)) {
                gVar.mo145954o("max", jArr[0]);
                if (jArr.length != 0) {
                    z = false;
                }
                if (!z) {
                    gVar.mo145954o("min", jArr[jArr.length - 1]);
                    gVar.mo145954o("avg", this.f334420j);
                } else {
                    throw new NoSuchElementException("Array is empty.");
                }
            } else {
                throw new NoSuchElementException("Array is empty.");
            }
        }
        String gVar2 = gVar.toString();
        C87412m.m108593f(gVar2, "json.toString()");
        return gVar2;
    }
}
