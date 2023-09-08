package com.tencent.matrix.openglleak.hook;

import android.opengl.EGL14;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import k20.C9556a;
import p1040te.C90394a;
import p1046ue.C90648b;
import p1046ue.C90650d;
import p1046ue.C90652e;
import p1053ve.C90767a;
import p1053ve.C90771e;
import p723vf.C118672d;

public class OpenGLHook {
    private static final String TAG = "MicroMsg.OpenGLHook";
    private static final OpenGLHook mInstance = new OpenGLHook();
    private byte _hellAccFlag_;
    private C80510a mBindListener;
    private C80511b mErrorListener;
    private C80512c mMemoryListener;
    private C80513d mResourceListener;

    /* renamed from: com.tencent.matrix.openglleak.hook.OpenGLHook$a */
    public interface C80510a {
        /* renamed from: a */
        void mo112047a(int i, long j, int i2);

        /* renamed from: b */
        void mo112048b(int i, long j, int i2);

        /* renamed from: c */
        void mo112049c(int i, long j, int i2);

        /* renamed from: d */
        void mo112050d(int i, long j, int i2);
    }

    /* renamed from: com.tencent.matrix.openglleak.hook.OpenGLHook$b */
    public interface C80511b {
        /* renamed from: a */
        void mo112051a(int i);
    }

    /* renamed from: com.tencent.matrix.openglleak.hook.OpenGLHook$c */
    public interface C80512c {
        /* renamed from: a */
        void mo112052a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, long j2);

        /* renamed from: b */
        void mo112053b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i15, long j, long j2);

        /* renamed from: c */
        void mo112054c(int i, int i2, int i3, int i4, int i5, long j, long j2);

        /* renamed from: d */
        void mo112055d(int i, int i2, int i3, long j, long j2);
    }

    /* renamed from: com.tencent.matrix.openglleak.hook.OpenGLHook$d */
    public interface C80513d {
        /* renamed from: a */
        void mo112056a(C90650d dVar);

        /* renamed from: b */
        void mo112057b(C90650d dVar);

        /* renamed from: c */
        void mo112058c(C90650d dVar);

        /* renamed from: d */
        void mo112059d(C90650d dVar);

        /* renamed from: e */
        void mo112060e(C90650d dVar);

        /* renamed from: f */
        void mo112061f(C90650d dVar);

        /* renamed from: g */
        void mo112062g(C90650d dVar);

        /* renamed from: h */
        void mo112063h(C90650d dVar);

        /* renamed from: i */
        void mo112064i(C90650d dVar);

        /* renamed from: j */
        void mo112065j(C90650d dVar);
    }

    static {
        C9556a aVar = new C9556a();
        aVar.mo10233c("matrix-opengl-leak");
        Object obj = new Object();
        C117292a.m165358d(obj, aVar.mo10232b(), "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        System.loadLibrary((String) aVar.mo10231a(0));
        C117292a.m165359e(obj, "com/tencent/matrix/openglleak/hook/OpenGLHook", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
    }

    private OpenGLHook() {
    }

    public static native String dumpBriefNativeStack(long j);

    public static native String dumpNativeStack(long j);

    public static OpenGLHook getInstance() {
        return mInstance;
    }

    public static int getThrowable() {
        Map<Integer, Throwable> map = C90771e.f260666a;
        Throwable th = new Throwable();
        int hashCode = th.hashCode();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C90771e.f260666a;
        concurrentHashMap.get(Integer.valueOf(hashCode));
        concurrentHashMap.put(Integer.valueOf(hashCode), th);
        return hashCode;
    }

    public static native boolean hookEgl();

    private static native boolean hookGlBindBuffer(int i);

    private static native boolean hookGlBindFramebuffer(int i);

    private static native boolean hookGlBindRenderbuffer(int i);

    private static native boolean hookGlBindTexture(int i);

    private static native boolean hookGlBufferData(int i);

    private static native boolean hookGlDeleteBuffers(int i);

    private static native boolean hookGlDeleteFramebuffers(int i);

    private static native boolean hookGlDeleteRenderbuffers(int i);

    private static native boolean hookGlDeleteTextures(int i);

    private static native boolean hookGlGenBuffers(int i);

    private static native boolean hookGlGenFramebuffers(int i);

    private static native boolean hookGlGenRenderbuffers(int i);

    private static native boolean hookGlGenTextures(int i);

    private static native boolean hookGlGetError(int i);

    private static native boolean hookGlRenderbufferStorage(int i);

    private static native boolean hookGlTexImage2D(int i);

    private static native boolean hookGlTexImage3D(int i);

    public static native boolean isEglContextAlive(long j);

    public static native boolean isEglSurfaceAlive(long j);

    public static void onEglContextCreate(String str, int i, long j, long j2, long j3, String str2) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        String str3 = str;
        long j4 = j2;
        C90650d dVar = new C90650d(C90650d.C90651a.EGL_CONTEXT, -1, str3, j4, 0, 0, C90771e.m113833a(i), j, C90767a.m113829b(str2), atomicInteger);
        C90652e eVar = C90652e.f260459f;
        eVar.mo124796d(dVar);
        Long valueOf = Long.valueOf(j3);
        Long valueOf2 = Long.valueOf(j2);
        synchronized (eVar.f260464e) {
            ((ArrayList) eVar.f260464e).add(valueOf2);
        }
        if (valueOf.longValue() != 0) {
            synchronized (eVar.f260463d) {
                Set set = (Set) ((HashMap) eVar.f260463d).get(valueOf);
                if (set == null) {
                    set = new HashSet();
                    ((HashMap) eVar.f260463d).put(valueOf, set);
                }
                ((HashMap) eVar.f260463d).put(valueOf2, set);
                set.add(valueOf2);
                set.add(valueOf);
            }
        }
        if (getInstance().mResourceListener != null) {
            getInstance().mResourceListener.mo112058c(dVar);
        }
    }

    public static void onEglContextDestroy(String str, long j, int i) {
        Set set;
        C90650d dVar = new C90650d(C90650d.C90651a.EGL_CONTEXT, -1, str, j);
        if (i == 0) {
            C118672d.m167352b(TAG, "eglContextDestroy failed: thread=%s, context=%s, ret=%s, errno=%s", str, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(EGL14.eglGetError()));
            return;
        }
        C90652e eVar = C90652e.f260459f;
        eVar.mo124793a(dVar);
        Long valueOf = Long.valueOf(j);
        synchronized (eVar.f260464e) {
            ((ArrayList) eVar.f260464e).remove(valueOf);
        }
        synchronized (eVar.f260463d) {
            if (((HashMap) eVar.f260463d).containsKey(valueOf) && (set = (Set) ((HashMap) eVar.f260463d).remove(valueOf)) != null) {
                set.remove(valueOf);
            }
        }
        if (getInstance().mResourceListener != null) {
            getInstance().mResourceListener.mo112056a(dVar);
        }
    }

    public static void onGetError(int i) {
        if (getInstance().mErrorListener != null) {
            getInstance().mErrorListener.mo112051a(i);
        }
    }

    public static void onGlBindBuffer(int i, int i2, long j) {
        C90650d.C90651a aVar = C90650d.C90651a.BUFFER;
        C90394a.f259403a.mo124607b(aVar, i, j, i2 != 0 ? C90652e.f260459f.mo124795c(aVar, j, i2) : null);
        if (getInstance().mBindListener != null) {
            getInstance().mBindListener.mo112049c(i, j, i2);
        }
    }

    public static void onGlBindFramebuffer(int i, int i2, long j) {
        C90650d.C90651a aVar = C90650d.C90651a.FRAME_BUFFERS;
        C90394a.f259403a.mo124607b(aVar, i, j, i2 != 0 ? C90652e.f260459f.mo124795c(aVar, j, i2) : null);
        if (getInstance().mBindListener != null) {
            getInstance().mBindListener.mo112050d(i, j, i2);
        }
    }

    public static void onGlBindRenderbuffer(int i, int i2, long j) {
        C90650d.C90651a aVar = C90650d.C90651a.RENDER_BUFFERS;
        C90394a.f259403a.mo124607b(aVar, i, j, i2 != 0 ? C90652e.f260459f.mo124795c(aVar, j, i2) : null);
        if (getInstance().mBindListener != null) {
            getInstance().mBindListener.mo112048b(i, j, i2);
        }
    }

    public static void onGlBindTexture(int i, int i2, long j) {
        C90650d.C90651a aVar = C90650d.C90651a.TEXTURE;
        C90394a.f259403a.mo124607b(aVar, i, j, i2 != 0 ? C90652e.f260459f.mo124795c(aVar, j, i2) : null);
        if (getInstance().mBindListener != null) {
            getInstance().mBindListener.mo112047a(i, j, i2);
        }
    }

    public static void onGlBufferData(int i, int i2, long j, int i3, long j2, long j3) {
        int i4 = i;
        C90394a aVar = C90394a.f259403a;
        C90650d.C90651a aVar2 = C90650d.C90651a.BUFFER;
        C90650d a = aVar.mo124606a(aVar2, j3, i);
        if (a == null) {
            C118672d.m167352b(TAG, "onGlBufferData: getCurrentResourceIdByTarget result == null, maybe didn't call glBindBuffer()", new Object[0]);
            return;
        }
        long j4 = i4 == 35052 ? 2 * j : j;
        C90771e.C90772a a2 = C90771e.m113833a(i3);
        C90648b bVar = a.f260447f;
        if (bVar == null) {
            bVar = new C90648b(aVar2);
        }
        int i5 = a.f260443b;
        long j5 = a.f260448g;
        bVar.f260425a = i4;
        bVar.f260431g = i2;
        bVar.f260429e = i5;
        bVar.f260430f = j5;
        bVar.f260435k = j4;
        C90771e.C90772a aVar3 = bVar.f260432h;
        if (aVar3 != null) {
            aVar3.mo124896a();
        }
        long j6 = bVar.f260433i;
        if (j6 != 0) {
            releaseNative(j6);
        }
        bVar.f260432h = a2;
        bVar.f260433i = j2;
        if (a.f260447f != bVar) {
            a.f260447f = bVar;
        }
        if (getInstance().mMemoryListener != null) {
            getInstance().mMemoryListener.mo112055d(i, i2, a.f260443b, a.f260448g, j);
        }
    }

    public static void onGlDeleteBuffers(int[] iArr, String str, long j) {
        if (iArr.length > 0) {
            for (int dVar : iArr) {
                C90650d dVar2 = new C90650d(C90650d.C90651a.BUFFER, dVar, str, j);
                C90652e.f260459f.mo124793a(dVar2);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112061f(dVar2);
                }
            }
        }
    }

    public static void onGlDeleteFramebuffers(int[] iArr, String str, long j) {
        if (iArr.length > 0) {
            for (int dVar : iArr) {
                C90650d dVar2 = new C90650d(C90650d.C90651a.FRAME_BUFFERS, dVar, str, j);
                C90652e.f260459f.mo124793a(dVar2);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112064i(dVar2);
                }
            }
        }
    }

    public static void onGlDeleteRenderbuffers(int[] iArr, String str, long j) {
        if (iArr.length > 0) {
            for (int dVar : iArr) {
                C90650d dVar2 = new C90650d(C90650d.C90651a.RENDER_BUFFERS, dVar, str, j);
                C90652e.f260459f.mo124793a(dVar2);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112062g(dVar2);
                }
            }
        }
    }

    public static void onGlDeleteTextures(int[] iArr, String str, long j) {
        if (iArr.length > 0) {
            for (int dVar : iArr) {
                C90650d dVar2 = new C90650d(C90650d.C90651a.TEXTURE, dVar, str, j);
                C90652e.f260459f.mo124793a(dVar2);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112063h(dVar2);
                }
            }
        }
    }

    public static void onGlGenBuffers(int[] iArr, String str, int i, long j, long j2, long j3, long j4, String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            AtomicInteger atomicInteger = new AtomicInteger(iArr2.length);
            C90771e.C90772a a = C90771e.m113833a(i);
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                int i4 = i2;
                C90650d dVar = r2;
                int i5 = length;
                C90650d dVar2 = new C90650d(C90650d.C90651a.BUFFER, i3, str, j2, j3, j4, a, j, C90767a.m113829b(str2), atomicInteger);
                C90652e.f260459f.mo124796d(dVar);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112065j(dVar);
                }
                i2 = i4 + 1;
                iArr2 = iArr;
                length = i5;
            }
        }
    }

    public static void onGlGenFramebuffers(int[] iArr, String str, int i, long j, long j2, long j3, long j4, String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            AtomicInteger atomicInteger = new AtomicInteger(iArr2.length);
            C90771e.C90772a a = C90771e.m113833a(i);
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                int i4 = i2;
                C90650d dVar = r2;
                int i5 = length;
                C90650d dVar2 = new C90650d(C90650d.C90651a.FRAME_BUFFERS, i3, str, j2, j3, j4, a, j, C90767a.m113829b(str2), atomicInteger);
                C90652e.f260459f.mo124796d(dVar);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112057b(dVar);
                }
                i2 = i4 + 1;
                iArr2 = iArr;
                length = i5;
            }
        }
    }

    public static void onGlGenRenderbuffers(int[] iArr, String str, int i, long j, long j2, long j3, long j4, String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            AtomicInteger atomicInteger = new AtomicInteger(iArr2.length);
            C90771e.C90772a a = C90771e.m113833a(i);
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                int i4 = i2;
                C90650d dVar = r2;
                int i5 = length;
                C90650d dVar2 = new C90650d(C90650d.C90651a.RENDER_BUFFERS, i3, str, j2, j3, j4, a, j, C90767a.m113829b(str2), atomicInteger);
                C90652e.f260459f.mo124796d(dVar);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112060e(dVar);
                }
                i2 = i4 + 1;
                iArr2 = iArr;
                length = i5;
            }
        }
    }

    public static void onGlGenTextures(int[] iArr, String str, int i, long j, long j2, long j3, long j4, String str2) {
        int[] iArr2 = iArr;
        if (iArr2.length > 0) {
            AtomicInteger atomicInteger = new AtomicInteger(iArr2.length);
            C90771e.C90772a a = C90771e.m113833a(i);
            int length = iArr2.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr2[i2];
                int i4 = i2;
                C90650d dVar = r2;
                int i5 = length;
                C90650d dVar2 = new C90650d(C90650d.C90651a.TEXTURE, i3, str, j2, j3, j4, a, j, C90767a.m113829b(str2), atomicInteger);
                C90652e.f260459f.mo124796d(dVar);
                if (getInstance().mResourceListener != null) {
                    getInstance().mResourceListener.mo112059d(dVar);
                }
                i2 = i4 + 1;
                iArr2 = iArr;
                length = i5;
            }
        }
    }

    public static void onGlRenderbufferStorage(int i, int i2, int i3, int i4, long j, int i5, long j2, long j3) {
        int i6 = i;
        C90394a aVar = C90394a.f259403a;
        C90650d.C90651a aVar2 = C90650d.C90651a.RENDER_BUFFERS;
        C90650d a = aVar.mo124606a(aVar2, j3, i);
        if (a == null) {
            C118672d.m167352b(TAG, "onGlRenderbufferStorage: getCurrentResourceIdByTarget result == null, maybe didn't call glBindRenderbuffer()", new Object[0]);
            return;
        }
        C90771e.C90772a a2 = C90771e.m113833a(i5);
        C90648b bVar = a.f260447f;
        if (bVar == null) {
            bVar = new C90648b(aVar2);
        }
        int i7 = a.f260443b;
        long j4 = a.f260448g;
        bVar.f260425a = i6;
        bVar.f260427c = i3;
        bVar.f260428d = i4;
        bVar.f260426b = i2;
        bVar.f260429e = i7;
        bVar.f260430f = j4;
        bVar.f260435k = j;
        C90771e.C90772a aVar3 = bVar.f260432h;
        if (aVar3 != null) {
            aVar3.mo124896a();
        }
        long j5 = bVar.f260433i;
        if (j5 != 0) {
            releaseNative(j5);
        }
        bVar.f260432h = a2;
        bVar.f260433i = j2;
        if (a.f260447f != bVar) {
            a.f260447f = bVar;
        }
        if (getInstance().mMemoryListener != null) {
            getInstance().mMemoryListener.mo112054c(i, i3, i4, i2, a.f260443b, a.f260448g, j);
        }
    }

    public static void onGlTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, int i9, long j2, long j3) {
        C90394a aVar = C90394a.f259403a;
        C90650d.C90651a aVar2 = C90650d.C90651a.TEXTURE;
        C90650d a = aVar.mo124606a(aVar2, j3, i);
        if (a == null) {
            C118672d.m167352b(TAG, "onGlTexImage2D: getCurrentResourceIdByTarget openGLID == null, maybe didn't call glBindTextures()", new Object[0]);
            return;
        }
        C90771e.C90772a a2 = C90771e.m113833a(i9);
        C90648b bVar = a.f260447f;
        if (bVar == null) {
            bVar = new C90648b(aVar2);
        }
        C90648b bVar2 = bVar;
        bVar2.mo124783c(i, i2, i3, i4, i5, 0, i6, i7, i8, a.f260443b, a.f260448g, j, a2, j2);
        if (a.f260447f != bVar2) {
            a.f260447f = bVar2;
        }
        if (getInstance().mMemoryListener != null) {
            getInstance().mMemoryListener.mo112052a(i, i2, i3, i4, i5, i6, i7, i8, a.f260443b, a.f260448g, j);
        }
    }

    public static void onGlTexImage3D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j, int i15, long j2, long j3) {
        C90394a aVar = C90394a.f259403a;
        C90650d.C90651a aVar2 = C90650d.C90651a.TEXTURE;
        C90650d a = aVar.mo124606a(aVar2, j3, i);
        if (a == null) {
            C118672d.m167352b(TAG, "onGlTexImage3D: getCurrentResourceIdByTarget result == null, maybe didn't call glBindTextures()", new Object[0]);
            return;
        }
        C90771e.C90772a a2 = C90771e.m113833a(i15);
        C90648b bVar = a.f260447f;
        if (bVar == null) {
            bVar = new C90648b(aVar2);
        }
        C90648b bVar2 = bVar;
        bVar2.mo124783c(i, i2, i3, i4, i5, i6, i7, i8, i9, a.f260443b, a.f260448g, j, a2, j2);
        if (a.f260447f != bVar2) {
            a.f260447f = bVar2;
        }
        if (getInstance().mMemoryListener != null) {
            getInstance().mMemoryListener.mo112053b(i, i2, i3, i4, i5, i6, i7, i8, i9, a.f260443b, a.f260448g, j);
        }
    }

    public static native void releaseNative(long j);

    public native int getResidualQueueSize();

    public boolean hook(String str, int i) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1579524317:
                if (str.equals("glDeleteBuffers")) {
                    c = 0;
                    break;
                }
                break;
            case -1458259656:
                if (str.equals("glBindRenderbuffer")) {
                    c = 1;
                    break;
                }
                break;
            case -1201225272:
                if (str.equals("glDeleteTextures")) {
                    c = 2;
                    break;
                }
                break;
            case -782326065:
                if (str.equals("glBufferData")) {
                    c = 3;
                    break;
                }
                break;
            case -745683086:
                if (str.equals("glGenRenderbuffers")) {
                    c = 4;
                    break;
                }
                break;
            case 382288267:
                if (str.equals("glTexImage2D")) {
                    c = 5;
                    break;
                }
                break;
            case 382288298:
                if (str.equals("glTexImage3D")) {
                    c = 6;
                    break;
                }
                break;
            case 584221689:
                if (str.equals("glBindTexture")) {
                    c = 7;
                    break;
                }
                break;
            case 836645174:
                if (str.equals("glDeleteFramebuffers")) {
                    c = 8;
                    break;
                }
                break;
            case 891911968:
                if (str.equals("glRenderbufferStorage")) {
                    c = 9;
                    break;
                }
                break;
            case 1004794248:
                if (str.equals("glGenBuffers")) {
                    c = 10;
                    break;
                }
                break;
            case 1163482609:
                if (str.equals("glGenFramebuffers")) {
                    c = 11;
                    break;
                }
                break;
            case 1319646295:
                if (str.equals("glGetError")) {
                    c = 12;
                    break;
                }
                break;
            case 1591265227:
                if (str.equals("glBindFramebuffer")) {
                    c = 13;
                    break;
                }
                break;
            case 1603238915:
                if (str.equals("glGenTextures")) {
                    c = 14;
                    break;
                }
                break;
            case 2007258317:
                if (str.equals("glDeleteRenderbuffers")) {
                    c = 15;
                    break;
                }
                break;
            case 2011599266:
                if (str.equals("glBindBuffer")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return hookGlDeleteBuffers(i);
            case 1:
                return hookGlBindRenderbuffer(i);
            case 2:
                return hookGlDeleteTextures(i);
            case 3:
                return hookGlBufferData(i);
            case 4:
                return hookGlGenRenderbuffers(i);
            case 5:
                return hookGlTexImage2D(i);
            case 6:
                return hookGlTexImage3D(i);
            case 7:
                return hookGlBindTexture(i);
            case 8:
                return hookGlDeleteFramebuffers(i);
            case 9:
                return hookGlRenderbufferStorage(i);
            case 10:
                return hookGlGenBuffers(i);
            case 11:
                return hookGlGenFramebuffers(i);
            case 12:
                return hookGlGetError(i);
            case 13:
                return hookGlBindFramebuffer(i);
            case 14:
                return hookGlGenTextures(i);
            case 15:
                return hookGlDeleteRenderbuffers(i);
            case 16:
                return hookGlBindBuffer(i);
            default:
                return false;
        }
    }

    public native boolean init();

    public void setBindListener(C80510a aVar) {
        this.mBindListener = aVar;
    }

    public void setErrorListener(C80511b bVar) {
        this.mErrorListener = bVar;
    }

    public native void setJavaStackDump(boolean z);

    public void setMemoryListener(C80512c cVar) {
        this.mMemoryListener = cVar;
    }

    public native void setNativeStackDump(boolean z);

    public void setResourceListener(C80513d dVar) {
        this.mResourceListener = dVar;
    }

    public native void updateCurrActivity(String str);
}
