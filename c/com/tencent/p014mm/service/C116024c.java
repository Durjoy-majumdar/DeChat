package com.tencent.p014mm.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.service.C116018a;
import com.tencent.p014mm.service.C116021b;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import jh3.C87963c;

/* renamed from: com.tencent.mm.service.c */
public class C116024c {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C116021b> f348008a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static Vector<Intent> f348009b = new Vector<>();

    /* renamed from: c */
    public static Vector<Intent> f348010c = new Vector<>();

    /* renamed from: d */
    public static ConcurrentHashMap<Integer, String> f348011d = new ConcurrentHashMap<>();

    /* renamed from: e */
    public static ConcurrentHashMap<Integer, IBinder> f348012e = new ConcurrentHashMap<>();

    /* renamed from: f */
    public static ConcurrentHashMap<Integer, IBinder.DeathRecipient> f348013f = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.service.c$a */
    public class C116025a implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ String f348014d;

        /* renamed from: e */
        public final /* synthetic */ String f348015e;

        /* renamed from: f */
        public final /* synthetic */ Intent f348016f;

        /* renamed from: g */
        public final /* synthetic */ boolean f348017g;

        /* renamed from: h */
        public final /* synthetic */ Intent f348018h;

        /* renamed from: i */
        public final /* synthetic */ Context f348019i;

        public C116025a(String str, String str2, Intent intent, boolean z, Intent intent2, Context context) {
            this.f348014d = str;
            this.f348015e = str2;
            this.f348016f = intent;
            this.f348017g = z;
            this.f348018h = intent2;
            this.f348019i = context;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C87963c.m109462a(2, 1, false);
            if (iBinder == null) {
                Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected() service == null", this.f348014d, this.f348015e);
                return;
            }
            Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceConnected()", this.f348014d, this.f348015e);
            if (C116024c.f348009b.contains(this.f348016f)) {
                try {
                    C116021b a = C116021b.C116022a.m163156a(iBinder);
                    a.mo176870BE(this.f348016f);
                    C116024c.f348008a.put(this.f348015e, a);
                } catch (Exception e) {
                    if (this.f348017g) {
                        C87963c.m109462a(5, 1, false);
                        C116024c.m163164d(this.f348016f, this.f348015e, false, this.f348018h);
                    }
                    C87963c.m109462a(3, 1, false);
                    Log.m105925i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", this.f348014d, this.f348015e, e.getMessage(), Util.getStack());
                } catch (Throwable th) {
                    C116024c.f348009b.remove(this.f348016f);
                    throw th;
                }
                C116024c.f348009b.remove(this.f348016f);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116024c.f348008a.remove(this.f348015e);
            this.f348019i.unbindService(this);
            Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f348014d, this.f348015e);
            C87963c.m109462a(4, 1, false);
        }
    }

    /* renamed from: com.tencent.mm.service.c$b */
    public class C116026b implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ String f348020d;

        /* renamed from: e */
        public final /* synthetic */ String f348021e;

        /* renamed from: f */
        public final /* synthetic */ Intent f348022f;

        /* renamed from: g */
        public final /* synthetic */ boolean f348023g;

        /* renamed from: h */
        public final /* synthetic */ Intent f348024h;

        /* renamed from: i */
        public final /* synthetic */ Context f348025i;

        public C116026b(String str, String str2, Intent intent, boolean z, Intent intent2, Context context) {
            this.f348020d = str;
            this.f348021e = str2;
            this.f348022f = intent;
            this.f348023g = z;
            this.f348024h = intent2;
            this.f348025i = context;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C87963c.m109462a(18, 1, false);
            if (iBinder == null) {
                Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected() service == null", this.f348020d, this.f348021e);
                return;
            }
            Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceConnected()", this.f348020d, this.f348021e);
            try {
                C116021b a = C116021b.C116022a.m163156a(iBinder);
                a.mo176873Vr(this.f348022f);
                C116024c.f348008a.put(this.f348021e, a);
            } catch (Exception e) {
                if (this.f348023g) {
                    C116024c.m163165e(this.f348022f, this.f348021e, false, this.f348024h);
                    C87963c.m109462a(21, 1, false);
                }
                Log.m105925i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", this.f348020d, this.f348021e, e.getMessage(), Util.getStack());
                C87963c.m109462a(19, 1, false);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116024c.f348008a.remove(this.f348021e);
            this.f348025i.unbindService(this);
            Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f348020d, this.f348021e);
            C87963c.m109462a(20, 1, false);
        }
    }

    /* renamed from: com.tencent.mm.service.c$c */
    public class C116027c implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ Intent f348026d;

        /* renamed from: e */
        public final /* synthetic */ String f348027e;

        /* renamed from: f */
        public final /* synthetic */ String f348028f;

        /* renamed from: g */
        public final /* synthetic */ Intent f348029g;

        /* renamed from: h */
        public final /* synthetic */ ServiceConnection f348030h;

        /* renamed from: i */
        public final /* synthetic */ boolean f348031i;

        /* renamed from: j */
        public final /* synthetic */ int f348032j;

        /* renamed from: n */
        public final /* synthetic */ Context f348033n;

        /* renamed from: com.tencent.mm.service.c$c$a */
        public class C116028a extends C116018a.C116019a {

            /* renamed from: com.tencent.mm.service.c$c$a$a */
            public class C116029a implements IBinder.DeathRecipient {
                public C116029a() {
                }

                public void binderDied() {
                    C116027c.this.f348030h.onServiceDisconnected(new ComponentName(MMApplicationContext.getContext(), C116027c.this.f348027e));
                    C116027c cVar = C116027c.this;
                    Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", C116027c.this.f348026d.getComponent().getClassName(), cVar.f348027e, cVar.f348028f);
                }
            }

            public C116028a() {
            }

            /* renamed from: Gy */
            public void mo176874Gy(IBinder iBinder) {
                if (iBinder == null) {
                    C116027c cVar = C116027c.this;
                    Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected() service == null", C116027c.this.f348026d.getComponent().getClassName(), cVar.f348027e, cVar.f348028f);
                    return;
                }
                C116027c.this.f348030h.onServiceConnected(new ComponentName(MMApplicationContext.getContext(), C116027c.this.f348027e), iBinder);
                C116024c.f348012e.put(Integer.valueOf(C116027c.this.f348030h.hashCode()), iBinder);
                C116029a aVar = new C116029a();
                C116024c.f348013f.put(Integer.valueOf(C116027c.this.f348030h.hashCode()), aVar);
                iBinder.linkToDeath(aVar, 0);
                C116027c cVar2 = C116027c.this;
                Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", C116027c.this.f348026d.getComponent().getClassName(), cVar2.f348027e, cVar2.f348028f);
            }
        }

        public C116027c(Intent intent, String str, String str2, Intent intent2, ServiceConnection serviceConnection, boolean z, int i, Context context) {
            this.f348026d = intent;
            this.f348027e = str;
            this.f348028f = str2;
            this.f348029g = intent2;
            this.f348030h = serviceConnection;
            this.f348031i = z;
            this.f348032j = i;
            this.f348033n = context;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected()", this.f348026d.getComponent().getClassName(), this.f348027e, this.f348028f);
            C87963c.m109462a(33, 1, false);
            if (C116024c.f348010c.contains(this.f348029g)) {
                if (iBinder == null) {
                    Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() service == null", this.f348026d.getComponent().getClassName(), this.f348027e, this.f348028f);
                    return;
                }
                try {
                    C116021b a = C116021b.C116022a.m163156a(iBinder);
                    a.mo176872ND(this.f348029g, new C116028a());
                    C116024c.f348008a.put(this.f348028f, a);
                } catch (Exception e) {
                    if (this.f348031i) {
                        C116024c.m163161a(this.f348029g, this.f348030h, this.f348032j, this.f348028f, false, this.f348026d);
                        C87963c.m109462a(36, 1, false);
                    }
                    Log.m105925i("MicroMsg.MMServiceHelper", "bindService()  ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", this.f348026d.getComponent().getClassName(), this.f348027e, this.f348028f, e.getMessage(), Util.getStack());
                    C87963c.m109462a(34, 1, false);
                } catch (Throwable th) {
                    C116024c.f348010c.remove(this.f348029g);
                    throw th;
                }
                C116024c.f348010c.remove(this.f348029g);
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116024c.f348008a.remove(this.f348028f);
            this.f348033n.unbindService(this);
            Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s onServiceDisconnected()", this.f348026d.getComponent().getClassName(), this.f348027e, this.f348028f);
            C87963c.m109462a(35, 1, false);
        }
    }

    /* renamed from: com.tencent.mm.service.c$d */
    public class C116030d extends C116018a.C116019a {

        /* renamed from: e */
        public final /* synthetic */ Intent f348036e;

        /* renamed from: f */
        public final /* synthetic */ String f348037f;

        /* renamed from: g */
        public final /* synthetic */ String f348038g;

        /* renamed from: h */
        public final /* synthetic */ ServiceConnection f348039h;

        /* renamed from: com.tencent.mm.service.c$d$a */
        public class C116031a implements IBinder.DeathRecipient {
            public C116031a() {
            }

            public void binderDied() {
                C116030d.this.f348039h.onServiceDisconnected(new ComponentName(MMApplicationContext.getContext(), C116030d.this.f348037f));
                C116030d dVar = C116030d.this;
                Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", C116030d.this.f348036e.getComponent().getClassName(), dVar.f348037f, dVar.f348038g);
            }
        }

        public C116030d(Intent intent, String str, String str2, ServiceConnection serviceConnection) {
            this.f348036e = intent;
            this.f348037f = str;
            this.f348038g = str2;
            this.f348039h = serviceConnection;
        }

        /* renamed from: Gy */
        public void mo176874Gy(IBinder iBinder) {
            Log.m105925i("MicroMsg.MMServiceHelper", "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s IMMServiceStub_AIDL.bindService: onServiceConnected()", this.f348036e.getComponent().getClassName(), this.f348037f, this.f348038g);
            if (iBinder != null) {
                this.f348039h.onServiceConnected(new ComponentName(MMApplicationContext.getContext(), this.f348037f), iBinder);
                C116024c.f348012e.put(Integer.valueOf(this.f348039h.hashCode()), iBinder);
                iBinder.linkToDeath(new C116031a(), 0);
            }
        }
    }

    /* renamed from: com.tencent.mm.service.c$e */
    public class C116032e implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ String f348041d;

        /* renamed from: e */
        public final /* synthetic */ String f348042e;

        /* renamed from: f */
        public final /* synthetic */ Intent f348043f;

        /* renamed from: g */
        public final /* synthetic */ boolean f348044g;

        /* renamed from: h */
        public final /* synthetic */ ServiceConnection f348045h;

        /* renamed from: i */
        public final /* synthetic */ Intent f348046i;

        /* renamed from: j */
        public final /* synthetic */ Context f348047j;

        public C116032e(String str, String str2, Intent intent, boolean z, ServiceConnection serviceConnection, Intent intent2, Context context) {
            this.f348041d = str;
            this.f348042e = str2;
            this.f348043f = intent;
            this.f348044g = z;
            this.f348045h = serviceConnection;
            this.f348046i = intent2;
            this.f348047j = context;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C87963c.m109462a(48, 1, false);
            if (iBinder == null) {
                Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() service == null", this.f348041d, this.f348042e);
                return;
            }
            Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected()", this.f348041d, this.f348042e);
            try {
                C116021b a = C116021b.C116022a.m163156a(iBinder);
                a.mo176871Ku(this.f348043f);
                C116024c.f348008a.put(this.f348042e, a);
            } catch (Exception e) {
                if (this.f348044g) {
                    C116024c.m163166f(this.f348045h, this.f348042e, false, this.f348046i);
                    C87963c.m109462a(51, 1, false);
                }
                C87963c.m109462a(49, 1, false);
                Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceConnected() exception = %s stack[%s]", this.f348041d, this.f348042e, e.getMessage(), Util.getStack());
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s onServiceDisconnected()", this.f348041d, this.f348042e);
            C116024c.f348008a.remove(this.f348042e);
            this.f348047j.unbindService(this);
            C87963c.m109462a(50, 1, false);
        }
    }

    /* renamed from: com.tencent.mm.service.c$f */
    public class C116033f implements ServiceConnection {

        /* renamed from: d */
        public final /* synthetic */ String f348048d;

        /* renamed from: e */
        public final /* synthetic */ Context f348049e;

        /* renamed from: f */
        public final /* synthetic */ boolean f348050f;

        /* renamed from: g */
        public final /* synthetic */ Intent f348051g;

        public C116033f(String str, Context context, boolean z, Intent intent) {
            this.f348048d = str;
            this.f348049e = context;
            this.f348050f = z;
            this.f348051g = intent;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) {
                Log.m105925i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected() service == null", this.f348048d);
                return;
            }
            C116024c.f348008a.put(this.f348048d, C116021b.C116022a.m163156a(iBinder));
            Log.m105925i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceConnected()", this.f348048d);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C116024c.f348008a.remove(this.f348048d);
            this.f348049e.unbindService(this);
            if (this.f348050f) {
                C116024c.m163163c(this.f348048d, false, this.f348051g);
            }
            Log.m105925i("MicroMsg.MMServiceHelper", "startProcessService() ProcessName = %s onServiceDisconnected()", this.f348048d);
            C87963c.m109462a(4, 1, false);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x010b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m163161a(android.content.Intent r17, android.content.ServiceConnection r18, int r19, java.lang.String r20, boolean r21, android.content.Intent r22) {
        /*
            r5 = r17
            r10 = r20
            r11 = r22
            java.lang.String r12 = "MicroMsg.MMServiceHelper"
            r13 = 0
            if (r5 != 0) goto L_0x0011
            java.lang.String r0 = "bindService Intent == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            return r13
        L_0x0011:
            android.content.ComponentName r0 = r17.getComponent()
            java.lang.String r14 = r0.getClassName()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r14)
            r15 = 1
            if (r0 == 0) goto L_0x002a
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r13] = r10
            java.lang.String r1 = "bindService() processName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            return r13
        L_0x002a:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.b> r0 = f348008a
            java.lang.Object r0 = r0.get(r10)
            com.tencent.mm.service.b r0 = (com.tencent.p014mm.service.C116021b) r0
            java.lang.String r1 = "class_name"
            r5.putExtra(r1, r14)
            int r1 = r18.hashCode()
            java.lang.String r2 = "service_connection"
            r5.putExtra(r2, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r1 = f348011d
            int r2 = r18.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r2, r14)
            r16 = 3
            r9 = 4
            r7 = 1
            r6 = 2
            if (r0 != 0) goto L_0x00c6
            r0 = 32
            jh3.C87963c.m109462a(r0, r7, r13)
            java.util.Vector<android.content.Intent> r0 = f348010c
            r0.add(r5)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            m163162b(r0, r10, r11)
            com.tencent.mm.service.c$c r4 = new com.tencent.mm.service.c$c     // Catch:{ Exception -> 0x00a3 }
            r1 = r4
            r2 = r22
            r3 = r14
            r13 = r4
            r4 = r20
            r5 = r17
            r6 = r18
            r7 = r21
            r8 = r19
            r9 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00a3 }
            boolean r0 = r0.bindService(r11, r13, r15)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r1 = "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s bindService_result = %b"
            r7 = 4
            java.lang.Object[] r2 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x00a1 }
            android.content.ComponentName r3 = r22.getComponent()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r3 = r3.getClassName()     // Catch:{ Exception -> 0x00a1 }
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x00a1 }
            r2[r15] = r14     // Catch:{ Exception -> 0x00a1 }
            r8 = 2
            r2[r8] = r10     // Catch:{ Exception -> 0x009f }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x009f }
            r2[r16] = r0     // Catch:{ Exception -> 0x009f }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r2)     // Catch:{ Exception -> 0x009f }
            r3 = 0
            goto L_0x00c2
        L_0x009f:
            r0 = move-exception
            goto L_0x00a6
        L_0x00a1:
            r0 = move-exception
            goto L_0x00a5
        L_0x00a3:
            r0 = move-exception
            r7 = 4
        L_0x00a5:
            r8 = 2
        L_0x00a6:
            java.lang.Object[] r1 = new java.lang.Object[r7]
            android.content.ComponentName r2 = r22.getComponent()
            java.lang.String r2 = r2.getClassName()
            r3 = 0
            r1[r3] = r2
            r1[r15] = r14
            r1[r8] = r10
            java.lang.String r0 = r0.getMessage()
            r1[r16] = r0
            java.lang.String r0 = "bindService() ProcessServiceClassName = %s ClassName = %s ProcessName = %s Context.bindService() Exception = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)
        L_0x00c2:
            r2 = 2
            r7 = 1
            goto L_0x0125
        L_0x00c6:
            r3 = 0
            r7 = 4
            r8 = 2
            r1 = 37
            r7 = 1
            jh3.C87963c.m109462a(r1, r7, r3)
            java.lang.String r1 = "IMMServiceStub_AIDL != null, bindService() ClassName = %s ProcessName = %s "
            r2 = 2
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00eb }
            r4[r3] = r14     // Catch:{ Exception -> 0x00eb }
            r4[r15] = r10     // Catch:{ Exception -> 0x00eb }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r4)     // Catch:{ Exception -> 0x00eb }
            com.tencent.mm.service.c$d r1 = new com.tencent.mm.service.c$d     // Catch:{ Exception -> 0x00eb }
            r2 = r18
            r1.<init>(r11, r14, r10, r2)     // Catch:{ Exception -> 0x00e9 }
            r0.mo176872ND(r5, r1)     // Catch:{ Exception -> 0x00e9 }
            r2 = 2
            r3 = 0
            goto L_0x0125
        L_0x00e9:
            r0 = move-exception
            goto L_0x00ee
        L_0x00eb:
            r0 = move-exception
            r2 = r18
        L_0x00ee:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.service.b> r1 = f348008a
            r1.remove(r10)
            if (r21 == 0) goto L_0x010b
            r6 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r6
            r6 = r22
            m163161a(r1, r2, r3, r4, r5, r6)
            r1 = 36
            r3 = 0
            jh3.C87963c.m109462a(r1, r7, r3)
            goto L_0x010c
        L_0x010b:
            r3 = 0
        L_0x010c:
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r14
            r1[r15] = r10
            java.lang.String r0 = r0.getMessage()
            r2 = 2
            r1[r2] = r0
            com.tencent.mm.sdk.platformtools.MMStack r0 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1[r16] = r0
            java.lang.String r0 = "bindService ClassName = %s ProcessName = %s exception = %s stack[%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r1)
        L_0x0125:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r3] = r14
            r0[r15] = r10
            java.lang.String r1 = "bindService() ClassName = %s ProcessName = %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            r0 = 31
            jh3.C87963c.m109462a(r0, r7, r3)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.service.C116024c.m163161a(android.content.Intent, android.content.ServiceConnection, int, java.lang.String, boolean, android.content.Intent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0038, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isEqual(r6, 0) != false) goto L_0x000c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e A[SYNTHETIC, Splitter:B:9:0x003e] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m163162b(android.content.Context r5, java.lang.String r6, android.content.Intent r7) {
        /*
            java.lang.String r0 = "mm"
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r6, (java.lang.String) r0)
            java.lang.String r0 = "MicroMsg.MMServiceHelper"
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x000e
        L_0x000c:
            r6 = 0
            goto L_0x003c
        L_0x000e:
            r6 = 26
            boolean r6 = p206nj.C11171e.m11046c(r6)
            if (r6 == 0) goto L_0x003b
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r3 = 4
            java.lang.String r4 = "service_launch_way"
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r4, r3)
            java.lang.String r3 = "huawei_switch"
            int r6 = r6.getInt(r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3[r2] = r4
            java.lang.String r4 = "ifTarget26StartServiceHuawei() huaweiEnable : %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r4, r3)
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((int) r6, (int) r2)
            if (r6 == 0) goto L_0x003b
            goto L_0x000c
        L_0x003b:
            r6 = 1
        L_0x003c:
            if (r6 == 0) goto L_0x005b
            r5.startService(r7)     // Catch:{ Exception -> 0x0042 }
            goto L_0x005b
        L_0x0042:
            r5 = move-exception
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Class r7 = r5.getClass()
            java.lang.String r7 = r7.toString()
            r6[r2] = r7
            java.lang.String r5 = r5.getMessage()
            r6[r1] = r5
            java.lang.String r5 = "startProcessService() Exception:%s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r5, r6)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.service.C116024c.m163162b(android.content.Context, java.lang.String, android.content.Intent):void");
    }

    /* renamed from: c */
    public static void m163163c(String str, boolean z, Intent intent) {
        Context context = MMApplicationContext.getContext();
        m163162b(context, str, intent);
        context.bindService(intent, new C116033f(str, context, z, intent), 1);
        Log.m105925i("MicroMsg.MMServiceHelper", "startProcessService() processName = %s", str);
    }

    /* renamed from: d */
    public static void m163164d(Intent intent, String str, boolean z, Intent intent2) {
        int i;
        long j;
        Intent intent3 = intent;
        String str2 = str;
        Intent intent4 = intent2;
        if (intent3 == null) {
            Log.m105924i("MicroMsg.MMServiceHelper", "startService Intent == null");
            return;
        }
        String className = intent.getComponent().getClassName();
        if (Util.isNullOrNil(className)) {
            Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = null processName = %s", str2);
            return;
        }
        intent3.putExtra("class_name", className);
        C116021b bVar = f348008a.get(str2);
        if (bVar == null) {
            f348009b.add(intent3);
            Context context = MMApplicationContext.getContext();
            m163162b(context, str2, intent4);
            try {
                C116025a aVar = r1;
                C116025a aVar2 = new C116025a(className, str, intent, z, intent2, context);
                Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s bindService_result = %b", className, str2, Boolean.valueOf(context.bindService(intent4, aVar, 1)));
            } catch (Exception e) {
                Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", className, str2, e.getMessage());
            }
            j = 1;
            C87963c.m109462a(1, 1, false);
            i = 2;
        } else {
            j = 1;
            try {
                bVar.mo176870BE(intent3);
                i = 2;
            } catch (Exception e2) {
                Exception exc = e2;
                f348008a.remove(str2);
                if (z) {
                    m163164d(intent3, str2, false, intent4);
                    C87963c.m109462a(5, 1, false);
                }
                i = 2;
                Log.m105925i("MicroMsg.MMServiceHelper", "startService ClassName = %s ProcessName = %s  exception = %s stack[%s]", className, str2, exc.getMessage(), Util.getStack());
            }
            Object[] objArr = new Object[i];
            objArr[0] = className;
            objArr[1] = str2;
            Log.m105925i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, startService() ClassName = %s ProcessName = %s ", objArr);
            C87963c.m109462a(6, 1, false);
        }
        Object[] objArr2 = new Object[i];
        objArr2[0] = className;
        objArr2[1] = str2;
        Log.m105925i("MicroMsg.MMServiceHelper", "startService() ClassName = %s ProcessName = %s", objArr2);
        C87963c.m109462a(0, j, false);
    }

    /* renamed from: e */
    public static void m163165e(Intent intent, String str, boolean z, Intent intent2) {
        long j;
        int i;
        Intent intent3 = intent;
        String str2 = str;
        Intent intent4 = intent2;
        if (intent3 == null) {
            Log.m105924i("MicroMsg.MMServiceHelper", "stopService Intent == null");
            return;
        }
        String className = intent.getComponent().getClassName();
        if (Util.isNullOrNil(className)) {
            Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = null processName = %s", str2);
            return;
        }
        C116021b bVar = f348008a.get(str2);
        intent3.putExtra("class_name", className);
        if (bVar == null) {
            C87963c.m109462a(17, 1, false);
            Context context = MMApplicationContext.getContext();
            m163162b(context, str2, intent4);
            try {
                C116026b bVar2 = r1;
                C116026b bVar3 = new C116026b(className, str, intent, z, intent2, context);
                Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s bindService_result = %b", className, str2, Boolean.valueOf(context.bindService(intent4, bVar2, 1)));
            } catch (Exception e) {
                Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", className, str2, e.getMessage());
            }
            i = 2;
            j = 1;
        } else {
            try {
                bVar.mo176873Vr(intent3);
                i = 2;
                j = 1;
            } catch (Exception e2) {
                Exception exc = e2;
                f348008a.remove(str2);
                if (z) {
                    m163165e(intent3, str2, false, intent4);
                    j = 1;
                    C87963c.m109462a(21, 1, false);
                } else {
                    j = 1;
                }
                i = 2;
                Log.m105925i("MicroMsg.MMServiceHelper", "stopService ClassName = %s ProcessName = %s exception = %s", className, str2, exc.getMessage());
            }
            C87963c.m109462a(22, j, false);
            Object[] objArr = new Object[3];
            objArr[0] = className;
            objArr[1] = str2;
            objArr[i] = Util.getStack();
            Log.m105925i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, stopService() ClassName = %s ProcessName = %s stack[%s]", objArr);
        }
        Object[] objArr2 = new Object[i];
        objArr2[0] = className;
        objArr2[1] = str2;
        Log.m105925i("MicroMsg.MMServiceHelper", "stopService() ClassName = %s ProcessName = %s", objArr2);
        C87963c.m109462a(16, j, false);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* renamed from: f */
    public static void m163166f(ServiceConnection serviceConnection, String str, boolean z, Intent intent) {
        long j;
        int i;
        ? r2;
        ? r25;
        ServiceConnection serviceConnection2 = serviceConnection;
        String str2 = str;
        Intent intent2 = intent;
        if (serviceConnection2 == null) {
            Log.m105924i("MicroMsg.MMServiceHelper", "unbindService ServiceConnection == null");
            return;
        }
        String remove = f348011d.remove(Integer.valueOf(serviceConnection.hashCode()));
        IBinder remove2 = f348012e.remove(Integer.valueOf(serviceConnection.hashCode()));
        IBinder.DeathRecipient remove3 = f348013f.remove(Integer.valueOf(serviceConnection.hashCode()));
        if (remove2 != null) {
            remove2.unlinkToDeath(remove3, 0);
        }
        if (Util.isNullOrNil(remove)) {
            Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() processName = %s", str2);
            return;
        }
        Intent intent3 = new Intent();
        intent3.putExtra("class_name", remove);
        intent3.putExtra("service_connection", serviceConnection.hashCode());
        C116021b bVar = f348008a.get(str2);
        if (bVar == null) {
            C87963c.m109462a(47, 1, false);
            Context context = MMApplicationContext.getContext();
            m163162b(context, str2, intent2);
            try {
                C116032e eVar = r1;
                C116032e eVar2 = new C116032e(remove, str, intent3, z, serviceConnection, intent, context);
                boolean bindService = context.bindService(intent2, eVar, 1);
                Object[] objArr = new Object[3];
                objArr[0] = remove;
                objArr[1] = str2;
                i = 2;
                try {
                    objArr[2] = Boolean.valueOf(bindService);
                    Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s bindService_result = %b", objArr);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i = 2;
                Object[] objArr2 = new Object[3];
                objArr2[0] = remove;
                objArr2[1] = str2;
                objArr2[i] = e.getMessage();
                Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s  Context.bindService() Exception = %s", objArr2);
                r2 = 0;
                j = 1;
                Object[] objArr3 = new Object[i];
                objArr3[r2] = remove;
                objArr3[1] = str2;
                Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s processName = %s", objArr3);
                C87963c.m109462a(46, j, r2);
            }
            r2 = 0;
            j = 1;
        } else {
            i = 2;
            try {
                bVar.mo176871Ku(intent3);
                r25 = 0;
                j = 1;
            } catch (Exception e3) {
                Exception exc = e3;
                f348008a.remove(str2);
                r25 = 0;
                if (z) {
                    m163166f(serviceConnection2, str2, false, intent2);
                    j = 1;
                    C87963c.m109462a(51, 1, false);
                } else {
                    j = 1;
                }
                Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s ProcessName = %s exception = %s stack[%s]", remove, str2, exc.getMessage(), Util.getStack());
            }
            C87963c.m109462a(52, j, r25);
            Object[] objArr4 = new Object[2];
            objArr4[r25] = remove;
            objArr4[1] = str2;
            Log.m105925i("MicroMsg.MMServiceHelper", "IMMServiceStub_AIDL != null, unbindService() ClassName = %s ProcessName = %s ", objArr4);
            r2 = r25;
        }
        Object[] objArr32 = new Object[i];
        objArr32[r2] = remove;
        objArr32[1] = str2;
        Log.m105925i("MicroMsg.MMServiceHelper", "unbindService() ClassName = %s processName = %s", objArr32);
        C87963c.m109462a(46, j, r2);
    }
}
