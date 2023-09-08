package p000ag;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import d42.C86183k;
import d42.C86193x;
import d42.C86195z;
import di3.C7335d;
import di3.C86312j;
import e42.C7594e;
import e42.C86431j;
import gy3.C87412m;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import js0.C88016e;
import org.json.JSONObject;
import p000ag.C27886f;
import p000ag.C79533b;
import q52.C62582g;
import sx3.C64197v;

/* renamed from: ag.i */
public final class C79538i extends C7594e implements C86193x, C86183k {

    /* renamed from: a */
    public C86195z<C79538i> f233192a;

    /* renamed from: b */
    public FrameLayout f233193b;

    /* renamed from: c */
    public FrameLayout f233194c;

    /* renamed from: d */
    public C79533b.C79534a f233195d;

    /* renamed from: e */
    public boolean f233196e;

    /* renamed from: f */
    public C62582g f233197f;

    /* renamed from: g */
    public final List<C86431j<C79538i>> f233198g = C64197v.m75537f(new C79539j(), new C39562a());

    /* renamed from: B */
    public void mo109582B(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewDestroy canvasId:" + i);
        FrameLayout frameLayout = this.f233193b;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        } else {
            C87412m.m108603p("playableContainerView");
            throw null;
        }
    }

    /* renamed from: R */
    public void mo109583R(int i, View view, int i2, int i3, int i4, int i5) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewLayout canvasId:" + i + " left:" + i2 + " top:" + i3 + " width:" + i4 + " height:" + i5);
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onJSException msg:" + str2);
    }

    /* renamed from: Z */
    public void mo109585Z(int i, View view) {
        C87412m.m108594g(view, "view");
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewCreated canvasId:" + i);
        FrameLayout frameLayout = this.f233194c;
        if (frameLayout != null) {
            frameLayout.addView(view);
        } else {
            C87412m.m108603p("playableCanvasView");
            throw null;
        }
    }

    /* renamed from: a0 */
    public void mo109586a0() {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onConnException");
        C79533b.C79534a aVar = this.f233195d;
        if (aVar != null) {
            aVar.mo109573a(2, "android connException");
        } else {
            C87412m.m108603p("playableContainerViewCallback");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo109587b() {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onMainScriptInjected");
        this.f233196e = true;
    }

    /* renamed from: c */
    public void mo109588c(int i, boolean z) {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onCanvasViewFirstFrameRendered canvasId:" + i);
        C79533b.C79534a aVar = this.f233195d;
        if (aVar != null) {
            aVar.mo109573a(1, "");
            if (this.f233196e) {
                C86195z<C79538i> zVar = this.f233192a;
                if (zVar != null) {
                    zVar.pause();
                } else {
                    C87412m.m108603p("magicBrush");
                    throw null;
                }
            }
            C27886f fVar = C27886f.f77042a;
            String valueOf = String.valueOf(hashCode());
            synchronized (fVar) {
                C87412m.m108594g(valueOf, "sessionId");
                long currentTimeMillis = System.currentTimeMillis();
                ConcurrentHashMap<String, C27886f.C27887a> concurrentHashMap = C27886f.f77043b;
                C27886f.C27887a aVar2 = concurrentHashMap.get(valueOf);
                if (aVar2 != null && aVar2.f77044a > 0) {
                    Log.m105924i("MagicPlayableReporter", "reportRenderFinish sessionId:" + valueOf + " time:" + currentTimeMillis + " currentTime:" + (currentTimeMillis - aVar2.f77044a));
                    C7335d c = C86312j.m106911c(IMagicBrushMonitor.class);
                    C87412m.m108593f(c, "getService(IMagicBrushMonitor::class.java)");
                    IMagicBrushMonitor.C85281a.m105254b((IMagicBrushMonitor) c, valueOf, "MagicPlayable", IMagicBrushMonitor.PerformanceScene.FirstFrameFromStart, currentTimeMillis - aVar2.f77044a, (List) null, (JSONObject) null, 48, (Object) null);
                }
                concurrentHashMap.remove(valueOf);
            }
            return;
        }
        C87412m.m108603p("playableContainerViewCallback");
        throw null;
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onDestroy");
    }

    /* renamed from: n */
    public void mo109590n() {
    }

    public void onCreated() {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onCreated");
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "injectPlayableLibrary");
        String e = C88016e.m109548e("playable/wxgame-playable-lib.js");
        C87412m.m108593f(e, "playableLibrary");
        String substring = e.substring(0, 200);
        C87412m.m108593f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Log.m105919d("MicroMsg.AppBrand.MagicPlayableService", "playableLibrary is:%s", substring);
        C86195z<C79538i> zVar = this.f233192a;
        if (zVar != null) {
            zVar.mo120605o(e, C0037g.f44d);
            C86195z<C79538i> zVar2 = this.f233192a;
            if (zVar2 != null) {
                zVar2.start();
            } else {
                C87412m.m108603p("magicBrush");
                throw null;
            }
        } else {
            C87412m.m108603p("magicBrush");
            throw null;
        }
    }

    public void onPause() {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onPause");
    }

    public void onResume() {
        Log.m105924i("MicroMsg.AppBrand.MagicPlayableService", "onResume");
    }
}
