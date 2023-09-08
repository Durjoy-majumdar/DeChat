package com.tencent.p014mm.plugin.gallery.model;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.gallery.model.i */
public final class C93963i {

    /* renamed from: k */
    public static int f271176k;

    /* renamed from: a */
    public HandlerThread f271177a;

    /* renamed from: b */
    public HandlerThread f271178b;

    /* renamed from: c */
    public MMHandler f271179c = null;

    /* renamed from: d */
    public MMHandler f271180d;

    /* renamed from: e */
    public MMHandler f271181e;

    /* renamed from: f */
    public ExecutorService f271182f;

    /* renamed from: g */
    public ExecutorService f271183g;

    /* renamed from: h */
    public ExecutorService f271184h;

    /* renamed from: i */
    public HandlerThread f271185i;

    /* renamed from: j */
    public MMHandler f271186j;

    public C93963i() {
        Log.m105918d("MicroMsg.GalleryHandlerThread", "GalleryHandlerThread init.");
        HandlerThread handlerThread = new HandlerThread("smartGalleryQueryHandlerThread", 10);
        this.f271177a = handlerThread;
        handlerThread.start();
        HandlerThread handlerThread2 = new HandlerThread("galleryAssistHandlerThread", 10);
        this.f271178b = handlerThread2;
        this.f271180d = null;
        handlerThread2.start();
        this.f271181e = null;
        int availableProcessors = Runtime.getRuntime().availableProcessors() / 2;
        if (availableProcessors < 2) {
            availableProcessors = 2;
        } else if (availableProcessors > 4) {
            availableProcessors = 4;
        }
        f271176k = availableProcessors;
        this.f271182f = ((C119157j) C119157j.f356862d).mo183882m("gly-tp_q", availableProcessors, availableProcessors, new LinkedBlockingQueue());
        C119179t tVar = C119157j.f356862d;
        int i = f271176k;
        this.f271183g = ((C119157j) tVar).mo183882m("gly-tp", i, i, new LinkedBlockingQueue());
        C119179t tVar2 = C119157j.f356862d;
        int i2 = f271176k / 2;
        this.f271184h = ((C119157j) tVar2).mo183882m("gly-tp-p", i2, i2, new LinkedBlockingQueue());
        HandlerThread handlerThread3 = new HandlerThread("galleryQuerySubHandlerThread", 10);
        this.f271185i = handlerThread3;
        this.f271186j = null;
        handlerThread3.start();
    }

    /* renamed from: a */
    public final MMHandler mo128893a() {
        if (this.f271181e == null) {
            this.f271181e = new MMHandler(Looper.getMainLooper());
        }
        return this.f271181e;
    }

    /* renamed from: b */
    public void mo128894b(Runnable runnable) {
        if (runnable == null) {
            Log.m105920e("MicroMsg.GalleryHandlerThread", "postToAssistWorker runnable is null");
            return;
        }
        if (this.f271180d == null && this.f271178b != null) {
            this.f271180d = new MMHandler(this.f271178b.getLooper());
        }
        MMHandler mMHandler = this.f271180d;
        if (mMHandler != null) {
            mMHandler.post(runnable);
        } else {
            Log.m105928w("MicroMsg.GalleryHandlerThread", "assistHandler is null.");
        }
    }

    /* renamed from: c */
    public void mo128895c(Runnable runnable) {
        if (runnable == null) {
            Log.m105920e("MicroMsg.GalleryHandlerThread", "postToMainThread, runnable is null");
        } else {
            mo128893a().post(runnable);
        }
    }

    /* renamed from: d */
    public void mo128896d(Runnable runnable) {
        if (runnable == null) {
            Log.m105920e("MicroMsg.GalleryHandlerThread", "postToQuerySubWorker runnable is null");
            return;
        }
        if (this.f271186j == null && this.f271185i != null) {
            this.f271186j = new MMHandler(this.f271185i.getLooper());
        }
        MMHandler mMHandler = this.f271186j;
        if (mMHandler != null) {
            mMHandler.post(runnable);
        } else {
            Log.m105928w("MicroMsg.GalleryHandlerThread", "querySubHandler is null.");
        }
    }
}
