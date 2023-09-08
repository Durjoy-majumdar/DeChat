package p380r7;

import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.tencent.tav.coremedia.TimeUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p290a8.C16445f;
import p290a8.C16449h;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p294b7.C16747k;
import p294b7.C16748l;
import p294b7.C16750m;
import p333e8.C20541m;
import p333e8.C20549u;
import p383t7.C22444f;
import p396x6.C23015n;

/* renamed from: r7.l */
public final class C22216l implements C16741e {

    /* renamed from: g */
    public static final Pattern f62946g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f62947h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f62948a;

    /* renamed from: b */
    public final C20549u f62949b;

    /* renamed from: c */
    public final C20541m f62950c = new C20541m();

    /* renamed from: d */
    public C16743g f62951d;

    /* renamed from: e */
    public byte[] f62952e = new byte[1024];

    /* renamed from: f */
    public int f62953f;

    public C22216l(String str, C20549u uVar) {
        this.f62948a = str;
        this.f62949b = uVar;
    }

    /* renamed from: a */
    public int mo17745a(C16742f fVar, C16747k kVar) {
        Matcher matcher;
        String d;
        C16738b bVar = (C16738b) fVar;
        int i = (int) bVar.f45241b;
        int i2 = this.f62953f;
        byte[] bArr = this.f62952e;
        if (i2 == bArr.length) {
            this.f62952e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f62952e;
        int i3 = this.f62953f;
        int c = bVar.mo17735c(bArr2, i3, bArr2.length - i3);
        if (c != -1) {
            int i4 = this.f62953f + c;
            this.f62953f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        C20541m mVar = new C20541m(this.f62952e);
        try {
            C16449h.m15280c(mVar);
            long j = 0;
            long j2 = 0;
            while (true) {
                String d2 = mVar.mo32093d();
                if (TextUtils.isEmpty(d2)) {
                    while (true) {
                        String d3 = mVar.mo32093d();
                        if (d3 == null) {
                            matcher = null;
                            break;
                        } else if (C16449h.f43909a.matcher(d3).matches()) {
                            do {
                                d = mVar.mo32093d();
                                if (d == null) {
                                    break;
                                }
                            } while (d.isEmpty());
                        } else {
                            matcher = C16445f.f43894b.matcher(d3);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        mo35348d(0);
                    } else {
                        long b = C16449h.m15279b(matcher.group(1));
                        long b2 = this.f62949b.mo32131b((((j + b) - j2) * 90000) / TimeUtil.SECOND_TO_US);
                        C16750m d4 = mo35348d(b2 - b);
                        this.f62950c.mo32111v(this.f62952e, this.f62953f);
                        d4.mo17742b(this.f62950c, this.f62953f);
                        d4.mo17744d(b2, 1, this.f62953f, 0, (C16750m.C16751a) null);
                    }
                    return -1;
                } else if (d2.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f62946g.matcher(d2);
                    if (matcher2.find()) {
                        Matcher matcher3 = f62947h.matcher(d2);
                        if (matcher3.find()) {
                            j2 = C16449h.m15279b(matcher2.group(1));
                            j = (Long.parseLong(matcher3.group(1)) * TimeUtil.SECOND_TO_US) / 90000;
                        } else {
                            throw new C23015n("X-TIMESTAMP-MAP doesn't contain media timestamp: " + d2);
                        }
                    } else {
                        throw new C23015n("X-TIMESTAMP-MAP doesn't contain local timestamp: " + d2);
                    }
                }
            }
        } catch (C22444f e) {
            throw new C23015n((Throwable) e);
        }
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final C16750m mo35348d(long j) {
        C16750m o = this.f62951d.mo17752o(0, 3);
        o.mo17741a(Format.m16648i((String) null, "text/vtt", (String) null, -1, 0, this.f62948a, -1, (DrmInitData) null, j, Collections.emptyList()));
        this.f62951d.mo17751i();
        return o;
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f62951d = gVar;
        gVar.mo17750g(new C16748l.C16749a(-9223372036854775807L));
    }

    public void release() {
    }
}
