package y50;

import android.content.Context;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.live.model.RoomLiveService;
import qo3.C47883u;

/* renamed from: y50.e0 */
public final class C66511e0 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ Context f191332a;

    /* renamed from: b */
    public final /* synthetic */ LiveConfig f191333b;

    public C66511e0(Context context, LiveConfig liveConfig) {
        this.f191332a = context;
        this.f191333b = liveConfig;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (z) {
            C66519j0.f191358d.mo90605i();
            RoomLiveService.f157190a.mo76444b();
            C66527o.m78486f(C66527o.f191369a, this.f191332a, this.f191333b);
        }
    }
}
