package com.tencent.p014mm.ipcinvoker;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p20.C89305a;
import t20.C90365a;
import v20.C90741c;

/* renamed from: com.tencent.mm.ipcinvoker.f */
public class C80898f {

    /* renamed from: g */
    public static volatile C80898f f237725g;

    /* renamed from: a */
    public Map<String, Class<?>> f237726a = new HashMap();

    /* renamed from: b */
    public Handler f237727b;

    /* renamed from: c */
    public final Map<String, C80904e> f237728c = new ConcurrentHashMap();

    /* renamed from: d */
    public final Map<String, Set<C80936x>> f237729d;

    /* renamed from: e */
    public final Map<String, Set<C80937y>> f237730e;

    /* renamed from: f */
    public final Map<String, Set<C80924w>> f237731f;

    /* renamed from: com.tencent.mm.ipcinvoker.f$a */
    public class C80899a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f237732d;

        public C80899a(String str) {
            this.f237732d = str;
        }

        public void run() {
            C80898f.this.mo112693a(this.f237732d, false);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.f$b */
    public class C80900b implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ String f237734d;

        /* renamed from: e */
        public final /* synthetic */ C80904e f237735e;

        /* renamed from: f */
        public final /* synthetic */ Context f237736f;

        /* renamed from: com.tencent.mm.ipcinvoker.f$b$a */
        public class C80901a implements IBinder.DeathRecipient {

            /* renamed from: d */
            public final /* synthetic */ IBinder f237738d;

            public C80901a(IBinder iBinder) {
                this.f237738d = iBinder;
            }

            public void binderDied() {
                C90741c.m113809b("IPC.IPCBridgeManager", "binderDied(%d, tid:%d)", Integer.valueOf(C80900b.this.f237735e.hashCode()), Long.valueOf(Thread.currentThread().getId()));
                C80900b bVar = C80900b.this;
                String str = bVar.f237734d;
                C80898f.this.mo112694c(str);
                C90741c.m113809b("IPC.DeathRecipientImpl", "binderDied(%s)", str);
                if (!(str == null || str.length() == 0)) {
                    C90365a.m113156a(str);
                }
                C80900b bVar2 = C80900b.this;
                C80898f fVar = C80898f.this;
                String str2 = bVar2.f237734d;
                synchronized (fVar.f237731f) {
                    Set<C80924w> set = (Set) ((HashMap) fVar.f237731f).get(str2);
                    if (set != null) {
                        for (C80924w a : set) {
                            a.mo111377a();
                        }
                    }
                }
                this.f237738d.unlinkToDeath(this, 0);
            }
        }

        public C80900b(String str, C80904e eVar, Context context) {
            this.f237734d = str;
            this.f237735e = eVar;
            this.f237736f = context;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            String str;
            if (iBinder == null) {
                C90741c.m113809b("IPC.IPCBridgeManager", "[%s]->[%s] onServiceConnected(%s) (%s), but service is null", C80906n.m98775b(), this.f237734d, Integer.valueOf(this.f237735e.hashCode()), Integer.valueOf(this.f237735e.f237746b.hashCode()));
                this.f237736f.unbindService(this.f237735e.f237746b);
                ((ConcurrentHashMap) C80898f.this.f237728c).remove(this.f237734d);
                C80904e eVar = this.f237735e;
                eVar.f237746b = null;
                eVar.f237745a = null;
            } else {
                C80904e eVar2 = this.f237735e;
                int i = C89305a.C89306a.f257262d;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.tencent.mm.ipcinvoker.aidl.AIDL_IPCInvokeBridge");
                eVar2.f237745a = (queryLocalInterface == null || !(queryLocalInterface instanceof C89305a)) ? new C89305a.C89306a.C89307a(iBinder) : (C89305a) queryLocalInterface;
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(this.f237735e.hashCode());
                if (this.f237735e.f237745a == null) {
                    str = "null";
                } else {
                    str = "@" + this.f237735e.f237745a.hashCode();
                }
                objArr[1] = str;
                C90741c.m113809b("IPC.IPCBridgeManager", "onServiceConnected(%s), bridge:%s", objArr);
                try {
                    iBinder.linkToDeath(new C80901a(iBinder), 0);
                } catch (RemoteException e) {
                    C90741c.m113808a("IPC.IPCBridgeManager", "binder register linkToDeath listener error, %s", Log.getStackTraceString(e));
                }
            }
            Runnable runnable = this.f237735e.f237748d;
            if (runnable != null) {
                C80898f.this.f237727b.removeCallbacks(runnable);
            }
            synchronized (this.f237735e) {
                this.f237735e.f237747c = false;
                this.f237735e.notifyAll();
                C80904e eVar3 = this.f237735e;
                eVar3.f237748d = null;
                eVar3.f237746b = this;
            }
            C90741c.f260625a.mo997a(2, "IPC.IPCBridgeManager", "onServiceConnected: [%s]->[%s] success", C80906n.m98775b(), this.f237734d);
            synchronized (C80898f.this.f237728c) {
                ((ConcurrentHashMap) C80898f.this.f237728c).put(this.f237734d, this.f237735e);
            }
            C80898f fVar = C80898f.this;
            String str2 = this.f237734d;
            synchronized (fVar.f237730e) {
                Set<C80937y> set = (Set) ((HashMap) fVar.f237730e).get(str2);
                if (set != null) {
                    for (C80937y r0 : set) {
                        r0.mo112722r0();
                    }
                }
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C90741c.m113809b("IPC.IPCBridgeManager", "onServiceDisconnected(%s, tid : %s)", Integer.valueOf(this.f237735e.hashCode()), Long.valueOf(Thread.currentThread().getId()));
            C80898f.this.mo112694c(this.f237734d);
            C90365a.m113156a(this.f237734d);
            C80898f fVar = C80898f.this;
            String str = this.f237734d;
            synchronized (fVar.f237729d) {
                Set<C80936x> set = (Set) ((HashMap) fVar.f237729d).get(str);
                if (set != null) {
                    for (C80936x a : set) {
                        a.mo112721a();
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.f$c */
    public class C80902c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80904e f237740d;

        /* renamed from: e */
        public final /* synthetic */ String f237741e;

        public C80902c(C80904e eVar, String str) {
            this.f237740d = eVar;
            this.f237741e = str;
        }

        public void run() {
            C90741c.m113809b("IPC.IPCBridgeManager", "on connect timeout(%s, tid : %s)", Integer.valueOf(this.f237740d.hashCode()), Long.valueOf(Thread.currentThread().getId()));
            if (this.f237740d.f237747c) {
                synchronized (this.f237740d) {
                    if (this.f237740d.f237747c) {
                        this.f237740d.f237747c = false;
                        this.f237740d.notifyAll();
                        this.f237740d.f237748d = null;
                        synchronized (C80898f.this.f237728c) {
                            ((ConcurrentHashMap) C80898f.this.f237728c).remove(this.f237741e);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.f$d */
    public class C80903d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f237743d;

        public C80903d(String str) {
            this.f237743d = str;
        }

        public void run() {
            C80898f.this.mo112693a(this.f237743d, false);
        }
    }

    /* renamed from: com.tencent.mm.ipcinvoker.f$e */
    public static class C80904e {

        /* renamed from: a */
        public volatile C89305a f237745a;

        /* renamed from: b */
        public ServiceConnection f237746b;

        /* renamed from: c */
        public volatile boolean f237747c;

        /* renamed from: d */
        public Runnable f237748d;

        public String toString() {
            C89305a aVar;
            ServiceConnection serviceConnection;
            boolean z;
            Runnable runnable;
            String str;
            String str2;
            String str3;
            synchronized (this) {
                aVar = this.f237745a;
                serviceConnection = this.f237746b;
                z = this.f237747c;
                runnable = this.f237748d;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("IPCBridgeWrapper{bridge=");
            if (aVar == null) {
                str = "null";
            } else {
                str = "@" + aVar.hashCode();
            }
            sb.append(str);
            sb.append(", serviceConnection=");
            if (serviceConnection == null) {
                str2 = "null";
            } else {
                str2 = "@" + serviceConnection.hashCode();
            }
            sb.append(str2);
            sb.append(", isConnecting=");
            sb.append(z);
            sb.append(", connectTimeoutRunnable=");
            if (runnable == null) {
                str3 = "null";
            } else {
                str3 = "@" + runnable.hashCode();
            }
            sb.append(str3);
            sb.append('}');
            return sb.toString();
        }
    }

    public C80898f() {
        C80922v vVar = C80922v.f237772b;
        this.f237727b = new Handler(C80922v.f237774d.getLooper());
        this.f237729d = new HashMap();
        this.f237731f = new HashMap();
        this.f237730e = new HashMap();
    }

    /* renamed from: b */
    public static C80898f m98769b() {
        if (f237725g == null) {
            synchronized (C80898f.class) {
                if (f237725g == null) {
                    f237725g = new C80898f();
                }
            }
        }
        return f237725g;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public final p20.C89305a mo112693a(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r0 = r12.f237728c
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r13)
            com.tencent.mm.ipcinvoker.f$e r0 = (com.tencent.p014mm.ipcinvoker.C80898f.C80904e) r0
            java.lang.String r1 = "IPC.IPCBridgeManager"
            java.lang.String r2 = "[getIPCBridge] tid=[%d] %s -> %s, isRetryCall:%b, bridgeWrapper:%s"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r4 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = com.tencent.p014mm.ipcinvoker.C80906n.m98775b()
            r6 = 1
            r3[r6] = r4
            r4 = 2
            r3[r4] = r13
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r14)
            r8 = 3
            r3[r8] = r7
            r7 = 4
            r3[r7] = r0
            v20.C90741c.m113809b(r1, r2, r3)
            r1 = 0
            if (r0 != 0) goto L_0x0157
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r14 != r0) goto L_0x0056
            java.lang.String r14 = "IPC.IPCBridgeManager"
            java.lang.String r0 = "getIPCBridge failed, can not create bridge on Main thread."
            java.lang.Object[] r2 = new java.lang.Object[r5]
            v20.C90741c.m113810c(r14, r0, r2)
            com.tencent.mm.ipcinvoker.f$a r14 = new com.tencent.mm.ipcinvoker.f$a
            r14.<init>(r13)
            com.tencent.p014mm.ipcinvoker.C80922v.m98792a(r14)
            return r1
        L_0x0056:
            android.content.Context r14 = com.tencent.p014mm.ipcinvoker.C80906n.m98774a()
            java.lang.String r14 = r14.getPackageName()
            java.lang.String r14 = v20.C37646d.m41473a(r13, r14)
            java.util.Map<java.lang.String, java.lang.Class<?>> r0 = r12.f237726a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            r3 = 47
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L_0x008e
            java.lang.String r14 = "IPC.IPCBridgeManager"
            java.lang.String r0 = "getServiceClass by '%s', got null."
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r13
            v20.C90741c.m113810c(r14, r0, r2)
            return r1
        L_0x008e:
            com.tencent.mm.ipcinvoker.f$e r2 = new com.tencent.mm.ipcinvoker.f$e
            r2.<init>()
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r3 = r12.f237728c
            monitor-enter(r3)
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r9 = r12.f237728c     // Catch:{ all -> 0x0154 }
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9     // Catch:{ all -> 0x0154 }
            r9.put(r13, r2)     // Catch:{ all -> 0x0154 }
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            monitor-enter(r2)
            r2.f237747c = r6     // Catch:{ all -> 0x0151 }
            monitor-exit(r2)     // Catch:{ all -> 0x0151 }
            android.content.Context r3 = com.tencent.p014mm.ipcinvoker.C80906n.m98774a()
            com.tencent.mm.ipcinvoker.f$b r9 = new com.tencent.mm.ipcinvoker.f$b
            r9.<init>(r13, r2, r3)
            r2.f237746b = r9
            android.content.Intent r9 = new android.content.Intent     // Catch:{ Exception -> 0x0123 }
            r9.<init>()     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = r0.getCanonicalName()     // Catch:{ Exception -> 0x0123 }
            android.content.Intent r14 = r9.setClassName(r14, r0)     // Catch:{ Exception -> 0x0123 }
            java.lang.String r0 = "IPC.IPCBridgeManager"
            java.lang.String r9 = "bindService(bw : %s, tid : %s, intent : %s, conn : %s)"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0123 }
            int r10 = r2.hashCode()     // Catch:{ Exception -> 0x0123 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x0123 }
            r7[r5] = r10     // Catch:{ Exception -> 0x0123 }
            java.lang.Thread r10 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0123 }
            long r10 = r10.getId()     // Catch:{ Exception -> 0x0123 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0123 }
            r7[r6] = r10     // Catch:{ Exception -> 0x0123 }
            r7[r4] = r14     // Catch:{ Exception -> 0x0123 }
            android.content.ServiceConnection r4 = r2.f237746b     // Catch:{ Exception -> 0x0123 }
            int r4 = r4.hashCode()     // Catch:{ Exception -> 0x0123 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x0123 }
            r7[r8] = r4     // Catch:{ Exception -> 0x0123 }
            v20.C90741c.m113809b(r0, r9, r7)     // Catch:{ Exception -> 0x0123 }
            android.content.ServiceConnection r0 = r2.f237746b     // Catch:{ Exception -> 0x0123 }
            r4 = 33
            r3.bindService(r14, r0, r4)     // Catch:{ Exception -> 0x0123 }
            com.tencent.mm.ipcinvoker.f$c r14 = new com.tencent.mm.ipcinvoker.f$c     // Catch:{ Exception -> 0x0123 }
            r14.<init>(r2, r13)     // Catch:{ Exception -> 0x0123 }
            r2.f237748d = r14     // Catch:{ Exception -> 0x0123 }
            android.os.Handler r0 = r12.f237727b     // Catch:{ Exception -> 0x0123 }
            android.os.Looper r3 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x0123 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x0123 }
            if (r3 != r4) goto L_0x0106
            r3 = 3000(0xbb8, double:1.482E-320)
            goto L_0x0108
        L_0x0106:
            r3 = 10000(0x2710, double:4.9407E-320)
        L_0x0108:
            r0.postDelayed(r14, r3)     // Catch:{ Exception -> 0x0123 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0123 }
            boolean r14 = r2.f237747c     // Catch:{ all -> 0x011e }
            if (r14 == 0) goto L_0x0113
            r2.wait()     // Catch:{ all -> 0x011e }
        L_0x0113:
            monitor-exit(r2)     // Catch:{ all -> 0x011e }
            monitor-enter(r2)
            r2.f237747c = r5     // Catch:{ all -> 0x011b }
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            r0 = r2
            goto L_0x01ef
        L_0x011b:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011b }
            throw r13
        L_0x011e:
            r14 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011e }
            throw r14     // Catch:{ Exception -> 0x0123 }
        L_0x0121:
            r13 = move-exception
            goto L_0x0149
        L_0x0123:
            r14 = move-exception
            java.lang.String r0 = "IPC.IPCBridgeManager"
            java.lang.String r3 = "bindService error : %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0121 }
            java.lang.String r14 = android.util.Log.getStackTraceString(r14)     // Catch:{ all -> 0x0121 }
            r4[r5] = r14     // Catch:{ all -> 0x0121 }
            v20.C90741c.m113808a(r0, r3, r4)     // Catch:{ all -> 0x0121 }
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r14 = r12.f237728c     // Catch:{ all -> 0x0121 }
            monitor-enter(r14)     // Catch:{ all -> 0x0121 }
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r0 = r12.f237728c     // Catch:{ all -> 0x0146 }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x0146 }
            r0.remove(r13)     // Catch:{ all -> 0x0146 }
            monitor-exit(r14)     // Catch:{ all -> 0x0146 }
            monitor-enter(r2)
            r2.f237747c = r5     // Catch:{ all -> 0x0143 }
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            return r1
        L_0x0143:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            throw r13
        L_0x0146:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0146 }
            throw r13     // Catch:{ all -> 0x0121 }
        L_0x0149:
            monitor-enter(r2)
            r2.f237747c = r5     // Catch:{ all -> 0x014e }
            monitor-exit(r2)     // Catch:{ all -> 0x014e }
            throw r13
        L_0x014e:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014e }
            throw r13
        L_0x0151:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0151 }
            throw r13
        L_0x0154:
            r13 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0154 }
            throw r13
        L_0x0157:
            boolean r2 = r0.f237747c
            if (r2 == 0) goto L_0x0199
            java.lang.String r2 = "IPC.IPCBridgeManager"
            java.lang.String r3 = "getIPCBridge: bridge is connecting, may wait up to 10s"
            java.lang.Object[] r7 = new java.lang.Object[r5]
            v20.C90741c.m113809b(r2, r3, r7)
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r2 != r3) goto L_0x0180
            java.lang.String r14 = "IPC.IPCBridgeManager"
            java.lang.String r0 = "getIPCBridge is connecting, not wait in main thread"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            v20.C90741c.m113810c(r14, r0, r2)
            com.tencent.mm.ipcinvoker.f$d r14 = new com.tencent.mm.ipcinvoker.f$d
            r14.<init>(r13)
            com.tencent.p014mm.ipcinvoker.C80922v.m98792a(r14)
            return r1
        L_0x0180:
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x018d }
            boolean r1 = r0.f237747c     // Catch:{ all -> 0x018a }
            if (r1 == 0) goto L_0x0188
            r0.wait()     // Catch:{ all -> 0x018a }
        L_0x0188:
            monitor-exit(r0)     // Catch:{ all -> 0x018a }
            goto L_0x0199
        L_0x018a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x018a }
            throw r1     // Catch:{ InterruptedException -> 0x018d }
        L_0x018d:
            r1 = move-exception
            java.lang.String r2 = "IPC.IPCBridgeManager"
            java.lang.String r3 = "%s"
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r5] = r1
            v20.C90741c.m113808a(r2, r3, r7)
        L_0x0199:
            if (r14 != 0) goto L_0x01ef
            p20.a r14 = r0.f237745a
            if (r14 != 0) goto L_0x01ac
            monitor-enter(r0)
            p20.a r14 = r0.f237745a     // Catch:{ all -> 0x01a9 }
            if (r14 != 0) goto L_0x01a6
            r14 = 1
            goto L_0x01a7
        L_0x01a6:
            r14 = 0
        L_0x01a7:
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            goto L_0x01ad
        L_0x01a9:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x01a9 }
            throw r13
        L_0x01ac:
            r14 = 0
        L_0x01ad:
            if (r14 == 0) goto L_0x01ef
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r14 = r12.f237728c
            monitor-enter(r14)
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01ec }
            r2 = 24
            if (r1 < r2) goto L_0x01c0
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r1 = r12.f237728c     // Catch:{ all -> 0x01ec }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ all -> 0x01ec }
            r1.remove(r13, r0)     // Catch:{ all -> 0x01ec }
            goto L_0x01c7
        L_0x01c0:
            java.util.Map<java.lang.String, com.tencent.mm.ipcinvoker.f$e> r0 = r12.f237728c     // Catch:{ all -> 0x01ec }
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0     // Catch:{ all -> 0x01ec }
            r0.remove(r13)     // Catch:{ all -> 0x01ec }
        L_0x01c7:
            monitor-exit(r14)     // Catch:{ all -> 0x01ec }
            java.lang.String r14 = "IPC.IPCBridgeManager"
            java.lang.String r0 = "[getIPCBridge] tid=[%d] %s -> %s !!retry connecting!!"
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            long r2 = r2.getId()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1[r5] = r2
            java.lang.String r2 = com.tencent.p014mm.ipcinvoker.C80906n.m98775b()
            r1[r6] = r2
            r1[r4] = r13
            v20.C90741c.m113809b(r14, r0, r1)
            p20.a r13 = r12.mo112693a(r13, r6)
            return r13
        L_0x01ec:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x01ec }
            throw r13
        L_0x01ef:
            p20.a r13 = r0.f237745a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.ipcinvoker.C80898f.mo112693a(java.lang.String, boolean):p20.a");
    }

    /* renamed from: c */
    public void mo112694c(String str) {
        C80904e eVar;
        if (C80906n.m98776c(str)) {
            C90741c.m113809b("IPC.IPCBridgeManager", "the same process(%s), do not need to release IPCBridge.", str);
            return;
        }
        synchronized (this.f237728c) {
            eVar = (C80904e) ((ConcurrentHashMap) this.f237728c).get(str);
        }
        if (eVar == null) {
            C90741c.m113809b("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, IPCBridgeWrapper is null.", str);
            return;
        }
        try {
            if (eVar.f237747c) {
                synchronized (eVar) {
                    eVar.f237747c = false;
                    eVar.notifyAll();
                }
            }
            ServiceConnection serviceConnection = eVar.f237746b;
            if (serviceConnection == null) {
                C90741c.m113809b("IPC.IPCBridgeManager", "releaseIPCBridge(%s) failed, ServiceConnection is null.", str);
                synchronized (this.f237728c) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        ((ConcurrentHashMap) this.f237728c).remove(str, eVar);
                    } else {
                        ((ConcurrentHashMap) this.f237728c).remove(str);
                    }
                }
                synchronized (eVar) {
                    eVar.f237745a = null;
                    eVar.f237747c = false;
                    eVar.f237746b = null;
                }
                return;
            }
            try {
                C90741c.m113809b("IPC.IPCBridgeManager", "unbind bw(%s) conn(%s)", Integer.valueOf(eVar.hashCode()), Integer.valueOf(serviceConnection.hashCode()));
                C80906n.m98774a().unbindService(serviceConnection);
            } catch (Exception e) {
                C90741c.m113808a("IPC.IPCBridgeManager", "unbindService(%s) error, %s", str, Log.getStackTraceString(e));
            }
            synchronized (this.f237728c) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ((ConcurrentHashMap) this.f237728c).remove(str, eVar);
                } else {
                    ((ConcurrentHashMap) this.f237728c).remove(str);
                }
            }
            synchronized (eVar) {
                eVar.f237745a = null;
                eVar.f237747c = false;
                eVar.f237746b = null;
            }
        } catch (Throwable th) {
            synchronized (this.f237728c) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ((ConcurrentHashMap) this.f237728c).remove(str, eVar);
                } else {
                    ((ConcurrentHashMap) this.f237728c).remove(str);
                }
                synchronized (eVar) {
                    eVar.f237745a = null;
                    eVar.f237747c = false;
                    eVar.f237746b = null;
                    throw th;
                }
            }
        }
    }
}
