package xl3;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: xl3.a */
public final class C38742a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f104514d;

    public C38742a(boolean z) {
        this.f104514d = z;
    }

    public final void run() {
        if (!this.f104514d) {
            Log.m105924i("FinderLiveEntryPreferenceMgr", "handleFinderLiveRedDot notify but enableShowNearByEntranceRedDot = false ,remove NearByEntrance ShowInfo");
        }
    }
}
