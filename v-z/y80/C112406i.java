package y80;

import android.content.Context;
import android.hardware.Camera;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import gy3.C87412m;
import p156gj.C107828e;
import p156gj.C107831f;
import p156gj.C107848z;
import rx3.C13598b0;

/* renamed from: y80.i */
public final class C112406i {

    /* renamed from: a */
    public final Object f336575a = new Object();

    /* renamed from: b */
    public boolean f336576b;

    /* renamed from: c */
    public C107831f f336577c;

    /* renamed from: y80.i$a */
    public static final class C112407a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C112406i f336578d;

        /* renamed from: e */
        public final /* synthetic */ long f336579e;

        /* renamed from: f */
        public final /* synthetic */ long f336580f;

        /* renamed from: g */
        public final /* synthetic */ Context f336581g;

        /* renamed from: h */
        public final /* synthetic */ int f336582h;

        /* renamed from: i */
        public final /* synthetic */ Looper f336583i;

        public C112407a(C112406i iVar, long j, long j2, Context context, int i, Looper looper) {
            this.f336578d = iVar;
            this.f336579e = j;
            this.f336580f = j2;
            this.f336581g = context;
            this.f336582h = i;
            this.f336583i = looper;
        }

        public final void run() {
            this.f336578d.getClass();
            Log.m105925i("MicroMsg.SightCamera.OpenCameraThread", "Start Open Camera thread[parent:%d this:%d] time:%d", Long.valueOf(this.f336579e), Long.valueOf(Thread.currentThread().getId()), Long.valueOf(Util.nowMilliSecond() - this.f336580f));
            C112406i iVar = this.f336578d;
            Object obj = iVar.f336575a;
            Context context = this.f336581g;
            int i = this.f336582h;
            Looper looper = this.f336583i;
            long j = this.f336580f;
            synchronized (obj) {
                try {
                    iVar.f336577c = C107828e.m146101d(context, i, looper);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "openCamera failed e:%s", e.getMessage());
                    iVar.f336577c = null;
                }
                if (iVar.f336576b && iVar.f336577c != null) {
                    Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "thread time out now, release camera :%d ", Long.valueOf(Util.nowMilliSecond() - j));
                    try {
                        C107831f fVar = iVar.f336577c;
                        C87412m.m108591d(fVar);
                        C107848z zVar = fVar.f322839a;
                        zVar.mo158263g((Camera.PreviewCallback) null);
                        zVar.mo158268l();
                        zVar.mo158260d();
                        iVar.f336577c = null;
                    } catch (Exception e2) {
                        Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "realease Camera failed e:%s", e2.getMessage());
                    }
                }
                iVar.f336575a.notify();
                C13598b0 b0Var = C13598b0.f38549a;
            }
        }
    }

    /* renamed from: a */
    public final C107831f mo164134a(Context context, int i, Looper looper) {
        Object obj;
        if (context == null) {
            return null;
        }
        long nowMilliSecond = Util.nowMilliSecond();
        long id = Thread.currentThread().getId();
        Object obj2 = this.f336575a;
        synchronized (obj2) {
            try {
                this.f336576b = false;
                this.f336577c = null;
                obj = obj2;
                try {
                    C112407a aVar = new C112407a(this, id, nowMilliSecond, context, i, looper);
                    ThreadPool.post(aVar, "SightCamera_openCamera");
                    this.f336575a.wait(30000);
                } catch (InterruptedException e) {
                    Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "Lock wait failed e:%s", e.getMessage());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
                C107831f fVar = this.f336577c;
                if (fVar != null) {
                    C87412m.m108591d(fVar);
                    if (fVar.f322839a != null) {
                        C107831f fVar2 = this.f336577c;
                        C87412m.m108591d(fVar2);
                        Log.m105925i("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Succ thread:%d Time:%d camera:%s", Long.valueOf(id), Long.valueOf(Util.nowMilliSecond() - nowMilliSecond), fVar2.f322839a);
                        C107831f fVar3 = this.f336577c;
                        return fVar3;
                    }
                }
                this.f336576b = true;
                Log.m105921e("MicroMsg.SightCamera.OpenCameraThread", "Open Camera Timeout:%d", Long.valueOf(Util.nowMilliSecond() - nowMilliSecond));
                return null;
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                throw th;
            }
        }
    }
}
