package h30;

import g30.C87122a;
import java.util.List;

/* renamed from: h30.b */
public class C87420b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f253307d;

    /* renamed from: e */
    public final /* synthetic */ List f253308e;

    /* renamed from: f */
    public final /* synthetic */ C87122a f253309f;

    /* renamed from: g */
    public final /* synthetic */ boolean f253310g;

    /* renamed from: h */
    public final /* synthetic */ C87417a f253311h;

    public C87420b(C87417a aVar, String str, List list, C87122a aVar2, boolean z) {
        this.f253311h = aVar;
        this.f253307d = str;
        this.f253308e = list;
        this.f253309f = aVar2;
        this.f253310g = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r1 = r19
            h30.a r2 = r1.f253311h
            monitor-enter(r2)
            java.lang.String r0 = r1.f253307d     // Catch:{ all -> 0x0110 }
            r3 = 100
            d40.C31062a.m39295b(r0, r3)     // Catch:{ all -> 0x0110 }
            h30.a r0 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.a r0 = r0.f253304a     // Catch:{ all -> 0x0110 }
            r3 = 0
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = r1.f253307d     // Catch:{ all -> 0x0110 }
            y30.a r0 = y30.C91374g.m114627a(r0)     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0034
            boolean r4 = r0.mo125344d()     // Catch:{ all -> 0x0110 }
            if (r4 != 0) goto L_0x0022
            goto L_0x0034
        L_0x0022:
            h30.a r4 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.b r5 = new a40.b     // Catch:{ all -> 0x0110 }
            r5.<init>(r0)     // Catch:{ all -> 0x0110 }
            r4.f253304a = r5     // Catch:{ all -> 0x0110 }
            h30.a r0 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.a r0 = r0.f253304a     // Catch:{ all -> 0x0110 }
            boolean r0 = r0.mo109455a()     // Catch:{ all -> 0x0110 }
            goto L_0x003d
        L_0x0034:
            r0 = 0
            goto L_0x003d
        L_0x0036:
            if (r0 != 0) goto L_0x0039
            goto L_0x0034
        L_0x0039:
            boolean r0 = r0.mo109456b()     // Catch:{ all -> 0x0110 }
        L_0x003d:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            java.util.List r6 = r1.f253308e     // Catch:{ all -> 0x0110 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0110 }
        L_0x0047:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0110 }
            if (r7 == 0) goto L_0x010e
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0110 }
            r12 = r7
            f30.b r12 = (f30.C86705b) r12     // Catch:{ all -> 0x0110 }
            g30.a r7 = r1.f253309f     // Catch:{ all -> 0x0110 }
            if (r7 == 0) goto L_0x005b
            r7.mo121568a(r12)     // Catch:{ all -> 0x0110 }
        L_0x005b:
            h30.c r7 = new h30.c     // Catch:{ all -> 0x0110 }
            java.lang.String r8 = r1.f253307d     // Catch:{ all -> 0x0110 }
            java.lang.String r9 = r12.getUid()     // Catch:{ all -> 0x0110 }
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0110 }
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x0072
            h30.a r0 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.a r0 = r0.f253304a     // Catch:{ all -> 0x0110 }
            if (r0 == 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x00e5
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            r7.f253321e = r10     // Catch:{ all -> 0x0110 }
            r12.build()     // Catch:{ all -> 0x0110 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            long r10 = r13 - r10
            r7.f253326j = r10     // Catch:{ all -> 0x0110 }
            r7.f253320d = r13     // Catch:{ all -> 0x0110 }
            r10 = 20
            d40.C86172c.m106685a(r10)     // Catch:{ all -> 0x0110 }
            h30.a r8 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.a r8 = r8.f253304a     // Catch:{ all -> 0x0110 }
            a40.a$a r8 = r8.mo109457c(r12)     // Catch:{ all -> 0x0110 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            long r10 = r10 - r13
            if (r8 == 0) goto L_0x00c1
            java.lang.String r13 = r1.f253307d     // Catch:{ all -> 0x0110 }
            float r14 = r8.mo109459a(r9)     // Catch:{ all -> 0x0110 }
            double r14 = (double) r14     // Catch:{ all -> 0x0110 }
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 < 0) goto L_0x00b1
            r14 = 201(0xc9, float:2.82E-43)
            d40.C31062a.m39295b(r13, r14)     // Catch:{ all -> 0x0110 }
            r7.f253324h = r9     // Catch:{ all -> 0x0110 }
            goto L_0x00b8
        L_0x00b1:
            r14 = 202(0xca, float:2.83E-43)
            d40.C31062a.m39295b(r13, r14)     // Catch:{ all -> 0x0110 }
            r7.f253324h = r3     // Catch:{ all -> 0x0110 }
        L_0x00b8:
            float r13 = r8.mo109459a(r9)     // Catch:{ all -> 0x0110 }
            r7.f253323g = r13     // Catch:{ all -> 0x0110 }
            r7.f253325i = r10     // Catch:{ all -> 0x0110 }
            goto L_0x00cc
        L_0x00c1:
            java.lang.String r10 = r1.f253307d     // Catch:{ all -> 0x0110 }
            r11 = 203(0xcb, float:2.84E-43)
            d40.C31062a.m39295b(r10, r11)     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = ""
            r7.f253328l = r10     // Catch:{ all -> 0x0110 }
        L_0x00cc:
            h30.a r10 = r1.f253311h     // Catch:{ all -> 0x0110 }
            a40.a r10 = r10.f253304a     // Catch:{ all -> 0x0110 }
            y30.a r10 = r10.f233006a     // Catch:{ all -> 0x0110 }
            java.lang.String r10 = r10.mo125342b()     // Catch:{ all -> 0x0110 }
            r7.f253329m = r10     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = ".json"
            boolean r10 = r10.endsWith(r11)     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r9 = 0
        L_0x00e2:
            r7.f253330n = r9     // Catch:{ all -> 0x0110 }
            goto L_0x00ea
        L_0x00e5:
            r9 = 21
            d40.C86172c.m106685a(r9)     // Catch:{ all -> 0x0110 }
        L_0x00ea:
            r10 = r8
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            long r13 = r8 - r4
            g30.a r11 = r1.f253309f     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x0109
            zt3.t r15 = zt3.C119157j.f356862d     // Catch:{ all -> 0x0110 }
            boolean r9 = r1.f253310g     // Catch:{ all -> 0x0110 }
            h30.b$$a r8 = new h30.b$$a     // Catch:{ all -> 0x0110 }
            r16 = r8
            r8 = r16
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0110 }
            zt3.j r15 = (zt3.C119157j) r15     // Catch:{ all -> 0x0110 }
            r8 = r16
            r15.mo183895z(r8)     // Catch:{ all -> 0x0110 }
        L_0x0109:
            r7.mo121839a()     // Catch:{ all -> 0x0110 }
            goto L_0x0047
        L_0x010e:
            monitor-exit(r2)     // Catch:{ all -> 0x0110 }
            return
        L_0x0110:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0110 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.C87420b.run():void");
    }
}
