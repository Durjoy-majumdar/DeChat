package com.tencent.p014mm.plugin.vlog.model;

import android.util.Size;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;
import sp3.C110807k;
import te3.C101758az;

/* renamed from: com.tencent.mm.plugin.vlog.model.j */
public final class C96545j {

    /* renamed from: a */
    public static final C96545j f282554a = new C96545j();

    /* renamed from: a */
    public final C110807k.C101693a mo134606a(C101758az azVar, boolean z) {
        C101758az azVar2 = azVar;
        boolean z2 = z;
        Class cls = C32735h.class;
        C87412m.m108594g(azVar2, "outputConfig");
        Size size = new Size(azVar2.f297901i, azVar2.f297902j);
        if (z2) {
            int i = azVar2.f297901i;
            if (i % 8 != 0) {
                while (i % 8 != 0) {
                    i++;
                }
            }
            azVar2.f297901i = i;
            int i2 = azVar2.f297902j;
            if (i2 % 4 != 0) {
                while (i2 % 4 != 0) {
                    i2++;
                }
            }
            azVar2.f297902j = i2;
        } else {
            int i3 = azVar2.f297901i;
            if (i3 % 16 != 0) {
                while (i3 % 16 != 0) {
                    i3++;
                }
            }
            azVar2.f297901i = i3;
            int i4 = azVar2.f297902j;
            if (i4 % 16 != 0) {
                while (i4 % 16 != 0) {
                    i4++;
                }
            }
            azVar2.f297902j = i4;
        }
        boolean z3 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_tavkit_encode_high_profile_enable, 1) == 1;
        boolean wf = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_mediacodec_level_limit, true);
        Size size2 = new Size(azVar2.f297901i, azVar2.f297902j);
        boolean wf4 = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_composition_bsf_enable, false);
        Log.m105924i("MicroMsg.CompositionOutputConfigCheck", "enableBsf:" + wf4 + " videoSoft:" + z2 + " outputAlignFixResolution:" + azVar2.f297895B);
        if (!wf4 && !azVar2.f297895B) {
            size = null;
        }
        C110807k.C101693a aVar = new C110807k.C101693a(size2, azVar2.f297903n, azVar2.f297904o, azVar2.f297905p, azVar2.f297906q, azVar2.f297907r, azVar2.f297908s, z3, wf, false, azVar2.f297913x, 0, size, 2048, (C8480h) null);
        aVar.f297720d = ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_composition_codec_check, false);
        return aVar;
    }
}
