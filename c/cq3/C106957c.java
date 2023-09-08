package cq3;

import android.animation.Animator;
import android.graphics.Rect;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq3.C106952a;

/* renamed from: cq3.c */
public class C106957c implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C106952a.C106954b f320168d;

    public C106957c(C106952a.C106954b bVar) {
        this.f320168d = bVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f320168d.f332399a = true;
    }

    public void onAnimationEnd(Animator animator) {
        float f;
        float f2;
        int i;
        C106952a.C106955c cVar = this.f320168d.f320160k;
        if (cVar != null) {
            cVar.mo145726a();
        }
        Log.m105924i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationEnd");
        C106952a.C106954b bVar = this.f320168d;
        bVar.f332399a = true;
        C106952a aVar = C106952a.this;
        aVar.f320133f.set(aVar.f320132e);
        C106952a aVar2 = C106952a.this;
        aVar2.f320148x = aVar2.mo157330d(aVar2.f320133f) * C106952a.f320126E;
        C106952a.C106954b bVar2 = this.f320168d;
        if (bVar2.f320159j) {
            C106952a aVar3 = C106952a.this;
            aVar3.f320147w = aVar3.mo157330d(aVar3.f320133f) * 3.0f;
            C106952a.C106954b bVar3 = this.f320168d;
            Rect rawImageRect = C106952a.this.getRawImageRect();
            float width = (((float) rawImageRect.width()) * 1.0f) / ((float) rawImageRect.height());
            if (width < (((float) C106952a.this.getBoardRect().width()) * 1.0f) / ((float) C106952a.this.getBoardRect().height())) {
                f = ((float) C106952a.this.getBoardRect().width()) / width;
                C106952a.this.getBoardRect().height();
            } else {
                f = (float) C106952a.this.getBoardRect().height();
                C106952a.this.getBoardRect().width();
            }
            C106952a aVar4 = C106952a.this;
            if (aVar4.mo157329c(aVar4.f320132e) % 180.0f == 0.0f) {
                f2 = f * 1.0f;
                i = rawImageRect.height();
            } else {
                f2 = f * 1.0f;
                i = rawImageRect.width();
            }
            float f3 = f2 / ((float) i);
            C106952a aVar5 = C106952a.this;
            if (aVar5.f320147w < f3) {
                aVar5.f320147w = f3 * 1.2f;
            }
        }
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        Log.m105924i("MicroMsg.AdaptImageAnim", "AdaptImageAnim onAnimationStart");
        C106952a.C106955c cVar = this.f320168d.f320160k;
        if (cVar != null) {
            cVar.onStart();
        }
        this.f320168d.f332399a = false;
    }
}
