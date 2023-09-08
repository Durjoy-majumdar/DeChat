package com.tencent.p014mm.plugin.vlog.model;

import ac3.C103353f0;
import ac3.C103364k1;
import ac3.C103367l1;
import ac3.C27850e0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.tav.decoder.logger.Logger;
import com.tencent.tav.extractor.AssetExtractor;
import com.tencent.tav.extractor.ExtractorDelegateFactory;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import p206nj.C11171e;
import qr3.C36070f;
import yp3.C112478a;

/* renamed from: com.tencent.mm.plugin.vlog.model.x0 */
public final class C106209x0 {

    /* renamed from: a */
    public static final /* synthetic */ int f316507a = 0;

    static {
        Class cls = C32735h.class;
        boolean z = C103367l1.f304841a;
        boolean z2 = C36070f.f96151a;
        C103364k1 k1Var = C103364k1.f304831d;
        C87412m.m108595h(k1Var, "loader");
        C36070f.f96152b = k1Var;
        Logger.setLogProxy(new C27850e0());
        Logger.setLevel(2);
        C112478a.f336787a = new C103353f0();
        TAVKitMuxer.f282480a.mo134554a();
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_enable_tavkit_vlog_asset_extractor, 0) == 1 || WeChatEnvironment.hasDebugger() || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE) {
            Log.m105924i("MicroMsg.VideoCompositionUtil", "use custom extractor");
            AssetExtractor.DOWNGRADING = true;
            ExtractorDelegateFactory.setExtractorDelegateCreator(new C106203o0());
            return;
        }
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_finder_edit_use_system_extractor_api_level, 28);
        if (Qe <= 0 || !C11171e.m11046c(Qe)) {
            AssetExtractor.DOWNGRADING = false;
            return;
        }
        Log.m105924i("MicroMsg.VideoCompositionUtil", "extractor config: " + Qe);
        AssetExtractor.DOWNGRADING = true;
    }
}
