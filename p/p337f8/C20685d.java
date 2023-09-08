package p337f8;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

/* renamed from: f8.d */
public final class C20685d {

    /* renamed from: a */
    public final C20686a f58472a;

    /* renamed from: b */
    public final boolean f58473b;

    /* renamed from: c */
    public final long f58474c;

    /* renamed from: d */
    public final long f58475d;

    /* renamed from: e */
    public long f58476e;

    /* renamed from: f */
    public long f58477f;

    /* renamed from: g */
    public long f58478g;

    /* renamed from: h */
    public boolean f58479h;

    /* renamed from: i */
    public long f58480i;

    /* renamed from: j */
    public long f58481j;

    /* renamed from: k */
    public long f58482k;

    /* renamed from: f8.d$a */
    public static final class C20686a implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: h */
        public static final C20686a f58483h = new C20686a();

        /* renamed from: d */
        public volatile long f58484d;

        /* renamed from: e */
        public final Handler f58485e;

        /* renamed from: f */
        public Choreographer f58486f;

        /* renamed from: g */
        public int f58487g;

        public C20686a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f58485e = handler;
            handler.sendEmptyMessage(0);
        }

        public void doFrame(long j) {
            this.f58484d = j;
            this.f58486f.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f58486f = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f58487g + 1;
                this.f58487g = i2;
                if (i2 == 1) {
                    this.f58486f.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f58487g - 1;
                this.f58487g = i3;
                if (i3 == 0) {
                    this.f58486f.removeFrameCallback(this);
                    this.f58484d = 0;
                }
                return true;
            }
        }
    }

    public C20685d(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        double refreshRate = windowManager.getDefaultDisplay() != null ? (double) windowManager.getDefaultDisplay().getRefreshRate() : -1.0d;
        boolean z = refreshRate != -1.0d;
        this.f58473b = z;
        if (z) {
            this.f58472a = C20686a.f58483h;
            long j = (long) (1.0E9d / refreshRate);
            this.f58474c = j;
            this.f58475d = (j * 80) / 100;
            return;
        }
        this.f58472a = null;
        this.f58474c = -1;
        this.f58475d = -1;
    }
}
