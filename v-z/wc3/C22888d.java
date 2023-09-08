package wc3;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C21070h;
import ic0.C98661k;
import jc0.C21210b;
import rx3.C36570n;

/* renamed from: wc3.d */
public final class C22888d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f65790d;

    /* renamed from: e */
    public final /* synthetic */ C20937c f65791e;

    /* renamed from: f */
    public final /* synthetic */ long f65792f;

    /* renamed from: wc3.d$a */
    public static final class C22889a implements C98661k {

        /* renamed from: a */
        public final /* synthetic */ long f65793a;

        /* renamed from: wc3.d$a$a */
        public static final class C22890a implements Runnable {

            /* renamed from: d */
            public static final C22890a f65794d = new C22890a();

            public final void run() {
                C22881c.m26865a(C22881c.f65777a);
            }
        }

        public C22889a(long j) {
            this.f65793a = j;
        }

        /* renamed from: a */
        public final void mo6935a(String str, View view, Bitmap bitmap, Object[] objArr) {
            Log.m105925i("MicroMsg.BizImagePreloadStrategy", "old: DownLoadImage finish: url = %s", str);
            MMHandlerThread.postToMainThreadDelayed(C22890a.f65794d, this.f65793a);
        }
    }

    /* renamed from: wc3.d$b */
    public static final class C22891b implements C21070h {

        /* renamed from: a */
        public final /* synthetic */ long f65795a;

        /* renamed from: wc3.d$b$a */
        public static final class C22892a implements Runnable {

            /* renamed from: d */
            public static final C22892a f65796d = new C22892a();

            public final void run() {
                C22881c.m26865a(C22881c.f65777a);
            }
        }

        public C22891b(long j) {
            this.f65795a = j;
        }

        /* renamed from: a */
        public void mo6676a(String str, View view) {
        }

        /* renamed from: b */
        public void mo6677b(String str, View view, C21210b bVar) {
            Log.m105925i("MicroMsg.BizImagePreloadStrategy", "new: DownLoadImage finish: url = %s", str);
            MMHandlerThread.postToMainThreadDelayed(C22892a.f65796d, this.f65795a);
        }

        /* renamed from: c */
        public Bitmap mo6678c(String str, View view, C21210b bVar) {
            return null;
        }
    }

    public C22888d(String str, C20937c cVar, long j) {
        this.f65790d = str;
        this.f65791e = cVar;
        this.f65792f = j;
    }

    public final void run() {
        C22881c cVar = C22881c.f65777a;
        if (((Boolean) ((C36570n) C22881c.f65781e).getValue()).booleanValue()) {
            C20828a.m22825b().mo32521j(this.f65790d, (ImageView) null, this.f65791e, new C22889a(this.f65792f));
        } else {
            C20828a.m22825b().mo32520i(this.f65790d, (ImageView) null, this.f65791e, new C22891b(this.f65792f));
        }
    }
}
