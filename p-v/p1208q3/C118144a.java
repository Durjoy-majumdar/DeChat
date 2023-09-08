package p1208q3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: q3.a */
public final class C118144a {

    /* renamed from: f */
    public static final Object f353157f = new Object();

    /* renamed from: g */
    public static C118144a f353158g;

    /* renamed from: a */
    public final Context f353159a;

    /* renamed from: b */
    public final HashMap<BroadcastReceiver, ArrayList<C118147c>> f353160b = new HashMap<>();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C118147c>> f353161c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C118146b> f353162d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f353163e;

    /* renamed from: q3.a$a */
    public class C118145a extends Handler {
        public C118145a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = r4.f353166b.size();
            r6 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
            if (r6 >= r5) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            r7 = r4.f353166b.get(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
            if (r7.f353170d != false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
            r7.f353168b.onReceive(r11.f353159a, r4.f353165a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r11) {
            /*
                r10 = this;
                int r0 = r11.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r11)
                goto L_0x0017
            L_0x0009:
                q3.a r11 = p1208q3.C118144a.this
            L_0x000b:
                java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<q3.a$c>> r0 = r11.f353160b
                monitor-enter(r0)
                java.util.ArrayList<q3.a$b> r1 = r11.f353162d     // Catch:{ all -> 0x004f }
                int r1 = r1.size()     // Catch:{ all -> 0x004f }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
            L_0x0017:
                return
            L_0x0018:
                q3.a$b[] r2 = new p1208q3.C118144a.C118146b[r1]     // Catch:{ all -> 0x004f }
                java.util.ArrayList<q3.a$b> r3 = r11.f353162d     // Catch:{ all -> 0x004f }
                r3.toArray(r2)     // Catch:{ all -> 0x004f }
                java.util.ArrayList<q3.a$b> r3 = r11.f353162d     // Catch:{ all -> 0x004f }
                r3.clear()     // Catch:{ all -> 0x004f }
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                java.util.ArrayList<q3.a$c> r5 = r4.f353166b
                int r5 = r5.size()
                r6 = 0
            L_0x0032:
                if (r6 >= r5) goto L_0x004c
                java.util.ArrayList<q3.a$c> r7 = r4.f353166b
                java.lang.Object r7 = r7.get(r6)
                q3.a$c r7 = (p1208q3.C118144a.C118147c) r7
                boolean r8 = r7.f353170d
                if (r8 != 0) goto L_0x0049
                android.content.BroadcastReceiver r7 = r7.f353168b
                android.content.Context r8 = r11.f353159a
                android.content.Intent r9 = r4.f353165a
                r7.onReceive(r8, r9)
            L_0x0049:
                int r6 = r6 + 1
                goto L_0x0032
            L_0x004c:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004f:
                r11 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004f }
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p1208q3.C118144a.C118145a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: q3.a$b */
    public static final class C118146b {

        /* renamed from: a */
        public final Intent f353165a;

        /* renamed from: b */
        public final ArrayList<C118147c> f353166b;

        public C118146b(Intent intent, ArrayList<C118147c> arrayList) {
            this.f353165a = intent;
            this.f353166b = arrayList;
        }
    }

    /* renamed from: q3.a$c */
    public static final class C118147c {

        /* renamed from: a */
        public final IntentFilter f353167a;

        /* renamed from: b */
        public final BroadcastReceiver f353168b;

        /* renamed from: c */
        public boolean f353169c;

        /* renamed from: d */
        public boolean f353170d;

        public C118147c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f353167a = intentFilter;
            this.f353168b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f353168b);
            sb.append(" filter=");
            sb.append(this.f353167a);
            if (this.f353170d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    public C118144a(Context context) {
        this.f353159a = context;
        this.f353163e = new C118145a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C118144a m166672a(Context context) {
        C118144a aVar;
        synchronized (f353157f) {
            if (f353158g == null) {
                f353158g = new C118144a(context.getApplicationContext());
            }
            aVar = f353158g;
        }
        return aVar;
    }

    /* renamed from: b */
    public void mo182943b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f353160b) {
            C118147c cVar = new C118147c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f353160b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f353160b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f353161c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f353161c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00da, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo182944c(android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<q3.a$c>> r2 = r1.f353160b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x00dc }
            android.content.Context r3 = r1.f353159a     // Catch:{ all -> 0x00dc }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00dc }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00dc }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x00dc }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x00dc }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x00dc }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x00dc }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = 1
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x0034
            r23.toString()     // Catch:{ all -> 0x00dc }
        L_0x0034:
            java.util.HashMap<java.lang.String, java.util.ArrayList<q3.a$c>> r3 = r1.f353161c     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x00dc }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00dc }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x00dc }
            if (r8 == 0) goto L_0x00d9
            if (r16 == 0) goto L_0x0048
            r8.toString()     // Catch:{ all -> 0x00dc }
        L_0x0048:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x004b:
            int r3 = r8.size()     // Catch:{ all -> 0x00dc }
            if (r6 >= r3) goto L_0x00a9
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x00dc }
            r5 = r3
            q3.a$c r5 = (p1208q3.C118144a.C118147c) r5     // Catch:{ all -> 0x00dc }
            if (r16 == 0) goto L_0x005f
            android.content.IntentFilter r3 = r5.f353167a     // Catch:{ all -> 0x00dc }
            java.util.Objects.toString(r3)     // Catch:{ all -> 0x00dc }
        L_0x005f:
            boolean r3 = r5.f353169c     // Catch:{ all -> 0x00dc }
            if (r3 == 0) goto L_0x006e
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r11 = 1
            r10 = r7
            goto L_0x009e
        L_0x006e:
            android.content.IntentFilter r3 = r5.f353167a     // Catch:{ all -> 0x00dc }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = 1
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00dc }
            if (r3 < 0) goto L_0x009e
            if (r16 == 0) goto L_0x008f
            java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x00dc }
        L_0x008f:
            if (r10 != 0) goto L_0x0097
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x00dc }
            r7.<init>()     // Catch:{ all -> 0x00dc }
            goto L_0x0098
        L_0x0097:
            r7 = r10
        L_0x0098:
            r7.add(r15)     // Catch:{ all -> 0x00dc }
            r15.f353169c = r11     // Catch:{ all -> 0x00dc }
            goto L_0x009f
        L_0x009e:
            r7 = r10
        L_0x009f:
            int r6 = r18 + 1
            r10 = r19
            r8 = r20
            r11 = r21
            r9 = 1
            goto L_0x004b
        L_0x00a9:
            r10 = r7
            r11 = 1
            if (r10 == 0) goto L_0x00d9
            r3 = 0
        L_0x00ae:
            int r4 = r10.size()     // Catch:{ all -> 0x00dc }
            if (r3 >= r4) goto L_0x00c0
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x00dc }
            q3.a$c r4 = (p1208q3.C118144a.C118147c) r4     // Catch:{ all -> 0x00dc }
            r5 = 0
            r4.f353169c = r5     // Catch:{ all -> 0x00dc }
            int r3 = r3 + 1
            goto L_0x00ae
        L_0x00c0:
            java.util.ArrayList<q3.a$b> r3 = r1.f353162d     // Catch:{ all -> 0x00dc }
            q3.a$b r4 = new q3.a$b     // Catch:{ all -> 0x00dc }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x00dc }
            r3.add(r4)     // Catch:{ all -> 0x00dc }
            android.os.Handler r0 = r1.f353163e     // Catch:{ all -> 0x00dc }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00d7
            android.os.Handler r0 = r1.f353163e     // Catch:{ all -> 0x00dc }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x00dc }
        L_0x00d7:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            return r11
        L_0x00d9:
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            r0 = 0
            return r0
        L_0x00dc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00dc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1208q3.C118144a.mo182944c(android.content.Intent):boolean");
    }

    /* renamed from: d */
    public void mo182945d(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f353160b) {
            ArrayList remove = this.f353160b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    C118147c cVar = (C118147c) remove.get(size);
                    cVar.f353170d = true;
                    for (int i = 0; i < cVar.f353167a.countActions(); i++) {
                        String action = cVar.f353167a.getAction(i);
                        ArrayList arrayList = this.f353161c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                C118147c cVar2 = (C118147c) arrayList.get(size2);
                                if (cVar2.f353168b == broadcastReceiver) {
                                    cVar2.f353170d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f353161c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
