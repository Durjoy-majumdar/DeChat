package j71;

import a71.C91977i;
import ac3.C103355g1;
import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import gy3.C8480h;
import h81.C32735h;
import java.nio.Buffer;
import p80.C110193b;
import p80.C110194c;
import q00.C110264g;
import rh3.C101383g;
import u80.C111139a;
import z61.C112606a;

/* renamed from: j71.n */
public abstract class C108595n extends C111139a implements C98916p, C108596o {

    /* renamed from: B */
    public final int f325117B;

    /* renamed from: C */
    public final int f325118C;

    /* renamed from: D */
    public C110194c f325119D = C110193b.m149776b(true, -1);

    /* renamed from: E */
    public C112606a f325120E;

    /* renamed from: F */
    public boolean f325121F = true;

    /* renamed from: G */
    public boolean f325122G;

    /* renamed from: H */
    public C101383g f325123H;

    /* renamed from: I */
    public C111139a f325124I;

    public C108595n(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        int i7 = C91977i.f263324c;
        this.f325117B = i7;
        this.f325118C = i7;
        this.f325124I = new C108594m(i7, i7, i3, i4, 1, 1);
    }

    /* renamed from: a */
    public void mo138246a(C101383g gVar) {
        this.f325123H = gVar;
        mo159592v();
        C112606a aVar = this.f325120E;
        if (aVar != null) {
            aVar.mo164381a(gVar);
        }
    }

    /* renamed from: b */
    public C110194c mo159587b() {
        C111139a aVar = ((C108584a) this).f325047J;
        if (aVar != null) {
            return aVar.f332754i;
        }
        return null;
    }

    /* renamed from: c */
    public void mo138247c() {
        this.f325121F = false;
        C112606a aVar = this.f325120E;
        if (aVar != null) {
            aVar.mo164382b();
        }
        this.f325120E = null;
    }

    /* renamed from: d */
    public void mo138248d() {
        this.f325121F = true;
    }

    /* renamed from: e */
    public void mo138249e(boolean z) {
        this.f325122G = z;
        mo159592v();
        C112606a aVar = this.f325120E;
        if (aVar != null) {
            aVar.mo164383c(z);
        }
    }

    /* renamed from: l */
    public void mo158471l() {
        super.mo158471l();
        C110194c cVar = this.f325119D;
        if (cVar != null) {
            cVar.close();
        }
        C111139a aVar = this.f325124I;
        if (aVar != null) {
            aVar.mo158471l();
        }
        C112606a aVar2 = this.f325120E;
        if (aVar2 != null) {
            aVar2.mo164382b();
        }
        this.f325120E = null;
    }

    /* renamed from: n */
    public void mo158472n() {
        int i;
        C108584a aVar = (C108584a) this;
        C111139a aVar2 = aVar.f325047J;
        if (aVar2 != null) {
            aVar2.mo143263u(this.f332746a, this.f332747b);
        }
        C111139a aVar3 = aVar.f325047J;
        if (aVar3 != null) {
            aVar3.f332758m = this.f332758m;
        }
        if (aVar3 != null) {
            aVar3.f332760o = this.f332760o;
        }
        int i2 = 0;
        if (aVar3 != null) {
            aVar3.mo162879m();
            C110194c cVar = aVar3.f332754i;
            i = cVar != null ? cVar.f329652e : -1;
        } else {
            i = 0;
        }
        mo159592v();
        C112606a aVar4 = this.f325120E;
        if (aVar4 != null) {
            int i3 = this.f325117B;
            int i4 = this.f325118C;
            aVar4.f337217c = i3;
            aVar4.f337218d = i4;
            C103355g1 g1Var = aVar4.f337219e;
            if (g1Var != null) {
                g1Var.mo143224C(i3, i4);
            }
            aVar4.f337215a = i;
            long currentTicks = Util.currentTicks();
            try {
                if (!aVar4.f337221g) {
                    GLES20.glBindFramebuffer(36160, aVar4.f337220f);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, aVar4.f337215a, 0);
                    int i5 = aVar4.f337216b;
                    int i6 = aVar4.f337217c;
                    int i7 = aVar4.f337218d;
                    GLES20.glBindTexture(3553, i5);
                    GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i6, i7, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindTexture(3553, aVar4.f337216b);
                    GLES20.glCopyTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, 0, 0, aVar4.f337217c, aVar4.f337218d, 0);
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                } else {
                    C103355g1 g1Var2 = aVar4.f337219e;
                    if (g1Var2 != null) {
                        C110264g.C110265b.m149906a(g1Var2, aVar4.f337215a, 0, false, 6, (Object) null);
                    }
                    int i8 = aVar4.f337216b;
                    int i9 = aVar4.f337217c;
                    int i15 = aVar4.f337218d;
                    GLES20.glBindTexture(3553, i8);
                    GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i9, i15, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                    GLES20.glBindTexture(3553, 0);
                    C103355g1 g1Var3 = aVar4.f337219e;
                    if (g1Var3 != null) {
                        C110264g.C110265b.m149907b(g1Var3, aVar4.f337215a, aVar4.f337216b, 0, 0, false, false, false, 124, (Object) null);
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    Log.m105919d("MicroMsg.EmojiFilterProcess", "filterProcess: cost %s", Long.valueOf(Util.ticksToNow(currentTicks)));
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e, "filterProcess error", new Object[0]);
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkDrawFailed");
                C115669n.INSTANCE.mo175913w(1012, 14, 1);
            }
        }
        C110194c cVar2 = this.f325119D;
        if (cVar2 != null) {
            i2 = cVar2.f329652e;
        }
        C111139a aVar5 = this.f325124I;
        if (aVar5 != null) {
            ((C108594m) aVar5).f325116K = i2;
        }
        if (aVar5 != null) {
            aVar5.mo162879m();
        }
    }

    /* renamed from: v */
    public final void mo159592v() {
        int i;
        C111139a aVar = ((C108584a) this).f325047J;
        if (aVar != null) {
            C110194c cVar = aVar.f332754i;
            i = cVar != null ? cVar.f329652e : -1;
        } else {
            i = 0;
        }
        if (this.f325120E == null && this.f325121F) {
            C112606a aVar2 = new C112606a();
            this.f325120E = aVar2;
            C110194c cVar2 = this.f325119D;
            int i2 = cVar2 != null ? cVar2.f329652e : 0;
            Class cls = C32735h.class;
            aVar2.f337215a = i;
            aVar2.f337216b = i2;
            try {
                Log.m105925i("MicroMsg.EmojiFilterProcess", "initial %s, %d, " + aVar2.f337221g, aVar2, Long.valueOf(Thread.currentThread().getId()));
                C103355g1 g1Var = new C103355g1(0, false, false, false, false, false, C110264g.C47730a.APP_ZPBQ, 61, (C8480h) null);
                aVar2.f337219e = g1Var;
                g1Var.f304775D.f194705d = 5;
                int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_skin_smooth_weight, -1);
                int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_skin_bright_weight, -1);
                int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_eye_bigger_weight, -1);
                int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_eye_bright_weight, -1);
                int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_face_thin_weight, -1);
                Log.m105925i("MicroMsg.EmojiFilterProcess", "Face beauty config: skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", Integer.valueOf(Qe), Integer.valueOf(Qe2), Integer.valueOf(Qe3), Integer.valueOf(Qe4), Integer.valueOf(Qe5));
                C103355g1 g1Var2 = aVar2.f337219e;
                if (g1Var2 != null) {
                    g1Var2.mo143227G(Qe, Qe3, Qe5, Qe2, Qe4);
                }
                C103355g1 g1Var3 = aVar2.f337219e;
                if (g1Var3 != null) {
                    g1Var3.mo143229I(true);
                }
                C103355g1 g1Var4 = aVar2.f337219e;
                if (g1Var4 != null) {
                    g1Var4.mo143233a(false);
                }
                C103355g1 g1Var5 = aVar2.f337219e;
                if (g1Var5 != null) {
                    g1Var5.mo143223B();
                }
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                int i3 = iArr[0];
                if (i3 == 0) {
                    Log.m105920e("MicroMsg.EmojiCaptureGLUtil", "gen frame buffer error");
                    i3 = 0;
                }
                aVar2.f337220f = i3;
                Log.m105919d("MicroMsg.EmojiFilterProcess", "initial end %s", aVar2);
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e, "initial error", new Object[0]);
                Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkInitFailed");
                C115669n.INSTANCE.mo175913w(1012, 13, 1);
            }
            C112606a aVar3 = this.f325120E;
            if (aVar3 != null) {
                aVar3.mo164383c(this.f325122G);
            }
            C112606a aVar4 = this.f325120E;
            if (aVar4 != null) {
                aVar4.mo164381a(this.f325123H);
            }
        }
    }
}
