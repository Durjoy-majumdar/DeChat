package p510ev;

import android.os.Bundle;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import ma2.C99808k;
import ma2.C99815p;
import p529fv.C59325i;
import p529fv.C59326j;
import te3.C64719t23;

@C86522b
/* renamed from: ev.h */
public final class C97751h extends C86301e implements C59326j {
    /* renamed from: H4 */
    public void mo84428H4(boolean z) {
        C99808k.m130280c(z);
    }

    /* renamed from: HI */
    public void mo84429HI(Bundle bundle) {
        if (bundle != null) {
            C99808k.f292492b = true;
        }
        C99815p.C99817b bVar = C99815p.C99817b.f292513a;
        C99815p.C99817b.f292514b.mo139174L0(bundle);
    }

    public C59325i N30() {
        C99815p.C99817b.f292513a.getClass();
        return C99815p.C99817b.f292514b;
    }

    /* renamed from: a8 */
    public void mo84431a8(String str) {
        Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo updateCurrentMusicCover %s", str);
        C99815p.C99817b bVar = C99815p.C99817b.f292513a;
        C99815p.C99817b.f292514b.mo139173K0(str, true);
    }

    /* renamed from: pg */
    public void mo84432pg(C64719t23 t232) {
        C87412m.m108594g(t232, "musicShareObject");
        Log.m105925i("MicroMsg.GlobalMusicFloatBallManager", "alvinluo updateMusicMvInfo objectId: %s, nonceId: %s", t232.f185459d, t232.f185460e);
        if (C99808k.f292492b) {
            C99815p.C99817b.f292513a.getClass();
            C99815p pVar = C99815p.C99817b.f292514b;
            C64719t23 t233 = pVar.f292507s;
            if (t233 != null) {
                t233.f185459d = t232.f185459d;
                t233.f185460e = t232.f185460e;
                t233.f185461f = t232.f185461f;
                t233.f185462g = t232.f185462g;
            }
            Bundle bundle = pVar.f292505q;
            if (bundle != null) {
                String str = t232.f185459d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                bundle.putString("key_mv_feed_id", str);
                String str3 = t232.f185460e;
                if (str3 == null) {
                    str3 = str2;
                }
                bundle.putString("key_mv_nonce_id", str3);
                String str4 = t232.f185461f;
                if (str4 == null) {
                    str4 = str2;
                }
                bundle.putString("key_mv_cover_url", str4);
                String str5 = t232.f185462g;
                if (str5 != null) {
                    str2 = str5;
                }
                bundle.putString("key_mv_poster", str2);
            }
        }
    }

    /* renamed from: uL */
    public void mo84433uL() {
        C99815p.C99817b.f292513a.getClass();
        C99815p.C99817b.f292514b.f292509u = true;
    }
}
