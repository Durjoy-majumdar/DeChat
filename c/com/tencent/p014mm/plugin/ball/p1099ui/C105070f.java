package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.plugin.ball.view.FloatBallView;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.concurrent.CopyOnWriteArraySet;
import kg3.C76577a;
import p646pn.C110234e;
import xv0.C112181e;
import zv0.C112691a;

/* renamed from: com.tencent.mm.plugin.ball.ui.f */
public class C105070f {

    /* renamed from: a */
    public WindowManager f311843a;

    /* renamed from: b */
    public C112181e f311844b;

    /* renamed from: c */
    public FloatBallView f311845c;

    /* renamed from: d */
    public FloatMenuView f311846d;

    /* renamed from: e */
    public int f311847e = 0;

    /* renamed from: f */
    public boolean f311848f;

    /* renamed from: g */
    public final C112691a f311849g;

    /* renamed from: h */
    public int f311850h = 1;

    /* renamed from: i */
    public boolean f311851i = false;

    public C105070f(Context context) {
        this.f311843a = (WindowManager) context.getSystemService("window");
        this.f311844b = ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY();
        this.f311849g = new C112691a();
        int j = C76577a.m92159j(context);
        this.f311847e = j;
        this.f311844b.mo149117e(j);
        FloatBallView floatBallView = new FloatBallView(context, (AttributeSet) null);
        this.f311845c = floatBallView;
        this.f311844b.mo149098Q(floatBallView);
        FloatBallView floatBallView2 = this.f311845c;
        ((CopyOnWriteArraySet) floatBallView2.f311982p).add(new C105064c(this));
        FloatMenuView floatMenuView = new FloatMenuView(context, (AttributeSet) null);
        this.f311846d = floatMenuView;
        ((CopyOnWriteArraySet) floatMenuView.f312041j).add(new C105058a(this));
        this.f311846d.setOnMeasuredListener(new C105061b(this));
    }

    /* renamed from: a */
    public static void m141010a(C105070f fVar, int i) {
        fVar.getClass();
        Log.m105925i("MicroMsg.FloatBallContainer", "whenOrientationChange new:%d, last:%d, %d", Integer.valueOf(i), Integer.valueOf(fVar.f311850h), Integer.valueOf(fVar.f311846d.getMeasuredHeight()));
        if (fVar.f311850h != i) {
            fVar.f311850h = i;
            if (fVar.f311846d.getVisibility() == 0) {
                fVar.f311846d.setVisibility(8);
                fVar.mo149220c();
            }
        }
    }

    /* renamed from: b */
    public void mo149219b(int i) {
        FloatBallView floatBallView = this.f311845c;
        if (floatBallView != null && floatBallView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.f311845c.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                Log.m105919d("MicroMsg.FloatBallContainer", "alvinluo addFloatBallViewLayoutParamsFlag flag: %d", Integer.valueOf(i));
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                layoutParams2.flags = i | layoutParams2.flags;
                this.f311845c.setLayoutParams(layoutParams);
                Log.m105925i("MicroMsg.FloatBallContainer", "alvinluo addFloatBallViewLayoutParamsFlag result: %d", Integer.valueOf(layoutParams2.flags));
            }
        }
    }

    /* renamed from: c */
    public final void mo149220c() {
        boolean z = AppForegroundDelegate.INSTANCE.f343454n;
        boolean H = this.f311844b.mo149090H();
        boolean B = this.f311844b.mo149084B();
        Log.m105925i("MicroMsg.FloatBallContainer", "checkShowFloatBallIfNeed, isAppForeground:%s, isQBFileViewPage:%s, isNoFloatBallPage", Boolean.valueOf(z), Boolean.valueOf(H), Boolean.valueOf(B));
        if (B || (!z && !H)) {
            Log.m105924i("MicroMsg.FloatBallContainer", "wechat not in foreground or qb file view page, ignore showing float ball");
        } else {
            this.f311845c.mo149280X(false, (AnimatorListenerAdapter) null);
        }
    }

    /* renamed from: d */
    public final void mo149221d() {
        try {
            if (this.f311843a != null) {
                FloatBallView floatBallView = this.f311845c;
                if (floatBallView != null) {
                    ((CopyOnWriteArraySet) floatBallView.f311982p).clear();
                }
                this.f311843a.removeView(this.f311845c);
                this.f311843a.removeView(this.f311846d);
                C112181e eVar = this.f311844b;
                if (eVar != null) {
                    eVar.mo149132l0();
                }
                Log.m105924i("MicroMsg.FloatBallContainer", "detachFromWindowInternal, detach all views");
                return;
            }
            Log.m105920e("MicroMsg.FloatBallContainer", "detachFromWindowInternal, window manager is null");
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.FloatBallContainer", e, "detachFromWindowInternal exception", new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo149222e(boolean z, AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.f311845c != null) {
            Log.m105925i("MicroMsg.FloatBallContainer", "hide FloatBallView, animation:%s", Boolean.valueOf(z));
            this.f311845c.mo149342x(z, animatorListenerAdapter);
        }
        FloatMenuView floatMenuView = this.f311846d;
        if (floatMenuView != null && !floatMenuView.f312031B) {
            Log.m105925i("MicroMsg.FloatBallContainer", "hide FloatMenuView, animation:%s", Boolean.valueOf(z));
            this.f311846d.mo149359b(animatorListenerAdapter);
        }
    }

    /* renamed from: f */
    public void mo149223f(int i) {
        FloatBallView floatBallView = this.f311845c;
        if (floatBallView != null && floatBallView.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = this.f311845c.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                Log.m105919d("MicroMsg.FloatBallContainer", "alvinluo removeFloatBallViewLayoutParamsFlag flag: %d", Integer.valueOf(i));
                WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                layoutParams2.flags = (~i) & layoutParams2.flags;
                this.f311845c.setLayoutParams(layoutParams);
                Log.m105925i("MicroMsg.FloatBallContainer", "alvinluo removeFloatBallViewLayoutParamsFlag result: %d", Integer.valueOf(layoutParams2.flags));
            }
        }
    }
}
