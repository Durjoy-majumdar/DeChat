package bw3;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import aw3.C113080a;
import cw3.C116543a;
import cw3.C116544b;
import cw3.C116547e;
import cw3.C116548f;
import hw3.C117117a;
import hw3.C117118b;
import iw3.C117287c;
import java.util.concurrent.CopyOnWriteArraySet;
import rv3.C118245h;
import uv3.C118616f;
import vv3.C118702d;
import yv3.C118997b;

/* renamed from: bw3.b */
public class C113215b extends C116543a implements C117287c {

    /* renamed from: f */
    public C116548f f338765f;

    /* renamed from: g */
    public C113218c f338766g;

    /* renamed from: h */
    public final Object f338767h = new Object();

    /* renamed from: i */
    public C113217b f338768i = new C113216a();

    /* renamed from: bw3.b$a */
    public class C113216a implements C113217b {
        public C113216a() {
        }
    }

    /* renamed from: bw3.b$b */
    public interface C113217b {
    }

    /* renamed from: bw3.b$c */
    public interface C113218c {
    }

    public C113215b(C118702d dVar) {
        super(dVar);
    }

    /* renamed from: b */
    public void mo165746b(MotionEvent motionEvent, C117118b bVar) {
        C113218c cVar;
        C118616f fVar;
        if (mo180526f() && (cVar = this.f338766g) != null) {
            C113217b bVar2 = this.f338768i;
            C117117a aVar = (C117117a) cVar;
            aVar.f350915e = bVar;
            boolean z = false;
            if (motionEvent == null) {
                C118245h.m166799a("sensor_AbsTouch", "[method: isMonitorViewTouch ] motionEvent is null");
            } else {
                C116544b bVar3 = aVar.f350912b;
                if (bVar3 == null || (fVar = ((C118997b) bVar3).f356433d) == null) {
                    C118245h.m166799a("sensor_AbsTouch", "[method: isMonitorViewTouch ] getMasterEngine or getBuilder is null");
                } else {
                    View view = fVar.f354959g;
                    if (view == null) {
                        C118245h.m166799a("sensor_AbsTouch", "[method: isMonitorViewTouch ] monitorView is null");
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        int pointerId = motionEvent.getPointerId(actionIndex);
                        int actionMasked = motionEvent.getActionMasked();
                        if (actionMasked == 2) {
                            if (!((CopyOnWriteArraySet) aVar.f350914d).isEmpty()) {
                                if (((CopyOnWriteArraySet) aVar.f350914d).contains(Integer.valueOf(pointerId))) {
                                    z = true;
                                }
                            }
                            C118245h.m166799a("sensor_AbsTouch", "[method: isTouchValid ] MotionEvent.ACTION_MOVE : " + z + ", pointerId : " + pointerId);
                        } else if (actionMasked == 0 || actionMasked == 5) {
                            Rect rect = aVar.f350913c;
                            if (rect.right - rect.left <= 0 || rect.bottom - rect.top <= 0) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                Rect rect2 = aVar.f350913c;
                                int i = iArr[0];
                                rect2.left = i;
                                rect2.top = iArr[1];
                                rect2.right = i + view.getWidth();
                                Rect rect3 = aVar.f350913c;
                                rect3.bottom = rect3.top + view.getHeight();
                                C118245h.m166799a("sensor_AbsTouch", "[method: isMonitorViewTouch ] init ");
                            }
                            C118245h.m166799a("sensor_AbsTouch", "[method: isViewTouch ] x = " + ((int) motionEvent.getRawX()) + ", y = " + ((int) motionEvent.getRawY()));
                            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
                            motionEvent.getPointerCoords(actionIndex, pointerCoords);
                            C118245h.m166799a("sensor_AbsTouch", "[method: isViewTouch ] pointer : [" + pointerCoords.x + ", " + pointerCoords.y + "]");
                            z = aVar.f350913c.contains((int) pointerCoords.x, (int) pointerCoords.y);
                            C118245h.m166799a("sensor_AbsTouch", "[method: isMonitorViewTouch ] " + aVar.f350913c + ", ret : " + z);
                            if (z) {
                                ((CopyOnWriteArraySet) aVar.f350914d).add(Integer.valueOf(pointerId));
                            }
                            C118245h.m166799a("sensor_AbsTouch", "[method: isTouchValid ] MotionEvent.ACTION_DOWN : " + z + ", pointerId : " + pointerId);
                        } else {
                            if (!((CopyOnWriteArraySet) aVar.f350914d).isEmpty()) {
                                if (((CopyOnWriteArraySet) aVar.f350914d).contains(Integer.valueOf(pointerId))) {
                                    ((CopyOnWriteArraySet) aVar.f350914d).remove(Integer.valueOf(pointerId));
                                    z = true;
                                }
                            }
                            C118245h.m166799a("sensor_AbsTouch", "[method: isTouchValid ] MotionEvent.ACTION_UP : " + z + ", pointerId : " + pointerId);
                        }
                    }
                }
                z = true;
            }
            if (z) {
                try {
                    aVar.mo181057b(motionEvent, bVar2);
                } catch (Throwable th) {
                    ((C113080a) aVar.f350911a.f355208d).mo165608b(th, "handleTouch");
                }
            }
        }
    }

    /* renamed from: d */
    public void mo165738d(C116547e eVar) {
        if (eVar instanceof C116548f) {
            this.f338765f = (C116548f) eVar;
        }
    }

    /* renamed from: e */
    public boolean mo165739e(Object... objArr) {
        C118245h.m166799a("sensor_TouchTask", "[method: start ] ");
        return true;
    }

    public boolean stop() {
        C118245h.m166799a("sensor_TouchTask", "[method: stop ] ");
        C113218c cVar = this.f338766g;
        if (cVar != null) {
            cVar.getClass();
        }
        synchronized (this.f338767h) {
            this.f338765f = null;
        }
        return true;
    }
}
