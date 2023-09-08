package lj3;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.MessageQueue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import k20.C9556a;
import sn0.C90259e;

/* renamed from: lj3.b */
public class C46863b {

    /* renamed from: a */
    public int f126050a;

    /* renamed from: b */
    public C46868e f126051b;

    /* renamed from: c */
    public LinkedList<String> f126052c;

    /* renamed from: d */
    public MessageQueue.IdleHandler f126053d;

    /* renamed from: e */
    public C46866c f126054e;

    /* renamed from: f */
    public int f126055f = 0;

    /* renamed from: g */
    public GestureDetector f126056g = new GestureDetector(new C46865b());

    /* renamed from: lj3.b$a */
    public class C46864a implements MessageQueue.IdleHandler {
        public C46864a() {
        }

        public boolean queueIdle() {
            while (C46863b.this.f126052c.size() > 0) {
                C46863b.this.f126054e.mo63515a(C46863b.this.f126052c.removeFirst());
            }
            return true;
        }
    }

    /* renamed from: lj3.b$b */
    public class C46865b implements GestureDetector.OnGestureListener {
        public C46865b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return false;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/applet/EarlyGetHeadImg$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            C117292a.m165361g(this, "com/tencent/mm/ui/applet/EarlyGetHeadImg$2", "android/view/GestureDetector$OnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            C46863b.this.f126055f = f2 >= 0.0f ? 0 : 1;
            return false;
        }

        public void onShowPress(MotionEvent motionEvent) {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/applet/EarlyGetHeadImg$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(false, this, "com/tencent/mm/ui/applet/EarlyGetHeadImg$2", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: lj3.b$c */
    public interface C46866c {
        /* renamed from: a */
        Bitmap mo63515a(String str);
    }

    /* renamed from: lj3.b$d */
    public interface C46867d {
        /* renamed from: a */
        int mo63517a();

        /* renamed from: b */
        String mo63518b(int i);
    }

    /* renamed from: lj3.b$e */
    public class C46868e {

        /* renamed from: a */
        public int f126059a;

        /* renamed from: b */
        public LinkedList<String> f126060b = null;

        public C46868e(C46863b bVar, int i) {
            this.f126059a = i;
            this.f126060b = new LinkedList<>();
        }

        /* renamed from: a */
        public void mo72081a(String str) {
            if (!this.f126060b.contains(str)) {
                this.f126060b.add(str);
                if (this.f126060b.size() >= this.f126059a) {
                    this.f126060b.removeFirst();
                }
            }
        }
    }

    public C46863b(int i, C46866c cVar) {
        i = i > 30 ? 30 : i;
        this.f126054e = cVar;
        this.f126050a = i;
        this.f126051b = new C46868e(this, (i * 2) + 10);
        this.f126052c = new LinkedList<>();
        this.f126053d = new C46864a();
        Looper.myQueue().addIdleHandler(this.f126053d);
    }

    /* renamed from: a */
    public void mo72071a() {
        if (this.f126053d != null) {
            Looper.myQueue().removeIdleHandler(this.f126053d);
        }
    }

    /* renamed from: b */
    public void mo72072b(int i, C46867d dVar) {
        if (dVar == null) {
            Log.m105920e("MicroMsg.EarlyGetHeadImg", "earlyGet, getter is null, no early get headimg will be performed");
        } else if (this.f126050a <= 0) {
            Log.m105920e("MicroMsg.EarlyGetHeadImg", "earlyGet fail, threshold is invalid");
        } else {
            int a = dVar.mo63517a();
            for (int i2 = 1; i2 <= this.f126050a; i2++) {
                if (this.f126055f == 1) {
                    int i3 = i - i2;
                    if (i3 >= 0) {
                        String b = dVar.mo63518b(i3);
                        if (!(b == null || b.length() == 0 || this.f126051b.f126060b.contains(b))) {
                            this.f126051b.mo72081a(b);
                            this.f126052c.add(b);
                        }
                    } else {
                        return;
                    }
                } else {
                    int i4 = i + i2;
                    if (i4 < a) {
                        String b2 = dVar.mo63518b(i4);
                        if (!(b2 == null || b2.length() == 0 || this.f126051b.f126060b.contains(b2))) {
                            this.f126051b.mo72081a(b2);
                            this.f126052c.add(b2);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo72073c(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.f126056g;
        if (gestureDetector != null) {
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            C117292a.m165360f(gestureDetector2, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/ui/applet/EarlyGetHeadImg", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
    }
}
