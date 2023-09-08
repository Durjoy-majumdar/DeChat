package p301cd;

import android.view.ScaleGestureDetector;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: cd.q$$r */
public class q$$r implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234381d;

    public q$$r(C80005q qVar) {
        this.f234381d = qVar;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        int maxZoom = this.f234381d.f234327i.getMaxZoom();
        if (maxZoom > 0) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (scaleFactor > 1.0f) {
                scaleFactor = ((0.2f / ((float) maxZoom)) * ((float) (maxZoom - this.f234381d.f234339x))) + 1.0f;
                if (scaleFactor <= 1.1f) {
                    scaleFactor = 1.1f;
                }
            } else if (scaleFactor < 1.0f) {
                scaleFactor = 1.0f - ((0.2f / ((float) maxZoom)) * ((float) this.f234381d.f234339x));
                if (scaleFactor >= 0.9f) {
                    scaleFactor = 0.9f;
                }
            }
            int round = Math.round(((float) this.f234381d.f234339x) * scaleFactor);
            C80005q qVar = this.f234381d;
            int i = qVar.f234339x;
            if (round == i) {
                if (scaleFactor > 1.0f) {
                    round++;
                } else if (scaleFactor < 1.0f) {
                    round--;
                }
            }
            if (round >= maxZoom) {
                round = maxZoom;
            }
            if (round <= 1) {
                round = 1;
            }
            if (scaleFactor <= 1.0f ? scaleFactor >= 1.0f || round <= i : round >= i) {
                i = round;
            }
            qVar.f234339x = i;
            if (qVar.f234327i != null) {
                Log.m105925i(qVar.mo110227w(), "onScale, maxZoom:%s, current scale:%s", Integer.valueOf(maxZoom), Integer.valueOf(this.f234381d.f234339x));
                C80005q qVar2 = this.f234381d;
                qVar2.f234327i.setZoom(qVar2.f234339x);
                this.f234381d.f234325g.mo120980t().mo120972d(i);
            }
        }
        return false;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
