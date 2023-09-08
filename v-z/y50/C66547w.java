package y50;

import android.content.Context;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import qo3.C47883u;
import te3.C64587no2;

/* renamed from: y50.w */
public final class C66547w implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C64587no2 f191403a;

    /* renamed from: b */
    public final /* synthetic */ LiveConfig f191404b;

    /* renamed from: c */
    public final /* synthetic */ Context f191405c;

    public C66547w(C64587no2 no22, LiveConfig liveConfig, Context context) {
        this.f191403a = no22;
        this.f191404b = liveConfig;
        this.f191405c = context;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        LiveConfig.C55204b bVar = new LiveConfig.C55204b();
        boolean z2 = false;
        bVar.f157091a = 0;
        C64587no2 no22 = this.f191403a;
        bVar.f157092b = no22.f184523e;
        bVar.f157093c = no22.f184522d;
        bVar.f157094d = no22.f184525g;
        bVar.f157096f = no22.f184527i;
        LiveConfig a = bVar.mo76374a();
        LiveConfig liveConfig = this.f191404b;
        if (liveConfig != null) {
            long j = liveConfig.f157064e;
            RoomLiveService roomLiveService = RoomLiveService.f157190a;
            if (j == RoomLiveService.f157197h.f133050d) {
                z2 = true;
            }
        }
        if (!z2) {
            RoomLiveService.f157190a.mo76447e();
        }
        C66527o.m78485e(C66527o.f191369a, this.f191405c, a);
    }
}
