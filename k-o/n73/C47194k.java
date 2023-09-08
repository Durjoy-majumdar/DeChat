package n73;

import java.util.ArrayList;
import java.util.List;

/* renamed from: n73.k */
public class C47194k extends C47188b {

    /* renamed from: a */
    public String f126743a = "";

    /* renamed from: a */
    public List<Integer> mo11243a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11019);
        arrayList.add(11020);
        arrayList.add(11021);
        arrayList.add(11031);
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0075  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo11244b(int r12, byte[] r13) {
        /*
            r11 = this;
            r0 = 11031(0x2b17, float:1.5458E-41)
            r1 = 0
            r2 = 1
            r3 = 0
            if (r12 == r0) goto L_0x00f0
            java.lang.String r0 = "MicroMsg.Wear.HttpMessageServer"
            r4 = 11
            java.lang.String r5 = ""
            r6 = 10
            switch(r12) {
                case 11019: goto L_0x0085;
                case 11020: goto L_0x0018;
                case 11021: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x00ef
        L_0x0014:
            r11.f126743a = r5
            goto L_0x00ef
        L_0x0018:
            r12 = 9
            l73.C46836a.m52129b(r12, r3)
            r12 = 8
            l73.C46836a.m52128a(r12)
            te3.g15 r12 = new te3.g15
            r12.<init>()
            r12.parseFrom(r13)     // Catch:{ IOException -> 0x0084 }
            java.lang.String r13 = r12.f133792d
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r13)
            if (r13 == 0) goto L_0x0033
            return r1
        L_0x0033:
            java.lang.String r13 = r12.f133792d
            r11.f126743a = r13
            te3.h15 r13 = new te3.h15
            r13.<init>()
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            java.lang.String r8 = r12.f133792d
            long r9 = r12.f133793e
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            java.util.List r12 = r7.mo101132nP(r8, r9, r4)
            r4 = 0
        L_0x004f:
            if (r4 >= r6) goto L_0x006c
            r7 = r12
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r8 = r7.size()
            if (r4 >= r8) goto L_0x006c
            java.lang.Object r7 = r7.get(r4)
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            java.util.LinkedList<te3.a15> r8 = r13.f134409e
            te3.a15 r7 = com.tencent.p014mm.plugin.wear.model.C43465i.m46975e(r7)
            r8.add(r7)
            int r4 = r4 + 1
            goto L_0x004f
        L_0x006c:
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            int r12 = r12.size()
            if (r12 <= r6) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r2 = 0
        L_0x0076:
            r13.f134408d = r2
            byte[] r12 = r13.toByteArray()     // Catch:{ IOException -> 0x007d }
            return r12
        L_0x007d:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r12, r5, r13)
            goto L_0x00ef
        L_0x0084:
            return r1
        L_0x0085:
            te3.b15 r12 = new te3.b15
            r12.<init>()
            r12.parseFrom(r13)     // Catch:{ IOException -> 0x008e }
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            te3.c15 r13 = new te3.c15
            r13.<init>()
            boolean r7 = r12.f130893f
            r13.f131449f = r7
            if (r7 == 0) goto L_0x00ad
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            java.lang.String r8 = r12.f130891d
            long r9 = r12.f130892e
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            java.util.List r12 = r7.mo101090TO(r8, r9, r4)
            goto L_0x00bf
        L_0x00ad:
            eb0.c r7 = eb0.C97625j3.m125812b()
            g62.l r7 = r7.mo105911z()
            java.lang.String r8 = r12.f130891d
            long r9 = r12.f130892e
            com.tencent.mm.storage.g4 r7 = (com.tencent.p014mm.storage.C72972g4) r7
            java.util.List r12 = r7.mo101132nP(r8, r9, r4)
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r4 >= r6) goto L_0x00da
            int r7 = r12.size()
            if (r4 >= r7) goto L_0x00da
            java.lang.Object r7 = r12.get(r4)
            com.tencent.mm.storage.f4 r7 = (com.tencent.p014mm.storage.C72963f4) r7
            java.util.LinkedList<te3.a15> r8 = r13.f131448e
            te3.a15 r7 = com.tencent.p014mm.plugin.wear.model.C43465i.m46975e(r7)
            r8.add(r7)
            int r4 = r4 + 1
            goto L_0x00c0
        L_0x00da:
            int r12 = r12.size()
            if (r12 <= r6) goto L_0x00e1
            goto L_0x00e2
        L_0x00e1:
            r2 = 0
        L_0x00e2:
            r13.f131447d = r2
            byte[] r12 = r13.toByteArray()     // Catch:{ IOException -> 0x00e9 }
            return r12
        L_0x00e9:
            r12 = move-exception
            java.lang.Object[] r13 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r12, r5, r13)
        L_0x00ef:
            return r1
        L_0x00f0:
            r12 = 12
            l73.C46836a.m52129b(r12, r3)
            r12 = 14
            l73.C46836a.m52128a(r12)
            te3.j15 r12 = new te3.j15
            r12.<init>()
            r12.parseFrom(r13)     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            eb0.c r13 = eb0.C97625j3.m125812b()
            g62.l r13 = r13.mo105911z()
            long r4 = r12.f135822d
            com.tencent.mm.storage.g4 r13 = (com.tencent.p014mm.storage.C72972g4) r13
            com.tencent.mm.storage.f4 r13 = r13.b00(r4)
            te3.k15 r0 = new te3.k15
            r0.<init>()
            java.lang.Class<dn.t> r4 = p492dn.C75415t.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            dn.t r4 = (p492dn.C75415t) r4
            java.lang.String r5 = r13.mo108765s2()
            java.lang.String r4 = r4.mo91610mf(r5)
            int r2 = kd0.C76550x.m92054c(r4, r3, r2)
            r0.f136512f = r2
            long r5 = r12.f135822d
            r0.f136510d = r5
            pe3.b r12 = new pe3.b
            r2 = -1
            byte[] r2 = com.tencent.p014mm.vfs.C86013q1.m106433O(r4, r3, r2)
            r12.<init>(r2)
            r0.f136511e = r12
            kd0.C76552z.m92082t(r13)
            byte[] r12 = r0.toByteArray()     // Catch:{ IOException -> 0x0145 }
            return r12
        L_0x0145:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n73.C47194k.mo11244b(int, byte[]):byte[]");
    }

    /* renamed from: c */
    public boolean mo72262c(int i) {
        return (i == 11021 || i == 11031) ? false : true;
    }

    /* renamed from: d */
    public boolean mo72263d(int i) {
        return (i == 11021 || i == 11031) ? false : true;
    }
}
