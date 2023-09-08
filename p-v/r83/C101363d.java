package r83;

import android.view.View;
import com.tencent.p014mm.plugin.websearch.widget.WebSearchWebVideoViewControlBar;
import com.tencent.p014mm.plugin.webview.fts.p810ui.FtsWebVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.lang.ref.WeakReference;
import q83.C101058l;
import r83.C47951e;

/* renamed from: r83.d */
public class C101363d implements C47951e.C47952a {

    /* renamed from: a */
    public final /* synthetic */ FtsWebVideoView f296931a;

    /* renamed from: b */
    public final /* synthetic */ C47951e f296932b;

    public C101363d(C47951e eVar, FtsWebVideoView ftsWebVideoView) {
        this.f296932b = eVar;
        this.f296931a = ftsWebVideoView;
    }

    /* renamed from: a */
    public void mo72717a() {
        WeakReference<View> weakReference;
        View view;
        C101058l.C101059a e;
        WeakReference<View> weakReference2;
        View view2;
        C101058l lVar = this.f296932b.f128640c;
        C101058l.C101059a e2 = lVar.mo140517e(lVar.f295859e);
        float[] fArr = lVar.f295860f;
        if (e2 != null && (weakReference = e2.f295864a) != null && fArr != null && (view = weakReference.get()) != null) {
            int i = lVar.f295859e;
            int i2 = lVar.f295858d;
            if (!(i == i2 || (e = lVar.mo140517e(i2)) == null || (weakReference2 = e.f295864a) == null || (view2 = weakReference2.get()) == null)) {
                lVar.mo140518f(lVar.f295858d, fArr, view2.getVisibility());
            }
            int i3 = lVar.f295859e;
            lVar.f295858d = -1;
            lVar.f295859e = -1;
            C47948a aVar = lVar.f295862h;
            if (aVar != null) {
                FtsWebVideoView ftsWebVideoView = ((C47949b) aVar).f128634a;
                ftsWebVideoView.getClass();
                Log.m105924i("MicroMsg.FtsWebVideoView", "onExitFullScreen");
                WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = ftsWebVideoView.f282962g;
                if (webSearchWebVideoViewControlBar.f282907N) {
                    webSearchWebVideoViewControlBar.f282907N = false;
                    webSearchWebVideoViewControlBar.mo134730y();
                }
                ftsWebVideoView.mo134739a(false);
                lVar.f295862h = null;
            }
            lVar.mo140518f(i3, fArr, view.getVisibility());
        }
    }

    /* renamed from: b */
    public void mo72718b() {
        FtsWebVideoView ftsWebVideoView = this.f296931a;
        ftsWebVideoView.getClass();
        Log.m105924i("MicroMsg.FtsWebVideoView", "onUIPause");
        ftsWebVideoView.f282960e.mo79614b();
    }

    /* renamed from: c */
    public void mo72719c() {
        FtsWebVideoView ftsWebVideoView = this.f296931a;
        ftsWebVideoView.getClass();
        Log.m105924i("MicroMsg.FtsWebVideoView", "onUIResume");
        ftsWebVideoView.f282960e.mo79617f();
    }

    /* renamed from: d */
    public void mo72720d() {
        this.f296931a.mo134745g();
    }

    /* renamed from: e */
    public void mo72721e() {
        this.f296931a.mo134744f();
    }

    public boolean onBackPressed() {
        if (!this.f296931a.mo134742d()) {
            return false;
        }
        this.f296931a.mo134753h(false);
        return true;
    }

    public void onDestroy() {
        FtsWebVideoView ftsWebVideoView = this.f296931a;
        ftsWebVideoView.getClass();
        Log.m105924i("MicroMsg.FtsWebVideoView", "onUIDestroy");
        Log.m105924i("MicroMsg.FtsWebVideoView", "clean");
        ftsWebVideoView.mo134763q();
        ftsWebVideoView.f282960e.mo79616c();
        WebSearchWebVideoViewControlBar webSearchWebVideoViewControlBar = ftsWebVideoView.f282962g;
        MTimerHandler mTimerHandler = webSearchWebVideoViewControlBar.f282906M;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        MTimerHandler mTimerHandler2 = webSearchWebVideoViewControlBar.f282905L;
        if (mTimerHandler2 != null) {
            mTimerHandler2.stopTimer();
        }
        try {
            ftsWebVideoView.getContext().unregisterReceiver(ftsWebVideoView.f282958U);
        } catch (Exception unused) {
        }
    }
}
