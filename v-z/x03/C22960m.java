package x03;

import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import f83.C86779c;
import j20.C117292a;
import k20.C9556a;

/* renamed from: x03.m */
public class C22960m {

    /* renamed from: a */
    public Context f65964a;

    /* renamed from: b */
    public View f65965b;

    /* renamed from: c */
    public C22962b f65966c = C22962b.None;

    /* renamed from: d */
    public GestureDetector f65967d;

    /* renamed from: e */
    public C22948c f65968e;

    /* renamed from: f */
    public float f65969f = 0.0f;

    /* renamed from: g */
    public int f65970g = 0;

    /* renamed from: h */
    public float f65971h = 0.0f;

    /* renamed from: i */
    public int f65972i = -1;

    /* renamed from: j */
    public int f65973j = 0;

    /* renamed from: k */
    public Runnable f65974k = new C22961a();

    /* renamed from: x03.m$a */
    public class C22961a implements Runnable {
        public C22961a() {
        }

        public void run() {
            C22960m.this.f65968e.mo36119a();
        }
    }

    /* renamed from: x03.m$b */
    public enum C22962b {
        None,
        Volume,
        Brightness,
        FastBackwardOrForward
    }

    public C22960m(Context context, View view, C22948c cVar) {
        this.f65964a = context;
        this.f65968e = cVar;
        this.f65965b = view;
        this.f65967d = new GestureDetector(this.f65964a, new C22963n(this));
        this.f65969f = C86779c.m107716b(context);
    }

    /* renamed from: a */
    public void mo36175a(MotionEvent motionEvent) {
        C22962b bVar = C22962b.None;
        if (!this.f65968e.mo36123e()) {
            this.f65966c = bVar;
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f65971h = motionEvent.getRawX();
            this.f65970g = ((AudioManager) this.f65964a.getSystemService("audio")).getStreamVolume(3);
            this.f65969f = C86779c.m107716b(this.f65964a);
        }
        GestureDetector gestureDetector = this.f65967d;
        C9556a aVar = new C9556a();
        aVar.mo10233c(motionEvent);
        C117292a.m165358d(gestureDetector, aVar.mo10232b(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        C117292a.m165360f(gestureDetector, gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0)), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (actionMasked == 1 || actionMasked == 3) {
            C22962b bVar2 = this.f65966c;
            if (bVar2 == C22962b.FastBackwardOrForward) {
                this.f65968e.mo36122d(this.f65973j, motionEvent.getRawX() - this.f65971h);
                this.f65972i = -1;
                this.f65973j = 0;
                this.f65971h = 0.0f;
            } else if (bVar2 == C22962b.Volume) {
                this.f65968e.mo36124f(((float) this.f65970g) / ((float) ((AudioManager) this.f65964a.getSystemService("audio")).getStreamMaxVolume(3)));
            } else if (bVar2 == C22962b.Brightness) {
                this.f65968e.mo36121c(this.f65969f);
            }
            this.f65966c = bVar;
        }
    }
}
