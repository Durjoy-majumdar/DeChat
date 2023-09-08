package ij1;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: ij1.b */
public final class C60299b {

    /* renamed from: a */
    public static final C60299b f171929a = new C60299b();

    /* renamed from: b */
    public static final C60302c f171930b = new C60302c();

    /* renamed from: c */
    public static final HashMap<String, Runnable> f171931c = new HashMap<>();

    /* renamed from: d */
    public static final C60303d f171932d = new C60303d();

    /* renamed from: e */
    public static final C60300a f171933e = new C60300a();

    /* renamed from: f */
    public static final C60301b f171934f = new C60301b();

    /* renamed from: g */
    public static final Runnable f171935g = C60304e.f171937d;

    /* renamed from: h */
    public static WeakReference<C60298a> f171936h;

    /* renamed from: ij1.b$a */
    public static final class C60300a implements Runnable {
        public void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onAcceptMicPkTimeout();
            }
        }
    }

    /* renamed from: ij1.b$b */
    public static final class C60301b implements Runnable {
        public void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onApplyBattleTimeout();
            }
        }
    }

    /* renamed from: ij1.b$c */
    public static final class C60302c implements Runnable {
        public void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onApplyMicTimeout();
            }
        }
    }

    /* renamed from: ij1.b$d */
    public static final class C60303d implements Runnable {
        public void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onApplyMicPkTimeout();
            }
        }
    }

    /* renamed from: ij1.b$e */
    public static final class C60304e implements Runnable {

        /* renamed from: d */
        public static final C60304e f171937d = new C60304e();

        public final void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onRandomMatchTimeout();
            }
        }
    }

    /* renamed from: ij1.b$f */
    public static final class C60305f implements Runnable {

        /* renamed from: d */
        public String f171938d;

        public void run() {
            C60298a aVar;
            WeakReference<C60298a> weakReference = C60299b.f171936h;
            if (weakReference != null && (aVar = weakReference.get()) != null) {
                aVar.onAcceptMicTimeout(this.f171938d);
            }
        }
    }

    /* renamed from: a */
    public final void mo85285a(String str, long j) {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "startAcceptMicTimer micId:" + str + " delay:" + j);
        if (str != null) {
            C60305f fVar = new C60305f();
            fVar.f171938d = str;
            f171931c.put(str, fVar);
            MMHandlerThread.postToMainThreadDelayed(fVar, j);
        }
    }

    /* renamed from: b */
    public final void mo85286b(long j) {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "startRandomMatchTimer delay:" + j);
        MMHandlerThread.postToMainThreadDelayed(f171935g, j);
    }

    /* renamed from: c */
    public final void mo85287c(String str) {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopAcceptMicTimer micId:" + str);
        if (str != null) {
            MMHandlerThread.removeRunnable(f171931c.get(str));
        }
    }

    /* renamed from: d */
    public final void mo85288d() {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopApplyMicPkTimer");
        MMHandlerThread.removeRunnable(f171932d);
    }

    /* renamed from: e */
    public final void mo85289e() {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopApplyMicTimer");
        MMHandlerThread.removeRunnable(f171930b);
    }

    /* renamed from: f */
    public final void mo85290f() {
        Log.m105924i("Finder.LinkMicTimeoutTimer", "stopRandomMatchTimer");
        MMHandlerThread.removeRunnable(f171935g);
    }
}
