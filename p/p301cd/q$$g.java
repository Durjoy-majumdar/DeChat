package p301cd;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: cd.q$$g */
public final /* synthetic */ class q$$g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C80005q f234358d;

    /* renamed from: e */
    public final /* synthetic */ MotionEvent f234359e;

    public /* synthetic */ q$$g(C80005q qVar, MotionEvent motionEvent) {
        this.f234358d = qVar;
        this.f234359e = motionEvent;
    }

    public final void run() {
        ScaleGestureDetector scaleGestureDetector;
        C80005q qVar = this.f234358d;
        MotionEvent motionEvent = this.f234359e;
        Log.m105925i(qVar.mo110227w(), "*** handler(%s) handlePluginTouch(%s)", qVar.mo122122p(), motionEvent);
        if (!qVar.f234338w && !qVar.f234340y) {
            return;
        }
        if (motionEvent.getPointerCount() == 1 && motionEvent.getAction() == 0) {
            Log.m105924i(qVar.mo110227w(), "handlePluginTouch, 1 pointer action down");
            q$$x q__x = qVar.f234311A;
            q__x.f234396d = motionEvent;
            MMHandlerThread.postToMainThreadDelayed(q__x, 100);
        } else if (motionEvent.getPointerCount() > 1 && motionEvent.getAction() == 2) {
            Log.m105924i(qVar.mo110227w(), "handlePluginTouch, 2 pointer action move");
            MMHandlerThread.removeRunnable(qVar.f234311A);
            qVar.mo110211A(-1.0f, -1.0f);
            if (qVar.f234340y && (scaleGestureDetector = qVar.f234341z) != null) {
                scaleGestureDetector.onTouchEvent(motionEvent);
            }
        }
    }
}
