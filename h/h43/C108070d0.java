package h43;

import android.opengl.GLES20;
import android.util.Size;
import g43.C107730b;
import gy3.C8480h;

/* renamed from: h43.d0 */
public final class C108070d0 extends C108109r0 {

    /* renamed from: L */
    public boolean f323601L;

    /* renamed from: M */
    public C107730b f323602M;

    /* renamed from: N */
    public C107730b f323603N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108070d0(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 2 : i6);
        this.f323601L = z;
        mo158475D();
    }

    /* renamed from: C */
    public void mo158469C(boolean z) {
        if (this.f323601L != z) {
            this.f323601L = z;
            mo158475D();
        }
    }

    /* renamed from: D */
    public final void mo158475D() {
        if (this.f323601L) {
            if (this.f323602M == null) {
                this.f323602M = new C107730b(true);
            }
        } else if (this.f323603N == null) {
            this.f323603N = new C107730b(false);
        }
    }

    /* renamed from: l */
    public void mo158471l() {
        C107730b bVar = this.f323602M;
        if (bVar != null) {
            GLES20.glDeleteProgram(bVar.f322369b);
        }
        C107730b bVar2 = this.f323603N;
        if (bVar2 != null) {
            GLES20.glDeleteProgram(bVar2.f322369b);
        }
        super.mo158471l();
    }

    /* renamed from: n */
    public void mo158472n() {
        if (this.f323601L) {
            C107730b bVar = this.f323602M;
            if (bVar != null) {
                bVar.mo158147a(this.f332753h, this.f332752g, this.f323723B, this.f332757l);
                return;
            }
            return;
        }
        C107730b bVar2 = this.f323603N;
        if (bVar2 != null) {
            bVar2.mo158147a(this.f332753h, this.f332752g, this.f323723B, this.f332757l);
        }
    }

    /* renamed from: x */
    public Size mo158476x() {
        int i = this.f332758m;
        return (i == 0 || i == 180) ? new Size(this.f332746a, this.f332747b) : new Size(this.f332747b, this.f332746a);
    }
}
