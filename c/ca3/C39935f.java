package ca3;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import aw0.C103928o;
import ba3.C39753d;
import ba3.C39754e;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p830xc.C91165a;

/* renamed from: ca3.f */
public final class C39935f implements C0442a, C39933c, C39932b {

    /* renamed from: d */
    public Context f107069d;

    /* renamed from: e */
    public final String f107070e = "MicroMsg.WebViewUIProxyImpl";

    /* renamed from: f */
    public final Set<C91165a.C53318a> f107071f = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: g */
    public C39753d f107072g;

    public C39935f(Context context) {
        C87412m.m108594g(context, "context");
        this.f107069d = context;
    }

    /* renamed from: I0 */
    public void mo62534I0(C39754e eVar) {
        mo62554b(this.f107069d).f106660j.remove(eVar);
    }

    /* renamed from: W4 */
    public synchronized void mo62536W4(C91165a.C53318a aVar) {
        C87412m.m108594g(aVar, "callback");
        if (!this.f107071f.contains(aVar)) {
            this.f107071f.add(aVar);
        }
    }

    /* renamed from: Y3 */
    public void mo62535Y3(C39754e eVar) {
        C39753d b = mo62554b(this.f107069d);
        if (!b.f106660j.contains(eVar)) {
            b.f106660j.add(eVar);
        }
    }

    /* renamed from: a */
    public final boolean mo62553a(boolean z) {
        C39753d dVar = this.f107072g;
        if (dVar != null) {
            if (dVar.f106652b != null) {
                try {
                    return mo62554b(this.f107069d).mo62391a(z);
                } catch (Exception e) {
                    String str = this.f107070e;
                    Log.m105920e(str, "exitFullScreen ex=" + e.getMessage());
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C39753d mo62554b(Context context) {
        if (this.f107072g == null) {
            this.f107072g = new C39753d(context);
        }
        C39753d dVar = this.f107072g;
        C87412m.m108591d(dVar);
        return dVar;
    }

    /* renamed from: c */
    public final void mo62555c(Context context) {
        C87412m.m108594g(context, "ct");
        this.f107069d = context;
        C39753d dVar = this.f107072g;
        if (dVar != null) {
            dVar.f106651a = context;
            dVar.f106655e = null;
            dVar.f106652b = null;
        }
    }

    /* renamed from: f1 */
    public synchronized void mo62537f1(C91165a.C53318a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f107071f.remove(aVar);
    }

    /* renamed from: t0 */
    public boolean mo483t0() {
        return mo62554b(this.f107069d).mo62391a(false);
    }

    /* renamed from: w4 */
    public void mo484w4(View view, int i) {
        C39753d b = mo62554b(this.f107069d);
        Context context = b.f106651a;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                Log.m105921e("MicroMsg.WebViewFullscreenImpl", "enterFullscreen activity(%s) destroyed", activity);
                return;
            }
            View view2 = b.f106652b;
            b.f106652b = view;
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            if (view2 == null) {
                if (view.getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                    b.f106655e = viewGroup2;
                    b.f106653c = viewGroup2.indexOfChild(view);
                    b.f106654d = view.getLayoutParams();
                    b.f106655e.removeView(view);
                    b.f106657g = b.f106652b.getDrawingCacheBackgroundColor();
                    b.f106652b.setBackgroundColor(-16777216);
                } else {
                    b.f106653c = 0;
                    b.f106655e = null;
                    b.f106654d = null;
                }
                viewGroup.addView(view, new ViewGroup.LayoutParams(-1, -1));
                viewGroup.bringChildToFront(view);
                view.setX(0.0f);
                view.setY(0.0f);
            }
            if (view2 == null) {
                b.f106656f = viewGroup.getSystemUiVisibility();
                b.f106658h = activity.getRequestedOrientation();
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                b.f106659i = layoutParams;
                layoutParams.copyFrom(activity.getWindow().getAttributes());
                Log.m105919d("MicroMsg.WebViewFullscreenImpl", "enterFullscreen mStashedOrientation=%d", Integer.valueOf(b.f106658h));
            }
            viewGroup.setSystemUiVisibility(5894);
            activity.getWindow().addFlags(1024);
            if (i == -90) {
                activity.setRequestedOrientation(8);
            } else if (i == 0) {
                activity.setRequestedOrientation(1);
            } else if (i != 90) {
                activity.setRequestedOrientation(9);
            } else {
                activity.setRequestedOrientation(0);
            }
            C103928o.m138641a(true, true, true);
            for (C39754e a : b.f106660j) {
                a.mo62392a();
            }
        }
    }
}
