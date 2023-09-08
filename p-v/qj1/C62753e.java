package qj1;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: qj1.e */
public final class C62753e implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ C62898o f178147d;

    public C62753e(C62898o oVar) {
        this.f178147d = oVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C63163zd zdVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoPlugin$enableTouchEvent$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f178147d.f178497r = SystemClock.elapsedRealtime();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f178147d.f178497r > 0 && SystemClock.elapsedRealtime() - this.f178147d.f178497r <= ((long) ViewConfiguration.getTapTimeout()) && (zdVar = (C63163zd) this.f178147d.mo87687E0(C63163zd.class)) != null) {
                zdVar.mo88085d1((Boolean) null);
            }
            this.f178147d.f178497r = -1;
        }
        C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAdVideoPlugin$enableTouchEvent$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
