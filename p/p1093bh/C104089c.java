package p1093bh;

import android.animation.Animator;
import android.graphics.RectF;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bh.c */
public class C104089c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C104090d f307898d;

    public C104089c(C104090d dVar) {
        this.f307898d = dVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        Log.m105924i("MicroMsg.CropArtist", "onAnimationEnd");
        C104090d dVar = this.f307898d;
        int i = dVar.f307917S - 1;
        dVar.f307917S = i;
        if (i == 0) {
            dVar.f307900B = false;
            RectF rectF = new RectF();
            rectF.set(this.f307898d.f307922s);
            this.f307898d.f307921r.mapRect(rectF);
            this.f307898d.f307921r.reset();
            this.f307898d.f307922s.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f307898d.mo145725H();
        }
        C104090d.m138887C(this.f307898d, 200, false, true);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        C104090d dVar = this.f307898d;
        dVar.f307929z = false;
        dVar.f307908J = true;
        dVar.f307900B = true;
    }
}
