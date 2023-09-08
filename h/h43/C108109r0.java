package h43;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.nio.ByteBuffer;
import l33.C109247e;
import p80.C110194c;
import u80.C111139a;
import w80.C111744e;
import z04.C112550d0;
import z33.C112595h;

/* renamed from: h43.r0 */
public abstract class C108109r0 extends C111139a {

    /* renamed from: K */
    public static final String f323722K;

    /* renamed from: B */
    public int f323723B = -1;

    /* renamed from: C */
    public C110194c f323724C;

    /* renamed from: D */
    public int f323725D;

    /* renamed from: E */
    public int f323726E;

    /* renamed from: F */
    public int f323727F;

    /* renamed from: G */
    public int f323728G;

    /* renamed from: H */
    public boolean f323729H;

    /* renamed from: I */
    public boolean f323730I;

    /* renamed from: J */
    public boolean f323731J;

    /* renamed from: h43.r0$a */
    public static final class C108110a {
        public C108110a(C8480h hVar) {
        }
    }

    static {
        C108110a aVar = new C108110a((C8480h) null);
        f323722K = "MicroMsg.VoipTextureRenderProcTexture@" + aVar.hashCode();
    }

    public C108109r0(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        String e = C111744e.f334654d.mo163482e();
        this.f323730I = e != null ? C112550d0.m153801u(e, "Imagination Technologies", false) : false;
        this.f323731J = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_render_imagination_delay, false);
    }

    /* renamed from: A */
    public void mo158477A(int i) {
    }

    /* renamed from: B */
    public void mo158478B(int i) {
    }

    /* renamed from: C */
    public void mo158469C(boolean z) {
    }

    /* renamed from: g */
    public void mo158521g() {
        boolean z;
        if (mo158473y()) {
            if (!this.f323729H || (z && (!(z = this.f323730I) || !this.f323731J))) {
                super.mo158522s(this.f323727F, this.f323728G);
            } else {
                String str = f323722K;
                Log.m105918d(str, "firstDraw, (" + this.f323725D + ", " + this.f323726E + ") => (" + this.f323727F + ", " + this.f323728G + ')');
                super.mo158522s(this.f323725D, this.f323726E);
            }
            this.f323729H = false;
        }
        super.mo158521g();
    }

    /* renamed from: s */
    public void mo158522s(int i, int i2) {
        if (mo158473y() && !(i == this.f323727F && i2 == this.f323728G)) {
            int i3 = this.f332748c;
            this.f323725D = i3;
            int i4 = this.f332749d;
            this.f323726E = i4;
            this.f323727F = i;
            this.f323728G = i2;
            this.f323729H = (i3 == 0 || i4 == 0 || (i == i3 && i2 == i4)) ? false : true;
        }
        super.mo158522s(i, i2);
    }

    /* renamed from: v */
    public void mo158480v(ByteBuffer byteBuffer, int i, int i2) {
        C87412m.m108594g(byteBuffer, "pBuff");
    }

    /* renamed from: w */
    public void mo158481w(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, "pBuff");
    }

    /* renamed from: x */
    public Size mo158476x() {
        return new Size(this.f332746a, this.f332747b);
    }

    /* renamed from: y */
    public boolean mo158473y() {
        return C112595h.f337167b && C109247e.vx0().f333452l;
    }

    /* renamed from: z */
    public void mo158482z(int i) {
    }
}
