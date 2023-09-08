package al1;

import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import gy3.C87412m;
import java.util.LinkedHashMap;

/* renamed from: al1.p */
public final class C54134p {

    /* renamed from: a */
    public static final C54134p f152045a = new C54134p();

    /* renamed from: b */
    public static final LinkedHashMap<Long, C54127h> f152046b = new LinkedHashMap<>();

    /* renamed from: c */
    public static C54135a f152047c;

    /* renamed from: al1.p$a */
    public static final class C54135a {

        /* renamed from: a */
        public final long f152048a;

        /* renamed from: b */
        public final C54127h f152049b;

        public C54135a(long j, C54127h hVar) {
            C87412m.m108594g(hVar, WeChatBrands.Business.GROUP_LIVE);
            this.f152048a = j;
            this.f152049b = hVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C54135a)) {
                return false;
            }
            C54135a aVar = (C54135a) obj;
            return this.f152048a == aVar.f152048a && C87412m.m108589b(this.f152049b, aVar.f152049b);
        }

        public int hashCode() {
            long j = this.f152048a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f152049b.hashCode();
        }

        public String toString() {
            return "PreInHistory(comeInTime=" + this.f152048a + ", live=" + this.f152049b + ')';
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r2 = r11.f151977d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74957a(al1.C54127h r11, boolean r12) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "#reportCurrentLive liveId:"
            r0.append(r1)
            r1 = 0
            if (r11 == 0) goto L_0x0018
            com.tencent.mm.live.api.LiveConfig r2 = r11.f151977d
            if (r2 == 0) goto L_0x0018
            long r2 = r2.f157064e
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0019
        L_0x0018:
            r2 = r1
        L_0x0019:
            r0.append(r2)
            java.lang.String r2 = " name:"
            r0.append(r2)
            if (r11 == 0) goto L_0x002a
            com.tencent.mm.live.api.LiveConfig r3 = r11.f151977d
            if (r3 == 0) goto L_0x002a
            java.lang.String r3 = r3.f157053K
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            r0.append(r3)
            java.lang.String r3 = " isHistoryLive:"
            r0.append(r3)
            r0.append(r12)
            r12 = 125(0x7d, float:1.75E-43)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "LiveHistoryManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            if (r11 == 0) goto L_0x0051
            com.tencent.mm.live.api.LiveConfig r12 = r11.f151977d
            if (r12 == 0) goto L_0x0051
            long r3 = r12.f157064e
            java.lang.Long r12 = java.lang.Long.valueOf(r3)
            goto L_0x0052
        L_0x0051:
            r12 = r1
        L_0x0052:
            al1.p$a r3 = f152047c
            if (r3 == 0) goto L_0x0065
            al1.h r3 = r3.f152049b
            if (r3 == 0) goto L_0x0065
            com.tencent.mm.live.api.LiveConfig r3 = r3.f151977d
            if (r3 == 0) goto L_0x0065
            long r3 = r3.f157064e
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x0066
        L_0x0065:
            r3 = r1
        L_0x0066:
            boolean r12 = gy3.C87412m.m108589b(r12, r3)
            if (r12 == 0) goto L_0x0071
            java.lang.String r12 = "reportCurrentLive is equal. return"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
        L_0x0071:
            al1.p$a r12 = f152047c
            r3 = 1
            if (r12 == 0) goto L_0x0143
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r12.f152048a
            long r4 = r4 - r6
            pe1.c<java.lang.Integer> r6 = gg1.C32444a.f86163k1
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r6 = r6 * 1000
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0092
            r6 = 1
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "#reportCurrentLive pre live liveId:"
            r7.append(r8)
            al1.h r8 = r12.f152049b
            com.tencent.mm.live.api.LiveConfig r8 = r8.f151977d
            long r8 = r8.f157064e
            r7.append(r8)
            r7.append(r2)
            al1.h r2 = r12.f152049b
            com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
            java.lang.String r2 = r2.f157053K
            r7.append(r2)
            java.lang.String r2 = " stayTime:"
            r7.append(r2)
            r7.append(r4)
            java.lang.String r2 = " toHistory="
            r7.append(r2)
            r7.append(r6)
            java.lang.String r2 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            if (r6 == 0) goto L_0x0143
            java.util.LinkedHashMap<java.lang.Long, al1.h> r2 = f152046b
            al1.h r4 = r12.f152049b
            com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
            long r4 = r4.f157064e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.remove(r4)
            al1.h r4 = r12.f152049b
            com.tencent.mm.live.api.LiveConfig r4 = r4.f151977d
            long r4 = r4.f157064e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            al1.h r12 = r12.f152049b
            r2.put(r4, r12)
            java.util.Set r12 = r2.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x00f1:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0143
            java.lang.Object r2 = r12.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.util.LinkedHashMap<java.lang.Long, al1.h> r4 = f152046b
            int r4 = r4.size()
            pe1.c<java.lang.Integer> r5 = gg1.C32444a.f86167l1
            java.lang.Object r5 = r5.mo60266n()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r4 <= r5) goto L_0x0143
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "#reportCurrentLive historiesList.size="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ", max="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = ". remove "
            r6.append(r4)
            java.lang.Object r2 = r2.getValue()
            al1.h r2 = (al1.C54127h) r2
            com.tencent.mm.live.api.LiveConfig r2 = r2.f151977d
            java.lang.String r2 = r2.f157053K
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r12.remove()
            goto L_0x00f1
        L_0x0143:
            f152047c = r1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "#reportCurrentLive finally histories size: "
            r12.append(r1)
            java.util.LinkedHashMap<java.lang.Long, al1.h> r1 = f152046b
            int r1 = r1.size()
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r12)
            if (r11 != 0) goto L_0x0162
            return
        L_0x0162:
            long r0 = java.lang.System.currentTimeMillis()
            al1.h r12 = new al1.h
            com.tencent.mm.live.api.LiveConfig r11 = r11.f151977d
            r12.<init>((com.tencent.p014mm.live.api.LiveConfig) r11)
            r12.f151983j = r3
            rx3.b0 r11 = rx3.C13598b0.f38549a
            al1.p$a r11 = new al1.p$a
            r11.<init>(r0, r12)
            f152047c = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al1.C54134p.mo74957a(al1.h, boolean):void");
    }
}
