package hw3;

import android.view.MotionEvent;
import bw3.C113215b;
import cw3.C116544b;
import cw3.C116548f;
import ew3.C116793c;
import gw3.C117005i;
import hw3.C117120d;
import iw3.C117281a;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import ov3.C117898a;
import rv3.C118245h;
import vv3.C118702d;

/* renamed from: hw3.f */
public class C117124f extends C117117a {

    /* renamed from: f */
    public MotionEvent.PointerCoords f350926f = new MotionEvent.PointerCoords();

    /* renamed from: g */
    public final C117120d f350927g = new C117120d(new C117120d.C117122b(), new C117120d.C117121a());

    /* renamed from: h */
    public AtomicBoolean f350928h = new AtomicBoolean(true);

    /* renamed from: i */
    public long f350929i = 0;

    /* renamed from: j */
    public C117898a f350930j = new C117125a();

    /* renamed from: hw3.f$a */
    public class C117125a extends C117898a {
        public C117125a() {
        }

        /* renamed from: a */
        public void mo181064a() {
            C118245h.m166799a("sensor_MultiTouch", "[method: mPauseRunnable ] mPauseRunnable");
            C117124f.this.mo181061d();
        }
    }

    public C117124f(C118702d dVar, C116544b bVar) {
        super(dVar, bVar);
    }

    /* renamed from: b */
    public void mo181057b(MotionEvent motionEvent, C113215b.C113217b bVar) {
        C117119c cVar;
        MotionEvent motionEvent2 = motionEvent;
        C113215b.C113217b bVar2 = bVar;
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent2.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        boolean z = true;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        motionEvent2.getPointerCoords(i, this.f350926f);
                        long eventTime = motionEvent.getEventTime();
                        MotionEvent.PointerCoords pointerCoords = this.f350926f;
                        mo181060c(bVar2, motionEvent2.getPointerId(i), mo181056a(2, eventTime, pointerCoords.pressure, pointerCoords.size));
                    }
                    this.f350927g.f350918a.mo181059a();
                    mo181063f(motionEvent.getEventTime());
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                    }
                }
            }
            motionEvent2.getPointerCoords(actionIndex, this.f350926f);
            int i2 = actionMasked == 3 ? 4 : 3;
            long eventTime2 = motionEvent.getEventTime();
            MotionEvent.PointerCoords pointerCoords2 = this.f350926f;
            C117005i a = mo181056a(i2, eventTime2, pointerCoords2.pressure, pointerCoords2.size);
            mo181060c(bVar2, pointerId, a);
            C117120d.C117122b bVar3 = this.f350927g.f350918a;
            bVar3.getClass();
            try {
                if (((LinkedList) bVar3.f350922a).remove(Integer.valueOf(pointerId))) {
                    cVar = (C117119c) ((HashMap) bVar3.f350923b).remove(Integer.valueOf(pointerId));
                    C118245h.m166799a("sensor_MultiTouch", "[method: handleUp ] main pointer up id : " + pointerId);
                    if (cVar != null && (cVar.f350917b || ((LinkedList) this.f350927g.f350918a.f350922a).size() < 1)) {
                        long abs = Math.abs(a.f350646g - this.f350929i);
                        long max = Math.max(Math.min(2000 - abs, 500), 0);
                        C118245h.m166799a("sensor_MultiTouch", "[method: handleUp ]  touch interval : " + abs + ", delay pause : " + max);
                        mo181063f(a.f350646g);
                        mo181062e(max);
                    }
                    ((HashMap) this.f350927g.f350919b.f350920a).remove(Integer.valueOf(pointerId));
                    return;
                }
            } catch (Throwable unused) {
            }
            cVar = null;
            C118245h.m166799a("sensor_MultiTouch", "[method: handleUp ] main pointer up id : " + pointerId);
            long abs2 = Math.abs(a.f350646g - this.f350929i);
            long max2 = Math.max(Math.min(2000 - abs2, 500), 0);
            C118245h.m166799a("sensor_MultiTouch", "[method: handleUp ]  touch interval : " + abs2 + ", delay pause : " + max2);
            mo181063f(a.f350646g);
            mo181062e(max2);
            ((HashMap) this.f350927g.f350919b.f350920a).remove(Integer.valueOf(pointerId));
            return;
        }
        motionEvent2.getPointerCoords(actionIndex, this.f350926f);
        long eventTime3 = motionEvent.getEventTime();
        MotionEvent.PointerCoords pointerCoords3 = this.f350926f;
        C117005i a2 = mo181056a(1, eventTime3, pointerCoords3.pressure, pointerCoords3.size);
        C118245h.m166799a("sensor_MultiTouch", "[method: handleDown ] pointerId : " + pointerId);
        C117120d.C117122b bVar4 = this.f350927g.f350918a;
        C117119c cVar2 = (C117119c) ((HashMap) bVar4.f350923b).get(((LinkedList) bVar4.f350922a).peek());
        if (cVar2 == null || !cVar2.f350917b) {
            z = false;
        }
        if (this.f350928h.get() || z) {
            C118245h.m166799a("sensor_MultiTouch", "[method: handleDown pauseEngineWhenDown111 ] isMainTouchSet : " + z + ", isEngineStop : " + this.f350928h.get());
        } else {
            C118245h.m166799a("sensor_MultiTouch", "[method: handleDown pauseEngineWhenDown444 ] ----pause engine----");
            mo181062e(0);
        }
        C117119c cVar3 = new C117119c(pointerId, false, a2);
        C117120d.C117122b bVar5 = this.f350927g.f350918a;
        ((HashMap) bVar5.f350923b).put(Integer.valueOf(pointerId), cVar3);
        ((LinkedList) bVar5.f350922a).offer(Integer.valueOf(cVar3.f350916a));
        this.f350927g.f350918a.mo181059a();
        mo181063f(a2.f350646g);
        this.f350927g.f350919b.mo181058a(pointerId);
        mo181060c(bVar2, pointerId, a2);
    }

    /* renamed from: c */
    public final void mo181060c(C113215b.C113217b bVar, int i, C117005i iVar) {
        if (bVar != null) {
            iVar.f350649j = this.f350927g.f350919b.mo181058a(i);
            C118245h.m166799a("sensor_MultiTouch", "[method: onCallBack ] info : " + iVar.f350649j);
            C113215b.C113216a aVar = (C113215b.C113216a) bVar;
            synchronized (C113215b.this.f338767h) {
                C116548f fVar = C113215b.this.f338765f;
                if (fVar != null) {
                    fVar.mo180528a(iVar);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo181061d() {
        if (this.f350912b != null) {
            this.f350928h.set(true);
            C118245h.m166799a("sensor_MultiTouch", "[method: multi_pause ] " + ((C116793c) this.f350912b).f350118i.get());
            ((C116793c) this.f350912b).mo183458e(4, 5, (Object) null);
        }
    }

    /* renamed from: e */
    public final void mo181062e(long j) {
        C117118b bVar = this.f350915e;
        if (bVar != null) {
            ((C117281a.C117284e) bVar).getClass();
            C117281a.C117284e eVar = (C117281a.C117284e) this.f350915e;
            eVar.getClass();
            eVar.removeCallbacks(this.f350930j);
        }
        if (j <= 0) {
            mo181061d();
            return;
        }
        C117118b bVar2 = this.f350915e;
        if (bVar2 != null) {
            ((C117281a.C117284e) bVar2).getClass();
            C117281a.C117284e eVar2 = (C117281a.C117284e) this.f350915e;
            eVar2.getClass();
            eVar2.postDelayed(this.f350930j, j);
        }
    }

    /* renamed from: f */
    public final void mo181063f(long j) {
        if (this.f350928h.get()) {
            this.f350928h.set(false);
            C118245h.m166799a("sensor_MultiTouch", "[method: resumeEngine ] engine is restart");
            this.f350929i = j;
            C116793c cVar = (C116793c) this.f350912b;
            if (cVar.f355203b != null) {
                cVar.mo183458e(2, -1, (Object) null);
            }
            mo181062e(2000);
        }
    }
}
