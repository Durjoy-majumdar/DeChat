package af0;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;
import bf0.C16794b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: af0.d */
public class C16462d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C16459c f43956d;

    public C16462d(C16459c cVar) {
        this.f43956d = cVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        long j;
        long currentPlayTime = valueAnimator.getCurrentPlayTime();
        C16459c cVar = this.f43956d;
        if (currentPlayTime < cVar.f43939k) {
            long j2 = cVar.f43937i;
            if (j2 == 0) {
                cVar.f43937i = currentPlayTime;
            } else {
                int nextFloat = (int) (cVar.f43929a.nextFloat() * cVar.f43940l * ((float) (currentPlayTime - j2)));
                if (nextFloat > 0) {
                    cVar.f43937i = (long) (((float) cVar.f43937i) + (cVar.f43941m * ((float) nextFloat)));
                    cVar.mo14935a(nextFloat, currentPlayTime);
                }
            }
        }
        C16459c cVar2 = this.f43956d;
        Iterator it = ((ArrayList) cVar2.f43935g).iterator();
        while (it.hasNext()) {
            C16794b bVar = (C16794b) it.next();
            if (bVar.f45371d == -1) {
                bVar.f45371d = currentPlayTime;
            }
            long j3 = currentPlayTime - bVar.f45371d;
            boolean z = j3 >= 0;
            bVar.f45360B = z;
            if (z && !bVar.f45361C) {
                long j4 = j3;
                bVar.f45391x = bVar.mo17823b(j3, bVar.f45372e, bVar.f45374g, bVar.f45376i, bVar.f45380m, bVar.f45378k);
                long j5 = j4;
                bVar.f45392y = bVar.mo17823b(j5, bVar.f45373f, bVar.f45375h, bVar.f45377j, bVar.f45381n, bVar.f45379l);
                bVar.f45393z = bVar.mo17823b(j5, bVar.f45382o, bVar.f45383p, bVar.f45384q, bVar.f45386s, bVar.f45385r);
                Interpolator interpolator = bVar.f45388u;
                if (interpolator != null) {
                    j = j4;
                    bVar.f45359A = (int) (interpolator.getInterpolation(((float) j) / bVar.f45389v) * 255.0f);
                } else {
                    j = j4;
                    bVar.f45359A = 255;
                }
                bVar.f45361C = !bVar.f45362D && ((float) j) >= bVar.f45389v;
                bVar.f45390w = Math.min(1.0f, ((float) j) / bVar.f45389v);
            }
            if (!(!bVar.f45361C)) {
                it.remove();
                ((LinkedList) cVar2.f43934f).add(bVar);
            }
        }
        if (((ArrayList) this.f43956d.f43935g).size() == 0) {
            C16459c cVar3 = this.f43956d;
            if (currentPlayTime >= cVar3.f43939k) {
                cVar3.mo14942h();
                return;
            }
        }
        this.f43956d.f43933e.invalidate();
    }
}
