package com.tencent.mapsdk.internal;

import android.graphics.Rect;
import com.tencent.map.tools.CallbackRunnable;
import com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest;
import com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t;
import com.tencent.mapsdk.internal.C113961mq;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.tencent.mapsdk.internal.rb */
public final class C114133rb extends Thread {

    /* renamed from: b */
    public static final String f341632b = "UTF-8";

    /* renamed from: h */
    private static final String f341633h = "rttserverex";

    /* renamed from: i */
    private static final String f341634i = "getRtt";

    /* renamed from: j */
    private static final String f341635j = "info";

    /* renamed from: k */
    private static final String f341636k = "req";

    /* renamed from: l */
    private static final int f341637l = 30000;

    /* renamed from: a */
    public List<C114131qz> f341638a;

    /* renamed from: c */
    private C113961mq f341639c = null;

    /* renamed from: d */
    private C113932lh f341640d = null;

    /* renamed from: e */
    private boolean f341641e = true;

    /* renamed from: f */
    private boolean f341642f = false;

    /* renamed from: g */
    private boolean f341643g = false;

    /* renamed from: com.tencent.mapsdk.internal.rb$a */
    public class C114135a {

        /* renamed from: a */
        public int f341644a;

        /* renamed from: b */
        public int f341645b;

        private C114135a() {
        }

        public /* synthetic */ C114135a(C114133rb rbVar, byte b) {
            this();
        }
    }

    public C114133rb(C113961mq mqVar, C113932lh lhVar) {
        setName("tms-traffic-refresh");
        this.f341639c = mqVar;
        this.f341640d = lhVar;
        this.f341638a = new ArrayList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f2 A[Catch:{ all -> 0x014e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f3 A[Catch:{ all -> 0x014e }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m159274d() {
        /*
            r12 = this;
            com.tencent.mapsdk.internal.mq r0 = r12.f341639c
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x014e }
            java.lang.Object r0 = r0.f342031l     // Catch:{ all -> 0x014e }
            monitor-enter(r0)     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.mq r1 = r12.f341639c     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.ad r1 = r1.f340901i     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.v r2 = r1.f339663A     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.v$a r2 = r2.f342783b     // Catch:{ all -> 0x014b }
            int r5 = r2.f342821q     // Catch:{ all -> 0x014b }
            android.graphics.Rect r1 = r1.mo171254q()     // Catch:{ all -> 0x014b }
            int r2 = r1.left     // Catch:{ all -> 0x014b }
            float r2 = (float) r2     // Catch:{ all -> 0x014b }
            r3 = 1232348160(0x49742400, float:1000000.0)
            float r2 = r2 / r3
            double r6 = (double) r2     // Catch:{ all -> 0x014b }
            int r2 = r1.bottom     // Catch:{ all -> 0x014b }
            float r2 = (float) r2     // Catch:{ all -> 0x014b }
            float r2 = r2 / r3
            double r8 = (double) r2     // Catch:{ all -> 0x014b }
            int r2 = r1.right     // Catch:{ all -> 0x014b }
            float r2 = (float) r2     // Catch:{ all -> 0x014b }
            float r2 = r2 / r3
            double r10 = (double) r2     // Catch:{ all -> 0x014b }
            int r1 = r1.top     // Catch:{ all -> 0x014b }
            float r1 = (float) r1     // Catch:{ all -> 0x014b }
            float r1 = r1 / r3
            double r1 = (double) r1     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.rb$a r3 = r12.m159270a(r6, r8)     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.rb$a r1 = r12.m159270a(r10, r1)     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.mq r2 = r12.f341639c     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.sq r2 = r2.f340899g     // Catch:{ all -> 0x014b }
            int r4 = r3.f341644a     // Catch:{ all -> 0x014b }
            int r6 = r1.f341644a     // Catch:{ all -> 0x014b }
            int r6 = java.lang.Math.min(r4, r6)     // Catch:{ all -> 0x014b }
            int r4 = r3.f341645b     // Catch:{ all -> 0x014b }
            int r7 = r1.f341645b     // Catch:{ all -> 0x014b }
            int r7 = java.lang.Math.min(r4, r7)     // Catch:{ all -> 0x014b }
            int r4 = r1.f341644a     // Catch:{ all -> 0x014b }
            int r8 = r3.f341644a     // Catch:{ all -> 0x014b }
            int r8 = java.lang.Math.max(r4, r8)     // Catch:{ all -> 0x014b }
            int r1 = r1.f341645b     // Catch:{ all -> 0x014b }
            int r3 = r3.f341645b     // Catch:{ all -> 0x014b }
            int r9 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.sq$13 r1 = new com.tencent.mapsdk.internal.sq$13     // Catch:{ all -> 0x014b }
            r3 = r1
            r4 = r2
            r3.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x014b }
            r2.mo172930b((com.tencent.mapsdk.internal.C113961mq.C113963a) r1)     // Catch:{ all -> 0x014b }
            monitor-exit(r0)     // Catch:{ all -> 0x014b }
            com.tencent.mapsdk.internal.mq r0 = r12.f341639c     // Catch:{ all -> 0x014e }
            r1 = 0
            if (r0 != 0) goto L_0x006d
            goto L_0x012d
        L_0x006d:
            r2 = 0
            if (r0 != 0) goto L_0x0073
        L_0x0070:
            r3 = r1
            goto L_0x00f0
        L_0x0073:
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.sq$35 r3 = new com.tencent.mapsdk.internal.sq$35     // Catch:{ all -> 0x014e }
            r3.<init>()     // Catch:{ all -> 0x014e }
            java.lang.Object r0 = r0.mo172900a(r3, r1)     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.ra[] r0 = (com.tencent.mapsdk.internal.C114132ra[]) r0     // Catch:{ all -> 0x014e }
            if (r0 == 0) goto L_0x0070
            int r3 = r0.length     // Catch:{ all -> 0x014e }
            if (r3 != 0) goto L_0x0086
            goto L_0x0070
        L_0x0086:
            com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest r3 = new com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest     // Catch:{ all -> 0x014e }
            r3.<init>()     // Catch:{ all -> 0x014e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x014e }
            r4.<init>()     // Catch:{ all -> 0x014e }
            int r5 = r0.length     // Catch:{ all -> 0x014e }
            r6 = 0
        L_0x0092:
            if (r6 >= r5) goto L_0x00c6
            r7 = r0[r6]     // Catch:{ all -> 0x014e }
            int r8 = r7.f341626d     // Catch:{ all -> 0x014e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x014e }
            r4.add(r8)     // Catch:{ all -> 0x014e }
            int r8 = r7.f341625c     // Catch:{ all -> 0x014e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x014e }
            r4.add(r8)     // Catch:{ all -> 0x014e }
            int r8 = r7.f341628f     // Catch:{ all -> 0x014e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x014e }
            r4.add(r8)     // Catch:{ all -> 0x014e }
            int r8 = r7.f341627e     // Catch:{ all -> 0x014e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x014e }
            r4.add(r8)     // Catch:{ all -> 0x014e }
            int r7 = r7.f341629g     // Catch:{ all -> 0x014e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x014e }
            r4.add(r7)     // Catch:{ all -> 0x014e }
            int r6 = r6 + 1
            goto L_0x0092
        L_0x00c6:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x014e }
            r5.<init>()     // Catch:{ all -> 0x014e }
            int r6 = r0.length     // Catch:{ all -> 0x014e }
            r7 = 0
        L_0x00cd:
            if (r7 >= r6) goto L_0x00de
            r8 = r0[r7]     // Catch:{ all -> 0x014e }
            int r8 = r8.f341631i     // Catch:{ all -> 0x014e }
            long r8 = (long) r8     // Catch:{ all -> 0x014e }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x014e }
            r5.add(r8)     // Catch:{ all -> 0x014e }
            int r7 = r7 + 1
            goto L_0x00cd
        L_0x00de:
            r3.crcs = r5     // Catch:{ all -> 0x014e }
            r0 = r0[r2]     // Catch:{ all -> 0x014e }
            int r5 = r0.f341630h     // Catch:{ all -> 0x014e }
            r3.type = r5     // Catch:{ all -> 0x014e }
            r3.bounds = r4     // Catch:{ all -> 0x014e }
            r4 = 1
            r3.zip = r4     // Catch:{ all -> 0x014e }
            int r0 = r0.f341623a     // Catch:{ all -> 0x014e }
            short r0 = (short) r0     // Catch:{ all -> 0x014e }
            r3.zoom = r0     // Catch:{ all -> 0x014e }
        L_0x00f0:
            if (r3 != 0) goto L_0x00f3
            goto L_0x012d
        L_0x00f3:
            com.tencent.mapsdk.internal.lh r0 = r12.f341640d     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t r1 = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t     // Catch:{ all -> 0x014e }
            r1.<init>()     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "android_sdk"
            r1.f339582pf = r4     // Catch:{ all -> 0x014e }
            r1.is_login = r2     // Catch:{ all -> 0x014e }
            java.lang.String r2 = com.tencent.mapsdk.internal.C113798hb.m157095l()     // Catch:{ all -> 0x014e }
            r1.channel = r2     // Catch:{ all -> 0x014e }
            java.lang.String r2 = com.tencent.mapsdk.internal.C113798hb.m157085d()     // Catch:{ all -> 0x014e }
            r1.imei = r2     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.f r2 = new com.tencent.mapsdk.internal.f     // Catch:{ all -> 0x014e }
            r2.<init>()     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "rttserverex"
            r2.mo172057c((java.lang.String) r4)     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "getRtt"
            r2.mo172058d(r4)     // Catch:{ all -> 0x014e }
            java.lang.String r4 = "info"
            r2.mo171894a((java.lang.String) r4, r1)     // Catch:{ all -> 0x014e }
            java.lang.String r1 = "req"
            r2.mo171894a((java.lang.String) r1, r3)     // Catch:{ all -> 0x014e }
            byte[] r1 = r2.mo171903f()     // Catch:{ all -> 0x014e }
            byte[] r1 = r0.mo172352a(r1)     // Catch:{ all -> 0x014e }
        L_0x012d:
            if (r1 == 0) goto L_0x014a
            int r0 = r1.length     // Catch:{ all -> 0x014e }
            if (r0 <= 0) goto L_0x014a
            com.tencent.mapsdk.internal.mq r0 = r12.f341639c     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x014e }
            int r2 = r1.length     // Catch:{ all -> 0x014e }
            com.tencent.mapsdk.internal.sq$179 r3 = new com.tencent.mapsdk.internal.sq$179     // Catch:{ all -> 0x014e }
            r3.<init>(r1, r2)     // Catch:{ all -> 0x014e }
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x014e }
            java.lang.Object r0 = r0.mo172900a(r3, r1)     // Catch:{ all -> 0x014e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x014e }
            r0.intValue()     // Catch:{ all -> 0x014e }
        L_0x014a:
            return
        L_0x014b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014b }
            throw r1     // Catch:{ all -> 0x014e }
        L_0x014e:
            r0 = move-exception
            java.lang.String r1 = "refreshTrafficData error"
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r1, (java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114133rb.m159274d():void");
    }

    /* renamed from: e */
    private void m159275e() {
        C113503ad adVar = this.f341639c.f340901i;
        int i = adVar.f339663A.f342783b.f342821q;
        Rect q = adVar.mo171254q();
        C114135a a = m159270a((double) (((float) q.left) / 1000000.0f), (double) (((float) q.bottom) / 1000000.0f));
        C114135a a2 = m159270a((double) (((float) q.right) / 1000000.0f), (double) (((float) q.top) / 1000000.0f));
        C114216sq sqVar = this.f341639c.f340899g;
        sqVar.mo172930b((C113961mq.C113963a) new C113961mq.C113963a(i, Math.min(a.f341644a, a2.f341644a), Math.min(a.f341645b, a2.f341645b), Math.max(a2.f341644a, a.f341644a), Math.max(a2.f341645b, a.f341645b)) {
            /* renamed from: a */
            public final void mo54067a(GL10 gl10) {
                if (C114216sq.this.f342024e != 0) {
                    C114216sq.this.f342023d.nativeCheckTrafficBlockCache(C114216sq.this.f342024e, r2, r3, r4, r5, r6);
                }
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private byte[] m159276f() {
        /*
            r10 = this;
            com.tencent.mapsdk.internal.mq r0 = r10.f341639c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            r2 = 0
            if (r0 != 0) goto L_0x000c
        L_0x0009:
            r3 = r1
            goto L_0x0089
        L_0x000c:
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g
            com.tencent.mapsdk.internal.sq$35 r3 = new com.tencent.mapsdk.internal.sq$35
            r3.<init>()
            java.lang.Object r0 = r0.mo172900a(r3, r1)
            com.tencent.mapsdk.internal.ra[] r0 = (com.tencent.mapsdk.internal.C114132ra[]) r0
            if (r0 == 0) goto L_0x0009
            int r3 = r0.length
            if (r3 != 0) goto L_0x001f
            goto L_0x0009
        L_0x001f:
            com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest r3 = new com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r0.length
            r6 = 0
        L_0x002b:
            if (r6 >= r5) goto L_0x005f
            r7 = r0[r6]
            int r8 = r7.f341626d
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.f341625c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.f341628f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r8 = r7.f341627e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r4.add(r8)
            int r7 = r7.f341629g
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.add(r7)
            int r6 = r6 + 1
            goto L_0x002b
        L_0x005f:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r0.length
            r7 = 0
        L_0x0066:
            if (r7 >= r6) goto L_0x0077
            r8 = r0[r7]
            int r8 = r8.f341631i
            long r8 = (long) r8
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r5.add(r8)
            int r7 = r7 + 1
            goto L_0x0066
        L_0x0077:
            r3.crcs = r5
            r0 = r0[r2]
            int r5 = r0.f341630h
            r3.type = r5
            r3.bounds = r4
            r4 = 1
            r3.zip = r4
            int r0 = r0.f341623a
            short r0 = (short) r0
            r3.zoom = r0
        L_0x0089:
            if (r3 != 0) goto L_0x008c
            return r1
        L_0x008c:
            com.tencent.mapsdk.internal.lh r0 = r10.f341640d
            com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t r1 = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t
            r1.<init>()
            java.lang.String r4 = "android_sdk"
            r1.f339582pf = r4
            r1.is_login = r2
            java.lang.String r2 = com.tencent.mapsdk.internal.C113798hb.m157095l()
            r1.channel = r2
            java.lang.String r2 = com.tencent.mapsdk.internal.C113798hb.m157085d()
            r1.imei = r2
            com.tencent.mapsdk.internal.f r2 = new com.tencent.mapsdk.internal.f
            r2.<init>()
            java.lang.String r4 = "rttserverex"
            r2.mo172057c((java.lang.String) r4)
            java.lang.String r4 = "getRtt"
            r2.mo172058d(r4)
            java.lang.String r4 = "info"
            r2.mo171894a((java.lang.String) r4, r1)
            java.lang.String r1 = "req"
            r2.mo171894a((java.lang.String) r1, r3)
            byte[] r1 = r2.mo171903f()
            byte[] r0 = r0.mo172352a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114133rb.m159276f():byte[]");
    }

    /* renamed from: g */
    private RttRequest m159277g() {
        C113961mq mqVar = this.f341639c;
        RttRequest rttRequest = null;
        if (mqVar == null) {
            return null;
        }
        C114216sq sqVar = mqVar.f340899g;
        C114132ra[] raVarArr = (C114132ra[]) sqVar.mo172900a(new CallbackRunnable<C114132ra[]>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
                if (r1.length != 0) goto L_0x002d;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
                r0 = new com.tencent.mapsdk.internal.C114132ra[(r1.length / 9)];
                r2 = 0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
                if (r2 >= (r1.length / 9)) goto L_0x0078;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
                r3 = new com.tencent.mapsdk.internal.C114132ra();
                r0[r2] = r3;
                r4 = r2 * 9;
                r3.f341623a = r1[r4];
                r3.f341624b = r1[r4 + 1];
                r3.f341626d = r1[r4 + 2];
                r3.f341625c = r1[r4 + 3];
                r3.f341628f = r1[r4 + 4];
                r3.f341627e = r1[r4 + 5];
                r3.f341629g = r1[r4 + 6];
                r3.f341630h = r1[r4 + 7];
                r3.f341631i = r1[r4 + 8];
                r2 = r2 + 1;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0078, code lost:
                return r0;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
                return null;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
                if (r1 == null) goto L_0x0079;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public com.tencent.mapsdk.internal.C114132ra[] run() {
                /*
                    r7 = this;
                    com.tencent.mapsdk.internal.sq r0 = com.tencent.mapsdk.internal.C114216sq.this
                    java.lang.Object r0 = r0.f342031l
                    monitor-enter(r0)
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    long r1 = r1.f342024e     // Catch:{ all -> 0x007a }
                    r3 = 0
                    r5 = 0
                    int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r6 != 0) goto L_0x0016
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    return r5
                L_0x0016:
                    com.tencent.mapsdk.internal.sq r1 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    com.tencent.mapsdk.engine.jni.JNI r1 = r1.f342023d     // Catch:{ all -> 0x007a }
                    com.tencent.mapsdk.internal.sq r2 = com.tencent.mapsdk.internal.C114216sq.this     // Catch:{ all -> 0x007a }
                    long r2 = r2.f342024e     // Catch:{ all -> 0x007a }
                    int[] r1 = r1.nativeFetchLackedTrafficBlocks(r2)     // Catch:{ all -> 0x007a }
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    if (r1 == 0) goto L_0x0079
                    int r0 = r1.length
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0079
                L_0x002d:
                    int r0 = r1.length
                    int r0 = r0 / 9
                    com.tencent.mapsdk.internal.ra[] r0 = new com.tencent.mapsdk.internal.C114132ra[r0]
                    r2 = 0
                L_0x0033:
                    int r3 = r1.length
                    int r3 = r3 / 9
                    if (r2 >= r3) goto L_0x0078
                    com.tencent.mapsdk.internal.ra r3 = new com.tencent.mapsdk.internal.ra
                    r3.<init>()
                    r0[r2] = r3
                    int r4 = r2 * 9
                    r5 = r1[r4]
                    r3.f341623a = r5
                    int r5 = r4 + 1
                    r5 = r1[r5]
                    r3.f341624b = r5
                    int r5 = r4 + 2
                    r5 = r1[r5]
                    r3.f341626d = r5
                    int r5 = r4 + 3
                    r5 = r1[r5]
                    r3.f341625c = r5
                    int r5 = r4 + 4
                    r5 = r1[r5]
                    r3.f341628f = r5
                    int r5 = r4 + 5
                    r5 = r1[r5]
                    r3.f341627e = r5
                    int r5 = r4 + 6
                    r5 = r1[r5]
                    r3.f341629g = r5
                    int r5 = r4 + 7
                    r5 = r1[r5]
                    r3.f341630h = r5
                    int r4 = r4 + 8
                    r4 = r1[r4]
                    r3.f341631i = r4
                    int r2 = r2 + 1
                    goto L_0x0033
                L_0x0078:
                    return r0
                L_0x0079:
                    return r5
                L_0x007a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x007a }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114216sq.C11424535.run():com.tencent.mapsdk.internal.ra[]");
            }
        }, null);
        if (!(raVarArr == null || raVarArr.length == 0)) {
            rttRequest = new RttRequest();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (C114132ra raVar : raVarArr) {
                arrayList.add(Integer.valueOf(raVar.f341626d));
                arrayList.add(Integer.valueOf(raVar.f341625c));
                arrayList.add(Integer.valueOf(raVar.f341628f));
                arrayList.add(Integer.valueOf(raVar.f341627e));
                arrayList.add(Integer.valueOf(raVar.f341629g));
            }
            ArrayList<Long> arrayList2 = new ArrayList<>();
            for (C114132ra raVar2 : raVarArr) {
                arrayList2.add(Long.valueOf((long) raVar2.f341631i));
            }
            rttRequest.crcs = arrayList2;
            C114132ra raVar3 = raVarArr[0];
            rttRequest.type = raVar3.f341630h;
            rttRequest.bounds = arrayList;
            rttRequest.zip = 1;
            rttRequest.zoom = (short) raVar3.f341623a;
        }
        return rttRequest;
    }

    /* renamed from: a */
    public final void mo172752a() {
        this.f341642f = true;
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: b */
    public final void mo172753b() {
        this.f341642f = false;
        synchronized (this) {
            notifyAll();
        }
    }

    /* renamed from: c */
    public final void mo172754c() {
        this.f341643g = true;
        synchronized (this) {
            notifyAll();
        }
        interrupt();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff A[Catch:{ all -> 0x015b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0100 A[Catch:{ all -> 0x015b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            super.run()
        L_0x0003:
            boolean r0 = r14.f341643g
            if (r0 != 0) goto L_0x0184
            boolean r0 = r14.f341642f
            r1 = 0
            if (r0 != 0) goto L_0x0165
            com.tencent.mapsdk.internal.mq r0 = r14.f341639c
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            r2 = 1
            if (r0 == 0) goto L_0x0161
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r0.f342031l     // Catch:{ all -> 0x015b }
            monitor-enter(r0)     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.mq r3 = r14.f341639c     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.ad r3 = r3.f340901i     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.v r4 = r3.f339663A     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.v$a r4 = r4.f342783b     // Catch:{ all -> 0x0158 }
            int r7 = r4.f342821q     // Catch:{ all -> 0x0158 }
            android.graphics.Rect r3 = r3.mo171254q()     // Catch:{ all -> 0x0158 }
            int r4 = r3.left     // Catch:{ all -> 0x0158 }
            float r4 = (float) r4     // Catch:{ all -> 0x0158 }
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r5
            double r8 = (double) r4     // Catch:{ all -> 0x0158 }
            int r4 = r3.bottom     // Catch:{ all -> 0x0158 }
            float r4 = (float) r4     // Catch:{ all -> 0x0158 }
            float r4 = r4 / r5
            double r10 = (double) r4     // Catch:{ all -> 0x0158 }
            int r4 = r3.right     // Catch:{ all -> 0x0158 }
            float r4 = (float) r4     // Catch:{ all -> 0x0158 }
            float r4 = r4 / r5
            double r12 = (double) r4     // Catch:{ all -> 0x0158 }
            int r3 = r3.top     // Catch:{ all -> 0x0158 }
            float r3 = (float) r3     // Catch:{ all -> 0x0158 }
            float r3 = r3 / r5
            double r3 = (double) r3     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.rb$a r5 = r14.m159270a(r8, r10)     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.rb$a r3 = r14.m159270a(r12, r3)     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.mq r4 = r14.f341639c     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.sq r4 = r4.f340899g     // Catch:{ all -> 0x0158 }
            int r6 = r5.f341644a     // Catch:{ all -> 0x0158 }
            int r8 = r3.f341644a     // Catch:{ all -> 0x0158 }
            int r8 = java.lang.Math.min(r6, r8)     // Catch:{ all -> 0x0158 }
            int r6 = r5.f341645b     // Catch:{ all -> 0x0158 }
            int r9 = r3.f341645b     // Catch:{ all -> 0x0158 }
            int r9 = java.lang.Math.min(r6, r9)     // Catch:{ all -> 0x0158 }
            int r6 = r3.f341644a     // Catch:{ all -> 0x0158 }
            int r10 = r5.f341644a     // Catch:{ all -> 0x0158 }
            int r10 = java.lang.Math.max(r6, r10)     // Catch:{ all -> 0x0158 }
            int r3 = r3.f341645b     // Catch:{ all -> 0x0158 }
            int r5 = r5.f341645b     // Catch:{ all -> 0x0158 }
            int r11 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.sq$13 r3 = new com.tencent.mapsdk.internal.sq$13     // Catch:{ all -> 0x0158 }
            r5 = r3
            r6 = r4
            r5.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0158 }
            r4.mo172930b((com.tencent.mapsdk.internal.C113961mq.C113963a) r3)     // Catch:{ all -> 0x0158 }
            monitor-exit(r0)     // Catch:{ all -> 0x0158 }
            com.tencent.mapsdk.internal.mq r0 = r14.f341639c     // Catch:{ all -> 0x015b }
            r3 = 0
            if (r0 != 0) goto L_0x007c
            goto L_0x013a
        L_0x007c:
            if (r0 != 0) goto L_0x0081
        L_0x007e:
            r4 = r3
            goto L_0x00fd
        L_0x0081:
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.sq$35 r4 = new com.tencent.mapsdk.internal.sq$35     // Catch:{ all -> 0x015b }
            r4.<init>()     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r0.mo172900a(r4, r3)     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.ra[] r0 = (com.tencent.mapsdk.internal.C114132ra[]) r0     // Catch:{ all -> 0x015b }
            if (r0 == 0) goto L_0x007e
            int r4 = r0.length     // Catch:{ all -> 0x015b }
            if (r4 != 0) goto L_0x0094
            goto L_0x007e
        L_0x0094:
            com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest r4 = new com.tencent.mapsdk.core.components.protocol.jce.rtt.RttRequest     // Catch:{ all -> 0x015b }
            r4.<init>()     // Catch:{ all -> 0x015b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x015b }
            r5.<init>()     // Catch:{ all -> 0x015b }
            int r6 = r0.length     // Catch:{ all -> 0x015b }
            r7 = 0
        L_0x00a0:
            if (r7 >= r6) goto L_0x00d4
            r8 = r0[r7]     // Catch:{ all -> 0x015b }
            int r9 = r8.f341626d     // Catch:{ all -> 0x015b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x015b }
            r5.add(r9)     // Catch:{ all -> 0x015b }
            int r9 = r8.f341625c     // Catch:{ all -> 0x015b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x015b }
            r5.add(r9)     // Catch:{ all -> 0x015b }
            int r9 = r8.f341628f     // Catch:{ all -> 0x015b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x015b }
            r5.add(r9)     // Catch:{ all -> 0x015b }
            int r9 = r8.f341627e     // Catch:{ all -> 0x015b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x015b }
            r5.add(r9)     // Catch:{ all -> 0x015b }
            int r8 = r8.f341629g     // Catch:{ all -> 0x015b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x015b }
            r5.add(r8)     // Catch:{ all -> 0x015b }
            int r7 = r7 + 1
            goto L_0x00a0
        L_0x00d4:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x015b }
            r6.<init>()     // Catch:{ all -> 0x015b }
            int r7 = r0.length     // Catch:{ all -> 0x015b }
            r8 = 0
        L_0x00db:
            if (r8 >= r7) goto L_0x00ec
            r9 = r0[r8]     // Catch:{ all -> 0x015b }
            int r9 = r9.f341631i     // Catch:{ all -> 0x015b }
            long r9 = (long) r9     // Catch:{ all -> 0x015b }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x015b }
            r6.add(r9)     // Catch:{ all -> 0x015b }
            int r8 = r8 + 1
            goto L_0x00db
        L_0x00ec:
            r4.crcs = r6     // Catch:{ all -> 0x015b }
            r0 = r0[r1]     // Catch:{ all -> 0x015b }
            int r6 = r0.f341630h     // Catch:{ all -> 0x015b }
            r4.type = r6     // Catch:{ all -> 0x015b }
            r4.bounds = r5     // Catch:{ all -> 0x015b }
            r4.zip = r2     // Catch:{ all -> 0x015b }
            int r0 = r0.f341623a     // Catch:{ all -> 0x015b }
            short r0 = (short) r0     // Catch:{ all -> 0x015b }
            r4.zoom = r0     // Catch:{ all -> 0x015b }
        L_0x00fd:
            if (r4 != 0) goto L_0x0100
            goto L_0x013a
        L_0x0100:
            com.tencent.mapsdk.internal.lh r0 = r14.f341640d     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t r3 = new com.tencent.mapsdk.core.components.protocol.jce.user.user_login_t     // Catch:{ all -> 0x015b }
            r3.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r5 = "android_sdk"
            r3.f339582pf = r5     // Catch:{ all -> 0x015b }
            r3.is_login = r1     // Catch:{ all -> 0x015b }
            java.lang.String r5 = com.tencent.mapsdk.internal.C113798hb.m157095l()     // Catch:{ all -> 0x015b }
            r3.channel = r5     // Catch:{ all -> 0x015b }
            java.lang.String r5 = com.tencent.mapsdk.internal.C113798hb.m157085d()     // Catch:{ all -> 0x015b }
            r3.imei = r5     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.f r5 = new com.tencent.mapsdk.internal.f     // Catch:{ all -> 0x015b }
            r5.<init>()     // Catch:{ all -> 0x015b }
            java.lang.String r6 = "rttserverex"
            r5.mo172057c((java.lang.String) r6)     // Catch:{ all -> 0x015b }
            java.lang.String r6 = "getRtt"
            r5.mo172058d(r6)     // Catch:{ all -> 0x015b }
            java.lang.String r6 = "info"
            r5.mo171894a((java.lang.String) r6, r3)     // Catch:{ all -> 0x015b }
            java.lang.String r3 = "req"
            r5.mo171894a((java.lang.String) r3, r4)     // Catch:{ all -> 0x015b }
            byte[] r3 = r5.mo171903f()     // Catch:{ all -> 0x015b }
            byte[] r3 = r0.mo172352a(r3)     // Catch:{ all -> 0x015b }
        L_0x013a:
            if (r3 == 0) goto L_0x0161
            int r0 = r3.length     // Catch:{ all -> 0x015b }
            if (r0 <= 0) goto L_0x0161
            com.tencent.mapsdk.internal.mq r0 = r14.f341639c     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.sq r0 = r0.f340899g     // Catch:{ all -> 0x015b }
            int r4 = r3.length     // Catch:{ all -> 0x015b }
            com.tencent.mapsdk.internal.sq$179 r5 = new com.tencent.mapsdk.internal.sq$179     // Catch:{ all -> 0x015b }
            r5.<init>(r3, r4)     // Catch:{ all -> 0x015b }
            r3 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x015b }
            java.lang.Object r0 = r0.mo172900a(r5, r3)     // Catch:{ all -> 0x015b }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x015b }
            r0.intValue()     // Catch:{ all -> 0x015b }
            goto L_0x0161
        L_0x0158:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0158 }
            throw r3     // Catch:{ all -> 0x015b }
        L_0x015b:
            r0 = move-exception
            java.lang.String r3 = "refreshTrafficData error"
            com.tencent.mapsdk.internal.C113889km.m157547b((java.lang.String) r3, (java.lang.Throwable) r0)
        L_0x0161:
            com.tencent.mapsdk.internal.mq r0 = r14.f341639c
            r0.f340914v = r2
        L_0x0165:
            monitor-enter(r14)     // Catch:{ InterruptedException -> 0x017d }
            boolean r0 = r14.f341641e     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x0172
            r2 = 500(0x1f4, double:2.47E-321)
            r14.wait(r2)     // Catch:{ all -> 0x017a }
            r14.f341641e = r1     // Catch:{ all -> 0x017a }
            goto L_0x0177
        L_0x0172:
            r0 = 30000(0x7530, double:1.4822E-319)
            r14.wait(r0)     // Catch:{ all -> 0x017a }
        L_0x0177:
            monitor-exit(r14)     // Catch:{ all -> 0x017a }
            goto L_0x0003
        L_0x017a:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ InterruptedException -> 0x017d }
        L_0x017d:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0184:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C114133rb.run():void");
    }

    /* renamed from: a */
    private void m159271a(C114131qz qzVar) {
        List<C114131qz> list = this.f341638a;
        if (list != null && qzVar != null) {
            list.add(qzVar);
        }
    }

    /* renamed from: b */
    private void m159273b(C114131qz qzVar) {
        List<C114131qz> list = this.f341638a;
        if (list != null && qzVar != null) {
            list.remove(qzVar);
        }
    }

    /* renamed from: a */
    private static byte[] m159272a(RttRequest rttRequest) {
        user_login_t user_login_t = new user_login_t();
        user_login_t.f339582pf = "android_sdk";
        user_login_t.is_login = false;
        user_login_t.channel = C113798hb.m157095l();
        user_login_t.imei = C113798hb.m157085d();
        C113715f fVar = new C113715f();
        fVar.mo172057c(f341633h);
        fVar.mo172058d(f341634i);
        fVar.mo171894a(f341635j, user_login_t);
        fVar.mo171894a(f341636k, rttRequest);
        return fVar.mo171903f();
    }

    /* renamed from: a */
    private C114135a m159270a(double d, double d2) {
        double sin = Math.sin((d2 * 3.1415926d) / 180.0d);
        C114135a aVar = new C114135a(this, (byte) 0);
        aVar.f341644a = (int) ((((d + 180.0d) / 360.0d) * 2.68435456E8d) + 0.5d);
        aVar.f341645b = (int) ((((180.0d - ((Math.log((sin + 1.0d) / (1.0d - sin)) * 180.0d) / 6.2831852d)) / 360.0d) * 2.68435456E8d) + 0.5d);
        return aVar;
    }
}
