package xl3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xl3.d */
public final class C38743d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f104515d;

    public C38743d(boolean z) {
        this.f104515d = z;
    }

    public final void run() {
        if (!this.f104515d) {
            Log.m105924i("NearbyEntryPreferenceMgr", "handleNearbyEntranceRedDot notify but enableShowNearByEntranceRedDot = false ,remove NearByEntrance ShowInfo");
        }
    }
}
