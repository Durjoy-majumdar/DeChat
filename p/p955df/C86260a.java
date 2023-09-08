package p955df;

import android.os.Looper;
import android.os.MessageQueue;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Toast;
import com.tencent.p014mm.C0966R;
import p976hf.C87484a;

/* renamed from: df.a */
public class C86260a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C87484a f250860d;

    /* renamed from: e */
    public final /* synthetic */ C86263c f250861e;

    /* renamed from: df.a$a */
    public class C86261a implements MessageQueue.IdleHandler {

        /* renamed from: d */
        public final /* synthetic */ Toast f250862d;

        public C86261a(Toast toast) {
            this.f250862d = toast;
        }

        public boolean queueIdle() {
            C87484a aVar = C86260a.this.f250860d;
            aVar.f253472a.set(this.f250862d);
            aVar.f253473b.countDown();
            return false;
        }
    }

    public C86260a(C86263c cVar, C87484a aVar) {
        this.f250861e = cVar;
        this.f250860d = aVar;
    }

    public void run() {
        Toast toast = new Toast(this.f250861e.f250865a);
        toast.setDuration(1);
        toast.setGravity(16, 0, 0);
        toast.setView(LayoutInflater.from(this.f250861e.f250865a).inflate(C0966R.C0971layout.bt_, (ViewGroup) null));
        toast.show();
        Looper.myQueue().addIdleHandler(new C86261a(toast));
    }
}
