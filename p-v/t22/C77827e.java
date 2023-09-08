package t22;

import java.util.Set;
import p702ts.C78083b;

/* renamed from: t22.e */
public class C77827e {

    /* renamed from: a */
    public Set<Long> f226758a;

    /* renamed from: b */
    public C78083b.C78084a f226759b = new C77828a();

    /* renamed from: t22.e$a */
    public class C77828a implements C78083b.C78084a {
        public C77828a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0084, code lost:
            if (r4.length() > 0) goto L_0x0088;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onLocationAddr(com.tencent.p014mm.modelgeo.Addr r11) {
            /*
                r10 = this;
                t22.e r0 = t22.C77827e.this
                r0.getClass()
                java.lang.Class<f62.k0> r1 = f62.C75700k0.class
                java.lang.Object r2 = r11.f343972w
                if (r2 == 0) goto L_0x0186
                boolean r3 = r2 instanceof java.lang.Long
                if (r3 == 0) goto L_0x0186
                java.lang.Long r2 = (java.lang.Long) r2
                long r2 = r2.longValue()
                k40.a r4 = f40.C86709a0.m107533q(r1)
                f62.k0 r4 = (f62.C75700k0) r4
                g62.l r4 = r4.mo96095LE()
                com.tencent.mm.storage.g4 r4 = (com.tencent.p014mm.storage.C72972g4) r4
                com.tencent.mm.storage.f4 r2 = r4.b00(r2)
                java.lang.String r3 = r11.f343956d
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
                if (r3 == 0) goto L_0x002f
                goto L_0x0186
            L_0x002f:
                java.lang.String r3 = r2.getContent()
                int r4 = r2.mo108769t2()
                r5 = 0
                r6 = 1
                if (r4 != 0) goto L_0x003d
                r4 = 1
                goto L_0x003e
            L_0x003d:
                r4 = 0
            L_0x003e:
                java.lang.String r7 = r2.mo108768t()
                boolean r7 = com.tencent.p014mm.storage.C72996z1.m85820U5(r7)
                r8 = -1
                if (r7 == 0) goto L_0x005a
                if (r4 == 0) goto L_0x005a
                int r9 = eb0.C75604z3.m90848t(r3)
                if (r9 == r8) goto L_0x005a
                int r9 = r9 + r6
                java.lang.String r3 = r3.substring(r9)
                java.lang.String r3 = r3.trim()
            L_0x005a:
                com.tencent.mm.storage.f4$e r3 = com.tencent.p014mm.storage.C72963f4.C72968e.m85663c(r3)
                java.lang.String r11 = r11.mo174342a()
                r3.f212707e = r11
                java.lang.String r11 = ""
                if (r7 == 0) goto L_0x0087
                if (r4 == 0) goto L_0x0087
                java.lang.String r4 = r2.getContent()
                int r4 = eb0.C75604z3.m90848t(r4)
                if (r4 == r8) goto L_0x0087
                java.lang.String r6 = r2.getContent()
                java.lang.String r4 = r6.substring(r5, r4)
                java.lang.String r4 = r4.trim()
                int r5 = r4.length()
                if (r5 <= 0) goto L_0x0087
                goto L_0x0088
            L_0x0087:
                r4 = r11
            L_0x0088:
                java.lang.String r5 = r3.f212712j
                if (r5 == 0) goto L_0x0092
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x0094
            L_0x0092:
                r3.f212712j = r11
            L_0x0094:
                java.lang.String r5 = r3.f212711i
                if (r5 == 0) goto L_0x009e
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x00a0
            L_0x009e:
                r3.f212712j = r11
            L_0x00a0:
                java.lang.String r5 = r3.f212710h
                if (r5 == 0) goto L_0x00aa
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x00ac
            L_0x00aa:
                r3.f212710h = r11
            L_0x00ac:
                java.lang.String r5 = r3.f212703a
                if (r5 == 0) goto L_0x00b6
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x00b8
            L_0x00b6:
                r3.f212703a = r11
            L_0x00b8:
                java.lang.String r5 = r3.f212707e
                if (r5 == 0) goto L_0x00c2
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x00c4
            L_0x00c2:
                r3.f212707e = r11
            L_0x00c4:
                java.lang.String r5 = r3.f212709g
                if (r5 == 0) goto L_0x00ce
                boolean r5 = r5.equals(r11)
                if (r5 == 0) goto L_0x00d0
            L_0x00ce:
                r3.f212709g = r11
            L_0x00d0:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "<msg><location x=\""
                r5.append(r6)
                double r8 = r3.f212704b
                r5.append(r8)
                java.lang.String r6 = "\" y=\""
                r5.append(r6)
                double r8 = r3.f212705c
                r5.append(r8)
                java.lang.String r6 = "\" scale=\""
                r5.append(r6)
                int r6 = r3.f212706d
                r5.append(r6)
                java.lang.String r6 = "\" label=\""
                r5.append(r6)
                java.lang.String r6 = r3.f212707e
                r5.append(r6)
                java.lang.String r6 = "\" maptype=\""
                r5.append(r6)
                java.lang.String r6 = r3.f212709g
                r5.append(r6)
                java.lang.String r6 = "\"  fromusername=\""
                r5.append(r6)
                java.lang.String r6 = r3.f212703a
                r5.append(r6)
                java.lang.String r6 = "\" buildingId=\""
                r5.append(r6)
                java.lang.String r6 = r3.f212720r
                r5.append(r6)
                java.lang.String r6 = "\" floorName=\""
                r5.append(r6)
                java.lang.String r3 = r3.f212721s
                r5.append(r3)
                java.lang.String r3 = "\" /></msg>"
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                if (r7 == 0) goto L_0x014a
                boolean r11 = r4.equals(r11)
                if (r11 != 0) goto L_0x014a
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r4)
                java.lang.String r4 = ":\n"
                r11.append(r4)
                r11.append(r3)
                java.lang.String r3 = r11.toString()
            L_0x014a:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r4 = "xml: "
                r11.append(r4)
                r11.append(r3)
                java.lang.String r11 = r11.toString()
                java.lang.String r4 = "MicroMsg.LocationServer"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r11)
                r2.mo108732L2(r3)
                k40.a r11 = f40.C86709a0.m107533q(r1)
                f62.k0 r11 = (f62.C75700k0) r11
                g62.l r11 = r11.mo96095LE()
                long r3 = r2.getMsgId()
                com.tencent.mm.storage.g4 r11 = (com.tencent.p014mm.storage.C72972g4) r11
                r11.xy0(r3, r2)
                java.util.Set<java.lang.Long> r11 = r0.f226758a
                long r0 = r2.getMsgId()
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.util.HashSet r11 = (java.util.HashSet) r11
                r11.remove(r0)
            L_0x0186:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t22.C77827e.C77828a.onLocationAddr(com.tencent.mm.modelgeo.Addr):void");
        }
    }
}
