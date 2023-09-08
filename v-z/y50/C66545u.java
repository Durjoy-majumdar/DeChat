package y50;

import android.content.Context;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import qo3.C47883u;

/* renamed from: y50.u */
public final class C66545u implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f191400a;

    /* renamed from: b */
    public final /* synthetic */ LiveConfig f191401b;

    public C66545u(Context context, LiveConfig liveConfig) {
        this.f191400a = context;
        this.f191401b = liveConfig;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            C66519j0.f191358d.mo90605i();
            RoomLiveService.f157190a.mo76444b();
            C66527o.m78485e(C66527o.f191369a, this.f191400a, this.f191401b);
        }
    }
}
