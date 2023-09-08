package com.tencent.p014mm.plugin.ball.view;

import android.animation.Animator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import aw0.C103925l;
import com.tencent.p014mm.plugin.ball.view.C55570b;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.ball.view.a */
public class C105107a implements C55570b.C55575e {

    /* renamed from: a */
    public final /* synthetic */ FloatMenuView f312057a;

    /* renamed from: com.tencent.mm.plugin.ball.view.a$a */
    public class C105108a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ Animator.AnimatorListener f312058d;

        /* renamed from: e */
        public final /* synthetic */ RecyclerView.C16631z f312059e;

        /* renamed from: com.tencent.mm.plugin.ball.view.a$a$a */
        public class C105109a implements Runnable {
            public C105109a() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
                r1 = (uv0.C111231e.C111232a) r1;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r4 = this;
                    com.tencent.mm.plugin.ball.view.a$a r0 = com.tencent.p014mm.plugin.ball.view.C105107a.C105108a.this
                    androidx.recyclerview.widget.RecyclerView$z r1 = r0.f312059e
                    boolean r2 = r1 instanceof uv0.C111231e.C111232a
                    if (r2 == 0) goto L_0x002c
                    uv0.e$a r1 = (uv0.C111231e.C111232a) r1
                    com.tencent.mm.plugin.ball.model.BallInfo r2 = r1.f333105z
                    if (r2 == 0) goto L_0x002c
                    com.tencent.mm.plugin.ball.view.a r0 = com.tencent.p014mm.plugin.ball.view.C105107a.this
                    com.tencent.mm.plugin.ball.view.FloatMenuView r0 = r0.f312057a
                    int r1 = r1.f333093A
                    java.util.Set<yv0.c> r0 = r0.f312041j
                    java.util.concurrent.CopyOnWriteArraySet r0 = (java.util.concurrent.CopyOnWriteArraySet) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x001c:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto L_0x002c
                    java.lang.Object r3 = r0.next()
                    yv0.c r3 = (yv0.C112506c) r3
                    r3.mo145798d(r2, r1)
                    goto L_0x001c
                L_0x002c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.ball.view.C105107a.C105108a.C105109a.run():void");
            }
        }

        public C105108a(Animator.AnimatorListener animatorListener, RecyclerView.C16631z zVar) {
            this.f312058d = animatorListener;
            this.f312059e = zVar;
        }

        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f312058d;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f312058d;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
            long j = 200;
            if (!C103925l.m138627a(C105107a.this.f312057a.f312040i)) {
                j = 0;
            }
            C119179t tVar = C119157j.f356862d;
            C105109a aVar = new C105109a();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, j, false);
        }

        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f312058d;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f312058d;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    public C105107a(FloatMenuView floatMenuView) {
        this.f312057a = floatMenuView;
    }

    /* renamed from: a */
    public boolean mo149377a(RecyclerView.C16631z zVar, Animator.AnimatorListener animatorListener) {
        View view;
        if (zVar == null || (view = zVar.f44854d) == null) {
            return false;
        }
        float measuredWidth = (float) view.getMeasuredWidth();
        if (measuredWidth <= 0.0f) {
            measuredWidth = (float) this.f312057a.getMeasuredWidth();
        }
        if (this.f312057a.f312049u) {
            measuredWidth = -measuredWidth;
        }
        Log.m105925i("MicroMsg.FloatMenuView", "alvinluo animateRemove tranX: %f", Float.valueOf(measuredWidth));
        zVar.f44854d.animate().alpha(0.0f).translationX(measuredWidth).setListener(new C105108a(animatorListener, zVar)).start();
        return true;
    }
}
