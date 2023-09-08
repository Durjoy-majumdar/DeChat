package com.tencent.p014mm.storage;

import java.util.Map;
import java.util.Objects;
import zt3.C119157j;

/* renamed from: com.tencent.mm.storage.u1 */
public class C85798u1 {

    /* renamed from: a */
    public String f249880a = "";

    /* renamed from: b */
    public volatile Map<Integer, Object> f249881b;

    /* renamed from: c */
    public volatile boolean f249882c = false;

    /* renamed from: d */
    public volatile boolean f249883d = false;

    /* renamed from: e */
    public volatile boolean f249884e = false;

    /* renamed from: f */
    public volatile boolean f249885f = false;

    /* renamed from: g */
    public boolean f249886g = true;

    /* renamed from: h */
    public boolean f249887h = false;

    /* renamed from: i */
    public ConfigFileStorageProxyMMKV f249888i;

    /* renamed from: j */
    public Runnable f249889j = new C85799a();

    /* renamed from: com.tencent.mm.storage.u1$a */
    public class C85799a implements Runnable {
        public C85799a() {
        }

        public void run() {
            C85798u1.this.mo119670k();
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public C85798u1(java.lang.String r10) {
        /*
            r9 = this;
            r9.<init>()
            java.lang.String r0 = ""
            r9.f249880a = r0
            r0 = 0
            r9.f249882c = r0
            r9.f249883d = r0
            r9.f249884e = r0
            r9.f249885f = r0
            r1 = 1
            r9.f249886g = r1
            r9.f249887h = r0
            com.tencent.mm.storage.u1$a r2 = new com.tencent.mm.storage.u1$a
            r2.<init>()
            r9.f249889j = r2
            java.io.File r2 = new java.io.File
            r2.<init>(r10)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0032
            java.lang.String r2 = "MicroMsg.ConfigFileStorage"
            java.lang.String r3 = "ConfigFileStorage not exit path[%s]"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r0] = r10
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
        L_0x0032:
            java.lang.String r2 = "MicroMsg.ConfigFileStorage"
            java.lang.String r3 = "ConfigFileStorage path is [%s],needCheckData:[%b]"
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r0] = r10
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5[r1] = r6
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r2, r3, r5)
            r9.f249880a = r10
            r9.f249886g = r1
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x004d
            goto L_0x0056
        L_0x004d:
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r10 = new com.tencent.mm.storage.ConfigFileStorageProxyMMKV
            java.lang.String r2 = r9.f249880a
            r10.<init>(r2)
            r9.f249888i = r10
        L_0x0056:
            monitor-enter(r9)
            r10 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r3 = r9.f249880a     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            if (r3 != 0) goto L_0x007c
            boolean r3 = r2.createNewFile()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r5 = "MicroMsg.ConfigFileStorage"
            java.lang.String r6 = "ConfigFileStorage openCfg not exit path[%s], created[%b]"
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r8 = r9.f249880a     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r7[r0] = r8     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r7[r1] = r3     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r5, r6, r7)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
        L_0x007c:
            long r5 = r2.length()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x00f1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            r2.<init>(r3)     // Catch:{ Exception -> 0x00ed, all -> 0x00ea }
            java.lang.Object r5 = r2.readObject()     // Catch:{ Exception -> 0x00e8 }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x00e8 }
            r9.f249881b = r5     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r5 = "MicroMsg.ConfigFileStorage"
            java.lang.String r6 = "openCfg end, file :[%s], keys count:[%d]"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x00e8 }
            java.lang.String r7 = r9.f249880a     // Catch:{ Exception -> 0x00e8 }
            r4[r0] = r7     // Catch:{ Exception -> 0x00e8 }
            java.util.Map<java.lang.Integer, java.lang.Object> r7 = r9.f249881b     // Catch:{ Exception -> 0x00e8 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x00e8 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x00e8 }
            r4[r1] = r7     // Catch:{ Exception -> 0x00e8 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r5, r6, r4)     // Catch:{ Exception -> 0x00e8 }
            r9.f249882c = r0     // Catch:{ Exception -> 0x00e8 }
            r9.f249884e = r1     // Catch:{ Exception -> 0x00e8 }
            boolean r4 = r9.mo119668i()     // Catch:{ Exception -> 0x00e8 }
            if (r4 == 0) goto L_0x00e4
            boolean r4 = r9.f249886g     // Catch:{ Exception -> 0x00e8 }
            if (r4 == 0) goto L_0x00e4
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r4 = r9.f249888i     // Catch:{ Exception -> 0x00e8 }
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r9.f249881b     // Catch:{ Exception -> 0x00e8 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x00e8 }
            if (r5 != 0) goto L_0x00ca
            monitor-exit(r4)     // Catch:{ Exception -> 0x00e8 }
            r5 = 0
            goto L_0x00cf
        L_0x00ca:
            boolean r5 = r4.mo119636a(r5)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x00e8 }
        L_0x00cf:
            if (r5 == 0) goto L_0x00e4
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r4 = r9.f249888i     // Catch:{ Exception -> 0x00e8 }
            r5 = 34
            r4.mo119644i(r5)     // Catch:{ Exception -> 0x00e8 }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r4 = r9.f249888i     // Catch:{ Exception -> 0x00e8 }
            r4.mo119646k(r5, r10)     // Catch:{ Exception -> 0x00e8 }
            r9.mo119669j()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00e4
        L_0x00e1:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x00e8 }
            throw r5     // Catch:{ Exception -> 0x00e8 }
        L_0x00e4:
            r2.close()     // Catch:{ Exception -> 0x014e }
            goto L_0x014b
        L_0x00e8:
            r4 = move-exception
            goto L_0x0118
        L_0x00ea:
            r0 = move-exception
            goto L_0x0155
        L_0x00ed:
            r2 = move-exception
            r4 = r2
            r2 = r10
            goto L_0x0118
        L_0x00f1:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r2.<init>()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r9.f249881b = r2     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r3.<init>()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r4 = "ConfigFileStorage openCfg file len == 0 path = "
            r3.append(r4)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r4 = r9.f249880a     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r3.append(r4)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
            throw r2     // Catch:{ Exception -> 0x0114, all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            r3 = r10
            goto L_0x0155
        L_0x0114:
            r2 = move-exception
            r3 = r10
            r4 = r2
            r2 = r3
        L_0x0118:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0152 }
            r5.<init>()     // Catch:{ all -> 0x0152 }
            r9.f249881b = r5     // Catch:{ all -> 0x0152 }
            java.lang.String r5 = "MicroMsg.ConfigFileStorage"
            java.lang.String r6 = "openCfg Exception!"
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch:{ all -> 0x0152 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r4, r6, r7)     // Catch:{ all -> 0x0152 }
            r9.f249882c = r1     // Catch:{ all -> 0x0152 }
            boolean r1 = r9.mo119668i()     // Catch:{ all -> 0x0152 }
            if (r1 == 0) goto L_0x0144
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r1 = r9.f249888i     // Catch:{ all -> 0x0152 }
            r4 = 42
            r1.mo119644i(r4)     // Catch:{ all -> 0x0152 }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r1 = r9.f249888i     // Catch:{ all -> 0x0152 }
            r1.mo119646k(r4, r10)     // Catch:{ all -> 0x0152 }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r10 = r9.f249888i     // Catch:{ all -> 0x0152 }
            java.util.Map<java.lang.Integer, java.lang.Object> r1 = r9.f249881b     // Catch:{ all -> 0x0152 }
            r10.mo119643h(r1)     // Catch:{ all -> 0x0152 }
        L_0x0144:
            if (r2 == 0) goto L_0x0149
            r2.close()     // Catch:{ Exception -> 0x014e }
        L_0x0149:
            if (r3 == 0) goto L_0x014e
        L_0x014b:
            r3.close()     // Catch:{ Exception -> 0x014e }
        L_0x014e:
            monitor-exit(r9)
            r9.f249887h = r0
            return
        L_0x0152:
            r10 = move-exception
            r0 = r10
            r10 = r2
        L_0x0155:
            if (r10 == 0) goto L_0x015d
            r10.close()     // Catch:{ Exception -> 0x0162 }
            goto L_0x015d
        L_0x015b:
            r10 = move-exception
            goto L_0x0163
        L_0x015d:
            if (r3 == 0) goto L_0x0162
            r3.close()     // Catch:{ Exception -> 0x0162 }
        L_0x0162:
            throw r0     // Catch:{ all -> 0x015b }
        L_0x0163:
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85798u1.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0050, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo119660a(int r21) {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r1.f249881b     // Catch:{ all -> 0x0053 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0053 }
            boolean r2 = r20.mo119668i()     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0051
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r2 = r1.f249888i     // Catch:{ all -> 0x0053 }
            r3 = 0
            r4 = r21
            java.lang.Object r2 = r2.mo119638c(r4, r3)     // Catch:{ all -> 0x0053 }
            boolean r3 = java.util.Objects.equals(r0, r2)     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x004f
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r3 = r1.f249888i     // Catch:{ all -> 0x0053 }
            r5 = 16
            r3.mo119644i(r5)     // Catch:{ all -> 0x0053 }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r6 = r1.f249888i     // Catch:{ all -> 0x0053 }
            java.lang.String r15 = java.lang.String.valueOf(r21)     // Catch:{ all -> 0x0053 }
            java.lang.String r16 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0053 }
            java.lang.String r17 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0053 }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r19 = 0
            r18 = 16
            r6.mo119647l(r7, r8, r9, r11, r13, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0053 }
            java.util.Map<java.lang.Integer, java.lang.Object> r0 = r1.f249881b     // Catch:{ all -> 0x0053 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0053 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0053 }
        L_0x004f:
            monitor-exit(r20)
            return r2
        L_0x0051:
            monitor-exit(r20)
            return r0
        L_0x0053:
            r0 = move-exception
            monitor-exit(r20)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85798u1.mo119660a(int):java.lang.Object");
    }

    /* renamed from: b */
    public synchronized Object mo119661b(int i, Object obj) {
        Object obj2 = obj;
        synchronized (this) {
            Object obj3 = this.f249881b.get(Integer.valueOf(i));
            if (!mo119668i()) {
                return obj3 == null ? obj2 : obj3;
            }
            Object c = this.f249888i.mo119638c(i, obj2);
            if (!Objects.equals(obj3, c)) {
                this.f249888i.mo119644i(17);
                this.f249888i.mo119647l((String) null, false, 0, 0, 0, String.valueOf(i), String.valueOf(obj3), String.valueOf(c), 17, false);
                this.f249881b.put(Integer.valueOf(i), c);
            }
            return c == null ? obj2 : c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        return r4;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int mo119662c(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo119668i()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001d
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r2.f249888i     // Catch:{ all -> 0x0033 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r0.mo119638c(r3, r1)     // Catch:{ all -> 0x0033 }
            boolean r0 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0033 }
            int r4 = r3.intValue()     // Catch:{ all -> 0x0033 }
        L_0x001b:
            monitor-exit(r2)
            return r4
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r2.mo119661b(r3, r0)     // Catch:{ all -> 0x0033 }
            boolean r0 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x0033 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r4
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85798u1.mo119662c(int, int):int");
    }

    /* renamed from: d */
    public synchronized long mo118846d(int i, long j) {
        if (mo119668i()) {
            return this.f249888i.mo119640e(i, j);
        }
        Object b = mo119661b(i, Long.valueOf(j));
        if (!(b instanceof Long)) {
            return j;
        }
        return ((Long) b).longValue();
    }

    /* renamed from: e */
    public void mo119663e(int i) {
        ConfigFileStorageProxyMMKV configFileStorageProxyMMKV = this.f249888i;
        if (configFileStorageProxyMMKV != null) {
            configFileStorageProxyMMKV.mo119644i(i);
            this.f249888i.mo119646k(i, (String) null);
        }
    }

    /* renamed from: f */
    public synchronized void mo119664f(int i, Object obj) {
        this.f249885f = true;
        if (mo119668i()) {
            this.f249888i.mo119648m(i, obj);
        }
        if (this.f249881b != null) {
            this.f249881b.put(Integer.valueOf(i), obj);
        }
        if (!this.f249887h) {
            mo119669j();
        }
    }

    public void finalize() {
        ConfigFileStorageProxyMMKV configFileStorageProxyMMKV;
        super.finalize();
        if (this.f249884e && this.f249885f && (configFileStorageProxyMMKV = this.f249888i) != null) {
            configFileStorageProxyMMKV.mo119644i(27);
            this.f249888i.mo119646k(27, (String) null);
        }
    }

    /* renamed from: g */
    public synchronized void mo119666g(int i, int i2) {
        mo119664f(i, Integer.valueOf(i2));
    }

    /* renamed from: h */
    public synchronized void mo119667h(int i, long j) {
        mo119664f(i, Long.valueOf(j));
    }

    /* renamed from: i */
    public boolean mo119668i() {
        ConfigFileStorageProxyMMKV configFileStorageProxyMMKV = this.f249888i;
        return configFileStorageProxyMMKV != null && configFileStorageProxyMMKV.f249871a;
    }

    /* renamed from: j */
    public final synchronized void mo119669j() {
        if (!mo119668i()) {
            mo119670k();
            return;
        }
        if (mo119668i() && this.f249886g) {
            this.f249888i.mo119650o(this.f249881b);
        }
        ((C119157j) C119157j.f356862d).mo183894y(Integer.toString(hashCode()));
        ((C119157j) C119157j.f356862d).mo183879j(this.f249889j, 100, Integer.toString(hashCode()));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:72|73|(0)|(0)|81|82) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        if (r4 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00bb, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e1, code lost:
        if (r4 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0106, code lost:
        if (r4 != null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0113, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x011c, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x011a */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a8 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b6 A[SYNTHETIC, Splitter:B:43:0x00b6] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00de A[SYNTHETIC, Splitter:B:55:0x00de] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00f7 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0103 A[SYNTHETIC, Splitter:B:66:0x0103] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x010f A[SYNTHETIC, Splitter:B:75:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0117 A[Catch:{ Exception -> 0x011a }] */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo119670k() {
        /*
            r11 = this;
            monitor-enter(r11)
            r0 = 1
            r1 = 0
            r2 = 0
            boolean r3 = r11.mo119668i()     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            if (r3 == 0) goto L_0x0015
            boolean r3 = r11.f249886g     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            if (r3 == 0) goto L_0x0015
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r3 = r11.f249888i     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            java.util.Map<java.lang.Integer, java.lang.Object> r4 = r11.f249881b     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            r3.mo119650o(r4)     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
        L_0x0015:
            com.tencent.p014mm.sdk.platformtools.Util.nowMilliSecond()     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            java.lang.String r4 = r11.f249880a     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            r3.<init>(r4)     // Catch:{ ConcurrentModificationException -> 0x00e4, IOException -> 0x00bf, Exception -> 0x0084, all -> 0x0080 }
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ ConcurrentModificationException -> 0x0079, IOException -> 0x0073, Exception -> 0x006d, all -> 0x0069 }
            r4.<init>(r3)     // Catch:{ ConcurrentModificationException -> 0x0079, IOException -> 0x0073, Exception -> 0x006d, all -> 0x0069 }
            java.util.Map<java.lang.Integer, java.lang.Object> r5 = r11.f249881b     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            r4.writeObject(r5)     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            r3.flush()     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            r11.f249883d = r2     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            r11.f249884e = r2     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            java.io.File r5 = new java.io.File     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r6 = r11.f249880a     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            r5.<init>(r6)     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            boolean r5 = r5.exists()     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            if (r5 != 0) goto L_0x004a
            r5 = 40
            r11.mo119663e(r5)     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
            java.lang.String r5 = "MicroMsg.ConfigFileStorage"
            java.lang.String r6 = "writeCfgImpl file is not exit"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r5, r6)     // Catch:{ ConcurrentModificationException -> 0x0062, IOException -> 0x005b, Exception -> 0x0055, all -> 0x0052 }
        L_0x004a:
            r4.close()     // Catch:{ Exception -> 0x0109 }
            r3.close()     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x0052:
            r0 = move-exception
            r1 = r4
            goto L_0x006a
        L_0x0055:
            r5 = move-exception
            r10 = r4
            r4 = r3
            r3 = r5
            r5 = r10
            goto L_0x0087
        L_0x005b:
            r5 = move-exception
            r10 = r4
            r4 = r3
            r3 = r5
            r5 = r10
            goto L_0x00c2
        L_0x0062:
            r5 = move-exception
            r10 = r4
            r4 = r3
            r3 = r5
            r5 = r10
            goto L_0x00e7
        L_0x0069:
            r0 = move-exception
        L_0x006a:
            r4 = r3
            goto L_0x010d
        L_0x006d:
            r4 = move-exception
            r5 = r1
            r10 = r4
            r4 = r3
            r3 = r10
            goto L_0x0087
        L_0x0073:
            r4 = move-exception
            r5 = r1
            r10 = r4
            r4 = r3
            r3 = r10
            goto L_0x00c2
        L_0x0079:
            r4 = move-exception
            r5 = r1
            r10 = r4
            r4 = r3
            r3 = r10
            goto L_0x00e7
        L_0x0080:
            r0 = move-exception
            r4 = r1
            goto L_0x010d
        L_0x0084:
            r3 = move-exception
            r4 = r1
            r5 = r4
        L_0x0087:
            java.lang.String r6 = "MicroMsg.ConfigFileStorage"
            java.lang.String r7 = "exception:%s"
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ all -> 0x010b }
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.stackTraceToString(r3)     // Catch:{ all -> 0x010b }
            r8[r2] = r9     // Catch:{ all -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r7, r8)     // Catch:{ all -> 0x010b }
            java.lang.String r6 = "MicroMsg.ConfigFileStorage"
            java.lang.String r7 = "writeCfg"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r7, r2)     // Catch:{ all -> 0x010b }
            r11.f249883d = r0     // Catch:{ all -> 0x010b }
            boolean r0 = r11.mo119668i()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00b4
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            r2 = 19
            r0.mo119644i(r2)     // Catch:{ all -> 0x010b }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            r0.mo119646k(r2, r1)     // Catch:{ all -> 0x010b }
        L_0x00b4:
            if (r5 == 0) goto L_0x00b9
            r5.close()     // Catch:{ Exception -> 0x0109 }
        L_0x00b9:
            if (r4 == 0) goto L_0x0109
        L_0x00bb:
            r4.close()     // Catch:{ Exception -> 0x0109 }
            goto L_0x0109
        L_0x00bf:
            r3 = move-exception
            r4 = r1
            r5 = r4
        L_0x00c2:
            java.lang.String r6 = "MicroMsg.ConfigFileStorage"
            java.lang.String r7 = "writeCfg IOException"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r7, r2)     // Catch:{ all -> 0x010b }
            r11.f249883d = r0     // Catch:{ all -> 0x010b }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00dc
            r2 = 29
            r0.mo119644i(r2)     // Catch:{ all -> 0x010b }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            r0.mo119646k(r2, r1)     // Catch:{ all -> 0x010b }
        L_0x00dc:
            if (r5 == 0) goto L_0x00e1
            r5.close()     // Catch:{ Exception -> 0x0109 }
        L_0x00e1:
            if (r4 == 0) goto L_0x0109
            goto L_0x00bb
        L_0x00e4:
            r3 = move-exception
            r4 = r1
            r5 = r4
        L_0x00e7:
            java.lang.String r6 = "MicroMsg.ConfigFileStorage"
            java.lang.String r7 = "writeCfg ConcurrentModificationException"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x010b }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r3, r7, r2)     // Catch:{ all -> 0x010b }
            r11.f249883d = r0     // Catch:{ all -> 0x010b }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x0101
            r2 = 28
            r0.mo119644i(r2)     // Catch:{ all -> 0x010b }
            com.tencent.mm.storage.ConfigFileStorageProxyMMKV r0 = r11.f249888i     // Catch:{ all -> 0x010b }
            r0.mo119646k(r2, r1)     // Catch:{ all -> 0x010b }
        L_0x0101:
            if (r5 == 0) goto L_0x0106
            r5.close()     // Catch:{ Exception -> 0x0109 }
        L_0x0106:
            if (r4 == 0) goto L_0x0109
            goto L_0x00bb
        L_0x0109:
            monitor-exit(r11)
            return
        L_0x010b:
            r0 = move-exception
            r1 = r5
        L_0x010d:
            if (r1 == 0) goto L_0x0115
            r1.close()     // Catch:{ Exception -> 0x011a }
            goto L_0x0115
        L_0x0113:
            r0 = move-exception
            goto L_0x011b
        L_0x0115:
            if (r4 == 0) goto L_0x011a
            r4.close()     // Catch:{ Exception -> 0x011a }
        L_0x011a:
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x011b:
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.storage.C85798u1.mo119670k():void");
    }
}
