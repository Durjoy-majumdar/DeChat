package rz1;

import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.lang.reflect.Method;

/* renamed from: rz1.a */
public class C36595a implements C80407h {

    /* renamed from: f */
    public static C36595a f97311f = new C36595a();

    /* renamed from: g */
    public static boolean f97312g = false;

    /* renamed from: d */
    public Handler f97313d = new Handler(Looper.getMainLooper());

    /* renamed from: e */
    public Runnable f97314e = new C36596a();

    /* renamed from: rz1.a$a */
    public class C36596a implements Runnable {
        public C36596a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r12 = this;
                java.lang.String r0 = ""
                java.lang.String r1 = "DangerousRelease"
                rz1.a r2 = rz1.C36595a.this
                r2.getClass()
                r3 = 0
                r4 = 1
                r5 = 2
                r6 = 0
                java.lang.String r7 = "android.view.WindowManagerGlobal"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x0052 }
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0052 }
                java.lang.String r9 = "getInstance"
                r8[r6] = r9     // Catch:{ Exception -> 0x0052 }
                java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0052 }
                r8[r4] = r9     // Catch:{ Exception -> 0x0052 }
                java.lang.reflect.Method r8 = r2.mo60740a(r7, r8)     // Catch:{ Exception -> 0x0052 }
                r8.setAccessible(r4)     // Catch:{ Exception -> 0x0052 }
                java.lang.Object[] r9 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x0052 }
                java.lang.Object r8 = r8.invoke(r3, r9)     // Catch:{ Exception -> 0x0052 }
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0052 }
                java.lang.String r10 = "trimMemory"
                r9[r6] = r10     // Catch:{ Exception -> 0x0052 }
                java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0052 }
                java.lang.Class r11 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0052 }
                r10[r6] = r11     // Catch:{ Exception -> 0x0052 }
                r9[r4] = r10     // Catch:{ Exception -> 0x0052 }
                java.lang.reflect.Method r2 = r2.mo60740a(r7, r9)     // Catch:{ Exception -> 0x0052 }
                r2.setAccessible(r4)     // Catch:{ Exception -> 0x0052 }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0052 }
                r9 = 80
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0052 }
                r7[r6] = r9     // Catch:{ Exception -> 0x0052 }
                r2.invoke(r8, r7)     // Catch:{ Exception -> 0x0052 }
                java.lang.String r2 = "clear succ!"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x0052 }
                goto L_0x005d
            L_0x0052:
                r2 = move-exception
                java.lang.Object[] r7 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r7)
                java.lang.String r2 = "clear fail!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r2)
            L_0x005d:
                rz1.a r2 = rz1.C36595a.this
                r2.getClass()
                java.lang.String r7 = "android.graphics.Canvas"
                java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00be }
                java.lang.String r9 = "freeCaches"
                r8[r6] = r9     // Catch:{ Exception -> 0x00be }
                java.lang.Class[] r9 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00be }
                r8[r4] = r9     // Catch:{ Exception -> 0x00be }
                java.lang.reflect.Method r8 = r2.mo60740a(r7, r8)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00be }
                java.lang.String r10 = "freeTextLayoutCaches"
                r9[r6] = r10     // Catch:{ Exception -> 0x00be }
                java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x00be }
                r9[r4] = r10     // Catch:{ Exception -> 0x00be }
                java.lang.reflect.Method r7 = r2.mo60740a(r7, r9)     // Catch:{ Exception -> 0x00be }
                java.lang.String r9 = "com.android.internal.os.BinderInternal"
                java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x00be }
                java.lang.String r10 = "forceGc"
                r5[r6] = r10     // Catch:{ Exception -> 0x00be }
                java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x00be }
                java.lang.Class<java.lang.String> r11 = java.lang.String.class
                r10[r6] = r11     // Catch:{ Exception -> 0x00be }
                r5[r4] = r10     // Catch:{ Exception -> 0x00be }
                java.lang.reflect.Method r2 = r2.mo60740a(r9, r5)     // Catch:{ Exception -> 0x00be }
                r8.setAccessible(r4)     // Catch:{ Exception -> 0x00be }
                r7.setAccessible(r4)     // Catch:{ Exception -> 0x00be }
                r2.setAccessible(r4)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00be }
                r8.invoke(r3, r5)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x00be }
                r7.invoke(r3, r5)     // Catch:{ Exception -> 0x00be }
                java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00be }
                java.lang.String r5 = "mem"
                r4[r6] = r5     // Catch:{ Exception -> 0x00be }
                r2.invoke(r3, r4)     // Catch:{ Exception -> 0x00be }
                java.lang.String r2 = "triggerHandleLowMemory succ"
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ Exception -> 0x00be }
                goto L_0x00c9
            L_0x00be:
                r2 = move-exception
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r0, r3)
                java.lang.String r0 = "triggerHandleLowMemory fail!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r0)
            L_0x00c9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rz1.C36595a.C36596a.run():void");
        }
    }

    /* renamed from: a */
    public final Method mo60740a(Class cls, Object... objArr) {
        Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{String.class, Class[].class});
        declaredMethod.setAccessible(true);
        return (Method) declaredMethod.invoke(cls, objArr);
    }

    public void off() {
        this.f97313d.removeCallbacks(this.f97314e);
        Log.m105920e("DangerousRelease", "on foreground, processName = " + MMApplicationContext.getProcessName() + ", remove clear graphics task");
    }

    /* renamed from: on */
    public void mo60742on() {
        this.f97313d.postDelayed(this.f97314e, 30000);
        Log.m105920e("DangerousRelease", "on background, processName = " + MMApplicationContext.getProcessName() + ", postDelay clear graphics task, delay = " + 30000);
    }
}
