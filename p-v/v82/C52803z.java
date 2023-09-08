package v82;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import ic0.C21070h;
import jc0.C21210b;

/* renamed from: v82.z */
public class C52803z implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ C52800x f147518a;

    /* renamed from: v82.z$a */
    public class C52804a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C21210b f147519d;

        public C52804a(C21210b bVar) {
            this.f147519d = bVar;
        }

        public void run() {
            C52803z.this.f147518a.f147511d.setBackgroundDrawable(new BitmapDrawable(this.f147519d.f59988d));
        }
    }

    public C52803z(C52800x xVar) {
        this.f147518a = xVar;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
        if (bVar.f59985a == 0 && bVar.f59988d != null) {
            MMHandlerThread.postToMainThread(new C52804a(bVar));
        }
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        return null;
    }
}
