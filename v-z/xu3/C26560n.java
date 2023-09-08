package xu3;

import com.tencent.xweb.util.WXWebReporter;
import java.io.UTFDataFormatException;
import pu3.C25478i;
import pu3.C25494p;
import pu3.C25498t;
import pu3.C25499u;
import qu3.C25903a;
import yu3.C26639a;
import zu3.C26722g;

/* renamed from: xu3.n */
public class C26560n extends C26555i<C25498t> {

    /* renamed from: d */
    public C25499u.C25500a f73906d = null;

    /* renamed from: e */
    public C25499u.C25500a f73907e = null;

    /* renamed from: f */
    public C25478i.C25484f f73908f = null;

    /* renamed from: g */
    public C25478i.C25484f f73909g = null;

    public C26560n(C26639a aVar, C25478i iVar, C25478i iVar2, C26722g gVar) {
        super(aVar, iVar, gVar);
        if (iVar2 != null) {
            C25499u uVar = iVar2.f72125a;
            C25499u.C25500a aVar2 = uVar.f72167n;
            this.f73906d = aVar2;
            this.f73907e = uVar.f72155b;
            this.f73908f = iVar2.mo52716d(aVar2);
            this.f73909g = iVar2.mo52716d(this.f73907e);
        }
    }

    /* renamed from: c */
    public C25499u.C25500a mo53496c(C25478i iVar) {
        return iVar.f72125a.f72167n;
    }

    /* renamed from: d */
    public void mo53497d(C26722g gVar, int i, int i2) {
        if (i < 0) {
            gVar.getClass();
        } else {
            gVar.f74290o.mo183355b(i, true);
        }
    }

    /* renamed from: e */
    public Comparable mo53498e(C25903a aVar) {
        return aVar.mo52738q();
    }

    /* renamed from: g */
    public void mo53499g(C26722g gVar, int i, int i2, int i3, int i4) {
        if (i != i3) {
            gVar.f74276a.mo162980f(i, i3);
        }
    }

    /* renamed from: h */
    public int mo53500h(Comparable comparable) {
        int i;
        C25498t tVar = (C25498t) comparable;
        C25478i.C25484f fVar = this.f73908f;
        fVar.mo52740z(C25478i.this.f72125a.f72167n, true);
        int position = fVar.f72245a.position();
        try {
            C25494p.m32919d(fVar, tVar.f72153e.length());
            String str = tVar.f72153e;
            int length = str.length();
            long j = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                j += (charAt == 0 || charAt > 127) ? charAt <= 2047 ? 2 : 3 : 1;
            }
            byte[] bArr = new byte[((int) j)];
            int length2 = str.length();
            int i3 = 0;
            for (int i4 = 0; i4 < length2; i4++) {
                char charAt2 = str.charAt(i4);
                if (charAt2 != 0 && charAt2 <= 127) {
                    i = i3 + 1;
                    bArr[i3] = (byte) charAt2;
                } else if (charAt2 <= 2047) {
                    int i5 = i3 + 1;
                    bArr[i3] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i3 = i5 + 1;
                    bArr[i5] = (byte) ((charAt2 & '?') | 128);
                } else {
                    int i6 = i3 + 1;
                    bArr[i3] = (byte) (((charAt2 >> 12) & 15) | WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL);
                    int i7 = i6 + 1;
                    bArr[i6] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i = i7 + 1;
                    bArr[i7] = (byte) ((charAt2 & '?') | 128);
                }
                i3 = i;
            }
            fVar.mo52792u(bArr);
            fVar.mo52789o(0);
            this.f73909g.mo52793v(position);
            this.f73906d.f72182f++;
            this.f73907e.f72182f++;
            return position;
        } catch (UTFDataFormatException e) {
            throw new AssertionError(e);
        }
    }
}
