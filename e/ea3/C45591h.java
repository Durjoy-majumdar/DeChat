package ea3;

import a70.C112760b;
import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86016v1;
import java.io.IOException;
import java.util.Locale;

/* renamed from: ea3.h */
public class C45591h {

    /* renamed from: a */
    public MMHandler f123308a = new MMHandler(Looper.getMainLooper(), this.f123312e);

    /* renamed from: b */
    public MMWebView f123309b;

    /* renamed from: c */
    public String f123310c;

    /* renamed from: d */
    public C45595d f123311d;

    /* renamed from: e */
    public MMHandler.Callback f123312e = new C45592a();

    /* renamed from: ea3.h$c */
    public final class C7614c implements Runnable {

        /* renamed from: d */
        public Bitmap f25895d;

        public C7614c(Bitmap bitmap) {
            this.f25895d = bitmap;
        }

        public void run() {
            C45591h.this.f123310c = String.format(Locale.US, "%s%s_%08x.jpg", new Object[]{C112760b.m154195C(), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(this.f25895d.hashCode())});
            try {
                BitmapUtil.saveBitmapToImage(this.f25895d, 100, Bitmap.CompressFormat.JPEG, C45591h.this.f123310c, true);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.ViewCaptureHelper", "saveBitmapToImage failed, " + e.getMessage());
                C45591h.this.f123310c = null;
            }
            Log.m105925i("MicroMsg.ViewCaptureHelper", "bitmap recycle %s", this.f25895d.toString());
            this.f25895d.recycle();
            C45591h.this.f123308a.sendEmptyMessage(2);
        }
    }

    /* renamed from: ea3.h$a */
    public class C45592a implements MMHandler.Callback {
        public C45592a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
            r3 = r2.f123313d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean handleMessage(android.os.Message r3) {
            /*
                r2 = this;
                int r3 = r3.what
                r0 = 1
                if (r3 == r0) goto L_0x0015
                r0 = 2
                if (r3 == r0) goto L_0x0009
                goto L_0x0030
            L_0x0009:
                ea3.h r3 = ea3.C45591h.this
                ea3.h$d r0 = r3.f123311d
                if (r0 == 0) goto L_0x0030
                java.lang.String r3 = r3.f123310c
                r0.mo64787a(r3)
                goto L_0x0030
            L_0x0015:
                ea3.h r3 = ea3.C45591h.this
                com.tencent.mm.ui.widget.MMWebView r3 = r3.f123309b
                android.graphics.Bitmap r3 = r3.getBitmap()
                if (r3 == 0) goto L_0x0030
                ea3.h$c r0 = new ea3.h$c
                ea3.h r1 = ea3.C45591h.this
                r0.<init>(r3)
                java.lang.String r3 = "ViewCaptureHelper_SaveBitmap"
                com.tencent.p014mm.sdk.thread.ThreadPool.post(r0, r3)
                ea3.h r3 = ea3.C45591h.this
                r0 = 0
                r3.f123309b = r0
            L_0x0030:
                r3 = 0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: ea3.C45591h.C45592a.handleMessage(android.os.Message):boolean");
        }
    }

    /* renamed from: ea3.h$b */
    public final class C45593b implements Runnable {

        /* renamed from: ea3.h$b$a */
        public class C45594a implements C86016v1 {
            public C45594a(C45593b bVar) {
            }

            public boolean accept(C86009m1 m1Var, String str) {
                return str.matches(".+_.+.\\.jpg");
            }
        }

        public C45593b(C45592a aVar) {
        }

        public void run() {
            String str = C45591h.this.f123310c;
            if (str != null) {
                C86009m1[] w = new C86009m1(str).mo119974l().mo119986w(new C45594a(this));
                if (w != null) {
                    int length = w.length;
                    for (int i = 0; i < length; i++) {
                        Log.m105925i("MicroMsg.ViewCaptureHelper", "deleteFile result: %b", Boolean.valueOf(w[i].mo119966f()));
                    }
                }
                C45591h.this.f123310c = null;
            }
        }
    }

    /* renamed from: ea3.h$d */
    public interface C45595d {
        /* renamed from: a */
        void mo64787a(String str);
    }

    /* renamed from: a */
    public void mo71113a(MMWebView mMWebView, C45595d dVar) {
        this.f123309b = mMWebView;
        this.f123311d = dVar;
        this.f123308a.sendEmptyMessage(1);
    }

    /* renamed from: b */
    public void mo71114b() {
        ThreadPool.post(new C45593b((C45592a) null), "ViewCaptureHelper_DeleteBitmap");
    }
}
