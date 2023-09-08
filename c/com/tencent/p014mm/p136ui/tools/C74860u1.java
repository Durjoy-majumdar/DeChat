package com.tencent.p014mm.p136ui.tools;

import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashSet;
import p646pn.C110234e;
import xv0.C53451i;

/* renamed from: com.tencent.mm.ui.tools.u1 */
public final class C74860u1 {

    /* renamed from: a */
    public static final C74860u1 f220100a = new C74860u1();

    /* renamed from: b */
    public static final HashSet<String> f220101b;

    /* renamed from: c */
    public static boolean f220102c;

    /* renamed from: d */
    public static boolean f220103d;

    /* renamed from: com.tencent.mm.ui.tools.u1$a */
    public static final class C74861a extends C53451i {
        /* renamed from: G1 */
        public void mo64040G1(BallInfo ballInfo) {
            Log.m105924i("MicroMsg.VoiceStateHolder", "onFloatBallInfoClicked, ballInfo:" + ballInfo);
            if (ballInfo != null) {
                C74860u1 u1Var = C74860u1.f220100a;
                int i = ballInfo.f311686d;
                Log.m105924i("MicroMsg.VoiceStateHolder", "open ball page type: " + i);
                if (!(i == 6 || i == 8 || i == 9)) {
                    switch (i) {
                        case 17:
                        case 18:
                        case 19:
                            break;
                        default:
                            Log.m105924i("MicroMsg.VoiceStateHolder", "need stop set to false for other float ball");
                            u1Var.mo104088b(false);
                            return;
                    }
                }
                Log.m105924i("MicroMsg.VoiceStateHolder", "need stop set to true for voice/video ball");
                u1Var.mo104088b(true);
            }
        }

        /* renamed from: H */
        public void mo64041H(BallInfo ballInfo) {
        }

        /* renamed from: c2 */
        public void mo64042c2(BallInfo ballInfo) {
        }

        /* renamed from: t5 */
        public void mo74088t5(BallInfo ballInfo) {
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
        hashSet.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
        hashSet.add("com.tencent.mm.plugin.brandservice.ui.timeline.preload.ui.TmplWebViewToolUI");
        hashSet.add("com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI");
        hashSet.add("com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        hashSet.add("com.tencent.mm.compose_chatting.VoiceSeekUI");
        f220101b = hashSet;
        boolean z = true;
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_background_voice, 1) != 1) {
            z = false;
        }
        f220103d = z;
        ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149101T(0, new C74861a());
    }

    /* renamed from: a */
    public final void mo104087a(String str) {
        C87412m.m108594g(str, "toWhere");
        Log.m105924i("MicroMsg.VoiceStateHolder", "jump to " + str);
        if (f220101b.contains(str)) {
            Log.m105924i("MicroMsg.VoiceStateHolder", "need stop set to false");
            mo104088b(false);
        }
    }

    /* renamed from: b */
    public final void mo104088b(boolean z) {
        if (f220103d) {
            f220102c = z;
        }
    }
}
