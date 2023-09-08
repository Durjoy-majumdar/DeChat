package com.tencent.liteav.videoproducer.capture;

import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.WindowManager;
import com.tencent.liteav.audio.SystemLoopbackRecorder;
import com.tencent.liteav.base.util.C113473t;
import com.tencent.liteav.base.util.C17111b;
import com.tencent.liteav.base.util.C17118l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.rtmp.video.TXScreenCapture;
import j20.C117292a;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import k20.C9556a;

/* renamed from: com.tencent.liteav.videoproducer.capture.bc */
public class C17428bc {

    /* renamed from: a */
    private static volatile C17428bc f47289a;
    private byte _hellAccFlag_;

    /* renamed from: b */
    private final Context f47290b;

    /* renamed from: c */
    private final Handler f47291c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C17118l f47292d;

    /* renamed from: e */
    private final Map<Surface, C17431a> f47293e = new HashMap();

    /* renamed from: f */
    private boolean f47294f = false;

    /* renamed from: g */
    private MediaProjection f47295g;

    /* renamed from: h */
    private C113473t f47296h;

    /* renamed from: i */
    private boolean f47297i;

    /* renamed from: j */
    private final Runnable f47298j = C17433bd.m17512a(this);

    /* renamed from: k */
    private final MediaProjection.Callback f47299k = new MediaProjection.Callback() {
        public final void onStop() {
            LiteavLog.m16898e("VirtualDisplayManager", "MediaProjection session is no longer valid");
            C17428bc.this.f47292d.mo19369a(C17437bh.m17516a(C17428bc.this));
        }
    };

    /* renamed from: l */
    private final C113473t.C113474a f47300l = new C113473t.C113474a() {
        /* renamed from: a_ */
        public final void mo20405a_() {
            C17428bc.this.f47292d.mo19369a(C17438bi.m17517a(C17428bc.this));
        }
    };

    /* renamed from: com.tencent.liteav.videoproducer.capture.bc$a */
    public static class C17431a {

        /* renamed from: a */
        public Surface f47303a;

        /* renamed from: b */
        public int f47304b;

        /* renamed from: c */
        public int f47305c;

        /* renamed from: d */
        public C17432b f47306d;

        /* renamed from: e */
        public VirtualDisplay f47307e;

        private C17431a() {
        }

        public /* synthetic */ C17431a(byte b) {
            this();
        }
    }

    /* renamed from: com.tencent.liteav.videoproducer.capture.bc$b */
    public interface C17432b {
        /* renamed from: a */
        void mo20538a(boolean z);

        /* renamed from: a */
        void mo20539a(boolean z, boolean z2);

        /* renamed from: e */
        void mo20541e();
    }

    private C17428bc(Context context) {
        this.f47290b = context.getApplicationContext();
        this.f47291c = new C17111b(Looper.getMainLooper());
        this.f47292d = new C17118l();
        this.f47297i = m17501b(context);
    }

    /* renamed from: a */
    public static C17428bc m17492a(Context context) {
        if (f47289a == null) {
            synchronized (C17428bc.class) {
                if (f47289a == null) {
                    f47289a = new C17428bc(context);
                }
            }
        }
        return f47289a;
    }

    /* renamed from: c */
    public static /* synthetic */ void m17502c(C17428bc bcVar) {
        HashMap hashMap = new HashMap(bcVar.f47293e);
        bcVar.f47293e.clear();
        for (C17431a aVar : hashMap.values()) {
            C17432b bVar = aVar.f47306d;
            if (bVar != null) {
                if (aVar.f47307e != null) {
                    bVar.mo20541e();
                } else {
                    bVar.mo20539a(false, false);
                }
            }
        }
        bcVar.m17498a(false);
    }

    /* renamed from: d */
    public static /* synthetic */ void m17503d(C17428bc bcVar) {
        boolean b = m17501b(bcVar.f47290b);
        if (bcVar.f47297i != b) {
            bcVar.f47297i = b;
            for (C17431a aVar : bcVar.f47293e.values()) {
                C17432b bVar = aVar.f47306d;
                if (bVar != null) {
                    bVar.mo20538a(b);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m17500b(MediaProjection mediaProjection) {
        Class<SystemLoopbackRecorder> cls = SystemLoopbackRecorder.class;
        try {
            int i = SystemLoopbackRecorder.f46024a;
            cls.getMethod("notifyMediaProjectionState", new Class[]{MediaProjection.class}).invoke((Object) null, new Object[]{mediaProjection});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LiteavLog.m16898e("VirtualDisplayManager", "fail to send media projection session " + e.getMessage());
        }
    }

    /* renamed from: b */
    private static boolean m17501b(Context context) {
        int rotation;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == 0 || rotation == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo20589a(Surface surface, int i, int i2, MediaProjection mediaProjection, C17432b bVar) {
        this.f47292d.mo19371b(C17434be.m17513a(this, surface, i, i2, mediaProjection, bVar));
    }

    /* renamed from: a */
    public final void mo20588a(Surface surface) {
        this.f47292d.mo19371b(C17435bf.m17514a(this, surface));
    }

    /* renamed from: a */
    private void m17493a() {
        for (C17431a next : this.f47293e.values()) {
            if (next.f47307e == null) {
                next.f47307e = this.f47295g.createVirtualDisplay("TXCScreenCapture", next.f47304b, next.f47305c, 1, 1, next.f47303a, (VirtualDisplay.Callback) null, (Handler) null);
                LiteavLog.m16901i("VirtualDisplayManager", "create VirtualDisplay " + next.f47307e);
                C17432b bVar = next.f47306d;
                if (bVar != null) {
                    bVar.mo20539a(true, false);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m17498a(boolean z) {
        if (this.f47293e.isEmpty()) {
            if (z) {
                this.f47292d.mo19370a(this.f47298j, TimeUnit.SECONDS.toMillis(1));
                return;
            }
            LiteavLog.m16901i("VirtualDisplayManager", "Stop media projection session " + this.f47295g);
            if (this.f47295g != null) {
                m17500b((MediaProjection) null);
                this.f47295g.unregisterCallback(this.f47299k);
                this.f47295g.stop();
                this.f47295g = null;
            }
            C113473t tVar = this.f47296h;
            if (tVar != null) {
                tVar.mo169973a();
                this.f47296h = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo20587a(MediaProjection mediaProjection) {
        this.f47292d.mo19369a(C17436bg.m17515a(this, mediaProjection));
    }

    /* renamed from: a */
    public static /* synthetic */ void m17495a(C17428bc bcVar, MediaProjection mediaProjection) {
        bcVar.f47294f = false;
        if (mediaProjection == null) {
            HashMap hashMap = new HashMap(bcVar.f47293e);
            bcVar.f47293e.clear();
            for (C17431a aVar : hashMap.values()) {
                C17432b bVar = aVar.f47306d;
                if (bVar != null) {
                    bVar.mo20539a(false, true);
                }
            }
            return;
        }
        LiteavLog.m16901i("VirtualDisplayManager", "Got session ".concat(String.valueOf(mediaProjection)));
        bcVar.f47295g = mediaProjection;
        mediaProjection.registerCallback(bcVar.f47299k, bcVar.f47291c);
        bcVar.m17493a();
        C113473t tVar = new C113473t(Looper.getMainLooper(), bcVar.f47300l);
        bcVar.f47296h = tVar;
        tVar.mo169974a(50, 50);
        m17500b(bcVar.f47295g);
        bcVar.m17498a(true);
    }

    /* renamed from: a */
    public static /* synthetic */ void m17496a(C17428bc bcVar, Surface surface) {
        VirtualDisplay virtualDisplay;
        if (surface != null) {
            C17431a remove = bcVar.f47293e.remove(surface);
            if (!(remove == null || (virtualDisplay = remove.f47307e) == null)) {
                virtualDisplay.release();
                LiteavLog.m16901i("VirtualDisplayManager", "VirtualDisplay released, " + remove.f47307e);
            }
            bcVar.m17498a(true);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m17497a(C17428bc bcVar, Surface surface, int i, int i2, MediaProjection mediaProjection, C17432b bVar) {
        if (surface == null) {
            LiteavLog.m16898e("VirtualDisplayManager", "surface is null!");
            bVar.mo20539a(false, false);
            return;
        }
        C17431a aVar = new C17431a((byte) 0);
        aVar.f47303a = surface;
        aVar.f47304b = i;
        aVar.f47305c = i2;
        aVar.f47306d = bVar;
        aVar.f47307e = null;
        bcVar.f47293e.put(surface, aVar);
        bcVar.f47292d.mo19372c(bcVar.f47298j);
        MediaProjection mediaProjection2 = bcVar.f47295g;
        if (mediaProjection2 == null && mediaProjection == null) {
            if (!bcVar.f47294f) {
                bcVar.f47294f = true;
                Intent intent = new Intent(bcVar.f47290b, TXScreenCapture.TXScreenCaptureAssistantActivity.class);
                intent.addFlags(268435456);
                Context context = bcVar.f47290b;
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent);
                Context context2 = context;
                C117292a.m165358d(context2, aVar2.mo10232b(), "com/tencent/liteav/videoproducer/capture/bc", "a", "(Lcom/tencent/liteav/videoproducer/capture/bc;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/bc$b;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(context2, "com/tencent/liteav/videoproducer/capture/bc", "a", "(Lcom/tencent/liteav/videoproducer/capture/bc;Landroid/view/Surface;IILandroid/media/projection/MediaProjection;Lcom/tencent/liteav/videoproducer/capture/bc$b;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        } else if (mediaProjection == null || mediaProjection2 == mediaProjection) {
            bcVar.m17493a();
        } else {
            LiteavLog.m16901i("VirtualDisplayManager", "startVirtualDisplay with media projection:".concat(String.valueOf(mediaProjection)));
            bcVar.mo20587a(mediaProjection);
        }
    }
}
