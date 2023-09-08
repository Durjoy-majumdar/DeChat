package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p1042u.C111055b;
import p1042u.C111059i;
import p1173b9.C113148a;
import p1192e9.C116703a;
import p1192e9.C116706d;
import p385u2.C111105a;

public class FirebaseApp {

    /* renamed from: h */
    public static final List<String> f339187h = Arrays.asList(new String[]{"com.google.firebase.auth.FirebaseAuth", "com.google.firebase.iid.FirebaseInstanceId"});

    /* renamed from: i */
    public static final List<String> f339188i = Collections.singletonList("com.google.firebase.crash.FirebaseCrash");

    /* renamed from: j */
    public static final List<String> f339189j = Arrays.asList(new String[]{"com.google.android.gms.measurement.AppMeasurement"});

    /* renamed from: k */
    public static final List<String> f339190k = Arrays.asList(new String[0]);

    /* renamed from: l */
    public static final Set<String> f339191l = Collections.emptySet();

    /* renamed from: m */
    public static final Object f339192m = new Object();

    /* renamed from: n */
    public static final Map<String, FirebaseApp> f339193n = new C111055b();

    /* renamed from: a */
    public final Context f339194a;

    /* renamed from: b */
    public final String f339195b;

    /* renamed from: c */
    public final C113148a f339196c;

    /* renamed from: d */
    public final C116706d f339197d;

    /* renamed from: e */
    public final AtomicBoolean f339198e = new AtomicBoolean(false);

    /* renamed from: f */
    public final AtomicBoolean f339199f = new AtomicBoolean();

    /* renamed from: g */
    public final List<BackgroundStateChangeListener> f339200g;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z);
    }

    /* renamed from: com.google.firebase.FirebaseApp$a */
    public static class C113377a extends BroadcastReceiver {

        /* renamed from: b */
        public static AtomicReference<C113377a> f339201b = new AtomicReference<>();

        /* renamed from: a */
        public final Context f339202a;

        public C113377a(Context context) {
            this.f339202a = context;
        }

        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.f339192m) {
                for (FirebaseApp f : ((C111055b) FirebaseApp.f339193n).values()) {
                    f.mo169381f();
                }
            }
            this.f339202a.unregisterReceiver(this);
        }
    }

    public FirebaseApp(Context context, String str, C113148a aVar) {
        List<String> list;
        new CopyOnWriteArrayList();
        this.f339200g = new CopyOnWriteArrayList();
        new CopyOnWriteArrayList();
        Context context2 = (Context) Preconditions.checkNotNull(context);
        this.f339194a = context2;
        this.f339195b = Preconditions.checkNotEmpty(str);
        this.f339196c = (C113148a) Preconditions.checkNotNull(aVar);
        Bundle bundle = null;
        try {
            PackageManager packageManager = context2.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context2, ComponentDiscoveryService.class), 128);
                if (serviceInfo != null) {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList();
            for (String next : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(next)) && next.startsWith("com.google.firebase.components:")) {
                    arrayList.add(next.substring(31));
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : list) {
            try {
                Class<?> cls = Class.forName(str2);
                if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                    String.format("Class %s is not an instance of %s", new Object[]{str2, "com.google.firebase.components.ComponentRegistrar"});
                } else {
                    arrayList2.add((ComponentRegistrar) cls.newInstance());
                }
            } catch (ClassNotFoundException unused2) {
                String.format("Class %s is not an found.", new Object[]{str2});
            } catch (IllegalAccessException unused3) {
                String.format("Could not instantiate %s.", new Object[]{str2});
            } catch (InstantiationException unused4) {
                String.format("Could not instantiate %s.", new Object[]{str2});
            }
        }
        this.f339197d = new C116706d(arrayList2, Component.m155203of(Context.class, this.f339194a), Component.m155203of(FirebaseApp.class, this), Component.m155203of(C113148a.class, this.f339196c));
    }

    /* renamed from: a */
    public static FirebaseApp m155197a() {
        FirebaseApp firebaseApp;
        synchronized (f339192m) {
            firebaseApp = (FirebaseApp) ((C111059i) f339193n).getOrDefault("[DEFAULT]", null);
            if (firebaseApp == null) {
                String myProcessName = ProcessUtils.getMyProcessName();
                StringBuilder sb = new StringBuilder(String.valueOf(myProcessName).length() + 116);
                sb.append("Default FirebaseApp is not initialized in this process ");
                sb.append(myProcessName);
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
        }
        return firebaseApp;
    }

    /* renamed from: b */
    public static FirebaseApp m155198b(Context context) {
        synchronized (f339192m) {
            if (((C111059i) f339193n).containsKey("[DEFAULT]")) {
                FirebaseApp a = m155197a();
                return a;
            }
            C113148a a2 = C113148a.m154813a(context);
            if (a2 == null) {
                return null;
            }
            FirebaseApp c = m155199c(context, a2);
            return c;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:1:0x0007 A[LOOP:0: B:1:0x0007->B:4:0x0013, LOOP_START] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.FirebaseApp m155199c(android.content.Context r5, p1173b9.C113148a r6) {
        /*
            java.util.concurrent.atomic.AtomicReference<g9.a> r0 = p1194g9.C116923a.f350359a
            g9.a r1 = new g9.a
            r1.<init>(r5)
        L_0x0007:
            r2 = 0
            boolean r2 = r0.compareAndSet(r2, r1)
            if (r2 == 0) goto L_0x000f
            goto L_0x0015
        L_0x000f:
            java.lang.Object r2 = r0.get()
            if (r2 == 0) goto L_0x0007
        L_0x0015:
            java.util.concurrent.atomic.AtomicReference<g9.a> r0 = p1194g9.C116923a.f350359a
            java.lang.Object r0 = r0.get()
            g9.a r0 = (p1194g9.C116923a) r0
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastIceCreamSandwich()
            if (r0 == 0) goto L_0x0040
            android.content.Context r0 = r5.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0040
            android.content.Context r0 = r5.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            com.google.android.gms.common.api.internal.BackgroundDetector.initialize(r0)
            com.google.android.gms.common.api.internal.BackgroundDetector r0 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            b9.b r1 = new b9.b
            r1.<init>()
            r0.addListener(r1)
        L_0x0040:
            java.lang.String r0 = "[DEFAULT]"
            android.content.Context r1 = r5.getApplicationContext()
            if (r1 != 0) goto L_0x0049
            goto L_0x004d
        L_0x0049:
            android.content.Context r5 = r5.getApplicationContext()
        L_0x004d:
            java.lang.Object r2 = f339192m
            monitor-enter(r2)
            java.util.Map<java.lang.String, com.google.firebase.FirebaseApp> r1 = f339193n     // Catch:{ all -> 0x0077 }
            r3 = r1
            u.i r3 = (p1042u.C111059i) r3     // Catch:{ all -> 0x0077 }
            boolean r3 = r3.containsKey(r0)     // Catch:{ all -> 0x0077 }
            if (r3 != 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            java.lang.String r4 = "FirebaseApp name [DEFAULT] already exists!"
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "Application context cannot be null."
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5, r3)     // Catch:{ all -> 0x0077 }
            com.google.firebase.FirebaseApp r3 = new com.google.firebase.FirebaseApp     // Catch:{ all -> 0x0077 }
            r3.<init>(r5, r0, r6)     // Catch:{ all -> 0x0077 }
            u.i r1 = (p1042u.C111059i) r1     // Catch:{ all -> 0x0077 }
            r1.put(r0, r3)     // Catch:{ all -> 0x0077 }
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            r3.mo169381f()
            return r3
        L_0x0077:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0077 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.m155199c(android.content.Context, b9.a):com.google.firebase.FirebaseApp");
    }

    /* renamed from: e */
    public static <T> void m155200e(Class<T> cls, T t, Iterable<String> iterable, boolean z) {
        for (String next : iterable) {
            if (z) {
                try {
                    if (!f339190k.contains(next)) {
                    }
                } catch (ClassNotFoundException unused) {
                    if (!f339191l.contains(next)) {
                        String.valueOf(next).concat(" is not linked. Skipping initialization.");
                    } else {
                        throw new IllegalStateException(String.valueOf(next).concat(" is missing, but is required. Check if it has been removed by Proguard."));
                    }
                } catch (NoSuchMethodException unused2) {
                    throw new IllegalStateException(String.valueOf(next).concat("#getInstance has been removed by Proguard. Add keep rule to prevent it."));
                } catch (InvocationTargetException e) {
                    Log.wtf("FirebaseApp", "Firebase API initialization failure.", e);
                } catch (IllegalAccessException e2) {
                    String valueOf = String.valueOf(next);
                    Log.wtf("FirebaseApp", valueOf.length() != 0 ? "Failed to initialize ".concat(valueOf) : new String("Failed to initialize "), e2);
                }
            }
            Method method = Class.forName(next).getMethod("getInstance", new Class[]{cls});
            int modifiers = method.getModifiers();
            if (Modifier.isPublic(modifiers) && Modifier.isStatic(modifiers)) {
                method.invoke((Object) null, new Object[]{t});
            }
        }
    }

    public static void onBackgroundStateChanged(boolean z) {
        synchronized (f339192m) {
            ArrayList arrayList = new ArrayList(((C111055b) f339193n).values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                FirebaseApp firebaseApp = (FirebaseApp) obj;
                if (firebaseApp.f339198e.get()) {
                    Iterator it = ((CopyOnWriteArrayList) firebaseApp.f339200g).iterator();
                    while (it.hasNext()) {
                        ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo169379d() {
        Preconditions.checkState(!this.f339199f.get(), "FirebaseApp was deleted");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        String str = this.f339195b;
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.mo169379d();
        return str.equals(firebaseApp.f339195b);
    }

    /* renamed from: f */
    public final void mo169381f() {
        Class<FirebaseApp> cls = FirebaseApp.class;
        Context context = this.f339194a;
        Object obj = C111105a.f332697a;
        boolean z = false;
        boolean c = Build.VERSION.SDK_INT >= 24 ? C111105a.C111111e.m151515c(context) : false;
        if (c) {
            Context context2 = this.f339194a;
            if (C113377a.f339201b.get() == null) {
                C113377a aVar = new C113377a(context2);
                AtomicReference<C113377a> atomicReference = C113377a.f339201b;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, aVar)) {
                        if (atomicReference.get() != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    context2.registerReceiver(aVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            C116706d dVar = this.f339197d;
            boolean isDefaultApp = isDefaultApp();
            for (Component next : dVar.f350020a) {
                int i = next.f339205c;
                if (!(i == 1)) {
                    if (i == 2) {
                        if (!isDefaultApp) {
                        }
                    }
                }
                C116703a.get(dVar, next.f339203a.iterator().next());
            }
        }
        m155200e(cls, this, f339187h, c);
        if (isDefaultApp()) {
            m155200e(cls, this, f339188i, c);
            m155200e(Context.class, this.f339194a, f339189j, c);
        }
    }

    public <T> T get(Class<T> cls) {
        mo169379d();
        C116706d dVar = this.f339197d;
        dVar.getClass();
        return C116703a.get(dVar, cls);
    }

    public int hashCode() {
        return this.f339195b.hashCode();
    }

    public boolean isDefaultApp() {
        mo169379d();
        return "[DEFAULT]".equals(this.f339195b);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.f339195b).add("options", this.f339196c).toString();
    }
}
