package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C54209k0;
import p1094c4.C104290a;
import p1094c4.C104292c;

/* renamed from: androidx.lifecycle.g0 */
public final class C103762g0 extends C54209k0.C54211c {

    /* renamed from: f */
    public static final Class<?>[] f306523f;

    /* renamed from: g */
    public static final Class<?>[] f306524g;

    /* renamed from: a */
    public final Application f306525a;

    /* renamed from: b */
    public final C54209k0.C54210b f306526b;

    /* renamed from: c */
    public final Bundle f306527c;

    /* renamed from: d */
    public final C39623j f306528d;

    /* renamed from: e */
    public final C104290a f306529e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.f0> r0 = androidx.lifecycle.C103759f0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f306523f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f306524g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C103762g0.<clinit>():void");
    }

    public C103762g0(Application application, C104292c cVar, Bundle bundle) {
        C54209k0.C54210b bVar;
        this.f306529e = cVar.getSavedStateRegistry();
        this.f306528d = cVar.getLifecycle();
        this.f306527c = bundle;
        this.f306525a = application;
        if (application != null) {
            if (C54209k0.C39627a.f106387c == null) {
                C54209k0.C39627a.f106387c = new C54209k0.C39627a(application);
            }
            bVar = C54209k0.C39627a.f106387c;
        } else {
            if (C54209k0.C39628d.f106389a == null) {
                C54209k0.C39628d.f106389a = new C54209k0.C39628d();
            }
            bVar = C54209k0.C39628d.f106389a;
        }
        this.f306526b = bVar;
    }

    /* renamed from: a */
    public void mo75005a(C39622i0 i0Var) {
        C104290a aVar = this.f306529e;
        C39623j jVar = this.f306528d;
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) i0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f306505e) {
            savedStateHandleController.mo145125a(aVar, jVar);
            SavedStateHandleController.m138154b(aVar, jVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T extends androidx.lifecycle.C39622i0> T mo75004b(java.lang.String r12, java.lang.Class<T> r13) {
        /*
            r11 = this;
            java.lang.Class<androidx.lifecycle.a> r0 = androidx.lifecycle.C39621a.class
            boolean r0 = r0.isAssignableFrom(r13)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0029
            android.app.Application r3 = r11.f306525a
            if (r3 == 0) goto L_0x0029
            java.lang.Class<?>[] r3 = f306523f
            java.lang.reflect.Constructor[] r4 = r13.getConstructors()
            int r5 = r4.length
            r6 = 0
        L_0x0016:
            if (r6 >= r5) goto L_0x0043
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            boolean r8 = java.util.Arrays.equals(r3, r8)
            if (r8 == 0) goto L_0x0026
        L_0x0024:
            r1 = r7
            goto L_0x0043
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0029:
            java.lang.Class<?>[] r3 = f306524g
            java.lang.reflect.Constructor[] r4 = r13.getConstructors()
            int r5 = r4.length
            r6 = 0
        L_0x0031:
            if (r6 >= r5) goto L_0x0043
            r7 = r4[r6]
            java.lang.Class[] r8 = r7.getParameterTypes()
            boolean r8 = java.util.Arrays.equals(r3, r8)
            if (r8 == 0) goto L_0x0040
            goto L_0x0024
        L_0x0040:
            int r6 = r6 + 1
            goto L_0x0031
        L_0x0043:
            if (r1 != 0) goto L_0x004c
            androidx.lifecycle.k0$b r12 = r11.f306526b
            androidx.lifecycle.i0 r12 = r12.create(r13)
            return r12
        L_0x004c:
            c4.a r3 = r11.f306529e
            androidx.lifecycle.j r4 = r11.f306528d
            android.os.Bundle r5 = r11.f306527c
            android.os.Bundle r6 = r3.mo145969a(r12)
            java.lang.Class[] r7 = androidx.lifecycle.C103759f0.f306517e
            if (r6 != 0) goto L_0x0062
            if (r5 != 0) goto L_0x0062
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>()
            goto L_0x00c3
        L_0x0062:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            if (r5 == 0) goto L_0x0085
            java.util.Set r8 = r5.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0071:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0085
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r5.get(r9)
            r7.put(r9, r10)
            goto L_0x0071
        L_0x0085:
            if (r6 != 0) goto L_0x008d
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>(r7)
            goto L_0x00c3
        L_0x008d:
            java.lang.String r5 = "keys"
            java.util.ArrayList r5 = r6.getParcelableArrayList(r5)
            java.lang.String r8 = "values"
            java.util.ArrayList r6 = r6.getParcelableArrayList(r8)
            if (r5 == 0) goto L_0x0148
            if (r6 == 0) goto L_0x0148
            int r8 = r5.size()
            int r9 = r6.size()
            if (r8 != r9) goto L_0x0148
            r8 = 0
        L_0x00a8:
            int r9 = r5.size()
            if (r8 >= r9) goto L_0x00be
            java.lang.Object r9 = r5.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r8)
            r7.put(r9, r10)
            int r8 = r8 + 1
            goto L_0x00a8
        L_0x00be:
            androidx.lifecycle.f0 r5 = new androidx.lifecycle.f0
            r5.<init>(r7)
        L_0x00c3:
            androidx.lifecycle.SavedStateHandleController r6 = new androidx.lifecycle.SavedStateHandleController
            r6.<init>(r12, r5)
            r6.mo145125a(r3, r4)
            androidx.lifecycle.SavedStateHandleController.m138154b(r3, r4)
            r12 = 1
            if (r0 == 0) goto L_0x00e5
            android.app.Application r0 = r11.f306525a     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            if (r0 == 0) goto L_0x00e5
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            r3[r2] = r0     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            androidx.lifecycle.f0 r0 = r6.f306506f     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            r3[r12] = r0     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            java.lang.Object r12 = r1.newInstance(r3)     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            androidx.lifecycle.i0 r12 = (androidx.lifecycle.C39622i0) r12     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            goto L_0x00f1
        L_0x00e5:
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            androidx.lifecycle.f0 r0 = r6.f306506f     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            r12[r2] = r0     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            java.lang.Object r12 = r1.newInstance(r12)     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            androidx.lifecycle.i0 r12 = (androidx.lifecycle.C39622i0) r12     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
        L_0x00f1:
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            r12.setTagIfAbsent(r0, r6)     // Catch:{ IllegalAccessException -> 0x0130, InstantiationException -> 0x0113, InvocationTargetException -> 0x00f7 }
            return r12
        L_0x00f7:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "An exception happened in constructor of "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.Throwable r12 = r12.getCause()
            r0.<init>(r13, r12)
            throw r0
        L_0x0113:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "A "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = " cannot be instantiated."
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13, r12)
            throw r0
        L_0x0130:
            r12 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to access "
            r1.append(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13, r12)
            throw r0
        L_0x0148:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "Invalid bundle passed as restored state"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C103762g0.mo75004b(java.lang.String, java.lang.Class):androidx.lifecycle.i0");
    }

    public <T extends C39622i0> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo75004b(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
