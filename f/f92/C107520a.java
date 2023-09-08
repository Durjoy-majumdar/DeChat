package f92;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gy3.C87412m;
import l92.C109296d;

/* renamed from: f92.a */
public final class C107520a extends AnimatorListenerAdapter {

    /* renamed from: d */
    public final /* synthetic */ C109296d f321691d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f321692e;

    /* renamed from: f */
    public final /* synthetic */ C107529g f321693f;

    /* renamed from: f92.a$a */
    public static final class C107521a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C107529g f321694d;

        public C107521a(C107529g gVar) {
            this.f321694d = gVar;
        }

        public final void run() {
            if (this.f321694d.getParent() != null) {
                ViewParent parent = this.f321694d.getParent();
                C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(this.f321694d);
            }
        }
    }

    public C107520a(C109296d dVar, Bitmap bitmap, C107529g gVar) {
        this.f321691d = dVar;
        this.f321692e = bitmap;
        this.f321693f = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        C87412m.m108594g(animator, "animation");
        MMHandlerThread.postToMainThread(new C107521a(this.f321693f));
        C109296d dVar = this.f321691d;
        if (dVar != null) {
            C109296d.C109297a.m148406b(dVar, this.f321692e, 0, 2, (Object) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        C87412m.m108594g(animator, "animation");
        C109296d dVar = this.f321691d;
        if (dVar != null) {
            C109296d.C109297a.m148407c(dVar, this.f321692e, false, 0, 6, (Object) null);
        }
    }
}
