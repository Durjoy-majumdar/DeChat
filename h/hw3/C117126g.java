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
import java.util.concurrent.atomic.AtomicBoolean;
import ov3.C117898a;
import rv3.C118245h;
import uv3.C118616f;
import vv3.C118702d;
import yv3.C118997b;

/* renamed from: hw3.g */
public class C117126g extends C117117a {

    /* renamed from: f */
    public AtomicBoolean f350932f = new AtomicBoolean(false);

    /* renamed from: g */
    public final C117120d f350933g = new C117120d((C117120d.C117122b) null, new C117120d.C117121a());

    /* renamed from: h */
    public MotionEvent.PointerCoords f350934h = new MotionEvent.PointerCoords();

    /* renamed from: i */
    public AtomicBoolean f350935i = new AtomicBoolean(false);

    /* renamed from: j */
    public C117898a f350936j = new C117127a();

    /* renamed from: hw3.g$a */
    public class C117127a extends C117898a {
        public C117127a() {
        }

        /* renamed from: a */
        public void mo181064a() {
            C118245h.m166799a("sensor_SingleTouch", "[method: run ] mTimeLimitRunnable " + C117126g.this.f350936j);
            C116544b bVar = C117126g.this.f350912b;
            if (bVar != null) {
                ((C116793c) bVar).mo183458e(4, 7, (Object) null);
            }
        }
    }

    public C117126g(C118702d dVar, C116544b bVar) {
        super(dVar, bVar);
        C118245h.m166799a("sensor_SingleTouch", "[method: SingleTouch ] " + this.f350936j);
    }

    /* renamed from: b */
    public void mo181057b(MotionEvent motionEvent, C113215b.C113217b bVar) {
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                        motionEvent.getPointerCoords(i, this.f350934h);
                        long eventTime = motionEvent.getEventTime();
                        MotionEvent.PointerCoords pointerCoords = this.f350934h;
                        mo181066d(bVar, motionEvent.getPointerId(i), mo181056a(2, eventTime, pointerCoords.pressure, pointerCoords.size));
                    }
                    return;
                } else if (actionMasked == 3) {
                    motionEvent.getPointerCoords(actionIndex, this.f350934h);
                    long eventTime2 = motionEvent.getEventTime();
                    MotionEvent.PointerCoords pointerCoords2 = this.f350934h;
                    mo181066d(bVar, pointerId, mo181056a(4, eventTime2, pointerCoords2.pressure, pointerCoords2.size));
                    ((HashMap) this.f350933g.f350919b.f350920a).remove(Integer.valueOf(pointerId));
                    mo181065c();
                    return;
                } else if (actionMasked != 5) {
                    if (actionMasked != 6) {
                        return;
                    }
                }
            }
            motionEvent.getPointerCoords(actionIndex, this.f350934h);
            long eventTime3 = motionEvent.getEventTime();
            MotionEvent.PointerCoords pointerCoords3 = this.f350934h;
            mo181066d(bVar, pointerId, mo181056a(3, eventTime3, pointerCoords3.pressure, pointerCoords3.size));
            ((HashMap) this.f350933g.f350919b.f350920a).remove(Integer.valueOf(pointerId));
            mo181065c();
            return;
        }
        motionEvent.getPointerCoords(actionIndex, this.f350934h);
        long eventTime4 = motionEvent.getEventTime();
        MotionEvent.PointerCoords pointerCoords4 = this.f350934h;
        C117005i a = mo181056a(1, eventTime4, pointerCoords4.pressure, pointerCoords4.size);
        C116544b bVar2 = this.f350912b;
        if (bVar2 != null) {
            boolean z = ((C116793c) bVar2).f350118i.get();
            C118245h.m166799a("sensor_SingleTouch", "[method: resumeEngine ] " + z);
            if (z && this.f350932f.compareAndSet(false, true)) {
                C118245h.m166799a("sensor_SingleTouch", "[method: resumeEngine ] start resume");
                C116793c cVar = (C116793c) this.f350912b;
                if (cVar.f355203b != null) {
                    cVar.mo183458e(2, -1, (Object) null);
                }
            }
        }
        if (this.f350935i.compareAndSet(false, true)) {
            C118245h.m166799a("sensor_SingleTouch", "[method: setMasterDataCallBack ] ");
            mo181067e();
            C118245h.m166799a("sensor_SingleTouch", "[method: postMaxDurationRunnable ] ");
            C118616f fVar = ((C118997b) this.f350912b).f356433d;
            long j = fVar != null ? fVar.f354957e : 10000;
            C117118b bVar3 = this.f350915e;
            if (bVar3 != null) {
                ((C117281a.C117284e) bVar3).postDelayed(this.f350936j, j);
            }
        }
        mo181066d(bVar, pointerId, a);
    }

    /* renamed from: c */
    public final void mo181065c() {
        C118245h.m166799a("sensor_SingleTouch", "[method: cancelRunnable ] ");
        if (((HashMap) this.f350933g.f350919b.f350920a).size() <= 0) {
            C118245h.m166799a("sensor_SingleTouch", "[method: cancelRunnable remove] ");
            mo181067e();
            this.f350935i.set(false);
            this.f350932f.set(false);
        }
    }

    /* renamed from: d */
    public final void mo181066d(C113215b.C113217b bVar, int i, C117005i iVar) {
        if (bVar != null) {
            iVar.f350649j = this.f350933g.f350919b.mo181058a(i);
            C118245h.m166799a("sensor_SingleTouch", "[method: onCallBack ] info : " + iVar.f350649j);
            C113215b.C113216a aVar = (C113215b.C113216a) bVar;
            synchronized (C113215b.this.f338767h) {
                C116548f fVar = C113215b.this.f338765f;
                if (fVar != null) {
                    fVar.mo180528a(iVar);
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo181067e() {
        C118245h.m166799a("sensor_SingleTouch", "[method: removeMaxDurationRunnable ] " + this.f350936j);
        C117118b bVar = this.f350915e;
        if (bVar != null) {
            ((C117281a.C117284e) bVar).getClass();
            C117281a.C117284e eVar = (C117281a.C117284e) this.f350915e;
            eVar.getClass();
            eVar.removeCallbacks(this.f350936j);
        }
    }
}
