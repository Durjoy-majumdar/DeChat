package p849e3;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import j20.C117292a;
import k20.C9556a;

/* renamed from: e3.d */
public final class C58521d {

    /* renamed from: a */
    public final C58522a f167557a;

    /* renamed from: e3.d$a */
    public interface C58522a {
    }

    /* renamed from: e3.d$b */
    public static class C58523b implements C58522a {

        /* renamed from: a */
        public final GestureDetector f167558a;

        public C58523b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f167558a = new GestureDetector(context, onGestureListener, handler);
        }
    }

    public C58521d(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f167557a = new C58523b(context, onGestureListener, (Handler) null);
    }

    /* renamed from: a */
    public boolean mo83434a(MotionEvent motionEvent) {
        GestureDetector gestureDetector = ((C58523b) this.f167557a).f167558a;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        GestureDetector gestureDetector2 = gestureDetector;
        C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "androidx/core/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
        C117292a.m165360f(gestureDetector2, onTouchEvent, "androidx/core/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return onTouchEvent;
    }
}
