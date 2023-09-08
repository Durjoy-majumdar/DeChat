package ob1;

import android.content.Context;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;

/* renamed from: ob1.d */
public class C110026d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C110011a f329275d;

    /* renamed from: ob1.d$a */
    public class C110027a implements Runnable {
        public C110027a() {
        }

        public void run() {
            C110011a aVar = C110026d.this.f329275d;
            aVar.f329222C.setImageBitmap(aVar.f329224E);
        }
    }

    public C110026d(C110011a aVar) {
        this.f329275d = aVar;
    }

    public void run() {
        C110011a aVar = this.f329275d;
        Context context = MMApplicationContext.getContext();
        this.f329275d.getClass();
        aVar.f329224E = C85191v.m105076o(context, (String) null, this.f329275d.f329224E);
        MMHandlerThread.postToMainThread(new C110027a());
    }
}
