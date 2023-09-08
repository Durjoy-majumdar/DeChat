package com.tencent.p014mm.chatting.component;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.libpag.PAGComposition;
import org.libpag.PAGFile;
import org.libpag.PAGImage;
import org.libpag.PAGPlayer;
import org.libpag.PAGSurface;
import org.libpag.PAGText;
import zt3.C119157j;

/* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView */
public class ListScrollPAGView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    public static final Object f48748A = new Object();

    /* renamed from: B */
    public static C17716g f48749B;

    /* renamed from: C */
    public static HandlerThread f48750C;

    /* renamed from: D */
    public static volatile int f48751D;

    /* renamed from: d */
    public TextureView.SurfaceTextureListener f48752d;

    /* renamed from: e */
    public PAGPlayer f48753e;

    /* renamed from: f */
    public PAGSurface f48754f;

    /* renamed from: g */
    public PAGFile f48755g;

    /* renamed from: h */
    public ValueAnimator f48756h;

    /* renamed from: i */
    public boolean f48757i = false;

    /* renamed from: j */
    public Boolean f48758j = null;

    /* renamed from: n */
    public String f48759n = "";

    /* renamed from: o */
    public boolean f48760o = false;

    /* renamed from: p */
    public SparseArray<PAGText> f48761p = new SparseArray<>();

    /* renamed from: q */
    public SparseArray<PAGImage> f48762q = new SparseArray<>();

    /* renamed from: r */
    public ArrayList<C17718h> f48763r = new ArrayList<>();

    /* renamed from: s */
    public ArrayList<C17719f> f48764s = new ArrayList<>();

    /* renamed from: t */
    public volatile double f48765t;

    /* renamed from: u */
    public volatile long f48766u;

    /* renamed from: v */
    public final ValueAnimator.AnimatorUpdateListener f48767v = new C17711a();

    /* renamed from: w */
    public final AnimatorListenerAdapter f48768w = new C17712b();

    /* renamed from: x */
    public Runnable f48769x = new C17714d();

    /* renamed from: y */
    public Runnable f48770y = new C17715e();

    /* renamed from: z */
    public boolean f48771z = true;

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$a */
    public class C17711a implements ValueAnimator.AnimatorUpdateListener {
        public C17711a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ListScrollPAGView.this.f48766u = valueAnimator.getCurrentPlayTime();
            ListScrollPAGView listScrollPAGView = ListScrollPAGView.this;
            listScrollPAGView.f48765t = (double) ((Float) listScrollPAGView.f48756h.getAnimatedValue()).floatValue();
            ListScrollPAGView.m18107b(listScrollPAGView);
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$b */
    public class C17712b extends AnimatorListenerAdapter {
        public C17712b() {
        }

        public void onAnimationCancel(Animator animator) {
            ArrayList arrayList;
            super.onAnimationCancel(animator);
            synchronized (ListScrollPAGView.this) {
                arrayList = new ArrayList(ListScrollPAGView.this.f48763r);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C17718h) it.next()).mo21256a(ListScrollPAGView.this);
            }
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList;
            super.onAnimationEnd(animator);
            synchronized (ListScrollPAGView.this) {
                arrayList = new ArrayList(ListScrollPAGView.this.f48763r);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C17718h) it.next()).mo21257b(ListScrollPAGView.this);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            ArrayList arrayList;
            super.onAnimationRepeat(animator);
            synchronized (ListScrollPAGView.this) {
                arrayList = new ArrayList(ListScrollPAGView.this.f48763r);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C17718h) it.next()).mo21258c(ListScrollPAGView.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList;
            super.onAnimationStart(animator);
            synchronized (ListScrollPAGView.this) {
                arrayList = new ArrayList(ListScrollPAGView.this.f48763r);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C17718h) it.next()).mo21259d(ListScrollPAGView.this);
            }
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$c */
    public class C17713c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ SurfaceTexture f48774d;

        public C17713c(SurfaceTexture surfaceTexture) {
            this.f48774d = surfaceTexture;
        }

        public void run() {
            ListScrollPAGView.this.f48753e.setSurface((PAGSurface) null);
            TextureView.SurfaceTextureListener surfaceTextureListener = ListScrollPAGView.this.f48752d;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureDestroyed(this.f48774d);
            }
            PAGSurface pAGSurface = ListScrollPAGView.this.f48754f;
            if (pAGSurface != null) {
                pAGSurface.freeCache();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$d */
    public class C17714d implements Runnable {
        public C17714d() {
        }

        public void run() {
            ListScrollPAGView listScrollPAGView = ListScrollPAGView.this;
            if (listScrollPAGView.f48760o) {
                listScrollPAGView.f48756h.start();
            }
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$e */
    public class C17715e implements Runnable {
        public C17715e() {
        }

        public void run() {
            ListScrollPAGView listScrollPAGView = ListScrollPAGView.this;
            listScrollPAGView.f48766u = listScrollPAGView.f48756h.getCurrentPlayTime();
            ListScrollPAGView.this.f48756h.cancel();
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$g */
    public static class C17716g extends Handler {

        /* renamed from: a */
        public final Object f48778a = new Object();

        /* renamed from: b */
        public List<ListScrollPAGView> f48779b = new ArrayList();

        /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$g$a */
        public class C17717a implements Runnable {
            public C17717a(C17716g gVar) {
            }

            public void run() {
                HandlerThread handlerThread;
                if (ListScrollPAGView.f48751D == 0 && ListScrollPAGView.f48749B != null && (handlerThread = ListScrollPAGView.f48750C) != null && handlerThread.isAlive()) {
                    ListScrollPAGView.f48749B.removeCallbacksAndMessages((Object) null);
                    ListScrollPAGView.f48750C.quitSafely();
                    ListScrollPAGView.f48750C = null;
                    ListScrollPAGView.f48749B = null;
                }
            }
        }

        public C17716g(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ArrayList arrayList;
            super.handleMessage(message);
            int i = message.arg1;
            if (i == 0) {
                synchronized (this.f48778a) {
                    arrayList = new ArrayList(this.f48779b);
                    ((ArrayList) this.f48779b).clear();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof ListScrollPAGView) {
                        ListScrollPAGView listScrollPAGView = (ListScrollPAGView) next;
                        if (!arrayList2.contains(listScrollPAGView)) {
                            if (listScrollPAGView.f48760o) {
                                listScrollPAGView.f48753e.setProgress(listScrollPAGView.f48765t);
                                listScrollPAGView.mo21221h();
                                if (!listScrollPAGView.f48764s.isEmpty()) {
                                    listScrollPAGView.post(new C68010a(listScrollPAGView));
                                }
                            }
                            arrayList2.add(listScrollPAGView);
                        }
                    }
                }
            } else if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof SurfaceTexture) {
                    ((SurfaceTexture) obj).release();
                }
            } else if (i == 2) {
                new Handler(Looper.getMainLooper()).post(new C17717a(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$h */
    public interface C17718h {
        /* renamed from: a */
        void mo21256a(ListScrollPAGView listScrollPAGView);

        /* renamed from: b */
        void mo21257b(ListScrollPAGView listScrollPAGView);

        /* renamed from: c */
        void mo21258c(ListScrollPAGView listScrollPAGView);

        /* renamed from: d */
        void mo21259d(ListScrollPAGView listScrollPAGView);
    }

    /* renamed from: com.tencent.mm.chatting.component.ListScrollPAGView$f */
    public interface C17719f {
        void onFlush();
    }

    public ListScrollPAGView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo21225l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0034, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m18106a() {
        /*
            java.lang.Class<com.tencent.mm.chatting.component.ListScrollPAGView> r0 = com.tencent.p014mm.chatting.component.ListScrollPAGView.class
            monitor-enter(r0)
            int r1 = f48751D     // Catch:{ all -> 0x0035 }
            int r1 = r1 + -1
            f48751D = r1     // Catch:{ all -> 0x0035 }
            int r1 = f48751D     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)
            return
        L_0x000f:
            com.tencent.mm.chatting.component.ListScrollPAGView$g r1 = f48749B     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0033
            android.os.HandlerThread r1 = f48750C     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0033
        L_0x0018:
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x0020
            monitor-exit(r0)
            return
        L_0x0020:
            r1 = 2
            com.tencent.mm.chatting.component.ListScrollPAGView$g r2 = f48749B     // Catch:{ all -> 0x0035 }
            if (r2 != 0) goto L_0x0026
            goto L_0x0031
        L_0x0026:
            android.os.Message r2 = r2.obtainMessage()     // Catch:{ all -> 0x0035 }
            r2.arg1 = r1     // Catch:{ all -> 0x0035 }
            com.tencent.mm.chatting.component.ListScrollPAGView$g r1 = f48749B     // Catch:{ all -> 0x0035 }
            r1.sendMessage(r2)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r0)
            return
        L_0x0033:
            monitor-exit(r0)
            return
        L_0x0035:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatting.component.ListScrollPAGView.m18106a():void");
    }

    /* renamed from: b */
    public static void m18107b(ListScrollPAGView listScrollPAGView) {
        C17716g gVar = f48749B;
        if (gVar != null) {
            synchronized (gVar.f48778a) {
                if (((ArrayList) gVar.f48779b).isEmpty()) {
                    Message obtainMessage = gVar.obtainMessage();
                    obtainMessage.arg1 = 0;
                    gVar.sendMessage(obtainMessage);
                }
                ((ArrayList) gVar.f48779b).add(listScrollPAGView);
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m18108c() {
        synchronized (ListScrollPAGView.class) {
            f48751D++;
            if (f48750C == null) {
                HandlerThread handlerThread = new HandlerThread("pag-renderer");
                f48750C = handlerThread;
                handlerThread.start();
            }
            if (f48749B == null) {
                f48749B = new C17716g(f48750C.getLooper());
            }
        }
    }

    /* renamed from: d */
    public void mo21212d(C17718h hVar) {
        synchronized (this) {
            this.f48763r.add(hVar);
        }
    }

    /* renamed from: e */
    public void mo21213e(C17719f fVar) {
        synchronized (this) {
            this.f48764s.add(fVar);
        }
    }

    /* renamed from: f */
    public final void mo21214f() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f48766u = this.f48756h.getCurrentPlayTime();
            this.f48756h.cancel();
            return;
        }
        removeCallbacks(this.f48769x);
        post(this.f48770y);
    }

    /* renamed from: g */
    public final void mo21215g() {
        if (this.f48760o) {
            this.f48756h.setCurrentPlayTime(this.f48766u);
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                this.f48756h.start();
                return;
            }
            removeCallbacks(this.f48770y);
            post(this.f48769x);
        }
    }

    public PAGComposition getComposition() {
        return this.f48753e.getComposition();
    }

    @Deprecated
    public PAGFile getFile() {
        return this.f48755g;
    }

    public String getPath() {
        return this.f48759n;
    }

    public double getProgress() {
        return this.f48753e.getProgress();
    }

    @Deprecated
    public PAGComposition getRootComposition() {
        return this.f48753e.getComposition();
    }

    /* renamed from: h */
    public boolean mo21221h() {
        return this.f48753e.flush();
    }

    /* renamed from: i */
    public void mo21222i(C17718h hVar) {
        synchronized (this) {
            this.f48763r.remove(hVar);
        }
    }

    /* renamed from: j */
    public final void mo21223j() {
        Boolean bool;
        if (!this.f48757i || this.f48756h.isRunning() || ((bool = this.f48758j) != null && !bool.booleanValue())) {
            this.f48758j = null;
            return;
        }
        this.f48758j = null;
        mo21215g();
    }

    /* renamed from: k */
    public boolean mo21224k(String str) {
        PAGFile Load = (str == null || !str.startsWith("assets://")) ? PAGFile.Load(str) : PAGFile.Load(getContext().getAssets(), str.substring(9));
        setComposition(Load);
        this.f48759n = str;
        return Load != null;
    }

    /* renamed from: l */
    public final void mo21225l() {
        setOpaque(false);
        this.f48753e = new PAGPlayer();
        setSurfaceTextureListener(this);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f48756h = ofFloat;
        ofFloat.setRepeatCount(0);
        this.f48756h.setInterpolator(new LinearInterpolator());
    }

    /* renamed from: m */
    public void mo21226m() {
        this.f48757i = false;
        this.f48758j = null;
        mo21214f();
    }

    public void onAttachedToWindow() {
        this.f48760o = true;
        super.onAttachedToWindow();
        this.f48756h.addListener(this.f48768w);
        synchronized (f48748A) {
            m18108c();
        }
        mo21223j();
    }

    public void onDetachedFromWindow() {
        this.f48760o = false;
        super.onDetachedFromWindow();
        PAGSurface pAGSurface = this.f48754f;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.f48754f = null;
        }
        if (this.f48758j == null) {
            this.f48758j = Boolean.valueOf(this.f48756h.isRunning());
        }
        if (this.f48756h.isRunning()) {
            mo21214f();
        }
        if (Build.VERSION.SDK_INT < 26) {
            synchronized (f48748A) {
                m18106a();
            }
        }
        this.f48756h.removeListener(this.f48768w);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        PAGSurface pAGSurface = this.f48754f;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.f48754f = null;
        }
        PAGSurface FromSurfaceTexture = PAGSurface.FromSurfaceTexture(surfaceTexture, (EGLContext) null);
        this.f48754f = FromSurfaceTexture;
        this.f48753e.setSurface(FromSurfaceTexture);
        if (this.f48754f != null) {
            this.f48756h.addUpdateListener(this.f48767v);
            if (!this.f48764s.isEmpty()) {
                this.f48754f.clearAll();
                m18107b(this);
            } else {
                mo21221h();
            }
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f48752d;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ((C119157j) C119157j.f356862d).mo183875f(new C17713c(surfaceTexture));
        this.f48756h.removeUpdateListener(this.f48767v);
        C17716g gVar = f48749B;
        boolean z = true;
        if (!(gVar == null || surfaceTexture == null)) {
            if (gVar != null) {
                Message obtainMessage = gVar.obtainMessage();
                obtainMessage.arg1 = 1;
                obtainMessage.obj = surfaceTexture;
                f48749B.sendMessage(obtainMessage);
            }
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (f48748A) {
                m18106a();
            }
        }
        return z;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        PAGSurface pAGSurface = this.f48754f;
        if (pAGSurface != null) {
            pAGSurface.updateSize();
            if (!this.f48764s.isEmpty()) {
                this.f48754f.clearAll();
                m18107b(this);
            } else {
                mo21221h();
            }
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48752d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.f48752d;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.f48771z != z) {
            this.f48771z = z;
            if (z) {
                mo21223j();
                return;
            }
            if (this.f48758j == null) {
                this.f48758j = Boolean.valueOf(this.f48756h.isRunning());
            }
            if (this.f48756h.isRunning()) {
                mo21214f();
            }
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCacheEnabled(boolean z) {
        this.f48753e.setCacheEnabled(z);
    }

    public void setCacheScale(float f) {
        this.f48753e.setCacheScale(f);
    }

    public void setComposition(PAGComposition pAGComposition) {
        this.f48759n = null;
        this.f48755g = null;
        this.f48753e.setComposition(pAGComposition);
        this.f48756h.setDuration(this.f48753e.duration() / 1000);
    }

    @Deprecated
    public void setFile(PAGFile pAGFile) {
        PAGFile pAGFile2;
        setComposition(pAGFile != null ? pAGFile.copyOriginal() : null);
        this.f48755g = pAGFile;
        if (pAGFile != null && (pAGFile2 = (PAGFile) this.f48753e.getComposition()) != null) {
            for (int i = 0; i < this.f48761p.size(); i++) {
                pAGFile2.replaceText(this.f48761p.keyAt(i), this.f48761p.valueAt(i));
            }
            this.f48761p.clear();
            for (int i2 = 0; i2 < this.f48762q.size(); i2++) {
                pAGFile2.replaceImage(this.f48762q.keyAt(i2), this.f48762q.valueAt(i2));
            }
            this.f48762q.clear();
        }
    }

    public void setMatrix(Matrix matrix) {
        this.f48753e.setMatrix(matrix);
    }

    public void setMaxFrameRate(float f) {
        this.f48753e.setMaxFrameRate(f);
    }

    public void setProgress(double d) {
        double max = Math.max(0.0d, Math.min(d, 1.0d));
        this.f48766u = (long) (((double) this.f48756h.getDuration()) * max);
        this.f48756h.setCurrentPlayTime(this.f48766u);
        this.f48765t = max;
        m18107b(this);
    }

    public void setRepeatCount(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f48756h.setRepeatCount(i - 1);
    }

    public void setScaleMode(int i) {
        this.f48753e.setScaleMode(i);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.f48752d = surfaceTextureListener;
        }
    }

    public void setVideoEnabled(boolean z) {
        this.f48753e.setVideoEnabled(z);
    }

    public ListScrollPAGView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo21225l();
    }
}
