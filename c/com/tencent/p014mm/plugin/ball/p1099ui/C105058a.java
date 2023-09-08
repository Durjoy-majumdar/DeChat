package com.tencent.p014mm.plugin.ball.p1099ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.tencent.p014mm.plugin.ball.model.BallInfo;
import com.tencent.p014mm.plugin.ball.view.FloatMenuView;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import yv0.C112506c;

/* renamed from: com.tencent.mm.plugin.ball.ui.a */
public class C105058a implements C112506c {

    /* renamed from: a */
    public final /* synthetic */ C105070f f311826a;

    /* renamed from: com.tencent.mm.plugin.ball.ui.a$a */
    public class C105059a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ BallInfo f311827d;

        public C105059a(BallInfo ballInfo) {
            this.f311827d = ballInfo;
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationEnd(animator);
            C105058a.this.f311826a.f311844b.mo149142r(this.f311827d);
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C105058a.this.f311826a.f311844b.mo149142r(this.f311827d);
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C105058a.this.f311826a.f311845c.mo149280X(false, (AnimatorListenerAdapter) null);
        }
    }

    public C105058a(C105070f fVar) {
        this.f311826a = fVar;
    }

    /* renamed from: H */
    public void mo149206H(BallInfo ballInfo) {
        this.f311826a.f311844b.mo149140p0(ballInfo);
    }

    /* renamed from: a */
    public void mo145797a(BallInfo ballInfo) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ballInfo);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", this, array);
        Log.m105924i("MicroMsg.FloatBallContainer", "onFloatMenuItemClicked");
        this.f311826a.f311849g.mo164421a(3);
        this.f311826a.f311846d.mo149359b(new C105059a(ballInfo));
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V");
    }

    /* renamed from: b */
    public void mo149207b() {
        C117292a.m165355a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V", this);
        Log.m105924i("MicroMsg.FloatBallContainer", "onFloatMenuBackgroundClicked");
        this.f311826a.f311849g.mo164421a(2);
        C105070f fVar = this.f311826a;
        fVar.f311851i = false;
        C105067d dVar = new C105067d(fVar);
        FloatMenuView floatMenuView = fVar.f311846d;
        if (floatMenuView != null) {
            floatMenuView.mo149359b(dVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackgroundClicked", "()V");
    }

    /* renamed from: c */
    public void mo149208c() {
        C117292a.m165355a("com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackPressed", "()V", this);
        Log.m105924i("MicroMsg.FloatBallContainer", "onFloatMenuBackPressed");
        this.f311826a.f311849g.mo164421a(5);
        C105070f fVar = this.f311826a;
        fVar.f311851i = false;
        C105067d dVar = new C105067d(fVar);
        FloatMenuView floatMenuView = fVar.f311846d;
        if (floatMenuView != null) {
            floatMenuView.mo149359b(dVar);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuBackPressed", "()V");
    }

    /* renamed from: d */
    public void mo145798d(BallInfo ballInfo, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ballInfo);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V", this, array);
        Log.m105924i("MicroMsg.FloatBallContainer", "onFloatMenuItemRemoved");
        ballInfo.f311683H.f311721j = 9;
        this.f311826a.f311844b.mo149108Z(ballInfo);
        if (!ballInfo.f311680E) {
            C105070f fVar = this.f311826a;
            if (fVar.f311851i) {
                fVar.f311849g.mo164421a(4);
                this.f311826a.f311846d.setCanAddFloatBallWhenHide(true);
                C105070f fVar2 = this.f311826a;
                fVar2.f311851i = false;
                C105067d dVar = new C105067d(fVar2);
                FloatMenuView floatMenuView = fVar2.f311846d;
                if (floatMenuView != null) {
                    floatMenuView.mo149359b(dVar);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$1", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V");
    }

    public void onOrientationChange(int i) {
        C105070f.m141010a(this.f311826a, i);
    }
}
