package p186kr;

import android.content.Intent;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import hn1.C8614b;
import p147ea.C20556f;
import vc1.C37715b;

@C86522b
/* renamed from: kr.h */
public final class C10402h extends C86301e implements C20556f {
    public void H00(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C8614b bVar = C8614b.f27717a;
        bVar.getClass();
        if (!C37715b.f99914a.mo61298a()) {
            Log.m105928w("NearbyPreloadManager", "startPreloadInFinderLiveEntry return for not isEnableFindLive.");
        } else {
            bVar.mo9485j(intent);
        }
    }

    public void as0(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C8614b bVar = C8614b.f27717a;
        bVar.getClass();
        if (C37715b.f99914a.mo61298a()) {
            Log.m105928w("NearbyPreloadManager", "startPreloadInNearbyLiveFriendsEntry return for isEnableFindLive.");
        } else {
            bVar.mo9485j(intent);
        }
    }
}
