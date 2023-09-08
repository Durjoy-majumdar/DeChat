package org.libpag;

import a34.C112751b;
import a34.C112752c;
import a34.C112753d;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.opengl.EGLContext;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PAGView extends TextureView implements TextureView.SurfaceTextureListener, C112753d {
    private static final int ANDROID_SDK_VERSION_O = 26;
    private static final int MSG_FLUSH = 0;
    private static final int MSG_HANDLER_THREAD_QUITE = 2;
    private static final int MSG_SURFACE_DESTROY = 1;
    private static final String TAG = "PAGView";
    private static final Object g_HandlerLock = new Object();
    private static volatile int g_HandlerThreadCount;
    private static PAGViewHandler g_PAGViewHandler;
    private static HandlerThread g_PAGViewThread;
    private volatile Boolean _isAnimatorPreRunning = null;
    private volatile boolean _isPlaying = false;
    private float animationScale = 1.0f;
    /* access modifiers changed from: private */
    public ValueAnimator animator;
    /* access modifiers changed from: private */
    public volatile long currentPlayTime;
    private String filePath = "";
    private SparseArray<PAGImage> imageReplacementMap = new SparseArray<>();
    /* access modifiers changed from: private */
    public boolean isAttachedToWindow = false;
    private boolean isSync = false;
    private Runnable mAnimatorCancelRunnable = new Runnable() {
        public void run() {
            PAGView pAGView = PAGView.this;
            long unused = pAGView.currentPlayTime = pAGView.animator.getCurrentPlayTime();
            PAGView.this.animator.cancel();
        }
    };
    private final AnimatorListenerAdapter mAnimatorListenerAdapter = new AnimatorListenerAdapter() {
        public void onAnimationCancel(Animator animator) {
            ArrayList arrayList;
            super.onAnimationCancel(animator);
            synchronized (PAGView.this) {
                arrayList = new ArrayList(PAGView.this.mViewListeners);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PAGViewListener) it.next()).onAnimationCancel(PAGView.this);
            }
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            int repeatCount = ((ValueAnimator) animator).getRepeatCount();
            if (repeatCount >= 0 && animator.getDuration() > 0 && PAGView.this.currentPlayTime / animator.getDuration() > ((long) repeatCount)) {
                PAGView.this.notifyEnd();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            ArrayList arrayList;
            super.onAnimationRepeat(animator);
            synchronized (PAGView.this) {
                arrayList = new ArrayList(PAGView.this.mViewListeners);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PAGViewListener) it.next()).onAnimationRepeat(PAGView.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList;
            super.onAnimationStart(animator);
            synchronized (PAGView.this) {
                arrayList = new ArrayList(PAGView.this.mViewListeners);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((PAGViewListener) it.next()).onAnimationStart(PAGView.this);
            }
        }
    };
    private Runnable mAnimatorStartRunnable = new Runnable() {
        public void run() {
            if (PAGView.this.isAttachedToWindow) {
                PAGView.this.animator.start();
            }
        }
    };
    private final ValueAnimator.AnimatorUpdateListener mAnimatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() {
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            long unused = PAGView.this.currentPlayTime = valueAnimator.getCurrentPlayTime();
            PAGView.NeedsUpdateView(PAGView.this);
        }
    };
    private TextureView.SurfaceTextureListener mListener;
    /* access modifiers changed from: private */
    public ArrayList<PAGFlushListener> mPAGFlushListeners = new ArrayList<>();
    private boolean mSaveVisibleState;
    /* access modifiers changed from: private */
    public ArrayList<PAGViewListener> mViewListeners = new ArrayList<>();
    private PAGFile pagFile;
    private PAGPlayer pagPlayer;
    private PAGSurface pagSurface;
    private boolean preAggregatedVisible = true;
    private volatile boolean progressExplicitlySet = true;
    private EGLContext sharedContext = null;
    private SparseArray<PAGText> textReplacementMap = new SparseArray<>();
    private final Object updateTimeLock = new Object();

    public interface PAGViewListener {
        void onAnimationCancel(PAGView pAGView);

        void onAnimationEnd(PAGView pAGView);

        void onAnimationRepeat(PAGView pAGView);

        void onAnimationStart(PAGView pAGView);

        void onAnimationUpdate(PAGView pAGView);
    }

    public interface PAGFlushListener {
        void onFlush();
    }

    public static class PAGViewHandler extends Handler {
        private final Object lock = new Object();
        private List<PAGView> needsUpdateViews = new ArrayList();

        public PAGViewHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ArrayList arrayList;
            super.handleMessage(message);
            int i = message.arg1;
            if (i == 0) {
                synchronized (this.lock) {
                    arrayList = new ArrayList(this.needsUpdateViews);
                    this.needsUpdateViews.clear();
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof PAGView) {
                        PAGView pAGView = (PAGView) next;
                        if (!arrayList2.contains(pAGView)) {
                            pAGView.updateView();
                            arrayList2.add(pAGView);
                        }
                    }
                }
            } else if (i == 1) {
                Object obj = message.obj;
                if (obj instanceof SurfaceTexture) {
                    ((SurfaceTexture) obj).release();
                }
            } else if (i == 2) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public void run() {
                        PAGView.HandlerThreadQuit();
                    }
                });
            }
        }

        public void needsUpdateView(PAGView pAGView) {
            synchronized (this.lock) {
                if (this.needsUpdateViews.isEmpty()) {
                    Message obtainMessage = obtainMessage();
                    obtainMessage.arg1 = 0;
                    sendMessage(obtainMessage);
                }
                this.needsUpdateViews.add(pAGView);
            }
        }
    }

    public PAGView(Context context) {
        super(context);
        setupSurfaceTexture();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void DestroyHandlerThread() {
        /*
            java.lang.Class<org.libpag.PAGView> r0 = org.libpag.PAGView.class
            monitor-enter(r0)
            int r1 = g_HandlerThreadCount     // Catch:{ all -> 0x0029 }
            int r1 = r1 + -1
            g_HandlerThreadCount = r1     // Catch:{ all -> 0x0029 }
            int r1 = g_HandlerThreadCount     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)
            return
        L_0x000f:
            org.libpag.PAGView$PAGViewHandler r1 = g_PAGViewHandler     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x0027
            android.os.HandlerThread r1 = g_PAGViewThread     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0027
        L_0x0018:
            boolean r1 = r1.isAlive()     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0020
            monitor-exit(r0)
            return
        L_0x0020:
            r1 = 2
            r2 = 0
            SendMessage(r1, r2)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)
            return
        L_0x0027:
            monitor-exit(r0)
            return
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.libpag.PAGView.DestroyHandlerThread():void");
    }

    /* access modifiers changed from: private */
    public static void HandlerThreadQuit() {
        HandlerThread handlerThread;
        if (g_HandlerThreadCount == 0 && g_PAGViewHandler != null && (handlerThread = g_PAGViewThread) != null && handlerThread.isAlive()) {
            g_PAGViewHandler.removeCallbacksAndMessages((Object) null);
            g_PAGViewThread.quitSafely();
            g_PAGViewThread = null;
            g_PAGViewHandler = null;
        }
    }

    /* access modifiers changed from: private */
    public static void NeedsUpdateView(PAGView pAGView) {
        if (pAGView.isSync) {
            pAGView.updateView();
            return;
        }
        PAGViewHandler pAGViewHandler = g_PAGViewHandler;
        if (pAGViewHandler != null) {
            pAGViewHandler.needsUpdateView(pAGView);
        }
    }

    private static void SendMessage(int i, Object obj) {
        PAGViewHandler pAGViewHandler = g_PAGViewHandler;
        if (pAGViewHandler != null) {
            Message obtainMessage = pAGViewHandler.obtainMessage();
            obtainMessage.arg1 = i;
            if (obj != null) {
                obtainMessage.obj = obj;
            }
            g_PAGViewHandler.sendMessage(obtainMessage);
        }
    }

    private static synchronized void StartHandlerThread() {
        synchronized (PAGView.class) {
            g_HandlerThreadCount++;
            if (g_PAGViewThread == null) {
                HandlerThread handlerThread = new HandlerThread("pag-renderer");
                g_PAGViewThread = handlerThread;
                handlerThread.start();
            }
            if (g_PAGViewHandler == null) {
                g_PAGViewHandler = new PAGViewHandler(g_PAGViewThread.getLooper());
            }
        }
    }

    private void cancelAnimator() {
        if (isMainThread()) {
            this.currentPlayTime = this.animator.getCurrentPlayTime();
            this.animator.cancel();
            return;
        }
        removeCallbacks(this.mAnimatorStartRunnable);
        post(this.mAnimatorCancelRunnable);
    }

    private void doPlay() {
        this.pagPlayer.prepare();
        if (this.isAttachedToWindow) {
            if (this.animationScale == 0.0f) {
                notifyEnd();
                return;
            }
            this.animator.setCurrentPlayTime(this.currentPlayTime);
            startAnimator();
        }
    }

    private boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* access modifiers changed from: private */
    public void notifyEnd() {
        ArrayList arrayList;
        this._isPlaying = false;
        synchronized (this) {
            arrayList = new ArrayList(this.mViewListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PAGViewListener) it.next()).onAnimationEnd(this);
        }
    }

    private void pauseAnimator() {
        if (this._isAnimatorPreRunning == null) {
            this._isAnimatorPreRunning = Boolean.valueOf(this.animator.isRunning());
        }
        if (this.animator.isRunning()) {
            cancelAnimator();
        }
    }

    private void resumeAnimator() {
        if (!this._isPlaying || this.animator.isRunning() || (this._isAnimatorPreRunning != null && !this._isAnimatorPreRunning.booleanValue())) {
            this._isAnimatorPreRunning = null;
            updateTextureView();
            return;
        }
        this._isAnimatorPreRunning = null;
        doPlay();
    }

    private void setupSurfaceTexture() {
        C112751b bVar = C112751b.f337624f;
        bVar.getClass();
        if (getContext() instanceof Activity) {
            Activity activity = (Activity) getContext();
            if (!activity.isDestroyed()) {
                FragmentManager fragmentManager = activity.getFragmentManager();
                C112752c cVar = (C112752c) ((HashMap) bVar.f337626e).get(fragmentManager);
                if (cVar == null && (cVar = (C112752c) fragmentManager.findFragmentByTag("io.pag.manager")) == null) {
                    cVar = new C112752c();
                    ((HashMap) bVar.f337626e).put(fragmentManager, cVar);
                    fragmentManager.beginTransaction().add(cVar, "io.pag.manager").commitAllowingStateLoss();
                    bVar.f337625d.obtainMessage(1, fragmentManager).sendToTarget();
                }
                synchronized (cVar.f337627d) {
                    cVar.f337627d.add(this);
                }
            }
        }
        setOpaque(false);
        this.pagPlayer = new PAGPlayer();
        setSurfaceTextureListener(this);
        this.animationScale = getAnimationScale(getContext());
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.animator = ofFloat;
        ofFloat.setRepeatCount(0);
        this.animator.setInterpolator(new LinearInterpolator());
    }

    private void startAnimator() {
        if (this.animator.getDuration() > 0) {
            if (isMainThread()) {
                this.animator.start();
                return;
            }
            removeCallbacks(this.mAnimatorCancelRunnable);
            post(this.mAnimatorStartRunnable);
        }
    }

    private void updateTextureView() {
        post(new Runnable() {
            public void run() {
                boolean isOpaque = PAGView.this.isOpaque();
                PAGView.this.setOpaque(!isOpaque);
                PAGView.this.setOpaque(isOpaque);
            }
        });
    }

    /* access modifiers changed from: private */
    public void updateView() {
        if (this.isAttachedToWindow) {
            flush();
            updateTextureView();
            if (!this.mPAGFlushListeners.isEmpty()) {
                post(new Runnable() {
                    public void run() {
                        ArrayList arrayList;
                        synchronized (PAGView.this) {
                            arrayList = new ArrayList(PAGView.this.mPAGFlushListeners);
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((PAGFlushListener) it.next()).onFlush();
                        }
                    }
                });
            }
        }
    }

    public void addListener(PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.mViewListeners.add(pAGViewListener);
        }
    }

    public void addPAGFlushListener(PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.mPAGFlushListeners.add(pAGFlushListener);
        }
    }

    public boolean cacheEnabled() {
        return this.pagPlayer.cacheEnabled();
    }

    public float cacheScale() {
        return this.pagPlayer.cacheScale();
    }

    public long duration() {
        return this.pagPlayer.duration();
    }

    public boolean flush() {
        boolean z;
        ArrayList arrayList;
        if (this.pagSurface == null) {
            return this.pagPlayer.flush();
        }
        synchronized (this.updateTimeLock) {
            if (this.progressExplicitlySet) {
                z = this.pagPlayer.flush();
                this.progressExplicitlySet = false;
                this.animator.setCurrentPlayTime((long) ((this.pagPlayer.getProgress() * ((double) this.pagPlayer.duration())) / 1000.0d));
            } else {
                this.pagPlayer.setProgress((double) this.animator.getAnimatedFraction());
                z = this.pagPlayer.flush();
            }
        }
        synchronized (this) {
            arrayList = new ArrayList(this.mViewListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((PAGViewListener) it.next()).onAnimationUpdate(this);
        }
        return z;
    }

    public void freeCache() {
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            pAGSurface.freeCache();
        }
    }

    public float getAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public PAGComposition getComposition() {
        return this.pagPlayer.getComposition();
    }

    public PAGLayer[] getLayersUnderPoint(float f, float f2) {
        return this.pagPlayer.getLayersUnderPoint(f, f2);
    }

    public String getPath() {
        return this.filePath;
    }

    public double getProgress() {
        return this.pagPlayer.getProgress();
    }

    public boolean isPlaying() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            return valueAnimator.isRunning();
        }
        return false;
    }

    public boolean isSync() {
        return this.isSync;
    }

    public Bitmap makeSnapshot() {
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            return pAGSurface.makeSnapshot();
        }
        return null;
    }

    public Matrix matrix() {
        return this.pagPlayer.matrix();
    }

    public float maxFrameRate() {
        return this.pagPlayer.maxFrameRate();
    }

    public void onAttachedToWindow() {
        this.isAttachedToWindow = true;
        super.onAttachedToWindow();
        this.animator.addUpdateListener(this.mAnimatorUpdateListener);
        this.animator.addListener(this.mAnimatorListenerAdapter);
        synchronized (g_HandlerLock) {
            StartHandlerThread();
        }
        resumeAnimator();
    }

    public void onDetachedFromWindow() {
        this.isAttachedToWindow = false;
        super.onDetachedFromWindow();
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.pagSurface = null;
        }
        pauseAnimator();
        if (Build.VERSION.SDK_INT < 26) {
            synchronized (g_HandlerLock) {
                DestroyHandlerThread();
            }
        }
        this.animator.removeUpdateListener(this.mAnimatorUpdateListener);
        this.animator.removeListener(this.mAnimatorListenerAdapter);
    }

    public void onResume() {
        if (this.isAttachedToWindow && getVisibility() == 0) {
            setVisibility(4);
            setVisibility(0);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            pAGSurface.release();
            this.pagSurface = null;
        }
        PAGSurface FromSurfaceTexture = PAGSurface.FromSurfaceTexture(surfaceTexture, this.sharedContext);
        this.pagSurface = FromSurfaceTexture;
        this.pagPlayer.setSurface(FromSurfaceTexture);
        PAGSurface pAGSurface2 = this.pagSurface;
        if (pAGSurface2 != null) {
            pAGSurface2.clearAll();
            NeedsUpdateView(this);
            TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.pagPlayer.setSurface((PAGSurface) null);
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
        }
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            pAGSurface.freeCache();
        }
        boolean z = true;
        if (!(g_PAGViewHandler == null || surfaceTexture == null)) {
            SendMessage(1, surfaceTexture);
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            synchronized (g_HandlerLock) {
                DestroyHandlerThread();
            }
        }
        return z;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        PAGSurface pAGSurface = this.pagSurface;
        if (pAGSurface != null) {
            pAGSurface.updateSize();
            this.pagSurface.clearAll();
            NeedsUpdateView(this);
        }
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        TextureView.SurfaceTextureListener surfaceTextureListener = this.mListener;
        if (surfaceTextureListener != null) {
            surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        if (this.preAggregatedVisible != z) {
            this.preAggregatedVisible = z;
            if (z) {
                resumeAnimator();
            } else {
                pauseAnimator();
            }
        }
    }

    public void play() {
        this._isPlaying = true;
        this._isAnimatorPreRunning = null;
        if (((double) this.animator.getAnimatedFraction()) == 1.0d) {
            setProgress(0.0d);
        }
        doPlay();
    }

    public void removeListener(PAGViewListener pAGViewListener) {
        synchronized (this) {
            this.mViewListeners.remove(pAGViewListener);
        }
    }

    public void removePAGFlushListener(PAGFlushListener pAGFlushListener) {
        synchronized (this) {
            this.mPAGFlushListeners.remove(pAGFlushListener);
        }
    }

    public int scaleMode() {
        return this.pagPlayer.scaleMode();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24 && drawable != null) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setCacheEnabled(boolean z) {
        this.pagPlayer.setCacheEnabled(z);
    }

    public void setCacheScale(float f) {
        this.pagPlayer.setCacheScale(f);
    }

    public void setComposition(PAGComposition pAGComposition) {
        this.filePath = null;
        this.pagFile = null;
        this.pagPlayer.setComposition(pAGComposition);
        this.progressExplicitlySet = true;
        this.animator.setDuration(this.pagPlayer.duration() / 1000);
    }

    public void setMatrix(Matrix matrix) {
        this.pagPlayer.setMatrix(matrix);
    }

    public void setMaxFrameRate(float f) {
        this.pagPlayer.setMaxFrameRate(f);
    }

    public boolean setPath(String str) {
        PAGFile Load = (str == null || !str.startsWith("assets://")) ? PAGFile.Load(str) : PAGFile.Load(getContext().getAssets(), str.substring(9));
        setComposition(Load);
        this.filePath = str;
        return Load != null;
    }

    public void setProgress(double d) {
        synchronized (this.updateTimeLock) {
            this.pagPlayer.setProgress(d);
            this.progressExplicitlySet = true;
        }
        NeedsUpdateView(this);
    }

    public void setRepeatCount(int i) {
        if (i < 0) {
            i = 0;
        }
        this.animator.setRepeatCount(i - 1);
    }

    public void setScaleMode(int i) {
        this.pagPlayer.setScaleMode(i);
    }

    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        if (surfaceTextureListener == this) {
            super.setSurfaceTextureListener(surfaceTextureListener);
        } else {
            this.mListener = surfaceTextureListener;
        }
    }

    public void setSync(boolean z) {
        this.isSync = z;
    }

    public void setVideoEnabled(boolean z) {
        this.pagPlayer.setVideoEnabled(z);
    }

    public void stop() {
        this._isPlaying = false;
        this._isAnimatorPreRunning = null;
        cancelAnimator();
    }

    public boolean videoEnabled() {
        return this.pagPlayer.videoEnabled();
    }

    public PAGView(Context context, EGLContext eGLContext) {
        super(context);
        this.sharedContext = eGLContext;
        setupSurfaceTexture();
    }

    public PAGView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupSurfaceTexture();
    }

    public PAGView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setupSurfaceTexture();
    }
}
