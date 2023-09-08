package g24;

import d24.C106982e;
import d24.C20383a;
import d24.C20400e0;
import d24.C20405i;
import d24.C20414o;
import d24.C20425v;
import d24.C20428x;
import e24.C20507a;
import e24.C20509c;
import g24.C20786f;
import h24.C20886c;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: g24.g */
public final class C20788g {

    /* renamed from: a */
    public final C20383a f58722a;

    /* renamed from: b */
    public C20786f.C20787a f58723b;

    /* renamed from: c */
    public C20400e0 f58724c;

    /* renamed from: d */
    public final C20405i f58725d;

    /* renamed from: e */
    public final C106982e f58726e;

    /* renamed from: f */
    public final C20414o f58727f;

    /* renamed from: g */
    public final Object f58728g;

    /* renamed from: h */
    public final C20786f f58729h;

    /* renamed from: i */
    public int f58730i;

    /* renamed from: j */
    public C20783c f58731j;

    /* renamed from: k */
    public boolean f58732k;

    /* renamed from: l */
    public boolean f58733l;

    /* renamed from: m */
    public boolean f58734m;

    /* renamed from: n */
    public C20886c f58735n;

    /* renamed from: g24.g$a */
    public static final class C20789a extends WeakReference<C20788g> {

        /* renamed from: a */
        public final Object f58736a;

        public C20789a(C20788g gVar, Object obj) {
            super(gVar);
            this.f58736a = obj;
        }
    }

    public C20788g(C20405i iVar, C20383a aVar, C106982e eVar, C20414o oVar, Object obj) {
        this.f58725d = iVar;
        this.f58722a = aVar;
        this.f58726e = eVar;
        this.f58727f = oVar;
        ((C20425v.C20426a) C20507a.f57727a).getClass();
        this.f58729h = new C20786f(aVar, iVar.f57235e, eVar, oVar);
        this.f58728g = obj;
    }

    /* renamed from: a */
    public void mo32480a(C20783c cVar, boolean z) {
        if (this.f58731j == null) {
            this.f58731j = cVar;
            this.f58732k = z;
            ((ArrayList) cVar.f58707n).add(new C20789a(this, this.f58728g));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public synchronized C20783c mo32481b() {
        return this.f58731j;
    }

    /* renamed from: c */
    public final Socket mo32482c(boolean z, boolean z2, boolean z3) {
        Socket socket;
        if (z3) {
            this.f58735n = null;
        }
        boolean z4 = true;
        if (z2) {
            this.f58733l = true;
        }
        C20783c cVar = this.f58731j;
        if (cVar == null) {
            return null;
        }
        if (z) {
            cVar.f58704k = true;
        }
        if (this.f58735n != null) {
            return null;
        }
        if (!this.f58733l && !cVar.f58704k) {
            return null;
        }
        int size = ((ArrayList) cVar.f58707n).size();
        for (int i = 0; i < size; i++) {
            if (((Reference) ((ArrayList) cVar.f58707n).get(i)).get() == this) {
                ((ArrayList) cVar.f58707n).remove(i);
                if (((ArrayList) this.f58731j.f58707n).isEmpty()) {
                    this.f58731j.f58708o = System.nanoTime();
                    C20507a aVar = C20507a.f57727a;
                    C20405i iVar = this.f58725d;
                    C20783c cVar2 = this.f58731j;
                    ((C20425v.C20426a) aVar).getClass();
                    iVar.getClass();
                    if (cVar2.f58704k || iVar.f57231a == 0) {
                        ((ArrayDeque) iVar.f57234d).remove(cVar2);
                    } else {
                        iVar.notifyAll();
                        z4 = false;
                    }
                    if (z4) {
                        socket = this.f58731j.f58698e;
                        this.f58731j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f58731j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: d */
    public final g24.C20783c mo32483d(int r25, int r26, int r27, int r28, boolean r29) {
        /*
            r24 = this;
            r1 = r24
            d24.i r2 = r1.f58725d
            monitor-enter(r2)
            boolean r0 = r1.f58733l     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0365
            h24.c r0 = r1.f58735n     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x035d
            boolean r0 = r1.f58734m     // Catch:{ all -> 0x036d }
            if (r0 != 0) goto L_0x0355
            g24.c r0 = r1.f58731j     // Catch:{ all -> 0x036d }
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0021
            boolean r6 = r0.f58704k     // Catch:{ all -> 0x036d }
            if (r6 == 0) goto L_0x0021
            java.net.Socket r6 = r1.mo32482c(r4, r4, r5)     // Catch:{ all -> 0x036d }
            goto L_0x0022
        L_0x0021:
            r6 = r3
        L_0x0022:
            g24.c r7 = r1.f58731j     // Catch:{ all -> 0x036d }
            if (r7 == 0) goto L_0x0028
            r0 = r3
            goto L_0x0029
        L_0x0028:
            r7 = r3
        L_0x0029:
            boolean r8 = r1.f58732k     // Catch:{ all -> 0x036d }
            if (r8 != 0) goto L_0x002e
            r0 = r3
        L_0x002e:
            if (r7 != 0) goto L_0x0044
            e24.a r8 = e24.C20507a.f57727a     // Catch:{ all -> 0x036d }
            d24.i r9 = r1.f58725d     // Catch:{ all -> 0x036d }
            d24.a r10 = r1.f58722a     // Catch:{ all -> 0x036d }
            r8.mo31955b(r9, r10, r1, r3)     // Catch:{ all -> 0x036d }
            g24.c r8 = r1.f58731j     // Catch:{ all -> 0x036d }
            if (r8 == 0) goto L_0x0041
            r7 = r8
            r9 = 1
            r8 = r3
            goto L_0x0046
        L_0x0041:
            d24.e0 r8 = r1.f58724c     // Catch:{ all -> 0x036d }
            goto L_0x0045
        L_0x0044:
            r8 = r3
        L_0x0045:
            r9 = 0
        L_0x0046:
            monitor-exit(r2)     // Catch:{ all -> 0x036d }
            e24.C20509c.m22198d(r6)
            if (r0 == 0) goto L_0x0051
            d24.o r0 = r1.f58727f
            r0.getClass()
        L_0x0051:
            if (r9 == 0) goto L_0x0058
            d24.o r0 = r1.f58727f
            r0.getClass()
        L_0x0058:
            if (r7 == 0) goto L_0x0061
            g24.c r0 = r1.f58731j
            d24.e0 r0 = r0.f58696c
            r1.f58724c = r0
            return r7
        L_0x0061:
            if (r8 != 0) goto L_0x0263
            g24.f$a r0 = r1.f58723b
            if (r0 == 0) goto L_0x0076
            int r2 = r0.f58721b
            java.util.List<d24.e0> r0 = r0.f58720a
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0073
            r0 = 1
            goto L_0x0074
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x0263
        L_0x0076:
            g24.f r0 = r1.f58729h
            int r2 = r0.f58717f
            java.util.List<java.net.Proxy> r6 = r0.f58716e
            int r6 = r6.size()
            if (r2 >= r6) goto L_0x0084
            r2 = 1
            goto L_0x0085
        L_0x0084:
            r2 = 0
        L_0x0085:
            if (r2 != 0) goto L_0x0094
            java.util.List<d24.e0> r2 = r0.f58719h
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            r2 = 0
            goto L_0x0095
        L_0x0094:
            r2 = 1
        L_0x0095:
            if (r2 == 0) goto L_0x025d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x009c:
            int r6 = r0.f58717f
            java.util.List<java.net.Proxy> r10 = r0.f58716e
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x00a8
            r6 = 1
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            if (r6 == 0) goto L_0x0242
            int r6 = r0.f58717f
            java.util.List<java.net.Proxy> r10 = r0.f58716e
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x00b7
            r6 = 1
            goto L_0x00b8
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            java.lang.String r10 = "No route to "
            if (r6 == 0) goto L_0x021d
            java.util.List<java.net.Proxy> r6 = r0.f58716e
            int r11 = r0.f58717f
            int r12 = r11 + 1
            r0.f58717f = r12
            java.lang.Object r6 = r6.get(r11)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r0.f58718g = r11
            java.net.Proxy$Type r11 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.DIRECT
            if (r11 == r12) goto L_0x011b
            java.net.Proxy$Type r11 = r6.type()
            java.net.Proxy$Type r12 = java.net.Proxy.Type.SOCKS
            if (r11 != r12) goto L_0x00e2
            goto L_0x011b
        L_0x00e2:
            java.net.SocketAddress r11 = r6.address()
            boolean r12 = r11 instanceof java.net.InetSocketAddress
            if (r12 == 0) goto L_0x0100
            java.net.InetSocketAddress r11 = (java.net.InetSocketAddress) r11
            java.net.InetAddress r12 = r11.getAddress()
            if (r12 != 0) goto L_0x00f7
            java.lang.String r12 = r11.getHostName()
            goto L_0x00fb
        L_0x00f7:
            java.lang.String r12 = r12.getHostAddress()
        L_0x00fb:
            int r11 = r11.getPort()
            goto L_0x0123
        L_0x0100:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Proxy.address() is not an InetSocketAddress: "
            r2.append(r3)
            java.lang.Class r3 = r11.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x011b:
            d24.a r11 = r0.f58712a
            d24.s r11 = r11.f57113a
            java.lang.String r12 = r11.f57268d
            int r11 = r11.f57269e
        L_0x0123:
            if (r11 < r5) goto L_0x01fb
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r13) goto L_0x01fb
            java.net.Proxy$Type r10 = r6.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.SOCKS
            if (r10 != r13) goto L_0x013c
            java.util.List<java.net.InetSocketAddress> r10 = r0.f58718g
            java.net.InetSocketAddress r11 = java.net.InetSocketAddress.createUnresolved(r12, r11)
            r10.add(r11)
            goto L_0x017a
        L_0x013c:
            d24.o r10 = r0.f58715d
            r10.getClass()
            d24.a r10 = r0.f58712a
            d24.n r10 = r10.f57114b
            d24.n$a r10 = (d24.C20412n.C20413a) r10
            r10.getClass()
            if (r12 == 0) goto L_0x01f3
            java.net.InetAddress[] r10 = java.net.InetAddress.getAllByName(r12)     // Catch:{ NullPointerException -> 0x01d8 }
            java.util.List r10 = java.util.Arrays.asList(r10)     // Catch:{ NullPointerException -> 0x01d8 }
            boolean r13 = r10.isEmpty()
            if (r13 != 0) goto L_0x01ba
            d24.o r12 = r0.f58715d
            r12.getClass()
            int r12 = r10.size()
            r13 = 0
        L_0x0164:
            if (r13 >= r12) goto L_0x017a
            java.lang.Object r14 = r10.get(r13)
            java.net.InetAddress r14 = (java.net.InetAddress) r14
            java.util.List<java.net.InetSocketAddress> r15 = r0.f58718g
            java.net.InetSocketAddress r3 = new java.net.InetSocketAddress
            r3.<init>(r14, r11)
            r15.add(r3)
            int r13 = r13 + 1
            r3 = 0
            goto L_0x0164
        L_0x017a:
            java.util.List<java.net.InetSocketAddress> r3 = r0.f58718g
            int r3 = r3.size()
            r10 = 0
        L_0x0181:
            if (r10 >= r3) goto L_0x01af
            d24.e0 r11 = new d24.e0
            d24.a r12 = r0.f58712a
            java.util.List<java.net.InetSocketAddress> r13 = r0.f58718g
            java.lang.Object r13 = r13.get(r10)
            java.net.InetSocketAddress r13 = (java.net.InetSocketAddress) r13
            r11.<init>(r12, r6, r13)
            g24.d r12 = r0.f58713b
            monitor-enter(r12)
            java.util.Set<d24.e0> r13 = r12.f58709a     // Catch:{ all -> 0x01ac }
            boolean r13 = r13.contains(r11)     // Catch:{ all -> 0x01ac }
            monitor-exit(r12)
            if (r13 == 0) goto L_0x01a6
            java.util.List<d24.e0> r12 = r0.f58719h
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r11)
            goto L_0x01a9
        L_0x01a6:
            r2.add(r11)
        L_0x01a9:
            int r10 = r10 + 1
            goto L_0x0181
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x01af:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x01b7
            goto L_0x0242
        L_0x01b7:
            r3 = 0
            goto L_0x009c
        L_0x01ba:
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            d24.a r0 = r0.f58712a
            d24.n r0 = r0.f57114b
            r3.append(r0)
            java.lang.String r0 = " returned no addresses for "
            r3.append(r0)
            r3.append(r12)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01d8:
            r0 = move-exception
            java.net.UnknownHostException r2 = new java.net.UnknownHostException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Broken system behaviour for dns lookup of "
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            r2.initCause(r0)
            throw r2
        L_0x01f3:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.String r2 = "hostname == null"
            r0.<init>(r2)
            throw r0
        L_0x01fb:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r11)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x021d:
            java.net.SocketException r2 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            d24.a r4 = r0.f58712a
            d24.s r4 = r4.f57113a
            java.lang.String r4 = r4.f57268d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List<java.net.Proxy> r0 = r0.f58716e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0242:
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0254
            java.util.List<d24.e0> r3 = r0.f58719h
            r2.addAll(r3)
            java.util.List<d24.e0> r0 = r0.f58719h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
        L_0x0254:
            g24.f$a r0 = new g24.f$a
            r0.<init>(r2)
            r1.f58723b = r0
            r0 = 1
            goto L_0x0264
        L_0x025d:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x0263:
            r0 = 0
        L_0x0264:
            d24.i r3 = r1.f58725d
            monitor-enter(r3)
            boolean r2 = r1.f58734m     // Catch:{ all -> 0x0352 }
            if (r2 != 0) goto L_0x034a
            if (r0 == 0) goto L_0x029b
            g24.f$a r0 = r1.f58723b     // Catch:{ all -> 0x0352 }
            r0.getClass()     // Catch:{ all -> 0x0352 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0352 }
            java.util.List<d24.e0> r0 = r0.f58720a     // Catch:{ all -> 0x0352 }
            r2.<init>(r0)     // Catch:{ all -> 0x0352 }
            int r0 = r2.size()     // Catch:{ all -> 0x0352 }
            r6 = 0
        L_0x027e:
            if (r6 >= r0) goto L_0x029b
            java.lang.Object r10 = r2.get(r6)     // Catch:{ all -> 0x0352 }
            d24.e0 r10 = (d24.C20400e0) r10     // Catch:{ all -> 0x0352 }
            e24.a r11 = e24.C20507a.f57727a     // Catch:{ all -> 0x0352 }
            d24.i r12 = r1.f58725d     // Catch:{ all -> 0x0352 }
            d24.a r13 = r1.f58722a     // Catch:{ all -> 0x0352 }
            r11.mo31955b(r12, r13, r1, r10)     // Catch:{ all -> 0x0352 }
            g24.c r11 = r1.f58731j     // Catch:{ all -> 0x0352 }
            if (r11 == 0) goto L_0x0298
            r1.f58724c = r10     // Catch:{ all -> 0x0352 }
            r7 = r11
            r9 = 1
            goto L_0x029b
        L_0x0298:
            int r6 = r6 + 1
            goto L_0x027e
        L_0x029b:
            if (r9 != 0) goto L_0x02d4
            if (r8 != 0) goto L_0x02c6
            g24.f$a r0 = r1.f58723b     // Catch:{ all -> 0x0352 }
            int r2 = r0.f58721b     // Catch:{ all -> 0x0352 }
            java.util.List<d24.e0> r6 = r0.f58720a     // Catch:{ all -> 0x0352 }
            int r6 = r6.size()     // Catch:{ all -> 0x0352 }
            if (r2 >= r6) goto L_0x02ad
            r2 = 1
            goto L_0x02ae
        L_0x02ad:
            r2 = 0
        L_0x02ae:
            if (r2 == 0) goto L_0x02c0
            java.util.List<d24.e0> r2 = r0.f58720a     // Catch:{ all -> 0x0352 }
            int r6 = r0.f58721b     // Catch:{ all -> 0x0352 }
            int r7 = r6 + 1
            r0.f58721b = r7     // Catch:{ all -> 0x0352 }
            java.lang.Object r0 = r2.get(r6)     // Catch:{ all -> 0x0352 }
            r8 = r0
            d24.e0 r8 = (d24.C20400e0) r8     // Catch:{ all -> 0x0352 }
            goto L_0x02c6
        L_0x02c0:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0352 }
            r0.<init>()     // Catch:{ all -> 0x0352 }
            throw r0     // Catch:{ all -> 0x0352 }
        L_0x02c6:
            r1.f58724c = r8     // Catch:{ all -> 0x0352 }
            r1.f58730i = r4     // Catch:{ all -> 0x0352 }
            g24.c r7 = new g24.c     // Catch:{ all -> 0x0352 }
            d24.i r0 = r1.f58725d     // Catch:{ all -> 0x0352 }
            r7.<init>(r0, r8)     // Catch:{ all -> 0x0352 }
            r1.mo32480a(r7, r4)     // Catch:{ all -> 0x0352 }
        L_0x02d4:
            monitor-exit(r3)     // Catch:{ all -> 0x0352 }
            if (r9 == 0) goto L_0x02dd
            d24.o r0 = r1.f58727f
            r0.getClass()
            return r7
        L_0x02dd:
            d24.e r0 = r1.f58726e
            d24.o r2 = r1.f58727f
            r16 = r7
            r17 = r25
            r18 = r26
            r19 = r27
            r20 = r28
            r21 = r29
            r22 = r0
            r23 = r2
            r16.mo32469c(r17, r18, r19, r20, r21, r22, r23)
            e24.a r0 = e24.C20507a.f57727a
            d24.i r2 = r1.f58725d
            d24.v$a r0 = (d24.C20425v.C20426a) r0
            r0.getClass()
            g24.d r0 = r2.f57235e
            d24.e0 r2 = r7.f58696c
            r0.mo32478a(r2)
            d24.i r2 = r1.f58725d
            monitor-enter(r2)
            r1.f58732k = r5     // Catch:{ all -> 0x0347 }
            e24.a r0 = e24.C20507a.f57727a     // Catch:{ all -> 0x0347 }
            d24.i r3 = r1.f58725d     // Catch:{ all -> 0x0347 }
            d24.v$a r0 = (d24.C20425v.C20426a) r0     // Catch:{ all -> 0x0347 }
            r0.getClass()     // Catch:{ all -> 0x0347 }
            boolean r0 = r3.f57236f     // Catch:{ all -> 0x0347 }
            if (r0 != 0) goto L_0x0321
            r3.f57236f = r5     // Catch:{ all -> 0x0347 }
            java.util.concurrent.Executor r0 = d24.C20405i.f57230g     // Catch:{ all -> 0x0347 }
            java.lang.Runnable r6 = r3.f57233c     // Catch:{ all -> 0x0347 }
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch:{ all -> 0x0347 }
            r0.execute(r6)     // Catch:{ all -> 0x0347 }
        L_0x0321:
            java.util.Deque<g24.c> r0 = r3.f57234d     // Catch:{ all -> 0x0347 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0347 }
            r0.add(r7)     // Catch:{ all -> 0x0347 }
            j24.g r0 = r7.f58701h     // Catch:{ all -> 0x0347 }
            if (r0 == 0) goto L_0x032d
            r4 = 1
        L_0x032d:
            if (r4 == 0) goto L_0x033c
            e24.a r0 = e24.C20507a.f57727a     // Catch:{ all -> 0x0347 }
            d24.i r3 = r1.f58725d     // Catch:{ all -> 0x0347 }
            d24.a r4 = r1.f58722a     // Catch:{ all -> 0x0347 }
            java.net.Socket r3 = r0.mo31954a(r3, r4, r1)     // Catch:{ all -> 0x0347 }
            g24.c r7 = r1.f58731j     // Catch:{ all -> 0x0347 }
            goto L_0x033d
        L_0x033c:
            r3 = 0
        L_0x033d:
            monitor-exit(r2)     // Catch:{ all -> 0x0347 }
            e24.C20509c.m22198d(r3)
            d24.o r0 = r1.f58727f
            r0.getClass()
            return r7
        L_0x0347:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0347 }
            throw r0
        L_0x034a:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0352 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0352 }
            throw r0     // Catch:{ all -> 0x0352 }
        L_0x0352:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0352 }
            throw r0
        L_0x0355:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x036d }
            throw r0     // Catch:{ all -> 0x036d }
        L_0x035d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x036d }
            throw r0     // Catch:{ all -> 0x036d }
        L_0x0365:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x036d }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x036d }
            throw r0     // Catch:{ all -> 0x036d }
        L_0x036d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x036d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20788g.mo32483d(int, int, int, int, boolean):g24.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
        if (r1.f58698e.isClosed() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r1.f58698e.isInputShutdown() != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r1.f58698e.isOutputShutdown() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r3 = r1.f58701h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r3 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        r6 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        if (r3.f59861j == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004b, code lost:
        if (r3.f59868t >= r3.f59867s) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        if (r6 < r3.f59869u) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0053, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0055, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        if (r18 == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3 = r1.f58698e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r1.f58698e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
        if (((o24.C21783x) r1.f58702i).mo34134e0() == false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.f58698e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        r1.f58698e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007e, code lost:
        r1.f58698e.setSoTimeout(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008a A[LOOP:0: B:0:0x0000->B:56:0x008a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x008f A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g24.C20783c mo32484e(int r13, int r14, int r15, int r16, boolean r17, boolean r18) {
        /*
            r12 = this;
        L_0x0000:
            g24.c r1 = r12.mo32483d(r13, r14, r15, r16, r17)
            r2 = r12
            d24.i r3 = r2.f58725d
            monitor-enter(r3)
            int r0 = r1.f58705l     // Catch:{ all -> 0x0019 }
            r4 = 0
            r5 = 1
            if (r0 != 0) goto L_0x001c
            j24.g r0 = r1.f58701h     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 != 0) goto L_0x001c
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x0019:
            r0 = move-exception
            goto L_0x0090
        L_0x001c:
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            java.net.Socket r0 = r1.f58698e
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L_0x0088
            java.net.Socket r0 = r1.f58698e
            boolean r0 = r0.isInputShutdown()
            if (r0 != 0) goto L_0x0088
            java.net.Socket r0 = r1.f58698e
            boolean r0 = r0.isOutputShutdown()
            if (r0 == 0) goto L_0x0036
            goto L_0x0088
        L_0x0036:
            j24.g r3 = r1.f58701h
            if (r3 == 0) goto L_0x005a
            long r6 = java.lang.System.nanoTime()
            monitor-enter(r3)
            boolean r0 = r3.f59861j     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0045
            monitor-exit(r3)
            goto L_0x0088
        L_0x0045:
            long r8 = r3.f59868t     // Catch:{ all -> 0x0057 }
            long r10 = r3.f59867s     // Catch:{ all -> 0x0057 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0055
            long r8 = r3.f59869u     // Catch:{ all -> 0x0057 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0055
            monitor-exit(r3)
            goto L_0x0088
        L_0x0055:
            monitor-exit(r3)
            goto L_0x0087
        L_0x0057:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x005a:
            if (r18 == 0) goto L_0x0087
            java.net.Socket r0 = r1.f58698e     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            int r3 = r0.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            java.net.Socket r0 = r1.f58698e     // Catch:{ all -> 0x007d }
            r0.setSoTimeout(r5)     // Catch:{ all -> 0x007d }
            o24.j r0 = r1.f58702i     // Catch:{ all -> 0x007d }
            o24.x r0 = (o24.C21783x) r0     // Catch:{ all -> 0x007d }
            boolean r0 = r0.mo34134e0()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0077
            java.net.Socket r0 = r1.f58698e     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            r0.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            goto L_0x0088
        L_0x0077:
            java.net.Socket r0 = r1.f58698e     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            r0.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            goto L_0x0087
        L_0x007d:
            r0 = move-exception
            java.net.Socket r6 = r1.f58698e     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            r6.setSoTimeout(r3)     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
            throw r0     // Catch:{ SocketTimeoutException -> 0x0086, IOException -> 0x0084 }
        L_0x0084:
            goto L_0x0088
        L_0x0086:
        L_0x0087:
            r4 = 1
        L_0x0088:
            if (r4 != 0) goto L_0x008f
            r12.mo32485f()
            goto L_0x0000
        L_0x008f:
            return r1
        L_0x0090:
            monitor-exit(r3)     // Catch:{ all -> 0x0019 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20788g.mo32484e(int, int, int, int, boolean, boolean):g24.c");
    }

    /* renamed from: f */
    public void mo32485f() {
        C20783c cVar;
        Socket c;
        synchronized (this.f58725d) {
            cVar = this.f58731j;
            c = mo32482c(true, false, false);
            if (this.f58731j != null) {
                cVar = null;
            }
        }
        C20509c.m22198d(c);
        if (cVar != null) {
            this.f58727f.getClass();
        }
    }

    /* renamed from: g */
    public void mo32486g() {
        C20783c cVar;
        Socket c;
        synchronized (this.f58725d) {
            cVar = this.f58731j;
            c = mo32482c(false, true, false);
            if (this.f58731j != null) {
                cVar = null;
            }
        }
        C20509c.m22198d(c);
        if (cVar != null) {
            C20507a aVar = C20507a.f57727a;
            C106982e eVar = this.f58726e;
            ((C20425v.C20426a) aVar).getClass();
            ((C20428x) eVar).mo31960c((IOException) null);
            this.f58727f.getClass();
            this.f58727f.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[Catch:{ all -> 0x0047 }] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32487h(java.io.IOException r7) {
        /*
            r6 = this;
            d24.i r0 = r6.f58725d
            monitor-enter(r0)
            boolean r1 = r7 instanceof j24.C21194v     // Catch:{ all -> 0x0047 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0023
            j24.v r7 = (j24.C21194v) r7     // Catch:{ all -> 0x0047 }
            j24.b r7 = r7.f59964d     // Catch:{ all -> 0x0047 }
            j24.b r1 = j24.C21156b.REFUSED_STREAM     // Catch:{ all -> 0x0047 }
            if (r7 != r1) goto L_0x001c
            int r7 = r6.f58730i     // Catch:{ all -> 0x0047 }
            int r7 = r7 + r3
            r6.f58730i = r7     // Catch:{ all -> 0x0047 }
            if (r7 <= r3) goto L_0x0049
            r6.f58724c = r2     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x001c:
            j24.b r1 = j24.C21156b.CANCEL     // Catch:{ all -> 0x0047 }
            if (r7 == r1) goto L_0x0049
            r6.f58724c = r2     // Catch:{ all -> 0x0047 }
            goto L_0x0045
        L_0x0023:
            g24.c r1 = r6.f58731j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0049
            j24.g r5 = r1.f58701h     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x002d
            r5 = 1
            goto L_0x002e
        L_0x002d:
            r5 = 0
        L_0x002e:
            if (r5 == 0) goto L_0x0034
            boolean r5 = r7 instanceof j24.C21155a     // Catch:{ all -> 0x0047 }
            if (r5 == 0) goto L_0x0049
        L_0x0034:
            int r1 = r1.f58705l     // Catch:{ all -> 0x0047 }
            if (r1 != 0) goto L_0x0045
            d24.e0 r1 = r6.f58724c     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x0043
            if (r7 == 0) goto L_0x0043
            g24.f r5 = r6.f58729h     // Catch:{ all -> 0x0047 }
            r5.mo32479a(r1, r7)     // Catch:{ all -> 0x0047 }
        L_0x0043:
            r6.f58724c = r2     // Catch:{ all -> 0x0047 }
        L_0x0045:
            r7 = 1
            goto L_0x004a
        L_0x0047:
            r7 = move-exception
            goto L_0x0066
        L_0x0049:
            r7 = 0
        L_0x004a:
            g24.c r1 = r6.f58731j     // Catch:{ all -> 0x0047 }
            java.net.Socket r7 = r6.mo32482c(r7, r4, r3)     // Catch:{ all -> 0x0047 }
            g24.c r3 = r6.f58731j     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x005a
            boolean r3 = r6.f58732k     // Catch:{ all -> 0x0047 }
            if (r3 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r2 = r1
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            e24.C20509c.m22198d(r7)
            if (r2 == 0) goto L_0x0065
            d24.o r7 = r6.f58727f
            r7.getClass()
        L_0x0065:
            return
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: g24.C20788g.mo32487h(java.io.IOException):void");
    }

    /* renamed from: i */
    public void mo32488i(boolean z, C20886c cVar, long j, IOException iOException) {
        C20783c cVar2;
        Socket c;
        boolean z2;
        this.f58727f.getClass();
        synchronized (this.f58725d) {
            if (cVar != null) {
                if (cVar == this.f58735n) {
                    if (!z) {
                        this.f58731j.f58705l++;
                    }
                    cVar2 = this.f58731j;
                    c = mo32482c(z, false, true);
                    if (this.f58731j != null) {
                        cVar2 = null;
                    }
                    z2 = this.f58733l;
                }
            }
            throw new IllegalStateException("expected " + this.f58735n + " but was " + cVar);
        }
        C20509c.m22198d(c);
        if (cVar2 != null) {
            this.f58727f.getClass();
        }
        if (iOException != null) {
            C20507a aVar = C20507a.f57727a;
            C106982e eVar = this.f58726e;
            ((C20425v.C20426a) aVar).getClass();
            ((C20428x) eVar).mo31960c(iOException);
            this.f58727f.getClass();
        } else if (z2) {
            C20507a aVar2 = C20507a.f57727a;
            C106982e eVar2 = this.f58726e;
            ((C20425v.C20426a) aVar2).getClass();
            ((C20428x) eVar2).mo31960c((IOException) null);
            this.f58727f.getClass();
        }
    }

    public String toString() {
        C20783c b = mo32481b();
        return b != null ? b.toString() : this.f58722a.toString();
    }
}
