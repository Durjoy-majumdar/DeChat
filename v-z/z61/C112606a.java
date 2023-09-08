package z61;

import ac3.C103355g1;
import android.opengl.GLES20;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import gy3.C87412m;
import rh3.C101383g;

/* renamed from: z61.a */
public final class C112606a {

    /* renamed from: a */
    public int f337215a;

    /* renamed from: b */
    public int f337216b;

    /* renamed from: c */
    public int f337217c;

    /* renamed from: d */
    public int f337218d;

    /* renamed from: e */
    public C103355g1 f337219e;

    /* renamed from: f */
    public int f337220f;

    /* renamed from: g */
    public boolean f337221g = MultiProcessMMKV.getMMKV("xlab_effect_config").getBoolean("effect", true);

    /* renamed from: h */
    public String f337222h;

    /* renamed from: a */
    public final void mo164381a(C101383g gVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("changeSticker: ");
        sb.append(this.f337222h);
        sb.append(", ");
        String str = null;
        sb.append(gVar != null ? gVar.f296976a : null);
        Log.m105924i("MicroMsg.EmojiFilterProcess", sb.toString());
        if (!C87412m.m108589b(this.f337222h, gVar != null ? gVar.f296976a : null)) {
            if (gVar != null) {
                str = gVar.f296976a;
            }
            this.f337222h = str;
            C103355g1 g1Var = this.f337219e;
            if (g1Var != null) {
                g1Var.mo143257x(gVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo164382b() {
        Log.m105925i("MicroMsg.EmojiFilterProcess", "clear %s %d", this, Long.valueOf(Thread.currentThread().getId()));
        try {
            GLES20.glDeleteFramebuffers(1, new int[]{this.f337220f}, 0);
            C103355g1 g1Var = this.f337219e;
            if (g1Var != null) {
                g1Var.destroy();
            }
            this.f337219e = null;
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.EmojiFilterProcess", e, "clear error: %s", e.getMessage());
            Log.m105924i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markSdkReleaseFailed");
            C115669n.INSTANCE.mo175913w(1012, 15, 1);
        }
    }

    /* renamed from: c */
    public final void mo164383c(boolean z) {
        Log.m105924i("MicroMsg.EmojiFilterProcess", "setRemoveBg: " + z);
        C103355g1 g1Var = this.f337219e;
        if (g1Var != null) {
            g1Var.mo143233a(z);
        }
    }
}
