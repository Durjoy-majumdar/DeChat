package com.tencent.p014mm.pluginsdk.model;

import bp3.C104160f;
import bp3.C79758p;
import com.tencent.p014mm.modelcontrol.VideoTransPara;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sight.base.C94554a;
import com.tencent.p014mm.plugin.sight.base.C94555d;
import com.tencent.p014mm.plugin.sight.base.SightVideoJNI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fy3.C32226l;
import gy3.C8477a0;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import hd0.C32813d;
import hd0.C32816e;
import hd0.C32831w;
import hd0.C98390b;
import hd0.C98392c;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: com.tencent.mm.pluginsdk.model.v0 */
public final class C96794v0 {

    /* renamed from: a */
    public static final C96794v0 f283568a = new C96794v0();

    /* renamed from: com.tencent.mm.pluginsdk.model.v0$a */
    public static final class C96795a extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f283569d;

        /* renamed from: e */
        public final /* synthetic */ Object f283570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C96795a(C8477a0 a0Var, Object obj) {
            super(1);
            this.f283569d = a0Var;
            this.f283570e = obj;
        }

        public Object invoke(Object obj) {
            this.f283569d.f27482d = ((Boolean) obj).booleanValue();
            Object obj2 = this.f283570e;
            synchronized (obj2) {
                try {
                    obj2.notifyAll();
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.ImportVideoTransfer", e, "", new Object[0]);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: b */
    public static final int m124290b(String str, String str2, VideoTransPara videoTransPara, boolean z) {
        C98392c a;
        C94554a c;
        String str3 = str;
        String str4 = str2;
        VideoTransPara videoTransPara2 = videoTransPara;
        C87412m.m108594g(str3, "inputPath");
        C87412m.m108594g(str4, "outputPath");
        C87412m.m108594g(videoTransPara2, "videoParam");
        C32816e eVar = (C32816e) ((C36570n) C32813d.f89260a).getValue();
        if (eVar == null || (a = eVar.mo58820a()) == null) {
            throw new IllegalStateException("transcoder creator is null");
        }
        int mp4RotateVFS = SightVideoJNI.getMp4RotateVFS(str);
        int i = (mp4RotateVFS == 0 || mp4RotateVFS == 180) ? videoTransPara2.f267166d : videoTransPara2.f267167e;
        int i2 = (mp4RotateVFS == 0 || mp4RotateVFS == 180) ? videoTransPara2.f267167e : videoTransPara2.f267166d;
        videoTransPara2.f267166d = i;
        videoTransPara2.f267167e = i2;
        C98390b bVar = new C98390b(videoTransPara2);
        bVar.f288462f = false;
        if (videoTransPara2.f267154A == 1) {
            bVar.f288460d = true;
        }
        if (!bVar.f288460d) {
            boolean z2 = !f283568a.mo135070a();
            bVar.f288461e = z2;
            if (!z2) {
                Log.m105924i("MicroMsg.ImportVideoTransfer", "report avc hard encode");
                C115669n.INSTANCE.idkeyStat(106, 52, 1, false);
            }
        } else {
            bVar.f288461e = true;
        }
        if (z) {
            Log.m105924i("MicroMsg.ImportVideoTransfer", "forceSoftEncode");
            bVar.f288461e = true;
        }
        bVar.f288464h = videoTransPara2.f267161H;
        bVar.f288465i = videoTransPara2.f267162I;
        boolean wf = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32737c.clicfg_vc_video_parallel_mux_enable_c2c, false);
        C94554a c2 = C94555d.m119567c(str3, true);
        if ((c2 != null ? c2.f273443a : 0) > 20000 && wf && BuildInfo.IS_ARM64) {
            C32831w wVar = bVar.f288463g;
            wVar.f89295a = true;
            wVar.f89296b = 2;
        }
        Log.m105924i("MicroMsg.ImportVideoTransfer", "transferVideo softEncode:" + bVar.f288461e + " outputHevc:" + bVar.f288460d + " parallelParam :" + bVar.f288463g);
        Object obj = new Object();
        C8477a0 a0Var = new C8477a0();
        boolean a2 = a.mo137683a(str3, str4, bVar, new C96795a(a0Var, obj));
        a0Var.f27482d = a2;
        if (!a2) {
            return -1;
        }
        synchronized (obj) {
            try {
                obj.wait();
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.ImportVideoTransfer", e, "", new Object[0]);
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        int i3 = (!a0Var.f27482d || (c = C94555d.m119567c(str4, true)) == null) ? -1 : c.f273443a;
        if (i3 > 0) {
            return Util.videoMsToSec((long) i3);
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo135070a() {
        boolean z = false;
        boolean z2 = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_c2c_remuxing_avc_use_hard_encode, 0) == 1;
        Log.m105925i("MicroMsg.ImportVideoTransfer", "expt enableAvcHard:%s", Boolean.valueOf(z2));
        int e = C79758p.f233760a.mo109882e(C104160f.RepairerConfig_Media_AvcEncodeHard_Int, 0);
        if (e == 0) {
            return z2;
        }
        Log.m105924i("MicroMsg.ImportVideoTransfer", "debug repairerConfig:" + e);
        if (e == 1) {
            z = true;
        }
        return z;
    }
}
