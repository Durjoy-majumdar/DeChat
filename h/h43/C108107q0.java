package h43;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import e43.C107225c;
import e43.C107226d;
import g43.C107731c;
import gy3.C87412m;
import org.json.JSONArray;
import p80.C110194c;
import u80.C111139a;
import z33.C112595h;

/* renamed from: h43.q0 */
public class C108107q0 extends C111139a {

    /* renamed from: B */
    public C107731c f323712B;

    /* renamed from: C */
    public C110194c f323713C;

    /* renamed from: D */
    public C110194c f323714D;

    /* renamed from: E */
    public int f323715E = -1;

    /* renamed from: F */
    public boolean f323716F;

    /* renamed from: G */
    public int f323717G;

    /* renamed from: H */
    public int f323718H;

    /* renamed from: I */
    public boolean f323719I;

    /* renamed from: J */
    public boolean f323720J;

    public C108107q0(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        C112595h.m153922i();
    }

    /* renamed from: l */
    public void mo158471l() {
        C107226d dVar;
        super.mo158471l();
        C107731c cVar = this.f323712B;
        if (!(cVar == null || (dVar = cVar.f322374a) == null)) {
            dVar.mo157686a();
        }
        C107225c cVar2 = C107225c.f320827a;
        C107225c.f320828b = null;
        C107225c.f320829c = false;
    }

    /* renamed from: n */
    public void mo158472n() {
        int i;
        C110194c cVar;
        C107225c cVar2 = C107225c.f320827a;
        if (!C107225c.f320829c) {
            Log.m105924i("MicroMsg.VirtualBackgroundFilter", "initRenderProc");
            C107225c.f320829c = true;
            C107225c.f320830d = new JSONArray();
        }
        C110194c cVar3 = this.f323713C;
        boolean z = false;
        if ((cVar3 != null && cVar3.f329651d) || (i = this.f323715E) < 0 || !GLES20.glIsTexture(i)) {
            Log.m105920e("MicroMsg.VoipRenderProcExternalTexture", "render error externalTexture already released");
            return;
        }
        C110194c cVar4 = this.f323713C;
        if (cVar4 != null && (cVar = this.f332754i) != null) {
            if (!this.f323720J) {
                if (this.f323716F) {
                    C107731c cVar5 = this.f323712B;
                    if (cVar5 != null && cVar5.mo158148a(cVar4.f329652e, cVar, true)) {
                        z = true;
                    }
                    if (z) {
                        C107731c cVar6 = this.f323712B;
                        if (cVar6 != null) {
                            int i2 = this.f332748c;
                            int i3 = this.f332749d;
                            int i4 = cVar4.f329652e;
                            int i5 = this.f323717G;
                            int i6 = this.f323718H;
                            boolean z2 = this.f323719I;
                            C107226d dVar = cVar6.f322374a;
                            if (dVar == null) {
                                Log.m105920e("MicroMsg.YTFaceBeautyProgram", "error init filterProcessTex process and try refresh");
                            } else {
                                dVar.mo157690e(i2, i3);
                                dVar.f320831a = i4;
                                dVar.mo157687b(i5, i6, z2);
                            }
                        }
                    } else {
                        this.f323720J = true;
                    }
                } else {
                    if (C107225c.f320828b != null) {
                        if (this.f323712B == null) {
                            this.f323712B = new C107731c();
                        }
                        C107731c cVar7 = this.f323712B;
                        if (cVar7 != null && cVar7.mo158148a(cVar4.f329652e, cVar, false)) {
                            z = true;
                        }
                        if (z) {
                            C107731c cVar8 = this.f323712B;
                            if (cVar8 != null) {
                                int i7 = this.f332748c;
                                int i8 = this.f332749d;
                                int i9 = cVar4.f329652e;
                                int i15 = this.f323717G;
                                int i16 = this.f323718H;
                                boolean z3 = this.f323719I;
                                C107226d dVar2 = cVar8.f322374a;
                                if (dVar2 == null) {
                                    Log.m105920e("MicroMsg.YTFaceBeautyProgram", "error init filterProcessTex process and try refresh");
                                } else {
                                    dVar2.mo157690e(i7, i8);
                                    dVar2.f320831a = i9;
                                    dVar2.mo157687b(i15, i16, z3);
                                }
                            }
                        } else {
                            this.f323720J = true;
                        }
                    }
                }
                cVar4 = cVar;
            }
            this.f323714D = cVar4;
        }
    }

    /* renamed from: v */
    public void mo158520v(C110194c cVar) {
        C87412m.m108594g(cVar, "texture");
        this.f323713C = cVar;
        this.f323715E = cVar.f329652e;
        Log.m105924i("MicroMsg.VoipRenderProcExternalTexture", "externalGLTextureID:" + this.f323715E);
    }
}
