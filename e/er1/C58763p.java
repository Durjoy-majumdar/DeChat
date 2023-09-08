package er1;

import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import o40.C61926c;
import te3.C48924by0;

/* renamed from: er1.p */
public final class C58763p {

    /* renamed from: a */
    public static final C58763p f168245a = new C58763p();

    /* renamed from: a */
    public final LiveConfig.C55204b mo83799a(LiveConfig.C55204b bVar, String str, C48924by0 by02) {
        C87412m.m108594g(bVar, "<this>");
        C87412m.m108594g(str, "tag");
        if (by02 != null) {
            bVar.f157086D = by02.f131380d;
            bVar.f157087E = by02.f131381e;
            bVar.f157088F = by02.f131382f;
            bVar.f157089G = by02.f131383g;
            StringBuilder sb = new StringBuilder();
            sb.append("setLiveEventInfo ");
            sb.append(str);
            sb.append(", objectId:");
            sb.append(C61926c.m72691p(bVar.f157101k));
            sb.append(", liveId:");
            sb.append(C61926c.m72691p(bVar.f157093c));
            sb.append(", username:");
            sb.append(bVar.f157096f);
            sb.append(", ");
            sb.append("event_id:" + by02.f131380d + ", participant_identity:" + by02.f131381e + ", event_status:" + by02.f131382f + ", stream_status:" + by02.f131383g);
            Log.m105924i("Finder.OlympicsCommon", sb.toString());
        } else {
            bVar.f157086D = 0;
            Log.m105924i("Finder.OlympicsCommon", "setLiveEventInfo " + str + ", objectId:" + C61926c.m72691p(bVar.f157101k) + ", liveId:" + C61926c.m72691p(bVar.f157093c) + ", username:" + bVar.f157096f + ", null");
        }
        return bVar;
    }
}
