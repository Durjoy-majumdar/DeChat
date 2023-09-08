package e43;

import ac3.C103355g1;
import android.opengl.GLES20;
import c30.C104289g;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.plugin.xlabeffect.XEffectConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.wxmm.v2helper;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import java.nio.Buffer;
import org.json.JSONObject;
import p80.C110194c;
import q00.C110264g;
import z04.C66725r;
import z33.C112595h;

/* renamed from: e43.d */
public final class C107226d {

    /* renamed from: a */
    public int f320831a;

    /* renamed from: b */
    public C110194c f320832b;

    /* renamed from: c */
    public int f320833c;

    /* renamed from: d */
    public int f320834d;

    /* renamed from: e */
    public C103355g1 f320835e;

    /* renamed from: f */
    public boolean f320836f;

    /* renamed from: g */
    public boolean f320837g = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_voip_virtual_background_use_gpu, false);

    /* renamed from: h */
    public XEffectConfig f320838h;

    public C107226d() {
        C112595h hVar = C112595h.f337166a;
        String I = C86709a0.m107535s().mo121142i().mo119675I(C72994y1.C72995a.USERINFO_VOIP_FACEBEAUTY_CUSTOM_STRING, "");
        this.f320838h = C87412m.m108589b(I, "") ? C112595h.m153925l() : new XEffectConfig((JSONObject) new C104289g(I));
    }

    /* renamed from: a */
    public final void mo157686a() {
        Log.m105925i("MicroMsg.VoipFilterProcessTex", "clear %s %d", this, Long.valueOf(Thread.currentThread().getId()));
        try {
            C110194c cVar = this.f320832b;
            if (cVar != null) {
                cVar.close();
            }
            C103355g1 g1Var = this.f320835e;
            if (g1Var != null) {
                C87412m.m108591d(g1Var);
                g1Var.destroy();
                this.f320835e = null;
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoipFilterProcessTex", e, "clear error: %s", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo157687b(int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        long currentTicks = Util.currentTicks();
        if (z) {
            try {
                i3 = ((i4 + v2helper.VOIP_ENC_HEIGHT_LV1) - i2) % v2helper.VOIP_ENC_HEIGHT_LV1;
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.VoipFilterProcessTex", e, "filterProcess error", new Object[0]);
            }
        } else {
            i3 = (i4 + i2) % v2helper.VOIP_ENC_HEIGHT_LV1;
        }
        int i5 = i3;
        C107225c cVar = C107225c.f320827a;
        C103355g1 g1Var = this.f320835e;
        C87412m.m108591d(g1Var);
        C110264g.C110266c cVar2 = C107225c.f320828b;
        if (cVar2 != null) {
            g1Var.mo143230J(true, 1.0f, cVar2);
        } else {
            g1Var.mo143230J(false, 1.0f, C110264g.C110266c.SEGMENT_NONE);
        }
        C103355g1 g1Var2 = this.f320835e;
        if (g1Var2 != null) {
            C110264g.C110265b.m149906a(g1Var2, this.f320831a, i5, false, 4, (Object) null);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        C110194c cVar3 = this.f320832b;
        if (cVar3 != null) {
            cVar3.mo161594a(this.f320833c, this.f320834d, NativeBitmapStruct.GLFormat.GL_RGBA, (Buffer) null, 9729, 10497);
        }
        GLES20.glViewport(0, 0, this.f320833c, this.f320834d);
        C103355g1 g1Var3 = this.f320835e;
        if (g1Var3 != null) {
            int i6 = this.f320831a;
            C110194c cVar4 = this.f320832b;
            C87412m.m108591d(cVar4);
            g1Var3.mo143225D(i6, cVar4.f329652e, 0, 360 - i5, i5, true, false, false, this.f320833c, this.f320834d);
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glBindTexture(3553, 0);
        Log.m105919d("MicroMsg.VoipFilterProcessTex", "filterProcess: cost %s", Long.valueOf(Util.ticksToNow(currentTicks)));
    }

    /* renamed from: c */
    public final boolean mo157688c(int i, C110194c cVar, boolean z) {
        C110194c cVar2 = cVar;
        Class cls = C32735h.class;
        C87412m.m108594g(cVar2, "outputTexture");
        try {
            Log.m105925i("MicroMsg.VoipFilterProcessTex", ">>initial %s, %d, beauytParams:%s, runWithGPU:%b", this, Long.valueOf(Thread.currentThread().getId()), 1, Boolean.valueOf(this.f320837g));
            if (this.f320835e != null) {
                Log.m105928w("MicroMsg.VoipFilterProcessTex", "initial xLabEffect: again");
                C103355g1 g1Var = this.f320835e;
                C87412m.m108591d(g1Var);
                g1Var.destroy();
            }
            C103355g1 g1Var2 = new C103355g1(1, false, z, true, this.f320837g, true, C110264g.C47730a.APP_VOIP, 2, (C8480h) null);
            this.f320835e = g1Var2;
            if (!(g1Var2.f304784d != 0)) {
                Log.m105920e("MicroMsg.VoipFilterProcessTex", "init x3dHandle failed and stop render");
                mo157686a();
                return false;
            }
            g1Var2.mo143233a(false);
            C103355g1 g1Var3 = this.f320835e;
            C87412m.m108591d(g1Var3);
            g1Var3.f304775D.f194705d = 4;
            int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_lut_color_weight, 0);
            int Qe2 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_skin_smooth_weight, -1);
            int Qe3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_skin_bright_weight, -1);
            int Qe4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_eye_bigger_weight, -1);
            int Qe5 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_eye_bright_weight, -1);
            int Qe6 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.wevis_android_voip_face_thin_weight, -1);
            Log.m105925i("MicroMsg.VoipFilterProcessTex", "Face beauty config: lutWeight: %d, skinSmooth: %d, skinBright: %d, eyeMorph: %d, eyeBright: %d, faceMorph: %d", Integer.valueOf(Qe), Integer.valueOf(Qe2), Integer.valueOf(Qe3), Integer.valueOf(Qe4), Integer.valueOf(Qe5), Integer.valueOf(Qe6));
            C103355g1 g1Var4 = this.f320835e;
            if (g1Var4 != null) {
                g1Var4.mo143227G(Qe2, Qe4, Qe6, Qe3, Qe5);
            }
            Boolean bool = Boolean.FALSE;
            Log.m105925i("MicroMsg.VoipFilterProcessTex", "initial, needSkin:%s, needShape:%s, needFilter:%s", Boolean.TRUE, bool, bool);
            C103355g1 g1Var5 = this.f320835e;
            C87412m.m108591d(g1Var5);
            g1Var5.mo143253t(0, g1Var5.f304795o[0]);
            C103355g1 g1Var6 = this.f320835e;
            if (g1Var6 != null) {
                g1Var6.mo143223B();
            }
            this.f320831a = i;
            this.f320832b = cVar2;
            this.f320836f = true;
            Log.m105919d("MicroMsg.VoipFilterProcessTex", "initial end %s", this);
            return true;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.VoipFilterProcessTex", e, "initial error", new Object[0]);
        }
    }

    /* renamed from: d */
    public final void mo157689d() {
        C103355g1 g1Var = this.f320835e;
        if (g1Var != null) {
            g1Var.mo143252s(this.f320838h);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("set beauty config ");
        XEffectConfig xEffectConfig = this.f320838h;
        xEffectConfig.getClass();
        sb.append(C66725r.m78728b("\n               enableBeautify:" + xEffectConfig.f318441e + "\n               enableFilter:" + xEffectConfig.f318442f + "\n               skinSmooth:" + xEffectConfig.f318443g + "\n               eyeMorph:" + xEffectConfig.f318444h + "\n               faceMorph:" + xEffectConfig.f318445i + "\n               skinBright:" + xEffectConfig.f318446j + "\n               eyeBright:" + xEffectConfig.f318447n + "\n               rosy:" + xEffectConfig.f318448o + "\n               eyePouch:" + xEffectConfig.f318449p + "\n               smileFolds:" + xEffectConfig.f318450q + "\n               sharpen" + xEffectConfig.f318451r + "\n               teethBright" + xEffectConfig.f318452s + "\n               smallHead:" + xEffectConfig.f318453t + "\n               cheekBone:" + xEffectConfig.f318454u + "\n               lowerJawbone:" + xEffectConfig.f318455v + "\n               wingOfNose:" + xEffectConfig.f318456w + "\n               chinShort:" + xEffectConfig.f318457x + "\n               hairLineHigh:" + xEffectConfig.f318459z + "\n               hairLineLow:" + xEffectConfig.f318431A + "\n               bigEye:" + xEffectConfig.f318432B + "\n               boySlim:" + xEffectConfig.f318433C + "\n               girlSlim:" + xEffectConfig.f318434D + "\n               mouthMorph:" + xEffectConfig.f318435E + "\n               zhaiLian:" + xEffectConfig.f318436F + "\n               contour:" + xEffectConfig.f318437G + "\n               filterRate:" + xEffectConfig.f318438H + "\n               "));
        Log.m105924i("MicroMsg.VoipFilterProcessTex", sb.toString());
    }

    /* renamed from: e */
    public final void mo157690e(int i, int i2) {
        if (!(i2 == this.f320834d && i == this.f320833c)) {
            Log.m105925i("MicroMsg.VoipFilterProcessTex", "updateTextureSize:%s, %s", Integer.valueOf(i), Integer.valueOf(i2));
        }
        this.f320833c = i;
        this.f320834d = i2;
        C103355g1 g1Var = this.f320835e;
        if (g1Var != null) {
            g1Var.mo143224C(i, i2);
        }
    }
}
