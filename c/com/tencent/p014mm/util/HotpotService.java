package com.tencent.p014mm.util;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tencent.mm.util.HotpotService */
public abstract class HotpotService extends Service {

    /* renamed from: d */
    public static final HandlerThread[] f250439d = {null};

    /* renamed from: e */
    public static C85988c f250440e;

    /* renamed from: com.tencent.mm.util.HotpotService$a */
    public class C85986a extends Binder {

        /* renamed from: d */
        public final /* synthetic */ IBinder[] f250441d;

        public C85986a(IBinder[] iBinderArr) {
            this.f250441d = iBinderArr;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            synchronized (this.f250441d) {
                this.f250441d[0] = parcel.readStrongBinder();
                this.f250441d.notifyAll();
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.util.HotpotService$b */
    public class C85987b extends Binder {
        public C85987b() {
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            int readInt = parcel.readInt();
            Bundle bundle = (Bundle) parcel.readParcelable(HotpotService.this.getClassLoader());
            Bundle bundle2 = new Bundle();
            try {
                HotpotService.this.mo118517b(readInt, bundle, bundle2);
                parcel2.writeInt(0);
                parcel2.writeParcelable(bundle2, 0);
            } catch (Throwable th) {
                parcel2.writeInt(1);
                parcel2.writeSerializable(new C85991e(th));
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.util.HotpotService$c */
    public static final class C85988c {

        /* renamed from: d */
        public static final long f250443d;

        /* renamed from: e */
        public static final long f250444e;

        /* renamed from: a */
        public final Handler f250445a;

        /* renamed from: b */
        public long f250446b = 0;

        /* renamed from: c */
        public int f250447c = 0;

        /* renamed from: com.tencent.mm.util.HotpotService$c$a */
        public class C85989a extends Handler {
            public C85989a(Looper looper) {
                super(looper);
            }

            /* JADX WARNING: Removed duplicated region for block: B:28:0x008c  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0104  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r14) {
                /*
                    r13 = this;
                    int r14 = r14.what
                    r0 = 1
                    if (r14 != r0) goto L_0x0112
                    com.tencent.mm.util.HotpotService$c r14 = com.tencent.p014mm.util.HotpotService.C85988c.this
                    java.lang.String r1 = "MicroMsg.HotpotService"
                    android.os.Handler r2 = r14.f250445a
                    r2.removeMessages(r0)
                    r2 = 0
                    java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0081 }
                    java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0081 }
                    java.lang.String r5 = "/proc/self/stat"
                    r4.<init>(r5)     // Catch:{ all -> 0x0081 }
                    r3.<init>(r4)     // Catch:{ all -> 0x0081 }
                    java.lang.String r4 = r3.readLine()     // Catch:{ all -> 0x0077 }
                    java.lang.String r5 = "\\s+"
                    java.lang.String[] r4 = r4.split(r5)     // Catch:{ all -> 0x0077 }
                    r5 = 13
                    r5 = r4[r5]     // Catch:{ all -> 0x0077 }
                    long r5 = java.lang.Long.parseLong(r5)     // Catch:{ all -> 0x0077 }
                    r7 = 14
                    r7 = r4[r7]     // Catch:{ all -> 0x0077 }
                    long r7 = java.lang.Long.parseLong(r7)     // Catch:{ all -> 0x0077 }
                    r9 = 15
                    r9 = r4[r9]     // Catch:{ all -> 0x0077 }
                    long r9 = java.lang.Long.parseLong(r9)     // Catch:{ all -> 0x0077 }
                    r11 = 16
                    r4 = r4[r11]     // Catch:{ all -> 0x0077 }
                    long r11 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0077 }
                    long r5 = r5 + r7
                    long r5 = r5 + r9
                    long r5 = r5 + r11
                    long r7 = r14.f250446b     // Catch:{ all -> 0x0077 }
                    long r7 = r5 - r7
                    r14.f250446b = r5     // Catch:{ all -> 0x0077 }
                    r4 = 5
                    int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                    if (r6 <= 0) goto L_0x0065
                    java.lang.String r4 = "deltaJiffies is %s, skip recycling."
                    java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0077 }
                    java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0077 }
                    r5[r2] = r6     // Catch:{ all -> 0x0077 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r4, r5)     // Catch:{ all -> 0x0077 }
                    r3.close()     // Catch:{ all -> 0x0081 }
                    goto L_0x0089
                L_0x0065:
                    java.lang.String r4 = "deltaJiffies is %s."
                    java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ all -> 0x0077 }
                    java.lang.Long r6 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0077 }
                    r5[r2] = r6     // Catch:{ all -> 0x0077 }
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r4, r5)     // Catch:{ all -> 0x0077 }
                    r3.close()     // Catch:{ all -> 0x0081 }
                    r3 = 0
                    goto L_0x008a
                L_0x0077:
                    r4 = move-exception
                    r3.close()     // Catch:{ all -> 0x007c }
                    goto L_0x0080
                L_0x007c:
                    r3 = move-exception
                    r4.addSuppressed(r3)     // Catch:{ all -> 0x0081 }
                L_0x0080:
                    throw r4     // Catch:{ all -> 0x0081 }
                L_0x0081:
                    r3 = move-exception
                    java.lang.Object[] r4 = new java.lang.Object[r2]
                    java.lang.String r5 = "error when read/parse /proc/self/stat, skip recycling."
                    com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r3, r5, r4)
                L_0x0089:
                    r3 = 1
                L_0x008a:
                    if (r3 != 0) goto L_0x0104
                    int r3 = r14.f250447c
                    int r3 = r3 + r0
                    r14.f250447c = r3
                    r4 = 3
                    if (r3 < r4) goto L_0x00f6
                    java.lang.Object[] r4 = new java.lang.Object[r0]
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4[r2] = r3
                    java.lang.String r3 = "Process is in idle states when detecting %s times, do suicide now."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r3, r4)
                    int r3 = android.os.Process.myPid()
                    java.lang.Object[] r4 = new java.lang.Object[r0]
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                    r4[r2] = r5
                    java.lang.String r5 = "Killing process %s for recycling now."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r5, r4)
                    k20.a r1 = new k20.a
                    r1.<init>()
                    java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1.mo10233c(r3)
                    java.lang.Object r3 = new java.lang.Object
                    r3.<init>()
                    java.lang.Object[] r5 = r1.mo10232b()
                    java.lang.String r6 = "com/tencent/mm/util/HotpotService$IdleChecker"
                    java.lang.String r7 = "doRecycle"
                    java.lang.String r8 = "()V"
                    java.lang.String r9 = "android/os/Process_EXEC_"
                    java.lang.String r10 = "killProcess"
                    java.lang.String r11 = "(I)V"
                    r4 = r3
                    j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
                    java.lang.Object r1 = r1.mo10231a(r2)
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    android.os.Process.killProcess(r1)
                    java.lang.String r5 = "com/tencent/mm/util/HotpotService$IdleChecker"
                    java.lang.String r6 = "doRecycle"
                    java.lang.String r7 = "()V"
                    java.lang.String r8 = "android/os/Process_EXEC_"
                    java.lang.String r9 = "killProcess"
                    java.lang.String r10 = "(I)V"
                    j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
                    goto L_0x010b
                L_0x00f6:
                    java.lang.Object[] r4 = new java.lang.Object[r0]
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4[r2] = r3
                    java.lang.String r2 = "Process is in idle states when detecting %s times."
                    com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r2, r4)
                    goto L_0x010b
                L_0x0104:
                    java.lang.String r3 = "Executing routines detected, reset inThresholdCount to zero and skip recycling."
                    com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r3)
                    r14.f250447c = r2
                L_0x010b:
                    android.os.Handler r14 = r14.f250445a
                    long r1 = com.tencent.p014mm.util.HotpotService.C85988c.f250444e
                    r14.sendEmptyMessageDelayed(r0, r1)
                L_0x0112:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.util.HotpotService.C85988c.C85989a.handleMessage(android.os.Message):void");
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f250443d = timeUnit.toMillis(5);
            f250444e = timeUnit.toMillis(10);
        }

        public C85988c(Looper looper) {
            this.f250445a = new C85989a(looper);
        }

        /* renamed from: a */
        public void mo119922a() {
            this.f250445a.sendEmptyMessageDelayed(1, f250443d);
        }
    }

    /* renamed from: com.tencent.mm.util.HotpotService$d */
    public static class C85990d extends Exception {
        public C85990d(Throwable th) {
            super(th);
        }
    }

    /* renamed from: com.tencent.mm.util.HotpotService$e */
    public static class C85991e extends Exception {

        /* renamed from: d */
        public final Throwable f250449d;

        public C85991e(Throwable th) {
            super((Throwable) null);
            this.f250449d = th;
        }
    }

    /* renamed from: com.tencent.mm.util.HotpotService$f */
    public static final class C85992f implements ServiceConnection {
        public C85992f(C85986a aVar) {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public HotpotService() {
        HandlerThread[] handlerThreadArr = f250439d;
        synchronized (handlerThreadArr) {
            if (handlerThreadArr[0] == null) {
                HandlerThread handlerThread = new HandlerThread("HPS_CheckExec");
                handlerThreadArr[0] = handlerThread;
                handlerThread.start();
                f250440e = new C85988c(handlerThreadArr[0].getLooper());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: android.os.IBinder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: android.os.Parcel} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    public static android.os.Bundle m106335a(android.content.Context r17, java.lang.Class<? extends com.tencent.p014mm.util.HotpotService> r18, int r19, android.os.Bundle r20) {
        /*
            r1 = r17
            r2 = 1
            android.os.IBinder[] r3 = new android.os.IBinder[r2]
            r4 = 0
            r5 = 0
            r3[r4] = r5
            com.tencent.mm.util.HotpotService$a r0 = new com.tencent.mm.util.HotpotService$a
            r0.<init>(r3)
            android.os.Bundle r6 = new android.os.Bundle
            java.lang.ClassLoader r7 = r17.getClassLoader()
            r6.<init>(r7)
            java.lang.String r7 = "h0tpotSrv_bind_notifier"
            r6.putBinder(r7, r0)
        L_0x001c:
            android.content.Intent r0 = new android.content.Intent
            r7 = r18
            r0.<init>(r1, r7)
            r0.putExtras(r6)
            com.tencent.mm.util.HotpotService$f r8 = new com.tencent.mm.util.HotpotService$f
            r8.<init>(r5)
            boolean r0 = r1.bindService(r0, r8, r2)
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "MicroMsg.HotpotService"
            java.lang.String r1 = "bindService return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            return r5
        L_0x0039:
            android.os.Parcel r9 = android.os.Parcel.obtain()     // Catch:{ e -> 0x012a, all -> 0x0105 }
            android.os.Parcel r10 = android.os.Parcel.obtain()     // Catch:{ e -> 0x0101, all -> 0x00fa }
            monitor-enter(r3)     // Catch:{ e -> 0x00f8, all -> 0x00f1 }
            r0 = r3[r4]     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x004b
            r11 = 4500(0x1194, double:2.2233E-320)
            r3.wait(r11)     // Catch:{ all -> 0x00e6 }
        L_0x004b:
            r0 = r3[r4]     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "MicroMsg.HotpotService"
            java.lang.String r11 = "Timeout when bind to service %s, try again."
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x00e6 }
            java.lang.String r13 = r18.getName()     // Catch:{ all -> 0x00e6 }
            r12[r4] = r13     // Catch:{ all -> 0x00e6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r11, r12)     // Catch:{ all -> 0x00e6 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            r10.recycle()
            r9.recycle()
        L_0x0065:
            r1.unbindService(r8)     // Catch:{ all -> 0x0069 }
            goto L_0x001c
        L_0x0069:
            goto L_0x001c
        L_0x006b:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            r11 = r19
            r9.writeInt(r11)     // Catch:{ e -> 0x00f8, all -> 0x00e4 }
            r12 = r20
            r9.writeParcelable(r12, r4)     // Catch:{ e -> 0x00f8, all -> 0x00ed }
            r13 = r3[r4]     // Catch:{ e -> 0x00f8, all -> 0x00ed }
            r13.transact(r2, r9, r10, r4)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            int r0 = r10.readInt()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r14 = 2
            if (r0 != 0) goto L_0x00ab
            java.lang.String r0 = "MicroMsg.HotpotService"
            java.lang.String r15 = "Request with op %s in %s execute successfully."
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r19)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r14[r4] = r16     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.String r16 = r18.getName()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r14[r2] = r16     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r15, r14)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.ClassLoader r0 = r17.getClassLoader()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            android.os.Parcelable r0 = r10.readParcelable(r0)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r10.recycle()
            r9.recycle()
            r1.unbindService(r8)     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            return r0
        L_0x00ab:
            if (r0 == r2) goto L_0x00c6
            java.lang.String r0 = "MicroMsg.HotpotService"
            java.lang.String r14 = "Remote side of %s return unknown ret type."
            java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.String r16 = r18.getName()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r15[r4] = r16     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r14, r15)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r10.recycle()
            r9.recycle()
            r1.unbindService(r8)     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            return r5
        L_0x00c6:
            java.lang.String r0 = "MicroMsg.HotpotService"
            java.lang.String r15 = "Request with op %s in %s trigger exception on remote side."
            java.lang.Object[] r14 = new java.lang.Object[r14]     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r19)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r14[r4] = r16     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.lang.String r16 = r18.getName()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            r14[r2] = r16     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r15, r14)     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            java.io.Serializable r0 = r10.readSerializable()     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            com.tencent.mm.util.HotpotService$e r0 = (com.tencent.p014mm.util.HotpotService.C85991e) r0     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
            throw r0     // Catch:{ e -> 0x00f8, all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            goto L_0x010d
        L_0x00e4:
            r0 = move-exception
            goto L_0x00f4
        L_0x00e6:
            r0 = move-exception
            r11 = r19
            r12 = r20
        L_0x00eb:
            monitor-exit(r3)     // Catch:{ all -> 0x00ef }
            throw r0     // Catch:{ e -> 0x00f8, all -> 0x00ed }
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f6
        L_0x00ef:
            r0 = move-exception
            goto L_0x00eb
        L_0x00f1:
            r0 = move-exception
            r11 = r19
        L_0x00f4:
            r12 = r20
        L_0x00f6:
            r13 = r5
            goto L_0x010d
        L_0x00f8:
            r0 = move-exception
            goto L_0x0103
        L_0x00fa:
            r0 = move-exception
            r11 = r19
            r12 = r20
            r10 = r5
            goto L_0x010c
        L_0x0101:
            r0 = move-exception
            r10 = r5
        L_0x0103:
            r5 = r9
            goto L_0x012c
        L_0x0105:
            r0 = move-exception
            r11 = r19
            r12 = r20
            r9 = r5
            r10 = r9
        L_0x010c:
            r13 = r10
        L_0x010d:
            boolean r13 = r13.isBinderAlive()     // Catch:{ all -> 0x0128 }
            if (r13 != 0) goto L_0x0122
            monitor-enter(r3)     // Catch:{ all -> 0x0128 }
            r3[r4] = r5     // Catch:{ all -> 0x011f }
            monitor-exit(r3)     // Catch:{ all -> 0x011f }
            r10.recycle()
            r9.recycle()
            goto L_0x0065
        L_0x011f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x011f }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0122:
            com.tencent.mm.util.HotpotService$d r2 = new com.tencent.mm.util.HotpotService$d     // Catch:{ all -> 0x0128 }
            r2.<init>(r0)     // Catch:{ all -> 0x0128 }
            throw r2     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            goto L_0x012f
        L_0x012a:
            r0 = move-exception
            r10 = r5
        L_0x012c:
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r0 = move-exception
            r9 = r5
        L_0x012f:
            r10.recycle()
            r9.recycle()
            r1.unbindService(r8)     // Catch:{ all -> 0x0138 }
        L_0x0138:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.util.HotpotService.m106335a(android.content.Context, java.lang.Class, int, android.os.Bundle):android.os.Bundle");
    }

    /* renamed from: b */
    public abstract void mo118517b(int i, Bundle bundle, Bundle bundle2);

    public final IBinder onBind(Intent intent) {
        Parcel parcel;
        f250440e.f250445a.removeMessages(1);
        intent.setExtrasClassLoader(getClassLoader());
        IBinder binder = intent.getExtras().getBinder("h0tpotSrv_bind_notifier");
        if (binder == null) {
            return null;
        }
        try {
            parcel = Parcel.obtain();
            try {
                parcel.writeStrongBinder(new C85987b());
                binder.transact(1, parcel, (Parcel) null, 0);
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            parcel = null;
        }
        parcel.recycle();
        f250440e.mo119922a();
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
