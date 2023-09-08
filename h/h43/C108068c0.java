package h43;

import android.opengl.GLES20;
import g43.C107730b;
import gy3.C8480h;

/* renamed from: h43.c0 */
public class C108068c0 extends C108109r0 {

    /* renamed from: L */
    public boolean f323597L;

    /* renamed from: M */
    public C107730b f323598M;

    /* renamed from: N */
    public C107730b f323599N;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108068c0(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 2 : i6);
        this.f323597L = z;
        mo158470D();
    }

    /* renamed from: C */
    public void mo158469C(boolean z) {
        if (this.f323597L != z) {
            this.f323597L = z;
            mo158470D();
        }
    }

    /* renamed from: D */
    public final void mo158470D() {
        if (this.f323597L) {
            if (this.f323599N == null) {
                this.f323599N = new C107730b(true);
            }
        } else if (this.f323598M == null) {
            this.f323598M = new C107730b(false);
        }
    }

    /* renamed from: l */
    public void mo158471l() {
        C107730b bVar = this.f323599N;
        if (bVar != null) {
            GLES20.glDeleteProgram(bVar.f322369b);
        }
        C107730b bVar2 = this.f323598M;
        if (bVar2 != null) {
            GLES20.glDeleteProgram(bVar2.f322369b);
        }
        super.mo158471l();
    }

    /* renamed from: n */
    public void mo158472n() {
        if (this.f323597L) {
            C107730b bVar = this.f323599N;
            if (bVar != null) {
                bVar.mo158147a(this.f332753h, this.f332752g, this.f323723B, this.f332757l);
                return;
            }
            return;
        }
        C107730b bVar2 = this.f323598M;
        if (bVar2 != null) {
            bVar2.mo158147a(this.f332753h, this.f332752g, this.f323723B, this.f332757l);
        }
    }

    /* renamed from: y */
    public boolean mo158473y() {
        return false;
    }
}
