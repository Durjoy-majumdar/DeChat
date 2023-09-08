package nk1;

import gy3.C87412m;
import java.util.Collection;
import java.util.List;
import te3.C50037ju0;
import te3.C51628v11;
import te3.C52013xs0;
import wx3.C15601d;

/* renamed from: nk1.m */
public interface C61788m {

    /* renamed from: nk1.m$b */
    public static final class C11208b implements Comparable<C11208b> {

        /* renamed from: d */
        public final C52013xs0 f33040d;

        /* renamed from: e */
        public C11209c f33041e;

        /* renamed from: f */
        public long f33042f;

        /* renamed from: g */
        public C50037ju0 f33043g = new C50037ju0();

        /* renamed from: h */
        public String f33044h;

        /* renamed from: i */
        public int f33045i;

        /* renamed from: j */
        public int f33046j;

        /* renamed from: n */
        public boolean f33047n;

        /* renamed from: o */
        public boolean f33048o;

        /* renamed from: p */
        public boolean f33049p;

        /* renamed from: q */
        public String f33050q;

        /* renamed from: r */
        public String f33051r;

        /* renamed from: s */
        public boolean f33052s;

        /* renamed from: t */
        public C51628v11 f33053t;

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
            r0 = r0.f134919d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C11208b(te3.C52013xs0 r8) {
            /*
                r7 = this;
                java.lang.String r0 = "liveMsg"
                gy3.C87412m.m108594g(r8, r0)
                r7.<init>()
                r7.f33040d = r8
                te3.ju0 r0 = new te3.ju0
                r0.<init>()
                r7.f33043g = r0
                te3.hx0 r0 = r8.f144914s
                r1 = 0
                if (r0 == 0) goto L_0x001d
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r0.username
                goto L_0x001e
            L_0x001d:
                r0 = r1
            L_0x001e:
                r2 = 1
                r3 = 0
                if (r0 == 0) goto L_0x002b
                int r4 = r0.length()
                if (r4 != 0) goto L_0x0029
                goto L_0x002b
            L_0x0029:
                r4 = 0
                goto L_0x002c
            L_0x002b:
                r4 = 1
            L_0x002c:
                if (r4 == 0) goto L_0x0030
            L_0x002e:
                r0 = 0
                goto L_0x0051
            L_0x0030:
                java.lang.String r4 = eb0.C75592q0.m90789s()
                boolean r4 = gy3.C87412m.m108589b(r0, r4)
                if (r4 != 0) goto L_0x0050
                zc1.b r4 = zc1.C66785b.f191882e
                java.lang.String r4 = r4.mo90662O5()
                boolean r4 = gy3.C87412m.m108589b(r0, r4)
                if (r4 != 0) goto L_0x0050
                java.lang.String r4 = eb0.C75592q0.m90782l()
                boolean r0 = gy3.C87412m.m108589b(r0, r4)
                if (r0 == 0) goto L_0x002e
            L_0x0050:
                r0 = 1
            L_0x0051:
                r7.f33049p = r0
                te3.ju0 r0 = r7.f33043g
                pe3.b r8 = r8.f144906h
                if (r8 == 0) goto L_0x005e
                byte[] r8 = r8.mo123703f()
                goto L_0x005f
            L_0x005e:
                r8 = r1
            L_0x005f:
                java.lang.String r4 = "safeParser"
                java.lang.String r5 = ""
                if (r8 != 0) goto L_0x0067
                goto L_0x0073
            L_0x0067:
                r0.parseFrom(r8)     // Catch:{ Exception -> 0x006b }
                goto L_0x0073
            L_0x006b:
                r8 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[r2]
                r0[r3] = r8
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r0)
            L_0x0073:
                java.lang.Class<tf0.r1> r8 = tf0.C64918r1.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                tf0.r1 r8 = (tf0.C64918r1) r8
                te3.ju0 r0 = r7.f33043g
                java.lang.String r0 = r0.f136329d
                boolean r8 = r8.mo89060mm(r0)
                r7.f33047n = r8
                te3.ju0 r8 = r7.f33043g
                te3.p11 r8 = r8.f136332g
                if (r8 == 0) goto L_0x008e
                int r8 = r8.f139519s
                goto L_0x008f
            L_0x008e:
                r8 = 0
            L_0x008f:
                r0 = 32
                boolean r8 = o40.C61926c.m72696u(r8, r0)
                r7.f33048o = r8
                te3.ju0 r8 = r7.f33043g
                java.lang.String r0 = r8.f136335j
                r7.f33044h = r0
                int r6 = r8.f136334i
                r7.f33045i = r6
                int r6 = r8.f136330e
                r7.f33046j = r6
                java.lang.String r8 = r8.f136329d
                r7.f33050q = r8
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r8 != 0) goto L_0x00b9
                int r8 = r7.f33045i
                if (r8 > r2) goto L_0x00b7
                int r8 = r7.f33046j
                if (r8 <= r2) goto L_0x00b9
            L_0x00b7:
                r8 = 1
                goto L_0x00ba
            L_0x00b9:
                r8 = 0
            L_0x00ba:
                te3.xs0 r0 = r7.f33040d
                te3.hx0 r0 = r0.f144902d
                if (r0 == 0) goto L_0x00c7
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f134919d
                if (r0 == 0) goto L_0x00c7
                java.lang.String r0 = r0.username
                goto L_0x00c8
            L_0x00c7:
                r0 = r1
            L_0x00c8:
                if (r0 != 0) goto L_0x00cb
                r0 = r5
            L_0x00cb:
                r7.f33051r = r0
                te3.ju0 r0 = r7.f33043g
                te3.uu3 r0 = r0.f136337o
                if (r0 == 0) goto L_0x00f3
                pe3.b r0 = r0.f143147d
                if (r0 == 0) goto L_0x00f3
                te3.o71 r6 = new te3.o71
                r6.<init>()
                byte[] r0 = r0.mo123703f()
                r6.parseFrom(r0)     // Catch:{ Exception -> 0x00e5 }
                r1 = r6
                goto L_0x00ed
            L_0x00e5:
                r0 = move-exception
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r2[r3] = r0
                com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r5, r2)
            L_0x00ed:
                if (r1 == 0) goto L_0x00f1
                boolean r3 = r1.f138998g
            L_0x00f1:
                r7.f33052s = r3
            L_0x00f3:
                te3.v11 r0 = new te3.v11
                r0.<init>()
                java.util.LinkedList<te3.w11> r1 = r0.f143244e
                te3.ju0 r2 = r7.f33043g
                java.util.LinkedList<te3.w11> r2 = r2.f136338p
                r1.addAll(r2)
                r7.f33053t = r0
                boolean r0 = r7.f33049p
                if (r0 == 0) goto L_0x011b
                boolean r0 = r7.f33047n
                if (r0 == 0) goto L_0x0113
                if (r8 == 0) goto L_0x0110
                nk1.m$c r8 = nk1.C61788m.C11209c.SELF_PRECIOUS_GIFT_COMBO
                goto L_0x012e
            L_0x0110:
                nk1.m$c r8 = nk1.C61788m.C11209c.SELF_PRECIOUS_GIFT_SOLO
                goto L_0x012e
            L_0x0113:
                if (r8 == 0) goto L_0x0118
                nk1.m$c r8 = nk1.C61788m.C11209c.SELF_NORMAL_GIFT_COMBO
                goto L_0x012e
            L_0x0118:
                nk1.m$c r8 = nk1.C61788m.C11209c.SELF_NORMAL_GIFT_SOLO
                goto L_0x012e
            L_0x011b:
                boolean r0 = r7.f33047n
                if (r0 == 0) goto L_0x0127
                if (r8 == 0) goto L_0x0124
                nk1.m$c r8 = nk1.C61788m.C11209c.PRECIOUS_GIFT_COMBO
                goto L_0x012e
            L_0x0124:
                nk1.m$c r8 = nk1.C61788m.C11209c.PRECIOUS_GIFT_SOLO
                goto L_0x012e
            L_0x0127:
                if (r8 == 0) goto L_0x012c
                nk1.m$c r8 = nk1.C61788m.C11209c.NORMAL_GIFT_COMBO
                goto L_0x012e
            L_0x012c:
                nk1.m$c r8 = nk1.C61788m.C11209c.NORMAL_GIFT_SOLO
            L_0x012e:
                r7.f33041e = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nk1.C61788m.C11208b.<init>(te3.xs0):void");
        }

        public int compareTo(Object obj) {
            C11208b bVar = (C11208b) obj;
            C87412m.m108594g(bVar, "other");
            C11209c cVar = this.f33041e;
            C11209c cVar2 = bVar.f33041e;
            return cVar != cVar2 ? cVar.compareTo(cVar2) : C87412m.m108597j(this.f33042f, bVar.f33042f);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11208b) && C87412m.m108589b(this.f33040d, ((C11208b) obj).f33040d);
        }

        public int hashCode() {
            return this.f33040d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("giftId = " + this.f33050q);
            sb.append(", ");
            sb.append("giftType = " + this.f33041e);
            sb.append(", ");
            sb.append("queueMsgId = " + this.f33042f);
            sb.append(", ");
            sb.append("comboId = " + this.f33044h);
            sb.append(", ");
            sb.append("comboSumCount = " + this.f33045i);
            sb.append(", ");
            sb.append("rewardCount = " + this.f33046j);
            sb.append(", ");
            sb.append("targetUserName = " + this.f33051r);
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "StringBuilder()\n        …              .toString()");
            return sb4;
        }
    }

    /* renamed from: nk1.m$c */
    public enum C11209c {
        SELF_PRECIOUS_GIFT_COMBO,
        SELF_PRECIOUS_GIFT_SOLO,
        SELF_NORMAL_GIFT_COMBO,
        SELF_NORMAL_GIFT_SOLO,
        PRECIOUS_GIFT_COMBO,
        PRECIOUS_GIFT_SOLO,
        NORMAL_GIFT_COMBO,
        NORMAL_GIFT_SOLO
    }

    /* renamed from: nk1.m$d */
    public static final class C11210d {

        /* renamed from: a */
        public final String f33063a;

        /* renamed from: b */
        public final long f33064b;

        /* renamed from: c */
        public final String f33065c;

        public C11210d(String str, long j, String str2) {
            C87412m.m108594g(str, "comboId");
            C87412m.m108594g(str2, "fromNickName");
            this.f33063a = str;
            this.f33064b = j;
            this.f33065c = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11210d)) {
                return false;
            }
            C11210d dVar = (C11210d) obj;
            return C87412m.m108589b(this.f33063a, dVar.f33063a) && this.f33064b == dVar.f33064b && C87412m.m108589b(this.f33065c, dVar.f33065c);
        }

        public int hashCode() {
            long j = this.f33064b;
            return (((this.f33063a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f33065c.hashCode();
        }

        public String toString() {
            return "OvertimeCacheData(comboId=" + this.f33063a + ", offerTime=" + this.f33064b + ", fromNickName=" + this.f33065c + ')';
        }
    }

    /* renamed from: nk1.m$a */
    public interface C61789a {
        /* renamed from: s */
        void mo84240s(C11209c cVar, List<C11208b> list);
    }

    /* renamed from: a */
    boolean mo86702a(C11208b bVar);

    boolean addAll(Collection<C11208b> collection);

    /* renamed from: b */
    boolean mo86704b(C11208b bVar);

    /* renamed from: c */
    C11208b mo86705c(String str);

    void clear();

    /* renamed from: d */
    C11208b mo86707d(String str);

    /* renamed from: e */
    Object mo86708e(String str, C15601d<? super C11210d> dVar);

    /* renamed from: f */
    void mo86709f(C61789a aVar);

    /* renamed from: g */
    C11208b mo86710g(String str);

    /* renamed from: h */
    C11209c mo86711h();

    boolean hasNext();

    /* renamed from: i */
    void mo86713i();

    /* renamed from: j */
    void mo86714j(C61789a aVar);

    C11208b poll();

    int size();
}
