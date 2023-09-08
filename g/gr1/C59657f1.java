package gr1;

import android.app.Activity;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.finder.video.FinderVideoCore;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;
import nc3.C34767b;

/* renamed from: gr1.f1 */
public final class C59657f1 implements C34767b.C21622a {

    /* renamed from: a */
    public final /* synthetic */ FinderVideoCore f170481a;

    public C59657f1(FinderVideoCore finderVideoCore) {
        this.f170481a = finderVideoCore;
    }

    /* renamed from: a */
    public void mo17997a(boolean z) {
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        Activity activity = g != null ? g.get() : null;
        Log.m105924i("FinderVideoCore", activity + " onPause: loss focus");
        this.f170481a.mo79535C1();
    }

    public void onResume() {
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        Activity activity = g != null ? g.get() : null;
        Log.m105924i("FinderVideoCore", activity + " onResume: gain focus");
        FinderVideoCore finderVideoCore = this.f170481a;
        finderVideoCore.f161834t = true;
        finderVideoCore.mo79538z1().mo80070Y(false, finderVideoCore.f161833s);
    }

    public void onStop() {
        WeakReference<Activity> g = AppForegroundDelegate.m161224g();
        Activity activity = g != null ? g.get() : null;
        Log.m105924i("FinderVideoCore", activity + " onStop: loss focus");
        this.f170481a.mo79535C1();
    }
}
