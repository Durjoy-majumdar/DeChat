package ca3;

import android.content.Context;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.WebViewVideoEventHandler;
import com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder.WebViewVideoFinderActionHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicBoolean;
import p830xc.C91165a;
import t83.C13855j;
import te3.C64888zo1;

/* renamed from: ca3.y */
public final class C16919y implements C91165a.C53318a {

    /* renamed from: a */
    public final /* synthetic */ C16886m f45744a;

    public C16919y(C16886m mVar) {
        this.f45744a = mVar;
    }

    /* renamed from: a */
    public void mo18009a(int i) {
        if (1 == i) {
            C91165a aVar = this.f45744a.f45653F;
            C13855j jVar = null;
            C39934d dVar = aVar instanceof C39934d ? (C39934d) aVar : null;
            C13855j jVar2 = dVar != null ? dVar.f107067a : null;
            if (jVar2 != null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                jVar2.f38998a = context;
            }
            WebViewVideoEventHandler webViewVideoEventHandler = this.f45744a.f45671U;
            if (webViewVideoEventHandler != null) {
                C39934d dVar2 = webViewVideoEventHandler.f119753b;
                if (dVar2 != null) {
                    jVar = dVar2.f107067a;
                }
                if (jVar != null) {
                    Context context2 = MMApplicationContext.getContext();
                    C87412m.m108593f(context2, "getContext()");
                    jVar.f38998a = context2;
                    return;
                }
                return;
            }
            return;
        }
        this.f45744a.mo17981y();
    }

    /* renamed from: c */
    public void mo18010c() {
        C64888zo1 zo12;
        C16886m mVar = this.f45744a;
        if (mVar.f45660M) {
            String str = mVar.f45649B;
            if (!(str == null || str.length() == 0) && (zo12 = mVar.f45650C) != null) {
                WebViewVideoFinderActionHandler.m66265a(1, zo12);
            }
        }
        mVar.f45660M = false;
        Log.m105918d(mVar.mo17980x(), "handleWebViewForeground");
        AtomicBoolean atomicBoolean = mVar.f45678Y;
        boolean z = atomicBoolean != null ? atomicBoolean.get() : false;
        mVar.f45678Y = null;
        if (mVar.f45684n != null && mVar.f45692u && z) {
            Log.m105924i(mVar.mo17980x(), "handleWebViewForeground runnable, video playing when enter background");
            mVar.mo17956A(false, false);
        }
    }

    public void onDestroy() {
        this.f45744a.mo17958C();
    }
}
