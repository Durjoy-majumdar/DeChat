package nj3;

import android.graphics.PointF;
import android.view.MotionEvent;

/* renamed from: nj3.f */
public class C109752f {
    /* renamed from: a */
    public static float m149071a(MotionEvent motionEvent) {
        float b = m149072b(motionEvent, 0) - m149072b(motionEvent, 1);
        float c = m149073c(motionEvent, 0) - m149073c(motionEvent, 1);
        return (float) Math.sqrt((double) ((b * b) + (c * c)));
    }

    /* renamed from: b */
    public static float m149072b(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerCount() >= 2 ? motionEvent.getX(i) : motionEvent.getX();
    }

    /* renamed from: c */
    public static float m149073c(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerCount() >= 2 ? motionEvent.getY(i) : motionEvent.getY();
    }

    /* renamed from: d */
    public static void m149074d(PointF pointF, MotionEvent motionEvent) {
        if (pointF != null && motionEvent != null) {
            pointF.set((m149072b(motionEvent, 0) + m149072b(motionEvent, 1)) / 2.0f, (m149073c(motionEvent, 0) + m149073c(motionEvent, 1)) / 2.0f);
        }
    }
}
