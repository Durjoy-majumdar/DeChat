package p1082hl;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: hl.b */
public final class C98470b implements View.OnTouchListener {

    /* renamed from: d */
    public MTimerHandler f288813d;

    /* renamed from: e */
    public boolean f288814e;

    /* renamed from: hl.b$a */
    public static final class C98471a implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C98470b f288815d;

        /* renamed from: e */
        public final /* synthetic */ View f288816e;

        public C98471a(C98470b bVar, View view) {
            this.f288815d = bVar;
            this.f288816e = view;
        }

        public final boolean onTimerExpired() {
            this.f288815d.f288814e = true;
            return this.f288816e.performClick();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        C87412m.m108594g(view, "v");
        C87412m.m108594g(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f288814e = false;
            MTimerHandler mTimerHandler = new MTimerHandler(new C98471a(this, view), true);
            this.f288813d = mTimerHandler;
            mTimerHandler.startTimer((long) ViewConfiguration.getKeyRepeatTimeout(), (long) ViewConfiguration.getKeyRepeatDelay());
        } else if (actionMasked == 1 || actionMasked == 3) {
            MTimerHandler mTimerHandler2 = this.f288813d;
            if (mTimerHandler2 != null) {
                mTimerHandler2.stopTimer();
            }
            this.f288813d = null;
            if (!this.f288814e && motionEvent.getActionMasked() == 1) {
                view.performClick();
            }
        }
        C117292a.m165362h(true, this, "com/tencent/mm/emoji/panel/TouchToClick", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
