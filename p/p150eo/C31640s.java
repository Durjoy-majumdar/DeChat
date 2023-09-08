package p150eo;

import com.tencent.p014mm.plugin.magicbrush.C30196h0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C30783v3;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import p493do.C31220h;
import zt3.C119157j;

@C86522b
/* renamed from: eo.s */
public final class C31640s extends C86301e implements C31220h {

    /* renamed from: eo.s$a */
    public static final class C31641a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f84529d;

        public C31641a(String str) {
            this.f84529d = str;
        }

        public final void run() {
            int i;
            if (C87412m.m108589b(this.f84529d, "brandServiceBoxExpose")) {
                C30783v3 Ku = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku();
                C72976h2 j = Ku != null ? ((C44660i2) Ku).mo69771j("officialaccounts") : null;
                if (j == null) {
                    i = 0;
                } else {
                    i = j.mo108786G2();
                    Log.m105918d("MagicBrandBaseFeatureService", "unreadCount:" + i);
                }
                if (i > 0) {
                    ((C30196h0) C86312j.m106911c(C30196h0.class)).mo57219iB("brandServiceBoxExpose");
                }
            }
        }
    }

    public void Io0(String str) {
        C87412m.m108594g(str, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        ((C119157j) C119157j.f356862d).mo183884o(new C31641a(str));
    }
}
