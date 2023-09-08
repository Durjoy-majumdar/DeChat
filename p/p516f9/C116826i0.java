package p516f9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: f9.i0 */
public final class C116826i0 implements ServiceConnection {

    /* renamed from: d */
    public int f350181d = 0;

    /* renamed from: e */
    public final Messenger f350182e = new Messenger(new Handler(Looper.getMainLooper(), new C116828j0(this)));

    /* renamed from: f */
    public C116836n0 f350183f;

    /* renamed from: g */
    public final Queue<C116811b<?>> f350184g = new ArrayDeque();

    /* renamed from: h */
    public final SparseArray<C116811b<?>> f350185h = new SparseArray<>();

    /* renamed from: i */
    public final /* synthetic */ C116822g0 f350186i;

    public C116826i0(C116822g0 g0Var, C116824h0 h0Var) {
        this.f350186i = g0Var;
    }

    /* renamed from: a */
    public final synchronized void mo180818a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i2 = this.f350181d;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f350181d = 4;
            ConnectionTracker.getInstance().unbindService(this.f350186i.f350175a, this);
            C116813c cVar = new C116813c(i, str);
            Iterator it = ((ArrayDeque) this.f350184g).iterator();
            while (it.hasNext()) {
                ((C116811b) it.next()).mo180804b(cVar);
            }
            ((ArrayDeque) this.f350184g).clear();
            for (int i3 = 0; i3 < this.f350185h.size(); i3++) {
                this.f350185h.valueAt(i3).mo180804b(cVar);
            }
            this.f350185h.clear();
        } else if (i2 == 3) {
            this.f350181d = 4;
        } else if (i2 != 4) {
            int i4 = this.f350181d;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo180819b(p516f9.C116811b r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f350181d     // Catch:{ all -> 0x0098 }
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x004e
            if (r0 == r2) goto L_0x0045
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0098 }
            int r0 = r5.f350181d     // Catch:{ all -> 0x0098 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r2.<init>(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0098 }
            r2.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0098 }
            r6.<init>(r0)     // Catch:{ all -> 0x0098 }
            throw r6     // Catch:{ all -> 0x0098 }
        L_0x002e:
            monitor-exit(r5)
            return r3
        L_0x0030:
            java.util.Queue<f9.b<?>> r0 = r5.f350184g     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0098 }
            r0.add(r6)     // Catch:{ all -> 0x0098 }
            f9.g0 r6 = r5.f350186i     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f350176b     // Catch:{ all -> 0x0098 }
            f9.l0 r0 = new f9.l0     // Catch:{ all -> 0x0098 }
            r0.<init>(r5)     // Catch:{ all -> 0x0098 }
            r6.execute(r0)     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)
            return r2
        L_0x0045:
            java.util.Queue<f9.b<?>> r0 = r5.f350184g     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0098 }
            r0.add(r6)     // Catch:{ all -> 0x0098 }
            monitor-exit(r5)
            return r2
        L_0x004e:
            java.util.Queue<f9.b<?>> r0 = r5.f350184g     // Catch:{ all -> 0x0098 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0098 }
            r0.add(r6)     // Catch:{ all -> 0x0098 }
            int r6 = r5.f350181d     // Catch:{ all -> 0x0098 }
            if (r6 != 0) goto L_0x005b
            r6 = 1
            goto L_0x005c
        L_0x005b:
            r6 = 0
        L_0x005c:
            com.google.android.gms.common.internal.Preconditions.checkState(r6)     // Catch:{ all -> 0x0098 }
            java.lang.String r6 = "MessengerIpcClient"
            android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0098 }
            r5.f350181d = r2     // Catch:{ all -> 0x0098 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0098 }
            com.google.android.gms.common.stats.ConnectionTracker r0 = com.google.android.gms.common.stats.ConnectionTracker.getInstance()     // Catch:{ all -> 0x0098 }
            f9.g0 r1 = r5.f350186i     // Catch:{ all -> 0x0098 }
            android.content.Context r1 = r1.f350175a     // Catch:{ all -> 0x0098 }
            boolean r6 = r0.bindService(r1, r6, r5, r2)     // Catch:{ all -> 0x0098 }
            if (r6 != 0) goto L_0x0086
            java.lang.String r6 = "Unable to bind to service"
            r5.mo180818a(r3, r6)     // Catch:{ all -> 0x0098 }
            goto L_0x0096
        L_0x0086:
            f9.g0 r6 = r5.f350186i     // Catch:{ all -> 0x0098 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f350176b     // Catch:{ all -> 0x0098 }
            f9.k0 r0 = new f9.k0     // Catch:{ all -> 0x0098 }
            r0.<init>(r5)     // Catch:{ all -> 0x0098 }
            r3 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0098 }
            r6.schedule(r0, r3, r1)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r5)
            return r2
        L_0x0098:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p516f9.C116826i0.mo180819b(f9.b):boolean");
    }

    /* renamed from: c */
    public final synchronized void mo180820c() {
        if (this.f350181d == 2 && ((ArrayDeque) this.f350184g).isEmpty() && this.f350185h.size() == 0) {
            boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
            this.f350181d = 3;
            ConnectionTracker.getInstance().unbindService(this.f350186i.f350175a, this);
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            mo180818a(0, "Null service connection");
            return;
        }
        try {
            this.f350183f = new C116836n0(iBinder);
            this.f350181d = 2;
            this.f350186i.f350176b.execute(new C116832l0(this));
        } catch (RemoteException e) {
            mo180818a(0, e.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        boolean isLoggable = Log.isLoggable("MessengerIpcClient", 2);
        mo180818a(2, "Service disconnected");
    }
}
