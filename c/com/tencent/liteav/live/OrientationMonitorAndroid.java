package com.tencent.liteav.live;

import android.content.Context;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import java.lang.ref.WeakReference;

@JNINamespace("liteav::live")
public class OrientationMonitorAndroid {
    private static final String TAG = "OrientationMonitor";
    private C17163a mDisplayOrientationListener;
    /* access modifiers changed from: private */
    public boolean mIsReleased;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    /* access modifiers changed from: private */
    public final long mNativeOrientationMonitorAndroid;

    /* renamed from: com.tencent.liteav.live.OrientationMonitorAndroid$a */
    public static class C17163a extends OrientationEventListener {

        /* renamed from: a */
        public C17164b f46345a;

        /* renamed from: b */
        private final WeakReference<OrientationMonitorAndroid> f46346b;

        /* renamed from: c */
        private Display f46347c;

        public C17163a(Context context, WeakReference<OrientationMonitorAndroid> weakReference) {
            super(context);
            this.f46346b = weakReference;
            try {
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                this.f46347c = defaultDisplay;
                if (defaultDisplay == null) {
                    LiteavLog.m16905w(OrientationMonitorAndroid.TAG, "Get display instance failed.");
                } else {
                    this.f46345a = m16994a(defaultDisplay.getRotation());
                }
            } catch (Exception e) {
                LiteavLog.m16898e(OrientationMonitorAndroid.TAG, e.getMessage());
            }
        }

        /* renamed from: a */
        private static C17164b m16994a(int i) {
            return i != 1 ? i != 2 ? i != 3 ? C17164b.kUp : C17164b.kLeft : C17164b.kDown : C17164b.kRight;
        }

        public final void onOrientationChanged(int i) {
            C17164b a;
            Display display = this.f46347c;
            if (display != null && (a = m16994a(display.getRotation())) != this.f46345a) {
                this.f46345a = a;
                WeakReference<OrientationMonitorAndroid> weakReference = this.f46346b;
                OrientationMonitorAndroid orientationMonitorAndroid = weakReference != null ? weakReference.get() : null;
                if (orientationMonitorAndroid != null) {
                    synchronized (orientationMonitorAndroid.mLock) {
                        if (!orientationMonitorAndroid.mIsReleased) {
                            orientationMonitorAndroid.nativeSetOrientation(orientationMonitorAndroid.mNativeOrientationMonitorAndroid, this.f46345a.index);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.liteav.live.OrientationMonitorAndroid$b */
    public enum C17164b {
        kUp(0),
        kRight(1),
        kDown(2),
        kLeft(3);
        
        public final int index;

        private C17164b(int i) {
            this.index = i;
        }
    }

    public OrientationMonitorAndroid(long j) {
        this.mNativeOrientationMonitorAndroid = j;
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            LiteavLog.m16898e(TAG, "Invalid application context, init orientation monitor failed.");
            return;
        }
        C17163a aVar = new C17163a(applicationContext, new WeakReference(this));
        this.mDisplayOrientationListener = aVar;
        aVar.enable();
    }

    public int getOrientation() {
        int i;
        synchronized (this.mLock) {
            i = this.mDisplayOrientationListener.f46345a.index;
        }
        return i;
    }

    public native void nativeSetOrientation(long j, int i);

    public void release() {
        synchronized (this.mLock) {
            this.mIsReleased = true;
            this.mDisplayOrientationListener.disable();
        }
    }
}
