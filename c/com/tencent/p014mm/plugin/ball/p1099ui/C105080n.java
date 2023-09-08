package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import bw0.C104181w;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import uv0.C111237j;
import yv0.C112504a;

/* renamed from: com.tencent.mm.plugin.ball.ui.n */
public class C105080n extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C104181w f311863d;

    /* renamed from: e */
    public final /* synthetic */ C112504a f311864e;

    /* renamed from: f */
    public final /* synthetic */ C111237j f311865f;

    /* renamed from: com.tencent.mm.plugin.ball.ui.n$a */
    public class C105081a implements Runnable {
        public C105081a() {
        }

        public void run() {
            if (C105080n.this.f311863d.getParent() != null) {
                ((ViewGroup) C105080n.this.f311863d.getParent()).removeView(C105080n.this.f311863d);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.ball.ui.n$b */
    public class C105082b implements Runnable {
        public C105082b() {
        }

        public void run() {
            C111237j jVar = C105080n.this.f311865f;
            if (jVar != null && jVar.getContentView() != null) {
                View contentView = C105080n.this.f311865f.getContentView();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(contentView, aVar.mo10232b(), "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                contentView.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(contentView, "com/tencent/mm/plugin/ball/ui/FloatBallSwipeTransformationHelper$3$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public C105080n(C104181w wVar, C112504a aVar, C111237j jVar) {
        this.f311863d = wVar;
        this.f311864e = aVar;
        this.f311865f = jVar;
    }

    public void onAnimationEnd(Animator animator) {
        MMHandlerThread.postToMainThread(new C105081a());
        this.f311864e.onAnimationEnd();
        MMHandlerThread.postToMainThreadDelayed(new C105082b(), 200);
    }
}
